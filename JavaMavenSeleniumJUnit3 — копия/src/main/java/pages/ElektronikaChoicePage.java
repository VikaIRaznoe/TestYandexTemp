package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ElektronikaChoicePage {
    public WebDriver driver;

    /**
     * конструктор класса, занимающийся инициализацией полей класса
     */
    public ElektronikaChoicePage(WebDriver driver) {
        PageFactory.initElements(driver, this);
        this.driver = driver;
    }

    /**
     * определение локатора ссылки "Маркет"
     */
    @FindBy(xpath = "//span[contains(text(),'Электроника')]")
    private WebElement elektronikaLnk;

    public void clickElektronikaLnk() {
        elektronikaLnk.click();
    }

}
