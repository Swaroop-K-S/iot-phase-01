package day4;

import java.util.HashSet;

public class LoopComparison {
    public static void main(String[] args) {
        int n = 100000;
        int[] students = new int[n];

        for (int i = 0; i < n; i++) {
            students[i] = i + 1;
        }

        int target = 1000;

        System.out.println("--- One For Loop with HashSet (O(n)) ---");
        long startTime = System.currentTimeMillis();
        boolean foundOneLoop = false;
        HashSet<Integer> seen = new HashSet<>();

        for (int i = 0; i < n; i++) {
            int complement = target - students[i];

            if (seen.contains(complement)) {
                foundOneLoop = true;
                System.out.println("Pair found: " + complement + " + " + students[i]);
                break;
            }
            seen.add(students[i]);
        }

        long endTime = System.currentTimeMillis();
        System.out.println("Time taken: " + (endTime - startTime) + " ms");

        if (!foundOneLoop) {
            System.out.println("No pair found adding up to " + target);
        }
    }
}

