package testYahoo;

import baseYahoo.BaseTest;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import pageYahoo.YahooGoogleText;
import pageYahoo.YahooNewsPage;
import pageYahoo.YahooPage;
import pageYahoo.YahooPageNew;

public class YahooTests extends BaseTest {
    YahooPage radnoYahoo;
    YahooPageNew radnoHome;
    YahooNewsPage radnoNews;
    YahooGoogleText googleText;
    @Before
    public void setUpTest(){

        radnoYahoo = new YahooPage();
        radnoHome = new YahooPageNew();
        radnoNews = new YahooNewsPage();
        googleText = new YahooGoogleText();

    }
    @Test
    public void YahooTest(){
        radnoNews.setKlikNews();
        radnoHome.inputSearchField("google");
        radnoHome.setKlikSearch();
        Assert.assertTrue(googleText.companyTextisDisplayed());
        Assert.assertEquals("Technology company", googleText.companyTextGetText());
    }

}
