package com.cts.cititbanktest;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ApplyForCreditCardTest {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		driver.get("https://www.online.citibank.co.in/products-services/online-services/internet-banking.htm");
				
		WebElement applyEle= driver.findElement(By.linkText("APPLY FOR CREDIT CARDS"));
		applyEle.click();
		
		Thread.sleep(5000);
		
		//driver.close(); // close the current session/ driver pointing tab
		//driver.quit(); //close all the sesssion and also kills that support file which is running in task manager

		String parent= driver.getWindowHandle();
		System.out.println(parent);

		System.out.println("-------------------------------");
		
		Set<String> windows= driver.getWindowHandles();
		
		for(String window : windows )
		{
			System.out.println(window);
			driver.switchTo().window(window);
			String title  = driver.getTitle();
			System.out.println(title);
			//gettitle
			if(title.equals("Credit Card Application Online, Apply Now - Citi India"))
			{
				break;
			}
		}
		
	   WebElement travelEle=driver.findElement(By.linkText("Travel"));
	   travelEle.click();
		//click on travel
		driver.close();
		
		driver.switchTo().window(parent);
		
		//get title
		String title  = driver.getTitle();
		System.out.println(title);
	}

}





























