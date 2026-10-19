package com.google.android.gms.internal.measurement;

import android.os.Bundle;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: renamed from: com.google.android.gms.internal.measurement.g0, reason: case insensitive filesystem */
/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement-base@@21.6.1 */
/* JADX INFO: loaded from: classes3.dex */
public final class BinderC1815g0 extends AbstractBinderC1836j0 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final AtomicReference<Bundle> f25711c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f25712d;

    public BinderC1815g0() {
        super("com.google.android.gms.measurement.api.internal.IBundleReceiver");
        this.f25711c = new AtomicReference<>();
    }

    public static <T> T b0(Bundle bundle, Class<T> cls) {
        Object obj;
        if (bundle == null || (obj = bundle.get("r")) == null) {
            return null;
        }
        return cls.cast(obj);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC1843k0
    public final void f(Bundle bundle) {
        synchronized (this.f25711c) {
            try {
                try {
                    this.f25711c.set(bundle);
                    this.f25712d = true;
                    this.f25711c.notify();
                } catch (Throwable th) {
                    this.f25711c.notify();
                    throw th;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final Bundle g(long j) {
        Bundle bundle;
        synchronized (this.f25711c) {
            if (!this.f25712d) {
                try {
                    this.f25711c.wait(j);
                } catch (InterruptedException unused) {
                    return null;
                }
            }
            bundle = this.f25711c.get();
        }
        return bundle;
    }
}
