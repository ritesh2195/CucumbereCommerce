 package CBPack.Page;

	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.support.FindBy;
	import org.openqa.selenium.support.PageFactory;

 public class SignInPage extends BasePage {

	@FindBy(id="email")
	private WebElement EmailInput;
	
	@FindBy(id="passwd")
	private WebElement PasswordInput;
	
	@FindBy(id="SubmitLogin")
	private WebElement SubmitButton;

	@FindBy(css = "#center_column h1")
	private WebElement loginElement;

	@FindBy(xpath = "//span[text()='My personal information']")
	private WebElement PersonalInfo;

	@FindBy(css = ".account span")
	private WebElement Name;

	@FindBy(css = "#email")
	private WebElement email;

	@FindBy(css = ".info-account")
	private WebElement loginMessage;

	@FindBy(css = ".alert.alert-danger p")
	private WebElement ErrorMessage;

	@FindBy(css = ".alert.alert-danger ol li")
	private WebElement Authentication;
	
	public SignInPage(WebDriver driver) {

		super(driver);

		PageFactory.initElements(driver, this);
	
	}
	
	public void DoSignin(String username, String password) {
		
	EmailInput.sendKeys(username);
	
	PasswordInput.sendKeys(password);
	
	SubmitButton.click();

	}

	 public String  verifyLoginTitle(){

	 waitForElementVisible(loginElement);

	 return loginElement.getText();

	 }

	 public String verifyLoginMessage(){

		return loginMessage.getText();
	 }

	 public String verifyUserName(){

		return Name.getText();
	 }

	 public String getLoginEmail(){

		waitForElementToClickable(PersonalInfo);

		PersonalInfo.click();

		waitForElementToClickable(email);

		return email.getAttribute("value");
	 }

	 public String getErrorMessage() {

		return ErrorMessage.getText();
	 }

	 public String getAuthenticationMessage() {

		return Authentication.getText();
	 }
 }
