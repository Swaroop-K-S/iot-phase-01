package DAY9;
import java.util.ArrayList;
public class Lexical_search {
	public static void main(String[]args) {
		String []names = {"Rakesh","Ravi","Rajesh","Ramu"};
		String search ="Ra";
		ArrayList<String>result= new ArrayList<>();
		for(String name: names) {
			if(name.contains(search)) {
				result.add(name);
			}
		}
		System.out.println("Srearch result");
		for(String name:result) {
			System.out.println(name);
		}
		
		
	}

}
