package androidx.compose.material3;

import androidx.compose.animation.core.Transition;
import androidx.compose.animation.core.TransitionKt;
import androidx.compose.animation.core.VectorConvertersKt;
import androidx.compose.foundation.C0937i;
import androidx.compose.foundation.ClickableKt;
import androidx.compose.foundation.ScrollKt;
import androidx.compose.foundation.ScrollState;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.C0945e;
import androidx.compose.foundation.layout.C0952l;
import androidx.compose.foundation.layout.C0953m;
import androidx.compose.foundation.layout.C0955o;
import androidx.compose.foundation.layout.InterfaceC0954n;
import androidx.compose.foundation.layout.IntrinsicSize;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.runtime.C1085f0;
import androidx.compose.runtime.C1086g;
import androidx.compose.runtime.C1101n0;
import androidx.compose.runtime.C1105p0;
import androidx.compose.runtime.CompositionLocalKt;
import androidx.compose.runtime.InterfaceC1084f;
import androidx.compose.runtime.InterfaceC1089h0;
import androidx.compose.runtime.N0;
import androidx.compose.runtime.R0;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.InspectionModeKt;
import me.zhanghai.android.materialprogressbar.R;
import p114j1.C2479a;

/* JADX INFO: compiled from: Menu.kt */
/* JADX INFO: loaded from: classes.dex */
public final class MenuKt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final float f12211a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final float f12212b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final float f12213c = 12;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final float f12214d = 8;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final float f12215e = R.styleable.AppCompatTheme_toolbarNavigationButtonStyle;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final float f12216f = 280;

    static {
        float f10 = 48;
        f12211a = f10;
        f12212b = f10;
    }

    /* JADX WARN: Multi-variable type inference failed */
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
    public static final void a(final androidx.compose.ui.h hVar, final androidx.compose.animation.core.K<Boolean> k10, final androidx.compose.runtime.X<androidx.compose.ui.graphics.q0> x10, final ScrollState scrollState, final androidx.compose.ui.graphics.l0 l0Var, final long j, final float f10, final float f11, final C0937i c0937i, final Ia.q<? super InterfaceC0954n, ? super InterfaceC1084f, ? super Integer, p293xa.r> qVar, InterfaceC1084f interfaceC1084f, final int i10) {
        int i11;
        C1086g c1086gP = interfaceC1084f.p(-151448888);
        if ((i10 & 6) == 0) {
            i11 = (c1086gP.K(hVar) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            i11 |= (i10 & 64) == 0 ? c1086gP.K(k10) : c1086gP.k(k10) ? 32 : 16;
        }
        if ((i10 & 384) == 0) {
            i11 |= c1086gP.K(x10) ? 256 : 128;
        }
        if ((i10 & 3072) == 0) {
            i11 |= c1086gP.K(scrollState) ? 2048 : 1024;
        }
        if ((i10 & 24576) == 0) {
            i11 |= c1086gP.K(l0Var) ? 16384 : 8192;
        }
        if ((196608 & i10) == 0) {
            i11 |= c1086gP.i(j) ? 131072 : 65536;
        }
        if ((1572864 & i10) == 0) {
            i11 |= c1086gP.g(f10) ? 1048576 : 524288;
        }
        if ((i10 & 12582912) == 0) {
            i11 |= c1086gP.g(f11) ? 8388608 : 4194304;
        }
        if ((100663296 & i10) == 0) {
            i11 |= c1086gP.K(c0937i) ? 67108864 : 33554432;
        }
        if ((i10 & 805306368) == 0) {
            i11 |= c1086gP.k(qVar) ? 536870912 : 268435456;
        }
        if ((i11 & 306783379) == 306783378 && c1086gP.s()) {
            c1086gP.w();
        } else {
            Transition transitionE = TransitionKt.e(k10, "DropDownMenu", c1086gP, (((i11 >> 3) & 14) | 48) & R.styleable.AppCompatTheme_windowNoTitle);
            androidx.compose.animation.core.e0 e0Var = VectorConvertersKt.f9477a;
            boolean zBooleanValue = ((Boolean) transitionE.f9429a.a()).booleanValue();
            c1086gP.L(2139028452);
            float f12 = zBooleanValue ? 1.0f : 0.8f;
            c1086gP.T(false);
            Float fValueOf = Float.valueOf(f12);
            C1085f0 c1085f0 = transitionE.f9432d;
            boolean zBooleanValue2 = ((Boolean) c1085f0.getValue()).booleanValue();
            c1086gP.L(2139028452);
            float f13 = zBooleanValue2 ? 1.0f : 0.8f;
            c1086gP.T(false);
            final Transition.d dVarD = TransitionKt.d(transitionE, fValueOf, Float.valueOf(f13), MenuKt$DropdownMenuContent$scale$2.f12218h.invoke(transitionE.f(), c1086gP, 0), e0Var, c1086gP, 0);
            boolean zBooleanValue3 = ((Boolean) transitionE.f9429a.a()).booleanValue();
            c1086gP.L(-249413128);
            float f14 = zBooleanValue3 ? 1.0f : 0.0f;
            c1086gP.T(false);
            Float fValueOf2 = Float.valueOf(f14);
            boolean zBooleanValue4 = ((Boolean) c1085f0.getValue()).booleanValue();
            c1086gP.L(-249413128);
            float f15 = zBooleanValue4 ? 1.0f : 0.0f;
            c1086gP.T(false);
            final Transition.d dVarD2 = TransitionKt.d(transitionE, fValueOf2, Float.valueOf(f15), MenuKt$DropdownMenuContent$alpha$2.f12217h.invoke(transitionE.f(), c1086gP, 0), e0Var, c1086gP, 0);
            final boolean zBooleanValue5 = ((Boolean) c1086gP.x(InspectionModeKt.f14931a)).booleanValue();
            androidx.compose.ui.h.a aVar = androidx.compose.ui.h.a.f13984b;
            boolean zC = c1086gP.c(zBooleanValue5) | c1086gP.K(dVarD) | ((i11 & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) == 32 || ((i11 & 64) != 0 && c1086gP.k(k10))) | c1086gP.K(dVarD2) | ((i11 & 896) == 256);
            Object objF = c1086gP.f();
            if (zC || objF == InterfaceC1084f.a.f12980a) {
                Ia.l<androidx.compose.ui.graphics.U, p293xa.r> lVar = new Ia.l<androidx.compose.ui.graphics.U, p293xa.r>() { // from class: androidx.compose.material3.MenuKt$DropdownMenuContent$1$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(1);
                    }

                    /* JADX WARN: Multi-variable type inference failed */
                    @Override // Ia.l
                    public final p293xa.r invoke(androidx.compose.ui.graphics.U u10) {
                        float fFloatValue;
                        androidx.compose.ui.graphics.U u11 = u10;
                        float fFloatValue2 = 0.8f;
                        float fFloatValue3 = 1.0f;
                        if (zBooleanValue5) {
                            fFloatValue = ((Boolean) k10.f9382c.getValue()).booleanValue() ? 1.0f : 0.8f;
                        } else {
                            N0<Float> n10 = dVarD;
                            float f16 = MenuKt.f12211a;
                            fFloatValue = n10.getValue().floatValue();
                        }
                        u11.i(fFloatValue);
                        if (!zBooleanValue5) {
                            N0<Float> n11 = dVarD;
                            float f17 = MenuKt.f12211a;
                            fFloatValue2 = n11.getValue().floatValue();
                        } else if (((Boolean) k10.f9382c.getValue()).booleanValue()) {
                            fFloatValue2 = 1.0f;
                        }
                        u11.h(fFloatValue2);
                        if (!zBooleanValue5) {
                            N0<Float> n12 = dVarD2;
                            float f18 = MenuKt.f12211a;
                            fFloatValue3 = n12.getValue().floatValue();
                        } else if (!((Boolean) k10.f9382c.getValue()).booleanValue()) {
                            fFloatValue3 = 0.0f;
                        }
                        u11.b(fFloatValue3);
                        u11.f1(x10.getValue().f13793a);
                        return p293xa.r.f47939a;
                    }
                };
                c1086gP.E(lVar);
                objF = lVar;
            }
            int i12 = i11 >> 9;
            int i13 = i11 >> 6;
            SurfaceKt.a(androidx.compose.ui.graphics.T.a(aVar, (Ia.l) objF), l0Var, j, 0L, f10, f11, c0937i, androidx.compose.runtime.internal.a.b(1573559053, new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.material3.MenuKt$DropdownMenuContent$2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(2);
                }

                @Override // Ia.p
                public final p293xa.r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                    InterfaceC1084f interfaceC1084f3 = interfaceC1084f2;
                    if ((num.intValue() & 3) == 2 && interfaceC1084f3.s()) {
                        interfaceC1084f3.w();
                    } else {
                        androidx.compose.ui.h hVarH = PaddingKt.h(hVar, 0.0f, MenuKt.f12214d, 1);
                        IntrinsicSize intrinsicSize = IntrinsicSize.f10155b;
                        androidx.compose.ui.h hVarB = ScrollKt.b(androidx.compose.foundation.layout.G.b(hVarH), scrollState, false, 14);
                        Ia.q<InterfaceC0954n, InterfaceC1084f, Integer, p293xa.r> qVar2 = qVar;
                        C0953m c0953mA = C0952l.a(C0945e.f10286c, androidx.compose.ui.d.a.f13346m, interfaceC1084f3, 0);
                        int iF = interfaceC1084f3.F();
                        InterfaceC1089h0 interfaceC1089h0Z = interfaceC1084f3.z();
                        androidx.compose.ui.h hVarC = ComposedModifierKt.c(interfaceC1084f3, hVarB);
                        ComposeUiNode.f14331c0.getClass();
                        Ia.a<ComposeUiNode> aVar2 = ComposeUiNode.Companion.f14333b;
                        if (interfaceC1084f3.u() == null) {
                            I.b.k();
                            throw null;
                        }
                        interfaceC1084f3.r();
                        if (interfaceC1084f3.m()) {
                            interfaceC1084f3.v(aVar2);
                        } else {
                            interfaceC1084f3.A();
                        }
                        R0.a(ComposeUiNode.Companion.f14337f, interfaceC1084f3, c0953mA);
                        R0.a(ComposeUiNode.Companion.f14336e, interfaceC1084f3, interfaceC1089h0Z);
                        Ia.p<ComposeUiNode, Integer, p293xa.r> pVar = ComposeUiNode.Companion.f14338g;
                        if (interfaceC1084f3.m() || !kotlin.jvm.internal.i.a(interfaceC1084f3.f(), Integer.valueOf(iF))) {
                            androidx.compose.animation.k.b(iF, interfaceC1084f3, iF, pVar);
                        }
                        R0.a(ComposeUiNode.Companion.f14335d, interfaceC1084f3, hVarC);
                        qVar2.invoke(C0955o.f10310a, interfaceC1084f3, 6);
                        interfaceC1084f3.J();
                    }
                    return p293xa.r.f47939a;
                }
            }, c1086gP), c1086gP, (i12 & 896) | (i12 & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) | 12582912 | (57344 & i13) | (458752 & i13) | (i13 & 3670016), 8);
        }
        C1105p0 c1105p0V = c1086gP.V();
        if (c1105p0V != null) {
            c1105p0V.f13109d = new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.material3.MenuKt$DropdownMenuContent$3
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(2);
                }

                @Override // Ia.p
                public final p293xa.r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                    num.intValue();
                    MenuKt.a(hVar, k10, x10, scrollState, l0Var, j, f10, f11, c0937i, qVar, interfaceC1084f2, L4.b.l(i10 | 1));
                    return p293xa.r.f47939a;
                }
            };
        }
    }

    public static final void b(final Ia.p<? super InterfaceC1084f, ? super Integer, p293xa.r> pVar, final Ia.a<p293xa.r> aVar, final androidx.compose.ui.h hVar, final Ia.p<? super InterfaceC1084f, ? super Integer, p293xa.r> pVar2, final Ia.p<? super InterfaceC1084f, ? super Integer, p293xa.r> pVar3, final boolean z10, final O o10, final androidx.compose.foundation.layout.L l10, final androidx.compose.foundation.interaction.k kVar, InterfaceC1084f interfaceC1084f, final int i10) {
        int i11;
        C1086g c1086gP = interfaceC1084f.p(-1564716777);
        if ((i10 & 6) == 0) {
            i11 = (c1086gP.k(pVar) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            i11 |= c1086gP.k(aVar) ? 32 : 16;
        }
        if ((i10 & 384) == 0) {
            i11 |= c1086gP.K(hVar) ? 256 : 128;
        }
        if ((i10 & 3072) == 0) {
            i11 |= c1086gP.k(pVar2) ? 2048 : 1024;
        }
        if ((i10 & 24576) == 0) {
            i11 |= c1086gP.k(pVar3) ? 16384 : 8192;
        }
        if ((196608 & i10) == 0) {
            i11 |= c1086gP.c(z10) ? 131072 : 65536;
        }
        if ((1572864 & i10) == 0) {
            i11 |= c1086gP.K(o10) ? 1048576 : 524288;
        }
        if ((12582912 & i10) == 0) {
            i11 |= c1086gP.K(l10) ? 8388608 : 4194304;
        }
        if ((100663296 & i10) == 0) {
            i11 |= c1086gP.K(kVar) ? 67108864 : 33554432;
        }
        if ((i11 & 38347923) == 38347922 && c1086gP.s()) {
            c1086gP.w();
        } else {
            androidx.compose.ui.h hVarE = PaddingKt.e(androidx.compose.foundation.layout.W.p(androidx.compose.foundation.layout.W.d(ClickableKt.b(hVar, kVar, RippleKt.c(true, 0.0f, c1086gP, 6, 6), z10, null, aVar, 24), 1.0f), f12215e, f12212b, f12216f, 0.0f, 8), l10);
            androidx.compose.foundation.layout.T tA = androidx.compose.foundation.layout.S.a(C0945e.f10284a, androidx.compose.ui.d.a.f13344k, c1086gP, 48);
            int i12 = c1086gP.f12996P;
            InterfaceC1089h0 interfaceC1089h0P = c1086gP.P();
            androidx.compose.ui.h hVarC = ComposedModifierKt.c(c1086gP, hVarE);
            ComposeUiNode.f14331c0.getClass();
            Ia.a<ComposeUiNode> aVar2 = ComposeUiNode.Companion.f14333b;
            c1086gP.r();
            if (c1086gP.f12995O) {
                c1086gP.v(aVar2);
            } else {
                c1086gP.A();
            }
            R0.a(ComposeUiNode.Companion.f14337f, c1086gP, tA);
            R0.a(ComposeUiNode.Companion.f14336e, c1086gP, interfaceC1089h0P);
            Ia.p<ComposeUiNode, Integer, p293xa.r> pVar4 = ComposeUiNode.Companion.f14338g;
            if (c1086gP.f12995O || !kotlin.jvm.internal.i.a(c1086gP.f(), Integer.valueOf(i12))) {
                J4.i.d(i12, c1086gP, i12, pVar4);
            }
            R0.a(ComposeUiNode.Companion.f14335d, c1086gP, hVarC);
            TextKt.a(((q0) c1086gP.x(TypographyKt.f12404a)).f12699m, androidx.compose.runtime.internal.a.b(1065051884, new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.material3.MenuKt$DropdownMenuItemContent$1$1
                final /* synthetic */ androidx.compose.foundation.layout.U $this_Row = androidx.compose.foundation.layout.V.f10222a;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // Ia.p
                public final p293xa.r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                    InterfaceC1084f interfaceC1084f3 = interfaceC1084f2;
                    if ((num.intValue() & 3) == 2 && interfaceC1084f3.s()) {
                        interfaceC1084f3.w();
                    } else {
                        interfaceC1084f3.L(1264683960);
                        if (pVar2 != null) {
                            androidx.compose.runtime.C c10 = ContentColorKt.f12125a;
                            O o11 = o10;
                            C1101n0 c1101n0B = B7.b.b(z10 ? o11.f12248b : o11.f12251e, c10);
                            final Ia.p<InterfaceC1084f, Integer, p293xa.r> pVar5 = pVar2;
                            CompositionLocalKt.a(c1101n0B, androidx.compose.runtime.internal.a.b(2035552199, new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.material3.MenuKt$DropdownMenuItemContent$1$1.1
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                /* JADX WARN: Multi-variable type inference failed */
                                {
                                    super(2);
                                }

                                @Override // Ia.p
                                public final p293xa.r invoke(InterfaceC1084f interfaceC1084f4, Integer num2) {
                                    InterfaceC1084f interfaceC1084f5 = interfaceC1084f4;
                                    if ((num2.intValue() & 3) == 2 && interfaceC1084f5.s()) {
                                        interfaceC1084f5.w();
                                    } else {
                                        androidx.compose.ui.h hVarB = androidx.compose.foundation.layout.W.b(androidx.compose.ui.h.a.f13984b, B.o.f1309i, 0.0f, 2);
                                        Ia.p<InterfaceC1084f, Integer, p293xa.r> pVar6 = pVar5;
                                        androidx.compose.ui.layout.E eD = BoxKt.d(androidx.compose.ui.d.a.f13335a, false);
                                        int iF = interfaceC1084f5.F();
                                        InterfaceC1089h0 interfaceC1089h0Z = interfaceC1084f5.z();
                                        androidx.compose.ui.h hVarC2 = ComposedModifierKt.c(interfaceC1084f5, hVarB);
                                        ComposeUiNode.f14331c0.getClass();
                                        Ia.a<ComposeUiNode> aVar3 = ComposeUiNode.Companion.f14333b;
                                        if (interfaceC1084f5.u() == null) {
                                            I.b.k();
                                            throw null;
                                        }
                                        interfaceC1084f5.r();
                                        if (interfaceC1084f5.m()) {
                                            interfaceC1084f5.v(aVar3);
                                        } else {
                                            interfaceC1084f5.A();
                                        }
                                        R0.a(ComposeUiNode.Companion.f14337f, interfaceC1084f5, eD);
                                        R0.a(ComposeUiNode.Companion.f14336e, interfaceC1084f5, interfaceC1089h0Z);
                                        Ia.p<ComposeUiNode, Integer, p293xa.r> pVar7 = ComposeUiNode.Companion.f14338g;
                                        if (interfaceC1084f5.m() || !kotlin.jvm.internal.i.a(interfaceC1084f5.f(), Integer.valueOf(iF))) {
                                            androidx.compose.animation.k.b(iF, interfaceC1084f5, iF, pVar7);
                                        }
                                        R0.a(ComposeUiNode.Companion.f14335d, interfaceC1084f5, hVarC2);
                                        androidx.compose.foundation.gestures.d.c(pVar6, interfaceC1084f5, 0);
                                    }
                                    return p293xa.r.f47939a;
                                }
                            }, interfaceC1084f3), interfaceC1084f3, 56);
                        }
                        interfaceC1084f3.D();
                        androidx.compose.runtime.C c11 = ContentColorKt.f12125a;
                        O o12 = o10;
                        C1101n0 c1101n0B2 = B7.b.b(z10 ? o12.f12247a : o12.f12250d, c11);
                        final androidx.compose.foundation.layout.U u10 = this.$this_Row;
                        final Ia.p<InterfaceC1084f, Integer, p293xa.r> pVar6 = pVar2;
                        final Ia.p<InterfaceC1084f, Integer, p293xa.r> pVar7 = pVar3;
                        final Ia.p<InterfaceC1084f, Integer, p293xa.r> pVar8 = pVar;
                        CompositionLocalKt.a(c1101n0B2, androidx.compose.runtime.internal.a.b(-1728894036, new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.material3.MenuKt$DropdownMenuItemContent$1$1.2
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            /* JADX WARN: Multi-variable type inference failed */
                            {
                                super(2);
                            }

                            @Override // Ia.p
                            public final p293xa.r invoke(InterfaceC1084f interfaceC1084f4, Integer num2) {
                                InterfaceC1084f interfaceC1084f5 = interfaceC1084f4;
                                if ((num2.intValue() & 3) == 2 && interfaceC1084f5.s()) {
                                    interfaceC1084f5.w();
                                } else {
                                    androidx.compose.ui.h hVarJ = PaddingKt.j(u10.b(androidx.compose.ui.h.a.f13984b, true), pVar6 != null ? MenuKt.f12213c : 0, 0.0f, pVar7 != null ? MenuKt.f12213c : 0, 0.0f, 10);
                                    Ia.p<InterfaceC1084f, Integer, p293xa.r> pVar9 = pVar8;
                                    androidx.compose.ui.layout.E eD = BoxKt.d(androidx.compose.ui.d.a.f13335a, false);
                                    int iF = interfaceC1084f5.F();
                                    InterfaceC1089h0 interfaceC1089h0Z = interfaceC1084f5.z();
                                    androidx.compose.ui.h hVarC2 = ComposedModifierKt.c(interfaceC1084f5, hVarJ);
                                    ComposeUiNode.f14331c0.getClass();
                                    Ia.a<ComposeUiNode> aVar3 = ComposeUiNode.Companion.f14333b;
                                    if (interfaceC1084f5.u() == null) {
                                        I.b.k();
                                        throw null;
                                    }
                                    interfaceC1084f5.r();
                                    if (interfaceC1084f5.m()) {
                                        interfaceC1084f5.v(aVar3);
                                    } else {
                                        interfaceC1084f5.A();
                                    }
                                    R0.a(ComposeUiNode.Companion.f14337f, interfaceC1084f5, eD);
                                    R0.a(ComposeUiNode.Companion.f14336e, interfaceC1084f5, interfaceC1089h0Z);
                                    Ia.p<ComposeUiNode, Integer, p293xa.r> pVar10 = ComposeUiNode.Companion.f14338g;
                                    if (interfaceC1084f5.m() || !kotlin.jvm.internal.i.a(interfaceC1084f5.f(), Integer.valueOf(iF))) {
                                        androidx.compose.animation.k.b(iF, interfaceC1084f5, iF, pVar10);
                                    }
                                    R0.a(ComposeUiNode.Companion.f14335d, interfaceC1084f5, hVarC2);
                                    androidx.compose.foundation.gestures.d.c(pVar9, interfaceC1084f5, 0);
                                }
                                return p293xa.r.f47939a;
                            }
                        }, interfaceC1084f3), interfaceC1084f3, 56);
                        if (pVar3 != null) {
                            O o13 = o10;
                            C1101n0 c1101n0B3 = B7.b.b(z10 ? o13.f12249c : o13.f12252f, c11);
                            final Ia.p<InterfaceC1084f, Integer, p293xa.r> pVar9 = pVar3;
                            CompositionLocalKt.a(c1101n0B3, androidx.compose.runtime.internal.a.b(580312062, new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.material3.MenuKt$DropdownMenuItemContent$1$1.3
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                /* JADX WARN: Multi-variable type inference failed */
                                {
                                    super(2);
                                }

                                @Override // Ia.p
                                public final p293xa.r invoke(InterfaceC1084f interfaceC1084f4, Integer num2) {
                                    InterfaceC1084f interfaceC1084f5 = interfaceC1084f4;
                                    if ((num2.intValue() & 3) == 2 && interfaceC1084f5.s()) {
                                        interfaceC1084f5.w();
                                    } else {
                                        androidx.compose.ui.h hVarB = androidx.compose.foundation.layout.W.b(androidx.compose.ui.h.a.f13984b, B.o.f1310k, 0.0f, 2);
                                        Ia.p<InterfaceC1084f, Integer, p293xa.r> pVar10 = pVar9;
                                        androidx.compose.ui.layout.E eD = BoxKt.d(androidx.compose.ui.d.a.f13335a, false);
                                        int iF = interfaceC1084f5.F();
                                        InterfaceC1089h0 interfaceC1089h0Z = interfaceC1084f5.z();
                                        androidx.compose.ui.h hVarC2 = ComposedModifierKt.c(interfaceC1084f5, hVarB);
                                        ComposeUiNode.f14331c0.getClass();
                                        Ia.a<ComposeUiNode> aVar3 = ComposeUiNode.Companion.f14333b;
                                        if (interfaceC1084f5.u() == null) {
                                            I.b.k();
                                            throw null;
                                        }
                                        interfaceC1084f5.r();
                                        if (interfaceC1084f5.m()) {
                                            interfaceC1084f5.v(aVar3);
                                        } else {
                                            interfaceC1084f5.A();
                                        }
                                        R0.a(ComposeUiNode.Companion.f14337f, interfaceC1084f5, eD);
                                        R0.a(ComposeUiNode.Companion.f14336e, interfaceC1084f5, interfaceC1089h0Z);
                                        Ia.p<ComposeUiNode, Integer, p293xa.r> pVar11 = ComposeUiNode.Companion.f14338g;
                                        if (interfaceC1084f5.m() || !kotlin.jvm.internal.i.a(interfaceC1084f5.f(), Integer.valueOf(iF))) {
                                            androidx.compose.animation.k.b(iF, interfaceC1084f5, iF, pVar11);
                                        }
                                        R0.a(ComposeUiNode.Companion.f14335d, interfaceC1084f5, hVarC2);
                                        androidx.compose.foundation.gestures.d.c(pVar10, interfaceC1084f5, 0);
                                    }
                                    return p293xa.r.f47939a;
                                }
                            }, interfaceC1084f3), interfaceC1084f3, 56);
                        }
                    }
                    return p293xa.r.f47939a;
                }
            }, c1086gP), c1086gP, 48);
            c1086gP.T(true);
        }
        C1105p0 c1105p0V = c1086gP.V();
        if (c1105p0V != null) {
            c1105p0V.f13109d = new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.material3.MenuKt$DropdownMenuItemContent$2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(2);
                }

                @Override // Ia.p
                public final p293xa.r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                    num.intValue();
                    MenuKt.b(pVar, aVar, hVar, pVar2, pVar3, z10, o10, l10, kVar, interfaceC1084f2, L4.b.l(i10 | 1));
                    return p293xa.r.f47939a;
                }
            };
        }
    }

    /* JADX WARN: Code duplicated, block: B:14:0x0037  */
    /* JADX WARN: Code duplicated, block: B:4:0x0009  */
    public static final long c(p013b0.k kVar, p013b0.k kVar2) {
        float fMin;
        float fMin2 = 1.0f;
        if (kVar2.f20486a < kVar.f20488c) {
            int i10 = kVar2.f20488c;
            int i11 = kVar.f20486a;
            if (i10 <= i11) {
                fMin = 1.0f;
            } else if (kVar2.d() == 0) {
                fMin = 0.0f;
            } else {
                int i12 = kVar2.f20486a;
                fMin = (((Math.min(kVar.f20488c, i10) + Math.max(i11, i12)) / 2) - i12) / kVar2.d();
            }
        } else {
            fMin = 0.0f;
        }
        int i13 = kVar2.f20487b;
        int i14 = kVar.f20489d;
        if (i13 < i14) {
            int i15 = kVar2.f20489d;
            int i16 = kVar.f20487b;
            if (i15 > i16) {
                if (kVar2.b() == 0) {
                    fMin2 = 0.0f;
                } else {
                    fMin2 = (((Math.min(i14, i15) + Math.max(i16, i13)) / 2) - i13) / kVar2.b();
                }
            }
        } else {
            fMin2 = 0.0f;
        }
        return C2479a.b(fMin, fMin2);
    }
}
