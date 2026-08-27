package day5;

public class PalindromeExample {
    public static void main(String[] args) {
        String str = "Racecar";

        String original = str.toLowerCase();

        String reversed = "";
        for (int i = original.length() - 1; i >= 0; i--) {
            reversed += original.charAt(i);
        }

        if (original.equals(reversed)) {
            System.out.println(str + " is a palindrome.");
        } else {
            System.out.println(str + " is not a palindrome.");
        }
    }
}
