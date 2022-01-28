package lesson5;

import java.util.Scanner;

public class LinearSearch 
{

	public static void main(String[] args) 
	{

		int[] arr = { 10, 20, 30, 40, 50 };
		Scanner sc = new Scanner(System.in);
		
		System.out.println("The elements in the array:");
		for (Integer m : arr)
		{
			System.out.println(m);
		}
		
		System.out.println("Enter the element to be searched:");
		int value = sc.nextInt();
		int result = (int) linearing(arr, value);

		if (result == -1) 
		{

			System.out.println("Element not in the array");
		} 
		else 
		{

			System.out.println("The element " + arr[result] + " is found at " + result + "'th position in the array.");
		}

	}

	public static int linearing(int arr[], int x)
	{

		int arrlength = arr.length;
		for (int i = 0; i < arrlength - 1; i++)
		{

			if (arr[i] == x) 
			{

				return i;

			}
		}

		return -1;

	}

}
