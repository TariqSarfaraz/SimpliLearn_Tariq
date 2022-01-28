package lesson5;

public class InsertionSort 
{

	public static void main(String[] args) 
	{

		int[] arr = { 10, 1, 4, 25, 3, 2, 17};
		
		System.out.println("The unsorted elements are:");
		for(Integer m : arr)
			System.out.println(m);
		
		insertionSort(arr);
		System.out.println("\nThe sorted elements are:");
		for (int i = 0; i < arr.length; i++) 
		{

			System.out.println(arr[i]);

		}
	}

	public static void insertionSort(int[] arr) 
	{

		int len = arr.length;
		for (int j = 1; j < len; j++) 
		{
			int key = arr[j];
			int i = j - 1;
			while ((i > -1) && (arr[i] > key)) 
			{

				arr[i + 1] = arr[i];
				i--;
			}
			arr[i + 1] = key;
		}

	}
}
