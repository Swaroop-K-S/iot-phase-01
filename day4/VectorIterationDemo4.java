package day4;



import java.util.Enumeration;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.Vector;

public class VectorIterationDemo4 {
    public static void main(String[] args) {

        // can use Enumeration, Iterator and ListIterator with Vector
        Vector<String> vector = new Vector<>();

        vector.addElement("C");
        vector.addElement("A");
        vector.addElement("E");
        vector.addElement("B");
        vector.addElement("D");
        vector.addElement("F");

        // Using Enumeration with Vector
        System.out.print("Enumeration: ");
        Enumeration<String> enumeration = vector.elements();
        while (enumeration.hasMoreElements()) {
            String e = enumeration.nextElement();
            System.out.print(e + " ");
        }
        System.out.println();

        // Using Iterator with Vector
        System.out.print("Iterator: ");
        Iterator<String> iterator = vector.iterator();
        while (iterator.hasNext()) {
            String e = iterator.next();
            System.out.print(e + " ");
        }
        System.out.println();

        // Using ListIterator with Vector
        System.out.print("ListIterator forward: ");
        ListIterator<String> listIterator = vector.listIterator();
        while (listIterator.hasNext()) {
            String e = listIterator.next();
            System.out.print(e + " ");
        }
        System.out.println();

        System.out.print("ListIterator backward: ");
        while (listIterator.hasPrevious()) {
            String e = listIterator.previous();
            System.out.print(e + " ");
        }
        System.out.println();

    }

}

