package helpers;

import enums.BrowserType;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.opera.OperaDriver;

public class BrowserFactory {
    public static  WebDriver getDriver(BrowserType browser){
        switch (browser){
            case EDGE: return  getEdgeDriver();
            case OPERA: return  getOperaDriver();
            case FIREFOX: return  getFirefoxDriver();
            default: return  getChromeDriver();

            //после  этого идем  в basetest  и все  наши браузеры коментим
        }

    }

    private static WebDriver getOperaDriver() {
        WebDriverManager.operadriver().setup();
        return new EdgeDriver();
    }

    private static WebDriver getEdgeDriver() {
        WebDriverManager.edgedriver().setup();
        return new EdgeDriver();
    }
    private static WebDriver getFirefoxDriver() {
        WebDriverManager.firefoxdriver().setup();
        return new FirefoxDriver();
    }

    private static WebDriver getChromeDriver() {
        WebDriverManager.chromedriver().setup();
        return new ChromeDriver();
    }
}
