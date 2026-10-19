package androidx.compose.ui.graphics.vector;

import android.graphics.PathMeasure;
import androidx.compose.ui.graphics.C;
import androidx.compose.ui.graphics.C1144u;
import androidx.compose.ui.graphics.C1145v;
import androidx.compose.ui.graphics.C1146w;
import androidx.compose.ui.graphics.e0;
import kotlin.LazyThreadSafetyMode;

/* JADX INFO: compiled from: Vector.kt */
/* JADX INFO: loaded from: classes.dex */
public final class PathComponent extends g {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public C f13822b;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public float f13826f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public C f13827g;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public float f13830k;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public float f13832m;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public boolean f13835p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public J.i f13836q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final C1144u f13837r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public C1144u f13838s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final Object f13839t;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public float f13823c = 1.0f;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Object f13824d = i.f13970a;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public float f13825e = 1.0f;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f13828h = 0;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f13829i = 0;
    public float j = 4.0f;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public float f13831l = 1.0f;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public boolean f13833n = true;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public boolean f13834o = true;

    public PathComponent() {
        C1144u c1144uA = C1146w.a();
        this.f13837r = c1144uA;
        this.f13838s = c1144uA;
        this.f13839t = kotlin.a.b(LazyThreadSafetyMode.f42973d, new Ia.a<e0>() { // from class: androidx.compose.ui.graphics.vector.PathComponent$pathMeasure$2
            @Override // Ia.a
            public final e0 invoke() {
                return new C1145v(new PathMeasure());
            }
        });
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, java.util.List] */
    @Override // androidx.compose.ui.graphics.vector.g
    public final void a(J.e eVar) {
        if (this.f13833n) {
            f.b(this.f13824d, this.f13837r);
            e();
        } else if (this.f13835p) {
            e();
        }
        this.f13833n = false;
        this.f13835p = false;
        C c10 = this.f13822b;
        if (c10 != null) {
            J.e.D0(eVar, this.f13838s, c10, this.f13823c, null, 56);
        }
        C c11 = this.f13827g;
        if (c11 != null) {
            J.i iVar = this.f13836q;
            if (this.f13834o || iVar == null) {
                iVar = new J.i(this.f13826f, this.j, this.f13828h, this.f13829i, 16);
                this.f13836q = iVar;
                this.f13834o = false;
            }
            J.e.D0(eVar, this.f13838s, c11, this.f13825e, iVar, 48);
        }
    }

    /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object, xa.g] */
    public final void e() {
        float f10 = this.f13830k;
        C1144u c1144u = this.f13837r;
        if (f10 == 0.0f && this.f13831l == 1.0f) {
            this.f13838s = c1144u;
            return;
        }
        if (kotlin.jvm.internal.i.a(this.f13838s, c1144u)) {
            this.f13838s = C1146w.a();
        } else {
            int i10 = this.f13838s.i();
            this.f13838s.o();
            this.f13838s.g(i10);
        }
        ?? r10 = this.f13839t;
        ((e0) r10.getValue()).b(c1144u);
        float length = ((e0) r10.getValue()).getLength();
        float f11 = this.f13830k;
        float f12 = this.f13832m;
        float f13 = ((f11 + f12) % 1.0f) * length;
        float f14 = ((this.f13831l + f12) % 1.0f) * length;
        if (f13 <= f14) {
            ((e0) r10.getValue()).a(f13, f14, this.f13838s);
        } else {
            ((e0) r10.getValue()).a(f13, length, this.f13838s);
            ((e0) r10.getValue()).a(0.0f, f14, this.f13838s);
        }
    }

    public final String toString() {
        return this.f13837r.toString();
    }
}
