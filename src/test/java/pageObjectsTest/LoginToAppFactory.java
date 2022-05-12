package pageObjectsTest;

import pageObjects.LoginPageFactory;
import pageObjects.MainPage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginToAppFactory extends  BaseTest {




    @Test
    public void loginToApp_correctCredentials_successfullLogin() {
        LoginPageFactory loginPage = new LoginPageFactory(driver);
        loginPage.open("https://bbb.testpro.io");
        MainPage mainPage = loginPage.loginToApp(username, password);
        Assert.assertTrue(mainPage.isMain());//сл шаг создаем булеан

    }

    @Test
    public void loginTo_App_inCorrectCredential_failedlogin() {
        LoginPageFactory loginPage = new LoginPageFactory(driver);
        loginPage.open("https://bbb.testpro.io");
        MainPage mainPage = loginPage.loginToApp(username, "wrongPassword");
        Assert.assertTrue(loginPage.isErrorFrame());


    }
    @Test
    public void loginToApp_correctCredentials_successfullLogin1() {
        LoginPageFactory loginPage = new LoginPageFactory(driver);
        loginPage.open("https://bbb.testpro.io");
        MainPage mainPage = loginPage.loginToApp(username, password);
        Assert.assertTrue(mainPage.isMain());//сл шаг создаем булеан

    }

    @Test
    public void loginTo_App_inCorrectCredential_failedlogin1() {
        LoginPageFactory loginPage = new LoginPageFactory(driver);
        loginPage.open("https://bbb.testpro.io");
        MainPage mainPage = loginPage.loginToApp(username, "wrongPassword");
        Assert.assertTrue(loginPage.isErrorFrame());


    }
    @Test
    public void loginToApp_correctCredentials_successfullLogin2() {
        LoginPageFactory loginPage = new LoginPageFactory(driver);
        loginPage.open("https://bbb.testpro.io");
        MainPage mainPage = loginPage.loginToApp(username, password);
        Assert.assertTrue(mainPage.isMain());//сл шаг создаем булеан

    }

    @Test
    public void loginTo_App_inCorrectCredential_failedlogin2() {
        LoginPageFactory loginPage = new LoginPageFactory(driver);
        loginPage.open("https://bbb.testpro.io");
        MainPage mainPage = loginPage.loginToApp(username, "wrongPassword");
        Assert.assertTrue(loginPage.isErrorFrame());


    }
    @Test
    public void loginToApp_correctCredentials_successfullLogin3() {
        LoginPageFactory loginPage = new LoginPageFactory(driver);
        loginPage.open("https://bbb.testpro.io");
        MainPage mainPage = loginPage.loginToApp(username, password);
        Assert.assertTrue(mainPage.isMain());//сл шаг создаем булеан

    }

    @Test
    public void loginTo_App_inCorrectCredential_failedlogin3() {
        LoginPageFactory loginPage = new LoginPageFactory(driver);
        loginPage.open("https://bbb.testpro.io");
        MainPage mainPage = loginPage.loginToApp(username, "wrongPassword");
        Assert.assertTrue(loginPage.isErrorFrame());


    }
}