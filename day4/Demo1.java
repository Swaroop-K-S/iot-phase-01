import java.util.HashSet;

public class Demo1{
    public static void main(String[] args) {

        int[] numbers = {10, 20, 30, 40, 50};

        HashSet<Integer> set = new HashSet<>();

      
        for (int number : numbers) {
            set.add(number);
        }

        int target = 40;

      
        if (set.contains(target)) {
            System.out.println("Number found");
        } else {
            System.out.println("Number not found");
        }
    }
}
