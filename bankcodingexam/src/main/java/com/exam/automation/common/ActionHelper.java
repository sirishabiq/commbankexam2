package com.exam.automation.common;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.util.List;
import java.util.Random;

/**
 * Created by SirishaK on 12/01/2020.
 */
public class ActionHelper {

    private WebDriver driver;
    private Waits waits;

    public ActionHelper(WebDriver driver,Waits waits) {
        this.driver = driver;
        this.waits = waits;
    }

    public Select dropDown(WebElement ele) {
        Select select = new Select(ele);
        return select;
    }

    public void clickElement(WebElement ele){
        ele.click();
    }

    public boolean isElementDisplayed(WebElement ele){
        try {
            if(ele.isDisplayed()){
                return true;
            }
        } catch (Exception e) {
            return false;
        }
        return false;
    }

    public void sendTxt(WebElement ele,String str){
        ele.sendKeys(str);
    }


    public List<WebElement> getAllDropDownOptions(WebElement ele){
        return dropDown(ele).getOptions();
    }

    public WebElement getRandomWebElement(List<WebElement> list)
    {
        Random random = new Random();
        int index = random.nextInt(list.size());
        return list.get(index);
    }

    public WebElement getRandomDropdownValue(WebElement ele){
        System.out.println("random drop down : "+getRandomWebElement(getAllDropDownOptions(ele)).getText());
        return getRandomWebElement(getAllDropDownOptions(ele));
    }

}


