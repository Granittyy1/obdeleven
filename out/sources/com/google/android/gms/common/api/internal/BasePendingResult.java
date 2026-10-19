package com.google.android.gms.common.api.internal;

import J4.i;
import T4.s0;
import T4.t0;
import U4.C0804l;
import android.os.Looper;
import android.os.Message;
import android.util.Log;
import android.util.Pair;
import com.google.android.gms.common.annotation.KeepName;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.e;
import com.google.android.gms.common.api.f;
import com.google.android.gms.common.api.g;
import e5.h;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: com.google.android.gms:play-services-base@@18.4.0 */
/* JADX INFO: loaded from: classes3.dex */
@KeepName
public abstract class BasePendingResult<R extends g> extends e<R> {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final s0 f25327h = new s0();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public g f25332e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f25333f;

    @KeepName
    private t0 resultGuardian;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f25328a = new Object();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final CountDownLatch f25329b = new CountDownLatch(1);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ArrayList f25330c = new ArrayList();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final AtomicReference f25331d = new AtomicReference();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f25334g = false;

    /* JADX INFO: compiled from: com.google.android.gms:play-services-base@@18.4.0 */
    public static class a<R extends g> extends h {
        /* JADX WARN: Multi-variable type inference failed */
        @Override // android.os.Handler
        public final void handleMessage(Message message) {
            int i10 = message.what;
            if (i10 != 1) {
                if (i10 != 2) {
                    Log.wtf("BasePendingResult", i.b(i10, "Don't know how to handle message: "), new Exception());
                    return;
                } else {
                    ((BasePendingResult) message.obj).b(Status.f25306h);
                    return;
                }
            }
            Pair pair = (Pair) message.obj;
            com.google.android.gms.common.api.h hVar = (com.google.android.gms.common.api.h) pair.first;
            g gVar = (g) pair.second;
            try {
                hVar.a(gVar);
            } catch (RuntimeException e10) {
                BasePendingResult.g(gVar);
                throw e10;
            }
        }
    }

    @Deprecated
    public BasePendingResult() {
        new a(Looper.getMainLooper());
        new WeakReference(null);
    }

    public static void g(g gVar) {
        if (gVar instanceof f) {
            try {
                ((f) gVar).a();
            } catch (RuntimeException unused) {
                "Unable to release ".concat(String.valueOf(gVar));
            }
        }
    }

    public abstract g a();

    @Deprecated
    public final void b(Status status) {
        synchronized (this.f25328a) {
            try {
                if (!c()) {
                    d(a());
                    this.f25333f = true;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final boolean c() {
        return this.f25329b.getCount() == 0;
    }

    public final void d(R r10) {
        synchronized (this.f25328a) {
            try {
                if (this.f25333f) {
                    g(r10);
                    return;
                }
                c();
                C0804l.j("Results have already been set", !c());
                C0804l.j("Result has already been consumed", !false);
                e(r10);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void e(g gVar) {
        this.f25332e = gVar;
        gVar.d();
        this.f25329b.countDown();
        if (this.f25332e instanceof f) {
            this.resultGuardian = new t0(this);
        }
        ArrayList arrayList = this.f25330c;
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            ((e.a) arrayList.get(i10)).a();
        }
        this.f25330c.clear();
    }

    public final void f() {
        boolean z10 = true;
        if (!this.f25334g && !((Boolean) f25327h.get()).booleanValue()) {
            z10 = false;
        }
        this.f25334g = z10;
    }
}
