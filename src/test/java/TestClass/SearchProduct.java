package TestClass;

import org.testng.annotations.Test;

import PageClass.AddToCart;
import PageClass.Address;
import PageClass.IndexPage;
import PageClass.MyAccount;
import PageClass.Shipping;

public class SearchProduct extends baseClass{

	
	@Test
	public void SearchProduc() {
		driver.get(url);
		IndexPage ip=new IndexPage(driver);
		ip.clickOnSin();
		
		MyAccount ma=new MyAccount(driver);
		ma.AlreadyregEmail(browser);
		ma.AlredyRedpass(browser);
		ma.SubmmitLogin();
		
		ma.searchProduct();
		ma.clickSearch();
		
		ma.clickproduct();
		ma.colorselect();
		
		AddToCart ac=new AddToCart(driver);
		ac.addTocart();
		
		ac.checkToProceed();
		
		ac.procesed();
		
		Address ad=new Address(driver);
		
		ad.companyname();
		ad.addresss1();
		ad.address2();
		ad.city();
		ad.state();
		ad.postcode();
		ad.phone();
		ad.mobile();
		ad.subbmit();
		ad.Clickone();
		
		
		Shipping sh=new Shipping(driver);
		sh.clickbox();
		sh.clickonproced();
		
	}
	
}
