package oracle.smartcount.Pages;

import oracle.smartcount.TestBase;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.io.IOException;

public class HomePage extends TestBase {

    @FindBy(xpath = "//td[contains(text(),'User: Naveen K')]")
    @CacheLookup
    WebElement userNameLabel;


    public HomePage() throws IOException {

        PageFactory.initElements(driver, this);
    }
}
