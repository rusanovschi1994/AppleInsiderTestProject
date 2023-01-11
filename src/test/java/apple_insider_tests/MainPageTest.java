package apple_insider_tests;

import appleInsider.helpers.TestValues;
import appleInsider.pages.MainPage;
import apple_insider_tests.base.BaseTest;
import org.junit.Assert;
import org.junit.Test;

import static appleInsider.helpers.TestValues.HEADER_SITE_NAME;
import static appleInsider.readProperties.ConfigProvider.*;

public class MainPageTest extends BaseTest {

    @Test
    public void signInWithValidCreds(){

        Assert.assertFalse(new MainPage(BASE_URL)
                .clickSignInAndRegistrationForm()
                .signIn(ADMIN_USERNAME, ADMIN_PASSWORD)
                .getFormButtonStatus());
    }

    @Test
    public void checkHeaderName(){

        Assert.assertEquals(HEADER_SITE_NAME, new MainPage(BASE_URL).getHeaderSiteName());
    }
}
