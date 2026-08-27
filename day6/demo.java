package day6;

public class demo {
    public static void main(String[] args) {
        // I corrected your code to use StringBuilder instead of creating a 'demo'
        // object.
        // This will actually run the append, insert, replace, and delete methods you
        // wanted to test!

        StringBuilder sb = new StringBuilder("Java"); // Starting with some base text

        sb.append(" Program");
        System.out.println("Append : " + sb);
        System.out.println();

        // Inserts " Easy" starting at index 4 (right after "Java")
        sb.insert(4, " Easy");
        System.out.println("Insert : " + sb);
        System.out.println();

        // Replaces the characters from index 0 to 4 ("Java") with "Core"
        sb.replace(0, 4, "Core");
        System.out.println("Replace: " + sb);
        System.out.println();

        // Deletes the characters from index 9 to 11
        sb.delete(9, 13);
        System.out.println("Delete : " + sb);
        System.out.println();
    }
}
