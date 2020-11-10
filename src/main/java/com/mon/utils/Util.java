package com.mon.utils;
import java.util.*;

public class Util {
    public static long getTodayElapsedTime(){

        // Initialize the calendar object
        Calendar today = new GregorianCalendar();
        int hour = today.get(Calendar.HOUR_OF_DAY);
        System.out.println ("hour = " + hour);
        int minute = today.get(Calendar.MINUTE);
        System.out.println ("minute = " + minute);
        int sec = today.get(Calendar.SECOND);
        System.out.println ("second = " + sec);

        long totalElapsedTime = ( (hour * 60 + minute) * 60 + sec ) * 1000;
        System.out.println ("second = " + totalElapsedTime);

        long end = System.currentTimeMillis();
        long start = end - totalElapsedTime;

//        long currentTime = System.currentTimeMillis();
//        System.out.println ("currentTime = " + currentTime);
        return totalElapsedTime;
    }
}
