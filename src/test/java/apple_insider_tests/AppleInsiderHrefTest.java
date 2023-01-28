package apple_insider_tests;

import appleInsider.helpers.TestValues;
import appleInsider.pages.MainPage;
import apple_insider_tests.base.BaseTest;
import io.qameta.allure.Description;
import io.qameta.allure.Owner;
import org.junit.Assert;
import org.junit.Test;
import org.junit.jupiter.api.Disabled;

import static appleInsider.helpers.TestValues.*;
import static appleInsider.readProperties.ConfigProvider.BASE_URL;

public class AppleInsiderHrefTest extends BaseTest {

    @Test
    @Owner("rusanovschi")
    @Description("check if 'href' of first article contains the expected iphone value")
    public void checkHref(){

        Assert.assertTrue(new MainPage(BASE_URL)
                .searchArticle(ARTICLE_TEXT)
                .getHrefFirstArticle()
                .contains(EXPECTED_IPHONE_VALUE));
    }
}
