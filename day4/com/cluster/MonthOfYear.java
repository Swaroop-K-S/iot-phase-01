package com.cluster;

import java.util.Scanner;

public class MonthOfYear {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Welcome to the Month of the Year program!");
        
        while (true) {
            System.out.print("Enter a number from 1-12 (or 0 to exit): ");
            int month = scanner.nextInt();
            
            if (month == 0) {
                System.out.println("Exiting the program...");
                break;
            }
            
            switch (month) {
                case 1:
                    System.out.println("1 is January");
                    break;
                case 2:
                    System.out.println("2 is February");
                    break;
                case 3:
                    System.out.println("3 is March");
                    break;
                case 4:
                    System.out.println("4 is April");
                    break;
                case 5:
                    System.out.println("5 is May");
                    break;
                case 6:
                    System.out.println("6 is June");
                    break;
                case 7:
                    System.out.println("7 is July");
                    break;
                case 8:
                    System.out.println("8 is August");
                    break;
                case 9:
                    System.out.println("9 is September");
                    break;
                case 10:
                    System.out.println("10 is October");
                    break;
                case 11:
                    System.out.println("11 is November");
                    break;
                case 12:
                    System.out.println("12 is December");
                    break;
                default:
                    System.out.println("Invalid input! Please enter a number between 1 and 12.");
            }
            System.out.println();
        }
        
        scanner.close();
    }
}
