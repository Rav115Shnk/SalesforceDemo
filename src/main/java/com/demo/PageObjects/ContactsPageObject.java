package com.demo.PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class ContactsPageObject {

	@FindBy(how = How.XPATH, using = "//a/div[@title='New']")
	public static WebElement button_new_account;
	@FindBy(how = How.XPATH, using = "//span[text()='Salutation']/parent::span/parent::div//div/a[text()='--None--']")
	public static WebElement salutation;
	@FindBy(how = How.XPATH, using = "//div[@class='slds-form-element slds-hint-parent']//span[text()='First Name']//parent::label//parent::div/input")
	public static WebElement first_name;
	@FindBy(how = How.XPATH, using = "//div[@class='slds-form-element slds-hint-parent']//span[text()='Last Name']//parent::label//parent::div/input")
	public static WebElement last_name;
	@FindBy(how = How.XPATH, using = "//div//a[@class='datePicker-openIcon display']")
	public static WebElement date_of_birth;
	@FindBy(how = How.XPATH, using = "//div//button[text()='Today']")
	public static WebElement date_today;
	@FindBy(how = How.XPATH, using = "//div/button[@class='slds-button slds-button--neutral uiButton--brand uiButton forceActionButton']")
	public static WebElement button_save_contact;
	
	
}
