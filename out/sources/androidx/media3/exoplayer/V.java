package androidx.media3.exoplayer;

import android.util.Pair;

/* JADX INFO: compiled from: MediaPeriodHolder.java */
/* JADX INFO: loaded from: classes.dex */
public final class V {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f18148a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f18149b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final p235t1.r[] f18150c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f18151d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f18152e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f18153f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public W f18154g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f18155h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final boolean[] f18156i;
    public final n0[] j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final p259v1.x f18157k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final g0 f18158l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public V f18159m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public p235t1.w f18160n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public p259v1.y f18161o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public long f18162p;

    public V(n0[] n0VarArr, long j, p259v1.x xVar, p272w1.d dVar, g0 g0Var, W w3, p259v1.y yVar) {
        this.j = n0VarArr;
        this.f18162p = j;
        this.f18157k = xVar;
        this.f18158l = g0Var;
        androidx.media3.exoplayer.source.h.b bVar = w3.f18163a;
        this.f18149b = bVar.f18698a;
        this.f18154g = w3;
        this.f18160n = p235t1.w.f47101d;
        this.f18161o = yVar;
        this.f18150c = new p235t1.r[n0VarArr.length];
        this.f18156i = new boolean[n0VarArr.length];
        g0Var.getClass();
        int i10 = AbstractC1383a.f18193d;
        Pair pair = (Pair) bVar.f18698a;
        Object obj = pair.first;
        androidx.media3.exoplayer.source.h.b bVarA = bVar.a(pair.second);
        g0.c cVar = (g0.c) g0Var.f18381d.get(obj);
        cVar.getClass();
        g0Var.f18384g.add(cVar);
        g0.b bVar2 = g0Var.f18383f.get(cVar);
        if (bVar2 != null) {
            bVar2.f18391a.c(bVar2.f18392b);
        }
        cVar.f18396c.add(bVarA);
        androidx.media3.exoplayer.source.g gVarD = cVar.f18394a.g(bVarA, dVar, w3.f18164b);
        g0Var.f18380c.put(gVarD, cVar);
        g0Var.c();
        long j10 = w3.f18166d;
        this.f18148a = j10 != -9223372036854775807L ? new androidx.media3.exoplayer.source.b(gVarD, !w3.f18168f, 0L, j10) : gVarD;
    }

    /* JADX WARN: Type inference failed for: r9v0, types: [androidx.media3.exoplayer.source.g, java.lang.Object] */
    public final long a(p259v1.y yVar, long j, boolean z10, boolean[] zArr) {
        n0[] n0VarArr;
        p235t1.r[] rVarArr;
        int i10 = 0;
        while (true) {
            boolean z11 = true;
            if (i10 >= yVar.f47623a) {
                break;
            }
            if (z10 || !yVar.a(this.f18161o, i10)) {
                z11 = false;
            }
            this.f18156i[i10] = z11;
            i10++;
        }
        int i11 = 0;
        while (true) {
            n0VarArr = this.j;
            int length = n0VarArr.length;
            rVarArr = this.f18150c;
            if (i11 >= length) {
                break;
            }
            if (((AbstractC1389g) n0VarArr[i11]).f18363c == -2) {
                rVarArr[i11] = null;
            }
            i11++;
        }
        b();
        this.f18161o = yVar;
        c();
        long jL = this.f18148a.l(yVar.f47625c, this.f18156i, this.f18150c, zArr, j);
        for (int i12 = 0; i12 < n0VarArr.length; i12++) {
            if (((AbstractC1389g) n0VarArr[i12]).f18363c == -2 && this.f18161o.b(i12)) {
                rVarArr[i12] = new com.voltasit.obdeleven.domain.usecases.device.u();
            }
        }
        this.f18153f = false;
        for (int i13 = 0; i13 < rVarArr.length; i13++) {
            if (rVarArr[i13] != null) {
                p241t7.b.k(yVar.b(i13));
                if (((AbstractC1389g) n0VarArr[i13]).f18363c != -2) {
                    this.f18153f = true;
                }
            } else {
                p241t7.b.k(yVar.f47625c[i13] == null);
            }
        }
        return jL;
    }

    public final void b() {
        if (this.f18159m != null) {
            return;
        }
        int i10 = 0;
        while (true) {
            p259v1.y yVar = this.f18161o;
            if (i10 >= yVar.f47623a) {
                return;
            }
            boolean zB = yVar.b(i10);
            p259v1.t tVar = this.f18161o.f47625c[i10];
            if (zB && tVar != null) {
                tVar.f();
            }
            i10++;
        }
    }

