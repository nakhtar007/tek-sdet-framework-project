package tek.sdet.framework.steps;

import org.junit.Assert;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import tek.sdet.framework.pages.POMFactory;
import tek.sdet.framework.utilities.CommonUtility;

public class SignInSteps extends CommonUtility {
	
	POMFactory factory = new POMFactory();
	@Given("User is on tek retail website")
	public void userIsOnRetailWebsite() {
		String actualTitle = getTitle();
		String expectedTitle = "React App";
		Assert.assertEquals(actualTitle, expectedTitle);
		Assert.assertTrue(isElementDisplayed(factory.homePage().tekSchoolLogo));
		logger.info("user is on retail website");
		logger.info("Actual title " +actualTitle + " equals " +"ExpectedTitle "+expectedTitle);
		
		
	}
	@When("User click on signIn button")
	public void userClickOnSignInButton() {
	   click(factory.homePage().signInButton);
	   logger.info("User clicked on Sign In button");
	}
	@When("User enters email {string} and password {string}")
	public void userEntersEmailAndPassword(String string, String string2) {
		sendText(factory.retailSignInPage().emailField,string);
		sendText(factory.retailSignInPage().passwordField,string2);
		logger.info("Info Entered");
	    
	}
	@When("User click on login button")
	public void userClickOnLoginButton() {
		click(factory.retailSignInPage().loginBtn);
		logger.info("User clicked on login button");
	    
	}
	@Then("User should logged in into the page")
	public void userShouldLoggedInIntoThePage() {
		Assert.assertTrue(isElementDisplayed(factory.retailSignInPage().accountButton));
		logger.info("User is logged in");
	   
	}

	
}
