package Utilities;

import java.io.File;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class ExtentListenerclass implements ITestListener  {
	ExtentReports Report;
	ExtentSparkReporter spark;
	ExtentTest test;


	public void configreport() {
		Report =new ExtentReports();
		spark=new ExtentSparkReporter("D:\\framWork\\FramWork\\Reports\\extentFail12.html");
		Report.attachReporter(spark);


		Report.setSystemInfo("Device", "Lenevo");
		Report.setSystemInfo("OS", "Window");
		Report.setSystemInfo("User", "Sumit");

		spark.config().setDocumentTitle("ExtentReport");
		spark.config().setReportName("My Report");
		spark.config().setTheme(Theme.DARK);



	} 

	public void onStart(ITestContext Result) {

		configreport();
		System.out.println("On Start method invoke");
	}


	public void onFinish(ITestContext Result) {
		System.out.println("On Finish method invoke");
		Report.flush();

	}


	public  void onTestFailure(ITestResult Result) {
		System.out.println("On Test Failure"+" "+ Result.getName());
		test=Report.createTest(Result.getName());
		test.log(Status.FAIL, "Thsi is Fail Method");
		
		//FailedScreenSort
		
	String screenShotpath= System.getProperty("user.dir")+"\\Screenshort\\"+Result.getName()+".png"; 
	File screenShotFile=new File(screenShotpath);
    if(screenShotFile.exists()) {
	test.fail("Capture screen shot"+test.addScreenCaptureFromPath(screenShotpath));
}
		
		


	}
	
	public void onTestSkipped(ITestResult Result) {
		System.out.println("On Test Skipped"+ Result.getName());
		test=Report.createTest(Result.getName());
		test.log(Status.SKIP, "Test Case Skip");


	}


	public void onTestStart(ITestResult Result) {
		System.out.println("On Test Start"+" "+Result.getName());

	}

	public void onTestSuccess(ITestResult Result) {
		System.out.println("On Test Success" +" "+ Result.getName());
		test=Report.createTest(Result.getName());
		test.log(Status.PASS, "This Method Pass");

	}


	public void  onTestFailedButWithinSuccessPercentage(ITestResult Result) {
		System.out.println("On Test Failed But Within Success Percentage");
	}




}






