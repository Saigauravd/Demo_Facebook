package listenertest;

import java.io.IOException;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;


import Utility.Ss;
import testcases.Fbasetest;

public class FBLIstner extends Fbasetest   implements ITestListener {
	ExtentReports extend = Extreport.reports();
	 ExtentTest test ;
	 
	@Override
	public void onTestStart(ITestResult result) {
		
		System.out.println("Test class is started ="+ result.getName());
		
		  test = extend.createTest(result.getName());
		
	}



	@Override
	public void onTestFailure(ITestResult result) 
		{
			System.out.println("Test class is Failed ="+ result.getName());
		    test.fail(result.getThrowable());
		    
		    Ss S= new Ss();
		    
		    try {
				S.Scrs(Driver, result.getName());
				
				 String path = S.Scrs(Driver,result.getName());
				 test.addScreenCaptureFromPath(path);
				 
				 
				 
			} catch (IOException e) {
				e.getMessage();
				
			}
		    
		
		}

	@Override
	public void onTestSkipped(ITestResult result) {
		System.out.println("Test class is skipped ="+ result.getName());
		test.log(Status.SKIP, "Skipped");
	}


	@Override
	public void onTestSuccess(ITestResult result) {
		System.out.println("Test class is Successed ="+ result.getName());
		
		test.log(Status.PASS, "Successed");
	}

	
	@Override
	public void onFinish(ITestContext context) {
		System.out.println("Test tag is finish ="+ context.getName());
	   extend.flush();
	}
	@Override
	public void onStart(ITestContext context) {
		System.out.println("Test tag is finish ="+ context.getName());
	}
	
	
}
