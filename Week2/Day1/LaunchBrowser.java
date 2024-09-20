package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchBrowser {

	public static void main(String[] args) {
		
		// Driver name- ChromeDriver
		//Creating an object for the Class
		
		// Launch the Chrome Browser
		   ChromeDriver driver=new ChromeDriver();
		
		//Load the URL  - .get
		  driver.get("http://leaftaps.com/opentaps/control/main");
		
		//Maximize window
		  driver.manage().window().maximize();
		
		//Enter the username
		//findElement
		//For entering the value - sendKeys
		driver.findElement(By.id("username")).sendKeys("Demosalesmanager");
				
		//Enter the password
		  driver.findElement(By.id("password")).sendKeys("crmsfa");
		
		//Click login button
	      driver.findElement(By.className("decorativeSubmit")).click();		
		
	      //Click crmsfa
	       driver.findElement(By.linkText("CRM/SFA")).click();
		
	}

}
