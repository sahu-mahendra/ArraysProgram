smallest
package ArraysProgram;

public class SmallestElement_array {

	public static void main(String[] args) {

		int arr[] = new int[] { 12, 54, 36, 98, 45, 25 };
		System.out.println(" Element of Original Array :");
		int min = arr[0];

		for (int i = 0; i < arr.length; i++) {

			System.out.println(arr[i] + " ");
			if (arr[i] < min)
				min = arr[i];
		}

		System.out.println();
		System.out.println("Smallest element present in given array:" + min);

	}

}
