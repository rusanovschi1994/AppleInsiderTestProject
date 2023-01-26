package apple_insider_tests.cucumber_tests;

import appleInsider.pages.FoundArticlesPage;
import appleInsider.pages.MainPage;
import apple_insider_tests.cucumber_tests.base_cucumber.BaseTest;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.qameta.allure.Owner;
import org.junit.Assert;

import static appleInsider.helpers.TestValues.*;
import static appleInsider.readProperties.ConfigProvider.*;

public class AppleInsiderHrefCTest extends BaseTest {

    @Given("Open the main page")
    @Owner("rusanovschi")
    public void open(){

        new MainPage(BASE_URL);
    }

    @When("Type the search article")
    @Owner("rusanovschi")
    public void typeSearchArticle() {

        new MainPage().searchArticle(ARTICLE_TEXT);
    }

    @And("Get href attribute of first found article")
    @Owner("rusanovschi")
    public void getHrefAttributeOfFirstFoundArticle() {

       new FoundArticlesPage().getHrefFirstArticle();
    }

    @Then("Check that href of the first found article contains expected value")
    @Owner("rusanovschi")
    public void checkHref() {

        Assert.assertTrue(new FoundArticlesPage()
                .getHrefFirstArticle()
                .contains(EXPECTED_IPHONE_VALUE));
    }
}
