package com.exam.automation.pageObjects;

import com.exam.automation.common.Waits;
import com.exam.automation.core.PagFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

/**
 * Created by gollamudi.sirisha on 13/01/2021.
 */
public class RegisterUserPage extends PagFactory {

    @FindBy(how = How.XPATH, using = "//*[contains(text(),'Step 1 - Service details')]")
    public WebElement serviceDetialsHeading;

    public RegisterUserPage(WebDriver driver, Waits waits) {
        super(driver, waits);
    }

}
