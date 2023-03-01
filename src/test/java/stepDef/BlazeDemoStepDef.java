package stepDef;

import base.BaseUtil;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;
import pages.NewtoursFlightFinderPage;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.IsEqual.equalTo;

public class BlazeDemoStepDef extends BaseUtil{
    private BaseUtil base;
    public BlazeDemoStepDef(BaseUtil base){
        this.base=base;
    }

    @Given("I am on the the Welcome to simple Travel agency Landing page")
    public void i_am_on_the_the_welcome_to_simple_travel_agency_landing_page() {
        base.driver.manage().window().maximize();
        base.driver.get("https://blazedemo.com/");

    }
    @Given("I choose the {string} and {string} from the drop down")
    public void i_choose_the_and_from_the_drop_down(String DeptC, String DesC) {
       new Select(base.driver.findElement(By.xpath("//select[@name='fromPort']"))).selectByVisibleText(DeptC);
       new Select(base.driver.findElement(By.xpath("//select[@name='toPort']"))).selectByVisibleText(DesC);
    }
    @When("I click on {string}")
    public void i_click_on(String button) {
        base.driver.findElement(By.xpath("//input[@type='submit']")).click();

    }
    @Then("I should see {string} and {string} on the reserve page  and {int} flight options")
    public void i_should_see_and_on_the_reserve_page_and_flight_options(String DEp, String ARR, Integer No) {

       assertThat(base.driver.findElement(By.xpath("/html/body/div[2]/table/thead/tr/th[4]")).isDisplayed(),equalTo(true));
       assertThat(base.driver.findElement(By.xpath("/html/body/div[2]/table/thead/tr/th[5]")).isDisplayed(),equalTo(true));
       assertThat(base.driver.findElement(By.xpath("//table[@class='table']")).isDisplayed(),equalTo(true));
    }

}
