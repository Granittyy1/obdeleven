package com.google.android.gms.internal.play_billing;

import java.nio.ByteBuffer;
import java.nio.charset.Charset;

/* JADX INFO: compiled from: com.android.billingclient:billing@@8.0.0 */
/* JADX INFO: loaded from: classes3.dex */
public final class O0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Charset f26148a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final byte[] f26149b;

    static {
        Charset.forName("US-ASCII");
        f26148a = Charset.forName("UTF-8");
        Charset.forName("ISO-8859-1");
        byte[] bArr = new byte[0];
        f26149b = bArr;
        ByteBuffer.wrap(bArr);
    }
}
