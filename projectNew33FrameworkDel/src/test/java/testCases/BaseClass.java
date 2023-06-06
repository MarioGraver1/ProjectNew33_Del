package testCases;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class BaseClass {

    public String baseURL = "https://demo.guru99.com/v4/";
    public String userName = "mngr503626";
        public String password = "eqatamA";
    public static WebDriver driver;
    public static WebDriverWait wait;
    
    @BeforeClass
    public static void setUp(){
        driver = setDriver();
    }

    private static ChromeDriver setDriver() {
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");
        return new ChromeDriver(options);
    }

    @AfterClass
    public static void tearDown(){
        driver.quit();
    }

}
