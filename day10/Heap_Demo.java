package day10;

import java.util.PriorityQueue;

public class Heap_Demo {
    public static void main(String[] args) {
        int[] a = {30, 10, 20, 5, 40};
        PriorityQueue<Integer> minHeap = new PriorityQueue<>();
        PriorityQueue<Integer> maxHeap =
                new PriorityQueue<>((x, y) -> y - x);
        for (int x : a) {
            minHeap.add(x);
            maxHeap.add(x);
        }
        System.out.println("Min Heap : " + minHeap);
        System.out.println("Smallest : " + minHeap.peek());
        System.out.println("Max Heap : " + maxHeap);
        System.out.println("Largest : " + maxHeap.peek());
        PriorityQueue<Integer> temp =
                new PriorityQueue<>();
        for (int x : a)
            temp.add(x);
        int middle = a.length / 2;
        for (int i = 0; i < middle; i++)
            temp.poll();
        System.out.println("Median : " + temp.peek());
    }
}