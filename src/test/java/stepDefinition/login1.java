	package stepDefinition;

	import CBPack.Page.*;
	import CBPack.cucumber.TestContext;
	import CBPack.mangers.PageObjectManager;
	import CBPack.mangers.WebDriverManager;
	import org.openqa.selenium.JavascriptExecutor;
	import org.openqa.selenium.WebDriver;
	import CBPack.util.Constant;
	import cucumber.api.java.en.And;
	import cucumber.api.java.en.Given;
	import cucumber.api.java.en.Then;
	import cucumber.api.java.en.When;
	
	public class login1  {

		 CartPage cartPage;
		 TermPage termPage;
		 ConfirmationPage confirmationPage;
		 LaunchPage LaunchPage1;
		 Payment paymentPage;
		 ProceedPage proceedPage;
		 SearchItemPage searchIteamPage;
		 SelectItem selectItemPage;
		 SignInPage SignPage1;
		 VerifyingPage verifyingPage;
		 PageObjectManager pageObjectManager;
		WebDriverManager webDriverManager;
		WebDriver driver;
		TestContext testContext;

		public login1(TestContext context){

			testContext=context;
		}

		@Given("^I naviagate to launch page of the application and click on login link field$")
		public void i_naviagate_to_launch_page_of_the_application() {

		LaunchPage1=testContext.getPageObjectManager().getLaunchPage();

	    //pageObjectManager = new PageObjectManager(driver);

	    //LaunchPage1 = pageObjectManager.getLaunchPage();

	    LaunchPage1.SingInPage();

		}
		
		@When("^User enters the Username ([^\"]*) and Password ([^\"]*) into the fields$")
		public void user_enters_the_Username_and_Password_into_the_fields(String username, String password) throws InterruptedException {

		SignPage1=testContext.getPageObjectManager().getSignPage();

	    //SignPage1 = pageObjectManager.getSignPage();

		SignPage1.DoSignin(Constant.USERNAME,Constant.PASSWORD );
		
		Thread.sleep(5000);
			
		}


		@Then("^user should be abale to succefully Login$")
		public void user_should_be_abale_to_succefully_Login() throws InterruptedException  {

		verifyingPage=testContext.getPageObjectManager().getVerifyingPage();

		verifyingPage.verifyLogin();

		Thread.sleep(5000);
		
		}	
		
		@Given("^I type ([^\"]*) in the search box and click on the search button field$")
		public void I_type_item_in_the_search_box(String items) {

		searchIteamPage=testContext.getPageObjectManager().getSearchIteamPage();

	    //searchIteamPage = pageObjectManager.getSearchIteamPage();

		searchIteamPage.searchItem("dress");
			
		}
		
		@And("^I select the particular item and click on the particular item$")
		public void I_select_the_particular_item() {

		selectItemPage=testContext.getPageObjectManager().getSelectItemPage();

	    //selectItemPage = pageObjectManager.getSelectItemPage();

		selectItemPage.choosingItem();
			
		}
		
		@When("^I click on the add item to cart field$")
		public void I_click_on_the_add_item_to_cart_field() throws InterruptedException {

		cartPage=testContext.getPageObjectManager().getCartPage();

	    //cartPage = pageObjectManager.getCartPage();

		try {
			
		cartPage.addCart();
		
		}catch(Exception e)	{
			
		e.printStackTrace();
		
		Thread.sleep(5000);
		}
		}
		
		@And("^I click on the proceed to checkout field$")
		public void I_click_on_the_proceed_to_checkout_field() {

		proceedPage=testContext.getPageObjectManager().getProceedPage();

	    //proceedPage = pageObjectManager.getProceedPage();

		proceedPage.proceedCheckout();
			
		}
		
		@Then("^I click on agree term and proceed to checkout field$")
		public void I_click_on_agree_term_and_proceed_to_checkout_field() {

		termPage=testContext.getPageObjectManager().getTermPage();

	    //termPage = pageObjectManager.getTermPage();

		termPage.agreeTerm1();
			
		}
		
		@And("^I click on the payment field$")
		public void I_click_on_the_payment_field() throws InterruptedException {

		paymentPage=testContext.getPageObjectManager().getPayment();

	    //paymentPage = pageObjectManager.getPayment();

		paymentPage.payment();
		
		Thread.sleep(10000);
		
		//JavascriptExecutor jsExec = (JavascriptExecutor)driver;

		//jsExec.executeScript("window.scrollBy(0,600)");

		}
		
		@Then("^I click on the confirm my order field$")
		public void I_click_on_the_confirm_my_order_field() throws InterruptedException {

		confirmationPage=testContext.getPageObjectManager().getConfirmationPage();

	    //confirmationPage = pageObjectManager.getConfirmationPage();

		confirmationPage.confirm();
		
		Thread.sleep(10000);
			
		}

		//@After("@Login")
		public void closingBrowser() {

		//driver.quit();

		}

	}
