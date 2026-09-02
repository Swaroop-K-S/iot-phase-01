package day10;

import java.util.PriorityQueue;

public class Median_heap {

    public static void main(String[] args) {

        PriorityQueue<Integer> maxHeap =
                new PriorityQueue<>((a, b) -> b - a);

        PriorityQueue<Integer> minHeap =
                new PriorityQueue<>();

        int[] a = {40, 30, 10, 60, 80};

        for (int x : a) {
            maxHeap.add(x);
        }

        while (maxHeap.size() > a.length / 2)
            minHeap.add(maxHeap.poll());

        System.out.println("Median = " + minHeap.peek());
    }
}