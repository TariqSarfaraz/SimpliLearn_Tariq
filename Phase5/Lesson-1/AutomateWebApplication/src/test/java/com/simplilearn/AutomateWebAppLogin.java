package com.simplilearn;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutomateWebAppLogin
{
	public static void main(String[] args) throws InterruptedException
	{

		// Opening the Chrome Browser
		WebDriver driver = new ChromeDriver();
		Thread.sleep(2000);

		// Maximizing the window of the browser
		driver.manage().window().maximize();
		Thread.sleep(2000);

		// Opening the application in browser
		driver.get("http://automationpractice.com/index.php");
		Thread.sleep(2000);

		driver.findElement(By.xpath("//a[@class='login']")).click();

		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("TomHanks@gmail.com");
		
		driver.findElement(By.xpath("//input[@id='passwd']")).sendKeys("TomHanks@123");
		
		Thread.sleep(2000);
		
		// Closing the application
		driver.close();
	}
}
