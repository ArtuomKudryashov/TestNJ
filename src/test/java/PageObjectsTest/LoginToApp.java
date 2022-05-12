package PageObjectsTest;

import PageObjects.LoginPage;
import PageObjects.MainPage;
import org.openqa.selenium.ElementClickInterceptedException;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.time.Duration;

public class LoginToApp extends  BaseTest {




    @Test
    public void loginToApp_correctCredentials_successfullLogin() {
        LoginPage loginPage = new LoginPage(driver);
        loginPage.open();
        MainPage mainPage = loginPage.loginToApp(username, password);
        Assert.assertTrue(mainPage.isMain());//сл шаг создаем булеан

    }

    @Test
    public void loginTo_App_inCorrectCredential_failedlogin() {
        LoginPage loginPage = new LoginPage(driver);
        loginPage.open();
        MainPage mainPage = loginPage.loginToApp(username, "wrongPassword");
        Assert.assertTrue(loginPage.isError());


    }
}