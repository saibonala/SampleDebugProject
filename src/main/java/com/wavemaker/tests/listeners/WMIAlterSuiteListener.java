package com.wavemaker.tests.listeners;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.IAlterSuiteListener;
import org.testng.xml.XmlSuite;

/**
 * Created by harishv on 3/7/2017.
 */
public class WMIAlterSuiteListener implements IAlterSuiteListener {
    private static final Logger logger = LoggerFactory.getLogger(WMIAlterSuiteListener.class);

    @Override
    public void alter(final List<XmlSuite> suites) {
    logger.info("Inside alter method {}",Thread.currentThread().getId());
    }
}
