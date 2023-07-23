Frequency 
//the frequency of each element in the array

package ArraysProgram;

public class Frequency {

	public static void main(String[] args) {
		int[] arr = new int[] { 15, 23, 25, 15, 23, 24,  8, 23,  1, 25, 22, 11, 22, 55, 44, 22 };

		int[] fr = new int[arr.length];

		int visited = -1;

		for (int i = 0; i < arr.length; i++) {
			int count = 1;

			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] == arr[j]) {
					count++;

					// to avoid counting save element
					fr[j] = visited;

				}
			}

			if (fr[i] != visited)
				fr[i] = count;
		}

	     //Displays the frequency of each element present in array   
		
		System.out.println("-----------------------------------------------");
		System.out.println("Element        |           Frequency ");
		System.out.println("-----------------------------------------------");

		for (int i = 0; i < fr.length; i++) {
			if (fr[i] != visited)
				System.out.println("  " + arr[i] + "           |         " + fr[i]);
		}

		System.out.println("-----------------------------------------------");

	}

}
