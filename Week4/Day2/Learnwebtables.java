package week4.day2;

import java.time.Duration;
import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Learnwebtables {

	public static void main(String[] args) {
		ChromeDriver driver =new ChromeDriver();
		driver.get("https://www.leafground.com/table.xhtml");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.manage().window().maximize();
		
		//Locate the table
		WebElement table = driver.findElement(By.xpath("//span[text()='Customer Analytics Table']/following::table[2]/tbody"));

		//Count the number of rows
		List<WebElement> rows = table.findElements(By.tagName("tr"));
		int rowCount = rows.size();
		System.out.println("Row Count is: "+rowCount);
		
		
		//Count the number of columns
		List<WebElement> column = table.findElements(By.xpath("//span[text()='Customer Analytics Table']/following::table[2]//th"));
	    int columnCount = column.size();
		System.out.println("ColumnCount is :"+columnCount);
		
		
		//Retreive a particular row value
		  List<WebElement> secondRowData = table.findElements(By.xpath("//span[text()='Customer Analytics Table']/following::table[2]/tbody/tr[2]/td"));
		  int size = secondRowData.size();
		
		for (int i = 0; i < size; i++) {
			String secondRow = secondRowData.get(i).getText();
			System.out.println("SecondRowData are :"+secondRow);
		}
		
		
		//Entire data in the webtable - Static and dynamic
		  for (int i = 1; i <= rowCount; i++) {
			WebElement row = table.findElement(By.xpath("//span[text()='Customer Analytics Table']/following::table[2]/tbody/tr["+i+"]/td"));
			
			for (int j = 1; j <= columnCount; j++) {
				WebElement allValues = row.findElement(By.xpath("//span[text()='Customer Analytics Table']/following::table[2]/tbody/tr["+i+"]/td["+j+"]"));
			System.out.println("All values are : "+allValues.getText());
			}
			
		}
		
	}

}
