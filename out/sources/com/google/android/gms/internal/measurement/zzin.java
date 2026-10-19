package com.google.android.gms.internal.measurement;

/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement-base@@21.6.1 */
/* JADX INFO: loaded from: classes3.dex */
final class zzin extends zzit {
    private final int zzc;
    private final int zzd;

    public zzin(byte[] bArr, int i10, int i11) {
        super(bArr);
        zzij.g(i10, i10 + i11, bArr.length);
        this.zzc = i10;
        this.zzd = i11;
    }

    @Override // com.google.android.gms.internal.measurement.zzit, com.google.android.gms.internal.measurement.zzij
    public final byte A(int i10) {
        return this.zzb[this.zzc + i10];
    }

    @Override // com.google.android.gms.internal.measurement.zzit, com.google.android.gms.internal.measurement.zzij
    public final int B() {
        return this.zzd;
    }

    @Override // com.google.android.gms.internal.measurement.zzit
    public final int I() {
        return this.zzc;
    }

    @Override // com.google.android.gms.internal.measurement.zzit, com.google.android.gms.internal.measurement.zzij
    public final byte d(int i10) {
        int i11 = this.zzd;
        if (((i11 - (i10 + 1)) | i10) >= 0) {
            return this.zzb[this.zzc + i10];
        }
        if (i10 < 0) {
            throw new ArrayIndexOutOfBoundsException(J4.i.b(i10, "Index < 0: "));
        }
        throw new ArrayIndexOutOfBoundsException(A8.f.d(i10, i11, "Index > length: ", ", "));
    }
}
