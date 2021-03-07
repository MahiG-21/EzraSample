package com.qa.Test;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.qa.base.BaseClass;
import com.qa.pages.LoginPage;

public class LoginTest extends BaseClass {
	
	 public LoginTest() {
		 super();
				 
	 }
	 LoginPage lp;
	 
	 @BeforeMethod
	 public void setup() {
		 
		 initilazition();
		 lp = new LoginPage();
	 }
	 @Test(priority='1')
	 public void testValidatePagetitle () {
		 lp.validateTitle();
	 }
	 @Test(priority='2')
	 public void tesValidateUrl() {
		 lp.validateUrl();
		 
		 }
	 @AfterMethod
	 public void browserClose() {
		 lp.closeBrowser();
	 }
	 
		@Test(priority ='3',dataProvider = "testxlsx")
	 public void testCreateLogin(String Uname,String Pass)
	 {
		 lp.createaccount(Uname, Pass);
	 }
	 @DataProvider(name="testxlsx")  

		public Object[][] readExcel() throws EncryptedDocumentException, IOException  
		{
			Object input[][] = com.qa.utilities.DataProvider.getTestData("Sheet1");
			return input;
		}
	     

}
