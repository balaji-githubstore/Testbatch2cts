package com.cts.openemrtest;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ReportEMRTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		driver.get("https://demo.openemr.io/b/openemr/interface/login/login.php?site=default");
		
		WebElement userEle= driver.findElement(By.id("authUser"));
		userEle.sendKeys("admin");
		
		WebElement passEle= driver.findElement(By.id("clearPass"));
		passEle.sendKeys("pass");	
		passEle.submit();
		
		Actions actions=new Actions(driver);
		
		actions.
		moveToElement(driver.findElement(By.xpath("//div[text()='Reports']")))
		.pause(1000)
		.moveToElement(driver.findElement(By.xpath("//div[text()='Clients']")))
		.build().perform();
				
		
		driver.findElement(By.xpath("//div[text()='List']")).click();
		
		
		//click on log out
		actions.
		moveToElement(driver.findElement(By.xpath("//span[text()='Billy']"))).build().perform();	
		driver.findElement(By.xpath("//*[text()='Logout']")).click();
		
		
	}

}










