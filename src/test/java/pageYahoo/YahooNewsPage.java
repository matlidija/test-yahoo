package pageYahoo;

import baseYahoo.BaseTest;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class YahooNewsPage extends BaseTest {
    public YahooNewsPage() {
        PageFactory.initElements(driver, this);
    }
    @FindBy(id = "root_2")
    WebElement klikNews;

    public void setKlikNews(){
        wdwait.until(ExpectedConditions.elementToBeClickable(klikNews));
        klikNews.click();
    }
}
