package androidx.compose.foundation.layout;

import androidx.compose.runtime.C1085f0;
import androidx.compose.runtime.J0;
import androidx.compose.ui.layout.InterfaceC1175v;

/* JADX INFO: compiled from: WindowInsetsPadding.kt */
/* JADX INFO: loaded from: classes.dex */
public final class InsetsPaddingModifier implements InterfaceC1175v, androidx.compose.ui.modifier.d, androidx.compose.ui.modifier.f<a0> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final a0 f10149b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final C1085f0 f10150c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final C1085f0 f10151d;

    public InsetsPaddingModifier(a0 a0Var) {
        this.f10149b = a0Var;
        this.f10150c = J0.f(a0Var);
        this.f10151d = J0.f(a0Var);
    }

    @Override // androidx.compose.ui.layout.InterfaceC1175v
    public final androidx.compose.ui.layout.F B(androidx.compose.ui.layout.H h8, androidx.compose.ui.layout.D d10, long j) {
        C1085f0 c1085f0 = this.f10150c;
        final int iA = ((a0) c1085f0.getValue()).a(h8, h8.getLayoutDirection());
        final int iD = ((a0) c1085f0.getValue()).d(h8);
        int iC = ((a0) c1085f0.getValue()).c(h8, h8.getLayoutDirection()) + iA;
        int iB = ((a0) c1085f0.getValue()).b(h8) + iD;
        final androidx.compose.ui.layout.Y yQ = d10.Q(p013b0.b.i(j, -iC, -iB));
        return h8.y1(p013b0.b.g(yQ.f14220b + iC, j), p013b0.b.f(yQ.f14221c + iB, j), kotlin.collections.y.p(), new Ia.l<androidx.compose.ui.layout.Y.a, p293xa.r>() { // from class: androidx.compose.foundation.layout.InsetsPaddingModifier$measure$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // Ia.l
            public final p293xa.r invoke(androidx.compose.ui.layout.Y.a aVar) {
                aVar.d(yQ, iA, iD, 0.0f);
                return p293xa.r.f47939a;
            }
        });
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof InsetsPaddingModifier) {
            return kotlin.jvm.internal.i.a(((InsetsPaddingModifier) obj).f10149b, this.f10149b);
        }
        return false;
    }

    @Override // androidx.compose.ui.modifier.f
    public final androidx.compose.ui.modifier.h<a0> getKey() {
        return WindowInsetsPaddingKt.f10233a;
    }

    public final int hashCode() {
        return this.f10149b.hashCode();
    }

    @Override // androidx.compose.ui.modifier.f
    public final a0 j() {
        return (a0) this.f10151d.getValue();
    }

    @Override // androidx.compose.ui.modifier.d
    public final void m(androidx.compose.ui.modifier.g gVar) {
        a0 a0Var = (a0) gVar.s(WindowInsetsPaddingKt.f10233a);
        a0 a0Var2 = this.f10149b;
        this.f10150c.setValue(new C0958s(a0Var2, a0Var));
        this.f10151d.setValue(new X(a0Var, a0Var2));
    }
}
