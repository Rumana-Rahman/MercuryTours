	
	package org.mma.mercury.tours.pages;
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
	import org.testng.annotations.Test;

	public class MercuryToursLoginPage {
		public WebDriver driver;
		public MercuryToursLoginPage(WebDriver driver) {
			this.driver = driver;
		}
		
		/**
		 *********************************************************************************************************   
		                  Web elements - Mercury Tours Register page                   
		 *********************************************************************************************************
		 **/
		
		@FindBy(name="userName") WebElement userNameInput;
		@FindBy(name="password") WebElement passwordInput;
		@FindBy(name="submit") WebElement submitBtn;
		@FindBy(xpath="//*[contains(text(),'Login Successfully')]") 
		WebElement loginConfirmationMessage;	
		
		/**
		 *********************************************************************************************************   
		                 Methods - Mercury Tours Register page                   
		 *********************************************************************************************************
		 **/
	  @Test
	  public void mercuryToursLoginPageElementsAndMethods(String uName, String uPass) {
		 try
		 {
			Thread.sleep(2000); 
			System.out.println(">>>>>>>> Test: Validate User Login <<<<<<<<");
			userNameInput.sendKeys(uName);
			Thread.sleep(2000); 
			passwordInput.sendKeys(uPass);
			Thread.sleep(2000);  
			submitBtn.click();
			Thread.sleep(2000); 
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
