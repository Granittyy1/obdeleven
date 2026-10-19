package com.parse;

import android.util.Log;

/* JADX INFO: loaded from: classes3.dex */
public class PLog {
    private static int logLevel = Integer.MAX_VALUE;

    public static void d(String str, String str2, Throwable th) {
        log(3, str, str2, th);
    }

    public static void e(String str, String str2, Throwable th) {
        log(6, str, str2, th);
    }

    public static int getLogLevel() {
        return logLevel;
    }

    public static void i(String str, String str2, Throwable th) {
        log(4, str, str2, th);
    }

    private static void log(int i10, String str, String str2, Throwable th) {
        int i11 = logLevel;
        if (i10 >= i11) {
            if (th == null) {
                Log.println(i11, str, str2);
                return;
            }
            Log.println(i11, str, str2 + '\n' + Log.getStackTraceString(th));
        }
    }

    public static void v(String str, String str2, Throwable th) {
        log(2, str, str2, th);
    }

    public static void w(String str, String str2, Throwable th) {
        log(5, str, str2, th);
    }

    public static void d(String str, String str2) {
        d(str, str2, null);
    }

    public static void e(String str, String str2) {
        e(str, str2, null);
    }

    public static void i(String str, String str2) {
        i(str, str2, null);
    }

    public static void v(String str, String str2) {
        v(str, str2, null);
    }

    public static void w(String str, String str2) {
        w(str, str2, null);
    }
}
