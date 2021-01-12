package com.exam.automation.pageObjects;

import com.exam.automation.common.Waits;
import com.exam.automation.core.PagFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

/**
 * Created by gollamudi.sirisha on 12/01/2021.
 */
public class CustomRegistrationPage extends PagFactory{

    @FindBy(how = How.ID, using = "btnSubmit")
    public WebElement submitBtn;

    public CustomRegistrationPage(WebDriver driver, Waits waits) {
        super(driver, waits);
    }

}
