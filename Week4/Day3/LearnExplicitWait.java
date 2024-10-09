package week4.day3;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LearnExplicitWait {

	public static void main(String[] args) {
		ChromeDriver driver =new ChromeDriver();
		driver.get("https://www.leafground.com/waits.xhtml");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.manage().window().maximize();

		//Syntax for WedDriverWait
	
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(10));
		
		WebElement firstElement = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//span[text()='Click']")));
		 
		firstElement.click();
		
		//VisiblityOfElement
		WebElement secondElement = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[text()='I am here']")));
		
		 boolean displayed = secondElement.isDisplayed();
		
	     System.out.println("The button is displayed or not: "+displayed);
		
		
	     driver.findElement(By.xpath("(//span[text()='Click'])[2]")).click();
	     
	     //Invisiblity
	     Boolean invisibilityOfElement = wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//span[text()='I am about to hide']")));
	     
	     System.out.println("The Element is visible or not: "+invisibilityOfElement);
	     
	}

}
