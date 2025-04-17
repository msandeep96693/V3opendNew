package testRunner;

import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/resources/Features",
                  glue = "stepDefinitions",
                  dryRun = false,
                  monochrome = true,
                  plugin = "html:Reports/allpage"
                  )

public class testRunner {

}
