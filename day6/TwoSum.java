package day6;

public class TwoSum {
    public static void main(String[] args) {
        int[] numbers = { 10, 20, 30, 40, 50 };
        int target = 30;
        int left = 0;
        int right = numbers.length - 1;

        while (left < right) {
            int sum = numbers[left] + numbers[right];

            if (sum == target) {
                System.out.println("Numbers found: " + numbers[left] + " and " + numbers[right]);
                break;
            } else if (sum < target) {
                left++;
            } else {
                right--;
            }
        }
    }
}
