package appleInsider.pages;

import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.Keys;

import static com.codeborne.selenide.Selenide.$$;
import static com.codeborne.selenide.Selenide.$x;

/**
 * Open Main Page appleInsider.ru
 */
public class MainPage {

    private final SelenideElement searchField = $x("//input[@name=\"s\"]");
    private final SelenideElement headerSiteName = $x("//h1/span[@class=\"sitename-text\"]");
    private final SelenideElement signInAndRegistrationFormButton = $x("//button[@aria-label=\"button\"]");
    private final SelenideElement usernameField = $x("//input[@name=\"log\"]");
    private final SelenideElement passwordField = $x("//input[@name=\"pwd\"]");
    private final ElementsCollection headerMenuElements = $$("ul#menu-primary li.menu-item.menu-item-type-taxonomy");
    private final SelenideElement usernameLabel = $x("//h1[@class=\"sitename\"]/following-sibling::nav//li[@class=\"user\"]//span");

    public MainPage(String url){

        Selenide.open(url);
    }


    /**
     * Search on Main Page used searchField
     * @param value введенное значение
     * @return
     */
    public FoundArticlesPage searchArticle(String value){

        searchField.setValue(value);
        searchField.sendKeys(Keys.ENTER);
        return new FoundArticlesPage();
    }

    public String getHeaderSiteName(){

       return headerSiteName.getText();
    }

    public MainPage clickSignInAndRegistrationForm(){

        signInAndRegistrationFormButton.click();
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


    public String getUsernameLabelText(){

        String regex = "@\\w+.+";
        String username = usernameLabel.getText().replaceAll(regex, "");
        System.out.println(username);
        return username;
    }

    public int getHeaderMenuElements(){

       return headerMenuElements.size();
    }
}
