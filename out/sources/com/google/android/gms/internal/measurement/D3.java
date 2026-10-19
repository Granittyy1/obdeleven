package com.google.android.gms.internal.measurement;

/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement-base@@21.6.1 */
/* JADX INFO: loaded from: classes3.dex */
public final class D3 implements InterfaceC1888q3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final InterfaceC1894r3 f25425a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f25426b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object[] f25427c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f25428d;

    public D3(InterfaceC1894r3 interfaceC1894r3, String str, Object[] objArr) {
        this.f25425a = interfaceC1894r3;
        this.f25426b = str;
        this.f25427c = objArr;
        char cCharAt = str.charAt(0);
        if (cCharAt < 55296) {
            this.f25428d = cCharAt;
            return;
        }
        int i10 = cCharAt & 8191;
        int i11 = 1;
        int i12 = 13;
        while (true) {
            int i13 = i11 + 1;
            char cCharAt2 = str.charAt(i11);
            if (cCharAt2 < 55296) {
                this.f25428d = i10 | (cCharAt2 << i12);
                return;
            } else {
                i10 |= (cCharAt2 & 8191) << i12;
                i12 += 13;
                i11 = i13;
            }
        }
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC1888q3
    public final InterfaceC1894r3 a() {
        return this.f25425a;
    }

    public final String b() {
        return this.f25426b;
    }

    public final Object[] c() {
        return this.f25427c;
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC1888q3
    public final zzlr x() {
        int i10 = this.f25428d;
        if ((i10 & 1) != 0) {
            return zzlr.f26078b;
        }
        return (i10 & 4) == 4 ? zzlr.f26080d : zzlr.f26079c;
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC1888q3
    public final boolean y() {
        return (this.f25428d & 2) == 2;
    }
}
