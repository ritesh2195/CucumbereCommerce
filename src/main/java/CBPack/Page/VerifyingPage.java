package CBPack.Page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class VerifyingPage extends BasePage {

    WebDriver driver;

    @FindBy(css = "#center_column h1")
    private WebElement loginElement;
    
    @FindBy(xpath = "//div[@id='center_column']//p")
    private WebElement SignUpElement;

    public VerifyingPage(WebDriver driver){

        super(driver);

        PageFactory.initElements(driver,this);

    }

    public String  verifyLogin(){

        //waitForElementVisible(loginElement);

        return loginElement.getText();

    }
    
    public String validateSignUpTest(){

       return SignUpElement.getText();
    }
}
