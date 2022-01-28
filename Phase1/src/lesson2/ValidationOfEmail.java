package lesson2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ValidationOfEmail {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		List<String> listOfEmailIds = new ArrayList<>();
		
		listOfEmailIds.add("tariq@gmail.com");
		listOfEmailIds.add("shariq@gmail.com");
		listOfEmailIds.add("shreyas@gmail.com");
		listOfEmailIds.add("saneeth@gmail.com");
		listOfEmailIds.add("shashi@gmail.com");
		listOfEmailIds.add("abdul@gmail.com");
		listOfEmailIds.add("gagan@gmail.com");
		listOfEmailIds.add("varun@gmail.com");

		System.out.println("Enter the Email Id:");
		String input = scan.next();

		boolean exist = false;
        
        for (int i = 0; i < listOfEmailIds.size(); i++)
        {
        	if (input.equals(listOfEmailIds.get(i)))
        	{
        		System.out.println("The given expense " + input + " exist!!\n");
        		exist = true;
        		break;
        	}
        }
        
        if (!exist)
        {
        	System.out.println("The given expense " + input + " does not exist!!\n");
        }
	}
}
