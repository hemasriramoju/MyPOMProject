package oracle.smartcount.Pages;

import oracle.smartcount.TestBase;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;

import java.io.IOException;

public class LoginPage extends TestBase
{
    //Web Elements
    @FindBy(name="txtUsername")
    WebElement username;
    @FindBy(name="txtPassword")
    WebElement password;
    @FindBy(xpath="//button[text()='Login']")
    WebElement loginButton;

    public LoginPage() throws IOException
    {
        //PageFactory.initElements(driver, this);
        AjaxElementLocatorFactory ajaxElementLocatorFactory=new AjaxElementLocatorFactory(driver, 30);
        PageFactory.initElements(ajaxElementLocatorFactory, this);
    }

    //Actions
    public String getPageTitle()
    {
        return driver.getTitle();
    }

   public HomePage login(String un, String pwd) throws InterruptedException, IOException {
       username.sendKeys(un);
       password.sendKeys(pwd);
       loginButton.click();
       return new HomePage();
   }


}
