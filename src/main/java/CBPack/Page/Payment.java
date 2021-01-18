 package CBPack.Page;

	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.support.FindBy;
	import org.openqa.selenium.support.PageFactory;

 public class Payment extends BasePage {

		@FindBy(xpath="//*[text()='(order processing will be longer)']")
		private WebElement PaymentOption1;
		
		@FindBy(xpath="//*[@title='Pay by check.']")
		private WebElement PaymentOption2;
		
		public Payment(WebDriver driver) {

			super(driver);

			PageFactory.initElements(driver, this);
		
		}
		public void payment() {
			
		//PaymentOption1.click();
		
		PaymentOption2.click();
			
			
		}	
		
	}
