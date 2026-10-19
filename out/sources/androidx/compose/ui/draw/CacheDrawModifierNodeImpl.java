package androidx.compose.ui.draw;

import A8.A;
import C4.v;
import Ia.l;
import androidx.compose.ui.graphics.S;
import androidx.compose.ui.node.C1185f;
import androidx.compose.ui.node.C1192m;
import androidx.compose.ui.node.C1202x;
import androidx.compose.ui.node.O;
import androidx.compose.ui.node.P;
import androidx.compose.ui.unit.LayoutDirection;
import p293xa.r;

/* JADX INFO: compiled from: DrawModifier.kt */
/* JADX INFO: loaded from: classes.dex */
public final class CacheDrawModifierNodeImpl extends androidx.compose.ui.h.c implements b, O, a {

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final CacheDrawScope f13365p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public boolean f13366q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public k f13367r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public l<? super CacheDrawScope, g> f13368s;

    public CacheDrawModifierNodeImpl(CacheDrawScope cacheDrawScope, l<? super CacheDrawScope, g> lVar) {
        this.f13365p = cacheDrawScope;
        this.f13368s = lVar;
        cacheDrawScope.f13369b = this;
        cacheDrawScope.f13371d = new Ia.a<S>() { // from class: androidx.compose.ui.draw.CacheDrawModifierNodeImpl.1
            {
                super(0);
            }

            @Override // Ia.a
            public final S invoke() {
                CacheDrawModifierNodeImpl cacheDrawModifierNodeImpl = CacheDrawModifierNodeImpl.this;
                k kVar = cacheDrawModifierNodeImpl.f13367r;
                if (kVar == null) {
                    kVar = new k();
                    cacheDrawModifierNodeImpl.f13367r = kVar;
                }
                if (kVar.f13399b == null) {
                    S graphicsContext = C1185f.g(cacheDrawModifierNodeImpl).getGraphicsContext();
                    kVar.c();
                    kVar.f13399b = graphicsContext;
                }
                return kVar;
            }
        };
    }

    @Override // androidx.compose.ui.node.InterfaceC1191l
    public final void E0() {
        V();
    }

    @Override // androidx.compose.ui.node.InterfaceC1184e
    public final void H0() {
        V();
    }

    @Override // androidx.compose.ui.h.c
    public final void J1() {
        k kVar = this.f13367r;
        if (kVar != null) {
            kVar.c();
        }
    }

    @Override // androidx.compose.ui.draw.b
    public final void V() {
        k kVar = this.f13367r;
        if (kVar != null) {
            kVar.c();
        }
        this.f13366q = false;
        this.f13365p.f13370c = null;
        C1192m.a(this);
    }

    @Override // androidx.compose.ui.node.O
    public final void a1() {
        V();
    }

    @Override // androidx.compose.ui.draw.a
    public final p013b0.c getDensity() {
        return C1185f.f(this).f14423z;
    }

    @Override // androidx.compose.ui.draw.a
    public final LayoutDirection getLayoutDirection() {
        return C1185f.f(this).f14383A;
    }

    @Override // androidx.compose.ui.draw.a
    public final long j() {
        return A.k(C1185f.d(this, 128).f14222d);
    }

    @Override // androidx.compose.ui.node.InterfaceC1184e, androidx.compose.ui.node.Y
    public final void w() {
        V();
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [Ia.l, kotlin.jvm.internal.Lambda] */
    @Override // androidx.compose.ui.node.InterfaceC1191l
    public final void x(C1202x c1202x) {
        boolean z10 = this.f13366q;
        final CacheDrawScope cacheDrawScope = this.f13365p;
        if (!z10) {
            cacheDrawScope.f13370c = null;
            P.a(this, new Ia.a<r>() { // from class: androidx.compose.ui.draw.CacheDrawModifierNodeImpl$getOrBuildCachedDrawBlock$1$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                }

                @Override // Ia.a
                public final r invoke() {
                    this.this$0.f13368s.invoke(cacheDrawScope);
                    return r.f47939a;
                }
            });
            if (cacheDrawScope.f13370c == null) {
                throw v.g("DrawResult not defined, did you forget to call onDraw?");
            }
            this.f13366q = true;
        }
        g gVar = cacheDrawScope.f13370c;
        kotlin.jvm.internal.i.b(gVar);
        gVar.f13393a.invoke(c1202x);
    }
}
