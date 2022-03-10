package pageYahoo;

import baseYahoo.BaseTest;
import org.openqa.selenium.support.PageFactory;

public class YahooPage extends BaseTest {
    public YahooPage(){
        PageFactory.initElements(driver, this);
    }

/*

    @FindBy(className = "pl-15")
    WebElement companyText;

    public String companyTextGetText(){
        wdwait.until(ExpectedConditions.elementToBeClickable(companyText));
        return companyText.getText();
    }
    public boolean companyTextisDisplayed(){
        wdwait.until(ExpectedConditions.elementToBeClickable(companyText));
        return companyText.isDisplayed();

    }

*/

}
