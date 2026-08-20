package com.cluster;

import java.util.Scanner;

public class DayOfWeek {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to the 7 Day Calendar!");

        while (true) {
            System.out.print("Enter a number from 1-7 (or 0 to exit): ");
            int day = scanner.nextInt();

            if (day == 0) {
                System.out.println("Exiting the program...");
                break;
            }

            switch (day) {
                case 1:
                    System.out.println("1 is Sunday");
                    break;
                case 2:
                    System.out.println("2 is Monday");
                    break;
                case 3:
                    System.out.println("3 is Tuesday");
                    break;
                case 4:
                    System.out.println("4 is Wednesday");
                    break;
                case 5:
                    System.out.println("5 is Thursday");
                    break;
                case 6:
                    System.out.println("6 is Friday");
                    break;
                case 7:
                    System.out.println("7 is Saturday");
                    break;
                default:
                    System.out.println("Invalid input! Please enter a number between 1 and 7.");
            }
            System.out.println();
        }

        scanner.close();
    }
}
