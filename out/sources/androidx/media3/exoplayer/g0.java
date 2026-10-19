package androidx.media3.exoplayer;

import android.os.Handler;
import android.os.Looper;
import android.util.Pair;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.IdentityHashMap;
import java.util.Iterator;

/* JADX INFO: compiled from: MediaSourceList.java */
/* JADX INFO: loaded from: classes.dex */
public final class g0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final p162n1.u f18378a;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final P f18382e;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final p162n1.a f18385h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final p114j1.g f18386i;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public boolean f18387k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public p140l1.l f18388l;
    public p235t1.s j = new t1.s.a();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final IdentityHashMap<androidx.media3.exoplayer.source.g, c> f18380c = new IdentityHashMap<>();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final HashMap f18381d = new HashMap();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ArrayList f18379b = new ArrayList();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final HashMap<c, b> f18383f = new HashMap<>();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final HashSet f18384g = new HashSet();

    /* JADX INFO: compiled from: MediaSourceList.java */
    public final class a implements androidx.media3.exoplayer.source.i, androidx.media3.exoplayer.drm.a {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final c f18389b;

        public a(c cVar) {
            this.f18389b = cVar;
        }

        @Override // androidx.media3.exoplayer.source.i
        public final void H(int i10, androidx.media3.exoplayer.source.h.b bVar, final p235t1.j jVar, final p235t1.k kVar, final IOException iOException, final boolean z10) {
            final Pair<Integer, androidx.media3.exoplayer.source.h.b> pairB = b(i10, bVar);
            if (pairB != null) {
                g0.this.f18386i.e(new Runnable() { // from class: androidx.media3.exoplayer.f0
                    @Override // java.lang.Runnable
                    public final void run() {
                        p162n1.a aVar = g0.this.f18385h;
                        Pair pair = pairB;
                        aVar.H(((Integer) pair.first).intValue(), (androidx.media3.exoplayer.source.h.b) pair.second, jVar, kVar, iOException, z10);
                    }
                });
            }
        }

        @Override // androidx.media3.exoplayer.source.i
        public final void T(int i10, androidx.media3.exoplayer.source.h.b bVar, final p235t1.j jVar, final p235t1.k kVar) {
            final Pair<Integer, androidx.media3.exoplayer.source.h.b> pairB = b(i10, bVar);
            if (pairB != null) {
                g0.this.f18386i.e(new Runnable() { // from class: androidx.media3.exoplayer.d0
                    @Override // java.lang.Runnable
                    public final void run() {
                        p162n1.a aVar = g0.this.f18385h;
                        Pair pair = pairB;
                        aVar.T(((Integer) pair.first).intValue(), (androidx.media3.exoplayer.source.h.b) pair.second, jVar, kVar);
                    }
                });
            }
        }

        @Override // androidx.media3.exoplayer.source.i
        public final void X(int i10, androidx.media3.exoplayer.source.h.b bVar, final p235t1.j jVar, final p235t1.k kVar) {
            final Pair<Integer, androidx.media3.exoplayer.source.h.b> pairB = b(i10, bVar);
            if (pairB != null) {
                g0.this.f18386i.e(new Runnable() { // from class: androidx.media3.exoplayer.b0
                    @Override // java.lang.Runnable
                    public final void run() {
                        p162n1.a aVar = g0.this.f18385h;
                        Pair pair = pairB;
                        aVar.X(((Integer) pair.first).intValue(), (androidx.media3.exoplayer.source.h.b) pair.second, jVar, kVar);
                    }
                });
            }
        }

        public final Pair<Integer, androidx.media3.exoplayer.source.h.b> b(int i10, androidx.media3.exoplayer.source.h.b bVar) {
            androidx.media3.exoplayer.source.h.b bVarA;
            c cVar = this.f18389b;
            androidx.media3.exoplayer.source.h.b bVar2 = null;
            if (bVar != null) {
                int i11 = 0;
                while (true) {
                    if (i11 >= cVar.f18396c.size()) {
                        bVarA = null;
                        break;
                    }
                    if (((androidx.media3.exoplayer.source.h.b) cVar.f18396c.get(i11)).f18701d == bVar.f18701d) {
                        Object obj = cVar.f18395b;
                        int i12 = AbstractC1383a.f18193d;
                        bVarA = bVar.a(Pair.create(obj, bVar.f18698a));
                        break;
                    }
                    i11++;
                }
                if (bVarA == null) {
                    return null;
                }
                bVar2 = bVarA;
            }
            return Pair.create(Integer.valueOf(i10 + cVar.f18397d), bVar2);
        }

        @Override // androidx.media3.exoplayer.source.i
        public final void c0(int i10, androidx.media3.exoplayer.source.h.b bVar, final p235t1.j jVar, final p235t1.k kVar, final int i11) {
            final Pair<Integer, androidx.media3.exoplayer.source.h.b> pairB = b(i10, bVar);
            if (pairB != null) {
                g0.this.f18386i.e(new Runnable() { // from class: androidx.media3.exoplayer.e0
                    @Override // java.lang.Runnable
                    public final void run() {
                        p162n1.a aVar = g0.this.f18385h;
                        Pair pair = pairB;
                        aVar.c0(((Integer) pair.first).intValue(), (androidx.media3.exoplayer.source.h.b) pair.second, jVar, kVar, i11);
                    }
                });
            }
        }

        @Override // androidx.media3.exoplayer.source.i
        public final void k(int i10, androidx.media3.exoplayer.source.h.b bVar, p235t1.k kVar) {
            Pair<Integer, androidx.media3.exoplayer.source.h.b> pairB = b(i10, bVar);
            if (pairB != null) {
                g0.this.f18386i.e(new c0(this, pairB, kVar, 0));
            }
        }
    }

    /* JADX INFO: compiled from: MediaSourceList.java */
    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final androidx.media3.exoplayer.source.h f18391a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final a0 f18392b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final a f18393c;

        public b(androidx.media3.exoplayer.source.h hVar, a0 a0Var, a aVar) {
            this.f18391a = hVar;
            this.f18392b = a0Var;
            this.f18393c = aVar;
        }
    }

    /* JADX INFO: compiled from: MediaSourceList.java */
    public static final class c implements Z {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final androidx.media3.exoplayer.source.f f18394a;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public int f18397d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public boolean f18398e;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final ArrayList f18396c = new ArrayList();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Object f18395b = new Object();

        public c(androidx.media3.exoplayer.source.h hVar, boolean z10) {
            this.f18394a = new androidx.media3.exoplayer.source.f(hVar, z10);
        }

        @Override // androidx.media3.exoplayer.Z
        public final Object a() {
            return this.f18395b;
        }

        @Override // androidx.media3.exoplayer.Z
        public final p078g1.x b() {
            return this.f18394a.f18689o;
        }
    }

    public g0(P p10, p162n1.a aVar, p114j1.g gVar, p162n1.u uVar) {
        this.f18378a = uVar;
        this.f18382e = p10;
        this.f18385h = aVar;
        this.f18386i = gVar;
    }

    public final p078g1.x a(int i10, ArrayList arrayList, p235t1.s sVar) {
        if (!arrayList.isEmpty()) {
            this.j = sVar;
            for (int i11 = i10; i11 < arrayList.size() + i10; i11++) {
                c cVar = (c) arrayList.get(i11 - i10);
                ArrayList arrayList2 = this.f18379b;
                if (i11 > 0) {
                    c cVar2 = (c) arrayList2.get(i11 - 1);
                    cVar.f18397d = cVar2.f18394a.f18689o.f47017b.o() + cVar2.f18397d;
                    cVar.f18398e = false;
                    cVar.f18396c.clear();
                } else {
                    cVar.f18397d = 0;
                    cVar.f18398e = false;
                    cVar.f18396c.clear();
                }
                int iO = cVar.f18394a.f18689o.f47017b.o();
                for (int i12 = i11; i12 < arrayList2.size(); i12++) {
                    ((c) arrayList2.get(i12)).f18397d += iO;
                }
                arrayList2.add(i11, cVar);
                this.f18381d.put(cVar.f18395b, cVar);
                if (this.f18387k) {
                    e(cVar);
                    if (this.f18380c.isEmpty()) {
                        this.f18384g.add(cVar);
                    } else {
                        b bVar = this.f18383f.get(cVar);
                        if (bVar != null) {
                            bVar.f18391a.f(bVar.f18392b);
                        }
                    }
                }
            }
        }
        return b();
    }

    public final p078g1.x b() {
        ArrayList arrayList = this.f18379b;
        if (arrayList.isEmpty()) {
            return p078g1.x.f35467a;
        }
        int iO = 0;
        for (int i10 = 0; i10 < arrayList.size(); i10++) {
            c cVar = (c) arrayList.get(i10);
            cVar.f18397d = iO;
            iO += cVar.f18394a.f18689o.f47017b.o();
        }
        return new l0(arrayList, this.j);
    }

    public final void c() {
        Iterator it = this.f18384g.iterator();
        while (it.hasNext()) {
            c cVar = (c) it.next();
            if (cVar.f18396c.isEmpty()) {
                b bVar = this.f18383f.get(cVar);
                if (bVar != null) {
                    bVar.f18391a.f(bVar.f18392b);
                }
                it.remove();
            }
        }
    }

    public final void d(c cVar) {
        if (cVar.f18398e && cVar.f18396c.isEmpty()) {
            b bVarRemove = this.f18383f.remove(cVar);
            bVarRemove.getClass();
            a0 a0Var = bVarRemove.f18392b;
            androidx.media3.exoplayer.source.h hVar = bVarRemove.f18391a;
            hVar.e(a0Var);
            a aVar = bVarRemove.f18393c;
            hVar.d(aVar);
            hVar.n(aVar);
            this.f18384g.remove(cVar);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [androidx.media3.exoplayer.a0, androidx.media3.exoplayer.source.h$c] */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public final void e(c cVar) {
        androidx.media3.exoplayer.source.f fVar = cVar.f18394a;
        ?? r10 = new androidx.media3.exoplayer.source.h.c() { // from class: androidx.media3.exoplayer.a0
            @Override // androidx.media3.exoplayer.source.h.c
            public final void a(androidx.media3.exoplayer.source.a aVar, p078g1.x xVar) {
                p114j1.g gVar = this.f18196a.f18382e.f18097i;
                gVar.j(2);
                gVar.i(22);
            }
        };
        a aVar = new a(cVar);
        this.f18383f.put(cVar, new b(fVar, r10, aVar));
        int i10 = p114j1.A.f40996a;
        Looper looperMyLooper = Looper.myLooper();
        if (looperMyLooper == null) {
            looperMyLooper = Looper.getMainLooper();
        }
        fVar.b(new Handler(looperMyLooper, null), aVar);
        Looper looperMyLooper2 = Looper.myLooper();
        if (looperMyLooper2 == null) {
            looperMyLooper2 = Looper.getMainLooper();
        }
        fVar.m(new Handler(looperMyLooper2, null), aVar);
        fVar.a(r10, this.f18388l, this.f18378a);
    }

    public final void f(androidx.media3.exoplayer.source.g gVar) {
        IdentityHashMap<androidx.media3.exoplayer.source.g, c> identityHashMap = this.f18380c;
        c cVarRemove = identityHashMap.remove(gVar);
        cVarRemove.getClass();
        cVarRemove.f18394a.o(gVar);
        cVarRemove.f18396c.remove(((androidx.media3.exoplayer.source.e) gVar).f18678b);
        if (!identityHashMap.isEmpty()) {
            c();
        }
        d(cVarRemove);
    }

    public final void g(int i10, int i11) {
        for (int i12 = i11 - 1; i12 >= i10; i12--) {
            ArrayList arrayList = this.f18379b;
            c cVar = (c) arrayList.remove(i12);
            this.f18381d.remove(cVar.f18395b);
            int i13 = -cVar.f18394a.f18689o.f47017b.o();
            for (int i14 = i12; i14 < arrayList.size(); i14++) {
                ((c) arrayList.get(i14)).f18397d += i13;
            }
            cVar.f18398e = true;
            if (this.f18387k) {
                d(cVar);
            }
        }
    }
}
