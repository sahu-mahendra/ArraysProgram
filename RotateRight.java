RotateRight
package ArraysProgram;

public class RotateRight {

	public static void main(String[] args) {
		int arr[] = new int[] { 1, 2, 3, 4, 5};

		// n determine the number of times an array should be rotated.
		int n = 3;

		// Displays original array
		System.out.println("Original Array:-");

		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}

		// Rotate the given array by n times toward right
		for (int i = 0; i < n; i++) {
			int j, last;

			// store the last element of array
			last = arr[arr.length - 1];

			for (j = arr.length - 1; j > 0; j--) {
				// shift element one by one
				arr[j] = arr[j - 1];
			}

			arr[0] = last;
		}

		System.out.println();

		System.out.println("Array after right Rotation");

		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i] + " ");
		}

	}

}
