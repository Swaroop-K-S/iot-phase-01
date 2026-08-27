package day7;

public class FirstLastOccurrence {
    
    public static <T extends Comparable<T>> int[] findFirstLast(T[] arr, T target) {
        int first = -1;
        int last = -1;
        
        // Find First
        int start = 0;
        int end = arr.length - 1;
        while (start <= end) {
            int mid = (start + end) / 2;
            int result = arr[mid].compareTo(target);
            if (result == 0) {
                first = mid;
                end = mid - 1;       // Search LEFT
            } else if (result < 0) {
                start = mid + 1;     // Search RIGHT
            } else {
                end = mid - 1;
            }
        }
        
        // Find Last
        start = 0;
        end = arr.length - 1;
        while (start <= end) {
            int mid = (start + end) / 2;
            int result = arr[mid].compareTo(target);
            if (result == 0) {
                last = mid;
                start = mid + 1;      // Search RIGHT
            } else if (result < 0) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        
        return new int[]{first, last};
    }

    public static void main(String[] args) {
        // Integer example
        Integer[] intArr = {100, 100, 100, 200, 200, 300, 300, 300};
        Integer intTarget = 300;
        int[] intResult = findFirstLast(intArr, intTarget);
        System.out.println("Integer First = " + intResult[0] + ", Last = " + intResult[1]);

        // String example
        String[] strArr = {"Rakesh", "Uday", "Uday", "Ullas", "Ullas", "Ullas", "Vinod", "Vinod"};
        String strTarget = "Ullas";
        int[] strResult = findFirstLast(strArr, strTarget);
        System.out.println("String First = " + strResult[0] + ", Last = " + strResult[1]);
    }
}
