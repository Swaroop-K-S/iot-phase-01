package day7;

public class FloorCeilSearch {

    public static class Result<T> {
        public T floor;
        public T ceil;
        public Result(T floor, T ceil) {
            this.floor = floor;
            this.ceil = ceil;
        }
    }

    public static <T extends Comparable<T>> Result<T> findFloorCeil(T[] arr, T target) {
        int start = 0;
        int end = arr.length - 1;
        T floor = null;
        T ceil = null;
        
        while (start <= end) {
            int mid = (start + end) / 2;
            int comparison = arr[mid].compareTo(target);
            
            if (comparison == 0) {
                floor = arr[mid];
                ceil = arr[mid];
                break;
            } 
            else if (comparison < 0) {
                floor = arr[mid];    // Possible floor
                start = mid + 1;       // Go RIGHT
            } 
            else {
                ceil = arr[mid];     // Possible ceil
                end = mid - 1;         // Go LEFT
            }
        }
        return new Result<>(floor, ceil);
    }

    public static void main(String[] args) {
        // Integer example
        Integer[] sizes = {6, 8, 10, 12, 14};
        Integer intTarget = 9;
        Result<Integer> intResult = findFloorCeil(sizes, intTarget);
        System.out.println("Integer Target = " + intTarget);
        System.out.println("Integer Floor = " + intResult.floor);
        System.out.println("Integer Ceil = " + intResult.ceil);

        // String example
        String[] names = {"Alice", "Bob", "Charlie", "Eve", "Frank"};
        String strTarget = "David";
        Result<String> strResult = findFloorCeil(names, strTarget);
        System.out.println("String Target = " + strTarget);
        System.out.println("String Floor = " + strResult.floor);
        System.out.println("String Ceil = " + strResult.ceil);
    }
}
