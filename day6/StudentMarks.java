package day6;

public class StudentMarks {
    public static void main(String[] args) {
        int[] marks = { 20, 30, 40, 50, 60 };
        int target = 80;
        int left = 0;
        int right = marks.length - 1;

        boolean found = false;

        while (left < right) {
            int sum = marks[left] + marks[right];

            if (sum == target) {
                System.out.println("Subjects found with marks: " + marks[left] + " and " + marks[right]);
                found = true;
                break;
            } else if (sum < target) {
                left++;
            } else {
                right--;
            }
        }

        if (!found) {
            System.out.println("No two subjects add up to " + target);
        }
    }
}
