package com.google.android.gms.internal.measurement;

/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement-base@@21.6.1 */
/* JADX INFO: loaded from: classes3.dex */
public final class L2 implements InterfaceC1881p3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final L2 f25505a = new L2();

    @Override // com.google.android.gms.internal.measurement.InterfaceC1881p3
    public final boolean a(Class<?> cls) {
        return N2.class.isAssignableFrom(cls);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC1881p3
    public final InterfaceC1888q3 b(Class<?> cls) {
        if (!N2.class.isAssignableFrom(cls)) {
            throw new IllegalArgumentException("Unsupported message type: ".concat(cls.getName()));
        }
        try {
            return (InterfaceC1888q3) N2.k(cls.asSubclass(N2.class)).n(3);
        } catch (Exception e10) {
            throw new RuntimeException("Unable to get message info for ".concat(cls.getName()), e10);
        }
    }
}
