package day4.com.cluster;

public class HighestMarks {
    public static void main(String[] args) {
        int[] marks = { 78, 65, 89, 92, 71 };
        int highest = marks[0];
        for (int i = 1; i < marks.length; i++) {
            if (marks[i] > highest) {
                highest = marks[i];
            }
        }

        System.out.print("The marks of the 5 students are: ");
        for (int mark : marks) {
            System.out.print(mark + " ");
        }

        System.out.println("\n\nThe highest mark is: " + highest);
    }
}

