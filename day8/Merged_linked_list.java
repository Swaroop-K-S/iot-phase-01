package day8;

public class Merged_linked_list {
	static class Node {

		int data;
		Node next;

		Node(int data) {
			this.data = data;
		}
	}

	public static void main(String[] args) {
		Node first1 = new Node(10);
		Node second1 = new Node(30);
		Node third1 = new Node(50);

		first1.next = second1;
		second1.next = third1;

		Node first2 = new Node(20);
		Node second2 = new Node(40);
		Node third2 = new Node(60);

		first2.next = second2;
		second2.next = third2;
		Node dummy = new Node(0);
		Node current = dummy;
		Node list1 = first1;
		Node list2 = first2;
		
		while (list1 != null && list2 != null) {

			if (list1.data < list2.data) {
				current.next = list1;
				list1 = list1.next;
			} else {
				current.next = list2;
				list2 = list2.next;
			}

			current = current.next;
		}

		if (list1 != null) {
			current.next = list1;
		} else {
			current.next = list2;
		}
		
		current = dummy.next;

		while (current != null) {
			System.out.print(current.data + " -> ");
			current = current.next;
		}

		System.out.println("null");
	}
}
