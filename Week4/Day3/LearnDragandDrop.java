package week4.day3;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class LearnDragandDrop {

	public static void main(String[] args) {
		ChromeDriver driver =new ChromeDriver();
		driver.get("https://jqueryui.com/droppable/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.manage().window().maximize();
		
		//dragAndDrop
		
		driver.switchTo().frame(0);
		
		Actions act=new Actions(driver);
		
		//Source
		WebElement source = driver.findElement(By.id("draggable"));
		
        //Target
		WebElement target = driver.findElement(By.id("droppable"));
	
	    act.dragAndDrop(source, target).perform();
	
	}

}
