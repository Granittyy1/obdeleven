package androidx.compose.material3;

import androidx.compose.ui.node.C1183d;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: compiled from: Ripple.kt */
/* JADX INFO: loaded from: classes.dex */
final class DelegatingThemeAwareRippleNode$updateConfiguration$1 extends Lambda implements Ia.a<p293xa.r> {
    final /* synthetic */ C1071x this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DelegatingThemeAwareRippleNode$updateConfiguration$1(C1071x c1071x) {
        super(0);
        this.this$0 = c1071x;
    }

    @Override // Ia.a
    public final p293xa.r invoke() {
        if (((V) C1183d.a(this.this$0, RippleKt.f12284b)) == null) {
            C1071x c1071x = this.this$0;
            androidx.compose.material.ripple.b bVar = c1071x.f12767v;
            if (bVar != null) {
                c1071x.R1(bVar);
            }
        } else {
            final C1071x c1071x2 = this.this$0;
            if (c1071x2.f12767v == null) {
                C1070w c1070w = new C1070w(c1071x2);
                Ia.a<androidx.compose.material.ripple.f> aVar = new Ia.a<androidx.compose.material.ripple.f>() { // from class: androidx.compose.material3.DelegatingThemeAwareRippleNode$attachNewRipple$calculateRippleAlpha$1
                    {
                        super(0);
                    }

                    @Override // Ia.a
                    public final androidx.compose.material.ripple.f invoke() {
                        androidx.compose.material.ripple.f fVar;
                        V v10 = (V) C1183d.a(c1071x2, RippleKt.f12284b);
                        return (v10 == null || (fVar = v10.f12412b) == null) ? W.f12413a : fVar;
                    }
                };
                androidx.compose.animation.core.c0<Float> c0Var = androidx.compose.material.ripple.n.f12016a;
                androidx.compose.material.ripple.b bVar2 = new androidx.compose.material.ripple.b(c1071x2.f12763r, c1071x2.f12764s, c1071x2.f12765t, c1070w, aVar);
                c1071x2.Q1(bVar2);
                c1071x2.f12767v = bVar2;
            }
        }
        return p293xa.r.f47939a;
    }
}
