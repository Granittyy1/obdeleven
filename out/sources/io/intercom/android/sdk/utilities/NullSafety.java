package io.intercom.android.sdk.utilities;

/* JADX INFO: loaded from: classes.dex */
public class NullSafety {
    public static boolean valueOrDefault(Boolean bool, boolean z10) {
        return bool == null ? z10 : bool.booleanValue();
    }

    public static String valueOrEmpty(String str) {
        return str == null ? "" : str;
    }
}
