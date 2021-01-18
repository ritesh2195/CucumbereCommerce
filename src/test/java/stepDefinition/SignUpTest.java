package stepDefinition;

import CBPack.Page.LaunchPage;
import CBPack.Page.SignUpPage;
import CBPack.Page.VerifyingPage;
import CBPack.cucumber.TestContext;
import CBPack.mangers.PageObjectManager;
import CBPack.mangers.WebDriverManager;
import CBPack.util.RandomDataGenerator;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;

public class SignUpTest {

    PageObjectManager pageObjectManager;
    SignUpPage signUpPage;
    LaunchPage launchPage;
    WebDriverManager webDriverManager;
    WebDriver driver;
    TestContext testContext;
    VerifyingPage verifyingPage;

    public SignUpTest(TestContext context){

        testContext=context;
    }

    @Given("^user navigate application url$")
    public void user_navigate_application_url() {

     pageObjectManager = testContext.getPageObjectManager();

     launchPage= pageObjectManager.getLaunchPage();

     launchPage.SingInPage();

    }

    @And("^user enter email id$")
    public void user_enter_email_id(){

     signUpPage = pageObjectManager.getSignUpPage();

     signUpPage.setEmail(RandomDataGenerator.generateEmail());

    }

    @And("^user enter his personal information$")
    public void user_enter_his_personal_information() {

      signUpPage.setTitle("Male");

      signUpPage.setCustomer_firstName(RandomDataGenerator.generateFirstName());

      signUpPage.setCustomer_lastName(RandomDataGenerator.generateLastName());

      signUpPage.setEmail_id(RandomDataGenerator.generateEmail());

      signUpPage.setPassword(RandomDataGenerator.generatePassword());

      signUpPage.setDOB("21","12","1994");



    }

    @And("^user enter valid address$")
    public void user_enter_valid_address()  {

     signUpPage.setCompanyName(RandomDataGenerator.generateCompanyName());

     signUpPage.setAddress1(RandomDataGenerator.generateAddress());

     signUpPage.setCityName(RandomDataGenerator.generateCityName());

     signUpPage.setStateName(RandomDataGenerator.StateName());

     signUpPage.setZipCode();

     signUpPage.setCountry();

     signUpPage.setAnyOtherInformation(RandomDataGenerator.generateInformation());

     signUpPage.setMobilePhone(RandomDataGenerator.generateMobile());

    }

    @When("^user click on register button$")
    public void user_click_on_register_button(){

     signUpPage.clickSubmit();

    }

    @Then("^user should be abale to succefully Register$")
    public void user_should_be_abale_to_succefully_Register()  {

     verifyingPage = pageObjectManager.getVerifyingPage();

     String text = verifyingPage.validateSignUpTest();

     Assert.assertEquals(text,"Welcome to your account. Here you can manage all of your personal information and orders.");


    }

}
