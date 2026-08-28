package day1;

public class SecondCase {
    public static void main(String[] args) {
        int[] arr = {12, 45, 7, 23, 56, 3, 89, 34};

        int min = arr[0];
        int max = arr[0];
        int sum = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
            if (arr[i] > max) {
                max = arr[i];
            }
            sum += arr[i];
        }

        System.out.println("Array: ");
        for (int val : arr) {
            System.out.print(val + " ");
        }
        System.out.println();
        System.out.println("Min = " + min);
        System.out.println("Max = " + max);
        System.out.println("Sum = " + sum);
    }
}
