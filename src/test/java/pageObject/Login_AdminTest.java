package pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Login_AdminTest  {
	
	WebDriver driver;
	public Login_AdminTest(WebDriver idriver)
	{
		driver=idriver;
		PageFactory.initElements(driver,this);
	}
	
	@FindBy (id="Email") WebElement email;
	@FindBy (id="password") WebElement pass;
	@FindBy (xpath="//button[@type='submit']") WebElement loginBtn;
	//@FindBy (linkText ="logout");
	
	
}
