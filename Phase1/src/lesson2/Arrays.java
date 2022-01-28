package lesson2;

public class Arrays {

	public static void main(String args[]) {

		// single dimensional array
		// declaration and instantiation
		int a[] = new int[5];

		// initialization
		a[0] = 10;
		a[1] = 20;
		a[2] = 70;
		a[3] = 40;
		a[4] = 50;

		System.out.println("Single Dimensional Array:\n");
		// Displaying arrays
		for (int i = 0; i < a.length; i++)
			System.out.println(a[i]);

		// multidimensional array
		int arr[][] = { { 1, 2, 3 }, { 2, 4, 5 }, { 4, 4, 5 } };
		
		System.out.println("\nMultidimensional Array:\n");
		// Displaying 2d array
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
	}
}
