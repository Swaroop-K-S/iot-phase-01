package day12;

public class Duplicate {
    public static void main(String[] args) {

        int[] a = { 1, 2, 3, 2, 4 };

        for (int i = 0; i < a.length; i++) {
            for (int j = i + 1; j < a.length; j++) {

                if (a[i] == a[j])
                    System.out.println("Duplicate: " + a[i]);
            }
        }
    }
}
