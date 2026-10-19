package androidx.compose.material;

import androidx.compose.animation.core.c0;
import androidx.compose.ui.node.C1183d;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: compiled from: Ripple.kt */
/* JADX INFO: loaded from: classes.dex */
final class DelegatingThemeAwareRippleNode$updateConfiguration$1 extends Lambda implements Ia.a<p293xa.r> {
    final /* synthetic */ C1043t this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DelegatingThemeAwareRippleNode$updateConfiguration$1(C1043t c1043t) {
        super(0);
        this.this$0 = c1043t;
    }

    @Override // Ia.a
    public final p293xa.r invoke() {
        if (((J) C1183d.a(this.this$0, RippleKt.f11791a)) == null) {
            C1043t c1043t = this.this$0;
            androidx.compose.material.ripple.b bVar = c1043t.f12026v;
            if (bVar != null) {
                c1043t.R1(bVar);
            }
            c1043t.f12026v = null;
        } else {
            final C1043t c1043t2 = this.this$0;
            if (c1043t2.f12026v == null) {
                C1042s c1042s = new C1042s(c1043t2);
                Ia.a<androidx.compose.material.ripple.f> aVar = new Ia.a<androidx.compose.material.ripple.f>() { // from class: androidx.compose.material.DelegatingThemeAwareRippleNode$attachNewRipple$calculateRippleAlpha$1
                    {
                        super(0);
                    }

                    @Override // Ia.a
                    public final androidx.compose.material.ripple.f invoke() {
                        androidx.compose.material.ripple.f fVar;
                        J j = (J) C1183d.a(c1043t2, RippleKt.f11791a);
                        if (j != null && (fVar = j.f11766b) != null) {
                            return fVar;
                        }
                        long j10 = ((androidx.compose.ui.graphics.H) C1183d.a(c1043t2, ContentColorKt.f11715a)).f13506a;
                        if (((C1034j) C1183d.a(c1043t2, ColorsKt.f11693a)).i()) {
                            return ((double) Q3.d.D(j10)) > 0.5d ? RippleKt.f11794d : RippleKt.f11795e;
                        }
                        return RippleKt.f11796f;
                    }
                };
                c0<Float> c0Var = androidx.compose.material.ripple.n.f12016a;
                androidx.compose.material.ripple.b bVar2 = new androidx.compose.material.ripple.b(c1043t2.f12022r, c1043t2.f12023s, c1043t2.f12024t, c1042s, aVar);
                c1043t2.Q1(bVar2);
                c1043t2.f12026v = bVar2;
            }
        }
        return p293xa.r.f47939a;
    }
}
