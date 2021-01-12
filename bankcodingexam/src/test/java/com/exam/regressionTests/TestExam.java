package com.exam.regressionTests;

import com.exam.automation.core.BaseWebDriver;
import org.openqa.selenium.NoSuchElementException;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import static org.testng.Assert.fail;

/**
 * Created by SirishaK on 12/01/2020.
 */
public class TestExam extends BaseWebDriver {


    //This test case verifies whether the user is able to create an new account or not
    @Parameters({"userName", "password","secretAnswer1","secretAnswer2"})
    @Test
    public void testRegisterOnlineNow(String username,String password,String secretAns1,String secretAns2) {
        objInit.functionalHelper.createChildNodeInReport("Register Online Now", "The user should be able to create a new account");
        try {
            objInit.actionHelper.clickElement(waits.explicitWaitNoOfElementsToBe(objInit.loginPage.registerOnlineBtnLocater,1).get(0));
            objInit.actionHelper.clickElement(objInit.loginPage.registerOnlineBtn);
            childTest.info("user clicked on Register Online Now Button");
            waits.explicitWaitVisibilityOf(objInit.registrationPage.advancedRadioBtn);
            objInit.actionHelper.clickElement(objInit.registrationPage.advancedRadioBtn);
            childTest.info("user clicked on Advanced radio Button");
            objInit.actionHelper.clickElement(objInit.registrationPage.foriegnExchangeCheckBox);
            childTest.info("user clicked on foreign exchange check box");
            objInit.actionHelper.clickElement(objInit.registrationPage.okLetsGoBtn);
            childTest.info("user clicked on Ok let's go Button");
            waits.explicitWaitVisibilityOf(objInit.customRegistrationPage.submitBtn);
            objInit.actionHelper.clickElement(objInit.customRegistrationPage.submitBtn);
            childTest.info("user clicked on submit Button");
            objInit.functionalHelper.doAccountCreationFormFill(username,password,secretAns1,secretAns2);
            childTest.info("user filled account creation form");
            waits.explicitWaitVisibilityOf(objInit.registerUserPage.serviceDetialsHeading);
            if(objInit.actionHelper.isElementDisplayed(objInit.registerUserPage.serviceDetialsHeading)){
                childTest.pass("Online Account Creation is successfull,The Sub heading have been displayed");
            }else{
                childTest.fail("Online Account Creation is NOT successfull,The Sub heading have Not been displayed");
                fail("Online Account Creation is NOT successfull,The Sub heading have Not been displayed");
            }
        } catch (NoSuchElementException | NullPointerException e) {
            childTest.fail("Online Account Creation is NOT successfull,The Sub heading have Not been displayed"+e.getMessage());
            fail("Online Account Creation is NOT successfull,The Sub heading have Not been displayed"+e.getMessage());
        }
    }
}
