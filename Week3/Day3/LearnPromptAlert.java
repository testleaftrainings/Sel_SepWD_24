package week3.day3;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearnPromptAlert {

	public static void main(String[] args) {
        ChromeDriver driver =new ChromeDriver();
		driver.get("https://www.leafground.com/alert.xhtml");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.manage().window().maximize();
		
		//Click prompt Alert button
		driver.findElement(By.xpath("(//span[text()='Show'])[5]")).click();
		
		
		driver.findElement(By.xpath("(//span[text()='Show'])[2]")).click();
		
		//Transfer
		Alert promptAlert = driver.switchTo().alert();
		String promptText = promptAlert.getText();
		System.out.println(promptText);
		
		promptAlert.sendKeys("Vineeth");
		
        promptAlert.accept();
		
 }

}
