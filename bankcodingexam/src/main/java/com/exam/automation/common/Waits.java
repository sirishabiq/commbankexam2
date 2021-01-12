package com.exam.automation.common;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;
import java.util.concurrent.TimeUnit;

/**
 * Created by SirishaK on 12/01/2020.
 */
public class Waits {

    private WebDriver driver;

    public Waits(WebDriver driver) {
        this.driver = driver;
    }

    public void implicitWaitInSeconds(int number) {

        driver.manage().timeouts().implicitlyWait(number, TimeUnit.SECONDS);
    }

    public List<WebElement> explicitWaitNoOfElementsToBe(By by, int count) {
        return explicitwait().until(ExpectedConditions.numberOfElementsToBe(by,count));
    }

    public void pageLoadTimeOutInSeconds(int number) {
        driver.manage().timeouts().setScriptTimeout(number, TimeUnit.SECONDS);
    }

    public WebDriverWait explicitwait() {

        WebDriverWait wait = new WebDriverWait(driver, 60);
        return wait;

    }

    public WebElement explicitWaitVisibilityOf(WebElement ele) {
        return explicitwait().until(ExpectedConditions.visibilityOf(ele));
    }

    public void sleepInSeconds(int i) {
        try {
            Thread.sleep(i);
        }catch (Exception e){

        }
    }
}
