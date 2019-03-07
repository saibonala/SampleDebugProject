package com.wavemaker.tests;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.annotations.Test;

/**
 * Created by Sairama Krishna Bonala on 10/9/18.
 */
public class TestClass1 {
    private static final Logger logger = LoggerFactory.getLogger(TestClass1.class);

    @Test
    public void testClass1_Test1() {
        logger.info("{} - Started testClass1_Test1", Thread.currentThread().getId());
        sleep();
        logger.info("{} - Ended testClass1_Test1", Thread.currentThread().getId());
    }

    @Test
    public void testClass1_Test2() {
        logger.info("{} - Started testClass1_Test2", Thread.currentThread().getId());
        sleep();
        logger.info("{} - Ended testClass1_Test2", Thread.currentThread().getId());
    }

    @Test
    public void testClass1_Test3() {
        logger.info("{} - Started testClass1_Test3", Thread.currentThread().getId());
        sleep();
        logger.info("{} - Ended testClass1_Test3", Thread.currentThread().getId());
    }

    @Test
    public void testClass1_Test4() {
        logger.info("{} - Started testClass1_Test4", Thread.currentThread().getId());
        sleep();
        logger.info("{} - Ended testClass1_Test4", Thread.currentThread().getId());
    }

    @Test
    public void testClass1_Test5() {
        logger.info("{} - Started testClass1_Test5", Thread.currentThread().getId());
        sleep();
        logger.info("{} - Ended testClass1_Test5", Thread.currentThread().getId());
    }

    @Test
    public void testClass1_Test6() {
        logger.info("{} - Started testClass1_Test6", Thread.currentThread().getId());
        sleep();
        logger.info("{} - Ended testClass1_Test6", Thread.currentThread().getId());
    }

    private static void sleep() {
        try {
            Thread.sleep(1000);
        } catch (Exception e) {
            logger.info("Sleep exception occurred" + e);
        }
    }
}
