LargestElement_array 
package ArraysProgram;

public class LargestElement_array {

	public static void main(String[] args) {
		System.out.println(" Element of Original Array :");
		int max = 0;
		
		int arr[] = new int[] { 12, 54, 36, 98, 45, 25 };
		
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
			
			if (arr[i] > max)
				max = arr[i];
		}

		System.out.println();
		
		System.out.println("Largest element present in given array:" + max);
	}

}
