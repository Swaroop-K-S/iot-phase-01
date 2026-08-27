package day6;

public class SmallestWindow {
    public static void main(String[] args) {
        // Sample array. You can change these numbers to test different scenarios
        int[] numbers = { 2, 3, 1, 2, 4, 3 }; 
        int target = 7;
        
        int start = 0;
        int sum = 0;
        
        // Initialize minLength to a very large number (or numbers.length + 1)
        int minLength = Integer.MAX_VALUE;

        for (int end = 0; end < numbers.length; end++) {
            // Add the current element to the running sum
            sum = sum + numbers[end];

            // While the sum is greater than or equal to the target, try shrinking the window
            while (sum >= target) {
                int length = end - start + 1;
                
                // If we found a smaller window, update minLength
                if (length < minLength) {
                    minLength = length;
                }
                
                // Subtract the element at the 'start' pointer and move the 'start' pointer forward
                sum = sum - numbers[start];
                start++;
            }
        }

        // Print the result. If minLength wasn't updated, no such window exists.
        if (minLength == Integer.MAX_VALUE) {
            System.out.println("No window found with sum >= " + target);
        } else {
            System.out.println("Smallest window length: " + minLength);
        }
    }
}
