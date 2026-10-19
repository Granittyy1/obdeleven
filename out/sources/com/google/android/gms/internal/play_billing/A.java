package com.google.android.gms.internal.play_billing;

import java.util.concurrent.Executor;

/* JADX INFO: compiled from: com.android.billingclient:billing@@8.0.0 */
/* JADX INFO: loaded from: classes3.dex */
public final class A {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final A f26098d = new A();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Runnable f26099a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Executor f26100b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public A f26101c;

    public A() {
        this.f26099a = null;
        this.f26100b = null;
    }

    public A(Runnable runnable, Executor executor) {
        this.f26099a = runnable;
        this.f26100b = executor;
    }
}
