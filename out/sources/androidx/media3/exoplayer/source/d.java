package androidx.media3.exoplayer.source;

import A1.C0577l;
import android.content.Context;
import android.net.Uri;
import androidx.media3.exoplayer.N;
import androidx.media3.exoplayer.source.d;
import androidx.media3.exoplayer.source.l;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Objects;
import java.util.concurrent.CopyOnWriteArrayList;
import p078g1.p;
import p078g1.t;
import p114j1.A;

/* JADX INFO: compiled from: DefaultMediaSourceFactory.java */
/* JADX INFO: loaded from: classes.dex */
public final class d implements h.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a f18663a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final l1.f.a f18664b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public X1.e f18665c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f18666d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final long f18667e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final long f18668f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final float f18669g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final float f18670h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public boolean f18671i;

    /* JADX INFO: compiled from: DefaultMediaSourceFactory.java */
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final C0577l f18672a;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public l1.f.a f18675d;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public X1.e f18677f;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final HashMap f18673b = new HashMap();

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final HashMap f18674c = new HashMap();

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public boolean f18676e = true;

        public a(C0577l c0577l, X1.e eVar) {
            this.f18672a = c0577l;
            this.f18677f = eVar;
        }

        public final com.google.common.base.j<h.a> a(int i10) throws ClassNotFoundException {
            com.google.common.base.j<h.a> n10;
            com.google.common.base.j<h.a> jVar;
            HashMap map = this.f18673b;
            com.google.common.base.j<h.a> jVar2 = (com.google.common.base.j) map.get(Integer.valueOf(i10));
            if (jVar2 != null) {
                return jVar2;
            }
            final l1.f.a aVar = this.f18675d;
            aVar.getClass();
            if (i10 == 0) {
                final Class<? extends U> clsAsSubclass = Class.forName("androidx.media3.exoplayer.dash.DashMediaSource$Factory").asSubclass(h.a.class);
                n10 = new com.google.common.base.j() { // from class: t1.d
                    @Override // com.google.common.base.j
                    public final Object get() {
                        return androidx.media3.exoplayer.source.d.e(clsAsSubclass, aVar);
                    }
                };
            } else if (i10 == 1) {
                final Class<? extends U> clsAsSubclass2 = Class.forName("androidx.media3.exoplayer.smoothstreaming.SsMediaSource$Factory").asSubclass(h.a.class);
                n10 = new com.google.common.base.j() { // from class: t1.e
                    @Override // com.google.common.base.j
                    public final Object get() {
                        return d.e(clsAsSubclass2, aVar);
                    }
                };
            } else {
                if (i10 != 2) {
                    if (i10 == 3) {
                        n10 = new N(1, Class.forName("androidx.media3.exoplayer.rtsp.RtspMediaSource$Factory").asSubclass(h.a.class));
                    } else {
                        if (i10 != 4) {
                            throw new IllegalArgumentException(J4.i.b(i10, "Unrecognized contentType: "));
                        }
                        jVar = new com.google.common.base.j() { // from class: t1.g
                            @Override // com.google.common.base.j
                            public final Object get() {
                                return new l.b(aVar, this.f47015b.f18672a);
                            }
                        };
                    }
                    map.put(Integer.valueOf(i10), jVar);
                    return jVar;
                }
                final Class<? extends U> clsAsSubclass3 = Class.forName("androidx.media3.exoplayer.hls.HlsMediaSource$Factory").asSubclass(h.a.class);
                n10 = new com.google.common.base.j() { // from class: t1.f
                    @Override // com.google.common.base.j
                    public final Object get() {
                        return d.e(clsAsSubclass3, aVar);
                    }
                };
            }
            jVar = n10;
            map.put(Integer.valueOf(i10), jVar);
            return jVar;
        }
    }

    public d(Context context, C0577l c0577l) {
        l1.f.a aVar = new l1.f.a(context);
        this.f18664b = aVar;
        X1.e eVar = new X1.e();
        this.f18665c = eVar;
        a aVar2 = new a(c0577l, eVar);
        this.f18663a = aVar2;
        if (aVar != aVar2.f18675d) {
            aVar2.f18675d = aVar;
            aVar2.f18673b.clear();
            aVar2.f18674c.clear();
        }
        this.f18666d = -9223372036854775807L;
        this.f18667e = -9223372036854775807L;
        this.f18668f = -9223372036854775807L;
        this.f18669g = -3.4028235E38f;
        this.f18670h = -3.4028235E38f;
        this.f18671i = true;
    }

    public static h.a e(Class cls, l1.f.a aVar) {
        try {
            return (h.a) cls.getConstructor(l1.d.a.class).newInstance(aVar);
        } catch (Exception e10) {
            throw new IllegalStateException(e10);
        }
    }

    @Override // androidx.media3.exoplayer.source.h.a
    public final void a(X1.e eVar) {
        this.f18665c = eVar;
        a aVar = this.f18663a;
        aVar.f18677f = eVar;
        C0577l c0577l = aVar.f18672a;
        synchronized (c0577l) {
            c0577l.f534d = eVar;
        }
        Iterator it = aVar.f18674c.values().iterator();
        while (it.hasNext()) {
            ((h.a) it.next()).a(eVar);
        }
    }

    @Override // androidx.media3.exoplayer.source.h.a
    @Deprecated
    public final void b(boolean z10) {
        this.f18671i = z10;
        a aVar = this.f18663a;
        aVar.f18676e = z10;
        C0577l c0577l = aVar.f18672a;
        synchronized (c0577l) {
            c0577l.f533c = z10;
        }
        Iterator it = aVar.f18674c.values().iterator();
        while (it.hasNext()) {
            ((h.a) it.next()).b(z10);
        }
    }

    @Override // androidx.media3.exoplayer.source.h.a
    public final void c() {
        a aVar = this.f18663a;
        aVar.getClass();
        synchronized (aVar.f18672a) {
        }
    }

    @Override // androidx.media3.exoplayer.source.h.a
    public final h d(p pVar) {
        pVar.f35356b.getClass();
        String scheme = pVar.f35356b.f35384a.getScheme();
        if (scheme != null && scheme.equals("ssai")) {
            throw null;
        }
        if (Objects.equals(pVar.f35356b.f35385b, "application/x-image-uri")) {
            long j = pVar.f35356b.f35389f;
            int i10 = A.f40996a;
            throw null;
        }
        p.f fVar = pVar.f35356b;
        int iZ = A.z(fVar.f35384a, fVar.f35385b);
        if (pVar.f35356b.f35389f != -9223372036854775807L) {
            C0577l c0577l = this.f18663a.f18672a;
            synchronized (c0577l) {
                c0577l.f535e = 1;
            }
        }
        try {
            a aVar = this.f18663a;
            HashMap map = aVar.f18674c;
            h.a aVar2 = (h.a) map.get(Integer.valueOf(iZ));
            if (aVar2 == null) {
                aVar2 = aVar.a(iZ).get();
                aVar2.a(aVar.f18677f);
                aVar2.b(aVar.f18676e);
                aVar2.c();
                map.put(Integer.valueOf(iZ), aVar2);
            }
            p.e.a aVarA = pVar.f35357c.a();
            p.e eVar = pVar.f35357c;
            if (eVar.f35374a == -9223372036854775807L) {
                aVarA.f35379a = this.f18666d;
            }
            if (eVar.f35377d == -3.4028235E38f) {
                aVarA.f35382d = this.f18669g;
            }
            if (eVar.f35378e == -3.4028235E38f) {
                aVarA.f35383e = this.f18670h;
            }
            if (eVar.f35375b == -9223372036854775807L) {
                aVarA.f35380b = this.f18667e;
            }
            if (eVar.f35376c == -9223372036854775807L) {
                aVarA.f35381c = this.f18668f;
            }
            p.e eVar2 = new p.e(aVarA);
            if (!eVar2.equals(pVar.f35357c)) {
                p.a aVarA2 = pVar.a();
                aVarA2.f35370k = eVar2.a();
                pVar = aVarA2.a();
            }
            h hVarD = aVar2.d(pVar);
            ImmutableList<p.i> immutableList = pVar.f35356b.f35387d;
            if (!immutableList.isEmpty()) {
                h[] hVarArr = new h[immutableList.size() + 1];
                hVarArr[0] = hVarD;
                if (immutableList.size() > 0) {
                    if (!this.f18671i) {
                        this.f18664b.getClass();
                        p.i iVar = immutableList.get(0);
                        new ArrayList(1);
                        new HashSet(1);
                        new CopyOnWriteArrayList();
                        new androidx.media3.exoplayer.drm.a.C0185a();
                        ImmutableMap.h();
                        ImmutableList.K();
                        Collections.emptyList();
                        ImmutableList.K();
                        p.g gVar = p.g.f35390a;
                        Uri uri = Uri.EMPTY;
                        iVar.getClass();
                        throw null;
                    }
                    g1.n.a aVar3 = new g1.n.a();
                    immutableList.get(0).getClass();
                    ArrayList<t.a> arrayList = t.f35447a;
                    aVar3.f35338m = null;
                    immutableList.get(0).getClass();
                    aVar3.f35330d = null;
                    immutableList.get(0).getClass();
                    aVar3.f35331e = 0;
                    immutableList.get(0).getClass();
                    aVar3.f35332f = 0;
                    immutableList.get(0).getClass();
                    aVar3.f35328b = null;
                    immutableList.get(0).getClass();
                    aVar3.f35327a = null;
                    p078g1.n nVar = new p078g1.n(aVar3);
                    if (this.f18665c.c(nVar)) {
                        g1.n.a aVarA3 = nVar.a();
                        aVarA3.f35338m = t.m("application/x-media3-cues");
                        aVarA3.j = nVar.f35302n;
                        aVarA3.f35323I = this.f18665c.e(nVar);
                        new p078g1.n(aVarA3);
                    }
                    immutableList.get(0).getClass();
                    throw null;
                }
                hVarD = new MergingMediaSource(hVarArr);
            }
            if (pVar.f35359e.f35372a != Long.MIN_VALUE) {
                ClippingMediaSource.a aVar4 = new ClippingMediaSource.a(hVarD);
                p.c cVar = pVar.f35359e;
                p241t7.b.k(!aVar4.f18620d);
                long j10 = cVar.f35372a;
                p241t7.b.k(!aVar4.f18620d);
                aVar4.f18618b = j10;
                p241t7.b.k(!aVar4.f18620d);
                aVar4.f18619c = true;
                p241t7.b.k(!aVar4.f18620d);
                p241t7.b.k(!aVar4.f18620d);
                aVar4.f18620d = true;
                hVarD = new ClippingMediaSource(aVar4);
            }
            pVar.f35356b.getClass();
            pVar.f35356b.getClass();
            return hVarD;
        } catch (ClassNotFoundException e10) {
            throw new IllegalStateException(e10);
        }
    }
}
