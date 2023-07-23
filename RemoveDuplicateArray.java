
RemoveDuplicateArray 
package ArraysProgram;

public class RemoveDuplicateArray {

	public static int removeDuplicateElement(int arr[], int n) {

		if (n == 0 || n == 1) {
			return n;
		}

		int[] temp = new int[n];
		int j = 0;

		for (int i = 0; i < n - 1; i++) {
			if (arr[i] != arr[i + 1]) {
				temp[j++] = arr[i];
			}
		}
		
		temp[j++] = arr[n - 1];

		// changing for original array

		for (int i = 0; i < j; i++) {
			arr[i] = temp[i];

		}
		return j;

	}

	public static void main(String[] args) {

		int arr[] = { 10, 20, 30, 20, 40, 50, 30, 40, 50, 60, 70, 60, 80 };

		int length = arr.length;
		length = removeDuplicateElement(arr, length);

		// original array elements

		for (int i = 0; i < length; i++) {

			System.out.print(arr[i] + " ");
		}

	}

}
