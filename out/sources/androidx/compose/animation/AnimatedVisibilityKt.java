package androidx.compose.animation;

import androidx.compose.animation.core.C0907g;
import androidx.compose.animation.core.InterfaceC0923x;
import androidx.compose.animation.core.K;
import androidx.compose.animation.core.Transition;
import androidx.compose.animation.core.TransitionKt;
import androidx.compose.animation.core.VectorConvertersKt;
import androidx.compose.animation.core.b0;
import androidx.compose.animation.core.e0;
import androidx.compose.foundation.layout.InterfaceC0954n;
import androidx.compose.runtime.C1085f0;
import androidx.compose.runtime.C1086g;
import androidx.compose.runtime.C1105p0;
import androidx.compose.runtime.InterfaceC1084f;
import androidx.compose.runtime.InterfaceC1089h0;
import androidx.compose.runtime.J0;
import androidx.compose.runtime.N0;
import androidx.compose.runtime.R0;
import androidx.compose.runtime.X;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.graphics.T;
import androidx.compose.ui.graphics.U;
import androidx.compose.ui.graphics.q0;
import androidx.compose.ui.layout.C1177x;
import androidx.compose.ui.layout.H;
import androidx.compose.ui.layout.Y;
import androidx.compose.ui.node.ComposeUiNode;
import kotlin.NoWhenBranchMatchedException;
import me.zhanghai.android.materialprogressbar.R;

