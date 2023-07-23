
sorting2
          //using sorting method

package ArraysProgram;

import java.util.Arrays;

public class Sorting {

	public static void main(String[] args) {

		
		int[] array = new int[] { 20, 45, 12, 62, 53, 21, 9, 2, 31, 15 };
		Arrays.sort(array);

		System.out.print("Element of array sorted ascending order :");
		for (int i = 0; i < array.length; i++) {

			System.out.print(array[i]+ ",");

		}
	}

}
