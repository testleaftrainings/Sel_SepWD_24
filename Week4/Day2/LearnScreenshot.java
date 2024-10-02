package week4.day2;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearnScreenshot {

	public static void main(String[] args) throws IOException {
		
		ChromeDriver driver =new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/main");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.manage().window().maximize();
		
		
		//To take screenshot
		//getScreenshot - to take screenShot of the page - Source 
		File source = driver.getScreenshotAs(OutputType.FILE);
		
		//Destination
		File destination=new File("./screenshots/homepage.png");
		
		//connect source and destination
		FileUtils.copyFile(source, destination);
		
		//screenshot of a WebElement
		
	    //Finding the element
		  WebElement textField = driver.findElement(By.id("username"));
		
		 //Add source
		 File source1 = textField.getScreenshotAs(OutputType.FILE);
		
		//add destination
		File destination1=new File("./screenshots/textfield.png");
		
		//Connect source and destination
		 FileUtils.copyFile(source1, destination1);
		
		}

}
