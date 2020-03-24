package com.cts.magentotest;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LinksTest {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		driver.get("https://magento.com/"); // default page load time is 60 sec

		List<WebElement> linksEle = driver.findElements(By.tagName("a"));
		
		int linkCount = linksEle.size();
		System.out.println(linkCount);
		
//		for(int i=0;i<linkCount;i++)
//		{
//			WebElement ele = linksEle.get(i);		
//			String href= ele.getAttribute("href");
//			System.out.println(href);	
//			String text= ele.getText();
//			System.out.println(text);
//			
//			if(text.trim().equals("Products"))
//			{
//				ele.click();
//				break;
//			}	
//		}
		
		//use advance for loop ---> click on Solutions
		/*
		 * String names[] = {"King","Queen","Jack"};
		 * 
		 * for(String name: names) { System.out.println(name); }
		 */
		
		
		for(WebElement ele  : linksEle)
		{
			String href= ele.getAttribute("href");
			System.out.println(href);	
			String text= ele.getText();
			System.out.println(text);	
			if(text.trim().equals("Products"))
			{
				ele.click();
				break;
			}
		}
	}
}













