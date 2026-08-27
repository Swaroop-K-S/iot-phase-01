package day7;

public class TailRecursion {
    static void count(int n) {

        if (n == 0) {
            return;
        }
        System.out.println(n);
        count(n - 1);

    }

    public static void main(String[] args) {
        System.out.println("number");
        count(5);
        System.out.println("last number");
    }

}
