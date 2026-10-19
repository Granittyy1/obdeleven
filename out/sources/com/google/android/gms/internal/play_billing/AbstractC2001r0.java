package com.google.android.gms.internal.play_billing;

import java.util.logging.Logger;

/* JADX INFO: renamed from: com.google.android.gms.internal.play_billing.r0, reason: case insensitive filesystem */
/* JADX INFO: compiled from: com.android.billingclient:billing@@8.0.0 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC2001r0 extends O.h {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Logger f26243c = Logger.getLogger(AbstractC2001r0.class.getName());

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final boolean f26244d = D1.f26115e;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public C2004s0 f26245b;

    public AbstractC2001r0() {
        throw null;
    }

    public static int p(InterfaceC1967f1 interfaceC1967f1, InterfaceC1994o1 interfaceC1994o1) {
        int iE = ((AbstractC1972h0) interfaceC1967f1).e(interfaceC1994o1);
        return r(iE) + iE;
    }

    public static int q(String str) {
        int length;
        try {
            length = E1.c(str);
        } catch (zzhq unused) {
            length = str.getBytes(O0.f26148a).length;
        }
        return r(length) + length;
    }

    public static int r(int i10) {
        return (352 - (Integer.numberOfLeadingZeros(i10) * 9)) >>> 6;
    }

    public static int s(long j) {
        return (640 - (Long.numberOfLeadingZeros(j) * 9)) >>> 6;
    }

    @Deprecated
    public static int t(int i10, InterfaceC1967f1 interfaceC1967f1, InterfaceC1994o1 interfaceC1994o1) {
        int iR = r(i10 << 3);
        return ((AbstractC1972h0) interfaceC1967f1).e(interfaceC1994o1) + iR + iR;
    }
}
