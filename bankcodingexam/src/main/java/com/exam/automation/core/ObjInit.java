package com.exam.automation.core;

import com.exam.automation.common.ActionHelper;
import com.exam.automation.common.FunctionalHelper;
import com.exam.automation.common.Waits;
import com.exam.automation.pageObjects.*;
import org.openqa.selenium.WebDriver;

/**
 * Created by SirishaK on 12/01/2020.
 */
public class ObjInit {

    // PageObjects
    public ActionHelper actionHelper;
    public FunctionalHelper functionalHelper;
    public LoginPage loginPage;
    public AccountCreationFormPage accountCreationFormPage;
    public RegistrationPage registrationPage;
    public CustomRegistrationPage customRegistrationPage;
    public RegisterUserPage registerUserPage;
    /**
     * Constructor
     */
    public ObjInit(WebDriver driver, Waits waits) throws Exception {
        actionHelper = new ActionHelper(driver,waits);
        functionalHelper = new FunctionalHelper(driver,waits);
        loginPage = new LoginPage(driver,waits);
        accountCreationFormPage = new AccountCreationFormPage(driver,waits);
        registrationPage = new RegistrationPage(driver,waits);
        customRegistrationPage = new CustomRegistrationPage(driver,waits);
        registerUserPage = new RegisterUserPage(driver,waits);

    }
}
