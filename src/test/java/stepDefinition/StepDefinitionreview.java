package stepDefinition;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import pageObject.Review_testcase;

public class StepDefinitionreview {
	
	WebDriver driver;
	Review_testcase rev;
	
	@Given("User launch the chrome browser")
	public void user_launch_the_chrome_browser() {
	   driver = new ChromeDriver();
	   driver.manage().window().maximize();
	   driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	    rev = new Review_testcase(driver);	
	}

	@When("user open the url as {string}")
	public void user_open_the_url_as(String url) {
	   driver.get(url);
	}

	@When("user need to Click on image")
	public void user_need_to_click_on_image() {
	    rev.clickOnBreatheasy();
	}

	@When("user click on Add Review link")
	public void user_click_on_add_review_link() {
	   rev.addyourreview();
	}

	@When("user enter nickname as {string} and summary as {string} and Review as {string}")
	public void user_enter_nickname_as_and_summary_as_and_review_as(String fn, String su, String rf) {
		rev.enternickname(fn);
		rev.entersummary(su);
		rev.enterreviewfield(rf);
	  
	}

	@When("Click on submit button")
	public void click_on_submit_button() {
	    rev.clickOnSubmit();
	}

	@When("Close the browser")
	public void close_the_browser() {
		driver.quit();
	}

}
