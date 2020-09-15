package Runner;

import java.io.File;
import java.time.LocalDateTime;

//import com.vimalselvam.cucumber.listener.ExtentCucumberFormatter;
//import com.vimalselvam.cucumber.listener.ExtentProperties;
//import com.vimalselvam.cucumber.listener.Reporter;
import com.vimalselvam.cucumber.listener.ExtentProperties;
import com.vimalselvam.cucumber.listener.Reporter;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;

//import com.cucumber.listener.ExtentCucumberFormatter;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(plugin= {"pretty",
		"html:out/cucumber-html-report","json:out/cucumber-report.json",
		"usage:target/cucumber-usage.json",
		"junit:target/cucumber-results.xml",
		"com.vimalselvam.cucumber.listener.ExtentCucumberFormatter:"},

		features= {"features"},

		glue= {"stepDefinition"}

		//tags= {"@Login"}

)
public class runnerTest {
	@BeforeClass
	public static void setup() {

		LocalDateTime date = LocalDateTime.now();

		String fileName    = "target/report_";

		fileName           = fileName+date.toString().replace("-","_").replace(":","_")+ ".html";

		ExtentProperties extentProperties = ExtentProperties.INSTANCE;

		extentProperties.setReportPath(fileName);
	}

	@AfterClass
	public static void teardown() {

		Reporter.setSystemInfo("user", System.getProperty("user.name"));

		Reporter.setSystemInfo("OS", "Windows 10");

		Reporter.setSystemInfo("JAVA Version", "13");

		Reporter.setSystemInfo("Browser name", "Chrome");

		Reporter.setSystemInfo("Browser version", "85");

		Reporter.setTestRunnerOutput("Sample test runner output message");


	}


}
