 package CBPack.Page;

	import org.openqa.selenium.WebDriver;
        import org.openqa.selenium.WebElement;
        import org.openqa.selenium.support.FindBy;
	import org.openqa.selenium.support.PageFactory;

 public class ConfirmationPage extends BasePage {

	@FindBy(xpath="//*[text()='I confirm my order']")
	private WebElement confirmOrder;
	
	public ConfirmationPage(WebDriver driver) {

		super(driver);

		PageFactory.initElements(driver, this);
	
	}
	
	public void confirm() {

	waitForElementToClickable(confirmOrder);
		
	confirmOrder.click();
		
	}
	
	}
