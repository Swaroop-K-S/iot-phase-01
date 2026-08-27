package day6;

public class IntersectionName {
	public static void main(String[] args) {
		String[] array1 = { "A", "B", "C", "D" };
		String[] array2 = { "C", "D", "E", "F" };

		// The maximum possible size for the intersection array is the length of array1
		String[] intersection = new String[array1.length];
		int k = 0; // To keep track of the number of intersecting elements

		for (int i = 0; i < array1.length; i++) {
			// Check if array1[i] is present in array2
			boolean inArray2 = false;
			for (int j = 0; j < array2.length; j++) {
				if (array1[i].equals(array2[j])) {
					inArray2 = true;
					break;
				}
			}

			// If it exists in array2, add it to intersection (avoiding duplicates)
			if (inArray2) {
				boolean alreadyAdded = false;
				for (int m = 0; m < k; m++) {
					if (array1[i].equals(intersection[m])) {
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

		System.out.println("Intersection Array of Names:");
		for (int i = 0; i < k; i++) {
			System.out.println(intersection[i]);
		}
	}
}
