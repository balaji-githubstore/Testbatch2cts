package com.cts.basics;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		driver.get("https://magento.com/"); // default page load time is 60 sec

		WebElement myAccEle = driver.findElement(By.linkText("My Account"));
		myAccEle.click();
		WebElement emailEle=driver.findElement(By.id("email"));
		emailEle.sendKeys("balaji0017@gmail.com");
		
		emailEle.clear();
		emailEle.sendKeys("balaji0017@gmail.com");
		
		WebElement passEle= driver.findElement(By.name("login[password]"));
		passEle.sendKeys("welcome@123");
		
		WebElement loginEle= driver.findElement(By.xpath("//span[text()='Login']"));
		loginEle.click();
		
		//wait until Log Out present
		WebDriverWait wait =new WebDriverWait(driver,60);
		
		wait.until(ExpectedConditions.
				presenceOfElementLocated(By.linkText("Log Out")));
		
		String actualTitle =driver.getTitle();
		System.out.println(actualTitle);
		
		String expectedTitle ="My Account";
		
		if(expectedTitle.equals(actualTitle))
		{
			System.out.println("Test Passed");
		}
		else
		{
			System.out.println("failed");
		}
		
		
		String pageSource =   driver.getPageSource();
		
		
		if(pageSource.toLowerCase().contains("log out"))
		{
			System.out.println("pagesource contains");
		}
		else
		{
			System.out.println("pagesource not contains log out");
		}
		
		
		
		
		
		//logout
		
		WebElement logOutEle= driver.findElement(By.partialLinkText("Out"));
		logOutEle.click();
	}

}
