package day5;

import java.util.HashSet;

public class HashSetExample {
    public static void main(String[] args) {

        HashSet<String> objects = new HashSet<>();

        objects.add("Object A");
        objects.add("Object B");
        objects.add("Object C");

        System.out.println("Attempted to add 'Object A', 'Object B', 'Object C'.");

        System.out.println("Objects in the set: " + objects);
        if (objects.contains("Object B")) {
            System.out.println("'Object B' is in the set!");
        }

        objects.remove("Object C");
        System.out.println("After removing 'Object C': " + objects);
    }
}
