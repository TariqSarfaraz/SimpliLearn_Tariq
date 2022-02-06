package lesson3;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.OutputStream;
import java.util.Scanner;

public class FileHandling {

	public static void main(String[] args) 
	{

		FileHandling obj = new FileHandling();
		String fileName = "C:\\Users\\shariqirbaz\\Desktop\\Sample";
		
		obj.createFile(fileName);
		obj.writeFile(fileName);
		obj.appendFile(fileName);
		obj.readFile(fileName);
		
	}
	
	/**
	 * This method is used to create a file with provided name.
	 * 
	 * @param fileName
	 */
	void createFile(String fileName) 
	{
		try 
		{
			File file = new File(fileName);
			file.createNewFile();
			System.out.println("An empty file created successfully.");
		} 
		catch (IOException e) 
		{
			System.out.println(e);
		}
	}
	
	/**
	 * This method is used to write to the given file.
	 * 
	 * @param fileName
	 */
	void writeFile(String fileName) 
	{
		try 
		{
			FileWriter wt = new FileWriter(fileName);
			wt.write("I am writing this line to the file.");
			wt.close();
			System.out.println("Successfully i wrote to the file.");
		} 
		catch (IOException e) 
		{
			System.out.println(e);
		}
	}
	
	/**
	 * This method is used to append to the given file.
	 * 
	 * @param fileName
	 */
	void appendFile(String fileName) 
	{
		try 
		{
			OutputStream os = new FileOutputStream(new File(fileName), true);
			//true defines that the file is ready to append
			String data = "I have appended this line to the file.";
			os.write(data.getBytes(),0,data.length() );
			os.close();
			System.out.println("Successfully appended the given string to the file.");
		} 
		catch (IOException e) 
		{
			System.out.println(e);
		}
	}
	
	/**
	 * This method is used to read a given file.
	 * 
	 * @param fileName
	 */
	void readFile(String fileName) 
	{
		try 
		{
			File rd = new File(fileName);
			Scanner reader = new Scanner(rd);
			while(reader.hasNextLine())
			{
				String data = reader.nextLine();
				System.out.println(data);
			} 
			reader.close();
		}
		catch (FileNotFoundException e) 
		{
			System.out.println(e);
		}
	}
	
	
}
