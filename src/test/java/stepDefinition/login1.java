	package stepDefinition;

	import CBPack.Page.*;
	import CBPack.cucumber.TestContext;
	import CBPack.mangers.PageObjectManager;
	import CBPack.mangers.WebDriverManager;
	import org.junit.Assert;
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
		 TestContext testContext;

		public login1(TestContext context){

		testContext=context;
		}

		@Given("^I naviagate to launch page of the application and click on login link field$")
		public void i_naviagate_to_launch_page_of_the_application() {

		LaunchPage1=testContext.getPageObjectManager().getLaunchPage();

	        LaunchPage1.SingInPage();

		}
		
		@When("^User enters the Username ([^\"]*) and Password ([^\"]*) into the fields$")
		public void user_enters_the_Username_and_Password_into_the_fields(String username, String password) throws InterruptedException {

		SignPage1=testContext.getPageObjectManager().getSignPage();

		SignPage1.DoSignin(Constant.USERNAME,Constant.PASSWORD );

		}

		@Then("^user should be abale to succefully Login$")
		public void user_should_be_abale_to_succefully_Login() {

		verifyingPage=testContext.getPageObjectManager().getVerifyingPage();

		boolean status = verifyingPage.verifyLogin();

		Assert.assertTrue(status);

		}	
		
		@Given("^I type ([^\"]*) in the search box and click on the search button field$")
		public void I_type_item_in_the_search_box(String items) {

		searchIteamPage=testContext.getPageObjectManager().getSearchIteamPage();

		searchIteamPage.searchItem("dress");
			
		}
		
		@And("^I select the particular item and click on the particular item$")
		public void I_select_the_particular_item() {

		selectItemPage=testContext.getPageObjectManager().getSelectItemPage();

		selectItemPage.choosingItem();
			
		}
		
		@When("^I click on the add item to cart field$")
		public void I_click_on_the_add_item_to_cart_field() {

		cartPage=testContext.getPageObjectManager().getCartPage();

		cartPage.addCart();

		}
		@And("^I click on the proceed to checkout field$")
		public void I_click_on_the_proceed_to_checkout_field() {

		proceedPage=testContext.getPageObjectManager().getProceedPage();

		proceedPage.proceedCheckout();
			
		}
		
		@Then("^I click on agree term and proceed to checkout field$")
		public void I_click_on_agree_term_and_proceed_to_checkout_field() {

		termPage=testContext.getPageObjectManager().getTermPage();

		termPage.agreeTerm1();
			
		}
		
		@And("^I click on the payment field$")
		public void I_click_on_the_payment_field() {

		paymentPage=testContext.getPageObjectManager().getPayment();

		paymentPage.payment();

		}
		
		@Then("^I click on the confirm my order field$")
		public void I_click_on_the_confirm_my_order_field() {

		confirmationPage=testContext.getPageObjectManager().getConfirmationPage();

		confirmationPage.confirm();

		}

	}
