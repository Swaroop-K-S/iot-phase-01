package day7;

public class FirstLastOccurrenceNames {
    public static void main(String[] args) {
        String[] arr = {"Rakesh", "Uday", "Uday", "Ullas", "Ullas", "Ullas", "Vinod", "Vinod"};
        String target = "Ullas";
        int first = -1;
        int last = -1;
        int start = 0;
        int end = arr.length - 1;
        
        while (start <= end) {
            int mid = (start + end) / 2;
            int result = arr[mid].compareTo(target);
            
            if (result == 0) {
                first = mid;
                end = mid - 1;       // Search LEFT
            }
            else if (result < 0) {
                start = mid + 1;     // Search RIGHT
            }
            else {
                end = mid - 1;
            }
        }
        
        start = 0;
        end = arr.length - 1;
        while (start <= end) {
            int mid = (start + end) / 2;
            int result = arr[mid].compareTo(target);
            
            if (result == 0) {
                last = mid;
                start = mid + 1;      // Search RIGHT
            }
            else if (result < 0) {
                start = mid + 1;
            }
            else {
                end = mid - 1;
            }
        }
        
        System.out.println("First = " + first);
        System.out.println("Last = " + last);
    }
}
