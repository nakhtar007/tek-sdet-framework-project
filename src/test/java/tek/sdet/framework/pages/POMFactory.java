package tek.sdet.framework.pages;

import tek.sdet.framework.base.BaseSetup;

public class POMFactory extends BaseSetup{
	private RetailHomePage homePage;
	private RetailSignInPage signInPage;
	private AccountHomePage accountHomePage;
	private OrderPage orderPage;

	public POMFactory() {
		this.homePage = new RetailHomePage();
		this.signInPage = new RetailSignInPage();
		this.accountHomePage = new AccountHomePage();
		this.orderPage = new OrderPage();
		
	}
	
	public RetailHomePage homePage() {
		return this.homePage;
		
	}
	
	public RetailSignInPage retailSignInPage() {
		return this.signInPage;
	}
	
	public AccountHomePage accountHomePage() {
		return this.accountHomePage;
	}
	public OrderPage orderPage() {
		return this.orderPage;
	}
}
