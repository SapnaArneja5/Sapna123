package sapnaProject.Sapna123;

import static org.testng.Assert.assertTrue;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TC_LoginTest_001 extends BaseClass {
	
	
	@Test
	public void loginTest() throws InterruptedException{
		driver.get(loginsite);
		LoginPage lp = new LoginPage(driver);
		logger.info("enter username");
		lp.setEmail(username);
		Thread.sleep(2000);
		logger.info("enter password");
		lp.setPword(pwrd);
		Thread.sleep(2000);
		logger.info("submitting username and password");
		lp.clkSubmit();
		Thread.sleep(2000);
		String title = driver.getTitle();
		System.out.println(title);
		logger.info("get title.....");
		if(title.equals("Dashboard / nopCommerce administration")){
			Assert.assertTrue(true);
			
			WebDriverWait wd = new WebDriverWait(driver, 10);
			wd.until(ExpectedConditions.elementToBeClickable(lp.clklogout)).click();
		} else {
			
			Assert.assertTrue(false);
		}
		
		
		
		
	}

}
