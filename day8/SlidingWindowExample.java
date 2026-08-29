package day8;

import java.util.LinkedList;
import java.util.Queue;

public class SlidingWindowExample {

	public static void main(String[] args) {
		int[] arr = { 2, 1, 5, 1, 3, 2 };
		int k = 3;

		int maxSum = findMaxSumSubarray(k, arr);
		System.out.print("Array: ");
		for (int num : arr) {
			System.out.print(num + " ");
		}
		System.out.println();
		System.out.println("Maximum sum of a contiguous subarray of size " + k + " is: " + maxSum);
	}

	public static int findMaxSumSubarray(int k, int[] arr) {
		int maxSum = 0;
		int windowSum = 0;
		Queue<Integer> window = new LinkedList<>();

		for (int num : arr) {
			window.add(num);
			windowSum += num;

			// If the window size exceeds k, remove the oldest element
			if (window.size() > k) {
				windowSum -= window.poll();
			}

			// Once we hit window size k, start recording the maximum sum
			if (window.size() == k) {
				maxSum = Math.max(maxSum, windowSum);
			}
		}

		return maxSum;
	}
}
