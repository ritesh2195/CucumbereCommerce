	package stepDefinition;

	import CBPack.Page.*;
	import CBPack.cucumber.TestContext;
	import io.cucumber.java.en.Given;
	import io.cucumber.java.en.Then;
	import io.cucumber.java.en.When;
	import org.junit.Assert;
	import CBPack.util.Constant;

	
	public class LoginTest {

		LaunchPage launchPage;
		SignInPage signInPage;
		TestContext testContext;

		public LoginTest(TestContext context){

		testContext=context;

		launchPage=testContext.getPageObjectManager().getLaunchPage();

		signInPage=testContext.getPageObjectManager().getSignPage();

		}

		@Given("^user navigate to login page$")
		public void i_naviagate_to_launch_page_of_the_application() {

		launchPage.SingInPage();

		}
		
		@When("^user enters the Username ([^\"]*) and Password ([^\"]*) into the fields$")
		public void user_enters_the_Username_and_Password_into_the_fields(String username, String password) throws InterruptedException {

		signInPage.DoSignin(Constant.USERNAME,Constant.PASSWORD );

		}

		@Then("^user should be able to login successfully$")
		public void user_should_be_abale_to_succefully_Login() {

		String title = signInPage.verifyLoginTitle();

		String message = signInPage.verifyLoginMessage();

		String name = signInPage.verifyUserName();

		Assert.assertEquals("MY ACCOUNT", title);

		Assert.assertTrue(message.contains("Welcome to your account."));

		Assert.assertEquals("vinit kumar", name);

		String email = signInPage.getLoginEmail();

		Assert.assertEquals(Constant.USERNAME, email);

		}

		@When("user enters invalid sets of {string} and {string} and click on login button")
		public void user_enters_invalid_sets_of_and_and_click_on_login_button(String email, String password) {

			signInPage.DoSignin(email,password);

		}

		@Then("user should not be able to login successfully")
		public void user_should_not_be_able_to_login_successfully() {

			String errorMessage = signInPage.getErrorMessage();

			Assert.assertTrue(errorMessage.contains("There is 1 error"));

			String authentication = signInPage.getAuthenticationMessage();

			Assert.assertTrue(authentication.contains("Authentication failed."));

		}

	}
