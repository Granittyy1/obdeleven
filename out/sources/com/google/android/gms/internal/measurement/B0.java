package com.google.android.gms.internal.measurement;

import java.util.concurrent.Callable;

/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement@@21.6.1 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class B0 implements Callable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ B0 f25399b = new B0();

    @Override // java.util.concurrent.Callable
    public final Object call() {
        C1786c c1786c = new C1786c("internal.platform", 1);
        c1786c.f25796c.put("getVersion", new C1786c("getVersion", 0));
        return c1786c;
    }
}
