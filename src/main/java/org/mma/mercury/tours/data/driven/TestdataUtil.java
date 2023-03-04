package org.mma.mercury.tours.data.driven;
/**
 *********************************************************************************************************   
 @author Rumana Rahman
 Class Name:TestdataUtil
 Description: 
 Reviewer name:
 Review Date:
 Comments:
 Creation Date: 2/11/2023                   
 *********************************************************************************************************
 **/
import java.util.ArrayList;

import org.mma.mercury.tours.util.ExcelReader;

public class TestdataUtil {
	static ExcelReader reader;
	/**
	 *********************************************************************************************************   
	 >>>>>>>>>>>>>>>>>>>>>>>>>>> Test: Validate User Registration <<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<            
	 *********************************************************************************************************
	 **/
	public static ArrayList<Object[]> getRegisterPage() {
		ArrayList<Object[]> myData = new ArrayList<Object[]>();
		try {
			reader = new ExcelReader("./TestData/testdata.xlsx");

		}catch (Exception e) {

			e.printStackTrace(); 
		}
		for (int rowCnt = 2; rowCnt <= reader.getRowCount("RegisterPage"); rowCnt++) {    

			String userFirstName = reader.getCellData("RegisterPage", "FirstName", rowCnt);

			String userLastName = reader.getCellData("RegisterPage", "LastName", rowCnt); 

			String userPhoneNumber = reader.getCellData("RegisterPage", "PhoneNumber", rowCnt);

			String userEmailId = reader.getCellData("RegisterPage", "EmailId", rowCnt);

			String userAddress = reader.getCellData("RegisterPage", "Address", rowCnt);

			String userCity = reader.getCellData("RegisterPage", "City", rowCnt);

			String userState = reader.getCellData("RegisterPage", "State", rowCnt);

			String userPostalCode = reader.getCellData("RegisterPage", "PostalCode", rowCnt);

			String userCountry = reader.getCellData("RegisterPage", "Country", rowCnt);

			String userId = reader.getCellData("RegisterPage", "UserId", rowCnt);

			String userPasswd = reader.getCellData("RegisterPage", "Passwd", rowCnt);

			String userConfirmPasswd = reader.getCellData("RegisterPage", "ConfirmPasswd", rowCnt);


			Object ob[] = {userFirstName, userLastName, userPhoneNumber, userEmailId, userAddress, userCity,

					userState, userPostalCode, userCountry, userId, userPasswd, userConfirmPasswd};

			myData.add(ob);
		}
		return myData;
	}
	/**
	 *********************************************************************************************************   
	 >>>>>>>>>>>>>>>>>>>>>>>>>>> Test: Validate User Login <<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<            
	 *********************************************************************************************************
	 **/
	public static ArrayList<Object[]> getLoginPage() {
		ArrayList<Object[]> myData = new ArrayList<Object[]>();
		try {
			reader = new ExcelReader("./TestData/testdata.xlsx");

		}catch (Exception e) {

			e.printStackTrace(); 
		}
		for (int rowCnt = 2; rowCnt <= reader.getRowCount("LoginPage"); rowCnt++) {    

			String userId = reader.getCellData("LoginPage", "UserId", rowCnt);

			String userPasswd = reader.getCellData("LoginPage", "Passwd", rowCnt);

			Object ob[] = {userId, userPasswd};

			myData.add(ob);
		}
		return myData;
	}




	/**
	 *********************************************************************************************************   
	                  >>>>>>>>>>>>>>>>>>>>>>>> End of the file <<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<,           
	 *********************************************************************************************************
	 **/

}
