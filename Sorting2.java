
sorting
// using without method sorting array 

package ArraysProgram;

public class Sorting2 {

	public static void main(String[] args) {
		//System.out.println(" Element of Array:- " );
		
		int array[]= { 20, 45, -2, 123, 52, -45, 98, 62, -23, -45, 0, 32 };
		System.out.println(" Element of Array:- " );
		
		//int[] array = new int[] { 20, 45, -2, 123, 52, -45, 98, 62, -23, -45, 0, 32 };

		
		System.out.println(" Array Element of after sorting");

		for (int i = 0; i < array.length; i++) {
			
			for (int j = i + 1; j < array.length; j++) {
				
				int temp = 0;
				
				if (array[i] > array[j]) {
					
					temp = array[i];
					array[i] = array[j];
					array[j] = temp;
				}
			}
			System.out.println(array[i]);
		}
	}

}
