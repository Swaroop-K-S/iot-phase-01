public class PalindromeChecker {
    
    /**
     * Checks if a given integer is a palindrome.
     *
     * @param number the integer to check
     * @return true if the number is a palindrome, false otherwise
     */
    public static boolean isPalindrome(int number) {
        // Negative numbers are typically not considered palindromes
        if (number < 0) {
            return false;
        }

        int originalNumber = number;
        int reversedNumber = 0;

        // Reverse the integer mathematically
        while (number != 0) {
            int digit = number % 10;
            reversedNumber = reversedNumber * 10 + digit;
            number /= 10;
        }

        // Compare the reversed number with the original one
        return originalNumber == reversedNumber;
    }

    public static void main(String[] args) {
        // Here are some test cases you can run to verify
        int[] testCases = {121, -121, 10, 12321, 0, 1221};

        for (int testCase : testCases) {
            System.out.println(testCase + " is palindrome? " + isPalindrome(testCase));
        }
    }
}
