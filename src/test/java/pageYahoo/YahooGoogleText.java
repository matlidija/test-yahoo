package pageYahoo;

import baseYahoo.BaseTest;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class YahooGoogleText extends BaseTest {
    public YahooGoogleText(){
        PageFactory.initElements(driver, this);
    }
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
}
