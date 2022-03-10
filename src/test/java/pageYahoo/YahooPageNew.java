package pageYahoo;

import baseYahoo.BaseTest;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class YahooPageNew extends BaseTest {
    public YahooPageNew (){
        PageFactory .initElements(driver, this);
    }

    @FindBy(name = "p")
    WebElement searchField;
    @FindBy(id="search-button")
    WebElement klikSearch;

    public void setKlikSearch(){
        wdwait.until(ExpectedConditions.elementToBeClickable(klikSearch));
        klikSearch.click();
    }
    public void inputSearchField(String search){
        wdwait.until(ExpectedConditions.elementToBeClickable(searchField));
        searchField.clear();
        searchField.sendKeys(search);
    }

}
