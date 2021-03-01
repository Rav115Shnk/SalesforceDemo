package com.demo.baseClass;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeTest;

import com.demo.helpers.Utils;
import com.demo.salesforce.LoginPagefactory;

public class BaseTest extends Utils{

	public static Properties Repository = new Properties();
	
	public File f;
	public FileInputStream FI;

	
	
	
	public WebDriver init() throws Exception {

		loadPropertiesFile();
		driver= selectBrowser(Repository.getProperty("browser"));
		return driver;
	}
	
		
	public void loadPropertiesFile() throws IOException {
		f = new File("./Configuration/config.properties");
		FI = new FileInputStream(f);
		Repository.load(FI);

	}	
	
	

	// Get the Chrome Path
	public static String getChromePath() {
		String chromepath = Repository.getProperty("chromepath");
		return chromepath;
	}
	
	
	

		
	}

