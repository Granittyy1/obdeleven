package C;

import T4.o0;
import androidx.compose.runtime.AbstractC1094k;
import androidx.compose.runtime.C1074a;
import androidx.compose.runtime.C1086g;
import androidx.compose.runtime.C1090i;
import androidx.compose.runtime.S;
import androidx.compose.runtime.T;
import androidx.compose.runtime.z0;
import java.util.ArrayList;

/* JADX INFO: compiled from: ComposerChangeListWriter.kt */
/* JADX INFO: loaded from: classes.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C1086g f2220a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public a f2221b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f2222c;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f2225f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f2226g;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f2230l;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final o0 f2223d = new o0(1, false);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f2224e = true;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final ArrayList f2227h = new ArrayList();

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f2228i = -1;
    public int j = -1;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f2229k = -1;

    public b(C1086g c1086g, a aVar) {
        this.f2220a = c1086g;
        this.f2221b = aVar;
    }

    public final void a(S s10, AbstractC1094k abstractC1094k, T t8, T t10) {
        a aVar = this.f2221b;
        aVar.getClass();
        d.C0669e c0669e = d.C0669e.f2248c;
        f fVar = aVar.f2219c;
        fVar.m0(c0669e);
        int i10 = fVar.f2275h - fVar.f2270c[fVar.f2271d - 1].f2234b;
        Object[] objArr = fVar.f2274g;
        objArr[i10] = s10;
        objArr[i10 + 1] = abstractC1094k;
        objArr[i10 + 3] = t10;
        objArr[i10 + 2] = t8;
    }

    public final void b() {
        d();
        ArrayList arrayList = this.f2227h;
        if (arrayList.isEmpty()) {
            this.f2226g++;
        } else {
            arrayList.remove(arrayList.size() - 1);
        }
    }

    public final void c() {
        int i10 = this.f2226g;
        if (i10 > 0) {
            a aVar = this.f2221b;
            aVar.getClass();
            d.H h8 = d.H.f2242c;
            f fVar = aVar.f2219c;
            fVar.m0(h8);
            fVar.f2272e[fVar.f2273f - fVar.f2270c[fVar.f2271d - 1].f2233a] = i10;
            this.f2226g = 0;
        }
        ArrayList arrayList = this.f2227h;
        if (arrayList.isEmpty()) {
            return;
        }
        a aVar2 = this.f2221b;
        int size = arrayList.size();
        Object[] objArr = new Object[size];
        for (int i11 = 0; i11 < size; i11++) {
            objArr[i11] = arrayList.get(i11);
        }
        aVar2.getClass();
        if (size != 0) {
            d.C0672h c0672h = d.C0672h.f2251c;
            f fVar2 = aVar2.f2219c;
            fVar2.m0(c0672h);
            f.b.a(fVar2, 0, objArr);
        }
        arrayList.clear();
    }

    public final void d() {
        int i10 = this.f2230l;
        if (i10 > 0) {
            int i11 = this.f2228i;
            if (i11 >= 0) {
                c();
                a aVar = this.f2221b;
                aVar.getClass();
                d.x xVar = d.x.f2267c;
                f fVar = aVar.f2219c;
                fVar.m0(xVar);
                int i12 = fVar.f2273f - fVar.f2270c[fVar.f2271d - 1].f2233a;
                int[] iArr = fVar.f2272e;
                iArr[i12] = i11;
                iArr[i12 + 1] = i10;
                this.f2228i = -1;
            } else {
                int i13 = this.f2229k;
                int i14 = this.j;
                c();
                a aVar2 = this.f2221b;
                aVar2.getClass();
                d.s sVar = d.s.f2262c;
                f fVar2 = aVar2.f2219c;
                fVar2.m0(sVar);
                int i15 = fVar2.f2273f - fVar2.f2270c[fVar2.f2271d - 1].f2233a;
                int[] iArr2 = fVar2.f2272e;
                iArr2[i15 + 1] = i13;
                iArr2[i15] = i14;
                iArr2[i15 + 2] = i10;
                this.j = -1;
                this.f2229k = -1;
            }
            this.f2230l = 0;
        }
    }

    public final void e(boolean z10) {
        C1086g c1086g = this.f2220a;
        int i10 = z10 ? c1086g.f12986F.f13267i : c1086g.f12986F.f13265g;
        int i11 = i10 - this.f2225f;
        if (!(i11 >= 0)) {
            C1090i.c("Tried to seek backward");
        }
        if (i11 > 0) {
            a aVar = this.f2221b;
            aVar.getClass();
            d.C0666a c0666a = d.C0666a.f2244c;
            f fVar = aVar.f2219c;
            fVar.m0(c0666a);
            fVar.f2272e[fVar.f2273f - fVar.f2270c[fVar.f2271d - 1].f2233a] = i11;
            this.f2225f = i10;
        }
    }

    public final void f() {
        z0 z0Var = this.f2220a.f12986F;
        if (z0Var.f13261c > 0) {
            int i10 = z0Var.f13267i;
            o0 o0Var = this.f2223d;
            if (o0Var.d(-2) != i10) {
                if (!this.f2222c && this.f2224e) {
                    e(false);
                    a aVar = this.f2221b;
                    aVar.getClass();
                    aVar.f2219c.m0(d.n.f2257c);
                    this.f2222c = true;
                }
                if (i10 > 0) {
                    C1074a c1074aA = z0Var.a(i10);
                    o0Var.f(i10);
                    e(false);
                    a aVar2 = this.f2221b;
                    aVar2.getClass();
                    d.m mVar = d.m.f2256c;
                    f fVar = aVar2.f2219c;
                    fVar.m0(mVar);
                    f.b.a(fVar, 0, c1074aA);
                    this.f2222c = true;
                }
            }
        }
    }

    public final void g(int i10, int i11) {
        if (i11 > 0) {
            if (!(i10 >= 0)) {
                C1090i.c("Invalid remove index " + i10);
            }
            if (this.f2228i == i10) {
                this.f2230l += i11;
                return;
            }
            d();
            this.f2228i = i10;
            this.f2230l = i11;
        }
    }
}
