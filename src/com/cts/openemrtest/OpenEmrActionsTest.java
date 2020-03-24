package com.cts.openemrtest;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class OpenEmrActionsTest {
	public static void main(String[] args) throws InterruptedException {	
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		driver.get("https://demo.openemr.io/b/openemr/interface/login/login.php?site=default");
		
		WebElement userEle= driver.findElement(By.id("authUser"));
		userEle.sendKeys("admin");
		
		WebElement passEle= driver.findElement(By.id("clearPass"));
		passEle.sendKeys("pass");	
		passEle.submit();
		
		WebElement patEle= driver.findElement(By.xpath("//div[text()='Reports']"));
	
		Actions actions=new Actions(driver);
		actions.moveToElement(patEle).pause(2000)
		.moveToElement(driver.findElement(By.xpath("//div[text()='Clients']"))).build().perform();
			
		WebElement newSearchEle= 
				driver.findElement(By.xpath("//div[text()='List']"));
		//newSearchEle.click();
	
		actions.dragAndDrop(driver.findElement(By.xpath("")), driver.findElement(By.xpath("")))
		.build().perform();
		
		actions.contextClick();
		
		
	}
}
                                                                                                         

































