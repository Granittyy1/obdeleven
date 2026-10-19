package com.google.android.gms.internal.measurement;

import java.nio.charset.Charset;

/* JADX INFO: renamed from: com.google.android.gms.internal.measurement.h3, reason: case insensitive filesystem */
/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement-base@@21.6.1 */
/* JADX INFO: loaded from: classes3.dex */
public final class C1825h3 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final C1818g3 f25764b = new C1818g3();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C1832i3 f25765a;

    public C1825h3() {
        InterfaceC1881p3 interfaceC1881p3;
        try {
            interfaceC1881p3 = (InterfaceC1881p3) Class.forName("com.google.protobuf.DescriptorMessageInfoFactory").getDeclaredMethod("getInstance", null).invoke(null, null);
        } catch (Exception unused) {
            interfaceC1881p3 = f25764b;
        }
        InterfaceC1881p3[] interfaceC1881p3Arr = {L2.f25505a, interfaceC1881p3};
        C1832i3 c1832i3 = new C1832i3();
        c1832i3.f25772a = interfaceC1881p3Arr;
        Charset charset = Q2.f25563a;
        this.f25765a = c1832i3;
    }
}
