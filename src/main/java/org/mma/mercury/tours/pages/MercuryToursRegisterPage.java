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
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class MercuryToursRegisterPage {
	public WebDriver driver;
	public MercuryToursRegisterPage(WebDriver driver) {
		this.driver = driver;
	}
	
	/**
	 *********************************************************************************************************   
	                  Web elements - Mercury Tours Register page                   
	 *********************************************************************************************************
	 **/
	@FindBy(linkText="REGISTER") WebElement registerHyperlink;
	@FindBy(name="firstName") WebElement firstNameInput;
	@FindBy(name="lastName") WebElement lastNameInput;
	@FindBy(name="phone") WebElement phoneNumberInput;
	@FindBy(name="userName") WebElement emailIdInput;
	@FindBy(name="address1") WebElement addressInput;
	@FindBy(name="city") WebElement cityNameInput;
	@FindBy(name="state") WebElement stateNameInput;
	@FindBy(name="postalCode") WebElement postalCodeInput;
	@FindBy(name="country") WebElement countryDrp;
	@FindBy(name="email") WebElement userNameInput;
	@FindBy(name="password") WebElement passwordInput;
	@FindBy(name="confirmPassword") WebElement confirmPasswordInput;
	@FindBy(name="submit") WebElement submitBtn;
	@FindBy(xpath="//*[contains(text(),' Note: Your user name is jojobean.')]") 
	WebElement registerConfirmationMessage;	
	
	/**
	 *********************************************************************************************************   
	                 Methods - Mercury Tours Register page                   
	 *********************************************************************************************************
	 **/
  @Test
  public void mercuryToursRegisterPageElementsAndMethods(String fName, String lname, 
		  String uPhone, String uEmail, String uAddress, String uCity, String uState,
		  String pCode, String uCountry, String uName, String uPass, String uConfirmPass) {
	 try
	 {
		Thread.sleep(2000); 
		System.out.println(">>>>>>>> Test: Validate User Registration <<<<<<<<");
		registerHyperlink.click();
		Thread.sleep(2000); 
		firstNameInput.sendKeys(fName);
		Thread.sleep(2000); 
		lastNameInput.sendKeys(lname);
		Thread.sleep(2000); 
		phoneNumberInput.sendKeys(uPhone);
		Thread.sleep(2000); 
		emailIdInput.sendKeys(uEmail);
		Thread.sleep(2000); 
		addressInput.sendKeys(uAddress);
		Thread.sleep(2000); 
		cityNameInput.sendKeys(uCity);
		Thread.sleep(2000); 
		stateNameInput.sendKeys(uState);
		Thread.sleep(2000); 
		postalCodeInput.sendKeys(pCode);
		Thread.sleep(2000); 
		Select selectCountry = new Select(countryDrp);
		selectCountry.selectByVisibleText(uCountry);;
		Thread.sleep(2000); 
		userNameInput.sendKeys(uName);
		Thread.sleep(2000); 
		passwordInput.sendKeys(uPass);
		Thread.sleep(2000); 
		confirmPasswordInput.sendKeys(uConfirmPass);
		Thread.sleep(2000); 
		submitBtn.click();
		
		Utility.captureScreenShot(driver, "MercuryToursRegisterPage"); // Will capture the screenshot
		Thread.sleep(2000); 
	 } catch (Exception e) {
		 System.out.println("Not able to register "+e.getMessage());
	 }

  }
  /**
   *********************************************************************************************************   
                                       End of the file                 
   *********************************************************************************************************
   **/
}
