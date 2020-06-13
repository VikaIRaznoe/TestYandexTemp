package pages;

import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.awt.*;

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
    @FindBy(xpath = "//span[contains(text(),'Электроника')]")
    public WebElement elektronikaLnk;


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
        //Вариант 1
        //не работает(тест падает)
//        elektronikaLnk.click();

        //Вариант 2
//        waitForElementPresentRefact(By.xpath("//span[contains(text(),'Электроника')]"),5).click();

        //Вариант 3
//        if (driver instanceof JavascriptExecutor) {
//            ((JavascriptExecutor) driver).executeScript("el = document.elementFromPoint(1, 200); el.click();");
//        }
//        elektronikaLnk.click();

        //Вариант 4
//        if (driver instanceof JavascriptExecutor) {
//            ((JavascriptExecutor) driver).executeScript("el = document.elementFromPoint(1, 200); el.click();");
//        }
//        waitForElementPresentRefact(By.xpath("//span[contains(text(),'Электроника')]"),5).click();

        //Вариант 5
        Actions action = new Actions(driver);
        WebElement docDiv = waitForElementPresentRefact(By.xpath("//span[contains(text(),'Электроника')]"),1);
        action.clickAndHold(docDiv).build().perform();

    }
}
