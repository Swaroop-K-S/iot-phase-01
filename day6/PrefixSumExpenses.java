package day6;

import java.util.Arrays;

public class PrefixSumExpenses {

    public static void main(String[] args) {
        // Initialize the array of expenses
        int[] expenses = { 100, 200, 300, 400 };

        // Create an array to hold the prefix sums
        int[] prefixSum = new int[expenses.length];

        // The first element of prefix sum is just the first element of the expenses
        prefixSum[0] = expenses[0];

        // Loop through the rest of the elements and calculate the running total
        for (int i = 1; i < expenses.length; i++) {
            prefixSum[i] = prefixSum[i - 1] + expenses[i];
        }
        
        System.out.println("Expenses: " + Arrays.toString(expenses));
        System.out.println("Prefix Sums: " + Arrays.toString(prefixSum));

        // Calculate the sum of expenses from index 2 to 3 (300 + 400) using the prefix sum
        // Formula: sum from index i to j is prefixSum[j] - prefixSum[i - 1]
        int sum = prefixSum[3] - prefixSum[1];
        System.out.println("Total spent between index 2 and 3 = ₹" + sum);

    }
}
