package com.bumptech.glide.load.engine;

import D3.h;
import D3.i;
import D3.j;
import D3.l;
import D3.q;
import D9.o;
import android.os.SystemClock;
import android.util.Log;
import com.bumptech.glide.Priority;
import com.bumptech.glide.load.DataSource;
import com.bumptech.glide.request.SingleRequest;
import com.voltasit.obdeleven.domain.usecases.device.v;
import java.io.File;
import java.util.HashMap;
import java.util.Objects;

/* JADX INFO: compiled from: Engine.java */
/* JADX INFO: loaded from: classes.dex */
public final class c {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final boolean f24586h = Log.isLoggable("Engine", 2);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final l f24587a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final v f24588b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final F3.f f24589c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final b f24590d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final q f24591e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final a f24592f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final D3.c f24593g;

    /* JADX INFO: compiled from: Engine.java */
    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final C0258c f24594a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Y3.a.c f24595b = Y3.a.a(150, new C0257a());

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f24596c;

        /* JADX INFO: renamed from: com.bumptech.glide.load.engine.c$a$a, reason: collision with other inner class name */
        /* JADX INFO: compiled from: Engine.java */
        public class C0257a implements Y3.a.b<DecodeJob<?>> {
            public C0257a() {
            }

            @Override // Y3.a.b
            public final DecodeJob<?> a() {
                a aVar = a.this;
                return new DecodeJob<>(aVar.f24594a, aVar.f24595b);
            }
        }

