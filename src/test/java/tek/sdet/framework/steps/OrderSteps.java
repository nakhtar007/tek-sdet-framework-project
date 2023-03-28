package tek.sdet.framework.steps;

import java.util.List;
import java.util.Map;

import org.junit.Assert;
import org.openqa.selenium.By;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import tek.sdet.framework.pages.POMFactory;
import tek.sdet.framework.utilities.CommonUtility;

public class OrderSteps extends CommonUtility{
	
	POMFactory factory = new POMFactory();
	
	@Then("User change the category to {string}")
	public void userChangeTheCategoryTo(String selectCategory) {
		selectByVisibleText(factory.homePage().allDepartmentDropDown,selectCategory);
		logger.info("User seleted the Home Smart category");
	}
	@Then("User search for an item {string}")
	public void userSearchForAnItem(String productSearch) {
		sendText(factory.homePage().searchBar,productSearch);
		logger.info("User typed the product name in search bar");
	    
	}
	@Then("User click on Search icon")
	public void userClickOnSearchIcon() {
		click(factory.homePage().searchButton);
		logger.info("User clicked on search button");
	    
	}
	@Then("User click on item")
	public void userClickOnItem() throws InterruptedException {
		click(factory.orderPage().kasaOutdoorPlug);
		
		logger.info("User clicked on the searched product");
		
	    
	}
	@Then("User select quantity {int}")
	public void userSelectQuantity(int qty) {
		selectByIndex(factory.orderPage().qtyDropdown,qty-1);
		logger.info("User selected the quantity (2)");
	}
	@Then("User click add to Cart button")
	public void userClickAddToCartButton() {
		click(factory.orderPage().addTocartButton);
		logger.info("User clicked on add to cart button");
	   
	}
	@Then("the cart icon quantity should change to {int}")
	public void theCartIconQuantityShouldChangeTo(Integer expectedQTY) {
		waitTillPresence(factory.orderPage().cartQty);
		Assert.assertEquals(factory.orderPage().cartQty.getText(), expectedQTY.toString());
		logger.info("The quantity is 2 ");
		
        	    
	}
	
	
	
	@When("User click on Cart option")
	public void userClickOnCartOption() {
		click(factory.orderPage().cartButton);
		logger.info("User clicked on Cart");
	    

	}
	@When("User click on Proceed to Checkout button")
	public void userClickOnProceedToCheckoutButton() {
	    click(factory.orderPage().checkoutButton);
	    logger.info("User clicked on proceed to checkout");
	}
	@When("User click Add a new address link for shipping address")
	public void userClickAddANewAddressLinkForShippingAddress() {
	    click(factory.accountHomePage().checkoutAddAddressLink);
	    logger.info("User clicked on Add new address link");
	    
	}
	@When("User fill new address form with below information")
	public void userFillNewAddressFormWithBelowInformation(DataTable dataTable) throws InterruptedException {
	 List <Map<String,String>> addressInfo = dataTable.asMaps(String.class, String.class);
	 selectByValue(factory.accountHomePage().addressSectionCountryDropDown,addressInfo.get(0).get("country"));
	 sendText(factory.accountHomePage().addressSectionNameInputField,addressInfo.get(0).get("fullName"));
	 sendText(factory.accountHomePage().addressSectionPhoneNumberInputField,addressInfo.get(0).get("phoneNumber"));
	 sendText(factory.accountHomePage().addressSectionAddressInputField,addressInfo.get(0).get("streetAddress"));
	 sendText(factory.accountHomePage().addressSectionAptNoInputField,addressInfo.get(0).get("apt"));
	 sendText(factory.accountHomePage().addressSectionCityInputField,addressInfo.get(0).get("city"));
	 selectByValue(factory.accountHomePage().addressSectionStateDropDown,addressInfo.get(0).get("state"));
	 sendText(factory.accountHomePage().addressSectionZipCodeInputField,addressInfo.get(0).get("zipCode"));
	 
	 logger.info("User filled the address Information");
	}
	 @When("User click Add Your Address btn")
	 public void userClickAddYourAddressBtn() {
		
		 click(factory.accountHomePage().addAddressBtnCheckkout);
		 logger.info("User click on add address button");
		 
		
	     
	 }
	 
	    
	
