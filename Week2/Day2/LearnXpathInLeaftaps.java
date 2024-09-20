package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearnXpathInLeaftaps {

	public static void main(String[] args) {
		// Launch the Chrome Browser
				ChromeDriver driver=new ChromeDriver();
				
				//Load the URL  - .get
				driver.get("http://leaftaps.com/opentaps/control/main");
				
				//Maximize window
				driver.manage().window().maximize();
				
				//Enter the username
				driver.findElement(By.xpath("//input[@id='username']")).sendKeys("Demosalesmanager");

	}

}
