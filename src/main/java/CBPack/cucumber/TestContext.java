package CBPack.cucumber;

import CBPack.mangers.PageObjectManager;
import CBPack.mangers.WebDriverManager;

public class TestContext {

    private WebDriverManager webDriverManager;
    private PageObjectManager pageObjectManager;

    public TestContext(){

        webDriverManager=new WebDriverManager();

        pageObjectManager=new PageObjectManager(webDriverManager.getDriver());
    }

    public WebDriverManager getWebDriverManager(){

        return webDriverManager;
    }

    public PageObjectManager getPageObjectManager(){

        return pageObjectManager;
    }
}
