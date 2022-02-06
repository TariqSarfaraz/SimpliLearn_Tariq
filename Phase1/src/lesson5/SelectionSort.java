package lesson5;

public class SelectionSort 
{

	public static void main(String[] args) 
	{

		int[] arr = { 10, 2, 5, 11, 1, 7, 20};
		int length = arr.length;
		
		System.out.println("Unsorted elements are:");
		for (Integer m : arr)
		{
			System.out.println(m);
		}
		
		selectionSort(arr);
		System.out.println("\nThe sorted elements are:");
		for (int i : arr)
		{

			System.out.println(i);
		}
	}

	public static void selectionSort(int[] arr)
	{

		for (int i = 0; i < arr.length - 1; i++) 
		{

			int index = i;
			for (int j = i + 1; j < arr.length; j++) 
			{
				if (arr[j] < arr[index]) 
				{

					index = j;
				}

			}
			int smallNumber = arr[index];
			arr[index] = arr[i];
			arr[i] = smallNumber;
		}

	}
}
