package PageClass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AddToCart {

	WebDriver ldriver;

	public  AddToCart(WebDriver rdriver) {

		ldriver=rdriver;

		PageFactory.initElements(rdriver, this);
	}

	@FindBy(xpath="//span[text()='Add to cart']")
	private	WebElement addcart;


	@FindBy(xpath="//a[@title='Proceed to checkout']")
	private WebElement checktoproced;

	@FindBy(xpath="//span[text()='Proceed to checkout']")
	private	WebElement processed;



	public void addTocart() {
		addcart.click();

	}
	public void checkToProceed() {
		checktoproced.click();
	}
	public void procesed() {
		processed.click();
	}

}