package day7;

public class BinarySearch {
    public static void main(String[] args) {
        String[] arr = { "Uday", "Rakesh", "Ullas", "Vinod", "Yashas", "Ujwal" };
        String key = "Ullas";
        int low = 0;
        int high = arr.length - 1;
        while (low <= high) {
            int mid = (low + high) / 2;
            int result = arr[mid].compareTo(key);

            if (result == 0) {
                System.out.println("String found at index: " + mid);
                return;
            } else if (result < 0) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        System.out.println("String not found");
    }
}
