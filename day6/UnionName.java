package day6;

public class UnionName {
	public static void main(String[] args) {
		String[] array1 = { "A", "B", "C", "D" };
		String[] array2 = { "C", "D", "E", "F" };

		// The maximum possible size for the union array is the sum of both lengths
		String[] union = new String[array1.length + array2.length];
		int k = 0; // To keep track of the number of unique elements

		// First, add all elements from array1
		for (int i = 0; i < array1.length; i++) {
			union[k] = array1[i];
			k++;
		}

		// Next, add elements from array2 only if they don't already exist in the union
		// array
		for (int i = 0; i < array2.length; i++) {
			boolean isDuplicate = false;
			for (int j = 0; j < k; j++) {
				// Use .equals() for String comparison, not ==
				if (array2[i].equals(union[j])) {
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

		System.out.println("Union Array of Names:");
		for (int i = 0; i < k; i++) {
			System.out.println(union[i]);
		}
	}
}
