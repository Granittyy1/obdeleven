package androidx.compose.material.ripple;

import androidx.compose.foundation.v;
import androidx.compose.foundation.w;
import androidx.compose.runtime.E;
import androidx.compose.runtime.InterfaceC1084f;
import androidx.compose.runtime.J0;
import androidx.compose.runtime.X;
import androidx.compose.ui.graphics.H;

/* JADX INFO: compiled from: Ripple.kt */
/* JADX INFO: loaded from: classes.dex */
@p293xa.d
public abstract class e implements v {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f11990a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final float f11991b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final X f11992c;

    public e() {
        throw null;
    }

    public e(boolean z10, float f10, X x10) {
        this.f11990a = z10;
        this.f11991b = f10;
        this.f11992c = x10;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.compose.foundation.v
    @p293xa.d
    public final w a(androidx.compose.foundation.interaction.j jVar, InterfaceC1084f interfaceC1084f) {
        long jA;
        interfaceC1084f.L(988743187);
        o oVar = (o) interfaceC1084f.x(RippleThemeKt.f11968a);
        X x10 = this.f11992c;
        if (((H) x10.getValue()).f13506a != 16) {
            interfaceC1084f.L(-303557454);
            interfaceC1084f.D();
            jA = ((H) x10.getValue()).f13506a;
        } else {
            interfaceC1084f.L(-303499670);
            jA = oVar.a(interfaceC1084f);
            interfaceC1084f.D();
        }
        a aVarC = c(jVar, this.f11990a, this.f11991b, J0.i(new H(jA), interfaceC1084f), J0.i(oVar.b(interfaceC1084f), interfaceC1084f), interfaceC1084f, 0);
        boolean zK = interfaceC1084f.K(jVar) | interfaceC1084f.k(aVarC);
        Object objF = interfaceC1084f.f();
        if (zK || objF == InterfaceC1084f.a.f12980a) {
            objF = new Ripple$rememberUpdatedInstance$1$1(jVar, aVarC, null);
            interfaceC1084f.E(objF);
        }
        E.e(aVarC, jVar, (Ia.p) objF, interfaceC1084f);
        interfaceC1084f.D();
        return aVarC;
    }

    public abstract a c(androidx.compose.foundation.interaction.j jVar, boolean z10, float f10, X x10, X x11, InterfaceC1084f interfaceC1084f, int i10);

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        return this.f11990a == eVar.f11990a && p013b0.f.a(this.f11991b, eVar.f11991b) && kotlin.jvm.internal.i.a(this.f11992c, eVar.f11992c);
    }

    public final int hashCode() {
        return this.f11992c.hashCode() + O.a.d(this.f11991b, Boolean.hashCode(this.f11990a) * 31, 31);
    }
}
