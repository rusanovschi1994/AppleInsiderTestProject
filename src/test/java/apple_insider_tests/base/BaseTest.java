package apple_insider_tests.base;

import com.codeborne.selenide.Selenide;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.After;
import org.junit.Before;

import static com.codeborne.selenide.Configuration.*;

public abstract class BaseTest {

    public void setUp(){

        WebDriverManager.chromedriver().setup();
        browser = "chrome";
        driverManagerEnabled = true;
        browserSize = "1920x1080";
        headless = false;
    }

    @Before
    public void init(){

        setUp();
    }

    @After
    public void tearDown(){

        Selenide.closeWebDriver();
    }
}
