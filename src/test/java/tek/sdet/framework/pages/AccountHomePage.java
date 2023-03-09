package tek.sdet.framework.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import tek.sdet.framework.base.BaseSetup;

public class AccountHomePage extends BaseSetup{

	public AccountHomePage() {
		PageFactory.initElements(getDriver(), this);
	}

	@FindBy(id = "accountLink")
	public WebElement accountButton;
	@FindBy(id= "nameInput")
	public WebElement accountPageNameField;
	@FindBy(id = "personalPhoneInput")
	public WebElement accountPagePhoneField;
	@FindBy(xpath = "//input[@name = 'previousPassword']")
	public WebElement previousPasswordField;
	@FindBy(id = "newPasswordInput")
	public WebElement newPasswordField;
	@FindBy(id = "confirmPasswordInput")
	public WebElement confirmPasswordField;
	@FindBy(id = "personalUpdateBtn")
	public WebElement accountPageUpdateButton;
	@FindBy(xpath = "//div[contains(text(),'Personal Information Updated Successfully')]")
	public WebElement successPopUpMessage;
	@FindBy(xpath = "//* [contains(text(),'Change Password')]")
	public WebElement changePasswordButton;
	@FindBy(xpath = "//*[contains(text(),'Add a payment method')]")
	public WebElement addAPaymentMethodLink;
	@FindBy(id = "cardNumberInput")
	public WebElement cardNumberInputField;
	@FindBy(id = "nameOnCardInput")
	public WebElement nameOnCardInputField;
	@FindBy(id = "expirationMonthInput")
	public WebElement expirationMonthInputField;
	@FindBy(id = "expirationYearInput")
	public WebElement expirationYearInputField;
	@FindBy(id = "securityCodeInput")
	public WebElement securityCodeInputField;
	@FindBy(id = "paymentSubmitBtn")
	public WebElement paymentSubmitButton;
	@FindBy(xpath = "//div[contains(text(),'Payment Method added sucessfully')]")
	public WebElement successPaymentMethodAddedPopUpMessage;
	@FindBy(xpath = "//*[contains(text(),'Visa Card')]")
	public WebElement visaCard1;
	@FindBy(xpath = "//*[contains(text(),'remove')]")
	public WebElement removePaymentOption;
	@FindBy(xpath = "//button[contains(text(),'Edit')]")
	public WebElement editPaymentMethodOption;
	@FindBy(xpath = "//button[@id='paymentSubmitBtn']")
	public WebElement cardUpdateButtonOption;
	@FindBy(xpath = "//div[contains(text(),'Payment Method updated Successfully')]")
	public WebElement successPaymentUpdatePopUpMessage;
	
	@FindBy(css = "svg[class='account__address-new-icon']")
	public WebElement addAddressOption;
	@FindBy(css = "#fullNameInput")
	public WebElement addressSectionNameInputField;
	@FindBy(id = "countryDropdown")
	public WebElement addressSectionCountryDropDown;
	@FindBy(css = "input[id=phoneNumberInput]")
	public WebElement addressSectionPhoneNumberInputField;
	@FindBy(css = "#streetInput")
	public WebElement addressSectionAddressInputField;
	@FindBy(css = "#apartmentInput")
	public WebElement addressSectionAptNoInputField;
	@FindBy(id = "cityInput")
	public WebElement addressSectionCityInputField;
	@FindBy(xpath = "//select[@class = \"account__address-new-dropdown\" and @name = 'state']")
	public WebElement addressSectionStateDropDown;
	@FindBy(id = "zipCodeInput")
	public WebElement addressSectionZipCodeInputField;
	@FindBy(css = "#addressBtn")
	public WebElement addressSectionAddAddressButton;
	@FindBy(xpath = "//div[contains(text(),'Address Added Successfully')]")
	public WebElement successAddAddressPopUpMessag;

	
}
