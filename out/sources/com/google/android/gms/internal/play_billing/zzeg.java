package com.google.android.gms.internal.play_billing;

import java.io.IOException;
import java.nio.charset.Charset;

/* JADX INFO: compiled from: com.android.billingclient:billing@@8.0.0 */
/* JADX INFO: loaded from: classes3.dex */
class zzeg extends zzef {
    protected final byte[] zza;

    public zzeg(byte[] bArr) {
        bArr.getClass();
        this.zza = bArr;
    }

    @Override // com.google.android.gms.internal.play_billing.zzei
    public byte d(int i10) {
        return this.zza[i10];
    }

    @Override // com.google.android.gms.internal.play_billing.zzei
    public byte e(int i10) {
        return this.zza[i10];
    }

    @Override // com.google.android.gms.internal.play_billing.zzei
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof zzei) || g() != ((zzei) obj).g()) {
            return false;
        }
        if (g() == 0) {
            return true;
        }
        if (!(obj instanceof zzeg)) {
            return obj.equals(this);
        }
        zzeg zzegVar = (zzeg) obj;
        int iA = A();
        int iA2 = zzegVar.A();
        if (iA != 0 && iA2 != 0 && iA != iA2) {
            return false;
        }
        int iG = g();
        if (iG > zzegVar.g()) {
            throw new IllegalArgumentException("Length too large: " + iG + g());
        }
        if (iG > zzegVar.g()) {
            throw new IllegalArgumentException(A8.f.d(iG, zzegVar.g(), "Ran off end of other: 0, ", ", "));
        }
        byte[] bArr = this.zza;
        byte[] bArr2 = zzegVar.zza;
        int i10 = 0;
        int i11 = 0;
        while (i10 < iG) {
            if (bArr[i10] != bArr2[i11]) {
                return false;
            }
            i10++;
            i11++;
        }
        return true;
    }

    @Override // com.google.android.gms.internal.play_billing.zzei
    public int g() {
        return this.zza.length;
    }

    @Override // com.google.android.gms.internal.play_billing.zzei
    public final int k(int i10, int i11) {
        byte[] bArr = this.zza;
        Charset charset = O0.f26148a;
        for (int i12 = 0; i12 < i11; i12++) {
            i10 = (i10 * 31) + bArr[i12];
        }
        return i10;
    }

    @Override // com.google.android.gms.internal.play_billing.zzei
    public final zzei q() {
        int iV = zzei.v(0, 47, g());
        return iV == 0 ? zzei.f26345b : new zzec(iV, this.zza);
    }

    @Override // com.google.android.gms.internal.play_billing.zzei
    public final void s(C1999q0 c1999q0) throws IOException {
        c1999q0.w(g(), this.zza);
    }
}
