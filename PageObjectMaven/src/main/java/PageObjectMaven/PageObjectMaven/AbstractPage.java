package PageObjectMaven.PageObjectMaven;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;




public class AbstractPage {

	
	
	protected WebDriver driver;
	
	public AbstractPage(WebDriver driver){
		this.driver= driver;
	//	driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	}
	
	
	public WebDriver getDriver() {
		return driver;
	}
	
		
	public void pageLoad(){
		
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
	}
	
	public MainPage navigateMainPage() throws InterruptedException{
		
		driver.findElement(By.xpath("html/body/div[4]/div/div/a")).click();
		Thread.sleep(1000);
		return new MainPage(driver);
	}

}
