package day7;

import java.util.Arrays;

public class PrefixSumMarks {

    public static void main(String[] args) {
        // Marks obtained in different exams/subjects
        int[] marks = { 85, 90, 78, 92, 88 };
        String[] subjects = { "Math", "Science", "English", "History", "Computer" };

        // Create an array to hold the running total (prefix sum) of marks
        int[] prefixSum = new int[marks.length];

        // Base case: the first sum is just the first mark
        prefixSum[0] = marks[0];

        // Build the prefix sum array
        for (int i = 1; i < marks.length; i++) {
            prefixSum[i] = prefixSum[i - 1] + marks[i];
        }

        System.out.println("Individual Marks: " + Arrays.toString(marks));
        System.out.println("Prefix Sums Array: " + Arrays.toString(prefixSum));
        System.out.println("--------------------------------------------------");

        // --- USING THE PREFIX SUM ---
        // Let's say we want to quickly find the total marks scored from English to Computer
        // Math(0), Science(1), English(2), History(3), Computer(4)
        int startIndex = 2; // English
        int endIndex = 4;   // Computer
        
        // Formula: sum(i, j) = prefixSum[j] - prefixSum[i - 1]
        int totalMarks;
        if (startIndex == 0) {
            // If starting from the very first subject, just take the prefix sum at endIndex
            totalMarks = prefixSum[endIndex];
        } else {
            // Otherwise subtract the sum of everything BEFORE the startIndex
            totalMarks = prefixSum[endIndex] - prefixSum[startIndex - 1];
        }
        
        System.out.println("Total marks from " + subjects[startIndex] + " to " + subjects[endIndex] + " = " + totalMarks);
    }
}
