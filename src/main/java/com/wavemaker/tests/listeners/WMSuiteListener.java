package com.wavemaker.tests.listeners;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.ISuite;
import org.testng.ISuiteListener;

/**
 * Created by Tejaswi Maryala on 2/6/2017.
 */
public class WMSuiteListener implements ISuiteListener {

    private static final Logger logger = LoggerFactory.getLogger(WMSuiteListener.class);

    @Override
    public void onStart(final ISuite suite) {
        logger.info("{} - Suite {} has started with Thread Count {}", Thread.currentThread().getId(), suite.getName(),
                suite.getXmlSuite().getThreadCount());
    }

    @Override
    public void onFinish(final ISuite suite) {
        logger.info("{} - {} Suite has Finished", Thread.currentThread().getId(), suite.getName());
    }
}
