package day6;

public class HighestTestMarksKadane {

    public static void printMaxMarksPeriod(int[] marks, String[] examNames) {
        if (marks == null || marks.length == 0) {
            System.out.println("No marks available.");
            return;
        }

        int maxEndingHere = marks[0];
        int maxSoFar = marks[0];

        // Track the indices of the highest period
        int start = 0;
        int end = 0;
        int tempStart = 0;

        for (int i = 1; i < marks.length; i++) {
            // Decide if we should start a new period from this exam or add it to the
            // ongoing one
            if (marks[i] > maxEndingHere + marks[i]) {
                maxEndingHere = marks[i];
                tempStart = i; // A new potential period starts here
            } else {
                maxEndingHere = maxEndingHere + marks[i];
            }

            // Update the overall maximum found so far and its start/end boundaries
            if (maxEndingHere > maxSoFar) {
                maxSoFar = maxEndingHere;
                start = tempStart;
                end = i;
            }
        }

        System.out.println("Highest continuous sum of marks: " + maxSoFar);
        System.out.print("Achieved during the period from '" + examNames[start] + "' to '" + examNames[end] + "': ");

        for (int i = start; i <= end; i++) {
            System.out.print(examNames[i] + " (" + marks[i] + ")");
            if (i < end)
                System.out.print(" -> ");
        }
        System.out.println();
    }

    /**
     * Finds and prints the single exam where the highest marks were scored.
     */
    public static void printBestSingleExam(int[] marks, String[] examNames) {
        if (marks == null || marks.length == 0)
            return;

        int maxMark = marks[0];
        int bestExamIndex = 0;

        for (int i = 1; i < marks.length; i++) {
            if (marks[i] > maxMark) {
                maxMark = marks[i];
                bestExamIndex = i;
            }
        }

        System.out.println("The single BEST marks were scored in '" + examNames[bestExamIndex] + "' with a score of "
                + maxMark + ".");
    }

    public static void main(String[] args) {
        // The exams mapped to the user's request
        String[] examNames = {
                "Test 1",
                "Test 2",
                "Half Semester",
                "Test 3",
                "Test 4",
                "Final Semester"
        };

        // Example array of marks.
        // Kadane's is most interesting when there are some negative values (like a
        // penalty, a difficult paper that brought the aggregate down, etc.).
        // If all were positive, Kadane's would just select all exams.
        int[] testMarks = { 15, 20, -10, 25, 30, -5 };

        System.out.println("Exam progression: ");
        for (int i = 0; i < examNames.length; i++) {
            System.out.println(examNames[i] + ": " + testMarks[i]);
        }
        System.out.println("--------------------------------------------------");

        printMaxMarksPeriod(testMarks, examNames);

        System.out.println("--------------------------------------------------");
        printBestSingleExam(testMarks, examNames);
    }
}
