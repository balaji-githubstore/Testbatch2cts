package com.cts.upload;

import java.io.File;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class UploadTest {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
//		File file =new File("testdata/MagentoData.xlsx");
//		String fileDetail=file.getAbsolutePath();
//		System.out.println(fileDetail);
//		
//		WebDriver driver = new ChromeDriver();
//		driver.manage().window().maximize();
//		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
//		
//		driver.get("file:///D:/Mine/PythonCode/All%20Code/HTML-CSS1/Demo8Table.html"); 
//		
//		
//		driver.findElement(By.name("upload")).sendKeys(fileDetail);
		
		WebDriver driver = new ChromeDriver();
		JavascriptExecutor js= (JavascriptExecutor) driver;
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		//driver.get("https://magento.com/");
		driver.navigate().to("https://magento.com/"); //page load - infinte
		
		driver.findElement(By.linkText("My Account")).click();
		Thread.sleep(5000);
		
		String value = js.executeScript("return document.getElementById('email').value;").toString();
		System.out.println(value);
		
		String url = js.executeScript("return document.URL;").toString();
		System.out.println(url);
		
		
		Thread.sleep(5000);
		
		driver.navigate().back();
		
		Thread.sleep(5000);
		
		driver.navigate().forward();
		
		Thread.sleep(5000);
		
		driver.navigate().refresh();
		
		
		
		
		
		

	}

}







