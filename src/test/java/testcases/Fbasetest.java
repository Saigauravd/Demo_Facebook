package testcases;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;

import Utility.Conf;
import pages.SignupPage;

public class Fbasetest  {
	
	public static WebDriver Driver;
	 public SignupPage Spage;
	
	@BeforeSuite
	public void initbrowser() throws IOException
	{
		Driver = new ChromeDriver();
		Driver.get(Conf.prop("Url"));
	}
	
	@BeforeClass
	public void CreateOblect()
	{
		Spage = new SignupPage(Driver);
		
	}
	
	

}
