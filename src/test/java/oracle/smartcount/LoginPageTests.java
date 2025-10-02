package oracle.smartcount;

import oracle.smartcount.Pages.HomePage;
import oracle.smartcount.Pages.LoginPage;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.io.IOException;

public class LoginPageTestCases extends TestBase{
    LoginPage loginPage;
    HomePage homePage;
    public LoginPageTestCases() throws IOException {
        super();
    }

    @BeforeMethod
    public void setUp() throws IOException {
         initialization();
         loginPage=new LoginPage();
    }

    @Test(priority=1)
    public void loginPageTitleTest()
    {
       String actualTitle=loginPage.getPageTitle();
        Assert.assertEquals(actualTitle, "OrangeHRM");
    }

    @AfterMethod
    public void tearDown()
    {
        driver.quit();
    }



}
