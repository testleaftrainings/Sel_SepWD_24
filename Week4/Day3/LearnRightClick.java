package week4.day3;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class LearnRightClick {

	public static void main(String[] args) {
		// Right Click - contextClick();
		ChromeDriver driver =new ChromeDriver();
		driver.get("https://swisnl.github.io/jQuery-contextMenu/demo.html");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.manage().window().maximize();
		
		//Right Click
		Actions rightClick=new Actions(driver);
		
		WebElement rcElement = driver.findElement(By.xpath("//span[text()='right click me']"));
		
		rightClick.contextClick(rcElement).perform();
	}

}
