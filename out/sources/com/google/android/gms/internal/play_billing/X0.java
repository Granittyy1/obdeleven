package com.google.android.gms.internal.play_billing;

/* JADX INFO: compiled from: com.android.billingclient:billing@@8.0.0 */
/* JADX INFO: loaded from: classes3.dex */
public final class X0 implements InterfaceC1961d1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final InterfaceC1961d1[] f26168a;

    public X0(InterfaceC1961d1... interfaceC1961d1Arr) {
        this.f26168a = interfaceC1961d1Arr;
    }

    @Override // com.google.android.gms.internal.play_billing.InterfaceC1961d1
    public final InterfaceC1958c1 a(Class cls) {
        for (int i10 = 0; i10 < 2; i10++) {
            InterfaceC1961d1 interfaceC1961d1 = this.f26168a[i10];
            if (interfaceC1961d1.b(cls)) {
                return interfaceC1961d1.a(cls);
            }
        }
        throw new UnsupportedOperationException("No factory is available for message type: ".concat(cls.getName()));
    }

    @Override // com.google.android.gms.internal.play_billing.InterfaceC1961d1
    public final boolean b(Class cls) {
        for (int i10 = 0; i10 < 2; i10++) {
            if (this.f26168a[i10].b(cls)) {
                return true;
            }
        }
        return false;
    }
}
