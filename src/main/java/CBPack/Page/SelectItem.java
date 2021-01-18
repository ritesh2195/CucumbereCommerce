 package CBPack.Page;

     import org.openqa.selenium.WebDriver;
     import org.openqa.selenium.WebElement;
     import org.openqa.selenium.support.FindBy;
	 import org.openqa.selenium.support.PageFactory;

 public class SelectItem extends BasePage {

	@FindBy(xpath="//*[@title='Printed Summer Dress']")
	private WebElement PrintedSummerDress;
	
	@FindBy(xpath="//*[@title='Printed Dress']")
	private WebElement PrintedDress;
	
	@FindBy(xpath="//*[@title='Blouse']")
	private WebElement Blouse;
	
	@FindBy(xpath="//*[@title='Printed Chiffon Dress']")
	private WebElement PrintedChiffonDress;
	
	public SelectItem(WebDriver driver) {

		super(driver);

		PageFactory.initElements(driver, this);
	
	}
	
	public void choosingItem() {
		
	PrintedSummerDress.click();
		
	}
	}
