package com.google.android.gms.internal.measurement;

/* JADX INFO: renamed from: com.google.android.gms.internal.measurement.i3, reason: case insensitive filesystem */
/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement-base@@21.6.1 */
/* JADX INFO: loaded from: classes3.dex */
public final class C1832i3 implements InterfaceC1881p3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public InterfaceC1881p3[] f25772a;

    @Override // com.google.android.gms.internal.measurement.InterfaceC1881p3
    public final boolean a(Class<?> cls) {
        for (InterfaceC1881p3 interfaceC1881p3 : this.f25772a) {
            if (interfaceC1881p3.a(cls)) {
                return true;
            }
        }
        return false;
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC1881p3
    public final InterfaceC1888q3 b(Class<?> cls) {
        for (InterfaceC1881p3 interfaceC1881p3 : this.f25772a) {
            if (interfaceC1881p3.a(cls)) {
                return interfaceC1881p3.b(cls);
            }
        }
        throw new UnsupportedOperationException("No factory is available for message type: ".concat(cls.getName()));
    }
}
