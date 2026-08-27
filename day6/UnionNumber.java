package day6;

public class UnionNumber {
	public static void main(String[] args) {
		int[] array1 = { 10, 20, 30, 40 };
		int[] array2 = { 30, 40, 50, 60 };
		
		// The maximum possible size for the union array is the sum of both lengths
		int[] union = new int[array1.length + array2.length];
		int k = 0; // To keep track of the number of unique elements

		// First, add all elements from array1
		for (int i = 0; i < array1.length; i++) {
			union[k] = array1[i];
			k++;
		}

		// Next, add elements from array2 only if they don't already exist in the union array
		for (int i = 0; i < array2.length; i++) {
			boolean isDuplicate = false;
			for (int j = 0; j < k; j++) {
				if (array2[i] == union[j]) {
					isDuplicate = true;
					break;
				}
			}
			
			// If not a duplicate, add it to the union array
			if (!isDuplicate) {
				union[k] = array2[i];
				k++;
			}
		}

		System.out.println("Union Array of Numbers:");
		for (int i = 0; i < k; i++) {
			System.out.println(union[i]);
		}
	}
}
