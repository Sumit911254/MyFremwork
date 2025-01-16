package PageClass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ViewYourOrder {
	
	WebDriver ldriver;
	
	public ViewYourOrder(WebDriver rdriver) {
		
		ldriver=rdriver;
		
		
		PageFactory.initElements(rdriver, this);
		
	
	}
	@FindBy(xpath="//a[@class='button-exclusive btn btn-default']")
	WebElement ViewOrder;
	
	public void orderview() {
		ViewOrder.click();
	}
	

}
