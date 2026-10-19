package com.google.android.gms.internal.play_billing;

import java.io.IOException;
import java.io.Serializable;
import java.util.Iterator;
import java.util.Locale;

/* JADX INFO: compiled from: com.android.billingclient:billing@@8.0.0 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class zzei implements Iterable, Serializable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final zzei f26345b = new zzeg(O0.f26149b);
    private int zza = 0;

    static {
        int i10 = C1978j0.f26199a;
    }

    public static zzei B(byte[] bArr, int i10, int i11) {
        v(i10, i10 + i11, bArr.length);
        byte[] bArr2 = new byte[i11];
        System.arraycopy(bArr, i10, bArr2, 0, i11);
        return new zzeg(bArr2);
    }

    public static int v(int i10, int i11, int i12) {
        int i13 = i11 - i10;
        if ((i10 | i11 | i13 | (i12 - i11)) >= 0) {
            return i13;
        }
        if (i10 < 0) {
            throw new IndexOutOfBoundsException(J4.i.c(i10, "Beginning index: ", " < 0"));
        }
        if (i11 < i10) {
            throw new IndexOutOfBoundsException(A8.f.d(i10, i11, "Beginning index larger than ending index: ", ", "));
        }
        throw new IndexOutOfBoundsException(A8.f.d(i11, i12, "End index: ", " >= "));
    }

    public final int A() {
        return this.zza;
    }

    public abstract byte d(int i10);

    public abstract byte e(int i10);

    public abstract boolean equals(Object obj);

    public abstract int g();

    public final int hashCode() {
        int iK = this.zza;
        if (iK == 0) {
            int iG = g();
            iK = k(iG, iG);
            if (iK == 0) {
                iK = 1;
            }
            this.zza = iK;
        }
        return iK;
    }

    @Override // java.lang.Iterable
    public final /* synthetic */ Iterator iterator() {
        return new C1993o0(this);
    }

    public abstract int k(int i10, int i11);

    public abstract zzei q();

    public abstract void s(C1999q0 c1999q0) throws IOException;

    public final String toString() {
        Locale locale = Locale.ROOT;
        String hexString = Integer.toHexString(System.identityHashCode(this));
        int iG = g();
        String strM = g() <= 50 ? A0.f.m(this) : A0.f.m(q()).concat("...");
        StringBuilder sb2 = new StringBuilder("<ByteString@");
        sb2.append(hexString);
        sb2.append(" size=");
        sb2.append(iG);
        sb2.append(" contents=\"");
        return Q8.d.a(sb2, strM, "\">");
    }
}
