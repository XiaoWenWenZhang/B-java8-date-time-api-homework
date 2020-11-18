package com.thoughtworks.capability.gtb;

import java.time.LocalDate;

/**
 * 计算任意日期与下一个劳动节相差多少天
 *
 * @author itutry
 * @create 2020-05-15_16:33
 */
public class Practice1 {

    public static long getDaysBetweenNextLaborDay(LocalDate date) {
        long interval;
        int year = date.getYear();
        int month = date.getMonthValue();
        int day = date.getDayOfMonth();
        if (month > 5 || (month == 5 && day > 1)) {
            LocalDate labor = LocalDate.of(year + 1, 5, 1);
            interval = labor.toEpochDay() - date.toEpochDay();
            System.out.println(interval);
        } else {
            LocalDate labor = LocalDate.of(year, 5, 1);
            interval = labor.toEpochDay() - date.toEpochDay();
        }
        return interval;
    }
}
