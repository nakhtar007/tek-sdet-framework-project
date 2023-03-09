package tek.sdet.framework.steps;

import java.util.List;
import java.util.Map;

import org.junit.Assert;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import tek.sdet.framework.pages.POMFactory;
import tek.sdet.framework.utilities.CommonUtility;

public class OrderSteps extends CommonUtility{
	
	POMFactory factory = new POMFactory();
	
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
	    click(factory.orderPage().checkoutAddAddressButton);
	    logger.info("User clicked on Add new address link");
	    
	}
	@When("User fill new address form with below information")
	public void userFillNewAddressFormWithBelowInformation(DataTable dataTable) {
	 List <Map<String,String>> addressInfo = dataTable.asMaps(String.class, String.class);
	 selectByValue(factory.accountHomePage().addressSectionCountryDropDown,addressInfo.get(0).get("country"));
	 logger.info("salam");
	 
	    
	}
	@When("User click Add a credit card or Debit Card for Payment method")
	public void userClickAddACreditCardOrDebitCardForPaymentMethod() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}
	@When("User fill Debit or credit card information")
	public void userFillDebitOrCreditCardInformation(DataTable dataTable) {
	    // Write code here that turns the phrase above into concrete actions
	    // For automatic transformation, change DataTable to one of
	    // E, List<E>, List<List<E>>, List<Map<K,V>>, Map<K,V> or
	    // Map<K, List<V>>. E,K,V must be a String, Integer, Float,
	    // Double, Byte, Short, Long, BigInteger or BigDecimal.
	    //
	    // For other transformations you can register a DataTableType.
	    throw new io.cucumber.java.PendingException();
	}
	@When("User click on Add your card button")
	public void userClickOnAddYourCardButton() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}
	@When("User click on Place Your Order")
	public void userClickOnPlaceYourOrder() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}
	@Then("a message should be displayed ‘Order Placed, Thanks’")
	public void aMessageShouldBeDisplayedOrderPlacedThanks() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}
	
}
