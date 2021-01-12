package com.exam.automation.pageObjects;

import com.exam.automation.common.Waits;
import com.exam.automation.core.PagFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

/**
 * Created by SirishaK on 12/01/2020.
 */
public class LoginPage extends PagFactory {

    @FindBy(how = How.XPATH, using = "//*[contains(text(),'Register online now')]")
    public WebElement registerOnlineBtn;
    @FindBy(how = How.CLASS_NAME, using = "Register_logIn")
    public WebElement registerOnlineBtn1;
    public By registerOnlineBtnLocater = By.xpath("//*[contains(text(),'Register online now')]");
    public By registerOnlineBtnLocater1 = By.xpath("//*[contains(@class,'Register_logIn')]");

    public LoginPage(WebDriver driver, Waits waits) {
        super(driver,waits);
    }

}
