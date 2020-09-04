 package CBPack.Page;

	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.support.FindBy;
	import org.openqa.selenium.support.PageFactory;

 public class SignInPage {
		
	WebDriver driver;
		
	@FindBy(id="email")
	private WebElement EmailInput;
	
	@FindBy(id="passwd")
	private WebElement PasswordInput;
	
	@FindBy(id="SubmitLogin")
	private WebElement SubmitButton;
	
	public SignInPage(WebDriver driver) {
		
	this.driver=driver;
	
	PageFactory.initElements(driver, this);
	
	}
	
	public void DoSignin(String username, String password) {
		
	EmailInput.sendKeys(username);
	
	PasswordInput.sendKeys(password);
	
	SubmitButton.click();
	
//	OrderPage orderPage=new OrderPage(driver);
//	
//	PageFactory.initElements(driver, orderPage);
//	
//	orderPage.Order(Constant.Search_Box);
	
		
	}
	
	}
