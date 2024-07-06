package testRunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features=".//Features/Test_Login_Admin.feature",
				glue="stepDefinitions",
				dryRun=false,
				monochrome=true,
				plugin="pretty"
		)

public class Run {

}