        public a(C0258c c0258c) {
            this.f24594a = c0258c;
        }
    }

    /* JADX INFO: compiled from: Engine.java */
    public static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final G3.a f24598a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final G3.a f24599b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final G3.a f24600c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final G3.a f24601d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final c f24602e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final c f24603f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final Y3.a.c f24604g = Y3.a.a(150, new a());

        /* JADX INFO: compiled from: Engine.java */
        public class a implements Y3.a.b<com.bumptech.glide.load.engine.d<?>> {
            public a() {
            }

            @Override // Y3.a.b
            public final com.bumptech.glide.load.engine.d<?> a() {
                b bVar = b.this;
                return new com.bumptech.glide.load.engine.d<>(bVar.f24598a, bVar.f24599b, bVar.f24600c, bVar.f24601d, bVar.f24602e, bVar.f24603f, bVar.f24604g);
            }
        }

        public b(G3.a aVar, G3.a aVar2, G3.a aVar3, G3.a aVar4, c cVar, c cVar2) {
            this.f24598a = aVar;
            this.f24599b = aVar2;
            this.f24600c = aVar3;
            this.f24601d = aVar4;
            this.f24602e = cVar;
            this.f24603f = cVar2;
        }
    }

    /* JADX INFO: renamed from: com.bumptech.glide.load.engine.c$c, reason: collision with other inner class name */
    /* JADX INFO: compiled from: Engine.java */
    public static class C0258c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final F3.e f24606a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public volatile F3.a f24607b;

        public C0258c(F3.e eVar) {
            this.f24606a = eVar;
        }

        public final F3.a a() {
            if (this.f24607b == null) {
                synchronized (this) {
                    try {
                        if (this.f24607b == null) {
                            File cacheDir = ((F3.d) this.f24606a.f3221b).f3220a.getCacheDir();
                            F3.c cVar = null;
                            File file = cacheDir == null ? null : new File(cacheDir, "image_manager_disk_cache");
                            if (file != null && (file.mkdirs() || (file.exists() && file.isDirectory()))) {
                                cVar = new F3.c(file);
                            }
                            this.f24607b = cVar;
                        }
                        if (this.f24607b == null) {
                            this.f24607b = new o();
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            }
            return this.f24607b;
        }
    }

    /* JADX INFO: compiled from: Engine.java */
    public class d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final com.bumptech.glide.load.engine.d<?> f24608a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final SingleRequest f24609b;

        public d(SingleRequest singleRequest, com.bumptech.glide.load.engine.d dVar) {
            this.f24609b = singleRequest;
            this.f24608a = dVar;
        }
    }

    public c(F3.f fVar, F3.e eVar, G3.a aVar, G3.a aVar2, G3.a aVar3, G3.a aVar4) {
        this.f24589c = fVar;
        C0258c c0258c = new C0258c(eVar);
        D3.c cVar = new D3.c();
        this.f24593g = cVar;
        synchronized (this) {
            synchronized (cVar) {
                cVar.f2715c = this;
            }
        }
        this.f24588b = new v();
        this.f24587a = new l(0);
        this.f24590d = new b(aVar, aVar2, aVar3, aVar4, this, this);
        this.f24592f = new a(c0258c);
        this.f24591e = new q();
        fVar.f3222d = this;
    }

    public static void e(D3.o oVar) {
        if (!(oVar instanceof j)) {
            throw new IllegalArgumentException("Cannot release anything but an EngineResource");
        }
        ((j) oVar).d();
    }

    public final d a(com.bumptech.glide.c cVar, Object obj, A3.b bVar, int i10, int i11, Class cls, Class cls2, Priority priority, h hVar, X3.b bVar2, boolean z10, boolean z11, A3.d dVar, boolean z12, boolean z13, SingleRequest singleRequest, X3.e.a aVar) {
        long jElapsedRealtimeNanos;
        if (f24586h) {
            int i12 = X3.f.f7206a;
            jElapsedRealtimeNanos = SystemClock.elapsedRealtimeNanos();
        } else {
            jElapsedRealtimeNanos = 0;
        }
        long j = jElapsedRealtimeNanos;
        this.f24588b.getClass();
        i iVar = new i(obj, bVar, i10, i11, bVar2, cls, cls2, dVar);
        synchronized (this) {
            try {
                j<?> jVarB = b(iVar, z12, j);
                if (jVarB == null) {
                    return f(cVar, obj, bVar, i10, i11, cls, cls2, priority, hVar, bVar2, z10, z11, dVar, z12, z13, singleRequest, aVar, iVar, j);
                }
                singleRequest.j(jVarB, DataSource.f24515f);
                return null;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final j<?> b(i iVar, boolean z10, long j) {
        j<?> jVar;
        Object objRemove;
        j<?> jVar2;
        if (!z10) {
            return null;
        }
        D3.c cVar = this.f24593g;
        synchronized (cVar) {
            D3.c.a aVar = (D3.c.a) cVar.f2713a.get(iVar);
            if (aVar == null) {
                jVar = null;
            } else {
                jVar = aVar.get();
                if (jVar == null) {
                    cVar.b(aVar);
                }
            }
        }
        if (jVar != null) {
            jVar.b();
        }
        if (jVar != null) {
            if (f24586h) {
                int i10 = X3.f.f7206a;
                SystemClock.elapsedRealtimeNanos();
                Objects.toString(iVar);
            }
            return jVar;
        }
        F3.f fVar = this.f24589c;
        synchronized (fVar) {
            objRemove = fVar.f7207a.remove(iVar);
            if (objRemove != null) {
                fVar.f7209c -= (long) fVar.b(objRemove);
            }
        }
        D3.o oVar = (D3.o) objRemove;
        if (oVar == null) {
            jVar2 = null;
        } else {
            jVar2 = oVar instanceof j ? (j) oVar : new j<>(oVar, true, true, iVar, this);
        }
        if (jVar2 != null) {
            jVar2.b();
            this.f24593g.a(iVar, jVar2);
        }
        if (jVar2 == null) {
            return null;
        }
        if (f24586h) {
            int i11 = X3.f.f7206a;
            SystemClock.elapsedRealtimeNanos();
            Objects.toString(iVar);
        }
        return jVar2;
    }

    public final synchronized void c(com.bumptech.glide.load.engine.d dVar, i iVar, j jVar) {
        if (jVar != null) {
            try {
                if (jVar.f2757b) {
                    this.f24593g.a(iVar, jVar);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        l lVar = this.f24587a;
        lVar.getClass();
        dVar.getClass();
        HashMap map = (HashMap) lVar.f2765c;
        if (dVar.equals(map.get(iVar))) {
            map.remove(iVar);
        }
    }

    public final void d(i iVar, j jVar) {
        D3.c cVar = this.f24593g;
        synchronized (cVar) {
            D3.c.a aVar = (D3.c.a) cVar.f2713a.remove(iVar);
            if (aVar != null) {
                aVar.f2718c = null;
                aVar.clear();
            }
        }
        if (jVar.f2757b) {
            this.f24589c.d(iVar, jVar);
        } else {
            this.f24591e.a(jVar, false);
        }
    }

    public final d f(com.bumptech.glide.c cVar, Object obj, A3.b bVar, int i10, int i11, Class cls, Class cls2, Priority priority, h hVar, X3.b bVar2, boolean z10, boolean z11, A3.d dVar, boolean z12, boolean z13, SingleRequest singleRequest, X3.e.a aVar, i iVar, long j) {
        G3.a aVar2;
        com.bumptech.glide.load.engine.d dVar2 = (com.bumptech.glide.load.engine.d) ((HashMap) this.f24587a.f2765c).get(iVar);
        if (dVar2 != null) {
            dVar2.a(singleRequest, aVar);
            if (f24586h) {
                int i12 = X3.f.f7206a;
                SystemClock.elapsedRealtimeNanos();
                Objects.toString(iVar);
            }
            return new d(singleRequest, dVar2);
        }
        com.bumptech.glide.load.engine.d dVar3 = (com.bumptech.glide.load.engine.d) this.f24590d.f24604g.a();
        synchronized (dVar3) {
            dVar3.f24621l = iVar;
            dVar3.f24622m = z12;
            dVar3.f24623n = z13;
        }
        a aVar3 = this.f24592f;
        DecodeJob<R> decodeJob = (DecodeJob) aVar3.f24595b.a();
        int i13 = aVar3.f24596c;
        aVar3.f24596c = i13 + 1;
        D3.f<R> fVar = decodeJob.f24532b;
        fVar.f2726c = cVar;
        fVar.f2727d = obj;
        fVar.f2736n = bVar;
        fVar.f2728e = i10;
        fVar.f2729f = i11;
        fVar.f2738p = hVar;
        fVar.f2730g = cls;
        fVar.f2731h = decodeJob.f24535e;
        fVar.f2733k = cls2;
        fVar.f2737o = priority;
        fVar.f2732i = dVar;
        fVar.j = bVar2;
        fVar.f2739q = z10;
        fVar.f2740r = z11;
        decodeJob.f24539i = cVar;
        decodeJob.j = bVar;
        decodeJob.f24540k = priority;
        decodeJob.f24541l = iVar;
        decodeJob.f24542m = i10;
        decodeJob.f24543n = i11;
        decodeJob.f24544o = hVar;
        decodeJob.f24545p = dVar;
        decodeJob.f24546q = dVar3;
        decodeJob.f24547r = i13;
        decodeJob.f24549t = DecodeJob.RunReason.f24556b;
        decodeJob.f24550u = obj;
        l lVar = this.f24587a;
        lVar.getClass();
        ((HashMap) lVar.f2765c).put(iVar, dVar3);
        dVar3.a(singleRequest, aVar);
        synchronized (dVar3) {
            dVar3.f24630u = decodeJob;
            DecodeJob.Stage stageH = decodeJob.h(DecodeJob.Stage.f24560b);
            if (stageH == DecodeJob.Stage.f24561c || stageH == DecodeJob.Stage.f24562d) {
                aVar2 = dVar3.f24618h;
            } else {
                aVar2 = dVar3.f24623n ? dVar3.j : dVar3.f24619i;
            }
            aVar2.execute(decodeJob);
        }
        if (f24586h) {
            int i14 = X3.f.f7206a;
            SystemClock.elapsedRealtimeNanos();
            Objects.toString(iVar);
        }
        return new d(singleRequest, dVar3);
    }
}
