package pages;

import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.Iterator;
import java.util.Set;

public class MarketChoicePage {

    public WebDriver driver;

    /**
     * конструктор класса, занимающийся инициализацией полей класса
     */
    public MarketChoicePage(WebDriver driver) {
        PageFactory.initElements(driver, this);
        this.driver = driver;
    }

    /**
     * определение локатора ссылки "Электроника"
     */
    @FindBy(xpath = "//*span[contains(text(),'Электроника')]")
//    @FindBy(css = "body > div.main > div:nth-child(3) > div:nth-child(2) > div > div > div > noindex > div > div > div > div.tabs._1xIdZSne_t._3ftgRylfEX > div > div._381y5orjSo._21NjfY1k45 > div:nth-child(3) > div > a > span")
    private WebElement elektronikaLnk;

    /**
     * Заглушка,что-то не так с геолокацией
     * определение локатора ссылки "Маркет"
     */
    @FindBy(xpath = "//*[contains(@id, 'header-search')]")
    private WebElement searchInpt;

    //Вторая заглушка
    @FindBy(xpath = "//span[contains(text(),'Мурманск')]")
    private WebElement temp;

    //Метод ожидания появления элемента
    private WebElement waitForElementPresentRefact(By by, int timeoutInSeconds) {
        WebDriverWait wait = new WebDriverWait(driver,  timeoutInSeconds);
        return wait.until(
                ExpectedConditions.presenceOfElementLocated(by) //ожидает элемент
        );
    }

