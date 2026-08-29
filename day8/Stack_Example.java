
package day8;

import java.util.Stack;

public class Stack_Example {
	public static void main(String[] args) {
		Stack<Integer> Stack = new Stack<>();
		Stack.push(10);
		Stack.push(20);
		Stack.push(30);
		System.out.println("Stack:" + Stack);
		System.out.print("Top element:" + Stack.peek());
		System.out.println("Removed:" + Stack.pop());
		System.out.println("Stack after pop:" + Stack);
		System.out.println("Is stack empty:" + Stack.isEmpty());
	}
}
