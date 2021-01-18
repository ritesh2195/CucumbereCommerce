 package CBPack.Page;

   import org.openqa.selenium.WebDriver;
   import org.openqa.selenium.WebElement;
   import org.openqa.selenium.support.FindBy;
   import org.openqa.selenium.support.PageFactory;

 public class SearchItemPage extends BasePage {

	@FindBy(id="search_query_top")
	private WebElement Search;
		
	@FindBy(name="submit_search")
	private WebElement SubmitSearch;
	
	public SearchItemPage(WebDriver driver) {

		super(driver);

		PageFactory.initElements(driver, this);
		
	}
	
	public void searchItem(String text) {

	waitForElementVisible(Search);
		
	Search.sendKeys(text);
	
	SubmitSearch.click();
		
		
	}
}
