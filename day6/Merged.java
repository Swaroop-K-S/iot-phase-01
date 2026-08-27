package day6;

public class Merged {
	public static void main(String[] args) {
		int[] array1 = { 10, 20, 30, 40 };
		int[] array2 = { 50, 60, 70, 80 };
		int[] merged = new int[array1.length + array2.length];

		for (int i = 0; i < array1.length; i++) {
			merged[i] = array1[i];
		}

		for (int i = 0; i < array2.length; i++) {
			merged[array1.length + i] = array2[i];
		}

		System.out.println("Merged Array:");
		for (int i = 0; i < merged.length; i++) {
			System.out.println(merged[i] + "");
		}
	}
}
