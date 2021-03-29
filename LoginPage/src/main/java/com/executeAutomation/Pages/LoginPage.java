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

public class LoginPage {
	WebDriver driver;
	
	By username=By.name("UserName");
	By password=By.name("Password");
	By loginBtn=By.xpath("//form/p[3]/input");
	
	public LoginPage(WebDriver driver)
	{
		this.driver=driver;		
	}
	
	public void typeUsername()
	{
		driver.findElement(username).sendKeys("Sourabh");
	}
	
	public void typePassword()
	{
		driver.findElement(password).sendKeys("12345");
	}
	
	public void loginButton()
	{
		driver.findElement(loginBtn).click();
	}
	
	public void screenShot() throws IOException, InterruptedException {
	    File scr = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	    String filename =  new SimpleDateFormat("yyyyMMddhhmmss'.txt'").format(new Date());
	    File dest = new File("C:\\Users\\lenovo\\Desktop\\ScrShot" + filename);
	    FileHandler.copy(scr, dest);
	    
	}

}
