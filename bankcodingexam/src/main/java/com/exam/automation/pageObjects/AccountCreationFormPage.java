package com.exam.automation.pageObjects;

import com.exam.automation.common.Waits;
import com.exam.automation.core.PagFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

/**
 * Created by SirishaK on 12/01/2020.
 */
public class AccountCreationFormPage extends PagFactory {

    @FindBy(how = How.ID, using = "txtUserName")
    public WebElement userName;
    @FindBy(how = How.ID, using = "txtPassword")
    public WebElement password;
    @FindBy(how = How.ID, using = "txtReenterPassword")
    public WebElement reenterPassword;
    @FindBy(how = How.ID, using = "ddlSecret1")
    public WebElement securityQuestion1;
    @FindBy(how = How.ID, using = "txtSecret1")
    public WebElement securityAnswer1;
    @FindBy(how = How.ID, using = "ddlSecret2")
    public WebElement securityQuestion2;
    @FindBy(how = How.ID, using = "txtSecret2")
    public WebElement securityAnswer2;
    @FindBy(how = How.ID, using = "btnSubmit")
    public WebElement createAccountBtn;

    public AccountCreationFormPage(WebDriver driver, Waits waits) {
        super(driver, waits);
    }

}