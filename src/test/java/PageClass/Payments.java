package PageClass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Payments {

	WebDriver ldriver;

	public Payments(WebDriver rdriver) {

		ldriver=rdriver;

		PageFactory.initElements(rdriver, this);
	}


	@FindBy(xpath="//a[@class='cheque']")
	WebElement clicktocheque;

	@FindBy(xpath="//span[text()='I confirm my order']")
	WebElement confirmorder;

	
	
	public void clickcheq() {
		clicktocheque.click();

	}
	public void order() {
		confirmorder.click();
	}


}
