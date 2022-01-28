package lesson5;

import java.util.Arrays;
import java.util.Scanner;

public class ExponentialSearch 
{

	public static void main(String[] args) 
	{

		int[] arr = { 10, 20, 30, 40, 50};
		Scanner scan = new Scanner(System.in);
		
		System.out.println("The elements in the array :");
		for (Integer m : arr)
		{
			System.out.println(m);
		}
		int length = arr.length;
		
		System.out.println("\nEnter the element you want to search:");
		int input = scan.nextInt();
		int index = exponentialSearch(arr, length, input);
		if (index < 0) 
		{

			System.out.println("Element is not present in the array");

		} else 
		{

			System.out.println("The element " + input + " is present in the array at index: " + index);
		}

	}

	public static int exponentialSearch(int[] arr, int length, int value)
	{

		if (arr[0] == value)
		{
			return 0;
		}
		int i = 1;
		while (i < length && arr[i] <= value)
		{

			i = i * 2;
		}
		return Arrays.binarySearch(arr, i / 2, Math.min(i, length), value);
	}

}
