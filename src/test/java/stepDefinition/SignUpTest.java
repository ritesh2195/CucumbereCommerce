package stepDefinition;

import CBPack.Page.LaunchPage;
import CBPack.Page.SignUpPage;
import CBPack.cucumber.TestContext;
import CBPack.util.RandomDataGenerator;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class SignUpTest {

    SignUpPage signUpPage;
    LaunchPage launchPage;
    TestContext testContext;
    static String expectedEmail = RandomDataGenerator.generateEmail();

    public SignUpTest(TestContext context){

        testContext=context;

        launchPage = testContext.getPageObjectManager().getLaunchPage();

        signUpPage = testContext.getPageObjectManager().getSignUpPage();


    }

    @Given("^user navigate application url$")
    public void user_navigate_application_url() {

     launchPage.SingInPage();

    }

    @When("^user enter email id$")
    public void user_enter_email_id(){

     signUpPage.setEmail(expectedEmail);

    }

    @And("^user enter his personal information$")
    public void user_enter_his_personal_information() {

      signUpPage.setTitle("Male");

      signUpPage.setCustomer_firstName(RandomDataGenerator.generateFirstName());

      signUpPage.setCustomer_lastName(RandomDataGenerator.generateLastName());

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

    @And("^user click on register button$")
    public void user_click_on_register_button(){

     signUpPage.clickSubmit();

    }

    @Then("^user should be abale to succefully Register$")
    public void user_should_be_abale_to_succefully_Register()  {

     String title = signUpPage.verifySignUpTitle();

     String msg = signUpPage.verifySognUpMessage();

     String actualEmail = signUpPage.getSignUpEmail();

     Assert.assertEquals("Welcome to your account. Here you can manage all of your personal information and orders.", msg);

     Assert.assertEquals(expectedEmail.toLowerCase(),actualEmail.toLowerCase());


    }

}
