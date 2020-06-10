package com.example;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.openqa.selenium.UnexpectedAlertBehaviour;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.safari.SafariDriver;
import org.openqa.selenium.safari.SafariOptions;
import pages.MainYandexPage;
import pages.MarketChoicePage;
import utills.PropertyReader;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

public class BaseTest {
    public static MainYandexPage mainYandexPage;
    public static MarketChoicePage marketChoicePage;
    public static WebDriver driver;

    /**
     * осуществление первоначальной настройки
     */
    @BeforeClass
    public static void setup() {
        //создание экземпляра драйвера
        driver = new SafariDriver();
        mainYandexPage = new MainYandexPage(driver);
        marketChoicePage = new MarketChoicePage(driver);
        //окно разворачивается на полный экран
        driver.manage().window().maximize();
        //задержка на выполнение теста = 10 сек.
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        //получение ссылки на страницу входа из файла настроек
        driver.get(PropertyReader.getProperty("yandexmainpage"));
//        ChromeOptions options = new ChromeOptions();
//        options.addArguments("--disable-notifications");
//        Set<String> s = options.getCapabilityNames();
//        Iterator<String> iter = s.iterator();
//        while (iter.hasNext()) {
//            System.out.println(iter.next());
//        }
//        options.setCapability("browserstack.safari.enablePopups", "false");

//        SafariOptions options = new SafariOptions();

    }

    @AfterClass
    public static void tear(){
        driver.quit();
    }
}
