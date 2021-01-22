package stepDefinition;

import CBPack.Page.ContactUs;
import CBPack.Page.LaunchPage;
import CBPack.cucumber.TestContext;
import CBPack.mangers.PageObjectManager;
import CBPack.util.Constant;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class ContactUsTest {

    TestContext testContext;
    LaunchPage launchPage;
    ContactUs contactUs;

    public ContactUsTest(TestContext context){

        testContext = context;
    }

    @Given("user is on contact us page")
    public void user_is_on_contact_us_page() {

        launchPage = testContext.getPageObjectManager().getLaunchPage();

        launchPage.getContactUsPage();

    }

    @Given("user choose subject heading")
    public void user_choose_subject_heading() {

        contactUs = testContext.getPageObjectManager().getContactUs();

        contactUs.setSubjectHeading();

    }

    @Given("user enter required details")
    public void user_enter_required_details() {

        contactUs.sendMessage(Constant.USERNAME,Constant.orderReference,Constant.message);

    }

    @When("user click submit button")
    public void user_click_submit_button() {

        contactUs.clickSubmit();

    }

    @Then("user should able to send message successfully")
    public void user_should_able_to_send_message_successfully() {

        String text = contactUs.verifyContactUsFeature();

        Assert.assertEquals("Your message has been successfully sent to our team.",text);

    }
}
