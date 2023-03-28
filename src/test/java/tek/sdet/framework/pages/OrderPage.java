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


	

	@FindBy(id="placeOrderBtn")
	public WebElement placeOrderBtn;

	

	
	
	@FindBy(css = "#placeOrderBtn")
	public WebElement placeYourOrderButton;
	
	@FindBy(xpath = "//div[contains(text(),'Order Placed Successfully')]")
	public WebElement orderPlacedSuccessMessage;
	
	@FindBy(xpath ="//p[contains(text(),'Apex Legends - 1,000 Apex Coins')]")
	public WebElement apexLegend;
	
	@FindBy(xpath = "//p[contains(text(),'Your Order Has Been Cancelled')]")
	public WebElement cancellationMessae;
	
	@FindBy(id = "orderSubmitBtn")
	public WebElement cancelOrderSubmitBtn;
	
	@FindBy(id = "reasonInput")
	public WebElement cancellationReason;
	
	@FindBy(xpath = "//body/div[@id='root']/div[1]/div[1]/div[3]/div[1]/div[1]/div[3]/div[1]/div[2]/div[1]/p[2]")
	
	public WebElement showOrderDetails;
	
	@FindBy(xpath = "//body/div[@id='root']/div[1]/div[1]/div[3]/div[1]/div[1]/div[4]/div[1]/div[2]/div[1]/p[2]")
	public WebElement showOrderDetailReturn;
	
	@FindBy(id = "cancelBtn")
	public WebElement cancelOrderBtn;
	
	@FindBy(xpath = "//a[@id='orderLink']")
	public WebElement orderPageBtn;
	
	@FindBy(xpath = "//body/div[@id='root']/div[1]/div[1]/div[3]/div[1]/div[1]/div[4]/div[2]/div[2]/button[2]")
	public WebElement returnItemLink;
	@FindBy(id = "dropOffInput")
	public WebElement dropOffSection;
	@FindBy(id = "returnBtn")
	public WebElement returnButton;
	@FindBy(xpath = "//p[contains(text(),'Return was successfull')]")
	public WebElement returnSuccessMessage;
	@FindBy(id = "reasonInput")
	public WebElement returnReason;
	@FindBy(id = "orderSubmitBtn")
	public WebElement submitReturnButton;
	
	@FindBy(xpath = "//body/div[@id='root']/div[1]/div[1]/div[3]/div[1]/div[1]/div[9]/div[1]/div[2]/div[1]/p[2]")
	public WebElement apexLegendd;
	
	@FindBy(id = "reviewBtn")
	public WebElement reviewButton;
	
	@FindBy(id = "headlineInput")
	public WebElement reviewHeadlineInputFields;
	@FindBy(id = "descriptionInput")
	public WebElement reviewDescriptionInputField;
	
	@FindBy(id = "reviewSubmitBtn")
	public WebElement addYourReviewButton;
	
	@FindBy(id = "//div[contains(text(),'Your review was added successfully')]")
	public WebElement reviewSuccessMessage;
	
	@FindBy(xpath = "//button[@id='cancelBtn']")
	public WebElement cancelOrder;
	
	@FindBy(xpath = "//p[contains(text(),'Show Details')]")
	public WebElement orderPageForReview;
	
	@FindBy(xpath = "//body/div[@id='root']/div[1]/div[1]/div[3]/div[1]/div[1]/div[2]/div[2]/div[1]/div[2]/div[1]/div[1]/button[1]")
	public WebElement orderPageReviewButton;
	
	
	
}
