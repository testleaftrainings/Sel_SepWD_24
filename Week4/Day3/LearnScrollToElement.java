package week4.day3;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class LearnScrollToElement {

	public static void main(String[] args) {
		ChromeDriver driver =new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.manage().window().maximize();
		
		//scrollToElement
		
		Actions scroll=new Actions(driver);
		
		WebElement scrollElemnet = driver.findElement(By.xpath("//a[text()='Conditions of Use & Sale']"));
 
		scroll.scrollToElement(scrollElemnet).perform();
		
	}

}
