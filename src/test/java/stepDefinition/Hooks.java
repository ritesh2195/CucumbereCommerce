package stepDefinition;


import CBPack.cucumber.TestContext;
import CBPack.mangers.WebDriverManager;
import io.cucumber.java.After;
import io.cucumber.java.Before;


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
