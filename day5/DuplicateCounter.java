package day5;

public class DuplicateCounter {
    public static void main(String[] args) {
        String text = "programming";
        System.out.println("Text: " + text);
        System.out.println("Finding all repeating characters...\n");

        // Find all unique characters in the text to use as patterns
        String uniqueChars = "";
        for (int i = 0; i < text.length(); i++) {
            String ch = String.valueOf(text.charAt(i));
            if (!uniqueChars.contains(ch)) {
                uniqueChars += ch;
            }
        }

        System.out.println("--- Results using Naive Approach ---");
        for (int i = 0; i < uniqueChars.length(); i++) {
            String pattern = String.valueOf(uniqueChars.charAt(i));
            int count = countNaive(text, pattern);
            if (count > 1) {
                System.out.println("'" + pattern + "' repeats " + count + " times.");
            }
        }

        System.out.println("\n--- Results using Rabin-Karp Approach ---");
        for (int i = 0; i < uniqueChars.length(); i++) {
            String pattern = String.valueOf(uniqueChars.charAt(i));
            int count = countRabinKarp(text, pattern);
            if (count > 1) {
                System.out.println("'" + pattern + "' repeats " + count + " times.");
            }
        }
    }

    // --- 1. Naive Approach using nested for loops ---
    public static int countNaive(String text, String pattern) {
        int count = 0;
        int n = text.length();
        int m = pattern.length();

        for (int i = 0; i <= n - m; i++) {
            int j;
            for (j = 0; j < m; j++) {
                if (text.charAt(i + j) != pattern.charAt(j)) {
                    break; // Mismatch
                }
            }
            if (j == m) {
                count++; // Full match found, increase our count!
            }
        }
        return count;
    }

    // --- 2. Rabin-Karp Approach
    public static int countRabinKarp(String text, String pattern) {
        int count = 0;
        int n = text.length();
        int m = pattern.length();

        if (m == 0 || n < m)
            return 0;

        int patternHash = getHash(pattern);

        for (int i = 0; i <= n - m; i++) {
            String part = text.substring(i, i + m);
            int partHash = getHash(part);

            if (patternHash == partHash) {
                // If hashes match, do a full string comparison to confirm it's not a hash
                // collision
                if (part.equals(pattern)) {
                    count++; // Match confirmed, increase our count!
                }
            }
        }
        return count;
    }

    // Helper method to calculate a simple hash (sum of character ASCII values)
    public static int getHash(String str) {
        int hash = 0;
        for (int i = 0; i < str.length(); i++) {
            hash += str.charAt(i);
        }
        return hash;
    }
}
