package PageObjectMaven.PageObjectMaven;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class MainPage extends AbstractPage {
	
	public MainPage(WebDriver driver){
		super(driver);
		
	}

	
	public LoginPage clickonLogin() throws InterruptedException{
		
	//	driver.findElement(By.xpath("html/body/div[4]/div/div/a")).click();
	//	Thread.sleep(1000);
		
		driver.findElement(By.xpath("//*[@id='fk-mainhead-id']/div[1]/div/div[2]/div[1]/ul/li[8]/a")).click();
		return new LoginPage(driver);
	}
}
