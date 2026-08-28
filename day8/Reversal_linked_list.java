package day8;

public class Reversal_linked_list {

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
		
		Node previous = null;
		Node current = first;
		
		// Reverse the linked list
		while(current != null) {
			Node next = current.next;
			current.next = previous;
			previous = current; // This step was missing to keep track of the reversed list
			current = next;
		}
		
		// Print the reversed linked list
		current = previous; // previous is now the new head of the reversed list
		while(current != null) {
			System.out.print(current.data + "->");
			current = current.next;
		}
		System.out.println("null");
	}
}
