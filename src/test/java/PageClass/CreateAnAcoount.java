package PageClass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CreateAnAcoount {

	WebDriver ldriver;

	public CreateAnAcoount(WebDriver rdriver) {
		ldriver=rdriver;

		PageFactory.initElements(rdriver, this);

	}
	//Title
	@FindBy(id="uniform-id_gender1")
	WebElement Title;

	//FrstName
	@FindBy(id="customer_firstname")
	WebElement FirstName;

	//LastName
	@FindBy(id="customer_lastname")
	WebElement LastName;

	//Email
	@FindBy(id="email")
	WebElement email;

	//Password
	@FindBy(id="passwd")
	WebElement Password;

	@FindBy(id="submitAccount")
	WebElement Subbmit;



	public void GetTitle() {
		Title.click();
	}

	public void EnterFirstName(String Fname) {
		FirstName.sendKeys(Fname);
	} 

	public void EnterLastName(String lname) {
		LastName.sendKeys(lname);
	}
	public void EnterEmail(String Email) {
		email.sendKeys(Email);
	}
	public void EnterPass(String Pass) {
		Password.sendKeys(Pass);
	}

	public void subbmitDetails() {
		Subbmit.click();

	}

}
