package CBPack.Page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import java.io.IOException;

public class ContactUs extends BasePage {

    @FindBy(css = "#id_contact")
    private WebElement SubjectHeading;

    @FindBy(css = "#email")
    private WebElement Email;

    @FindBy(css = "#id_order")
    private WebElement OrderReference;

    @FindBy(css = "#uniform-fileUpload")
    private WebElement AttachFile;

    @FindBy(css = "#message")
    private WebElement Message;

    @FindBy(css = "#submitMessage")
    private WebElement Submit;

    @FindBy(css = ".alert")
    private WebElement verifyMessage;

    public ContactUs(WebDriver driver) {

        super(driver);

        PageFactory.initElements(driver,this);

    }

    public void setSubjectHeading(){

        Select select = new Select(SubjectHeading);

        select.selectByVisibleText("Customer service");

    }

    public void sendMessage(String emai, String orderReference, String message){

        Email.sendKeys(emai);

        OrderReference.sendKeys(orderReference);

        AttachFile.click();

        try {

            Runtime.getRuntime().exec("D:\\JavaScript\\automationpractice.exe");

        } catch (IOException e) {

            e.printStackTrace();
        }

        waitForElementVisible(Message);

        Message.sendKeys(message);

    }

    public void clickSubmit(){

        Submit.click();
    }

    public String verifyContactUsFeature(){

        return verifyMessage.getText();
    }
}
