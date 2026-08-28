package day4.com.cluster;

import java.util.Scanner;

public class SumOfNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = scanner.nextInt();

        if (num <= 0) {
            System.out.println("Please enter a positive integer greater than 0.");
        } else {
            int sum = 0;

            StringBuilder output = new StringBuilder();

            for (int i = num; i >= 1; i--) {
                sum += i;
                output.append(i);
                if (i > 1) {
                    output.append("+");
                }
            }

            output.append("=").append(sum);

            System.out.println(output.toString());
        }

        scanner.close();
    }
}

