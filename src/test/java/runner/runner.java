package runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/resources/features/",
        glue = "step",
        plugin = {"pretty", "html:target/report.html", "json:target/report.json"}
        //tags = {"@Smoke,@Regression"}, (Enable only for feature specific scenario execution)
        //dryRun = false,
        //monochrome = true,
)


public class runner {
}