    /**
     * Нажимаем на ссылку "Электроника"
     */
    public void clickElektronikaLnk() throws InterruptedException {
 //       String mainWindowHandler = driver.getWindowHandle();

//        driver.switchTo().frame(temp).close();
//        String newWindowHandle = newWindowsSet.iterator().next();
        // переключаемся в новое окно
//        driver.switchTo().window(newWindowHandler);
// закрываем его
//        driver.close();
// возвращаемся в предыдущее окно
//        driver.switchTo().window(oldWindowHandler);
//        driver.switchTo().defaultContent();
//        Thread.sleep(3000);
//        Alert alert = (new WebDriverWait(driver, 5))
//                .until(ExpectedConditions.alertIsPresent());
//        Alert alert = driver.switchTo().alert();
//        alert.accept();

//        String winHandleBefore = driver.getWindowHandle();
////        for (String winHandle : driver.getWindowHandles()) {
////            driver.switchTo().window(winHandle);
////        }
////        driver.switchTo().window(winHandleBefore);// Again I want to start code this old window

        //Получить список ссылок окон
//        Set<String> windowHandlers = driver.getWindowHandles();
//        Iterator<String> iter = windowHandlers.iterator();
//        while (iter.hasNext()) {
//            System.out.println(iter.next());
//        }

//        int timeout = 5;

//        WebDriverWait wait = new WebDriverWait(driver,timeout);
//        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[contains(text(),'Мурманск')]")));
//        wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//span[contains(text(),'Мурманск')]")));


//        WebElement element = driver.findElement(By.id("some-id"));
//        (new WebDriverWait(driver, 10))
//                .until(ExpectedConditions.presenceOfElementLocated());

//        (new WebDriverWait(driver, 5))
////                .until(ExpectedConditions
////                        .visibilityOfElementLocated(By.xpath("//span[contains(text(),'Мурманск')]"))).click();

        //        String temp = driver.switchTo().alert().getText();
//        System.out.println(temp);

//        Alert alert = (new WebDriverWait(driver, 5))
//                .until(ExpectedConditions.alertIsPresent());
//        String temp = alert.getText();
//        System.out.println(temp);

        //Работает конечно,но мне нужно другое поведение
//        WebElement element = waitForElementPresentRefact(By.xpath("//span[contains(text(),'Мурманск')]"),7);
//        element.click();

        //Работает конечно,но мне нужно другое поведение
        //Кликнули на слово "Мурманск"
//        WebElement element = waitForElementPresentRefact(By.xpath("//span[contains(text(),'Мурманск')]"),7);
//        element.click();
//        //не работает
//        WebElement element2 = waitForElementPresentRefact(By.xpath("//*[@id='header-search']"),7);
//        element2.click();
//        element2.sendKeys("Санкт-Петербург");
//        // /html/body/div[8]/div/div/div/div/form/div[2]/button/span
//        WebElement element3 = waitForElementPresentRefact(By.xpath("/html/body/div[8]/div/div/div/div/form/div[2]/button/span"),7);
//        element3.click();

//        try {
//            //Switch to the Help Popup Browser Window
//            driver.switchTo().window("Ваш регион");
//
//        } catch (NoSuchWindowException e) {
//            e.printStackTrace();
//        }
//        System.out.println(driver.getTitle());

        //Не работает
//        try {
//            //Get the Alert
//            Alert alert = driver.switchTo().alert();
//
//            //Get the Text displayed on Alert using getText() method of Alert class
//            String textOnAlert = alert.getText();
//            System.out.println(textOnAlert);
//
//            //Click OK button, by calling accept() method of Alert Class
//            alert.accept();
//
//        } catch (NoAlertPresentException e) {
//            e.printStackTrace();
//        }

//        WebElement element = driver.findElement(By.xpath("//span[contains(text(),'Мурманск')] "));
//        element.click();

//        WebElement element = waitForElementPresentRefact(By.xpath("//*[contains(text(),'Электроника')]"),5);
//        element.click();

        //вот вроде div того окна,что я пытаюсь поймать
//        WebElement element = waitForElementPresentRefact(By.xpath("//*[@class='vjy5cDnT-y']"),5);
//        JavascriptExecutor js = null;
//        if (driver instanceof JavascriptExecutor) {
//            js = (JavascriptExecutor) driver;
//        }
//        js.executeScript("return document.getElementsByClassName('review-info-star')[0].remove();");


        //работатает - не работает(тест падает)
        //elektronikaLnk.click();

//        WebElement element = waitForElementPresentRefact(By.xpath("/html/body/div[2]/div[2]/div[2]/div/div/div/noindex/div/div/div/div[2]/div/div[1]/div[3]/div/a/span"),7);
//        element.click();


//        WebElement element =  driver.findElement(By.xpath("//div/button/span[text()=\"Да, спасибо\"]"));
//        element.click();
//        WebElement element2 = waitForElementPresentRefact(By.xpath("//*span[contains(text(),'Электроника')]"),10);
//        element2.click();

//        JavascriptExecutor jse = (JavascriptExecutor) driver;
//        jse.executeScript("document.getElementById('elementid').focus();");

//
//        JavascriptExecutor js = null;
//        if (driver instanceof JavascriptExecutor) {
//            js = (JavascriptExecutor) driver;
//        }
//        js.executeScript("return document.getElementsByXpath(//*[@class='vjy5cDnT-y']).remove();");
//        Actions action = new Actions(driver);
//        //WebElement docDiv = driver.findElement(By.xpath("//*[@id='header-search']"));
//        WebElement docDiv = waitForElementPresentRefact(By.xpath("//*[@id='header-search']"),10);
//        action.clickAndHold(docDiv).build().perform();
//        action.moveToElement(docDiv, 100, 100).build().perform();
//        action.release().build().perform();

//        int x = 1;
//        int y = 200;
//        new Actions(driver).moveByOffset(x, y).click().build().perform();

        //Вариант 1
        if (driver instanceof JavascriptExecutor) {
            ((JavascriptExecutor) driver).executeScript("el = document.elementFromPoint(1, 200); el.click();");
        }

        //работатает - не работает(тест падает)
//        elektronikaLnk.click();
        //Вариант 2
//        Actions action = new Actions(driver);
//        WebElement docDiv = waitForElementPresentRefact(By.xpath("//*span[contains(text(),'Электроника')]"),10);
//        action.clickAndHold(docDiv).build().perform();
        waitForElementPresentRefact(By.xpath("//*span[contains(text(),'Электроника')]"),5).click();

    }

    /**
     * Нажимаем на ссылку "Электроника"
     */
    public void clickElektronikaLnkRefact(){
        //Вариант 1
        if (driver instanceof JavascriptExecutor) {
            ((JavascriptExecutor) driver).executeScript("el = document.elementFromPoint(1, 200); el.click();");
        }

        //Вариант 2
        Actions action = new Actions(driver);
        WebElement docDiv = waitForElementPresentRefact(By.xpath("//*span[contains(text(),'Электроника')]"),1);
        action.clickAndHold(docDiv).build().perform();

    }

    public void clickSearchInpt(){
//        searchInpt.click();
//        WebElement sign = driver.findElement(By.linkText("Sign in"));
    }
}
