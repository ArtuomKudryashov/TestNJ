package pageObjectsTest;

import enums.BrowserType;
import helpers.BrowserFactory;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class BaseTest {
    protected WebDriver driver;
    protected  String username;
    protected String password;


    @BeforeMethod
    public void starUp() {
        username= "academic198405@gmail.com";
        password = "te$t$tudent";
//        System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
//        WebDriverManager.chromedriver().setup();
//        driver = new ChromeDriver();
//        WebDriverManager.firefoxdriver().setup();
//        driver = new FirefoxDriver();
//        WebDriverManager.edgedriver().setup();
//        driver = new EdgeDriver();
                //1)Chrome драйвер который  мы закачали нам больше не нужен
                 // 2) можем закоментить, потому что  в  BrowserFactory написали switch
        // и заменяем на одну строчку
        driver = BrowserFactory.getDriver(BrowserType.FIREFOX);
        System.out.println("TestProverkaTestNJ");


    }

    @AfterMethod
    public void tearDown() throws InterruptedException {
        Thread.sleep(3000);
        driver.quit();
    }
}
