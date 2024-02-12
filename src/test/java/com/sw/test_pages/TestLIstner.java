package com.sw.test_pages;

import org.testng.ITestListener;
import org.testng.ITestResult;

public class TestLIstner implements ITestListener {

    @Override
    public void onTestSuccess(ITestResult result) {
        System.out.println("Test is Sucessfully executed and the name of the test is : "+result.getName());
    }

    @Override
    public void onTestFailure(ITestResult result) {
        System.out.println("Test is Failed and the name of the test is : "+result.getTestName());

    }
}
