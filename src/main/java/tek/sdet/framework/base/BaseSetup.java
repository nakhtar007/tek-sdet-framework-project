package tek.sdet.framework.base;

import java.io.FileNotFoundException;
import java.time.Duration;
import java.util.HashMap;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import tek.sdet.framework.config.Browser;
import tek.sdet.framework.config.ChromeBrowser;
import tek.sdet.framework.config.ChromeHeadless;
import tek.sdet.framework.config.FireFoxBrowser;
import tek.sdet.framework.config.SafariBrowser;
import tek.sdet.framework.utilities.ReadYamlFiles;

public class BaseSetup {
	private static WebDriver webDriver;
	private final ReadYamlFiles environmentVariables;
	public static Logger logger;
	
	public BaseSetup() {
		String filePath = System.getProperty("user.dir")+"/src/main/resources/env_config.yml";
		String log4jPath = System.getProperty("user.dir")+"/src/main/resources/log4j.properties";
		try {
			environmentVariables = ReadYamlFiles.getInstance(filePath);
		} catch (FileNotFoundException e) {
			System.out.println("Falied");
			e.printStackTrace();
			throw new RuntimeException("Failed");
		}
		
		logger = logger.getLogger("logger_Files");
		PropertyConfigurator.configure(log4jPath);
	}
	

	public WebDriver getDriver () {
		return webDriver;
		
	}
	
	public void setupBrowser() {
		HashMap uiProperties = environmentVariables.getYamlProperty("ui"); 
		
		String url = uiProperties.get("url").toString();
		Browser browser;
		
		switch (uiProperties.get("browser").toString().toLowerCase()) {
		case "chrome":
			if((boolean)uiProperties.get("headless")){
				browser = new ChromeHeadless();
			} else {
				browser = new ChromeBrowser();
			}
		     webDriver = browser.openBrowser(url);
		     break;
		case "firefox":
			browser = new FireFoxBrowser();
			webDriver = browser.openBrowser(url);
			break;
		case "safari":
			browser = new SafariBrowser();
			webDriver = browser.openBrowser(url);
			break;
			default:
				throw new RuntimeException("Unkown browser check environment properties");
				
		}
		
	webDriver.manage().window().maximize();
	webDriver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	webDriver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(20));
	
	
	}
	
	
	public void quitBrowser() {
		if(webDriver!=null)
			webDriver.quit();
	}
	
	
	
}
