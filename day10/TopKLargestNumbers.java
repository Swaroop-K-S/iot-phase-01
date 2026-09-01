package day10;

import java.util.PriorityQueue;

public class TopKLargestNumbers {
    public static void main(String[] args) {
        int[] numbers = { 10, 4, 3, 20, 15, 7, 25 };
        int k = 3;

        PriorityQueue<Integer> minHeap = new PriorityQueue<>();

        for (int number : numbers) {
            minHeap.add(number);
            if (minHeap.size() > k) {
                minHeap.poll();
            }
        }

        System.out.println("Top " + k + " Largest Numbers:");
        while (!minHeap.isEmpty()) {
            System.out.println(minHeap.poll());
        }
    }
}
