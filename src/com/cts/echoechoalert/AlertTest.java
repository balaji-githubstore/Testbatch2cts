package com.cts.echoechoalert;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class AlertTest {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		driver.get("http://www.echoecho.com/javascript4.htm");
	
		driver.findElement(By.name("B3")).click();
		
		Alert alertBox= driver.switchTo().alert();
		
		String alertText = alertBox.getText();
		System.out.println(alertText);
		
		alertBox.sendKeys("hello");
		
		Thread.sleep(5000);
		alertBox.dismiss();
		
	}

}







