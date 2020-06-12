package com.example;

import org.junit.Test;

import java.awt.*;

public class YandexTest extends BaseTest{

    @Test
    public void mainYandexPageTest() throws InterruptedException, AWTException {
        mainYandexPage.clickMarketLnk();
        marketChoicePage.clickElektronikaLnk();
    }
}