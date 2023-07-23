CopyArray 
package ArraysProgram;

public class CopyArray {

	public static void main(String[] args) {
		int[] arr1 = new int[] { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
		int[] arr2 = new int[arr1.length];

		// Copying all elements of one array into another
		for (int i = 0; i < arr1.length; i++) {
			arr2[i] = arr1[i];
		}

		// Displaying elements of array arr1
	System.out.println("Element as original array :-");

		for (int i = 0; i < arr1.length; i++) {
			System.out.print(arr1[i] + " ");

		}
		System.out.println();

		// Displaying elements of array arr2
		System.out.println("Element of new array:-");
		for (int i = 0; i < arr2.length; i++) {
			System.out.println(arr2[i] + " ");
		}
	}

}
