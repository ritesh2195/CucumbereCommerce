 package CBPack.Page;

	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.support.FindBy;
	import org.openqa.selenium.support.PageFactory;
	import org.openqa.selenium.support.ui.Select;
        import org.openqa.selenium.support.ui.ExpectedConditions;
	import org.openqa.selenium.support.ui.WebDriverWait;
	
	public class CartPage extends BasePage {

	@FindBy(xpath="//*[text()='Add to cart']")
	private WebElement addToCart;
	
	@FindBy(id="quantity_wanted")
	private WebElement qualityWanted;
	
	@FindBy(id="group_1")
	private WebElement Size;
	
	@FindBy(id="color_13")
	private WebElement Colour;
	
	@FindBy(xpath="//*[@title='Proceed to checkout']")
	private WebElement ProceedToCheckout;
	
	public CartPage(WebDriver driver) {

		super(driver);

		PageFactory.initElements(driver, this);
	
	}
	
	public void addCart() {
		
	qualityWanted.clear();
	
	qualityWanted.sendKeys("2");
	
	Select select=new Select(Size);
	
	select.selectByValue("2");
	
	Colour.click();
	
	addToCart.click();
	
	waitForElementToClickable(ProceedToCheckout);
	
	ProceedToCheckout.click();
	
	}
	
	}
