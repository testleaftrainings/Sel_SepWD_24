package week2.day4;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearnWebdriverMethods {

	public static void main(String[] args) throws InterruptedException {
		
		// Launch the Chrome Browser
		   ChromeDriver driver=new ChromeDriver();
		
		//Load the URL  - .get
		  driver.get("http://leaftaps.com/opentaps/control/main");
		
		 //Maximize window
		  driver.manage().window().maximize();
		  String titleOfCurrentPage = driver.getTitle();
		  System.out.println(titleOfCurrentPage);
		  
		  //Implicit wait
		  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		  
		  //To get the current url
		  String currentUrl = driver.getCurrentUrl();
		  System.out.println(currentUrl);
		  //Implicit wait
		  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		  driver.findElement(By.id("username")).sendKeys("Demosalesmanager");
	      driver.findElement(By.id("password")).sendKeys("crmsfa");
		  
		   //Thread.sleep(2000);
		   //Close the browser
		    //driver.close();
		  
		  //To delays the execution time
		  // Thread.sleep - Java wait
		    
		    
		  //Implicit wait
		    //Selenium wait
		    //It will be applicable to all driver.findElement & findElements
		    //One time declaration
		    
	}

}
