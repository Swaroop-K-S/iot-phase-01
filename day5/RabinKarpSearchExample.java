package day5;

public class RabinKarpSearchExample {
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

    // Simplified Hash-based pattern matching algorithm
    public static int search(String text, String pattern) {
        int n = text.length();
        int m = pattern.length();

        // Calculate hash for the pattern
        int patternHash = getHash(pattern);

        for (int i = 0; i <= n - m; i++) {
            // Extract the current substring of length m
            String part = text.substring(i, i + m);

            // Calculate hash for the current part
            int partHash = getHash(part);

            // Compare hashes first
            if (patternHash == partHash) {
                // If hashes match, do a full string comparison to confirm it's not a hash
                // collision
                if (part.equals(pattern)) {
                    return i;
                }
            }
        }

        return -1; // Pattern not found
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