package com.example;

import com.example.utills.PropertyReader;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.safari.SafariDriver;
import pages.ElektronikaChoicePage;


import java.util.concurrent.TimeUnit;

public class BaseTest {
    public static ElektronikaChoicePage elektronikaChoicePage;
    public static WebDriver driver;

    /**
     * осуществление первоначальной настройки
     */
    @BeforeClass
    public static void setup() {
        //создание экземпляра драйвера
        driver = new SafariDriver();
        elektronikaChoicePage = new ElektronikaChoicePage(driver);
        //окно разворачивается на полный экран
        driver.manage().window().maximize();
        //задержка на выполнение теста = 10 сек.
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        //получение ссылки на страницу входа из файла настроек
        driver.get(PropertyReader.getProperty("yandexelektronikapage"));
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
