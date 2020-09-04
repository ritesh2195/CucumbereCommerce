      package CBPack.Page;

	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.support.FindBy;
	import org.openqa.selenium.support.PageFactory;

	  public class TermPage {
	
		WebDriver driver;
		
		@FindBy(id="cgv")
		private WebElement agreeTerm1;
		
		@FindBy(name="processCarrier")
		private WebElement proceedCheckout3;
		
		public TermPage(WebDriver driver) {
			
		this.driver=driver;	
		
		PageFactory.initElements(driver, this);
		
		}
		public void agreeTerm1() {
			
		agreeTerm1.click();
		
		proceedCheckout3.click();
			
			
		}	
		
	}
