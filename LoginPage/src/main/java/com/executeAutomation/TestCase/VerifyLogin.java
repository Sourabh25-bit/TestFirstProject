package com.executeAutomation.TestCase;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;
import com.executeAutomation.Pages.HomePages;
import com.executeAutomation.Pages.LoginPage;

public class VerifyLogin {
	WebDriver driver;
	@Test(priority=1)
	public void VerifyLoginp() throws IOException, InterruptedException
	{
		System.setProperty("webdriver.chrome.driver","D:\\Driver\\chromedriver_win32\\chromedriver.exe");
		ChromeOptions op = new ChromeOptions();
		op.addArguments("incognito");
		driver = new ChromeDriver(op);
		driver.manage().window().maximize();
		driver.get("https://demosite.executeautomation.com/Login.html");
		
		LoginPage lp = new LoginPage(driver);
		lp.typeUsername();
		lp.typeUsername();
		lp.typePassword();
		lp.loginButton();
		lp.screenShot();
		
	}
	
	@Test(priority=2)
	public void VerifyHomep() throws InterruptedException, IOException
	{		
		HomePages hp = new HomePages(driver);
		hp.dropdown();
		hp.fName();
		hp.mdName();
		hp.language1();
		hp.language();
		hp.screenShot();
		hp.tearDown();
	}


}
