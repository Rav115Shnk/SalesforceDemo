package com.demo.PageObjects;

import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class AccountsPageObjects {
	
	
	@FindBy(how = How.XPATH, using = "//a/div[@title='New']")
	public static WebElement button_new_account;
	@FindBy(how = How.XPATH, using = "//div[@class='slds-form-element slds-hint-parent']//span[text()='Account Name']//parent::label//parent::div/input")
	public static WebElement account_name;
	@FindBy(how = How.XPATH, using = "//span[text()='Rating']/parent::span/parent::div//div/a/parent::div/a[text()='--None--']")
	public static WebElement rating;
	@FindBy(how = How.XPATH, using = "//span[text()='Type']/parent::span/parent::div//div/a/parent::div/a[text()='--None--']")
	public static WebElement type;
	@FindBy(how = How.XPATH, using = "//div/button[@class='slds-button slds-button--neutral uiButton--brand uiButton forceActionButton']")
	public static WebElement button_save;
	@FindBy(how = How.XPATH, using = "//body/div[4]/div[1]/section[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/one-record-home-flexipage2[1]/forcegenerated-adgrollup_component___forcegenerated__flexipage_recordpage___sfa__account_rec_l___account___view[1]/forcegenerated-flexipage_account_rec_l_account__view_js[1]/record_flexipage-record-page-decorator[1]/div[1]/slot[1]/flexipage-record-home-template-desktop2[1]/div[1]/div[2]/div[1]/slot[1]/slot[1]/flexipage-component2[1]/slot[1]/flexipage-tabset2[1]/div[1]/lightning-tabset[1]/div[1]/slot[1]/slot[1]/slot[1]/flexipage-tab2[1]/slot[1]/flexipage-component2[2]/slot[1]/flexipage-aura-wrapper[1]/div[1]/div[1]/div[1]/div[1]/article[1]/div[1]/div[1]/div[1]/ul[1]/li[1]/a[1]")
	public static WebElement button_contact_new;
}
