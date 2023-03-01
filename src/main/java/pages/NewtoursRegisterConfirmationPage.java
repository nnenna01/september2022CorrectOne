package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class NewtoursRegisterConfirmationPage extends BasePage {


    public NewtoursRegisterConfirmationPage(WebDriver driver) {
        super(driver);
    }
    //a[@href='login.php']
    @FindBy(xpath = "//a[@href='login.php']")
    private List<WebElement>msgs;
    public String getNoteMessage(){
//      return msgs.get(0)getText();

        String message=msgs.get(0).getText();
        return message;
    }

}
