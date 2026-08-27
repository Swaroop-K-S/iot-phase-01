package day7;

public class WhileLoop {
	public static void main(String[] args) {
		int amount = 10000;
		while (amount >= 0) {
			System.out.println("Balance: ₹" + amount);
			amount = amount - 2000;
		}
		System.out.println("Withdrawal Completed");
	}
}
