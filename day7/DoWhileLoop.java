package day7;

public class DoWhileLoop {
	public static void main(String[] args) {
		int amount = 10000;
		do {
			System.out.println("Balance: ₹" + amount);
			amount = amount - 2000;
		} while (amount >= 0);
		System.out.println("Withdrawal Completed");
	}
}
