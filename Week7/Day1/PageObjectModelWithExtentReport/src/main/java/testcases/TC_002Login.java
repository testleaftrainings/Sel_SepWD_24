package testcases;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import base.BaseClass;
import pages.LoginPage;

public class TC_002Login extends BaseClass{
	
	@BeforeTest
	public void setValues() {
		fileName="Login";
		testName="LoginFunction";
		testDescription="Login with different credentials";
		authorName="hari";
		testCategory="Sanity";

	}
	
	@Test(dataProvider = "fetchData")
	public void runLogin(String uName, String pWord) {
		LoginPage lp=new LoginPage();
		lp.enterUsername(uName)
		.enterPassword(pWord)
		.clickLoginButton();
		
	}
}
