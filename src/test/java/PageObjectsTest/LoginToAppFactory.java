package PageObjectsTest;

import PageObjects.LoginPage;
import PageObjects.LoginPageFactory;
import PageObjects.MainPage;
import org.openqa.selenium.WebDriver;
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
}