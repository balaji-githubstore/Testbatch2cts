package com.cts.openemrtest;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
public class OpenEmrTest {
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
		
		WebElement patEle= driver.findElement(By.xpath("//div[text()='Patient/Client']"));
	
		Actions actions=new Actions(driver);
		actions.moveToElement(patEle).build().perform();
			
		WebElement newSearchEle= 
				driver.findElement(By.xpath("//div[text()='New/Search']"));
		newSearchEle.click();
	
		
		driver.switchTo().frame(driver.findElement(By.xpath("//iframe[contains(@src,'new.php')]")));
		Thread.sleep(2000);
		driver.findElement(By.id("form_fname")).sendKeys("Bala");
		
		driver.findElement(By.id("form_lname")).sendKeys("hhhh");
	
		driver.findElement(By.id("form_DOB")).sendKeys("2020-02-24");
		
		Select selectGender=new Select(driver.findElement(By.id("form_sex")));
		selectGender.selectByVisibleText("Male");
		
		driver.findElement(By.id("create")).click();	
		driver.switchTo().defaultContent();

		
		WebDriverWait wait=new WebDriverWait(driver,60);
		
		wait.until
		(ExpectedConditions.
				frameToBeAvailableAndSwitchToIt(By.name("modalframe")));
		
		
		//driver.switchTo().frame("modalframe");
		
		
		
		
		driver.findElement(By.xpath("//input[@value='Confirm Create New Patient']")).click();
				
		driver.switchTo().defaultContent();
		
		//handling alert
	
		//Thread.sleep(10000);
		
		//add explicit wait until alert is present
		
		wait.until(ExpectedConditions.alertIsPresent());
		
		  Alert alertBox= driver.switchTo().alert();
		  
		  String alertText = alertBox.getText(); 
		  System.out.println(alertText);
		  
		  alertBox.accept();
		 
		  //happy birthday
		driver.findElement(By.xpath("//div[@class='closeDlgIframe']")).click();
		
		 driver.switchTo().frame("pat");
		 String actualText = driver.
					findElement
					(By.xpath("//h2[contains(text(),'Medical Record')]"))
					.getText();
					
					System.out.println(actualText);
					
					
		 driver.switchTo().defaultContent();
		  
		
	}
}
                                        







































