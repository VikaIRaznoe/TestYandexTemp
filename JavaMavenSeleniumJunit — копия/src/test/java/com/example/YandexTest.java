package com.example;

import org.junit.Test;
public class YandexTest extends BaseTest{

    @Test
    public void mainYandexPageTest() throws InterruptedException {
        mainYandexPage.clickMarketLnk();
//        marketChoicePage.clickSearchInpt();
        marketChoicePage.clickElektronikaLnk();
    }
}