package day10;

public class Interval_Merging_task {

    public static void main(String[] args) {

        int[][] a = {
            {9, 10},
            {9, 11},
            {10, 11},
            {11, 12},
            {11, 13}
        };

        for (int i = 0; i < a.length - 1; i++) {

            if (a[i][1] >= a[i + 1][0]) {

                a[i + 1][0] = a[i][0];

                if (a[i][1] > a[i + 1][1])
                    a[i + 1][1] = a[i][1];
            }
        }

        System.out.println("Merged Meeting Intervals:");

        for (int i = 0; i < a.length; i++) {

            if (i == 0 || a[i][0] != a[i - 1][0])
                System.out.println(
                    "[" + a[i][0] + ":00, "
                    + a[i][1] + ":00]"
                );
        }
    }
}