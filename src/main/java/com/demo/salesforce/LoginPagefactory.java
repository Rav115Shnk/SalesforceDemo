package com.demo.salesforce;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.demo.PageObjects.LoginPageObjects;
import com.demo.baseClass.BaseTest;
import com.demo.helpers.Utils;

public class LoginPagefactory extends LoginPageObjects{

	WebDriver driver;
	
	public void loginApplication(String username,String password,WebDriver driver) throws Exception{
		
		driver.get("https://cgi-4d-dev-ed.lightning.force.com/");
		
		
		try {
			(new WebDriverWait(driver, 10)).until(new ExpectedCondition<Boolean>() {
				public Boolean apply(WebDriver d) {
					
					return uerName.isDisplayed();
				}
			});
			Utils.writeText(uerName, username);
		} catch (InterruptedException e) {
			
		}
		Utils.writeText(passWord, password);
		
		remember_me_checkbox.click();
		
		log_in_button.click();

	
	}
	
	
}
