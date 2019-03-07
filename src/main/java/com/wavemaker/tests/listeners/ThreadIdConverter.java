package com.wavemaker.tests.listeners;

import java.util.concurrent.atomic.AtomicInteger;

import ch.qos.logback.classic.pattern.ClassicConverter;
import ch.qos.logback.classic.spi.ILoggingEvent;

/**
 * Created by Tejaswi Maryala on 10/11/2018.
 */
public class ThreadIdConverter extends ClassicConverter {

    private static AtomicInteger atomicInteger = new AtomicInteger();
    private static final ThreadLocal<String> threadId = ThreadLocal.withInitial(() -> {
        String format = String.format("%05d", atomicInteger.incrementAndGet());
        System.out.println("Hello " + format);
        return format;
    });

    @Override
    public String convert(ILoggingEvent event) {
        return threadId.get();
    }
}
