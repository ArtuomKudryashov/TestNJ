package pageObjectsTest;

import pageObjects.LoginPage;
import pageObjects.MainPage;
import org.testng.Assert;
import org.testng.annotations.Test;

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
    @Test
    public void loginToApp_correctCredentials_successfullLogin1() {
        LoginPage loginPage = new LoginPage(driver);
        loginPage.open();
        MainPage mainPage = loginPage.loginToApp(username, password);
        Assert.assertTrue(mainPage.isMain());//сл шаг создаем булеан

    }

    @Test
    public void loginTo_App_inCorrectCredential_failedlogin1() {
        LoginPage loginPage = new LoginPage(driver);
        loginPage.open();
        MainPage mainPage = loginPage.loginToApp(username, "wrongPassword");
        Assert.assertTrue(loginPage.isError());


    }
    @Test
    public void loginToApp_correctCredentials_successfullLogin2() {
        LoginPage loginPage = new LoginPage(driver);
        loginPage.open();
        MainPage mainPage = loginPage.loginToApp(username, password);
        Assert.assertTrue(mainPage.isMain());//сл шаг создаем булеан

    }

    @Test
    public void loginTo_App_inCorrectCredential_failedlogin2() {
        LoginPage loginPage = new LoginPage(driver);
        loginPage.open();
        MainPage mainPage = loginPage.loginToApp(username, "wrongPassword");
        Assert.assertTrue(loginPage.isError());


    }
    @Test
    public void loginToApp_correctCredentials_successfullLogin3() {
        LoginPage loginPage = new LoginPage(driver);
        loginPage.open();
        MainPage mainPage = loginPage.loginToApp(username, password);
        Assert.assertTrue(mainPage.isMain());//сл шаг создаем булеан

    }

    @Test
    public void loginTo_App_inCorrectCredential_failedlogin3() {
        LoginPage loginPage = new LoginPage(driver);
        loginPage.open();
        MainPage mainPage = loginPage.loginToApp(username, "wrongPassword");
        Assert.assertTrue(loginPage.isError());


    }
}