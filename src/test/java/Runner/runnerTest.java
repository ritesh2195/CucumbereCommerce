package Runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;


@RunWith(Cucumber.class)
@CucumberOptions(plugin= {"pretty","com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"},

		features= {"src//test//resources//feature"},

		glue= {"stepDefinition"},

		tags= "@SignUp"

)
public class runnerTest {


}
