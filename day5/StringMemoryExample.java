package day5;

public class StringMemoryExample {
    public static void main(String[] args) {
        // 1. Without 'new' (String Literal) - Uses the String Pool
        String s1 = "Java";
        String s2 = "Java";
        
        // 2. With 'new' - Creates a brand new object in Heap memory
        String s3 = new String("Java");
        String s4 = new String("Java");
        
        System.out.println("--- Memory Reference Check (==) ---");
        // s1 and s2 point to the EXACT SAME memory location in the String Pool
        System.out.println("s1 == s2 : " + (s1 == s2)); // true
        
        // s3 and s4 point to DIFFERENT memory locations in the Heap
        System.out.println("s3 == s4 : " + (s3 == s4)); // false
        
        // s1 (Pool) and s3 (Heap) are DIFFERENT memory locations
        System.out.println("s1 == s3 : " + (s1 == s3)); // false
        
        System.out.println("\n--- Content Value Check (.equals()) ---");
        // The .equals() method checks the actual text, NOT the memory location
        System.out.println("s1.equals(s3) : " + s1.equals(s3)); // true
    }
}
