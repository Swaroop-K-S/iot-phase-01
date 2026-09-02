package day11;

public class LIS1 {
    public static void main(String[] args) {

        String[] arr = {"A", "B", "C", "D", "E"};
        int n = arr.length;

        int[] dp = new int[n];
        int max = 0;

        for (int i = 0; i < n; i++) {

            dp[i] = 1;

            for (int j = 0; j < i; j++) {

                if (arr[j].compareTo(arr[i]) < 0) {
                    dp[i] = Math.max(dp[i], dp[j] + 1);
                }
            }

            max = Math.max(max, dp[i]);
        }

        System.out.println("LIS length: " + max);
    }
}
