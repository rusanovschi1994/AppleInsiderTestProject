package apple_insider_tests;

import appleInsider.helpers.TestValues;
import appleInsider.pages.MainPage;
import apple_insider_tests.base.BaseTest;
import io.qameta.allure.Owner;
import org.junit.Assert;
import org.junit.Test;
import org.junit.jupiter.api.Disabled;

import static appleInsider.helpers.TestValues.*;
import static appleInsider.readProperties.ConfigProvider.*;

public class MainPageTest extends BaseTest {

    @Test
    @Owner("rusanovschi")
    public void signInWithValidCreds(){

        Assert.assertEquals(regexUsername(ADMIN_USERNAME), new MainPage(BASE_URL)
                .clickSignInAndRegistrationForm()
                .signIn(ADMIN_USERNAME, ADMIN_PASSWORD)
                .getUsernameLabelText());
    }

    @Test
    public void checkHeaderName(){

        Assert.assertEquals(HEADER_SITE_NAME, new MainPage(BASE_URL)
                .getHeaderSiteName());
    }

    @Test
    public void checkSizeHeaderMenuElements(){

        Assert.assertEquals(6, new MainPage(BASE_URL).getHeaderMenuElements());
    }
}
