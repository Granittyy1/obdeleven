package io.intercom.android.sdk.lightcompressor.utils;

import Ka.a;

/* JADX INFO: compiled from: NumbersUtils.kt */
/* JADX INFO: loaded from: classes3.dex */
public final class NumbersUtilsKt {
    public static final int generateWidthHeightValue(double d10, double d11) {
        return roundEven(a.a((d10 * d11) / ((double) 16)) * 16);
    }

    private static final int roundEven(int i10) {
        return (i10 + 1) & (-2);
    }

    public static final int uInt32ToInt(long j) throws Exception {
        if (j > 2147483647L || j < 0) {
            throw new Exception("uInt32 value is too large");
        }
        return (int) j;
    }

    public static final long uInt32ToLong(int i10) {
        return i10;
    }

    public static final long uInt64ToLong(long j) throws Exception {
        if (j >= 0) {
            return j;
        }
        throw new Exception("uInt64 value is too large");
    }

    public static final int uInt32ToInt(int i10) throws Exception {
        if (i10 >= 0) {
            return i10;
        }
        throw new Exception("uInt32 value is too large");
    }
}
