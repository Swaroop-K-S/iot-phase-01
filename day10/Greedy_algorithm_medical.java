package day10;

public class Greedy_algorithm_medical {

    public static void main(String[] args) {

        int[] a = {9, 10, 11}; 
        int[] b = {10, 12, 12, 1};   

        int Lastend = b[0];

        System.out.println("Selected Appointment : Doctor 1");

        for (int i = 1; i < a.length; i++) {

            if (a[i] >= Lastend) {

                System.out.println(
                    "Selected Appointment : Doctor " + (i + 1)
                );

                Lastend = b[i];
            }
        }
    }
}