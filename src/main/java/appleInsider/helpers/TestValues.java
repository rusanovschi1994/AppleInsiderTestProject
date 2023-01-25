package appleInsider.helpers;

public class TestValues {

    public static final String ARTICLE_TEXT = "iPhone 12 mini";
    public static final String EXPECTED_IPHONE_VALUE= "iphone-11";
    public static final String HEADER_SITE_NAME = "AppleInsider.ru";

    public static String regexUsername(String username){

        String regex = "@\\w+.+";
        return username.replaceAll(regex, "");
    }
}
