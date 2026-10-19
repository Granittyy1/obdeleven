package androidx.media3.exoplayer;

/* JADX INFO: compiled from: RendererHolder.java */
/* JADX INFO: loaded from: classes.dex */
public final class p0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final m0 f18593a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f18594b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final m0 f18595c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f18596d = 0;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f18597e = false;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f18598f = false;

    public p0(m0 m0Var, m0 m0Var2, int i10) {
        this.f18593a = m0Var;
        this.f18594b = i10;
        this.f18595c = m0Var2;
    }

    public static boolean g(m0 m0Var) {
        return m0Var.getState() != 0;
    }

    public static void l(m0 m0Var, long j) {
        m0Var.l();
        if (m0Var instanceof p247u1.e) {
            p247u1.e eVar = (p247u1.e) m0Var;
            p241t7.b.k(eVar.f18374o);
            eVar.f47402K = j;
        }
    }

    public final void a(m0 m0Var, C1394l c1394l) {
        p241t7.b.k(this.f18593a == m0Var || this.f18595c == m0Var);
        if (g(m0Var)) {
            if (m0Var == c1394l.f18474d) {
                c1394l.f18475e = null;
                c1394l.f18474d = null;
                c1394l.f18476f = true;
            }
            if (m0Var.getState() == 2) {
                m0Var.stop();
            }
            m0Var.f();
        }
    }

    public final int b() {
        boolean zG = g(this.f18593a);
        m0 m0Var = this.f18595c;
        return (zG ? 1 : 0) + ((m0Var == null || !g(m0Var)) ? 0 : 1);
    }

    public final m0 c(V v10) {
        if (v10 != null) {
            p235t1.r[] rVarArr = v10.f18150c;
            int i10 = this.f18594b;
            if (rVarArr[i10] != null) {
                m0 m0Var = this.f18593a;
                if (m0Var.y() == rVarArr[i10]) {
                    return m0Var;
                }
                m0 m0Var2 = this.f18595c;
                if (m0Var2 != null && m0Var2.y() == rVarArr[i10]) {
                    return m0Var2;
                }
            }
        }
        return null;
    }

    public final boolean d(V v10, m0 m0Var) {
        if (m0Var == null) {
            return true;
        }
        p235t1.r[] rVarArr = v10.f18150c;
        int i10 = this.f18594b;
        p235t1.r rVar = rVarArr[i10];
        if (m0Var.y() == null) {
            return true;
        }
        if (m0Var.y() == rVar) {
            if (rVar == null || m0Var.h()) {
                return true;
            }
            V v11 = v10.f18159m;
            if (v10.f18154g.f18169g && v11 != null && v11.f18152e && ((m0Var instanceof p247u1.e) || (m0Var instanceof p223s1.b) || m0Var.A() >= v11.e())) {
                return true;
            }
        }
        V v12 = v10.f18159m;
        return v12 != null && v12.f18150c[i10] == m0Var.y();
    }

    public final boolean e() {
        int i10 = this.f18596d;
        return i10 == 2 || i10 == 4 || i10 == 3;
    }

    public final boolean f() {
        int i10 = this.f18596d;
        if (i10 == 0 || i10 == 2 || i10 == 4) {
            return g(this.f18593a);
        }
        m0 m0Var = this.f18595c;
        m0Var.getClass();
        return m0Var.getState() != 0;
    }

    public final boolean h(int i10) {
        int i11 = this.f18596d;
        boolean z10 = i11 == 2 || i11 == 4;
        int i12 = this.f18594b;
        return (z10 && i10 == i12) || (i11 == 3 && i10 != i12);
    }

    public final void i(boolean z10) {
        if (z10) {
            if (this.f18597e) {
                this.f18593a.reset();
                this.f18597e = false;
                return;
            }
            return;
        }
        if (this.f18598f) {
            m0 m0Var = this.f18595c;
            m0Var.getClass();
            m0Var.reset();
            this.f18598f = false;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final int j(m0 m0Var, V v10, p259v1.y yVar, C1394l c1394l) throws ExoPlaybackException {
        m0 m0Var2;
        int i10;
        if (m0Var == null || m0Var.getState() == 0 || ((m0Var == (m0Var2 = this.f18593a) && ((i10 = this.f18596d) == 2 || i10 == 4)) || (m0Var == this.f18595c && this.f18596d == 3))) {
            return 1;
        }
        p235t1.r rVarY = m0Var.y();
        p235t1.r[] rVarArr = v10.f18150c;
        int i11 = this.f18594b;
        Object[] objArr = rVarY != rVarArr[i11];
        boolean zB = yVar.b(i11);
        if (zB && objArr != true) {
            return 1;
        }
        if (m0Var.C()) {
            if (!m0Var.d()) {
                return 0;
            }
            a(m0Var, c1394l);
            if (!zB || e()) {
                i(m0Var == m0Var2);
            }
            return 1;
        }
        p259v1.t tVar = yVar.f47625c[i11];
        int length = tVar != null ? tVar.length() : 0;
        p078g1.n[] nVarArr = new p078g1.n[length];
        for (int i12 = 0; i12 < length; i12++) {
            tVar.getClass();
            nVarArr[i12] = tVar.c(i12);
        }
        p235t1.r rVar = v10.f18150c[i11];
        rVar.getClass();
        m0Var.p(nVarArr, rVar, v10.e(), v10.f18162p, v10.f18154g.f18163a);
        return 3;
    }

    public final void k() {
        if (!g(this.f18593a)) {
            i(true);
        }
        m0 m0Var = this.f18595c;
        if (m0Var == null || m0Var.getState() != 0) {
            return;
        }
        i(false);
    }

    public final void m() throws ExoPlaybackException {
        m0 m0Var = this.f18593a;
        if (m0Var.getState() == 1 && this.f18596d != 4) {
            m0Var.start();
            return;
        }
        m0 m0Var2 = this.f18595c;
        if (m0Var2 == null || m0Var2.getState() != 1 || this.f18596d == 3) {
            return;
        }
        m0Var2.start();
    }
}
