package PageClass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Address {
	WebDriver rdriver;

	public Address(WebDriver ldriver) {
		rdriver=ldriver;

		PageFactory.initElements(ldriver, this);

	}
	@FindBy(id="company")
	private WebElement companyname;

	@FindBy(id="address1")
	private WebElement address;

	@FindBy(id="address2")
	private WebElement address2;

	@FindBy(id="city")
	private WebElement city;

	@FindBy(id="id_state")
	private	WebElement state;

	@FindBy(id="postcode")
	private WebElement postcode;

	@FindBy(id="phone")
	private	WebElement phone;

	@FindBy(id="phone_mobile")
	private WebElement moblie;

	@FindBy(id="submitAddress")
	private WebElement subbmit;

	@FindBy(xpath="//button[@class='button btn btn-default button-medium']")
	private WebElement clickToPro;



	public void companyname() {
		companyname.sendKeys("Teceon Softwere Pvt Ltd");
	}
	public void addresss1() {
		address.sendKeys("Delhi");
	}
	public void address2() {
		address2.sendKeys("Mayur Vihar");

	}
	public void city() {
		city.sendKeys("Delhi");
	}

	public void state() {
		state.click();

	}

	public void postcode() {
		postcode.sendKeys("12321");
	}
	public void phone() {
		phone.sendKeys("9198645376");
	}
	public void mobile() {
		moblie.sendKeys("9867362456");
	}
	public void subbmit() {
		subbmit.click();
	}
	public void Clickone() {
		clickToPro.click();
	}
}
