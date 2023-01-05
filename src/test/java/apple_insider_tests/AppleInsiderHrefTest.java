package apple_insider_tests;

import appleInsider.helpers.TestValues;
import appleInsider.pages.MainPage;
import apple_insider_tests.base.BaseTest;
import org.junit.Assert;
import org.junit.Test;

import static appleInsider.readProperties.ConfigProvider.BASE_URL;

public class AppleInsiderHrefTest extends BaseTest {

    @Test
    public void checkHref(){

        Assert.assertTrue(new MainPage(BASE_URL)
                .searchArticle(TestValues.ARTICLE_TEXT)
                .getHrefForFirstArticle()
                .contains(TestValues.EXPECTED_IPHONE_VALUE));
    }
}
