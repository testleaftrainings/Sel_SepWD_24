package week7.day1;

import java.io.IOException;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

public class LearnExtentReport {

	public static void main(String[] args) throws IOException {
		//Mandatory steps
		
		//Step1: Set the path for the report
		ExtentHtmlReporter reporter=new ExtentHtmlReporter("./Reports/result.html");
		
		//Step2: Create object ExtentReports class
		ExtentReports extent =new ExtentReports();
		
		//Step3: Attach data with the file
		extent.attachReporter(reporter);
		
		//Step4: Create the testcases and assign the details
		ExtentTest test = extent.createTest("CreateLead", "CreateLead with multiple data");
		test.assignAuthor("Vineeth");
		test.assignCategory("Regression");
		
		//Step5: Step level status
		test.pass("Username entered successfully",MediaEntityBuilder.createScreenCaptureFromPath(".././Snap/username.jpeg").build());
		test.pass("Password entered successfuly");
		test.pass("Login button clicked successfully");
		
		//Step6: Close the report
		extent.flush();
		
		System.out.println("Done");
		
	}

}
