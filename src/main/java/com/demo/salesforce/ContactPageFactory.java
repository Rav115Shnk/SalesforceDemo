package com.demo.salesforce;

import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.demo.PageObjects.ContactsPageObject;
import com.demo.helpers.Utils;

public class ContactPageFactory extends ContactsPageObject{

	public void createNewAccount(WebDriver driver) throws Exception
	{
		Robot robot=new Robot();
		JavascriptExecutor js=(JavascriptExecutor) driver;
		
		Utils.impliciteWait(5);
		(new WebDriverWait(driver, 10)).until(new ExpectedCondition<Boolean>() {
			public Boolean apply(WebDriver d) {
			
			return salutation.isDisplayed();
		}
		});
    //Enter salutation
	salutation.click();
	Utils.writeText(salutation, "Mr.");
	robot.keyPress(KeyEvent.VK_ENTER);
	
	//enter first name and last name
	Utils.writeText(first_name, "ravi");
	Utils.writeText(last_name, "shankar");
	
	//select date of birth
	
	date_of_birth.click();
	(new WebDriverWait(driver, 10)).until(new ExpectedCondition<Boolean>() {
		public Boolean apply(WebDriver d) {
		
		return date_today.isDisplayed();
	}
	});
	date_today.click();
	
	//click on save button
	
	button_save_contact.click();
	
	//Verify if record is created
	
	}
}
