package apple_insider_tests;

import appleInsider.pages.MainPage;
import apple_insider_tests.base.BaseTest;
import org.junit.Assert;
import org.junit.Test;

import static appleInsider.helpers.TestValues.HEADER_SITE_NAME;
import static appleInsider.readProperties.ConfigProvider.*;

public class MainPageTest extends BaseTest {

    @Test
    public void signInWithValidCreds(){

        Assert.assertEquals(HEADER_SITE_NAME, new MainPage(BASE_URL)
                .clickSignInButton()
                .signIn(ADMIN_LOGIN, ADMIN_PASSWORD)
                .getHeaderSiteName());

    }

    public void signInWithInvalidCreds(){

    }
}
