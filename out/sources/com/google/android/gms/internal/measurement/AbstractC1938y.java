package com.google.android.gms.internal.measurement;

import java.util.ArrayList;

/* JADX INFO: renamed from: com.google.android.gms.internal.measurement.y, reason: case insensitive filesystem */
/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement@@21.6.1 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC1938y {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f25919a = new ArrayList();

    public abstract InterfaceC1884q a(String str, Y1 y10, ArrayList arrayList);

    public final void b(String str) {
        if (!this.f25919a.contains(D1.b(str))) {
            throw new IllegalArgumentException("Command not supported");
        }
        throw new UnsupportedOperationException(B7.b.c("Command not implemented: ", str));
    }
}