/* JADX INFO: compiled from: AnimatedVisibility.kt */
/* JADX INFO: loaded from: classes.dex */
public final class AnimatedVisibilityKt {
    /* JADX WARN: Multi-variable type inference failed */
    public static final void a(final Transition transition, final Ia.l lVar, final androidx.compose.ui.h hVar, final m mVar, final o oVar, final Ia.p pVar, final Ia.q qVar, InterfaceC1084f interfaceC1084f, final int i10, final int i11) {
        int i12;
        boolean z10;
        Transition.a aVar;
        Transition.a aVarC;
        boolean z11;
        Transition.a aVar2;
        Transition.a aVar3;
        i iVar;
        Transition.a aVar4;
        Transition.a aVar5;
        Transition.a aVarC2;
        boolean z12;
        C1086g c1086gP = interfaceC1084f.p(-891967166);
        if ((i11 & 1) != 0) {
            i12 = i10 | 6;
        } else if ((i10 & 6) == 0) {
            i12 = (c1086gP.K(transition) ? 4 : 2) | i10;
        } else {
            i12 = i10;
        }
        if ((2 & i11) != 0) {
            i12 |= 48;
        } else if ((i10 & 48) == 0) {
            i12 |= c1086gP.k(lVar) ? 32 : 16;
        }
        if ((i11 & 4) != 0) {
            i12 |= 384;
        } else if ((i10 & 384) == 0) {
            i12 |= c1086gP.K(hVar) ? 256 : 128;
        }
        if ((i11 & 8) != 0) {
            i12 |= 3072;
        } else if ((i10 & 3072) == 0) {
            i12 |= c1086gP.K(mVar) ? 2048 : 1024;
        }
        if ((16 & i11) != 0) {
            i12 |= 24576;
        } else if ((i10 & 24576) == 0) {
            i12 |= c1086gP.K(oVar) ? 16384 : 8192;
        }
        if ((i11 & 32) != 0) {
            i12 |= 196608;
        } else if ((i10 & 196608) == 0) {
            i12 |= c1086gP.k(pVar) ? 131072 : 65536;
        }
        if ((i11 & 64) != 0) {
            i12 |= 1572864;
        } else if ((i10 & 1572864) == 0) {
            i12 |= (2097152 & i10) == 0 ? c1086gP.K(null) : c1086gP.k(null) ? 1048576 : 524288;
        }
        if ((128 & i11) != 0) {
            i12 |= 12582912;
        } else if ((i10 & 12582912) == 0) {
            i12 |= c1086gP.k(qVar) ? 8388608 : 4194304;
        }
        int i13 = i12;
        if (c1086gP.C(i13 & 1, (4793491 & i13) != 4793490)) {
            boolean zBooleanValue = ((Boolean) lVar.invoke(transition.f9432d.getValue())).booleanValue();
            b0<S> b0Var = transition.f9429a;
            if (zBooleanValue || ((Boolean) lVar.invoke(b0Var.a())).booleanValue() || transition.g() || transition.d()) {
                c1086gP.L(1788522886);
                int i14 = i13 & 14;
                int i15 = i14 | 48;
                int i16 = i15 & 14;
                boolean z13 = ((i16 ^ 6) > 4 && c1086gP.K(transition)) || (i15 & 6) == 4;
                Object objF = c1086gP.f();
                InterfaceC1084f.a.C0153a c0153a = InterfaceC1084f.a.f12980a;
                if (z13 || objF == c0153a) {
                    objF = b0Var.a();
                    c1086gP.E(objF);
                }
                if (transition.g()) {
                    objF = b0Var.a();
                }
                c1086gP.L(-466616829);
                EnterExitState enterExitStateG = g(transition, lVar, objF, c1086gP);
                c1086gP.T(false);
                T value = transition.f9432d.getValue();
                c1086gP.L(-466616829);
                EnterExitState enterExitStateG2 = g(transition, lVar, value, c1086gP);
                c1086gP.T(false);
                final Transition transitionB = TransitionKt.b(transition, enterExitStateG, enterExitStateG2, c1086gP, i16 | 3072);
                X xI = J0.i(pVar, c1086gP);
                Object objA = transitionB.f9429a.a();
                C1085f0 c1085f0 = transitionB.f9432d;
                Object objInvoke = pVar.invoke(objA, c1085f0.getValue());
                boolean zK = c1086gP.K(transitionB) | c1086gP.K(xI);
                Object objF2 = c1086gP.f();
                if (zK || objF2 == c0153a) {
                    objF2 = new AnimatedVisibilityKt$AnimatedEnterExitImpl$shouldDisposeAfterExit$2$1(transitionB, xI, null);
                    c1086gP.E(objF2);
                }
                X xG = J0.g((Ia.p) objF2, c1086gP, objInvoke);
                b0<S> b0Var2 = transitionB.f9429a;
                Object objA2 = b0Var2.a();
                EnterExitState enterExitState = EnterExitState.f9278d;
                if ((objA2 == enterExitState && c1085f0.getValue() == enterExitState) && ((Boolean) xG.getValue()).booleanValue()) {
                    c1086gP.L(1790688794);
                    c1086gP.T(false);
                    z12 = false;
                } else {
                    c1086gP.L(1789551931);
                    boolean z14 = i14 == 4;
                    Object objF3 = c1086gP.f();
                    if (z14 || objF3 == c0153a) {
                        objF3 = new g();
                        c1086gP.E(objF3);
                    }
                    g gVar = (g) objF3;
                    e0 e0Var = EnterExitTransitionKt.f9288a;
                    final EnterExitTransitionKt$createModifier$1 enterExitTransitionKt$createModifier$1 = new Ia.a<Boolean>() { // from class: androidx.compose.animation.EnterExitTransitionKt$createModifier$1
                        @Override // Ia.a
                        public final /* bridge */ /* synthetic */ Boolean invoke() {
                            return Boolean.TRUE;
                        }
                    };
                    boolean zK2 = c1086gP.K(transitionB);
                    Object objF4 = c1086gP.f();
                    if (zK2 || objF4 == c0153a) {
                        objF4 = J0.f(mVar);
                        c1086gP.E(objF4);
                    }
                    X x10 = (X) objF4;
                    if (b0Var2.a() == c1085f0.getValue() && b0Var2.a() == EnterExitState.f9277c) {
                        if (transitionB.g()) {
                            x10.setValue(mVar);
                        } else {
                            x10.setValue(m.f9657a);
                        }
                    } else if (c1085f0.getValue() == EnterExitState.f9277c) {
                        x10.setValue(((m) x10.getValue()).b(mVar));
                    }
                    final m mVar2 = (m) x10.getValue();
                    boolean zK3 = c1086gP.K(transitionB);
                    Object objF5 = c1086gP.f();
                    if (zK3 || objF5 == c0153a) {
                        objF5 = J0.f(oVar);
                        c1086gP.E(objF5);
                    }
                    X x11 = (X) objF5;
                    if (b0Var2.a() == c1085f0.getValue() && b0Var2.a() == EnterExitState.f9277c) {
                        if (transitionB.g()) {
                            x11.setValue(oVar);
                        } else {
                            x11.setValue(o.f9659a);
                        }
                    } else if (c1085f0.getValue() != EnterExitState.f9277c) {
                        x11.setValue(((o) x11.getValue()).b(oVar));
                    }
                    final o oVar2 = (o) x11.getValue();
                    boolean z15 = (mVar2.a().f9271b == null && oVar2.a().f9271b == null) ? false : true;
                    boolean z16 = (mVar2.a().f9272c == null && oVar2.a().f9272c == null) ? false : true;
                    if (z15) {
                        c1086gP.L(-821159459);
                        e0 e0Var2 = VectorConvertersKt.f9483g;
                        Object objF6 = c1086gP.f();
                        if (objF6 == c0153a) {
                            objF6 = "Built-in slide";
                            c1086gP.E("Built-in slide");
                        }
                        aVar = null;
                        aVarC = TransitionKt.c(transitionB, e0Var2, (String) objF6, c1086gP, 384, 0);
                        z10 = false;
                        c1086gP.T(false);
                    } else {
                        z10 = false;
                        aVar = null;
                        c1086gP.L(-821053656);
                        c1086gP.T(false);
                        aVarC = null;
                    }
                    if (z16) {
                        c1086gP.L(-820961865);
                        e0 e0Var3 = VectorConvertersKt.f9484h;
                        Object objF7 = c1086gP.f();
                        if (objF7 == c0153a) {
                            objF7 = "Built-in shrink/expand";
                            c1086gP.E("Built-in shrink/expand");
                        }
                        z11 = z10;
                        Transition.a aVarC3 = TransitionKt.c(transitionB, e0Var3, (String) objF7, c1086gP, 384, 0);
                        c1086gP.T(z11);
                        aVar2 = aVarC3;
                    } else {
                        z11 = z10;
                        c1086gP.L(-820851041);
                        c1086gP.T(z11);
                        aVar2 = aVar;
                    }
                    if (z16) {
                        c1086gP.L(-820777446);
                        e0 e0Var4 = VectorConvertersKt.f9483g;
                        Object objF8 = c1086gP.f();
                        if (objF8 == c0153a) {
                            objF8 = "Built-in InterruptionHandlingOffset";
                            c1086gP.E("Built-in InterruptionHandlingOffset");
                        }
                        Transition.a aVarC4 = TransitionKt.c(transitionB, e0Var4, (String) objF8, c1086gP, 384, 0);
                        c1086gP.T(z11);
                        aVar3 = aVarC4;
                    } else {
                        c1086gP.L(-820608001);
                        c1086gP.T(z11);
                        aVar3 = aVar;
                    }
                    i iVar2 = mVar2.a().f9272c;
                    final boolean z17 = ((iVar2 == null || iVar2.f9645d) && ((iVar = oVar2.a().f9272c) == null || iVar.f9645d) && z16) ? z11 : true;
                    boolean z18 = (mVar2.a().f9270a == null && oVar2.a().f9270a == null) ? z11 : true;
                    boolean z19 = (mVar2.a().f9273d == null && oVar2.a().f9273d == null) ? z11 : true;
                    if (z18) {
                        c1086gP.L(-675026101);
                        e0 e0Var5 = VectorConvertersKt.f9477a;
                        Object objF9 = c1086gP.f();
                        if (objF9 == c0153a) {
                            objF9 = "Built-in alpha";
                            c1086gP.E("Built-in alpha");
                        }
                        Transition.a aVarC5 = TransitionKt.c(transitionB, e0Var5, (String) objF9, c1086gP, 384, 0);
                        c1086gP.T(z11);
                        aVar4 = aVarC5;
                    } else {
                        c1086gP.L(-674857617);
                        c1086gP.T(z11);
                        aVar4 = aVar;
                    }
                    if (z19) {
                        c1086gP.L(-674790005);
                        e0 e0Var6 = VectorConvertersKt.f9477a;
                        Object objF10 = c1086gP.f();
                        if (objF10 == c0153a) {
                            objF10 = "Built-in scale";
                            c1086gP.E("Built-in scale");
                        }
                        Transition.a aVarC6 = TransitionKt.c(transitionB, e0Var6, (String) objF10, c1086gP, 384, 0);
                        c1086gP.T(z11);
                        aVar5 = aVarC6;
                    } else {
                        c1086gP.L(-674621521);
                        c1086gP.T(z11);
                        aVar5 = aVar;
                    }
                    if (z19) {
                        c1086gP.L(-674543896);
                        aVarC2 = TransitionKt.c(transitionB, EnterExitTransitionKt.f9288a, "TransformOriginInterruptionHandling", c1086gP, 384, 0);
                        c1086gP.T(z11);
                    } else {
                        c1086gP.L(-674372529);
                        c1086gP.T(z11);
                        aVarC2 = aVar;
                    }
                    final Transition.a aVar6 = aVar4;
                    final Transition.a aVar7 = aVar5;
                    boolean zK4 = c1086gP.k(aVar6) | c1086gP.K(mVar2) | c1086gP.K(oVar2) | c1086gP.k(aVar7) | c1086gP.K(transitionB) | c1086gP.k(aVarC2);
                    Object objF11 = c1086gP.f();
                    if (zK4 || objF11 == c0153a) {
                        final Transition.a aVar8 = aVarC2;
                        objF11 = new t() { // from class: androidx.compose.animation.l
                            /* JADX WARN: Code duplicated, block: B:18:0x0059  */
                            @Override // androidx.compose.animation.t
                            public final Ia.l a() {
                                final q0 q0Var;
                                final m mVar3 = mVar2;
                                Transition.a aVar9 = aVar6;
                                final o oVar3 = oVar2;
                                final Transition.a.C0121a c0121aA = null;
                                final Transition.a.C0121a c0121aA2 = aVar9 != null ? aVar9.a(new Ia.l<Transition.b<EnterExitState>, InterfaceC0923x<Float>>() { // from class: androidx.compose.animation.EnterExitTransitionKt$createGraphicsLayerBlock$1$1$alpha$1
                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                    {
                                        super(1);
                                    }

                                    @Override // Ia.l
                                    public final InterfaceC0923x<Float> invoke(Transition.b<EnterExitState> bVar) {
                                        InterfaceC0923x<Float> interfaceC0923x;
                                        InterfaceC0923x<Float> interfaceC0923x2;
                                        Transition.b<EnterExitState> bVar2 = bVar;
                                        EnterExitState enterExitState2 = EnterExitState.f9276b;
                                        EnterExitState enterExitState3 = EnterExitState.f9277c;
                                        if (bVar2.d(enterExitState2, enterExitState3)) {
                                            q qVar2 = mVar3.a().f9270a;
                                            return (qVar2 == null || (interfaceC0923x2 = qVar2.f9663b) == null) ? EnterExitTransitionKt.f9289b : interfaceC0923x2;
                                        }
                                        if (!bVar2.d(enterExitState3, EnterExitState.f9278d)) {
                                            return EnterExitTransitionKt.f9289b;
                                        }
                                        q qVar3 = oVar3.a().f9270a;
                                        return (qVar3 == null || (interfaceC0923x = qVar3.f9663b) == null) ? EnterExitTransitionKt.f9289b : interfaceC0923x;
                                    }
                                }, new Ia.l<EnterExitState, Float>() { // from class: androidx.compose.animation.EnterExitTransitionKt$createGraphicsLayerBlock$1$1$alpha$2
                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                    {
                                        super(1);
                                    }

                                    @Override // Ia.l
                                    public final Float invoke(EnterExitState enterExitState2) {
                                        int iOrdinal = enterExitState2.ordinal();
                                        float f10 = 1.0f;
                                        if (iOrdinal == 0) {
                                            q qVar2 = mVar3.a().f9270a;
                                            if (qVar2 != null) {
                                                f10 = qVar2.f9662a;
                                            }
                                        } else if (iOrdinal != 1) {
                                            if (iOrdinal != 2) {
                                                throw new NoWhenBranchMatchedException();
                                            }
                                            q qVar3 = oVar3.a().f9270a;
                                            if (qVar3 != null) {
                                                f10 = qVar3.f9662a;
                                            }
                                        }
                                        return Float.valueOf(f10);
                                    }
                                }) : null;
                                Transition.a aVar10 = aVar7;
                                final Transition.a.C0121a c0121aA3 = aVar10 != null ? aVar10.a(new Ia.l<Transition.b<EnterExitState>, InterfaceC0923x<Float>>() { // from class: androidx.compose.animation.EnterExitTransitionKt$createGraphicsLayerBlock$1$1$scale$1
                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                    {
                                        super(1);
                                    }

                                    @Override // Ia.l
                                    public final InterfaceC0923x<Float> invoke(Transition.b<EnterExitState> bVar) {
                                        InterfaceC0923x<Float> interfaceC0923x;
                                        InterfaceC0923x<Float> interfaceC0923x2;
                                        Transition.b<EnterExitState> bVar2 = bVar;
                                        EnterExitState enterExitState2 = EnterExitState.f9276b;
                                        EnterExitState enterExitState3 = EnterExitState.f9277c;
                                        if (bVar2.d(enterExitState2, enterExitState3)) {
                                            w wVar = mVar3.a().f9273d;
                                            return (wVar == null || (interfaceC0923x2 = wVar.f9673c) == null) ? EnterExitTransitionKt.f9289b : interfaceC0923x2;
                                        }
                                        if (!bVar2.d(enterExitState3, EnterExitState.f9278d)) {
                                            return EnterExitTransitionKt.f9289b;
                                        }
                                        w wVar2 = oVar3.a().f9273d;
                                        return (wVar2 == null || (interfaceC0923x = wVar2.f9673c) == null) ? EnterExitTransitionKt.f9289b : interfaceC0923x;
                                    }
                                }, new Ia.l<EnterExitState, Float>() { // from class: androidx.compose.animation.EnterExitTransitionKt$createGraphicsLayerBlock$1$1$scale$2
                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                    {
                                        super(1);
                                    }

                                    @Override // Ia.l
                                    public final Float invoke(EnterExitState enterExitState2) {
                                        int iOrdinal = enterExitState2.ordinal();
                                        float f10 = 1.0f;
                                        if (iOrdinal == 0) {
                                            w wVar = mVar3.a().f9273d;
                                            if (wVar != null) {
                                                f10 = wVar.f9671a;
                                            }
                                        } else if (iOrdinal != 1) {
                                            if (iOrdinal != 2) {
                                                throw new NoWhenBranchMatchedException();
                                            }
                                            w wVar2 = oVar3.a().f9273d;
                                            if (wVar2 != null) {
                                                f10 = wVar2.f9671a;
                                            }
                                        }
                                        return Float.valueOf(f10);
                                    }
                                }) : null;
                                if (transitionB.f9429a.a() == EnterExitState.f9276b) {
                                    w wVar = mVar3.a().f9273d;
                                    if (wVar != null) {
                                        q0Var = new q0(wVar.f9672b);
                                    } else {
                                        w wVar2 = oVar3.a().f9273d;
                                        if (wVar2 != null) {
                                            q0Var = new q0(wVar2.f9672b);
                                        } else {
                                            q0Var = null;
                                        }
                                    }
                                } else {
                                    w wVar3 = oVar3.a().f9273d;
                                    if (wVar3 != null) {
                                        q0Var = new q0(wVar3.f9672b);
                                    } else {
                                        w wVar4 = mVar3.a().f9273d;
                                        if (wVar4 != null) {
                                            q0Var = new q0(wVar4.f9672b);
                                        } else {
                                            q0Var = null;
                                        }
                                    }
                                }
                                Transition.a aVar11 = aVar8;
                                if (aVar11 != null) {
                                    c0121aA = aVar11.a(new Ia.l<Transition.b<EnterExitState>, InterfaceC0923x<q0>>() { // from class: androidx.compose.animation.EnterExitTransitionKt$createGraphicsLayerBlock$1$1$transformOrigin$1
                                        @Override // Ia.l
                                        public final InterfaceC0923x<q0> invoke(Transition.b<EnterExitState> bVar) {
                                            return C0907g.c(0.0f, 0.0f, null, 7);
                                        }
                                    }, new Ia.l<EnterExitState, q0>() { // from class: androidx.compose.animation.EnterExitTransitionKt$createGraphicsLayerBlock$1$1$transformOrigin$2
                                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                        {
                                            super(1);
                                        }

                                        @Override // Ia.l
                                        public final q0 invoke(EnterExitState enterExitState2) {
                                            int iOrdinal = enterExitState2.ordinal();
                                            q0 q0Var2 = null;
                                            if (iOrdinal == 0) {
                                                w wVar5 = mVar3.a().f9273d;
                                                if (wVar5 != null) {
                                                    q0Var2 = new q0(wVar5.f9672b);
                                                } else {
                                                    w wVar6 = oVar3.a().f9273d;
                                                    if (wVar6 != null) {
                                                        q0Var2 = new q0(wVar6.f9672b);
                                                    }
                                                }
                                            } else if (iOrdinal == 1) {
                                                q0Var2 = q0Var;
                                            } else {
                                                if (iOrdinal != 2) {
                                                    throw new NoWhenBranchMatchedException();
                                                }
                                                w wVar7 = oVar3.a().f9273d;
                                                if (wVar7 != null) {
                                                    q0Var2 = new q0(wVar7.f9672b);
                                                } else {
                                                    w wVar8 = mVar3.a().f9273d;
                                                    if (wVar8 != null) {
                                                        q0Var2 = new q0(wVar8.f9672b);
                                                    }
                                                }
                                            }
                                            return new q0(q0Var2 != null ? q0Var2.f13793a : q0.f13791b);
                                        }
                                    });
                                }
                                return new Ia.l<U, p293xa.r>() { // from class: androidx.compose.animation.EnterExitTransitionKt$createGraphicsLayerBlock$1$1$block$1
                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                    {
                                        super(1);
                                    }

                                    @Override // Ia.l
                                    public final p293xa.r invoke(U u10) {
                                        U u11 = u10;
                                        N0<Float> n10 = c0121aA2;
                                        u11.b(n10 != null ? n10.getValue().floatValue() : 1.0f);
                                        N0<Float> n11 = c0121aA3;
                                        u11.i(n11 != null ? n11.getValue().floatValue() : 1.0f);
                                        N0<Float> n12 = c0121aA3;
                                        u11.h(n12 != null ? n12.getValue().floatValue() : 1.0f);
                                        N0<q0> n13 = c0121aA;
                                        u11.f1(n13 != null ? n13.getValue().f13793a : q0.f13791b);
                                        return p293xa.r.f47939a;
                                    }
                                };
                            }
                        };
                        c1086gP.E(objF11);
                    }
                    t tVar = (t) objF11;
                    androidx.compose.ui.h.a aVar9 = androidx.compose.ui.h.a.f13984b;
                    boolean zC = c1086gP.c(z17) | c1086gP.K(enterExitTransitionKt$createModifier$1);
                    Object objF12 = c1086gP.f();
                    if (zC || objF12 == c0153a) {
                        objF12 = new Ia.l<U, p293xa.r>() { // from class: androidx.compose.animation.EnterExitTransitionKt$createModifier$2$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(1);
                            }

                            @Override // Ia.l
                            public final p293xa.r invoke(U u10) {
                                u10.z(!z17 && enterExitTransitionKt$createModifier$1.invoke().booleanValue());
                                return p293xa.r.f47939a;
                            }
                        };
                        c1086gP.E(objF12);
                    }
                    androidx.compose.ui.h hVarI = T.a(aVar9, (Ia.l) objF12).i(new EnterExitTransitionElement(transitionB, aVar2, aVar3, aVarC, mVar2, oVar2, enterExitTransitionKt$createModifier$1, tVar));
                    c1086gP.L(1581779440);
                    c1086gP.T(false);
                    androidx.compose.ui.h hVarI2 = hVar.i(hVarI.i(aVar9));
                    Object objF13 = c1086gP.f();
                    if (objF13 == c0153a) {
                        objF13 = new AnimatedEnterExitMeasurePolicy(gVar);
                        c1086gP.E(objF13);
                    }
                    AnimatedEnterExitMeasurePolicy animatedEnterExitMeasurePolicy = (AnimatedEnterExitMeasurePolicy) objF13;
                    int i17 = c1086gP.f12996P;
                    InterfaceC1089h0 interfaceC1089h0P = c1086gP.P();
                    androidx.compose.ui.h hVarC = ComposedModifierKt.c(c1086gP, hVarI2);
                    ComposeUiNode.f14331c0.getClass();
                    Ia.a<ComposeUiNode> aVar10 = ComposeUiNode.Companion.f14333b;
                    c1086gP.r();
                    if (c1086gP.f12995O) {
                        c1086gP.v(aVar10);
                    } else {
                        c1086gP.A();
                    }
                    R0.a(ComposeUiNode.Companion.f14337f, c1086gP, animatedEnterExitMeasurePolicy);
                    R0.a(ComposeUiNode.Companion.f14336e, c1086gP, interfaceC1089h0P);
                    Ia.p<ComposeUiNode, Integer, p293xa.r> pVar2 = ComposeUiNode.Companion.f14338g;
                    if (c1086gP.f12995O || !kotlin.jvm.internal.i.a(c1086gP.f(), Integer.valueOf(i17))) {
                        J4.i.d(i17, c1086gP, i17, pVar2);
                    }
                    R0.a(ComposeUiNode.Companion.f14335d, c1086gP, hVarC);
                    qVar.invoke(gVar, c1086gP, Integer.valueOf((i13 >> 18) & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle));
                    c1086gP.T(true);
                    z12 = false;
                    c1086gP.T(false);
                }
                c1086gP.T(z12);
            } else {
                c1086gP.L(1790694746);
                c1086gP.T(false);
            }
        } else {
            c1086gP.w();
        }
        C1105p0 c1105p0V = c1086gP.V();
        if (c1105p0V != null) {
            c1105p0V.f13109d = new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.animation.AnimatedVisibilityKt$AnimatedEnterExitImpl$4
                final /* synthetic */ v $onLookaheadMeasured;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // Ia.p
                public final p293xa.r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                    num.intValue();
                    AnimatedVisibilityKt.a(transition, lVar, hVar, mVar, oVar, pVar, qVar, interfaceC1084f2, L4.b.l(i10 | 1), i11);
                    return p293xa.r.f47939a;
                }
            };
        }
    }

    /* JADX WARN: Code duplicated, block: B:29:0x004c  */
    /* JADX WARN: Code duplicated, block: B:31:0x0051  */
    /* JADX WARN: Code duplicated, block: B:33:0x0055  */
    /* JADX WARN: Code duplicated, block: B:35:0x005d  */
    /* JADX WARN: Code duplicated, block: B:36:0x0060  */
    /* JADX WARN: Code duplicated, block: B:40:0x0067  */
    /* JADX WARN: Code duplicated, block: B:42:0x006c  */
    /* JADX WARN: Code duplicated, block: B:44:0x0070  */
    /* JADX WARN: Code duplicated, block: B:46:0x0078  */
    /* JADX WARN: Code duplicated, block: B:47:0x007b  */
    /* JADX WARN: Code duplicated, block: B:51:0x0082  */
    /* JADX WARN: Code duplicated, block: B:53:0x0087  */
    /* JADX WARN: Code duplicated, block: B:55:0x008b  */
    /* JADX WARN: Code duplicated, block: B:57:0x0093  */
    /* JADX WARN: Code duplicated, block: B:58:0x0096  */
    /* JADX WARN: Code duplicated, block: B:62:0x009f  */
    /* JADX WARN: Code duplicated, block: B:63:0x00a3  */
    /* JADX WARN: Code duplicated, block: B:65:0x00a9  */
    /* JADX WARN: Code duplicated, block: B:67:0x00af  */
    /* JADX WARN: Code duplicated, block: B:68:0x00b2  */
    /* JADX WARN: Code duplicated, block: B:72:0x00be  */
    /* JADX WARN: Code duplicated, block: B:73:0x00c0  */
    /* JADX WARN: Code duplicated, block: B:76:0x00c9 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:77:0x00cb  */
    /* JADX WARN: Code duplicated, block: B:78:0x00ce  */
    /* JADX WARN: Code duplicated, block: B:81:0x00d5  */
    /* JADX WARN: Code duplicated, block: B:82:0x00e3  */
    /* JADX WARN: Code duplicated, block: B:84:0x00e6  */
    /* JADX WARN: Code duplicated, block: B:85:0x00f3  */
    /* JADX WARN: Code duplicated, block: B:87:0x00f6  */
    /* JADX WARN: Code duplicated, block: B:88:0x00f9  */
    /* JADX WARN: Code duplicated, block: B:90:0x0127  */
    /* JADX WARN: Code duplicated, block: B:93:0x0134  */
    /* JADX WARN: Code duplicated, block: B:95:? A[RETURN, SYNTHETIC] */
    public static final void b(final K<Boolean> k10, androidx.compose.ui.h hVar, m mVar, o oVar, String str, final Ia.q<? super InterfaceC0928f, ? super InterfaceC1084f, ? super Integer, p293xa.r> qVar, InterfaceC1084f interfaceC1084f, final int i10, final int i11) {
        int i12;
        androidx.compose.ui.h hVar2;
        int i13;
        m mVar2;
        int i14;
        int i15;
        o oVar2;
        int i16;
        int i17;
        String str2;
        int i18;
        int i19;
        boolean z10;
        final androidx.compose.ui.h hVar3;
        final m mVar3;
        final o oVarB;
        final String str3;
        C1105p0 c1105p0V;
        androidx.compose.ui.h hVar4;
        m mVarB;
        String str4;
        C1086g c1086gP = interfaceC1084f.p(-222898426);
        if ((i11 & 1) != 0) {
            i12 = i10 | 6;
        } else if ((i10 & 6) == 0) {
            i12 = ((i10 & 8) == 0 ? c1086gP.K(k10) : c1086gP.k(k10) ? 4 : 2) | i10;
        } else {
            i12 = i10;
        }
        int i20 = i11 & 2;
        if (i20 == 0) {
            if ((i10 & 48) == 0) {
                hVar2 = hVar;
                i12 |= c1086gP.K(hVar2) ? 32 : 16;
            }
            i13 = i11 & 4;
            if (i13 != 0) {
                if ((i10 & 384) == 0) {
                    mVar2 = mVar;
                    if (c1086gP.K(mVar2)) {
                        i14 = 256;
                    } else {
                        i14 = 128;
                    }
                    i12 |= i14;
                }
                i15 = i11 & 8;
                if (i15 != 0) {
                    if ((i10 & 3072) == 0) {
                        oVar2 = oVar;
                        if (c1086gP.K(oVar2)) {
                            i16 = 2048;
                        } else {
                            i16 = 1024;
                        }
                        i12 |= i16;
                    }
                    i17 = i11 & 16;
                    if (i17 != 0) {
                        if ((i10 & 24576) == 0) {
                            str2 = str;
                            if (c1086gP.K(str2)) {
                                i18 = 16384;
                            } else {
                                i18 = 8192;
                            }
                            i12 |= i18;
                        }
                        if ((i11 & 32) != 0) {
                            i12 |= 196608;
                        } else if ((i10 & 196608) == 0) {
                            if (c1086gP.k(qVar)) {
                                i19 = 131072;
                            } else {
                                i19 = 65536;
                            }
                            i12 |= i19;
                        }
                        if ((74899 & i12) != 74898) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        if (c1086gP.C(i12 & 1, z10)) {
                            if (i20 != 0) {
                                hVar4 = androidx.compose.ui.h.a.f13984b;
                            } else {
                                hVar4 = hVar2;
                            }
                            if (i13 != 0) {
                                mVarB = EnterExitTransitionKt.e(null, 0.0f, 3).b(EnterExitTransitionKt.c(null, null, 15));
                            } else {
                                mVarB = mVar2;
                            }
                            if (i15 != 0) {
                                oVarB = EnterExitTransitionKt.f(null, 3).b(EnterExitTransitionKt.j(null, null, 15));
                            } else {
                                oVarB = oVar2;
                            }
                            if (i17 != 0) {
                                str4 = "AnimatedVisibility";
                            } else {
                                str4 = str2;
                            }
                            int i21 = i12 << 3;
                            f(TransitionKt.e(k10, str4, c1086gP, (i12 & 14) | ((i12 >> 9) & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle)), new Ia.l<Boolean, Boolean>() { // from class: androidx.compose.animation.AnimatedVisibilityKt$AnimatedVisibility$7
                                @Override // Ia.l
                                public final Boolean invoke(Boolean bool) {
                                    Boolean bool2 = bool;
                                    bool2.booleanValue();
                                    return bool2;
                                }
                            }, hVar4, mVarB, oVarB, qVar, c1086gP, (i12 & 458752) | (i21 & 57344) | (i21 & 896) | 48 | (i21 & 7168));
                            hVar3 = hVar4;
                            mVar3 = mVarB;
                            str3 = str4;
                        } else {
                            c1086gP.w();
                            hVar3 = hVar2;
                            mVar3 = mVar2;
                            oVarB = oVar2;
                            str3 = str2;
                        }
                        c1105p0V = c1086gP.V();
                        if (c1105p0V != null) {
                            c1105p0V.f13109d = new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.animation.AnimatedVisibilityKt$AnimatedVisibility$8
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                /* JADX WARN: Multi-variable type inference failed */
                                {
                                    super(2);
                                }

                                @Override // Ia.p
                                public final p293xa.r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                                    num.intValue();
                                    AnimatedVisibilityKt.b(k10, hVar3, mVar3, oVarB, str3, qVar, interfaceC1084f2, L4.b.l(i10 | 1), i11);
                                    return p293xa.r.f47939a;
                                }
                            };
                        }
                    }
                    i12 |= 24576;
                    str2 = str;
                    if ((i11 & 32) != 0) {
                        i12 |= 196608;
                    } else if ((i10 & 196608) == 0) {
                        if (c1086gP.k(qVar)) {
                            i19 = 131072;
                        } else {
                            i19 = 65536;
                        }
                        i12 |= i19;
                    }
                    if ((74899 & i12) != 74898) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    if (c1086gP.C(i12 & 1, z10)) {
                        if (i20 != 0) {
                            hVar4 = androidx.compose.ui.h.a.f13984b;
                        } else {
                            hVar4 = hVar2;
                        }
                        if (i13 != 0) {
                            mVarB = EnterExitTransitionKt.e(null, 0.0f, 3).b(EnterExitTransitionKt.c(null, null, 15));
                        } else {
                            mVarB = mVar2;
                        }
                        if (i15 != 0) {
                            oVarB = EnterExitTransitionKt.f(null, 3).b(EnterExitTransitionKt.j(null, null, 15));
                        } else {
                            oVarB = oVar2;
                        }
                        if (i17 != 0) {
                            str4 = "AnimatedVisibility";
                        } else {
                            str4 = str2;
                        }
                        int i22 = i12 << 3;
                        f(TransitionKt.e(k10, str4, c1086gP, (i12 & 14) | ((i12 >> 9) & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle)), new Ia.l<Boolean, Boolean>() { // from class: androidx.compose.animation.AnimatedVisibilityKt$AnimatedVisibility$7
                            @Override // Ia.l
                            public final Boolean invoke(Boolean bool) {
                                Boolean bool2 = bool;
                                bool2.booleanValue();
                                return bool2;
                            }
                        }, hVar4, mVarB, oVarB, qVar, c1086gP, (i12 & 458752) | (i22 & 57344) | (i22 & 896) | 48 | (i22 & 7168));
                        hVar3 = hVar4;
                        mVar3 = mVarB;
                        str3 = str4;
                    } else {
                        c1086gP.w();
                        hVar3 = hVar2;
                        mVar3 = mVar2;
                        oVarB = oVar2;
                        str3 = str2;
                    }
                    c1105p0V = c1086gP.V();
                    if (c1105p0V != null) {
                        c1105p0V.f13109d = new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.animation.AnimatedVisibilityKt$AnimatedVisibility$8
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            /* JADX WARN: Multi-variable type inference failed */
                            {
                                super(2);
                            }

                            @Override // Ia.p
                            public final p293xa.r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                                num.intValue();
                                AnimatedVisibilityKt.b(k10, hVar3, mVar3, oVarB, str3, qVar, interfaceC1084f2, L4.b.l(i10 | 1), i11);
                                return p293xa.r.f47939a;
                            }
                        };
                    }
                }
                i12 |= 3072;
                oVar2 = oVar;
                i17 = i11 & 16;
                if (i17 != 0) {
                    if ((i10 & 24576) == 0) {
                        str2 = str;
                        if (c1086gP.K(str2)) {
                            i18 = 16384;
                        } else {
                            i18 = 8192;
                        }
                        i12 |= i18;
                    }
                    if ((i11 & 32) != 0) {
                        i12 |= 196608;
                    } else if ((i10 & 196608) == 0) {
                        if (c1086gP.k(qVar)) {
                            i19 = 131072;
                        } else {
                            i19 = 65536;
                        }
                        i12 |= i19;
                    }
                    if ((74899 & i12) != 74898) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    if (c1086gP.C(i12 & 1, z10)) {
                        if (i20 != 0) {
                            hVar4 = androidx.compose.ui.h.a.f13984b;
                        } else {
                            hVar4 = hVar2;
                        }
                        if (i13 != 0) {
                            mVarB = EnterExitTransitionKt.e(null, 0.0f, 3).b(EnterExitTransitionKt.c(null, null, 15));
                        } else {
                            mVarB = mVar2;
                        }
                        if (i15 != 0) {
                            oVarB = EnterExitTransitionKt.f(null, 3).b(EnterExitTransitionKt.j(null, null, 15));
                        } else {
                            oVarB = oVar2;
                        }
                        if (i17 != 0) {
                            str4 = "AnimatedVisibility";
                        } else {
                            str4 = str2;
                        }
                        int i23 = i12 << 3;
                        f(TransitionKt.e(k10, str4, c1086gP, (i12 & 14) | ((i12 >> 9) & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle)), new Ia.l<Boolean, Boolean>() { // from class: androidx.compose.animation.AnimatedVisibilityKt$AnimatedVisibility$7
                            @Override // Ia.l
                            public final Boolean invoke(Boolean bool) {
                                Boolean bool2 = bool;
                                bool2.booleanValue();
                                return bool2;
                            }
                        }, hVar4, mVarB, oVarB, qVar, c1086gP, (i12 & 458752) | (i23 & 57344) | (i23 & 896) | 48 | (i23 & 7168));
                        hVar3 = hVar4;
                        mVar3 = mVarB;
                        str3 = str4;
                    } else {
                        c1086gP.w();
                        hVar3 = hVar2;
                        mVar3 = mVar2;
                        oVarB = oVar2;
                        str3 = str2;
                    }
                    c1105p0V = c1086gP.V();
                    if (c1105p0V != null) {
                        c1105p0V.f13109d = new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.animation.AnimatedVisibilityKt$AnimatedVisibility$8
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            /* JADX WARN: Multi-variable type inference failed */
                            {
                                super(2);
                            }

                            @Override // Ia.p
                            public final p293xa.r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                                num.intValue();
                                AnimatedVisibilityKt.b(k10, hVar3, mVar3, oVarB, str3, qVar, interfaceC1084f2, L4.b.l(i10 | 1), i11);
                                return p293xa.r.f47939a;
                            }
                        };
                    }
                }
                i12 |= 24576;
                str2 = str;
                if ((i11 & 32) != 0) {
                    i12 |= 196608;
                } else if ((i10 & 196608) == 0) {
                    if (c1086gP.k(qVar)) {
                        i19 = 131072;
                    } else {
                        i19 = 65536;
                    }
                    i12 |= i19;
                }
                if ((74899 & i12) != 74898) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (c1086gP.C(i12 & 1, z10)) {
                    if (i20 != 0) {
                        hVar4 = androidx.compose.ui.h.a.f13984b;
                    } else {
                        hVar4 = hVar2;
                    }
                    if (i13 != 0) {
                        mVarB = EnterExitTransitionKt.e(null, 0.0f, 3).b(EnterExitTransitionKt.c(null, null, 15));
                    } else {
                        mVarB = mVar2;
                    }
                    if (i15 != 0) {
                        oVarB = EnterExitTransitionKt.f(null, 3).b(EnterExitTransitionKt.j(null, null, 15));
                    } else {
                        oVarB = oVar2;
                    }
                    if (i17 != 0) {
                        str4 = "AnimatedVisibility";
                    } else {
                        str4 = str2;
                    }
                    int i24 = i12 << 3;
                    f(TransitionKt.e(k10, str4, c1086gP, (i12 & 14) | ((i12 >> 9) & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle)), new Ia.l<Boolean, Boolean>() { // from class: androidx.compose.animation.AnimatedVisibilityKt$AnimatedVisibility$7
                        @Override // Ia.l
                        public final Boolean invoke(Boolean bool) {
                            Boolean bool2 = bool;
                            bool2.booleanValue();
                            return bool2;
                        }
                    }, hVar4, mVarB, oVarB, qVar, c1086gP, (i12 & 458752) | (i24 & 57344) | (i24 & 896) | 48 | (i24 & 7168));
                    hVar3 = hVar4;
                    mVar3 = mVarB;
                    str3 = str4;
                } else {
                    c1086gP.w();
                    hVar3 = hVar2;
                    mVar3 = mVar2;
                    oVarB = oVar2;
                    str3 = str2;
                }
                c1105p0V = c1086gP.V();
                if (c1105p0V != null) {
                    c1105p0V.f13109d = new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.animation.AnimatedVisibilityKt$AnimatedVisibility$8
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        /* JADX WARN: Multi-variable type inference failed */
                        {
                            super(2);
                        }

                        @Override // Ia.p
                        public final p293xa.r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                            num.intValue();
                            AnimatedVisibilityKt.b(k10, hVar3, mVar3, oVarB, str3, qVar, interfaceC1084f2, L4.b.l(i10 | 1), i11);
                            return p293xa.r.f47939a;
                        }
                    };
                }
            }
            i12 |= 384;
            mVar2 = mVar;
            i15 = i11 & 8;
            if (i15 != 0) {
                if ((i10 & 3072) == 0) {
                    oVar2 = oVar;
                    if (c1086gP.K(oVar2)) {
                        i16 = 2048;
                    } else {
                        i16 = 1024;
                    }
                    i12 |= i16;
                }
                i17 = i11 & 16;
                if (i17 != 0) {
                    if ((i10 & 24576) == 0) {
                        str2 = str;
                        if (c1086gP.K(str2)) {
                            i18 = 16384;
                        } else {
                            i18 = 8192;
                        }
                        i12 |= i18;
                    }
                    if ((i11 & 32) != 0) {
                        i12 |= 196608;
                    } else if ((i10 & 196608) == 0) {
                        if (c1086gP.k(qVar)) {
                            i19 = 131072;
                        } else {
                            i19 = 65536;
                        }
                        i12 |= i19;
                    }
                    if ((74899 & i12) != 74898) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    if (c1086gP.C(i12 & 1, z10)) {
                        if (i20 != 0) {
                            hVar4 = androidx.compose.ui.h.a.f13984b;
                        } else {
                            hVar4 = hVar2;
                        }
                        if (i13 != 0) {
                            mVarB = EnterExitTransitionKt.e(null, 0.0f, 3).b(EnterExitTransitionKt.c(null, null, 15));
                        } else {
                            mVarB = mVar2;
                        }
                        if (i15 != 0) {
                            oVarB = EnterExitTransitionKt.f(null, 3).b(EnterExitTransitionKt.j(null, null, 15));
                        } else {
                            oVarB = oVar2;
                        }
                        if (i17 != 0) {
                            str4 = "AnimatedVisibility";
                        } else {
                            str4 = str2;
                        }
                        int i25 = i12 << 3;
                        f(TransitionKt.e(k10, str4, c1086gP, (i12 & 14) | ((i12 >> 9) & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle)), new Ia.l<Boolean, Boolean>() { // from class: androidx.compose.animation.AnimatedVisibilityKt$AnimatedVisibility$7
                            @Override // Ia.l
                            public final Boolean invoke(Boolean bool) {
                                Boolean bool2 = bool;
                                bool2.booleanValue();
                                return bool2;
                            }
                        }, hVar4, mVarB, oVarB, qVar, c1086gP, (i12 & 458752) | (i25 & 57344) | (i25 & 896) | 48 | (i25 & 7168));
                        hVar3 = hVar4;
                        mVar3 = mVarB;
                        str3 = str4;
                    } else {
                        c1086gP.w();
                        hVar3 = hVar2;
                        mVar3 = mVar2;
                        oVarB = oVar2;
                        str3 = str2;
                    }
                    c1105p0V = c1086gP.V();
                    if (c1105p0V != null) {
                        c1105p0V.f13109d = new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.animation.AnimatedVisibilityKt$AnimatedVisibility$8
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            /* JADX WARN: Multi-variable type inference failed */
                            {
                                super(2);
                            }

                            @Override // Ia.p
                            public final p293xa.r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                                num.intValue();
                                AnimatedVisibilityKt.b(k10, hVar3, mVar3, oVarB, str3, qVar, interfaceC1084f2, L4.b.l(i10 | 1), i11);
                                return p293xa.r.f47939a;
                            }
                        };
                    }
                }
                i12 |= 24576;
                str2 = str;
                if ((i11 & 32) != 0) {
                    i12 |= 196608;
                } else if ((i10 & 196608) == 0) {
                    if (c1086gP.k(qVar)) {
                        i19 = 131072;
                    } else {
                        i19 = 65536;
                    }
                    i12 |= i19;
                }
                if ((74899 & i12) != 74898) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (c1086gP.C(i12 & 1, z10)) {
                    if (i20 != 0) {
                        hVar4 = androidx.compose.ui.h.a.f13984b;
                    } else {
                        hVar4 = hVar2;
                    }
                    if (i13 != 0) {
                        mVarB = EnterExitTransitionKt.e(null, 0.0f, 3).b(EnterExitTransitionKt.c(null, null, 15));
                    } else {
                        mVarB = mVar2;
                    }
                    if (i15 != 0) {
                        oVarB = EnterExitTransitionKt.f(null, 3).b(EnterExitTransitionKt.j(null, null, 15));
                    } else {
                        oVarB = oVar2;
                    }
                    if (i17 != 0) {
                        str4 = "AnimatedVisibility";
                    } else {
                        str4 = str2;
                    }
                    int i26 = i12 << 3;
                    f(TransitionKt.e(k10, str4, c1086gP, (i12 & 14) | ((i12 >> 9) & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle)), new Ia.l<Boolean, Boolean>() { // from class: androidx.compose.animation.AnimatedVisibilityKt$AnimatedVisibility$7
                        @Override // Ia.l
                        public final Boolean invoke(Boolean bool) {
                            Boolean bool2 = bool;
                            bool2.booleanValue();
                            return bool2;
                        }
                    }, hVar4, mVarB, oVarB, qVar, c1086gP, (i12 & 458752) | (i26 & 57344) | (i26 & 896) | 48 | (i26 & 7168));
                    hVar3 = hVar4;
                    mVar3 = mVarB;
                    str3 = str4;
                } else {
                    c1086gP.w();
                    hVar3 = hVar2;
                    mVar3 = mVar2;
                    oVarB = oVar2;
                    str3 = str2;
                }
                c1105p0V = c1086gP.V();
                if (c1105p0V != null) {
                    c1105p0V.f13109d = new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.animation.AnimatedVisibilityKt$AnimatedVisibility$8
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        /* JADX WARN: Multi-variable type inference failed */
                        {
                            super(2);
                        }

                        @Override // Ia.p
                        public final p293xa.r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                            num.intValue();
                            AnimatedVisibilityKt.b(k10, hVar3, mVar3, oVarB, str3, qVar, interfaceC1084f2, L4.b.l(i10 | 1), i11);
                            return p293xa.r.f47939a;
                        }
                    };
                }
            }
            i12 |= 3072;
            oVar2 = oVar;
            i17 = i11 & 16;
            if (i17 != 0) {
                if ((i10 & 24576) == 0) {
                    str2 = str;
                    if (c1086gP.K(str2)) {
                        i18 = 16384;
                    } else {
                        i18 = 8192;
                    }
                    i12 |= i18;
                }
                if ((i11 & 32) != 0) {
                    i12 |= 196608;
                } else if ((i10 & 196608) == 0) {
                    if (c1086gP.k(qVar)) {
                        i19 = 131072;
                    } else {
                        i19 = 65536;
                    }
                    i12 |= i19;
                }
                if ((74899 & i12) != 74898) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (c1086gP.C(i12 & 1, z10)) {
                    if (i20 != 0) {
                        hVar4 = androidx.compose.ui.h.a.f13984b;
                    } else {
                        hVar4 = hVar2;
                    }
                    if (i13 != 0) {
                        mVarB = EnterExitTransitionKt.e(null, 0.0f, 3).b(EnterExitTransitionKt.c(null, null, 15));
                    } else {
                        mVarB = mVar2;
                    }
                    if (i15 != 0) {
                        oVarB = EnterExitTransitionKt.f(null, 3).b(EnterExitTransitionKt.j(null, null, 15));
                    } else {
                        oVarB = oVar2;
                    }
                    if (i17 != 0) {
                        str4 = "AnimatedVisibility";
                    } else {
                        str4 = str2;
                    }
                    int i27 = i12 << 3;
                    f(TransitionKt.e(k10, str4, c1086gP, (i12 & 14) | ((i12 >> 9) & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle)), new Ia.l<Boolean, Boolean>() { // from class: androidx.compose.animation.AnimatedVisibilityKt$AnimatedVisibility$7
                        @Override // Ia.l
                        public final Boolean invoke(Boolean bool) {
                            Boolean bool2 = bool;
                            bool2.booleanValue();
                            return bool2;
                        }
                    }, hVar4, mVarB, oVarB, qVar, c1086gP, (i12 & 458752) | (i27 & 57344) | (i27 & 896) | 48 | (i27 & 7168));
                    hVar3 = hVar4;
                    mVar3 = mVarB;
                    str3 = str4;
                } else {
                    c1086gP.w();
                    hVar3 = hVar2;
                    mVar3 = mVar2;
                    oVarB = oVar2;
                    str3 = str2;
                }
                c1105p0V = c1086gP.V();
                if (c1105p0V != null) {
                    c1105p0V.f13109d = new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.animation.AnimatedVisibilityKt$AnimatedVisibility$8
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        /* JADX WARN: Multi-variable type inference failed */
                        {
                            super(2);
                        }

                        @Override // Ia.p
                        public final p293xa.r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                            num.intValue();
                            AnimatedVisibilityKt.b(k10, hVar3, mVar3, oVarB, str3, qVar, interfaceC1084f2, L4.b.l(i10 | 1), i11);
                            return p293xa.r.f47939a;
                        }
                    };
                }
            }
            i12 |= 24576;
            str2 = str;
            if ((i11 & 32) != 0) {
                i12 |= 196608;
            } else if ((i10 & 196608) == 0) {
                if (c1086gP.k(qVar)) {
                    i19 = 131072;
                } else {
                    i19 = 65536;
                }
                i12 |= i19;
            }
            if ((74899 & i12) != 74898) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (c1086gP.C(i12 & 1, z10)) {
                if (i20 != 0) {
                    hVar4 = androidx.compose.ui.h.a.f13984b;
                } else {
                    hVar4 = hVar2;
                }
                if (i13 != 0) {
                    mVarB = EnterExitTransitionKt.e(null, 0.0f, 3).b(EnterExitTransitionKt.c(null, null, 15));
                } else {
                    mVarB = mVar2;
                }
                if (i15 != 0) {
                    oVarB = EnterExitTransitionKt.f(null, 3).b(EnterExitTransitionKt.j(null, null, 15));
                } else {
                    oVarB = oVar2;
                }
                if (i17 != 0) {
                    str4 = "AnimatedVisibility";
                } else {
                    str4 = str2;
                }
                int i28 = i12 << 3;
                f(TransitionKt.e(k10, str4, c1086gP, (i12 & 14) | ((i12 >> 9) & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle)), new Ia.l<Boolean, Boolean>() { // from class: androidx.compose.animation.AnimatedVisibilityKt$AnimatedVisibility$7
                    @Override // Ia.l
                    public final Boolean invoke(Boolean bool) {
                        Boolean bool2 = bool;
                        bool2.booleanValue();
                        return bool2;
                    }
                }, hVar4, mVarB, oVarB, qVar, c1086gP, (i12 & 458752) | (i28 & 57344) | (i28 & 896) | 48 | (i28 & 7168));
                hVar3 = hVar4;
                mVar3 = mVarB;
                str3 = str4;
            } else {
                c1086gP.w();
                hVar3 = hVar2;
                mVar3 = mVar2;
                oVarB = oVar2;
                str3 = str2;
            }
            c1105p0V = c1086gP.V();
            if (c1105p0V != null) {
                c1105p0V.f13109d = new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.animation.AnimatedVisibilityKt$AnimatedVisibility$8
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(2);
                    }

                    @Override // Ia.p
                    public final p293xa.r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                        num.intValue();
                        AnimatedVisibilityKt.b(k10, hVar3, mVar3, oVarB, str3, qVar, interfaceC1084f2, L4.b.l(i10 | 1), i11);
                        return p293xa.r.f47939a;
                    }
                };
            }
        }
        i12 |= 48;
        hVar2 = hVar;
        i13 = i11 & 4;
        if (i13 != 0) {
            if ((i10 & 384) == 0) {
                mVar2 = mVar;
                if (c1086gP.K(mVar2)) {
                    i14 = 256;
                } else {
                    i14 = 128;
                }
                i12 |= i14;
            }
            i15 = i11 & 8;
            if (i15 != 0) {
                if ((i10 & 3072) == 0) {
                    oVar2 = oVar;
                    if (c1086gP.K(oVar2)) {
                        i16 = 2048;
                    } else {
                        i16 = 1024;
                    }
                    i12 |= i16;
                }
                i17 = i11 & 16;
                if (i17 != 0) {
                    if ((i10 & 24576) == 0) {
                        str2 = str;
                        if (c1086gP.K(str2)) {
                            i18 = 16384;
                        } else {
                            i18 = 8192;
                        }
                        i12 |= i18;
                    }
                    if ((i11 & 32) != 0) {
                        i12 |= 196608;
                    } else if ((i10 & 196608) == 0) {
                        if (c1086gP.k(qVar)) {
                            i19 = 131072;
                        } else {
                            i19 = 65536;
                        }
                        i12 |= i19;
                    }
                    if ((74899 & i12) != 74898) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    if (c1086gP.C(i12 & 1, z10)) {
                        if (i20 != 0) {
                            hVar4 = androidx.compose.ui.h.a.f13984b;
                        } else {
                            hVar4 = hVar2;
                        }
                        if (i13 != 0) {
                            mVarB = EnterExitTransitionKt.e(null, 0.0f, 3).b(EnterExitTransitionKt.c(null, null, 15));
                        } else {
                            mVarB = mVar2;
                        }
                        if (i15 != 0) {
                            oVarB = EnterExitTransitionKt.f(null, 3).b(EnterExitTransitionKt.j(null, null, 15));
                        } else {
                            oVarB = oVar2;
                        }
                        if (i17 != 0) {
                            str4 = "AnimatedVisibility";
                        } else {
                            str4 = str2;
                        }
                        int i29 = i12 << 3;
                        f(TransitionKt.e(k10, str4, c1086gP, (i12 & 14) | ((i12 >> 9) & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle)), new Ia.l<Boolean, Boolean>() { // from class: androidx.compose.animation.AnimatedVisibilityKt$AnimatedVisibility$7
                            @Override // Ia.l
                            public final Boolean invoke(Boolean bool) {
                                Boolean bool2 = bool;
                                bool2.booleanValue();
                                return bool2;
                            }
                        }, hVar4, mVarB, oVarB, qVar, c1086gP, (i12 & 458752) | (i29 & 57344) | (i29 & 896) | 48 | (i29 & 7168));
                        hVar3 = hVar4;
                        mVar3 = mVarB;
                        str3 = str4;
                    } else {
                        c1086gP.w();
                        hVar3 = hVar2;
                        mVar3 = mVar2;
                        oVarB = oVar2;
                        str3 = str2;
                    }
                    c1105p0V = c1086gP.V();
                    if (c1105p0V != null) {
                        c1105p0V.f13109d = new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.animation.AnimatedVisibilityKt$AnimatedVisibility$8
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            /* JADX WARN: Multi-variable type inference failed */
                            {
                                super(2);
                            }

                            @Override // Ia.p
                            public final p293xa.r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                                num.intValue();
                                AnimatedVisibilityKt.b(k10, hVar3, mVar3, oVarB, str3, qVar, interfaceC1084f2, L4.b.l(i10 | 1), i11);
                                return p293xa.r.f47939a;
                            }
                        };
                    }
                }
                i12 |= 24576;
                str2 = str;
                if ((i11 & 32) != 0) {
                    i12 |= 196608;
                } else if ((i10 & 196608) == 0) {
                    if (c1086gP.k(qVar)) {
                        i19 = 131072;
                    } else {
                        i19 = 65536;
                    }
                    i12 |= i19;
                }
                if ((74899 & i12) != 74898) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (c1086gP.C(i12 & 1, z10)) {
                    if (i20 != 0) {
                        hVar4 = androidx.compose.ui.h.a.f13984b;
                    } else {
                        hVar4 = hVar2;
                    }
                    if (i13 != 0) {
                        mVarB = EnterExitTransitionKt.e(null, 0.0f, 3).b(EnterExitTransitionKt.c(null, null, 15));
                    } else {
                        mVarB = mVar2;
                    }
                    if (i15 != 0) {
                        oVarB = EnterExitTransitionKt.f(null, 3).b(EnterExitTransitionKt.j(null, null, 15));
                    } else {
                        oVarB = oVar2;
                    }
                    if (i17 != 0) {
                        str4 = "AnimatedVisibility";
                    } else {
                        str4 = str2;
                    }
                    int i210 = i12 << 3;
                    f(TransitionKt.e(k10, str4, c1086gP, (i12 & 14) | ((i12 >> 9) & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle)), new Ia.l<Boolean, Boolean>() { // from class: androidx.compose.animation.AnimatedVisibilityKt$AnimatedVisibility$7
                        @Override // Ia.l
                        public final Boolean invoke(Boolean bool) {
                            Boolean bool2 = bool;
                            bool2.booleanValue();
                            return bool2;
                        }
                    }, hVar4, mVarB, oVarB, qVar, c1086gP, (i12 & 458752) | (i210 & 57344) | (i210 & 896) | 48 | (i210 & 7168));
                    hVar3 = hVar4;
                    mVar3 = mVarB;
                    str3 = str4;
                } else {
                    c1086gP.w();
                    hVar3 = hVar2;
                    mVar3 = mVar2;
                    oVarB = oVar2;
                    str3 = str2;
                }
                c1105p0V = c1086gP.V();
                if (c1105p0V != null) {
                    c1105p0V.f13109d = new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.animation.AnimatedVisibilityKt$AnimatedVisibility$8
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        /* JADX WARN: Multi-variable type inference failed */
                        {
                            super(2);
                        }

                        @Override // Ia.p
                        public final p293xa.r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                            num.intValue();
                            AnimatedVisibilityKt.b(k10, hVar3, mVar3, oVarB, str3, qVar, interfaceC1084f2, L4.b.l(i10 | 1), i11);
                            return p293xa.r.f47939a;
                        }
                    };
                }
            }
            i12 |= 3072;
            oVar2 = oVar;
            i17 = i11 & 16;
            if (i17 != 0) {
                if ((i10 & 24576) == 0) {
                    str2 = str;
                    if (c1086gP.K(str2)) {
                        i18 = 16384;
                    } else {
                        i18 = 8192;
                    }
                    i12 |= i18;
                }
                if ((i11 & 32) != 0) {
                    i12 |= 196608;
                } else if ((i10 & 196608) == 0) {
                    if (c1086gP.k(qVar)) {
                        i19 = 131072;
                    } else {
                        i19 = 65536;
                    }
                    i12 |= i19;
                }
                if ((74899 & i12) != 74898) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (c1086gP.C(i12 & 1, z10)) {
                    if (i20 != 0) {
                        hVar4 = androidx.compose.ui.h.a.f13984b;
                    } else {
                        hVar4 = hVar2;
                    }
                    if (i13 != 0) {
                        mVarB = EnterExitTransitionKt.e(null, 0.0f, 3).b(EnterExitTransitionKt.c(null, null, 15));
                    } else {
                        mVarB = mVar2;
                    }
                    if (i15 != 0) {
                        oVarB = EnterExitTransitionKt.f(null, 3).b(EnterExitTransitionKt.j(null, null, 15));
                    } else {
                        oVarB = oVar2;
                    }
                    if (i17 != 0) {
                        str4 = "AnimatedVisibility";
                    } else {
                        str4 = str2;
                    }
                    int i211 = i12 << 3;
                    f(TransitionKt.e(k10, str4, c1086gP, (i12 & 14) | ((i12 >> 9) & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle)), new Ia.l<Boolean, Boolean>() { // from class: androidx.compose.animation.AnimatedVisibilityKt$AnimatedVisibility$7
                        @Override // Ia.l
                        public final Boolean invoke(Boolean bool) {
                            Boolean bool2 = bool;
                            bool2.booleanValue();
                            return bool2;
                        }
                    }, hVar4, mVarB, oVarB, qVar, c1086gP, (i12 & 458752) | (i211 & 57344) | (i211 & 896) | 48 | (i211 & 7168));
                    hVar3 = hVar4;
                    mVar3 = mVarB;
                    str3 = str4;
                } else {
                    c1086gP.w();
                    hVar3 = hVar2;
                    mVar3 = mVar2;
                    oVarB = oVar2;
                    str3 = str2;
                }
                c1105p0V = c1086gP.V();
                if (c1105p0V != null) {
                    c1105p0V.f13109d = new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.animation.AnimatedVisibilityKt$AnimatedVisibility$8
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        /* JADX WARN: Multi-variable type inference failed */
                        {
                            super(2);
                        }

                        @Override // Ia.p
                        public final p293xa.r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                            num.intValue();
                            AnimatedVisibilityKt.b(k10, hVar3, mVar3, oVarB, str3, qVar, interfaceC1084f2, L4.b.l(i10 | 1), i11);
                            return p293xa.r.f47939a;
                        }
                    };
                }
            }
            i12 |= 24576;
            str2 = str;
            if ((i11 & 32) != 0) {
                i12 |= 196608;
            } else if ((i10 & 196608) == 0) {
                if (c1086gP.k(qVar)) {
                    i19 = 131072;
                } else {
                    i19 = 65536;
                }
                i12 |= i19;
            }
            if ((74899 & i12) != 74898) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (c1086gP.C(i12 & 1, z10)) {
                if (i20 != 0) {
                    hVar4 = androidx.compose.ui.h.a.f13984b;
                } else {
                    hVar4 = hVar2;
                }
                if (i13 != 0) {
                    mVarB = EnterExitTransitionKt.e(null, 0.0f, 3).b(EnterExitTransitionKt.c(null, null, 15));
                } else {
                    mVarB = mVar2;
                }
                if (i15 != 0) {
                    oVarB = EnterExitTransitionKt.f(null, 3).b(EnterExitTransitionKt.j(null, null, 15));
                } else {
                    oVarB = oVar2;
                }
                if (i17 != 0) {
                    str4 = "AnimatedVisibility";
                } else {
                    str4 = str2;
                }
                int i212 = i12 << 3;
                f(TransitionKt.e(k10, str4, c1086gP, (i12 & 14) | ((i12 >> 9) & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle)), new Ia.l<Boolean, Boolean>() { // from class: androidx.compose.animation.AnimatedVisibilityKt$AnimatedVisibility$7
                    @Override // Ia.l
                    public final Boolean invoke(Boolean bool) {
                        Boolean bool2 = bool;
                        bool2.booleanValue();
                        return bool2;
                    }
                }, hVar4, mVarB, oVarB, qVar, c1086gP, (i12 & 458752) | (i212 & 57344) | (i212 & 896) | 48 | (i212 & 7168));
                hVar3 = hVar4;
                mVar3 = mVarB;
                str3 = str4;
            } else {
                c1086gP.w();
                hVar3 = hVar2;
                mVar3 = mVar2;
                oVarB = oVar2;
                str3 = str2;
            }
            c1105p0V = c1086gP.V();
            if (c1105p0V != null) {
                c1105p0V.f13109d = new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.animation.AnimatedVisibilityKt$AnimatedVisibility$8
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(2);
                    }

                    @Override // Ia.p
                    public final p293xa.r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                        num.intValue();
                        AnimatedVisibilityKt.b(k10, hVar3, mVar3, oVarB, str3, qVar, interfaceC1084f2, L4.b.l(i10 | 1), i11);
                        return p293xa.r.f47939a;
                    }
                };
            }
        }
        i12 |= 384;
        mVar2 = mVar;
        i15 = i11 & 8;
        if (i15 != 0) {
            if ((i10 & 3072) == 0) {
                oVar2 = oVar;
                if (c1086gP.K(oVar2)) {
                    i16 = 2048;
                } else {
                    i16 = 1024;
                }
                i12 |= i16;
            }
            i17 = i11 & 16;
            if (i17 != 0) {
                if ((i10 & 24576) == 0) {
                    str2 = str;
                    if (c1086gP.K(str2)) {
                        i18 = 16384;
                    } else {
                        i18 = 8192;
                    }
                    i12 |= i18;
                }
                if ((i11 & 32) != 0) {
                    i12 |= 196608;
                } else if ((i10 & 196608) == 0) {
                    if (c1086gP.k(qVar)) {
                        i19 = 131072;
                    } else {
                        i19 = 65536;
                    }
                    i12 |= i19;
                }
                if ((74899 & i12) != 74898) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (c1086gP.C(i12 & 1, z10)) {
                    if (i20 != 0) {
                        hVar4 = androidx.compose.ui.h.a.f13984b;
                    } else {
                        hVar4 = hVar2;
                    }
                    if (i13 != 0) {
                        mVarB = EnterExitTransitionKt.e(null, 0.0f, 3).b(EnterExitTransitionKt.c(null, null, 15));
                    } else {
                        mVarB = mVar2;
                    }
                    if (i15 != 0) {
                        oVarB = EnterExitTransitionKt.f(null, 3).b(EnterExitTransitionKt.j(null, null, 15));
                    } else {
                        oVarB = oVar2;
                    }
                    if (i17 != 0) {
                        str4 = "AnimatedVisibility";
                    } else {
                        str4 = str2;
                    }
                    int i213 = i12 << 3;
                    f(TransitionKt.e(k10, str4, c1086gP, (i12 & 14) | ((i12 >> 9) & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle)), new Ia.l<Boolean, Boolean>() { // from class: androidx.compose.animation.AnimatedVisibilityKt$AnimatedVisibility$7
                        @Override // Ia.l
                        public final Boolean invoke(Boolean bool) {
                            Boolean bool2 = bool;
                            bool2.booleanValue();
                            return bool2;
                        }
                    }, hVar4, mVarB, oVarB, qVar, c1086gP, (i12 & 458752) | (i213 & 57344) | (i213 & 896) | 48 | (i213 & 7168));
                    hVar3 = hVar4;
                    mVar3 = mVarB;
                    str3 = str4;
                } else {
                    c1086gP.w();
                    hVar3 = hVar2;
                    mVar3 = mVar2;
                    oVarB = oVar2;
                    str3 = str2;
                }
                c1105p0V = c1086gP.V();
                if (c1105p0V != null) {
                    c1105p0V.f13109d = new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.animation.AnimatedVisibilityKt$AnimatedVisibility$8
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        /* JADX WARN: Multi-variable type inference failed */
                        {
                            super(2);
                        }

                        @Override // Ia.p
                        public final p293xa.r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                            num.intValue();
                            AnimatedVisibilityKt.b(k10, hVar3, mVar3, oVarB, str3, qVar, interfaceC1084f2, L4.b.l(i10 | 1), i11);
                            return p293xa.r.f47939a;
                        }
                    };
                }
            }
            i12 |= 24576;
            str2 = str;
            if ((i11 & 32) != 0) {
                i12 |= 196608;
            } else if ((i10 & 196608) == 0) {
                if (c1086gP.k(qVar)) {
                    i19 = 131072;
                } else {
                    i19 = 65536;
                }
                i12 |= i19;
            }
            if ((74899 & i12) != 74898) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (c1086gP.C(i12 & 1, z10)) {
                if (i20 != 0) {
                    hVar4 = androidx.compose.ui.h.a.f13984b;
                } else {
                    hVar4 = hVar2;
                }
                if (i13 != 0) {
                    mVarB = EnterExitTransitionKt.e(null, 0.0f, 3).b(EnterExitTransitionKt.c(null, null, 15));
                } else {
                    mVarB = mVar2;
                }
                if (i15 != 0) {
                    oVarB = EnterExitTransitionKt.f(null, 3).b(EnterExitTransitionKt.j(null, null, 15));
                } else {
                    oVarB = oVar2;
                }
                if (i17 != 0) {
                    str4 = "AnimatedVisibility";
                } else {
                    str4 = str2;
                }
                int i214 = i12 << 3;
                f(TransitionKt.e(k10, str4, c1086gP, (i12 & 14) | ((i12 >> 9) & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle)), new Ia.l<Boolean, Boolean>() { // from class: androidx.compose.animation.AnimatedVisibilityKt$AnimatedVisibility$7
                    @Override // Ia.l
                    public final Boolean invoke(Boolean bool) {
                        Boolean bool2 = bool;
                        bool2.booleanValue();
                        return bool2;
                    }
                }, hVar4, mVarB, oVarB, qVar, c1086gP, (i12 & 458752) | (i214 & 57344) | (i214 & 896) | 48 | (i214 & 7168));
                hVar3 = hVar4;
                mVar3 = mVarB;
                str3 = str4;
            } else {
                c1086gP.w();
                hVar3 = hVar2;
                mVar3 = mVar2;
                oVarB = oVar2;
                str3 = str2;
            }
            c1105p0V = c1086gP.V();
            if (c1105p0V != null) {
                c1105p0V.f13109d = new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.animation.AnimatedVisibilityKt$AnimatedVisibility$8
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(2);
                    }

                    @Override // Ia.p
                    public final p293xa.r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                        num.intValue();
                        AnimatedVisibilityKt.b(k10, hVar3, mVar3, oVarB, str3, qVar, interfaceC1084f2, L4.b.l(i10 | 1), i11);
                        return p293xa.r.f47939a;
                    }
                };
            }
        }
        i12 |= 3072;
        oVar2 = oVar;
        i17 = i11 & 16;
        if (i17 != 0) {
            if ((i10 & 24576) == 0) {
                str2 = str;
                if (c1086gP.K(str2)) {
                    i18 = 16384;
                } else {
                    i18 = 8192;
                }
                i12 |= i18;
            }
            if ((i11 & 32) != 0) {
                i12 |= 196608;
            } else if ((i10 & 196608) == 0) {
                if (c1086gP.k(qVar)) {
                    i19 = 131072;
                } else {
                    i19 = 65536;
                }
                i12 |= i19;
            }
            if ((74899 & i12) != 74898) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (c1086gP.C(i12 & 1, z10)) {
                if (i20 != 0) {
                    hVar4 = androidx.compose.ui.h.a.f13984b;
                } else {
                    hVar4 = hVar2;
                }
                if (i13 != 0) {
                    mVarB = EnterExitTransitionKt.e(null, 0.0f, 3).b(EnterExitTransitionKt.c(null, null, 15));
                } else {
                    mVarB = mVar2;
                }
                if (i15 != 0) {
                    oVarB = EnterExitTransitionKt.f(null, 3).b(EnterExitTransitionKt.j(null, null, 15));
                } else {
                    oVarB = oVar2;
                }
                if (i17 != 0) {
                    str4 = "AnimatedVisibility";
                } else {
                    str4 = str2;
                }
                int i215 = i12 << 3;
                f(TransitionKt.e(k10, str4, c1086gP, (i12 & 14) | ((i12 >> 9) & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle)), new Ia.l<Boolean, Boolean>() { // from class: androidx.compose.animation.AnimatedVisibilityKt$AnimatedVisibility$7
                    @Override // Ia.l
                    public final Boolean invoke(Boolean bool) {
                        Boolean bool2 = bool;
                        bool2.booleanValue();
                        return bool2;
                    }
                }, hVar4, mVarB, oVarB, qVar, c1086gP, (i12 & 458752) | (i215 & 57344) | (i215 & 896) | 48 | (i215 & 7168));
                hVar3 = hVar4;
                mVar3 = mVarB;
                str3 = str4;
            } else {
                c1086gP.w();
                hVar3 = hVar2;
                mVar3 = mVar2;
                oVarB = oVar2;
                str3 = str2;
            }
            c1105p0V = c1086gP.V();
            if (c1105p0V != null) {
                c1105p0V.f13109d = new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.animation.AnimatedVisibilityKt$AnimatedVisibility$8
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(2);
                    }

                    @Override // Ia.p
                    public final p293xa.r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                        num.intValue();
                        AnimatedVisibilityKt.b(k10, hVar3, mVar3, oVarB, str3, qVar, interfaceC1084f2, L4.b.l(i10 | 1), i11);
                        return p293xa.r.f47939a;
                    }
                };
            }
        }
        i12 |= 24576;
        str2 = str;
        if ((i11 & 32) != 0) {
            i12 |= 196608;
        } else if ((i10 & 196608) == 0) {
            if (c1086gP.k(qVar)) {
                i19 = 131072;
            } else {
                i19 = 65536;
            }
            i12 |= i19;
        }
        if ((74899 & i12) != 74898) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (c1086gP.C(i12 & 1, z10)) {
            if (i20 != 0) {
                hVar4 = androidx.compose.ui.h.a.f13984b;
            } else {
                hVar4 = hVar2;
            }
            if (i13 != 0) {
                mVarB = EnterExitTransitionKt.e(null, 0.0f, 3).b(EnterExitTransitionKt.c(null, null, 15));
            } else {
                mVarB = mVar2;
            }
            if (i15 != 0) {
                oVarB = EnterExitTransitionKt.f(null, 3).b(EnterExitTransitionKt.j(null, null, 15));
            } else {
                oVarB = oVar2;
            }
            if (i17 != 0) {
                str4 = "AnimatedVisibility";
            } else {
                str4 = str2;
            }
            int i216 = i12 << 3;
            f(TransitionKt.e(k10, str4, c1086gP, (i12 & 14) | ((i12 >> 9) & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle)), new Ia.l<Boolean, Boolean>() { // from class: androidx.compose.animation.AnimatedVisibilityKt$AnimatedVisibility$7
                @Override // Ia.l
                public final Boolean invoke(Boolean bool) {
                    Boolean bool2 = bool;
                    bool2.booleanValue();
                    return bool2;
                }
            }, hVar4, mVarB, oVarB, qVar, c1086gP, (i12 & 458752) | (i216 & 57344) | (i216 & 896) | 48 | (i216 & 7168));
            hVar3 = hVar4;
            mVar3 = mVarB;
            str3 = str4;
        } else {
            c1086gP.w();
            hVar3 = hVar2;
            mVar3 = mVar2;
            oVarB = oVar2;
            str3 = str2;
        }
        c1105p0V = c1086gP.V();
        if (c1105p0V != null) {
            c1105p0V.f13109d = new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.animation.AnimatedVisibilityKt$AnimatedVisibility$8
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(2);
                }

                @Override // Ia.p
                public final p293xa.r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                    num.intValue();
                    AnimatedVisibilityKt.b(k10, hVar3, mVar3, oVarB, str3, qVar, interfaceC1084f2, L4.b.l(i10 | 1), i11);
                    return p293xa.r.f47939a;
                }
            };
        }
    }

    /* JADX WARN: Code duplicated, block: B:29:0x004e  */
    /* JADX WARN: Code duplicated, block: B:31:0x0053  */
    /* JADX WARN: Code duplicated, block: B:33:0x0057  */
    /* JADX WARN: Code duplicated, block: B:35:0x005f  */
    /* JADX WARN: Code duplicated, block: B:36:0x0062  */
    /* JADX WARN: Code duplicated, block: B:40:0x0069  */
    /* JADX WARN: Code duplicated, block: B:42:0x006e  */
    /* JADX WARN: Code duplicated, block: B:44:0x0072  */
    /* JADX WARN: Code duplicated, block: B:46:0x007a  */
    /* JADX WARN: Code duplicated, block: B:47:0x007d  */
    /* JADX WARN: Code duplicated, block: B:51:0x0086  */
    /* JADX WARN: Code duplicated, block: B:53:0x008a  */
    /* JADX WARN: Code duplicated, block: B:55:0x008d  */
    /* JADX WARN: Code duplicated, block: B:57:0x0095  */
    /* JADX WARN: Code duplicated, block: B:58:0x0098  */
    /* JADX WARN: Code duplicated, block: B:62:0x00a1  */
    /* JADX WARN: Code duplicated, block: B:63:0x00a5  */
    /* JADX WARN: Code duplicated, block: B:65:0x00ab  */
    /* JADX WARN: Code duplicated, block: B:67:0x00b1  */
    /* JADX WARN: Code duplicated, block: B:68:0x00b4  */
    /* JADX WARN: Code duplicated, block: B:72:0x00c0  */
    /* JADX WARN: Code duplicated, block: B:73:0x00c2  */
    /* JADX WARN: Code duplicated, block: B:76:0x00cb A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:77:0x00cd  */
    /* JADX WARN: Code duplicated, block: B:78:0x00d0  */
    /* JADX WARN: Code duplicated, block: B:81:0x00d5  */
    /* JADX WARN: Code duplicated, block: B:83:0x00e7  */
    /* JADX WARN: Code duplicated, block: B:84:0x00f4  */
    /* JADX WARN: Code duplicated, block: B:86:0x00f7  */
    /* JADX WARN: Code duplicated, block: B:87:0x00fa  */
    /* JADX WARN: Code duplicated, block: B:89:0x012b  */
    /* JADX WARN: Code duplicated, block: B:92:0x0138  */
    /* JADX WARN: Code duplicated, block: B:94:? A[RETURN, SYNTHETIC] */
    public static final void c(final InterfaceC0954n interfaceC0954n, final K<Boolean> k10, androidx.compose.ui.h hVar, m mVar, o oVar, String str, final Ia.q<? super InterfaceC0928f, ? super InterfaceC1084f, ? super Integer, p293xa.r> qVar, InterfaceC1084f interfaceC1084f, final int i10, final int i11) {
        int i12;
        androidx.compose.ui.h hVar2;
        int i13;
        m mVarB;
        int i14;
        int i15;
        o oVar2;
        int i16;
        int i17;
        String str2;
        int i18;
        int i19;
        boolean z10;
        final androidx.compose.ui.h hVar3;
        final m mVar2;
        final o oVar3;
        final String str3;
        C1105p0 c1105p0V;
        o oVarB;
        String str4;
        C1086g c1086gP = interfaceC1084f.p(-850656618);
        if ((i11 & 1) != 0) {
            i12 = i10 | 48;
        } else if ((i10 & 48) == 0) {
            i12 = ((i10 & 64) == 0 ? c1086gP.K(k10) : c1086gP.k(k10) ? 32 : 16) | i10;
        } else {
            i12 = i10;
        }
        int i20 = i11 & 2;
        if (i20 == 0) {
            if ((i10 & 384) == 0) {
                hVar2 = hVar;
                i12 |= c1086gP.K(hVar2) ? 256 : 128;
            }
            i13 = i11 & 4;
            if (i13 != 0) {
                if ((i10 & 3072) == 0) {
                    mVarB = mVar;
                    if (c1086gP.K(mVarB)) {
                        i14 = 2048;
                    } else {
                        i14 = 1024;
                    }
                    i12 |= i14;
                }
                i15 = i11 & 8;
                if (i15 != 0) {
                    if ((i10 & 24576) == 0) {
                        oVar2 = oVar;
                        if (c1086gP.K(oVar2)) {
                            i16 = 16384;
                        } else {
                            i16 = 8192;
                        }
                        i12 |= i16;
                    }
                    i17 = i11 & 16;
                    if (i17 != 0) {
                        if ((196608 & i10) == 0) {
                            str2 = str;
                            if (c1086gP.K(str2)) {
                                i18 = 131072;
                            } else {
                                i18 = 65536;
                            }
                            i12 |= i18;
                        }
                        if ((i11 & 32) != 0) {
                            i12 |= 1572864;
                        } else if ((i10 & 1572864) == 0) {
                            if (c1086gP.k(qVar)) {
                                i19 = 1048576;
                            } else {
                                i19 = 524288;
                            }
                            i12 |= i19;
                        }
                        if ((599185 & i12) != 599184) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        if (c1086gP.C(i12 & 1, z10)) {
                            if (i20 != 0) {
                                hVar3 = androidx.compose.ui.h.a.f13984b;
                            } else {
                                hVar3 = hVar2;
                            }
                            if (i13 != 0) {
                                mVarB = EnterExitTransitionKt.d(null, 15).b(EnterExitTransitionKt.e(null, 0.0f, 3));
                            }
                            if (i15 != 0) {
                                oVarB = EnterExitTransitionKt.k().b(EnterExitTransitionKt.f(null, 3));
                            } else {
                                oVarB = oVar2;
                            }
                            if (i17 != 0) {
                                str4 = "AnimatedVisibility";
                            } else {
                                str4 = str2;
                            }
                            int i21 = i12 >> 3;
                            f(TransitionKt.e(k10, str4, c1086gP, (i21 & 14) | ((i12 >> 12) & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle)), new Ia.l<Boolean, Boolean>() { // from class: androidx.compose.animation.AnimatedVisibilityKt$AnimatedVisibility$11
                                @Override // Ia.l
                                public final Boolean invoke(Boolean bool) {
                                    Boolean bool2 = bool;
                                    bool2.booleanValue();
                                    return bool2;
                                }
                            }, hVar3, mVarB, oVarB, qVar, c1086gP, (i12 & 57344) | (i12 & 896) | 48 | (i12 & 7168) | (i21 & 458752));
                            String str5 = str4;
                            oVar3 = oVarB;
                            mVar2 = mVarB;
                            str3 = str5;
                        } else {
                            c1086gP.w();
                            hVar3 = hVar2;
                            mVar2 = mVarB;
                            oVar3 = oVar2;
                            str3 = str2;
                        }
                        c1105p0V = c1086gP.V();
                        if (c1105p0V != null) {
                            c1105p0V.f13109d = new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.animation.AnimatedVisibilityKt$AnimatedVisibility$12
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                /* JADX WARN: Multi-variable type inference failed */
                                {
                                    super(2);
                                }

                                @Override // Ia.p
                                public final p293xa.r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                                    num.intValue();
                                    AnimatedVisibilityKt.c(interfaceC0954n, k10, hVar3, mVar2, oVar3, str3, qVar, interfaceC1084f2, L4.b.l(i10 | 1), i11);
                                    return p293xa.r.f47939a;
                                }
                            };
                        }
                    }
                    i12 |= 196608;
                    str2 = str;
                    if ((i11 & 32) != 0) {
                        i12 |= 1572864;
                    } else if ((i10 & 1572864) == 0) {
                        if (c1086gP.k(qVar)) {
                            i19 = 1048576;
                        } else {
                            i19 = 524288;
                        }
                        i12 |= i19;
                    }
                    if ((599185 & i12) != 599184) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    if (c1086gP.C(i12 & 1, z10)) {
                        if (i20 != 0) {
                            hVar3 = androidx.compose.ui.h.a.f13984b;
                        } else {
                            hVar3 = hVar2;
                        }
                        if (i13 != 0) {
                            mVarB = EnterExitTransitionKt.d(null, 15).b(EnterExitTransitionKt.e(null, 0.0f, 3));
                        }
                        if (i15 != 0) {
                            oVarB = EnterExitTransitionKt.k().b(EnterExitTransitionKt.f(null, 3));
                        } else {
                            oVarB = oVar2;
                        }
                        if (i17 != 0) {
                            str4 = "AnimatedVisibility";
                        } else {
                            str4 = str2;
                        }
                        int i22 = i12 >> 3;
                        f(TransitionKt.e(k10, str4, c1086gP, (i22 & 14) | ((i12 >> 12) & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle)), new Ia.l<Boolean, Boolean>() { // from class: androidx.compose.animation.AnimatedVisibilityKt$AnimatedVisibility$11
                            @Override // Ia.l
                            public final Boolean invoke(Boolean bool) {
                                Boolean bool2 = bool;
                                bool2.booleanValue();
                                return bool2;
                            }
                        }, hVar3, mVarB, oVarB, qVar, c1086gP, (i12 & 57344) | (i12 & 896) | 48 | (i12 & 7168) | (i22 & 458752));
                        String str6 = str4;
                        oVar3 = oVarB;
                        mVar2 = mVarB;
                        str3 = str6;
                    } else {
                        c1086gP.w();
                        hVar3 = hVar2;
                        mVar2 = mVarB;
                        oVar3 = oVar2;
                        str3 = str2;
                    }
                    c1105p0V = c1086gP.V();
                    if (c1105p0V != null) {
                        c1105p0V.f13109d = new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.animation.AnimatedVisibilityKt$AnimatedVisibility$12
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            /* JADX WARN: Multi-variable type inference failed */
                            {
                                super(2);
                            }

                            @Override // Ia.p
                            public final p293xa.r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                                num.intValue();
                                AnimatedVisibilityKt.c(interfaceC0954n, k10, hVar3, mVar2, oVar3, str3, qVar, interfaceC1084f2, L4.b.l(i10 | 1), i11);
                                return p293xa.r.f47939a;
                            }
                        };
                    }
                }
                i12 |= 24576;
                oVar2 = oVar;
                i17 = i11 & 16;
                if (i17 != 0) {
                    if ((196608 & i10) == 0) {
                        str2 = str;
                        if (c1086gP.K(str2)) {
                            i18 = 131072;
                        } else {
                            i18 = 65536;
                        }
                        i12 |= i18;
                    }
                    if ((i11 & 32) != 0) {
                        i12 |= 1572864;
                    } else if ((i10 & 1572864) == 0) {
                        if (c1086gP.k(qVar)) {
                            i19 = 1048576;
                        } else {
                            i19 = 524288;
                        }
                        i12 |= i19;
                    }
                    if ((599185 & i12) != 599184) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    if (c1086gP.C(i12 & 1, z10)) {
                        if (i20 != 0) {
                            hVar3 = androidx.compose.ui.h.a.f13984b;
                        } else {
                            hVar3 = hVar2;
                        }
                        if (i13 != 0) {
                            mVarB = EnterExitTransitionKt.d(null, 15).b(EnterExitTransitionKt.e(null, 0.0f, 3));
                        }
                        if (i15 != 0) {
                            oVarB = EnterExitTransitionKt.k().b(EnterExitTransitionKt.f(null, 3));
                        } else {
                            oVarB = oVar2;
                        }
                        if (i17 != 0) {
                            str4 = "AnimatedVisibility";
                        } else {
                            str4 = str2;
                        }
                        int i23 = i12 >> 3;
                        f(TransitionKt.e(k10, str4, c1086gP, (i23 & 14) | ((i12 >> 12) & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle)), new Ia.l<Boolean, Boolean>() { // from class: androidx.compose.animation.AnimatedVisibilityKt$AnimatedVisibility$11
                            @Override // Ia.l
                            public final Boolean invoke(Boolean bool) {
                                Boolean bool2 = bool;
                                bool2.booleanValue();
                                return bool2;
                            }
                        }, hVar3, mVarB, oVarB, qVar, c1086gP, (i12 & 57344) | (i12 & 896) | 48 | (i12 & 7168) | (i23 & 458752));
                        String str7 = str4;
                        oVar3 = oVarB;
                        mVar2 = mVarB;
                        str3 = str7;
                    } else {
                        c1086gP.w();
                        hVar3 = hVar2;
                        mVar2 = mVarB;
                        oVar3 = oVar2;
                        str3 = str2;
                    }
                    c1105p0V = c1086gP.V();
                    if (c1105p0V != null) {
                        c1105p0V.f13109d = new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.animation.AnimatedVisibilityKt$AnimatedVisibility$12
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            /* JADX WARN: Multi-variable type inference failed */
                            {
                                super(2);
                            }

                            @Override // Ia.p
                            public final p293xa.r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                                num.intValue();
                                AnimatedVisibilityKt.c(interfaceC0954n, k10, hVar3, mVar2, oVar3, str3, qVar, interfaceC1084f2, L4.b.l(i10 | 1), i11);
                                return p293xa.r.f47939a;
                            }
                        };
                    }
                }
                i12 |= 196608;
                str2 = str;
                if ((i11 & 32) != 0) {
                    i12 |= 1572864;
                } else if ((i10 & 1572864) == 0) {
                    if (c1086gP.k(qVar)) {
                        i19 = 1048576;
                    } else {
                        i19 = 524288;
                    }
                    i12 |= i19;
                }
                if ((599185 & i12) != 599184) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (c1086gP.C(i12 & 1, z10)) {
                    if (i20 != 0) {
                        hVar3 = androidx.compose.ui.h.a.f13984b;
                    } else {
                        hVar3 = hVar2;
                    }
                    if (i13 != 0) {
                        mVarB = EnterExitTransitionKt.d(null, 15).b(EnterExitTransitionKt.e(null, 0.0f, 3));
                    }
                    if (i15 != 0) {
                        oVarB = EnterExitTransitionKt.k().b(EnterExitTransitionKt.f(null, 3));
                    } else {
                        oVarB = oVar2;
                    }
                    if (i17 != 0) {
                        str4 = "AnimatedVisibility";
                    } else {
                        str4 = str2;
                    }
                    int i24 = i12 >> 3;
                    f(TransitionKt.e(k10, str4, c1086gP, (i24 & 14) | ((i12 >> 12) & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle)), new Ia.l<Boolean, Boolean>() { // from class: androidx.compose.animation.AnimatedVisibilityKt$AnimatedVisibility$11
                        @Override // Ia.l
                        public final Boolean invoke(Boolean bool) {
                            Boolean bool2 = bool;
                            bool2.booleanValue();
                            return bool2;
                        }
                    }, hVar3, mVarB, oVarB, qVar, c1086gP, (i12 & 57344) | (i12 & 896) | 48 | (i12 & 7168) | (i24 & 458752));
                    String str8 = str4;
                    oVar3 = oVarB;
                    mVar2 = mVarB;
                    str3 = str8;
                } else {
                    c1086gP.w();
                    hVar3 = hVar2;
                    mVar2 = mVarB;
                    oVar3 = oVar2;
                    str3 = str2;
                }
                c1105p0V = c1086gP.V();
                if (c1105p0V != null) {
                    c1105p0V.f13109d = new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.animation.AnimatedVisibilityKt$AnimatedVisibility$12
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        /* JADX WARN: Multi-variable type inference failed */
                        {
                            super(2);
                        }

                        @Override // Ia.p
                        public final p293xa.r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                            num.intValue();
                            AnimatedVisibilityKt.c(interfaceC0954n, k10, hVar3, mVar2, oVar3, str3, qVar, interfaceC1084f2, L4.b.l(i10 | 1), i11);
                            return p293xa.r.f47939a;
                        }
                    };
                }
            }
            i12 |= 3072;
            mVarB = mVar;
            i15 = i11 & 8;
            if (i15 != 0) {
                if ((i10 & 24576) == 0) {
                    oVar2 = oVar;
                    if (c1086gP.K(oVar2)) {
                        i16 = 16384;
                    } else {
                        i16 = 8192;
                    }
                    i12 |= i16;
                }
                i17 = i11 & 16;
                if (i17 != 0) {
                    if ((196608 & i10) == 0) {
                        str2 = str;
                        if (c1086gP.K(str2)) {
                            i18 = 131072;
                        } else {
                            i18 = 65536;
                        }
                        i12 |= i18;
                    }
                    if ((i11 & 32) != 0) {
                        i12 |= 1572864;
                    } else if ((i10 & 1572864) == 0) {
                        if (c1086gP.k(qVar)) {
                            i19 = 1048576;
                        } else {
                            i19 = 524288;
                        }
                        i12 |= i19;
                    }
                    if ((599185 & i12) != 599184) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    if (c1086gP.C(i12 & 1, z10)) {
                        if (i20 != 0) {
                            hVar3 = androidx.compose.ui.h.a.f13984b;
                        } else {
                            hVar3 = hVar2;
                        }
                        if (i13 != 0) {
                            mVarB = EnterExitTransitionKt.d(null, 15).b(EnterExitTransitionKt.e(null, 0.0f, 3));
                        }
                        if (i15 != 0) {
                            oVarB = EnterExitTransitionKt.k().b(EnterExitTransitionKt.f(null, 3));
                        } else {
                            oVarB = oVar2;
                        }
                        if (i17 != 0) {
                            str4 = "AnimatedVisibility";
                        } else {
                            str4 = str2;
                        }
                        int i25 = i12 >> 3;
                        f(TransitionKt.e(k10, str4, c1086gP, (i25 & 14) | ((i12 >> 12) & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle)), new Ia.l<Boolean, Boolean>() { // from class: androidx.compose.animation.AnimatedVisibilityKt$AnimatedVisibility$11
                            @Override // Ia.l
                            public final Boolean invoke(Boolean bool) {
                                Boolean bool2 = bool;
                                bool2.booleanValue();
                                return bool2;
                            }
                        }, hVar3, mVarB, oVarB, qVar, c1086gP, (i12 & 57344) | (i12 & 896) | 48 | (i12 & 7168) | (i25 & 458752));
                        String str9 = str4;
                        oVar3 = oVarB;
                        mVar2 = mVarB;
                        str3 = str9;
                    } else {
                        c1086gP.w();
                        hVar3 = hVar2;
                        mVar2 = mVarB;
                        oVar3 = oVar2;
                        str3 = str2;
                    }
                    c1105p0V = c1086gP.V();
                    if (c1105p0V != null) {
                        c1105p0V.f13109d = new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.animation.AnimatedVisibilityKt$AnimatedVisibility$12
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            /* JADX WARN: Multi-variable type inference failed */
                            {
                                super(2);
                            }

                            @Override // Ia.p
                            public final p293xa.r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                                num.intValue();
                                AnimatedVisibilityKt.c(interfaceC0954n, k10, hVar3, mVar2, oVar3, str3, qVar, interfaceC1084f2, L4.b.l(i10 | 1), i11);
                                return p293xa.r.f47939a;
                            }
                        };
                    }
                }
                i12 |= 196608;
                str2 = str;
                if ((i11 & 32) != 0) {
                    i12 |= 1572864;
                } else if ((i10 & 1572864) == 0) {
                    if (c1086gP.k(qVar)) {
                        i19 = 1048576;
                    } else {
                        i19 = 524288;
                    }
                    i12 |= i19;
                }
                if ((599185 & i12) != 599184) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (c1086gP.C(i12 & 1, z10)) {
                    if (i20 != 0) {
                        hVar3 = androidx.compose.ui.h.a.f13984b;
                    } else {
                        hVar3 = hVar2;
                    }
                    if (i13 != 0) {
                        mVarB = EnterExitTransitionKt.d(null, 15).b(EnterExitTransitionKt.e(null, 0.0f, 3));
                    }
                    if (i15 != 0) {
                        oVarB = EnterExitTransitionKt.k().b(EnterExitTransitionKt.f(null, 3));
                    } else {
                        oVarB = oVar2;
                    }
                    if (i17 != 0) {
                        str4 = "AnimatedVisibility";
                    } else {
                        str4 = str2;
                    }
                    int i26 = i12 >> 3;
                    f(TransitionKt.e(k10, str4, c1086gP, (i26 & 14) | ((i12 >> 12) & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle)), new Ia.l<Boolean, Boolean>() { // from class: androidx.compose.animation.AnimatedVisibilityKt$AnimatedVisibility$11
                        @Override // Ia.l
                        public final Boolean invoke(Boolean bool) {
                            Boolean bool2 = bool;
                            bool2.booleanValue();
                            return bool2;
                        }
                    }, hVar3, mVarB, oVarB, qVar, c1086gP, (i12 & 57344) | (i12 & 896) | 48 | (i12 & 7168) | (i26 & 458752));
                    String str10 = str4;
                    oVar3 = oVarB;
                    mVar2 = mVarB;
                    str3 = str10;
                } else {
                    c1086gP.w();
                    hVar3 = hVar2;
                    mVar2 = mVarB;
                    oVar3 = oVar2;
                    str3 = str2;
                }
                c1105p0V = c1086gP.V();
                if (c1105p0V != null) {
                    c1105p0V.f13109d = new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.animation.AnimatedVisibilityKt$AnimatedVisibility$12
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        /* JADX WARN: Multi-variable type inference failed */
                        {
                            super(2);
                        }

                        @Override // Ia.p
                        public final p293xa.r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                            num.intValue();
                            AnimatedVisibilityKt.c(interfaceC0954n, k10, hVar3, mVar2, oVar3, str3, qVar, interfaceC1084f2, L4.b.l(i10 | 1), i11);
                            return p293xa.r.f47939a;
                        }
                    };
                }
            }
            i12 |= 24576;
            oVar2 = oVar;
            i17 = i11 & 16;
            if (i17 != 0) {
                if ((196608 & i10) == 0) {
                    str2 = str;
                    if (c1086gP.K(str2)) {
                        i18 = 131072;
                    } else {
                        i18 = 65536;
                    }
                    i12 |= i18;
                }
                if ((i11 & 32) != 0) {
                    i12 |= 1572864;
                } else if ((i10 & 1572864) == 0) {
                    if (c1086gP.k(qVar)) {
                        i19 = 1048576;
                    } else {
                        i19 = 524288;
                    }
                    i12 |= i19;
                }
                if ((599185 & i12) != 599184) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (c1086gP.C(i12 & 1, z10)) {
                    if (i20 != 0) {
                        hVar3 = androidx.compose.ui.h.a.f13984b;
                    } else {
                        hVar3 = hVar2;
                    }
                    if (i13 != 0) {
                        mVarB = EnterExitTransitionKt.d(null, 15).b(EnterExitTransitionKt.e(null, 0.0f, 3));
                    }
                    if (i15 != 0) {
                        oVarB = EnterExitTransitionKt.k().b(EnterExitTransitionKt.f(null, 3));
                    } else {
                        oVarB = oVar2;
                    }
                    if (i17 != 0) {
                        str4 = "AnimatedVisibility";
                    } else {
                        str4 = str2;
                    }
                    int i27 = i12 >> 3;
                    f(TransitionKt.e(k10, str4, c1086gP, (i27 & 14) | ((i12 >> 12) & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle)), new Ia.l<Boolean, Boolean>() { // from class: androidx.compose.animation.AnimatedVisibilityKt$AnimatedVisibility$11
                        @Override // Ia.l
                        public final Boolean invoke(Boolean bool) {
                            Boolean bool2 = bool;
                            bool2.booleanValue();
                            return bool2;
                        }
                    }, hVar3, mVarB, oVarB, qVar, c1086gP, (i12 & 57344) | (i12 & 896) | 48 | (i12 & 7168) | (i27 & 458752));
                    String str11 = str4;
                    oVar3 = oVarB;
                    mVar2 = mVarB;
                    str3 = str11;
                } else {
                    c1086gP.w();
                    hVar3 = hVar2;
                    mVar2 = mVarB;
                    oVar3 = oVar2;
                    str3 = str2;
                }
                c1105p0V = c1086gP.V();
                if (c1105p0V != null) {
                    c1105p0V.f13109d = new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.animation.AnimatedVisibilityKt$AnimatedVisibility$12
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        /* JADX WARN: Multi-variable type inference failed */
                        {
                            super(2);
                        }

                        @Override // Ia.p
                        public final p293xa.r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                            num.intValue();
                            AnimatedVisibilityKt.c(interfaceC0954n, k10, hVar3, mVar2, oVar3, str3, qVar, interfaceC1084f2, L4.b.l(i10 | 1), i11);
                            return p293xa.r.f47939a;
                        }
                    };
                }
            }
            i12 |= 196608;
            str2 = str;
            if ((i11 & 32) != 0) {
                i12 |= 1572864;
            } else if ((i10 & 1572864) == 0) {
                if (c1086gP.k(qVar)) {
                    i19 = 1048576;
                } else {
                    i19 = 524288;
                }
                i12 |= i19;
            }
            if ((599185 & i12) != 599184) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (c1086gP.C(i12 & 1, z10)) {
                if (i20 != 0) {
                    hVar3 = androidx.compose.ui.h.a.f13984b;
                } else {
                    hVar3 = hVar2;
                }
                if (i13 != 0) {
                    mVarB = EnterExitTransitionKt.d(null, 15).b(EnterExitTransitionKt.e(null, 0.0f, 3));
                }
                if (i15 != 0) {
                    oVarB = EnterExitTransitionKt.k().b(EnterExitTransitionKt.f(null, 3));
                } else {
                    oVarB = oVar2;
                }
                if (i17 != 0) {
                    str4 = "AnimatedVisibility";
                } else {
                    str4 = str2;
                }
                int i28 = i12 >> 3;
                f(TransitionKt.e(k10, str4, c1086gP, (i28 & 14) | ((i12 >> 12) & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle)), new Ia.l<Boolean, Boolean>() { // from class: androidx.compose.animation.AnimatedVisibilityKt$AnimatedVisibility$11
                    @Override // Ia.l
                    public final Boolean invoke(Boolean bool) {
                        Boolean bool2 = bool;
                        bool2.booleanValue();
                        return bool2;
                    }
                }, hVar3, mVarB, oVarB, qVar, c1086gP, (i12 & 57344) | (i12 & 896) | 48 | (i12 & 7168) | (i28 & 458752));
                String str12 = str4;
                oVar3 = oVarB;
                mVar2 = mVarB;
                str3 = str12;
            } else {
                c1086gP.w();
                hVar3 = hVar2;
                mVar2 = mVarB;
                oVar3 = oVar2;
                str3 = str2;
            }
            c1105p0V = c1086gP.V();
            if (c1105p0V != null) {
                c1105p0V.f13109d = new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.animation.AnimatedVisibilityKt$AnimatedVisibility$12
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(2);
                    }

                    @Override // Ia.p
                    public final p293xa.r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                        num.intValue();
                        AnimatedVisibilityKt.c(interfaceC0954n, k10, hVar3, mVar2, oVar3, str3, qVar, interfaceC1084f2, L4.b.l(i10 | 1), i11);
                        return p293xa.r.f47939a;
                    }
                };
            }
        }
        i12 |= 384;
        hVar2 = hVar;
        i13 = i11 & 4;
        if (i13 != 0) {
            if ((i10 & 3072) == 0) {
                mVarB = mVar;
                if (c1086gP.K(mVarB)) {
                    i14 = 2048;
                } else {
                    i14 = 1024;
                }
                i12 |= i14;
            }
            i15 = i11 & 8;
            if (i15 != 0) {
                if ((i10 & 24576) == 0) {
                    oVar2 = oVar;
                    if (c1086gP.K(oVar2)) {
                        i16 = 16384;
                    } else {
                        i16 = 8192;
                    }
                    i12 |= i16;
                }
                i17 = i11 & 16;
                if (i17 != 0) {
                    if ((196608 & i10) == 0) {
                        str2 = str;
                        if (c1086gP.K(str2)) {
                            i18 = 131072;
                        } else {
                            i18 = 65536;
                        }
                        i12 |= i18;
                    }
                    if ((i11 & 32) != 0) {
                        i12 |= 1572864;
                    } else if ((i10 & 1572864) == 0) {
                        if (c1086gP.k(qVar)) {
                            i19 = 1048576;
                        } else {
                            i19 = 524288;
                        }
                        i12 |= i19;
                    }
                    if ((599185 & i12) != 599184) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    if (c1086gP.C(i12 & 1, z10)) {
                        if (i20 != 0) {
                            hVar3 = androidx.compose.ui.h.a.f13984b;
                        } else {
                            hVar3 = hVar2;
                        }
                        if (i13 != 0) {
                            mVarB = EnterExitTransitionKt.d(null, 15).b(EnterExitTransitionKt.e(null, 0.0f, 3));
                        }
                        if (i15 != 0) {
                            oVarB = EnterExitTransitionKt.k().b(EnterExitTransitionKt.f(null, 3));
                        } else {
                            oVarB = oVar2;
                        }
                        if (i17 != 0) {
                            str4 = "AnimatedVisibility";
                        } else {
                            str4 = str2;
                        }
                        int i29 = i12 >> 3;
                        f(TransitionKt.e(k10, str4, c1086gP, (i29 & 14) | ((i12 >> 12) & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle)), new Ia.l<Boolean, Boolean>() { // from class: androidx.compose.animation.AnimatedVisibilityKt$AnimatedVisibility$11
                            @Override // Ia.l
                            public final Boolean invoke(Boolean bool) {
                                Boolean bool2 = bool;
                                bool2.booleanValue();
                                return bool2;
                            }
                        }, hVar3, mVarB, oVarB, qVar, c1086gP, (i12 & 57344) | (i12 & 896) | 48 | (i12 & 7168) | (i29 & 458752));
                        String str13 = str4;
                        oVar3 = oVarB;
                        mVar2 = mVarB;
                        str3 = str13;
                    } else {
                        c1086gP.w();
                        hVar3 = hVar2;
                        mVar2 = mVarB;
                        oVar3 = oVar2;
                        str3 = str2;
                    }
                    c1105p0V = c1086gP.V();
                    if (c1105p0V != null) {
                        c1105p0V.f13109d = new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.animation.AnimatedVisibilityKt$AnimatedVisibility$12
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            /* JADX WARN: Multi-variable type inference failed */
                            {
                                super(2);
                            }

                            @Override // Ia.p
                            public final p293xa.r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                                num.intValue();
                                AnimatedVisibilityKt.c(interfaceC0954n, k10, hVar3, mVar2, oVar3, str3, qVar, interfaceC1084f2, L4.b.l(i10 | 1), i11);
                                return p293xa.r.f47939a;
                            }
                        };
                    }
                }
                i12 |= 196608;
                str2 = str;
                if ((i11 & 32) != 0) {
                    i12 |= 1572864;
                } else if ((i10 & 1572864) == 0) {
                    if (c1086gP.k(qVar)) {
                        i19 = 1048576;
                    } else {
                        i19 = 524288;
                    }
                    i12 |= i19;
                }
                if ((599185 & i12) != 599184) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (c1086gP.C(i12 & 1, z10)) {
                    if (i20 != 0) {
                        hVar3 = androidx.compose.ui.h.a.f13984b;
                    } else {
                        hVar3 = hVar2;
                    }
                    if (i13 != 0) {
                        mVarB = EnterExitTransitionKt.d(null, 15).b(EnterExitTransitionKt.e(null, 0.0f, 3));
                    }
                    if (i15 != 0) {
                        oVarB = EnterExitTransitionKt.k().b(EnterExitTransitionKt.f(null, 3));
                    } else {
                        oVarB = oVar2;
                    }
                    if (i17 != 0) {
                        str4 = "AnimatedVisibility";
                    } else {
                        str4 = str2;
                    }
                    int i210 = i12 >> 3;
                    f(TransitionKt.e(k10, str4, c1086gP, (i210 & 14) | ((i12 >> 12) & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle)), new Ia.l<Boolean, Boolean>() { // from class: androidx.compose.animation.AnimatedVisibilityKt$AnimatedVisibility$11
                        @Override // Ia.l
                        public final Boolean invoke(Boolean bool) {
                            Boolean bool2 = bool;
                            bool2.booleanValue();
                            return bool2;
                        }
                    }, hVar3, mVarB, oVarB, qVar, c1086gP, (i12 & 57344) | (i12 & 896) | 48 | (i12 & 7168) | (i210 & 458752));
                    String str14 = str4;
                    oVar3 = oVarB;
                    mVar2 = mVarB;
                    str3 = str14;
                } else {
                    c1086gP.w();
                    hVar3 = hVar2;
                    mVar2 = mVarB;
                    oVar3 = oVar2;
                    str3 = str2;
                }
                c1105p0V = c1086gP.V();
                if (c1105p0V != null) {
                    c1105p0V.f13109d = new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.animation.AnimatedVisibilityKt$AnimatedVisibility$12
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        /* JADX WARN: Multi-variable type inference failed */
                        {
                            super(2);
                        }

                        @Override // Ia.p
                        public final p293xa.r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                            num.intValue();
                            AnimatedVisibilityKt.c(interfaceC0954n, k10, hVar3, mVar2, oVar3, str3, qVar, interfaceC1084f2, L4.b.l(i10 | 1), i11);
                            return p293xa.r.f47939a;
                        }
                    };
                }
            }
            i12 |= 24576;
            oVar2 = oVar;
            i17 = i11 & 16;
            if (i17 != 0) {
                if ((196608 & i10) == 0) {
                    str2 = str;
                    if (c1086gP.K(str2)) {
                        i18 = 131072;
                    } else {
                        i18 = 65536;
                    }
                    i12 |= i18;
                }
                if ((i11 & 32) != 0) {
                    i12 |= 1572864;
                } else if ((i10 & 1572864) == 0) {
                    if (c1086gP.k(qVar)) {
                        i19 = 1048576;
                    } else {
                        i19 = 524288;
                    }
                    i12 |= i19;
                }
                if ((599185 & i12) != 599184) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (c1086gP.C(i12 & 1, z10)) {
                    if (i20 != 0) {
                        hVar3 = androidx.compose.ui.h.a.f13984b;
                    } else {
                        hVar3 = hVar2;
                    }
                    if (i13 != 0) {
                        mVarB = EnterExitTransitionKt.d(null, 15).b(EnterExitTransitionKt.e(null, 0.0f, 3));
                    }
                    if (i15 != 0) {
                        oVarB = EnterExitTransitionKt.k().b(EnterExitTransitionKt.f(null, 3));
                    } else {
                        oVarB = oVar2;
                    }
                    if (i17 != 0) {
                        str4 = "AnimatedVisibility";
                    } else {
                        str4 = str2;
                    }
                    int i211 = i12 >> 3;
                    f(TransitionKt.e(k10, str4, c1086gP, (i211 & 14) | ((i12 >> 12) & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle)), new Ia.l<Boolean, Boolean>() { // from class: androidx.compose.animation.AnimatedVisibilityKt$AnimatedVisibility$11
                        @Override // Ia.l
                        public final Boolean invoke(Boolean bool) {
                            Boolean bool2 = bool;
                            bool2.booleanValue();
                            return bool2;
                        }
                    }, hVar3, mVarB, oVarB, qVar, c1086gP, (i12 & 57344) | (i12 & 896) | 48 | (i12 & 7168) | (i211 & 458752));
                    String str15 = str4;
                    oVar3 = oVarB;
                    mVar2 = mVarB;
                    str3 = str15;
                } else {
                    c1086gP.w();
                    hVar3 = hVar2;
                    mVar2 = mVarB;
                    oVar3 = oVar2;
                    str3 = str2;
                }
                c1105p0V = c1086gP.V();
                if (c1105p0V != null) {
                    c1105p0V.f13109d = new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.animation.AnimatedVisibilityKt$AnimatedVisibility$12
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        /* JADX WARN: Multi-variable type inference failed */
                        {
                            super(2);
                        }

                        @Override // Ia.p
                        public final p293xa.r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                            num.intValue();
                            AnimatedVisibilityKt.c(interfaceC0954n, k10, hVar3, mVar2, oVar3, str3, qVar, interfaceC1084f2, L4.b.l(i10 | 1), i11);
                            return p293xa.r.f47939a;
                        }
                    };
                }
            }
            i12 |= 196608;
            str2 = str;
            if ((i11 & 32) != 0) {
                i12 |= 1572864;
            } else if ((i10 & 1572864) == 0) {
                if (c1086gP.k(qVar)) {
                    i19 = 1048576;
                } else {
                    i19 = 524288;
                }
                i12 |= i19;
            }
            if ((599185 & i12) != 599184) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (c1086gP.C(i12 & 1, z10)) {
                if (i20 != 0) {
                    hVar3 = androidx.compose.ui.h.a.f13984b;
                } else {
                    hVar3 = hVar2;
                }
                if (i13 != 0) {
                    mVarB = EnterExitTransitionKt.d(null, 15).b(EnterExitTransitionKt.e(null, 0.0f, 3));
                }
                if (i15 != 0) {
                    oVarB = EnterExitTransitionKt.k().b(EnterExitTransitionKt.f(null, 3));
                } else {
                    oVarB = oVar2;
                }
                if (i17 != 0) {
                    str4 = "AnimatedVisibility";
                } else {
                    str4 = str2;
                }
                int i212 = i12 >> 3;
                f(TransitionKt.e(k10, str4, c1086gP, (i212 & 14) | ((i12 >> 12) & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle)), new Ia.l<Boolean, Boolean>() { // from class: androidx.compose.animation.AnimatedVisibilityKt$AnimatedVisibility$11
                    @Override // Ia.l
                    public final Boolean invoke(Boolean bool) {
                        Boolean bool2 = bool;
                        bool2.booleanValue();
                        return bool2;
                    }
                }, hVar3, mVarB, oVarB, qVar, c1086gP, (i12 & 57344) | (i12 & 896) | 48 | (i12 & 7168) | (i212 & 458752));
                String str16 = str4;
                oVar3 = oVarB;
                mVar2 = mVarB;
                str3 = str16;
            } else {
                c1086gP.w();
                hVar3 = hVar2;
                mVar2 = mVarB;
                oVar3 = oVar2;
                str3 = str2;
            }
            c1105p0V = c1086gP.V();
            if (c1105p0V != null) {
                c1105p0V.f13109d = new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.animation.AnimatedVisibilityKt$AnimatedVisibility$12
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(2);
                    }

                    @Override // Ia.p
                    public final p293xa.r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                        num.intValue();
                        AnimatedVisibilityKt.c(interfaceC0954n, k10, hVar3, mVar2, oVar3, str3, qVar, interfaceC1084f2, L4.b.l(i10 | 1), i11);
                        return p293xa.r.f47939a;
                    }
                };
            }
        }
        i12 |= 3072;
        mVarB = mVar;
        i15 = i11 & 8;
        if (i15 != 0) {
            if ((i10 & 24576) == 0) {
                oVar2 = oVar;
                if (c1086gP.K(oVar2)) {
                    i16 = 16384;
                } else {
                    i16 = 8192;
                }
                i12 |= i16;
            }
            i17 = i11 & 16;
            if (i17 != 0) {
                if ((196608 & i10) == 0) {
                    str2 = str;
                    if (c1086gP.K(str2)) {
                        i18 = 131072;
                    } else {
                        i18 = 65536;
                    }
                    i12 |= i18;
                }
                if ((i11 & 32) != 0) {
                    i12 |= 1572864;
                } else if ((i10 & 1572864) == 0) {
                    if (c1086gP.k(qVar)) {
                        i19 = 1048576;
                    } else {
                        i19 = 524288;
                    }
                    i12 |= i19;
                }
                if ((599185 & i12) != 599184) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (c1086gP.C(i12 & 1, z10)) {
                    if (i20 != 0) {
                        hVar3 = androidx.compose.ui.h.a.f13984b;
                    } else {
                        hVar3 = hVar2;
                    }
                    if (i13 != 0) {
                        mVarB = EnterExitTransitionKt.d(null, 15).b(EnterExitTransitionKt.e(null, 0.0f, 3));
                    }
                    if (i15 != 0) {
                        oVarB = EnterExitTransitionKt.k().b(EnterExitTransitionKt.f(null, 3));
                    } else {
                        oVarB = oVar2;
                    }
                    if (i17 != 0) {
                        str4 = "AnimatedVisibility";
                    } else {
                        str4 = str2;
                    }
                    int i213 = i12 >> 3;
                    f(TransitionKt.e(k10, str4, c1086gP, (i213 & 14) | ((i12 >> 12) & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle)), new Ia.l<Boolean, Boolean>() { // from class: androidx.compose.animation.AnimatedVisibilityKt$AnimatedVisibility$11
                        @Override // Ia.l
                        public final Boolean invoke(Boolean bool) {
                            Boolean bool2 = bool;
                            bool2.booleanValue();
                            return bool2;
                        }
                    }, hVar3, mVarB, oVarB, qVar, c1086gP, (i12 & 57344) | (i12 & 896) | 48 | (i12 & 7168) | (i213 & 458752));
                    String str17 = str4;
                    oVar3 = oVarB;
                    mVar2 = mVarB;
                    str3 = str17;
                } else {
                    c1086gP.w();
                    hVar3 = hVar2;
                    mVar2 = mVarB;
                    oVar3 = oVar2;
                    str3 = str2;
                }
                c1105p0V = c1086gP.V();
                if (c1105p0V != null) {
                    c1105p0V.f13109d = new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.animation.AnimatedVisibilityKt$AnimatedVisibility$12
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        /* JADX WARN: Multi-variable type inference failed */
                        {
                            super(2);
                        }

                        @Override // Ia.p
                        public final p293xa.r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                            num.intValue();
                            AnimatedVisibilityKt.c(interfaceC0954n, k10, hVar3, mVar2, oVar3, str3, qVar, interfaceC1084f2, L4.b.l(i10 | 1), i11);
                            return p293xa.r.f47939a;
                        }
                    };
                }
            }
            i12 |= 196608;
            str2 = str;
            if ((i11 & 32) != 0) {
                i12 |= 1572864;
            } else if ((i10 & 1572864) == 0) {
                if (c1086gP.k(qVar)) {
                    i19 = 1048576;
                } else {
                    i19 = 524288;
                }
                i12 |= i19;
            }
            if ((599185 & i12) != 599184) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (c1086gP.C(i12 & 1, z10)) {
                if (i20 != 0) {
                    hVar3 = androidx.compose.ui.h.a.f13984b;
                } else {
                    hVar3 = hVar2;
                }
                if (i13 != 0) {
                    mVarB = EnterExitTransitionKt.d(null, 15).b(EnterExitTransitionKt.e(null, 0.0f, 3));
                }
                if (i15 != 0) {
                    oVarB = EnterExitTransitionKt.k().b(EnterExitTransitionKt.f(null, 3));
                } else {
                    oVarB = oVar2;
                }
                if (i17 != 0) {
                    str4 = "AnimatedVisibility";
                } else {
                    str4 = str2;
                }
                int i214 = i12 >> 3;
                f(TransitionKt.e(k10, str4, c1086gP, (i214 & 14) | ((i12 >> 12) & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle)), new Ia.l<Boolean, Boolean>() { // from class: androidx.compose.animation.AnimatedVisibilityKt$AnimatedVisibility$11
                    @Override // Ia.l
                    public final Boolean invoke(Boolean bool) {
                        Boolean bool2 = bool;
                        bool2.booleanValue();
                        return bool2;
                    }
                }, hVar3, mVarB, oVarB, qVar, c1086gP, (i12 & 57344) | (i12 & 896) | 48 | (i12 & 7168) | (i214 & 458752));
                String str18 = str4;
                oVar3 = oVarB;
                mVar2 = mVarB;
                str3 = str18;
            } else {
                c1086gP.w();
                hVar3 = hVar2;
                mVar2 = mVarB;
                oVar3 = oVar2;
                str3 = str2;
            }
            c1105p0V = c1086gP.V();
            if (c1105p0V != null) {
                c1105p0V.f13109d = new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.animation.AnimatedVisibilityKt$AnimatedVisibility$12
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(2);
                    }

                    @Override // Ia.p
                    public final p293xa.r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                        num.intValue();
                        AnimatedVisibilityKt.c(interfaceC0954n, k10, hVar3, mVar2, oVar3, str3, qVar, interfaceC1084f2, L4.b.l(i10 | 1), i11);
                        return p293xa.r.f47939a;
                    }
                };
            }
        }
        i12 |= 24576;
        oVar2 = oVar;
        i17 = i11 & 16;
        if (i17 != 0) {
            if ((196608 & i10) == 0) {
                str2 = str;
                if (c1086gP.K(str2)) {
                    i18 = 131072;
                } else {
                    i18 = 65536;
                }
                i12 |= i18;
            }
            if ((i11 & 32) != 0) {
                i12 |= 1572864;
            } else if ((i10 & 1572864) == 0) {
                if (c1086gP.k(qVar)) {
                    i19 = 1048576;
                } else {
                    i19 = 524288;
                }
                i12 |= i19;
            }
            if ((599185 & i12) != 599184) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (c1086gP.C(i12 & 1, z10)) {
                if (i20 != 0) {
                    hVar3 = androidx.compose.ui.h.a.f13984b;
                } else {
                    hVar3 = hVar2;
                }
                if (i13 != 0) {
                    mVarB = EnterExitTransitionKt.d(null, 15).b(EnterExitTransitionKt.e(null, 0.0f, 3));
                }
                if (i15 != 0) {
                    oVarB = EnterExitTransitionKt.k().b(EnterExitTransitionKt.f(null, 3));
                } else {
                    oVarB = oVar2;
                }
                if (i17 != 0) {
                    str4 = "AnimatedVisibility";
                } else {
                    str4 = str2;
                }
                int i215 = i12 >> 3;
                f(TransitionKt.e(k10, str4, c1086gP, (i215 & 14) | ((i12 >> 12) & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle)), new Ia.l<Boolean, Boolean>() { // from class: androidx.compose.animation.AnimatedVisibilityKt$AnimatedVisibility$11
                    @Override // Ia.l
                    public final Boolean invoke(Boolean bool) {
                        Boolean bool2 = bool;
                        bool2.booleanValue();
                        return bool2;
                    }
                }, hVar3, mVarB, oVarB, qVar, c1086gP, (i12 & 57344) | (i12 & 896) | 48 | (i12 & 7168) | (i215 & 458752));
                String str19 = str4;
                oVar3 = oVarB;
                mVar2 = mVarB;
                str3 = str19;
            } else {
                c1086gP.w();
                hVar3 = hVar2;
                mVar2 = mVarB;
                oVar3 = oVar2;
                str3 = str2;
            }
            c1105p0V = c1086gP.V();
            if (c1105p0V != null) {
                c1105p0V.f13109d = new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.animation.AnimatedVisibilityKt$AnimatedVisibility$12
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(2);
                    }

                    @Override // Ia.p
                    public final p293xa.r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                        num.intValue();
                        AnimatedVisibilityKt.c(interfaceC0954n, k10, hVar3, mVar2, oVar3, str3, qVar, interfaceC1084f2, L4.b.l(i10 | 1), i11);
                        return p293xa.r.f47939a;
                    }
                };
            }
        }
        i12 |= 196608;
        str2 = str;
        if ((i11 & 32) != 0) {
            i12 |= 1572864;
        } else if ((i10 & 1572864) == 0) {
            if (c1086gP.k(qVar)) {
                i19 = 1048576;
            } else {
                i19 = 524288;
            }
            i12 |= i19;
        }
        if ((599185 & i12) != 599184) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (c1086gP.C(i12 & 1, z10)) {
            if (i20 != 0) {
                hVar3 = androidx.compose.ui.h.a.f13984b;
            } else {
                hVar3 = hVar2;
            }
            if (i13 != 0) {
                mVarB = EnterExitTransitionKt.d(null, 15).b(EnterExitTransitionKt.e(null, 0.0f, 3));
            }
            if (i15 != 0) {
                oVarB = EnterExitTransitionKt.k().b(EnterExitTransitionKt.f(null, 3));
            } else {
                oVarB = oVar2;
            }
            if (i17 != 0) {
                str4 = "AnimatedVisibility";
            } else {
                str4 = str2;
            }
            int i216 = i12 >> 3;
            f(TransitionKt.e(k10, str4, c1086gP, (i216 & 14) | ((i12 >> 12) & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle)), new Ia.l<Boolean, Boolean>() { // from class: androidx.compose.animation.AnimatedVisibilityKt$AnimatedVisibility$11
                @Override // Ia.l
                public final Boolean invoke(Boolean bool) {
                    Boolean bool2 = bool;
                    bool2.booleanValue();
                    return bool2;
                }
            }, hVar3, mVarB, oVarB, qVar, c1086gP, (i12 & 57344) | (i12 & 896) | 48 | (i12 & 7168) | (i216 & 458752));
            String str110 = str4;
            oVar3 = oVarB;
            mVar2 = mVarB;
            str3 = str110;
        } else {
            c1086gP.w();
            hVar3 = hVar2;
            mVar2 = mVarB;
            oVar3 = oVar2;
            str3 = str2;
        }
        c1105p0V = c1086gP.V();
        if (c1105p0V != null) {
            c1105p0V.f13109d = new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.animation.AnimatedVisibilityKt$AnimatedVisibility$12
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(2);
                }

                @Override // Ia.p
                public final p293xa.r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                    num.intValue();
                    AnimatedVisibilityKt.c(interfaceC0954n, k10, hVar3, mVar2, oVar3, str3, qVar, interfaceC1084f2, L4.b.l(i10 | 1), i11);
                    return p293xa.r.f47939a;
                }
            };
        }
    }

    /* JADX WARN: Code duplicated, block: B:26:0x0047  */
    /* JADX WARN: Code duplicated, block: B:28:0x004c  */
    /* JADX WARN: Code duplicated, block: B:30:0x0050  */
    /* JADX WARN: Code duplicated, block: B:32:0x0058  */
    /* JADX WARN: Code duplicated, block: B:33:0x005b  */
    /* JADX WARN: Code duplicated, block: B:37:0x0062  */
    /* JADX WARN: Code duplicated, block: B:39:0x0067  */
    /* JADX WARN: Code duplicated, block: B:41:0x006b  */
    /* JADX WARN: Code duplicated, block: B:43:0x0073  */
    /* JADX WARN: Code duplicated, block: B:44:0x0076  */
    /* JADX WARN: Code duplicated, block: B:48:0x007f  */
    /* JADX WARN: Code duplicated, block: B:50:0x0083  */
    /* JADX WARN: Code duplicated, block: B:52:0x0086  */
    /* JADX WARN: Code duplicated, block: B:54:0x008e  */
    /* JADX WARN: Code duplicated, block: B:55:0x0091  */
    /* JADX WARN: Code duplicated, block: B:59:0x009a  */
    /* JADX WARN: Code duplicated, block: B:60:0x009e  */
    /* JADX WARN: Code duplicated, block: B:62:0x00a4  */
    /* JADX WARN: Code duplicated, block: B:64:0x00aa  */
    /* JADX WARN: Code duplicated, block: B:65:0x00ad  */
    /* JADX WARN: Code duplicated, block: B:69:0x00ba  */
    /* JADX WARN: Code duplicated, block: B:70:0x00bc  */
    /* JADX WARN: Code duplicated, block: B:73:0x00c5 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:74:0x00c7  */
    /* JADX WARN: Code duplicated, block: B:75:0x00ca  */
    /* JADX WARN: Code duplicated, block: B:78:0x00cf  */
    /* JADX WARN: Code duplicated, block: B:80:0x00e1  */
    /* JADX WARN: Code duplicated, block: B:81:0x00ee  */
    /* JADX WARN: Code duplicated, block: B:83:0x00f1  */
    /* JADX WARN: Code duplicated, block: B:84:0x00f4  */
    /* JADX WARN: Code duplicated, block: B:86:0x012a  */
    /* JADX WARN: Code duplicated, block: B:89:0x0137  */
    /* JADX WARN: Code duplicated, block: B:91:? A[RETURN, SYNTHETIC] */
    public static final void d(final InterfaceC0954n interfaceC0954n, final boolean z10, androidx.compose.ui.h hVar, m mVar, o oVar, String str, final Ia.q<? super InterfaceC0928f, ? super InterfaceC1084f, ? super Integer, p293xa.r> qVar, InterfaceC1084f interfaceC1084f, final int i10, final int i11) {
        int i12;
        androidx.compose.ui.h hVar2;
        int i13;
        m mVarB;
        int i14;
        int i15;
        o oVar2;
        int i16;
        int i17;
        String str2;
        int i18;
        int i19;
        boolean z11;
        final androidx.compose.ui.h hVar3;
        final m mVar2;
        final o oVar3;
        final String str3;
        C1105p0 c1105p0V;
        o oVarB;
        String str4;
        C1086g c1086gP = interfaceC1084f.p(1766503102);
        if ((i11 & 1) != 0) {
            i12 = i10 | 48;
        } else if ((i10 & 48) == 0) {
            i12 = (c1086gP.c(z10) ? 32 : 16) | i10;
        } else {
            i12 = i10;
        }
        int i20 = i11 & 2;
        if (i20 == 0) {
            if ((i10 & 384) == 0) {
                hVar2 = hVar;
                i12 |= c1086gP.K(hVar2) ? 256 : 128;
            }
            i13 = i11 & 4;
            if (i13 != 0) {
                if ((i10 & 3072) == 0) {
                    mVarB = mVar;
                    if (c1086gP.K(mVarB)) {
                        i14 = 2048;
                    } else {
                        i14 = 1024;
                    }
                    i12 |= i14;
                }
                i15 = i11 & 8;
                if (i15 != 0) {
                    if ((i10 & 24576) == 0) {
                        oVar2 = oVar;
                        if (c1086gP.K(oVar2)) {
                            i16 = 16384;
                        } else {
                            i16 = 8192;
                        }
                        i12 |= i16;
                    }
                    i17 = i11 & 16;
                    if (i17 != 0) {
                        if ((196608 & i10) == 0) {
                            str2 = str;
                            if (c1086gP.K(str2)) {
                                i18 = 131072;
                            } else {
                                i18 = 65536;
                            }
                            i12 |= i18;
                        }
                        if ((i11 & 32) != 0) {
                            i12 |= 1572864;
                        } else if ((i10 & 1572864) == 0) {
                            if (c1086gP.k(qVar)) {
                                i19 = 1048576;
                            } else {
                                i19 = 524288;
                            }
                            i12 |= i19;
                        }
                        if ((599185 & i12) != 599184) {
                            z11 = true;
                        } else {
                            z11 = false;
                        }
                        if (c1086gP.C(i12 & 1, z11)) {
                            if (i20 != 0) {
                                hVar3 = androidx.compose.ui.h.a.f13984b;
                            } else {
                                hVar3 = hVar2;
                            }
                            if (i13 != 0) {
                                mVarB = EnterExitTransitionKt.e(null, 0.0f, 3).b(EnterExitTransitionKt.d(null, 15));
                            }
                            if (i15 != 0) {
                                oVarB = EnterExitTransitionKt.f(null, 3).b(EnterExitTransitionKt.k());
                            } else {
                                oVarB = oVar2;
                            }
                            if (i17 != 0) {
                                str4 = "AnimatedVisibility";
                            } else {
                                str4 = str2;
                            }
                            int i21 = i12 >> 3;
                            f(TransitionKt.f(Boolean.valueOf(z10), str4, c1086gP, (i21 & 14) | ((i12 >> 12) & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle), 0), new Ia.l<Boolean, Boolean>() { // from class: androidx.compose.animation.AnimatedVisibilityKt$AnimatedVisibility$5
                                @Override // Ia.l
                                public final Boolean invoke(Boolean bool) {
                                    Boolean bool2 = bool;
                                    bool2.booleanValue();
                                    return bool2;
                                }
                            }, hVar3, mVarB, oVarB, qVar, c1086gP, (i12 & 57344) | (i12 & 896) | 48 | (i12 & 7168) | (i21 & 458752));
                            String str5 = str4;
                            oVar3 = oVarB;
                            mVar2 = mVarB;
                            str3 = str5;
                        } else {
                            c1086gP.w();
                            hVar3 = hVar2;
                            mVar2 = mVarB;
                            oVar3 = oVar2;
                            str3 = str2;
                        }
                        c1105p0V = c1086gP.V();
                        if (c1105p0V != null) {
                            c1105p0V.f13109d = new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.animation.AnimatedVisibilityKt$AnimatedVisibility$6
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                /* JADX WARN: Multi-variable type inference failed */
                                {
                                    super(2);
                                }

                                @Override // Ia.p
                                public final p293xa.r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                                    num.intValue();
                                    AnimatedVisibilityKt.d(interfaceC0954n, z10, hVar3, mVar2, oVar3, str3, qVar, interfaceC1084f2, L4.b.l(i10 | 1), i11);
                                    return p293xa.r.f47939a;
                                }
                            };
                        }
                    }
                    i12 |= 196608;
                    str2 = str;
                    if ((i11 & 32) != 0) {
                        i12 |= 1572864;
                    } else if ((i10 & 1572864) == 0) {
                        if (c1086gP.k(qVar)) {
                            i19 = 1048576;
                        } else {
                            i19 = 524288;
                        }
                        i12 |= i19;
                    }
                    if ((599185 & i12) != 599184) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    if (c1086gP.C(i12 & 1, z11)) {
                        if (i20 != 0) {
                            hVar3 = androidx.compose.ui.h.a.f13984b;
                        } else {
                            hVar3 = hVar2;
                        }
                        if (i13 != 0) {
                            mVarB = EnterExitTransitionKt.e(null, 0.0f, 3).b(EnterExitTransitionKt.d(null, 15));
                        }
                        if (i15 != 0) {
                            oVarB = EnterExitTransitionKt.f(null, 3).b(EnterExitTransitionKt.k());
                        } else {
                            oVarB = oVar2;
                        }
                        if (i17 != 0) {
                            str4 = "AnimatedVisibility";
                        } else {
                            str4 = str2;
                        }
                        int i22 = i12 >> 3;
                        f(TransitionKt.f(Boolean.valueOf(z10), str4, c1086gP, (i22 & 14) | ((i12 >> 12) & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle), 0), new Ia.l<Boolean, Boolean>() { // from class: androidx.compose.animation.AnimatedVisibilityKt$AnimatedVisibility$5
                            @Override // Ia.l
                            public final Boolean invoke(Boolean bool) {
                                Boolean bool2 = bool;
                                bool2.booleanValue();
                                return bool2;
                            }
                        }, hVar3, mVarB, oVarB, qVar, c1086gP, (i12 & 57344) | (i12 & 896) | 48 | (i12 & 7168) | (i22 & 458752));
                        String str6 = str4;
                        oVar3 = oVarB;
                        mVar2 = mVarB;
                        str3 = str6;
                    } else {
                        c1086gP.w();
                        hVar3 = hVar2;
                        mVar2 = mVarB;
                        oVar3 = oVar2;
                        str3 = str2;
                    }
                    c1105p0V = c1086gP.V();
                    if (c1105p0V != null) {
                        c1105p0V.f13109d = new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.animation.AnimatedVisibilityKt$AnimatedVisibility$6
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            /* JADX WARN: Multi-variable type inference failed */
                            {
                                super(2);
                            }

                            @Override // Ia.p
                            public final p293xa.r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                                num.intValue();
                                AnimatedVisibilityKt.d(interfaceC0954n, z10, hVar3, mVar2, oVar3, str3, qVar, interfaceC1084f2, L4.b.l(i10 | 1), i11);
                                return p293xa.r.f47939a;
                            }
                        };
                    }
                }
                i12 |= 24576;
                oVar2 = oVar;
                i17 = i11 & 16;
                if (i17 != 0) {
                    if ((196608 & i10) == 0) {
                        str2 = str;
                        if (c1086gP.K(str2)) {
                            i18 = 131072;
                        } else {
                            i18 = 65536;
                        }
                        i12 |= i18;
                    }
                    if ((i11 & 32) != 0) {
                        i12 |= 1572864;
                    } else if ((i10 & 1572864) == 0) {
                        if (c1086gP.k(qVar)) {
                            i19 = 1048576;
                        } else {
                            i19 = 524288;
                        }
                        i12 |= i19;
                    }
                    if ((599185 & i12) != 599184) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    if (c1086gP.C(i12 & 1, z11)) {
                        if (i20 != 0) {
                            hVar3 = androidx.compose.ui.h.a.f13984b;
                        } else {
                            hVar3 = hVar2;
                        }
                        if (i13 != 0) {
                            mVarB = EnterExitTransitionKt.e(null, 0.0f, 3).b(EnterExitTransitionKt.d(null, 15));
                        }
                        if (i15 != 0) {
                            oVarB = EnterExitTransitionKt.f(null, 3).b(EnterExitTransitionKt.k());
                        } else {
                            oVarB = oVar2;
                        }
                        if (i17 != 0) {
                            str4 = "AnimatedVisibility";
                        } else {
                            str4 = str2;
                        }
                        int i23 = i12 >> 3;
                        f(TransitionKt.f(Boolean.valueOf(z10), str4, c1086gP, (i23 & 14) | ((i12 >> 12) & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle), 0), new Ia.l<Boolean, Boolean>() { // from class: androidx.compose.animation.AnimatedVisibilityKt$AnimatedVisibility$5
                            @Override // Ia.l
                            public final Boolean invoke(Boolean bool) {
                                Boolean bool2 = bool;
                                bool2.booleanValue();
                                return bool2;
                            }
                        }, hVar3, mVarB, oVarB, qVar, c1086gP, (i12 & 57344) | (i12 & 896) | 48 | (i12 & 7168) | (i23 & 458752));
                        String str7 = str4;
                        oVar3 = oVarB;
                        mVar2 = mVarB;
                        str3 = str7;
                    } else {
                        c1086gP.w();
                        hVar3 = hVar2;
                        mVar2 = mVarB;
                        oVar3 = oVar2;
                        str3 = str2;
                    }
                    c1105p0V = c1086gP.V();
                    if (c1105p0V != null) {
                        c1105p0V.f13109d = new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.animation.AnimatedVisibilityKt$AnimatedVisibility$6
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            /* JADX WARN: Multi-variable type inference failed */
                            {
                                super(2);
                            }

                            @Override // Ia.p
                            public final p293xa.r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                                num.intValue();
                                AnimatedVisibilityKt.d(interfaceC0954n, z10, hVar3, mVar2, oVar3, str3, qVar, interfaceC1084f2, L4.b.l(i10 | 1), i11);
                                return p293xa.r.f47939a;
                            }
                        };
                    }
                }
                i12 |= 196608;
                str2 = str;
                if ((i11 & 32) != 0) {
                    i12 |= 1572864;
                } else if ((i10 & 1572864) == 0) {
                    if (c1086gP.k(qVar)) {
                        i19 = 1048576;
                    } else {
                        i19 = 524288;
                    }
                    i12 |= i19;
                }
                if ((599185 & i12) != 599184) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                if (c1086gP.C(i12 & 1, z11)) {
                    if (i20 != 0) {
                        hVar3 = androidx.compose.ui.h.a.f13984b;
                    } else {
                        hVar3 = hVar2;
                    }
                    if (i13 != 0) {
                        mVarB = EnterExitTransitionKt.e(null, 0.0f, 3).b(EnterExitTransitionKt.d(null, 15));
                    }
                    if (i15 != 0) {
                        oVarB = EnterExitTransitionKt.f(null, 3).b(EnterExitTransitionKt.k());
                    } else {
                        oVarB = oVar2;
                    }
                    if (i17 != 0) {
                        str4 = "AnimatedVisibility";
                    } else {
                        str4 = str2;
                    }
                    int i24 = i12 >> 3;
                    f(TransitionKt.f(Boolean.valueOf(z10), str4, c1086gP, (i24 & 14) | ((i12 >> 12) & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle), 0), new Ia.l<Boolean, Boolean>() { // from class: androidx.compose.animation.AnimatedVisibilityKt$AnimatedVisibility$5
                        @Override // Ia.l
                        public final Boolean invoke(Boolean bool) {
                            Boolean bool2 = bool;
                            bool2.booleanValue();
                            return bool2;
                        }
                    }, hVar3, mVarB, oVarB, qVar, c1086gP, (i12 & 57344) | (i12 & 896) | 48 | (i12 & 7168) | (i24 & 458752));
                    String str8 = str4;
                    oVar3 = oVarB;
                    mVar2 = mVarB;
                    str3 = str8;
                } else {
                    c1086gP.w();
                    hVar3 = hVar2;
                    mVar2 = mVarB;
                    oVar3 = oVar2;
                    str3 = str2;
                }
                c1105p0V = c1086gP.V();
                if (c1105p0V != null) {
                    c1105p0V.f13109d = new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.animation.AnimatedVisibilityKt$AnimatedVisibility$6
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        /* JADX WARN: Multi-variable type inference failed */
                        {
                            super(2);
                        }

                        @Override // Ia.p
                        public final p293xa.r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                            num.intValue();
                            AnimatedVisibilityKt.d(interfaceC0954n, z10, hVar3, mVar2, oVar3, str3, qVar, interfaceC1084f2, L4.b.l(i10 | 1), i11);
                            return p293xa.r.f47939a;
                        }
                    };
                }
            }
            i12 |= 3072;
            mVarB = mVar;
            i15 = i11 & 8;
            if (i15 != 0) {
                if ((i10 & 24576) == 0) {
                    oVar2 = oVar;
                    if (c1086gP.K(oVar2)) {
                        i16 = 16384;
                    } else {
                        i16 = 8192;
                    }
                    i12 |= i16;
                }
                i17 = i11 & 16;
                if (i17 != 0) {
                    if ((196608 & i10) == 0) {
                        str2 = str;
                        if (c1086gP.K(str2)) {
                            i18 = 131072;
                        } else {
                            i18 = 65536;
                        }
                        i12 |= i18;
                    }
                    if ((i11 & 32) != 0) {
                        i12 |= 1572864;
                    } else if ((i10 & 1572864) == 0) {
                        if (c1086gP.k(qVar)) {
                            i19 = 1048576;
                        } else {
                            i19 = 524288;
                        }
                        i12 |= i19;
                    }
                    if ((599185 & i12) != 599184) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    if (c1086gP.C(i12 & 1, z11)) {
                        if (i20 != 0) {
                            hVar3 = androidx.compose.ui.h.a.f13984b;
                        } else {
                            hVar3 = hVar2;
                        }
                        if (i13 != 0) {
                            mVarB = EnterExitTransitionKt.e(null, 0.0f, 3).b(EnterExitTransitionKt.d(null, 15));
                        }
                        if (i15 != 0) {
                            oVarB = EnterExitTransitionKt.f(null, 3).b(EnterExitTransitionKt.k());
                        } else {
                            oVarB = oVar2;
                        }
                        if (i17 != 0) {
                            str4 = "AnimatedVisibility";
                        } else {
                            str4 = str2;
                        }
                        int i25 = i12 >> 3;
                        f(TransitionKt.f(Boolean.valueOf(z10), str4, c1086gP, (i25 & 14) | ((i12 >> 12) & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle), 0), new Ia.l<Boolean, Boolean>() { // from class: androidx.compose.animation.AnimatedVisibilityKt$AnimatedVisibility$5
                            @Override // Ia.l
                            public final Boolean invoke(Boolean bool) {
                                Boolean bool2 = bool;
                                bool2.booleanValue();
                                return bool2;
                            }
                        }, hVar3, mVarB, oVarB, qVar, c1086gP, (i12 & 57344) | (i12 & 896) | 48 | (i12 & 7168) | (i25 & 458752));
                        String str9 = str4;
                        oVar3 = oVarB;
                        mVar2 = mVarB;
                        str3 = str9;
                    } else {
                        c1086gP.w();
                        hVar3 = hVar2;
                        mVar2 = mVarB;
                        oVar3 = oVar2;
                        str3 = str2;
                    }
                    c1105p0V = c1086gP.V();
                    if (c1105p0V != null) {
                        c1105p0V.f13109d = new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.animation.AnimatedVisibilityKt$AnimatedVisibility$6
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            /* JADX WARN: Multi-variable type inference failed */
                            {
                                super(2);
                            }

                            @Override // Ia.p
                            public final p293xa.r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                                num.intValue();
                                AnimatedVisibilityKt.d(interfaceC0954n, z10, hVar3, mVar2, oVar3, str3, qVar, interfaceC1084f2, L4.b.l(i10 | 1), i11);
                                return p293xa.r.f47939a;
                            }
                        };
                    }
                }
                i12 |= 196608;
                str2 = str;
                if ((i11 & 32) != 0) {
                    i12 |= 1572864;
                } else if ((i10 & 1572864) == 0) {
                    if (c1086gP.k(qVar)) {
                        i19 = 1048576;
                    } else {
                        i19 = 524288;
                    }
                    i12 |= i19;
                }
                if ((599185 & i12) != 599184) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                if (c1086gP.C(i12 & 1, z11)) {
                    if (i20 != 0) {
                        hVar3 = androidx.compose.ui.h.a.f13984b;
                    } else {
                        hVar3 = hVar2;
                    }
                    if (i13 != 0) {
                        mVarB = EnterExitTransitionKt.e(null, 0.0f, 3).b(EnterExitTransitionKt.d(null, 15));
                    }
                    if (i15 != 0) {
                        oVarB = EnterExitTransitionKt.f(null, 3).b(EnterExitTransitionKt.k());
                    } else {
                        oVarB = oVar2;
                    }
                    if (i17 != 0) {
                        str4 = "AnimatedVisibility";
                    } else {
                        str4 = str2;
                    }
                    int i26 = i12 >> 3;
                    f(TransitionKt.f(Boolean.valueOf(z10), str4, c1086gP, (i26 & 14) | ((i12 >> 12) & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle), 0), new Ia.l<Boolean, Boolean>() { // from class: androidx.compose.animation.AnimatedVisibilityKt$AnimatedVisibility$5
                        @Override // Ia.l
                        public final Boolean invoke(Boolean bool) {
                            Boolean bool2 = bool;
                            bool2.booleanValue();
                            return bool2;
                        }
                    }, hVar3, mVarB, oVarB, qVar, c1086gP, (i12 & 57344) | (i12 & 896) | 48 | (i12 & 7168) | (i26 & 458752));
                    String str10 = str4;
                    oVar3 = oVarB;
                    mVar2 = mVarB;
                    str3 = str10;
                } else {
                    c1086gP.w();
                    hVar3 = hVar2;
                    mVar2 = mVarB;
                    oVar3 = oVar2;
                    str3 = str2;
                }
                c1105p0V = c1086gP.V();
                if (c1105p0V != null) {
                    c1105p0V.f13109d = new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.animation.AnimatedVisibilityKt$AnimatedVisibility$6
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        /* JADX WARN: Multi-variable type inference failed */
                        {
                            super(2);
                        }

                        @Override // Ia.p
                        public final p293xa.r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                            num.intValue();
                            AnimatedVisibilityKt.d(interfaceC0954n, z10, hVar3, mVar2, oVar3, str3, qVar, interfaceC1084f2, L4.b.l(i10 | 1), i11);
                            return p293xa.r.f47939a;
                        }
                    };
                }
            }
            i12 |= 24576;
            oVar2 = oVar;
            i17 = i11 & 16;
            if (i17 != 0) {
                if ((196608 & i10) == 0) {
                    str2 = str;
                    if (c1086gP.K(str2)) {
                        i18 = 131072;
                    } else {
                        i18 = 65536;
                    }
                    i12 |= i18;
                }
                if ((i11 & 32) != 0) {
                    i12 |= 1572864;
                } else if ((i10 & 1572864) == 0) {
                    if (c1086gP.k(qVar)) {
                        i19 = 1048576;
                    } else {
                        i19 = 524288;
                    }
                    i12 |= i19;
                }
                if ((599185 & i12) != 599184) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                if (c1086gP.C(i12 & 1, z11)) {
                    if (i20 != 0) {
                        hVar3 = androidx.compose.ui.h.a.f13984b;
                    } else {
                        hVar3 = hVar2;
                    }
                    if (i13 != 0) {
                        mVarB = EnterExitTransitionKt.e(null, 0.0f, 3).b(EnterExitTransitionKt.d(null, 15));
                    }
                    if (i15 != 0) {
                        oVarB = EnterExitTransitionKt.f(null, 3).b(EnterExitTransitionKt.k());
                    } else {
                        oVarB = oVar2;
                    }
                    if (i17 != 0) {
                        str4 = "AnimatedVisibility";
                    } else {
                        str4 = str2;
                    }
                    int i27 = i12 >> 3;
                    f(TransitionKt.f(Boolean.valueOf(z10), str4, c1086gP, (i27 & 14) | ((i12 >> 12) & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle), 0), new Ia.l<Boolean, Boolean>() { // from class: androidx.compose.animation.AnimatedVisibilityKt$AnimatedVisibility$5
                        @Override // Ia.l
                        public final Boolean invoke(Boolean bool) {
                            Boolean bool2 = bool;
                            bool2.booleanValue();
                            return bool2;
                        }
                    }, hVar3, mVarB, oVarB, qVar, c1086gP, (i12 & 57344) | (i12 & 896) | 48 | (i12 & 7168) | (i27 & 458752));
                    String str11 = str4;
                    oVar3 = oVarB;
                    mVar2 = mVarB;
                    str3 = str11;
                } else {
                    c1086gP.w();
                    hVar3 = hVar2;
                    mVar2 = mVarB;
                    oVar3 = oVar2;
                    str3 = str2;
                }
                c1105p0V = c1086gP.V();
                if (c1105p0V != null) {
                    c1105p0V.f13109d = new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.animation.AnimatedVisibilityKt$AnimatedVisibility$6
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        /* JADX WARN: Multi-variable type inference failed */
                        {
                            super(2);
                        }

                        @Override // Ia.p
                        public final p293xa.r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                            num.intValue();
                            AnimatedVisibilityKt.d(interfaceC0954n, z10, hVar3, mVar2, oVar3, str3, qVar, interfaceC1084f2, L4.b.l(i10 | 1), i11);
                            return p293xa.r.f47939a;
                        }
                    };
                }
            }
            i12 |= 196608;
            str2 = str;
            if ((i11 & 32) != 0) {
                i12 |= 1572864;
            } else if ((i10 & 1572864) == 0) {
                if (c1086gP.k(qVar)) {
                    i19 = 1048576;
                } else {
                    i19 = 524288;
                }
                i12 |= i19;
            }
            if ((599185 & i12) != 599184) {
                z11 = true;
            } else {
                z11 = false;
            }
            if (c1086gP.C(i12 & 1, z11)) {
                if (i20 != 0) {
                    hVar3 = androidx.compose.ui.h.a.f13984b;
                } else {
                    hVar3 = hVar2;
                }
                if (i13 != 0) {
                    mVarB = EnterExitTransitionKt.e(null, 0.0f, 3).b(EnterExitTransitionKt.d(null, 15));
                }
                if (i15 != 0) {
                    oVarB = EnterExitTransitionKt.f(null, 3).b(EnterExitTransitionKt.k());
                } else {
                    oVarB = oVar2;
                }
                if (i17 != 0) {
                    str4 = "AnimatedVisibility";
                } else {
                    str4 = str2;
                }
                int i28 = i12 >> 3;
                f(TransitionKt.f(Boolean.valueOf(z10), str4, c1086gP, (i28 & 14) | ((i12 >> 12) & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle), 0), new Ia.l<Boolean, Boolean>() { // from class: androidx.compose.animation.AnimatedVisibilityKt$AnimatedVisibility$5
                    @Override // Ia.l
                    public final Boolean invoke(Boolean bool) {
                        Boolean bool2 = bool;
                        bool2.booleanValue();
                        return bool2;
                    }
                }, hVar3, mVarB, oVarB, qVar, c1086gP, (i12 & 57344) | (i12 & 896) | 48 | (i12 & 7168) | (i28 & 458752));
                String str12 = str4;
                oVar3 = oVarB;
                mVar2 = mVarB;
                str3 = str12;
            } else {
                c1086gP.w();
                hVar3 = hVar2;
                mVar2 = mVarB;
                oVar3 = oVar2;
                str3 = str2;
            }
            c1105p0V = c1086gP.V();
            if (c1105p0V != null) {
                c1105p0V.f13109d = new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.animation.AnimatedVisibilityKt$AnimatedVisibility$6
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(2);
                    }

                    @Override // Ia.p
                    public final p293xa.r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                        num.intValue();
                        AnimatedVisibilityKt.d(interfaceC0954n, z10, hVar3, mVar2, oVar3, str3, qVar, interfaceC1084f2, L4.b.l(i10 | 1), i11);
                        return p293xa.r.f47939a;
                    }
                };
            }
        }
        i12 |= 384;
        hVar2 = hVar;
        i13 = i11 & 4;
        if (i13 != 0) {
            if ((i10 & 3072) == 0) {
                mVarB = mVar;
                if (c1086gP.K(mVarB)) {
                    i14 = 2048;
                } else {
                    i14 = 1024;
                }
                i12 |= i14;
            }
            i15 = i11 & 8;
            if (i15 != 0) {
                if ((i10 & 24576) == 0) {
                    oVar2 = oVar;
                    if (c1086gP.K(oVar2)) {
                        i16 = 16384;
                    } else {
                        i16 = 8192;
                    }
                    i12 |= i16;
                }
                i17 = i11 & 16;
                if (i17 != 0) {
                    if ((196608 & i10) == 0) {
                        str2 = str;
                        if (c1086gP.K(str2)) {
                            i18 = 131072;
                        } else {
                            i18 = 65536;
                        }
                        i12 |= i18;
                    }
                    if ((i11 & 32) != 0) {
                        i12 |= 1572864;
                    } else if ((i10 & 1572864) == 0) {
                        if (c1086gP.k(qVar)) {
                            i19 = 1048576;
                        } else {
                            i19 = 524288;
                        }
                        i12 |= i19;
                    }
                    if ((599185 & i12) != 599184) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    if (c1086gP.C(i12 & 1, z11)) {
                        if (i20 != 0) {
                            hVar3 = androidx.compose.ui.h.a.f13984b;
                        } else {
                            hVar3 = hVar2;
                        }
                        if (i13 != 0) {
                            mVarB = EnterExitTransitionKt.e(null, 0.0f, 3).b(EnterExitTransitionKt.d(null, 15));
                        }
                        if (i15 != 0) {
                            oVarB = EnterExitTransitionKt.f(null, 3).b(EnterExitTransitionKt.k());
                        } else {
                            oVarB = oVar2;
                        }
                        if (i17 != 0) {
                            str4 = "AnimatedVisibility";
                        } else {
                            str4 = str2;
                        }
                        int i29 = i12 >> 3;
                        f(TransitionKt.f(Boolean.valueOf(z10), str4, c1086gP, (i29 & 14) | ((i12 >> 12) & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle), 0), new Ia.l<Boolean, Boolean>() { // from class: androidx.compose.animation.AnimatedVisibilityKt$AnimatedVisibility$5
                            @Override // Ia.l
                            public final Boolean invoke(Boolean bool) {
                                Boolean bool2 = bool;
                                bool2.booleanValue();
                                return bool2;
                            }
                        }, hVar3, mVarB, oVarB, qVar, c1086gP, (i12 & 57344) | (i12 & 896) | 48 | (i12 & 7168) | (i29 & 458752));
                        String str13 = str4;
                        oVar3 = oVarB;
                        mVar2 = mVarB;
                        str3 = str13;
                    } else {
                        c1086gP.w();
                        hVar3 = hVar2;
                        mVar2 = mVarB;
                        oVar3 = oVar2;
                        str3 = str2;
                    }
                    c1105p0V = c1086gP.V();
                    if (c1105p0V != null) {
                        c1105p0V.f13109d = new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.animation.AnimatedVisibilityKt$AnimatedVisibility$6
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            /* JADX WARN: Multi-variable type inference failed */
                            {
                                super(2);
                            }

                            @Override // Ia.p
                            public final p293xa.r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                                num.intValue();
                                AnimatedVisibilityKt.d(interfaceC0954n, z10, hVar3, mVar2, oVar3, str3, qVar, interfaceC1084f2, L4.b.l(i10 | 1), i11);
                                return p293xa.r.f47939a;
                            }
                        };
                    }
                }
                i12 |= 196608;
                str2 = str;
                if ((i11 & 32) != 0) {
                    i12 |= 1572864;
                } else if ((i10 & 1572864) == 0) {
                    if (c1086gP.k(qVar)) {
                        i19 = 1048576;
                    } else {
                        i19 = 524288;
                    }
                    i12 |= i19;
                }
                if ((599185 & i12) != 599184) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                if (c1086gP.C(i12 & 1, z11)) {
                    if (i20 != 0) {
                        hVar3 = androidx.compose.ui.h.a.f13984b;
                    } else {
                        hVar3 = hVar2;
                    }
                    if (i13 != 0) {
                        mVarB = EnterExitTransitionKt.e(null, 0.0f, 3).b(EnterExitTransitionKt.d(null, 15));
                    }
                    if (i15 != 0) {
                        oVarB = EnterExitTransitionKt.f(null, 3).b(EnterExitTransitionKt.k());
                    } else {
                        oVarB = oVar2;
                    }
                    if (i17 != 0) {
                        str4 = "AnimatedVisibility";
                    } else {
                        str4 = str2;
                    }
                    int i210 = i12 >> 3;
                    f(TransitionKt.f(Boolean.valueOf(z10), str4, c1086gP, (i210 & 14) | ((i12 >> 12) & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle), 0), new Ia.l<Boolean, Boolean>() { // from class: androidx.compose.animation.AnimatedVisibilityKt$AnimatedVisibility$5
                        @Override // Ia.l
                        public final Boolean invoke(Boolean bool) {
                            Boolean bool2 = bool;
                            bool2.booleanValue();
                            return bool2;
                        }
                    }, hVar3, mVarB, oVarB, qVar, c1086gP, (i12 & 57344) | (i12 & 896) | 48 | (i12 & 7168) | (i210 & 458752));
                    String str14 = str4;
                    oVar3 = oVarB;
                    mVar2 = mVarB;
                    str3 = str14;
                } else {
                    c1086gP.w();
                    hVar3 = hVar2;
                    mVar2 = mVarB;
                    oVar3 = oVar2;
                    str3 = str2;
                }
                c1105p0V = c1086gP.V();
                if (c1105p0V != null) {
                    c1105p0V.f13109d = new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.animation.AnimatedVisibilityKt$AnimatedVisibility$6
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        /* JADX WARN: Multi-variable type inference failed */
                        {
                            super(2);
                        }

                        @Override // Ia.p
                        public final p293xa.r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                            num.intValue();
                            AnimatedVisibilityKt.d(interfaceC0954n, z10, hVar3, mVar2, oVar3, str3, qVar, interfaceC1084f2, L4.b.l(i10 | 1), i11);
                            return p293xa.r.f47939a;
                        }
                    };
                }
            }
            i12 |= 24576;
            oVar2 = oVar;
            i17 = i11 & 16;
            if (i17 != 0) {
                if ((196608 & i10) == 0) {
                    str2 = str;
                    if (c1086gP.K(str2)) {
                        i18 = 131072;
                    } else {
                        i18 = 65536;
                    }
                    i12 |= i18;
                }
                if ((i11 & 32) != 0) {
                    i12 |= 1572864;
                } else if ((i10 & 1572864) == 0) {
                    if (c1086gP.k(qVar)) {
                        i19 = 1048576;
                    } else {
                        i19 = 524288;
                    }
                    i12 |= i19;
                }
                if ((599185 & i12) != 599184) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                if (c1086gP.C(i12 & 1, z11)) {
                    if (i20 != 0) {
                        hVar3 = androidx.compose.ui.h.a.f13984b;
                    } else {
                        hVar3 = hVar2;
                    }
                    if (i13 != 0) {
                        mVarB = EnterExitTransitionKt.e(null, 0.0f, 3).b(EnterExitTransitionKt.d(null, 15));
                    }
                    if (i15 != 0) {
                        oVarB = EnterExitTransitionKt.f(null, 3).b(EnterExitTransitionKt.k());
                    } else {
                        oVarB = oVar2;
                    }
                    if (i17 != 0) {
                        str4 = "AnimatedVisibility";
                    } else {
                        str4 = str2;
                    }
                    int i211 = i12 >> 3;
                    f(TransitionKt.f(Boolean.valueOf(z10), str4, c1086gP, (i211 & 14) | ((i12 >> 12) & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle), 0), new Ia.l<Boolean, Boolean>() { // from class: androidx.compose.animation.AnimatedVisibilityKt$AnimatedVisibility$5
                        @Override // Ia.l
                        public final Boolean invoke(Boolean bool) {
                            Boolean bool2 = bool;
                            bool2.booleanValue();
                            return bool2;
                        }
                    }, hVar3, mVarB, oVarB, qVar, c1086gP, (i12 & 57344) | (i12 & 896) | 48 | (i12 & 7168) | (i211 & 458752));
                    String str15 = str4;
                    oVar3 = oVarB;
                    mVar2 = mVarB;
                    str3 = str15;
                } else {
                    c1086gP.w();
                    hVar3 = hVar2;
                    mVar2 = mVarB;
                    oVar3 = oVar2;
                    str3 = str2;
                }
                c1105p0V = c1086gP.V();
                if (c1105p0V != null) {
                    c1105p0V.f13109d = new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.animation.AnimatedVisibilityKt$AnimatedVisibility$6
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        /* JADX WARN: Multi-variable type inference failed */
                        {
                            super(2);
                        }

                        @Override // Ia.p
                        public final p293xa.r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                            num.intValue();
                            AnimatedVisibilityKt.d(interfaceC0954n, z10, hVar3, mVar2, oVar3, str3, qVar, interfaceC1084f2, L4.b.l(i10 | 1), i11);
                            return p293xa.r.f47939a;
                        }
                    };
                }
            }
            i12 |= 196608;
            str2 = str;
            if ((i11 & 32) != 0) {
                i12 |= 1572864;
            } else if ((i10 & 1572864) == 0) {
                if (c1086gP.k(qVar)) {
                    i19 = 1048576;
                } else {
                    i19 = 524288;
                }
                i12 |= i19;
            }
            if ((599185 & i12) != 599184) {
                z11 = true;
            } else {
                z11 = false;
            }
            if (c1086gP.C(i12 & 1, z11)) {
                if (i20 != 0) {
                    hVar3 = androidx.compose.ui.h.a.f13984b;
                } else {
                    hVar3 = hVar2;
                }
                if (i13 != 0) {
                    mVarB = EnterExitTransitionKt.e(null, 0.0f, 3).b(EnterExitTransitionKt.d(null, 15));
                }
                if (i15 != 0) {
                    oVarB = EnterExitTransitionKt.f(null, 3).b(EnterExitTransitionKt.k());
                } else {
                    oVarB = oVar2;
                }
                if (i17 != 0) {
                    str4 = "AnimatedVisibility";
                } else {
                    str4 = str2;
                }
                int i212 = i12 >> 3;
                f(TransitionKt.f(Boolean.valueOf(z10), str4, c1086gP, (i212 & 14) | ((i12 >> 12) & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle), 0), new Ia.l<Boolean, Boolean>() { // from class: androidx.compose.animation.AnimatedVisibilityKt$AnimatedVisibility$5
                    @Override // Ia.l
                    public final Boolean invoke(Boolean bool) {
                        Boolean bool2 = bool;
                        bool2.booleanValue();
                        return bool2;
                    }
                }, hVar3, mVarB, oVarB, qVar, c1086gP, (i12 & 57344) | (i12 & 896) | 48 | (i12 & 7168) | (i212 & 458752));
                String str16 = str4;
                oVar3 = oVarB;
                mVar2 = mVarB;
                str3 = str16;
            } else {
                c1086gP.w();
                hVar3 = hVar2;
                mVar2 = mVarB;
                oVar3 = oVar2;
                str3 = str2;
            }
            c1105p0V = c1086gP.V();
            if (c1105p0V != null) {
                c1105p0V.f13109d = new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.animation.AnimatedVisibilityKt$AnimatedVisibility$6
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(2);
                    }

                    @Override // Ia.p
                    public final p293xa.r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                        num.intValue();
                        AnimatedVisibilityKt.d(interfaceC0954n, z10, hVar3, mVar2, oVar3, str3, qVar, interfaceC1084f2, L4.b.l(i10 | 1), i11);
                        return p293xa.r.f47939a;
                    }
                };
            }
        }
        i12 |= 3072;
        mVarB = mVar;
        i15 = i11 & 8;
        if (i15 != 0) {
            if ((i10 & 24576) == 0) {
                oVar2 = oVar;
                if (c1086gP.K(oVar2)) {
                    i16 = 16384;
                } else {
                    i16 = 8192;
                }
                i12 |= i16;
            }
            i17 = i11 & 16;
            if (i17 != 0) {
                if ((196608 & i10) == 0) {
                    str2 = str;
                    if (c1086gP.K(str2)) {
                        i18 = 131072;
                    } else {
                        i18 = 65536;
                    }
                    i12 |= i18;
                }
                if ((i11 & 32) != 0) {
                    i12 |= 1572864;
                } else if ((i10 & 1572864) == 0) {
                    if (c1086gP.k(qVar)) {
                        i19 = 1048576;
                    } else {
                        i19 = 524288;
                    }
                    i12 |= i19;
                }
                if ((599185 & i12) != 599184) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                if (c1086gP.C(i12 & 1, z11)) {
                    if (i20 != 0) {
                        hVar3 = androidx.compose.ui.h.a.f13984b;
                    } else {
                        hVar3 = hVar2;
                    }
                    if (i13 != 0) {
                        mVarB = EnterExitTransitionKt.e(null, 0.0f, 3).b(EnterExitTransitionKt.d(null, 15));
                    }
                    if (i15 != 0) {
                        oVarB = EnterExitTransitionKt.f(null, 3).b(EnterExitTransitionKt.k());
                    } else {
                        oVarB = oVar2;
                    }
                    if (i17 != 0) {
                        str4 = "AnimatedVisibility";
                    } else {
                        str4 = str2;
                    }
                    int i213 = i12 >> 3;
                    f(TransitionKt.f(Boolean.valueOf(z10), str4, c1086gP, (i213 & 14) | ((i12 >> 12) & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle), 0), new Ia.l<Boolean, Boolean>() { // from class: androidx.compose.animation.AnimatedVisibilityKt$AnimatedVisibility$5
                        @Override // Ia.l
                        public final Boolean invoke(Boolean bool) {
                            Boolean bool2 = bool;
                            bool2.booleanValue();
                            return bool2;
                        }
                    }, hVar3, mVarB, oVarB, qVar, c1086gP, (i12 & 57344) | (i12 & 896) | 48 | (i12 & 7168) | (i213 & 458752));
                    String str17 = str4;
                    oVar3 = oVarB;
                    mVar2 = mVarB;
                    str3 = str17;
                } else {
                    c1086gP.w();
                    hVar3 = hVar2;
                    mVar2 = mVarB;
                    oVar3 = oVar2;
                    str3 = str2;
                }
                c1105p0V = c1086gP.V();
                if (c1105p0V != null) {
                    c1105p0V.f13109d = new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.animation.AnimatedVisibilityKt$AnimatedVisibility$6
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        /* JADX WARN: Multi-variable type inference failed */
                        {
                            super(2);
                        }

                        @Override // Ia.p
                        public final p293xa.r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                            num.intValue();
                            AnimatedVisibilityKt.d(interfaceC0954n, z10, hVar3, mVar2, oVar3, str3, qVar, interfaceC1084f2, L4.b.l(i10 | 1), i11);
                            return p293xa.r.f47939a;
                        }
                    };
                }
            }
            i12 |= 196608;
            str2 = str;
            if ((i11 & 32) != 0) {
                i12 |= 1572864;
            } else if ((i10 & 1572864) == 0) {
                if (c1086gP.k(qVar)) {
                    i19 = 1048576;
                } else {
                    i19 = 524288;
                }
                i12 |= i19;
            }
            if ((599185 & i12) != 599184) {
                z11 = true;
            } else {
                z11 = false;
            }
            if (c1086gP.C(i12 & 1, z11)) {
                if (i20 != 0) {
                    hVar3 = androidx.compose.ui.h.a.f13984b;
                } else {
                    hVar3 = hVar2;
                }
                if (i13 != 0) {
                    mVarB = EnterExitTransitionKt.e(null, 0.0f, 3).b(EnterExitTransitionKt.d(null, 15));
                }
                if (i15 != 0) {
                    oVarB = EnterExitTransitionKt.f(null, 3).b(EnterExitTransitionKt.k());
                } else {
                    oVarB = oVar2;
                }
                if (i17 != 0) {
                    str4 = "AnimatedVisibility";
                } else {
                    str4 = str2;
                }
                int i214 = i12 >> 3;
                f(TransitionKt.f(Boolean.valueOf(z10), str4, c1086gP, (i214 & 14) | ((i12 >> 12) & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle), 0), new Ia.l<Boolean, Boolean>() { // from class: androidx.compose.animation.AnimatedVisibilityKt$AnimatedVisibility$5
                    @Override // Ia.l
                    public final Boolean invoke(Boolean bool) {
                        Boolean bool2 = bool;
                        bool2.booleanValue();
                        return bool2;
                    }
                }, hVar3, mVarB, oVarB, qVar, c1086gP, (i12 & 57344) | (i12 & 896) | 48 | (i12 & 7168) | (i214 & 458752));
                String str18 = str4;
                oVar3 = oVarB;
                mVar2 = mVarB;
                str3 = str18;
            } else {
                c1086gP.w();
                hVar3 = hVar2;
                mVar2 = mVarB;
                oVar3 = oVar2;
                str3 = str2;
            }
            c1105p0V = c1086gP.V();
            if (c1105p0V != null) {
                c1105p0V.f13109d = new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.animation.AnimatedVisibilityKt$AnimatedVisibility$6
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(2);
                    }

                    @Override // Ia.p
                    public final p293xa.r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                        num.intValue();
                        AnimatedVisibilityKt.d(interfaceC0954n, z10, hVar3, mVar2, oVar3, str3, qVar, interfaceC1084f2, L4.b.l(i10 | 1), i11);
                        return p293xa.r.f47939a;
                    }
                };
            }
        }
        i12 |= 24576;
        oVar2 = oVar;
        i17 = i11 & 16;
        if (i17 != 0) {
            if ((196608 & i10) == 0) {
                str2 = str;
                if (c1086gP.K(str2)) {
                    i18 = 131072;
                } else {
                    i18 = 65536;
                }
                i12 |= i18;
            }
            if ((i11 & 32) != 0) {
                i12 |= 1572864;
            } else if ((i10 & 1572864) == 0) {
                if (c1086gP.k(qVar)) {
                    i19 = 1048576;
                } else {
                    i19 = 524288;
                }
                i12 |= i19;
            }
            if ((599185 & i12) != 599184) {
                z11 = true;
            } else {
                z11 = false;
            }
            if (c1086gP.C(i12 & 1, z11)) {
                if (i20 != 0) {
                    hVar3 = androidx.compose.ui.h.a.f13984b;
                } else {
                    hVar3 = hVar2;
                }
                if (i13 != 0) {
                    mVarB = EnterExitTransitionKt.e(null, 0.0f, 3).b(EnterExitTransitionKt.d(null, 15));
                }
                if (i15 != 0) {
                    oVarB = EnterExitTransitionKt.f(null, 3).b(EnterExitTransitionKt.k());
                } else {
                    oVarB = oVar2;
                }
                if (i17 != 0) {
                    str4 = "AnimatedVisibility";
                } else {
                    str4 = str2;
                }
                int i215 = i12 >> 3;
                f(TransitionKt.f(Boolean.valueOf(z10), str4, c1086gP, (i215 & 14) | ((i12 >> 12) & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle), 0), new Ia.l<Boolean, Boolean>() { // from class: androidx.compose.animation.AnimatedVisibilityKt$AnimatedVisibility$5
                    @Override // Ia.l
                    public final Boolean invoke(Boolean bool) {
                        Boolean bool2 = bool;
                        bool2.booleanValue();
                        return bool2;
                    }
                }, hVar3, mVarB, oVarB, qVar, c1086gP, (i12 & 57344) | (i12 & 896) | 48 | (i12 & 7168) | (i215 & 458752));
                String str19 = str4;
                oVar3 = oVarB;
                mVar2 = mVarB;
                str3 = str19;
            } else {
                c1086gP.w();
                hVar3 = hVar2;
                mVar2 = mVarB;
                oVar3 = oVar2;
                str3 = str2;
            }
            c1105p0V = c1086gP.V();
            if (c1105p0V != null) {
                c1105p0V.f13109d = new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.animation.AnimatedVisibilityKt$AnimatedVisibility$6
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(2);
                    }

                    @Override // Ia.p
                    public final p293xa.r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                        num.intValue();
                        AnimatedVisibilityKt.d(interfaceC0954n, z10, hVar3, mVar2, oVar3, str3, qVar, interfaceC1084f2, L4.b.l(i10 | 1), i11);
                        return p293xa.r.f47939a;
                    }
                };
            }
        }
        i12 |= 196608;
        str2 = str;
        if ((i11 & 32) != 0) {
            i12 |= 1572864;
        } else if ((i10 & 1572864) == 0) {
            if (c1086gP.k(qVar)) {
                i19 = 1048576;
            } else {
                i19 = 524288;
            }
            i12 |= i19;
        }
        if ((599185 & i12) != 599184) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (c1086gP.C(i12 & 1, z11)) {
            if (i20 != 0) {
                hVar3 = androidx.compose.ui.h.a.f13984b;
            } else {
                hVar3 = hVar2;
            }
            if (i13 != 0) {
                mVarB = EnterExitTransitionKt.e(null, 0.0f, 3).b(EnterExitTransitionKt.d(null, 15));
            }
            if (i15 != 0) {
                oVarB = EnterExitTransitionKt.f(null, 3).b(EnterExitTransitionKt.k());
            } else {
                oVarB = oVar2;
            }
            if (i17 != 0) {
                str4 = "AnimatedVisibility";
            } else {
                str4 = str2;
            }
            int i216 = i12 >> 3;
            f(TransitionKt.f(Boolean.valueOf(z10), str4, c1086gP, (i216 & 14) | ((i12 >> 12) & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle), 0), new Ia.l<Boolean, Boolean>() { // from class: androidx.compose.animation.AnimatedVisibilityKt$AnimatedVisibility$5
                @Override // Ia.l
                public final Boolean invoke(Boolean bool) {
                    Boolean bool2 = bool;
                    bool2.booleanValue();
                    return bool2;
                }
            }, hVar3, mVarB, oVarB, qVar, c1086gP, (i12 & 57344) | (i12 & 896) | 48 | (i12 & 7168) | (i216 & 458752));
            String str110 = str4;
            oVar3 = oVarB;
            mVar2 = mVarB;
            str3 = str110;
        } else {
            c1086gP.w();
            hVar3 = hVar2;
            mVar2 = mVarB;
            oVar3 = oVar2;
            str3 = str2;
        }
        c1105p0V = c1086gP.V();
        if (c1105p0V != null) {
            c1105p0V.f13109d = new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.animation.AnimatedVisibilityKt$AnimatedVisibility$6
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(2);
                }

                @Override // Ia.p
                public final p293xa.r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                    num.intValue();
                    AnimatedVisibilityKt.d(interfaceC0954n, z10, hVar3, mVar2, oVar3, str3, qVar, interfaceC1084f2, L4.b.l(i10 | 1), i11);
                    return p293xa.r.f47939a;
                }
            };
        }
    }

    /* JADX WARN: Code duplicated, block: B:26:0x0048  */
    /* JADX WARN: Code duplicated, block: B:28:0x004d  */
    /* JADX WARN: Code duplicated, block: B:30:0x0051  */
    /* JADX WARN: Code duplicated, block: B:32:0x0059  */
    /* JADX WARN: Code duplicated, block: B:33:0x005c  */
    /* JADX WARN: Code duplicated, block: B:37:0x0063  */
    /* JADX WARN: Code duplicated, block: B:39:0x0068  */
    /* JADX WARN: Code duplicated, block: B:41:0x006c  */
    /* JADX WARN: Code duplicated, block: B:43:0x0074  */
    /* JADX WARN: Code duplicated, block: B:44:0x0077  */
    /* JADX WARN: Code duplicated, block: B:48:0x007e  */
    /* JADX WARN: Code duplicated, block: B:50:0x0083  */
    /* JADX WARN: Code duplicated, block: B:52:0x0087  */
    /* JADX WARN: Code duplicated, block: B:54:0x008f  */
    /* JADX WARN: Code duplicated, block: B:55:0x0092  */
    /* JADX WARN: Code duplicated, block: B:59:0x009b  */
    /* JADX WARN: Code duplicated, block: B:60:0x009f  */
    /* JADX WARN: Code duplicated, block: B:62:0x00a5  */
    /* JADX WARN: Code duplicated, block: B:64:0x00ab  */
    /* JADX WARN: Code duplicated, block: B:65:0x00ae  */
    /* JADX WARN: Code duplicated, block: B:69:0x00bb  */
    /* JADX WARN: Code duplicated, block: B:70:0x00bd  */
    /* JADX WARN: Code duplicated, block: B:73:0x00c6 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:74:0x00c8  */
    /* JADX WARN: Code duplicated, block: B:75:0x00cb  */
    /* JADX WARN: Code duplicated, block: B:78:0x00d2  */
    /* JADX WARN: Code duplicated, block: B:79:0x00e0  */
    /* JADX WARN: Code duplicated, block: B:81:0x00e3  */
    /* JADX WARN: Code duplicated, block: B:82:0x00f0  */
    /* JADX WARN: Code duplicated, block: B:84:0x00f3  */
    /* JADX WARN: Code duplicated, block: B:85:0x00f6  */
    /* JADX WARN: Code duplicated, block: B:87:0x0128  */
    /* JADX WARN: Code duplicated, block: B:90:0x0135  */
    /* JADX WARN: Code duplicated, block: B:92:? A[RETURN, SYNTHETIC] */
    public static final void e(final boolean z10, androidx.compose.ui.h hVar, m mVar, o oVar, String str, final Ia.q<? super InterfaceC0928f, ? super InterfaceC1084f, ? super Integer, p293xa.r> qVar, InterfaceC1084f interfaceC1084f, final int i10, final int i11) {
        int i12;
        androidx.compose.ui.h hVar2;
        int i13;
        m mVar2;
        int i14;
        int i15;
        o oVar2;
        int i16;
        int i17;
        String str2;
        int i18;
        int i19;
        boolean z11;
        final androidx.compose.ui.h hVar3;
        final m mVar3;
        final o oVarB;
        final String str3;
        C1105p0 c1105p0V;
        androidx.compose.ui.h hVar4;
        m mVarB;
        String str4;
        C1086g c1086gP = interfaceC1084f.p(2088733774);
        if ((i11 & 1) != 0) {
            i12 = i10 | 6;
        } else if ((i10 & 6) == 0) {
            i12 = (c1086gP.c(z10) ? 4 : 2) | i10;
        } else {
            i12 = i10;
        }
        int i20 = i11 & 2;
        if (i20 == 0) {
            if ((i10 & 48) == 0) {
                hVar2 = hVar;
                i12 |= c1086gP.K(hVar2) ? 32 : 16;
            }
            i13 = i11 & 4;
            if (i13 != 0) {
                if ((i10 & 384) == 0) {
                    mVar2 = mVar;
                    if (c1086gP.K(mVar2)) {
                        i14 = 256;
                    } else {
                        i14 = 128;
                    }
                    i12 |= i14;
                }
                i15 = i11 & 8;
                if (i15 != 0) {
                    if ((i10 & 3072) == 0) {
                        oVar2 = oVar;
                        if (c1086gP.K(oVar2)) {
                            i16 = 2048;
                        } else {
                            i16 = 1024;
                        }
                        i12 |= i16;
                    }
                    i17 = i11 & 16;
                    if (i17 != 0) {
                        if ((i10 & 24576) == 0) {
                            str2 = str;
                            if (c1086gP.K(str2)) {
                                i18 = 16384;
                            } else {
                                i18 = 8192;
                            }
                            i12 |= i18;
                        }
                        if ((i11 & 32) != 0) {
                            i12 |= 196608;
                        } else if ((i10 & 196608) == 0) {
                            if (c1086gP.k(qVar)) {
                                i19 = 131072;
                            } else {
                                i19 = 65536;
                            }
                            i12 |= i19;
                        }
                        if ((74899 & i12) != 74898) {
                            z11 = true;
                        } else {
                            z11 = false;
                        }
                        if (c1086gP.C(i12 & 1, z11)) {
                            if (i20 != 0) {
                                hVar4 = androidx.compose.ui.h.a.f13984b;
                            } else {
                                hVar4 = hVar2;
                            }
                            if (i13 != 0) {
                                mVarB = EnterExitTransitionKt.e(null, 0.0f, 3).b(EnterExitTransitionKt.c(null, null, 15));
                            } else {
                                mVarB = mVar2;
                            }
                            if (i15 != 0) {
                                oVarB = EnterExitTransitionKt.j(null, null, 15).b(EnterExitTransitionKt.f(null, 3));
                            } else {
                                oVarB = oVar2;
                            }
                            if (i17 != 0) {
                                str4 = "AnimatedVisibility";
                            } else {
                                str4 = str2;
                            }
                            int i21 = i12 << 3;
                            f(TransitionKt.f(Boolean.valueOf(z10), str4, c1086gP, (i12 & 14) | ((i12 >> 9) & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle), 0), new Ia.l<Boolean, Boolean>() { // from class: androidx.compose.animation.AnimatedVisibilityKt$AnimatedVisibility$1
                                @Override // Ia.l
                                public final Boolean invoke(Boolean bool) {
                                    Boolean bool2 = bool;
                                    bool2.booleanValue();
                                    return bool2;
                                }
                            }, hVar4, mVarB, oVarB, qVar, c1086gP, (i12 & 458752) | (i21 & 57344) | (i21 & 896) | 48 | (i21 & 7168));
                            hVar3 = hVar4;
                            mVar3 = mVarB;
                            str3 = str4;
                        } else {
                            c1086gP.w();
                            hVar3 = hVar2;
                            mVar3 = mVar2;
                            oVarB = oVar2;
                            str3 = str2;
                        }
                        c1105p0V = c1086gP.V();
                        if (c1105p0V != null) {
                            c1105p0V.f13109d = new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.animation.AnimatedVisibilityKt$AnimatedVisibility$2
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                /* JADX WARN: Multi-variable type inference failed */
                                {
                                    super(2);
                                }

                                @Override // Ia.p
                                public final p293xa.r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                                    num.intValue();
                                    AnimatedVisibilityKt.e(z10, hVar3, mVar3, oVarB, str3, qVar, interfaceC1084f2, L4.b.l(i10 | 1), i11);
                                    return p293xa.r.f47939a;
                                }
                            };
                        }
                    }
                    i12 |= 24576;
                    str2 = str;
                    if ((i11 & 32) != 0) {
                        i12 |= 196608;
                    } else if ((i10 & 196608) == 0) {
                        if (c1086gP.k(qVar)) {
                            i19 = 131072;
                        } else {
                            i19 = 65536;
                        }
                        i12 |= i19;
                    }
                    if ((74899 & i12) != 74898) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    if (c1086gP.C(i12 & 1, z11)) {
                        if (i20 != 0) {
                            hVar4 = androidx.compose.ui.h.a.f13984b;
                        } else {
                            hVar4 = hVar2;
                        }
                        if (i13 != 0) {
                            mVarB = EnterExitTransitionKt.e(null, 0.0f, 3).b(EnterExitTransitionKt.c(null, null, 15));
                        } else {
                            mVarB = mVar2;
                        }
                        if (i15 != 0) {
                            oVarB = EnterExitTransitionKt.j(null, null, 15).b(EnterExitTransitionKt.f(null, 3));
                        } else {
                            oVarB = oVar2;
                        }
                        if (i17 != 0) {
                            str4 = "AnimatedVisibility";
                        } else {
                            str4 = str2;
                        }
                        int i22 = i12 << 3;
                        f(TransitionKt.f(Boolean.valueOf(z10), str4, c1086gP, (i12 & 14) | ((i12 >> 9) & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle), 0), new Ia.l<Boolean, Boolean>() { // from class: androidx.compose.animation.AnimatedVisibilityKt$AnimatedVisibility$1
                            @Override // Ia.l
                            public final Boolean invoke(Boolean bool) {
                                Boolean bool2 = bool;
                                bool2.booleanValue();
                                return bool2;
                            }
                        }, hVar4, mVarB, oVarB, qVar, c1086gP, (i12 & 458752) | (i22 & 57344) | (i22 & 896) | 48 | (i22 & 7168));
                        hVar3 = hVar4;
                        mVar3 = mVarB;
                        str3 = str4;
                    } else {
                        c1086gP.w();
                        hVar3 = hVar2;
                        mVar3 = mVar2;
                        oVarB = oVar2;
                        str3 = str2;
                    }
                    c1105p0V = c1086gP.V();
                    if (c1105p0V != null) {
                        c1105p0V.f13109d = new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.animation.AnimatedVisibilityKt$AnimatedVisibility$2
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            /* JADX WARN: Multi-variable type inference failed */
                            {
                                super(2);
                            }

                            @Override // Ia.p
                            public final p293xa.r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                                num.intValue();
                                AnimatedVisibilityKt.e(z10, hVar3, mVar3, oVarB, str3, qVar, interfaceC1084f2, L4.b.l(i10 | 1), i11);
                                return p293xa.r.f47939a;
                            }
                        };
                    }
                }
                i12 |= 3072;
                oVar2 = oVar;
                i17 = i11 & 16;
                if (i17 != 0) {
                    if ((i10 & 24576) == 0) {
                        str2 = str;
                        if (c1086gP.K(str2)) {
                            i18 = 16384;
                        } else {
                            i18 = 8192;
                        }
                        i12 |= i18;
                    }
                    if ((i11 & 32) != 0) {
                        i12 |= 196608;
                    } else if ((i10 & 196608) == 0) {
                        if (c1086gP.k(qVar)) {
                            i19 = 131072;
                        } else {
                            i19 = 65536;
                        }
                        i12 |= i19;
                    }
                    if ((74899 & i12) != 74898) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    if (c1086gP.C(i12 & 1, z11)) {
                        if (i20 != 0) {
                            hVar4 = androidx.compose.ui.h.a.f13984b;
                        } else {
                            hVar4 = hVar2;
                        }
                        if (i13 != 0) {
                            mVarB = EnterExitTransitionKt.e(null, 0.0f, 3).b(EnterExitTransitionKt.c(null, null, 15));
                        } else {
                            mVarB = mVar2;
                        }
                        if (i15 != 0) {
                            oVarB = EnterExitTransitionKt.j(null, null, 15).b(EnterExitTransitionKt.f(null, 3));
                        } else {
                            oVarB = oVar2;
                        }
                        if (i17 != 0) {
                            str4 = "AnimatedVisibility";
                        } else {
                            str4 = str2;
                        }
                        int i23 = i12 << 3;
                        f(TransitionKt.f(Boolean.valueOf(z10), str4, c1086gP, (i12 & 14) | ((i12 >> 9) & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle), 0), new Ia.l<Boolean, Boolean>() { // from class: androidx.compose.animation.AnimatedVisibilityKt$AnimatedVisibility$1
                            @Override // Ia.l
                            public final Boolean invoke(Boolean bool) {
                                Boolean bool2 = bool;
                                bool2.booleanValue();
                                return bool2;
                            }
                        }, hVar4, mVarB, oVarB, qVar, c1086gP, (i12 & 458752) | (i23 & 57344) | (i23 & 896) | 48 | (i23 & 7168));
                        hVar3 = hVar4;
                        mVar3 = mVarB;
                        str3 = str4;
                    } else {
                        c1086gP.w();
                        hVar3 = hVar2;
                        mVar3 = mVar2;
                        oVarB = oVar2;
                        str3 = str2;
                    }
                    c1105p0V = c1086gP.V();
                    if (c1105p0V != null) {
                        c1105p0V.f13109d = new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.animation.AnimatedVisibilityKt$AnimatedVisibility$2
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            /* JADX WARN: Multi-variable type inference failed */
                            {
                                super(2);
                            }

                            @Override // Ia.p
                            public final p293xa.r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                                num.intValue();
                                AnimatedVisibilityKt.e(z10, hVar3, mVar3, oVarB, str3, qVar, interfaceC1084f2, L4.b.l(i10 | 1), i11);
                                return p293xa.r.f47939a;
                            }
                        };
                    }
                }
                i12 |= 24576;
                str2 = str;
                if ((i11 & 32) != 0) {
                    i12 |= 196608;
                } else if ((i10 & 196608) == 0) {
                    if (c1086gP.k(qVar)) {
                        i19 = 131072;
                    } else {
                        i19 = 65536;
                    }
                    i12 |= i19;
                }
                if ((74899 & i12) != 74898) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                if (c1086gP.C(i12 & 1, z11)) {
                    if (i20 != 0) {
                        hVar4 = androidx.compose.ui.h.a.f13984b;
                    } else {
                        hVar4 = hVar2;
                    }
                    if (i13 != 0) {
                        mVarB = EnterExitTransitionKt.e(null, 0.0f, 3).b(EnterExitTransitionKt.c(null, null, 15));
                    } else {
                        mVarB = mVar2;
                    }
                    if (i15 != 0) {
                        oVarB = EnterExitTransitionKt.j(null, null, 15).b(EnterExitTransitionKt.f(null, 3));
                    } else {
                        oVarB = oVar2;
                    }
                    if (i17 != 0) {
                        str4 = "AnimatedVisibility";
                    } else {
                        str4 = str2;
                    }
                    int i24 = i12 << 3;
                    f(TransitionKt.f(Boolean.valueOf(z10), str4, c1086gP, (i12 & 14) | ((i12 >> 9) & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle), 0), new Ia.l<Boolean, Boolean>() { // from class: androidx.compose.animation.AnimatedVisibilityKt$AnimatedVisibility$1
                        @Override // Ia.l
                        public final Boolean invoke(Boolean bool) {
                            Boolean bool2 = bool;
                            bool2.booleanValue();
                            return bool2;
                        }
                    }, hVar4, mVarB, oVarB, qVar, c1086gP, (i12 & 458752) | (i24 & 57344) | (i24 & 896) | 48 | (i24 & 7168));
                    hVar3 = hVar4;
                    mVar3 = mVarB;
                    str3 = str4;
                } else {
                    c1086gP.w();
                    hVar3 = hVar2;
                    mVar3 = mVar2;
                    oVarB = oVar2;
                    str3 = str2;
                }
                c1105p0V = c1086gP.V();
                if (c1105p0V != null) {
                    c1105p0V.f13109d = new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.animation.AnimatedVisibilityKt$AnimatedVisibility$2
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        /* JADX WARN: Multi-variable type inference failed */
                        {
                            super(2);
                        }

                        @Override // Ia.p
                        public final p293xa.r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                            num.intValue();
                            AnimatedVisibilityKt.e(z10, hVar3, mVar3, oVarB, str3, qVar, interfaceC1084f2, L4.b.l(i10 | 1), i11);
                            return p293xa.r.f47939a;
                        }
                    };
                }
            }
            i12 |= 384;
            mVar2 = mVar;
            i15 = i11 & 8;
            if (i15 != 0) {
                if ((i10 & 3072) == 0) {
                    oVar2 = oVar;
                    if (c1086gP.K(oVar2)) {
                        i16 = 2048;
                    } else {
                        i16 = 1024;
                    }
                    i12 |= i16;
                }
                i17 = i11 & 16;
                if (i17 != 0) {
                    if ((i10 & 24576) == 0) {
                        str2 = str;
                        if (c1086gP.K(str2)) {
                            i18 = 16384;
                        } else {
                            i18 = 8192;
                        }
                        i12 |= i18;
                    }
                    if ((i11 & 32) != 0) {
                        i12 |= 196608;
                    } else if ((i10 & 196608) == 0) {
                        if (c1086gP.k(qVar)) {
                            i19 = 131072;
                        } else {
                            i19 = 65536;
                        }
                        i12 |= i19;
                    }
                    if ((74899 & i12) != 74898) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    if (c1086gP.C(i12 & 1, z11)) {
                        if (i20 != 0) {
                            hVar4 = androidx.compose.ui.h.a.f13984b;
                        } else {
                            hVar4 = hVar2;
                        }
                        if (i13 != 0) {
                            mVarB = EnterExitTransitionKt.e(null, 0.0f, 3).b(EnterExitTransitionKt.c(null, null, 15));
                        } else {
                            mVarB = mVar2;
                        }
                        if (i15 != 0) {
                            oVarB = EnterExitTransitionKt.j(null, null, 15).b(EnterExitTransitionKt.f(null, 3));
                        } else {
                            oVarB = oVar2;
                        }
                        if (i17 != 0) {
                            str4 = "AnimatedVisibility";
                        } else {
                            str4 = str2;
                        }
                        int i25 = i12 << 3;
                        f(TransitionKt.f(Boolean.valueOf(z10), str4, c1086gP, (i12 & 14) | ((i12 >> 9) & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle), 0), new Ia.l<Boolean, Boolean>() { // from class: androidx.compose.animation.AnimatedVisibilityKt$AnimatedVisibility$1
                            @Override // Ia.l
                            public final Boolean invoke(Boolean bool) {
                                Boolean bool2 = bool;
                                bool2.booleanValue();
                                return bool2;
                            }
                        }, hVar4, mVarB, oVarB, qVar, c1086gP, (i12 & 458752) | (i25 & 57344) | (i25 & 896) | 48 | (i25 & 7168));
                        hVar3 = hVar4;
                        mVar3 = mVarB;
                        str3 = str4;
                    } else {
                        c1086gP.w();
                        hVar3 = hVar2;
                        mVar3 = mVar2;
                        oVarB = oVar2;
                        str3 = str2;
                    }
                    c1105p0V = c1086gP.V();
                    if (c1105p0V != null) {
                        c1105p0V.f13109d = new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.animation.AnimatedVisibilityKt$AnimatedVisibility$2
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            /* JADX WARN: Multi-variable type inference failed */
                            {
                                super(2);
                            }

                            @Override // Ia.p
                            public final p293xa.r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                                num.intValue();
                                AnimatedVisibilityKt.e(z10, hVar3, mVar3, oVarB, str3, qVar, interfaceC1084f2, L4.b.l(i10 | 1), i11);
                                return p293xa.r.f47939a;
                            }
                        };
                    }
                }
                i12 |= 24576;
                str2 = str;
                if ((i11 & 32) != 0) {
                    i12 |= 196608;
                } else if ((i10 & 196608) == 0) {
                    if (c1086gP.k(qVar)) {
                        i19 = 131072;
                    } else {
                        i19 = 65536;
                    }
                    i12 |= i19;
                }
                if ((74899 & i12) != 74898) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                if (c1086gP.C(i12 & 1, z11)) {
                    if (i20 != 0) {
                        hVar4 = androidx.compose.ui.h.a.f13984b;
                    } else {
                        hVar4 = hVar2;
                    }
                    if (i13 != 0) {
                        mVarB = EnterExitTransitionKt.e(null, 0.0f, 3).b(EnterExitTransitionKt.c(null, null, 15));
                    } else {
                        mVarB = mVar2;
                    }
                    if (i15 != 0) {
                        oVarB = EnterExitTransitionKt.j(null, null, 15).b(EnterExitTransitionKt.f(null, 3));
                    } else {
                        oVarB = oVar2;
                    }
                    if (i17 != 0) {
                        str4 = "AnimatedVisibility";
                    } else {
                        str4 = str2;
                    }
                    int i26 = i12 << 3;
                    f(TransitionKt.f(Boolean.valueOf(z10), str4, c1086gP, (i12 & 14) | ((i12 >> 9) & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle), 0), new Ia.l<Boolean, Boolean>() { // from class: androidx.compose.animation.AnimatedVisibilityKt$AnimatedVisibility$1
                        @Override // Ia.l
                        public final Boolean invoke(Boolean bool) {
                            Boolean bool2 = bool;
                            bool2.booleanValue();
                            return bool2;
                        }
                    }, hVar4, mVarB, oVarB, qVar, c1086gP, (i12 & 458752) | (i26 & 57344) | (i26 & 896) | 48 | (i26 & 7168));
                    hVar3 = hVar4;
                    mVar3 = mVarB;
                    str3 = str4;
                } else {
                    c1086gP.w();
                    hVar3 = hVar2;
                    mVar3 = mVar2;
                    oVarB = oVar2;
                    str3 = str2;
                }
                c1105p0V = c1086gP.V();
                if (c1105p0V != null) {
                    c1105p0V.f13109d = new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.animation.AnimatedVisibilityKt$AnimatedVisibility$2
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        /* JADX WARN: Multi-variable type inference failed */
                        {
                            super(2);
                        }

                        @Override // Ia.p
                        public final p293xa.r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                            num.intValue();
                            AnimatedVisibilityKt.e(z10, hVar3, mVar3, oVarB, str3, qVar, interfaceC1084f2, L4.b.l(i10 | 1), i11);
                            return p293xa.r.f47939a;
                        }
                    };
                }
            }
            i12 |= 3072;
            oVar2 = oVar;
            i17 = i11 & 16;
            if (i17 != 0) {
                if ((i10 & 24576) == 0) {
                    str2 = str;
                    if (c1086gP.K(str2)) {
                        i18 = 16384;
                    } else {
                        i18 = 8192;
                    }
                    i12 |= i18;
                }
                if ((i11 & 32) != 0) {
                    i12 |= 196608;
                } else if ((i10 & 196608) == 0) {
                    if (c1086gP.k(qVar)) {
                        i19 = 131072;
                    } else {
                        i19 = 65536;
                    }
                    i12 |= i19;
                }
                if ((74899 & i12) != 74898) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                if (c1086gP.C(i12 & 1, z11)) {
                    if (i20 != 0) {
                        hVar4 = androidx.compose.ui.h.a.f13984b;
                    } else {
                        hVar4 = hVar2;
                    }
                    if (i13 != 0) {
                        mVarB = EnterExitTransitionKt.e(null, 0.0f, 3).b(EnterExitTransitionKt.c(null, null, 15));
                    } else {
                        mVarB = mVar2;
                    }
                    if (i15 != 0) {
                        oVarB = EnterExitTransitionKt.j(null, null, 15).b(EnterExitTransitionKt.f(null, 3));
                    } else {
                        oVarB = oVar2;
                    }
                    if (i17 != 0) {
                        str4 = "AnimatedVisibility";
                    } else {
                        str4 = str2;
                    }
                    int i27 = i12 << 3;
                    f(TransitionKt.f(Boolean.valueOf(z10), str4, c1086gP, (i12 & 14) | ((i12 >> 9) & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle), 0), new Ia.l<Boolean, Boolean>() { // from class: androidx.compose.animation.AnimatedVisibilityKt$AnimatedVisibility$1
                        @Override // Ia.l
                        public final Boolean invoke(Boolean bool) {
                            Boolean bool2 = bool;
                            bool2.booleanValue();
                            return bool2;
                        }
                    }, hVar4, mVarB, oVarB, qVar, c1086gP, (i12 & 458752) | (i27 & 57344) | (i27 & 896) | 48 | (i27 & 7168));
                    hVar3 = hVar4;
                    mVar3 = mVarB;
                    str3 = str4;
                } else {
                    c1086gP.w();
                    hVar3 = hVar2;
                    mVar3 = mVar2;
                    oVarB = oVar2;
                    str3 = str2;
                }
                c1105p0V = c1086gP.V();
                if (c1105p0V != null) {
                    c1105p0V.f13109d = new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.animation.AnimatedVisibilityKt$AnimatedVisibility$2
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        /* JADX WARN: Multi-variable type inference failed */
                        {
                            super(2);
                        }

                        @Override // Ia.p
                        public final p293xa.r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                            num.intValue();
                            AnimatedVisibilityKt.e(z10, hVar3, mVar3, oVarB, str3, qVar, interfaceC1084f2, L4.b.l(i10 | 1), i11);
                            return p293xa.r.f47939a;
                        }
                    };
                }
            }
            i12 |= 24576;
            str2 = str;
            if ((i11 & 32) != 0) {
                i12 |= 196608;
            } else if ((i10 & 196608) == 0) {
                if (c1086gP.k(qVar)) {
                    i19 = 131072;
                } else {
                    i19 = 65536;
                }
                i12 |= i19;
            }
            if ((74899 & i12) != 74898) {
                z11 = true;
            } else {
                z11 = false;
            }
            if (c1086gP.C(i12 & 1, z11)) {
                if (i20 != 0) {
                    hVar4 = androidx.compose.ui.h.a.f13984b;
                } else {
                    hVar4 = hVar2;
                }
                if (i13 != 0) {
                    mVarB = EnterExitTransitionKt.e(null, 0.0f, 3).b(EnterExitTransitionKt.c(null, null, 15));
                } else {
                    mVarB = mVar2;
                }
                if (i15 != 0) {
                    oVarB = EnterExitTransitionKt.j(null, null, 15).b(EnterExitTransitionKt.f(null, 3));
                } else {
                    oVarB = oVar2;
                }
                if (i17 != 0) {
                    str4 = "AnimatedVisibility";
                } else {
                    str4 = str2;
                }
                int i28 = i12 << 3;
                f(TransitionKt.f(Boolean.valueOf(z10), str4, c1086gP, (i12 & 14) | ((i12 >> 9) & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle), 0), new Ia.l<Boolean, Boolean>() { // from class: androidx.compose.animation.AnimatedVisibilityKt$AnimatedVisibility$1
                    @Override // Ia.l
                    public final Boolean invoke(Boolean bool) {
                        Boolean bool2 = bool;
                        bool2.booleanValue();
                        return bool2;
                    }
                }, hVar4, mVarB, oVarB, qVar, c1086gP, (i12 & 458752) | (i28 & 57344) | (i28 & 896) | 48 | (i28 & 7168));
                hVar3 = hVar4;
                mVar3 = mVarB;
                str3 = str4;
            } else {
                c1086gP.w();
                hVar3 = hVar2;
                mVar3 = mVar2;
                oVarB = oVar2;
                str3 = str2;
            }
            c1105p0V = c1086gP.V();
            if (c1105p0V != null) {
                c1105p0V.f13109d = new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.animation.AnimatedVisibilityKt$AnimatedVisibility$2
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(2);
                    }

                    @Override // Ia.p
                    public final p293xa.r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                        num.intValue();
                        AnimatedVisibilityKt.e(z10, hVar3, mVar3, oVarB, str3, qVar, interfaceC1084f2, L4.b.l(i10 | 1), i11);
                        return p293xa.r.f47939a;
                    }
                };
            }
        }
        i12 |= 48;
        hVar2 = hVar;
        i13 = i11 & 4;
        if (i13 != 0) {
            if ((i10 & 384) == 0) {
                mVar2 = mVar;
                if (c1086gP.K(mVar2)) {
                    i14 = 256;
                } else {
                    i14 = 128;
                }
                i12 |= i14;
            }
            i15 = i11 & 8;
            if (i15 != 0) {
                if ((i10 & 3072) == 0) {
                    oVar2 = oVar;
                    if (c1086gP.K(oVar2)) {
                        i16 = 2048;
                    } else {
                        i16 = 1024;
                    }
                    i12 |= i16;
                }
                i17 = i11 & 16;
                if (i17 != 0) {
                    if ((i10 & 24576) == 0) {
                        str2 = str;
                        if (c1086gP.K(str2)) {
                            i18 = 16384;
                        } else {
                            i18 = 8192;
                        }
                        i12 |= i18;
                    }
                    if ((i11 & 32) != 0) {
                        i12 |= 196608;
                    } else if ((i10 & 196608) == 0) {
                        if (c1086gP.k(qVar)) {
                            i19 = 131072;
                        } else {
                            i19 = 65536;
                        }
                        i12 |= i19;
                    }
                    if ((74899 & i12) != 74898) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    if (c1086gP.C(i12 & 1, z11)) {
                        if (i20 != 0) {
                            hVar4 = androidx.compose.ui.h.a.f13984b;
                        } else {
                            hVar4 = hVar2;
                        }
                        if (i13 != 0) {
                            mVarB = EnterExitTransitionKt.e(null, 0.0f, 3).b(EnterExitTransitionKt.c(null, null, 15));
                        } else {
                            mVarB = mVar2;
                        }
                        if (i15 != 0) {
                            oVarB = EnterExitTransitionKt.j(null, null, 15).b(EnterExitTransitionKt.f(null, 3));
                        } else {
                            oVarB = oVar2;
                        }
                        if (i17 != 0) {
                            str4 = "AnimatedVisibility";
                        } else {
                            str4 = str2;
                        }
                        int i29 = i12 << 3;
                        f(TransitionKt.f(Boolean.valueOf(z10), str4, c1086gP, (i12 & 14) | ((i12 >> 9) & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle), 0), new Ia.l<Boolean, Boolean>() { // from class: androidx.compose.animation.AnimatedVisibilityKt$AnimatedVisibility$1
                            @Override // Ia.l
                            public final Boolean invoke(Boolean bool) {
                                Boolean bool2 = bool;
                                bool2.booleanValue();
                                return bool2;
                            }
                        }, hVar4, mVarB, oVarB, qVar, c1086gP, (i12 & 458752) | (i29 & 57344) | (i29 & 896) | 48 | (i29 & 7168));
                        hVar3 = hVar4;
                        mVar3 = mVarB;
                        str3 = str4;
                    } else {
                        c1086gP.w();
                        hVar3 = hVar2;
                        mVar3 = mVar2;
                        oVarB = oVar2;
                        str3 = str2;
                    }
                    c1105p0V = c1086gP.V();
                    if (c1105p0V != null) {
                        c1105p0V.f13109d = new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.animation.AnimatedVisibilityKt$AnimatedVisibility$2
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            /* JADX WARN: Multi-variable type inference failed */
                            {
                                super(2);
                            }

                            @Override // Ia.p
                            public final p293xa.r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                                num.intValue();
                                AnimatedVisibilityKt.e(z10, hVar3, mVar3, oVarB, str3, qVar, interfaceC1084f2, L4.b.l(i10 | 1), i11);
                                return p293xa.r.f47939a;
                            }
                        };
                    }
                }
                i12 |= 24576;
                str2 = str;
                if ((i11 & 32) != 0) {
                    i12 |= 196608;
                } else if ((i10 & 196608) == 0) {
                    if (c1086gP.k(qVar)) {
                        i19 = 131072;
                    } else {
                        i19 = 65536;
                    }
                    i12 |= i19;
                }
                if ((74899 & i12) != 74898) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                if (c1086gP.C(i12 & 1, z11)) {
                    if (i20 != 0) {
                        hVar4 = androidx.compose.ui.h.a.f13984b;
                    } else {
                        hVar4 = hVar2;
                    }
                    if (i13 != 0) {
                        mVarB = EnterExitTransitionKt.e(null, 0.0f, 3).b(EnterExitTransitionKt.c(null, null, 15));
                    } else {
                        mVarB = mVar2;
                    }
                    if (i15 != 0) {
                        oVarB = EnterExitTransitionKt.j(null, null, 15).b(EnterExitTransitionKt.f(null, 3));
                    } else {
                        oVarB = oVar2;
                    }
                    if (i17 != 0) {
                        str4 = "AnimatedVisibility";
                    } else {
                        str4 = str2;
                    }
                    int i210 = i12 << 3;
                    f(TransitionKt.f(Boolean.valueOf(z10), str4, c1086gP, (i12 & 14) | ((i12 >> 9) & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle), 0), new Ia.l<Boolean, Boolean>() { // from class: androidx.compose.animation.AnimatedVisibilityKt$AnimatedVisibility$1
                        @Override // Ia.l
                        public final Boolean invoke(Boolean bool) {
                            Boolean bool2 = bool;
                            bool2.booleanValue();
                            return bool2;
                        }
                    }, hVar4, mVarB, oVarB, qVar, c1086gP, (i12 & 458752) | (i210 & 57344) | (i210 & 896) | 48 | (i210 & 7168));
                    hVar3 = hVar4;
                    mVar3 = mVarB;
                    str3 = str4;
                } else {
                    c1086gP.w();
                    hVar3 = hVar2;
                    mVar3 = mVar2;
                    oVarB = oVar2;
                    str3 = str2;
                }
                c1105p0V = c1086gP.V();
                if (c1105p0V != null) {
                    c1105p0V.f13109d = new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.animation.AnimatedVisibilityKt$AnimatedVisibility$2
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        /* JADX WARN: Multi-variable type inference failed */
                        {
                            super(2);
                        }

                        @Override // Ia.p
                        public final p293xa.r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                            num.intValue();
                            AnimatedVisibilityKt.e(z10, hVar3, mVar3, oVarB, str3, qVar, interfaceC1084f2, L4.b.l(i10 | 1), i11);
                            return p293xa.r.f47939a;
                        }
                    };
                }
            }
            i12 |= 3072;
            oVar2 = oVar;
            i17 = i11 & 16;
            if (i17 != 0) {
                if ((i10 & 24576) == 0) {
                    str2 = str;
                    if (c1086gP.K(str2)) {
                        i18 = 16384;
                    } else {
                        i18 = 8192;
                    }
                    i12 |= i18;
                }
                if ((i11 & 32) != 0) {
                    i12 |= 196608;
                } else if ((i10 & 196608) == 0) {
                    if (c1086gP.k(qVar)) {
                        i19 = 131072;
                    } else {
                        i19 = 65536;
                    }
                    i12 |= i19;
                }
                if ((74899 & i12) != 74898) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                if (c1086gP.C(i12 & 1, z11)) {
                    if (i20 != 0) {
                        hVar4 = androidx.compose.ui.h.a.f13984b;
                    } else {
                        hVar4 = hVar2;
                    }
                    if (i13 != 0) {
                        mVarB = EnterExitTransitionKt.e(null, 0.0f, 3).b(EnterExitTransitionKt.c(null, null, 15));
                    } else {
                        mVarB = mVar2;
                    }
                    if (i15 != 0) {
                        oVarB = EnterExitTransitionKt.j(null, null, 15).b(EnterExitTransitionKt.f(null, 3));
                    } else {
                        oVarB = oVar2;
                    }
                    if (i17 != 0) {
                        str4 = "AnimatedVisibility";
                    } else {
                        str4 = str2;
                    }
                    int i211 = i12 << 3;
                    f(TransitionKt.f(Boolean.valueOf(z10), str4, c1086gP, (i12 & 14) | ((i12 >> 9) & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle), 0), new Ia.l<Boolean, Boolean>() { // from class: androidx.compose.animation.AnimatedVisibilityKt$AnimatedVisibility$1
                        @Override // Ia.l
                        public final Boolean invoke(Boolean bool) {
                            Boolean bool2 = bool;
                            bool2.booleanValue();
                            return bool2;
                        }
                    }, hVar4, mVarB, oVarB, qVar, c1086gP, (i12 & 458752) | (i211 & 57344) | (i211 & 896) | 48 | (i211 & 7168));
                    hVar3 = hVar4;
                    mVar3 = mVarB;
                    str3 = str4;
                } else {
                    c1086gP.w();
                    hVar3 = hVar2;
                    mVar3 = mVar2;
                    oVarB = oVar2;
                    str3 = str2;
                }
                c1105p0V = c1086gP.V();
                if (c1105p0V != null) {
                    c1105p0V.f13109d = new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.animation.AnimatedVisibilityKt$AnimatedVisibility$2
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        /* JADX WARN: Multi-variable type inference failed */
                        {
                            super(2);
                        }

                        @Override // Ia.p
                        public final p293xa.r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                            num.intValue();
                            AnimatedVisibilityKt.e(z10, hVar3, mVar3, oVarB, str3, qVar, interfaceC1084f2, L4.b.l(i10 | 1), i11);
                            return p293xa.r.f47939a;
                        }
                    };
                }
            }
            i12 |= 24576;
            str2 = str;
            if ((i11 & 32) != 0) {
                i12 |= 196608;
            } else if ((i10 & 196608) == 0) {
                if (c1086gP.k(qVar)) {
                    i19 = 131072;
                } else {
                    i19 = 65536;
                }
                i12 |= i19;
            }
            if ((74899 & i12) != 74898) {
                z11 = true;
            } else {
                z11 = false;
            }
            if (c1086gP.C(i12 & 1, z11)) {
                if (i20 != 0) {
                    hVar4 = androidx.compose.ui.h.a.f13984b;
                } else {
                    hVar4 = hVar2;
                }
                if (i13 != 0) {
                    mVarB = EnterExitTransitionKt.e(null, 0.0f, 3).b(EnterExitTransitionKt.c(null, null, 15));
                } else {
                    mVarB = mVar2;
                }
                if (i15 != 0) {
                    oVarB = EnterExitTransitionKt.j(null, null, 15).b(EnterExitTransitionKt.f(null, 3));
                } else {
                    oVarB = oVar2;
                }
                if (i17 != 0) {
                    str4 = "AnimatedVisibility";
                } else {
                    str4 = str2;
                }
                int i212 = i12 << 3;
                f(TransitionKt.f(Boolean.valueOf(z10), str4, c1086gP, (i12 & 14) | ((i12 >> 9) & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle), 0), new Ia.l<Boolean, Boolean>() { // from class: androidx.compose.animation.AnimatedVisibilityKt$AnimatedVisibility$1
                    @Override // Ia.l
                    public final Boolean invoke(Boolean bool) {
                        Boolean bool2 = bool;
                        bool2.booleanValue();
                        return bool2;
                    }
                }, hVar4, mVarB, oVarB, qVar, c1086gP, (i12 & 458752) | (i212 & 57344) | (i212 & 896) | 48 | (i212 & 7168));
                hVar3 = hVar4;
                mVar3 = mVarB;
                str3 = str4;
            } else {
                c1086gP.w();
                hVar3 = hVar2;
                mVar3 = mVar2;
                oVarB = oVar2;
                str3 = str2;
            }
            c1105p0V = c1086gP.V();
            if (c1105p0V != null) {
                c1105p0V.f13109d = new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.animation.AnimatedVisibilityKt$AnimatedVisibility$2
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(2);
                    }

                    @Override // Ia.p
                    public final p293xa.r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                        num.intValue();
                        AnimatedVisibilityKt.e(z10, hVar3, mVar3, oVarB, str3, qVar, interfaceC1084f2, L4.b.l(i10 | 1), i11);
                        return p293xa.r.f47939a;
                    }
                };
            }
        }
        i12 |= 384;
        mVar2 = mVar;
        i15 = i11 & 8;
        if (i15 != 0) {
            if ((i10 & 3072) == 0) {
                oVar2 = oVar;
                if (c1086gP.K(oVar2)) {
                    i16 = 2048;
                } else {
                    i16 = 1024;
                }
                i12 |= i16;
            }
            i17 = i11 & 16;
            if (i17 != 0) {
                if ((i10 & 24576) == 0) {
                    str2 = str;
                    if (c1086gP.K(str2)) {
                        i18 = 16384;
                    } else {
                        i18 = 8192;
                    }
                    i12 |= i18;
                }
                if ((i11 & 32) != 0) {
                    i12 |= 196608;
                } else if ((i10 & 196608) == 0) {
                    if (c1086gP.k(qVar)) {
                        i19 = 131072;
                    } else {
                        i19 = 65536;
                    }
                    i12 |= i19;
                }
                if ((74899 & i12) != 74898) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                if (c1086gP.C(i12 & 1, z11)) {
                    if (i20 != 0) {
                        hVar4 = androidx.compose.ui.h.a.f13984b;
                    } else {
                        hVar4 = hVar2;
                    }
                    if (i13 != 0) {
                        mVarB = EnterExitTransitionKt.e(null, 0.0f, 3).b(EnterExitTransitionKt.c(null, null, 15));
                    } else {
                        mVarB = mVar2;
                    }
                    if (i15 != 0) {
                        oVarB = EnterExitTransitionKt.j(null, null, 15).b(EnterExitTransitionKt.f(null, 3));
                    } else {
                        oVarB = oVar2;
                    }
                    if (i17 != 0) {
                        str4 = "AnimatedVisibility";
                    } else {
                        str4 = str2;
                    }
                    int i213 = i12 << 3;
                    f(TransitionKt.f(Boolean.valueOf(z10), str4, c1086gP, (i12 & 14) | ((i12 >> 9) & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle), 0), new Ia.l<Boolean, Boolean>() { // from class: androidx.compose.animation.AnimatedVisibilityKt$AnimatedVisibility$1
                        @Override // Ia.l
                        public final Boolean invoke(Boolean bool) {
                            Boolean bool2 = bool;
                            bool2.booleanValue();
                            return bool2;
                        }
                    }, hVar4, mVarB, oVarB, qVar, c1086gP, (i12 & 458752) | (i213 & 57344) | (i213 & 896) | 48 | (i213 & 7168));
                    hVar3 = hVar4;
                    mVar3 = mVarB;
                    str3 = str4;
                } else {
                    c1086gP.w();
                    hVar3 = hVar2;
                    mVar3 = mVar2;
                    oVarB = oVar2;
                    str3 = str2;
                }
                c1105p0V = c1086gP.V();
                if (c1105p0V != null) {
                    c1105p0V.f13109d = new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.animation.AnimatedVisibilityKt$AnimatedVisibility$2
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        /* JADX WARN: Multi-variable type inference failed */
                        {
                            super(2);
                        }

                        @Override // Ia.p
                        public final p293xa.r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                            num.intValue();
                            AnimatedVisibilityKt.e(z10, hVar3, mVar3, oVarB, str3, qVar, interfaceC1084f2, L4.b.l(i10 | 1), i11);
                            return p293xa.r.f47939a;
                        }
                    };
                }
            }
            i12 |= 24576;
            str2 = str;
            if ((i11 & 32) != 0) {
                i12 |= 196608;
            } else if ((i10 & 196608) == 0) {
                if (c1086gP.k(qVar)) {
                    i19 = 131072;
                } else {
                    i19 = 65536;
                }
                i12 |= i19;
            }
            if ((74899 & i12) != 74898) {
                z11 = true;
            } else {
                z11 = false;
            }
            if (c1086gP.C(i12 & 1, z11)) {
                if (i20 != 0) {
                    hVar4 = androidx.compose.ui.h.a.f13984b;
                } else {
                    hVar4 = hVar2;
                }
                if (i13 != 0) {
                    mVarB = EnterExitTransitionKt.e(null, 0.0f, 3).b(EnterExitTransitionKt.c(null, null, 15));
                } else {
                    mVarB = mVar2;
                }
                if (i15 != 0) {
                    oVarB = EnterExitTransitionKt.j(null, null, 15).b(EnterExitTransitionKt.f(null, 3));
                } else {
                    oVarB = oVar2;
                }
                if (i17 != 0) {
                    str4 = "AnimatedVisibility";
                } else {
                    str4 = str2;
                }
                int i214 = i12 << 3;
                f(TransitionKt.f(Boolean.valueOf(z10), str4, c1086gP, (i12 & 14) | ((i12 >> 9) & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle), 0), new Ia.l<Boolean, Boolean>() { // from class: androidx.compose.animation.AnimatedVisibilityKt$AnimatedVisibility$1
                    @Override // Ia.l
                    public final Boolean invoke(Boolean bool) {
                        Boolean bool2 = bool;
                        bool2.booleanValue();
                        return bool2;
                    }
                }, hVar4, mVarB, oVarB, qVar, c1086gP, (i12 & 458752) | (i214 & 57344) | (i214 & 896) | 48 | (i214 & 7168));
                hVar3 = hVar4;
                mVar3 = mVarB;
                str3 = str4;
            } else {
                c1086gP.w();
                hVar3 = hVar2;
                mVar3 = mVar2;
                oVarB = oVar2;
                str3 = str2;
            }
            c1105p0V = c1086gP.V();
            if (c1105p0V != null) {
                c1105p0V.f13109d = new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.animation.AnimatedVisibilityKt$AnimatedVisibility$2
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(2);
                    }

                    @Override // Ia.p
                    public final p293xa.r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                        num.intValue();
                        AnimatedVisibilityKt.e(z10, hVar3, mVar3, oVarB, str3, qVar, interfaceC1084f2, L4.b.l(i10 | 1), i11);
                        return p293xa.r.f47939a;
                    }
                };
            }
        }
        i12 |= 3072;
        oVar2 = oVar;
        i17 = i11 & 16;
        if (i17 != 0) {
            if ((i10 & 24576) == 0) {
                str2 = str;
                if (c1086gP.K(str2)) {
                    i18 = 16384;
                } else {
                    i18 = 8192;
                }
                i12 |= i18;
            }
            if ((i11 & 32) != 0) {
                i12 |= 196608;
            } else if ((i10 & 196608) == 0) {
                if (c1086gP.k(qVar)) {
                    i19 = 131072;
                } else {
                    i19 = 65536;
                }
                i12 |= i19;
            }
            if ((74899 & i12) != 74898) {
                z11 = true;
            } else {
                z11 = false;
            }
            if (c1086gP.C(i12 & 1, z11)) {
                if (i20 != 0) {
                    hVar4 = androidx.compose.ui.h.a.f13984b;
                } else {
                    hVar4 = hVar2;
                }
                if (i13 != 0) {
                    mVarB = EnterExitTransitionKt.e(null, 0.0f, 3).b(EnterExitTransitionKt.c(null, null, 15));
                } else {
                    mVarB = mVar2;
                }
                if (i15 != 0) {
                    oVarB = EnterExitTransitionKt.j(null, null, 15).b(EnterExitTransitionKt.f(null, 3));
                } else {
                    oVarB = oVar2;
                }
                if (i17 != 0) {
                    str4 = "AnimatedVisibility";
                } else {
                    str4 = str2;
                }
                int i215 = i12 << 3;
                f(TransitionKt.f(Boolean.valueOf(z10), str4, c1086gP, (i12 & 14) | ((i12 >> 9) & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle), 0), new Ia.l<Boolean, Boolean>() { // from class: androidx.compose.animation.AnimatedVisibilityKt$AnimatedVisibility$1
                    @Override // Ia.l
                    public final Boolean invoke(Boolean bool) {
                        Boolean bool2 = bool;
                        bool2.booleanValue();
                        return bool2;
                    }
                }, hVar4, mVarB, oVarB, qVar, c1086gP, (i12 & 458752) | (i215 & 57344) | (i215 & 896) | 48 | (i215 & 7168));
                hVar3 = hVar4;
                mVar3 = mVarB;
                str3 = str4;
            } else {
                c1086gP.w();
                hVar3 = hVar2;
                mVar3 = mVar2;
                oVarB = oVar2;
                str3 = str2;
            }
            c1105p0V = c1086gP.V();
            if (c1105p0V != null) {
                c1105p0V.f13109d = new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.animation.AnimatedVisibilityKt$AnimatedVisibility$2
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(2);
                    }

                    @Override // Ia.p
                    public final p293xa.r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                        num.intValue();
                        AnimatedVisibilityKt.e(z10, hVar3, mVar3, oVarB, str3, qVar, interfaceC1084f2, L4.b.l(i10 | 1), i11);
                        return p293xa.r.f47939a;
                    }
                };
            }
        }
        i12 |= 24576;
        str2 = str;
        if ((i11 & 32) != 0) {
            i12 |= 196608;
        } else if ((i10 & 196608) == 0) {
            if (c1086gP.k(qVar)) {
                i19 = 131072;
            } else {
                i19 = 65536;
            }
            i12 |= i19;
        }
        if ((74899 & i12) != 74898) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (c1086gP.C(i12 & 1, z11)) {
            if (i20 != 0) {
                hVar4 = androidx.compose.ui.h.a.f13984b;
            } else {
                hVar4 = hVar2;
            }
            if (i13 != 0) {
                mVarB = EnterExitTransitionKt.e(null, 0.0f, 3).b(EnterExitTransitionKt.c(null, null, 15));
            } else {
                mVarB = mVar2;
            }
            if (i15 != 0) {
                oVarB = EnterExitTransitionKt.j(null, null, 15).b(EnterExitTransitionKt.f(null, 3));
            } else {
                oVarB = oVar2;
            }
            if (i17 != 0) {
                str4 = "AnimatedVisibility";
            } else {
                str4 = str2;
            }
            int i216 = i12 << 3;
            f(TransitionKt.f(Boolean.valueOf(z10), str4, c1086gP, (i12 & 14) | ((i12 >> 9) & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle), 0), new Ia.l<Boolean, Boolean>() { // from class: androidx.compose.animation.AnimatedVisibilityKt$AnimatedVisibility$1
                @Override // Ia.l
                public final Boolean invoke(Boolean bool) {
                    Boolean bool2 = bool;
                    bool2.booleanValue();
                    return bool2;
                }
            }, hVar4, mVarB, oVarB, qVar, c1086gP, (i12 & 458752) | (i216 & 57344) | (i216 & 896) | 48 | (i216 & 7168));
            hVar3 = hVar4;
            mVar3 = mVarB;
            str3 = str4;
        } else {
            c1086gP.w();
            hVar3 = hVar2;
            mVar3 = mVar2;
            oVarB = oVar2;
            str3 = str2;
        }
        c1105p0V = c1086gP.V();
        if (c1105p0V != null) {
            c1105p0V.f13109d = new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.animation.AnimatedVisibilityKt$AnimatedVisibility$2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(2);
                }

                @Override // Ia.p
                public final p293xa.r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                    num.intValue();
                    AnimatedVisibilityKt.e(z10, hVar3, mVar3, oVarB, str3, qVar, interfaceC1084f2, L4.b.l(i10 | 1), i11);
                    return p293xa.r.f47939a;
                }
            };
        }
    }

    public static final <T> void f(final Transition<T> transition, final Ia.l<? super T, Boolean> lVar, final androidx.compose.ui.h hVar, final m mVar, final o oVar, final Ia.q<? super InterfaceC0928f, ? super InterfaceC1084f, ? super Integer, p293xa.r> qVar, InterfaceC1084f interfaceC1084f, final int i10) {
        int i11;
        C1086g c1086gP = interfaceC1084f.p(429978603);
        if ((i10 & 6) == 0) {
            i11 = (c1086gP.K(transition) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            i11 |= c1086gP.k(lVar) ? 32 : 16;
        }
        if ((i10 & 384) == 0) {
            i11 |= c1086gP.K(hVar) ? 256 : 128;
        }
        if ((i10 & 3072) == 0) {
            i11 |= c1086gP.K(mVar) ? 2048 : 1024;
        }
        if ((i10 & 24576) == 0) {
            i11 |= c1086gP.K(oVar) ? 16384 : 8192;
        }
        if ((i10 & 196608) == 0) {
            i11 |= c1086gP.k(qVar) ? 131072 : 65536;
        }
        if (c1086gP.C(i11 & 1, (74899 & i11) != 74898)) {
            int i12 = i11 & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle;
            int i13 = i11 & 14;
            boolean z10 = (i12 == 32) | (i13 == 4);
            Object objF = c1086gP.f();
            if (z10 || objF == InterfaceC1084f.a.f12980a) {
                objF = new Ia.q<H, androidx.compose.ui.layout.D, p013b0.a, androidx.compose.ui.layout.F>() { // from class: androidx.compose.animation.AnimatedVisibilityKt$AnimatedVisibilityImpl$1$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(3);
                    }

                    /* JADX WARN: Type inference fix 'apply assigned field type' failed
                    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
                    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
                    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
                    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
                    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
                    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
                    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
                    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
                     */
                    @Override // Ia.q
                    public final androidx.compose.ui.layout.F invoke(H h8, androidx.compose.ui.layout.D d10, p013b0.a aVar) {
                        long j;
                        H h10 = h8;
                        final Y yQ = d10.Q(aVar.f20475a);
                        if (!h10.S0() || lVar.invoke(transition.f9432d.getValue()).booleanValue()) {
                            j = (((long) yQ.f14220b) << 32) | (((long) yQ.f14221c) & 4294967295L);
                        } else {
                            j = 0;
                        }
                        return h10.y1((int) (j >> 32), (int) (4294967295L & j), kotlin.collections.y.p(), new Ia.l<Y.a, p293xa.r>() { // from class: androidx.compose.animation.AnimatedVisibilityKt$AnimatedVisibilityImpl$1$1.1
                            {
                                super(1);
                            }

                            @Override // Ia.l
                            public final p293xa.r invoke(Y.a aVar2) {
                                aVar2.d(yQ, 0, 0, 0.0f);
                                return p293xa.r.f47939a;
                            }
                        });
                    }
                };
                c1086gP.E(objF);
            }
            a(transition, lVar, C1177x.a(hVar, (Ia.q) objF), mVar, oVar, new Ia.p<EnterExitState, EnterExitState, Boolean>() { // from class: androidx.compose.animation.AnimatedVisibilityKt$AnimatedVisibilityImpl$2
                @Override // Ia.p
                public final Boolean invoke(EnterExitState enterExitState, EnterExitState enterExitState2) {
                    EnterExitState enterExitState3 = enterExitState2;
                    return Boolean.valueOf(enterExitState == enterExitState3 && enterExitState3 == EnterExitState.f9278d);
                }
            }, qVar, c1086gP, i13 | 196608 | i12 | (i11 & 7168) | (57344 & i11) | ((i11 << 6) & 29360128), 64);
        } else {
            c1086gP.w();
        }
        C1105p0 c1105p0V = c1086gP.V();
        if (c1105p0V != null) {
            c1105p0V.f13109d = new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.animation.AnimatedVisibilityKt$AnimatedVisibilityImpl$3
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(2);
                }

                @Override // Ia.p
                public final p293xa.r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                    num.intValue();
                    AnimatedVisibilityKt.f(transition, lVar, hVar, mVar, oVar, qVar, interfaceC1084f2, L4.b.l(i10 | 1));
                    return p293xa.r.f47939a;
                }
            };
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final EnterExitState g(Transition transition, Ia.l lVar, Object obj, InterfaceC1084f interfaceC1084f) {
        EnterExitState enterExitState;
        interfaceC1084f.q(-902032957, transition);
        boolean zG = transition.g();
        b0<S> b0Var = transition.f9429a;
        if (zG) {
            interfaceC1084f.L(2101770115);
            interfaceC1084f.D();
            if (((Boolean) lVar.invoke(obj)).booleanValue()) {
                enterExitState = EnterExitState.f9277c;
            } else {
                enterExitState = ((Boolean) lVar.invoke(b0Var.a())).booleanValue() ? EnterExitState.f9278d : EnterExitState.f9276b;
            }
        } else {
            interfaceC1084f.L(2102044248);
            Object objF = interfaceC1084f.f();
            if (objF == InterfaceC1084f.a.f12980a) {
                objF = J0.f(Boolean.FALSE);
                interfaceC1084f.E(objF);
            }
            X x10 = (X) objF;
            if (((Boolean) lVar.invoke(b0Var.a())).booleanValue()) {
                x10.setValue(Boolean.TRUE);
            }
            if (((Boolean) lVar.invoke(obj)).booleanValue()) {
                enterExitState = EnterExitState.f9277c;
            } else {
                enterExitState = ((Boolean) x10.getValue()).booleanValue() ? EnterExitState.f9278d : EnterExitState.f9276b;
            }
            interfaceC1084f.D();
        }
        interfaceC1084f.H();
        return enterExitState;
    }
}
