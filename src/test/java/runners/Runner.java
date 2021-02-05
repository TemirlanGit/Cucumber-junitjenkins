package runners;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = "html:target/cucumber",
        features = "/Users/temirlanchypyev/Downloads/Cucumberjunit/src/test/resources/features",
        glue = "steps",  // looks inside the package to find step definition class
        tags = "@wiki",
        dryRun = false
)
public class Runner {

}




