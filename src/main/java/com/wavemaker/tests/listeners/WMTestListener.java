package com.wavemaker.tests.listeners;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.slf4j.MDC;
import org.testng.IConfigurationListener2;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.internal.ConstructorOrMethod;

/**
 * Created by harishv on 4/19/2016.
 */
public class WMTestListener implements ITestListener, IConfigurationListener2 {

    private static final Logger logger = LoggerFactory.getLogger(WMTestListener.class);
    private static final String VARIABLE = "variable";

    @Override
    public void onTestStart(final ITestResult result) {
        final String className = result.getTestClass().getRealClass().getSimpleName();
        final String methodName = result.getMethod().getMethodName();
        logger.info("{} - test {}_{} has started in suite {} and context {}", Thread.currentThread().getId(), className, methodName,
                result.getTestContext().getSuite().getName(), result
                        .getTestContext().getName());
    }

    @Override
    public void onTestSuccess(final ITestResult result) {
        final String className = result.getTestClass().getRealClass().getSimpleName();
        final String methodName = result.getMethod().getMethodName();
        logger.info("{} - test {}_{} has passed in suite {} and context {}", Thread.currentThread().getId(), className, methodName,
                result.getTestContext().getSuite().getName(), result
                        .getTestContext().getName());
    }

    @Override
    public void onTestFailure(final ITestResult result) {
        final String className = result.getTestClass().getRealClass().getSimpleName();
        final String methodName = result.getMethod().getMethodName();
        logger.info("{} - test {}_{} has failed in suite {} and context {}", Thread.currentThread().getId(), className, methodName,
                result.getTestContext().getSuite().getName(), result
                        .getTestContext().getName());
    }

    @Override
    public void onTestSkipped(final ITestResult result) {
        try {
            final String className = result.getTestClass().getRealClass().getSimpleName();
            final String methodName = result.getMethod().getMethodName();
            logger.info("{} - test {}_{} has skipped in suite {} and context {}", Thread.currentThread().getId(), className, methodName,
                    result.getTestContext().getSuite().getName(), result
                            .getTestContext().getName());
        } finally {
            MDC.remove(VARIABLE);
        }
    }

    @Override
    public void onTestFailedButWithinSuccessPercentage(final ITestResult result) {
    }

    @Override
    public void onStart(final ITestContext context) {
        logger.info("{} - context {} in suite {} has started", Thread.currentThread().getId(), context.getName(),
                context.getSuite().getName());
    }

    @Override
    public void onFinish(final ITestContext context) {
        logger.info("{} - context {} in suite {} has finished", Thread.currentThread().getId(), context.getName(),
                context.getSuite().getName());
    }

    @Override
    public void beforeConfiguration(final ITestResult tr) {
        ConstructorOrMethod method = tr.getMethod().getConstructorOrMethod();
        logger.info("{} - Calling method {} in class {}", Thread.currentThread().getId(), method.getName(),
                method.getDeclaringClass().getName());

    }

    @Override
    public void onConfigurationSuccess(final ITestResult itr) {
        logger.info("{} - {}_{} configuration method {} has passed", Thread.currentThread().getId(),
                itr.getTestClass().getRealClass().getSimpleName(),
                itr.getMethod().getConstructorOrMethod().getName(), itr.getMethod().getMethodName());
    }

    @Override
    public void onConfigurationFailure(final ITestResult itr) {
        String testMethodName = itr.getMethod().getConstructorOrMethod().getName();
        logger.error("{} - {}_{} configuration method {} has failed", Thread.currentThread().getId(),
                itr.getTestClass().getRealClass().getSimpleName(),
                testMethodName, itr.getMethod().getMethodName(), itr.getThrowable());
    }

    @Override
    public void onConfigurationSkip(final ITestResult itr) {
        String testMethodName = itr.getMethod().getConstructorOrMethod().getName();
        logger.error("{} - {}_{} configuration method {} has skipped", Thread.currentThread().getId(),
                itr.getTestClass().getRealClass().getSimpleName(),
                testMethodName, itr.getMethod().getMethodName(), itr.getThrowable());
    }
}
