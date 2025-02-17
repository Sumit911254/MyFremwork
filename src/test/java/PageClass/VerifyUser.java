package PageClass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class VerifyUser {

	WebDriver ldriver;
	
	public VerifyUser(WebDriver rdriver) {
		ldriver=rdriver;
		
		PageFactory.initElements(rdriver, this);
		
		
	}
	
	@FindBy(xpath="//a[@title='View my customer account']")
	private WebElement userregister;
	
	
	public String userverify() {
	String text=userregister.getText();
	return text;
	}
	
	
	
	
}
