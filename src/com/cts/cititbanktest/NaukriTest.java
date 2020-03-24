package com.cts.cititbanktest;

import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class NaukriTest {
	
	
	public static void switchTab(WebDriver driver,String expectedTitle)
	{
		Set<String> windows = driver.getWindowHandles();

		for (String win : windows) {
			System.out.println(win);
			driver.switchTo().window(win);

			String title = driver.getTitle();
			System.out.println(title.trim());
			if (title.trim().equals(expectedTitle)) 
			{
				break;
			}
		}
	}
	

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		driver.get("https://www.naukri.com");

		driver.findElement(By.xpath("//*[text()='Jobs']")).click();

		String parent = driver.getWindowHandle();
		System.out.println(parent);

		Thread.sleep(5000);

		NaukriTest.switchTab(driver, "Browse Jobs by Company, Location, Skills, Designation & Industry - Naukri.com");


		driver.findElement(By.name("qp")).sendKeys("selenium");
		driver.findElement(By.name("ql")).sendKeys("selenium");
		driver.findElement(By.id("qsbFormBtn")).click();
		
		
	   WebElement elePost=driver.findElement(By.xpath("//a[@id='jdUrl']"));
	   String post = elePost.getText();
	   System.out.println(post);
		
	   
	   List<WebElement> listsOfEle= driver.findElements(By.xpath("//a[@id='jdUrl']"));
	   
//	   WebElement ele0= listsOfEle.get(0);	   
	   
	   
	   int totalPost = listsOfEle.size();
	   
	   for(WebElement ele : listsOfEle)
	   {
		  String text =  ele.getText();
		  System.out.println(text);
	   }
	   
		// driver.close();

	}

}



