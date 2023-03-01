package stepDef;

import base.BaseUtil;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.IsEqual.equalTo;
public class SwagLab_stepDef extends BaseUtil{
    private BaseUtil base;
    public SwagLab_stepDef(BaseUtil base){this.base = base;}


    @Given("I am on the swag lab home page")
    public void i_am_on_the_swag_lab_home_page() {
        base.driver.manage().window().maximize();
        base.driver.get("https://www.saucedemo.com/");
    }
    @When("I enter valid {string} and valid {string}")
    public void i_enter_valid_and_valid(String uSER, String pWord) {

        base.driver.findElement(By.xpath("//input[@id='user-name']")).sendKeys(uSER);
        base.driver.findElement(By.xpath("//input[@id='password']")).sendKeys(pWord);

    }
    @When("I click on login button")
    public void i_click_on_login_button() {
      base.driver.findElement(By.xpath("//input[@type='submit']")) .click();
    }
    @When("I click on the first item on the products page")
    public void i_click_on_the_first_item_on_the_products_page() {
        base.driver.findElement(By.xpath("//body/div[@id='root']/div[@id='page_wrapper']/div[@id='contents_wrapper']/div[@id='inventory_container']/div[1]/div[1]/div[1]/div[1]/div[1]/a[1]/img[1]")).click();
   // base.driver.findElement(By.xpath("//*[@id=\"inventory_item_container\"]/div/div/div[2]/div[1]")).click();

    }
    @When("I click on Add to cart button")
    public void i_click_on_add_to_cart_button() {
       base.driver.findElement(By.xpath("//button[@data-test='add-to-cart-sauce-labs-backpack']")).click();

    }
    @When("I click on shopping cart")
    public void i_click_on_shopping_cart() {
      base.driver.findElement(By.xpath("//span[contains(text(),'1')]")).click();
    }
    @When("I click on checkout")
    public void i_click_on_checkout() {
       base.driver.findElement(By.id("checkout")).click();
    }
    @When("I complete all the require fields {string}, {string} and {string}")
    public void i_complete_all_the_require_fields_and(String fName, String lName, String zipcode) {
       base.driver.findElement(By.cssSelector("input[id='first-name']")).sendKeys(fName);
        base.driver.findElement(By.cssSelector("input[id='last-name']")).sendKeys(lName);
        base.driver.findElement(By.cssSelector("input[id='postal-code']")).sendKeys(zipcode);
    }
    @When("I click on Continue button link")
    public void i_click_on_continue_button_link() {
        base.driver.findElement(By.cssSelector("input[type='submit']")).click();

    }
    @When("I click on Finished button")
    public void i_click_on_finished_button() {
        base.driver.findElement(By.cssSelector("button[id='finish']")).click();

    }
    @Then("{string} is displaced")
    public void is_displaced(String msg) {
        assertThat (base.driver.findElement(By.xpath("//h2[@class='complete-header']")).isDisplayed(),equalTo(true));
    }}