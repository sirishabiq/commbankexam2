package com.exam.automation.core;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import com.exam.automation.common.Waits;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;

/**
 * Created by SirishaK on 12/01/2020.
 */
public class BaseWebDriver {

    public static WebDriver driver ;
    public static ExtentHtmlReporter htmlReporter;
    public static ExtentReports extent;
    public static ObjInit objInit;
    public static Waits waits;
    public static ExtentTest parentTest;
    public static ExtentTest childTest;

    @BeforeSuite
    public void setUpExtentReport(){
        htmlReporter = new ExtentHtmlReporter( "extent.html");
        // create ExtentReports and attach reporter(s)
        extent = new ExtentReports();
        extent.attachReporter(htmlReporter);
    }

    @Parameters({"url"})
    @BeforeClass
    public void setUp(String url) throws Exception {
        System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"/src/test/java/resources/lib/chromedriver.exe");
        driver=new ChromeDriver();
        driver.get(url);
        driver.manage().window().maximize();
        waits = new Waits(driver);
        waits.pageLoadTimeOutInSeconds(10);
        objInit = new  ObjInit(driver,waits);
        ExtentTest parent = extent.createTest(getClass().getName());
        parentTest = parent ;
    }

    @AfterClass
    public void teardown(){

        driver.close();
        driver.quit();
    }

    @AfterSuite
    public void teardownTest(){
        extent.flush();
    }
}
