package base;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.DataProvider;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import utils.ReadExcel;

public class BaseClass extends AbstractTestNGCucumberTests{
	
	//public ChromeDriver driver;
	public ExtentReports extent;
	public ExtentTest test;
	
	public static final ThreadLocal<ChromeDriver> cDriver=new ThreadLocal<ChromeDriver>();
	public String fileName, testName, testDescription,authorName,testCategory;
	
	//Setter
	public void setDriver() {
		cDriver.set(new ChromeDriver());
	}
	//Getter
	
	public ChromeDriver getDriver() {
		return cDriver.get();
	}
	
	@BeforeMethod
	public void preConditions() {
		//driver =new ChromeDriver();
		setDriver();
		getDriver().get("http://leaftaps.com/opentaps/control/main");
		getDriver().manage().window().maximize();
		getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

	}
	
	@AfterMethod
	public void postConditions() {
		getDriver().close();
}
	
	@DataProvider(name="fetchData")
	public String[][] sendData() throws IOException {
		return ReadExcel.readData(fileName);

	}
	
	@BeforeSuite
	public void startReport() {
		       //Step1: Set the path for the report
				ExtentHtmlReporter reporter=new ExtentHtmlReporter("./Reports/result.html");
				
				//Step2: Create object ExtentReports class
				extent =new ExtentReports();
				
				//Step3: Attach data with the file
				extent.attachReporter(reporter);

	}
	
	
	public int takeSnapshot() throws IOException {
		 int randomNumber= (int)(Math.random()*9999+9999);
		File source = getDriver().getScreenshotAs(OutputType.FILE);
		File dest=new File("./snaps/image"+randomNumber+".png");
		FileUtils.copyFile(source, dest);
		return randomNumber;
	}
	
	
	public void reportStep(String msg, String status) throws IOException {
	 if (status.equalsIgnoreCase("pass")) {
		test.pass("Lead created successfully",MediaEntityBuilder.createScreenCaptureFromPath(".././snaps/image"+takeSnapshot()+".png").build());
	}
	 else {
		test.fail("Lead not created");
	}

	}
	
	@BeforeClass
	public void testcaseDetails() {
		ExtentTest test = extent.createTest(testName, testDescription);
		test.assignAuthor(authorName);
		test.assignCategory(testCategory);

	}
	
	@AfterSuite
	public void endReport() {
		extent.flush();

	}
	
	
	
	
}
