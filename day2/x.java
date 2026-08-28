package day2;

public class x {
    public static void main(String[] args) {
        int[] arr = { 2, 22, 4, 0, 1 };

        int max = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
            ;
        }
        System.out.print(max);

    }
}

