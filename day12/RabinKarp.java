package day12;

public class RabinKarp {
    public static void main(String[] args) {

        String text = "ABABCAB";
        String pattern = "CAB";

        int m = pattern.length();
        int n = text.length();

        int ph = 0, th = 0;

        // Hash of pattern and first window
        for (int i = 0; i < m; i++) {
            ph += pattern.charAt(i);
            th += text.charAt(i);
        }

        // Check each window
        for (int i = 0; i <= n - m; i++) {

            if (ph == th) {
                if (text.substring(i, i + m).equals(pattern)) {
                    System.out.println("Pattern Found at " + i);
                    return;
                }
            }

            // Move window
            if (i < n - m)
                th = th - text.charAt(i) + text.charAt(i + m);
        }

        System.out.println("Pattern Not Found");
    }
}
