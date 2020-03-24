package com.cts.moneycontroltest;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class MoneyControlTest {

	public static void main(String[] args) {
		
		WebDriver driver =new ChromeDriver();	
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		//driver.manage().timeouts().pageLoadTimeout(120,TimeUnit.SECONDS);
		
		
		driver.get("https://www.moneycontrol.com/"); //default page load time is 60 sec
		
		driver.findElement(By.xpath("//a[@title='Log In']")).click();
		
		driver.switchTo().frame("myframe");
		
		//driver.findElement(By.xpath("//input[@placeholder='Email or Mobile Number or User ID']")).sendKeys("Hello");
		driver.findElement(By.xpath("(//input[@id='email'])[2]")).sendKeys("Hello");

		driver.findElement(By.xpath("(//input[@id='email'])[2]")).sendKeys("Hello");
		driver.findElement(By.xpath("(//input[@id='pwd'])[2]")).sendKeys("Hello");

	}

}
