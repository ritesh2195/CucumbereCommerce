package stepDefinition;

import CBPack.Page.*;
import CBPack.cucumber.TestContext;
import CBPack.util.Constant;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class SearchTest {

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
    static String cartPrice;
    static String finalPrice;
    static String actualPageTitle;
    static String selectedItem;
    static String cartItem;

    public SearchTest(TestContext context){

        testContext=context;

    }

    @Given("^user login into application$")
    public void user_login_into_application()  {

     LaunchPage1=testContext.getPageObjectManager().getLaunchPage();

     LaunchPage1.SingInPage();

     SignPage1=testContext.getPageObjectManager().getSignPage();

     SignPage1.DoSignin(Constant.USERNAME,Constant.PASSWORD );

    }

    @Given("^user search a \"([^\"]*)\"$")
    public void user_search_a(String Product) {

    searchIteamPage=testContext.getPageObjectManager().getSearchIteamPage();

    searchIteamPage.searchItem("dress");

    selectItemPage=testContext.getPageObjectManager().getSelectItemPage();

    selectedItem = selectItemPage.getSelectedProductName();

    selectItemPage.choosingItem();

    }

    @Given("^user click on the add item to cart field$")
    public void user_click_on_the_add_item_to_cart_field() {

    cartPage=testContext.getPageObjectManager().getCartPage();

    cartItem = cartPage.getCartProductName();

    cartPrice = cartPage.getCartPrice();

    cartPage.addCart();

    }

    @Given("^user click on the proceed to checkout field$")
    public void user_click_on_the_proceed_to_checkout_field() {

    proceedPage=testContext.getPageObjectManager().getProceedPage();

    finalPrice = proceedPage.getFinalPrice();

    proceedPage.proceedCheckout();

    }

    @Given("^user click on agree term and proceed to checkout field$")
    public void user_click_on_agree_term_and_proceed_to_checkout_field() {

     termPage=testContext.getPageObjectManager().getTermPage();

     termPage.agreeTerm1();

    }

    @Given("^user add payment method$")
    public void user_add_payment_method() {

     paymentPage=testContext.getPageObjectManager().getPayment();

     paymentPage.payment();

    }

    @When("^user click on the confirm order$")
    public void user_click_on_the_confirm_order() {

    confirmationPage=testContext.getPageObjectManager().getConfirmationPage();

    actualPageTitle = confirmationPage.confirm();

    }

    @Then("^user should be able to place order of the product$")
    public void user_should_be_able_to_place_order_of_the_product() {

    Assert.assertEquals(cartPrice,finalPrice);

    Assert.assertEquals(selectedItem, cartItem);

    Assert.assertEquals("Order confirmation - My Store",actualPageTitle);

    }

}
