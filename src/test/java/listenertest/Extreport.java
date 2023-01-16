

package listenertest;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class Extreport {

	 static ExtentReports extend;
	
	public static ExtentReports reports()
	{
		
		String path  = System.getProperty("user.dir")+"\\Reports\\Facebookreport.html";
		
		ExtentHtmlReporter Report = new ExtentHtmlReporter(path);
		
		Report.config().setTheme(Theme.DARK);
		Report.config().setReportName("Facebook Signup page");
		
		 extend = new ExtentReports();
		 extend.attachReporter(Report);
		 extend.setSystemInfo("Evironment", "Sit");
		 extend.setSystemInfo("Exicuted by", "Saigaurav Dambhe");
		extend.setSystemInfo("Browser", "Chrome");
		
		return extend;
		 
		
	}
}
