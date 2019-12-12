package clickitloginTestcases;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.clickit.qa.base.base;
import com.clickit.qa.pages.LoginPage;
import com.clickit.qa.pages.MyMasternodes;

public class LoginPageTest extends base{
	
	LoginPage loginPage;
	MyMasternodes MyMasternodes;
	
	
	public LoginPageTest() {
		super();
	}
	
	
	@Test(priority = 1)
	public void loginTest() {
	  MyMasternodes =loginPage.login(prop.getProperty("userName"), prop.getProperty("password"));	
	}
	
	@BeforeMethod
	public void setUp() {
		initialization();
		loginPage = new LoginPage();	
	}

	
	@AfterMethod
	public void tearDown() {
		driver.quit();
	}
		

}
