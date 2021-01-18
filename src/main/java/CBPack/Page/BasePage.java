package CBPack.Page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class BasePage extends Pages {


    BasePage(WebDriver driver) {

        super(driver);

    }

    @Override
    public String getPageTitle() {

        return driver.getTitle();
    }

    @Override
    public void waitForElementVisible(WebElement element) {

        wait.until(ExpectedConditions.visibilityOf(element));

    }

    @Override
    public void waitForElementToClickable(WebElement element) {

        wait.until(ExpectedConditions.elementToBeClickable(element));

    }

    @Override
    public void waitForPageTitle(String title) {

        wait.until(ExpectedConditions.titleContains(title));

    }
}
