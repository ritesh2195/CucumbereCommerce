 package CBPack.Page;

	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.support.FindBy;
	import org.openqa.selenium.support.PageFactory;

 public class ProceedPage extends BasePage {

	@FindBy(className="standard-checkout")
	private WebElement proceedCheckout1;
	
	@FindBy(name="processAddress")
	private WebElement proceedCheckout2;

	@FindBy(id = "total_product")
	private WebElement ProductPrice;
	
	public ProceedPage(WebDriver driver) {

		super(driver);

		PageFactory.initElements(driver, this);
	
	}
	public void proceedCheckout() {

	waitForElementToClickable(proceedCheckout1);
		
	proceedCheckout1.click();

	waitForElementToClickable(proceedCheckout2);
	
	proceedCheckout2.click();

	}

	public String getFinalPrice(){

		return ProductPrice.getText();
	}

	}
