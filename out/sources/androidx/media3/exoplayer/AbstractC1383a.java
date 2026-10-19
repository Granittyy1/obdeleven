package androidx.media3.exoplayer;

import android.util.Pair;

/* JADX INFO: renamed from: androidx.media3.exoplayer.a, reason: case insensitive filesystem */
/* JADX INFO: compiled from: AbstractConcatenatedTimeline.java */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1383a extends p078g1.x {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ int f18193d = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f18194b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final p235t1.s f18195c;

    public AbstractC1383a(p235t1.s sVar) {
        this.f18195c = sVar;
        this.f18194b = sVar.getLength();
    }

    @Override // p078g1.x
    public final int a(boolean z10) {
        if (this.f18194b == 0) {
            return -1;
        }
        int iA = z10 ? this.f18195c.a() : 0;
        do {
            l0 l0Var = (l0) this;
            p078g1.x[] xVarArr = l0Var.f18482i;
            if (!xVarArr[iA].p()) {
                return xVarArr[iA].a(z10) + l0Var.f18481h[iA];
            }
            iA = q(iA, z10);
        } while (iA != -1);
        return -1;
    }

    @Override // p078g1.x
    public final int b(Object obj) {
        int iB;
        if (!(obj instanceof Pair)) {
            return -1;
        }
        Pair pair = (Pair) obj;
        Object obj2 = pair.first;
        Object obj3 = pair.second;
        l0 l0Var = (l0) this;
        Integer num = l0Var.f18483k.get(obj2);
        int iIntValue = num == null ? -1 : num.intValue();
        if (iIntValue == -1 || (iB = l0Var.f18482i[iIntValue].b(obj3)) == -1) {
            return -1;
        }
        return l0Var.f18480g[iIntValue] + iB;
    }

    @Override // p078g1.x
    public final int c(boolean z10) {
        int i10 = this.f18194b;
        if (i10 == 0) {
            return -1;
        }
        int iF = z10 ? this.f18195c.f() : i10 - 1;
        do {
            l0 l0Var = (l0) this;
            p078g1.x[] xVarArr = l0Var.f18482i;
            if (!xVarArr[iF].p()) {
                return xVarArr[iF].c(z10) + l0Var.f18481h[iF];
            }
            iF = r(iF, z10);
        } while (iF != -1);
        return -1;
    }

    @Override // p078g1.x
    public final int e(int i10, int i11, boolean z10) {
        l0 l0Var = (l0) this;
        int[] iArr = l0Var.f18481h;
        int iC = p114j1.A.c(iArr, i10 + 1, false, false);
        int i12 = iArr[iC];
        p078g1.x[] xVarArr = l0Var.f18482i;
        int iE = xVarArr[iC].e(i10 - i12, i11 != 2 ? i11 : 0, z10);
        if (iE != -1) {
            return i12 + iE;
        }
        int iQ = q(iC, z10);
        while (iQ != -1 && xVarArr[iQ].p()) {
            iQ = q(iQ, z10);
        }
        if (iQ != -1) {
            return xVarArr[iQ].a(z10) + iArr[iQ];
        }
        if (i11 == 2) {
            return a(z10);
        }
        return -1;
    }

    @Override // p078g1.x
    public final g1.x.b f(int i10, g1.x.b bVar, boolean z10) {
        l0 l0Var = (l0) this;
        int[] iArr = l0Var.f18480g;
        int iC = p114j1.A.c(iArr, i10 + 1, false, false);
        int i11 = l0Var.f18481h[iC];
        l0Var.f18482i[iC].f(i10 - iArr[iC], bVar, z10);
        bVar.f35470c += i11;
        if (z10) {
            Object obj = l0Var.j[iC];
            Object obj2 = bVar.f35469b;
            obj2.getClass();
            bVar.f35469b = Pair.create(obj, obj2);
        }
        return bVar;
    }

    @Override // p078g1.x
    public final g1.x.b g(Object obj, g1.x.b bVar) {
        Pair pair = (Pair) obj;
        Object obj2 = pair.first;
        Object obj3 = pair.second;
        l0 l0Var = (l0) this;
        Integer num = l0Var.f18483k.get(obj2);
        int iIntValue = num == null ? -1 : num.intValue();
        int i10 = l0Var.f18481h[iIntValue];
        l0Var.f18482i[iIntValue].g(obj3, bVar);
        bVar.f35470c += i10;
        bVar.f35469b = obj;
        return bVar;
    }

    @Override // p078g1.x
    public final int k(int i10, int i11, boolean z10) {
        l0 l0Var = (l0) this;
        int[] iArr = l0Var.f18481h;
        int iC = p114j1.A.c(iArr, i10 + 1, false, false);
        int i12 = iArr[iC];
        p078g1.x[] xVarArr = l0Var.f18482i;
        int iK = xVarArr[iC].k(i10 - i12, i11 != 2 ? i11 : 0, z10);
        if (iK != -1) {
            return i12 + iK;
        }
        int iR = r(iC, z10);
        while (iR != -1 && xVarArr[iR].p()) {
            iR = r(iR, z10);
        }
        if (iR != -1) {
            return xVarArr[iR].c(z10) + iArr[iR];
        }
        if (i11 == 2) {
            return c(z10);
        }
        return -1;
    }

    @Override // p078g1.x
    public final Object l(int i10) {
        l0 l0Var = (l0) this;
        int[] iArr = l0Var.f18480g;
        int iC = p114j1.A.c(iArr, i10 + 1, false, false);
        return Pair.create(l0Var.j[iC], l0Var.f18482i[iC].l(i10 - iArr[iC]));
    }

    @Override // p078g1.x
    public final g1.x.c m(int i10, g1.x.c cVar, long j) {
        l0 l0Var = (l0) this;
        int[] iArr = l0Var.f18481h;
        int iC = p114j1.A.c(iArr, i10 + 1, false, false);
        int i11 = iArr[iC];
        int i12 = l0Var.f18480g[iC];
        l0Var.f18482i[iC].m(i10 - i11, cVar, j);
        Object objCreate = l0Var.j[iC];
        if (!g1.x.c.f35475p.equals(cVar.f35477a)) {
            objCreate = Pair.create(objCreate, cVar.f35477a);
        }
        cVar.f35477a = objCreate;
        cVar.f35488m += i12;
        cVar.f35489n += i12;
        return cVar;
    }

    public final int q(int i10, boolean z10) {
        if (z10) {
            return this.f18195c.d(i10);
        }
        if (i10 < this.f18194b - 1) {
            return i10 + 1;
        }
        return -1;
    }

    public final int r(int i10, boolean z10) {
        if (z10) {
            return this.f18195c.c(i10);
        }
        if (i10 > 0) {
            return i10 - 1;
        }
        return -1;
    }
}
