package week3.day2;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindingLinks {

	public static void main(String[] args) {
		
		ChromeDriver driver =new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		
		//To find multiple elements - findElements
		 List<WebElement> allLinks = driver.findElements(By.tagName("a"));
		 int noOfLinks = allLinks.size();
		 System.out.println("Number of Links: "+noOfLinks);
		
		//retrieve all the links
		List<String> allLinksData=new ArrayList<String>();
		for (int i = 0; i < noOfLinks; i++) {
			String text = allLinks.get(i).getText();
			allLinksData.add(text);
		}
          
		System.out.println(allLinksData);
	}

}
