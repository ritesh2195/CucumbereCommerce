package stepDefinition;


import CBPack.cucumber.TestContext;
import CBPack.mangers.WebDriverManager;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;


public class Hooks {

    TestContext testContext;
    WebDriverManager webDriverManager;

    public Hooks(TestContext context) {

        testContext = context;

    }

    @Before
    public void BeforeSteps() {

        webDriverManager = testContext.getWebDriverManager();

        webDriverManager.getDriver();


    }

    @After
    public void AfterSteps(Scenario scenario) {

        if (scenario.isFailed()) {

        String screenshotName = scenario.getName().replaceAll(" ", "_");

        byte[] sourcePath = ((TakesScreenshot) webDriverManager.getDriver()).getScreenshotAs(OutputType.BYTES);

        scenario.attach(sourcePath, "image/png", screenshotName);

        }

        testContext.getWebDriverManager().closeDriver();
    }
}
