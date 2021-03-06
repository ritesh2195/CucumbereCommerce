 package CBPack.Page;

	import org.openqa.selenium.WebDriver;
        import org.openqa.selenium.WebElement;
        import org.openqa.selenium.support.FindBy;
	import org.openqa.selenium.support.PageFactory;

 public class ConfirmationPage extends BasePage {

	@FindBy(xpath="//*[text()='I confirm my order']")
	private WebElement confirmOrder;

	@FindBy(css = ".alert.alert-success")
	private WebElement Message;
	
	public ConfirmationPage(WebDriver driver) {

		super(driver);

		PageFactory.initElements(driver, this);
	
	}
	
	public String confirm() {

	waitForElementToClickable(confirmOrder);
		
	confirmOrder.click();

	return getPageTitle();
		
	}

	public String verifyConfirmationMessage(){

		return Message.getText();

	}

	}
