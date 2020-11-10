package com.mon.guard;


public class Usage {
    private String packageName;
    private long dailyTimeInForeground;
    private String appName;
    private long lastUsedTimeStamp;


    public String getPackageName() {
        return packageName;
    }

    public void setPackageName(String packageName) {
        this.packageName = packageName;
    }

    public long getDailyTimeInForeground() {
        return dailyTimeInForeground;
    }

    public void setDailyTimeInForeground(long dailyTimeInForeground) {
        this.dailyTimeInForeground = dailyTimeInForeground;
    }

    public String getAppName() {
        return appName;
    }

    public void setAppName(String appName) {
        this.appName = appName;
    }

    public long getLastUsedTimeStamp() {
        return lastUsedTimeStamp;
    }

    public void setLastUsedTimeStamp(long lastUsedTimeStamp) {
        this.lastUsedTimeStamp = lastUsedTimeStamp;
    }


}
