package PageObjects;

import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class MainPage extends BasePage {


    // 2 Конструктор делаем
    public MainPage(WebDriver driver) {
        super(driver);
    }

    private WebElement getPlusButton() {
        By plusButtonBy = By.xpath("//*[@class='fa fa-plus-circle create']");
        wait.until(ExpectedConditions.visibilityOfElementLocated(plusButtonBy));
        return driver.findElement(plusButtonBy);
    }

    private WebElement getNewPlaylistItem() {
        return driver.findElement(By.xpath("//*[text()='New Playlist']"));
    }

    private WebElement getCreatePlaylistField() {
        return driver.findElement(By.xpath("//*[@class='create']/input"));
    }


    public WebElement Get(String playlistId) { // Ищет плейлист по ID
        By playlistBy = By.xpath("//*[@href='#!/playlist/" + playlistId + "']");
        wait.until(ExpectedConditions.visibilityOfElementLocated(playlistBy));
        return driver.findElement(playlistBy);
    }


    public boolean isMain() {
        By homeBy = By.className("home");
        try {
            wait.until(ExpectedConditions.visibilityOfElementLocated(homeBy));
            return true;
        } catch (TimeoutException xx) {
            return false;
        }
    }

    public String createPlaylist(String playlistName) {
        String playlistId = "";
        getPlusButton().click();
        getNewPlaylistItem().click();
        getCreatePlaylistField().sendKeys(playlistName);
        getCreatePlaylistField().sendKeys(Keys.ENTER);
        //Печатапем строку адреса

        By successBy = (By.xpath("//*[@class='success show']"));
        wait.until(ExpectedConditions.visibilityOfElementLocated(successBy));
        System.out.println(driver.getCurrentUrl());
        //Вытягиваем url
        String url = driver.getCurrentUrl();
        playlistId = url.split("/")[5];
        System.out.println(playlistId);


        //получается  из  3 строк что выше
        return driver.getCurrentUrl().split("/")[5];

    }
    private By getPlaylistBy(String playlistId){
       return By.xpath("//*[@href='#!/playlist/" + playlistId + "']");
    }


    public boolean checkPlaylist(String playlistId, String playlistName) {
        JavascriptExecutor jse = (JavascriptExecutor) driver;
        By playlistBy = getPlaylistBy(playlistId);
        WebElement playList = driver.findElement(playlistBy);

        jse.executeScript("arguments[0].scrollIntoView();", playList);
        try {
            wait.until(ExpectedConditions.visibilityOfElementLocated(playlistBy));
            String name = driver.findElement(playlistBy).getText();
            return name.equals(playlistName);
        } catch (TimeoutException c) {
            return false;
        }
    }


    public void renamePlaylist(String playlistId, String newPlaylistName) {


        //Scroll and click
        JavascriptExecutor jse = (JavascriptExecutor) driver;
        By playlistBy = getPlaylistBy(playlistId);
        WebElement playlist = driver.findElement(playlistBy);

        jse.executeScript("arguments[0].scrollIntoView();", playlist);

        Actions actions = new Actions(driver);
        actions.doubleClick(playlist).perform();

        WebElement editingField = getEditPlaylistField();
        editingField.sendKeys(Keys.CONTROL+"A");
        editingField.sendKeys(newPlaylistName);
        editingField.sendKeys(Keys.RETURN);

        try{
            Thread.sleep(5000);
        }catch (InterruptedException e){
            e.printStackTrace();
        }



    }

    private WebElement getEditPlaylistField() {
        By editBy = By.xpath("//*[@type='text']");
        wait.until(ExpectedConditions.elementToBeClickable(editBy));
       return driver.findElement(By.xpath("//*[@type='text']"));
    }
}







