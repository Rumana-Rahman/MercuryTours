package org.mma.mercury.tours.util;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

/**
 *********************************************************************************************************   
 @author Rumana Rahman
 Class Name: Base Class
 Description: This class will store the browsers of the Tests
 Reviewer name:
 Review Date:
 Comments:
 Creation Date: 2/11/2023                   
 *********************************************************************************************************
 **/
public class BrowserFactory {
	public static WebDriver StartApplication (WebDriver driver, String browserName, String appURL) {
		if (browserName.equals("Chrome"))
		{
			ChromeOptions opt = new ChromeOptions();

		    opt.addArguments("--remote-allow-origins=*");
		    driver = new ChromeDriver(opt);
			
		}
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get(appURL);
		return driver;
	}
	
	public static void closeBrowser(WebDriver driver) {
		driver.quit();
	}
	
	
	}
	


