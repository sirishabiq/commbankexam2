package com.exam.automation.common;

import com.aventstack.extentreports.ExtentTest;
import com.exam.automation.core.BaseWebDriver;
import org.openqa.selenium.WebDriver;

/**
 * Created by SirishaK on 12/01/2020.
 */
public class FunctionalHelper extends BaseWebDriver {

    private WebDriver driver;
    private Waits waits;

    public FunctionalHelper(WebDriver driver,Waits waits) {
        this.driver = driver;
        this.waits = waits;
    }

    public void createChildNodeInReport(String testCaseName,String testCaseDesc){
        ExtentTest child = parentTest.createNode(testCaseName,testCaseDesc);
        childTest= child;
    }

    //to fill the new account creation form
    public void doAccountCreationFormFill(String userName,String password,String secretAns1,String secretAns2) {
        objInit.actionHelper.clickElement(objInit.accountCreationFormPage.userName);
        objInit.actionHelper.sendTxt(objInit.accountCreationFormPage.userName,userName);
        objInit.actionHelper.clickElement(objInit.accountCreationFormPage.password);
        objInit.actionHelper.sendTxt(objInit.accountCreationFormPage.password,password);
        objInit.actionHelper.clickElement(objInit.accountCreationFormPage.reenterPassword);
        objInit.actionHelper.sendTxt(objInit.accountCreationFormPage.reenterPassword,password);
        objInit.actionHelper.clickElement(objInit.actionHelper.getRandomDropdownValue(objInit.accountCreationFormPage.securityQuestion1));
        objInit.actionHelper.sendTxt(objInit.accountCreationFormPage.securityAnswer1,secretAns1);
        objInit.actionHelper.clickElement(objInit.actionHelper.getRandomDropdownValue(objInit.accountCreationFormPage.securityQuestion2));
        objInit.actionHelper.sendTxt(objInit.accountCreationFormPage.securityAnswer2,secretAns2);
        objInit.actionHelper.clickElement(objInit.accountCreationFormPage.createAccountBtn);
    }
}
