package MyMasternodesTestcases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;

import com.clickit.qa.base.base;
import com.clickit.qa.pages.LoginPage;
import com.clickit.qa.pages.MyMasternodes;

public class MyMasternodesTestcases extends base {
	
	LoginPage loginPage;
	MyMasternodes myMasternodes;

     public MyMasternodesTestcases () {
		super();
	}
	
	@Test(priority=1)
	public void verifyusernametest() {
		Assert.assertTrue((myMasternodes.verifyCorrectusername()));
	}
	
//  @Test (priority=2)
//     public void verifyDeployMasternodelinkTest() {
//   deployMasternodesPage = myMasternodes.clickonDeployMasternodesLink(); 
//  }
  
  
  @BeforeMethod
  public void setUp() {
	  initialization();
	  loginPage = new LoginPage(); 
	  myMasternodes= loginPage.login(prop.getProperty("userName"), prop.getProperty("password"));
//	  deployMasternodesPage  = new DeployMasternodesPage();
  }

  
  
  @AfterMethod
  public void tearDown() {
		driver.quit();
  }

}
;