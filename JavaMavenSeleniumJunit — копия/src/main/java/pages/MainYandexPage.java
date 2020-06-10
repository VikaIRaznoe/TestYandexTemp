package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MainYandexPage {
    public WebDriver driver;

    /**
     * конструктор класса, занимающийся инициализацией полей класса
     */
    public MainYandexPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
        this.driver = driver;
    }

    /**
     * определение локатора ссылки "Маркет"
     */
    @FindBy(xpath = "//*[contains(@data-id, 'market')]")
    private WebElement marketLnk;


    public void clickMarketLnk() throws InterruptedException {
        marketLnk.click();
    }
}
