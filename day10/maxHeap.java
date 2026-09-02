package day10;

import java.util.PriorityQueue;

public class maxHeap {
        public static void main(String[] args) {
        PriorityQueue<Integer> maxHeap =new PriorityQueue<>((a, b) -> b - a);
        maxHeap.add(30);
        maxHeap.add(10);
        maxHeap.add(20);
        maxHeap.add(5);
        System.out.println("Max Heap : " + maxHeap);
        System.out.println("Largest element : " + maxHeap.peek());
    }
}