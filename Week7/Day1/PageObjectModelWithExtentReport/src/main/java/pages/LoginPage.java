package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import base.BaseClass;
import io.cucumber.java.en.When;

public class LoginPage extends BaseClass {
	
	
	
	@When("Enter the username as {string}")
    public LoginPage enterUsername(String uName) {
	
		getDriver().findElement(By.id("username")).sendKeys(uName);
		return this;
	}
	
	@When("Enter the password as {string}")
	public LoginPage enterPassword(String pWord) {
		getDriver().findElement(By.id("password")).sendKeys(pWord);
         return this;
	}
	
	@When("Click on the login button")
	public WelcomePage clickLoginButton() {
		getDriver().findElement(By.className("decorativeSubmit")).click();
        return new WelcomePage();
	}

}
