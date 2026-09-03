package day12;

public class KMP {

    static void search(String text, String pattern) {

        int[] lps = new int[pattern.length()];
        int j = 0;

        // Create LPS
        for (int i = 1; i < pattern.length(); i++) {
            while (j > 0 && pattern.charAt(i) != pattern.charAt(j))
                j = lps[j - 1];

            if (pattern.charAt(i) == pattern.charAt(j))
                j++;

            lps[i] = j;
        }

        // KMP search
        j = 0;
        for (int i = 0; i < text.length(); i++) {

            while (j > 0 && text.charAt(i) != pattern.charAt(j))
                j = lps[j - 1];

            if (text.charAt(i) == pattern.charAt(j))
                j++;

            if (j == pattern.length()) {
                System.out.println("Pattern Found");
                return;
            }
        }

        System.out.println("Pattern Not Found");
    }

    public static void main(String[] args) {
        search("ABABDABACDABABCABAB", "ABABCABAB");
    }
}
