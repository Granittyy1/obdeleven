package T4;

import S4.C0760b;
import U4.AbstractC0794b;
import U4.C0804l;
import android.os.Looper;
import java.lang.ref.WeakReference;
import java.util.concurrent.locks.ReentrantLock;

/* JADX INFO: renamed from: T4.t, reason: case insensitive filesystem */
/* JADX INFO: compiled from: com.google.android.gms:play-services-base@@18.4.0 */
/* JADX INFO: loaded from: classes3.dex */
public final class C0786t implements AbstractC0794b.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final WeakReference f5997a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final com.google.android.gms.common.api.a f5998b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f5999c;

    public C0786t(C c10, com.google.android.gms.common.api.a aVar, boolean z10) {
        this.f5997a = new WeakReference(c10);
        this.f5998b = aVar;
        this.f5999c = z10;
    }

    @Override // U4.AbstractC0794b.c
    public final void a(C0760b c0760b) {
        C c10 = (C) this.f5997a.get();
        if (c10 == null) {
            return;
        }
        C0804l.j("onReportServiceBinding must be called on the GoogleApiClient handler thread", Looper.myLooper() == c10.f5821a.f5878o.f5850h);
        ReentrantLock reentrantLock = c10.f5822b;
        reentrantLock.lock();
        try {
            if (c10.n(0)) {
                if (!c0760b.k()) {
                    c10.l(c0760b, this.f5998b, this.f5999c);
                }
                if (c10.o()) {
                    c10.m();
                }
            }
        } finally {
            reentrantLock.unlock();
        }
    }
}
