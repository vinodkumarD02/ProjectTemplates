package BasicUtilities;

import java.io.File;
import java.io.IOException;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class ScreenShotss {
	
	static int counter =0;
	 WebDriver dr;
	logger log;
	
	public ScreenShotss(WebDriver dr)
	{
		this.dr =dr;
		log =new logger(dr);
	}
	 
	public void ScreenShott()
	{
		String	path="C:\\Users\\BLTuser.BLT0215\\Documents\\ScreenShot\\";
		String FileName=counter+".png";

		File f1 = ((TakesScreenshot) dr).getScreenshotAs(OutputType.FILE);
		File f2 = new File(path+FileName);
		try {
			FileUtils.copyFile(f1, f2);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			log.Update_log("Error in taking ScreenShots");
		}
				
		counter++;
	}
}

