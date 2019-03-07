package com.wavemaker.tests.listeners;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.IExecutionListener;

/**
 * @author Harish Vanama
 * @since 9/6/2018
 */
public class WMApiExecutionListener implements IExecutionListener {
    private static final Logger logger = LoggerFactory.getLogger(WMApiExecutionListener.class);

    @Override
    public void onExecutionStart() {
        logger.info("Execution Started {}", Thread.currentThread().getId());
    }

    @Override
    public void onExecutionFinish() {
        logger.info("Execution finished {}", Thread.currentThread().getId());
    }
}
