package stepDefinition;


import CBPack.cucumber.TestContext;
import CBPack.mangers.WebDriverManager;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import org.openqa.selenium.WebDriver;

public class Hooks {

    TestContext testContext;
    WebDriverManager webDriverManager;

    public Hooks(TestContext context){

        testContext=context;

    }

    @Before
    public void BeforeSteps(){

        webDriverManager=testContext.getWebDriverManager();

        webDriverManager.getDriver();


    }

    @After
    public void AfterSteps(){

        testContext.getWebDriverManager().closeDriver();

    }
}
