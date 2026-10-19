package androidx.compose.material.ripple;

import A8.A;
import android.view.View;
import androidx.collection.I;
import androidx.compose.ui.graphics.C1139o;
import androidx.compose.ui.graphics.E;
import androidx.compose.ui.graphics.L;
import androidx.compose.ui.node.C1183d;
import androidx.compose.ui.node.C1185f;
import androidx.compose.ui.node.C1192m;
import androidx.compose.ui.node.C1202x;
import androidx.compose.ui.node.InterfaceC1182c;
import androidx.compose.ui.node.InterfaceC1191l;
import androidx.compose.ui.node.InterfaceC1197s;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import kotlin.jvm.internal.Lambda;
import kotlinx.coroutines.C2680e;
import p293xa.r;

/* JADX INFO: compiled from: Ripple.kt */
/* JADX INFO: loaded from: classes.dex */
public abstract class RippleNode extends androidx.compose.ui.h.c implements InterfaceC1182c, InterfaceC1191l, InterfaceC1197s {

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final androidx.compose.foundation.interaction.j f11956p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final boolean f11957q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final float f11958r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final L f11959s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final Lambda f11960t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public StateLayer f11961u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public float f11962v;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public boolean f11964x;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public long f11963w = 0;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final I<androidx.compose.foundation.interaction.m> f11965y = new I<>((Object) null);

    /* JADX WARN: Multi-variable type inference failed */
    public RippleNode(androidx.compose.foundation.interaction.j jVar, boolean z10, float f10, L l10, Ia.a aVar) {
        this.f11956p = jVar;
        this.f11957q = z10;
        this.f11958r = f10;
        this.f11959s = l10;
        this.f11960t = (Lambda) aVar;
    }

    @Override // androidx.compose.ui.h.c
    public final boolean F1() {
        return false;
    }

    @Override // androidx.compose.ui.h.c
    public final void I1() {
        C2680e.c(E1(), null, null, new RippleNode$onAttach$1(this, null), 3);
    }

    /* JADX WARN: Type inference failed for: r13v13, types: [Ia.a, kotlin.jvm.internal.Lambda] */
    public final void Q1(androidx.compose.foundation.interaction.m mVar) {
        if (!(mVar instanceof androidx.compose.foundation.interaction.m.b)) {
            if (mVar instanceof androidx.compose.foundation.interaction.m.c) {
                androidx.compose.foundation.interaction.m.b bVar = ((androidx.compose.foundation.interaction.m.c) mVar).f10076a;
                l lVar = ((b) this).f11987A;
                if (lVar != null) {
                    lVar.d();
                    return;
                }
                return;
            }
            if (mVar instanceof androidx.compose.foundation.interaction.m.a) {
                androidx.compose.foundation.interaction.m.b bVar2 = ((androidx.compose.foundation.interaction.m.a) mVar).f10074a;
                l lVar2 = ((b) this).f11987A;
                if (lVar2 != null) {
                    lVar2.d();
                    return;
                }
                return;
            }
            return;
        }
        androidx.compose.foundation.interaction.m.b bVar3 = (androidx.compose.foundation.interaction.m.b) mVar;
        long j = this.f11963w;
        float f10 = this.f11962v;
        final b bVar4 = (b) this;
        h hVarC = bVar4.f11988z;
        if (hVarC == null) {
            hVarC = C.e.c(C.e.d((View) C1183d.a(bVar4, AndroidCompositionLocals_androidKt.f14797f)));
            bVar4.f11988z = hVarC;
            kotlin.jvm.internal.i.b(hVarC);
        }
        l lVarA = hVarC.a(bVar4);
        lVarA.b(bVar3, bVar4.f11957q, j, Ka.a.b(f10), bVar4.f11959s.a(), ((f) bVar4.f11960t.invoke()).f11996d, new Ia.a<r>() { // from class: androidx.compose.material.ripple.AndroidRippleNode$addRipple$1$1$1
            {
                super(0);
            }

            @Override // Ia.a
            public final r invoke() {
                C1192m.a(bVar4);
                return r.f47939a;
            }
        });
        bVar4.f11987A = lVarA;
        C1192m.a(bVar4);
    }

    @Override // androidx.compose.ui.node.InterfaceC1197s
    public final void T(long j) {
        this.f11964x = true;
        p013b0.c cVar = C1185f.f(this).f14423z;
        this.f11963w = A.k(j);
        float f10 = this.f11958r;
        this.f11962v = Float.isNaN(f10) ? g.a(cVar, this.f11957q, this.f11963w) : cVar.T0(f10);
        I<androidx.compose.foundation.interaction.m> i10 = this.f11965y;
        Object[] objArr = i10.f9108a;
        int i11 = i10.f9109b;
        for (int i12 = 0; i12 < i11; i12++) {
            Q1((androidx.compose.foundation.interaction.m) objArr[i12]);
        }
        i10.i();
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [Ia.a, kotlin.jvm.internal.Lambda] */
    @Override // androidx.compose.ui.node.InterfaceC1191l
    public final void x(C1202x c1202x) {
        c1202x.A1();
        StateLayer stateLayer = this.f11961u;
        if (stateLayer != null) {
            stateLayer.a(c1202x, this.f11962v, this.f11959s.a());
        }
        b bVar = (b) this;
        E eA = c1202x.f14624b.f3941c.a();
        l lVar = bVar.f11987A;
        if (lVar != null) {
            lVar.e(bVar.f11963w, Ka.a.b(bVar.f11962v), bVar.f11959s.a(), ((f) bVar.f11960t.invoke()).f11996d);
            lVar.draw(C1139o.a(eA));
        }
    }
}
