package day12;

public class LPS {
    public static void main(String[] args) {

        String s = "ABAB";
        int max = 0;

        for (int i = 1; i < s.length(); i++) {

            String prefix = s.substring(0, i);
            String suffix = s.substring(s.length() - i);

            if (prefix.equals(suffix))
                max = i;
        }

        System.out.println("LPS Length = " + max);
    }
}
