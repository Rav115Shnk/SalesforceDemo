package com.demo.salesforce;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.demo.PageObjects.AccountsPageObjects;
import com.demo.baseClass.BaseTest;
import com.demo.helpers.Utils;

public class AccountPageFactory extends AccountsPageObjects{
	
	

	public void createNewAccount(WebDriver driver) throws Exception
	{
		Robot robot=new Robot();
		JavascriptExecutor js=(JavascriptExecutor) driver;
		
		Utils.impliciteWait(5);
		(new WebDriverWait(driver, 10)).until(new ExpectedCondition<Boolean>() {
			public Boolean apply(WebDriver d) {
			
			return button_new_account.isDisplayed();
		}
		});
    //Enter Account name
	button_new_account.click();
	Utils.writeText(account_name, "test34");
	
	
	//select rating as "Warm"
	rating.click();
	Utils.writeText(rating, "Warm");
	robot.keyPress(KeyEvent.VK_ENTER);
	
	//select type as Prospect
	type.click();
	Utils.writeText(type, "Prospect");
	robot.keyPress(KeyEvent.VK_ENTER);
	
	//click on save button
	button_save.click();
	
	//click on new button under contact
	(new WebDriverWait(driver, 10)).until(new ExpectedCondition<Boolean>() {
		public Boolean apply(WebDriver d) {
		
		return button_contact_new.isEnabled();
	}
	});
	js.executeScript("arguments[0].click();",button_contact_new);
	

}
}