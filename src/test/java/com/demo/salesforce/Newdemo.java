package com.demo.salesforce;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.demo.baseClass.BaseTest;

public class Newdemo extends BaseTest{
	
	WebDriver driver;
	
	
	
	@BeforeSuite
	public void setup() throws Exception{
		
		driver=init();
		
		
	}
	
	@Test
	public void accountContactDemo() throws Throwable
	{
		
		 
		 LoginPagefactory login= PageFactory.initElements(driver,LoginPagefactory.class);
		
		login.loginApplication(Repository.getProperty("UserName"), Repository.getProperty("PassWord"),driver);
	
		 HomePageFactory home= PageFactory.initElements(driver,HomePageFactory.class);
			
		 home.launchSalesApp(driver);
		 
		 AccountPageFactory account= PageFactory.initElements(driver,AccountPageFactory.class);
		 account.createNewAccount(driver);
		 
		 ContactPageFactory contact= PageFactory.initElements(driver,ContactPageFactory.class);
			
		 contact.createNewAccount(driver);
		 home.logOut(driver);
		 
	}
	
	

}
