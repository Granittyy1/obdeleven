package com.google.android.gms.internal.play_billing;

/* JADX INFO: compiled from: com.android.billingclient:billing@@8.0.0 */
/* JADX INFO: loaded from: classes3.dex */
final class zzec extends zzeg {
    private final int zzc;

    public zzec(int i10, byte[] bArr) {
        super(bArr);
        zzei.v(0, i10, bArr.length);
        this.zzc = i10;
    }

    @Override // com.google.android.gms.internal.play_billing.zzeg, com.google.android.gms.internal.play_billing.zzei
    public final byte d(int i10) {
        int i11 = this.zzc;
        if (((i11 - (i10 + 1)) | i10) >= 0) {
            return ((zzeg) this).zza[i10];
        }
        if (i10 < 0) {
            throw new ArrayIndexOutOfBoundsException(J4.i.b(i10, "Index < 0: "));
        }
        throw new ArrayIndexOutOfBoundsException(A8.f.d(i10, i11, "Index > length: ", ", "));
    }

    @Override // com.google.android.gms.internal.play_billing.zzeg, com.google.android.gms.internal.play_billing.zzei
    public final byte e(int i10) {
        return ((zzeg) this).zza[i10];
    }

    @Override // com.google.android.gms.internal.play_billing.zzeg, com.google.android.gms.internal.play_billing.zzei
    public final int g() {
        return this.zzc;
    }
}
