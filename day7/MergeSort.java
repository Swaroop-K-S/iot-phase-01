package day7;

public class MergeSort {

    public static <T extends Comparable<T>> void mergeSort(T[] a, int left, int right) {
        if (left >= right) {
            return;
        }
        int mid = (left + right) / 2;
        mergeSort(a, left, mid);
        mergeSort(a, mid + 1, right);
        
        @SuppressWarnings("unchecked")
        T[] temp = (T[]) new Comparable[right - left + 1];
        int i = left, j = mid + 1;
        int k = 0;
        
        while (i <= mid && j <= right) {
            temp[k++] = a[i].compareTo(a[j]) < 0 ? a[i++] : a[j++];
        }
        
        while (i <= mid) {
            temp[k++] = a[i++];
        }
        
        while (j <= right) {
            temp[k++] = a[j++];
        }
        
        for (i = 0; i < temp.length; i++) {
            a[left + i] = temp[i];
        }
    }

    public static void main(String[] args) {
        Integer[] marks = {80, 45, 60, 50, 30, 20, 70};
        mergeSort(marks, 0, marks.length - 1);
        
        System.out.print("Sorted Integers: ");
        for (Integer mark : marks) {
            System.out.print(mark + " ");
        }
        System.out.println();

        String[] names = {"Uday", "Rakesh", "Ullas", "Vinod", "Yashas", "Ujwal"};
        mergeSort(names, 0, names.length - 1);
        
        System.out.print("Sorted Strings: ");
        for (String name : names) {
            System.out.print(name + " ");
        }
        System.out.println();
    }
}
