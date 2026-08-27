package day7;

public class FloorCeilSearch {

    public static void main(String[] args) {
        int[] sizes = {6, 8, 10, 12, 14};
        int target = 9;
        int start = 0;
        int end = sizes.length - 1;
        int floor = -1;
        int ceil = -1;
        while (start <= end) {
            int mid = (start + end) / 2;
            if (sizes[mid] == target) {
                floor = sizes[mid];
                ceil = sizes[mid];
                break;
            } 
            else if (sizes[mid] < target) {
                floor = sizes[mid];    // Possible floor
                start = mid + 1;       // Go RIGHT

            } 
            else {

                ceil = sizes[mid];     // Possible ceil
                end = mid - 1;         // Go LEFT
            }
        }

        System.out.println("Floor = " + floor);
        System.out.println("Ceil = " + ceil);
    }
}
