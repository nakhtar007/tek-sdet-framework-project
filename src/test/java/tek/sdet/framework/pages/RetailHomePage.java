package tek.sdet.framework.pages;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import tek.sdet.framework.base.BaseSetup;

public class RetailHomePage extends BaseSetup{
	
	public RetailHomePage() {
		PageFactory.initElements(getDriver(), this);
	}

	@FindBy(xpath="//a[text()='TEKSCHOOL']")
	public WebElement tekSchoolLogo;
	
	@FindBy(id = "search")
	public WebElement allDepartmentDropDown;
	
	@FindBy(id = "searchInput")
	public WebElement searchBar;
	
	@FindBy(id = "searchBtn")
	public  WebElement searchButton;
	
	@FindBy(xpath = "//div/div/div/p[text()='Trading Card Binder for Pokemon']")
	public WebElement  pokemonProduct;
	
	@FindBy(id = "signinLink")
	public WebElement signInButton;
	
	
	@FindBy(xpath = "//button/span[text() = 'Add to Cart']")
	public WebElement addCart;
	
	@FindBy(id = "accountLink")
	public WebElement accountBtn;
	@FindBy(id = "hamburgerBtn")
	public WebElement allDepartmentSidebarButton;
	@FindBy(xpath ="//span[contains(text(),'Electronics')]")
	public WebElement electronicOptions;
	@FindBy(xpath = "//span[contains(text(),'Computers')]")
	public WebElement computersOptions;
	@FindBy(xpath = "//span[contains(text(),'Smart Home')]")
	public WebElement smartHomeOptions;
	@FindBy(xpath = "//span[contains(text(),'Sports')]")
	public WebElement sportOptions;
	@FindBy(xpath = "//span[contains(text(),'Automative')]")
	public WebElement automativeOptions;
	@FindBy(xpath = "//div[@class ='sidebar_content-item']/span")
	public List<WebElement> sidebarAllElementInList;
	
	@FindBy(xpath = "//body/div[@id='root']/div[3]/div[2]/div[1]/div[1]/div[2]/div[1]")
	public WebElement sidebarElectronicOption;
	@FindBy(xpath = "//span[contains(text(),'Computers')]")
	public WebElement sideBarComputersOption;
	@FindBy(xpath = "//span[contains(text(),'Smart Home')]")
	public WebElement sideBarSmartHomeOption;
	@FindBy(xpath = "//span[contains(text(),'Sports')]")
	public WebElement sideBarSportOption;
	@FindBy(xpath = "//span[contains(text(),'Automative')]")
	public WebElement sideBarAutomativeOption;
	
	
	
	
	
	
	
	
}
