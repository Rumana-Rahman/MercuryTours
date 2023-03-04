	
	package org.mma.mercury.tours.pages;
	import org.mma.mercury.tours.util.Utility;
/**
	 *********************************************************************************************************   
	 @author Rumana Rahman
	 Class Name: 
	 Description: 
	 Reviewer name:
	 Review Date:
	 Comments:
	 Creation Date: 2/11/2023                   
	 *********************************************************************************************************
	 **/
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.support.FindBy;
import org.testng.Assert;
import org.testng.annotations.Test;

	public class MercuryToursLoginPage {
		public WebDriver driver;
		public MercuryToursLoginPage(WebDriver driver) {
			this.driver = driver;
		}
		
		/**
		 *********************************************************************************************************   
		                  Web elements - Mercury Tours Login page                   
		 *********************************************************************************************************
		 **/
		
		@FindBy(name="userName") WebElement userNameInput;
		@FindBy(name="password") WebElement passwordInput;
		@FindBy(name="submit") WebElement submitBtn;
		@FindBy(xpath="//*[contains(text(),'Login Successfully')]") 
		WebElement loginConfirmationMessage;	
		
		/**
		 *********************************************************************************************************   
		                 Methods - Mercury Tours Login page                   
		 *********************************************************************************************************
		 **/
	  @Test
	  public void mercuryToursLoginPageElementsAndMethods(String uName, String uPass) {
		 try
		 {
			Thread.sleep(2000); // wait statement
			System.out.println(">>>>>>>> Test: Validate User Login <<<<<<<<");
			userNameInput.sendKeys(uName); // Enter the valid username
			Thread.sleep(2000); // wait statement
			passwordInput.sendKeys(uPass);// Enter the valid password
			Thread.sleep(2000);  // wait statement 
			submitBtn.click(); // Click the 'submit'button
			Thread.sleep(2000);  // wait statement
			Utility.captureScreenShot(driver, "MercuryToursLoginPage"); // Will capture the screenshot
			// Print the confirmation message
			System.out.println("Validate that the confirmation message is:--->"+loginConfirmationMessage.getText());
			// Validate the confirmation message
			Assert.assertTrue(loginConfirmationMessage.isDisplayed(), "Unable to log into the sysytem");
			Thread.sleep(2000); // wait statement			
		 } catch (Exception e) {
			 System.out.println("Not able to login "+e.getMessage());
		 }

	  }
	  /**
	   *********************************************************************************************************   
	                                       End of the file                 
	   *********************************************************************************************************
	   **/
	}
