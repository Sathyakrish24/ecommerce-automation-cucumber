package testRunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = ".//Features/Review_testcase.feature",
        glue = "stepDefinition",
        dryRun = false,
        monochrome = true,
        plugin = {"pretty", "html:target/Cucumber_Reports/HTML_Report.html",
                "junit:target/Cucumber_Reports/Xml_Report.xml"}
)


public class ReviewRunner {

}


//@RunWith(Cucumber.class)
//@CucumberOptions(
//		features = "src/test/resources/features",
//		glue = "stepDefinition",
//		tags = "@ReviewTest",
//		plugin = {"pretty", "html:target/cucumber-reports"}
//)
//public class RunReview {
//
//}