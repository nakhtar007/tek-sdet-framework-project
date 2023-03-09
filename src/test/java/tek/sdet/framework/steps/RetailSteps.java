package tek.sdet.framework.steps;

import java.util.List;

import org.junit.Assert;
import org.openqa.selenium.WebElement;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import tek.sdet.framework.pages.POMFactory;
import tek.sdet.framework.utilities.CommonUtility;

public class RetailSteps extends CommonUtility{
	
	private POMFactory factory = new POMFactory();
	
	//@Given("User is on tek retail website")
	public void userIsOnRetailWebsite() {
		String actualTitle = getTitle();
		String expectedTitle = "React App";
		Assert.assertEquals(actualTitle, expectedTitle);
		Assert.assertTrue(isElementDisplayed(factory.homePage().tekSchoolLogo));
		logger.info("user is on retail website");
		logger.info("Actual title " +actualTitle + " equals " +"ExpectedTitle "+expectedTitle);
		
		
	}
	
//	public void clickSignIn() {
//		click(factory.homePage().signInButton);
//		logger.info("User clicked on Sign in Button");
//	}
	
	
	@When("User search for {string} product")
	public void userSearchForProduct(String productValue) {
		sendText(factory.homePage().searchBar, productValue);
		click(factory.homePage().searchButton);
		logger.info("user searched for product");
		
		
	}
	
	
	

	@Then("The product should be displayed")
	public void theProductShouldBeDisplayed() {
		Assert.assertTrue(isElementDisplayed(factory.homePage().pokemonProduct));
		logger.info("The product is displayed on home page");
		
	}
	@Then("User click on product")
	 public void clickOnProduct() {
		 click(factory.homePage().pokemonProduct);
		 logger.info("user clicked on product pokemon");
	 }
	
	@Then ("User add the product to cart")
	public void addToCart() {
		click(factory.homePage().addCart);
		logger.info("User Added product to cart successfully");
	}
	@When("user click on All section")
	public void userClickOnAllSection() {
		click(factory.homePage().allDepartmentSidebarButton);
		logger.info("User clicked on all department option");
	   
	}
	@Then("below options are present in Shop by Department sidebar")
	public void belowOptionsArePresentInShopByDepartmentSidebar(DataTable dataTable) {
		List<List<String>> expectedSidebar = dataTable.asLists(String.class);
	//	List<WebElement> actualSidebar = factory.homePage().sidebarAllElementInList;
	//	for (int i = 0; i<expectedSidebar.get(0).size(); i++) {
	//		Assert.assertEquals(actualSidebar.get(i).getText(), expectedSidebar.get(0).get(i));
	//		logger.info(actualSidebar.get(i).getText()+" is equal to "+expectedSidebar.get(0).get(i));
		
		Assert.assertEquals(expectedSidebar.get(0).get(0), factory.homePage().electronicOptions.getText());
		logger.info("Electronic is present");
		Assert.assertEquals(expectedSidebar.get(0).get(1), factory.homePage().computersOptions.getText());
		logger.info("Computers is present");
		Assert.assertEquals(expectedSidebar.get(0).get(2), factory.homePage().smartHomeOptions.getText());
		logger.info("Smart Home is present");
		Assert.assertEquals(expectedSidebar.get(0).get(3), factory.homePage().sportOptions.getText());
		logger.info("Sports is present");
		Assert.assertEquals(expectedSidebar.get(0).get(4), factory.homePage().automativeOptions.getText());
		logger.info("Automative is present");
		
		}
	
	@When("User on {string}")
	public void userOn(String department) {
	  List<WebElement> sidebarOptions = factory.homePage().sidebarAllElementInList;
	  for(WebElement option:sidebarOptions) {
		  if(option.getText().equals(department)) {
			  click(option);
			  logger.info("User clicked on " +option);
			  break;
		  }
	  }
	}
	@Then("below options are present in department")
	public void belowOptionsArePresentInDepartment(DataTable dataTable) {
		List<List<String>> expectedDepartmentOptions = dataTable.asLists(String.class);
		List<WebElement> actualDepartmentOptions = factory.homePage().sidebarAllElementInList;
		for(int i=0;i<expectedDepartmentOptions.get(0).size();i++) {
			for(WebElement dept:actualDepartmentOptions) {
				if(dept.getText().equals(expectedDepartmentOptions.get(0).get(i))) {
					Assert.assertTrue(isElementDisplayed(dept));
					logger.info(dept.getText() + " is present");
				}
			}
		}
		
	    
	}
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
		Thread.sleep(3000);
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
}
	  
	
	

