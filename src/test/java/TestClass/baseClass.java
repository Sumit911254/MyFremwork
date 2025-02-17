package TestClass;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import Utilities.ReadFiles;
import io.github.bonigarcia.wdm.WebDriverManager;

public class baseClass {

	ReadFiles ReadConfig=new ReadFiles();

	String url=ReadConfig.getbaseurl();

	String browser=ReadConfig.getBrowser();


	//Browser Lunch

	public static WebDriver driver;
	public static Logger logger;


	@BeforeClass
	
	
	public void Setup() {
		

		switch(browser.toLowerCase())
		{
		case "chrome":
			WebDriverManager.chromedriver().setup();
			driver=new ChromeDriver();
			driver.manage().window().maximize();
			break;

		case"msedge":
			WebDriverManager.edgedriver().setup();
			driver=new EdgeDriver();
			driver.manage().window().maximize();
			break;

		case"firefox":
			WebDriverManager.firefoxdriver().setup();
			driver=new FirefoxDriver();
			driver.manage().window().maximize();
			break;

		default:
			driver=null;
			break;
		}

		//wait

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
		
		driver.get(url);

		


	}

	@AfterClass
	public void TearDown() {
		//driver.close();
		//driver.quit();
	}

	public void screensort(WebDriver driver,String testname) throws IOException {
		TakesScreenshot ts=(TakesScreenshot)driver;
		File src=ts.getScreenshotAs(OutputType.FILE);
		File des=new File(System.getProperty("user.dir")+"\\Screenshort\\" +testname+".png");
		FileUtils.copyFile(src, des);




	}
}



