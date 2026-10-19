package com.google.android.gms.internal.measurement;

import java.nio.ByteBuffer;
import java.nio.charset.Charset;

/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement-base@@21.6.1 */
/* JADX INFO: loaded from: classes3.dex */
public final class Q2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Charset f25563a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final byte[] f25564b;

    static {
        Charset.forName("US-ASCII");
        f25563a = Charset.forName("UTF-8");
        Charset.forName("ISO-8859-1");
        byte[] bArr = new byte[0];
        f25564b = bArr;
        ByteBuffer.wrap(bArr);
        int length = bArr.length;
        try {
            if (length < 0) {
                throw zzkb.b();
            }
            int i10 = (0 - 0) + length;
            if (i10 < 0) {
                throw zzkb.c();
            }
            if (i10 > Integer.MAX_VALUE) {
                throw zzkb.d();
            }
        } catch (zzkb e10) {
            throw new IllegalArgumentException(e10);
        }
    }

    public static int a(long j) {
        return (int) (j ^ (j >>> 32));
    }
}