	@When("User click Add a credit card or Debit Card for Payment method")
	public void userClickAddACreditCardOrDebitCardForPaymentMethod() throws InterruptedException {
		Thread.sleep(4000);
		
		click(factory.accountHomePage().addPaymentBtnInCheckOut);
		
		logger.info("User clicked on add credit or debit card link");
	    
	}
	@When("User fill Debit or credit card information")
	public void userFillDebitOrCreditCardInformation(DataTable dataTable) {
	    List<Map<String,String>> paymentInfo = dataTable.asMaps(String.class, String.class);
	    sendText(factory.accountHomePage().cardNumberInputField,paymentInfo.get(0).get("cardNumber"));
	    sendText(factory.accountHomePage().nameOnCardInputField,paymentInfo.get(0).get("nameOnCard"));
	    selectByValue(factory.accountHomePage().expirationMonthInputField,paymentInfo.get(0).get("expirationMonth"));
	    selectByValue(factory.accountHomePage().expirationYearInputField,paymentInfo.get(0).get("expirationYear"));
	    sendText(factory.accountHomePage().securityCodeInputField,paymentInfo.get(0).get("securityCode"));
	    
	    logger.info("User added payment information");
	    
	}
	@When("User click on Add your card button")
	public void userClickOnAddYourCardButton() {
		click(factory.accountHomePage().paymentSubmitButton);
		waitTillPresence(factory.accountHomePage().successPaymentMethodAddedPopUpMessage);
		Assert.assertTrue(isElementDisplayed(factory.accountHomePage().successPaymentMethodAddedPopUpMessage));
		logger.info("User clicked add your card button");
	}
	@When("User click on Place Your Order")
	public void userClickOnPlaceYourOrder() {
	    click(factory.orderPage().placeOrderBtn);
	    logger.info("User clicked on Place Your Order button");
	}
	@Then("a message should be displayed ‘Order Placed, Thanks’")
	public void aMessageShouldBeDisplayedOrderPlacedThanks() {
	    waitTillPresence(factory.orderPage().orderPlacedSuccessMessage);
	    Assert.assertTrue(isElementDisplayed(factory.orderPage().orderPlacedSuccessMessage));
	    logger.info("USER SUCCESSFULLY PLACED AN ORDER WITHOUT SHIPPING AND PAYMENT METHOD ON FILE");
	}
	
	
	@Given("User change the category {string}")
	public void userChangeTheCategory(String category) {
		selectByVisibleText(factory.homePage().allDepartmentDropDown,category);
	    logger.info("User changed the category to Electronics");
	}
	
	
	@Given("User click on item option")
	public void userClickOnItemOption() {
	    click(factory.orderPage().apexLegend);
	    logger.info("User clicked on Apex Legend product");
	}
	
	@Given("User select quantity to {int}")
	public void userSelectQuantityTo(Integer qty) {
	    selectByIndex(factory.orderPage().qtyDropdown,qty-1);
	    logger.info("User changed the quantity to 5");
	}
	@Then("the cart icon quantity should changed to {int}")
	public void theCartIconQuantityShouldChangedTo(Integer expectedQty) {
	    waitTillPresence(factory.orderPage().cartQty);
	    Assert.assertEquals(factory.orderPage().cartQty.getText(), expectedQty.toString());
	    logger.info("The cart quantity changed to 5");
	}
	@Then("Message should be displayed: ‘Order Placed, Thanks’")
	public void messageShouldBeDisplayedOrderPlacedThanks() {
		waitTillPresence(factory.orderPage().orderPlacedSuccessMessage);
	    Assert.assertTrue(isElementDisplayed(factory.orderPage().orderPlacedSuccessMessage));
	    logger.info("USER SUCCESSFULLY PLACED AN ORDER WITH THE SHIPPING AND PAYMENT METHOD ON FILE");
	}
	
