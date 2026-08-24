package day5;

public class PatternSearchExample {
    public static void main(String[] args) {
        String text = "I love java programming";
        String pattern = "Java";
        
        int position = search(text, pattern);
        
        if (position != -1) {
            System.out.println("pattern found at " + position);
        } else {
            System.out.println("pattern not found");
        }
    }

    // Method to search for the pattern in the text manually
    public static int search(String text, String pattern) {
        int n = text.length();
        int m = pattern.length();
        
        // Loop through the text, stopping when there aren't enough characters left to match the pattern
        for (int i = 0; i <= n - m; i++) {
            int j;
            
            // Check for pattern match at the current position i
            for (j = 0; j < m; j++) {
                if (text.charAt(i + j) != pattern.charAt(j)) {
                    break; // Mismatch found, break inner loop
                }
            }
            
            // If inner loop completed without breaking, it means the pattern fully matched
            if (j == m) {
                return i; // Return the position where the pattern was found
            }
        }
        
        return -1; // Return -1 if pattern was not found in the text
    }
}
