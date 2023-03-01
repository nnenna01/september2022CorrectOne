package stepDef;

import base.BaseUtil;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import pages.NewtoursRegisterConfirmationPage;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.IsEqual.equalTo;

public class NextStepDef extends BaseUtil{
    private BaseUtil base;
    public  NextStepDef (BaseUtil base){
        this.base=base;
    }
    @Given("I am on the next Landing  page")
    public void i_am_on_the_next_landing_page() {
        base.driver.manage().window().maximize();
        base.driver.get("https://www.next.co.uk/");
        base.driver.findElement(By.xpath("//input[@autocomplete='off']"));

    }
    @When("I navigate to the Home  Link")
    public void iNavigateToTheHomeLink() {
        base.driver.findElement(By.xpath("//button[@id='onetrust-accept-btn-handler']")).click();
        base.driver.findElement(By.xpath("//div[.='home']")).click();

    }


    @Then("the Home Furnishing page should be displayed with {string}")
    public void theHomeFurnishingPageShouldBeDisplayedWith(String msg) {

        assertThat(base.driver .findElement(By.xpath("//span[.='THE HOME SHOP']")).isDisplayed(),equalTo(true));


    }

// I had a problem with cookies but i had to go to browse in incognito to get it

}
