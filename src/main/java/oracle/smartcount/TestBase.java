package oracle.smartcount;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

public class TestBase {
    public static WebDriver driver;
    public static Properties prop;
    public TestBase() throws IOException {
       prop=new Properties();
      FileInputStream fis=new FileInputStream("C:\\Users\\home\\IdeaProjects\\MyPOMProject\\src\\main\\java\\oracle\\smartcount\\config.properties");
      prop.load(fis);

    }
public static void initialization()
{

    String browserName=prop.getProperty("browser");
    System.out.println(browserName);

    if(browserName.equals("chrome"))
    {
        System.setProperty("webdriver.chrome.driver", "C:/Users/Owner/Pictures/chromedriver.exe");
        driver=new ChromeDriver();
    }
    else if(browserName.equals("firefox"))
    {
            driver=new FirefoxDriver();
    }

    driver.manage().window().maximize();
    driver.manage().deleteAllCookies();
   driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
   driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
    driver.get(prop.getProperty("url"));




}


}
