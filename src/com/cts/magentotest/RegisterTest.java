package com.cts.magentotest;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class RegisterTest {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		driver.get("https://magento.com/"); // default page load time is 60 sec

		WebElement myAccIconEle = driver
				.findElement(By.xpath("//a[@data-adobe-name='Header|GlobalNav|MyAccountClick']"));
		myAccIconEle.click();

		WebElement registerEle = driver.findElement(By.xpath("//span[text()='Register']"));
		registerEle.click();

		WebElement countryEle = driver.findElement(By.id("country"));
		Select selectCountry = new Select(countryEle);
		
		selectCountry.selectByVisibleText("Australia");
		//selectCountry.selectByValue("AL");	
		//selectCountry.selectByIndex(0);
		
		
		 WebElement checkEle= driver.findElement(By.id("agree_terms"));
		
//		 boolean check= checkEle.isSelected();
//		 System.out.println(check);
		 
		 if(!checkEle.isSelected())
		 {
			 checkEle.click();
		 }

		 
		 
		 
	}

}


















