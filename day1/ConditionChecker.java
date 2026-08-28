package day1;

import java.util.Scanner;

public class ConditionChecker {

    // helper function to check if the number is > 0
    public static boolean isPositive(int num) {
        // basic if-else logic
        if (num > 0) {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        // setting up scanner for input
        Scanner sc = new Scanner(System.in);

        System.out.print("Yo, enter a number: ");
        int num = sc.nextInt();

        // calling the check method
        boolean result = isPositive(num);

        // print result to console
        if (result == true) {
            System.out.println(num + " is definitely positive, nice.");
        } else {
            System.out.println(num + " is negative, rip.");
        }

        // closing scanner
        sc.close();
    }
}