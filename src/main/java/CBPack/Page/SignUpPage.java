package CBPack.Page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class SignUpPage extends BasePage {

    @FindBy(css = ".header_user_info")
    private WebElement signButton;

    @FindBy(css = "#email_create")
    private WebElement email;

    @FindBy(css = "#SubmitCreate")
    private WebElement submit;

    @FindBy(css = "#id_gender1")
    private WebElement Title_Mr;

    @FindBy(id = "id_gender2")
    private WebElement Title_Mrs;

    @FindBy(css = "#customer_firstname")
    private WebElement customer_firstName;

    @FindBy(css = "#customer_lastname")
    private WebElement customer_lastName;

    @FindBy(id = "email")
    private WebElement emailId;

    @FindBy(id = "passwd")
    private WebElement Password;

    @FindBy(css = "#days")
    private WebElement dob_date;

    @FindBy(css = "#months")
    private WebElement dob_month;

    @FindBy(css = "#years")
    private WebElement dob_year;

    @FindBy(css = "#firstname")
    private WebElement firstName;

    @FindBy(css = "#lastname")
    private WebElement lastName;

    @FindBy(id = "company")
    private WebElement Company;

    @FindBy(id = "address1")
    private WebElement Address1;

    @FindBy(id = "address2")
    private WebElement Address2;

    @FindBy(id = "city")
    private WebElement City;

    @FindBy(id = "id_state")
    private WebElement State;

    @FindBy(id = "postcode")
    private WebElement ZipCode;

    @FindBy(css = "#id_country")
    private WebElement Country;

    @FindBy(id = "other")
    private WebElement AnyOtherInformation;

    @FindBy(id = "phone")
    private WebElement HomePhone;

    @FindBy(id = "phone_mobile")
    private WebElement MobilePhone;

    @FindBy(id = "submitAccount")
    private WebElement Register;

    @FindBy(css = "#center_column h1")
    private WebElement SignUpElement;

    @FindBy(xpath = "//span[text()='My personal information']")
    private WebElement PersonalInfo;

    @FindBy(css = "#email")
    private WebElement SignUpEmail;

    @FindBy(css = ".info-account")
    private WebElement SignUpMessage;

    public SignUpPage(WebDriver driver){

        super(driver);

        PageFactory.initElements(driver,this);
    }

    public void setEmail(String email_id){

    email.clear();

    email.sendKeys(email_id);

    submit.click();

    }

    public void setTitle(String gender){

     if (gender.equalsIgnoreCase("Male")){

         waitForElementToClickable(Title_Mr);

         Title_Mr.click();
     }

     else if (gender=="Female"){

         Title_Mrs.click();
     }

    }

    public void setCustomer_firstName(String fName){

        customer_firstName.clear();

        customer_firstName.sendKeys(fName);
    }

    public void setCustomer_lastName(String lName){

        customer_lastName.clear();

        customer_lastName.sendKeys(lName);
    }

    public void setEmail_id(String email_id){

       emailId.clear();

       emailId.sendKeys(email_id);

    }

    public void setPassword(String password){

        Password.clear();

        Password.sendKeys(password);
    }

    public void setDOB(String date,String Month, String Year){

        Select select = new Select(dob_date);

        select.selectByValue(date);

        Select select1 = new Select(dob_month);

        select1.selectByValue(Month);

        Select select2 = new Select(dob_year);

        select2.selectByValue(Year);
    }

    public void setCompanyName(String companyName){

        Company.clear();

        Company.sendKeys(companyName);
    }

    public void setAddress1(String Address){

        Address1.clear();

        Address1.sendKeys(Address);
    }

    public void setCityName(String cityName){

        City.clear();

        City.sendKeys(cityName);
    }

    public void setStateName(String state){

        Select select = new Select(State);

        select.selectByVisibleText(state);
    }

    public void setZipCode(){

        ZipCode.sendKeys("00000");
    }

    public void setCountry(){

        Select select = new Select(Country);

        select.selectByVisibleText("United States");
    }

    public void setAnyOtherInformation(String information){

        AnyOtherInformation.clear();

        AnyOtherInformation.sendKeys(information);
    }

    public void setMobilePhone(String mobilePhone){

        MobilePhone.clear();

        MobilePhone.sendKeys(mobilePhone);

    }

    public void clickSubmit(){

        Register.click();
    }

    public String  verifySignUpTitle(){

        waitForElementVisible(SignUpElement);

        return SignUpElement.getText();

    }

    public String verifySognUpMessage(){

        return SignUpMessage.getText();
    }

    public String getSignUpEmail(){

        waitForElementToClickable(PersonalInfo);

        PersonalInfo.click();

        waitForElementToClickable(SignUpEmail);

        return SignUpEmail.getAttribute("value");
    }
}
