package com.demo.PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import com.demo.baseClass.BaseTest;

public class LoginPageObjects extends BaseTest{


	@FindBy(how = How.XPATH, using = "//div/input[@class='input r4 wide mb16 mt8 username']")
	public static WebElement uerName;

	@FindBy(how = How.XPATH, using = "//input[@class='input r4 wide mb16 mt8 password']")
	public static WebElement passWord;
	
	@FindBy(how = How.XPATH, using = "//input[@class='button r4 wide primary']")
	public static WebElement log_in_button;
	
	@FindBy(how = How.XPATH, using = ".//input[@type='checkbox'][@class='r4 fl mr8']")
	public static WebElement remember_me_checkbox;
	
	
	
	
	
}
