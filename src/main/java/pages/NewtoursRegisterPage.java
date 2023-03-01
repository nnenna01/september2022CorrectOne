package pages;

import org.checkerframework.checker.signature.qual.FieldDescriptor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

public class NewtoursRegisterPage extends BasePage {
    public NewtoursRegisterPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "//a[@href='register.php']")
    private WebElement registerLinklocator;

    @FindBy(xpath = "//input[@maxlength='60']")
    private WebElement FirstNameLinkLocator;

    @FindBy(xpath = "//input[@name='lastName']")
    private WebElement lastNameLinkLocator;


    @FindBy(css = "input[name='phone']")
    private WebElement phoneLinkLocator;

    @FindBy(css = "input[id='userName']")
    private WebElement emailLinkLocator;

    @FindBy(css = "input[size='40']")
    private WebElement addressLinkLocator;

    @FindBy(xpath = "//input[@name='city']")
    private WebElement cityLinkLocator;

    @FindBy(xpath = "//input[@name='state']")
    private WebElement stateLinkLocator;

    @FindBy(xpath = "//input[@name='postalCode']")
    private WebElement postalCodeLinkLocator;

    @FindBy(xpath = "//select[@size='1']")
    private WebElement countryLinkLocator;
    @FindBy(xpath = "//input[@id='email']")
    private WebElement userNameLinkLocator;

    @FindBy(css = "input[name='password']")
    private WebElement passwordLinkLocator;

    @FindBy(css = "input[name='confirmPassword']")
    private WebElement confirmPasswordLinkLocator;

    @FindBy(css = "input[name='submit']")
    private WebElement submitLinkLocator;

    @FindBy(xpath = "//select[@value='ANGOLA']")
    private WebElement countryNameLinkLocator;

///////////////////////////////////////////////////////////////////////////////////////////


    public void ClickOnRegisterLinkLocator() {
        registerLinklocator.click();
    }

    public void ClickOnFirstNameLinkLocator() {
        FirstNameLinkLocator.click();
    }

    public void ClickOnLastNameLinkLocator() {
        lastNameLinkLocator.click();
    }

    public void ClickOnPhoneLinkLocator() {
        phoneLinkLocator.click();
    }

    public void ClickOnEmailLinkLocator() {
        emailLinkLocator.click();
    }

    public void ClickOnAddressLinkLocator() {
        addressLinkLocator.click();
    }

    public void ClickOnCityLinkLocator() {
        cityLinkLocator.click();
    }

    public void clickOnStateLinkLocator() {
        stateLinkLocator.click();
    }
    public void ClickOnPostalCodeLinkLocator() {
        postalCodeLinkLocator.click();
    }

    public void ClickOnCountryLinkLocator(String country) {
        countryLinkLocator.getAttribute("country");
    }

    public void ClickOnUserNameLinkLocator(String username) {
        userNameLinkLocator.sendKeys("username");
    }

    public void ClickOnPasswordLinkLocator(String password) {
        passwordLinkLocator.clear();
        passwordLinkLocator.sendKeys("password");
    }

    public void ClickOnConfirmPasswordLinkLocator(String password) {
        confirmPasswordLinkLocator.clear();
        confirmPasswordLinkLocator.sendKeys("password");
    }
    public void ClickOnsubmitLinkLocator(){
        submitLinkLocator.click();
    }

//    public void ClickOnSubmitLinkLocator() {
//        submitLinkLocator.click();
//    }
        public void selectCountry(String countryName){
//            Select select = new Select(countryNameLinkLocator);
//            select.selectByVisibleText(countryName);


        }
    }


