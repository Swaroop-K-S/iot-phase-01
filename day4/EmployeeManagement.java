package day4;

import java.util.Scanner;

public class EmployeeManagement {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String empName = "";
        String empAge = "";
        String empDesignation = "";
        double empSalary = 0.0;
        boolean isCreated = false;

        while (true) {
            System.out.println("\n--- Main Menu ---");
            System.out.println("1. Create");
            System.out.println("2. Display");
            System.out.println("3. Raise Salary");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            
            String choice = scanner.nextLine();
            
            switch (choice) {
                case "1":
                    System.out.print("Enter the name: ");
                    String name = scanner.nextLine();
                    
                    System.out.print("Enter the age: ");
                    String age = scanner.nextLine();
                    
                    System.out.print("Enter the designation (e.g., programmer, manager, tester): ");
                    String designation = scanner.nextLine();
                    
                    double defaultSalary = 0.0;
                    if (designation.equalsIgnoreCase("programmer")) {
                        defaultSalary = 60000.0;
                    } else if (designation.equalsIgnoreCase("manager")) {
                        defaultSalary = 90000.0;
                    } else if (designation.equalsIgnoreCase("tester")) {
                        defaultSalary = 50000.0;
                    } else {
                        defaultSalary = 40000.0;
                    }
                    
                    System.out.print("Do you want to save? (y/n): ");
                    String confirm = scanner.nextLine();
                    
                    if (confirm.equalsIgnoreCase("y")) {
                        empName = name;
                        empAge = age;
                        empDesignation = designation;
                        empSalary = defaultSalary;
                        isCreated = true;
                        
                        System.out.println("\n--- Employee Created ---");
                        System.out.println("Name: " + empName);
                        System.out.println("Age: " + empAge);
                        System.out.println("Salary: " + empSalary);
                        System.out.println("Designation: " + empDesignation);
                    } else {
                        System.out.println("Creation cancelled. Returning to main menu.");
                    }
                    break;
                    
                case "2":
                    if (isCreated) {
                        System.out.println("\n--- Employee Details ---");
                        System.out.println("Name: " + empName);
                        System.out.println("Age: " + empAge);
                        System.out.println("Salary: " + empSalary);
                        System.out.println("Designation: " + empDesignation);
                    } else {
                        System.out.println("No employee data found. Please 'Create' first.");
                    }
                    break;
                    
                case "3":
                    if (isCreated) {
                        System.out.print("Enter salary raise amount: ");
                        String raiseInput = scanner.nextLine();
                        try {
                            double raiseAmt = Double.parseDouble(raiseInput);
                            empSalary += raiseAmt;
                            System.out.println("Salary raised successfully! New Salary: " + empSalary);
                        } catch (NumberFormatException e) {
                            System.out.println("Invalid input for raise amount.");
                        }
                    } else {
                        System.out.println("No employee data found. Please 'Create' first.");
                    }
                    break;
                    
                case "4":
                    System.out.println("Exiting program...");
                    scanner.close();
                    return;
                    
                default:
                    System.out.println("Invalid choice! Please select from 1 to 4.");
            }
        }
    }
}

