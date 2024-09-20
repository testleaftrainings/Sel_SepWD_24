package week2.day3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class LearnDropdown {

	public static void main(String[] args) {
		// Launch the Chrome Browser
		ChromeDriver driver=new ChromeDriver();
		
		//Load the URL  - .get
		driver.get("http://leaftaps.com/opentaps/control/main");
		
		//Maximize window
		driver.manage().window().maximize();
		
		//Enter the username
		driver.findElement(By.xpath("//input[@id='username']")).sendKeys("Demosalesmanager");
		
		//Enter the password

         driver.findElement(By.xpath("//input[@id='password']")).sendKeys("crmsfa");

       //Click Login Button
        driver.findElement(By.xpath("//input[@class='decorativeSubmit']")).click();
   
       //Click crmsfa
        driver.findElement(By.xpath("//a[contains(text(),'CRM/SFA')]")).click();
        
        //Click Leads link
        driver.findElement(By.xpath("//a[text()='Leads']")).click();
        
        //Click Create Lead
        driver.findElement(By.xpath("//a[text()='Create Lead']")).click();
        
        //Handling dropdown
        
        //Finding the Element
        WebElement dd1=driver.findElement(By.xpath("//select[@id='createLeadForm_dataSourceId']"));
        
        //Instantiate the Select Class
        
        Select dropdown1 = new Select(dd1);
        
        //Select the value
        //By Index
        //dropdown1.selectByIndex(4);
        
        //By Value
         //dropdown1.selectByValue("LEAD_PARTNER");
        
        //By Text
        dropdown1.selectByVisibleText("Existing Customer");
        
        }
}
