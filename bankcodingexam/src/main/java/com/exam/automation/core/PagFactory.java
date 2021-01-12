package com.exam.automation.core;

import com.exam.automation.common.Waits;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

/**
 * Created by SirishaK on 12/01/2020.
 */
public class PagFactory {

    public WebDriver driver;
    public Waits waits;

    public PagFactory(WebDriver driver, Waits waits) {

        this.driver =  driver;
        this.waits = waits;
        PageFactory.initElements(driver,this);
    }


}
