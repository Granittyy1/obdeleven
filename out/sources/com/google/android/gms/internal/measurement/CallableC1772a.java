package com.google.android.gms.internal.measurement;

import java.util.concurrent.Callable;

/* JADX INFO: renamed from: com.google.android.gms.internal.measurement.a, reason: case insensitive filesystem */
/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement@@21.6.1 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class CallableC1772a implements Callable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ A f25651b;

    @Override // java.util.concurrent.Callable
    public final Object call() {
        A a10 = this.f25651b;
        a10.getClass();
        U5 u10 = new U5("internal.registerCallback");
        u10.f25607d = a10.f25394d;
        return u10;
    }
}
