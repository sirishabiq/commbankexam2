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
public class RegistrationPage extends PagFactory {

    @FindBy(how = How.ID, using = "chkMMFXSelected")
    public WebElement foriegnExchangeCheckBox;
    @FindBy(how = How.ID, using = "rdoAdvanced")
    public WebElement advancedRadioBtn;
    @FindBy(how = How.ID, using = "btnNext")
    public WebElement okLetsGoBtn;

    public RegistrationPage(WebDriver driver, Waits waits) {
        super(driver, waits);
    }

}