    public final void c() {
        if (this.f18159m != null) {
            return;
        }
        int i10 = 0;
        while (true) {
            p259v1.y yVar = this.f18161o;
            if (i10 >= yVar.f47623a) {
                return;
            }
            boolean zB = yVar.b(i10);
            p259v1.t tVar = this.f18161o.f47625c[i10];
            if (zB && tVar != null) {
                tVar.d();
            }
            i10++;
        }
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [androidx.media3.exoplayer.source.m, java.lang.Object] */
    public final long d() {
        if (!this.f18152e) {
            return this.f18154g.f18164b;
        }
        long jQ = this.f18153f ? this.f18148a.q() : Long.MIN_VALUE;
        return jQ == Long.MIN_VALUE ? this.f18154g.f18167e : jQ;
    }

    public final long e() {
        return this.f18154g.f18164b + this.f18162p;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [androidx.media3.exoplayer.source.g, java.lang.Object] */
    public final void f(float f10, p078g1.x xVar, boolean z10) throws ExoPlaybackException {
        this.f18152e = true;
        this.f18160n = this.f18148a.n();
        p259v1.y yVarJ = j(f10, xVar, z10);
        W w3 = this.f18154g;
        long j = w3.f18167e;
        long jMax = w3.f18164b;
        if (j != -9223372036854775807L && jMax >= j) {
            jMax = Math.max(0L, j - 1);
        }
        long jA = a(yVarJ, jMax, false, new boolean[this.j.length]);
        long j10 = this.f18162p;
        W w10 = this.f18154g;
        this.f18162p = (w10.f18164b - jA) + j10;
        this.f18154g = w10.b(jA);
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [androidx.media3.exoplayer.source.m, java.lang.Object] */
    public final boolean g() {
        return this.f18152e && (!this.f18153f || this.f18148a.q() == Long.MIN_VALUE);
    }

    public final boolean h() {
        return this.f18152e && (g() || d() - this.f18154g.f18164b >= -9223372036854775807L);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [androidx.media3.exoplayer.source.g, java.lang.Object] */
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
    public final void i() {
        b();
        ?? r10 = this.f18148a;
        try {
            boolean z10 = r10 instanceof androidx.media3.exoplayer.source.b;
            g0 g0Var = this.f18158l;
            if (z10) {
                g0Var.f(((androidx.media3.exoplayer.source.b) r10).f18644b);
            } else {
                g0Var.f(r10);
            }
        } catch (RuntimeException e10) {
            p114j1.k.d("MediaPeriodHolder", "Period release failed.", e10);
        }
    }

    public final p259v1.y j(float f10, p078g1.x xVar, boolean z10) throws ExoPlaybackException {
        p259v1.t[] tVarArr;
        p235t1.w wVar = this.f18160n;
        W w3 = this.f18154g;
        p259v1.x xVar2 = this.f18157k;
        n0[] n0VarArr = this.j;
        p259v1.y yVarE = xVar2.e(n0VarArr, wVar, w3.f18163a, xVar);
        int i10 = 0;
        while (true) {
            int i11 = yVarE.f47623a;
            tVarArr = yVarE.f47625c;
            if (i10 >= i11) {
                break;
            }
            boolean z11 = true;
            if (yVarE.b(i10)) {
                if (tVarArr[i10] == null && ((AbstractC1389g) n0VarArr[i10]).f18363c != -2) {
                    z11 = false;
                }
                p241t7.b.k(z11);
            } else {
                p241t7.b.k(tVarArr[i10] == null);
            }
            i10++;
        }
        for (p259v1.t tVar : tVarArr) {
            if (tVar != null) {
                tVar.i(f10);
                tVar.b(z10);
            }
        }
        return yVarE;
    }

    public final void k() {
        Object obj = this.f18148a;
        if (obj instanceof androidx.media3.exoplayer.source.b) {
            long j = this.f18154g.f18166d;
            if (j == -9223372036854775807L) {
                j = Long.MIN_VALUE;
            }
            androidx.media3.exoplayer.source.b bVar = (androidx.media3.exoplayer.source.b) obj;
            bVar.f18648f = 0L;
            bVar.f18649g = j;
        }
    }
}
