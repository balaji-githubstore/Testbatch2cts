package com.cts.basics;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
//added
public class DragAndDropTest {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

//		driver.get("https://www.seleniumeasy.com/test/drag-and-drop-demo.html"); 
//		
//		
//		Actions act=new Actions(driver);
//		
//		WebElement from=driver.findElement(By.xpath("//span[text()='Draggable 1']"));
//				
//				WebElement to=driver.findElement(By.xpath("//div[@id='mydropzone']"));
//		
//		act.pause(5000)
//		.dragAndDrop(from, 
//				to)
//		.build().perform();
//		
		

		
		  driver.get("http://demo.guru99.com/test/drag_drop.html");
		  
		  // WebElement From=driver.findElement(By.xpath("//*[@id='credit2']/a"));
		  WebElement From = driver.findElement(By.partialLinkText("BANK"));
		  
		  WebElement To = driver.findElement(By.xpath("//*[@id='bank']/li"));
		  
		  Actions act = new Actions(driver);
		  
		  act.pause(20000).dragAndDrop(From, To).build().perform();
		 
	}
}
