package PageObjectMaven.PageObjectMaven;

import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;





public class loginValidationTest {
	
	protected WebDriver driver;
	//second commit with changes
	@BeforeTest
	public void setUpDriver() {
		//driver = new FirefoxDriver();
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium Webdriver and Java\\chromedriver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.navigate().to("https://flipkart.com");
	}
	
	@AfterTest
	public void closeDriver() {
		
		driver.quit();
		driver=null;
	}
	
	
	@Test
	public void userCanLoginWithValidDetails() throws InterruptedException {
		//user can login with valid details
		
		MainPage onMainPage= new MainPage(driver);
	
		HomePage onHomePage= onMainPage.navigateMainPage().clickonLogin().fillLoginDetails().successfulLogin();
	/*	
		LoginPage onLoginPage=onMainPage.clickonLogin();
		HomePage onHomePage=onLoginPage.fillLoginDetails().successfulLogin();
	*/
		
		Assert.assertTrue(onHomePage.username(),"invalid username found");
		
	//	
		onHomePage.logOut();
	}
	
	@Test
	public void logOutSuccess() throws InterruptedException {
		MainPage onMainPage= new MainPage(driver);
		HomePage onHomePage= onMainPage.navigateMainPage().clickonLogin().fillLoginDetails().successfulLogin();
		
		onHomePage.logOut();
	}
	
	
	

}
