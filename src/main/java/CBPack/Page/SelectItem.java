 package CBPack.Page;

     import org.openqa.selenium.WebDriver;
     import org.openqa.selenium.WebElement;
	 import org.openqa.selenium.support.FindAll;
	 import org.openqa.selenium.support.FindBy;
	 import org.openqa.selenium.support.PageFactory;

	 import java.util.List;

 public class SelectItem extends BasePage {

	@FindBy(xpath="//*[@title='Printed Summer Dress']")
	private WebElement PrintedSummerDress;

	@FindAll(@FindBy(css = ".product-name"))
	private List<WebElement> SelectProduct;
	
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
		
	SelectProduct.get(1).click();
		
	}

	public String getSelectedProductName(){

		return SelectProduct.get(1).getText();

	}

	}
