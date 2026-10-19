package androidx.compose.ui.graphics.vector;

import androidx.compose.foundation.C0936h;
import kotlin.jvm.internal.Lambda;
import p293xa.r;

/* JADX INFO: compiled from: Vector.kt */
/* JADX INFO: loaded from: classes.dex */
public final class VectorComponent$drawVectorBlock$1 extends Lambda implements Ia.l<J.e, r> {
    final /* synthetic */ VectorComponent this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public VectorComponent$drawVectorBlock$1(VectorComponent vectorComponent) {
        super(1);
        this.this$0 = vectorComponent;
    }

    @Override // Ia.l
    public final r invoke(J.e eVar) {
        J.e eVar2 = eVar;
        VectorComponent vectorComponent = this.this$0;
        GroupComponent groupComponent = vectorComponent.f13841b;
        float f10 = vectorComponent.f13849k;
        float f11 = vectorComponent.f13850l;
        J.a.b bVarW0 = eVar2.W0();
        long jE = bVarW0.e();
        bVarW0.a().g();
        try {
            bVarW0.f3948a.f(f10, f11, 0L);
            groupComponent.a(eVar2);
            return r.f47939a;
        } finally {
            C0936h.f(bVarW0, jE);
        }
    }
}
