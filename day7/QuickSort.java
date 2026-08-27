package day7;

public class QuickSort {

    public static <T extends Comparable<T>> void quickSort(T[] arr, int low, int high) {
        if (low < high) {
            int pi = partition(arr, low, high);
            quickSort(arr, low, pi - 1);
            quickSort(arr, pi + 1, high);
        }
    }

    private static <T extends Comparable<T>> int partition(T[] arr, int low, int high) {
        T pivot = arr[high];
        int i = (low - 1);
        for (int j = low; j < high; j++) {
            if (arr[j].compareTo(pivot) < 0) {
                i++;
                T temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        T temp = arr[i + 1];
        arr[i + 1] = arr[high];
        arr[high] = temp;
        return i + 1;
    }

    public static void main(String[] args) {
        Integer[] marks = {80, 45, 60, 50, 30, 20, 70};
        quickSort(marks, 0, marks.length - 1);
        
        System.out.print("Sorted Integers: ");
        for (Integer mark : marks) {
            System.out.print(mark + " ");
        }
        System.out.println();

        String[] names = {"Uday", "Rakesh", "Ullas", "Vinod", "Yashas", "Ujwal"};
        quickSort(names, 0, names.length - 1);
        
        System.out.print("Sorted Strings: ");
        for (String name : names) {
            System.out.print(name + " ");
        }
        System.out.println();
    }
}
