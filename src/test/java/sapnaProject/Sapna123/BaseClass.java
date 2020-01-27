package sapnaProject.Sapna123;

import java.util.concurrent.TimeUnit;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.support.ui.ExpectedConditions;
//import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
//import org.testng.annotations.Test;
import org.testng.annotations.Parameters;

import utility.ReadConfig;

public class BaseClass {

	ReadConfig readconfig = new ReadConfig();
	public String loginsite = readconfig.getUrl();
	public String username =readconfig.getUsername();
	public String pwrd = readconfig.getPasswordl();
	public static WebDriver driver;
	public static Logger logger;
	
	@BeforeClass
	@Parameters("browser")
	public void setUp(String br){
		
		if(br.equalsIgnoreCase("chrome")){
			
		System.setProperty("webdriver.chrome.driver","C:/sapna/installed_program/selenium_driver/chromedriver_win32(latest79)/chromedriver.exe");
		 driver = new ChromeDriver();
		 
		}
		
			logger = 	Logger.getLogger("Sapna123");
			PropertyConfigurator.configure("log4j.properties");
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
    
	}
	
	
	@AfterClass
	public void tearDown(){
		logger.error("clossing the site....");
		driver.quit();
	}
	
}
