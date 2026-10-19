package com.bumptech.glide.load.engine;

import D3.h;
import D3.i;
import D3.j;
import D3.k;
import D3.m;
import D3.n;
import D3.o;
import android.os.SystemClock;
import android.util.Log;
import com.bumptech.glide.Priority;
import com.bumptech.glide.load.DataSource;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public final class DecodeJob<R> implements com.bumptech.glide.load.engine.b.a, Runnable, Comparable<DecodeJob<?>>, Y3.a.d {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public B3.d<?> f24528A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public volatile com.bumptech.glide.load.engine.b f24529B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public volatile boolean f24530C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public volatile boolean f24531D;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final com.bumptech.glide.load.engine.c.C0258c f24535e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Y3.a.c f24536f;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public com.bumptech.glide.c f24539i;
    public A3.b j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public Priority f24540k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public i f24541l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int f24542m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public int f24543n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public h f24544o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public A3.d f24545p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public d f24546q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public int f24547r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public Stage f24548s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public RunReason f24549t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public Object f24550u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public Thread f24551v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public A3.b f24552w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public A3.b f24553x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public Object f24554y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public DataSource f24555z;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final D3.f<R> f24532b = new D3.f<>();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ArrayList f24533c = new ArrayList();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Y3.d.a f24534d = new Y3.d.a();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final b<?> f24537g = new b<>();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final c f24538h = new c();

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class RunReason {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final RunReason f24556b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final RunReason f24557c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final RunReason f24558d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public static final /* synthetic */ RunReason[] f24559e;

        static {
            RunReason runReason = new RunReason("INITIALIZE", 0);
            f24556b = runReason;
            RunReason runReason2 = new RunReason("SWITCH_TO_SOURCE_SERVICE", 1);
            f24557c = runReason2;
            RunReason runReason3 = new RunReason("DECODE_DATA", 2);
            f24558d = runReason3;
            f24559e = new RunReason[]{runReason, runReason2, runReason3};
        }

        public RunReason() {
            throw null;
        }

        public static RunReason valueOf(String str) {
            return (RunReason) Enum.valueOf(RunReason.class, str);
        }

        public static RunReason[] values() {
            return (RunReason[]) f24559e.clone();
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class Stage {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final Stage f24560b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final Stage f24561c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final Stage f24562d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public static final Stage f24563e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public static final Stage f24564f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public static final Stage f24565g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public static final /* synthetic */ Stage[] f24566h;

        static {
            Stage stage = new Stage("INITIALIZE", 0);
            f24560b = stage;
            Stage stage2 = new Stage("RESOURCE_CACHE", 1);
            f24561c = stage2;
            Stage stage3 = new Stage("DATA_CACHE", 2);
            f24562d = stage3;
            Stage stage4 = new Stage("SOURCE", 3);
            f24563e = stage4;
            Stage stage5 = new Stage("ENCODE", 4);
            f24564f = stage5;
            Stage stage6 = new Stage("FINISHED", 5);
            f24565g = stage6;
            f24566h = new Stage[]{stage, stage2, stage3, stage4, stage5, stage6};
        }

        public Stage() {
            throw null;
        }

        public static Stage valueOf(String str) {
            return (Stage) Enum.valueOf(Stage.class, str);
        }

        public static Stage[] values() {
            return (Stage[]) f24566h.clone();
        }
    }

    public final class a<Z> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final DataSource f24567a;

        public a(DataSource dataSource) {
            this.f24567a = dataSource;
        }
    }

    public static class b<Z> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public A3.b f24569a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public A3.f<Z> f24570b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public n<Z> f24571c;
    }

    public static class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public boolean f24572a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public boolean f24573b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public boolean f24574c;

        public final boolean a() {
            return (this.f24574c || this.f24573b) && this.f24572a;
        }
    }

    public DecodeJob(com.bumptech.glide.load.engine.c.C0258c c0258c, Y3.a.c cVar) {
        this.f24535e = c0258c;
        this.f24536f = cVar;
    }

    public final <Data> o<R> a(B3.d<?> dVar, Data data, DataSource dataSource) throws GlideException {
        if (data == null) {
            dVar.b();
            return null;
        }
        try {
            int i10 = X3.f.f7206a;
            SystemClock.elapsedRealtimeNanos();
            o<R> oVarE = e(data, dataSource);
            if (Log.isLoggable("DecodeJob", 2)) {
                oVarE.toString();
                SystemClock.elapsedRealtimeNanos();
                Objects.toString(this.f24541l);
                Thread.currentThread().getName();
            }
            return oVarE;
        } finally {
            dVar.b();
        }
    }

    @Override // com.bumptech.glide.load.engine.b.a
    public final void b(A3.b bVar, Object obj, B3.d<?> dVar, DataSource dataSource, A3.b bVar2) {
        this.f24552w = bVar;
        this.f24554y = obj;
        this.f24528A = dVar;
        this.f24555z = dataSource;
        this.f24553x = bVar2;
        if (Thread.currentThread() == this.f24551v) {
            f();
            return;
        }
        this.f24549t = RunReason.f24558d;
        d dVar2 = this.f24546q;
        (dVar2.f24623n ? dVar2.j : dVar2.f24619i).execute(this);
    }

    @Override // com.bumptech.glide.load.engine.b.a
    public final void c(A3.b bVar, Exception exc, B3.d<?> dVar, DataSource dataSource) {
        dVar.b();
        GlideException glideException = new GlideException("Fetching data failed", Collections.singletonList(exc));
        glideException.e(bVar, dataSource, dVar.a());
        this.f24533c.add(glideException);
        if (Thread.currentThread() == this.f24551v) {
            l();
            return;
        }
        this.f24549t = RunReason.f24557c;
        d dVar2 = this.f24546q;
        (dVar2.f24623n ? dVar2.j : dVar2.f24619i).execute(this);
    }

    @Override // java.lang.Comparable
    public final int compareTo(DecodeJob<?> decodeJob) {
        DecodeJob<?> decodeJob2 = decodeJob;
        int iOrdinal = this.f24540k.ordinal() - decodeJob2.f24540k.ordinal();
        return iOrdinal == 0 ? this.f24547r - decodeJob2.f24547r : iOrdinal;
    }

    @Override // Y3.a.d
    public final Y3.d.a d() {
        return this.f24534d;
    }

    public final <Data> o<R> e(Data data, DataSource dataSource) throws GlideException {
        B3.e eVarB;
        m<Data, ?, R> mVarC = this.f24532b.c(data.getClass());
        A3.d dVar = this.f24545p;
        boolean z10 = dataSource == DataSource.f24514e || this.f24532b.f2740r;
        A3.c<Boolean> cVar = com.bumptech.glide.load.resource.bitmap.a.f24679i;
        Boolean bool = (Boolean) dVar.c(cVar);
        if (bool == null || (bool.booleanValue() && !z10)) {
            dVar = new A3.d();
            dVar.f580b.j(this.f24545p.f580b);
            dVar.f580b.put(cVar, Boolean.valueOf(z10));
        }
        A3.d dVar2 = dVar;
        B3.f fVar = this.f24539i.f24479b.f24464e;
        synchronized (fVar) {
            try {
                B3.e.a aVar = (B3.e.a) fVar.f1505a.get(data.getClass());
                if (aVar == null) {
                    for (B3.e.a aVar2 : fVar.f1505a.values()) {
                        if (aVar2.a().isAssignableFrom(data.getClass())) {
                            aVar = aVar2;
                            break;
                        }
                    }
                }
                if (aVar == null) {
                    aVar = B3.f.f1504b;
                }
                eVarB = aVar.b(data);
            } catch (Throwable th) {
                throw th;
            }
        }
        try {
            return mVarC.a(this.f24542m, this.f24543n, dVar2, eVarB, new a(dataSource));
        } finally {
            eVarB.b();
        }
    }

    public final void f() {
        n nVarA;
        boolean zA;
        if (Log.isLoggable("DecodeJob", 2)) {
            String str = "data: " + this.f24554y + ", cache key: " + this.f24552w + ", fetcher: " + this.f24528A;
            int i10 = X3.f.f7206a;
            SystemClock.elapsedRealtimeNanos();
            Objects.toString(this.f24541l);
            if (str != null) {
                ", ".concat(str);
            }
            Thread.currentThread().getName();
        }
        n nVar = null;
        try {
            nVarA = a(this.f24528A, this.f24554y, this.f24555z);
        } catch (GlideException e10) {
            e10.e(this.f24553x, this.f24555z, null);
            this.f24533c.add(e10);
            nVarA = null;
        }
        if (nVarA == null) {
            l();
            return;
        }
        DataSource dataSource = this.f24555z;
        if (nVarA instanceof k) {
            ((k) nVarA).b();
        }
        if (this.f24537g.f24571c != null) {
            nVar = (n) n.f2769f.a();
            nVar.f2773e = false;
            nVar.f2772d = true;
            nVar.f2771c = nVarA;
            nVarA = nVar;
        }
        n();
        d dVar = this.f24546q;
        synchronized (dVar) {
            dVar.f24624o = nVarA;
            dVar.f24625p = dataSource;
        }
        synchronized (dVar) {
            try {
                dVar.f24613c.a();
                if (dVar.f24631v) {
                    dVar.f24624o.a();
                    dVar.g();
                } else {
                    if (dVar.f24612b.f24638b.isEmpty()) {
                        throw new IllegalStateException("Received a resource without any callbacks to notify");
                    }
                    if (dVar.f24626q) {
                        throw new IllegalStateException("Already have resource");
                    }
                    d.c cVar = dVar.f24616f;
                    o<?> oVar = dVar.f24624o;
                    boolean z10 = dVar.f24622m;
                    i iVar = dVar.f24621l;
                    com.bumptech.glide.load.engine.c cVar2 = dVar.f24614d;
                    cVar.getClass();
                    dVar.f24629t = new j<>(oVar, z10, true, iVar, cVar2);
                    dVar.f24626q = true;
                    d.e eVar = dVar.f24612b;
                    eVar.getClass();
                    ArrayList<d.C0259d> arrayList = new ArrayList(eVar.f24638b);
                    dVar.e(arrayList.size() + 1);
                    dVar.f24617g.c(dVar, dVar.f24621l, dVar.f24629t);
                    for (d.C0259d c0259d : arrayList) {
                        c0259d.f24637b.execute(new d.b(c0259d.f24636a));
                    }
                    dVar.c();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        this.f24548s = Stage.f24564f;
        try {
            b<?> bVar = this.f24537g;
            if (bVar.f24571c != null) {
                com.bumptech.glide.load.engine.c.C0258c c0258c = this.f24535e;
                A3.d dVar2 = this.f24545p;
                bVar.getClass();
                try {
                    c0258c.a().a(bVar.f24569a, new D3.e(bVar.f24570b, bVar.f24571c, dVar2));
                    bVar.f24571c.b();
                } catch (Throwable th2) {
                    bVar.f24571c.b();
                    throw th2;
                }
            }
            if (nVar != null) {
                nVar.b();
            }
            c cVar3 = this.f24538h;
            synchronized (cVar3) {
                cVar3.f24573b = true;
                zA = cVar3.a();
            }
            if (zA) {
                j();
            }
        } catch (Throwable th3) {
            if (nVar != null) {
                nVar.b();
            }
            throw th3;
        }
    }

    public final com.bumptech.glide.load.engine.b g() {
        int iOrdinal = this.f24548s.ordinal();
        D3.f<R> fVar = this.f24532b;
        if (iOrdinal == 1) {
            return new e(fVar, this);
        }
        if (iOrdinal == 2) {
            return new com.bumptech.glide.load.engine.a(fVar.a(), fVar, this);
        }
        if (iOrdinal == 3) {
            return new f(fVar, this);
        }
        if (iOrdinal == 5) {
            return null;
        }
        throw new IllegalStateException("Unrecognized stage: " + this.f24548s);
    }

    public final Stage h(Stage stage) {
        int iOrdinal = stage.ordinal();
        if (iOrdinal == 0) {
            boolean zB = this.f24544o.b();
            Stage stage2 = Stage.f24561c;
            return zB ? stage2 : h(stage2);
        }
        if (iOrdinal == 1) {
            boolean zA = this.f24544o.a();
            Stage stage3 = Stage.f24562d;
            return zA ? stage3 : h(stage3);
        }
        Stage stage4 = Stage.f24565g;
        if (iOrdinal == 2) {
            return Stage.f24563e;
        }
        if (iOrdinal == 3 || iOrdinal == 5) {
            return stage4;
        }
        throw new IllegalArgumentException("Unrecognized stage: " + stage);
    }

    public final void i() {
        boolean zA;
        n();
        GlideException glideException = new GlideException("Failed to load resource", new ArrayList(this.f24533c));
        d dVar = this.f24546q;
        synchronized (dVar) {
            dVar.f24627r = glideException;
        }
        synchronized (dVar) {
            try {
                dVar.f24613c.a();
                if (dVar.f24631v) {
                    dVar.g();
                } else {
                    if (dVar.f24612b.f24638b.isEmpty()) {
                        throw new IllegalStateException("Received an exception without any callbacks to notify");
                    }
                    if (dVar.f24628s) {
                        throw new IllegalStateException("Already failed once");
                    }
                    dVar.f24628s = true;
                    i iVar = dVar.f24621l;
                    d.e eVar = dVar.f24612b;
                    eVar.getClass();
                    ArrayList<d.C0259d> arrayList = new ArrayList(eVar.f24638b);
                    dVar.e(arrayList.size() + 1);
                    dVar.f24617g.c(dVar, iVar, null);
                    for (d.C0259d c0259d : arrayList) {
                        c0259d.f24637b.execute(new d.a(c0259d.f24636a));
                    }
                    dVar.c();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        c cVar = this.f24538h;
        synchronized (cVar) {
            cVar.f24574c = true;
            zA = cVar.a();
        }
        if (zA) {
            j();
        }
    }

    public final void j() {
        c cVar = this.f24538h;
        synchronized (cVar) {
            cVar.f24573b = false;
            cVar.f24572a = false;
            cVar.f24574c = false;
        }
        b<?> bVar = this.f24537g;
        bVar.f24569a = null;
        bVar.f24570b = null;
        bVar.f24571c = null;
        D3.f<R> fVar = this.f24532b;
        fVar.f2726c = null;
        fVar.f2727d = null;
        fVar.f2736n = null;
        fVar.f2730g = null;
        fVar.f2733k = null;
        fVar.f2732i = null;
        fVar.f2737o = null;
        fVar.j = null;
        fVar.f2738p = null;
        fVar.f2724a.clear();
        fVar.f2734l = false;
        fVar.f2725b.clear();
        fVar.f2735m = false;
        this.f24530C = false;
        this.f24539i = null;
        this.j = null;
        this.f24545p = null;
        this.f24540k = null;
        this.f24541l = null;
        this.f24546q = null;
        this.f24548s = null;
        this.f24529B = null;
        this.f24551v = null;
        this.f24552w = null;
        this.f24554y = null;
        this.f24555z = null;
        this.f24528A = null;
        this.f24531D = false;
        this.f24533c.clear();
        this.f24536f.b(this);
    }

    public final void k() {
        this.f24549t = RunReason.f24557c;
        d dVar = this.f24546q;
        (dVar.f24623n ? dVar.j : dVar.f24619i).execute(this);
    }

    public final void l() {
        this.f24551v = Thread.currentThread();
        int i10 = X3.f.f7206a;
        SystemClock.elapsedRealtimeNanos();
        boolean zA = false;
        while (!this.f24531D && this.f24529B != null && !(zA = this.f24529B.a())) {
            this.f24548s = h(this.f24548s);
            this.f24529B = g();
            if (this.f24548s == Stage.f24563e) {
                k();
                return;
            }
        }
        if ((this.f24548s == Stage.f24565g || this.f24531D) && !zA) {
            i();
        }
    }

    public final void m() {
        int iOrdinal = this.f24549t.ordinal();
        if (iOrdinal == 0) {
            this.f24548s = h(Stage.f24560b);
            this.f24529B = g();
            l();
        } else if (iOrdinal == 1) {
            l();
        } else if (iOrdinal == 2) {
            f();
        } else {
            throw new IllegalStateException("Unrecognized run reason: " + this.f24549t);
        }
    }

    public final void n() {
        this.f24534d.a();
        if (this.f24530C) {
            throw new IllegalStateException("Already notified", this.f24533c.isEmpty() ? null : (Throwable) Z3.n.f(1, this.f24533c));
        }
        this.f24530C = true;
    }

    @Override // java.lang.Runnable
    public final void run() {
        B3.d<?> dVar = this.f24528A;
        try {
            try {
                if (this.f24531D) {
                    i();
                    if (dVar != null) {
                        dVar.b();
                        return;
                    }
                    return;
                }
                m();
                if (dVar != null) {
                    dVar.b();
                }
            } catch (Throwable th) {
                if (dVar != null) {
                    dVar.b();
                }
                throw th;
            }
        } catch (CallbackException e10) {
            throw e10;
        } catch (Throwable th2) {
            if (Log.isLoggable("DecodeJob", 3)) {
                Objects.toString(this.f24548s);
            }
            if (this.f24548s != Stage.f24564f) {
                this.f24533c.add(th2);
                i();
            }
            if (!this.f24531D) {
                throw th2;
            }
            throw th2;
        }
    }
}
