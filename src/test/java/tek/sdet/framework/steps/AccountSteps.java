package tek.sdet.framework.steps;

import java.util.List;
import java.util.Map;

import org.junit.Assert;
import org.openqa.selenium.WebElement;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.Scenario;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import tek.sdet.framework.pages.POMFactory;
import tek.sdet.framework.utilities.CommonUtility;

public class AccountSteps extends CommonUtility {
	private POMFactory factory = new POMFactory();
	
	
	@When("user click on Account button")
	public void userClickOnAccountButton() {
	click(factory.accountHomePage().accountButton);
	logger.info("User clicked on AccountButton");
	 
	}
	@When("user update name {string} and Phone {string}")
	public void userUpdateNameAndPhone(String name, String phone)  {
		//clearTextUsingSendKeys(factory.accountHomePage().accountPageNameField);
		 clearTextWithJS(factory.accountHomePage().accountPageNameField);
		 sendText(factory.accountHomePage().accountPageNameField,name);
		 clearTextWithJS(factory.accountHomePage().accountPagePhoneField);
         sendText(factory.accountHomePage().accountPagePhoneField,phone);
         
 	     logger.info("User updated the profile value");
 	    
	}
	@When("user click on updateButton")
	public void userClickOnUpdateButton() {
		
	click(factory.accountHomePage().accountPageUpdateButton);
	logger.info("User clicked on update button");
	   
	}
	@Then("user profile information should be updated")
	public void userProfileInformationShouldBeUpdated() {
	waitTillPresence(factory.accountHomePage().successPopUpMessage);
	Assert.assertTrue(isElementDisplayed(factory.accountHomePage().successPopUpMessage));
	  logger.info("User updated the profile information successfully");
	}
	@When("User enters below information")
	public void userEntersBelowInformation(io.cucumber.datatable.DataTable dataTable) {
		List<Map<String, String>> signUpInformation = dataTable.asMaps(String.class, String.class);
		sendText(factory.accountHomePage().previousPasswordField, signUpInformation.get(0).get("previousPassword"));
		sendText(factory.accountHomePage().newPasswordField, signUpInformation.get(0).get("newPassword"));
		sendText(factory.accountHomePage().confirmPasswordField, signUpInformation.get(0).get("confirmPassword"));
	}
	@When("User click on Change password button")
	public void userClickOnChangePasswordButton() {
	click(factory.accountHomePage().changePasswordButton);
	logger.info("user clicked on change password button");
	 
	}
	@Then("a message shoud be displayed \\(Password Updated Successfully)")
	public void aMessageShoudBeDisplayedPasswordUpdatedSuccessfully() {
	logger.info("PasswordUpdatedSuccessfully");
	   
	}
	@When("user click on add a Payment method link")
	public void userClickOnAddAPaymentMethodLink() {
	    click(factory.accountHomePage().addPaymentMethod)
;	    logger.info("user clicked on Add A Payment Method");
	    
	}
	@When("user fill debit or credit card information")
	public void userFillDebitOrCreditCardInformation(DataTable dataTable) {
	    List <Map<String,String>> paymentInfo = dataTable.asMaps(String.class, String.class);
	    sendText(factory.accountHomePage().cardNumberInputField,paymentInfo.get(0).get("cardNumber"));
	    sendText(factory.accountHomePage().nameOnCardInputField,paymentInfo.get(0).get("nameOnCard"));
	    selectByValue(factory.accountHomePage().expirationMonthInputField,paymentInfo.get(0).get("expirationMonth"));
	    selectByValue(factory.accountHomePage().expirationYearInputField,paymentInfo.get(0).get("expirationYear"));
	    sendText(factory.accountHomePage().securityCodeInputField,paymentInfo.get(0).get("securityCode"));
	    
	    logger.info("user filled the payment method info and its displayed");
	    
	    
	}
	@When("user click on add your card button")
	public void userClickOnAddYourCardButton() {
		click(factory.accountHomePage().paymentSubmitButton);
		logger.info("user click on sumbit payment info");
	    
	}
	@Then("a message should be displayed \\(paymentMethodAddedSuccessfully)")
	public void aMessageShouldBeDisplayedPaymentMethodAddedSuccessfully() {
		waitTillPresence(factory.accountHomePage().successPaymentMethodAddedPopUpMessage);
		Assert.assertTrue(isElementDisplayed(factory.accountHomePage().successPaymentMethodAddedPopUpMessage));
		
		
		logger.info("The Payment method is added");
	    
	}
	
