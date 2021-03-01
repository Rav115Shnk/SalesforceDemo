package com.demo.salesforce;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.demo.PageObjects.HomePageObjects;
import com.demo.helpers.Utils;

public class HomePageFactory extends HomePageObjects{

	public void launchSalesApp(WebDriver driver) throws Exception{
		JavascriptExecutor js=(JavascriptExecutor) driver;
		
		Utils.impliciteWait(5);
		(new WebDriverWait(driver, 10)).until(new ExpectedCondition<Boolean>() {
			public Boolean apply(WebDriver d) {
				
				return app_launcher.isDisplayed();
			}
		});
		app_launcher.click();
		view_all.click();
		
		Utils.writeText(search_box, "Sales");
		
		//
		(new WebDriverWait(driver, 10)).until(new ExpectedCondition<Boolean>() {
			public Boolean apply(WebDriver d) {
				
				return sales_app.isEnabled();
			}
		});
		sales_app.click();
		
		(new WebDriverWait(driver, 20)).until(new ExpectedCondition<Boolean>() {
			public Boolean apply(WebDriver d) {
				
				return account_tab.isDisplayed();
			}
		});
		//account_tab.click();
		js.executeScript("arguments[0].click();", account_tab);
	
	}
	
	public void logOut(WebDriver driver)
	{
		
		driver.quit();
	}
}
