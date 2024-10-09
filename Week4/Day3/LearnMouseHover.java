package week4.day3;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class LearnMouseHover {
	
	
	//Instantiate the Actions Class - Creating object
	
	//Finding the element
	
	//Using proper method under the Actions class 
	
	//mouse hover -moveToElement

	    public static void main(String[] args) {
		ChromeDriver driver =new ChromeDriver();
		driver.get("https://www.pvrcinemas.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.manage().window().maximize();
		
		//Instantiate
	    Actions mouseHov=new Actions(driver);
		
		//Find the element
	    WebElement mouseHoverElement = driver.findElement(By.xpath("//span[text()='More']"));
		
	    mouseHov.moveToElement(mouseHoverElement).perform();

	}

}
