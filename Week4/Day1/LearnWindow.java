package week4.day1;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearnWindow {

	public static void main(String[] args) {
		ChromeDriver driver =new ChromeDriver();
		driver.get("https://www.leafground.com/window.xhtml");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.manage().window().maximize();
		
		
		//getWindowHandle
		String parentWindowAddress = driver.getWindowHandle();
		System.out.println("Parent address: "+parentWindowAddress);
		
		//0AEB013DD8C12B91323AAC557CAB2945
		//DC56A4EBF1D53B29C817F850ECB39998
		
		
		//Click the Element
		driver.findElement(By.xpath("//span[text()='Open']")).click();
		
		
		//getWindowHandles
		Set<String> allWindowsAdress = driver.getWindowHandles();
		
		System.out.println("All Adress: "+allWindowsAdress);
		
		//Convert Set into List
		//Declare an empty list
		List<String> allWindows=new ArrayList<String>(allWindowsAdress);
		
		//Title
		String parentTitle = driver.getTitle();
		System.out.println("Parent address: "+parentTitle);
		
		//Transfer driver focus to child
		driver.switchTo().window(allWindows.get(1));
		
		
		String childTitle = driver.getTitle();
		System.out.println("Child Title: "+childTitle);
		
		//close the window
		driver.close();
		
		//getTitle
//		String chTitle = driver.getTitle();
//		System.out.println(chTitle);
		
		//switch the focus
		driver.switchTo().window(allWindows.get(0));
		
		String parTitle = driver.getTitle();
		
		System.out.println("Title after switching :"+parTitle);
		
		// To Get the address of current opened window
		//getWindowhandle()
		
		//To get the address of all the opened windows
		//getWindowHandles

	}

}
