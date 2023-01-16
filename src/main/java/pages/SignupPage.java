package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class SignupPage {
	
	private  WebDriver Driver;
	 
	@FindBy (xpath = "//*[@name='firstname']")
	private WebElement Firstname;
	@FindBy (xpath = "//*[@name='lastname']")
	WebElement lastname;
	
	@FindBy (xpath = "//*[@name='reg_email__']")
	private WebElement emailormob;
	
	@FindBy (xpath = "//*[@name='reg_passwd__']")
	private WebElement pass;
	
	 @FindBy (xpath="//*[@id='day']")
	 private  WebElement day;
	
	 @FindBy (xpath="//*[@id='month']")
	 private  WebElement month;
	 
	 @FindBy (xpath="//*[@id='year']")
	 private  WebElement yr;
	 
	 @FindBy (xpath="(//*[@class='_58mt'])[2]")
	 private  WebElement male;
	 
	 @FindBy (xpath="(//*[@type='submit'])[1]")
	 private  WebElement signupb;
	 
	 public SignupPage(WebDriver Driver)
	 {
		 this.Driver = Driver;
		 PageFactory.initElements(Driver, this);
		 
	 }
	 
	 public void fn(String fname)
	 {
		 Firstname.sendKeys(fname);
	 }
	 public void Ln(String Lname)
	 {
		 lastname.sendKeys(Lname);
	 }
	 public void EM(String eMOb)
	 {
		 emailormob.sendKeys(eMOb);
	 }
	 public  void pW(String Pass)
	 {
		 pass.sendKeys(Pass);
	 }
	 public void other()
	 {
		 Select selday = new Select(day);
		 selday.selectByValue("12");
		 Select selm = new Select(month);
		 selm.selectByValue("10");
		 Select selyr =new Select(yr);
		 selyr.selectByValue("1997");
		 
		 male.click();
		 signupb.click();
	 }
	
}
