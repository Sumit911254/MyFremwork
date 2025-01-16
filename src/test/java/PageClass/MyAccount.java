package PageClass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MyAccount {

	//create WebDriver
	WebDriver ldriver;

	public MyAccount(WebDriver rdriver) {

		ldriver=rdriver;

		PageFactory.initElements(rdriver, this);


	}
	// identify Element
	@FindBy(id="email_create")
	WebElement CreateAccount;


	//
	@FindBy(id="SubmitCreate")
	WebElement SubmitCreate;
	
	
	
	
	//Already Register
	
	@FindBy(id="email")
	WebElement RegesterEmail;
	
	@FindBy(id="passwd")
	WebElement RegesterPass;
	
	
	@FindBy(id="SubmitLogin")
	WebElement submitlogin;
	
	
	
	
	
	@FindBy(id="search_query_top")
	WebElement searchbox;
	
	@FindBy(xpath="//button[@name='submit_search']")
	WebElement ClickSearch;
	
	@FindBy(xpath="//a[@class='product-name' and  @title='Printed Summer Dress']")
	WebElement clickproduct;
	
	@FindBy(id="color_11")
	WebElement selectColor;
	
	
	
	
	


	public void enterEmailId(String EmailAddress ) {
		CreateAccount.sendKeys("rohitroy1234@gmail.com");

	}

	public void ClickSubmitCreate() {
		SubmitCreate.click();
	}
	

	public void AlreadyregEmail(String AlreadyregEmail) {
		RegesterEmail.sendKeys("rohitroy1234@gmail.com");
	}
	
	public void AlredyRedpass(String AlredyRedpass) {
		RegesterPass.sendKeys("demo1234");
	}
	public void SubmmitLogin() {
		submitlogin.click();
	}
	
	public void searchProduct() {
		searchbox.sendKeys("Printed Dress");
		
	}
	public void clickSearch() {
		ClickSearch.click();
	}
	
	public void clickproduct() {
		clickproduct.click();
	}
	public void colorselect() {
		selectColor.click();
	}
}
