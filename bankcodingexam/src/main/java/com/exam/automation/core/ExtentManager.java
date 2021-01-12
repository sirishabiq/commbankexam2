package com.exam.automation.core;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

/**
 * Created by SirishaK on 12/01/2020.
 */
public class ExtentManager {

   public static ExtentReports extent;
   public static ExtentHtmlReporter htmlReporter;

    public static ExtentReports getInstance() {
        if (extent == null)
            createInstance("extent.html");
        return extent;
    }

    public static synchronized ExtentReports createInstance(String fileName) {
        htmlReporter = new ExtentHtmlReporter(fileName);
        htmlReporter.config().setTheme(Theme.STANDARD);
        htmlReporter.config().setDocumentTitle("P3 Portal Automation Extent Report");
        htmlReporter.config().setEncoding("utf-8");
        htmlReporter.config().setReportName(fileName);
        extent =new ExtentReports();
        extent.attachReporter(htmlReporter);
        return extent;
    }

}