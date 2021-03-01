package com.demo.helpers;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.InvalidElementStateException;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.demo.salesforce.*;


import com.demo.baseClass.BaseTest;

public class Utils {

	
public static WebDriver driver;
public static WebDriverWait wait;
	

public static WebDriver selectBrowser(String browser) throws Exception {
		
	
	 if (browser.equals("chrome") || browser.equals("CHROME")) {
	
	 System.setProperty("webdriver.chrome.driver",BaseTest.getChromePath());
	 }
	
	 ChromeOptions options = new ChromeOptions();
	  options.addArguments("--disable-notifications");
	 
			 WebDriver driver=new ChromeDriver(options);
			 
			driver.manage().deleteAllCookies();
			driver.manage().window().maximize();
		
	
			
			return driver;
		
	}

     
	public static void impliciteWait(int timeinsec) {
		try
		{
			driver.manage().timeouts().implicitlyWait(timeinsec, TimeUnit.SECONDS);
		}
		catch(Throwable error)
		{
			
		}
	
	
	}
	public static void writeText(WebElement element, String text) throws Exception
	{

		if (!text.isEmpty() && !(text.equalsIgnoreCase("null"))) 
		{

			wait = new WebDriverWait(driver, 30);
			wait.until(ExpectedConditions.visibilityOf((element)));
	
			element.sendKeys(text);
		}
		
		
		


		
		}

	
	
}
