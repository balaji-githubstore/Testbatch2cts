package com.cts.microsofttest;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SignInTest {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		driver.get("https://www.microsoft.com/"); // default page load time is 60 sec

		WebElement loginIconEle= driver.findElement(By.id("mectrl_headerPicture"));
		loginIconEle.click();
		
		//username
		WebElement userEle= driver.findElement(By.name("loginfmt"));
		userEle.sendKeys("vinoth@gmail.com");
		
		WebElement nextEle=  driver.findElement(By.xpath("//input[@value='Next']"));
		nextEle.click();
		
	
		WebElement passEle= driver.findElement(By.name("passwd"));
		passEle.sendKeys("Heloo1232");
		
		Thread.sleep(5000);
		
		WebElement submitEle=  driver.findElement(By.xpath("//input[@type='submit']"));
		submitEle.click();
		
		
		 WebElement errorEle= driver.findElement(By.xpath("//div[contains(text(),'tried')]"));
		 String acutalErrorText= errorEle.getText();
		 
		 System.out.println(acutalErrorText);
		 
	}

}





