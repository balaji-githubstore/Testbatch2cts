package com.cts.php;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PhpTest {
	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		driver.get("https://www.phptravels.net/home");
		
		driver.findElement(By.xpath("//a[@data-name='flights']")).click();
		
		driver.findElement(By.id("s2id_location_from")).click();
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("(//input[@class='select2-input'])[6]")).sendKeys("los");
	}
}




