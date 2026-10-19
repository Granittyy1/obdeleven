package com.google.accompanist.placeholder;

import I.h;
import Ia.l;
import Ia.q;
import J.e;
import androidx.compose.animation.core.C0907g;
import androidx.compose.animation.core.E;
import androidx.compose.animation.core.G;
import androidx.compose.animation.core.InterfaceC0923x;
import androidx.compose.animation.core.K;
import androidx.compose.animation.core.P;
import androidx.compose.animation.core.Transition;
import androidx.compose.animation.core.TransitionKt;
import androidx.compose.animation.core.VectorConvertersKt;
import androidx.compose.animation.core.e0;
import androidx.compose.runtime.C1085f0;
import androidx.compose.runtime.InterfaceC1084f;
import androidx.compose.runtime.J0;
import androidx.compose.runtime.X;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.draw.f;
import androidx.compose.ui.graphics.C1143t;
import androidx.compose.ui.graphics.b0;
import androidx.compose.ui.graphics.c0;
import androidx.compose.ui.graphics.d0;
import androidx.compose.ui.graphics.h0;
import androidx.compose.ui.graphics.l0;
import androidx.compose.ui.node.Z;
import androidx.compose.ui.platform.InspectableValueKt;
import androidx.compose.ui.unit.LayoutDirection;
import kotlin.jvm.internal.i;
import me.zhanghai.android.materialprogressbar.R;
import p293xa.r;

/* JADX INFO: compiled from: Placeholder.kt */
/* JADX INFO: loaded from: classes.dex */
public final class b {
    public static final b0 a(J.c cVar, l0 l0Var, long j, a aVar, float f10, b0 b0Var, LayoutDirection layoutDirection, h hVar) {
        b0 b0VarMo0createOutlinePq9zytI = null;
        if (l0Var == h0.f13629a) {
            e.s0(cVar, j, 0L, 0L, 0.0f, R.styleable.AppCompatTheme_windowNoTitle);
            if (aVar != null) {
                e.m0(cVar, aVar.c(f10, cVar.j()), 0L, 0L, aVar.b(f10), null, R.styleable.AppCompatTheme_windowActionBarOverlay);
            }
        } else {
            long j10 = cVar.j();
            if (hVar != null && j10 == hVar.f3769a && cVar.getLayoutDirection() == layoutDirection) {
                b0VarMo0createOutlinePq9zytI = b0Var;
            }
            if (b0VarMo0createOutlinePq9zytI == null) {
                b0VarMo0createOutlinePq9zytI = l0Var.mo0createOutlinePq9zytI(cVar.j(), cVar.getLayoutDirection(), cVar);
            }
            c0.c(cVar, b0VarMo0createOutlinePq9zytI, j);
            if (aVar != null) {
                c0.b(cVar, b0VarMo0createOutlinePq9zytI, aVar.c(f10, cVar.j()), aVar.b(f10));
            }
        }
        return b0VarMo0createOutlinePq9zytI;
    }

