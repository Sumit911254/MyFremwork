package PageClass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Shipping {
	WebDriver ldriver;


	public Shipping(WebDriver rdriver ) {
		ldriver=rdriver;

		PageFactory.initElements(rdriver, this);

	}

	@FindBy(id="cgv")
	private WebElement checkbox;


	@FindBy(xpath="//button[@name='processCarrier']")
	private WebElement clicktoproced;


	
	public void clickbox() {
		checkbox.click();
	}
	
	public void clickonproced() {
		clicktoproced.click();
	}


}
