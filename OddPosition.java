OddPosition 
package ArraysProgram;

public class OddPosition {

	public static void main(String[] args) {
		int[] arr = new int[] { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9 };
		System.out.println("Element of given array on Odd position :- ");
		for (int i = 1; i < arr.length; i = i + 2) {
			System.out.print(arr[i] + " ");

		}

	}

}
