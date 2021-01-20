  package CBPack.Page;

	import CBPack.dataProviders.ConfigFileReader;
	import CBPack.mangers.FileReaderManager;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.support.FindBy;
	import org.openqa.selenium.support.PageFactory;

  public class LaunchPage extends BasePage  {

  	ConfigFileReader configFileReader;

	@FindBy(xpath="//*[text()='Contact us']")
	private WebElement Contactus;
	
	@FindBy(xpath="//*[@title='Log in to your customer account']")
	private WebElement Signin;
	
	@FindBy(id="search_query_top")
	private WebElement Search;
	
	@FindBy(name="submit_search")
	private WebElement SubmitSearch;
	
	public LaunchPage(WebDriver driver) {
		super(driver);

		PageFactory.initElements(driver, this);

	}

	public void SingInPage() {

	String url = FileReaderManager.getInstance().getConfigReader().getApplicationUrl();

	driver.get(url);

	waitForElementToClickable(Signin);

	Signin.click();
		
	}
		
	}
