package tek.sdet.framework.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import tek.sdet.framework.base.BaseSetup;

public class OrderPage extends BaseSetup {
	
	public OrderPage() {
		PageFactory.initElements(getDriver(), this);

}
	@FindBy(xpath ="//p[contains(text(),'Kasa Outdoor Smart Plug')]")
	public WebElement kasaOutdoorPlug;
	@FindBy(xpath = "//body/div[@id='root']/div[1]/div[1]/div[3]/div[1]/div[1]/div[3]/div[1]/div[1]/select[1]")
	public WebElement qtyDropdown;
	@FindBy(xpath = "//span[contains(text(),'Add to Cart')]")
	public WebElement addTocartButton;
	@FindBy(xpath = "//span[@id='cartQuantity']")
	public WebElement cartQty;
	
	@FindBy(id = "cartBtn")
	public WebElement cartButton;

	@FindBy(id = "proceedBtn")
	public WebElement checkoutButton;


	@FindBy(xpath = "//button[@class = 'checkout__address-btn']")
	public WebElement checkoutAddAddressButton;

	@FindBy(id="placeOrderBtn")
	public WebElement placeOrderBtn;

	@FindBy(xpath = "//div[@id='59xp8xg']")
	public WebElement successOrderPlacedPopUpMessage;

	@FindBy(id = "addPaymentBtn")
	public WebElement  addPaymentBtnInCheckOut; 
}