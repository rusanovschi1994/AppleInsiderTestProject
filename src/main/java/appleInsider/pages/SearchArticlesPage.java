package appleInsider.pages;

import com.codeborne.selenide.ElementsCollection;

import static com.codeborne.selenide.Selenide.$$x;

/**
 * Страница найденных статей на сайте appleInsider.ru
 */
public class SearchArticlesPage {

    private final ElementsCollection articlesList = $$x("//h2/a");

    /**
     * Получения ссылки первой статьй
     * @return
     */
    public String getHrefForFirstArticle(){

        return articlesList.first().getAttribute("href");
    }
}
