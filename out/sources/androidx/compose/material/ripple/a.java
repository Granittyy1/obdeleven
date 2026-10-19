package androidx.compose.material.ripple;

import android.view.ViewGroup;
import androidx.compose.runtime.C1085f0;
import androidx.compose.runtime.J0;
import androidx.compose.runtime.X;
import androidx.compose.runtime.t0;
import androidx.compose.ui.graphics.C1139o;
import androidx.compose.ui.graphics.E;
import androidx.compose.ui.graphics.H;
import androidx.compose.ui.node.C1202x;
import java.util.LinkedHashMap;
import p293xa.r;

/* JADX INFO: compiled from: Ripple.android.kt */
/* JADX INFO: loaded from: classes.dex */
@p293xa.d
public final class a extends m implements t0, i {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f11977d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final float f11978e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final X f11979f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final X f11980g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final ViewGroup f11981h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public h f11982i;
    public final C1085f0 j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final C1085f0 f11983k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public long f11984l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int f11985m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final Ia.a<r> f11986n;

    public a() {
        throw null;
    }

    public a(boolean z10, float f10, X x10, X x11, ViewGroup viewGroup) {
        super(x11, z10);
        this.f11977d = z10;
        this.f11978e = f10;
        this.f11979f = x10;
        this.f11980g = x11;
        this.f11981h = viewGroup;
        this.j = J0.f(null);
        this.f11983k = J0.f(Boolean.TRUE);
        this.f11984l = 0L;
        this.f11985m = -1;
        this.f11986n = new Ia.a<r>() { // from class: androidx.compose.material.ripple.AndroidRippleIndicationInstance$onInvalidateRipple$1
            {
                super(0);
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // Ia.a
            public final r invoke() {
                a aVar = this.this$0;
                aVar.f11983k.setValue(Boolean.valueOf(!((Boolean) aVar.f11983k.getValue()).booleanValue()));
                return r.f47939a;
            }
        };
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.compose.foundation.w
    public final void a(C1202x c1202x) {
        int iE1;
        float fT0;
        J.a aVar = c1202x.f14624b;
        this.f11984l = aVar.j();
        float f10 = this.f11978e;
        if (Float.isNaN(f10)) {
            iE1 = Ka.a.b(g.a(c1202x, this.f11977d, aVar.j()));
        } else {
            iE1 = aVar.e1(f10);
        }
        this.f11985m = iE1;
        long j = ((H) this.f11979f.getValue()).f13506a;
        float f11 = ((f) this.f11980g.getValue()).f11996d;
        c1202x.A1();
        if (Float.isNaN(f10)) {
            fT0 = g.a(c1202x, this.f12014b, aVar.j());
        } else {
            fT0 = c1202x.T0(f10);
        }
        this.f12015c.a(c1202x, fT0, j);
        E eA = aVar.f3941c.a();
        ((Boolean) this.f11983k.getValue()).booleanValue();
        l lVar = (l) this.j.getValue();
        if (lVar != null) {
            lVar.e(aVar.j(), this.f11985m, j, f11);
            lVar.draw(C1139o.a(eA));
        }
    }

    @Override // androidx.compose.runtime.t0
    public final void b() {
        h hVar = this.f11982i;
        if (hVar != null) {
            y0();
            j jVar = hVar.f12001e;
            l lVar = (l) ((LinkedHashMap) jVar.f12003b).get(this);
            if (lVar != null) {
                lVar.c();
                LinkedHashMap linkedHashMap = (LinkedHashMap) jVar.f12003b;
                l lVar2 = (l) linkedHashMap.get(this);
                if (lVar2 != null) {
                }
                linkedHashMap.remove(this);
                hVar.f12000d.add(lVar);
            }
        }
    }

    @Override // androidx.compose.runtime.t0
    public final void c() {
        h hVar = this.f11982i;
        if (hVar != null) {
            y0();
            j jVar = hVar.f12001e;
            l lVar = (l) ((LinkedHashMap) jVar.f12003b).get(this);
            if (lVar != null) {
                lVar.c();
                LinkedHashMap linkedHashMap = (LinkedHashMap) jVar.f12003b;
                l lVar2 = (l) linkedHashMap.get(this);
                if (lVar2 != null) {
                }
                linkedHashMap.remove(this);
                hVar.f12000d.add(lVar);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.compose.material.ripple.m
    public final void e(androidx.compose.foundation.interaction.m.b bVar) {
        h hVarC = this.f11982i;
        if (hVarC == null) {
            hVarC = C.e.c(this.f11981h);
            this.f11982i = hVarC;
            kotlin.jvm.internal.i.b(hVarC);
        }
        l lVarA = hVarC.a(this);
        lVarA.b(bVar, this.f11977d, this.f11984l, this.f11985m, ((H) this.f11979f.getValue()).f13506a, ((f) this.f11980g.getValue()).f11996d, this.f11986n);
        this.j.setValue(lVarA);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.compose.material.ripple.m
    public final void f() {
        l lVar = (l) this.j.getValue();
        if (lVar != null) {
            lVar.d();
        }
    }

    @Override // androidx.compose.material.ripple.i
    public final void y0() {
        this.j.setValue(null);
    }

    @Override // androidx.compose.runtime.t0
    public final void d() {
    }
}
