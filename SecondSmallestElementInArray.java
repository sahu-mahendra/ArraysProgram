SecondSmallest
package ArraysProgram;

public class SecondSmallestElementInArray {
	public static int getSecondSmallestElement(int[] a, int total) {

		int temp;

		for (int i = 0; i < total; i++) {
			for (int j = i + 1; j < total; j++) {

				if (a[i] > a[j]) {
					temp = a[i];
					a[i] = a[j];
					a[j] = temp;
				}
			}
		}  

		return a[1];
	}

	public static void main(String[] args) {
		System.out.println("Element of array:-");

		int a[] = { 2, 4, 5, 6, 1, 4, 7 };
		int b[] = { 22, 55, 44, 88, 99, 77, 66, 33, 11 };

		System.out.println("SecondSmallestElementInArray :" + getSecondSmallestElement(a, 7));
		System.out.println("SecondSmallestElementInArray :" + getSecondSmallestElement(b, 9));

	}

}
