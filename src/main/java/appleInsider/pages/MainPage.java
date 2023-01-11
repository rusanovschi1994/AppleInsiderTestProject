package appleInsider.pages;

import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.Keys;

import static com.codeborne.selenide.Selenide.$x;

/**
 * Открытие главной страницы сайта appleInsider.ru
 */
public class MainPage {

    private final SelenideElement searchField = $x("//input[@name=\"s\"]");
    private final SelenideElement headerSiteName = $x("//h1/span[@class=\"sitename-text\"]");
    private final SelenideElement signInAndRegistrationForm = $x("//button[@aria-label=\"button\"]");
    private final SelenideElement usernameField = $x("//input[@name=\"log\"]");
    private final SelenideElement passwordField = $x("//input[@name=\"pwd\"]");

    public MainPage(String url){

        Selenide.open(url);
    }


    /**
     * Поиск на сайте используя searchField
     * @param value введенное значение
     * @return
     */
    public SearchArticlesPage searchArticle(String value){

        searchField.setValue(value);
        searchField.sendKeys(Keys.ENTER);
        return new SearchArticlesPage();
    }

    public String getHeaderSiteName(){

       return headerSiteName.getText();
    }

    public MainPage clickSignInAndRegistrationForm(){

        signInAndRegistrationForm.click();
        return this;
    }

    public MainPage typeUsername(String usernameValue){

        usernameField.setValue(usernameValue);
        return this;
    }

    public MainPage typePassword(String passwordValue){

        passwordField.setValue(passwordValue);
        passwordField.sendKeys(Keys.ENTER);
        return this;
    }

    public MainPage signIn(String usernameValue, String passwordValue){

        typeUsername(usernameValue);
        typePassword(passwordValue);
        return this;
    }


    public boolean getFormButtonStatus(){

        return signInAndRegistrationForm.isDisplayed();
    }
}
