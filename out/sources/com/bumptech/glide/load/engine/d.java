package com.bumptech.glide.load.engine;

import D3.i;
import D3.j;
import D3.l;
import D3.o;
import com.bumptech.glide.load.DataSource;
import com.bumptech.glide.request.SingleRequest;
import com.google.android.gms.internal.measurement.M1;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: compiled from: EngineJob.java */
/* JADX INFO: loaded from: classes.dex */
public final class d<R> implements Y3.a.d {

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static final c f24611w = new c();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final e f24612b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Y3.d.a f24613c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final com.bumptech.glide.load.engine.c f24614d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Y3.a.c f24615e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final c f24616f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final com.bumptech.glide.load.engine.c f24617g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final G3.a f24618h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final G3.a f24619i;
    public final G3.a j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final AtomicInteger f24620k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public i f24621l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public boolean f24622m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public boolean f24623n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public o<?> f24624o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public DataSource f24625p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public boolean f24626q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public GlideException f24627r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public boolean f24628s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public j<?> f24629t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public DecodeJob<R> f24630u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public volatile boolean f24631v;

    /* JADX INFO: compiled from: EngineJob.java */
    public class a implements Runnable {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final SingleRequest f24632b;

        public a(SingleRequest singleRequest) {
            this.f24632b = singleRequest;
        }

