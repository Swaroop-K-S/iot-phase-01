package com.cluster;

public class SalaryCalculator {
    public static void main(String[] args) {
        // Array of salaries for the 5 employees
        int[] salaries = { 10000, 15000, 12000, 18000, 20000 };

        int totalSalary = 0;

        // Loop through the array to add up all the salaries
        for (int salary : salaries) {
            totalSalary += salary;
        }

        System.out.println("The total salary of all 5 employees is: " + totalSalary);
    }
}
