package com.google.android.gms.internal.measurement;

import java.util.ArrayList;

/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement@@21.6.1 */
/* JADX INFO: loaded from: classes3.dex */
public final class M extends AbstractC1938y {
    @Override // com.google.android.gms.internal.measurement.AbstractC1938y
    public final InterfaceC1884q a(String str, Y1 y10, ArrayList arrayList) {
        if (str == null || str.isEmpty() || !y10.f(str)) {
            throw new IllegalArgumentException(B7.b.c("Command not found: ", str));
        }
        InterfaceC1884q interfaceC1884qC = y10.c(str);
        if (interfaceC1884qC instanceof AbstractC1856m) {
            return ((AbstractC1856m) interfaceC1884qC).a(y10, arrayList);
        }
        throw new IllegalArgumentException(androidx.compose.foundation.gestures.d.b("Function ", str, " is not defined"));
    }
}
