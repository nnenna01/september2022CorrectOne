package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class NewtoursHomePage extends BasePage {

    public NewtoursHomePage(WebDriver driver) {
        super(driver);
    }

    //here you start to do the findings; that is the locating things

    @FindBy(linkText = "SIGN-ON")
  private WebElement signOnLinkLocator;
//    here this is a one liner, Findby this  and the private webElement for the signOnlocator

    @FindBy(linkText = "REGISTER")
    private WebElement registerLinkLocator;

    @FindBy(linkText = "SUPPORT")
    private WebElement supportLinkLocator;

    @FindBy(linkText = "CONTACT")
    private WebElement contactLinkLocator;

    @FindBy(linkText = "Hotels")
    private WebElement hotelsLinkLocator;

    @FindBy(linkText = "Flights")
        private WebElement FlightsLinkLocator;

// HERE YOU START TO WRITE Y9OUR METHODS
    public void ClickOnFlightLink() {

        FlightsLinkLocator.click();
    }
    public void ClickOnSignOnLink() {

        signOnLinkLocator.click();
    }
    public void ClickOnRegisterLink() {

    registerLinkLocator.click();
    }
    public void ClickOnContactLink() {
        contactLinkLocator.click();
    }
        public void ClickOnHotelLink() {

    hotelsLinkLocator.click();
        }

       public void supportLinkLocator(){
    supportLinkLocator.click();



}
}