$baseDir = "c:\Users\swaro\Desktop\day1"

$months = @{
    1="Jan"; 2="Feb"; 3="Mar"; 4="Apr"; 5="May"; 6="Jun";
    7="Jul"; 8="Aug"; 9="Sep"; 10="Oct"; 11="Nov"; 12="Dec"
}

$files = Get-ChildItem -Path $baseDir -Recurse -File | Where-Object {
    $_.FullName -notmatch "\\\.git\\" -and 
    $_.FullName -notmatch "organize\.ps1$" -and
    $_.FullName -notmatch "\\Aug_\d{2}\\"
}

foreach ($file in $files) {
    $monthStr = $months[$file.CreationTime.Month]
    $dayStr = $file.CreationTime.Day.ToString("00")
    $dateFolder = "${monthStr}_${dayStr}"
    
    $targetBase = Join-Path $baseDir $dateFolder
    $relPath = $file.FullName.Substring($baseDir.Length + 1)
    $targetPath = Join-Path $targetBase $relPath
    
    $targetDir = Split-Path $targetPath
    if (-not (Test-Path $targetDir)) {
        New-Item -ItemType Directory -Force -Path $targetDir | Out-Null
    }
    
    Move-Item -Path $file.FullName -Destination $targetPath -Force
}

# Clean empty directories (run a few times to catch nested ones)
for ($i=0; $i -lt 3; $i++) {
    Get-ChildItem -Path $baseDir -Recurse -Directory | Where-Object {
        $_.FullName -notmatch "\\\.git" -and @(Get-ChildItem -Path $_.FullName).Count -eq 0
    } | Remove-Item -Force
}

git add -A
git commit -m "Organize code into day-wise folders"
git push
