package day8;

import java.util.Scanner;

class InteractiveStack {
    private int[] arr;
    private int top;
    private int capacity;

    public InteractiveStack(int size) {
        this.arr = new int[size];
        this.capacity = size;
        this.top = -1;
    }

    // method to push an element
    public void push(int element) {
        if (top == capacity - 1) {
            System.out.println("Stack Overflow! Too full for " + element);
            return;
        }
        arr[++top] = element;
        System.out.println("Nice, pushed " + element + " to stack.");
    }

    // method to pop an element
    public void pop() {
        if (top == -1) {
            System.out.println("Stack Underflow! Nothing to pop, rip.");
            return;
        }
        int removed = arr[top--];
        System.out.println("Popped " + removed + " out of the stack.");
    }

    // method to peek at top element
    public void peek() {
        if (top == -1) {
            System.out.println("Stack is empty, yo.");
            return;
        }
        System.out.println("Top element is definitely: " + arr[top]);
    }
}

public class CustomStackDemo {
    public static void main(String[] args) {
        // setting up scanner for input
        Scanner sc = new Scanner(System.in);

        System.out.print("Yo, enter the size of your stack: ");
        int size = sc.nextInt();

        // creating an instance of our stack
        InteractiveStack stack = new InteractiveStack(size);

        boolean running = true;

        // basic while loop for a menu
        while (running) {
            System.out.println("\n--- Stack Menu ---");
            System.out.println("1. Push");
            System.out.println("2. Pop");
            System.out.println("3. Peek");
            System.out.println("4. Exit");
            System.out.print("What do you want to do? ");

            int choice = sc.nextInt();

            // basic if-else or switch logic
            if (choice == 1) {
                System.out.print("Enter a number to push: ");
                int num = sc.nextInt();
                stack.push(num);
            } else if (choice == 2) {
                stack.pop();
            } else if (choice == 3) {
                stack.peek();
            } else if (choice == 4) {
                System.out.println("Exiting... see ya!");
                running = false;
            } else {
                System.out.println("Invalid choice, try again.");
            }
        }

        // closing scanner
        sc.close();
    }
}
