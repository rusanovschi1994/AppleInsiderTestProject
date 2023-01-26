package apple_insider_tests.cucumber_tests.base_cucumber;

import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.logevents.SelenideLogger;
import io.github.bonigarcia.wdm.WebDriverManager;
import io.qameta.allure.selenide.AllureSelenide;
import org.junit.After;
import org.junit.Before;

import static com.codeborne.selenide.Configuration.*;

public abstract class BaseTest {

    public void setUp(){

        WebDriverManager.chromedriver().setup();
        SelenideLogger.addListener("AllureSelenide", new AllureSelenide()
                .screenshots(true)
                .savePageSource(true));
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
