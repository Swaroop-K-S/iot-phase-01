package day8;

public class Circular_linked_list {
	static class Node {
		int data;
		Node next;

		Node(int data) {
			this.data = data;
		}
	}

	public static void main(String[] args) {
		Node first = new Node(10);
		Node second = new Node(20);
		Node third = new Node(30);
		first.next = second;
		second.next = third;
		third.next = first;
		Node current = first;
		for (int i = 0; i < 6; i++) {
			System.out.print(current.data + "->");
			current = current.next;
		}
		System.out.println("...");
	}
}
