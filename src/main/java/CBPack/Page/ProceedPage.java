 package CBPack.Page;

	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.support.FindBy;
	import org.openqa.selenium.support.PageFactory;

 public class ProceedPage {
		
	WebDriver driver;
	
	@FindBy(className="standard-checkout")
	private WebElement proceedCheckout1;
	
	@FindBy(name="processAddress")
	private WebElement proceedCheckout2;
	
	public ProceedPage(WebDriver driver) {
		
	this.driver=driver;	
	
	PageFactory.initElements(driver, this);
	
	}
	public void proceedCheckout() {
		
	proceedCheckout1.click();
	
	proceedCheckout2.click();
		
		
	}
	}
