package Runner;

import java.io.File;
import java.time.LocalDateTime;

//import com.vimalselvam.cucumber.listener.ExtentCucumberFormatter;
//import com.vimalselvam.cucumber.listener.ExtentProperties;
//import com.vimalselvam.cucumber.listener.Reporter;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;

import com.cucumber.listener.ExtentCucumberFormatter;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(plugin= {"html:target/cucumber_html_report", "pretty", "com.cucumber.listener.ExtentCucumberFormatter"},
		features= {"features"},
		glue= {"stepDefinition"}/*,
		tags= {"@Login"}

*/

)
public class runnerTest {
	@BeforeClass
	public static void setup() {

		ExtentCucumberFormatter.initiateExtentCucumberFormatter();

		ExtentCucumberFormatter.loadConfig(new File("extent-config.xml"));

		ExtentCucumberFormatter.addSystemInfo("Browser name", "Chrome");

		ExtentCucumberFormatter.addSystemInfo("Browser version", "79");


	}


}
