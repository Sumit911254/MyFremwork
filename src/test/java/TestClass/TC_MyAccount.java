package TestClass;

import org.testng.annotations.Test;

import PageClass.AddToCart;
import PageClass.Address;
import PageClass.CreateAnAcoount;
import PageClass.IndexPage;
import PageClass.MyAccount;
import PageClass.Payments;
import PageClass.Shipping;
import PageClass.VerifyUser;
import PageClass.ViewYourOrder;
import junit.framework.Assert;

public class TC_MyAccount extends baseClass {

	@Test(enabled=false)
	public void VerifyAccountpage() {
		driver.get(url);



		IndexPage ip=new IndexPage(driver);

		ip.clickOnSin();


		MyAccount ma=new MyAccount(driver);

		ma.enterEmailId("CreateAccount");
		ma.ClickSubmitCreate();


		CreateAnAcoount ca=new CreateAnAcoount(driver);

		ca.GetTitle();

		ca.EnterFirstName("Sumit");
		ca.EnterLastName("kumar");
		ca.EnterEmail("");
		ca.EnterPass("demo1234");
		ca.subbmitDetails();


		VerifyUser vu=new VerifyUser(driver);

		String username=vu.userverify();

		Assert.assertEquals("Sumit kumar", username);


	}


	@Test
	public void VerifyLogin() {

		driver.get(url);

		IndexPage ip=new IndexPage(driver);

		ip.clickOnSin();

		MyAccount ma=new MyAccount(driver);

		ma.AlreadyregEmail("");
		ma.AlredyRedpass("");
		ma.SubmmitLogin();

		MyAccount my=new MyAccount(driver);
		my.searchProduct();
		my.clickSearch();
		my.clickproduct();
		my.colorselect();

		AddToCart ac=new AddToCart(driver);

		ac.addTocart();
		ac.checkToProceed();
		ac.procesed();

		Address ad=new Address(driver);
		ad.Clickone();

		Shipping sp=new Shipping(driver);
		sp.clickbox();
		sp.clickonproced();

		Payments p=new Payments(driver);
		p.clickcheq();
		p.order();

		ViewYourOrder vo=new ViewYourOrder(driver);

		vo.orderview();



	}

}






