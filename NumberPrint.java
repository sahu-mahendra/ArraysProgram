NumberPrint 
package ArraysProgram;

public class NumberPrint {

	public static void main(String[] args) {
		int[][] a = new int[][] { { 10, 30, 40 }, { 50, 6 }, { 30, 45, 65, 48 }, { 32, 56 },{454,64,647} };
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[i].length; j++) {

				System.out.print(a[i][j] + " ");
			}
			System.out.println();
		}

	}

}