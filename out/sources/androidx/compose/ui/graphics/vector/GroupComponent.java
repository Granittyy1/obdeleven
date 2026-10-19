package androidx.compose.ui.graphics.vector;

import androidx.compose.foundation.C0936h;
import androidx.compose.ui.graphics.C;
import androidx.compose.ui.graphics.C1144u;
import androidx.compose.ui.graphics.C1146w;
import androidx.compose.ui.graphics.H;
import androidx.compose.ui.graphics.a0;
import androidx.compose.ui.graphics.m0;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.Lambda;
import p293xa.r;

/* JADX INFO: compiled from: Vector.kt */
/* JADX INFO: loaded from: classes.dex */
public final class GroupComponent extends g {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public float[] f13805b;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public C1144u f13811h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public Lambda f13812i;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public float f13814l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public float f13815m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public float f13816n;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public float f13819q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public float f13820r;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ArrayList f13806c = new ArrayList();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f13807d = true;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public long f13808e = H.f13504l;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public List<? extends e> f13809f = i.f13970a;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f13810g = true;
    public final Ia.l<g, r> j = new Ia.l<g, r>() { // from class: androidx.compose.ui.graphics.vector.GroupComponent$wrappedListener$1
        {
            super(1);
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [Ia.l, kotlin.jvm.internal.Lambda] */
        @Override // Ia.l
        public final r invoke(g gVar) {
            g gVar2 = gVar;
            this.this$0.g(gVar2);
            ?? r10 = this.this$0.f13812i;
            if (r10 != 0) {
                r10.invoke(gVar2);
            }
            return r.f47939a;
        }
    };

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public String f13813k = "";

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public float f13817o = 1.0f;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public float f13818p = 1.0f;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public boolean f13821s = true;

    @Override // androidx.compose.ui.graphics.vector.g
    public final void a(J.e eVar) {
        if (this.f13821s) {
            float[] fArrA = this.f13805b;
            if (fArrA == null) {
                fArrA = a0.a();
                this.f13805b = fArrA;
            } else {
                a0.d(fArrA);
            }
            a0.f(fArrA, this.f13819q + this.f13815m, this.f13820r + this.f13816n, 0.0f);
            float f10 = this.f13814l;
            if (fArrA.length >= 16) {
                double d10 = ((double) f10) * 0.017453292519943295d;
                float fSin = (float) Math.sin(d10);
                float fCos = (float) Math.cos(d10);
                float f11 = fArrA[0];
                float f12 = fArrA[4];
                float f13 = (fSin * f12) + (fCos * f11);
                float f14 = -fSin;
                float f15 = (f12 * fCos) + (f11 * f14);
                float f16 = fArrA[1];
                float f17 = fArrA[5];
                float f18 = (fSin * f17) + (fCos * f16);
                float f19 = (f17 * fCos) + (f16 * f14);
                float f20 = fArrA[2];
                float f21 = fArrA[6];
                float f22 = (fSin * f21) + (fCos * f20);
                float f23 = (f21 * fCos) + (f20 * f14);
                float f24 = fArrA[3];
                float f25 = fArrA[7];
                float f26 = (fSin * f25) + (fCos * f24);
                fArrA[0] = f13;
                fArrA[1] = f18;
                fArrA[2] = f22;
                fArrA[3] = f26;
                fArrA[4] = f15;
                fArrA[5] = f19;
                fArrA[6] = f23;
                fArrA[7] = (fCos * f25) + (f14 * f24);
            }
            float f27 = this.f13817o;
            float f28 = this.f13818p;
            if (fArrA.length >= 16) {
                fArrA[0] = fArrA[0] * f27;
                fArrA[1] = fArrA[1] * f27;
                fArrA[2] = fArrA[2] * f27;
                fArrA[3] = fArrA[3] * f27;
                fArrA[4] = fArrA[4] * f28;
                fArrA[5] = fArrA[5] * f28;
                fArrA[6] = fArrA[6] * f28;
                fArrA[7] = fArrA[7] * f28;
                fArrA[8] = fArrA[8] * 1.0f;
                fArrA[9] = fArrA[9] * 1.0f;
                fArrA[10] = fArrA[10] * 1.0f;
                fArrA[11] = fArrA[11] * 1.0f;
            }
            a0.f(fArrA, -this.f13815m, -this.f13816n, 0.0f);
            this.f13821s = false;
        }
        if (this.f13810g) {
            if (!this.f13809f.isEmpty()) {
                C1144u c1144uA = this.f13811h;
                if (c1144uA == null) {
                    c1144uA = C1146w.a();
                    this.f13811h = c1144uA;
                }
                f.b(this.f13809f, c1144uA);
            }
            this.f13810g = false;
        }
        J.a.b bVarW0 = eVar.W0();
        long jE = bVarW0.e();
        bVarW0.a().g();
        try {
            J.b bVar = bVarW0.f3948a;
            float[] fArr = this.f13805b;
            if (fArr != null) {
                ((J.a.b) bVar.f3951b).a().i(fArr);
            }
            C1144u c1144u = this.f13811h;
            if (!this.f13809f.isEmpty() && c1144u != null) {
                bVar.c(c1144u, 1);
            }
            ArrayList arrayList = this.f13806c;
            int size = arrayList.size();
            for (int i10 = 0; i10 < size; i10++) {
                ((g) arrayList.get(i10)).a(eVar);
            }
        } finally {
            C0936h.f(bVarW0, jE);
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [Ia.l<androidx.compose.ui.graphics.vector.g, xa.r>, kotlin.jvm.internal.Lambda] */
    @Override // androidx.compose.ui.graphics.vector.g
    public final Ia.l<g, r> b() {
        return this.f13812i;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.compose.ui.graphics.vector.g
    public final void d(Ia.l<? super g, r> lVar) {
        this.f13812i = (Lambda) lVar;
    }

    public final void e(int i10, g gVar) {
        ArrayList arrayList = this.f13806c;
        if (i10 < arrayList.size()) {
            arrayList.set(i10, gVar);
        } else {
            arrayList.add(gVar);
        }
        g(gVar);
        gVar.d(this.j);
        c();
    }

    public final void f(long j) {
        if (this.f13807d && j != 16) {
            long j10 = this.f13808e;
            if (j10 == 16) {
                this.f13808e = j;
                return;
            }
            EmptyList emptyList = i.f13970a;
            if (H.h(j10) == H.h(j) && H.g(j10) == H.g(j) && H.e(j10) == H.e(j)) {
                return;
            }
            this.f13807d = false;
            this.f13808e = H.f13504l;
        }
    }

    public final void g(g gVar) {
        if (!(gVar instanceof PathComponent)) {
            if (gVar instanceof GroupComponent) {
                GroupComponent groupComponent = (GroupComponent) gVar;
                if (groupComponent.f13807d && this.f13807d) {
                    f(groupComponent.f13808e);
                    return;
                } else {
                    this.f13807d = false;
                    this.f13808e = H.f13504l;
                    return;
                }
            }
            return;
        }
        PathComponent pathComponent = (PathComponent) gVar;
        C c10 = pathComponent.f13822b;
        if (this.f13807d && c10 != null) {
            if (c10 instanceof m0) {
                f(((m0) c10).f13770a);
            } else {
                this.f13807d = false;
                this.f13808e = H.f13504l;
            }
        }
        C c11 = pathComponent.f13827g;
        if (this.f13807d && c11 != null) {
            if (c11 instanceof m0) {
                f(((m0) c11).f13770a);
            } else {
                this.f13807d = false;
                this.f13808e = H.f13504l;
            }
        }
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("VGroup: ");
        sb2.append(this.f13813k);
        ArrayList arrayList = this.f13806c;
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            g gVar = (g) arrayList.get(i10);
            sb2.append("\t");
            sb2.append(gVar.toString());
            sb2.append("\n");
        }
        return sb2.toString();
    }
}
