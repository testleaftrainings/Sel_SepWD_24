package week3.day3;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearnSimpleAlert {

	public static void main(String[] args) {
		
		ChromeDriver driver =new ChromeDriver();
		driver.get("https://www.leafground.com/alert.xhtml");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.manage().window().maximize();
		
        //Click Show button
		driver.findElement(By.xpath("//span[text()='Show']")).click();
	
	   //To handle the alert
		//Transfer the driver focus to alert box
		
		Alert simpleAlert = driver.switchTo().alert();
		
		simpleAlert.accept();
		
		String simpleAlertText = simpleAlert.getText();
	
	    System.out.println(simpleAlertText);
	
	}

}
