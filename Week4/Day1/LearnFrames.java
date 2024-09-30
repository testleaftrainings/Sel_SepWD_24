package week4.day1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearnFrames {

	public static void main(String[] args) {
		ChromeDriver driver =new ChromeDriver();
		driver.get("https://www.leafground.com/frame.xhtml");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.manage().window().maximize();
		
	    //Frames 1 2 3 4
		//Index  0 1 2 3
		
		//Transfer driver focus to frame
		  driver.switchTo().frame(0);
		
		//Click the Clickme Button
		driver.findElement(By.xpath("//button[text()='Click Me']")).click();

	}

}
