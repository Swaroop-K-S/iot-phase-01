package day5;

public class SubstringExample {
    public static void main(String[] args) {
        String originalString = "Hello, World! Welcome to Java Programming.";

        // Substring to extract: "World" (index 7 to 11)
        int startIndex = 7;
        int endIndex = 12; // Exclusive
        
        // Using a for loop to create a substring manually
        String sub = "";
        for (int i = startIndex; i < endIndex; i++) {
            sub += originalString.charAt(i);
        }
        
        System.out.println("Extracted substring using for loop: " + sub);
    }
}
