package com.google.android.gms.internal.play_billing;

/* JADX INFO: renamed from: com.google.android.gms.internal.play_billing.n1, reason: case insensitive filesystem */
/* JADX INFO: compiled from: com.android.billingclient:billing@@8.0.0 */
/* JADX INFO: loaded from: classes3.dex */
public final class C1991n1 implements InterfaceC1958c1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final InterfaceC1967f1 f26226a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f26227b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object[] f26228c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f26229d;

    public C1991n1(InterfaceC1967f1 interfaceC1967f1, String str, Object[] objArr) {
        this.f26226a = interfaceC1967f1;
        this.f26227b = str;
        this.f26228c = objArr;
        char cCharAt = str.charAt(0);
        if (cCharAt < 55296) {
            this.f26229d = cCharAt;
            return;
        }
        int i10 = cCharAt & 8191;
        int i11 = 13;
        int i12 = 1;
        while (true) {
            int i13 = i12 + 1;
            char cCharAt2 = str.charAt(i12);
            if (cCharAt2 < 55296) {
                this.f26229d = i10 | (cCharAt2 << i11);
                return;
            } else {
                i10 |= (cCharAt2 & 8191) << i11;
                i11 += 13;
                i12 = i13;
            }
        }
    }

    @Override // com.google.android.gms.internal.play_billing.InterfaceC1958c1
    public final InterfaceC1967f1 a() {
        return this.f26226a;
    }

    public final String b() {
        return this.f26227b;
    }

    public final Object[] c() {
        return this.f26228c;
    }

    @Override // com.google.android.gms.internal.play_billing.InterfaceC1958c1
    public final boolean x() {
        return (this.f26229d & 2) == 2;
    }

    @Override // com.google.android.gms.internal.play_billing.InterfaceC1958c1
    public final int y() {
        int i10 = this.f26229d;
        if ((i10 & 1) != 0) {
            return 1;
        }
        return (i10 & 4) == 4 ? 3 : 2;
    }
}
