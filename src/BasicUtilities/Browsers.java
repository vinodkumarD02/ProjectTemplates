package BasicUtilities;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Browsers {
	
	public String Chrome ="CHROME";
	public String FireFox="Firefox";
	WebDriver dr;
	logger log;
	
	public WebDriver launchBrowser(String BrowserType, String Url)
	{
		switch(BrowserType)
		{
		case"CHROME":
		{
			System.setProperty("webdriver.chrome.driver", "chromedriver_v79.exe");
			 dr = new ChromeDriver(); 
			 dr.manage().window().maximize();
			 dr.get(Url);
			 dr.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
			 log=new logger(dr);
			 log.Update_log("chrome browser Successfully Launched!!");
	
			 break;
		}
		case "Firefox":
		{
			System.setProperty("webdriver.gecko.driver", "geckodriver.exe");
			 dr = new FirefoxDriver(); 
			 dr.get(Url);
			 dr.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
			 log=new logger(dr);
			 log.Update_log("FiREfox  browser Successfully Launched!!");
			 
			 break;
		}
		default:
			System.out.println("Available browsers are "+Chrome+ " and "+FireFox);
		}
		return dr;
	}


}
