package com.simplilearn;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutomateWebAppRegistration {

	public static void main(String[] args) throws InterruptedException {

		// Opening the Chrome Browser
		WebDriver driver = new ChromeDriver();
		Thread.sleep(2000);

		// Maximizing the window of the browser
		driver.manage().window().maximize();
		Thread.sleep(2000);

		driver.get("http://automationpractice.com/index.php");
		Thread.sleep(2000);

		driver.findElement(By.className("login")).click();
		Thread.sleep(2000);

		driver.findElement(By.id("email_create")).sendKeys("TomHanks@gmail.com");
		Thread.sleep(2000);

		driver.findElement(By.id("SubmitCreate")).click();
		Thread.sleep(2000);

		driver.findElement(By.id("customer_firstname")).sendKeys("Tom");
		driver.findElement(By.id("customer_lastname")).sendKeys("Hanks");
		Thread.sleep(2000);

		driver.findElement(By.id("passwd")).sendKeys("TomHanks@123");

		driver.findElement(By.id("firstname")).sendKeys("Tom");
		driver.findElement(By.id("lastname")).sendKeys("Hanks");
		Thread.sleep(2000);
		driver.findElement(By.id("address1")).sendKeys("#12 1st main, dollars colony");
		driver.findElement(By.id("city")).sendKeys("Bangalore");

		Thread.sleep(2000);
		driver.findElement(By.id("id_state")).click();

		WebElement state = driver.findElement(By.id("id_state"));
		state.findElement(By.xpath("//option[. = 'California']")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("postcode")).sendKeys("90202");
		driver.findElement(By.id("phone_mobile")).sendKeys("9834571232");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@value='My address']")).sendKeys("Bangalore");
		Thread.sleep(2000);
		
		driver.close();
	}
}
