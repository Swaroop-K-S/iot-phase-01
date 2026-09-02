package day10;

public class Interval_Merging {

    public static void main(String[] args) {

        int[][] a = {
            {1, 3},
            {2, 6},
            {8, 10},
            {9, 12}
        };

        for (int i = 0; i < a.length - 1; i++) {

            if (a[i][1] >= a[i + 1][0]) {

                a[i + 1][0] = a[i][0];

                if (a[i][1] > a[i + 1][1])
                    a[i + 1][1] = a[i][1];
            }
        }

        System.out.println("Merged Intervals:");

        for (int i = 0; i < a.length; i++) {

            if (i == 0 || a[i][0] != a[i - 1][0])
                System.out.println(
                    "[" + a[i][0] + "," + a[i][1] + "]"
                );
        }
    }
}