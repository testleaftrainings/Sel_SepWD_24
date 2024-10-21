package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import base.BaseClass;
import io.cucumber.java.en.When;

public class CreateLeadPage extends BaseClass {

@When("Enter the companyname as (.*)$")
	public CreateLeadPage enterCompanyname(String cName) {
	getDriver().findElement(By.id("createLeadForm_companyName")).sendKeys(cName);
         return this;
	}
@When("Enter the firstname as (.*)$")
	public CreateLeadPage enterFirstname(String fName) {
	getDriver().findElement(By.id("createLeadForm_firstName")).sendKeys(fName);
           return this;
	}
@When("Enter the lastname as (.*)$")
	public CreateLeadPage enterLastname(String lName) {
	getDriver().findElement(By.id("createLeadForm_lastName")).sendKeys(lName);
         return this;
	}
@When("Click on the CreateLead button")
	public ViewLeadPage enterCreateLeadButton() {
	getDriver().findElement(By.name("submitButton")).click();
        return new ViewLeadPage();
	}

}
