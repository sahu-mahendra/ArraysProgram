package ArraysProgram;

public class AscendingArray {

	public static void main(String[] args) {
		int arr[] = new int[] { 7, 40, 6, 8, 9, 7, 46, 1, 2, 35, 6, 58, 97, 64, 30 };

		for (int i = 0; i < arr.length; i++) {

			for (int j = 0; j < arr.length; j++) {

				if (arr[i] < arr[j]) {
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;

				}
			}
		}
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " |");
		}
	}
}                     