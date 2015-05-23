package PageObjectMaven.PageObjectMaven;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage extends AbstractPage {

	public LoginPage(WebDriver driver){
		super(driver);
		
	}
	
	public LoginPage fillLoginDetails(){
		pageLoad();
		driver.findElement(By.id("login_email_id")).sendKeys("sravansan18@gmail.com");
		driver.findElement(By.id("login_password")).sendKeys("ssskmr18");
		
		return new LoginPage(driver);
		
	}
	
	
	public HomePage successfulLogin(){
		pageLoad();
		driver.findElement(By.xpath("//input[@class='btn btn-blue']")).click();
		return new HomePage(driver);
	}
}
