package day8;

public class Circular_queue {
	int[] queue = new int[5];
	int front = -1, rear = -1;

	void enqueue(int data) {
		if ((rear + 1) % 5 == front) {
			System.out.println("Queue is Full");
		} else {
			if (front == -1)
				front = 0;
			rear = (rear + 1) % 5;
			queue[rear] = data;
		}
	}

	void dequeue() {
		if (front == -1) {
			System.out.println("Queue is Empty");
		} else {
			System.out.println("Deleted: " + queue[front]);
			if (front == rear)
				front = rear = -1;
			else
				front = (front + 1) % 5;
		}
	}

	void display() {
		if (front == -1) {
			System.out.println("Queue is Empty");
			return;
		}
		int i = front;
		while (true) {
			System.out.print(queue[i] + " ");
			if (i == rear)
				break;
			i = (i + 1) % 5;
		}
		System.out.println();
	}

	public static void main(String[] args) {
		Circular_queue q = new Circular_queue();
		q.enqueue(10);
		q.enqueue(20);
		q.enqueue(30);
		q.enqueue(40);
		System.out.print("Queue: ");
		q.display();
		q.dequeue();
		System.out.print("After Dequeue: ");
		q.display();
		q.enqueue(50);
		q.enqueue(60);
		System.out.print("Final Queue: ");
		q.display();
	}
}
