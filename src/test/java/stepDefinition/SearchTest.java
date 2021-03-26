package stepDefinition;

import CBPack.Page.*;
import CBPack.cucumber.TestContext;
import CBPack.enums.Context;
import CBPack.util.Constant;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

import java.util.HashMap;

public class SearchTest {

    CartPage cartPage;
    ShippingPage termPage;
    ConfirmationPage confirmationPage;
    LaunchPage launchPage;
    Payment paymentPage;
    SummaryPage proceedPage;
    SearchItemPage searchIteamPage;
    SelectItem selectItemPage;
    SignInPage signInPage;
    TestContext testContext;
    static String actualPageTitle;

    public SearchTest(TestContext context){

     testContext=context;

     launchPage=testContext.getPageObjectManager().getLaunchPage();

     signInPage=testContext.getPageObjectManager().getSignPage();

     searchIteamPage=testContext.getPageObjectManager().getSearchIteamPage();

     selectItemPage=testContext.getPageObjectManager().getSelectItemPage();

     proceedPage=testContext.getPageObjectManager().getProceedPage();

     termPage=testContext.getPageObjectManager().getTermPage();

     paymentPage=testContext.getPageObjectManager().getPayment();

     confirmationPage=testContext.getPageObjectManager().getConfirmationPage();

    }

    @Given("^user login into application$")
    public void user_login_into_application() {

     launchPage.SingInPage();

     signInPage.DoSignin(Constant.USERNAME,Constant.PASSWORD );

     HashMap<String, String> map = signInPage.verifyLoginTest();

     String title = map.get("title");

     Assert.assertEquals("MY ACCOUNT", title);

     String message = map.get("message");

     Assert.assertTrue(message.contains("Welcome to your account."));

    }

    @When("^user search a \"([^\"]*)\"$")
    public void user_search_a(String Product) {

    searchIteamPage.searchItem(Product);

    String selectedItem = selectItemPage.getSelectedProductName();

    testContext.getScenarioContext().setContext(Context.PRODUCT_NAME, selectedItem);

    selectItemPage.choosingItem();

    }

    @When("^user click on the add item to cart field$")
    public void user_click_on_the_add_item_to_cart_field() {

    cartPage=testContext.getPageObjectManager().getCartPage();

    String cartItem = cartPage.getCartProductName();

    String selectedProduct = (String)testContext.getScenarioContext().getContext(Context.PRODUCT_NAME);

    Assert.assertEquals(selectedProduct, cartItem);

    String cartPrice = cartPage.getCartPrice();

    cartPrice = cartPrice.substring(1).trim();

    double cartAmount = Double.parseDouble(cartPrice);

    testContext.getScenarioContext().setContext(Context.Product_PRICE, cartAmount);

    cartPage.addCart(Constant.quantity,Constant.size);

    }

    @When("^user click on the proceed to checkout field$")
    public void user_click_on_the_proceed_to_checkout_field() {

    String finalPrice = proceedPage.getFinalPrice();

    finalPrice = finalPrice.substring(1).trim();

    double finalAmount = Double.parseDouble(finalPrice);

    Double cartAmount = (Double) testContext.getScenarioContext().getContext(Context.Product_PRICE);

    Assert.assertEquals(Constant.quantity*cartAmount, finalAmount, .01);

    double totalPrice = proceedPage.getTotalPrice();

    double grandTotalPrice = proceedPage.getGrandTotal();

    Assert.assertEquals(totalPrice, grandTotalPrice,.01);

    proceedPage.proceedCheckout();

    }

    @When("^user click on agree term and proceed to checkout field$")
    public void user_click_on_agree_term_and_proceed_to_checkout_field() {

     termPage.agreeTerm1();

    }

    @When("^user add payment method$")
    public void user_add_payment_method() {

     paymentPage.payment();

    }

    @When("^user click on the confirm order$")
    public void user_click_on_the_confirm_order() {

    actualPageTitle = confirmationPage.confirm();

    }

    @Then("^user should be able to place order of the product$")
    public void user_should_be_able_to_place_order_of_the_product() {

    Assert.assertEquals("Order confirmation - My Store",actualPageTitle);

    String msg = confirmationPage.verifyConfirmationMessage();

    Assert.assertEquals("Your order on My Store is complete.", msg);

    }

}
