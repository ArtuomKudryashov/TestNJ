package pageObjectsTest;

import pageObjects.LoginPage;
import pageObjects.MainPage;
import com.github.javafaker.Faker;
import org.testng.Assert;
import org.testng.annotations.Test;

public class PlayListTest extends BaseTest {




    @Test
    public void playListTests_createPlayList_playlistCreated(){
        //используем нормальные слова
        Faker faker = new Faker();
        String playlistName = faker.funnyName().name();
        //Случайные плейлисты

       // String playlistName = TestDataGenerator.getString(7);//длинна имени рлейлиста
        System.out.println(playlistName);




        LoginPage loginPage = new LoginPage(driver);
        loginPage.open();
        MainPage mainPage =loginPage.loginToApp(username,password);
        //mainPage.createPlaylist(playlistName);//подаем сгениированный пл листс с
        //Возвращаем плейлсист ID

        String playlistId=mainPage.createPlaylist(playlistName);

        Assert.assertTrue(mainPage.checkPlaylist(playlistId,playlistName));
    }
    @Test
    public void playListTests_renamePlayList_playlistrenaimed() {
        //используем нормальные слова
        Faker faker = new Faker();
        String playlistName = faker.funnyName().name();
        //Случайные плейлисты

        // String playlistName = TestDataGenerator.getString(7);//длинна имени рлейлиста
        System.out.println(playlistName);


        LoginPage loginPage = new LoginPage(driver);
        loginPage.open();
        MainPage mainPage = loginPage.loginToApp(username, password);
        //mainPage.createPlaylist(playlistName);//подаем сгениированный пл листс с
        //Возвращаем плейлсист ID

        String playlistId = mainPage.createPlaylist(playlistName);
        String newPlaylistName = faker.artist().name();
        mainPage.renamePlaylist(playlistId,newPlaylistName);

        Assert.assertTrue(mainPage.checkPlaylist(playlistId, newPlaylistName));
    }
    @Test
    public void playListTests_renameOldPlayList_playlistrenaimed() throws InterruptedException {
        //используем нормальные слова
        Faker faker = new Faker();
        String playlistName = faker.funnyName().name();
        //Случайные плейлисты

        // String playlistName = TestDataGenerator.getString(7);//длинна имени рлейлиста
        System.out.println(playlistName);


        LoginPage loginPage = new LoginPage(driver);
        loginPage.open();
        MainPage mainPage = loginPage.loginToApp(username, password);
        //mainPage.createPlaylist(playlistName);//подаем сгениированный пл листс с
        //Возвращаем плейлсист ID

        String playlistId = mainPage.createPlaylist(playlistName);
        String newPlaylistName = faker.artist().name();
        mainPage.renamePlaylist(playlistId,newPlaylistName);
        System.out.println("Artuom");

        Assert.assertTrue(mainPage.checkPlaylist(playlistId, newPlaylistName));
    }
    @Test
    public void playListTests_createPlayList_playlistCreated1(){
        //используем нормальные слова
        Faker faker = new Faker();
        String playlistName = faker.funnyName().name();
        //Случайные плейлисты

        // String playlistName = TestDataGenerator.getString(7);//длинна имени рлейлиста
        System.out.println(playlistName);




        LoginPage loginPage = new LoginPage(driver);
        loginPage.open();
        MainPage mainPage =loginPage.loginToApp(username,password);
        //mainPage.createPlaylist(playlistName);//подаем сгениированный пл листс с
        //Возвращаем плейлсист ID

        String playlistId=mainPage.createPlaylist(playlistName);

        Assert.assertTrue(mainPage.checkPlaylist(playlistId,playlistName));
    }
    @Test
    public void playListTests_renamePlayList_playlistrenaimed1() {
        //используем нормальные слова
        Faker faker = new Faker();
        String playlistName = faker.funnyName().name();
        //Случайные плейлисты

        // String playlistName = TestDataGenerator.getString(7);//длинна имени рлейлиста
        System.out.println(playlistName);


        LoginPage loginPage = new LoginPage(driver);
        loginPage.open();
        MainPage mainPage = loginPage.loginToApp(username, password);
        //mainPage.createPlaylist(playlistName);//подаем сгениированный пл листс с
        //Возвращаем плейлсист ID

        String playlistId = mainPage.createPlaylist(playlistName);
        String newPlaylistName = faker.artist().name();
        mainPage.renamePlaylist(playlistId,newPlaylistName);

        Assert.assertTrue(mainPage.checkPlaylist(playlistId, newPlaylistName));
    }
    @Test
    public void playListTests_renameOldPlayList_playlistrenaimed1() { //throws InterruptedException {
        //используем нормальные слова
        Faker faker = new Faker();
        String playlistName = faker.funnyName().name();
        //Случайные плейлисты

        // String playlistName = TestDataGenerator.getString(7);//длинна имени рлейлиста
        System.out.println(playlistName);


        LoginPage loginPage = new LoginPage(driver);
        loginPage.open();
        MainPage mainPage = loginPage.loginToApp(username, password);
        //mainPage.createPlaylist(playlistName);//подаем сгениированный пл листс с
        //Возвращаем плейлсист ID

        String playlistId = mainPage.createPlaylist(playlistName);
        String newPlaylistName = faker.artist().name();
        mainPage.renamePlaylist(playlistId,newPlaylistName);
        System.out.println("Artuom");

        Assert.assertTrue(mainPage.checkPlaylist(playlistId, newPlaylistName));
    }
    @Test
    public void playListTests_createPlayList_playlistCreated2(){
        //используем нормальные слова
        Faker faker = new Faker();
        String playlistName = faker.funnyName().name();
        //Случайные плейлисты

        // String playlistName = TestDataGenerator.getString(7);//длинна имени рлейлиста
        System.out.println(playlistName);




        LoginPage loginPage = new LoginPage(driver);
        loginPage.open();
        MainPage mainPage =loginPage.loginToApp(username,password);
        //mainPage.createPlaylist(playlistName);//подаем сгениированный пл листс с
        //Возвращаем плейлсист ID

        String playlistId=mainPage.createPlaylist(playlistName);

        Assert.assertTrue(mainPage.checkPlaylist(playlistId,playlistName));
    }
    @Test
    public void playListTests_renamePlayList_playlistrenaimed2() {
        //используем нормальные слова
        Faker faker = new Faker();
        String playlistName = faker.funnyName().name();
        //Случайные плейлисты

        // String playlistName = TestDataGenerator.getString(7);//длинна имени рлейлиста
        System.out.println(playlistName);


        LoginPage loginPage = new LoginPage(driver);
        loginPage.open();
        MainPage mainPage = loginPage.loginToApp(username, password);
        //mainPage.createPlaylist(playlistName);//подаем сгениированный пл листс с
        //Возвращаем плейлсист ID

        String playlistId = mainPage.createPlaylist(playlistName);
        String newPlaylistName = faker.artist().name();
        mainPage.renamePlaylist(playlistId,newPlaylistName);

        Assert.assertTrue(mainPage.checkPlaylist(playlistId, newPlaylistName));
    }
    @Test
    public void playListTests_renameOldPlayList_playlistrenaimed2(){ //throws InterruptedException {
        //используем нормальные слова
        Faker faker = new Faker();
        String playlistName = faker.funnyName().name();
        //Случайные плейлисты

        // String playlistName = TestDataGenerator.getString(7);//длинна имени рлейлиста
        System.out.println(playlistName);


        LoginPage loginPage = new LoginPage(driver);
        loginPage.open();
        MainPage mainPage = loginPage.loginToApp(username, password);
        //mainPage.createPlaylist(playlistName);//подаем сгениированный пл листс с
        //Возвращаем плейлсист ID

        String playlistId = mainPage.createPlaylist(playlistName);
        String newPlaylistName = faker.artist().name();
        mainPage.renamePlaylist(playlistId,newPlaylistName);
        System.out.println("Artuom");

        Assert.assertTrue(mainPage.checkPlaylist(playlistId, newPlaylistName));
    }

}
/**
 * Залогинились
 * создали плейлист
 * найти плейлист
 * кликнуть 2 -м кликом
 * стереть старое имя
 * написать новое
 * послать ентер
 */