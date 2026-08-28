package day4;

public class demo {
    public static void main(String[] args) {
        int n = 100000;
        int[] students = new int[n];

        int hashset = 1;
        boolean found = false;

        for (int i = 0; i < n; i++) {
            students[i] = i + 1;

            if (students[i] == hashset) {
                found = true;
                System.out.println("Target " + hashset + " found at index: " + i);

            }
        }

        if (!found) {
            System.out.println("Target " + hashset + " not found.");
        }
    }
}

