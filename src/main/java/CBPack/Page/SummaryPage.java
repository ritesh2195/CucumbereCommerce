 package CBPack.Page;

	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.support.FindAll;
	import org.openqa.selenium.support.FindBy;
	import org.openqa.selenium.support.PageFactory;

	import java.util.List;

 public class SummaryPage extends BasePage {

	@FindBy(className="standard-checkout")
	private WebElement proceedCheckout1;
	
	@FindBy(name="processAddress")
	private WebElement proceedCheckout2;

	@FindBy(id = "total_product")
	private WebElement ProductPrice;

	@FindBy(css = "#total_shipping")
	private WebElement ShippingPrice;

	@FindBy(css = "#total_product")
	private WebElement  TotalProductPrice;

	@FindBy(css = "#total_tax")
	private WebElement Tax;

	@FindBy(css = "#total_price_container")
	private WebElement GrandTotal;
	
	public SummaryPage(WebDriver driver) {

		super(driver);

		PageFactory.initElements(driver, this);
	
	}
	public void proceedCheckout() {

	waitForElementToClickable(proceedCheckout1);
		
	proceedCheckout1.click();

	waitForElementToClickable(proceedCheckout2);
	
	proceedCheckout2.click();

	}

	public String getFinalPrice(){

		return ProductPrice.getText();
	}

	public double getTotalPrice(){

		double d = Double.parseDouble(TotalProductPrice.getText().substring(1).trim());

		double t = Double.parseDouble(Tax.getText().substring(1).trim());

		double s = Double.parseDouble(ShippingPrice.getText().substring(1).trim());

		return d+t+s;


	}

	public double getGrandTotal(){

		String txt = GrandTotal.getText();

		txt = txt.substring(1).trim();

		return Double.parseDouble(txt);
	}

	}
