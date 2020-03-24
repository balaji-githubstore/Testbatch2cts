package com.cts.datatable;

import java.io.File;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class DataTableDemo {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);	
		driver.get("https://datatables.net/extensions/select/examples/initialisation/checkbox.html");
		
		TakesScreenshot ts= (TakesScreenshot) driver;
		File file=  ts.getScreenshotAs(OutputType.FILE);
		file.renameTo(new File("image.png"));
		
		List<WebElement> rowsEle= driver.findElements(By.xpath("//table[@id='example']/tbody/tr"));
		int rowCount = rowsEle.size();
		
		
		for(int i=1;i<=rowCount;i++)
		{
			//System.out.println("//table[@id='example']/tbody/tr["+i+"]/td[2]");
		
			WebElement name1Ele= 
					driver.findElement
					(By.xpath("//table[@id='example']/tbody/tr["+i+"]/td[6]"));
			String name1 = name1Ele.getText();
			System.out.println(name1);
		}
		
		
		
		
		
	}
}




