	package stepDefinition;

	import CBPack.Page.*;
	import CBPack.cucumber.TestContext;
	import io.cucumber.java.en.Given;
	import io.cucumber.java.en.Then;
	import io.cucumber.java.en.When;
	import org.junit.Assert;
	import CBPack.util.Constant;

	
	public class LoginTest {

		 LaunchPage LaunchPage1;
		 SignInPage signInPage;
		 VerifyingPage verifyingPage;
		 TestContext testContext;

		public LoginTest(TestContext context){

		testContext=context;

		}

		@Given("^I naviagate to launch page of the application and click on login link field$")
		public void i_naviagate_to_launch_page_of_the_application() {

		LaunchPage1=testContext.getPageObjectManager().getLaunchPage();

	        LaunchPage1.SingInPage();

		}
		
		@When("^User enters the Username ([^\"]*) and Password ([^\"]*) into the fields$")
		public void user_enters_the_Username_and_Password_into_the_fields(String username, String password) throws InterruptedException {

		signInPage=testContext.getPageObjectManager().getSignPage();

		signInPage.DoSignin(Constant.USERNAME,Constant.PASSWORD );

		}

		@Then("^user should be abale to succefully Login$")
		public void user_should_be_abale_to_succefully_Login() {

		verifyingPage=testContext.getPageObjectManager().getVerifyingPage();

		String title = signInPage.verifyLoginTitle();

		String message = signInPage.verifyLoginMessage();

		Assert.assertEquals("MY ACCOUNT", title);

		Assert.assertEquals("Welcome to your account. Here you can manage all of your personal information and orders.", message);

		String email = signInPage.getLoginEmail();

		Assert.assertEquals(Constant.USERNAME, email);

		}	

	}
