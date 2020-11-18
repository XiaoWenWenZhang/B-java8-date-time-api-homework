package com.thoughtworks.capability.gtb;

import java.time.Instant;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.util.Calendar;

public class MeetingSystemV3 {

    public static void main(String[] args) {

        /*
         * Date类
         */
//        //获取系统当前时间戳
//        System.out.println(System.currentTimeMillis());
//        // 获取当前时间:
//        Date date = new Date();
//        System.out.println(date);
//        System.out.println(date.getYear() + 1900); // 必须加上1900
//        System.out.println(date.getMonth() + 1); // 0~11，必须加上1
//        System.out.println(date.getDate()); // 1~31，不能加1
//        // 转换为String:
//        System.out.println(date.toString());
//        // 转换为GMT时区:
//        System.out.println(date.toGMTString());
//        // 转换为本地时区:
//        System.out.println(date.toLocaleString());
//
//        SimpleDateFormat formatString = new SimpleDateFormat("yyyy-mm-dd hh:mm:ss");
//        String result = formatString.format(date);
//        System.out.println(result);
//        SimpleDateFormat formatString2 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
//        String result2 = formatString2.format(date);
//        System.out.println(result2);

        /*
         * Calendar类
         */
//        // 获取当前时间:
        Calendar c = Calendar.getInstance();
//        System.out.println(c.getTime());
//        int y = c.get(Calendar.YEAR);
//        int m = 1 + c.get(Calendar.MONTH);
//        int d = c.get(Calendar.DAY_OF_MONTH);
//        int w = c.get(Calendar.DAY_OF_WEEK);
//        int hh = c.get(Calendar.HOUR_OF_DAY);
//        int mm = c.get(Calendar.MINUTE);
//        int ss = c.get(Calendar.SECOND);
//        int ms = c.get(Calendar.MILLISECOND);
//        System.out.println(y + "-" + m + "-" + d + " " + w + " " + hh + ":" + mm + ":" + ss + "." + ms);
//
//        // 清除所有:
//        c.clear();
//        // 设置2019年:
//        c.set(Calendar.YEAR, 2019);
//        // 设置9月:注意8表示9月:
//        c.set(Calendar.MONTH, 8);
//        // 设置2日:
//        c.set(Calendar.DATE, 2);
//        // 设置时间:
//        c.set(Calendar.HOUR_OF_DAY, 21);
//        c.set(Calendar.MINUTE, 22);
//        c.set(Calendar.SECOND, 23);
//        System.out.println(new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(c.getTime()));
        /*
         * TimeZone（时区）类
         */
//        TimeZone tzDefault = TimeZone.getDefault(); // 当前时区
//        TimeZone tzGMT9 = TimeZone.getTimeZone("GMT+09:00"); // GMT+9:00时区
//        TimeZone tzNY = TimeZone.getTimeZone("America/New_York"); // 纽约时区
//        System.out.println(tzDefault.getID()); // Asia/Shanghai
//        System.out.println(tzGMT9.getID()); // GMT+09:00
//        System.out.println(tzNY.getID()); // America/New_York
//
//        String[] iDs = TimeZone.getAvailableIDs();
//        for (String id :iDs){
////            System.out.println(id);
//        }

//        c.clear();
//        // 设置为北京时区:
//        c.setTimeZone(TimeZone.getTimeZone("Asia/Shanghai"));
//        // 设置年月日时分秒:
//        c.set(2019, 10 /* 11月 */, 20, 8, 15, 0);
//        // 显示时间:
//        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
//        sdf.setTimeZone(TimeZone.getTimeZone("America/New_York"));
//        System.out.println(sdf.format(c.getTime()));

        /*
         * LocalDateTime
         */
//        LocalDate d = LocalDate.now(); // 当前日期
//        LocalTime t = LocalTime.now(); // 当前时间
//        LocalDateTime dt = LocalDateTime.now(); // 当前日期和时间
//        System.out.println(d); // 严格按照ISO 8601格式打印
//        System.out.println(t); // 严格按照ISO 8601格式打印
//        System.out.println(dt); // 严格按照ISO 8601格式打印
//
//        // 指定日期和时间:
//        LocalDate d2 = LocalDate.of(2019, 11, 30); // 2019-11-30, 注意11=11月
//        LocalTime t2 = LocalTime.of(15, 16, 17); // 15:16:17
//        LocalDateTime dt2 = LocalDateTime.of(2019, 11, 30, 15, 16, 17);
//        LocalDateTime dt3 = LocalDateTime.of(d2, t2);
//        System.out.println(d2); // 严格按照ISO 8601格式打印
//        System.out.println(t2); // 严格按照ISO 8601格式打印
//        System.out.println(dt2); // 严格按照ISO 8601格式打印
//        System.out.println(dt3); // 严格按照ISO 8601格式打印
//
//        LocalDateTime dt11 = LocalDateTime.parse("2019-11-19T15:16:17");
//        LocalDate d11 = LocalDate.parse("2019-11-19");
//        LocalTime t11 = LocalTime.parse("15:16:17");
//        System.out.println(dt11); // 严格按照ISO 8601格式打印
//        System.out.println(d11); // 严格按照ISO 8601格式打印
//        System.out.println(t11); // 严格按照ISO 8601格式打印
//
//        // 自定义格式化:
//        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
//        System.out.println(dtf.format(LocalDateTime.now()));
//
//        // 用自定义格式解析:
//        LocalDateTime dt22 = LocalDateTime.parse("2019/11/30 15:16:17", dtf);
//        System.out.println(dt22);

        /*
        * instant
        */
        Instant now = Instant.now();
        System.out.println(now.getEpochSecond()); // 秒
        System.out.println(now.toEpochMilli()); // 毫秒

        // 以指定时间戳创建Instant:
        Instant ins = Instant.ofEpochSecond(1568568760);
        ZonedDateTime zdt = ins.atZone(ZoneId.systemDefault());
        System.out.println(zdt); // 2019-09-16T01:32:40+08:00[Asia/Shanghai]


    }
}
