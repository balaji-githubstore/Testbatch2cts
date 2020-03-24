package com.cts.hdfctest;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HdfcLoginTest {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		driver.get("https://netbanking.hdfcbank.com/netbanking/"); 
		//username
		
		driver.switchTo().frame("login_page");
		
		WebElement userEle= driver.findElement(By.name("fldLoginUserId"));
		userEle.sendKeys("Test123");
		
		WebElement conEle= driver.findElement(By.xpath("//img[@alt='continue']"));
		String imgSrc = conEle.getAttribute("src");
		System.out.println(imgSrc);
		conEle.click();
	
		//swith out of frame - main html
		driver.switchTo().defaultContent();
	}
}












