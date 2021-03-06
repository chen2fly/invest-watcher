package com.haoshen.money.utils;

import java.text.SimpleDateFormat;
import java.util.Date;

public class TimeUtil {

    private static SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

    private static SimpleDateFormat holdDtoDf = new SimpleDateFormat("MM-dd HH:mm:ss");

    public static String getCurrentDateTimeStr() {
        return df.format(new Date());
    }

    public static String getDateTimeStr(Date date) {
        return holdDtoDf.format(date);
    }
}
