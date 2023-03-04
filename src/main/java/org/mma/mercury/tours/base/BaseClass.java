package org.mma.mercury.tours.base;
import java.util.ArrayList;
import java.util.Iterator;

import org.mma.mercury.tours.data.driven.TestdataUtil;
/**
 *********************************************************************************************************   
 @author Rumana Rahman
 Class Name: Base Class
 Description: This class will store the pre-conditions and the post conditions of the Tests
 Reviewer name:
 Review Date:
 Comments:
 Creation Date: 2/11/2023                   
 *********************************************************************************************************
 **/
import org.mma.mercury.tours.util.BrowserFactory;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;

public class BaseClass 
{
	public WebDriver driver;
	public String browser = "Chrome";
	public String baseURL = "https://demo.guru99.com/test/newtours/";

	@BeforeClass
	public void startBrowser() {
		try {
			Thread.sleep(1000);
			driver = BrowserFactory.StartApplication(driver, browser, baseURL);
			System.out.println(">>>>>>>> Before Test: Validate the landing/home page <<<<<<<<");
			System.out.println("Validate the page title is: " +driver.getTitle());
			Assert.assertEquals(driver.getTitle(), "Welcome: Mercury Tours");
			Thread.sleep(1000);
		} catch (Exception e) {
			System.out.println("[Not able to navigate to the landing/home page "+e.getMessage());
		}
	} 		
	@AfterClass
	public void closeBrowser() {
		try {
			Thread.sleep(1000);
			System.out.println(">>>>>>>> After Test: Closing the browser <<<<<<<<");
			BrowserFactory.closeBrowser(driver);
			Thread.sleep(1000);
		} catch (Exception e) {
			System.out.println("Not able to close the browser "+e.getMessage());
		}
	}
	@DataProvider
	public Iterator<Object[]> getRegisterPage(){
		ArrayList<Object[]> testdata = TestdataUtil.getRegisterPage();
		return testdata.iterator();	
	}
	
	/**
	 *********************************************************************************************************   
                                                End of the File
	 *********************************************************************************************************
	 **/	



}
