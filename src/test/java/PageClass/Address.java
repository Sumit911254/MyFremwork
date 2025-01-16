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
	WebElement companyname;

	@FindBy(id="address1")
	WebElement address;

	@FindBy(id="address2")
	WebElement address2;

	@FindBy(id="city")
	WebElement city;

	@FindBy(id="id_state")
	WebElement state;

	@FindBy(id="postcode")
	WebElement postcode;

	@FindBy(id="phone")
	WebElement phone;

	@FindBy(id="phone_mobile")
	WebElement moblie;

	@FindBy(id="submitAddress")
	WebElement subbmit;

	@FindBy(xpath="//button[@class='button btn btn-default button-medium']")
	WebElement clickToPro;

	

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
