package day4.com.cluster;

public class StudentDemo {
    public static void main(String[] args) {
        int students = 23;
        int studentsPerRow = 5;
        int studentsLeft = students % studentsPerRow;
        
        System.out.println("Total students: " + students);
        System.out.println("Students per row: " + studentsPerRow);
        System.out.println("Students left over: " + studentsLeft);
    }
}

