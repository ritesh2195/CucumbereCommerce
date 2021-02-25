package Runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(plugin= {"pretty","com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"},

        features= {"src//test//resources//feature"},

        glue= {"stepDefinition"},

        tags= "@search"

)

public class TestNGRunnerTest extends AbstractTestNGCucumberTests {


}