	@When("user click on remove option of card section")
	public void userClickOnRemoveOptionOfCardSection() {
	    click(factory.accountHomePage().visaCard1);
	    click(factory.accountHomePage().removePaymentOption);
	    
	    logger.info("user clicked on a payment method");
	    logger.info("User clicked on remove option");
	}
	@Then("payment method should be removed")
	public void paymentMethodShouldBeRemoved(){
		logger.info("user successfully removed payment method");
		
		
	    
	}
	@When("User click on Edit option of card section")
	public void userClickOnEditOptionOfCardSection() {
		click(factory.accountHomePage().visaCard1);
	    click(factory.accountHomePage().editPaymentMethodOption);
	    logger.info("User clicked on edit button");
	}
	@When("user edit information with below data")
	public void userEditInformationWithBelowData(io.cucumber.datatable.DataTable dataTable) throws InterruptedException {
	    List<Map<String,String>> updateCardInfo = dataTable.asMaps(String.class, String.class);
	    
	    clearTextWithJS(factory.accountHomePage().cardNumberInputField);
	    sendText(factory.accountHomePage().cardNumberInputField,updateCardInfo.get(0).get("cardNumber"));
	    clearTextWithJS(factory.accountHomePage().nameOnCardInputField);
	    sendText(factory.accountHomePage().nameOnCardInputField,updateCardInfo.get(0).get("nameOnCard"));
	    clearTextWithJS(factory.accountHomePage().securityCodeInputField);
	    
	    
	    
	    
	    selectByValue(factory.accountHomePage().expirationMonthInputField,updateCardInfo.get(0).get("expirationMonth"));
	    selectByValue(factory.accountHomePage().expirationYearInputField,updateCardInfo.get(0).get("expirationYear"));
	    
	    
	    logger.info("User filled the updated info");
	    
	}
	@When("user click on Update Your Card button")
	public void userClickOnUpdateYourCardButton() {
	    click(factory.accountHomePage().cardUpdateButtonOption);
	    logger.info("User clicked on Update your Card button");
	    
	}
	@Then("a message should be displayed ‘Payment Method updated Successfully’")
	public void aMessageShouldBeDisplayedPaymentMethodUpdatedSuccessfully() {
	    waitTillPresence(factory.accountHomePage().successPaymentUpdatePopUpMessage);
	    Assert.assertTrue(isElementDisplayed(factory.accountHomePage().successPaymentUpdatePopUpMessage));
	    logger.info("User Successfully Updated Card Info");
	}


	@When("User click on Add address option")
	public void userClickOnAddAddressOption() {
	   click(factory.accountHomePage().addAddressOption);
	   logger.info("User clicked on add address option successfully");
	}
	@When("user fill new address form with below information")
	public void userFillNewAddressFormWithBelowInformation(io.cucumber.datatable.DataTable dataTable) {
	   List<Map<String,String>> addAddressInfo = dataTable.asMaps(String.class, String.class);
	   selectByValue(factory.accountHomePage().addressSectionCountryDropDown,addAddressInfo.get(0).get("country"));
	   sendText(factory.accountHomePage().addressSectionNameInputField,addAddressInfo.get(0).get("fullName"));
	   sendText(factory.accountHomePage().addressSectionPhoneNumberInputField,addAddressInfo.get(0).get("phoneNumber"));
	   sendText(factory.accountHomePage().addressSectionAddressInputField,addAddressInfo.get(0).get("streetAddress"));
	   sendText(factory.accountHomePage().addressSectionAptNoInputField,addAddressInfo.get(0).get("apt"));
	   sendText(factory.accountHomePage().addressSectionCityInputField,addAddressInfo.get(0).get("city"));
	   selectByValue(factory.accountHomePage().addressSectionStateDropDown,addAddressInfo.get(0).get("state"));
	   sendText(factory.accountHomePage().addressSectionZipCodeInputField,addAddressInfo.get(0).get("zipCode"));
	   logger.info("User successfully filled the form");
	   
	   
	}
	@When("User click Add Your Address button")
	public void userClickAddYourAddressButton() {
	  click(factory.accountHomePage().addAddressBtnCheckkout);
	}
	@Then("a message should be displayed ‘Address Added Successfully’")
	public void aMessageShouldBeDisplayedAddressAddedSuccessfully() {
	waitTillPresence(factory.accountHomePage().successAddAddressPopUpMessag);
	Assert.assertTrue(isElementDisplayed(factory.accountHomePage().successAddAddressPopUpMessag));
	logger.info("User successfully added a new address");


	}


	
}
	

//public void waitTillDisappears(WebElement element) {try {this.getWait().until(ExpectedConditions.invisibilityOf(element));} catch (Exception e) {}}
