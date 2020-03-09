package BasicUtilities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class JustWait {
	
	WebDriver driver;
	logger log;
	
	
	public JustWait(WebDriver driver) {
		this.driver=driver;
		log =new logger(driver);
	}
	
	
	public WebElement WaitForElement(By locator, int timeout) {
		// TODO Auto-generated constructor stub
	   try {
		   
		WebDriverWait wait=new WebDriverWait(driver,timeout);
		WebElement element=wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
		System.out.println("Element Located");
		return element;
	   }
	   catch(Exception e) {
		   System.out.println("Element not located" +e);
		   log.Update_log("Exception in WaitForElement method");
	   }
	return null;
	}	
	
	
	
	public WebElement elementToBeClickable(By locator,int timeout) {
		try {
		WebDriverWait wait=new WebDriverWait(driver,timeout);
		WebElement element=wait.until(ExpectedConditions.elementToBeClickable(locator));
		return element;
		} catch(Exception e) {
			   System.out.println("Element not located" +e);
			   log.Update_log("Exception in elementToBeClickable method");
		   }
		return null;
		
	}


}
