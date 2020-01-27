package sapnaProject.Sapna123;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

	public WebDriver ldriver;

	public LoginPage(WebDriver rdriver) {
		ldriver = rdriver;
		PageFactory.initElements(rdriver, this);
	}

	@FindBy(id = "Email")
	WebElement txtEmail;

	@FindBy(id = "Password")
	WebElement txtPwrd;

	@FindBy(xpath = "//input[@class='button-1 login-button']")
	WebElement txtSubmit;

	@FindBy(xpath = "//a[contains(text(),'Logout')]")
	WebElement clklogout;

	public void setEmail(String email) {
		txtEmail.sendKeys(email);
	}

	public void setPword(String pwd) {
		txtPwrd.sendKeys(pwd);
	}

	public void clkSubmit() {
		txtSubmit.click();

	}

	public void clkLogout() {
		clklogout.click();

	}
}
/*
 * System.setProperty("webdriver.chrome.driver",
 * "C:/sapna/installed_program/selenium_driver/chromedriver_win32(latest79)/chromedriver.exe"
 * ); WebDriver driver = new ChromeDriver();
 * driver.get("http://admin-demo.nopcommerce.com/");
 * driver.manage().window().maximize();
 * 
 * driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
 * 
 * driver.findElement(By.id("Email")).
 * sendKeys("Admin email: admin@yourstore.com");
 * driver.findElement(By.id("Password")).sendKeys("admin");
 * driver.findElement(By.xpath("//input[@class='button-1 login-button']"));
 * driver.close();
 */
