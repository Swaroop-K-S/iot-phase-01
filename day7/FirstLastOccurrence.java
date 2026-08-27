package day7;

public class FirstLastOccurrence {
    public static void main(String[] args) {
        int[] arr = {100, 100, 100, 200, 200, 300, 300, 300};
        int target = 300;
        int first = -1;
        int last = -1;
        int start = 0;
        int end = arr.length - 1;
        
        while (start <= end) {
            int mid = (start + end) / 2;
            if (arr[mid] == target) {
                first = mid;
                end = mid - 1;       // Search LEFT
            }
            else if (arr[mid] < target) {
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
            if (arr[mid] == target) {
                last = mid;
                start = mid + 1;      // Search RIGHT
            }
            else if (arr[mid] < target) {
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
