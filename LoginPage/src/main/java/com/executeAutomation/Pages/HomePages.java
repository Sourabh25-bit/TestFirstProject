package com.executeAutomation.Pages;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.Select;

public class HomePages {
	WebDriver driver;
			
	By drop=By.xpath("//form[@id='details']/descendant::select");
	By fistname=By.id("FirstName");
	By midName=By.id("MiddleName");
	By lang=By.xpath("//form[@id='details']/descendant::input[7]");
	By lang1=By.xpath("//form[@id='details']/descendant::input[6]");
	
	public HomePages(WebDriver driver)
	{
		this.driver=driver;
	}
	
	public void dropdown()
	{
		Select dropd=new Select(driver.findElement(drop));
		dropd.selectByVisibleText("Ms.");
	}
	
	public void fName()
	{
		driver.findElement(fistname).sendKeys("Anil");
	}
	
	public void mdName()
	{
		driver.findElement(midName).sendKeys("Ram");
	}
	public void language1()
	{
		driver.findElement(lang1).click();
	}
	public void language()
	{
		driver.findElement(lang).click();
	}
	public void screenShot() throws IOException, InterruptedException {
	    File scr = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	    String filename =  new SimpleDateFormat("yyyyMMddhhmmss'.txt'").format(new Date());
	    File dest = new File("C:\\Users\\lenovo\\Desktop\\ScrShot" + filename);
	    FileHandler.copy(scr, dest);
	    
	}
	public void tearDown() throws InterruptedException {
		Thread.sleep(2000);
		driver.close();
	}

}
