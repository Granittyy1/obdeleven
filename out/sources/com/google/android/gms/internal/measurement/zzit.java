package com.google.android.gms.internal.measurement;

import java.io.IOException;
import java.nio.charset.Charset;

/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement-base@@21.6.1 */
/* JADX INFO: loaded from: classes3.dex */
class zzit extends zziq {
    protected final byte[] zzb;

    public zzit(byte[] bArr) {
        bArr.getClass();
        this.zzb = bArr;
    }

    @Override // com.google.android.gms.internal.measurement.zzij
    public byte A(int i10) {
        return this.zzb[i10];
    }

    @Override // com.google.android.gms.internal.measurement.zzij
    public int B() {
        return this.zzb.length;
    }

    @Override // com.google.android.gms.internal.measurement.zzij
    public final int C(int i10, int i11) {
        byte[] bArr = this.zzb;
        int I10 = I();
        Charset charset = Q2.f25563a;
        for (int i12 = I10; i12 < I10 + i11; i12++) {
            i10 = (i10 * 31) + bArr[i12];
        }
        return i10;
    }

    @Override // com.google.android.gms.internal.measurement.zzij
    public final boolean G() {
        int I10 = I();
        byte[] bArr = this.zzb;
        int iB = B() + I10;
        Z3.f25650a.getClass();
        return AbstractC1784b4.a(bArr, I10, iB);
    }

    public int I() {
        return 0;
    }

    @Override // com.google.android.gms.internal.measurement.zzij
    public byte d(int i10) {
        return this.zzb[i10];
    }

    @Override // com.google.android.gms.internal.measurement.zzij
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof zzij) || B() != ((zzij) obj).B()) {
            return false;
        }
        if (B() == 0) {
            return true;
        }
        if (!(obj instanceof zzit)) {
            return obj.equals(this);
        }
        zzit zzitVar = (zzit) obj;
        int iE = e();
        int iE2 = zzitVar.e();
        if (iE != 0 && iE2 != 0 && iE != iE2) {
            return false;
        }
        int iB = B();
        if (iB > zzitVar.B()) {
            throw new IllegalArgumentException("Length too large: " + iB + B());
        }
        if (iB > zzitVar.B()) {
            throw new IllegalArgumentException(A8.f.d(iB, zzitVar.B(), "Ran off end of other: 0, ", ", "));
        }
        byte[] bArr = this.zzb;
        byte[] bArr2 = zzitVar.zzb;
        int I10 = I() + iB;
        int I11 = I();
        int I12 = zzitVar.I();
        while (I11 < I10) {
            if (bArr[I11] != bArr2[I12]) {
                return false;
            }
            I11++;
            I12++;
        }
        return true;
    }

    @Override // com.google.android.gms.internal.measurement.zzij
    public final zzij k() {
        int iG = zzij.g(0, 47, B());
        return iG == 0 ? zzij.f26049b : new zzin(this.zzb, I(), iG);
    }

    @Override // com.google.android.gms.internal.measurement.zzij
    public final String s() {
        return new String(this.zzb, I(), B(), Q2.f25563a);
    }

    @Override // com.google.android.gms.internal.measurement.zzij
    public final void v(zzja.a aVar) throws IOException {
        aVar.I0(this.zzb, I(), B());
    }
}
