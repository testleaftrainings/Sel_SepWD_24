package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import base.BaseClass;
import io.cucumber.java.en.When;

public class WelcomePage extends BaseClass{
	

@When("Click on CRMSFA link")
	public MyHomePage clickCRMSFA() {
	getDriver().findElement(By.linkText("CRM/SFA")).click();
        return new MyHomePage();
	}

}
