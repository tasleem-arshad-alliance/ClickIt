package DeployMasternodesTest;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.clickit.qa.base.base;
import com.clickit.qa.pages.DeployMasternodesPage;
import com.clickit.qa.pages.LoginPage;
import com.clickit.qa.pages.MyMasternodes;


public class DeployMasternodesTest extends base {
	
	MyMasternodes myMasternodes;
	DeployMasternodesPage deployMasternodesPage = new DeployMasternodesPage();
	LoginPage loginPage;
	
	public DeployMasternodesTest() {
		super();
	}
	
	@Test(priority = 1)
	public void verifyuserNodeshasemptytestcase() throws InterruptedException {
		
		WebDriverWait wait = new WebDriverWait(driver, 70);
		 wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("APOLLON")));
	
		DeployMasternodesPage.verifyClickDeploybtn();
		System.out.println("Successfully click the first NEXT button");
		
		Thread.sleep(3000);
		
		DeployMasternodesPage.clickNextbtn();
		System.out.println("Successfully click on the second Next button");
		Thread.sleep(2000);
		
		DeployMasternodesPage.coinLabel("Testt");
		DeployMasternodesPage.TxHash("001-hash-003");
		DeployMasternodesPage.addreess("testqa-000444");
		DeployMasternodesPage.outputindex("00002"); 
		Thread.sleep(2000);
		DeployMasternodesPage.clickNextpage();
		
		WebDriverWait wait2 = new WebDriverWait(driver, 50);
		wait2.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"chkbxError\"]/a")));
		
	//	DeployMasternodesPage.clickHerebuttn();
	//	 if user has empty node then moves further otherwise deploy the nodes. 
		driver.get("http://qstmlm.azurewebsites.net/");
		
		DeployMasternodesPage.loginmlm("mlm87" , "7788");
		DeployMasternodesPage.loginbutton();
	
		DeployMasternodesPage.Shoptab();	
	
		DeployMasternodesPage.selectproduct();
		Thread.sleep(2000);
		DeployMasternodesPage.clickBuybtn();
		
		DeployMasternodesPage.Paymentbutton();
		
		DeployMasternodesPage.selectCurrency();
		
		driver.get("http://qstmlm.azurewebsites.net/Admin/AdminDashboard/Index#");
		DeployMasternodesPage.adminLoginMLM("Svend","rY4A-bsx");
		DeployMasternodesPage.adminLoginbutton();
		DeployMasternodesPage.adminPaymentTab();
		Thread.sleep(3000);
		DeployMasternodesPage.adminName("mlm87"); 
		
		DeployMasternodesPage.manualpaymentbutton();
		
		DeployMasternodesPage.paybutton();
		 Thread.sleep(12000);
		DeployMasternodesPage.closebutton();
	 }

	@Test(priority = 2)
	public void verifyHappypathTestcase() throws InterruptedException {
		
		WebDriverWait wait = new WebDriverWait(driver, 70);
		 wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("APOLLON")));
	
		DeployMasternodesPage.verifyClickDeploybtn();
		System.out.println("Successfully click the first NEXT button");
		
		Thread.sleep(3000);
		
		DeployMasternodesPage.clickNextbtn();
		System.out.println("Successfully click on the second Next button");
		Thread.sleep(2000);
		
		DeployMasternodesPage.coinLabel("qatst");
		DeployMasternodesPage.TxHash("hash-004");
		DeployMasternodesPage.addreess("0000-clickit-001");
		DeployMasternodesPage.outputindex("3313114");
		Thread.sleep(2000);
		DeployMasternodesPage.clickNextpage();
		Thread.sleep(2000);
		DeployMasternodesPage.clickDeploypage();
		Thread.sleep(5000);
	}

	
	
	
	@BeforeMethod
	public void setUp() {
		  initialization();
		  loginPage = new LoginPage(); 
		  myMasternodes= loginPage.login(prop.getProperty("userName"), prop.getProperty("password"));
		  myMasternodes.clickonDeployMasternodesLink();  
	}

	@AfterMethod
	public void tearDown() {
	//			driver.quit();
		  }

//	private void waitForElementVisible(String id) {
//		
//		int maxTries = 90;
//		int tryNumber = 1;
//		while (driver.findElement(By.id("ManualPaymentbtn")).isDisplayed() != true) {
//			try {
//				Thread.sleep(2000);
//				if(tryNumber > maxTries) 
//					break;
//				tryNumber++;
//				
//			} catch (InterruptedException e) {
//				// TODO Auto-generated catch block
//				e.printStackTrace();
//			}
//		}
//		
//	}


	
}
