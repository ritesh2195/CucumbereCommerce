  package CBPack.Page;

	import CBPack.dataProviders.ConfigFileReader;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.support.FindBy;
	import org.openqa.selenium.support.PageFactory;

  public class LaunchPage  {

  	ConfigFileReader configFileReader;

	WebDriver driver;
	
	@FindBy(xpath="//*[text()='Contact us']")
	private WebElement Contactus;
	
	@FindBy(xpath="//*[@title='Log in to your customer account']")
	private WebElement Signin;
	
	@FindBy(id="search_query_top")
	private WebElement Search;
	
	@FindBy(name="submit_search")
	private WebElement SubmitSearch;
	
	public LaunchPage(WebDriver driver) {
		
	this.driver=driver;	
	
	PageFactory.initElements(driver, this);

	configFileReader = new ConfigFileReader();
		
	}
//	  public void navigateTo_HomePage() {
//
//		driver.get(configFileReader.getApplicationUrl());
//
//	  }
	public void SingInPage() {
		
	driver.get(configFileReader.getApplicationUrl());

		try {

			Thread.sleep(5000);

		} catch (InterruptedException e) {

			e.printStackTrace();
		}

		Signin.click();
		
	}
		
	}
