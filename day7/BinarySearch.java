package day7;

public class BinarySearch {
    
    public static <T extends Comparable<T>> int binarySearch(T[] arr, T key) {
        int low = 0;
        int high = arr.length - 1;
        while (low <= high) {
            int mid = (low + high) / 2;
            int result = arr[mid].compareTo(key);

            if (result == 0) {
                return mid;
            } else if (result < 0) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        // String example (must be sorted alphabetically)
        String[] strArr = { "Rakesh", "Uday", "Ujwal", "Ullas", "Vinod", "Yashas" };
        String strKey = "Ullas";
        int strIndex = binarySearch(strArr, strKey);
        System.out.println("String '" + strKey + "' found at index: " + strIndex);

        // Integer example (must be sorted)
        Integer[] intArr = { 20, 30, 45, 50, 60, 70, 80 };
        Integer intKey = 60;
        int intIndex = binarySearch(intArr, intKey);
        System.out.println("Integer " + intKey + " found at index: " + intIndex);
    }
}
