package pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Review_testcase {
	
	WebDriver driver;
	
	public Review_testcase(WebDriver idriver) {
		driver =idriver;
		PageFactory.initElements(driver,this);
	}
	
	@FindBy(linkText = "Breathe-Easy Tank" )
	WebElement selectimage;
	
	@FindBy(linkText = "Add Your Review")
	WebElement addreview;
	
	@FindBy(id="nickname_field")
	WebElement nickname;
	
	@FindBy(id="summary_field")
	WebElement summary;
	
	@FindBy(id="review_field")
	WebElement reviewfield;
	
	@FindBy(xpath="//div[@class=\"actions-toolbar review-form-actions\"]")
	WebElement submitbutton;
	
	public void clickOnBreatheasy()
	{
		selectimage.click();
	}
	
	public void addyourreview()
	{
		addreview.click();
	}
	
	public void enternickname(String fn) 
	{
		nickname.sendKeys(fn);
	}
	
	public void entersummary(String su)
	{
		summary.sendKeys(su);
	}
	
	public void enterreviewfield(String rf)
	{
		reviewfield.sendKeys(rf);
	}
	
	public void clickOnSubmit()
	{
		submitbutton.click();
	}
	
	

}
