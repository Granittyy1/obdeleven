package io.intercom.android.sdk.utilities;

/* JADX INFO: loaded from: classes.dex */
public class NameUtils {
    public static String getInitial(String str) {
        String strTrim = str.trim();
        return strTrim.isEmpty() ? "" : String.valueOf(strTrim.charAt(0));
    }
}
