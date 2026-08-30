package DAY9;
import java.util.ArrayList;
public class Lexical_phonenumber {
	public static void main(String[]args) {
		String[] phoneNumbers = {"9876543267","9123456789","9988776655",
				"8765432109","9012345678","8846587660","98758679907","9865434323"};
		String search = "98";
		        ArrayList<String> result = new ArrayList<>();
		        for (String number : phoneNumbers) {
		            if (number.contains(search)) {
		                result.add(number);
		            }
		        }
		        System.out.println("Search results : ");
		        for (String number : result) {
		            System.out.println(number);
		        }
		    }
		}
	
	