	@Given("User click on Orders section")
	public void userClickOnOrdersSection() throws InterruptedException {
		Thread.sleep(1000);
	    click(factory.orderPage().orderPageBtn);
	    logger.info("User clicked on order page");
	    
	}
	@When("User click on first order in list")
	public void userClickOnFirstOrderInList() throws InterruptedException {
	//	Thread.sleep(1000);
	//	click(factory.orderPage().showOrderDetails);
		
		logger.info("User clicked on the order");
		
		
	    
	}
	@When("User click on Cancel The Order button")
	public void userClickOnCancelTheOrderButton() throws InterruptedException {
		Thread.sleep(1000);
		
		click(factory.orderPage().cancelOrder);
		logger.info("User clicked on 'Cancel The Order'");
	    
	}
	@When("User select the cancelation Reason ‘Bought wrong item’")
	public void userSelectTheCancelationReasonBoughtWrongItem() throws InterruptedException {
		Thread.sleep(1000);
		selectByVisibleText(factory.orderPage().cancellationReason,"Bought wrong item");
		
	    
	}
	@When("User click on Cancel Order button")
	public void userClickOnCancelOrderButton() throws InterruptedException {
		Thread.sleep(1000);
		click(factory.orderPage().cancelOrderSubmitBtn);
	    
	}
	@Then("a cancelation message should be displayed ‘Your Order Has Been Cancelled’")
	public void aCancelationMessageShouldBeDisplayedYourOrderHasBeenCancelled() throws InterruptedException {
		Thread.sleep(1000);
		Assert.assertTrue(isElementDisplayed(factory.orderPage().cancellationMessae));
		logger.info("User succesfully cancelled the order");
	    
	}
	
	@When("User click on Return Items button")
	public void userClickOnReturnItemsButton() {
	    click(factory.orderPage().showOrderDetailReturn);
	    click(factory.orderPage().returnButton);
	    logger.info("User Clicked on product to return");
	}
	@When("User select the Return Reason ‘Item damaged’")
	public void userSelectTheReturnReasonItemDamaged() {
		selectByVisibleText(factory.orderPage().returnReason,"Item damaged");
		logger.info("User selected return reason");
	}
	@When("User select the drop off service ‘FedEx’")
	public void userSelectTheDropOffServiceFedEx() {
		selectByVisibleText(factory.orderPage().dropOffSection,"FedEx");
		logger.info("User selected drop off location as FedEx");
	}
	@When("User click on Return Order button")
	public void userClickOnReturnOrderButton() {
	    click(factory.orderPage().submitReturnButton);
	    logger.info("User clicked on return item button");
	    
	}
	@Then("a cancelation message should be displayed ‘Return was successful’")
	public void aCancelationMessageShouldBeDisplayedReturnWasSuccessful() {
	    Assert.assertTrue(isElementDisplayed(factory.orderPage().returnSuccessMessage));
	    logger.info("User successfully returned the item");
	}
	
	
	
	
	@When("User click on Review button")
	public void userClickOnReviewButton() {
	    click(factory.orderPage().orderPageForReview);
	    click(factory.orderPage().orderPageReviewButton);
	    logger.info("User clicked on review button");
	}
	@When("User write Review headline ‘ headline value’ and ‘review text’")
	public void userWriteReviewHeadlineHeadlineValueAndReviewText() {
	    sendText(factory.orderPage().reviewHeadlineInputFields,"Good Quality");
	    sendText(factory.orderPage().reviewDescriptionInputField,"Works and runs good");
	    logger.info("User wrote headline and description review");

	}
	@When("User click Add your Review button")
	public void userClickAddYourReviewButton() {
	    click(factory.orderPage().addYourReviewButton);
	    logger.info("User clicked on Add Your Review Button");
	}
	@Then("a review message should be displayed ‘Your review was added successfully’")
	public void aReviewMessageShouldBeDisplayedYourReviewWasAddedSuccessfully() {
		 logger.info("User successfully left a feedback");
	}
	
	
}
