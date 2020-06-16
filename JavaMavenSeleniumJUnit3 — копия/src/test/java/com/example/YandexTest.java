package com.example;

import org.junit.Test;

import java.awt.*;

public class YandexTest extends BaseTest{

    @Test
    public void elektronikaYandexPageTest() throws InterruptedException {
        elektronikaChoicePage.clickElektronikaLnk();
        Thread.sleep(5000);
    }
}