package com.wavemaker.tests;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.annotations.Test;

/**
 * Created by Sairama Krishna Bonala on 10/9/18.
 */
public class TestClass5 {
    private static final Logger logger = LoggerFactory.getLogger(TestClass5.class);

    @Test
    public void testClass5_Test1() {
        logger.info("{} - Started testClass5_Test1", Thread.currentThread().getId());
        sleep();
        logger.info("{} - Ended testClass5_Test1", Thread.currentThread().getId());
    }

    @Test
    public void testClass5_Test2() {
        logger.info("{} - Started testClass5_Test2", Thread.currentThread().getId());
        sleep();
        logger.info("{} - Ended testClass5_Test2", Thread.currentThread().getId());
    }

    @Test
    public void testClass5_Test3() {
        logger.info("{} - Started testClass5_Test3", Thread.currentThread().getId());
        sleep();
        logger.info("{} - Ended testClass5_Test3", Thread.currentThread().getId());
    }

    @Test
    public void testClass5_Test4() {
        logger.info("{} - Started testClass5_Test4", Thread.currentThread().getId());
        sleep();
        logger.info("{} - Ended testClass5_Test4", Thread.currentThread().getId());
    }

    @Test
    public void testClass5_Test5() {
        logger.info("{} - Started testClass5_Test5", Thread.currentThread().getId());
        sleep();
        logger.info("{} - Ended testClass5_Test5", Thread.currentThread().getId());
    }

    @Test
    public void testClass5_Test6() {
        logger.info("{} - Started testClass5_Test6", Thread.currentThread().getId());
        sleep();
        logger.info("{} - Ended testClass5_Test6", Thread.currentThread().getId());
    }

    private static void sleep() {
        try {
            Thread.sleep(1000);
        } catch (Exception e) {
            logger.info("Sleep exception occurred" + e);
        }
    }
}
