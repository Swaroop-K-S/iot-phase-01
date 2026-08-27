package day7;

public class Recursiontree {
	static void count(int n) {

		if (n == 0) {
			return;
		}
		System.out.println("calling count(" + n + ")");
		count(n - 1);
		System.out.println("Returning from count(" + n + ")");
	}

	public static void main(String[] args) {
		count(5);
	}
}
