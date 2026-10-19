package com.google.android.gms.internal.play_billing;

import com.braze.support.BrazeLogger;
import java.util.Arrays;

/* JADX INFO: compiled from: com.android.billingclient:billing@@8.0.0 */
/* JADX INFO: loaded from: classes3.dex */
enum zzb {
    RESPONSE_CODE_UNSPECIFIED(-999),
    /* JADX INFO: Fake field, exist only in values array */
    SERVICE_TIMEOUT(-3),
    /* JADX INFO: Fake field, exist only in values array */
    FEATURE_NOT_SUPPORTED(-2),
    /* JADX INFO: Fake field, exist only in values array */
    SERVICE_DISCONNECTED(-1),
    /* JADX INFO: Fake field, exist only in values array */
    OK(0),
    /* JADX INFO: Fake field, exist only in values array */
    USER_CANCELED(1),
    /* JADX INFO: Fake field, exist only in values array */
    SERVICE_UNAVAILABLE(2),
    /* JADX INFO: Fake field, exist only in values array */
    BILLING_UNAVAILABLE(3),
    /* JADX INFO: Fake field, exist only in values array */
    ITEM_UNAVAILABLE(4),
    /* JADX INFO: Fake field, exist only in values array */
    DEVELOPER_ERROR(5),
    /* JADX INFO: Fake field, exist only in values array */
    ERROR(6),
    /* JADX INFO: Fake field, exist only in values array */
    ITEM_ALREADY_OWNED(7),
    /* JADX INFO: Fake field, exist only in values array */
    ITEM_NOT_OWNED(8),
    /* JADX INFO: Fake field, exist only in values array */
    EXPIRED_OFFER_TOKEN(11),
    /* JADX INFO: Fake field, exist only in values array */
    NETWORK_ERROR(12);


    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final zzbw f26315c;
    private final int zzr;

    static {
        C2012v c2012v = new C2012v();
        c2012v.f26273a = new Object[8];
        c2012v.f26274b = 0;
        for (zzb zzbVar : values()) {
            Integer numValueOf = Integer.valueOf(zzbVar.zzr);
            int i10 = c2012v.f26274b + 1;
            Object[] objArr = c2012v.f26273a;
            int length = objArr.length;
            int i11 = i10 + i10;
            if (i11 > length) {
                if (i11 > length) {
                    length = length + (length >> 1) + 1;
                    if (length < i11) {
                        int iHighestOneBit = Integer.highestOneBit(i11 - 1);
                        length = iHighestOneBit + iHighestOneBit;
                    }
                    if (length < 0) {
                        length = BrazeLogger.SUPPRESS;
                    }
                }
                c2012v.f26273a = Arrays.copyOf(objArr, length);
            }
            Object[] objArr2 = c2012v.f26273a;
            int i12 = c2012v.f26274b;
            int i13 = i12 + i12;
            objArr2[i13] = numValueOf;
            objArr2[i13 + 1] = zzbVar;
            c2012v.f26274b = i12 + 1;
        }
        C2009u c2009u = c2012v.f26275c;
        if (c2009u != null) {
            throw c2009u.a();
        }
        zzcf zzcfVarB = zzcf.b(c2012v.f26274b, c2012v.f26273a, c2012v);
        C2009u c2009u2 = c2012v.f26275c;
        if (c2009u2 != null) {
            throw c2009u2.a();
        }
        f26315c = zzcfVarB;
    }

    zzb(int i10) {
        this.zzr = i10;
    }
}
