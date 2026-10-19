package com.google.android.gms.internal.play_billing;

/* JADX INFO: compiled from: com.android.billingclient:billing@@8.0.0 */
/* JADX INFO: loaded from: classes3.dex */
public final class D0 implements InterfaceC1961d1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final D0 f26110a = new D0();

    @Override // com.google.android.gms.internal.play_billing.InterfaceC1961d1
    public final InterfaceC1958c1 a(Class cls) {
        if (!I0.class.isAssignableFrom(cls)) {
            throw new IllegalArgumentException("Unsupported message type: ".concat(cls.getName()));
        }
        try {
            return (InterfaceC1958c1) I0.j(cls.asSubclass(I0.class)).g(3);
        } catch (Exception e10) {
            throw new RuntimeException("Unable to get message info for ".concat(cls.getName()), e10);
        }
    }

    @Override // com.google.android.gms.internal.play_billing.InterfaceC1961d1
    public final boolean b(Class cls) {
        return I0.class.isAssignableFrom(cls);
    }
}
