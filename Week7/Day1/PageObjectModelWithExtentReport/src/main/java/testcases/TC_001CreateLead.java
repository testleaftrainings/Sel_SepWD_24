package testcases;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import base.BaseClass;
import pages.LoginPage;

public class TC_001CreateLead extends BaseClass {
	
	@BeforeTest
	public void setValues() {
		fileName="CreateLead";
		testName="CreateLead";
		testDescription="CreateLead with multiple data";
		authorName="Vineeth";
		testCategory="Regression";

	}
	
	
	
	@Test(dataProvider = "fetchData")
	public void runCreateLead(String uName, String pWord, String cName,String fName,String lName) {
		LoginPage lp=new LoginPage();
		
		lp.enterUsername(uName)
		.enterPassword(pWord)
		.clickLoginButton()
		.clickCRMSFA()
		.clickLeadsLink()
		.clickCreateLead()
		.enterCompanyname(cName)
		.enterFirstname(fName)
		.enterLastname(lName)
		.enterCreateLeadButton()
		.verifyLead();
	}

}
