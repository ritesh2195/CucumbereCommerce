package CBPack.mangers;

import CBPack.Page.*;
import org.openqa.selenium.WebDriver;

public class PageObjectManager {

    private WebDriver driver;
    private CartPage cartPage;
    private ShippingPage termPage;
    private ConfirmationPage confirmationPage;
    private LaunchPage LaunchPage1;
    private Payment paymentPage;
    private SummaryPage proceedPage;
    private SearchItemPage searchIteamPage;
    private SelectItem selectItemPage;
    private SignInPage SignPage1;
    private SignUpPage signUpPage;
    private VerifyingPage verifyingPage;
    private ContactUs contactUs;

    public PageObjectManager(WebDriver driver){

        this.driver=driver;
    }

    public CartPage getCartPage(){
        return (cartPage==null) ? cartPage=new CartPage(driver) : cartPage;
    }

    public ShippingPage getTermPage() {
        return (termPage==null) ? termPage = new ShippingPage(driver) : termPage;
    }

    public ConfirmationPage getConfirmationPage(){

        return (confirmationPage==null) ? confirmationPage = new ConfirmationPage(driver) : confirmationPage;
    }

    public LaunchPage getLaunchPage(){

        return (LaunchPage1==null) ? LaunchPage1 = new LaunchPage(driver) : LaunchPage1;
    }

    public Payment getPayment(){

        return (paymentPage==null) ? paymentPage = new Payment(driver) : paymentPage;
    }

    public SummaryPage getProceedPage(){

        return (proceedPage==null) ? proceedPage = new SummaryPage(driver) : proceedPage;
    }

    public SearchItemPage getSearchIteamPage(){

        return (searchIteamPage==null) ? searchIteamPage = new SearchItemPage(driver) : searchIteamPage;
    }

    public SelectItem getSelectItemPage(){

        return (selectItemPage==null) ? selectItemPage = new SelectItem(driver) : selectItemPage;
    }

    public SignInPage getSignPage(){

        return (SignPage1==null) ? SignPage1 = new SignInPage(driver) : SignPage1;
    }

    public SignUpPage getSignUpPage(){

        return (signUpPage==null) ? signUpPage = new SignUpPage(driver) : signUpPage;
    }

    public VerifyingPage getVerifyingPage(){

        return (verifyingPage==null) ? verifyingPage=new VerifyingPage(driver) : verifyingPage;
    }

    public ContactUs getContactUs(){

        return (contactUs==null) ? contactUs = new ContactUs(driver) : contactUs;
    }
}
