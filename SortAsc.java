sortAsc
package ArraysProgram;

public class SortAsc {

	public static void main(String[] args) {
		int arr[] = new int[] { 14, 54, 12, 89, 78, 65, 35, 19, 34, 13 };

		int temp = 0;
		System.out.println("Element of Original of Array:-");
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		// Sort the array in ascending order

		for (int i = 0; i < arr.length; i++) {

			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] > arr[j]) {
					temp   = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
		System.out.println();
		// Displaying elements of array after sorting
		System.out.println("Elements of array sorted in ascending order:");
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}
}
