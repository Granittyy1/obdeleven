package com.google.android.gms.internal.play_billing;

import sun.misc.Unsafe;

/* JADX INFO: compiled from: com.android.billingclient:billing@@8.0.0 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class C1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Unsafe f26109a;

    public C1(Unsafe unsafe) {
        this.f26109a = unsafe;
    }

    public abstract double a(Object obj, long j);

    public abstract float b(Object obj, long j);

    public abstract void c(Object obj, long j, boolean z10);

    public abstract void d(Object obj, long j, byte b10);

    public abstract void e(Object obj, long j, double d10);

    public abstract void f(Object obj, long j, float f10);

    public abstract boolean g(Object obj, long j);
}
