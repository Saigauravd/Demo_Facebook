package testcases;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import Utility.Conf;
import listenertest.FBLIstner;

public class logintest extends FBLIstner {

	
	public WebDriver Driver ;
	@Test
	public void Data() throws IOException
	
	{
		Spage.fn(Conf.prop("name"));
		
        Spage.Ln(Conf.prop("last"));
		
		Spage.EM(Conf.prop("mob"));
		Spage.pW(Conf.prop("pass"));
		Spage.other();
		
	}
}
