package com.wavemaker.tests.listeners;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.IClassListener;
import org.testng.IInvokedMethod;
import org.testng.IInvokedMethodListener;
import org.testng.ITestClass;
import org.testng.ITestResult;

/**
 * Created by Tejaswi Maryala on 12/1/2017.
 */
public class APITestListener implements IClassListener, IInvokedMethodListener {

    private static final Logger logger = LoggerFactory.getLogger(APITestListener.class);

    @Override
    public void onBeforeClass(final ITestClass testClass) {
        logger.info("{} - {} Before class started in suite {} and context {}", Thread.currentThread().getId(), testClass.getName(),
                testClass.getXmlTest().getSuite().getName(), testClass.getXmlTest().getName());
    }

    @Override
    public void onAfterClass(final ITestClass testClass) {
        logger.info("{} - {} After class started in suite {} and context {}", Thread.currentThread().getId(), testClass.getName(),
                testClass.getXmlTest().getSuite().getName(), testClass.getXmlTest().getName());
    }

    @Override
    public void beforeInvocation(final IInvokedMethod method, final ITestResult testResult) {
        logger.info("{} - {}_{} Before Method started in suite {} and context {}", Thread.currentThread().getId(),
                method.getTestMethod().getTestClass().getRealClass().getSimpleName(), method.getTestMethod().getMethodName(),
                method.getTestMethod().getTestClass().getXmlTest().getSuite().getName(),
                method.getTestMethod().getTestClass().getXmlTest().getName());
    }

    @Override
    public void afterInvocation(final IInvokedMethod method, final ITestResult testResult) {
        logger.info("{} - {}_{} After Method started in suite {} and context {}", Thread.currentThread().getId(),
                method.getTestMethod().getTestClass().getRealClass().getSimpleName(), method.getTestMethod().getMethodName(),
                method.getTestMethod().getTestClass().getXmlTest().getSuite().getName(),
                method.getTestMethod().getTestClass().getXmlTest().getName());
    }
}
