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

		@Given("^I naviagate to launch page of the application and click on login link field$")
		public void i_naviagate_to_launch_page_of_the_application() {

		launchPage.SingInPage();

		}
		
		@When("^User enters the Username ([^\"]*) and Password ([^\"]*) into the fields$")
		public void user_enters_the_Username_and_Password_into_the_fields(String username, String password) throws InterruptedException {

		signInPage.DoSignin(Constant.USERNAME,Constant.PASSWORD );

		}

		@Then("^user should be abale to succefully Login$")
		public void user_should_be_abale_to_succefully_Login() {

		String title = signInPage.verifyLoginTitle();

		String message = signInPage.verifyLoginMessage();

		String name = signInPage.verifyUserName();

		Assert.assertEquals("MY ACCOUNT", title);

		//Assert.assertEquals("Welcome to your account. Here you can manage all of your personal information and orders.", message);

		Assert.assertTrue(message.contains("Welcome to your account."));

		Assert.assertEquals("vinit kumar", name);

		String email = signInPage.getLoginEmail();

		Assert.assertEquals(Constant.USERNAME, email);

		}	

	}
