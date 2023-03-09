package tek.sdet.framework.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import tek.sdet.framework.base.BaseSetup;

public class RetailSignInPage extends BaseSetup{
	
	public RetailSignInPage() {
		PageFactory.initElements(getDriver(), this);
		
	}
	
	@FindBy(xpath = "//input[@id='email']")
	public WebElement emailField;
	
	@FindBy(id = "password")
	public WebElement passwordField;
	
	@FindBy(id = "loginBtn")
	public WebElement loginBtn;
	
	@FindBy(id = "accountLink")
	public WebElement accountButton;

}
