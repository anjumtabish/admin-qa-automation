package parallel.runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = {"classpath:parallel/features/Login_scenario001_run001_IT.feature"},
        plugin = {"json:results/Runner_Login_scenario001_run001_IT.json"},
        glue = {"steps", "configurations"},
        monochrome = true
)
public class Runner_Login_scenario001_run001_IT {
}

// Generated by Cucable from src/test/resources/parallel/cucable.template
