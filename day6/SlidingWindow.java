package day6;

public class SlidingWindow {
    public static void main(String[] args) {
        int[] numbers = { 10, 20, 30, 40, 50 };
        int windowSize = 3;
        int sum = 0;

        for (int i = 0; i < windowSize; i++) {
            sum += numbers[i];
        }
        System.out.println("Sum of window 1: " + sum);
        int start = 0;
        for (int end = windowSize; end < numbers.length; end++) {
            sum = sum - numbers[start];
            sum = sum + numbers[end];
            start++;
            System.out.println("sum=" + sum);
        }
    }
}