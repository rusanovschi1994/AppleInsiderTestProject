package appleInsider.pages;

import com.codeborne.selenide.ElementsCollection;

import static com.codeborne.selenide.Selenide.$$x;

/**
 * Found Articles page on appleInsider.ru
 */
public class FoundArticlesPage {

    private final ElementsCollection articlesList = $$x("//h2/a");

    /**
     * Получения ссылки первой статьй
     * @return
     */
    public String getHrefFirstArticle(){

        return articlesList.first().getAttribute("href");
    }
}
