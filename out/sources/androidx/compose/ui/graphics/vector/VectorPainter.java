package androidx.compose.ui.graphics.vector;

import androidx.compose.foundation.C0936h;
import androidx.compose.runtime.C1081d0;
import androidx.compose.runtime.C1085f0;
import androidx.compose.runtime.J0;
import androidx.compose.ui.graphics.I;
import androidx.compose.ui.graphics.painter.Painter;
import androidx.compose.ui.unit.LayoutDirection;
import p293xa.r;

/* JADX INFO: compiled from: VectorPainter.kt */
/* JADX INFO: loaded from: classes.dex */
public final class VectorPainter extends Painter {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final C1085f0 f13853g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final C1085f0 f13854h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final VectorComponent f13855i;
    public final C1081d0 j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public float f13856k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public I f13857l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int f13858m;

    public VectorPainter() {
        this(new GroupComponent());
    }

    @Override // androidx.compose.ui.graphics.painter.Painter
    public final boolean a(float f10) {
        this.f13856k = f10;
        return true;
    }

    @Override // androidx.compose.ui.graphics.painter.Painter
    public final boolean e(I i10) {
        this.f13857l = i10;
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.compose.ui.graphics.painter.Painter
    public final long h() {
        return ((I.h) this.f13853g.getValue()).f3769a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.compose.ui.graphics.painter.Painter
    public final void i(J.e eVar) {
        I i10 = this.f13857l;
        VectorComponent vectorComponent = this.f13855i;
        if (i10 == null) {
            i10 = (I) vectorComponent.f13846g.getValue();
        }
        if (((Boolean) this.f13854h.getValue()).booleanValue() && eVar.getLayoutDirection() == LayoutDirection.f15718c) {
            long jJ1 = eVar.j1();
            J.a.b bVarW0 = eVar.W0();
            long jE = bVarW0.e();
            bVarW0.a().g();
            try {
                bVarW0.f3948a.f(-1.0f, 1.0f, jJ1);
                vectorComponent.e(eVar, this.f13856k, i10);
                C0936h.f(bVarW0, jE);
            } catch (Throwable th) {
                C0936h.f(bVarW0, jE);
                throw th;
            }
        } else {
            vectorComponent.e(eVar, this.f13856k, i10);
        }
        this.f13858m = this.j.o();
    }

    /* JADX WARN: Type inference failed for: r4v1, types: [androidx.compose.ui.graphics.vector.VectorPainter$vector$1$1, kotlin.jvm.internal.Lambda] */
    public VectorPainter(GroupComponent groupComponent) {
        this.f13853g = J0.f(new I.h(0L));
        this.f13854h = J0.f(Boolean.FALSE);
        VectorComponent vectorComponent = new VectorComponent(groupComponent);
        vectorComponent.f13845f = new Ia.a<r>() { // from class: androidx.compose.ui.graphics.vector.VectorPainter$vector$1$1
            {
                super(0);
            }

            @Override // Ia.a
            public final r invoke() {
                VectorPainter vectorPainter = this.this$0;
                if (vectorPainter.f13858m == vectorPainter.j.o()) {
                    VectorPainter vectorPainter2 = this.this$0;
                    vectorPainter2.j.m(vectorPainter2.j.o() + 1);
                }
                return r.f47939a;
            }
        };
        this.f13855i = vectorComponent;
        this.j = new C1081d0(0);
        this.f13856k = 1.0f;
        this.f13858m = -1;
    }
}
