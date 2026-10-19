package com.google.android.gms.internal.measurement;

import java.io.IOException;
import java.io.Serializable;
import java.util.Iterator;
import java.util.Locale;

/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement-base@@21.6.1 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class zzij implements Serializable, Iterable<Byte> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final zzij f26049b = new zzit(Q2.f25564b);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final A8.p f26050c = new A8.p();
    private int zzd = 0;

    public static int g(int i10, int i11, int i12) {
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

    public static zzij q(byte[] bArr, int i10, int i11) {
        g(i10, i10 + i11, bArr.length);
        f26050c.getClass();
        byte[] bArr2 = new byte[i11];
        System.arraycopy(bArr, i10, bArr2, 0, i11);
        return new zzit(bArr2);
    }

    public abstract byte A(int i10);

    public abstract int B();

    public abstract int C(int i10, int i11);

    public abstract boolean G();

    public abstract byte d(int i10);

    public final int e() {
        return this.zzd;
    }

    public abstract boolean equals(Object obj);

    public final int hashCode() {
        int iC = this.zzd;
        if (iC == 0) {
            int iB = B();
            iC = C(iB, iB);
            if (iC == 0) {
                iC = 1;
            }
            this.zzd = iC;
        }
        return iC;
    }

    @Override // java.lang.Iterable
    public final /* synthetic */ Iterator<Byte> iterator() {
        return new C1941y2(this);
    }

    public abstract zzij k();

    public abstract String s();

    public final String toString() {
        Locale locale = Locale.ROOT;
        String hexString = Integer.toHexString(System.identityHashCode(this));
        int iB = B();
        String strO = B() <= 50 ? Y.o(this) : androidx.compose.ui.text.font.s.b(Y.o(k()), "...");
        StringBuilder sb2 = new StringBuilder("<ByteString@");
        sb2.append(hexString);
        sb2.append(" size=");
        sb2.append(iB);
        sb2.append(" contents=\"");
        return Q8.d.a(sb2, strO, "\">");
    }

    public abstract void v(zzja.a aVar) throws IOException;
}
