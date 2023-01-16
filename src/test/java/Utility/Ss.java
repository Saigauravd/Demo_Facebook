package Utility;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;


public class Ss {

	 public String  Scrs( WebDriver Driver,String result) throws IOException
	{
		TakesScreenshot ss = (TakesScreenshot)Driver;
		 File src = ss.getScreenshotAs(OutputType.FILE);
		 
		 String path = System.getProperty("user.dir")+"\\testSS\\"+result+".png";
		 
		 File Des = new File(path);
		  FileHandler.copy(src, Des);
		 return path;
				
	}
	
}
