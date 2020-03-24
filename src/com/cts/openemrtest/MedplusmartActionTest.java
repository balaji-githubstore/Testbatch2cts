package com.cts.openemrtest;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class MedplusmartActionTest {
	public static void main(String[] args) throws InterruptedException {	
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		driver.get("https://www.medplusmart.com/");
		
		WebElement patEle= driver.findElement(By.xpath("(//a[text()='Health Store'])[2]"));
	
		Actions actions=new Actions(driver);
		actions.moveToElement(patEle).pause(2000)
		.moveToElement(driver.findElement(By.xpath("//a[text()='Household Needs']"))).build().perform();
			
		//Thread.sleep(5000);
		WebElement newSearchEle= 
				driver.findElement(By.xpath("//a[text()='Biscuits & Cookies']"));
		newSearchEle.click();
	
		
		
		
	}
}
                                                                                                         

































