package org.mma.mercury.tours.regression.suite;
/**
 *********************************************************************************************************   
 @author Rumana Rahman
 Test Name: User Registration
 Description: This test will validate the user Registration
 Reviewer name:
 Review Date:
 Comments:
 Creation Date:  2/25/2023               
 *********************************************************************************************************
 **/
import org.testng.annotations.Test;
import org.mma.mercury.tours.base.BaseClass;
import org.mma.mercury.tours.pages.MercuryToursLoginPage;
import org.mma.mercury.tours.pages.MercuryToursRegisterPage;
import org.openqa.selenium.support.PageFactory;

public class MercuryToursRegressionSuite extends BaseClass
{
	/**
	 *********************************************************************************************************   
	                     >>>>>>>> Test: Validate User Registration <<<<<<<<            
	 *********************************************************************************************************
	 **/
  @Test (priority=1, dataProvider="getRegisterPage")
  public void userRegistration(String userFirstName, String userLastName, String userPhoneNumber, 
		  String userEmailId, String userAddress, String userCity, String userState, String userPostalCode,
		  String userCountry, String userId, String userPasswd, String userConfirmPasswd) 
  {
	  MercuryToursRegisterPage mercuryToursRegisterPage = PageFactory.initElements(driver, MercuryToursRegisterPage.class);
	  mercuryToursRegisterPage.mercuryToursRegisterPageElementsAndMethods(userLastName, userFirstName, userPhoneNumber, 
			  userEmailId, userAddress, userCity, userState, userPostalCode, userCountry, 
			  userLastName, userPasswd, userConfirmPasswd);
	  
  }
  /**
	 *********************************************************************************************************   
	                     >>>>>>>> Test: Validate User Login <<<<<<<<            
	 *********************************************************************************************************
	 **/
@Test (priority=0, dataProvider="getLoginPage")
public void userLogin(String userId, String userPasswd)
{
	  MercuryToursLoginPage mercuryToursLoginPage = PageFactory.initElements(driver, MercuryToursLoginPage.class);
	  mercuryToursLoginPage.mercuryToursLoginPageElementsAndMethods(userId, userPasswd);
	  
}
   
  /**
   *********************************************************************************************************   
                                       End of the file                 
   *********************************************************************************************************
   **/
}
