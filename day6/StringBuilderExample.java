package day6;

public class StringBuilderExample {
    public static void main(String[] args) {
        // Create a new StringBuilder with initial text
        StringBuilder sb = new StringBuilder("Hello");
        System.out.println("Original: " + sb);

        // 1. Append: Adds text to the end
        sb.append(" World");
        System.out.println("After append: " + sb);

        // 2. Insert: Inserts text at a specific index
        sb.insert(5, " Beautiful");
        System.out.println("After insert: " + sb);

        // 3. Replace: Replaces text from start index to end index
        sb.replace(6, 15, "Java");
        System.out.println("After replace: " + sb);

        // 4. Delete: Removes text from start index to end index
        sb.delete(6, 11);
        System.out.println("After delete: " + sb);

        // 5. Reverse: Reverses the characters in the StringBuilder
        sb.reverse();
        System.out.println("After reverse: " + sb);
    }
}
