package stepDef;

import base.BaseUtil;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.bs.I;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.apache.commons.io.FileUtils;
//import org.junit.After;
//import org.junit.Before;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.devtools.v85.io.IO;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.Callable;

public class Hook extends BaseUtil {

    private final BaseUtil base;
    private BaseUtil Base;
   // private Object WebDriverManager;

    public Hook(BaseUtil base) {
        this.base = base;

    }

    @Before
    public void setup() {

      WebDriverManager.chromedriver().setup();
        base.driver = new ChromeDriver();

    //WebDriverManager.firefoxdriver().setup();
//    base.driver = new FirefoxDriver ()
    }
    @After
    public void TearDown() throws IOException {
        takeScreenShoot();
        base.driver.close();
        base.driver.quit();



    }
    private void takeScreenShoot() throws IOException {
        TakesScreenshot scrShot =((TakesScreenshot) base. driver);
        File SrcFile = scrShot.getScreenshotAs(OutputType.FILE);
FileUtils.copyFile(SrcFile, new File ("target/screenshot" + System.currentTimeMillis() + ".png"));
    }
}
