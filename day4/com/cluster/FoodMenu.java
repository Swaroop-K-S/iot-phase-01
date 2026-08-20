package com.cluster;

import java.util.Scanner;

public class FoodMenu {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to the Food Menu!");

        while (true) {
            System.out.println("\nMenu Options:");
            System.out.println("1. Pizza");
            System.out.println("2. Burger");
            System.out.println("3. Pasta");
            System.out.println("4. Tacos");
            System.out.println("5. Rotti");
            System.out.print("Enter your choice (1-5) or 0 to exit: ");

            int choice = scanner.nextInt();

            if (choice == 0) {
                System.out.println("Exiting the menu...");
                break;
            }

            switch (choice) {
                case 1:
                    System.out.println("You selected Pizza! ");
                    break;
                case 2:
                    System.out.println("You selected Burger! ");
                    break;
                case 3:
                    System.out.println("You selected Pasta! ");
                    break;
                case 4:
                    System.out.println("You selected Tacos! ");
                    break;
                case 5:
                    System.out.println("You selected Rotti! ");
                    break;
                default:
                    System.out.println("Invalid input! Please enter a number between 1 and 5.");
                    continue; // Skip the rest of the loop and prompt again
            }

            System.out.println("Your item will be on your table in a few minutes!");
        }

        scanner.close();
    }
}
