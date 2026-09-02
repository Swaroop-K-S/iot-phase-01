package day10;

public class Job_sequencing {

    public static void main(String[] args) {

        char[] job = {'A', 'B', 'C', 'D'};
        int[] deadline = {2, 1, 2, 1};
        int[] profit = {100, 50, 200, 80};

        int total = 0;

        for (int i = 0; i < job.length; i++) {

            int max = i;

            for (int j = i + 1; j < job.length; j++) {
                if (profit[j] > profit[max])
                    max = j;
            }

            if (deadline[max] > 0) {
                System.out.println("Job " + job[max]);
                total += profit[max];
                deadline[max] = 0;
            }
        }

        System.out.println("Maximum Profit = " + total);
    }
}