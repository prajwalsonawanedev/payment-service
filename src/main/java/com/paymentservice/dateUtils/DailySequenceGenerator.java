package com.paymentservice.dateUtils;

import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.concurrent.atomic.AtomicInteger;

@Service
public class DailySequenceGenerator {

    private String today;

    private AtomicInteger counter;

    public DailySequenceGenerator() {
        resetForToday();
    }
    public synchronized String next() {
        String currentDate = LocalDate.now().format(DateTimeFormatter.BASIC_ISO_DATE);

        if (!currentDate.equals(today)) {
            resetForToday();
        }

        return today + "-" + counter.getAndIncrement();
    }

    private void resetForToday() {
        this.today = LocalDate.now().format(DateTimeFormatter.BASIC_ISO_DATE);
        this.counter = new AtomicInteger(1);
    }


}
