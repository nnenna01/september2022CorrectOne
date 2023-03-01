package stepDef;

import base.BaseUtil;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.support.ui.Select;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

public class UKBA_VisaStepDef extends BaseUtil {
    private final BaseUtil base;

    public UKBA_VisaStepDef(BaseUtil base) {
        this.base = base;

    }


    @Given("I am on the UKBA Website")
    public void i_am_on_the_ukba_website() {
        base.driver.manage().window().maximize();
        base.driver.get("https://www.gov.uk/check-uk-visa/y");

        base.driver.findElement(By.xpath("//button[@data-cookie-types='all']")).click();

        //Above is the way to maximize your run screen while running your test.

        // Write code here that turns the phrase above into concrete actions

    }

    @Given("I provide nationality of {string}")
    public void i_provide_nationality_of(String countryName) {
        // Write code here that turns the phrase above into concrete actions
        Select select = new Select(base.driver.findElement(By.id("response")
        ));
//        to select by value is the small letters of the country while
//        to select by visible text is the one that starts with capital letters
        select.selectByVisibleText(countryName);
    }

    @Given("I click on the continue button")
    public void click_on_the_continue_button() {
        base.driver.findElement(By.xpath("//button[contains(text(),'Continue')]")).click();


    }

    @Given("I select the reason {string}")
    public void i_select_the_reason(String string) {

        base.driver.findElement(By.cssSelector("input[value='study']")).click();


    }

    @Given("I click  on the continue button")
    public void i_click_on_the_continue_button() {
        base.driver.findElement(By.xpath("//button[@class='gem-c-button govuk-button gem-c-button--bottom-margin']")).click();
        // Write code here that turns the phrase above into concrete actions

    }

    @Given("I state I am intending to stay for more than {int} months")
    public void i_state_i_am_intending_to_stay_for_more_than_months(Integer int1) {
        base.driver.findElement(By.cssSelector("input[value='longer_than_six_months']")).click();

        // Write code here that turns the phrase above into concrete actions

    }


    @Then("I will be informed {string}")
    public void i_will_be_informed(String msg) {
      //  assertThat(base.driver.findElements(By.xpath("//h2[starts-with(@class,'gem-c-heading')]")).get(0).getText(), equalTo(msg));
        // assertThat(base.driver.findElement(By.xpath("//*[.='You will not need a visa to come to the UK']")).isDisplayed(), equalTo(true));


 assertThat(base.driver.findElement(By.xpath("//*[.='"+msg+"']")).isDisplayed(), equalTo(true));
        //[' "+msg+"'] this is the method to insert the assertion text into the test instead of re-typing the whole thing
    }

    @And("I select the reason {string} as reason for coming to the Uk")
    public void iSelectTheReasonAsReasonForComingToTheUk(String arg0) {
        base.driver.findElement(By.id("response-0")).click();
      //  base.driver.findElement(By.cssSelector("input#response-0")).click();
     //   base.driver.findElement(By.xpath("//input[@id='response-0']")).click();

//        base.driver.findElement(By.cssSelector("//input#response-0']")).click();
    }}

// Write code here that turns the phrase above into concrete actions







