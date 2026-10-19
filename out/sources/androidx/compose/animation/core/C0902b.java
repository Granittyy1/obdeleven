package androidx.compose.animation.core;

import androidx.compose.runtime.InterfaceC1084f;
import androidx.compose.runtime.J0;
import androidx.compose.runtime.N0;

/* JADX INFO: renamed from: androidx.compose.animation.core.b, reason: case insensitive filesystem */
/* JADX INFO: compiled from: AnimateAsState.kt */
/* JADX INFO: loaded from: classes.dex */
public final class C0902b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final P<Float> f9523a = C0907g.c(0.0f, 0.0f, null, 7);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final P<p013b0.f> f9524b;

    static {
        Object obj = s0.f9633a;
        f9524b = C0907g.c(0.0f, 0.0f, new p013b0.f(0.1f), 3);
        Float.floatToRawIntBits(0.5f);
        Float.floatToRawIntBits(0.5f);
        Float.floatToRawIntBits(0.5f);
        Float.floatToRawIntBits(0.5f);
    }

    public static final N0 a(float f10, c0 c0Var, InterfaceC1084f interfaceC1084f, int i10, int i11) {
        InterfaceC0906f interfaceC0906f = c0Var;
        if ((i11 & 2) != 0) {
            interfaceC0906f = f9524b;
        }
        return c(new p013b0.f(f10), VectorConvertersKt.f9479c, interfaceC0906f, null, "DpAnimation", null, interfaceC1084f, (i10 << 3) & 896, 8);
    }

    public static final N0 b(float f10, InterfaceC0923x interfaceC0923x, InterfaceC1084f interfaceC1084f, int i10) {
        if (interfaceC0923x == f9523a) {
            interfaceC1084f.L(1125558999);
            boolean zG = interfaceC1084f.g(0.01f);
            Object objF = interfaceC1084f.f();
            if (zG || objF == InterfaceC1084f.a.f12980a) {
                objF = C0907g.c(0.0f, 0.0f, Float.valueOf(0.01f), 3);
                interfaceC1084f.E(objF);
            }
            interfaceC0923x = (P) objF;
            interfaceC1084f.D();
        } else {
            interfaceC1084f.L(1125668925);
            interfaceC1084f.D();
        }
        return c(Float.valueOf(f10), VectorConvertersKt.f9477a, interfaceC0923x, Float.valueOf(0.01f), "FloatAnimation", null, interfaceC1084f, 0, 0);
    }

    public static final N0 c(final Object obj, d0 d0Var, InterfaceC0906f interfaceC0906f, Float f10, String str, Ia.l lVar, InterfaceC1084f interfaceC1084f, int i10, int i11) {
        InterfaceC0906f p10 = interfaceC0906f;
        Object obj2 = InterfaceC1084f.a.f12980a;
        Float f11 = (i11 & 8) != 0 ? null : f10;
        Object objF = interfaceC1084f.f();
        if (objF == obj2) {
            objF = J0.f(null);
            interfaceC1084f.E(objF);
        }
        androidx.compose.runtime.X x10 = (androidx.compose.runtime.X) objF;
        Object objF2 = interfaceC1084f.f();
        if (objF2 == obj2) {
            objF2 = new Animatable(obj, d0Var, f11);
            interfaceC1084f.E(objF2);
        }
        Animatable animatable = (Animatable) objF2;
        androidx.compose.runtime.X xI = J0.i(lVar, interfaceC1084f);
        if (f11 != null && (p10 instanceof P)) {
            P p11 = (P) p10;
            if (!kotlin.jvm.internal.i.a(p11.f9395c, f11)) {
                p10 = new P(p11.f9393a, p11.f9394b, f11);
            }
        }
        androidx.compose.runtime.X xI2 = J0.i(p10, interfaceC1084f);
        Object objF3 = interfaceC1084f.f();
        if (objF3 == obj2) {
            objF3 = kotlinx.coroutines.channels.g.a(-1, 6, null);
            interfaceC1084f.E(objF3);
        }
        final kotlinx.coroutines.channels.d dVar = (kotlinx.coroutines.channels.d) objF3;
        boolean zK = interfaceC1084f.k(dVar) | ((((i10 & 14) ^ 6) > 4 && interfaceC1084f.k(obj)) || (i10 & 6) == 4);
        Object objF4 = interfaceC1084f.f();
        if (zK || objF4 == obj2) {
            objF4 = new Ia.a<p293xa.r>() { // from class: androidx.compose.animation.core.AnimateAsStateKt$animateValueAsState$2$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                }

                @Override // Ia.a
                public final p293xa.r invoke() {
                    dVar.n(obj);
                    return p293xa.r.f47939a;
                }
            };
            interfaceC1084f.E(objF4);
        }
        androidx.compose.runtime.B b10 = androidx.compose.runtime.E.f12831a;
        interfaceC1084f.l((Ia.a) objF4);
        boolean zK2 = interfaceC1084f.k(dVar) | interfaceC1084f.k(animatable) | interfaceC1084f.K(xI2) | interfaceC1084f.K(xI);
        Object objF5 = interfaceC1084f.f();
        if (zK2 || objF5 == obj2) {
            objF5 = new AnimateAsStateKt$animateValueAsState$3$1(dVar, animatable, xI2, xI, null);
            interfaceC1084f.E(objF5);
        }
        androidx.compose.runtime.E.d((Ia.p) objF5, interfaceC1084f, dVar);
        N0 n10 = (N0) x10.getValue();
        return n10 == null ? animatable.f9338c : n10;
    }
}
