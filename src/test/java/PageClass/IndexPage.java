package PageClass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class IndexPage {

	//create a object of Webdriver
	
	WebDriver ldriver;

	public IndexPage(WebDriver rdriver) {

		ldriver=rdriver;

		PageFactory.initElements(rdriver, this);

	}

	//identify element

	@FindBy(linkText="Sign in")
	private WebElement SinIn;
	

	//click on SinIn

	public void clickOnSin() {
		SinIn.click();
	}



}
