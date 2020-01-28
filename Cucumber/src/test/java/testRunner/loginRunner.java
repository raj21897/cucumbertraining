package testRunner;

import org.junit.runner.RunWith;
import cucumber.api.junit.Cucumber;
import cucumber.api.CucumberOptions;
@RunWith(Cucumber.class)
@CucumberOptions(
		features = "featurefiles",
        glue = {"steoDefination"}, tags ="@user-specific"
		)
public class loginRunner {
	
}
