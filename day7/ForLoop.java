public class ForLoop {
	public static void main(String[] args) {
		for (int amount = 10000; amount >= 0; amount -= 2000) {
	            System.out.println("Balance: ₹" + amount);
	        }
		System.out.println("Withdrawal Completed");
	}
}
