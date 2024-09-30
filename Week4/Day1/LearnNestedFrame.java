package week4.day1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearnNestedFrame {

	public static void main(String[] args) {
		ChromeDriver driver =new ChromeDriver();
		driver.get("https://www.leafground.com/frame.xhtml");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.manage().window().maximize();
		
		//Switch by webelement
		  WebElement clickMe = driver.findElement(By.xpath("//h5[contains(text(),'Inside Nested frame')]/following-sibling::iframe"));

		
		//Switch into outer frame
		 driver.switchTo().frame(clickMe);
		
		//Switch to Inner frame
		driver.switchTo().frame("frame2");
		
		
		//Click the button
		//driver.findElement(By.xpath("(//button[text()='Click Me'])[2]")).click();
		
		  driver.findElement(By.id("Click")).click();
	
	
	    //To come out of the frame
		
		//Transfer focus to Immediate parent frame
		driver.switchTo().parentFrame();
		
		//Transfer focus to main webpage
		driver.switchTo().defaultContent();
		
	}

}
