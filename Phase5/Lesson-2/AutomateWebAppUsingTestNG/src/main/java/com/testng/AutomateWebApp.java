package com.testng;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class AutomateWebApp 
{
	WebDriver driver;

	@Test
	public void registration() throws InterruptedException 
	{
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://automationpractice.com/index.php");
		
		// Testing Registration Form
		driver.findElement(By.xpath("//*[@id='header']/div[2]/div/div/nav/div[1]/a")).click();
		driver.findElement(By.xpath("//*[@id='email_create']")).sendKeys("TomJerry@gmail.com");
		driver.findElement(By.xpath("//*[@id='SubmitCreate']")).click();
		Thread.sleep(6000);
		driver.findElement(By.xpath("//*[@id='customer_firstname']")).sendKeys("Tom");
		driver.findElement(By.xpath("//*[@id='customer_lastname']")).sendKeys("Jerry");
		driver.findElement(By.xpath("//*[@id='passwd']")).sendKeys("TomJerry@123");
		
		driver.findElement(By.xpath("//*[@id='firstname']")).sendKeys("Tom");
		driver.findElement(By.xpath("//*[@id='lastname']")).sendKeys("Jerry");
		driver.findElement(By.xpath("//*[@id='address1']")).sendKeys("#12 1st main, dollars colony");
		driver.findElement(By.xpath("//*[@id='city']")).sendKeys("Bangalore");
		driver.findElement(By.xpath("//*[@id='id_state']/option[6]")).click();
		driver.findElement(By.xpath("//*[@id='postcode']")).sendKeys("90202");
		driver.findElement(By.xpath("//*[@id='phone_mobile']")).sendKeys("9020234344");
		driver.findElement(By.xpath("//*[@id='alias']")).sendKeys("Bangalore");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"submitAccount\"]")).click();
		Thread.sleep(2000);
		driver.close();
	}
	
	@Test(dependsOnMethods = {"registration"})
	public void login() throws InterruptedException
	{
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://automationpractice.com/index.php");
		
		// Testing Login
		driver.findElement(By.xpath("//*[@id='header']/div[2]/div/div/nav/div[1]/a")).click();
		driver.findElement(By.xpath("//*[@id='email']")).sendKeys("TomJerry@gmail.com");
		driver.findElement(By.xpath("//*[@id='passwd']")).sendKeys("TomJerry@123");
		driver.findElement(By.xpath("//*[@id='SubmitLogin']")).click();
		
		
		// Testing Search Box
		driver.findElement(By.xpath("//*[@id='search_query_top']")).sendKeys("Printed Dress");
		driver.findElement(By.xpath("//*[@id='searchbox']/button")).click();
		Thread.sleep(2000);
		
		// Testing Add to Cart
		driver.findElement(By.xpath("//*[@id='center_column']/ul/li[1]/div/div[2]/div[2]/a[1]/span")).click();
		
		driver.quit();
	}

}






