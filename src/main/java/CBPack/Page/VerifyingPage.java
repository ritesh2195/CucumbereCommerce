package CBPack.Page;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class VerifyingPage {

    WebDriver driver;

    @FindBy(xpath = "//*[text()='My account']")
    private WebElement loginElement;
    
    @FindBy(xpath = "//div[@id='center_column']//p")
    private WebElement SignUpElement;

    public VerifyingPage(WebDriver driver){

        this.driver=driver;

        PageFactory.initElements(driver,this);

    }

    public boolean  verifyLogin(){

        return (loginElement.isDisplayed());

    }
    
    public String validateSignUpTest(){

       return SignUpElement.getText();
    }
}
