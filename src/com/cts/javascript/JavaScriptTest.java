package com.cts.javascript;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class JavaScriptTest {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		driver.get("https://www.amazon.in/");
		
		//WebElement userEle= driver.findElement(By.id("authUser"));
//		userEle.sendKeys("admin");
		
		JavascriptExecutor js= (JavascriptExecutor) driver;
		
		for(int i=1;i<=10;i++)
		{
			js.executeScript("window.scrollBy(0,500);");
		}
		
		
		
		String value = js.executeScript("return document.getElementById('email').value;").toString();
		System.out.println(value);
		
		String url = js.executeAsyncScript("return document.URL;").toString();
		System.out.println(url);
		
		
		//js.executeScript("document.getElementById('authUser').value='admin'");
//		js.executeScript("arguments[0].value='hello'", userEle);
		
		//js.executeScript("document.querySelector('#authUser').value='jjja'");
		
		//document.getElementById('authUser').value='admin'
		
		//WebElement passEle= driver.findElement(By.id("clearPass"));
		//passEle.sendKeys("pass");	
		//passEle.submit();
		
		//Thread.sleep(5000);
		
//		WebElement logOutEle=	driver.findElement(By.xpath("//*[text()='Logout']"));
//		
//		js.executeScript("arguments[0].click();", logOutEle);
		
		
		
		
		
		
	}
}





