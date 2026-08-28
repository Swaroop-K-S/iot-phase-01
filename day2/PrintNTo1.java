package day2;

public class PrintNTo1 {

    static void printNTo1(int n) {
        if (n == 10) {
            return;
        }
        System.out.println(n);
        printNTo1(n - 1);

    }

    public static void main(String[] args) {
        int n = 20;
        printNTo1(n);
    }
}

