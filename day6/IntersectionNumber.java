package day6;

public class IntersectionNumber {
	public static void main(String[] args) {
		int[] array1 = { 10, 20, 30, 40 };
		int[] array2 = { 30, 40, 50, 60 };

		// The maximum possible size for the intersection array is the length of array1
		int[] intersection = new int[array1.length];
		int k = 0; // To keep track of the number of intersecting elements

		for (int i = 0; i < array1.length; i++) {
			// Check if array1[i] is present in array2
			boolean inArray2 = false;
			for (int j = 0; j < array2.length; j++) {
				if (array1[i] == array2[j]) {
					inArray2 = true;
					break;
				}
			}

			// If it exists in array2, add it to intersection (avoiding duplicates)
			if (inArray2) {
				boolean alreadyAdded = false;
				for (int m = 0; m < k; m++) {
					if (intersection[m] == array1[i]) {
						alreadyAdded = true;
						break;
					}
				}

				if (!alreadyAdded) {
					intersection[k] = array1[i];
					k++;
				}
			}
		}

		System.out.println("Intersection Array of Numbers:");
		for (int i = 0; i < k; i++) {
			System.out.println(intersection[i]);
		}
	}
}
