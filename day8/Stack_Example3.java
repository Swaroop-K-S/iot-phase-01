package day8;

import java.util.Stack;

public class Stack_Example3 {
	public static void main(String[] args) {
		Stack<Integer> stack = new Stack<>();
		int a, b;
		
		System.out.println("=== Subtraction ===");
		stack.push(2);
		stack.push(3);
		a = stack.pop(); // a = 3
		b = stack.pop(); // b = 2
		stack.push(a - b); // push 3 - 2 = 1
		stack.push(4);
		b = stack.pop(); // b = 4
		System.out.println("Result =" + b); // prints 4
		a = stack.pop(); // a = 1
		System.out.println("Result =" + a); // prints 1
		stack.push(a - b); // push 1 - 4 = -3
		
		System.out.println("\n=== Multiplication ===");
		stack.push(2);
		stack.push(3);
		a = stack.pop(); // a = 3
		b = stack.pop(); // b = 2
		stack.push(a * b); // push 3 * 2 = 6
		stack.push(4);
		b = stack.pop(); // b = 4
		System.out.println("Result =" + b); // prints 4
		a = stack.pop(); // a = 6
		System.out.println("Result =" + a); // prints 6
		stack.push(a * b); // push 6 * 4 = 24
		
		System.out.println("\n=== Division ===");
		stack.push(6); // Pushing 6 instead of 2 for a cleaner division
		stack.push(2); // Pushing 2 instead of 3
		a = stack.pop(); // a = 2
		b = stack.pop(); // b = 6
		stack.push(b / a); // push 6 / 2 = 3
		stack.push(4);
		b = stack.pop(); // b = 4
		System.out.println("Result =" + b); // prints 4
		a = stack.pop(); // a = 3
		System.out.println("Result =" + a); // prints 3
		stack.push(b / a); // push 4 / 3 = 1
	}
}
