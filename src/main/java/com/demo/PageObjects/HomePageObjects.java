package com.demo.PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class HomePageObjects {

	
	@FindBy(how = How.XPATH, using = "//div[@class='slds-icon-waffle']")
	public static WebElement app_launcher;
	@FindBy(how = How.XPATH, using = "//button[text()='View All']")
	public static WebElement view_all;
	@FindBy(how = How.XPATH, using = "//div/input[starts-with(@id,'input')]")
	public static WebElement search_box;
	@FindBy(how = How.XPATH, using = "//img[@src='https://cgi-4d-dev-ed.my.salesforce.com/logos/Salesforce/SalesCloud/logo.png']")
	public static WebElement sales_app;
	@FindBy(how = How.XPATH, using = ".//a[@title='Accounts']")
	public static WebElement account_tab;
	@FindBy(how = How.XPATH, using = "//img[@title='User']")
	public static WebElement logout_icon;
	@FindBy(how = How.XPATH, using = "//a[text()='Log Out']")
	public static WebElement button_logout;
	
	
}
