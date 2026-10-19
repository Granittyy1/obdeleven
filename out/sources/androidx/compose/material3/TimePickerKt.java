package androidx.compose.material3;

import android.content.res.Configuration;
import androidx.collection.AbstractC0881i;
import androidx.collection.C0882j;
import androidx.compose.animation.CrossfadeKt;
import androidx.compose.animation.core.C0907g;
import androidx.compose.foundation.C0932d;
import androidx.compose.foundation.C0935g;
import androidx.compose.foundation.C0937i;
import androidx.compose.foundation.MutatePriority;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.C0945e;
import androidx.compose.foundation.layout.C0952l;
import androidx.compose.foundation.layout.C0953m;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.selection.SelectableGroupKt;
import androidx.compose.material3.internal.AccessibilityServiceStateProvider_androidKt;
import androidx.compose.material3.tokens.TypographyKeyTokens;
import androidx.compose.runtime.C1086g;
import androidx.compose.runtime.C1101n0;
import androidx.compose.runtime.C1105p0;
import androidx.compose.runtime.C1113u;
import androidx.compose.runtime.CompositionLocalKt;
import androidx.compose.runtime.InterfaceC1084f;
import androidx.compose.runtime.InterfaceC1089h0;
import androidx.compose.runtime.J0;
import androidx.compose.runtime.O0;
import androidx.compose.runtime.R0;
import androidx.compose.runtime.saveable.SaverKt;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.ZIndexElement;
import androidx.compose.ui.layout.C1171q;
import androidx.compose.ui.layout.InterfaceC1170p;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.semantics.SemanticsProperties;
import androidx.compose.ui.unit.LayoutDirection;
import com.google.android.gms.internal.measurement.C1787c0;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.C2680e;
import me.zhanghai.android.materialprogressbar.R;

/* JADX INFO: compiled from: TimePicker.kt */
/* JADX INFO: loaded from: classes.dex */
public final class TimePickerKt {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final float f12389d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final float f12390e;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final androidx.collection.A f12394i;
    public static final androidx.collection.A j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final float f12395k;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final float f12386a = R.styleable.AppCompatTheme_switchStyle;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final float f12387b = 69;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final float f12388c = 36;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final float f12391f = 74;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final float f12392g = 48;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final androidx.collection.A f12393h = C0882j.a(0, 5, 10, 15, 20, 25, 30, 35, 40, 45, 50, 55);

    static {
        float f10 = 24;
        f12389d = f10;
        f12390e = f10;
        androidx.collection.A a10 = C0882j.a(12, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11);
        f12394i = a10;
        androidx.collection.A a11 = new androidx.collection.A(a10.f9184b);
        int[] iArr = a10.f9183a;
        int i10 = a10.f9184b;
        for (int i11 = 0; i11 < i10; i11++) {
            a11.c((iArr[i11] % 12) + 12);
        }
        j = a11;
        f12395k = 12;
    }

