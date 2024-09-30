package week3.day3;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearnConfirmation {

	public static void main(String[] args) {
		ChromeDriver driver =new ChromeDriver();
		driver.get("https://www.leafground.com/alert.xhtml");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.manage().window().maximize();
		//Click confirmation Alert Button
		
		driver.findElement(By.xpath("(//span[text()='Show'])[2]")).click();

		//Transfer the driver focus
		Alert confirmationAlert = driver.switchTo().alert();
		
		confirmationAlert.dismiss();
	}

}