        @Override // java.lang.Runnable
        public final void run() {
            SingleRequest singleRequest = this.f24632b;
            singleRequest.f24699a.a();
            synchronized (singleRequest.f24700b) {
                synchronized (d.this) {
                    try {
                        e eVar = d.this.f24612b;
                        SingleRequest singleRequest2 = this.f24632b;
                        eVar.getClass();
                        if (eVar.f24638b.contains(new C0259d(singleRequest2, X3.e.f7204b))) {
                            d dVar = d.this;
                            SingleRequest singleRequest3 = this.f24632b;
                            dVar.getClass();
                            try {
                                singleRequest3.i(dVar.f24627r, 5);
                            } catch (Throwable th) {
                                throw new CallbackException(th);
                            }
                        }
                        d.this.c();
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
            }
        }
    }

    /* JADX INFO: compiled from: EngineJob.java */
    public class b implements Runnable {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final SingleRequest f24634b;

        public b(SingleRequest singleRequest) {
            this.f24634b = singleRequest;
        }

        @Override // java.lang.Runnable
        public final void run() {
            SingleRequest singleRequest = this.f24634b;
            singleRequest.f24699a.a();
            synchronized (singleRequest.f24700b) {
                synchronized (d.this) {
                    try {
                        e eVar = d.this.f24612b;
                        SingleRequest singleRequest2 = this.f24634b;
                        eVar.getClass();
                        if (eVar.f24638b.contains(new C0259d(singleRequest2, X3.e.f7204b))) {
                            d.this.f24629t.b();
                            d dVar = d.this;
                            SingleRequest singleRequest3 = this.f24634b;
                            dVar.getClass();
                            try {
                                singleRequest3.j(dVar.f24629t, dVar.f24625p);
                                d.this.h(this.f24634b);
                            } catch (Throwable th) {
                                throw new CallbackException(th);
                            }
                        }
                        d.this.c();
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
            }
        }
    }

    /* JADX INFO: compiled from: EngineJob.java */
    public static class c {
    }

    /* JADX INFO: renamed from: com.bumptech.glide.load.engine.d$d, reason: collision with other inner class name */
    /* JADX INFO: compiled from: EngineJob.java */
    public static final class C0259d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final SingleRequest f24636a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Executor f24637b;

        public C0259d(SingleRequest singleRequest, Executor executor) {
            this.f24636a = singleRequest;
            this.f24637b = executor;
        }

        public final boolean equals(Object obj) {
            if (obj instanceof C0259d) {
                return this.f24636a.equals(((C0259d) obj).f24636a);
            }
            return false;
        }

        public final int hashCode() {
            return this.f24636a.hashCode();
        }
    }

    /* JADX INFO: compiled from: EngineJob.java */
    public static final class e implements Iterable<C0259d> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final ArrayList f24638b;

        public e(ArrayList arrayList) {
            this.f24638b = arrayList;
        }

        @Override // java.lang.Iterable
        public final Iterator<C0259d> iterator() {
            return this.f24638b.iterator();
        }
    }

    public d() {
        throw null;
    }

    public d(G3.a aVar, G3.a aVar2, G3.a aVar3, G3.a aVar4, com.bumptech.glide.load.engine.c cVar, com.bumptech.glide.load.engine.c cVar2, Y3.a.c cVar3) {
        c cVar4 = f24611w;
        this.f24612b = new e(new ArrayList(2));
        this.f24613c = new Y3.d.a();
        this.f24620k = new AtomicInteger();
        this.f24618h = aVar;
        this.f24619i = aVar2;
        this.j = aVar4;
        this.f24617g = cVar;
        this.f24614d = cVar2;
        this.f24615e = cVar3;
        this.f24616f = cVar4;
    }

    public final synchronized void a(SingleRequest singleRequest, X3.e.a aVar) {
        try {
            this.f24613c.a();
            e eVar = this.f24612b;
            eVar.getClass();
            eVar.f24638b.add(new C0259d(singleRequest, aVar));
            if (this.f24626q) {
                e(1);
                aVar.execute(new b(singleRequest));
            } else if (this.f24628s) {
                e(1);
                aVar.execute(new a(singleRequest));
            } else {
                M1.b("Cannot add callbacks to a cancelled EngineJob", !this.f24631v);
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public final void b() {
        if (f()) {
            return;
        }
        this.f24631v = true;
        DecodeJob<R> decodeJob = this.f24630u;
        decodeJob.f24531D = true;
        com.bumptech.glide.load.engine.b bVar = decodeJob.f24529B;
        if (bVar != null) {
            bVar.cancel();
        }
        com.bumptech.glide.load.engine.c cVar = this.f24617g;
        i iVar = this.f24621l;
        synchronized (cVar) {
            l lVar = cVar.f24587a;
            lVar.getClass();
            HashMap map = (HashMap) lVar.f2765c;
            if (equals(map.get(iVar))) {
                map.remove(iVar);
            }
        }
    }

    public final void c() {
        j<?> jVar;
        synchronized (this) {
            try {
                this.f24613c.a();
                M1.b("Not yet complete!", f());
                int iDecrementAndGet = this.f24620k.decrementAndGet();
                M1.b("Can't decrement below 0", iDecrementAndGet >= 0);
                if (iDecrementAndGet == 0) {
                    jVar = this.f24629t;
                    g();
                } else {
                    jVar = null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (jVar != null) {
            jVar.d();
        }
    }

    @Override // Y3.a.d
    public final Y3.d.a d() {
        return this.f24613c;
    }

    public final synchronized void e(int i10) {
        j<?> jVar;
        M1.b("Not yet complete!", f());
        if (this.f24620k.getAndAdd(i10) == 0 && (jVar = this.f24629t) != null) {
            jVar.b();
        }
    }

    public final boolean f() {
        return this.f24628s || this.f24626q || this.f24631v;
    }

    public final synchronized void g() {
        boolean zA;
        if (this.f24621l == null) {
            throw new IllegalArgumentException();
        }
        this.f24612b.f24638b.clear();
        this.f24621l = null;
        this.f24629t = null;
        this.f24624o = null;
        this.f24628s = false;
        this.f24631v = false;
        this.f24626q = false;
        DecodeJob<R> decodeJob = this.f24630u;
        DecodeJob.c cVar = decodeJob.f24538h;
        synchronized (cVar) {
            cVar.f24572a = true;
            zA = cVar.a();
        }
        if (zA) {
            decodeJob.j();
        }
        this.f24630u = null;
        this.f24627r = null;
        this.f24625p = null;
        this.f24615e.b(this);
    }

    public final synchronized void h(SingleRequest singleRequest) {
        try {
            this.f24613c.a();
            e eVar = this.f24612b;
            eVar.getClass();
            eVar.f24638b.remove(new C0259d(singleRequest, X3.e.f7204b));
            if (this.f24612b.f24638b.isEmpty()) {
                b();
                if (this.f24626q || this.f24628s) {
                    if (this.f24620k.get() == 0) {
                        g();
                    }
                }
            }
        } catch (Throwable th) {
            throw th;
        }
    }
}