    public static androidx.compose.ui.h b(androidx.compose.ui.h placeholder, final boolean z10, final long j, final c cVar) {
        final h0.a aVar = h0.f13629a;
        i.e(placeholder, "$this$placeholder");
        final PlaceholderKt$placeholder$1 placeholderFadeTransitionSpec = new q<Transition.b<Boolean>, InterfaceC1084f, Integer, P<Float>>() { // from class: com.google.accompanist.placeholder.PlaceholderKt$placeholder$1
            @Override // Ia.q
            public final P<Float> invoke(Transition.b<Boolean> bVar, InterfaceC1084f interfaceC1084f, Integer num) {
                InterfaceC1084f interfaceC1084f2 = interfaceC1084f;
                num.intValue();
                i.e(bVar, "$this$null");
                interfaceC1084f2.e(87515116);
                P<Float> pC = C0907g.c(0.0f, 0.0f, null, 7);
                interfaceC1084f2.I();
                return pC;
            }
        };
        i.e(placeholderFadeTransitionSpec, "placeholderFadeTransitionSpec");
        final PlaceholderKt$placeholder$2 contentFadeTransitionSpec = new q<Transition.b<Boolean>, InterfaceC1084f, Integer, P<Float>>() { // from class: com.google.accompanist.placeholder.PlaceholderKt$placeholder$2
            @Override // Ia.q
            public final P<Float> invoke(Transition.b<Boolean> bVar, InterfaceC1084f interfaceC1084f, Integer num) {
                InterfaceC1084f interfaceC1084f2 = interfaceC1084f;
                num.intValue();
                i.e(bVar, "$this$null");
                interfaceC1084f2.e(-439090190);
                P<Float> pC = C0907g.c(0.0f, 0.0f, null, 7);
                interfaceC1084f2.I();
                return pC;
            }
        };
        i.e(contentFadeTransitionSpec, "contentFadeTransitionSpec");
        return ComposedModifierKt.a(placeholder, InspectableValueKt.f14929a, new q<androidx.compose.ui.h, InterfaceC1084f, Integer, androidx.compose.ui.h>() { // from class: com.google.accompanist.placeholder.PlaceholderKt$placeholder$4
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(3);
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // Ia.q
            public final androidx.compose.ui.h invoke(androidx.compose.ui.h hVar, InterfaceC1084f interfaceC1084f, Integer num) {
                androidx.compose.ui.h composed = hVar;
                InterfaceC1084f interfaceC1084f2 = interfaceC1084f;
                num.intValue();
                i.e(composed, "$this$composed");
                interfaceC1084f2.e(-1214629560);
                interfaceC1084f2.e(804161266);
                Object objF = interfaceC1084f2.f();
                InterfaceC1084f.a.C0153a c0153a = InterfaceC1084f.a.f12980a;
                if (objF == c0153a) {
                    objF = new Z();
                    interfaceC1084f2.E(objF);
                }
                final Z z11 = (Z) objF;
                interfaceC1084f2.I();
                interfaceC1084f2.e(804161321);
                Object objF2 = interfaceC1084f2.f();
                if (objF2 == c0153a) {
                    objF2 = new Z();
                    interfaceC1084f2.E(objF2);
                }
                final Z z12 = (Z) objF2;
                interfaceC1084f2.I();
                interfaceC1084f2.e(804161379);
                Object objF3 = interfaceC1084f2.f();
                if (objF3 == c0153a) {
                    objF3 = new Z();
                    interfaceC1084f2.E(objF3);
                }
                final Z z13 = (Z) objF3;
                interfaceC1084f2.I();
                interfaceC1084f2.e(804161492);
                Object objF4 = interfaceC1084f2.f();
                if (objF4 == c0153a) {
                    objF4 = J0.f(Float.valueOf(0.0f));
                    interfaceC1084f2.E(objF4);
                }
                final X x10 = (X) objF4;
                interfaceC1084f2.I();
                interfaceC1084f2.e(804161591);
                boolean z14 = z10;
                Object objF5 = interfaceC1084f2.f();
                if (objF5 == c0153a) {
                    objF5 = new K(Boolean.valueOf(z14));
                    interfaceC1084f2.E(objF5);
                }
                K k10 = (K) objF5;
                interfaceC1084f2.I();
                k10.f(Boolean.valueOf(z10));
                Transition transitionE = TransitionKt.e(k10, "placeholder_crossfade", interfaceC1084f2, 48);
                q<Transition.b<Boolean>, InterfaceC1084f, Integer, InterfaceC0923x<Float>> qVar = placeholderFadeTransitionSpec;
                e0 e0Var = VectorConvertersKt.f9477a;
                boolean zBooleanValue = ((Boolean) transitionE.f9429a.a()).booleanValue();
                interfaceC1084f2.e(-2085173843);
                float f10 = zBooleanValue ? 1.0f : 0.0f;
                interfaceC1084f2.I();
                Float fValueOf = Float.valueOf(f10);
                C1085f0 c1085f0 = transitionE.f9432d;
                boolean zBooleanValue2 = ((Boolean) c1085f0.getValue()).booleanValue();
                interfaceC1084f2.e(-2085173843);
                float f11 = zBooleanValue2 ? 1.0f : 0.0f;
                interfaceC1084f2.I();
                final Transition.d dVarD = TransitionKt.d(transitionE, fValueOf, Float.valueOf(f11), qVar.invoke(transitionE.f(), interfaceC1084f2, 0), e0Var, interfaceC1084f2, 196608);
                q<Transition.b<Boolean>, InterfaceC1084f, Integer, InterfaceC0923x<Float>> qVar2 = contentFadeTransitionSpec;
                boolean zBooleanValue3 = ((Boolean) transitionE.f9429a.a()).booleanValue();
                interfaceC1084f2.e(992792551);
                float f12 = zBooleanValue3 ? 0.0f : 1.0f;
                interfaceC1084f2.I();
                Float fValueOf2 = Float.valueOf(f12);
                boolean zBooleanValue4 = ((Boolean) c1085f0.getValue()).booleanValue();
                interfaceC1084f2.e(992792551);
                float f13 = zBooleanValue4 ? 0.0f : 1.0f;
                interfaceC1084f2.I();
                final Transition.d dVarD2 = TransitionKt.d(transitionE, fValueOf2, Float.valueOf(f13), qVar2.invoke(transitionE.f(), interfaceC1084f2, 0), e0Var, interfaceC1084f2, 196608);
                a aVar2 = cVar;
                E<Float> eA = aVar2 != null ? aVar2.a() : null;
                interfaceC1084f2.e(804162378);
                if (eA != null && (z10 || ((Number) dVarD.getValue()).floatValue() >= 0.01f)) {
                    x10.setValue(Float.valueOf(((Number) G.a(G.c(null, interfaceC1084f2, 1), 0.0f, 1.0f, eA, null, interfaceC1084f2, 4536, 8).f9373e.getValue()).floatValue()));
                }
                interfaceC1084f2.I();
                interfaceC1084f2.e(804162715);
                Object objF6 = interfaceC1084f2.f();
                if (objF6 == c0153a) {
                    objF6 = C1143t.a();
                    interfaceC1084f2.E(objF6);
                }
                final d0 d0Var = (d0) objF6;
                interfaceC1084f2.I();
                interfaceC1084f2.e(804162740);
                boolean zI = interfaceC1084f2.i(j) | interfaceC1084f2.K(aVar) | interfaceC1084f2.K(cVar);
                final l0 l0Var = aVar;
                final long j10 = j;
                final a aVar3 = cVar;
                Object objF7 = interfaceC1084f2.f();
                if (zI || objF7 == c0153a) {
                    objF7 = f.c(composed, new l<J.c, r>() { // from class: com.google.accompanist.placeholder.PlaceholderKt$placeholder$4$1$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(1);
                        }

                        /* JADX WARN: Type inference failed for: r0v29, types: [T, androidx.compose.ui.graphics.b0] */
                        /* JADX WARN: Type inference failed for: r0v41, types: [T, androidx.compose.ui.graphics.b0] */
                        /* JADX WARN: Type inference failed for: r15v2, types: [T, androidx.compose.ui.unit.LayoutDirection] */
                        /* JADX WARN: Type inference failed for: r3v1, types: [I.h, T] */
                        @Override // Ia.l
                        public final r invoke(J.c cVar2) {
                            J.c drawWithContent = cVar2;
                            i.e(drawWithContent, "$this$drawWithContent");
                            float fFloatValue = dVarD2.getValue().floatValue();
                            if (0.01f <= fFloatValue && fFloatValue <= 0.99f) {
                                d0Var.b(dVarD2.getValue().floatValue());
                                d0 d0Var2 = d0Var;
                                androidx.compose.ui.graphics.E eA2 = drawWithContent.W0().a();
                                eA2.s(p111ia.c.a(0L, drawWithContent.j()), d0Var2);
                                drawWithContent.A1();
                                eA2.o();
                            } else if (dVarD2.getValue().floatValue() >= 0.99f) {
                                drawWithContent.A1();
                            }
                            float fFloatValue2 = dVarD.getValue().floatValue();
                            if (0.01f <= fFloatValue2 && fFloatValue2 <= 0.99f) {
                                d0Var.b(dVarD.getValue().floatValue());
                                d0 d0Var3 = d0Var;
                                Z<b0> z15 = z13;
                                l0 l0Var2 = l0Var;
                                long j11 = j10;
                                a aVar4 = aVar3;
                                Z<LayoutDirection> z16 = z12;
                                Z<h> z17 = z11;
                                X<Float> x11 = x10;
                                androidx.compose.ui.graphics.E eA3 = drawWithContent.W0().a();
                                eA3.s(p111ia.c.a(0L, drawWithContent.j()), d0Var3);
                                z15.f14575a = b.a(drawWithContent, l0Var2, j11, aVar4, x11.getValue().floatValue(), z15.f14575a, z16.f14575a, z17.f14575a);
                                eA3.o();
                            } else if (dVarD.getValue().floatValue() >= 0.99f) {
                                z13.f14575a = b.a(drawWithContent, l0Var, j10, aVar3, x10.getValue().floatValue(), z13.f14575a, z12.f14575a, z11.f14575a);
                            }
                            z11.f14575a = new h(drawWithContent.j());
                            z12.f14575a = drawWithContent.getLayoutDirection();
                            return r.f47939a;
                        }
                    });
                    interfaceC1084f2.E(objF7);
                }
                androidx.compose.ui.h hVar2 = (androidx.compose.ui.h) objF7;
                interfaceC1084f2.I();
                interfaceC1084f2.I();
                return hVar2;
            }
        });
    }
}
