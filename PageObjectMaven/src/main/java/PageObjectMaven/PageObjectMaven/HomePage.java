package PageObjectMaven.PageObjectMaven;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;




public class HomePage extends AbstractPage {
	
	
	public HomePage(WebDriver driver){
		
		super(driver);
		
	}
	
	public boolean username(){
		pageLoad();
		
		return driver.findElement(By.tagName("body")).getText().contains("Hi sravans... !");
		
		
	}
	
	public void logOut() throws InterruptedException {
		//pageLoad();
		
	
		     
		
		//  JavascriptExecutor js = (JavascriptExecutor)driver;
	        
	     // js.executeScript("window.scrollBy(0,1400)", "");
	      
	  	 
	      Thread.sleep(3000);
	      
	      WebElement root=driver.findElement(By.xpath("//*[@id='fk-mainhead-id']/div[1]/div/div[2]/div[1]/ul/li[7]/a"));
		  WebElement subroot=driver.findElement(By.xpath("//*[@id='fk-mainhead-id']/div[1]/div/div[2]/div[1]/ul/li[7]/ul/li[10]/a"));
	      Actions builder = new Actions(driver);
	      builder.moveToElement(root).build().perform();
	      subroot.click();
		 // return new MainPage(driver);
	}

}
