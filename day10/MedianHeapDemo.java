package day10;

import java.util.Collections;
import java.util.PriorityQueue;

public class MedianHeapDemo {
    // maxHeap stores the smaller half of numbers
    private static PriorityQueue<Integer> maxHeap = new PriorityQueue<>(Collections.reverseOrder());
    // minHeap stores the larger half of numbers
    private static PriorityQueue<Integer> minHeap = new PriorityQueue<>();

    public static void addNumber(int num) {
        if (maxHeap.isEmpty() || num <= maxHeap.peek()) {
            maxHeap.add(num);
        } else {
            minHeap.add(num);
        }

        // Rebalance heaps so size difference is at most 1
        if (maxHeap.size() > minHeap.size() + 1) {
            minHeap.add(maxHeap.poll());
        } else if (minHeap.size() > maxHeap.size()) {
            maxHeap.add(minHeap.poll());
        }
    }

    public static double getMedian() {
        if (maxHeap.size() == minHeap.size()) {
            return (maxHeap.peek() + minHeap.peek()) / 2.0;
        } else {
            return maxHeap.peek();
        }
    }

    public static void main(String[] args) {
        int[] numbers = {30, 10, 20, 5};

        for (int num : numbers) {
            addNumber(num);
            System.out.println("Inserted: " + num + " -> Current Median (Center Value): " + getMedian());
        }

        System.out.println("\nFinal Max Heap (Lower half): " + maxHeap);
        System.out.println("Final Min Heap (Upper half): " + minHeap);
        System.out.println("Final Median: " + getMedian());
    }
}
