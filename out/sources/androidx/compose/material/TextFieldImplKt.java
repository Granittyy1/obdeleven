package androidx.compose.material;

import androidx.compose.foundation.C0932d;
import androidx.compose.foundation.C0936h;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.runtime.C1086g;
import androidx.compose.runtime.C1101n0;
import androidx.compose.runtime.C1105p0;
import androidx.compose.runtime.CompositionLocalKt;
import androidx.compose.runtime.InterfaceC1084f;
import androidx.compose.runtime.InterfaceC1089h0;
import androidx.compose.runtime.J0;
import androidx.compose.runtime.O0;
import androidx.compose.runtime.R0;
import androidx.compose.runtime.X;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.graphics.l0;
import androidx.compose.ui.layout.C1171q;
import androidx.compose.ui.layout.InterfaceC1166l;
import androidx.compose.ui.layout.InterfaceC1172s;
import androidx.compose.ui.layout.Y;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.text.C1260a;
import androidx.compose.ui.unit.LayoutDirection;
import me.zhanghai.android.materialprogressbar.R;

/* JADX INFO: compiled from: TextFieldImpl.kt */
/* JADX INFO: loaded from: classes.dex */
public final class TextFieldImplKt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final float f11839a = 16;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final float f11840b = 12;

    /* JADX WARN: Multi-variable type inference failed */
    public static final void a(final TextFieldType textFieldType, final String str, final Ia.p<? super InterfaceC1084f, ? super Integer, p293xa.r> pVar, final androidx.compose.ui.text.input.E e10, final Ia.p<? super InterfaceC1084f, ? super Integer, p293xa.r> pVar2, final Ia.p<? super InterfaceC1084f, ? super Integer, p293xa.r> pVar3, final Ia.p<? super InterfaceC1084f, ? super Integer, p293xa.r> pVar4, final Ia.p<? super InterfaceC1084f, ? super Integer, p293xa.r> pVar5, final boolean z10, final boolean z11, final boolean z12, final androidx.compose.foundation.interaction.j jVar, final androidx.compose.foundation.layout.L l10, final l0 l0Var, final U u10, final Ia.p<? super InterfaceC1084f, ? super Integer, p293xa.r> pVar6, InterfaceC1084f interfaceC1084f, final int i10, final int i11) {
        int i12;
        int i13;
        C1086g c1086g;
        InputPhase inputPhase;
        boolean z13;
        boolean z14;
        C1086g c1086gP = interfaceC1084f.p(341783750);
        if ((i10 & 6) == 0) {
            i12 = (c1086gP.K(textFieldType) ? 4 : 2) | i10;
        } else {
            i12 = i10;
        }
        if ((i10 & 48) == 0) {
            i12 |= c1086gP.K(str) ? 32 : 16;
        }
        if ((i10 & 384) == 0) {
            i12 |= c1086gP.k(pVar) ? 256 : 128;
        }
        if ((i10 & 3072) == 0) {
            i12 |= c1086gP.K(e10) ? 2048 : 1024;
        }
        if ((i10 & 24576) == 0) {
            i12 |= c1086gP.k(pVar2) ? 16384 : 8192;
        }
        if ((i10 & 196608) == 0) {
            i12 |= c1086gP.k(pVar3) ? 131072 : 65536;
        }
        if ((i10 & 1572864) == 0) {
            i12 |= c1086gP.k(pVar4) ? 1048576 : 524288;
        }
        if ((i10 & 12582912) == 0) {
            i12 |= c1086gP.k(pVar5) ? 8388608 : 4194304;
        }
        if ((i10 & 100663296) == 0) {
            i12 |= c1086gP.c(z10) ? 67108864 : 33554432;
        }
        if ((i10 & 805306368) == 0) {
            i12 |= c1086gP.c(z11) ? 536870912 : 268435456;
        }
        if ((i11 & 6) == 0) {
            i13 = i11 | (c1086gP.c(z12) ? 4 : 2);
        } else {
            i13 = i11;
        }
        if ((i11 & 48) == 0) {
            i13 |= c1086gP.K(jVar) ? 32 : 16;
        }
        if ((i11 & 384) == 0) {
            i13 |= c1086gP.K(l10) ? 256 : 128;
        }
        if ((i11 & 3072) == 0) {
            i13 |= c1086gP.K(l0Var) ? 2048 : 1024;
        }
        if ((i11 & 24576) == 0) {
            i13 |= c1086gP.K(u10) ? 16384 : 8192;
        }
        if ((196608 & i11) == 0) {
            i13 |= c1086gP.k(pVar6) ? 131072 : 65536;
        }
        if (c1086gP.C(i12 & 1, ((i12 & 306783379) == 306783378 && (i13 & 74899) == 74898) ? false : true)) {
            boolean z15 = ((i12 & 7168) == 2048) | ((i12 & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) == 32);
            Object objF = c1086gP.f();
            if (z15 || objF == InterfaceC1084f.a.f12980a) {
                objF = e10.e(new C1260a(6, str, null));
                c1086gP.E(objF);
            }
            final String str2 = ((androidx.compose.ui.text.input.D) objF).f15484a.f15408c;
            if (((Boolean) androidx.compose.foundation.interaction.f.a(jVar, c1086gP, (i13 >> 3) & 14).getValue()).booleanValue()) {
                inputPhase = InputPhase.f11758b;
            } else {
                inputPhase = str2.length() == 0 ? InputPhase.f11759c : InputPhase.f11760d;
            }
            InputPhase inputPhase2 = inputPhase;
            Ia.q<InputPhase, InterfaceC1084f, Integer, androidx.compose.ui.graphics.H> qVar = new Ia.q<InputPhase, InterfaceC1084f, Integer, androidx.compose.ui.graphics.H>() { // from class: androidx.compose.material.TextFieldImplKt$CommonDecorationBox$labelColor$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(3);
                }

                /* JADX WARN: Multi-variable type inference failed */
                @Override // Ia.q
                public final androidx.compose.ui.graphics.H invoke(InputPhase inputPhase3, InterfaceC1084f interfaceC1084f2, Integer num) {
                    InputPhase inputPhase4 = inputPhase3;
                    InterfaceC1084f interfaceC1084f3 = interfaceC1084f2;
                    num.intValue();
                    interfaceC1084f3.L(-1272940975);
                    long j = ((androidx.compose.ui.graphics.H) u10.d(z11, inputPhase4 == InputPhase.f11759c ? false : z12, jVar, interfaceC1084f3).getValue()).f13506a;
                    interfaceC1084f3.D();
                    return new androidx.compose.ui.graphics.H(j);
                }
            };
            O0 o10 = TypographyKt.f11864b;
            V v10 = (V) c1086gP.x(o10);
            androidx.compose.ui.text.F f10 = v10.f11872g;
            long jB = f10.b();
            long j = androidx.compose.ui.graphics.H.f13504l;
            boolean zC = androidx.compose.ui.graphics.H.c(jB, j);
            androidx.compose.ui.text.F f11 = v10.f11876l;
            final boolean z16 = (zC && !androidx.compose.ui.graphics.H.c(f11.b(), j)) || (!androidx.compose.ui.graphics.H.c(f10.b(), j) && androidx.compose.ui.graphics.H.c(f11.b(), j));
            TextFieldTransitionScope textFieldTransitionScope = TextFieldTransitionScope.f11851a;
            c1086gP.L(1578866909);
            long jB2 = ((V) c1086gP.x(o10)).f11876l.b();
            if (z16) {
                c1086gP.L(-1572812364);
                if (jB2 != 16) {
                    z13 = false;
                } else {
                    z13 = false;
                    jB2 = ((androidx.compose.ui.graphics.H) qVar.invoke(inputPhase2, c1086gP, 0)).f13506a;
                }
                c1086gP.T(z13);
            } else {
                z13 = false;
                c1086gP.L(780549965);
                c1086gP.T(false);
            }
            long j10 = jB2;
            c1086gP.T(z13);
            c1086gP.L(1578874175);
            long jB3 = ((V) c1086gP.x(o10)).f11872g.b();
            if (z16) {
                c1086gP.L(-1572585196);
                if (jB3 != 16) {
                    z14 = false;
                } else {
                    z14 = false;
                    jB3 = ((androidx.compose.ui.graphics.H) qVar.invoke(inputPhase2, c1086gP, 0)).f13506a;
                }
                c1086gP.T(z14);
            } else {
                z14 = false;
                c1086gP.L(780557293);
                c1086gP.T(false);
            }
            long j11 = jB3;
            c1086gP.T(z14);
            if (pVar2 != null) {
                z14 = true;
            }
            c1086g = c1086gP;
            textFieldTransitionScope.a(inputPhase2, j10, j11, qVar, z14, androidx.compose.runtime.internal.a.b(225557475, new Ia.t<Float, androidx.compose.ui.graphics.H, androidx.compose.ui.graphics.H, Float, InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.material.TextFieldImplKt$CommonDecorationBox$3
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(6);
                }

                /* JADX WARN: Multi-variable type inference failed */
                @Override // Ia.t
                public final p293xa.r i(Float f12, androidx.compose.ui.graphics.H h8, androidx.compose.ui.graphics.H h10, Float f13, InterfaceC1084f interfaceC1084f2, Integer num) {
                    int i14;
                    ComposableLambdaImpl composableLambdaImpl;
                    ComposableLambdaImpl composableLambdaImpl2;
                    ComposableLambdaImpl composableLambdaImpl3;
                    final float fFloatValue = f12.floatValue();
                    final long j12 = h8.f13506a;
                    final long j13 = h10.f13506a;
                    final float fFloatValue2 = f13.floatValue();
                    InterfaceC1084f interfaceC1084f3 = interfaceC1084f2;
                    int iIntValue = num.intValue();
                    if ((iIntValue & 6) == 0) {
                        i14 = (interfaceC1084f3.g(fFloatValue) ? 4 : 2) | iIntValue;
                    } else {
                        i14 = iIntValue;
                    }
                    if ((iIntValue & 48) == 0) {
                        i14 |= interfaceC1084f3.i(j12) ? 32 : 16;
                    }
                    if ((iIntValue & 384) == 0) {
                        i14 |= interfaceC1084f3.i(j13) ? 256 : 128;
                    }
                    if ((iIntValue & 3072) == 0) {
                        i14 |= interfaceC1084f3.g(fFloatValue2) ? 2048 : 1024;
                    }
                    int i15 = i14;
                    if (interfaceC1084f3.C(i15 & 1, (i15 & 9363) != 9362)) {
                        final Ia.p<InterfaceC1084f, Integer, p293xa.r> pVar7 = pVar2;
                        ComposableLambdaImpl composableLambdaImpl4 = null;
                        if (pVar7 == null) {
                            interfaceC1084f3.L(-1572254148);
                            interfaceC1084f3.D();
                            composableLambdaImpl = null;
                        } else {
                            interfaceC1084f3.L(-1572254147);
                            final boolean z17 = z16;
                            ComposableLambdaImpl composableLambdaImplB = androidx.compose.runtime.internal.a.b(-1865025495, new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.material.TextFieldImplKt$CommonDecorationBox$3$decoratedLabel$1$1
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                /* JADX WARN: Multi-variable type inference failed */
                                {
                                    super(2);
                                }

                                @Override // Ia.p
                                public final p293xa.r invoke(InterfaceC1084f interfaceC1084f4, Integer num2) {
                                    InterfaceC1084f interfaceC1084f5 = interfaceC1084f4;
                                    int iIntValue2 = num2.intValue();
                                    if (interfaceC1084f5.C(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                                        O0 o11 = TypographyKt.f11864b;
                                        androidx.compose.ui.text.F fA = androidx.compose.ui.text.G.a(((V) interfaceC1084f5.x(o11)).f11872g, ((V) interfaceC1084f5.x(o11)).f11876l, fFloatValue);
                                        TextFieldImplKt.b(j13, z17 ? androidx.compose.ui.text.F.a(fA, j12, 0L, null, null, 0L, null, 0, 0L, null, null, 16777214) : fA, null, pVar7, interfaceC1084f5, 384, 0);
                                    } else {
                                        interfaceC1084f5.w();
                                    }
                                    return p293xa.r.f47939a;
                                }
                            }, interfaceC1084f3);
                            interfaceC1084f3.D();
                            composableLambdaImpl = composableLambdaImplB;
                        }
                        if (pVar3 == null || str2.length() != 0 || fFloatValue2 <= 0.0f) {
                            interfaceC1084f3.L(-1570844268);
                            interfaceC1084f3.D();
                            composableLambdaImpl2 = null;
                        } else {
                            interfaceC1084f3.L(-1571270300);
                            final U u11 = u10;
                            final boolean z18 = z11;
                            final Ia.p<InterfaceC1084f, Integer, p293xa.r> pVar8 = pVar3;
                            ComposableLambdaImpl composableLambdaImplB2 = androidx.compose.runtime.internal.a.b(-413527723, new Ia.q<androidx.compose.ui.h, InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.material.TextFieldImplKt$CommonDecorationBox$3$decoratedPlaceholder$1
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                /* JADX WARN: Multi-variable type inference failed */
                                {
                                    super(3);
                                }

                                /* JADX WARN: Multi-variable type inference failed */
                                @Override // Ia.q
                                public final p293xa.r invoke(androidx.compose.ui.h hVar, InterfaceC1084f interfaceC1084f4, Integer num2) {
                                    androidx.compose.ui.h hVar2 = hVar;
                                    InterfaceC1084f interfaceC1084f5 = interfaceC1084f4;
                                    int iIntValue2 = num2.intValue();
                                    if ((iIntValue2 & 6) == 0) {
                                        iIntValue2 |= interfaceC1084f5.K(hVar2) ? 4 : 2;
                                    }
                                    if (interfaceC1084f5.C(iIntValue2 & 1, (iIntValue2 & 19) != 18)) {
                                        androidx.compose.ui.h hVarC = Cb.a.c(hVar2, fFloatValue2);
                                        U u12 = u11;
                                        boolean z19 = z18;
                                        Ia.p<InterfaceC1084f, Integer, p293xa.r> pVar9 = pVar8;
                                        androidx.compose.ui.layout.E eD = BoxKt.d(androidx.compose.ui.d.a.f13335a, false);
                                        int iF = interfaceC1084f5.F();
                                        InterfaceC1089h0 interfaceC1089h0Z = interfaceC1084f5.z();
                                        androidx.compose.ui.h hVarC2 = ComposedModifierKt.c(interfaceC1084f5, hVarC);
                                        ComposeUiNode.f14331c0.getClass();
                                        Ia.a<ComposeUiNode> aVar = ComposeUiNode.Companion.f14333b;
                                        if (interfaceC1084f5.u() == null) {
                                            I.b.k();
                                            throw null;
                                        }
                                        interfaceC1084f5.r();
                                        if (interfaceC1084f5.m()) {
                                            interfaceC1084f5.v(aVar);
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
                                        TextFieldImplKt.b(((androidx.compose.ui.graphics.H) u12.c(z19, interfaceC1084f5).getValue()).f13506a, ((V) interfaceC1084f5.x(TypographyKt.f11864b)).f11872g, null, pVar9, interfaceC1084f5, 0, 4);
                                        interfaceC1084f5.J();
                                    } else {
                                        interfaceC1084f5.w();
                                    }
                                    return p293xa.r.f47939a;
                                }
                            }, interfaceC1084f3);
                            interfaceC1084f3.D();
                            composableLambdaImpl2 = composableLambdaImplB2;
                        }
                        final long j14 = ((androidx.compose.ui.graphics.H) u10.b(z11, z12, interfaceC1084f3).getValue()).f13506a;
                        final Ia.p<InterfaceC1084f, Integer, p293xa.r> pVar9 = pVar4;
                        if (pVar9 == null) {
                            interfaceC1084f3.L(-1570655509);
                            interfaceC1084f3.D();
                            composableLambdaImpl3 = null;
                        } else {
                            interfaceC1084f3.L(-1570655508);
                            ComposableLambdaImpl composableLambdaImplB3 = androidx.compose.runtime.internal.a.b(-1165144581, new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.material.TextFieldImplKt$CommonDecorationBox$3$decoratedLeading$1$1
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                /* JADX WARN: Multi-variable type inference failed */
                                {
                                    super(2);
                                }

                                @Override // Ia.p
                                public final p293xa.r invoke(InterfaceC1084f interfaceC1084f4, Integer num2) {
                                    InterfaceC1084f interfaceC1084f5 = interfaceC1084f4;
                                    int iIntValue2 = num2.intValue();
                                    if (interfaceC1084f5.C(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                                        TextFieldImplKt.b(j14, null, null, pVar9, interfaceC1084f5, 0, 6);
                                    } else {
                                        interfaceC1084f5.w();
                                    }
                                    return p293xa.r.f47939a;
                                }
                            }, interfaceC1084f3);
                            interfaceC1084f3.D();
                            composableLambdaImpl3 = composableLambdaImplB3;
                        }
                        final long j15 = ((androidx.compose.ui.graphics.H) u10.a(z11, z12, interfaceC1084f3).getValue()).f13506a;
                        final Ia.p<InterfaceC1084f, Integer, p293xa.r> pVar10 = pVar5;
                        if (pVar10 == null) {
                            interfaceC1084f3.L(-1570361846);
                            interfaceC1084f3.D();
                        } else {
                            interfaceC1084f3.L(-1570361845);
                            ComposableLambdaImpl composableLambdaImplB4 = androidx.compose.runtime.internal.a.b(1694126319, new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.material.TextFieldImplKt$CommonDecorationBox$3$decoratedTrailing$1$1
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                /* JADX WARN: Multi-variable type inference failed */
                                {
                                    super(2);
                                }

                                @Override // Ia.p
                                public final p293xa.r invoke(InterfaceC1084f interfaceC1084f4, Integer num2) {
                                    InterfaceC1084f interfaceC1084f5 = interfaceC1084f4;
                                    int iIntValue2 = num2.intValue();
                                    if (interfaceC1084f5.C(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                                        TextFieldImplKt.b(j15, null, null, pVar10, interfaceC1084f5, 0, 6);
                                    } else {
                                        interfaceC1084f5.w();
                                    }
                                    return p293xa.r.f47939a;
                                }
                            }, interfaceC1084f3);
                            interfaceC1084f3.D();
                            composableLambdaImpl4 = composableLambdaImplB4;
                        }
                        androidx.compose.ui.h hVarB = C0932d.b(androidx.compose.ui.h.a.f13984b, ((androidx.compose.ui.graphics.H) u10.h(interfaceC1084f3).getValue()).f13506a, l0Var);
                        int iOrdinal = textFieldType.ordinal();
                        if (iOrdinal == 0) {
                            interfaceC1084f3.L(-1570081481);
                            TextFieldKt.b(hVarB, pVar, composableLambdaImpl, composableLambdaImpl2, composableLambdaImpl3, composableLambdaImpl4, z10, fFloatValue, l10, interfaceC1084f3, (i15 << 21) & 29360128);
                            interfaceC1084f3.D();
                        } else if (iOrdinal != 1) {
                            interfaceC1084f3.L(-1568043975);
                            interfaceC1084f3.D();
                        } else {
                            interfaceC1084f3.L(-1569502122);
                            Object objF2 = interfaceC1084f3.f();
                            InterfaceC1084f.a.C0153a c0153a = InterfaceC1084f.a.f12980a;
                            if (objF2 == c0153a) {
                                objF2 = J0.f(new I.h(0L));
                                interfaceC1084f3.E(objF2);
                            }
                            final X x10 = (X) objF2;
                            final androidx.compose.foundation.layout.L l11 = l10;
                            final Ia.p<InterfaceC1084f, Integer, p293xa.r> pVar11 = pVar6;
                            ComposableLambdaImpl composableLambdaImplB5 = androidx.compose.runtime.internal.a.b(-1212965554, new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.material.TextFieldImplKt$CommonDecorationBox$3$drawBorder$1
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                /* JADX WARN: Multi-variable type inference failed */
                                {
                                    super(2);
                                }

                                @Override // Ia.p
                                public final p293xa.r invoke(InterfaceC1084f interfaceC1084f4, Integer num2) {
                                    InterfaceC1084f interfaceC1084f5 = interfaceC1084f4;
                                    int iIntValue2 = num2.intValue();
                                    if (interfaceC1084f5.C(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                                        androidx.compose.ui.h hVarB2 = C1171q.b(androidx.compose.ui.h.a.f13984b, "border");
                                        final long j16 = x10.getValue().f3769a;
                                        final androidx.compose.foundation.layout.L l12 = l11;
                                        float f14 = OutlinedTextFieldKt.f11778a;
                                        androidx.compose.ui.h hVarC = androidx.compose.ui.draw.f.c(hVarB2, new Ia.l<J.c, p293xa.r>() { // from class: androidx.compose.material.OutlinedTextFieldKt$outlineCutout$1

                                            /* JADX INFO: compiled from: OutlinedTextField.kt */
                                            public /* synthetic */ class a {

                                                /* JADX INFO: renamed from: a, reason: collision with root package name */
                                                public static final /* synthetic */ int[] f11779a;

                                                static {
                                                    int[] iArr = new int[LayoutDirection.values().length];
                                                    try {
                                                        LayoutDirection layoutDirection = LayoutDirection.f15717b;
                                                        iArr[1] = 1;
                                                    } catch (NoSuchFieldError unused) {
                                                    }
                                                    f11779a = iArr;
                                                }
                                            }

                                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                            {
                                                super(1);
                                            }

                                            @Override // Ia.l
                                            public final p293xa.r invoke(J.c cVar) {
                                                J.c cVar2 = cVar;
                                                float fD = I.h.d(j16);
                                                if (fD > 0.0f) {
                                                    float fT0 = cVar2.T0(OutlinedTextFieldKt.f11778a);
                                                    float fT1 = cVar2.T0(l12.b(cVar2.getLayoutDirection())) - fT0;
                                                    float f15 = 2;
                                                    float fD2 = (fT0 * f15) + fD + fT1;
                                                    LayoutDirection layoutDirection = cVar2.getLayoutDirection();
                                                    int[] iArr = a.f11779a;
                                                    float fD3 = iArr[layoutDirection.ordinal()] == 1 ? I.h.d(cVar2.j()) - fD2 : Na.l.x(fT1, 0.0f);
                                                    if (iArr[cVar2.getLayoutDirection().ordinal()] == 1) {
                                                        fD2 = I.h.d(cVar2.j()) - Na.l.x(fT1, 0.0f);
                                                    }
                                                    float f16 = fD2;
                                                    float fB = I.h.b(j16);
                                                    float f17 = (-fB) / f15;
                                                    float f18 = fB / f15;
                                                    J.a.b bVarW0 = cVar2.W0();
                                                    long jE = bVarW0.e();
                                                    bVarW0.a().g();
                                                    try {
                                                        bVarW0.f3948a.d(fD3, f17, f16, f18, 0);
                                                        cVar2.A1();
                                                    } finally {
                                                        C0936h.f(bVarW0, jE);
                                                    }
                                                } else {
                                                    cVar2.A1();
                                                }
                                                return p293xa.r.f47939a;
                                            }
                                        });
                                        Ia.p<InterfaceC1084f, Integer, p293xa.r> pVar12 = pVar11;
                                        androidx.compose.ui.layout.E eD = BoxKt.d(androidx.compose.ui.d.a.f13335a, true);
                                        int iF = interfaceC1084f5.F();
                                        InterfaceC1089h0 interfaceC1089h0Z = interfaceC1084f5.z();
                                        androidx.compose.ui.h hVarC2 = ComposedModifierKt.c(interfaceC1084f5, hVarC);
                                        ComposeUiNode.f14331c0.getClass();
                                        Ia.a<ComposeUiNode> aVar = ComposeUiNode.Companion.f14333b;
                                        if (interfaceC1084f5.u() == null) {
                                            I.b.k();
                                            throw null;
                                        }
                                        interfaceC1084f5.r();
                                        if (interfaceC1084f5.m()) {
                                            interfaceC1084f5.v(aVar);
                                        } else {
                                            interfaceC1084f5.A();
                                        }
                                        R0.a(ComposeUiNode.Companion.f14337f, interfaceC1084f5, eD);
                                        R0.a(ComposeUiNode.Companion.f14336e, interfaceC1084f5, interfaceC1089h0Z);
                                        Ia.p<ComposeUiNode, Integer, p293xa.r> pVar13 = ComposeUiNode.Companion.f14338g;
                                        if (interfaceC1084f5.m() || !kotlin.jvm.internal.i.a(interfaceC1084f5.f(), Integer.valueOf(iF))) {
                                            androidx.compose.animation.k.b(iF, interfaceC1084f5, iF, pVar13);
                                        }
                                        R0.a(ComposeUiNode.Companion.f14335d, interfaceC1084f5, hVarC2);
                                        if (pVar12 == null) {
                                            interfaceC1084f5.L(720285106);
                                        } else {
                                            interfaceC1084f5.L(-392406993);
                                            pVar12.invoke(interfaceC1084f5, 0);
                                        }
                                        interfaceC1084f5.D();
                                        interfaceC1084f5.J();
                                    } else {
                                        interfaceC1084f5.w();
                                    }
                                    return p293xa.r.f47939a;
                                }
                            }, interfaceC1084f3);
                            Ia.p<InterfaceC1084f, Integer, p293xa.r> pVar12 = pVar;
                            boolean z19 = z10;
                            boolean z20 = (i15 & 14) == 4;
                            Object objF3 = interfaceC1084f3.f();
                            if (z20 || objF3 == c0153a) {
                                objF3 = new Ia.l<I.h, p293xa.r>() { // from class: androidx.compose.material.TextFieldImplKt$CommonDecorationBox$3$1$1
                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                    {
                                        super(1);
                                    }

                                    @Override // Ia.l
                                    public final p293xa.r invoke(I.h hVar) {
                                        long j16 = hVar.f3769a;
                                        float fD = I.h.d(j16) * fFloatValue;
                                        float fB = I.h.b(j16) * fFloatValue;
                                        if (I.h.d(x10.getValue().f3769a) != fD || I.h.b(x10.getValue().f3769a) != fB) {
                                            x10.setValue(new I.h(Cb.a.b(fD, fB)));
                                        }
                                        return p293xa.r.f47939a;
                                    }
                                };
                                interfaceC1084f3.E(objF3);
                            }
                            OutlinedTextFieldKt.a(hVarB, pVar12, composableLambdaImpl2, composableLambdaImpl, composableLambdaImpl3, composableLambdaImpl4, z19, fFloatValue, (Ia.l) objF3, composableLambdaImplB5, l10, interfaceC1084f3, ((i15 << 21) & 29360128) | 805306368, 0);
                            interfaceC1084f3.D();
                        }
                    } else {
                        interfaceC1084f3.w();
                    }
                    return p293xa.r.f47939a;
                }
            }, c1086g), c1086g, 1769472);
        } else {
            c1086g = c1086gP;
            c1086g.w();
        }
        C1105p0 c1105p0V = c1086g.V();
        if (c1105p0V != null) {
            c1105p0V.f13109d = new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.material.TextFieldImplKt$CommonDecorationBox$4
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(2);
                }

                @Override // Ia.p
                public final p293xa.r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                    num.intValue();
                    TextFieldImplKt.a(textFieldType, str, pVar, e10, pVar2, pVar3, pVar4, pVar5, z10, z11, z12, jVar, l10, l0Var, u10, pVar6, interfaceC1084f2, L4.b.l(i10 | 1), L4.b.l(i11));
                    return p293xa.r.f47939a;
                }
            };
        }
    }

    /* JADX WARN: Code duplicated, block: B:26:0x0042  */
    /* JADX WARN: Code duplicated, block: B:28:0x0047  */
    /* JADX WARN: Code duplicated, block: B:30:0x004b  */
    /* JADX WARN: Code duplicated, block: B:32:0x0053  */
    /* JADX WARN: Code duplicated, block: B:33:0x0056  */
    /* JADX WARN: Code duplicated, block: B:37:0x005d  */
    /* JADX WARN: Code duplicated, block: B:38:0x0060  */
    /* JADX WARN: Code duplicated, block: B:40:0x0064  */
    /* JADX WARN: Code duplicated, block: B:42:0x006a  */
    /* JADX WARN: Code duplicated, block: B:43:0x006d  */
    /* JADX WARN: Code duplicated, block: B:47:0x0077  */
    /* JADX WARN: Code duplicated, block: B:48:0x0079  */
    /* JADX WARN: Code duplicated, block: B:51:0x0082  */
    /* JADX WARN: Code duplicated, block: B:53:0x0085  */
    /* JADX WARN: Code duplicated, block: B:55:0x0088  */
    /* JADX WARN: Code duplicated, block: B:58:0x0097  */
    /* JADX WARN: Code duplicated, block: B:60:0x00aa  */
    /* JADX WARN: Code duplicated, block: B:62:0x00bc  */
    /* JADX WARN: Code duplicated, block: B:65:0x00c6  */
    /* JADX WARN: Code duplicated, block: B:67:? A[RETURN, SYNTHETIC] */
    public static final void b(final long j, androidx.compose.ui.text.F f10, Float f11, final Ia.p<? super InterfaceC1084f, ? super Integer, p293xa.r> pVar, InterfaceC1084f interfaceC1084f, final int i10, final int i11) {
        int i12;
        int i13;
        final Float f12;
        int i14;
        int i15;
        boolean z10;
        final androidx.compose.ui.text.F f13;
        final Float f14;
        C1105p0 c1105p0V;
        ComposableLambdaImpl composableLambdaImplB;
        C1086g c1086gP = interfaceC1084f.p(-399493340);
        if ((i11 & 1) != 0) {
            i12 = i10 | 6;
        } else if ((i10 & 6) == 0) {
            i12 = (c1086gP.i(j) ? 4 : 2) | i10;
        } else {
            i12 = i10;
        }
        int i16 = i11 & 2;
        if (i16 == 0) {
            if ((i10 & 48) == 0) {
                i12 |= c1086gP.K(f10) ? 32 : 16;
            }
            i13 = i11 & 4;
            if (i13 != 0) {
                if ((i10 & 384) == 0) {
                    f12 = f11;
                    if (c1086gP.K(f12)) {
                        i14 = 256;
                    } else {
                        i14 = 128;
                    }
                    i12 |= i14;
                }
                if ((i11 & 8) != 0) {
                    i12 |= 3072;
                } else if ((i10 & 3072) == 0) {
                    if (c1086gP.k(pVar)) {
                        i15 = 2048;
                    } else {
                        i15 = 1024;
                    }
                    i12 |= i15;
                }
                if ((i12 & 1171) != 1170) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (c1086gP.C(i12 & 1, z10)) {
                    if (i16 != 0) {
                        f10 = null;
                    }
                    if (i13 != 0) {
                        f12 = null;
                    }
                    composableLambdaImplB = androidx.compose.runtime.internal.a.b(494684590, new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.material.TextFieldImplKt$Decoration$colorAndEmphasis$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(2);
                        }

                        @Override // Ia.p
                        public final p293xa.r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                            InterfaceC1084f interfaceC1084f3 = interfaceC1084f2;
                            int iIntValue = num.intValue();
                            if (interfaceC1084f3.C(iIntValue & 1, (iIntValue & 3) != 2)) {
                                C1101n0 c1101n0B = B7.b.b(j, ContentColorKt.f11715a);
                                final Float f15 = f12;
                                final Ia.p<InterfaceC1084f, Integer, p293xa.r> pVar2 = pVar;
                                final long j10 = j;
                                CompositionLocalKt.a(c1101n0B, androidx.compose.runtime.internal.a.b(-1132188434, new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.material.TextFieldImplKt$Decoration$colorAndEmphasis$1.1
                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                    {
                                        super(2);
                                    }

                                    @Override // Ia.p
                                    public final p293xa.r invoke(InterfaceC1084f interfaceC1084f4, Integer num2) {
                                        InterfaceC1084f interfaceC1084f5 = interfaceC1084f4;
                                        int iIntValue2 = num2.intValue();
                                        if (!interfaceC1084f5.C(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                                            interfaceC1084f5.w();
                                        } else if (f15 != null) {
                                            interfaceC1084f5.L(-1177895124);
                                            CompositionLocalKt.a(ContentAlphaKt.f11713a.b(f15), pVar2, interfaceC1084f5, 8);
                                            interfaceC1084f5.D();
                                        } else {
                                            interfaceC1084f5.L(-1177696538);
                                            CompositionLocalKt.a(ContentAlphaKt.f11713a.b(Float.valueOf(androidx.compose.ui.graphics.H.d(j10))), pVar2, interfaceC1084f5, 8);
                                            interfaceC1084f5.D();
                                        }
                                        return p293xa.r.f47939a;
                                    }
                                }, interfaceC1084f3), interfaceC1084f3, 56);
                            } else {
                                interfaceC1084f3.w();
                            }
                            return p293xa.r.f47939a;
                        }
                    }, c1086gP);
                    if (f10 != null) {
                        c1086gP.L(2115981348);
                        TextKt.a(f10, composableLambdaImplB, c1086gP, ((i12 >> 3) & 14) | 48);
                    } else {
                        c1086gP.L(2115982984);
                        composableLambdaImplB.invoke(c1086gP, 6);
                    }
                    c1086gP.T(false);
                } else {
                    c1086gP.w();
                }
                f13 = f10;
                f14 = f12;
                c1105p0V = c1086gP.V();
                if (c1105p0V != null) {
                    c1105p0V.f13109d = new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.material.TextFieldImplKt$Decoration$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        /* JADX WARN: Multi-variable type inference failed */
                        {
                            super(2);
                        }

                        @Override // Ia.p
                        public final p293xa.r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                            num.intValue();
                            TextFieldImplKt.b(j, f13, f14, pVar, interfaceC1084f2, L4.b.l(i10 | 1), i11);
                            return p293xa.r.f47939a;
                        }
                    };
                }
            }
            i12 |= 384;
            f12 = f11;
            if ((i11 & 8) != 0) {
                i12 |= 3072;
            } else if ((i10 & 3072) == 0) {
                if (c1086gP.k(pVar)) {
                    i15 = 2048;
                } else {
                    i15 = 1024;
                }
                i12 |= i15;
            }
            if ((i12 & 1171) != 1170) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (c1086gP.C(i12 & 1, z10)) {
                if (i16 != 0) {
                    f10 = null;
                }
                if (i13 != 0) {
                    f12 = null;
                }
                composableLambdaImplB = androidx.compose.runtime.internal.a.b(494684590, new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.material.TextFieldImplKt$Decoration$colorAndEmphasis$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(2);
                    }

                    @Override // Ia.p
                    public final p293xa.r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                        InterfaceC1084f interfaceC1084f3 = interfaceC1084f2;
                        int iIntValue = num.intValue();
                        if (interfaceC1084f3.C(iIntValue & 1, (iIntValue & 3) != 2)) {
                            C1101n0 c1101n0B = B7.b.b(j, ContentColorKt.f11715a);
                            final Float f15 = f12;
                            final Ia.p pVar2 = pVar;
                            final long j10 = j;
                            CompositionLocalKt.a(c1101n0B, androidx.compose.runtime.internal.a.b(-1132188434, new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.material.TextFieldImplKt$Decoration$colorAndEmphasis$1.1
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                {
                                    super(2);
                                }

                                @Override // Ia.p
                                public final p293xa.r invoke(InterfaceC1084f interfaceC1084f4, Integer num2) {
                                    InterfaceC1084f interfaceC1084f5 = interfaceC1084f4;
                                    int iIntValue2 = num2.intValue();
                                    if (!interfaceC1084f5.C(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                                        interfaceC1084f5.w();
                                    } else if (f15 != null) {
                                        interfaceC1084f5.L(-1177895124);
                                        CompositionLocalKt.a(ContentAlphaKt.f11713a.b(f15), pVar2, interfaceC1084f5, 8);
                                        interfaceC1084f5.D();
                                    } else {
                                        interfaceC1084f5.L(-1177696538);
                                        CompositionLocalKt.a(ContentAlphaKt.f11713a.b(Float.valueOf(androidx.compose.ui.graphics.H.d(j10))), pVar2, interfaceC1084f5, 8);
                                        interfaceC1084f5.D();
                                    }
                                    return p293xa.r.f47939a;
                                }
                            }, interfaceC1084f3), interfaceC1084f3, 56);
                        } else {
                            interfaceC1084f3.w();
                        }
                        return p293xa.r.f47939a;
                    }
                }, c1086gP);
                if (f10 != null) {
                    c1086gP.L(2115981348);
                    TextKt.a(f10, composableLambdaImplB, c1086gP, ((i12 >> 3) & 14) | 48);
                } else {
                    c1086gP.L(2115982984);
                    composableLambdaImplB.invoke(c1086gP, 6);
                }
                c1086gP.T(false);
            } else {
                c1086gP.w();
            }
            f13 = f10;
            f14 = f12;
            c1105p0V = c1086gP.V();
            if (c1105p0V != null) {
                c1105p0V.f13109d = new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.material.TextFieldImplKt$Decoration$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(2);
                    }

                    @Override // Ia.p
                    public final p293xa.r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                        num.intValue();
                        TextFieldImplKt.b(j, f13, f14, pVar, interfaceC1084f2, L4.b.l(i10 | 1), i11);
                        return p293xa.r.f47939a;
                    }
                };
            }
        }
        i12 |= 48;
        i13 = i11 & 4;
        if (i13 != 0) {
            if ((i10 & 384) == 0) {
                f12 = f11;
                if (c1086gP.K(f12)) {
                    i14 = 256;
                } else {
                    i14 = 128;
                }
                i12 |= i14;
            }
            if ((i11 & 8) != 0) {
                i12 |= 3072;
            } else if ((i10 & 3072) == 0) {
                if (c1086gP.k(pVar)) {
                    i15 = 2048;
                } else {
                    i15 = 1024;
                }
                i12 |= i15;
            }
            if ((i12 & 1171) != 1170) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (c1086gP.C(i12 & 1, z10)) {
                if (i16 != 0) {
                    f10 = null;
                }
                if (i13 != 0) {
                    f12 = null;
                }
                composableLambdaImplB = androidx.compose.runtime.internal.a.b(494684590, new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.material.TextFieldImplKt$Decoration$colorAndEmphasis$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(2);
                    }

                    @Override // Ia.p
                    public final p293xa.r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                        InterfaceC1084f interfaceC1084f3 = interfaceC1084f2;
                        int iIntValue = num.intValue();
                        if (interfaceC1084f3.C(iIntValue & 1, (iIntValue & 3) != 2)) {
                            C1101n0 c1101n0B = B7.b.b(j, ContentColorKt.f11715a);
                            final Float f15 = f12;
                            final Ia.p pVar2 = pVar;
                            final long j10 = j;
                            CompositionLocalKt.a(c1101n0B, androidx.compose.runtime.internal.a.b(-1132188434, new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.material.TextFieldImplKt$Decoration$colorAndEmphasis$1.1
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                {
                                    super(2);
                                }

                                @Override // Ia.p
                                public final p293xa.r invoke(InterfaceC1084f interfaceC1084f4, Integer num2) {
                                    InterfaceC1084f interfaceC1084f5 = interfaceC1084f4;
                                    int iIntValue2 = num2.intValue();
                                    if (!interfaceC1084f5.C(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                                        interfaceC1084f5.w();
                                    } else if (f15 != null) {
                                        interfaceC1084f5.L(-1177895124);
                                        CompositionLocalKt.a(ContentAlphaKt.f11713a.b(f15), pVar2, interfaceC1084f5, 8);
                                        interfaceC1084f5.D();
                                    } else {
                                        interfaceC1084f5.L(-1177696538);
                                        CompositionLocalKt.a(ContentAlphaKt.f11713a.b(Float.valueOf(androidx.compose.ui.graphics.H.d(j10))), pVar2, interfaceC1084f5, 8);
                                        interfaceC1084f5.D();
                                    }
                                    return p293xa.r.f47939a;
                                }
                            }, interfaceC1084f3), interfaceC1084f3, 56);
                        } else {
                            interfaceC1084f3.w();
                        }
                        return p293xa.r.f47939a;
                    }
                }, c1086gP);
                if (f10 != null) {
                    c1086gP.L(2115981348);
                    TextKt.a(f10, composableLambdaImplB, c1086gP, ((i12 >> 3) & 14) | 48);
                } else {
                    c1086gP.L(2115982984);
                    composableLambdaImplB.invoke(c1086gP, 6);
                }
                c1086gP.T(false);
            } else {
                c1086gP.w();
            }
            f13 = f10;
            f14 = f12;
            c1105p0V = c1086gP.V();
            if (c1105p0V != null) {
                c1105p0V.f13109d = new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.material.TextFieldImplKt$Decoration$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(2);
                    }

                    @Override // Ia.p
                    public final p293xa.r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                        num.intValue();
                        TextFieldImplKt.b(j, f13, f14, pVar, interfaceC1084f2, L4.b.l(i10 | 1), i11);
                        return p293xa.r.f47939a;
                    }
                };
            }
        }
        i12 |= 384;
        f12 = f11;
        if ((i11 & 8) != 0) {
            i12 |= 3072;
        } else if ((i10 & 3072) == 0) {
            if (c1086gP.k(pVar)) {
                i15 = 2048;
            } else {
                i15 = 1024;
            }
            i12 |= i15;
        }
        if ((i12 & 1171) != 1170) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (c1086gP.C(i12 & 1, z10)) {
            if (i16 != 0) {
                f10 = null;
            }
            if (i13 != 0) {
                f12 = null;
            }
            composableLambdaImplB = androidx.compose.runtime.internal.a.b(494684590, new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.material.TextFieldImplKt$Decoration$colorAndEmphasis$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // Ia.p
                public final p293xa.r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                    InterfaceC1084f interfaceC1084f3 = interfaceC1084f2;
                    int iIntValue = num.intValue();
                    if (interfaceC1084f3.C(iIntValue & 1, (iIntValue & 3) != 2)) {
                        C1101n0 c1101n0B = B7.b.b(j, ContentColorKt.f11715a);
                        final Float f15 = f12;
                        final Ia.p pVar2 = pVar;
                        final long j10 = j;
                        CompositionLocalKt.a(c1101n0B, androidx.compose.runtime.internal.a.b(-1132188434, new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.material.TextFieldImplKt$Decoration$colorAndEmphasis$1.1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(2);
                            }

                            @Override // Ia.p
                            public final p293xa.r invoke(InterfaceC1084f interfaceC1084f4, Integer num2) {
                                InterfaceC1084f interfaceC1084f5 = interfaceC1084f4;
                                int iIntValue2 = num2.intValue();
                                if (!interfaceC1084f5.C(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                                    interfaceC1084f5.w();
                                } else if (f15 != null) {
                                    interfaceC1084f5.L(-1177895124);
                                    CompositionLocalKt.a(ContentAlphaKt.f11713a.b(f15), pVar2, interfaceC1084f5, 8);
                                    interfaceC1084f5.D();
                                } else {
                                    interfaceC1084f5.L(-1177696538);
                                    CompositionLocalKt.a(ContentAlphaKt.f11713a.b(Float.valueOf(androidx.compose.ui.graphics.H.d(j10))), pVar2, interfaceC1084f5, 8);
                                    interfaceC1084f5.D();
                                }
                                return p293xa.r.f47939a;
                            }
                        }, interfaceC1084f3), interfaceC1084f3, 56);
                    } else {
                        interfaceC1084f3.w();
                    }
                    return p293xa.r.f47939a;
                }
            }, c1086gP);
            if (f10 != null) {
                c1086gP.L(2115981348);
                TextKt.a(f10, composableLambdaImplB, c1086gP, ((i12 >> 3) & 14) | 48);
            } else {
                c1086gP.L(2115982984);
                composableLambdaImplB.invoke(c1086gP, 6);
            }
            c1086gP.T(false);
        } else {
            c1086gP.w();
        }
        f13 = f10;
        f14 = f12;
        c1105p0V = c1086gP.V();
        if (c1105p0V != null) {
            c1105p0V.f13109d = new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.material.TextFieldImplKt$Decoration$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(2);
                }

                @Override // Ia.p
                public final p293xa.r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                    num.intValue();
                    TextFieldImplKt.b(j, f13, f14, pVar, interfaceC1084f2, L4.b.l(i10 | 1), i11);
                    return p293xa.r.f47939a;
                }
            };
        }
    }

    public static final Object c(InterfaceC1166l interfaceC1166l) {
        Object objQ = interfaceC1166l.q();
        InterfaceC1172s interfaceC1172s = objQ instanceof InterfaceC1172s ? (InterfaceC1172s) objQ : null;
        if (interfaceC1172s != null) {
            return interfaceC1172s.Z();
        }
        return null;
    }

    public static final int d(Y y10) {
        if (y10 != null) {
            return y10.f14221c;
        }
        return 0;
    }

    public static final int e(Y y10) {
        if (y10 != null) {
            return y10.f14220b;
        }
        return 0;
    }
}
