package pspTechCucumber.testRunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = ".\\Feature\\sprint.1.feature",
glue="pspTechCucumber.steps",
monochrome = true
		
)









public class JunitRunner {

}
