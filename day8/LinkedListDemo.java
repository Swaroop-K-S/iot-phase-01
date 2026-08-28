package day8;

public class LinkedListDemo {

    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public static void main(String[] args) {
        // Create nodes
        Node first = new Node(10);
        Node second = new Node(20);
        Node third = new Node(30);

        // Link nodes
        first.next = second;
        second.next = third;

        // Traverse and print the linked list
        Node current = first;
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println();
    }
}
