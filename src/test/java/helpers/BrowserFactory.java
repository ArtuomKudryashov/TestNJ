package helpers;

import enums.BrowserType;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.opera.OperaDriver;

public class BrowserFactory {
    public static  WebDriver getDriver(BrowserType browser){
        switch (browser){
//            case EDGE: return  getEdgeDriver();
//            case OPERA: return  getOperaDriver();
            case FIREFOX: return  getFirefoxDriver();
            default: return  getChromeDriver();

            //после  этого идем  в basetest  и все  наши браузеры коментим
        }

    }

//    private static WebDriver getOperaDriver() {
//        WebDriverManager.operadriver().setup();
//        return new EdgeDriver();
//    }
//
//    private static WebDriver getEdgeDriver() {
//        WebDriverManager.edgedriver().setup();
//        return new EdgeDriver();
//    }
    private static WebDriver getFirefoxDriver() {
        //Запускаем без головы firefox
        FirefoxOptions options = new FirefoxOptions();
        options.addArguments("--headless");
        options.addArguments("--width=1400");
        options.addArguments("--height=1000");


        WebDriverManager.firefoxdriver().setup();
//        return new FirefoxDriver();
        return new FirefoxDriver(options);
    }

    private static WebDriver getChromeDriver() {
        //Запускаем  без головы
        ChromeOptions options = new ChromeOptions();
        options.addArguments("windows-size=1400,1000");
        options.addArguments("--headless");
        WebDriverManager.chromedriver().setup();


//        return new ChromeDriver();
        return new ChromeDriver(options);
    }
}
