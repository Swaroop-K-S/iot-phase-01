package EmployeeProject.src.day6;

import java.util.ArrayList;
import java.util.Scanner;

class Employee {

    private String name;
    private int age;
    private String designation;
    private double salary;

    private final Scanner sc;

    public Employee(Scanner sc) {
        this.sc = sc;
    }

    // Create Account
    public void createAccount() {
        System.out.print("Enter your name: ");
        name = sc.nextLine();

        // Age
        while (true) {
            System.out.print("Enter your age (19-59): ");
            if (sc.hasNextInt()) {
                age = sc.nextInt();
                sc.nextLine();
                if (age >= 19 && age <= 59)
                    break;
                System.out.println("Age must be between 19 and 59.");
            } else {
                System.out.println("Invalid age.");
                sc.nextLine();
            }
        }

        // Designation
        while (true) {
            System.out.print("Enter designation (Programmer / Manager / Tester): ");
            designation = sc.nextLine().trim();

            if (designation.equalsIgnoreCase("Programmer")) {
                designation = "Programmer";
                salary = 20000;
                break;
            } else if (designation.equalsIgnoreCase("Manager")) {
                designation = "Manager";
                salary = 25000;
                break;
            } else if (designation.equalsIgnoreCase("Tester")) {
                designation = "Tester";
                salary = 15000;
                break;
            } else {
                System.out.println("Invalid designation.");
            }
        }

        System.out.println("\nAccount created successfully!");
    }

    public void raiseSalary() {
        while (true) {
            System.out.print("Enter salary increase percentage (1-10): ");
            if (!sc.hasNextDouble()) {
                System.out.println("Invalid percentage.");
                sc.nextLine();
                continue;
            }

            double percent = sc.nextDouble();
            sc.nextLine();

            if (percent < 1 || percent > 10) {
                System.out.println("Percentage must be between 1 and 10.");
                continue;
            }

            double newSalary = salary + (salary * percent / 100);

            System.out.print("Do you want to apply this salary increase? (y/n): ");
            String choice = sc.nextLine();

            if (choice.equalsIgnoreCase("y")) {
                salary = newSalary;
                System.out.println("Salary increased successfully!");
                break;
            } else if (choice.equalsIgnoreCase("n")) {
                System.out.println("Salary increase cancelled.");
                break;
            } else {
                System.out.println("Invalid choice. Enter y or n.");
            }
        }
    }

    public void displayAccount() {
        System.out.println("\n--- Employee Details ---");
        System.out.println("Name       : " + name);
        System.out.println("Age        : " + age);
        System.out.println("Designation: " + designation);
        System.out.printf("Salary     : %.2f%n", salary);
        System.out.println("------------------------");
    }
}

public class EmployeeManagement {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        ArrayList<Employee> employees = new ArrayList<>();

        while (true) {
            System.out.println("\n===== EMPLOYEE MENU =====");
            System.out.println("1. Create Employee");
            System.out.println("2. Display Employees");
            System.out.println("3. Raise Salary");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");

            if (!sc.hasNextInt()) {
                System.out.println("Invalid input!");
                sc.nextLine();
                continue;
            }

            int choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {
                case 1:
                    Employee emp = new Employee(sc);
                    emp.createAccount();
                    employees.add(emp);
                    break;
                case 2:
                    if (employees.isEmpty()) {
                        System.out.println("No employees found.");
                    } else {
                        System.out.println("\n===== ALL EMPLOYEES =====");
                        for (int i = 0; i < employees.size(); i++) {
                            System.out.println("\nEmployee " + (i + 1));
                            employees.get(i).displayAccount();
                        }
                    }
                    break;
                case 3:
                    if (employees.isEmpty()) {
                        System.out.println("No employees found.");
                    } else {
                        System.out.print("Enter employee number: ");
                        int number = sc.nextInt();
                        sc.nextLine();

                        if (number >= 1 && number <= employees.size()) {
                            employees.get(number - 1).raiseSalary();
                        } else {
                            System.out.println("Invalid employee number.");
                        }
                    }
                    break;
                case 4:
                    System.out.println("Thank you!");
                    sc.close();
                    return;
                default:
                    System.out.println("Invalid choice!");
            }
        }
    }
}