    public static final void a(final l0 l0Var, final i0 i0Var, InterfaceC1084f interfaceC1084f, final int i10) {
        int i11;
        C1086g c1086gP = interfaceC1084f.p(-934561141);
        if ((i10 & 6) == 0) {
            i11 = ((i10 & 8) == 0 ? c1086gP.K(l0Var) : c1086gP.k(l0Var) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            i11 |= c1086gP.K(i0Var) ? 32 : 16;
        }
        if ((i11 & 19) == 18 && c1086gP.s()) {
            c1086gP.w();
        } else {
            CompositionLocalKt.b(new C1101n0[]{TextKt.f12383a.b(TypographyKt.a(B.y.f1401r, c1086gP)), CompositionLocalsKt.f14852n.b(LayoutDirection.f15717b)}, androidx.compose.runtime.internal.a.b(-477913269, new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.material3.TimePickerKt$ClockDisplayNumbers$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // Ia.p
                public final p293xa.r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                    int iB;
                    InterfaceC1084f interfaceC1084f3 = interfaceC1084f2;
                    if ((num.intValue() & 3) == 2 && interfaceC1084f3.s()) {
                        interfaceC1084f3.w();
                    } else {
                        l0 l0Var2 = l0Var;
                        i0 i0Var2 = i0Var;
                        androidx.compose.ui.h.a aVar = androidx.compose.ui.h.a.f13984b;
                        androidx.compose.foundation.layout.T tA = androidx.compose.foundation.layout.S.a(C0945e.f10284a, androidx.compose.ui.d.a.j, interfaceC1084f3, 0);
                        int iF = interfaceC1084f3.F();
                        InterfaceC1089h0 interfaceC1089h0Z = interfaceC1084f3.z();
                        androidx.compose.ui.h hVarC = ComposedModifierKt.c(interfaceC1084f3, aVar);
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
                        R0.a(ComposeUiNode.Companion.f14337f, interfaceC1084f3, tA);
                        R0.a(ComposeUiNode.Companion.f14336e, interfaceC1084f3, interfaceC1089h0Z);
                        Ia.p<ComposeUiNode, Integer, p293xa.r> pVar = ComposeUiNode.Companion.f14338g;
                        if (interfaceC1084f3.m() || !kotlin.jvm.internal.i.a(interfaceC1084f3.f(), Integer.valueOf(iF))) {
                            androidx.compose.animation.k.b(iF, interfaceC1084f3, iF, pVar);
                        }
                        R0.a(ComposeUiNode.Companion.f14335d, interfaceC1084f3, hVarC);
                        float f10 = B.y.f1400q;
                        float f11 = B.y.f1398o;
                        androidx.compose.ui.h hVarN = androidx.compose.foundation.layout.W.n(f10, f11, aVar);
                        float f12 = TimePickerKt.f12386a;
                        if (l0Var2.h()) {
                            iB = l0Var2.b() % 24;
                        } else if (l0Var2.b() % 12 == 0) {
                            iB = 12;
                        } else {
                            iB = l0Var2.i() ? l0Var2.b() - 12 : l0Var2.b();
                        }
                        TimePickerKt.o(iB, 0, 3078, i0Var2, l0Var2, interfaceC1084f3, hVarN);
                        TimePickerKt.n(androidx.compose.foundation.layout.W.n(TimePickerKt.f12390e, B.y.f1396m, aVar), interfaceC1084f3, 6);
                        TimePickerKt.o(l0Var2.a(), 1, 3078, i0Var2, l0Var2, interfaceC1084f3, androidx.compose.foundation.layout.W.n(f10, f11, aVar));
                        interfaceC1084f3.J();
                    }
                    return p293xa.r.f47939a;
                }
            }, c1086gP), c1086gP, 56);
        }
        C1105p0 c1105p0V = c1086gP.V();
        if (c1105p0V != null) {
            c1105p0V.f13109d = new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.material3.TimePickerKt$ClockDisplayNumbers$2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // Ia.p
                public final p293xa.r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                    num.intValue();
                    TimePickerKt.a(l0Var, i0Var, interfaceC1084f2, L4.b.l(i10 | 1));
                    return p293xa.r.f47939a;
                }
            };
        }
    }

    public static final void b(final C1047b c1047b, final i0 i0Var, final boolean z10, InterfaceC1084f interfaceC1084f, final int i10) {
        int i11;
        C1086g c1086gP = interfaceC1084f.p(-1170157036);
        if ((i10 & 6) == 0) {
            i11 = (c1086gP.k(c1047b) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            i11 |= c1086gP.K(i0Var) ? 32 : 16;
        }
        if ((i10 & 384) == 0) {
            i11 |= c1086gP.c(z10) ? 256 : 128;
        }
        if ((i11 & 147) == 146 && c1086gP.s()) {
            c1086gP.w();
        } else {
            CrossfadeKt.b(k0.a(c1047b.f12419a.g(), 1) ? f12393h : f12394i, androidx.compose.ui.draw.f.c(androidx.compose.foundation.layout.W.m(C0932d.b(androidx.compose.ui.h.a.f13984b, i0Var.f12463a, p270w.g.f47680a).i(new ClockDialModifier(c1047b, z10, c1047b.f12419a.g())), B.y.f1385a), new Ia.l<J.c, p293xa.r>() { // from class: androidx.compose.material3.TimePickerKt$drawSelector$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                @Override // Ia.l
                public final p293xa.r invoke(J.c cVar) {
                    J.c cVar2 = cVar;
                    long jC = I.e.c(cVar2.T0(Float.intBitsToFloat((int) (TimePickerKt.q(c1047b) >> 32))), cVar2.T0(Float.intBitsToFloat((int) (TimePickerKt.q(c1047b) & 4294967295L))));
                    float f10 = 2;
                    float fT0 = cVar2.T0(B.y.f1387c) / f10;
                    long j10 = i0Var.f12464b;
                    cVar2.S(androidx.compose.ui.graphics.H.f13495b, (R.styleable.AppCompatTheme_windowFixedWidthMajor & 2) != 0 ? I.h.c(cVar2.j()) / 2.0f : fT0, (R.styleable.AppCompatTheme_windowFixedWidthMajor & 4) != 0 ? cVar2.j1() : jC, 1.0f, J.h.f3954a, null, (R.styleable.AppCompatTheme_windowFixedWidthMajor & 64) != 0 ? 3 : 0);
                    cVar2.A1();
                    cVar2.S(j10, (R.styleable.AppCompatTheme_windowFixedWidthMajor & 2) != 0 ? I.h.c(cVar2.j()) / 2.0f : fT0, (R.styleable.AppCompatTheme_windowFixedWidthMajor & 4) != 0 ? cVar2.j1() : jC, 1.0f, J.h.f3954a, null, (R.styleable.AppCompatTheme_windowFixedWidthMajor & 64) != 0 ? 3 : 11);
                    cVar2.Q0(j10, Cb.a.g(cVar2.j()), I.d.f(jC, I.e.c(((float) Math.cos(c1047b.f12422d.d().floatValue())) * fT0, ((float) Math.sin(c1047b.f12422d.d().floatValue())) * fT0)), cVar2.T0(B.y.f1388d), (480 & 16) != 0 ? 0 : 0, null, 1.0f, null, (480 & 256) != 0 ? 3 : 3);
                    cVar2.S(j10, (R.styleable.AppCompatTheme_windowFixedWidthMajor & 2) != 0 ? I.h.c(cVar2.j()) / 2.0f : cVar2.T0(B.y.f1386b) / f10, (R.styleable.AppCompatTheme_windowFixedWidthMajor & 4) != 0 ? cVar2.j1() : Cb.a.g(cVar2.j()), 1.0f, J.h.f3954a, null, (R.styleable.AppCompatTheme_windowFixedWidthMajor & 64) != 0 ? 3 : 0);
                    cVar2.S(i0Var.f12467e, (R.styleable.AppCompatTheme_windowFixedWidthMajor & 2) != 0 ? I.h.c(cVar2.j()) / 2.0f : fT0, (R.styleable.AppCompatTheme_windowFixedWidthMajor & 4) != 0 ? cVar2.j1() : jC, 1.0f, J.h.f3954a, null, (R.styleable.AppCompatTheme_windowFixedWidthMajor & 64) != 0 ? 3 : 4);
                    return p293xa.r.f47939a;
                }
            }), C0907g.d(androidx.recyclerview.widget.t.d.DEFAULT_DRAG_ANIMATION_DURATION, 0, null, 6), null, androidx.compose.runtime.internal.a.b(-1022006568, new Ia.q<AbstractC0881i, InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.material3.TimePickerKt$ClockFace$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(3);
                }

                @Override // Ia.q
                public final p293xa.r invoke(AbstractC0881i abstractC0881i, InterfaceC1084f interfaceC1084f2, Integer num) {
                    final AbstractC0881i abstractC0881i2 = abstractC0881i;
                    InterfaceC1084f interfaceC1084f3 = interfaceC1084f2;
                    num.intValue();
                    androidx.compose.ui.h hVarB = androidx.compose.ui.semantics.p.b(androidx.compose.foundation.layout.W.m(androidx.compose.ui.h.a.f13984b, B.y.f1385a), false, new Ia.l<androidx.compose.ui.semantics.w, p293xa.r>() { // from class: androidx.compose.material3.TimePickerKt$ClockFace$1.1
                        @Override // Ia.l
                        public final p293xa.r invoke(androidx.compose.ui.semantics.w wVar) {
                            Oa.l<Object>[] lVarArr = androidx.compose.ui.semantics.t.f15251a;
                            androidx.compose.ui.semantics.v<p293xa.r> vVar = SemanticsProperties.f15152e;
                            p293xa.r rVar = p293xa.r.f47939a;
                            wVar.e(vVar, rVar);
                            return rVar;
                        }
                    });
                    float f10 = TimePickerKt.f12386a;
                    final i0 i0Var2 = i0Var;
                    final C1047b c1047b2 = c1047b;
                    final boolean z11 = z10;
                    TimePickerKt.l(hVarB, f10, androidx.compose.runtime.internal.a.b(-320307952, new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.material3.TimePickerKt$ClockFace$1.2
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(2);
                        }

                        @Override // Ia.p
                        public final p293xa.r invoke(InterfaceC1084f interfaceC1084f4, Integer num2) {
                            InterfaceC1084f interfaceC1084f5 = interfaceC1084f4;
                            if ((num2.intValue() & 3) == 2 && interfaceC1084f5.s()) {
                                interfaceC1084f5.w();
                            } else {
                                C1101n0 c1101n0B = B7.b.b(i0Var2.f12468f, ContentColorKt.f12125a);
                                final AbstractC0881i abstractC0881i3 = abstractC0881i2;
                                final C1047b c1047b3 = c1047b2;
                                final boolean z12 = z11;
                                CompositionLocalKt.a(c1101n0B, androidx.compose.runtime.internal.a.b(1992872400, new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.material3.TimePickerKt.ClockFace.1.2.1
                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                    {
                                        super(2);
                                    }

                                    @Override // Ia.p
                                    public final p293xa.r invoke(InterfaceC1084f interfaceC1084f6, Integer num3) {
                                        androidx.compose.ui.h.a aVar;
                                        InterfaceC1084f interfaceC1084f7 = interfaceC1084f6;
                                        if ((num3.intValue() & 3) == 2 && interfaceC1084f7.s()) {
                                            interfaceC1084f7.w();
                                        } else {
                                            interfaceC1084f7.L(1547046870);
                                            AbstractC0881i abstractC0881i4 = abstractC0881i3;
                                            int i12 = abstractC0881i4.f9184b;
                                            C1047b c1047b4 = c1047b3;
                                            boolean z13 = z12;
                                            final int i13 = 0;
                                            while (true) {
                                                aVar = androidx.compose.ui.h.a.f13984b;
                                                if (i13 >= i12) {
                                                    break;
                                                }
                                                int iA = (!c1047b4.f12419a.h() || k0.a(c1047b4.f12419a.g(), 1)) ? abstractC0881i4.a(i13) : abstractC0881i4.a(i13) % 12;
                                                boolean zH = interfaceC1084f7.h(i13);
                                                Object objF = interfaceC1084f7.f();
                                                if (zH || objF == InterfaceC1084f.a.f12980a) {
                                                    objF = new Ia.l<androidx.compose.ui.semantics.w, p293xa.r>() { // from class: androidx.compose.material3.TimePickerKt$ClockFace$1$2$1$1$1$1
                                                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                                        {
                                                            super(1);
                                                        }

                                                        @Override // Ia.l
                                                        public final p293xa.r invoke(androidx.compose.ui.semantics.w wVar) {
                                                            androidx.compose.ui.semantics.t.n(wVar, i13);
                                                            return p293xa.r.f47939a;
                                                        }
                                                    };
                                                    interfaceC1084f7.E(objF);
                                                }
                                                TimePickerKt.m(androidx.compose.ui.semantics.p.b(aVar, false, (Ia.l) objF), c1047b4, iA, z13, interfaceC1084f7, 0);
                                                i13++;
                                            }
                                            interfaceC1084f7.D();
                                            if (k0.a(c1047b3.f12419a.g(), 0) && c1047b3.f12419a.h()) {
                                                androidx.compose.ui.h hVarB2 = C0932d.b(androidx.compose.foundation.layout.W.m(C1171q.b(aVar, LayoutId.f12207c), B.y.f1385a), androidx.compose.ui.graphics.H.f13503k, p270w.g.f47680a);
                                                float f11 = TimePickerKt.f12387b;
                                                final C1047b c1047b5 = c1047b3;
                                                final boolean z14 = z12;
                                                TimePickerKt.l(hVarB2, f11, androidx.compose.runtime.internal.a.b(-205464413, new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.material3.TimePickerKt.ClockFace.1.2.1.2
                                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                                    {
                                                        super(2);
                                                    }

                                                    @Override // Ia.p
                                                    public final p293xa.r invoke(InterfaceC1084f interfaceC1084f8, Integer num4) {
                                                        InterfaceC1084f interfaceC1084f9 = interfaceC1084f8;
                                                        if ((num4.intValue() & 3) == 2 && interfaceC1084f9.s()) {
                                                            interfaceC1084f9.w();
                                                        } else {
                                                            int i14 = TimePickerKt.j.f9184b;
                                                            C1047b c1047b6 = c1047b5;
                                                            boolean z15 = z14;
                                                            for (final int i15 = 0; i15 < i14; i15++) {
                                                                int iA2 = TimePickerKt.j.a(i15);
                                                                androidx.compose.ui.h.a aVar2 = androidx.compose.ui.h.a.f13984b;
                                                                boolean zH2 = interfaceC1084f9.h(i15);
                                                                Object objF2 = interfaceC1084f9.f();
                                                                if (zH2 || objF2 == InterfaceC1084f.a.f12980a) {
                                                                    objF2 = new Ia.l<androidx.compose.ui.semantics.w, p293xa.r>() { // from class: androidx.compose.material3.TimePickerKt$ClockFace$1$2$1$2$1$1$1
                                                                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                                                        {
                                                                            super(1);
                                                                        }

                                                                        @Override // Ia.l
                                                                        public final p293xa.r invoke(androidx.compose.ui.semantics.w wVar) {
                                                                            androidx.compose.ui.semantics.t.n(wVar, 12 + i15);
                                                                            return p293xa.r.f47939a;
                                                                        }
                                                                    };
                                                                    interfaceC1084f9.E(objF2);
                                                                }
                                                                TimePickerKt.m(androidx.compose.ui.semantics.p.b(aVar2, false, (Ia.l) objF2), c1047b6, iA2, z15, interfaceC1084f9, 0);
                                                            }
                                                        }
                                                        return p293xa.r.f47939a;
                                                    }
                                                }, interfaceC1084f7), interfaceC1084f7, 432, 0);
                                            }
                                        }
                                        return p293xa.r.f47939a;
                                    }
                                }, interfaceC1084f5), interfaceC1084f5, 56);
                            }
                            return p293xa.r.f47939a;
                        }
                    }, interfaceC1084f3), interfaceC1084f3, 432, 0);
                    return p293xa.r.f47939a;
                }
            }, c1086gP), c1086gP, 24960, 8);
        }
        C1105p0 c1105p0V = c1086gP.V();
        if (c1105p0V != null) {
            c1105p0V.f13109d = new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.material3.TimePickerKt$ClockFace$2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // Ia.p
                public final p293xa.r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                    num.intValue();
                    TimePickerKt.b(c1047b, i0Var, z10, interfaceC1084f2, L4.b.l(i10 | 1));
                    return p293xa.r.f47939a;
                }
            };
        }
    }

    public static final void c(final l0 l0Var, final i0 i0Var, InterfaceC1084f interfaceC1084f, final int i10) {
        int i11;
        boolean z10;
        boolean z11;
        C1086g c1086gP = interfaceC1084f.p(755539561);
        if ((i10 & 6) == 0) {
            i11 = ((i10 & 8) == 0 ? c1086gP.K(l0Var) : c1086gP.k(l0Var) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            i11 |= c1086gP.K(i0Var) ? 32 : 16;
        }
        if ((i11 & 19) == 18 && c1086gP.s()) {
            c1086gP.w();
        } else {
            C0945e.c cVar = C0945e.f10288e;
            androidx.compose.ui.h.a aVar = androidx.compose.ui.h.a.f13984b;
            C0953m c0953mA = C0952l.a(cVar, androidx.compose.ui.d.a.f13346m, c1086gP, 6);
            int i12 = c1086gP.f12996P;
            InterfaceC1089h0 interfaceC1089h0P = c1086gP.P();
            androidx.compose.ui.h hVarC = ComposedModifierKt.c(c1086gP, aVar);
            ComposeUiNode.f14331c0.getClass();
            Ia.a<ComposeUiNode> aVar2 = ComposeUiNode.Companion.f14333b;
            c1086gP.r();
            if (c1086gP.f12995O) {
                c1086gP.v(aVar2);
            } else {
                c1086gP.A();
            }
            Ia.p<ComposeUiNode, androidx.compose.ui.layout.E, p293xa.r> pVar = ComposeUiNode.Companion.f14337f;
            R0.a(pVar, c1086gP, c0953mA);
            Ia.p<ComposeUiNode, androidx.compose.runtime.r, p293xa.r> pVar2 = ComposeUiNode.Companion.f14336e;
            R0.a(pVar2, c1086gP, interfaceC1089h0P);
            Ia.p<ComposeUiNode, Integer, p293xa.r> pVar3 = ComposeUiNode.Companion.f14338g;
            if (c1086gP.f12995O || !kotlin.jvm.internal.i.a(c1086gP.f(), Integer.valueOf(i12))) {
                J4.i.d(i12, c1086gP, i12, pVar3);
            }
            Ia.p<ComposeUiNode, androidx.compose.ui.h, p293xa.r> pVar4 = ComposeUiNode.Companion.f14335d;
            R0.a(pVar4, c1086gP, hVarC);
            a(l0Var, i0Var, c1086gP, i11 & R.styleable.AppCompatTheme_windowNoTitle);
            c1086gP.L(919638492);
            if (l0Var.h()) {
                z10 = false;
                z11 = true;
            } else {
                z10 = false;
                androidx.compose.ui.h hVarJ = PaddingKt.j(aVar, 0.0f, f12395k, 0.0f, 0.0f, 13);
                androidx.compose.ui.layout.E eD = BoxKt.d(androidx.compose.ui.d.a.f13335a, false);
                int i13 = c1086gP.f12996P;
                InterfaceC1089h0 interfaceC1089h0P2 = c1086gP.P();
                androidx.compose.ui.h hVarC2 = ComposedModifierKt.c(c1086gP, hVarJ);
                c1086gP.r();
                if (c1086gP.f12995O) {
                    c1086gP.v(aVar2);
                } else {
                    c1086gP.A();
                }
                R0.a(pVar, c1086gP, eD);
                R0.a(pVar2, c1086gP, interfaceC1089h0P2);
                if (c1086gP.f12995O || !kotlin.jvm.internal.i.a(c1086gP.f(), Integer.valueOf(i13))) {
                    J4.i.d(i13, c1086gP, i13, pVar3);
                }
                R0.a(pVar4, c1086gP, hVarC2);
                int i14 = i11 << 3;
                d(androidx.compose.foundation.layout.W.n(B.y.f1391g, B.y.f1390f, aVar), l0Var, i0Var, c1086gP, (i14 & 896) | (i14 & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) | 6);
                z11 = true;
                c1086gP.T(true);
            }
            c1086gP.T(z10);
            c1086gP.T(z11);
        }
        C1105p0 c1105p0V = c1086gP.V();
        if (c1105p0V != null) {
            c1105p0V.f13109d = new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.material3.TimePickerKt$HorizontalClockDisplay$2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // Ia.p
                public final p293xa.r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                    num.intValue();
                    TimePickerKt.c(l0Var, i0Var, interfaceC1084f2, L4.b.l(i10 | 1));
                    return p293xa.r.f47939a;
                }
            };
        }
    }

    public static final void d(final androidx.compose.ui.h hVar, final l0 l0Var, final i0 i0Var, InterfaceC1084f interfaceC1084f, final int i10) {
        int i11;
        C1086g c1086gP = interfaceC1084f.p(1261215927);
        if ((i10 & 6) == 0) {
            i11 = (c1086gP.K(hVar) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            i11 |= (i10 & 64) == 0 ? c1086gP.K(l0Var) : c1086gP.k(l0Var) ? 32 : 16;
        }
        if ((i10 & 384) == 0) {
            i11 |= c1086gP.K(i0Var) ? 256 : 128;
        }
        if ((i11 & 147) == 146 && c1086gP.s()) {
            c1086gP.w();
        } else {
            Object objF = c1086gP.f();
            if (objF == InterfaceC1084f.a.f12980a) {
                objF = TimePickerKt$HorizontalPeriodToggle$measurePolicy$1$1.f12399a;
                c1086gP.E(objF);
            }
            androidx.compose.ui.layout.E e10 = (androidx.compose.ui.layout.E) objF;
            androidx.compose.ui.graphics.l0 l0VarA = ShapesKt.a(B.y.f1389e, c1086gP);
            kotlin.jvm.internal.i.c(l0VarA, "null cannot be cast to non-null type androidx.compose.foundation.shape.CornerBasedShape");
            p270w.a aVar = (p270w.a) l0VarA;
            float f10 = (float) 0.0d;
            f(hVar, l0Var, i0Var, e10, p270w.a.b(aVar, null, new p270w.d(f10), new p270w.d(f10), null, 9), p270w.a.b(aVar, new p270w.d(f10), null, null, new p270w.d(f10), 6), c1086gP, (i11 & 14) | 3072 | (i11 & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) | (i11 & 896));
        }
        C1105p0 c1105p0V = c1086gP.V();
        if (c1105p0V != null) {
            c1105p0V.f13109d = new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.material3.TimePickerKt$HorizontalPeriodToggle$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // Ia.p
                public final p293xa.r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                    num.intValue();
                    TimePickerKt.d(hVar, l0Var, i0Var, interfaceC1084f2, L4.b.l(i10 | 1));
                    return p293xa.r.f47939a;
                }
            };
        }
    }

    /* JADX WARN: Code duplicated, block: B:26:0x0045  */
    /* JADX WARN: Code duplicated, block: B:28:0x0049  */
    /* JADX WARN: Code duplicated, block: B:30:0x0051  */
    /* JADX WARN: Code duplicated, block: B:31:0x0054  */
    /* JADX WARN: Code duplicated, block: B:34:0x005a  */
    /* JADX WARN: Code duplicated, block: B:37:0x0060  */
    /* JADX WARN: Code duplicated, block: B:38:0x0063  */
    /* JADX WARN: Code duplicated, block: B:40:0x0067  */
    /* JADX WARN: Code duplicated, block: B:42:0x006d  */
    /* JADX WARN: Code duplicated, block: B:43:0x0070  */
    /* JADX WARN: Code duplicated, block: B:52:0x0087  */
    /* JADX WARN: Code duplicated, block: B:54:0x0090  */
    /* JADX WARN: Code duplicated, block: B:60:0x00a1 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:61:0x00a3  */
    /* JADX WARN: Code duplicated, block: B:64:0x00a8  */
    /* JADX WARN: Code duplicated, block: B:67:0x00df  */
    /* JADX WARN: Code duplicated, block: B:68:0x00e3  */
    /* JADX WARN: Code duplicated, block: B:71:0x00f6  */
    /* JADX WARN: Code duplicated, block: B:73:0x0104  */
    /* JADX WARN: Code duplicated, block: B:77:0x0131  */
    /* JADX WARN: Code duplicated, block: B:79:? A[RETURN, SYNTHETIC] */
    public static final void e(final C1047b c1047b, androidx.compose.ui.h hVar, i0 i0Var, final boolean z10, InterfaceC1084f interfaceC1084f, final int i10, final int i11) {
        int i12;
        androidx.compose.ui.h hVar2;
        i0 i0VarA;
        int i13;
        int i14;
        androidx.compose.ui.h.a aVar;
        int i15;
        Ia.a<ComposeUiNode> aVar2;
        Ia.p<ComposeUiNode, Integer, p293xa.r> pVar;
        final androidx.compose.ui.h hVar3;
        final i0 i0Var2;
        C1105p0 c1105p0V;
        C1086g c1086gP = interfaceC1084f.p(1432307537);
        if ((i11 & 1) != 0) {
            i12 = i10 | 6;
        } else if ((i10 & 6) == 0) {
            i12 = (c1086gP.k(c1047b) ? 4 : 2) | i10;
        } else {
            i12 = i10;
        }
        int i16 = i11 & 2;
        if (i16 == 0) {
            if ((i10 & 48) == 0) {
                hVar2 = hVar;
                i12 |= c1086gP.K(hVar2) ? 32 : 16;
            }
            if ((i10 & 384) == 0) {
                if ((i11 & 4) == 0) {
                    i0VarA = i0Var;
                    int i17 = c1086gP.K(i0VarA) ? 256 : 128;
                    i12 |= i17;
                } else {
                    i0VarA = i0Var;
                }
                i12 |= i17;
            } else {
                i0VarA = i0Var;
            }
            if ((i11 & 8) != 0) {
                i12 |= 3072;
            } else if ((i10 & 3072) == 0) {
                if (c1086gP.c(z10)) {
                    i13 = 2048;
                } else {
                    i13 = 1024;
                }
                i12 |= i13;
            }
            if ((i12 & 1171) == 1170 || !c1086gP.s()) {
                c1086gP.r0();
                i14 = i10 & 1;
                aVar = androidx.compose.ui.h.a.f13984b;
                if (i14 != 0 || c1086gP.a0()) {
                    if (i16 != 0) {
                        hVar2 = aVar;
                    }
                    if ((i11 & 4) != 0) {
                        i12 &= -897;
                        i0VarA = j0.a(c1086gP);
                    }
                } else {
                    c1086gP.w();
                    if ((i11 & 4) != 0) {
                        i12 &= -897;
                    }
                }
                c1086gP.U();
                androidx.compose.ui.h hVarJ = PaddingKt.j(hVar2, 0.0f, 0.0f, 0.0f, f12389d, 7);
                androidx.compose.foundation.layout.T tA = androidx.compose.foundation.layout.S.a(C0945e.f10284a, androidx.compose.ui.d.a.f13344k, c1086gP, 48);
                i15 = c1086gP.f12996P;
                InterfaceC1089h0 interfaceC1089h0P = c1086gP.P();
                androidx.compose.ui.h hVarC = ComposedModifierKt.c(c1086gP, hVarJ);
                ComposeUiNode.f14331c0.getClass();
                aVar2 = ComposeUiNode.Companion.f14333b;
                c1086gP.r();
                if (c1086gP.f12995O) {
                    c1086gP.v(aVar2);
                } else {
                    c1086gP.A();
                }
                R0.a(ComposeUiNode.Companion.f14337f, c1086gP, tA);
                R0.a(ComposeUiNode.Companion.f14336e, c1086gP, interfaceC1089h0P);
                pVar = ComposeUiNode.Companion.f14338g;
                if (c1086gP.f12995O || !kotlin.jvm.internal.i.a(c1086gP.f(), Integer.valueOf(i15))) {
                    J4.i.d(i15, c1086gP, i15, pVar);
                }
                R0.a(ComposeUiNode.Companion.f14335d, c1086gP, hVarC);
                int i18 = i12 & 14;
                int i19 = i12 >> 3;
                int i20 = i18 | (i19 & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle);
                c(c1047b, i0VarA, c1086gP, i20);
                Lb.a.a(c1086gP, androidx.compose.foundation.layout.W.q(aVar, f12388c));
                b(c1047b, i0VarA, z10, c1086gP, (i19 & 896) | i20);
                c1086gP.T(true);
            } else {
                c1086gP.w();
            }
            hVar3 = hVar2;
            i0Var2 = i0VarA;
            c1105p0V = c1086gP.V();
            if (c1105p0V != null) {
                c1105p0V.f13109d = new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.material3.TimePickerKt$HorizontalTimePicker$2
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(2);
                    }

                    @Override // Ia.p
                    public final p293xa.r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                        num.intValue();
                        TimePickerKt.e(c1047b, hVar3, i0Var2, z10, interfaceC1084f2, L4.b.l(i10 | 1), i11);
                        return p293xa.r.f47939a;
                    }
                };
            }
        }
        i12 |= 48;
        hVar2 = hVar;
        if ((i10 & 384) == 0) {
            if ((i11 & 4) == 0) {
                i0VarA = i0Var;
                if (c1086gP.K(i0VarA)) {
                }
                i12 |= i17;
            } else {
                i0VarA = i0Var;
            }
            i12 |= i17;
        } else {
            i0VarA = i0Var;
        }
        if ((i11 & 8) != 0) {
            i12 |= 3072;
        } else if ((i10 & 3072) == 0) {
            if (c1086gP.c(z10)) {
                i13 = 2048;
            } else {
                i13 = 1024;
            }
            i12 |= i13;
        }
        if ((i12 & 1171) == 1170) {
            c1086gP.r0();
            i14 = i10 & 1;
            aVar = androidx.compose.ui.h.a.f13984b;
            if (i14 != 0) {
                if (i16 != 0) {
                    hVar2 = aVar;
                }
                if ((i11 & 4) != 0) {
                    i12 &= -897;
                    i0VarA = j0.a(c1086gP);
                }
            } else {
                if (i16 != 0) {
                    hVar2 = aVar;
                }
                if ((i11 & 4) != 0) {
                    i12 &= -897;
                    i0VarA = j0.a(c1086gP);
                }
            }
            c1086gP.U();
            androidx.compose.ui.h hVarJ2 = PaddingKt.j(hVar2, 0.0f, 0.0f, 0.0f, f12389d, 7);
            androidx.compose.foundation.layout.T tA2 = androidx.compose.foundation.layout.S.a(C0945e.f10284a, androidx.compose.ui.d.a.f13344k, c1086gP, 48);
            i15 = c1086gP.f12996P;
            InterfaceC1089h0 interfaceC1089h0P2 = c1086gP.P();
            androidx.compose.ui.h hVarC2 = ComposedModifierKt.c(c1086gP, hVarJ2);
            ComposeUiNode.f14331c0.getClass();
            aVar2 = ComposeUiNode.Companion.f14333b;
            c1086gP.r();
            if (c1086gP.f12995O) {
                c1086gP.v(aVar2);
            } else {
                c1086gP.A();
            }
            R0.a(ComposeUiNode.Companion.f14337f, c1086gP, tA2);
            R0.a(ComposeUiNode.Companion.f14336e, c1086gP, interfaceC1089h0P2);
            pVar = ComposeUiNode.Companion.f14338g;
            if (c1086gP.f12995O) {
                J4.i.d(i15, c1086gP, i15, pVar);
            } else {
                J4.i.d(i15, c1086gP, i15, pVar);
            }
            R0.a(ComposeUiNode.Companion.f14335d, c1086gP, hVarC2);
            int i110 = i12 & 14;
            int i111 = i12 >> 3;
            int i21 = i110 | (i111 & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle);
            c(c1047b, i0VarA, c1086gP, i21);
            Lb.a.a(c1086gP, androidx.compose.foundation.layout.W.q(aVar, f12388c));
            b(c1047b, i0VarA, z10, c1086gP, (i111 & 896) | i21);
            c1086gP.T(true);
        } else {
            c1086gP.r0();
            i14 = i10 & 1;
            aVar = androidx.compose.ui.h.a.f13984b;
            if (i14 != 0) {
                if (i16 != 0) {
                    hVar2 = aVar;
                }
                if ((i11 & 4) != 0) {
                    i12 &= -897;
                    i0VarA = j0.a(c1086gP);
                }
            } else {
                if (i16 != 0) {
                    hVar2 = aVar;
                }
                if ((i11 & 4) != 0) {
                    i12 &= -897;
                    i0VarA = j0.a(c1086gP);
                }
            }
            c1086gP.U();
            androidx.compose.ui.h hVarJ3 = PaddingKt.j(hVar2, 0.0f, 0.0f, 0.0f, f12389d, 7);
            androidx.compose.foundation.layout.T tA3 = androidx.compose.foundation.layout.S.a(C0945e.f10284a, androidx.compose.ui.d.a.f13344k, c1086gP, 48);
            i15 = c1086gP.f12996P;
            InterfaceC1089h0 interfaceC1089h0P3 = c1086gP.P();
            androidx.compose.ui.h hVarC3 = ComposedModifierKt.c(c1086gP, hVarJ3);
            ComposeUiNode.f14331c0.getClass();
            aVar2 = ComposeUiNode.Companion.f14333b;
            c1086gP.r();
            if (c1086gP.f12995O) {
                c1086gP.v(aVar2);
            } else {
                c1086gP.A();
            }
            R0.a(ComposeUiNode.Companion.f14337f, c1086gP, tA3);
            R0.a(ComposeUiNode.Companion.f14336e, c1086gP, interfaceC1089h0P3);
            pVar = ComposeUiNode.Companion.f14338g;
            if (c1086gP.f12995O) {
                J4.i.d(i15, c1086gP, i15, pVar);
            } else {
                J4.i.d(i15, c1086gP, i15, pVar);
            }
            R0.a(ComposeUiNode.Companion.f14335d, c1086gP, hVarC3);
            int i112 = i12 & 14;
            int i113 = i12 >> 3;
            int i22 = i112 | (i113 & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle);
            c(c1047b, i0VarA, c1086gP, i22);
            Lb.a.a(c1086gP, androidx.compose.foundation.layout.W.q(aVar, f12388c));
            b(c1047b, i0VarA, z10, c1086gP, (i113 & 896) | i22);
            c1086gP.T(true);
        }
        hVar3 = hVar2;
        i0Var2 = i0VarA;
        c1105p0V = c1086gP.V();
        if (c1105p0V != null) {
            c1105p0V.f13109d = new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.material3.TimePickerKt$HorizontalTimePicker$2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // Ia.p
                public final p293xa.r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                    num.intValue();
                    TimePickerKt.e(c1047b, hVar3, i0Var2, z10, interfaceC1084f2, L4.b.l(i10 | 1), i11);
                    return p293xa.r.f47939a;
                }
            };
        }
    }

    public static final void f(final androidx.compose.ui.h hVar, final l0 l0Var, final i0 i0Var, final androidx.compose.ui.layout.E e10, final androidx.compose.ui.graphics.l0 l0Var2, final androidx.compose.ui.graphics.l0 l0Var3, InterfaceC1084f interfaceC1084f, final int i10) {
        int i11;
        C1086g c1086gP = interfaceC1084f.p(1374241901);
        if ((i10 & 6) == 0) {
            i11 = (c1086gP.K(hVar) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            i11 |= (i10 & 64) == 0 ? c1086gP.K(l0Var) : c1086gP.k(l0Var) ? 32 : 16;
        }
        if ((i10 & 384) == 0) {
            i11 |= c1086gP.K(i0Var) ? 256 : 128;
        }
        if ((i10 & 3072) == 0) {
            i11 |= c1086gP.K(e10) ? 2048 : 1024;
        }
        if ((i10 & 24576) == 0) {
            i11 |= c1086gP.K(l0Var2) ? 16384 : 8192;
        }
        if ((196608 & i10) == 0) {
            i11 |= c1086gP.K(l0Var3) ? 131072 : 65536;
        }
        int i12 = i11;
        if ((i12 & 74899) == 74898 && c1086gP.s()) {
            c1086gP.w();
        } else {
            C0937i c0937iA = C1787c0.a(B.y.f1393i, i0Var.f12466d);
            androidx.compose.ui.graphics.l0 l0VarA = ShapesKt.a(B.y.f1389e, c1086gP);
            kotlin.jvm.internal.i.c(l0VarA, "null cannot be cast to non-null type androidx.compose.foundation.shape.CornerBasedShape");
            p270w.a aVar = (p270w.a) l0VarA;
            final String strG = com.voltasit.obdeleven.domain.usecases.device.v.g(c1086gP, com.voltasit.obdeleven.R.string.m3c_time_picker_period_toggle_description);
            boolean zK = c1086gP.K(strG);
            Object objF = c1086gP.f();
            InterfaceC1084f.a.C0153a c0153a = InterfaceC1084f.a.f12980a;
            if (zK || objF == c0153a) {
                objF = new Ia.l<androidx.compose.ui.semantics.w, p293xa.r>() { // from class: androidx.compose.material3.TimePickerKt$PeriodToggleImpl$1$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(1);
                    }

                    @Override // Ia.l
                    public final p293xa.r invoke(androidx.compose.ui.semantics.w wVar) {
                        androidx.compose.ui.semantics.w wVar2 = wVar;
                        androidx.compose.ui.semantics.t.m(wVar2);
                        androidx.compose.ui.semantics.t.g(strG, wVar2);
                        return p293xa.r.f47939a;
                    }
                };
                c1086gP.E(objF);
            }
            androidx.compose.ui.h hVarB = C0935g.b(SelectableGroupKt.a(androidx.compose.ui.semantics.p.b(hVar, false, (Ia.l) objF)), c0937iA.f10065a, c0937iA.f10066b, aVar);
            int i13 = c1086gP.f12996P;
            InterfaceC1089h0 interfaceC1089h0P = c1086gP.P();
            androidx.compose.ui.h hVarC = ComposedModifierKt.c(c1086gP, hVarB);
            ComposeUiNode.f14331c0.getClass();
            Ia.a<ComposeUiNode> aVar2 = ComposeUiNode.Companion.f14333b;
            c1086gP.r();
            if (c1086gP.f12995O) {
                c1086gP.v(aVar2);
            } else {
                c1086gP.A();
            }
            R0.a(ComposeUiNode.Companion.f14337f, c1086gP, e10);
            R0.a(ComposeUiNode.Companion.f14336e, c1086gP, interfaceC1089h0P);
            Ia.p<ComposeUiNode, Integer, p293xa.r> pVar = ComposeUiNode.Companion.f14338g;
            if (c1086gP.f12995O || !kotlin.jvm.internal.i.a(c1086gP.f(), Integer.valueOf(i13))) {
                J4.i.d(i13, c1086gP, i13, pVar);
            }
            R0.a(ComposeUiNode.Companion.f14335d, c1086gP, hVarC);
            boolean z10 = !l0Var.i();
            int i14 = i12 & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle;
            boolean z11 = i14 == 32 || ((i12 & 64) != 0 && c1086gP.k(l0Var));
            Object objF2 = c1086gP.f();
            if (z11 || objF2 == c0153a) {
                objF2 = new Ia.a<p293xa.r>() { // from class: androidx.compose.material3.TimePickerKt$PeriodToggleImpl$2$1$1
                    {
                        super(0);
                    }

                    @Override // Ia.a
                    public final p293xa.r invoke() {
                        l0Var.c(false);
                        return p293xa.r.f47939a;
                    }
                };
                c1086gP.E(objF2);
            }
            int i15 = (i12 << 3) & 7168;
            h(z10, l0Var2, (Ia.a) objF2, i0Var, ComposableSingletons$TimePickerKt.f12121a, c1086gP, ((i12 >> 9) & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) | 24576 | i15);
            Lb.a.a(c1086gP, C0932d.b(C1171q.b(androidx.compose.ui.h.a.f13984b, "Spacer").i(new ZIndexElement(2.0f)).i(androidx.compose.foundation.layout.W.f10226c), i0Var.f12466d, androidx.compose.ui.graphics.h0.f13629a));
            boolean zI = l0Var.i();
            boolean z12 = i14 == 32 || ((i12 & 64) != 0 && c1086gP.k(l0Var));
            Object objF3 = c1086gP.f();
            if (z12 || objF3 == c0153a) {
                objF3 = new Ia.a<p293xa.r>() { // from class: androidx.compose.material3.TimePickerKt$PeriodToggleImpl$2$2$1
                    {
                        super(0);
                    }

                    @Override // Ia.a
                    public final p293xa.r invoke() {
                        l0Var.c(true);
                        return p293xa.r.f47939a;
                    }
                };
                c1086gP.E(objF3);
            }
            h(zI, l0Var3, (Ia.a) objF3, i0Var, ComposableSingletons$TimePickerKt.f12122b, c1086gP, ((i12 >> 12) & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) | 24576 | i15);
            c1086gP.T(true);
        }
        C1105p0 c1105p0V = c1086gP.V();
        if (c1105p0V != null) {
            c1105p0V.f13109d = new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.material3.TimePickerKt$PeriodToggleImpl$3
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // Ia.p
                public final p293xa.r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                    num.intValue();
                    TimePickerKt.f(hVar, l0Var, i0Var, e10, l0Var2, l0Var3, interfaceC1084f2, L4.b.l(i10 | 1));
                    return p293xa.r.f47939a;
                }
            };
        }
    }

    /* JADX WARN: Code duplicated, block: B:100:0x0117  */
    /* JADX WARN: Code duplicated, block: B:102:0x011a  */
    /* JADX WARN: Code duplicated, block: B:103:0x013a  */
    /* JADX WARN: Code duplicated, block: B:107:0x0160  */
    /* JADX WARN: Code duplicated, block: B:109:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:29:0x004d  */
    /* JADX WARN: Code duplicated, block: B:31:0x0051  */
    /* JADX WARN: Code duplicated, block: B:33:0x0059  */
    /* JADX WARN: Code duplicated, block: B:34:0x005c  */
    /* JADX WARN: Code duplicated, block: B:37:0x0062  */
    /* JADX WARN: Code duplicated, block: B:40:0x0068  */
    /* JADX WARN: Code duplicated, block: B:42:0x006c  */
    /* JADX WARN: Code duplicated, block: B:44:0x0073  */
    /* JADX WARN: Code duplicated, block: B:45:0x0076  */
    /* JADX WARN: Code duplicated, block: B:48:0x007b  */
    /* JADX WARN: Code duplicated, block: B:55:0x0090  */
    /* JADX WARN: Code duplicated, block: B:57:0x0099  */
    /* JADX WARN: Code duplicated, block: B:68:0x00b4 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:69:0x00b6  */
    /* JADX WARN: Code duplicated, block: B:70:0x00b9  */
    /* JADX WARN: Code duplicated, block: B:73:0x00be  */
    /* JADX WARN: Code duplicated, block: B:74:0x00c5  */
    /* JADX WARN: Code duplicated, block: B:77:0x00ca  */
    /* JADX WARN: Code duplicated, block: B:79:0x00d8  */
    /* JADX WARN: Code duplicated, block: B:80:0x00da  */
    /* JADX WARN: Code duplicated, block: B:82:0x00e2  */
    /* JADX WARN: Code duplicated, block: B:85:0x00f0  */
    /* JADX WARN: Code duplicated, block: B:91:0x00fd  */
    /* JADX WARN: Code duplicated, block: B:94:0x0104  */
    /* JADX WARN: Code duplicated, block: B:96:0x0108  */
    /* JADX WARN: Code duplicated, block: B:99:0x0115  */
    public static final void g(int i10, final int i11, final int i12, i0 i0Var, final l0 l0Var, InterfaceC1084f interfaceC1084f, androidx.compose.ui.h hVar) {
        int i13;
        final androidx.compose.ui.h hVar2;
        i0 i0Var2;
        int i14;
        androidx.compose.ui.h hVar3;
        i0 i0VarA;
        androidx.compose.ui.h hVar4;
        final i0 i0Var3;
        Configuration configuration;
        int i15;
        int i16;
        final int i17;
        androidx.compose.material3.internal.v vVarB;
        boolean z10;
        Object objF;
        C1047b c1047b;
        boolean z11;
        C1105p0 c1105p0V;
        C1086g c1086gP = interfaceC1084f.p(-619286452);
        if ((i12 & 1) != 0) {
            i13 = i11 | 6;
        } else if ((i11 & 6) == 0) {
            i13 = ((i11 & 8) == 0 ? c1086gP.K(l0Var) : c1086gP.k(l0Var) ? 4 : 2) | i11;
        } else {
            i13 = i11;
        }
        int i18 = i12 & 2;
        if (i18 == 0) {
            if ((i11 & 48) == 0) {
                hVar2 = hVar;
                i13 |= c1086gP.K(hVar2) ? 32 : 16;
            }
            if ((i11 & 384) == 0) {
                if ((i12 & 4) == 0) {
                    i0Var2 = i0Var;
                    int i19 = c1086gP.K(i0Var2) ? 256 : 128;
                    i13 |= i19;
                } else {
                    i0Var2 = i0Var;
                }
                i13 |= i19;
            } else {
                i0Var2 = i0Var;
            }
            if ((i11 & 3072) == 0) {
                if ((i12 & 8) == 0) {
                    i14 = i10;
                    int i20 = c1086gP.h(i10) ? 2048 : 1024;
                    i13 |= i20;
                } else {
                    i14 = i10;
                }
                i13 |= i20;
            } else {
                i14 = i10;
            }
            if ((i13 & 1171) == 1170 || !c1086gP.s()) {
                c1086gP.r0();
                if ((i11 & 1) != 0 || c1086gP.a0()) {
                    if (i18 != 0) {
                        hVar3 = androidx.compose.ui.h.a.f13984b;
                    } else {
                        hVar3 = hVar2;
                    }
                    if ((i12 & 4) != 0) {
                        i0VarA = j0.a(c1086gP);
                        i13 &= -897;
                    } else {
                        i0VarA = i0Var2;
                    }
                    if ((i12 & 8) != 0) {
                        configuration = (Configuration) c1086gP.x(AndroidCompositionLocals_androidKt.f14792a);
                        if (configuration.screenHeightDp < configuration.screenWidthDp) {
                            i15 = 0;
                        } else {
                            i15 = 1;
                        }
                        hVar4 = hVar3;
                        i0Var3 = i0VarA;
                        i16 = i13 & (-7169);
                        i17 = i15;
                    } else {
                        hVar4 = hVar3;
                        i0Var3 = i0VarA;
                    }
                    c1086gP.U();
                    vVarB = AccessibilityServiceStateProvider_androidKt.b(c1086gP);
                    if ((i16 & 14) != 4 || ((i16 & 8) != 0 && c1086gP.K(l0Var))) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    objF = c1086gP.f();
                    if (z10 || objF == InterfaceC1084f.a.f12980a) {
                        objF = new C1047b(l0Var);
                        c1086gP.E(objF);
                    }
                    c1047b = (C1047b) objF;
                    if (i17 == 1) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    if (z11) {
                        c1086gP.L(-337235422);
                        k(c1047b, hVar4, i0Var3, !((Boolean) vVarB.getValue()).booleanValue(), c1086gP, i16 & 1008, 0);
                        c1086gP.T(false);
                    } else {
                        c1086gP.L(-337036960);
                        e(c1047b, hVar4, i0Var3, !((Boolean) vVarB.getValue()).booleanValue(), c1086gP, i16 & 1008, 0);
                        c1086gP.T(false);
                    }
                    hVar2 = hVar4;
                } else {
                    c1086gP.w();
                    if ((i12 & 4) != 0) {
                        i13 &= -897;
                    }
                    if ((i12 & 8) != 0) {
                        i13 &= -7169;
                    }
                    hVar4 = hVar2;
                    i0Var3 = i0Var2;
                }
                i16 = i13;
                i17 = i14;
                c1086gP.U();
                vVarB = AccessibilityServiceStateProvider_androidKt.b(c1086gP);
                if ((i16 & 14) != 4) {
                    z10 = true;
                } else {
                    z10 = true;
                }
                objF = c1086gP.f();
                if (z10) {
                    objF = new C1047b(l0Var);
                    c1086gP.E(objF);
                } else {
                    objF = new C1047b(l0Var);
                    c1086gP.E(objF);
                }
                c1047b = (C1047b) objF;
                if (i17 == 1) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                if (z11) {
                    c1086gP.L(-337235422);
                    k(c1047b, hVar4, i0Var3, !((Boolean) vVarB.getValue()).booleanValue(), c1086gP, i16 & 1008, 0);
                    c1086gP.T(false);
                } else {
                    c1086gP.L(-337036960);
                    e(c1047b, hVar4, i0Var3, !((Boolean) vVarB.getValue()).booleanValue(), c1086gP, i16 & 1008, 0);
                    c1086gP.T(false);
                }
                hVar2 = hVar4;
            } else {
                c1086gP.w();
                i0Var3 = i0Var2;
                i17 = i14;
            }
            c1105p0V = c1086gP.V();
            if (c1105p0V != null) {
                c1105p0V.f13109d = new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.material3.TimePickerKt$TimePicker$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(2);
                    }

                    @Override // Ia.p
                    public final p293xa.r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                        num.intValue();
                        l0 l0Var2 = l0Var;
                        androidx.compose.ui.h hVar5 = hVar2;
                        i0 i0Var4 = i0Var3;
                        TimePickerKt.g(i17, L4.b.l(i11 | 1), i12, i0Var4, l0Var2, interfaceC1084f2, hVar5);
                        return p293xa.r.f47939a;
                    }
                };
            }
        }
        i13 |= 48;
        hVar2 = hVar;
        if ((i11 & 384) == 0) {
            if ((i12 & 4) == 0) {
                i0Var2 = i0Var;
                if (c1086gP.K(i0Var2)) {
                }
                i13 |= i19;
            } else {
                i0Var2 = i0Var;
            }
            i13 |= i19;
        } else {
            i0Var2 = i0Var;
        }
        if ((i11 & 3072) == 0) {
            if ((i12 & 8) == 0) {
                i14 = i10;
                if (c1086gP.h(i10)) {
                }
                i13 |= i20;
            } else {
                i14 = i10;
            }
            i13 |= i20;
        } else {
            i14 = i10;
        }
        if ((i13 & 1171) == 1170) {
            c1086gP.r0();
            if ((i11 & 1) != 0) {
                if (i18 != 0) {
                    hVar3 = androidx.compose.ui.h.a.f13984b;
                } else {
                    hVar3 = hVar2;
                }
                if ((i12 & 4) != 0) {
                    i0VarA = j0.a(c1086gP);
                    i13 &= -897;
                } else {
                    i0VarA = i0Var2;
                }
                if ((i12 & 8) != 0) {
                    configuration = (Configuration) c1086gP.x(AndroidCompositionLocals_androidKt.f14792a);
                    if (configuration.screenHeightDp < configuration.screenWidthDp) {
                        i15 = 0;
                    } else {
                        i15 = 1;
                    }
                    hVar4 = hVar3;
                    i0Var3 = i0VarA;
                    i16 = i13 & (-7169);
                    i17 = i15;
                } else {
                    hVar4 = hVar3;
                    i0Var3 = i0VarA;
                    i16 = i13;
                    i17 = i14;
                }
            } else {
                if (i18 != 0) {
                    hVar3 = androidx.compose.ui.h.a.f13984b;
                } else {
                    hVar3 = hVar2;
                }
                if ((i12 & 4) != 0) {
                    i0VarA = j0.a(c1086gP);
                    i13 &= -897;
                } else {
                    i0VarA = i0Var2;
                }
                if ((i12 & 8) != 0) {
                    configuration = (Configuration) c1086gP.x(AndroidCompositionLocals_androidKt.f14792a);
                    if (configuration.screenHeightDp < configuration.screenWidthDp) {
                        i15 = 0;
                    } else {
                        i15 = 1;
                    }
                    hVar4 = hVar3;
                    i0Var3 = i0VarA;
                    i16 = i13 & (-7169);
                    i17 = i15;
                } else {
                    hVar4 = hVar3;
                    i0Var3 = i0VarA;
                    i16 = i13;
                    i17 = i14;
                }
            }
            c1086gP.U();
            vVarB = AccessibilityServiceStateProvider_androidKt.b(c1086gP);
            if ((i16 & 14) != 4) {
                z10 = true;
            } else {
                z10 = true;
            }
            objF = c1086gP.f();
            if (z10) {
                objF = new C1047b(l0Var);
                c1086gP.E(objF);
            } else {
                objF = new C1047b(l0Var);
                c1086gP.E(objF);
            }
            c1047b = (C1047b) objF;
            if (i17 == 1) {
                z11 = true;
            } else {
                z11 = false;
            }
            if (z11) {
                c1086gP.L(-337235422);
                k(c1047b, hVar4, i0Var3, !((Boolean) vVarB.getValue()).booleanValue(), c1086gP, i16 & 1008, 0);
                c1086gP.T(false);
            } else {
                c1086gP.L(-337036960);
                e(c1047b, hVar4, i0Var3, !((Boolean) vVarB.getValue()).booleanValue(), c1086gP, i16 & 1008, 0);
                c1086gP.T(false);
            }
            hVar2 = hVar4;
        } else {
            c1086gP.r0();
            if ((i11 & 1) != 0) {
                if (i18 != 0) {
                    hVar3 = androidx.compose.ui.h.a.f13984b;
                } else {
                    hVar3 = hVar2;
                }
                if ((i12 & 4) != 0) {
                    i0VarA = j0.a(c1086gP);
                    i13 &= -897;
                } else {
                    i0VarA = i0Var2;
                }
                if ((i12 & 8) != 0) {
                    configuration = (Configuration) c1086gP.x(AndroidCompositionLocals_androidKt.f14792a);
                    if (configuration.screenHeightDp < configuration.screenWidthDp) {
                        i15 = 0;
                    } else {
                        i15 = 1;
                    }
                    hVar4 = hVar3;
                    i0Var3 = i0VarA;
                    i16 = i13 & (-7169);
                    i17 = i15;
                } else {
                    hVar4 = hVar3;
                    i0Var3 = i0VarA;
                    i16 = i13;
                    i17 = i14;
                }
            } else {
                if (i18 != 0) {
                    hVar3 = androidx.compose.ui.h.a.f13984b;
                } else {
                    hVar3 = hVar2;
                }
                if ((i12 & 4) != 0) {
                    i0VarA = j0.a(c1086gP);
                    i13 &= -897;
                } else {
                    i0VarA = i0Var2;
                }
                if ((i12 & 8) != 0) {
                    configuration = (Configuration) c1086gP.x(AndroidCompositionLocals_androidKt.f14792a);
                    if (configuration.screenHeightDp < configuration.screenWidthDp) {
                        i15 = 0;
                    } else {
                        i15 = 1;
                    }
                    hVar4 = hVar3;
                    i0Var3 = i0VarA;
                    i16 = i13 & (-7169);
                    i17 = i15;
                } else {
                    hVar4 = hVar3;
                    i0Var3 = i0VarA;
                    i16 = i13;
                    i17 = i14;
                }
            }
            c1086gP.U();
            vVarB = AccessibilityServiceStateProvider_androidKt.b(c1086gP);
            if ((i16 & 14) != 4) {
                z10 = true;
            } else {
                z10 = true;
            }
            objF = c1086gP.f();
            if (z10) {
                objF = new C1047b(l0Var);
                c1086gP.E(objF);
            } else {
                objF = new C1047b(l0Var);
                c1086gP.E(objF);
            }
            c1047b = (C1047b) objF;
            if (i17 == 1) {
                z11 = true;
            } else {
                z11 = false;
            }
            if (z11) {
                c1086gP.L(-337235422);
                k(c1047b, hVar4, i0Var3, !((Boolean) vVarB.getValue()).booleanValue(), c1086gP, i16 & 1008, 0);
                c1086gP.T(false);
            } else {
                c1086gP.L(-337036960);
                e(c1047b, hVar4, i0Var3, !((Boolean) vVarB.getValue()).booleanValue(), c1086gP, i16 & 1008, 0);
                c1086gP.T(false);
            }
            hVar2 = hVar4;
        }
        c1105p0V = c1086gP.V();
        if (c1105p0V != null) {
            c1105p0V.f13109d = new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.material3.TimePickerKt$TimePicker$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // Ia.p
                public final p293xa.r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                    num.intValue();
                    l0 l0Var2 = l0Var;
                    androidx.compose.ui.h hVar5 = hVar2;
                    i0 i0Var4 = i0Var3;
                    TimePickerKt.g(i17, L4.b.l(i11 | 1), i12, i0Var4, l0Var2, interfaceC1084f2, hVar5);
                    return p293xa.r.f47939a;
                }
            };
        }
    }

    public static final void h(final boolean z10, final androidx.compose.ui.graphics.l0 l0Var, final Ia.a<p293xa.r> aVar, final i0 i0Var, final Ia.q<? super androidx.compose.foundation.layout.U, ? super InterfaceC1084f, ? super Integer, p293xa.r> qVar, InterfaceC1084f interfaceC1084f, final int i10) {
        int i11;
        C1086g c1086gP = interfaceC1084f.p(-1937408098);
        if ((i10 & 6) == 0) {
            i11 = (c1086gP.c(z10) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            i11 |= c1086gP.K(l0Var) ? 32 : 16;
        }
        if ((i10 & 384) == 0) {
            i11 |= c1086gP.k(aVar) ? 256 : 128;
        }
        if ((i10 & 3072) == 0) {
            i11 |= c1086gP.K(i0Var) ? 2048 : 1024;
        }
        if ((i10 & 24576) == 0) {
            i11 |= c1086gP.k(qVar) ? 16384 : 8192;
        }
        if ((i11 & 9363) == 9362 && c1086gP.s()) {
            c1086gP.w();
        } else {
            long j10 = z10 ? i0Var.f12471i : i0Var.j;
            long j11 = z10 ? i0Var.f12469g : i0Var.f12470h;
            androidx.compose.ui.h hVarI = new ZIndexElement(z10 ? 0.0f : 1.0f).i(androidx.compose.foundation.layout.W.f10226c);
            boolean z11 = (i11 & 14) == 4;
            Object objF = c1086gP.f();
            if (z11 || objF == InterfaceC1084f.a.f12980a) {
                objF = new Ia.l<androidx.compose.ui.semantics.w, p293xa.r>() { // from class: androidx.compose.material3.TimePickerKt$ToggleItem$1$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(1);
                    }

                    @Override // Ia.l
                    public final p293xa.r invoke(androidx.compose.ui.semantics.w wVar) {
                        androidx.compose.ui.semantics.t.l(wVar, z10);
                        return p293xa.r.f47939a;
                    }
                };
                c1086gP.E(objF);
            }
            androidx.compose.ui.h hVarB = androidx.compose.ui.semantics.p.b(hVarI, false, (Ia.l) objF);
            float f10 = 0;
            ButtonKt.c(aVar, hVarB, false, l0Var, C1051f.g(j11, j10, c1086gP, 12), null, null, new androidx.compose.foundation.layout.N(f10, f10, f10, f10), null, qVar, c1086gP, ((i11 >> 6) & 14) | 12582912 | ((i11 << 6) & 7168) | ((i11 << 15) & 1879048192), 356);
        }
        C1105p0 c1105p0V = c1086gP.V();
        if (c1105p0V != null) {
            c1105p0V.f13109d = new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.material3.TimePickerKt$ToggleItem$2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(2);
                }

                @Override // Ia.p
                public final p293xa.r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                    num.intValue();
                    TimePickerKt.h(z10, l0Var, aVar, i0Var, qVar, interfaceC1084f2, L4.b.l(i10 | 1));
                    return p293xa.r.f47939a;
                }
            };
        }
    }

    public static final void i(final l0 l0Var, final i0 i0Var, InterfaceC1084f interfaceC1084f, final int i10) {
        int i11;
        boolean z10;
        boolean z11;
        C1086g c1086gP = interfaceC1084f.p(2054675515);
        if ((i10 & 6) == 0) {
            i11 = ((i10 & 8) == 0 ? c1086gP.K(l0Var) : c1086gP.k(l0Var) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            i11 |= c1086gP.K(i0Var) ? 32 : 16;
        }
        if ((i11 & 19) == 18 && c1086gP.s()) {
            c1086gP.w();
        } else {
            C0945e.c cVar = C0945e.f10288e;
            androidx.compose.ui.h.a aVar = androidx.compose.ui.h.a.f13984b;
            androidx.compose.foundation.layout.T tA = androidx.compose.foundation.layout.S.a(cVar, androidx.compose.ui.d.a.j, c1086gP, 6);
            int i12 = c1086gP.f12996P;
            InterfaceC1089h0 interfaceC1089h0P = c1086gP.P();
            androidx.compose.ui.h hVarC = ComposedModifierKt.c(c1086gP, aVar);
            ComposeUiNode.f14331c0.getClass();
            Ia.a<ComposeUiNode> aVar2 = ComposeUiNode.Companion.f14333b;
            c1086gP.r();
            if (c1086gP.f12995O) {
                c1086gP.v(aVar2);
            } else {
                c1086gP.A();
            }
            Ia.p<ComposeUiNode, androidx.compose.ui.layout.E, p293xa.r> pVar = ComposeUiNode.Companion.f14337f;
            R0.a(pVar, c1086gP, tA);
            Ia.p<ComposeUiNode, androidx.compose.runtime.r, p293xa.r> pVar2 = ComposeUiNode.Companion.f14336e;
            R0.a(pVar2, c1086gP, interfaceC1089h0P);
            Ia.p<ComposeUiNode, Integer, p293xa.r> pVar3 = ComposeUiNode.Companion.f14338g;
            if (c1086gP.f12995O || !kotlin.jvm.internal.i.a(c1086gP.f(), Integer.valueOf(i12))) {
                J4.i.d(i12, c1086gP, i12, pVar3);
            }
            Ia.p<ComposeUiNode, androidx.compose.ui.h, p293xa.r> pVar4 = ComposeUiNode.Companion.f14335d;
            R0.a(pVar4, c1086gP, hVarC);
            a(l0Var, i0Var, c1086gP, i11 & R.styleable.AppCompatTheme_windowNoTitle);
            c1086gP.L(-709485014);
            if (l0Var.h()) {
                z10 = false;
                z11 = true;
            } else {
                z10 = false;
                androidx.compose.ui.h hVarJ = PaddingKt.j(aVar, f12395k, 0.0f, 0.0f, 0.0f, 14);
                androidx.compose.ui.layout.E eD = BoxKt.d(androidx.compose.ui.d.a.f13335a, false);
                int i13 = c1086gP.f12996P;
                InterfaceC1089h0 interfaceC1089h0P2 = c1086gP.P();
                androidx.compose.ui.h hVarC2 = ComposedModifierKt.c(c1086gP, hVarJ);
                c1086gP.r();
                if (c1086gP.f12995O) {
                    c1086gP.v(aVar2);
                } else {
                    c1086gP.A();
                }
                R0.a(pVar, c1086gP, eD);
                R0.a(pVar2, c1086gP, interfaceC1089h0P2);
                if (c1086gP.f12995O || !kotlin.jvm.internal.i.a(c1086gP.f(), Integer.valueOf(i13))) {
                    J4.i.d(i13, c1086gP, i13, pVar3);
                }
                R0.a(pVar4, c1086gP, hVarC2);
                int i14 = i11 << 3;
                j(androidx.compose.foundation.layout.W.n(B.y.f1397n, B.y.f1396m, aVar), l0Var, i0Var, c1086gP, (i14 & 896) | (i14 & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) | 6);
                z11 = true;
                c1086gP.T(true);
            }
            c1086gP.T(z10);
            c1086gP.T(z11);
        }
        C1105p0 c1105p0V = c1086gP.V();
        if (c1105p0V != null) {
            c1105p0V.f13109d = new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.material3.TimePickerKt$VerticalClockDisplay$2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // Ia.p
                public final p293xa.r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                    num.intValue();
                    TimePickerKt.i(l0Var, i0Var, interfaceC1084f2, L4.b.l(i10 | 1));
                    return p293xa.r.f47939a;
                }
            };
        }
    }

    public static final void j(final androidx.compose.ui.h hVar, final l0 l0Var, final i0 i0Var, InterfaceC1084f interfaceC1084f, final int i10) {
        int i11;
        C1086g c1086gP = interfaceC1084f.p(-1898918107);
        if ((i10 & 6) == 0) {
            i11 = (c1086gP.K(hVar) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            i11 |= (i10 & 64) == 0 ? c1086gP.K(l0Var) : c1086gP.k(l0Var) ? 32 : 16;
        }
        if ((i10 & 384) == 0) {
            i11 |= c1086gP.K(i0Var) ? 256 : 128;
        }
        if ((i11 & 147) == 146 && c1086gP.s()) {
            c1086gP.w();
        } else {
            Object objF = c1086gP.f();
            if (objF == InterfaceC1084f.a.f12980a) {
                objF = TimePickerKt$VerticalPeriodToggle$measurePolicy$1$1.f12400a;
                c1086gP.E(objF);
            }
            androidx.compose.ui.layout.E e10 = (androidx.compose.ui.layout.E) objF;
            androidx.compose.ui.graphics.l0 l0VarA = ShapesKt.a(B.y.f1389e, c1086gP);
            kotlin.jvm.internal.i.c(l0VarA, "null cannot be cast to non-null type androidx.compose.foundation.shape.CornerBasedShape");
            p270w.a aVar = (p270w.a) l0VarA;
            float f10 = (float) 0.0d;
            f(hVar, l0Var, i0Var, e10, ShapesKt.b(aVar), p270w.a.b(aVar, new p270w.d(f10), new p270w.d(f10), null, null, 12), c1086gP, (i11 & 14) | 3072 | (i11 & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) | (i11 & 896));
        }
        C1105p0 c1105p0V = c1086gP.V();
        if (c1105p0V != null) {
            c1105p0V.f13109d = new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.material3.TimePickerKt$VerticalPeriodToggle$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // Ia.p
                public final p293xa.r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                    num.intValue();
                    TimePickerKt.j(hVar, l0Var, i0Var, interfaceC1084f2, L4.b.l(i10 | 1));
                    return p293xa.r.f47939a;
                }
            };
        }
    }

    public static final void k(final C1047b c1047b, androidx.compose.ui.h hVar, i0 i0Var, final boolean z10, InterfaceC1084f interfaceC1084f, final int i10, final int i11) {
        int i12;
        C1086g c1086gP = interfaceC1084f.p(1249591487);
        if ((i11 & 1) != 0) {
            i12 = i10 | 6;
        } else if ((i10 & 6) == 0) {
            i12 = (c1086gP.k(c1047b) ? 4 : 2) | i10;
        } else {
            i12 = i10;
        }
        int i13 = i11 & 2;
        if (i13 != 0) {
            i12 |= 48;
        } else if ((i10 & 48) == 0) {
            i12 |= c1086gP.K(hVar) ? 32 : 16;
        }
        if ((i10 & 384) == 0) {
            i12 |= ((i11 & 4) == 0 && c1086gP.K(i0Var)) ? 256 : 128;
        }
        if ((i11 & 8) != 0) {
            i12 |= 3072;
        } else if ((i10 & 3072) == 0) {
            i12 |= c1086gP.c(z10) ? 2048 : 1024;
        }
        if ((i12 & 1171) == 1170 && c1086gP.s()) {
            c1086gP.w();
        } else {
            c1086gP.r0();
            int i14 = i10 & 1;
            androidx.compose.ui.h.a aVar = androidx.compose.ui.h.a.f13984b;
            if (i14 == 0 || c1086gP.a0()) {
                if (i13 != 0) {
                    hVar = aVar;
                }
                if ((i11 & 4) != 0) {
                    i0Var = j0.a(c1086gP);
                    i12 &= -897;
                }
            } else {
                c1086gP.w();
                if ((i11 & 4) != 0) {
                    i12 &= -897;
                }
            }
            c1086gP.U();
            androidx.compose.ui.h hVarB = androidx.compose.ui.semantics.p.b(hVar, false, new Ia.l<androidx.compose.ui.semantics.w, p293xa.r>() { // from class: androidx.compose.material3.TimePickerKt$VerticalTimePicker$1
                @Override // Ia.l
                public final p293xa.r invoke(androidx.compose.ui.semantics.w wVar) {
                    androidx.compose.ui.semantics.t.m(wVar);
                    return p293xa.r.f47939a;
                }
            });
            C0953m c0953mA = C0952l.a(C0945e.f10286c, androidx.compose.ui.d.a.f13347n, c1086gP, 48);
            int i15 = c1086gP.f12996P;
            InterfaceC1089h0 interfaceC1089h0P = c1086gP.P();
            androidx.compose.ui.h hVarC = ComposedModifierKt.c(c1086gP, hVarB);
            ComposeUiNode.f14331c0.getClass();
            Ia.a<ComposeUiNode> aVar2 = ComposeUiNode.Companion.f14333b;
            c1086gP.r();
            if (c1086gP.f12995O) {
                c1086gP.v(aVar2);
            } else {
                c1086gP.A();
            }
            R0.a(ComposeUiNode.Companion.f14337f, c1086gP, c0953mA);
            R0.a(ComposeUiNode.Companion.f14336e, c1086gP, interfaceC1089h0P);
            Ia.p<ComposeUiNode, Integer, p293xa.r> pVar = ComposeUiNode.Companion.f14338g;
            if (c1086gP.f12995O || !kotlin.jvm.internal.i.a(c1086gP.f(), Integer.valueOf(i15))) {
                J4.i.d(i15, c1086gP, i15, pVar);
            }
            R0.a(ComposeUiNode.Companion.f14335d, c1086gP, hVarC);
            int i16 = i12 & 14;
            int i17 = i12 >> 3;
            int i18 = i16 | (i17 & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle);
            i(c1047b, i0Var, c1086gP, i18);
            Lb.a.a(c1086gP, androidx.compose.foundation.layout.W.e(aVar, f12388c));
            b(c1047b, i0Var, z10, c1086gP, (i17 & 896) | i18);
            Lb.a.a(c1086gP, androidx.compose.foundation.layout.W.e(aVar, f12389d));
            c1086gP.T(true);
        }
        final androidx.compose.ui.h hVar2 = hVar;
        final i0 i0Var2 = i0Var;
        C1105p0 c1105p0V = c1086gP.V();
        if (c1105p0V != null) {
            c1105p0V.f13109d = new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.material3.TimePickerKt$VerticalTimePicker$3
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // Ia.p
                public final p293xa.r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                    num.intValue();
                    TimePickerKt.k(c1047b, hVar2, i0Var2, z10, interfaceC1084f2, L4.b.l(i10 | 1), i11);
                    return p293xa.r.f47939a;
                }
            };
        }
    }

    public static final void l(androidx.compose.ui.h hVar, final float f10, final Ia.p pVar, InterfaceC1084f interfaceC1084f, final int i10, final int i11) {
        int i12;
        C1086g c1086gP = interfaceC1084f.p(1548175696);
        int i13 = i11 & 1;
        if (i13 != 0) {
            i12 = i10 | 6;
        } else if ((i10 & 6) == 0) {
            i12 = (c1086gP.K(hVar) ? 4 : 2) | i10;
        } else {
            i12 = i10;
        }
        if ((i11 & 2) != 0) {
            i12 |= 48;
        } else if ((i10 & 48) == 0) {
            i12 |= c1086gP.g(f10) ? 32 : 16;
        }
        if ((i11 & 4) != 0) {
            i12 |= 384;
        } else if ((i10 & 384) == 0) {
            i12 |= c1086gP.k(pVar) ? 256 : 128;
        }
        if ((i12 & 147) == 146 && c1086gP.s()) {
            c1086gP.w();
        } else {
            if (i13 != 0) {
                hVar = androidx.compose.ui.h.a.f13984b;
            }
            boolean z10 = (i12 & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) == 32;
            Object objF = c1086gP.f();
            if (z10 || objF == InterfaceC1084f.a.f12980a) {
                objF = new androidx.compose.ui.layout.E() { // from class: androidx.compose.material3.TimePickerKt$CircularLayout$1$1
                    @Override // androidx.compose.ui.layout.E
                    public final androidx.compose.ui.layout.F g(androidx.compose.ui.layout.H h8, List<? extends androidx.compose.ui.layout.D> list, final long j10) {
                        LayoutId layoutId;
                        LayoutId layoutId2;
                        androidx.compose.ui.layout.D d10;
                        androidx.compose.ui.layout.D d11;
                        final float fT0 = h8.T0(f10);
                        int i14 = 0;
                        long jA = p013b0.a.a(j10, 0, 0, 0, 0, 10);
                        ArrayList arrayList = new ArrayList(list.size());
                        int size = list.size();
                        int i15 = 0;
                        while (true) {
                            layoutId = LayoutId.f12207c;
                            layoutId2 = LayoutId.f12206b;
                            if (i15 >= size) {
                                break;
                            }
                            androidx.compose.ui.layout.D d12 = list.get(i15);
                            androidx.compose.ui.layout.D d13 = d12;
                            if (C1171q.a(d13) != layoutId2 && C1171q.a(d13) != layoutId) {
                                arrayList.add(d12);
                            }
                            i15++;
                        }
                        final ArrayList arrayList2 = new ArrayList(arrayList.size());
                        int size2 = arrayList.size();
                        for (int i16 = 0; i16 < size2; i16++) {
                            arrayList2.add(((androidx.compose.ui.layout.D) arrayList.get(i16)).Q(jA));
                        }
                        int size3 = list.size();
                        int i17 = 0;
                        while (true) {
                            if (i17 >= size3) {
                                d10 = null;
                                break;
                            }
                            d10 = list.get(i17);
                            if (C1171q.a(d10) == layoutId2) {
                                break;
                            }
                            i17++;
                        }
                        androidx.compose.ui.layout.D d14 = d10;
                        int size4 = list.size();
                        while (true) {
                            if (i14 >= size4) {
                                d11 = null;
                                break;
                            }
                            d11 = list.get(i14);
                            if (C1171q.a(d11) == layoutId) {
                                break;
                            }
                            i14++;
                        }
                        androidx.compose.ui.layout.D d15 = d11;
                        final float size5 = 6.2831855f / arrayList2.size();
                        final androidx.compose.ui.layout.Y yQ = d14 != null ? d14.Q(jA) : null;
                        final androidx.compose.ui.layout.Y yQ2 = d15 != null ? d15.Q(jA) : null;
                        return h8.y1(p013b0.a.j(j10), p013b0.a.i(j10), kotlin.collections.y.p(), new Ia.l<androidx.compose.ui.layout.Y.a, p293xa.r>() { // from class: androidx.compose.material3.TimePickerKt$CircularLayout$1$1.1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(1);
                            }

                            @Override // Ia.l
                            public final p293xa.r invoke(androidx.compose.ui.layout.Y.a aVar) {
                                androidx.compose.ui.layout.Y.a aVar2 = aVar;
                                androidx.compose.ui.layout.Y y10 = yQ;
                                int i18 = 0;
                                if (y10 != null) {
                                    aVar2.d(y10, 0, 0, 0.0f);
                                }
                                List<androidx.compose.ui.layout.Y> list2 = arrayList2;
                                long j11 = j10;
                                float f11 = fT0;
                                float f12 = size5;
                                int size6 = list2.size();
                                while (i18 < size6) {
                                    androidx.compose.ui.layout.Y y11 = list2.get(i18);
                                    double d16 = f11;
                                    double d17 = ((double) (i18 * f12)) - 1.5707963267948966d;
                                    aVar2.d(y11, Ka.a.a((Math.cos(d17) * d16) + ((double) ((p013b0.a.h(j11) / 2) - (y11.f14220b / 2)))), Ka.a.a((Math.sin(d17) * d16) + ((double) ((p013b0.a.g(j11) / 2) - (y11.f14221c / 2)))), 0.0f);
                                    i18++;
                                    j11 = j11;
                                }
                                androidx.compose.ui.layout.Y y12 = yQ2;
                                if (y12 != null) {
                                    aVar2.d(y12, (p013b0.a.j(j10) - yQ2.f14220b) / 2, (p013b0.a.i(j10) - yQ2.f14221c) / 2, 0.0f);
                                }
                                return p293xa.r.f47939a;
                            }
                        });
                    }
                };
                c1086gP.E(objF);
            }
            androidx.compose.ui.layout.E e10 = (androidx.compose.ui.layout.E) objF;
            int i14 = ((i12 >> 6) & 14) | ((i12 << 3) & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle);
            int i15 = c1086gP.f12996P;
            InterfaceC1089h0 interfaceC1089h0P = c1086gP.P();
            androidx.compose.ui.h hVarC = ComposedModifierKt.c(c1086gP, hVar);
            ComposeUiNode.f14331c0.getClass();
            Ia.a<ComposeUiNode> aVar = ComposeUiNode.Companion.f14333b;
            int i16 = ((i14 << 6) & 896) | 6;
            c1086gP.r();
            if (c1086gP.f12995O) {
                c1086gP.v(aVar);
            } else {
                c1086gP.A();
            }
            R0.a(ComposeUiNode.Companion.f14337f, c1086gP, e10);
            R0.a(ComposeUiNode.Companion.f14336e, c1086gP, interfaceC1089h0P);
            Ia.p<ComposeUiNode, Integer, p293xa.r> pVar2 = ComposeUiNode.Companion.f14338g;
            if (c1086gP.f12995O || !kotlin.jvm.internal.i.a(c1086gP.f(), Integer.valueOf(i15))) {
                J4.i.d(i15, c1086gP, i15, pVar2);
            }
            R0.a(ComposeUiNode.Companion.f14335d, c1086gP, hVarC);
            C7.g.b((i16 >> 6) & 14, pVar, c1086gP, true);
        }
        final androidx.compose.ui.h hVar2 = hVar;
        C1105p0 c1105p0V = c1086gP.V();
        if (c1105p0V != null) {
            c1105p0V.f13109d = new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.material3.TimePickerKt$CircularLayout$2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(2);
                }

                @Override // Ia.p
                public final p293xa.r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                    num.intValue();
                    TimePickerKt.l(hVar2, f10, pVar, interfaceC1084f2, L4.b.l(i10 | 1), i11);
                    return p293xa.r.f47939a;
                }
            };
        }
    }

    public static final void m(final androidx.compose.ui.h hVar, final C1047b c1047b, final int i10, final boolean z10, InterfaceC1084f interfaceC1084f, final int i11) {
        int i12;
        C1086g c1086gP = interfaceC1084f.p(-206784607);
        if ((i11 & 6) == 0) {
            i12 = (c1086gP.K(hVar) ? 4 : 2) | i11;
        } else {
            i12 = i11;
        }
        if ((i11 & 48) == 0) {
            i12 |= c1086gP.k(c1047b) ? 32 : 16;
        }
        if ((i11 & 384) == 0) {
            i12 |= c1086gP.h(i10) ? 256 : 128;
        }
        if ((i11 & 3072) == 0) {
            i12 |= c1086gP.c(z10) ? 2048 : 1024;
        }
        if ((i12 & 1171) == 1170 && c1086gP.s()) {
            c1086gP.w();
        } else {
            float f10 = B.y.f1385a;
            androidx.compose.ui.text.F fA = TypographyKt.a(TypographyKeyTokens.f12742b, c1086gP);
            final float fT0 = ((p013b0.c) c1086gP.x(CompositionLocalsKt.f14847h)).T0(f12391f);
            Object objF = c1086gP.f();
            InterfaceC1084f.a.C0153a c0153a = InterfaceC1084f.a.f12980a;
            if (objF == c0153a) {
                objF = J0.f(new I.d(0L));
                c1086gP.E(objF);
            }
            final androidx.compose.runtime.X x10 = (androidx.compose.runtime.X) objF;
            Object objF2 = c1086gP.f();
            if (objF2 == c0153a) {
                objF2 = J0.f(new p013b0.j(0L));
                c1086gP.E(objF2);
            }
            final androidx.compose.runtime.X x11 = (androidx.compose.runtime.X) objF2;
            Object objF3 = c1086gP.f();
            if (objF3 == c0153a) {
                C1113u c1113u = new C1113u(androidx.compose.runtime.E.f(EmptyCoroutineContext.f43032b, c1086gP));
                c1086gP.E(c1113u);
                objF3 = c1113u;
            }
            final kotlinx.coroutines.A a10 = ((C1113u) objF3).f13246b;
            int iG = c1047b.f12419a.g();
            l0 l0Var = c1047b.f12419a;
            final String strS = s(iG, i10, c1086gP, l0Var.h());
            String strA = C1054i.a(i10, 0, 7);
            boolean zA = k0.a(l0Var.g(), 1) ? kotlin.jvm.internal.i.a(C1054i.a(l0Var.a(), 0, 7), strA) : kotlin.jvm.internal.i.a(C1054i.a(l0Var.b(), 0, 7), strA);
            androidx.compose.ui.f fVar = androidx.compose.ui.d.a.f13339e;
            O0 o10 = InteractiveComponentSizeKt.f12188a;
            androidx.compose.ui.h hVarM = androidx.compose.foundation.layout.W.m(hVar.i(MinimumInteractiveModifier.f12219b), f12392g);
            Object objF4 = c1086gP.f();
            if (objF4 == c0153a) {
                objF4 = new Ia.l<InterfaceC1170p, p293xa.r>() { // from class: androidx.compose.material3.TimePickerKt$ClockText$1$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(1);
                    }

                    @Override // Ia.l
                    public final p293xa.r invoke(InterfaceC1170p interfaceC1170p) {
                        InterfaceC1170p interfaceC1170p2 = interfaceC1170p;
                        androidx.compose.runtime.X<p013b0.j> x12 = x11;
                        InterfaceC1170p interfaceC1170pD = interfaceC1170p2.D();
                        long jE = interfaceC1170pD != null ? A8.A.e(interfaceC1170pD.a()) : 0L;
                        float f11 = TimePickerKt.f12386a;
                        x12.setValue(new p013b0.j(jE));
                        x10.setValue(new I.d(kotlin.jvm.internal.n.a(interfaceC1170p2).b()));
                        return p293xa.r.f47939a;
                    }
                };
                c1086gP.E(objF4);
            }
            androidx.compose.ui.h hVarA = androidx.compose.foundation.p.a(androidx.compose.ui.layout.O.a(hVarM, (Ia.l) objF4), true, null);
            boolean zK = c1086gP.k(a10) | c1086gP.k(c1047b) | c1086gP.g(fT0) | ((i12 & 7168) == 2048) | c1086gP.c(zA);
            Object objF5 = c1086gP.f();
            if (zK || objF5 == c0153a) {
                final boolean z11 = zA;
                Ia.l<androidx.compose.ui.semantics.w, p293xa.r> lVar = new Ia.l<androidx.compose.ui.semantics.w, p293xa.r>() { // from class: androidx.compose.material3.TimePickerKt$ClockText$2$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(1);
                    }

                    @Override // Ia.l
                    public final p293xa.r invoke(androidx.compose.ui.semantics.w wVar) {
                        androidx.compose.ui.semantics.w wVar2 = wVar;
                        final kotlinx.coroutines.A a11 = a10;
                        final C1047b c1047b2 = c1047b;
                        final float f11 = fT0;
                        final boolean z12 = z10;
                        final androidx.compose.runtime.X<I.d> x12 = x10;
                        final androidx.compose.runtime.X<p013b0.j> x13 = x11;
                        androidx.compose.ui.semantics.t.e(wVar2, new Ia.a<Boolean>() { // from class: androidx.compose.material3.TimePickerKt$ClockText$2$1.1

                            /* JADX INFO: renamed from: androidx.compose.material3.TimePickerKt$ClockText$2$1$1$1, reason: invalid class name and collision with other inner class name */
                            /* JADX INFO: compiled from: TimePicker.kt */
                            @Aa.c(c = "androidx.compose.material3.TimePickerKt$ClockText$2$1$1$1", f = "TimePicker.kt", l = {1674}, m = "invokeSuspend")
                            final class C01511 extends SuspendLambda implements Ia.p<kotlinx.coroutines.A, kotlin.coroutines.c<? super p293xa.r>, Object> {
                                final /* synthetic */ boolean $autoSwitchToMinute;
                                final /* synthetic */ androidx.compose.runtime.X<I.d> $center$delegate;
                                final /* synthetic */ float $maxDist;
                                final /* synthetic */ androidx.compose.runtime.X<p013b0.j> $parentCenter$delegate;
                                final /* synthetic */ C1047b $state;
                                int label;

                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                public C01511(C1047b c1047b, float f10, boolean z10, androidx.compose.runtime.X<I.d> x10, androidx.compose.runtime.X<p013b0.j> x11, kotlin.coroutines.c<? super C01511> cVar) {
                                    super(2, cVar);
                                    this.$state = c1047b;
                                    this.$maxDist = f10;
                                    this.$autoSwitchToMinute = z10;
                                    this.$center$delegate = x10;
                                    this.$parentCenter$delegate = x11;
                                }

                                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                                public final kotlin.coroutines.c<p293xa.r> create(Object obj, kotlin.coroutines.c<?> cVar) {
                                    return new C01511(this.$state, this.$maxDist, this.$autoSwitchToMinute, this.$center$delegate, this.$parentCenter$delegate, cVar);
                                }

                                @Override // Ia.p
                                public final Object invoke(kotlinx.coroutines.A a10, kotlin.coroutines.c<? super p293xa.r> cVar) {
                                    return ((C01511) create(a10, cVar)).invokeSuspend(p293xa.r.f47939a);
                                }

                                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                                public final Object invokeSuspend(Object obj) {
                                    CoroutineSingletons coroutineSingletons = CoroutineSingletons.f43038b;
                                    int i10 = this.label;
                                    if (i10 == 0) {
                                        kotlin.b.b(obj);
                                        C1047b c1047b = this.$state;
                                        androidx.compose.runtime.X<I.d> x10 = this.$center$delegate;
                                        float f10 = TimePickerKt.f12386a;
                                        float fD = I.d.d(x10.getValue().f3754a);
                                        float fE = I.d.e(this.$center$delegate.getValue().f3754a);
                                        float f11 = this.$maxDist;
                                        boolean z10 = this.$autoSwitchToMinute;
                                        long j = this.$parentCenter$delegate.getValue().f20484a;
                                        this.label = 1;
                                        if (TimePickerKt.p(c1047b, fD, fE, f11, z10, j, this) == coroutineSingletons) {
                                            return coroutineSingletons;
                                        }
                                    } else {
                                        if (i10 != 1) {
                                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                        }
                                        kotlin.b.b(obj);
                                    }
                                    return p293xa.r.f47939a;
                                }
                            }

                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(0);
                            }

                            @Override // Ia.a
                            public final Boolean invoke() {
                                C2680e.c(a11, null, null, new C01511(c1047b2, f11, z12, x12, x13, null), 3);
                                return Boolean.TRUE;
                            }
                        });
                        androidx.compose.ui.semantics.t.l(wVar2, z11);
                        return p293xa.r.f47939a;
                    }
                };
                c1086gP.E(lVar);
                objF5 = lVar;
            }
            androidx.compose.ui.h hVarB = androidx.compose.ui.semantics.p.b(hVarA, true, (Ia.l) objF5);
            androidx.compose.ui.layout.E eD = BoxKt.d(fVar, false);
            int i13 = c1086gP.f12996P;
            InterfaceC1089h0 interfaceC1089h0P = c1086gP.P();
            androidx.compose.ui.h hVarC = ComposedModifierKt.c(c1086gP, hVarB);
            ComposeUiNode.f14331c0.getClass();
            Ia.a<ComposeUiNode> aVar = ComposeUiNode.Companion.f14333b;
            c1086gP.r();
            if (c1086gP.f12995O) {
                c1086gP.v(aVar);
            } else {
                c1086gP.A();
            }
            R0.a(ComposeUiNode.Companion.f14337f, c1086gP, eD);
            R0.a(ComposeUiNode.Companion.f14336e, c1086gP, interfaceC1089h0P);
            Ia.p<ComposeUiNode, Integer, p293xa.r> pVar = ComposeUiNode.Companion.f14338g;
            if (c1086gP.f12995O || !kotlin.jvm.internal.i.a(c1086gP.f(), Integer.valueOf(i13))) {
                J4.i.d(i13, c1086gP, i13, pVar);
            }
            R0.a(ComposeUiNode.Companion.f14335d, c1086gP, hVarC);
            androidx.compose.ui.h.a aVar2 = androidx.compose.ui.h.a.f13984b;
            boolean zK2 = c1086gP.K(strS);
            Object objF6 = c1086gP.f();
            if (zK2 || objF6 == c0153a) {
                objF6 = new Ia.l<androidx.compose.ui.semantics.w, p293xa.r>() { // from class: androidx.compose.material3.TimePickerKt$ClockText$3$1$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(1);
                    }

                    @Override // Ia.l
                    public final p293xa.r invoke(androidx.compose.ui.semantics.w wVar) {
                        androidx.compose.ui.semantics.t.g(strS, wVar);
                        return p293xa.r.f47939a;
                    }
                };
                c1086gP.E(objF6);
            }
            TextKt.b(strA, androidx.compose.ui.semantics.p.a(aVar2, (Ia.l) objF6), 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, fA, c1086gP, 0, 0, 65532);
            c1086gP.T(true);
        }
        C1105p0 c1105p0V = c1086gP.V();
        if (c1105p0V != null) {
            c1105p0V.f13109d = new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.material3.TimePickerKt$ClockText$4
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // Ia.p
                public final p293xa.r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                    num.intValue();
                    TimePickerKt.m(hVar, c1047b, i10, z10, interfaceC1084f2, L4.b.l(i11 | 1));
                    return p293xa.r.f47939a;
                }
            };
        }
    }

    public static final void n(final androidx.compose.ui.h hVar, InterfaceC1084f interfaceC1084f, final int i10) {
        int i11;
        C1086g c1086gP = interfaceC1084f.p(2100674302);
        if ((i10 & 6) == 0) {
            i11 = (c1086gP.K(hVar) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i11 & 3) == 2 && c1086gP.s()) {
            c1086gP.w();
        } else {
            androidx.compose.ui.text.F fA = androidx.compose.ui.text.F.a((androidx.compose.ui.text.F) c1086gP.x(TextKt.f12383a), 0L, 0L, null, null, 0L, null, 3, 0L, null, new androidx.compose.ui.text.style.f(androidx.compose.ui.text.style.f.a.f15664b, 17), 15695871);
            androidx.compose.ui.h hVarA = androidx.compose.ui.semantics.p.a(hVar, new Ia.l<androidx.compose.ui.semantics.w, p293xa.r>() { // from class: androidx.compose.material3.TimePickerKt$DisplaySeparator$1
                @Override // Ia.l
                public final /* bridge */ /* synthetic */ p293xa.r invoke(androidx.compose.ui.semantics.w wVar) {
                    return p293xa.r.f47939a;
                }
            });
            androidx.compose.ui.layout.E eD = BoxKt.d(androidx.compose.ui.d.a.f13339e, false);
            int i12 = c1086gP.f12996P;
            InterfaceC1089h0 interfaceC1089h0P = c1086gP.P();
            androidx.compose.ui.h hVarC = ComposedModifierKt.c(c1086gP, hVarA);
            ComposeUiNode.f14331c0.getClass();
            Ia.a<ComposeUiNode> aVar = ComposeUiNode.Companion.f14333b;
            c1086gP.r();
            if (c1086gP.f12995O) {
                c1086gP.v(aVar);
            } else {
                c1086gP.A();
            }
            R0.a(ComposeUiNode.Companion.f14337f, c1086gP, eD);
            R0.a(ComposeUiNode.Companion.f14336e, c1086gP, interfaceC1089h0P);
            Ia.p<ComposeUiNode, Integer, p293xa.r> pVar = ComposeUiNode.Companion.f14338g;
            if (c1086gP.f12995O || !kotlin.jvm.internal.i.a(c1086gP.f(), Integer.valueOf(i12))) {
                J4.i.d(i12, c1086gP, i12, pVar);
            }
            R0.a(ComposeUiNode.Companion.f14335d, c1086gP, hVarC);
            TextKt.b(":", null, ColorSchemeKt.d(B.x.f1384a, c1086gP), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, fA, c1086gP, 6, 0, 65530);
            c1086gP.T(true);
        }
        C1105p0 c1105p0V = c1086gP.V();
        if (c1105p0V != null) {
            c1105p0V.f13109d = new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.material3.TimePickerKt$DisplaySeparator$3
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // Ia.p
                public final p293xa.r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                    num.intValue();
                    TimePickerKt.n(hVar, interfaceC1084f2, L4.b.l(i10 | 1));
                    return p293xa.r.f47939a;
                }
            };
        }
    }

    public static final void o(final int i10, final int i11, final int i12, final i0 i0Var, final l0 l0Var, InterfaceC1084f interfaceC1084f, final androidx.compose.ui.h hVar) {
        int i13;
        C1086g c1086g;
        C1086g c1086gP = interfaceC1084f.p(-1148055889);
        if ((i12 & 6) == 0) {
            i13 = (c1086gP.K(hVar) ? 4 : 2) | i12;
        } else {
            i13 = i12;
        }
        if ((i12 & 48) == 0) {
            i13 |= c1086gP.h(i10) ? 32 : 16;
        }
        if ((i12 & 384) == 0) {
            i13 |= (i12 & 512) == 0 ? c1086gP.K(l0Var) : c1086gP.k(l0Var) ? 256 : 128;
        }
        if ((i12 & 3072) == 0) {
            i13 |= c1086gP.h(i11) ? 2048 : 1024;
        }
        if ((i12 & 24576) == 0) {
            i13 |= c1086gP.K(i0Var) ? 16384 : 8192;
        }
        if ((i13 & 9363) == 9362 && c1086gP.s()) {
            c1086gP.w();
            c1086g = c1086gP;
        } else {
            boolean zA = k0.a(l0Var.g(), i11);
            final String strG = com.voltasit.obdeleven.domain.usecases.device.v.g(c1086gP, k0.a(i11, 0) ? com.voltasit.obdeleven.R.string.m3c_time_picker_hour_selection : com.voltasit.obdeleven.R.string.m3c_time_picker_minute_selection);
            long j10 = zA ? i0Var.f12472k : i0Var.f12473l;
            long j11 = zA ? i0Var.f12474m : i0Var.f12475n;
            boolean zK = c1086gP.K(strG);
            Object objF = c1086gP.f();
            InterfaceC1084f.a.C0153a c0153a = InterfaceC1084f.a.f12980a;
            if (zK || objF == c0153a) {
                objF = new Ia.l<androidx.compose.ui.semantics.w, p293xa.r>() { // from class: androidx.compose.material3.TimePickerKt$TimeSelector$1$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(1);
                    }

                    @Override // Ia.l
                    public final p293xa.r invoke(androidx.compose.ui.semantics.w wVar) {
                        androidx.compose.ui.semantics.w wVar2 = wVar;
                        androidx.compose.ui.semantics.t.k(wVar2, 3);
                        androidx.compose.ui.semantics.t.g(strG, wVar2);
                        return p293xa.r.f47939a;
                    }
                };
                c1086gP.E(objF);
            }
            boolean z10 = true;
            androidx.compose.ui.h hVarB = androidx.compose.ui.semantics.p.b(hVar, true, (Ia.l) objF);
            androidx.compose.ui.graphics.l0 l0VarA = ShapesKt.a(B.y.f1399p, c1086gP);
            boolean z11 = (i13 & 7168) == 2048;
            if ((i13 & 896) != 256 && ((i13 & 512) == 0 || !c1086gP.k(l0Var))) {
                z10 = false;
            }
            boolean z12 = z11 | z10;
            Object objF2 = c1086gP.f();
            if (z12 || objF2 == c0153a) {
                objF2 = new Ia.a<p293xa.r>() { // from class: androidx.compose.material3.TimePickerKt$TimeSelector$2$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(0);
                    }

                    @Override // Ia.a
                    public final p293xa.r invoke() {
                        if (!k0.a(i11, l0Var.g())) {
                            l0Var.f(i11);
                        }
                        return p293xa.r.f47939a;
                    }
                };
                c1086gP.E(objF2);
            }
            final long j12 = j11;
            c1086g = c1086gP;
            SurfaceKt.b(zA, (Ia.a) objF2, hVarB, false, l0VarA, j10, 0L, null, androidx.compose.runtime.internal.a.b(-1477282471, new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.material3.TimePickerKt$TimeSelector$3
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
                        final String strS = TimePickerKt.s(i11, i10, interfaceC1084f3, l0Var.h());
                        androidx.compose.ui.f fVar = androidx.compose.ui.d.a.f13339e;
                        int i14 = i10;
                        long j13 = j12;
                        androidx.compose.ui.h.a aVar = androidx.compose.ui.h.a.f13984b;
                        androidx.compose.ui.layout.E eD = BoxKt.d(fVar, false);
                        int iF = interfaceC1084f3.F();
                        InterfaceC1089h0 interfaceC1089h0Z = interfaceC1084f3.z();
                        androidx.compose.ui.h hVarC = ComposedModifierKt.c(interfaceC1084f3, aVar);
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
                        R0.a(ComposeUiNode.Companion.f14337f, interfaceC1084f3, eD);
                        R0.a(ComposeUiNode.Companion.f14336e, interfaceC1084f3, interfaceC1089h0Z);
                        Ia.p<ComposeUiNode, Integer, p293xa.r> pVar = ComposeUiNode.Companion.f14338g;
                        if (interfaceC1084f3.m() || !kotlin.jvm.internal.i.a(interfaceC1084f3.f(), Integer.valueOf(iF))) {
                            androidx.compose.animation.k.b(iF, interfaceC1084f3, iF, pVar);
                        }
                        R0.a(ComposeUiNode.Companion.f14335d, interfaceC1084f3, hVarC);
                        boolean zK2 = interfaceC1084f3.K(strS);
                        Object objF3 = interfaceC1084f3.f();
                        if (zK2 || objF3 == InterfaceC1084f.a.f12980a) {
                            objF3 = new Ia.l<androidx.compose.ui.semantics.w, p293xa.r>() { // from class: androidx.compose.material3.TimePickerKt$TimeSelector$3$1$1$1
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                {
                                    super(1);
                                }

                                @Override // Ia.l
                                public final p293xa.r invoke(androidx.compose.ui.semantics.w wVar) {
                                    androidx.compose.ui.semantics.t.g(strS, wVar);
                                    return p293xa.r.f47939a;
                                }
                            };
                            interfaceC1084f3.E(objF3);
                        }
                        TextKt.b(C1054i.a(i14, 2, 6), androidx.compose.ui.semantics.p.b(aVar, false, (Ia.l) objF3), j13, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, interfaceC1084f3, 0, 0, 131064);
                        interfaceC1084f3.J();
                    }
                    return p293xa.r.f47939a;
                }
            }, c1086gP), c1086g, 0, 1992);
        }
        C1105p0 c1105p0V = c1086g.V();
        if (c1105p0V != null) {
            c1105p0V.f13109d = new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.material3.TimePickerKt$TimeSelector$4
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // Ia.p
                public final p293xa.r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                    num.intValue();
                    androidx.compose.ui.h hVar2 = hVar;
                    int i14 = i10;
                    l0 l0Var2 = l0Var;
                    int i15 = i11;
                    i0 i0Var2 = i0Var;
                    TimePickerKt.o(i14, i15, L4.b.l(i12 | 1), i0Var2, l0Var2, interfaceC1084f2, hVar2);
                    return p293xa.r.f47939a;
                }
            };
        }
    }

    /* JADX WARN: Code duplicated, block: B:41:0x00e6  */
    /* JADX WARN: Code duplicated, block: B:8:0x0017  */
    public static final Object p(C1047b c1047b, float f10, float f11, float f12, boolean z10, long j10, ContinuationImpl continuationImpl) {
        TimePickerKt$onTap$1 timePickerKt$onTap$1;
        float f13;
        float fRint;
        boolean z11;
        C1047b c1047b2;
        boolean z12;
        if (continuationImpl instanceof TimePickerKt$onTap$1) {
            timePickerKt$onTap$1 = (TimePickerKt$onTap$1) continuationImpl;
            int i10 = timePickerKt$onTap$1.label;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                timePickerKt$onTap$1.label = i10 - Integer.MIN_VALUE;
            } else {
                timePickerKt$onTap$1 = new TimePickerKt$onTap$1(continuationImpl);
            }
        } else {
            timePickerKt$onTap$1 = new TimePickerKt$onTap$1(continuationImpl);
        }
        TimePickerKt$onTap$1 timePickerKt$onTap$2 = timePickerKt$onTap$1;
        Object obj = timePickerKt$onTap$2.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f43038b;
        int i11 = timePickerKt$onTap$2.label;
        if (i11 != 0) {
            if (i11 == 1) {
                boolean z13 = timePickerKt$onTap$2.Z$0;
                c1047b2 = (C1047b) timePickerKt$onTap$2.L$0;
                kotlin.b.b(obj);
                z11 = z13;
            } else {
                if (i11 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                z12 = timePickerKt$onTap$2.Z$0;
                c1047b2 = (C1047b) timePickerKt$onTap$2.L$0;
                kotlin.b.b(obj);
            }
            z11 = z12;
            if (z11) {
                c1047b2.f(1);
            }
            return p293xa.r.f47939a;
        }
        kotlin.b.b(obj);
        float fAtan2 = ((float) Math.atan2(f11 - ((int) (j10 & 4294967295L)), f10 - ((int) (j10 >> 32)))) - 1.5707964f;
        if (fAtan2 < 0.0f) {
            fAtan2 += 6.2831855f;
        }
        if (k0.a(c1047b.f12419a.g(), 1)) {
            f13 = 0.10471976f;
            fRint = ((float) Math.rint((fAtan2 / 0.10471976f) / 5.0f)) * 5.0f;
        } else {
            f13 = 0.5235988f;
            fRint = (float) Math.rint(fAtan2 / 0.5235988f);
        }
        float f14 = fRint * f13;
        r(c1047b, f10, f11, f12, j10);
        timePickerKt$onTap$2.L$0 = c1047b;
        z11 = z10;
        timePickerKt$onTap$2.Z$0 = z11;
        timePickerKt$onTap$2.label = 1;
        Object objB = c1047b.f12423e.b(MutatePriority.f9811c, new AnalogTimePickerState$rotateTo$2(c1047b, f14, true, null), timePickerKt$onTap$2);
        if (objB != coroutineSingletons) {
            objB = p293xa.r.f47939a;
        }
        if (objB == coroutineSingletons) {
            return coroutineSingletons;
        }
        c1047b2 = c1047b;
        if (k0.a(c1047b2.f12419a.g(), 0) && z11) {
            timePickerKt$onTap$2.L$0 = c1047b2;
            timePickerKt$onTap$2.Z$0 = z11;
            timePickerKt$onTap$2.label = 2;
            if (kotlinx.coroutines.I.b(100L, timePickerKt$onTap$2) == coroutineSingletons) {
                return coroutineSingletons;
            }
            z12 = z11;
            z11 = z12;
        }
        if (z11) {
            c1047b2.f(1);
        }
        return p293xa.r.f47939a;
    }

    /* JADX WARN: Code duplicated, block: B:9:0x0023  */
    public static final long q(C1047b c1047b) {
        float f10;
        float f11 = 2;
        float f12 = B.y.f1387c / f11;
        if (c1047b.f12419a.h()) {
            l0 l0Var = c1047b.f12419a;
            if (l0Var.i() && k0.a(l0Var.g(), 0)) {
                f10 = f12387b;
            } else {
                f10 = f12386a;
            }
        } else {
            f10 = f12386a;
        }
        float f13 = (f10 - f12) + f12;
        float fCos = ((float) Math.cos(c1047b.f12422d.d().floatValue())) * f13;
        float f14 = B.y.f1385a / f11;
        return (((long) Float.floatToRawIntBits(fCos + f14)) << 32) | (((long) Float.floatToRawIntBits((f13 * ((float) Math.sin(c1047b.f12422d.d().floatValue()))) + f14)) & 4294967295L);
    }

    public static final void r(C1047b c1047b, float f10, float f11, float f12, long j10) {
        if (k0.a(c1047b.f12419a.g(), 0) && c1047b.f12419a.h()) {
            c1047b.c(((float) Math.hypot((double) (((float) ((int) (j10 >> 32))) - f10), (double) (((float) ((int) (j10 & 4294967295L))) - f11))) < f12);
        }
    }

    public static final String s(int i10, int i11, InterfaceC1084f interfaceC1084f, boolean z10) {
        int i12;
        if (k0.a(i10, 1)) {
            i12 = com.voltasit.obdeleven.R.string.m3c_time_picker_minute_suffix;
        } else {
            i12 = z10 ? com.voltasit.obdeleven.R.string.m3c_time_picker_hour_24h_suffix : com.voltasit.obdeleven.R.string.m3c_time_picker_hour_suffix;
        }
        Object[] objArr = {Integer.valueOf(i11)};
        String strG = com.voltasit.obdeleven.domain.usecases.device.v.g(interfaceC1084f, i12);
        Locale locale = p271w0.e.a((Configuration) interfaceC1084f.x(AndroidCompositionLocals_androidKt.f14792a)).get(0);
        if (locale == null) {
            locale = Locale.getDefault();
        }
        Object[] objArrCopyOf = Arrays.copyOf(objArr, 1);
        return String.format(locale, strG, Arrays.copyOf(objArrCopyOf, objArrCopyOf.length));
    }

    public static final m0 t(final int i10, InterfaceC1084f interfaceC1084f, final int i11) {
        Object[] objArr = new Object[0];
        W.f fVar = SaverKt.f13134a;
        W.f fVar2 = new W.f(new Ia.p<androidx.compose.runtime.saveable.j, m0, List<? extends Object>>() { // from class: androidx.compose.material3.TimePickerStateImpl$Companion$Saver$1
            @Override // Ia.p
            public final List<? extends Object> invoke(androidx.compose.runtime.saveable.j jVar, m0 m0Var) {
                m0 m0Var2 = m0Var;
                return kotlin.collections.l.s(Integer.valueOf(m0Var2.b()), Integer.valueOf(m0Var2.f12649e.o()), Boolean.valueOf(m0Var2.f12645a));
            }
        }, new Ia.l<List, m0>() { // from class: androidx.compose.material3.TimePickerStateImpl$Companion$Saver$2
            @Override // Ia.l
            public final m0 invoke(List list) {
                List list2 = list;
                Object obj = list2.get(0);
                kotlin.jvm.internal.i.c(obj, "null cannot be cast to non-null type kotlin.Int");
                int iIntValue = ((Integer) obj).intValue();
                Object obj2 = list2.get(1);
                kotlin.jvm.internal.i.c(obj2, "null cannot be cast to non-null type kotlin.Int");
                int iIntValue2 = ((Integer) obj2).intValue();
                Object obj3 = list2.get(2);
                kotlin.jvm.internal.i.c(obj3, "null cannot be cast to non-null type kotlin.Boolean");
                return new m0(iIntValue, iIntValue2, ((Boolean) obj3).booleanValue());
            }
        });
        final boolean z10 = true;
        boolean zH = interfaceC1084f.h(i10) | interfaceC1084f.h(i11);
        Object objF = interfaceC1084f.f();
        if (zH || objF == InterfaceC1084f.a.f12980a) {
            objF = new Ia.a<m0>() { // from class: androidx.compose.material3.TimePickerKt$rememberTimePickerState$state$1$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                }

                @Override // Ia.a
                public final m0 invoke() {
                    return new m0(i10, i11, z10);
                }
            };
            interfaceC1084f.E(objF);
        }
        return (m0) androidx.compose.runtime.saveable.b.c(objArr, fVar2, null, (Ia.a) objF, interfaceC1084f, 0, 4);
    }
}
