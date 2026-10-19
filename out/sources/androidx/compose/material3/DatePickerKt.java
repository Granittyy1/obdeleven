package androidx.compose.material3;

import B.C0609d;
import androidx.compose.animation.AnimatedContentKt;
import androidx.compose.animation.AnimatedVisibilityKt;
import androidx.compose.animation.EnterExitTransitionKt;
import androidx.compose.animation.InterfaceC0900c;
import androidx.compose.animation.InterfaceC0927e;
import androidx.compose.animation.InterfaceC0928f;
import androidx.compose.animation.core.C0907g;
import androidx.compose.animation.core.C0919t;
import androidx.compose.animation.core.InterfaceC0923x;
import androidx.compose.foundation.C0932d;
import androidx.compose.foundation.C0937i;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.C0945e;
import androidx.compose.foundation.layout.C0952l;
import androidx.compose.foundation.layout.C0953m;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.lazy.LazyDslKt;
import androidx.compose.foundation.lazy.LazyListState;
import androidx.compose.foundation.lazy.grid.LazyGridDslKt;
import androidx.compose.foundation.lazy.grid.LazyGridState;
import androidx.compose.foundation.lazy.grid.LazyGridStateKt;
import androidx.compose.material3.internal.ProvideContentColorTextStyleKt;
import androidx.compose.runtime.C1086g;
import androidx.compose.runtime.C1105p0;
import androidx.compose.runtime.C1113u;
import androidx.compose.runtime.CompositionLocalKt;
import androidx.compose.runtime.InterfaceC1084f;
import androidx.compose.runtime.InterfaceC1089h0;
import androidx.compose.runtime.J0;
import androidx.compose.runtime.N0;
import androidx.compose.runtime.R0;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.semantics.SemanticsProperties;
import androidx.compose.ui.text.C1260a;
import com.google.android.gms.internal.measurement.C1787c0;
import com.google.android.gms.internal.measurement.M1;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Locale;
import kotlin.Pair;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.C2680e;
import me.zhanghai.android.materialprogressbar.R;

/* JADX INFO: compiled from: DatePicker.kt */
/* JADX INFO: loaded from: classes.dex */
public final class DatePickerKt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final float f12139a = 48;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final float f12140b = 56;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final float f12141c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final androidx.compose.foundation.layout.N f12142d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final androidx.compose.foundation.layout.N f12143e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final androidx.compose.foundation.layout.N f12144f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final float f12145g;

    static {
        float f10 = 12;
        f12141c = f10;
        f12142d = PaddingKt.b(0.0f, 0.0f, f10, f10, 3);
        float f11 = 24;
        float f12 = 16;
        f12143e = PaddingKt.b(f11, f12, f10, 0.0f, 8);
        f12144f = PaddingKt.b(f11, 0.0f, f10, f10, 2);
        f12145g = f12;
    }

    public static final void a(final androidx.compose.ui.h hVar, final Ia.p<? super InterfaceC1084f, ? super Integer, p293xa.r> pVar, final Ia.p<? super InterfaceC1084f, ? super Integer, p293xa.r> pVar2, final Ia.p<? super InterfaceC1084f, ? super Integer, p293xa.r> pVar3, final C1064p c1064p, final androidx.compose.ui.text.F f10, final float f11, final Ia.p<? super InterfaceC1084f, ? super Integer, p293xa.r> pVar4, InterfaceC1084f interfaceC1084f, final int i10) {
        int i11;
        C1086g c1086gP = interfaceC1084f.p(1507356255);
        if ((i10 & 6) == 0) {
            i11 = (c1086gP.K(hVar) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            i11 |= c1086gP.k(pVar) ? 32 : 16;
        }
        if ((i10 & 384) == 0) {
            i11 |= c1086gP.k(pVar2) ? 256 : 128;
        }
        if ((i10 & 3072) == 0) {
            i11 |= c1086gP.k(pVar3) ? 2048 : 1024;
        }
        if ((i10 & 24576) == 0) {
            i11 |= c1086gP.K(c1064p) ? 16384 : 8192;
        }
        if ((196608 & i10) == 0) {
            i11 |= c1086gP.K(f10) ? 131072 : 65536;
        }
        if ((1572864 & i10) == 0) {
            i11 |= c1086gP.g(f11) ? 1048576 : 524288;
        }
        if ((12582912 & i10) == 0) {
            i11 |= c1086gP.k(pVar4) ? 8388608 : 4194304;
        }
        int i12 = i11;
        if ((i12 & 4793491) == 4793490 && c1086gP.s()) {
            c1086gP.w();
        } else {
            androidx.compose.ui.h hVarB = C0932d.b(androidx.compose.ui.semantics.p.b(androidx.compose.foundation.layout.W.p(hVar, C0609d.f1235c, 0.0f, 0.0f, 0.0f, 14), false, new Ia.l<androidx.compose.ui.semantics.w, p293xa.r>() { // from class: androidx.compose.material3.DatePickerKt$DateEntryContainer$1
                @Override // Ia.l
                public final p293xa.r invoke(androidx.compose.ui.semantics.w wVar) {
                    androidx.compose.ui.semantics.t.f(wVar);
                    return p293xa.r.f47939a;
                }
            }), c1064p.f12664a, androidx.compose.ui.graphics.h0.f13629a);
            C0953m c0953mA = C0952l.a(C0945e.f10286c, androidx.compose.ui.d.a.f13346m, c1086gP, 0);
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
            R0.a(ComposeUiNode.Companion.f14337f, c1086gP, c0953mA);
            R0.a(ComposeUiNode.Companion.f14336e, c1086gP, interfaceC1089h0P);
            Ia.p<ComposeUiNode, Integer, p293xa.r> pVar5 = ComposeUiNode.Companion.f14338g;
            if (c1086gP.f12995O || !kotlin.jvm.internal.i.a(c1086gP.f(), Integer.valueOf(i13))) {
                J4.i.d(i13, c1086gP, i13, pVar5);
            }
            R0.a(ComposeUiNode.Companion.f14335d, c1086gP, hVarC);
            c(androidx.compose.ui.h.a.f13984b, pVar, c1064p.f12665b, c1064p.f12666c, f11, androidx.compose.runtime.internal.a.b(-229007058, new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.material3.DatePickerKt$DateEntryContainer$2$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(2);
                }

                @Override // Ia.p
                public final p293xa.r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                    C0945e.InterfaceC0129e interfaceC0129e;
                    InterfaceC1084f interfaceC1084f3 = interfaceC1084f2;
                    if ((num.intValue() & 3) == 2 && interfaceC1084f3.s()) {
                        interfaceC1084f3.w();
                    } else {
                        androidx.compose.ui.h.a aVar2 = androidx.compose.ui.h.a.f13984b;
                        androidx.compose.ui.h hVarD = androidx.compose.foundation.layout.W.d(aVar2, 1.0f);
                        final Ia.p<InterfaceC1084f, Integer, p293xa.r> pVar6 = pVar2;
                        Ia.p<InterfaceC1084f, Integer, p293xa.r> pVar7 = pVar3;
                        Ia.p<InterfaceC1084f, Integer, p293xa.r> pVar8 = pVar;
                        C1064p c1064p2 = c1064p;
                        androidx.compose.ui.text.F f12 = f10;
                        C0953m c0953mA2 = C0952l.a(C0945e.f10286c, androidx.compose.ui.d.a.f13346m, interfaceC1084f3, 0);
                        int iF = interfaceC1084f3.F();
                        InterfaceC1089h0 interfaceC1089h0Z = interfaceC1084f3.z();
                        androidx.compose.ui.h hVarC2 = ComposedModifierKt.c(interfaceC1084f3, hVarD);
                        ComposeUiNode.f14331c0.getClass();
                        Ia.a<ComposeUiNode> aVar3 = ComposeUiNode.Companion.f14333b;
                        if (interfaceC1084f3.u() == null) {
                            I.b.k();
                            throw null;
                        }
                        interfaceC1084f3.r();
                        if (interfaceC1084f3.m()) {
                            interfaceC1084f3.v(aVar3);
                        } else {
                            interfaceC1084f3.A();
                        }
                        Ia.p<ComposeUiNode, androidx.compose.ui.layout.E, p293xa.r> pVar9 = ComposeUiNode.Companion.f14337f;
                        R0.a(pVar9, interfaceC1084f3, c0953mA2);
                        Ia.p<ComposeUiNode, androidx.compose.runtime.r, p293xa.r> pVar10 = ComposeUiNode.Companion.f14336e;
                        R0.a(pVar10, interfaceC1084f3, interfaceC1089h0Z);
                        Ia.p<ComposeUiNode, Integer, p293xa.r> pVar11 = ComposeUiNode.Companion.f14338g;
                        if (interfaceC1084f3.m() || !kotlin.jvm.internal.i.a(interfaceC1084f3.f(), Integer.valueOf(iF))) {
                            androidx.compose.animation.k.b(iF, interfaceC1084f3, iF, pVar11);
                        }
                        Ia.p<ComposeUiNode, androidx.compose.ui.h, p293xa.r> pVar12 = ComposeUiNode.Companion.f14335d;
                        R0.a(pVar12, interfaceC1084f3, hVarC2);
                        if (pVar6 == null || pVar7 == null) {
                            interfaceC0129e = pVar6 != null ? C0945e.f10284a : C0945e.f10285b;
                        } else {
                            interfaceC0129e = C0945e.f10290g;
                        }
                        androidx.compose.ui.h hVarD2 = androidx.compose.foundation.layout.W.d(aVar2, 1.0f);
                        androidx.compose.foundation.layout.T tA = androidx.compose.foundation.layout.S.a(interfaceC0129e, androidx.compose.ui.d.a.f13344k, interfaceC1084f3, 48);
                        int iF2 = interfaceC1084f3.F();
                        InterfaceC1089h0 interfaceC1089h0Z2 = interfaceC1084f3.z();
                        androidx.compose.ui.h hVarC3 = ComposedModifierKt.c(interfaceC1084f3, hVarD2);
                        if (interfaceC1084f3.u() == null) {
                            I.b.k();
                            throw null;
                        }
                        interfaceC1084f3.r();
                        if (interfaceC1084f3.m()) {
                            interfaceC1084f3.v(aVar3);
                        } else {
                            interfaceC1084f3.A();
                        }
                        R0.a(pVar9, interfaceC1084f3, tA);
                        R0.a(pVar10, interfaceC1084f3, interfaceC1089h0Z2);
                        if (interfaceC1084f3.m() || !kotlin.jvm.internal.i.a(interfaceC1084f3.f(), Integer.valueOf(iF2))) {
                            androidx.compose.animation.k.b(iF2, interfaceC1084f3, iF2, pVar11);
                        }
                        R0.a(pVar12, interfaceC1084f3, hVarC3);
                        interfaceC1084f3.L(-1287344744);
                        if (pVar6 != null) {
                            TextKt.a(f12, androidx.compose.runtime.internal.a.b(-962031352, new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.material3.DatePickerKt$DateEntryContainer$2$1$1$1$1
                                final /* synthetic */ androidx.compose.foundation.layout.U $this_Row = androidx.compose.foundation.layout.V.f10222a;

                                {
                                    super(2);
                                }

                                @Override // Ia.p
                                public final p293xa.r invoke(InterfaceC1084f interfaceC1084f4, Integer num2) {
                                    InterfaceC1084f interfaceC1084f5 = interfaceC1084f4;
                                    if ((num2.intValue() & 3) == 2 && interfaceC1084f5.s()) {
                                        interfaceC1084f5.w();
                                    } else {
                                        androidx.compose.ui.h hVarB2 = this.$this_Row.b(androidx.compose.ui.h.a.f13984b, true);
                                        Ia.p<InterfaceC1084f, Integer, p293xa.r> pVar13 = pVar6;
                                        androidx.compose.ui.layout.E eD = BoxKt.d(androidx.compose.ui.d.a.f13335a, false);
                                        int iF3 = interfaceC1084f5.F();
                                        InterfaceC1089h0 interfaceC1089h0Z3 = interfaceC1084f5.z();
                                        androidx.compose.ui.h hVarC4 = ComposedModifierKt.c(interfaceC1084f5, hVarB2);
                                        ComposeUiNode.f14331c0.getClass();
                                        Ia.a<ComposeUiNode> aVar4 = ComposeUiNode.Companion.f14333b;
                                        if (interfaceC1084f5.u() == null) {
                                            I.b.k();
                                            throw null;
                                        }
                                        interfaceC1084f5.r();
                                        if (interfaceC1084f5.m()) {
                                            interfaceC1084f5.v(aVar4);
                                        } else {
                                            interfaceC1084f5.A();
                                        }
                                        R0.a(ComposeUiNode.Companion.f14337f, interfaceC1084f5, eD);
                                        R0.a(ComposeUiNode.Companion.f14336e, interfaceC1084f5, interfaceC1089h0Z3);
                                        Ia.p<ComposeUiNode, Integer, p293xa.r> pVar14 = ComposeUiNode.Companion.f14338g;
                                        if (interfaceC1084f5.m() || !kotlin.jvm.internal.i.a(interfaceC1084f5.f(), Integer.valueOf(iF3))) {
                                            androidx.compose.animation.k.b(iF3, interfaceC1084f5, iF3, pVar14);
                                        }
                                        R0.a(ComposeUiNode.Companion.f14335d, interfaceC1084f5, hVarC4);
                                        androidx.compose.foundation.gestures.d.c(pVar13, interfaceC1084f5, 0);
                                    }
                                    return p293xa.r.f47939a;
                                }
                            }, interfaceC1084f3), interfaceC1084f3, 48);
                        }
                        interfaceC1084f3.D();
                        interfaceC1084f3.L(-1287336668);
                        if (pVar7 != null) {
                            pVar7.invoke(interfaceC1084f3, 0);
                        }
                        interfaceC1084f3.D();
                        interfaceC1084f3.J();
                        interfaceC1084f3.L(1995137078);
                        if (pVar8 != null || pVar6 != null || pVar7 != null) {
                            DividerKt.a(null, 0.0f, c1064p2.f12686x, interfaceC1084f3, 0, 3);
                        }
                        interfaceC1084f3.D();
                        interfaceC1084f3.J();
                    }
                    return p293xa.r.f47939a;
                }
            }, c1086gP), c1086gP, (i12 & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) | 196614 | (57344 & (i12 >> 6)));
            C7.g.b((i12 >> 21) & 14, pVar4, c1086gP, true);
        }
        C1105p0 c1105p0V = c1086gP.V();
        if (c1105p0V != null) {
            c1105p0V.f13109d = new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.material3.DatePickerKt$DateEntryContainer$3
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(2);
                }

                @Override // Ia.p
                public final p293xa.r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                    num.intValue();
                    DatePickerKt.a(hVar, pVar, pVar2, pVar3, c1064p, f10, f11, pVar4, interfaceC1084f2, L4.b.l(i10 | 1));
                    return p293xa.r.f47939a;
                }
            };
        }
    }

    /* JADX WARN: Code duplicated, block: B:102:0x0122  */
    /* JADX WARN: Code duplicated, block: B:104:0x0128  */
    /* JADX WARN: Code duplicated, block: B:107:0x013e  */
    /* JADX WARN: Code duplicated, block: B:109:0x014d  */
    /* JADX WARN: Code duplicated, block: B:111:0x015c  */
    /* JADX WARN: Code duplicated, block: B:114:0x0161  */
    /* JADX WARN: Code duplicated, block: B:117:0x0180 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:118:0x0182  */
    /* JADX WARN: Code duplicated, block: B:121:0x0194  */
    /* JADX WARN: Code duplicated, block: B:122:0x01a1  */
    /* JADX WARN: Code duplicated, block: B:126:0x01e3  */
    /* JADX WARN: Code duplicated, block: B:128:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:26:0x004a  */
    /* JADX WARN: Code duplicated, block: B:28:0x004e  */
    /* JADX WARN: Code duplicated, block: B:30:0x0052  */
    /* JADX WARN: Code duplicated, block: B:31:0x0057  */
    /* JADX WARN: Code duplicated, block: B:33:0x005d  */
    /* JADX WARN: Code duplicated, block: B:34:0x0060  */
    /* JADX WARN: Code duplicated, block: B:38:0x0067  */
    /* JADX WARN: Code duplicated, block: B:40:0x006c  */
    /* JADX WARN: Code duplicated, block: B:42:0x0070  */
    /* JADX WARN: Code duplicated, block: B:44:0x0078  */
    /* JADX WARN: Code duplicated, block: B:45:0x007b  */
    /* JADX WARN: Code duplicated, block: B:49:0x0082  */
    /* JADX WARN: Code duplicated, block: B:51:0x0087  */
    /* JADX WARN: Code duplicated, block: B:53:0x008b  */
    /* JADX WARN: Code duplicated, block: B:55:0x0093  */
    /* JADX WARN: Code duplicated, block: B:56:0x0096  */
    /* JADX WARN: Code duplicated, block: B:60:0x009f  */
    /* JADX WARN: Code duplicated, block: B:62:0x00a3  */
    /* JADX WARN: Code duplicated, block: B:64:0x00a6  */
    /* JADX WARN: Code duplicated, block: B:66:0x00ae  */
    /* JADX WARN: Code duplicated, block: B:67:0x00b1  */
    /* JADX WARN: Code duplicated, block: B:71:0x00b9  */
    /* JADX WARN: Code duplicated, block: B:73:0x00bd  */
    /* JADX WARN: Code duplicated, block: B:75:0x00c5  */
    /* JADX WARN: Code duplicated, block: B:76:0x00c8  */
    /* JADX WARN: Code duplicated, block: B:79:0x00cf  */
    /* JADX WARN: Code duplicated, block: B:82:0x00db  */
    /* JADX WARN: Code duplicated, block: B:86:0x00ed  */
    /* JADX WARN: Code duplicated, block: B:88:0x00fa  */
    /* JADX WARN: Code duplicated, block: B:97:0x0111 A[PHI: r0 r9 r10 r12 r13 r14
      0x0111: PHI (r0v9 androidx.compose.material3.q) = (r0v1 androidx.compose.material3.q), (r0v0 androidx.compose.material3.q), (r0v0 androidx.compose.material3.q) binds: [B:113:0x015f, B:95:0x010d, B:96:0x010f] A[DONT_GENERATE, DONT_INLINE]
      0x0111: PHI (r9v26 int) = (r9v19 int), (r9v27 int), (r9v28 int) binds: [B:113:0x015f, B:95:0x010d, B:96:0x010f] A[DONT_GENERATE, DONT_INLINE]
      0x0111: PHI (r10v16 androidx.compose.ui.h) = (r10v3 androidx.compose.ui.h), (r10v2 androidx.compose.ui.h), (r10v2 androidx.compose.ui.h) binds: [B:113:0x015f, B:95:0x010d, B:96:0x010f] A[DONT_GENERATE, DONT_INLINE]
      0x0111: PHI (r12v10 Ia.p<? super androidx.compose.runtime.f, ? super java.lang.Integer, xa.r>) = 
      (r12v3 Ia.p<? super androidx.compose.runtime.f, ? super java.lang.Integer, xa.r>)
      (r12v2 Ia.p<? super androidx.compose.runtime.f, ? super java.lang.Integer, xa.r>)
      (r12v2 Ia.p<? super androidx.compose.runtime.f, ? super java.lang.Integer, xa.r>)
     binds: [B:113:0x015f, B:95:0x010d, B:96:0x010f] A[DONT_GENERATE, DONT_INLINE]
      0x0111: PHI (r13v10 Ia.p<? super androidx.compose.runtime.f, ? super java.lang.Integer, xa.r>) = 
      (r13v7 Ia.p<? super androidx.compose.runtime.f, ? super java.lang.Integer, xa.r>)
      (r13v6 Ia.p<? super androidx.compose.runtime.f, ? super java.lang.Integer, xa.r>)
      (r13v6 Ia.p<? super androidx.compose.runtime.f, ? super java.lang.Integer, xa.r>)
     binds: [B:113:0x015f, B:95:0x010d, B:96:0x010f] A[DONT_GENERATE, DONT_INLINE]
      0x0111: PHI (r14v11 boolean) = (r14v8 boolean), (r14v7 boolean), (r14v7 boolean) binds: [B:113:0x015f, B:95:0x010d, B:96:0x010f] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:98:0x0118 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:99:0x011a  */
    public static final void b(final InterfaceC1067t interfaceC1067t, androidx.compose.ui.h hVar, InterfaceC1065q interfaceC1065q, Ia.p<? super InterfaceC1084f, ? super Integer, p293xa.r> pVar, Ia.p<? super InterfaceC1084f, ? super Integer, p293xa.r> pVar2, boolean z10, C1064p c1064p, InterfaceC1084f interfaceC1084f, final int i10, final int i11) {
        int i12;
        androidx.compose.ui.h hVar2;
        int i13;
        Ia.p<? super InterfaceC1084f, ? super Integer, p293xa.r> pVarB;
        int i14;
        int i15;
        Ia.p<? super InterfaceC1084f, ? super Integer, p293xa.r> pVarB2;
        int i16;
        int i17;
        boolean z11;
        int i18;
        C1064p c1064p2;
        int i19;
        InterfaceC1084f.a.C0153a c0153a;
        final C1064p c1064pC;
        Ia.p<? super InterfaceC1084f, ? super Integer, p293xa.r> pVar3;
        Ia.p<? super InterfaceC1084f, ? super Integer, p293xa.r> pVar4;
        boolean z12;
        final InterfaceC1065q interfaceC1065q2;
        androidx.compose.ui.h hVar3;
        Object objF;
        Locale localeA;
        boolean zK;
        Object objF2;
        ComposableLambdaImpl composableLambdaImplB;
        final Ia.p<? super InterfaceC1084f, ? super Integer, p293xa.r> pVar5;
        final Ia.p<? super InterfaceC1084f, ? super Integer, p293xa.r> pVar6;
        final InterfaceC1065q interfaceC1065q3;
        final androidx.compose.ui.h hVar4;
        C1105p0 c1105p0V;
        int i20;
        boolean zK2;
        final InterfaceC1065q interfaceC1065q4 = interfaceC1065q;
        C1086g c1086gP = interfaceC1084f.p(809701813);
        if ((i11 & 1) != 0) {
            i12 = i10 | 6;
        } else if ((i10 & 6) == 0) {
            i12 = (c1086gP.K(interfaceC1067t) ? 4 : 2) | i10;
        } else {
            i12 = i10;
        }
        int i21 = i11 & 2;
        if (i21 == 0) {
            if ((i10 & 48) == 0) {
                hVar2 = hVar;
                i12 |= c1086gP.K(hVar2) ? 32 : 16;
            }
            if ((i10 & 384) == 0) {
                if ((i11 & 4) != 0) {
                    i20 = 128;
                } else {
                    if ((i10 & 512) == 0) {
                        zK2 = c1086gP.K(interfaceC1065q4);
                    } else {
                        zK2 = c1086gP.k(interfaceC1065q4);
                    }
                    if (zK2) {
                        i20 = 256;
                    } else {
                        i20 = 128;
                    }
                }
                i12 |= i20;
            }
            i13 = i11 & 8;
            if (i13 != 0) {
                if ((i10 & 3072) == 0) {
                    pVarB = pVar;
                    if (c1086gP.k(pVarB)) {
                        i14 = 2048;
                    } else {
                        i14 = 1024;
                    }
                    i12 |= i14;
                }
                i15 = i11 & 16;
                if (i15 != 0) {
                    if ((i10 & 24576) == 0) {
                        pVarB2 = pVar2;
                        if (c1086gP.k(pVarB2)) {
                            i16 = 16384;
                        } else {
                            i16 = 8192;
                        }
                        i12 |= i16;
                    }
                    i17 = i11 & 32;
                    if (i17 != 0) {
                        if ((196608 & i10) == 0) {
                            z11 = z10;
                            if (c1086gP.c(z11)) {
                                i18 = 131072;
                            } else {
                                i18 = 65536;
                            }
                            i12 |= i18;
                        }
                        if ((1572864 & i10) == 0) {
                            if ((i11 & 64) == 0) {
                                c1064p2 = c1064p;
                                int i22 = c1086gP.K(c1064p2) ? 1048576 : 524288;
                                i12 |= i22;
                            } else {
                                c1064p2 = c1064p;
                            }
                            i12 |= i22;
                        } else {
                            c1064p2 = c1064p;
                        }
                        if ((i12 & 599187) == 599186 || !c1086gP.s()) {
                            c1086gP.r0();
                            i19 = i10 & 1;
                            c0153a = InterfaceC1084f.a.f12980a;
                            if (i19 != 0 || c1086gP.a0()) {
                                if (i21 != 0) {
                                    hVar2 = androidx.compose.ui.h.a.f13984b;
                                }
                                if ((i11 & 4) != 0) {
                                    objF = c1086gP.f();
                                    if (objF == c0153a) {
                                        DatePickerDefaults datePickerDefaults = DatePickerDefaults.f12132a;
                                        objF = new r("yMMMM", "yMMMd", "yMMMMEEEEd");
                                        c1086gP.E(objF);
                                    }
                                    interfaceC1065q4 = (InterfaceC1065q) objF;
                                    i12 &= -897;
                                }
                                if (i13 != 0) {
                                    pVarB = androidx.compose.runtime.internal.a.b(-1504998463, new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.material3.DatePickerKt$DatePicker$2
                                        {
                                            super(2);
                                        }

                                        @Override // Ia.p
                                        public final p293xa.r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                                            InterfaceC1084f interfaceC1084f3 = interfaceC1084f2;
                                            if ((num.intValue() & 3) == 2 && interfaceC1084f3.s()) {
                                                interfaceC1084f3.w();
                                            } else {
                                                DatePickerDefaults.f12132a.b(PaddingKt.e(androidx.compose.ui.h.a.f13984b, DatePickerKt.f12143e), interfaceC1067t.b(), 432, interfaceC1084f3, 0);
                                            }
                                            return p293xa.r.f47939a;
                                        }
                                    }, c1086gP);
                                }
                                if (i15 != 0) {
                                    pVarB2 = androidx.compose.runtime.internal.a.b(-1780043561, new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.material3.DatePickerKt$DatePicker$3
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
                                                DatePickerDefaults.f12132a.a(interfaceC1067t.f(), interfaceC1067t.b(), interfaceC1065q4, PaddingKt.e(androidx.compose.ui.h.a.f13984b, DatePickerKt.f12144f), interfaceC1084f3, 27648, 0);
                                            }
                                            return p293xa.r.f47939a;
                                        }
                                    }, c1086gP);
                                }
                                if (i17 != 0) {
                                    z11 = true;
                                }
                                if ((i11 & 64) != 0) {
                                    DatePickerDefaults datePickerDefaults2 = DatePickerDefaults.f12132a;
                                    i12 &= -3670017;
                                    c1064pC = DatePickerDefaults.c(c1086gP);
                                    pVar3 = pVarB;
                                    pVar4 = pVarB2;
                                    z12 = z11;
                                    interfaceC1065q2 = interfaceC1065q4;
                                    hVar3 = hVar2;
                                }
                                c1086gP.U();
                                localeA = C1053h.a(c1086gP);
                                zK = c1086gP.K(localeA);
                                objF2 = c1086gP.f();
                                if (zK || objF2 == c0153a) {
                                    objF2 = new androidx.compose.material3.internal.l(localeA);
                                    c1086gP.E(objF2);
                                }
                                final androidx.compose.material3.internal.k kVar = (androidx.compose.material3.internal.k) objF2;
                                c1086gP.L(255587712);
                                if (z12) {
                                    composableLambdaImplB = androidx.compose.runtime.internal.a.b(1982226759, new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.material3.DatePickerKt$DatePicker$4
                                        {
                                            super(2);
                                        }

                                        @Override // Ia.p
                                        public final p293xa.r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                                            InterfaceC1084f interfaceC1084f3 = interfaceC1084f2;
                                            if ((num.intValue() & 3) == 2 && interfaceC1084f3.s()) {
                                                interfaceC1084f3.w();
                                            } else {
                                                androidx.compose.ui.h hVarE = PaddingKt.e(androidx.compose.ui.h.a.f13984b, DatePickerKt.f12142d);
                                                int iB = interfaceC1067t.b();
                                                boolean zK3 = interfaceC1084f3.K(interfaceC1067t);
                                                final InterfaceC1067t interfaceC1067t2 = interfaceC1067t;
                                                Object objF3 = interfaceC1084f3.f();
                                                if (zK3 || objF3 == InterfaceC1084f.a.f12980a) {
                                                    objF3 = new Ia.l<C1072y, p293xa.r>() { // from class: androidx.compose.material3.DatePickerKt$DatePicker$4$1$1
                                                        {
                                                            super(1);
                                                        }

                                                        @Override // Ia.l
                                                        public final p293xa.r invoke(C1072y c1072y) {
                                                            interfaceC1067t2.a(c1072y.f12768a);
                                                            return p293xa.r.f47939a;
                                                        }
                                                    };
                                                    interfaceC1084f3.E(objF3);
                                                }
                                                DatePickerKt.e(hVarE, iB, (Ia.l) objF3, interfaceC1084f3, 6);
                                            }
                                            return p293xa.r.f47939a;
                                        }
                                    }, c1086gP);
                                } else {
                                    composableLambdaImplB = null;
                                }
                                c1086gP.T(false);
                                int i23 = ((i12 >> 3) & 14) | 14155776;
                                int i24 = i12 >> 6;
                                a(hVar3, pVar3, pVar4, composableLambdaImplB, c1064pC, TypographyKt.a(C0609d.f1247p, c1086gP), C0609d.f1245n, androidx.compose.runtime.internal.a.b(-1840727866, new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.material3.DatePickerKt$DatePicker$5
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
                                            Long lF = interfaceC1067t.f();
                                            long jE = interfaceC1067t.e();
                                            int iB = interfaceC1067t.b();
                                            boolean zK3 = interfaceC1084f3.K(interfaceC1067t);
                                            final InterfaceC1067t interfaceC1067t2 = interfaceC1067t;
                                            Object objF3 = interfaceC1084f3.f();
                                            InterfaceC1084f.a.C0153a c0153a2 = InterfaceC1084f.a.f12980a;
                                            if (zK3 || objF3 == c0153a2) {
                                                objF3 = new Ia.l<Long, p293xa.r>() { // from class: androidx.compose.material3.DatePickerKt$DatePicker$5$1$1
                                                    {
                                                        super(1);
                                                    }

                                                    @Override // Ia.l
                                                    public final p293xa.r invoke(Long l10) {
                                                        interfaceC1067t2.h(l10);
                                                        return p293xa.r.f47939a;
                                                    }
                                                };
                                                interfaceC1084f3.E(objF3);
                                            }
                                            Ia.l lVar = (Ia.l) objF3;
                                            boolean zK4 = interfaceC1084f3.K(interfaceC1067t);
                                            final InterfaceC1067t interfaceC1067t3 = interfaceC1067t;
                                            Object objF4 = interfaceC1084f3.f();
                                            if (zK4 || objF4 == c0153a2) {
                                                objF4 = new Ia.l<Long, p293xa.r>() { // from class: androidx.compose.material3.DatePickerKt$DatePicker$5$2$1
                                                    {
                                                        super(1);
                                                    }

                                                    @Override // Ia.l
                                                    public final p293xa.r invoke(Long l10) {
                                                        interfaceC1067t3.c(l10.longValue());
                                                        return p293xa.r.f47939a;
                                                    }
                                                };
                                                interfaceC1084f3.E(objF4);
                                            }
                                            DatePickerKt.k(lF, jE, iB, lVar, (Ia.l) objF4, kVar, interfaceC1067t.g(), interfaceC1065q2, interfaceC1067t.d(), c1064pC, interfaceC1084f3, 0);
                                        }
                                        return p293xa.r.f47939a;
                                    }
                                }, c1086gP), c1086gP, i23 | (i24 & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) | (i24 & 896) | (i24 & 57344));
                                pVar5 = pVar4;
                                pVar6 = pVar3;
                                interfaceC1065q3 = interfaceC1065q2;
                                hVar4 = hVar3;
                            } else {
                                c1086gP.w();
                                if ((i11 & 4) != 0) {
                                    i12 &= -897;
                                }
                                if ((i11 & 64) != 0) {
                                    i12 &= -3670017;
                                }
                            }
                            interfaceC1065q2 = interfaceC1065q4;
                            hVar3 = hVar2;
                            pVar3 = pVarB;
                            pVar4 = pVarB2;
                            z12 = z11;
                            c1064pC = c1064p2;
                            c1086gP.U();
                            localeA = C1053h.a(c1086gP);
                            zK = c1086gP.K(localeA);
                            objF2 = c1086gP.f();
                            if (zK) {
                                objF2 = new androidx.compose.material3.internal.l(localeA);
                                c1086gP.E(objF2);
                            } else {
                                objF2 = new androidx.compose.material3.internal.l(localeA);
                                c1086gP.E(objF2);
                            }
                            final androidx.compose.material3.internal.k kVar2 = (androidx.compose.material3.internal.k) objF2;
                            c1086gP.L(255587712);
                            if (z12) {
                                composableLambdaImplB = androidx.compose.runtime.internal.a.b(1982226759, new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.material3.DatePickerKt$DatePicker$4
                                    {
                                        super(2);
                                    }

                                    @Override // Ia.p
                                    public final p293xa.r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                                        InterfaceC1084f interfaceC1084f3 = interfaceC1084f2;
                                        if ((num.intValue() & 3) == 2 && interfaceC1084f3.s()) {
                                            interfaceC1084f3.w();
                                        } else {
                                            androidx.compose.ui.h hVarE = PaddingKt.e(androidx.compose.ui.h.a.f13984b, DatePickerKt.f12142d);
                                            int iB = interfaceC1067t.b();
                                            boolean zK3 = interfaceC1084f3.K(interfaceC1067t);
                                            final InterfaceC1067t interfaceC1067t2 = interfaceC1067t;
                                            Object objF3 = interfaceC1084f3.f();
                                            if (zK3 || objF3 == InterfaceC1084f.a.f12980a) {
                                                objF3 = new Ia.l<C1072y, p293xa.r>() { // from class: androidx.compose.material3.DatePickerKt$DatePicker$4$1$1
                                                    {
                                                        super(1);
                                                    }

                                                    @Override // Ia.l
                                                    public final p293xa.r invoke(C1072y c1072y) {
                                                        interfaceC1067t2.a(c1072y.f12768a);
                                                        return p293xa.r.f47939a;
                                                    }
                                                };
                                                interfaceC1084f3.E(objF3);
                                            }
                                            DatePickerKt.e(hVarE, iB, (Ia.l) objF3, interfaceC1084f3, 6);
                                        }
                                        return p293xa.r.f47939a;
                                    }
                                }, c1086gP);
                            } else {
                                composableLambdaImplB = null;
                            }
                            c1086gP.T(false);
                            int i25 = ((i12 >> 3) & 14) | 14155776;
                            int i26 = i12 >> 6;
                            a(hVar3, pVar3, pVar4, composableLambdaImplB, c1064pC, TypographyKt.a(C0609d.f1247p, c1086gP), C0609d.f1245n, androidx.compose.runtime.internal.a.b(-1840727866, new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.material3.DatePickerKt$DatePicker$5
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
                                        Long lF = interfaceC1067t.f();
                                        long jE = interfaceC1067t.e();
                                        int iB = interfaceC1067t.b();
                                        boolean zK3 = interfaceC1084f3.K(interfaceC1067t);
                                        final InterfaceC1067t interfaceC1067t2 = interfaceC1067t;
                                        Object objF3 = interfaceC1084f3.f();
                                        InterfaceC1084f.a.C0153a c0153a2 = InterfaceC1084f.a.f12980a;
                                        if (zK3 || objF3 == c0153a2) {
                                            objF3 = new Ia.l<Long, p293xa.r>() { // from class: androidx.compose.material3.DatePickerKt$DatePicker$5$1$1
                                                {
                                                    super(1);
                                                }

                                                @Override // Ia.l
                                                public final p293xa.r invoke(Long l10) {
                                                    interfaceC1067t2.h(l10);
                                                    return p293xa.r.f47939a;
                                                }
                                            };
                                            interfaceC1084f3.E(objF3);
                                        }
                                        Ia.l lVar = (Ia.l) objF3;
                                        boolean zK4 = interfaceC1084f3.K(interfaceC1067t);
                                        final InterfaceC1067t interfaceC1067t3 = interfaceC1067t;
                                        Object objF4 = interfaceC1084f3.f();
                                        if (zK4 || objF4 == c0153a2) {
                                            objF4 = new Ia.l<Long, p293xa.r>() { // from class: androidx.compose.material3.DatePickerKt$DatePicker$5$2$1
                                                {
                                                    super(1);
                                                }

                                                @Override // Ia.l
                                                public final p293xa.r invoke(Long l10) {
                                                    interfaceC1067t3.c(l10.longValue());
                                                    return p293xa.r.f47939a;
                                                }
                                            };
                                            interfaceC1084f3.E(objF4);
                                        }
                                        DatePickerKt.k(lF, jE, iB, lVar, (Ia.l) objF4, kVar2, interfaceC1067t.g(), interfaceC1065q2, interfaceC1067t.d(), c1064pC, interfaceC1084f3, 0);
                                    }
                                    return p293xa.r.f47939a;
                                }
                            }, c1086gP), c1086gP, i25 | (i26 & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) | (i26 & 896) | (i26 & 57344));
                            pVar5 = pVar4;
                            pVar6 = pVar3;
                            interfaceC1065q3 = interfaceC1065q2;
                            hVar4 = hVar3;
                        } else {
                            c1086gP.w();
                            interfaceC1065q3 = interfaceC1065q4;
                            hVar4 = hVar2;
                            pVar6 = pVarB;
                            pVar5 = pVarB2;
                            z12 = z11;
                            c1064pC = c1064p2;
                        }
                        c1105p0V = c1086gP.V();
                        if (c1105p0V != null) {
                            final boolean z13 = z12;
                            final C1064p c1064p3 = c1064pC;
                            c1105p0V.f13109d = new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.material3.DatePickerKt$DatePicker$6
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                /* JADX WARN: Multi-variable type inference failed */
                                {
                                    super(2);
                                }

                                @Override // Ia.p
                                public final p293xa.r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                                    num.intValue();
                                    DatePickerKt.b(interfaceC1067t, hVar4, interfaceC1065q3, pVar6, pVar5, z13, c1064p3, interfaceC1084f2, L4.b.l(i10 | 1), i11);
                                    return p293xa.r.f47939a;
                                }
                            };
                        }
                    }
                    i12 |= 196608;
                    z11 = z10;
                    if ((1572864 & i10) == 0) {
                        if ((i11 & 64) == 0) {
                            c1064p2 = c1064p;
                            if (c1086gP.K(c1064p2)) {
                            }
                            i12 |= i22;
                        } else {
                            c1064p2 = c1064p;
                        }
                        i12 |= i22;
                    } else {
                        c1064p2 = c1064p;
                    }
                    if ((i12 & 599187) == 599186) {
                        c1086gP.r0();
                        i19 = i10 & 1;
                        c0153a = InterfaceC1084f.a.f12980a;
                        if (i19 != 0) {
                            if (i21 != 0) {
                                hVar2 = androidx.compose.ui.h.a.f13984b;
                            }
                            if ((i11 & 4) != 0) {
                                objF = c1086gP.f();
                                if (objF == c0153a) {
                                    DatePickerDefaults datePickerDefaults3 = DatePickerDefaults.f12132a;
                                    objF = new r("yMMMM", "yMMMd", "yMMMMEEEEd");
                                    c1086gP.E(objF);
                                }
                                interfaceC1065q4 = (InterfaceC1065q) objF;
                                i12 &= -897;
                            }
                            if (i13 != 0) {
                                pVarB = androidx.compose.runtime.internal.a.b(-1504998463, new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.material3.DatePickerKt$DatePicker$2
                                    {
                                        super(2);
                                    }

                                    @Override // Ia.p
                                    public final p293xa.r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                                        InterfaceC1084f interfaceC1084f3 = interfaceC1084f2;
                                        if ((num.intValue() & 3) == 2 && interfaceC1084f3.s()) {
                                            interfaceC1084f3.w();
                                        } else {
                                            DatePickerDefaults.f12132a.b(PaddingKt.e(androidx.compose.ui.h.a.f13984b, DatePickerKt.f12143e), interfaceC1067t.b(), 432, interfaceC1084f3, 0);
                                        }
                                        return p293xa.r.f47939a;
                                    }
                                }, c1086gP);
                            }
                            if (i15 != 0) {
                                pVarB2 = androidx.compose.runtime.internal.a.b(-1780043561, new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.material3.DatePickerKt$DatePicker$3
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
                                            DatePickerDefaults.f12132a.a(interfaceC1067t.f(), interfaceC1067t.b(), interfaceC1065q4, PaddingKt.e(androidx.compose.ui.h.a.f13984b, DatePickerKt.f12144f), interfaceC1084f3, 27648, 0);
                                        }
                                        return p293xa.r.f47939a;
                                    }
                                }, c1086gP);
                            }
                            if (i17 != 0) {
                                z11 = true;
                            }
                            if ((i11 & 64) != 0) {
                                DatePickerDefaults datePickerDefaults4 = DatePickerDefaults.f12132a;
                                i12 &= -3670017;
                                c1064pC = DatePickerDefaults.c(c1086gP);
                                pVar3 = pVarB;
                                pVar4 = pVarB2;
                                z12 = z11;
                                interfaceC1065q2 = interfaceC1065q4;
                                hVar3 = hVar2;
                            } else {
                                interfaceC1065q2 = interfaceC1065q4;
                                hVar3 = hVar2;
                                pVar3 = pVarB;
                                pVar4 = pVarB2;
                                z12 = z11;
                                c1064pC = c1064p2;
                            }
                        } else {
                            if (i21 != 0) {
                                hVar2 = androidx.compose.ui.h.a.f13984b;
                            }
                            if ((i11 & 4) != 0) {
                                objF = c1086gP.f();
                                if (objF == c0153a) {
                                    DatePickerDefaults datePickerDefaults5 = DatePickerDefaults.f12132a;
                                    objF = new r("yMMMM", "yMMMd", "yMMMMEEEEd");
                                    c1086gP.E(objF);
                                }
                                interfaceC1065q4 = (InterfaceC1065q) objF;
                                i12 &= -897;
                            }
                            if (i13 != 0) {
                                pVarB = androidx.compose.runtime.internal.a.b(-1504998463, new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.material3.DatePickerKt$DatePicker$2
                                    {
                                        super(2);
                                    }

                                    @Override // Ia.p
                                    public final p293xa.r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                                        InterfaceC1084f interfaceC1084f3 = interfaceC1084f2;
                                        if ((num.intValue() & 3) == 2 && interfaceC1084f3.s()) {
                                            interfaceC1084f3.w();
                                        } else {
                                            DatePickerDefaults.f12132a.b(PaddingKt.e(androidx.compose.ui.h.a.f13984b, DatePickerKt.f12143e), interfaceC1067t.b(), 432, interfaceC1084f3, 0);
                                        }
                                        return p293xa.r.f47939a;
                                    }
                                }, c1086gP);
                            }
                            if (i15 != 0) {
                                pVarB2 = androidx.compose.runtime.internal.a.b(-1780043561, new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.material3.DatePickerKt$DatePicker$3
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
                                            DatePickerDefaults.f12132a.a(interfaceC1067t.f(), interfaceC1067t.b(), interfaceC1065q4, PaddingKt.e(androidx.compose.ui.h.a.f13984b, DatePickerKt.f12144f), interfaceC1084f3, 27648, 0);
                                        }
                                        return p293xa.r.f47939a;
                                    }
                                }, c1086gP);
                            }
                            if (i17 != 0) {
                                z11 = true;
                            }
                            if ((i11 & 64) != 0) {
                                DatePickerDefaults datePickerDefaults6 = DatePickerDefaults.f12132a;
                                i12 &= -3670017;
                                c1064pC = DatePickerDefaults.c(c1086gP);
                                pVar3 = pVarB;
                                pVar4 = pVarB2;
                                z12 = z11;
                                interfaceC1065q2 = interfaceC1065q4;
                                hVar3 = hVar2;
                            } else {
                                interfaceC1065q2 = interfaceC1065q4;
                                hVar3 = hVar2;
                                pVar3 = pVarB;
                                pVar4 = pVarB2;
                                z12 = z11;
                                c1064pC = c1064p2;
                            }
                        }
                        c1086gP.U();
                        localeA = C1053h.a(c1086gP);
                        zK = c1086gP.K(localeA);
                        objF2 = c1086gP.f();
                        if (zK) {
                            objF2 = new androidx.compose.material3.internal.l(localeA);
                            c1086gP.E(objF2);
                        } else {
                            objF2 = new androidx.compose.material3.internal.l(localeA);
                            c1086gP.E(objF2);
                        }
                        final androidx.compose.material3.internal.k kVar3 = (androidx.compose.material3.internal.k) objF2;
                        c1086gP.L(255587712);
                        if (z12) {
                            composableLambdaImplB = androidx.compose.runtime.internal.a.b(1982226759, new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.material3.DatePickerKt$DatePicker$4
                                {
                                    super(2);
                                }

                                @Override // Ia.p
                                public final p293xa.r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                                    InterfaceC1084f interfaceC1084f3 = interfaceC1084f2;
                                    if ((num.intValue() & 3) == 2 && interfaceC1084f3.s()) {
                                        interfaceC1084f3.w();
                                    } else {
                                        androidx.compose.ui.h hVarE = PaddingKt.e(androidx.compose.ui.h.a.f13984b, DatePickerKt.f12142d);
                                        int iB = interfaceC1067t.b();
                                        boolean zK3 = interfaceC1084f3.K(interfaceC1067t);
                                        final InterfaceC1067t interfaceC1067t2 = interfaceC1067t;
                                        Object objF3 = interfaceC1084f3.f();
                                        if (zK3 || objF3 == InterfaceC1084f.a.f12980a) {
                                            objF3 = new Ia.l<C1072y, p293xa.r>() { // from class: androidx.compose.material3.DatePickerKt$DatePicker$4$1$1
                                                {
                                                    super(1);
                                                }

                                                @Override // Ia.l
                                                public final p293xa.r invoke(C1072y c1072y) {
                                                    interfaceC1067t2.a(c1072y.f12768a);
                                                    return p293xa.r.f47939a;
                                                }
                                            };
                                            interfaceC1084f3.E(objF3);
                                        }
                                        DatePickerKt.e(hVarE, iB, (Ia.l) objF3, interfaceC1084f3, 6);
                                    }
                                    return p293xa.r.f47939a;
                                }
                            }, c1086gP);
                        } else {
                            composableLambdaImplB = null;
                        }
                        c1086gP.T(false);
                        int i27 = ((i12 >> 3) & 14) | 14155776;
                        int i28 = i12 >> 6;
                        a(hVar3, pVar3, pVar4, composableLambdaImplB, c1064pC, TypographyKt.a(C0609d.f1247p, c1086gP), C0609d.f1245n, androidx.compose.runtime.internal.a.b(-1840727866, new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.material3.DatePickerKt$DatePicker$5
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
                                    Long lF = interfaceC1067t.f();
                                    long jE = interfaceC1067t.e();
                                    int iB = interfaceC1067t.b();
                                    boolean zK3 = interfaceC1084f3.K(interfaceC1067t);
                                    final InterfaceC1067t interfaceC1067t2 = interfaceC1067t;
                                    Object objF3 = interfaceC1084f3.f();
                                    InterfaceC1084f.a.C0153a c0153a2 = InterfaceC1084f.a.f12980a;
                                    if (zK3 || objF3 == c0153a2) {
                                        objF3 = new Ia.l<Long, p293xa.r>() { // from class: androidx.compose.material3.DatePickerKt$DatePicker$5$1$1
                                            {
                                                super(1);
                                            }

                                            @Override // Ia.l
                                            public final p293xa.r invoke(Long l10) {
                                                interfaceC1067t2.h(l10);
                                                return p293xa.r.f47939a;
                                            }
                                        };
                                        interfaceC1084f3.E(objF3);
                                    }
                                    Ia.l lVar = (Ia.l) objF3;
                                    boolean zK4 = interfaceC1084f3.K(interfaceC1067t);
                                    final InterfaceC1067t interfaceC1067t3 = interfaceC1067t;
                                    Object objF4 = interfaceC1084f3.f();
                                    if (zK4 || objF4 == c0153a2) {
                                        objF4 = new Ia.l<Long, p293xa.r>() { // from class: androidx.compose.material3.DatePickerKt$DatePicker$5$2$1
                                            {
                                                super(1);
                                            }

                                            @Override // Ia.l
                                            public final p293xa.r invoke(Long l10) {
                                                interfaceC1067t3.c(l10.longValue());
                                                return p293xa.r.f47939a;
                                            }
                                        };
                                        interfaceC1084f3.E(objF4);
                                    }
                                    DatePickerKt.k(lF, jE, iB, lVar, (Ia.l) objF4, kVar3, interfaceC1067t.g(), interfaceC1065q2, interfaceC1067t.d(), c1064pC, interfaceC1084f3, 0);
                                }
                                return p293xa.r.f47939a;
                            }
                        }, c1086gP), c1086gP, i27 | (i28 & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) | (i28 & 896) | (i28 & 57344));
                        pVar5 = pVar4;
                        pVar6 = pVar3;
                        interfaceC1065q3 = interfaceC1065q2;
                        hVar4 = hVar3;
                    } else {
                        c1086gP.r0();
                        i19 = i10 & 1;
                        c0153a = InterfaceC1084f.a.f12980a;
                        if (i19 != 0) {
                            if (i21 != 0) {
                                hVar2 = androidx.compose.ui.h.a.f13984b;
                            }
                            if ((i11 & 4) != 0) {
                                objF = c1086gP.f();
                                if (objF == c0153a) {
                                    DatePickerDefaults datePickerDefaults7 = DatePickerDefaults.f12132a;
                                    objF = new r("yMMMM", "yMMMd", "yMMMMEEEEd");
                                    c1086gP.E(objF);
                                }
                                interfaceC1065q4 = (InterfaceC1065q) objF;
                                i12 &= -897;
                            }
                            if (i13 != 0) {
                                pVarB = androidx.compose.runtime.internal.a.b(-1504998463, new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.material3.DatePickerKt$DatePicker$2
                                    {
                                        super(2);
                                    }

                                    @Override // Ia.p
                                    public final p293xa.r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                                        InterfaceC1084f interfaceC1084f3 = interfaceC1084f2;
                                        if ((num.intValue() & 3) == 2 && interfaceC1084f3.s()) {
                                            interfaceC1084f3.w();
                                        } else {
                                            DatePickerDefaults.f12132a.b(PaddingKt.e(androidx.compose.ui.h.a.f13984b, DatePickerKt.f12143e), interfaceC1067t.b(), 432, interfaceC1084f3, 0);
                                        }
                                        return p293xa.r.f47939a;
                                    }
                                }, c1086gP);
                            }
                            if (i15 != 0) {
                                pVarB2 = androidx.compose.runtime.internal.a.b(-1780043561, new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.material3.DatePickerKt$DatePicker$3
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
                                            DatePickerDefaults.f12132a.a(interfaceC1067t.f(), interfaceC1067t.b(), interfaceC1065q4, PaddingKt.e(androidx.compose.ui.h.a.f13984b, DatePickerKt.f12144f), interfaceC1084f3, 27648, 0);
                                        }
                                        return p293xa.r.f47939a;
                                    }
                                }, c1086gP);
                            }
                            if (i17 != 0) {
                                z11 = true;
                            }
                            if ((i11 & 64) != 0) {
                                DatePickerDefaults datePickerDefaults8 = DatePickerDefaults.f12132a;
                                i12 &= -3670017;
                                c1064pC = DatePickerDefaults.c(c1086gP);
                                pVar3 = pVarB;
                                pVar4 = pVarB2;
                                z12 = z11;
                                interfaceC1065q2 = interfaceC1065q4;
                                hVar3 = hVar2;
                            } else {
                                interfaceC1065q2 = interfaceC1065q4;
                                hVar3 = hVar2;
                                pVar3 = pVarB;
                                pVar4 = pVarB2;
                                z12 = z11;
                                c1064pC = c1064p2;
                            }
                        } else {
                            if (i21 != 0) {
                                hVar2 = androidx.compose.ui.h.a.f13984b;
                            }
                            if ((i11 & 4) != 0) {
                                objF = c1086gP.f();
                                if (objF == c0153a) {
                                    DatePickerDefaults datePickerDefaults9 = DatePickerDefaults.f12132a;
                                    objF = new r("yMMMM", "yMMMd", "yMMMMEEEEd");
                                    c1086gP.E(objF);
                                }
                                interfaceC1065q4 = (InterfaceC1065q) objF;
                                i12 &= -897;
                            }
                            if (i13 != 0) {
                                pVarB = androidx.compose.runtime.internal.a.b(-1504998463, new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.material3.DatePickerKt$DatePicker$2
                                    {
                                        super(2);
                                    }

                                    @Override // Ia.p
                                    public final p293xa.r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                                        InterfaceC1084f interfaceC1084f3 = interfaceC1084f2;
                                        if ((num.intValue() & 3) == 2 && interfaceC1084f3.s()) {
                                            interfaceC1084f3.w();
                                        } else {
                                            DatePickerDefaults.f12132a.b(PaddingKt.e(androidx.compose.ui.h.a.f13984b, DatePickerKt.f12143e), interfaceC1067t.b(), 432, interfaceC1084f3, 0);
                                        }
                                        return p293xa.r.f47939a;
                                    }
                                }, c1086gP);
                            }
                            if (i15 != 0) {
                                pVarB2 = androidx.compose.runtime.internal.a.b(-1780043561, new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.material3.DatePickerKt$DatePicker$3
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
                                            DatePickerDefaults.f12132a.a(interfaceC1067t.f(), interfaceC1067t.b(), interfaceC1065q4, PaddingKt.e(androidx.compose.ui.h.a.f13984b, DatePickerKt.f12144f), interfaceC1084f3, 27648, 0);
                                        }
                                        return p293xa.r.f47939a;
                                    }
                                }, c1086gP);
                            }
                            if (i17 != 0) {
                                z11 = true;
                            }
                            if ((i11 & 64) != 0) {
                                DatePickerDefaults datePickerDefaults10 = DatePickerDefaults.f12132a;
                                i12 &= -3670017;
                                c1064pC = DatePickerDefaults.c(c1086gP);
                                pVar3 = pVarB;
                                pVar4 = pVarB2;
                                z12 = z11;
                                interfaceC1065q2 = interfaceC1065q4;
                                hVar3 = hVar2;
                            } else {
                                interfaceC1065q2 = interfaceC1065q4;
                                hVar3 = hVar2;
                                pVar3 = pVarB;
                                pVar4 = pVarB2;
                                z12 = z11;
                                c1064pC = c1064p2;
                            }
                        }
                        c1086gP.U();
                        localeA = C1053h.a(c1086gP);
                        zK = c1086gP.K(localeA);
                        objF2 = c1086gP.f();
                        if (zK) {
                            objF2 = new androidx.compose.material3.internal.l(localeA);
                            c1086gP.E(objF2);
                        } else {
                            objF2 = new androidx.compose.material3.internal.l(localeA);
                            c1086gP.E(objF2);
                        }
                        final androidx.compose.material3.internal.k kVar4 = (androidx.compose.material3.internal.k) objF2;
                        c1086gP.L(255587712);
                        if (z12) {
                            composableLambdaImplB = androidx.compose.runtime.internal.a.b(1982226759, new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.material3.DatePickerKt$DatePicker$4
                                {
                                    super(2);
                                }

                                @Override // Ia.p
                                public final p293xa.r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                                    InterfaceC1084f interfaceC1084f3 = interfaceC1084f2;
                                    if ((num.intValue() & 3) == 2 && interfaceC1084f3.s()) {
                                        interfaceC1084f3.w();
                                    } else {
                                        androidx.compose.ui.h hVarE = PaddingKt.e(androidx.compose.ui.h.a.f13984b, DatePickerKt.f12142d);
                                        int iB = interfaceC1067t.b();
                                        boolean zK3 = interfaceC1084f3.K(interfaceC1067t);
                                        final InterfaceC1067t interfaceC1067t2 = interfaceC1067t;
                                        Object objF3 = interfaceC1084f3.f();
                                        if (zK3 || objF3 == InterfaceC1084f.a.f12980a) {
                                            objF3 = new Ia.l<C1072y, p293xa.r>() { // from class: androidx.compose.material3.DatePickerKt$DatePicker$4$1$1
                                                {
                                                    super(1);
                                                }

                                                @Override // Ia.l
                                                public final p293xa.r invoke(C1072y c1072y) {
                                                    interfaceC1067t2.a(c1072y.f12768a);
                                                    return p293xa.r.f47939a;
                                                }
                                            };
                                            interfaceC1084f3.E(objF3);
                                        }
                                        DatePickerKt.e(hVarE, iB, (Ia.l) objF3, interfaceC1084f3, 6);
                                    }
                                    return p293xa.r.f47939a;
                                }
                            }, c1086gP);
                        } else {
                            composableLambdaImplB = null;
                        }
                        c1086gP.T(false);
                        int i29 = ((i12 >> 3) & 14) | 14155776;
                        int i210 = i12 >> 6;
                        a(hVar3, pVar3, pVar4, composableLambdaImplB, c1064pC, TypographyKt.a(C0609d.f1247p, c1086gP), C0609d.f1245n, androidx.compose.runtime.internal.a.b(-1840727866, new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.material3.DatePickerKt$DatePicker$5
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
                                    Long lF = interfaceC1067t.f();
                                    long jE = interfaceC1067t.e();
                                    int iB = interfaceC1067t.b();
                                    boolean zK3 = interfaceC1084f3.K(interfaceC1067t);
                                    final InterfaceC1067t interfaceC1067t2 = interfaceC1067t;
                                    Object objF3 = interfaceC1084f3.f();
                                    InterfaceC1084f.a.C0153a c0153a2 = InterfaceC1084f.a.f12980a;
                                    if (zK3 || objF3 == c0153a2) {
                                        objF3 = new Ia.l<Long, p293xa.r>() { // from class: androidx.compose.material3.DatePickerKt$DatePicker$5$1$1
                                            {
                                                super(1);
                                            }

                                            @Override // Ia.l
                                            public final p293xa.r invoke(Long l10) {
                                                interfaceC1067t2.h(l10);
                                                return p293xa.r.f47939a;
                                            }
                                        };
                                        interfaceC1084f3.E(objF3);
                                    }
                                    Ia.l lVar = (Ia.l) objF3;
                                    boolean zK4 = interfaceC1084f3.K(interfaceC1067t);
                                    final InterfaceC1067t interfaceC1067t3 = interfaceC1067t;
                                    Object objF4 = interfaceC1084f3.f();
                                    if (zK4 || objF4 == c0153a2) {
                                        objF4 = new Ia.l<Long, p293xa.r>() { // from class: androidx.compose.material3.DatePickerKt$DatePicker$5$2$1
                                            {
                                                super(1);
                                            }

                                            @Override // Ia.l
                                            public final p293xa.r invoke(Long l10) {
                                                interfaceC1067t3.c(l10.longValue());
                                                return p293xa.r.f47939a;
                                            }
                                        };
                                        interfaceC1084f3.E(objF4);
                                    }
                                    DatePickerKt.k(lF, jE, iB, lVar, (Ia.l) objF4, kVar4, interfaceC1067t.g(), interfaceC1065q2, interfaceC1067t.d(), c1064pC, interfaceC1084f3, 0);
                                }
                                return p293xa.r.f47939a;
                            }
                        }, c1086gP), c1086gP, i29 | (i210 & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) | (i210 & 896) | (i210 & 57344));
                        pVar5 = pVar4;
                        pVar6 = pVar3;
                        interfaceC1065q3 = interfaceC1065q2;
                        hVar4 = hVar3;
                    }
                    c1105p0V = c1086gP.V();
                    if (c1105p0V != null) {
                        final boolean z14 = z12;
                        final C1064p c1064p4 = c1064pC;
                        c1105p0V.f13109d = new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.material3.DatePickerKt$DatePicker$6
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            /* JADX WARN: Multi-variable type inference failed */
                            {
                                super(2);
                            }

                            @Override // Ia.p
                            public final p293xa.r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                                num.intValue();
                                DatePickerKt.b(interfaceC1067t, hVar4, interfaceC1065q3, pVar6, pVar5, z14, c1064p4, interfaceC1084f2, L4.b.l(i10 | 1), i11);
                                return p293xa.r.f47939a;
                            }
                        };
                    }
                }
                i12 |= 24576;
                pVarB2 = pVar2;
                i17 = i11 & 32;
                if (i17 != 0) {
                    if ((196608 & i10) == 0) {
                        z11 = z10;
                        if (c1086gP.c(z11)) {
                            i18 = 131072;
                        } else {
                            i18 = 65536;
                        }
                        i12 |= i18;
                    }
                    if ((1572864 & i10) == 0) {
                        if ((i11 & 64) == 0) {
                            c1064p2 = c1064p;
                            if (c1086gP.K(c1064p2)) {
                            }
                            i12 |= i22;
                        } else {
                            c1064p2 = c1064p;
                        }
                        i12 |= i22;
                    } else {
                        c1064p2 = c1064p;
                    }
                    if ((i12 & 599187) == 599186) {
                        c1086gP.r0();
                        i19 = i10 & 1;
                        c0153a = InterfaceC1084f.a.f12980a;
                        if (i19 != 0) {
                            if (i21 != 0) {
                                hVar2 = androidx.compose.ui.h.a.f13984b;
                            }
                            if ((i11 & 4) != 0) {
                                objF = c1086gP.f();
                                if (objF == c0153a) {
                                    DatePickerDefaults datePickerDefaults11 = DatePickerDefaults.f12132a;
                                    objF = new r("yMMMM", "yMMMd", "yMMMMEEEEd");
                                    c1086gP.E(objF);
                                }
                                interfaceC1065q4 = (InterfaceC1065q) objF;
                                i12 &= -897;
                            }
                            if (i13 != 0) {
                                pVarB = androidx.compose.runtime.internal.a.b(-1504998463, new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.material3.DatePickerKt$DatePicker$2
                                    {
                                        super(2);
                                    }

                                    @Override // Ia.p
                                    public final p293xa.r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                                        InterfaceC1084f interfaceC1084f3 = interfaceC1084f2;
                                        if ((num.intValue() & 3) == 2 && interfaceC1084f3.s()) {
                                            interfaceC1084f3.w();
                                        } else {
                                            DatePickerDefaults.f12132a.b(PaddingKt.e(androidx.compose.ui.h.a.f13984b, DatePickerKt.f12143e), interfaceC1067t.b(), 432, interfaceC1084f3, 0);
                                        }
                                        return p293xa.r.f47939a;
                                    }
                                }, c1086gP);
                            }
                            if (i15 != 0) {
                                pVarB2 = androidx.compose.runtime.internal.a.b(-1780043561, new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.material3.DatePickerKt$DatePicker$3
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
                                            DatePickerDefaults.f12132a.a(interfaceC1067t.f(), interfaceC1067t.b(), interfaceC1065q4, PaddingKt.e(androidx.compose.ui.h.a.f13984b, DatePickerKt.f12144f), interfaceC1084f3, 27648, 0);
                                        }
                                        return p293xa.r.f47939a;
                                    }
                                }, c1086gP);
                            }
                            if (i17 != 0) {
                                z11 = true;
                            }
                            if ((i11 & 64) != 0) {
                                DatePickerDefaults datePickerDefaults12 = DatePickerDefaults.f12132a;
                                i12 &= -3670017;
                                c1064pC = DatePickerDefaults.c(c1086gP);
                                pVar3 = pVarB;
                                pVar4 = pVarB2;
                                z12 = z11;
                                interfaceC1065q2 = interfaceC1065q4;
                                hVar3 = hVar2;
                            } else {
                                interfaceC1065q2 = interfaceC1065q4;
                                hVar3 = hVar2;
                                pVar3 = pVarB;
                                pVar4 = pVarB2;
                                z12 = z11;
                                c1064pC = c1064p2;
                            }
                        } else {
                            if (i21 != 0) {
                                hVar2 = androidx.compose.ui.h.a.f13984b;
                            }
                            if ((i11 & 4) != 0) {
                                objF = c1086gP.f();
                                if (objF == c0153a) {
                                    DatePickerDefaults datePickerDefaults13 = DatePickerDefaults.f12132a;
                                    objF = new r("yMMMM", "yMMMd", "yMMMMEEEEd");
                                    c1086gP.E(objF);
                                }
                                interfaceC1065q4 = (InterfaceC1065q) objF;
                                i12 &= -897;
                            }
                            if (i13 != 0) {
                                pVarB = androidx.compose.runtime.internal.a.b(-1504998463, new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.material3.DatePickerKt$DatePicker$2
                                    {
                                        super(2);
                                    }

                                    @Override // Ia.p
                                    public final p293xa.r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                                        InterfaceC1084f interfaceC1084f3 = interfaceC1084f2;
                                        if ((num.intValue() & 3) == 2 && interfaceC1084f3.s()) {
                                            interfaceC1084f3.w();
                                        } else {
                                            DatePickerDefaults.f12132a.b(PaddingKt.e(androidx.compose.ui.h.a.f13984b, DatePickerKt.f12143e), interfaceC1067t.b(), 432, interfaceC1084f3, 0);
                                        }
                                        return p293xa.r.f47939a;
                                    }
                                }, c1086gP);
                            }
                            if (i15 != 0) {
                                pVarB2 = androidx.compose.runtime.internal.a.b(-1780043561, new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.material3.DatePickerKt$DatePicker$3
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
                                            DatePickerDefaults.f12132a.a(interfaceC1067t.f(), interfaceC1067t.b(), interfaceC1065q4, PaddingKt.e(androidx.compose.ui.h.a.f13984b, DatePickerKt.f12144f), interfaceC1084f3, 27648, 0);
                                        }
                                        return p293xa.r.f47939a;
                                    }
                                }, c1086gP);
                            }
                            if (i17 != 0) {
                                z11 = true;
                            }
                            if ((i11 & 64) != 0) {
                                DatePickerDefaults datePickerDefaults14 = DatePickerDefaults.f12132a;
                                i12 &= -3670017;
                                c1064pC = DatePickerDefaults.c(c1086gP);
                                pVar3 = pVarB;
                                pVar4 = pVarB2;
                                z12 = z11;
                                interfaceC1065q2 = interfaceC1065q4;
                                hVar3 = hVar2;
                            } else {
                                interfaceC1065q2 = interfaceC1065q4;
                                hVar3 = hVar2;
                                pVar3 = pVarB;
                                pVar4 = pVarB2;
                                z12 = z11;
                                c1064pC = c1064p2;
                            }
                        }
                        c1086gP.U();
                        localeA = C1053h.a(c1086gP);
                        zK = c1086gP.K(localeA);
                        objF2 = c1086gP.f();
                        if (zK) {
                            objF2 = new androidx.compose.material3.internal.l(localeA);
                            c1086gP.E(objF2);
                        } else {
                            objF2 = new androidx.compose.material3.internal.l(localeA);
                            c1086gP.E(objF2);
                        }
                        final androidx.compose.material3.internal.k kVar5 = (androidx.compose.material3.internal.k) objF2;
                        c1086gP.L(255587712);
                        if (z12) {
                            composableLambdaImplB = androidx.compose.runtime.internal.a.b(1982226759, new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.material3.DatePickerKt$DatePicker$4
                                {
                                    super(2);
                                }

                                @Override // Ia.p
                                public final p293xa.r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                                    InterfaceC1084f interfaceC1084f3 = interfaceC1084f2;
                                    if ((num.intValue() & 3) == 2 && interfaceC1084f3.s()) {
                                        interfaceC1084f3.w();
                                    } else {
                                        androidx.compose.ui.h hVarE = PaddingKt.e(androidx.compose.ui.h.a.f13984b, DatePickerKt.f12142d);
                                        int iB = interfaceC1067t.b();
                                        boolean zK3 = interfaceC1084f3.K(interfaceC1067t);
                                        final InterfaceC1067t interfaceC1067t2 = interfaceC1067t;
                                        Object objF3 = interfaceC1084f3.f();
                                        if (zK3 || objF3 == InterfaceC1084f.a.f12980a) {
                                            objF3 = new Ia.l<C1072y, p293xa.r>() { // from class: androidx.compose.material3.DatePickerKt$DatePicker$4$1$1
                                                {
                                                    super(1);
                                                }

                                                @Override // Ia.l
                                                public final p293xa.r invoke(C1072y c1072y) {
                                                    interfaceC1067t2.a(c1072y.f12768a);
                                                    return p293xa.r.f47939a;
                                                }
                                            };
                                            interfaceC1084f3.E(objF3);
                                        }
                                        DatePickerKt.e(hVarE, iB, (Ia.l) objF3, interfaceC1084f3, 6);
                                    }
                                    return p293xa.r.f47939a;
                                }
                            }, c1086gP);
                        } else {
                            composableLambdaImplB = null;
                        }
                        c1086gP.T(false);
                        int i211 = ((i12 >> 3) & 14) | 14155776;
                        int i212 = i12 >> 6;
                        a(hVar3, pVar3, pVar4, composableLambdaImplB, c1064pC, TypographyKt.a(C0609d.f1247p, c1086gP), C0609d.f1245n, androidx.compose.runtime.internal.a.b(-1840727866, new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.material3.DatePickerKt$DatePicker$5
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
                                    Long lF = interfaceC1067t.f();
                                    long jE = interfaceC1067t.e();
                                    int iB = interfaceC1067t.b();
                                    boolean zK3 = interfaceC1084f3.K(interfaceC1067t);
                                    final InterfaceC1067t interfaceC1067t2 = interfaceC1067t;
                                    Object objF3 = interfaceC1084f3.f();
                                    InterfaceC1084f.a.C0153a c0153a2 = InterfaceC1084f.a.f12980a;
                                    if (zK3 || objF3 == c0153a2) {
                                        objF3 = new Ia.l<Long, p293xa.r>() { // from class: androidx.compose.material3.DatePickerKt$DatePicker$5$1$1
                                            {
                                                super(1);
                                            }

                                            @Override // Ia.l
                                            public final p293xa.r invoke(Long l10) {
                                                interfaceC1067t2.h(l10);
                                                return p293xa.r.f47939a;
                                            }
                                        };
                                        interfaceC1084f3.E(objF3);
                                    }
                                    Ia.l lVar = (Ia.l) objF3;
                                    boolean zK4 = interfaceC1084f3.K(interfaceC1067t);
                                    final InterfaceC1067t interfaceC1067t3 = interfaceC1067t;
                                    Object objF4 = interfaceC1084f3.f();
                                    if (zK4 || objF4 == c0153a2) {
                                        objF4 = new Ia.l<Long, p293xa.r>() { // from class: androidx.compose.material3.DatePickerKt$DatePicker$5$2$1
                                            {
                                                super(1);
                                            }

                                            @Override // Ia.l
                                            public final p293xa.r invoke(Long l10) {
                                                interfaceC1067t3.c(l10.longValue());
                                                return p293xa.r.f47939a;
                                            }
                                        };
                                        interfaceC1084f3.E(objF4);
                                    }
                                    DatePickerKt.k(lF, jE, iB, lVar, (Ia.l) objF4, kVar5, interfaceC1067t.g(), interfaceC1065q2, interfaceC1067t.d(), c1064pC, interfaceC1084f3, 0);
                                }
                                return p293xa.r.f47939a;
                            }
                        }, c1086gP), c1086gP, i211 | (i212 & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) | (i212 & 896) | (i212 & 57344));
                        pVar5 = pVar4;
                        pVar6 = pVar3;
                        interfaceC1065q3 = interfaceC1065q2;
                        hVar4 = hVar3;
                    } else {
                        c1086gP.r0();
                        i19 = i10 & 1;
                        c0153a = InterfaceC1084f.a.f12980a;
                        if (i19 != 0) {
                            if (i21 != 0) {
                                hVar2 = androidx.compose.ui.h.a.f13984b;
                            }
                            if ((i11 & 4) != 0) {
                                objF = c1086gP.f();
                                if (objF == c0153a) {
                                    DatePickerDefaults datePickerDefaults15 = DatePickerDefaults.f12132a;
                                    objF = new r("yMMMM", "yMMMd", "yMMMMEEEEd");
                                    c1086gP.E(objF);
                                }
                                interfaceC1065q4 = (InterfaceC1065q) objF;
                                i12 &= -897;
                            }
                            if (i13 != 0) {
                                pVarB = androidx.compose.runtime.internal.a.b(-1504998463, new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.material3.DatePickerKt$DatePicker$2
                                    {
                                        super(2);
                                    }

                                    @Override // Ia.p
                                    public final p293xa.r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                                        InterfaceC1084f interfaceC1084f3 = interfaceC1084f2;
                                        if ((num.intValue() & 3) == 2 && interfaceC1084f3.s()) {
                                            interfaceC1084f3.w();
                                        } else {
                                            DatePickerDefaults.f12132a.b(PaddingKt.e(androidx.compose.ui.h.a.f13984b, DatePickerKt.f12143e), interfaceC1067t.b(), 432, interfaceC1084f3, 0);
                                        }
                                        return p293xa.r.f47939a;
                                    }
                                }, c1086gP);
                            }
                            if (i15 != 0) {
                                pVarB2 = androidx.compose.runtime.internal.a.b(-1780043561, new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.material3.DatePickerKt$DatePicker$3
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
                                            DatePickerDefaults.f12132a.a(interfaceC1067t.f(), interfaceC1067t.b(), interfaceC1065q4, PaddingKt.e(androidx.compose.ui.h.a.f13984b, DatePickerKt.f12144f), interfaceC1084f3, 27648, 0);
                                        }
                                        return p293xa.r.f47939a;
                                    }
                                }, c1086gP);
                            }
                            if (i17 != 0) {
                                z11 = true;
                            }
                            if ((i11 & 64) != 0) {
                                DatePickerDefaults datePickerDefaults16 = DatePickerDefaults.f12132a;
                                i12 &= -3670017;
                                c1064pC = DatePickerDefaults.c(c1086gP);
                                pVar3 = pVarB;
                                pVar4 = pVarB2;
                                z12 = z11;
                                interfaceC1065q2 = interfaceC1065q4;
                                hVar3 = hVar2;
                            } else {
                                interfaceC1065q2 = interfaceC1065q4;
                                hVar3 = hVar2;
                                pVar3 = pVarB;
                                pVar4 = pVarB2;
                                z12 = z11;
                                c1064pC = c1064p2;
                            }
                        } else {
                            if (i21 != 0) {
                                hVar2 = androidx.compose.ui.h.a.f13984b;
                            }
                            if ((i11 & 4) != 0) {
                                objF = c1086gP.f();
                                if (objF == c0153a) {
                                    DatePickerDefaults datePickerDefaults17 = DatePickerDefaults.f12132a;
                                    objF = new r("yMMMM", "yMMMd", "yMMMMEEEEd");
                                    c1086gP.E(objF);
                                }
                                interfaceC1065q4 = (InterfaceC1065q) objF;
                                i12 &= -897;
                            }
                            if (i13 != 0) {
                                pVarB = androidx.compose.runtime.internal.a.b(-1504998463, new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.material3.DatePickerKt$DatePicker$2
                                    {
                                        super(2);
                                    }

                                    @Override // Ia.p
                                    public final p293xa.r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                                        InterfaceC1084f interfaceC1084f3 = interfaceC1084f2;
                                        if ((num.intValue() & 3) == 2 && interfaceC1084f3.s()) {
                                            interfaceC1084f3.w();
                                        } else {
                                            DatePickerDefaults.f12132a.b(PaddingKt.e(androidx.compose.ui.h.a.f13984b, DatePickerKt.f12143e), interfaceC1067t.b(), 432, interfaceC1084f3, 0);
                                        }
                                        return p293xa.r.f47939a;
                                    }
                                }, c1086gP);
                            }
                            if (i15 != 0) {
                                pVarB2 = androidx.compose.runtime.internal.a.b(-1780043561, new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.material3.DatePickerKt$DatePicker$3
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
                                            DatePickerDefaults.f12132a.a(interfaceC1067t.f(), interfaceC1067t.b(), interfaceC1065q4, PaddingKt.e(androidx.compose.ui.h.a.f13984b, DatePickerKt.f12144f), interfaceC1084f3, 27648, 0);
                                        }
                                        return p293xa.r.f47939a;
                                    }
                                }, c1086gP);
                            }
                            if (i17 != 0) {
                                z11 = true;
                            }
                            if ((i11 & 64) != 0) {
                                DatePickerDefaults datePickerDefaults18 = DatePickerDefaults.f12132a;
                                i12 &= -3670017;
                                c1064pC = DatePickerDefaults.c(c1086gP);
                                pVar3 = pVarB;
                                pVar4 = pVarB2;
                                z12 = z11;
                                interfaceC1065q2 = interfaceC1065q4;
                                hVar3 = hVar2;
                            } else {
                                interfaceC1065q2 = interfaceC1065q4;
                                hVar3 = hVar2;
                                pVar3 = pVarB;
                                pVar4 = pVarB2;
                                z12 = z11;
                                c1064pC = c1064p2;
                            }
                        }
                        c1086gP.U();
                        localeA = C1053h.a(c1086gP);
                        zK = c1086gP.K(localeA);
                        objF2 = c1086gP.f();
                        if (zK) {
                            objF2 = new androidx.compose.material3.internal.l(localeA);
                            c1086gP.E(objF2);
                        } else {
                            objF2 = new androidx.compose.material3.internal.l(localeA);
                            c1086gP.E(objF2);
                        }
                        final androidx.compose.material3.internal.k kVar6 = (androidx.compose.material3.internal.k) objF2;
                        c1086gP.L(255587712);
                        if (z12) {
                            composableLambdaImplB = androidx.compose.runtime.internal.a.b(1982226759, new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.material3.DatePickerKt$DatePicker$4
                                {
                                    super(2);
                                }

                                @Override // Ia.p
                                public final p293xa.r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                                    InterfaceC1084f interfaceC1084f3 = interfaceC1084f2;
                                    if ((num.intValue() & 3) == 2 && interfaceC1084f3.s()) {
                                        interfaceC1084f3.w();
                                    } else {
                                        androidx.compose.ui.h hVarE = PaddingKt.e(androidx.compose.ui.h.a.f13984b, DatePickerKt.f12142d);
                                        int iB = interfaceC1067t.b();
                                        boolean zK3 = interfaceC1084f3.K(interfaceC1067t);
                                        final InterfaceC1067t interfaceC1067t2 = interfaceC1067t;
                                        Object objF3 = interfaceC1084f3.f();
                                        if (zK3 || objF3 == InterfaceC1084f.a.f12980a) {
                                            objF3 = new Ia.l<C1072y, p293xa.r>() { // from class: androidx.compose.material3.DatePickerKt$DatePicker$4$1$1
                                                {
                                                    super(1);
                                                }

                                                @Override // Ia.l
                                                public final p293xa.r invoke(C1072y c1072y) {
                                                    interfaceC1067t2.a(c1072y.f12768a);
                                                    return p293xa.r.f47939a;
                                                }
                                            };
                                            interfaceC1084f3.E(objF3);
                                        }
                                        DatePickerKt.e(hVarE, iB, (Ia.l) objF3, interfaceC1084f3, 6);
                                    }
                                    return p293xa.r.f47939a;
                                }
                            }, c1086gP);
                        } else {
                            composableLambdaImplB = null;
                        }
                        c1086gP.T(false);
                        int i213 = ((i12 >> 3) & 14) | 14155776;
                        int i214 = i12 >> 6;
                        a(hVar3, pVar3, pVar4, composableLambdaImplB, c1064pC, TypographyKt.a(C0609d.f1247p, c1086gP), C0609d.f1245n, androidx.compose.runtime.internal.a.b(-1840727866, new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.material3.DatePickerKt$DatePicker$5
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
                                    Long lF = interfaceC1067t.f();
                                    long jE = interfaceC1067t.e();
                                    int iB = interfaceC1067t.b();
                                    boolean zK3 = interfaceC1084f3.K(interfaceC1067t);
                                    final InterfaceC1067t interfaceC1067t2 = interfaceC1067t;
                                    Object objF3 = interfaceC1084f3.f();
                                    InterfaceC1084f.a.C0153a c0153a2 = InterfaceC1084f.a.f12980a;
                                    if (zK3 || objF3 == c0153a2) {
                                        objF3 = new Ia.l<Long, p293xa.r>() { // from class: androidx.compose.material3.DatePickerKt$DatePicker$5$1$1
                                            {
                                                super(1);
                                            }

                                            @Override // Ia.l
                                            public final p293xa.r invoke(Long l10) {
                                                interfaceC1067t2.h(l10);
                                                return p293xa.r.f47939a;
                                            }
                                        };
                                        interfaceC1084f3.E(objF3);
                                    }
                                    Ia.l lVar = (Ia.l) objF3;
                                    boolean zK4 = interfaceC1084f3.K(interfaceC1067t);
                                    final InterfaceC1067t interfaceC1067t3 = interfaceC1067t;
                                    Object objF4 = interfaceC1084f3.f();
                                    if (zK4 || objF4 == c0153a2) {
                                        objF4 = new Ia.l<Long, p293xa.r>() { // from class: androidx.compose.material3.DatePickerKt$DatePicker$5$2$1
                                            {
                                                super(1);
                                            }

                                            @Override // Ia.l
                                            public final p293xa.r invoke(Long l10) {
                                                interfaceC1067t3.c(l10.longValue());
                                                return p293xa.r.f47939a;
                                            }
                                        };
                                        interfaceC1084f3.E(objF4);
                                    }
                                    DatePickerKt.k(lF, jE, iB, lVar, (Ia.l) objF4, kVar6, interfaceC1067t.g(), interfaceC1065q2, interfaceC1067t.d(), c1064pC, interfaceC1084f3, 0);
                                }
                                return p293xa.r.f47939a;
                            }
                        }, c1086gP), c1086gP, i213 | (i214 & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) | (i214 & 896) | (i214 & 57344));
                        pVar5 = pVar4;
                        pVar6 = pVar3;
                        interfaceC1065q3 = interfaceC1065q2;
                        hVar4 = hVar3;
                    }
                    c1105p0V = c1086gP.V();
                    if (c1105p0V != null) {
                        final boolean z15 = z12;
                        final C1064p c1064p5 = c1064pC;
                        c1105p0V.f13109d = new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.material3.DatePickerKt$DatePicker$6
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            /* JADX WARN: Multi-variable type inference failed */
                            {
                                super(2);
                            }

                            @Override // Ia.p
                            public final p293xa.r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                                num.intValue();
                                DatePickerKt.b(interfaceC1067t, hVar4, interfaceC1065q3, pVar6, pVar5, z15, c1064p5, interfaceC1084f2, L4.b.l(i10 | 1), i11);
                                return p293xa.r.f47939a;
                            }
                        };
                    }
                }
                i12 |= 196608;
                z11 = z10;
                if ((1572864 & i10) == 0) {
                    if ((i11 & 64) == 0) {
                        c1064p2 = c1064p;
                        if (c1086gP.K(c1064p2)) {
                        }
                        i12 |= i22;
                    } else {
                        c1064p2 = c1064p;
                    }
                    i12 |= i22;
                } else {
                    c1064p2 = c1064p;
                }
                if ((i12 & 599187) == 599186) {
                    c1086gP.r0();
                    i19 = i10 & 1;
                    c0153a = InterfaceC1084f.a.f12980a;
                    if (i19 != 0) {
                        if (i21 != 0) {
                            hVar2 = androidx.compose.ui.h.a.f13984b;
                        }
                        if ((i11 & 4) != 0) {
                            objF = c1086gP.f();
                            if (objF == c0153a) {
                                DatePickerDefaults datePickerDefaults19 = DatePickerDefaults.f12132a;
                                objF = new r("yMMMM", "yMMMd", "yMMMMEEEEd");
                                c1086gP.E(objF);
                            }
                            interfaceC1065q4 = (InterfaceC1065q) objF;
                            i12 &= -897;
                        }
                        if (i13 != 0) {
                            pVarB = androidx.compose.runtime.internal.a.b(-1504998463, new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.material3.DatePickerKt$DatePicker$2
                                {
                                    super(2);
                                }

                                @Override // Ia.p
                                public final p293xa.r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                                    InterfaceC1084f interfaceC1084f3 = interfaceC1084f2;
                                    if ((num.intValue() & 3) == 2 && interfaceC1084f3.s()) {
                                        interfaceC1084f3.w();
                                    } else {
                                        DatePickerDefaults.f12132a.b(PaddingKt.e(androidx.compose.ui.h.a.f13984b, DatePickerKt.f12143e), interfaceC1067t.b(), 432, interfaceC1084f3, 0);
                                    }
                                    return p293xa.r.f47939a;
                                }
                            }, c1086gP);
                        }
                        if (i15 != 0) {
                            pVarB2 = androidx.compose.runtime.internal.a.b(-1780043561, new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.material3.DatePickerKt$DatePicker$3
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
                                        DatePickerDefaults.f12132a.a(interfaceC1067t.f(), interfaceC1067t.b(), interfaceC1065q4, PaddingKt.e(androidx.compose.ui.h.a.f13984b, DatePickerKt.f12144f), interfaceC1084f3, 27648, 0);
                                    }
                                    return p293xa.r.f47939a;
                                }
                            }, c1086gP);
                        }
                        if (i17 != 0) {
                            z11 = true;
                        }
                        if ((i11 & 64) != 0) {
                            DatePickerDefaults datePickerDefaults110 = DatePickerDefaults.f12132a;
                            i12 &= -3670017;
                            c1064pC = DatePickerDefaults.c(c1086gP);
                            pVar3 = pVarB;
                            pVar4 = pVarB2;
                            z12 = z11;
                            interfaceC1065q2 = interfaceC1065q4;
                            hVar3 = hVar2;
                        } else {
                            interfaceC1065q2 = interfaceC1065q4;
                            hVar3 = hVar2;
                            pVar3 = pVarB;
                            pVar4 = pVarB2;
                            z12 = z11;
                            c1064pC = c1064p2;
                        }
                    } else {
                        if (i21 != 0) {
                            hVar2 = androidx.compose.ui.h.a.f13984b;
                        }
                        if ((i11 & 4) != 0) {
                            objF = c1086gP.f();
                            if (objF == c0153a) {
                                DatePickerDefaults datePickerDefaults111 = DatePickerDefaults.f12132a;
                                objF = new r("yMMMM", "yMMMd", "yMMMMEEEEd");
                                c1086gP.E(objF);
                            }
                            interfaceC1065q4 = (InterfaceC1065q) objF;
                            i12 &= -897;
                        }
                        if (i13 != 0) {
                            pVarB = androidx.compose.runtime.internal.a.b(-1504998463, new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.material3.DatePickerKt$DatePicker$2
                                {
                                    super(2);
                                }

                                @Override // Ia.p
                                public final p293xa.r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                                    InterfaceC1084f interfaceC1084f3 = interfaceC1084f2;
                                    if ((num.intValue() & 3) == 2 && interfaceC1084f3.s()) {
                                        interfaceC1084f3.w();
                                    } else {
                                        DatePickerDefaults.f12132a.b(PaddingKt.e(androidx.compose.ui.h.a.f13984b, DatePickerKt.f12143e), interfaceC1067t.b(), 432, interfaceC1084f3, 0);
                                    }
                                    return p293xa.r.f47939a;
                                }
                            }, c1086gP);
                        }
                        if (i15 != 0) {
                            pVarB2 = androidx.compose.runtime.internal.a.b(-1780043561, new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.material3.DatePickerKt$DatePicker$3
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
                                        DatePickerDefaults.f12132a.a(interfaceC1067t.f(), interfaceC1067t.b(), interfaceC1065q4, PaddingKt.e(androidx.compose.ui.h.a.f13984b, DatePickerKt.f12144f), interfaceC1084f3, 27648, 0);
                                    }
                                    return p293xa.r.f47939a;
                                }
                            }, c1086gP);
                        }
                        if (i17 != 0) {
                            z11 = true;
                        }
                        if ((i11 & 64) != 0) {
                            DatePickerDefaults datePickerDefaults112 = DatePickerDefaults.f12132a;
                            i12 &= -3670017;
                            c1064pC = DatePickerDefaults.c(c1086gP);
                            pVar3 = pVarB;
                            pVar4 = pVarB2;
                            z12 = z11;
                            interfaceC1065q2 = interfaceC1065q4;
                            hVar3 = hVar2;
                        } else {
                            interfaceC1065q2 = interfaceC1065q4;
                            hVar3 = hVar2;
                            pVar3 = pVarB;
                            pVar4 = pVarB2;
                            z12 = z11;
                            c1064pC = c1064p2;
                        }
                    }
                    c1086gP.U();
                    localeA = C1053h.a(c1086gP);
                    zK = c1086gP.K(localeA);
                    objF2 = c1086gP.f();
                    if (zK) {
                        objF2 = new androidx.compose.material3.internal.l(localeA);
                        c1086gP.E(objF2);
                    } else {
                        objF2 = new androidx.compose.material3.internal.l(localeA);
                        c1086gP.E(objF2);
                    }
                    final androidx.compose.material3.internal.k kVar7 = (androidx.compose.material3.internal.k) objF2;
                    c1086gP.L(255587712);
                    if (z12) {
                        composableLambdaImplB = androidx.compose.runtime.internal.a.b(1982226759, new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.material3.DatePickerKt$DatePicker$4
                            {
                                super(2);
                            }

                            @Override // Ia.p
                            public final p293xa.r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                                InterfaceC1084f interfaceC1084f3 = interfaceC1084f2;
                                if ((num.intValue() & 3) == 2 && interfaceC1084f3.s()) {
                                    interfaceC1084f3.w();
                                } else {
                                    androidx.compose.ui.h hVarE = PaddingKt.e(androidx.compose.ui.h.a.f13984b, DatePickerKt.f12142d);
                                    int iB = interfaceC1067t.b();
                                    boolean zK3 = interfaceC1084f3.K(interfaceC1067t);
                                    final InterfaceC1067t interfaceC1067t2 = interfaceC1067t;
                                    Object objF3 = interfaceC1084f3.f();
                                    if (zK3 || objF3 == InterfaceC1084f.a.f12980a) {
                                        objF3 = new Ia.l<C1072y, p293xa.r>() { // from class: androidx.compose.material3.DatePickerKt$DatePicker$4$1$1
                                            {
                                                super(1);
                                            }

                                            @Override // Ia.l
                                            public final p293xa.r invoke(C1072y c1072y) {
                                                interfaceC1067t2.a(c1072y.f12768a);
                                                return p293xa.r.f47939a;
                                            }
                                        };
                                        interfaceC1084f3.E(objF3);
                                    }
                                    DatePickerKt.e(hVarE, iB, (Ia.l) objF3, interfaceC1084f3, 6);
                                }
                                return p293xa.r.f47939a;
                            }
                        }, c1086gP);
                    } else {
                        composableLambdaImplB = null;
                    }
                    c1086gP.T(false);
                    int i215 = ((i12 >> 3) & 14) | 14155776;
                    int i216 = i12 >> 6;
                    a(hVar3, pVar3, pVar4, composableLambdaImplB, c1064pC, TypographyKt.a(C0609d.f1247p, c1086gP), C0609d.f1245n, androidx.compose.runtime.internal.a.b(-1840727866, new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.material3.DatePickerKt$DatePicker$5
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
                                Long lF = interfaceC1067t.f();
                                long jE = interfaceC1067t.e();
                                int iB = interfaceC1067t.b();
                                boolean zK3 = interfaceC1084f3.K(interfaceC1067t);
                                final InterfaceC1067t interfaceC1067t2 = interfaceC1067t;
                                Object objF3 = interfaceC1084f3.f();
                                InterfaceC1084f.a.C0153a c0153a2 = InterfaceC1084f.a.f12980a;
                                if (zK3 || objF3 == c0153a2) {
                                    objF3 = new Ia.l<Long, p293xa.r>() { // from class: androidx.compose.material3.DatePickerKt$DatePicker$5$1$1
                                        {
                                            super(1);
                                        }

                                        @Override // Ia.l
                                        public final p293xa.r invoke(Long l10) {
                                            interfaceC1067t2.h(l10);
                                            return p293xa.r.f47939a;
                                        }
                                    };
                                    interfaceC1084f3.E(objF3);
                                }
                                Ia.l lVar = (Ia.l) objF3;
                                boolean zK4 = interfaceC1084f3.K(interfaceC1067t);
                                final InterfaceC1067t interfaceC1067t3 = interfaceC1067t;
                                Object objF4 = interfaceC1084f3.f();
                                if (zK4 || objF4 == c0153a2) {
                                    objF4 = new Ia.l<Long, p293xa.r>() { // from class: androidx.compose.material3.DatePickerKt$DatePicker$5$2$1
                                        {
                                            super(1);
                                        }

                                        @Override // Ia.l
                                        public final p293xa.r invoke(Long l10) {
                                            interfaceC1067t3.c(l10.longValue());
                                            return p293xa.r.f47939a;
                                        }
                                    };
                                    interfaceC1084f3.E(objF4);
                                }
                                DatePickerKt.k(lF, jE, iB, lVar, (Ia.l) objF4, kVar7, interfaceC1067t.g(), interfaceC1065q2, interfaceC1067t.d(), c1064pC, interfaceC1084f3, 0);
                            }
                            return p293xa.r.f47939a;
                        }
                    }, c1086gP), c1086gP, i215 | (i216 & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) | (i216 & 896) | (i216 & 57344));
                    pVar5 = pVar4;
                    pVar6 = pVar3;
                    interfaceC1065q3 = interfaceC1065q2;
                    hVar4 = hVar3;
                } else {
                    c1086gP.r0();
                    i19 = i10 & 1;
                    c0153a = InterfaceC1084f.a.f12980a;
                    if (i19 != 0) {
                        if (i21 != 0) {
                            hVar2 = androidx.compose.ui.h.a.f13984b;
                        }
                        if ((i11 & 4) != 0) {
                            objF = c1086gP.f();
                            if (objF == c0153a) {
                                DatePickerDefaults datePickerDefaults113 = DatePickerDefaults.f12132a;
                                objF = new r("yMMMM", "yMMMd", "yMMMMEEEEd");
                                c1086gP.E(objF);
                            }
                            interfaceC1065q4 = (InterfaceC1065q) objF;
                            i12 &= -897;
                        }
                        if (i13 != 0) {
                            pVarB = androidx.compose.runtime.internal.a.b(-1504998463, new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.material3.DatePickerKt$DatePicker$2
                                {
                                    super(2);
                                }

                                @Override // Ia.p
                                public final p293xa.r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                                    InterfaceC1084f interfaceC1084f3 = interfaceC1084f2;
                                    if ((num.intValue() & 3) == 2 && interfaceC1084f3.s()) {
                                        interfaceC1084f3.w();
                                    } else {
                                        DatePickerDefaults.f12132a.b(PaddingKt.e(androidx.compose.ui.h.a.f13984b, DatePickerKt.f12143e), interfaceC1067t.b(), 432, interfaceC1084f3, 0);
                                    }
                                    return p293xa.r.f47939a;
                                }
                            }, c1086gP);
                        }
                        if (i15 != 0) {
                            pVarB2 = androidx.compose.runtime.internal.a.b(-1780043561, new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.material3.DatePickerKt$DatePicker$3
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
                                        DatePickerDefaults.f12132a.a(interfaceC1067t.f(), interfaceC1067t.b(), interfaceC1065q4, PaddingKt.e(androidx.compose.ui.h.a.f13984b, DatePickerKt.f12144f), interfaceC1084f3, 27648, 0);
                                    }
                                    return p293xa.r.f47939a;
                                }
                            }, c1086gP);
                        }
                        if (i17 != 0) {
                            z11 = true;
                        }
                        if ((i11 & 64) != 0) {
                            DatePickerDefaults datePickerDefaults114 = DatePickerDefaults.f12132a;
                            i12 &= -3670017;
                            c1064pC = DatePickerDefaults.c(c1086gP);
                            pVar3 = pVarB;
                            pVar4 = pVarB2;
                            z12 = z11;
                            interfaceC1065q2 = interfaceC1065q4;
                            hVar3 = hVar2;
                        } else {
                            interfaceC1065q2 = interfaceC1065q4;
                            hVar3 = hVar2;
                            pVar3 = pVarB;
                            pVar4 = pVarB2;
                            z12 = z11;
                            c1064pC = c1064p2;
                        }
                    } else {
                        if (i21 != 0) {
                            hVar2 = androidx.compose.ui.h.a.f13984b;
                        }
                        if ((i11 & 4) != 0) {
                            objF = c1086gP.f();
                            if (objF == c0153a) {
                                DatePickerDefaults datePickerDefaults115 = DatePickerDefaults.f12132a;
                                objF = new r("yMMMM", "yMMMd", "yMMMMEEEEd");
                                c1086gP.E(objF);
                            }
                            interfaceC1065q4 = (InterfaceC1065q) objF;
                            i12 &= -897;
                        }
                        if (i13 != 0) {
                            pVarB = androidx.compose.runtime.internal.a.b(-1504998463, new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.material3.DatePickerKt$DatePicker$2
                                {
                                    super(2);
                                }

                                @Override // Ia.p
                                public final p293xa.r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                                    InterfaceC1084f interfaceC1084f3 = interfaceC1084f2;
                                    if ((num.intValue() & 3) == 2 && interfaceC1084f3.s()) {
                                        interfaceC1084f3.w();
                                    } else {
                                        DatePickerDefaults.f12132a.b(PaddingKt.e(androidx.compose.ui.h.a.f13984b, DatePickerKt.f12143e), interfaceC1067t.b(), 432, interfaceC1084f3, 0);
                                    }
                                    return p293xa.r.f47939a;
                                }
                            }, c1086gP);
                        }
                        if (i15 != 0) {
                            pVarB2 = androidx.compose.runtime.internal.a.b(-1780043561, new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.material3.DatePickerKt$DatePicker$3
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
                                        DatePickerDefaults.f12132a.a(interfaceC1067t.f(), interfaceC1067t.b(), interfaceC1065q4, PaddingKt.e(androidx.compose.ui.h.a.f13984b, DatePickerKt.f12144f), interfaceC1084f3, 27648, 0);
                                    }
                                    return p293xa.r.f47939a;
                                }
                            }, c1086gP);
                        }
                        if (i17 != 0) {
                            z11 = true;
                        }
                        if ((i11 & 64) != 0) {
                            DatePickerDefaults datePickerDefaults116 = DatePickerDefaults.f12132a;
                            i12 &= -3670017;
                            c1064pC = DatePickerDefaults.c(c1086gP);
                            pVar3 = pVarB;
                            pVar4 = pVarB2;
                            z12 = z11;
                            interfaceC1065q2 = interfaceC1065q4;
                            hVar3 = hVar2;
                        } else {
                            interfaceC1065q2 = interfaceC1065q4;
                            hVar3 = hVar2;
                            pVar3 = pVarB;
                            pVar4 = pVarB2;
                            z12 = z11;
                            c1064pC = c1064p2;
                        }
                    }
                    c1086gP.U();
                    localeA = C1053h.a(c1086gP);
                    zK = c1086gP.K(localeA);
                    objF2 = c1086gP.f();
                    if (zK) {
                        objF2 = new androidx.compose.material3.internal.l(localeA);
                        c1086gP.E(objF2);
                    } else {
                        objF2 = new androidx.compose.material3.internal.l(localeA);
                        c1086gP.E(objF2);
                    }
                    final androidx.compose.material3.internal.k kVar8 = (androidx.compose.material3.internal.k) objF2;
                    c1086gP.L(255587712);
                    if (z12) {
                        composableLambdaImplB = androidx.compose.runtime.internal.a.b(1982226759, new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.material3.DatePickerKt$DatePicker$4
                            {
                                super(2);
                            }

                            @Override // Ia.p
                            public final p293xa.r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                                InterfaceC1084f interfaceC1084f3 = interfaceC1084f2;
                                if ((num.intValue() & 3) == 2 && interfaceC1084f3.s()) {
                                    interfaceC1084f3.w();
                                } else {
                                    androidx.compose.ui.h hVarE = PaddingKt.e(androidx.compose.ui.h.a.f13984b, DatePickerKt.f12142d);
                                    int iB = interfaceC1067t.b();
                                    boolean zK3 = interfaceC1084f3.K(interfaceC1067t);
                                    final InterfaceC1067t interfaceC1067t2 = interfaceC1067t;
                                    Object objF3 = interfaceC1084f3.f();
                                    if (zK3 || objF3 == InterfaceC1084f.a.f12980a) {
                                        objF3 = new Ia.l<C1072y, p293xa.r>() { // from class: androidx.compose.material3.DatePickerKt$DatePicker$4$1$1
                                            {
                                                super(1);
                                            }

                                            @Override // Ia.l
                                            public final p293xa.r invoke(C1072y c1072y) {
                                                interfaceC1067t2.a(c1072y.f12768a);
                                                return p293xa.r.f47939a;
                                            }
                                        };
                                        interfaceC1084f3.E(objF3);
                                    }
                                    DatePickerKt.e(hVarE, iB, (Ia.l) objF3, interfaceC1084f3, 6);
                                }
                                return p293xa.r.f47939a;
                            }
                        }, c1086gP);
                    } else {
                        composableLambdaImplB = null;
                    }
                    c1086gP.T(false);
                    int i217 = ((i12 >> 3) & 14) | 14155776;
                    int i218 = i12 >> 6;
                    a(hVar3, pVar3, pVar4, composableLambdaImplB, c1064pC, TypographyKt.a(C0609d.f1247p, c1086gP), C0609d.f1245n, androidx.compose.runtime.internal.a.b(-1840727866, new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.material3.DatePickerKt$DatePicker$5
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
                                Long lF = interfaceC1067t.f();
                                long jE = interfaceC1067t.e();
                                int iB = interfaceC1067t.b();
                                boolean zK3 = interfaceC1084f3.K(interfaceC1067t);
                                final InterfaceC1067t interfaceC1067t2 = interfaceC1067t;
                                Object objF3 = interfaceC1084f3.f();
                                InterfaceC1084f.a.C0153a c0153a2 = InterfaceC1084f.a.f12980a;
                                if (zK3 || objF3 == c0153a2) {
                                    objF3 = new Ia.l<Long, p293xa.r>() { // from class: androidx.compose.material3.DatePickerKt$DatePicker$5$1$1
                                        {
                                            super(1);
                                        }

                                        @Override // Ia.l
                                        public final p293xa.r invoke(Long l10) {
                                            interfaceC1067t2.h(l10);
                                            return p293xa.r.f47939a;
                                        }
                                    };
                                    interfaceC1084f3.E(objF3);
                                }
                                Ia.l lVar = (Ia.l) objF3;
                                boolean zK4 = interfaceC1084f3.K(interfaceC1067t);
                                final InterfaceC1067t interfaceC1067t3 = interfaceC1067t;
                                Object objF4 = interfaceC1084f3.f();
                                if (zK4 || objF4 == c0153a2) {
                                    objF4 = new Ia.l<Long, p293xa.r>() { // from class: androidx.compose.material3.DatePickerKt$DatePicker$5$2$1
                                        {
                                            super(1);
                                        }

                                        @Override // Ia.l
                                        public final p293xa.r invoke(Long l10) {
                                            interfaceC1067t3.c(l10.longValue());
                                            return p293xa.r.f47939a;
                                        }
                                    };
                                    interfaceC1084f3.E(objF4);
                                }
                                DatePickerKt.k(lF, jE, iB, lVar, (Ia.l) objF4, kVar8, interfaceC1067t.g(), interfaceC1065q2, interfaceC1067t.d(), c1064pC, interfaceC1084f3, 0);
                            }
                            return p293xa.r.f47939a;
                        }
                    }, c1086gP), c1086gP, i217 | (i218 & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) | (i218 & 896) | (i218 & 57344));
                    pVar5 = pVar4;
                    pVar6 = pVar3;
                    interfaceC1065q3 = interfaceC1065q2;
                    hVar4 = hVar3;
                }
                c1105p0V = c1086gP.V();
                if (c1105p0V != null) {
                    final boolean z16 = z12;
                    final C1064p c1064p6 = c1064pC;
                    c1105p0V.f13109d = new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.material3.DatePickerKt$DatePicker$6
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        /* JADX WARN: Multi-variable type inference failed */
                        {
                            super(2);
                        }

                        @Override // Ia.p
                        public final p293xa.r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                            num.intValue();
                            DatePickerKt.b(interfaceC1067t, hVar4, interfaceC1065q3, pVar6, pVar5, z16, c1064p6, interfaceC1084f2, L4.b.l(i10 | 1), i11);
                            return p293xa.r.f47939a;
                        }
                    };
                }
            }
            i12 |= 3072;
            pVarB = pVar;
            i15 = i11 & 16;
            if (i15 != 0) {
                if ((i10 & 24576) == 0) {
                    pVarB2 = pVar2;
                    if (c1086gP.k(pVarB2)) {
                        i16 = 16384;
                    } else {
                        i16 = 8192;
                    }
                    i12 |= i16;
                }
                i17 = i11 & 32;
                if (i17 != 0) {
                    if ((196608 & i10) == 0) {
                        z11 = z10;
                        if (c1086gP.c(z11)) {
                            i18 = 131072;
                        } else {
                            i18 = 65536;
                        }
                        i12 |= i18;
                    }
                    if ((1572864 & i10) == 0) {
                        if ((i11 & 64) == 0) {
                            c1064p2 = c1064p;
                            if (c1086gP.K(c1064p2)) {
                            }
                            i12 |= i22;
                        } else {
                            c1064p2 = c1064p;
                        }
                        i12 |= i22;
                    } else {
                        c1064p2 = c1064p;
                    }
                    if ((i12 & 599187) == 599186) {
                        c1086gP.r0();
                        i19 = i10 & 1;
                        c0153a = InterfaceC1084f.a.f12980a;
                        if (i19 != 0) {
                            if (i21 != 0) {
                                hVar2 = androidx.compose.ui.h.a.f13984b;
                            }
                            if ((i11 & 4) != 0) {
                                objF = c1086gP.f();
                                if (objF == c0153a) {
                                    DatePickerDefaults datePickerDefaults117 = DatePickerDefaults.f12132a;
                                    objF = new r("yMMMM", "yMMMd", "yMMMMEEEEd");
                                    c1086gP.E(objF);
                                }
                                interfaceC1065q4 = (InterfaceC1065q) objF;
                                i12 &= -897;
                            }
                            if (i13 != 0) {
                                pVarB = androidx.compose.runtime.internal.a.b(-1504998463, new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.material3.DatePickerKt$DatePicker$2
                                    {
                                        super(2);
                                    }

                                    @Override // Ia.p
                                    public final p293xa.r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                                        InterfaceC1084f interfaceC1084f3 = interfaceC1084f2;
                                        if ((num.intValue() & 3) == 2 && interfaceC1084f3.s()) {
                                            interfaceC1084f3.w();
                                        } else {
                                            DatePickerDefaults.f12132a.b(PaddingKt.e(androidx.compose.ui.h.a.f13984b, DatePickerKt.f12143e), interfaceC1067t.b(), 432, interfaceC1084f3, 0);
                                        }
                                        return p293xa.r.f47939a;
                                    }
                                }, c1086gP);
                            }
                            if (i15 != 0) {
                                pVarB2 = androidx.compose.runtime.internal.a.b(-1780043561, new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.material3.DatePickerKt$DatePicker$3
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
                                            DatePickerDefaults.f12132a.a(interfaceC1067t.f(), interfaceC1067t.b(), interfaceC1065q4, PaddingKt.e(androidx.compose.ui.h.a.f13984b, DatePickerKt.f12144f), interfaceC1084f3, 27648, 0);
                                        }
                                        return p293xa.r.f47939a;
                                    }
                                }, c1086gP);
                            }
                            if (i17 != 0) {
                                z11 = true;
                            }
                            if ((i11 & 64) != 0) {
                                DatePickerDefaults datePickerDefaults118 = DatePickerDefaults.f12132a;
                                i12 &= -3670017;
                                c1064pC = DatePickerDefaults.c(c1086gP);
                                pVar3 = pVarB;
                                pVar4 = pVarB2;
                                z12 = z11;
                                interfaceC1065q2 = interfaceC1065q4;
                                hVar3 = hVar2;
                            } else {
                                interfaceC1065q2 = interfaceC1065q4;
                                hVar3 = hVar2;
                                pVar3 = pVarB;
                                pVar4 = pVarB2;
                                z12 = z11;
                                c1064pC = c1064p2;
                            }
                        } else {
                            if (i21 != 0) {
                                hVar2 = androidx.compose.ui.h.a.f13984b;
                            }
                            if ((i11 & 4) != 0) {
                                objF = c1086gP.f();
                                if (objF == c0153a) {
                                    DatePickerDefaults datePickerDefaults119 = DatePickerDefaults.f12132a;
                                    objF = new r("yMMMM", "yMMMd", "yMMMMEEEEd");
                                    c1086gP.E(objF);
                                }
                                interfaceC1065q4 = (InterfaceC1065q) objF;
                                i12 &= -897;
                            }
                            if (i13 != 0) {
                                pVarB = androidx.compose.runtime.internal.a.b(-1504998463, new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.material3.DatePickerKt$DatePicker$2
                                    {
                                        super(2);
                                    }

                                    @Override // Ia.p
                                    public final p293xa.r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                                        InterfaceC1084f interfaceC1084f3 = interfaceC1084f2;
                                        if ((num.intValue() & 3) == 2 && interfaceC1084f3.s()) {
                                            interfaceC1084f3.w();
                                        } else {
                                            DatePickerDefaults.f12132a.b(PaddingKt.e(androidx.compose.ui.h.a.f13984b, DatePickerKt.f12143e), interfaceC1067t.b(), 432, interfaceC1084f3, 0);
                                        }
                                        return p293xa.r.f47939a;
                                    }
                                }, c1086gP);
                            }
                            if (i15 != 0) {
                                pVarB2 = androidx.compose.runtime.internal.a.b(-1780043561, new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.material3.DatePickerKt$DatePicker$3
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
                                            DatePickerDefaults.f12132a.a(interfaceC1067t.f(), interfaceC1067t.b(), interfaceC1065q4, PaddingKt.e(androidx.compose.ui.h.a.f13984b, DatePickerKt.f12144f), interfaceC1084f3, 27648, 0);
                                        }
                                        return p293xa.r.f47939a;
                                    }
                                }, c1086gP);
                            }
                            if (i17 != 0) {
                                z11 = true;
                            }
                            if ((i11 & 64) != 0) {
                                DatePickerDefaults datePickerDefaults1110 = DatePickerDefaults.f12132a;
                                i12 &= -3670017;
                                c1064pC = DatePickerDefaults.c(c1086gP);
                                pVar3 = pVarB;
                                pVar4 = pVarB2;
                                z12 = z11;
                                interfaceC1065q2 = interfaceC1065q4;
                                hVar3 = hVar2;
                            } else {
                                interfaceC1065q2 = interfaceC1065q4;
                                hVar3 = hVar2;
                                pVar3 = pVarB;
                                pVar4 = pVarB2;
                                z12 = z11;
                                c1064pC = c1064p2;
                            }
                        }
                        c1086gP.U();
                        localeA = C1053h.a(c1086gP);
                        zK = c1086gP.K(localeA);
                        objF2 = c1086gP.f();
                        if (zK) {
                            objF2 = new androidx.compose.material3.internal.l(localeA);
                            c1086gP.E(objF2);
                        } else {
                            objF2 = new androidx.compose.material3.internal.l(localeA);
                            c1086gP.E(objF2);
                        }
                        final androidx.compose.material3.internal.k kVar9 = (androidx.compose.material3.internal.k) objF2;
                        c1086gP.L(255587712);
                        if (z12) {
                            composableLambdaImplB = androidx.compose.runtime.internal.a.b(1982226759, new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.material3.DatePickerKt$DatePicker$4
                                {
                                    super(2);
                                }

                                @Override // Ia.p
                                public final p293xa.r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                                    InterfaceC1084f interfaceC1084f3 = interfaceC1084f2;
                                    if ((num.intValue() & 3) == 2 && interfaceC1084f3.s()) {
                                        interfaceC1084f3.w();
                                    } else {
                                        androidx.compose.ui.h hVarE = PaddingKt.e(androidx.compose.ui.h.a.f13984b, DatePickerKt.f12142d);
                                        int iB = interfaceC1067t.b();
                                        boolean zK3 = interfaceC1084f3.K(interfaceC1067t);
                                        final InterfaceC1067t interfaceC1067t2 = interfaceC1067t;
                                        Object objF3 = interfaceC1084f3.f();
                                        if (zK3 || objF3 == InterfaceC1084f.a.f12980a) {
                                            objF3 = new Ia.l<C1072y, p293xa.r>() { // from class: androidx.compose.material3.DatePickerKt$DatePicker$4$1$1
                                                {
                                                    super(1);
                                                }

                                                @Override // Ia.l
                                                public final p293xa.r invoke(C1072y c1072y) {
                                                    interfaceC1067t2.a(c1072y.f12768a);
                                                    return p293xa.r.f47939a;
                                                }
                                            };
                                            interfaceC1084f3.E(objF3);
                                        }
                                        DatePickerKt.e(hVarE, iB, (Ia.l) objF3, interfaceC1084f3, 6);
                                    }
                                    return p293xa.r.f47939a;
                                }
                            }, c1086gP);
                        } else {
                            composableLambdaImplB = null;
                        }
                        c1086gP.T(false);
                        int i219 = ((i12 >> 3) & 14) | 14155776;
                        int i2110 = i12 >> 6;
                        a(hVar3, pVar3, pVar4, composableLambdaImplB, c1064pC, TypographyKt.a(C0609d.f1247p, c1086gP), C0609d.f1245n, androidx.compose.runtime.internal.a.b(-1840727866, new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.material3.DatePickerKt$DatePicker$5
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
                                    Long lF = interfaceC1067t.f();
                                    long jE = interfaceC1067t.e();
                                    int iB = interfaceC1067t.b();
                                    boolean zK3 = interfaceC1084f3.K(interfaceC1067t);
                                    final InterfaceC1067t interfaceC1067t2 = interfaceC1067t;
                                    Object objF3 = interfaceC1084f3.f();
                                    InterfaceC1084f.a.C0153a c0153a2 = InterfaceC1084f.a.f12980a;
                                    if (zK3 || objF3 == c0153a2) {
                                        objF3 = new Ia.l<Long, p293xa.r>() { // from class: androidx.compose.material3.DatePickerKt$DatePicker$5$1$1
                                            {
                                                super(1);
                                            }

                                            @Override // Ia.l
                                            public final p293xa.r invoke(Long l10) {
                                                interfaceC1067t2.h(l10);
                                                return p293xa.r.f47939a;
                                            }
                                        };
                                        interfaceC1084f3.E(objF3);
                                    }
                                    Ia.l lVar = (Ia.l) objF3;
                                    boolean zK4 = interfaceC1084f3.K(interfaceC1067t);
                                    final InterfaceC1067t interfaceC1067t3 = interfaceC1067t;
                                    Object objF4 = interfaceC1084f3.f();
                                    if (zK4 || objF4 == c0153a2) {
                                        objF4 = new Ia.l<Long, p293xa.r>() { // from class: androidx.compose.material3.DatePickerKt$DatePicker$5$2$1
                                            {
                                                super(1);
                                            }

                                            @Override // Ia.l
                                            public final p293xa.r invoke(Long l10) {
                                                interfaceC1067t3.c(l10.longValue());
                                                return p293xa.r.f47939a;
                                            }
                                        };
                                        interfaceC1084f3.E(objF4);
                                    }
                                    DatePickerKt.k(lF, jE, iB, lVar, (Ia.l) objF4, kVar9, interfaceC1067t.g(), interfaceC1065q2, interfaceC1067t.d(), c1064pC, interfaceC1084f3, 0);
                                }
                                return p293xa.r.f47939a;
                            }
                        }, c1086gP), c1086gP, i219 | (i2110 & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) | (i2110 & 896) | (i2110 & 57344));
                        pVar5 = pVar4;
                        pVar6 = pVar3;
                        interfaceC1065q3 = interfaceC1065q2;
                        hVar4 = hVar3;
                    } else {
                        c1086gP.r0();
                        i19 = i10 & 1;
                        c0153a = InterfaceC1084f.a.f12980a;
                        if (i19 != 0) {
                            if (i21 != 0) {
                                hVar2 = androidx.compose.ui.h.a.f13984b;
                            }
                            if ((i11 & 4) != 0) {
                                objF = c1086gP.f();
                                if (objF == c0153a) {
                                    DatePickerDefaults datePickerDefaults1111 = DatePickerDefaults.f12132a;
                                    objF = new r("yMMMM", "yMMMd", "yMMMMEEEEd");
                                    c1086gP.E(objF);
                                }
                                interfaceC1065q4 = (InterfaceC1065q) objF;
                                i12 &= -897;
                            }
                            if (i13 != 0) {
                                pVarB = androidx.compose.runtime.internal.a.b(-1504998463, new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.material3.DatePickerKt$DatePicker$2
                                    {
                                        super(2);
                                    }

                                    @Override // Ia.p
                                    public final p293xa.r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                                        InterfaceC1084f interfaceC1084f3 = interfaceC1084f2;
                                        if ((num.intValue() & 3) == 2 && interfaceC1084f3.s()) {
                                            interfaceC1084f3.w();
                                        } else {
                                            DatePickerDefaults.f12132a.b(PaddingKt.e(androidx.compose.ui.h.a.f13984b, DatePickerKt.f12143e), interfaceC1067t.b(), 432, interfaceC1084f3, 0);
                                        }
                                        return p293xa.r.f47939a;
                                    }
                                }, c1086gP);
                            }
                            if (i15 != 0) {
                                pVarB2 = androidx.compose.runtime.internal.a.b(-1780043561, new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.material3.DatePickerKt$DatePicker$3
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
                                            DatePickerDefaults.f12132a.a(interfaceC1067t.f(), interfaceC1067t.b(), interfaceC1065q4, PaddingKt.e(androidx.compose.ui.h.a.f13984b, DatePickerKt.f12144f), interfaceC1084f3, 27648, 0);
                                        }
                                        return p293xa.r.f47939a;
                                    }
                                }, c1086gP);
                            }
                            if (i17 != 0) {
                                z11 = true;
                            }
                            if ((i11 & 64) != 0) {
                                DatePickerDefaults datePickerDefaults1112 = DatePickerDefaults.f12132a;
                                i12 &= -3670017;
                                c1064pC = DatePickerDefaults.c(c1086gP);
                                pVar3 = pVarB;
                                pVar4 = pVarB2;
                                z12 = z11;
                                interfaceC1065q2 = interfaceC1065q4;
                                hVar3 = hVar2;
                            } else {
                                interfaceC1065q2 = interfaceC1065q4;
                                hVar3 = hVar2;
                                pVar3 = pVarB;
                                pVar4 = pVarB2;
                                z12 = z11;
                                c1064pC = c1064p2;
                            }
                        } else {
                            if (i21 != 0) {
                                hVar2 = androidx.compose.ui.h.a.f13984b;
                            }
                            if ((i11 & 4) != 0) {
                                objF = c1086gP.f();
                                if (objF == c0153a) {
                                    DatePickerDefaults datePickerDefaults1113 = DatePickerDefaults.f12132a;
                                    objF = new r("yMMMM", "yMMMd", "yMMMMEEEEd");
                                    c1086gP.E(objF);
                                }
                                interfaceC1065q4 = (InterfaceC1065q) objF;
                                i12 &= -897;
                            }
                            if (i13 != 0) {
                                pVarB = androidx.compose.runtime.internal.a.b(-1504998463, new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.material3.DatePickerKt$DatePicker$2
                                    {
                                        super(2);
                                    }

                                    @Override // Ia.p
                                    public final p293xa.r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                                        InterfaceC1084f interfaceC1084f3 = interfaceC1084f2;
                                        if ((num.intValue() & 3) == 2 && interfaceC1084f3.s()) {
                                            interfaceC1084f3.w();
                                        } else {
                                            DatePickerDefaults.f12132a.b(PaddingKt.e(androidx.compose.ui.h.a.f13984b, DatePickerKt.f12143e), interfaceC1067t.b(), 432, interfaceC1084f3, 0);
                                        }
                                        return p293xa.r.f47939a;
                                    }
                                }, c1086gP);
                            }
                            if (i15 != 0) {
                                pVarB2 = androidx.compose.runtime.internal.a.b(-1780043561, new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.material3.DatePickerKt$DatePicker$3
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
                                            DatePickerDefaults.f12132a.a(interfaceC1067t.f(), interfaceC1067t.b(), interfaceC1065q4, PaddingKt.e(androidx.compose.ui.h.a.f13984b, DatePickerKt.f12144f), interfaceC1084f3, 27648, 0);
                                        }
                                        return p293xa.r.f47939a;
                                    }
                                }, c1086gP);
                            }
                            if (i17 != 0) {
                                z11 = true;
                            }
                            if ((i11 & 64) != 0) {
                                DatePickerDefaults datePickerDefaults1114 = DatePickerDefaults.f12132a;
                                i12 &= -3670017;
                                c1064pC = DatePickerDefaults.c(c1086gP);
                                pVar3 = pVarB;
                                pVar4 = pVarB2;
                                z12 = z11;
                                interfaceC1065q2 = interfaceC1065q4;
                                hVar3 = hVar2;
                            } else {
                                interfaceC1065q2 = interfaceC1065q4;
                                hVar3 = hVar2;
                                pVar3 = pVarB;
                                pVar4 = pVarB2;
                                z12 = z11;
                                c1064pC = c1064p2;
                            }
                        }
                        c1086gP.U();
                        localeA = C1053h.a(c1086gP);
                        zK = c1086gP.K(localeA);
                        objF2 = c1086gP.f();
                        if (zK) {
                            objF2 = new androidx.compose.material3.internal.l(localeA);
                            c1086gP.E(objF2);
                        } else {
                            objF2 = new androidx.compose.material3.internal.l(localeA);
                            c1086gP.E(objF2);
                        }
                        final androidx.compose.material3.internal.k kVar10 = (androidx.compose.material3.internal.k) objF2;
                        c1086gP.L(255587712);
                        if (z12) {
                            composableLambdaImplB = androidx.compose.runtime.internal.a.b(1982226759, new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.material3.DatePickerKt$DatePicker$4
                                {
                                    super(2);
                                }

                                @Override // Ia.p
                                public final p293xa.r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                                    InterfaceC1084f interfaceC1084f3 = interfaceC1084f2;
                                    if ((num.intValue() & 3) == 2 && interfaceC1084f3.s()) {
                                        interfaceC1084f3.w();
                                    } else {
                                        androidx.compose.ui.h hVarE = PaddingKt.e(androidx.compose.ui.h.a.f13984b, DatePickerKt.f12142d);
                                        int iB = interfaceC1067t.b();
                                        boolean zK3 = interfaceC1084f3.K(interfaceC1067t);
                                        final InterfaceC1067t interfaceC1067t2 = interfaceC1067t;
                                        Object objF3 = interfaceC1084f3.f();
                                        if (zK3 || objF3 == InterfaceC1084f.a.f12980a) {
                                            objF3 = new Ia.l<C1072y, p293xa.r>() { // from class: androidx.compose.material3.DatePickerKt$DatePicker$4$1$1
                                                {
                                                    super(1);
                                                }

                                                @Override // Ia.l
                                                public final p293xa.r invoke(C1072y c1072y) {
                                                    interfaceC1067t2.a(c1072y.f12768a);
                                                    return p293xa.r.f47939a;
                                                }
                                            };
                                            interfaceC1084f3.E(objF3);
                                        }
                                        DatePickerKt.e(hVarE, iB, (Ia.l) objF3, interfaceC1084f3, 6);
                                    }
                                    return p293xa.r.f47939a;
                                }
                            }, c1086gP);
                        } else {
                            composableLambdaImplB = null;
                        }
                        c1086gP.T(false);
                        int i2111 = ((i12 >> 3) & 14) | 14155776;
                        int i2112 = i12 >> 6;
                        a(hVar3, pVar3, pVar4, composableLambdaImplB, c1064pC, TypographyKt.a(C0609d.f1247p, c1086gP), C0609d.f1245n, androidx.compose.runtime.internal.a.b(-1840727866, new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.material3.DatePickerKt$DatePicker$5
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
                                    Long lF = interfaceC1067t.f();
                                    long jE = interfaceC1067t.e();
                                    int iB = interfaceC1067t.b();
                                    boolean zK3 = interfaceC1084f3.K(interfaceC1067t);
                                    final InterfaceC1067t interfaceC1067t2 = interfaceC1067t;
                                    Object objF3 = interfaceC1084f3.f();
                                    InterfaceC1084f.a.C0153a c0153a2 = InterfaceC1084f.a.f12980a;
                                    if (zK3 || objF3 == c0153a2) {
                                        objF3 = new Ia.l<Long, p293xa.r>() { // from class: androidx.compose.material3.DatePickerKt$DatePicker$5$1$1
                                            {
                                                super(1);
                                            }

                                            @Override // Ia.l
                                            public final p293xa.r invoke(Long l10) {
                                                interfaceC1067t2.h(l10);
                                                return p293xa.r.f47939a;
                                            }
                                        };
                                        interfaceC1084f3.E(objF3);
                                    }
                                    Ia.l lVar = (Ia.l) objF3;
                                    boolean zK4 = interfaceC1084f3.K(interfaceC1067t);
                                    final InterfaceC1067t interfaceC1067t3 = interfaceC1067t;
                                    Object objF4 = interfaceC1084f3.f();
                                    if (zK4 || objF4 == c0153a2) {
                                        objF4 = new Ia.l<Long, p293xa.r>() { // from class: androidx.compose.material3.DatePickerKt$DatePicker$5$2$1
                                            {
                                                super(1);
                                            }

                                            @Override // Ia.l
                                            public final p293xa.r invoke(Long l10) {
                                                interfaceC1067t3.c(l10.longValue());
                                                return p293xa.r.f47939a;
                                            }
                                        };
                                        interfaceC1084f3.E(objF4);
                                    }
                                    DatePickerKt.k(lF, jE, iB, lVar, (Ia.l) objF4, kVar10, interfaceC1067t.g(), interfaceC1065q2, interfaceC1067t.d(), c1064pC, interfaceC1084f3, 0);
                                }
                                return p293xa.r.f47939a;
                            }
                        }, c1086gP), c1086gP, i2111 | (i2112 & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) | (i2112 & 896) | (i2112 & 57344));
                        pVar5 = pVar4;
                        pVar6 = pVar3;
                        interfaceC1065q3 = interfaceC1065q2;
                        hVar4 = hVar3;
                    }
                    c1105p0V = c1086gP.V();
                    if (c1105p0V != null) {
                        final boolean z17 = z12;
                        final C1064p c1064p7 = c1064pC;
                        c1105p0V.f13109d = new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.material3.DatePickerKt$DatePicker$6
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            /* JADX WARN: Multi-variable type inference failed */
                            {
                                super(2);
                            }

                            @Override // Ia.p
                            public final p293xa.r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                                num.intValue();
                                DatePickerKt.b(interfaceC1067t, hVar4, interfaceC1065q3, pVar6, pVar5, z17, c1064p7, interfaceC1084f2, L4.b.l(i10 | 1), i11);
                                return p293xa.r.f47939a;
                            }
                        };
                    }
                }
                i12 |= 196608;
                z11 = z10;
                if ((1572864 & i10) == 0) {
                    if ((i11 & 64) == 0) {
                        c1064p2 = c1064p;
                        if (c1086gP.K(c1064p2)) {
                        }
                        i12 |= i22;
                    } else {
                        c1064p2 = c1064p;
                    }
                    i12 |= i22;
                } else {
                    c1064p2 = c1064p;
                }
                if ((i12 & 599187) == 599186) {
                    c1086gP.r0();
                    i19 = i10 & 1;
                    c0153a = InterfaceC1084f.a.f12980a;
                    if (i19 != 0) {
                        if (i21 != 0) {
                            hVar2 = androidx.compose.ui.h.a.f13984b;
                        }
                        if ((i11 & 4) != 0) {
                            objF = c1086gP.f();
                            if (objF == c0153a) {
                                DatePickerDefaults datePickerDefaults1115 = DatePickerDefaults.f12132a;
                                objF = new r("yMMMM", "yMMMd", "yMMMMEEEEd");
                                c1086gP.E(objF);
                            }
                            interfaceC1065q4 = (InterfaceC1065q) objF;
                            i12 &= -897;
                        }
                        if (i13 != 0) {
                            pVarB = androidx.compose.runtime.internal.a.b(-1504998463, new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.material3.DatePickerKt$DatePicker$2
                                {
                                    super(2);
                                }

                                @Override // Ia.p
                                public final p293xa.r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                                    InterfaceC1084f interfaceC1084f3 = interfaceC1084f2;
                                    if ((num.intValue() & 3) == 2 && interfaceC1084f3.s()) {
                                        interfaceC1084f3.w();
                                    } else {
                                        DatePickerDefaults.f12132a.b(PaddingKt.e(androidx.compose.ui.h.a.f13984b, DatePickerKt.f12143e), interfaceC1067t.b(), 432, interfaceC1084f3, 0);
                                    }
                                    return p293xa.r.f47939a;
                                }
                            }, c1086gP);
                        }
                        if (i15 != 0) {
                            pVarB2 = androidx.compose.runtime.internal.a.b(-1780043561, new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.material3.DatePickerKt$DatePicker$3
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
                                        DatePickerDefaults.f12132a.a(interfaceC1067t.f(), interfaceC1067t.b(), interfaceC1065q4, PaddingKt.e(androidx.compose.ui.h.a.f13984b, DatePickerKt.f12144f), interfaceC1084f3, 27648, 0);
                                    }
                                    return p293xa.r.f47939a;
                                }
                            }, c1086gP);
                        }
                        if (i17 != 0) {
                            z11 = true;
                        }
                        if ((i11 & 64) != 0) {
                            DatePickerDefaults datePickerDefaults1116 = DatePickerDefaults.f12132a;
                            i12 &= -3670017;
                            c1064pC = DatePickerDefaults.c(c1086gP);
                            pVar3 = pVarB;
                            pVar4 = pVarB2;
                            z12 = z11;
                            interfaceC1065q2 = interfaceC1065q4;
                            hVar3 = hVar2;
                        } else {
                            interfaceC1065q2 = interfaceC1065q4;
                            hVar3 = hVar2;
                            pVar3 = pVarB;
                            pVar4 = pVarB2;
                            z12 = z11;
                            c1064pC = c1064p2;
                        }
                    } else {
                        if (i21 != 0) {
                            hVar2 = androidx.compose.ui.h.a.f13984b;
                        }
                        if ((i11 & 4) != 0) {
                            objF = c1086gP.f();
                            if (objF == c0153a) {
                                DatePickerDefaults datePickerDefaults1117 = DatePickerDefaults.f12132a;
                                objF = new r("yMMMM", "yMMMd", "yMMMMEEEEd");
                                c1086gP.E(objF);
                            }
                            interfaceC1065q4 = (InterfaceC1065q) objF;
                            i12 &= -897;
                        }
                        if (i13 != 0) {
                            pVarB = androidx.compose.runtime.internal.a.b(-1504998463, new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.material3.DatePickerKt$DatePicker$2
                                {
                                    super(2);
                                }

                                @Override // Ia.p
                                public final p293xa.r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                                    InterfaceC1084f interfaceC1084f3 = interfaceC1084f2;
                                    if ((num.intValue() & 3) == 2 && interfaceC1084f3.s()) {
                                        interfaceC1084f3.w();
                                    } else {
                                        DatePickerDefaults.f12132a.b(PaddingKt.e(androidx.compose.ui.h.a.f13984b, DatePickerKt.f12143e), interfaceC1067t.b(), 432, interfaceC1084f3, 0);
                                    }
                                    return p293xa.r.f47939a;
                                }
                            }, c1086gP);
                        }
                        if (i15 != 0) {
                            pVarB2 = androidx.compose.runtime.internal.a.b(-1780043561, new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.material3.DatePickerKt$DatePicker$3
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
                                        DatePickerDefaults.f12132a.a(interfaceC1067t.f(), interfaceC1067t.b(), interfaceC1065q4, PaddingKt.e(androidx.compose.ui.h.a.f13984b, DatePickerKt.f12144f), interfaceC1084f3, 27648, 0);
                                    }
                                    return p293xa.r.f47939a;
                                }
                            }, c1086gP);
                        }
                        if (i17 != 0) {
                            z11 = true;
                        }
                        if ((i11 & 64) != 0) {
                            DatePickerDefaults datePickerDefaults1118 = DatePickerDefaults.f12132a;
                            i12 &= -3670017;
                            c1064pC = DatePickerDefaults.c(c1086gP);
                            pVar3 = pVarB;
                            pVar4 = pVarB2;
                            z12 = z11;
                            interfaceC1065q2 = interfaceC1065q4;
                            hVar3 = hVar2;
                        } else {
                            interfaceC1065q2 = interfaceC1065q4;
                            hVar3 = hVar2;
                            pVar3 = pVarB;
                            pVar4 = pVarB2;
                            z12 = z11;
                            c1064pC = c1064p2;
                        }
                    }
                    c1086gP.U();
                    localeA = C1053h.a(c1086gP);
                    zK = c1086gP.K(localeA);
                    objF2 = c1086gP.f();
                    if (zK) {
                        objF2 = new androidx.compose.material3.internal.l(localeA);
                        c1086gP.E(objF2);
                    } else {
                        objF2 = new androidx.compose.material3.internal.l(localeA);
                        c1086gP.E(objF2);
                    }
                    final androidx.compose.material3.internal.k kVar11 = (androidx.compose.material3.internal.k) objF2;
                    c1086gP.L(255587712);
                    if (z12) {
                        composableLambdaImplB = androidx.compose.runtime.internal.a.b(1982226759, new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.material3.DatePickerKt$DatePicker$4
                            {
                                super(2);
                            }

                            @Override // Ia.p
                            public final p293xa.r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                                InterfaceC1084f interfaceC1084f3 = interfaceC1084f2;
                                if ((num.intValue() & 3) == 2 && interfaceC1084f3.s()) {
                                    interfaceC1084f3.w();
                                } else {
                                    androidx.compose.ui.h hVarE = PaddingKt.e(androidx.compose.ui.h.a.f13984b, DatePickerKt.f12142d);
                                    int iB = interfaceC1067t.b();
                                    boolean zK3 = interfaceC1084f3.K(interfaceC1067t);
                                    final InterfaceC1067t interfaceC1067t2 = interfaceC1067t;
                                    Object objF3 = interfaceC1084f3.f();
                                    if (zK3 || objF3 == InterfaceC1084f.a.f12980a) {
                                        objF3 = new Ia.l<C1072y, p293xa.r>() { // from class: androidx.compose.material3.DatePickerKt$DatePicker$4$1$1
                                            {
                                                super(1);
                                            }

                                            @Override // Ia.l
                                            public final p293xa.r invoke(C1072y c1072y) {
                                                interfaceC1067t2.a(c1072y.f12768a);
                                                return p293xa.r.f47939a;
                                            }
                                        };
                                        interfaceC1084f3.E(objF3);
                                    }
                                    DatePickerKt.e(hVarE, iB, (Ia.l) objF3, interfaceC1084f3, 6);
                                }
                                return p293xa.r.f47939a;
                            }
                        }, c1086gP);
                    } else {
                        composableLambdaImplB = null;
                    }
                    c1086gP.T(false);
                    int i2113 = ((i12 >> 3) & 14) | 14155776;
                    int i2114 = i12 >> 6;
                    a(hVar3, pVar3, pVar4, composableLambdaImplB, c1064pC, TypographyKt.a(C0609d.f1247p, c1086gP), C0609d.f1245n, androidx.compose.runtime.internal.a.b(-1840727866, new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.material3.DatePickerKt$DatePicker$5
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
                                Long lF = interfaceC1067t.f();
                                long jE = interfaceC1067t.e();
                                int iB = interfaceC1067t.b();
                                boolean zK3 = interfaceC1084f3.K(interfaceC1067t);
                                final InterfaceC1067t interfaceC1067t2 = interfaceC1067t;
                                Object objF3 = interfaceC1084f3.f();
                                InterfaceC1084f.a.C0153a c0153a2 = InterfaceC1084f.a.f12980a;
                                if (zK3 || objF3 == c0153a2) {
                                    objF3 = new Ia.l<Long, p293xa.r>() { // from class: androidx.compose.material3.DatePickerKt$DatePicker$5$1$1
                                        {
                                            super(1);
                                        }

                                        @Override // Ia.l
                                        public final p293xa.r invoke(Long l10) {
                                            interfaceC1067t2.h(l10);
                                            return p293xa.r.f47939a;
                                        }
                                    };
                                    interfaceC1084f3.E(objF3);
                                }
                                Ia.l lVar = (Ia.l) objF3;
                                boolean zK4 = interfaceC1084f3.K(interfaceC1067t);
                                final InterfaceC1067t interfaceC1067t3 = interfaceC1067t;
                                Object objF4 = interfaceC1084f3.f();
                                if (zK4 || objF4 == c0153a2) {
                                    objF4 = new Ia.l<Long, p293xa.r>() { // from class: androidx.compose.material3.DatePickerKt$DatePicker$5$2$1
                                        {
                                            super(1);
                                        }

                                        @Override // Ia.l
                                        public final p293xa.r invoke(Long l10) {
                                            interfaceC1067t3.c(l10.longValue());
                                            return p293xa.r.f47939a;
                                        }
                                    };
                                    interfaceC1084f3.E(objF4);
                                }
                                DatePickerKt.k(lF, jE, iB, lVar, (Ia.l) objF4, kVar11, interfaceC1067t.g(), interfaceC1065q2, interfaceC1067t.d(), c1064pC, interfaceC1084f3, 0);
                            }
                            return p293xa.r.f47939a;
                        }
                    }, c1086gP), c1086gP, i2113 | (i2114 & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) | (i2114 & 896) | (i2114 & 57344));
                    pVar5 = pVar4;
                    pVar6 = pVar3;
                    interfaceC1065q3 = interfaceC1065q2;
                    hVar4 = hVar3;
                } else {
                    c1086gP.r0();
                    i19 = i10 & 1;
                    c0153a = InterfaceC1084f.a.f12980a;
                    if (i19 != 0) {
                        if (i21 != 0) {
                            hVar2 = androidx.compose.ui.h.a.f13984b;
                        }
                        if ((i11 & 4) != 0) {
                            objF = c1086gP.f();
                            if (objF == c0153a) {
                                DatePickerDefaults datePickerDefaults1119 = DatePickerDefaults.f12132a;
                                objF = new r("yMMMM", "yMMMd", "yMMMMEEEEd");
                                c1086gP.E(objF);
                            }
                            interfaceC1065q4 = (InterfaceC1065q) objF;
                            i12 &= -897;
                        }
                        if (i13 != 0) {
                            pVarB = androidx.compose.runtime.internal.a.b(-1504998463, new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.material3.DatePickerKt$DatePicker$2
                                {
                                    super(2);
                                }

                                @Override // Ia.p
                                public final p293xa.r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                                    InterfaceC1084f interfaceC1084f3 = interfaceC1084f2;
                                    if ((num.intValue() & 3) == 2 && interfaceC1084f3.s()) {
                                        interfaceC1084f3.w();
                                    } else {
                                        DatePickerDefaults.f12132a.b(PaddingKt.e(androidx.compose.ui.h.a.f13984b, DatePickerKt.f12143e), interfaceC1067t.b(), 432, interfaceC1084f3, 0);
                                    }
                                    return p293xa.r.f47939a;
                                }
                            }, c1086gP);
                        }
                        if (i15 != 0) {
                            pVarB2 = androidx.compose.runtime.internal.a.b(-1780043561, new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.material3.DatePickerKt$DatePicker$3
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
                                        DatePickerDefaults.f12132a.a(interfaceC1067t.f(), interfaceC1067t.b(), interfaceC1065q4, PaddingKt.e(androidx.compose.ui.h.a.f13984b, DatePickerKt.f12144f), interfaceC1084f3, 27648, 0);
                                    }
                                    return p293xa.r.f47939a;
                                }
                            }, c1086gP);
                        }
                        if (i17 != 0) {
                            z11 = true;
                        }
                        if ((i11 & 64) != 0) {
                            DatePickerDefaults datePickerDefaults11110 = DatePickerDefaults.f12132a;
                            i12 &= -3670017;
                            c1064pC = DatePickerDefaults.c(c1086gP);
                            pVar3 = pVarB;
                            pVar4 = pVarB2;
                            z12 = z11;
                            interfaceC1065q2 = interfaceC1065q4;
                            hVar3 = hVar2;
                        } else {
                            interfaceC1065q2 = interfaceC1065q4;
                            hVar3 = hVar2;
                            pVar3 = pVarB;
                            pVar4 = pVarB2;
                            z12 = z11;
                            c1064pC = c1064p2;
                        }
                    } else {
                        if (i21 != 0) {
                            hVar2 = androidx.compose.ui.h.a.f13984b;
                        }
                        if ((i11 & 4) != 0) {
                            objF = c1086gP.f();
                            if (objF == c0153a) {
                                DatePickerDefaults datePickerDefaults11111 = DatePickerDefaults.f12132a;
                                objF = new r("yMMMM", "yMMMd", "yMMMMEEEEd");
                                c1086gP.E(objF);
                            }
                            interfaceC1065q4 = (InterfaceC1065q) objF;
                            i12 &= -897;
                        }
                        if (i13 != 0) {
                            pVarB = androidx.compose.runtime.internal.a.b(-1504998463, new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.material3.DatePickerKt$DatePicker$2
                                {
                                    super(2);
                                }

                                @Override // Ia.p
                                public final p293xa.r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                                    InterfaceC1084f interfaceC1084f3 = interfaceC1084f2;
                                    if ((num.intValue() & 3) == 2 && interfaceC1084f3.s()) {
                                        interfaceC1084f3.w();
                                    } else {
                                        DatePickerDefaults.f12132a.b(PaddingKt.e(androidx.compose.ui.h.a.f13984b, DatePickerKt.f12143e), interfaceC1067t.b(), 432, interfaceC1084f3, 0);
                                    }
                                    return p293xa.r.f47939a;
                                }
                            }, c1086gP);
                        }
                        if (i15 != 0) {
                            pVarB2 = androidx.compose.runtime.internal.a.b(-1780043561, new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.material3.DatePickerKt$DatePicker$3
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
                                        DatePickerDefaults.f12132a.a(interfaceC1067t.f(), interfaceC1067t.b(), interfaceC1065q4, PaddingKt.e(androidx.compose.ui.h.a.f13984b, DatePickerKt.f12144f), interfaceC1084f3, 27648, 0);
                                    }
                                    return p293xa.r.f47939a;
                                }
                            }, c1086gP);
                        }
                        if (i17 != 0) {
                            z11 = true;
                        }
                        if ((i11 & 64) != 0) {
                            DatePickerDefaults datePickerDefaults11112 = DatePickerDefaults.f12132a;
                            i12 &= -3670017;
                            c1064pC = DatePickerDefaults.c(c1086gP);
                            pVar3 = pVarB;
                            pVar4 = pVarB2;
                            z12 = z11;
                            interfaceC1065q2 = interfaceC1065q4;
                            hVar3 = hVar2;
                        } else {
                            interfaceC1065q2 = interfaceC1065q4;
                            hVar3 = hVar2;
                            pVar3 = pVarB;
                            pVar4 = pVarB2;
                            z12 = z11;
                            c1064pC = c1064p2;
                        }
                    }
                    c1086gP.U();
                    localeA = C1053h.a(c1086gP);
                    zK = c1086gP.K(localeA);
                    objF2 = c1086gP.f();
                    if (zK) {
                        objF2 = new androidx.compose.material3.internal.l(localeA);
                        c1086gP.E(objF2);
                    } else {
                        objF2 = new androidx.compose.material3.internal.l(localeA);
                        c1086gP.E(objF2);
                    }
                    final androidx.compose.material3.internal.k kVar12 = (androidx.compose.material3.internal.k) objF2;
                    c1086gP.L(255587712);
                    if (z12) {
                        composableLambdaImplB = androidx.compose.runtime.internal.a.b(1982226759, new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.material3.DatePickerKt$DatePicker$4
                            {
                                super(2);
                            }

                            @Override // Ia.p
                            public final p293xa.r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                                InterfaceC1084f interfaceC1084f3 = interfaceC1084f2;
                                if ((num.intValue() & 3) == 2 && interfaceC1084f3.s()) {
                                    interfaceC1084f3.w();
                                } else {
                                    androidx.compose.ui.h hVarE = PaddingKt.e(androidx.compose.ui.h.a.f13984b, DatePickerKt.f12142d);
                                    int iB = interfaceC1067t.b();
                                    boolean zK3 = interfaceC1084f3.K(interfaceC1067t);
                                    final InterfaceC1067t interfaceC1067t2 = interfaceC1067t;
                                    Object objF3 = interfaceC1084f3.f();
                                    if (zK3 || objF3 == InterfaceC1084f.a.f12980a) {
                                        objF3 = new Ia.l<C1072y, p293xa.r>() { // from class: androidx.compose.material3.DatePickerKt$DatePicker$4$1$1
                                            {
                                                super(1);
                                            }

                                            @Override // Ia.l
                                            public final p293xa.r invoke(C1072y c1072y) {
                                                interfaceC1067t2.a(c1072y.f12768a);
                                                return p293xa.r.f47939a;
                                            }
                                        };
                                        interfaceC1084f3.E(objF3);
                                    }
                                    DatePickerKt.e(hVarE, iB, (Ia.l) objF3, interfaceC1084f3, 6);
                                }
                                return p293xa.r.f47939a;
                            }
                        }, c1086gP);
                    } else {
                        composableLambdaImplB = null;
                    }
                    c1086gP.T(false);
                    int i2115 = ((i12 >> 3) & 14) | 14155776;
                    int i2116 = i12 >> 6;
                    a(hVar3, pVar3, pVar4, composableLambdaImplB, c1064pC, TypographyKt.a(C0609d.f1247p, c1086gP), C0609d.f1245n, androidx.compose.runtime.internal.a.b(-1840727866, new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.material3.DatePickerKt$DatePicker$5
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
                                Long lF = interfaceC1067t.f();
                                long jE = interfaceC1067t.e();
                                int iB = interfaceC1067t.b();
                                boolean zK3 = interfaceC1084f3.K(interfaceC1067t);
                                final InterfaceC1067t interfaceC1067t2 = interfaceC1067t;
                                Object objF3 = interfaceC1084f3.f();
                                InterfaceC1084f.a.C0153a c0153a2 = InterfaceC1084f.a.f12980a;
                                if (zK3 || objF3 == c0153a2) {
                                    objF3 = new Ia.l<Long, p293xa.r>() { // from class: androidx.compose.material3.DatePickerKt$DatePicker$5$1$1
                                        {
                                            super(1);
                                        }

                                        @Override // Ia.l
                                        public final p293xa.r invoke(Long l10) {
                                            interfaceC1067t2.h(l10);
                                            return p293xa.r.f47939a;
                                        }
                                    };
                                    interfaceC1084f3.E(objF3);
                                }
                                Ia.l lVar = (Ia.l) objF3;
                                boolean zK4 = interfaceC1084f3.K(interfaceC1067t);
                                final InterfaceC1067t interfaceC1067t3 = interfaceC1067t;
                                Object objF4 = interfaceC1084f3.f();
                                if (zK4 || objF4 == c0153a2) {
                                    objF4 = new Ia.l<Long, p293xa.r>() { // from class: androidx.compose.material3.DatePickerKt$DatePicker$5$2$1
                                        {
                                            super(1);
                                        }

                                        @Override // Ia.l
                                        public final p293xa.r invoke(Long l10) {
                                            interfaceC1067t3.c(l10.longValue());
                                            return p293xa.r.f47939a;
                                        }
                                    };
                                    interfaceC1084f3.E(objF4);
                                }
                                DatePickerKt.k(lF, jE, iB, lVar, (Ia.l) objF4, kVar12, interfaceC1067t.g(), interfaceC1065q2, interfaceC1067t.d(), c1064pC, interfaceC1084f3, 0);
                            }
                            return p293xa.r.f47939a;
                        }
                    }, c1086gP), c1086gP, i2115 | (i2116 & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) | (i2116 & 896) | (i2116 & 57344));
                    pVar5 = pVar4;
                    pVar6 = pVar3;
                    interfaceC1065q3 = interfaceC1065q2;
                    hVar4 = hVar3;
                }
                c1105p0V = c1086gP.V();
                if (c1105p0V != null) {
                    final boolean z18 = z12;
                    final C1064p c1064p8 = c1064pC;
                    c1105p0V.f13109d = new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.material3.DatePickerKt$DatePicker$6
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        /* JADX WARN: Multi-variable type inference failed */
                        {
                            super(2);
                        }

                        @Override // Ia.p
                        public final p293xa.r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                            num.intValue();
                            DatePickerKt.b(interfaceC1067t, hVar4, interfaceC1065q3, pVar6, pVar5, z18, c1064p8, interfaceC1084f2, L4.b.l(i10 | 1), i11);
                            return p293xa.r.f47939a;
                        }
                    };
                }
            }
            i12 |= 24576;
            pVarB2 = pVar2;
            i17 = i11 & 32;
            if (i17 != 0) {
                if ((196608 & i10) == 0) {
                    z11 = z10;
                    if (c1086gP.c(z11)) {
                        i18 = 131072;
                    } else {
                        i18 = 65536;
                    }
                    i12 |= i18;
                }
                if ((1572864 & i10) == 0) {
                    if ((i11 & 64) == 0) {
                        c1064p2 = c1064p;
                        if (c1086gP.K(c1064p2)) {
                        }
                        i12 |= i22;
                    } else {
                        c1064p2 = c1064p;
                    }
                    i12 |= i22;
                } else {
                    c1064p2 = c1064p;
                }
                if ((i12 & 599187) == 599186) {
                    c1086gP.r0();
                    i19 = i10 & 1;
                    c0153a = InterfaceC1084f.a.f12980a;
                    if (i19 != 0) {
                        if (i21 != 0) {
                            hVar2 = androidx.compose.ui.h.a.f13984b;
                        }
                        if ((i11 & 4) != 0) {
                            objF = c1086gP.f();
                            if (objF == c0153a) {
                                DatePickerDefaults datePickerDefaults11113 = DatePickerDefaults.f12132a;
                                objF = new r("yMMMM", "yMMMd", "yMMMMEEEEd");
                                c1086gP.E(objF);
                            }
                            interfaceC1065q4 = (InterfaceC1065q) objF;
                            i12 &= -897;
                        }
                        if (i13 != 0) {
                            pVarB = androidx.compose.runtime.internal.a.b(-1504998463, new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.material3.DatePickerKt$DatePicker$2
                                {
                                    super(2);
                                }

                                @Override // Ia.p
                                public final p293xa.r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                                    InterfaceC1084f interfaceC1084f3 = interfaceC1084f2;
                                    if ((num.intValue() & 3) == 2 && interfaceC1084f3.s()) {
                                        interfaceC1084f3.w();
                                    } else {
                                        DatePickerDefaults.f12132a.b(PaddingKt.e(androidx.compose.ui.h.a.f13984b, DatePickerKt.f12143e), interfaceC1067t.b(), 432, interfaceC1084f3, 0);
                                    }
                                    return p293xa.r.f47939a;
                                }
                            }, c1086gP);
                        }
                        if (i15 != 0) {
                            pVarB2 = androidx.compose.runtime.internal.a.b(-1780043561, new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.material3.DatePickerKt$DatePicker$3
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
                                        DatePickerDefaults.f12132a.a(interfaceC1067t.f(), interfaceC1067t.b(), interfaceC1065q4, PaddingKt.e(androidx.compose.ui.h.a.f13984b, DatePickerKt.f12144f), interfaceC1084f3, 27648, 0);
                                    }
                                    return p293xa.r.f47939a;
                                }
                            }, c1086gP);
                        }
                        if (i17 != 0) {
                            z11 = true;
                        }
                        if ((i11 & 64) != 0) {
                            DatePickerDefaults datePickerDefaults11114 = DatePickerDefaults.f12132a;
                            i12 &= -3670017;
                            c1064pC = DatePickerDefaults.c(c1086gP);
                            pVar3 = pVarB;
                            pVar4 = pVarB2;
                            z12 = z11;
                            interfaceC1065q2 = interfaceC1065q4;
                            hVar3 = hVar2;
                        } else {
                            interfaceC1065q2 = interfaceC1065q4;
                            hVar3 = hVar2;
                            pVar3 = pVarB;
                            pVar4 = pVarB2;
                            z12 = z11;
                            c1064pC = c1064p2;
                        }
                    } else {
                        if (i21 != 0) {
                            hVar2 = androidx.compose.ui.h.a.f13984b;
                        }
                        if ((i11 & 4) != 0) {
                            objF = c1086gP.f();
                            if (objF == c0153a) {
                                DatePickerDefaults datePickerDefaults11115 = DatePickerDefaults.f12132a;
                                objF = new r("yMMMM", "yMMMd", "yMMMMEEEEd");
                                c1086gP.E(objF);
                            }
                            interfaceC1065q4 = (InterfaceC1065q) objF;
                            i12 &= -897;
                        }
                        if (i13 != 0) {
                            pVarB = androidx.compose.runtime.internal.a.b(-1504998463, new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.material3.DatePickerKt$DatePicker$2
                                {
                                    super(2);
                                }

                                @Override // Ia.p
                                public final p293xa.r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                                    InterfaceC1084f interfaceC1084f3 = interfaceC1084f2;
                                    if ((num.intValue() & 3) == 2 && interfaceC1084f3.s()) {
                                        interfaceC1084f3.w();
                                    } else {
                                        DatePickerDefaults.f12132a.b(PaddingKt.e(androidx.compose.ui.h.a.f13984b, DatePickerKt.f12143e), interfaceC1067t.b(), 432, interfaceC1084f3, 0);
                                    }
                                    return p293xa.r.f47939a;
                                }
                            }, c1086gP);
                        }
                        if (i15 != 0) {
                            pVarB2 = androidx.compose.runtime.internal.a.b(-1780043561, new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.material3.DatePickerKt$DatePicker$3
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
                                        DatePickerDefaults.f12132a.a(interfaceC1067t.f(), interfaceC1067t.b(), interfaceC1065q4, PaddingKt.e(androidx.compose.ui.h.a.f13984b, DatePickerKt.f12144f), interfaceC1084f3, 27648, 0);
                                    }
                                    return p293xa.r.f47939a;
                                }
                            }, c1086gP);
                        }
                        if (i17 != 0) {
                            z11 = true;
                        }
                        if ((i11 & 64) != 0) {
                            DatePickerDefaults datePickerDefaults11116 = DatePickerDefaults.f12132a;
                            i12 &= -3670017;
                            c1064pC = DatePickerDefaults.c(c1086gP);
                            pVar3 = pVarB;
                            pVar4 = pVarB2;
                            z12 = z11;
                            interfaceC1065q2 = interfaceC1065q4;
                            hVar3 = hVar2;
                        } else {
                            interfaceC1065q2 = interfaceC1065q4;
                            hVar3 = hVar2;
                            pVar3 = pVarB;
                            pVar4 = pVarB2;
                            z12 = z11;
                            c1064pC = c1064p2;
                        }
                    }
                    c1086gP.U();
                    localeA = C1053h.a(c1086gP);
                    zK = c1086gP.K(localeA);
                    objF2 = c1086gP.f();
                    if (zK) {
                        objF2 = new androidx.compose.material3.internal.l(localeA);
                        c1086gP.E(objF2);
                    } else {
                        objF2 = new androidx.compose.material3.internal.l(localeA);
                        c1086gP.E(objF2);
                    }
                    final androidx.compose.material3.internal.k kVar13 = (androidx.compose.material3.internal.k) objF2;
                    c1086gP.L(255587712);
                    if (z12) {
                        composableLambdaImplB = androidx.compose.runtime.internal.a.b(1982226759, new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.material3.DatePickerKt$DatePicker$4
                            {
                                super(2);
                            }

                            @Override // Ia.p
                            public final p293xa.r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                                InterfaceC1084f interfaceC1084f3 = interfaceC1084f2;
                                if ((num.intValue() & 3) == 2 && interfaceC1084f3.s()) {
                                    interfaceC1084f3.w();
                                } else {
                                    androidx.compose.ui.h hVarE = PaddingKt.e(androidx.compose.ui.h.a.f13984b, DatePickerKt.f12142d);
                                    int iB = interfaceC1067t.b();
                                    boolean zK3 = interfaceC1084f3.K(interfaceC1067t);
                                    final InterfaceC1067t interfaceC1067t2 = interfaceC1067t;
                                    Object objF3 = interfaceC1084f3.f();
                                    if (zK3 || objF3 == InterfaceC1084f.a.f12980a) {
                                        objF3 = new Ia.l<C1072y, p293xa.r>() { // from class: androidx.compose.material3.DatePickerKt$DatePicker$4$1$1
                                            {
                                                super(1);
                                            }

                                            @Override // Ia.l
                                            public final p293xa.r invoke(C1072y c1072y) {
                                                interfaceC1067t2.a(c1072y.f12768a);
                                                return p293xa.r.f47939a;
                                            }
                                        };
                                        interfaceC1084f3.E(objF3);
                                    }
                                    DatePickerKt.e(hVarE, iB, (Ia.l) objF3, interfaceC1084f3, 6);
                                }
                                return p293xa.r.f47939a;
                            }
                        }, c1086gP);
                    } else {
                        composableLambdaImplB = null;
                    }
                    c1086gP.T(false);
                    int i2117 = ((i12 >> 3) & 14) | 14155776;
                    int i2118 = i12 >> 6;
                    a(hVar3, pVar3, pVar4, composableLambdaImplB, c1064pC, TypographyKt.a(C0609d.f1247p, c1086gP), C0609d.f1245n, androidx.compose.runtime.internal.a.b(-1840727866, new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.material3.DatePickerKt$DatePicker$5
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
                                Long lF = interfaceC1067t.f();
                                long jE = interfaceC1067t.e();
                                int iB = interfaceC1067t.b();
                                boolean zK3 = interfaceC1084f3.K(interfaceC1067t);
                                final InterfaceC1067t interfaceC1067t2 = interfaceC1067t;
                                Object objF3 = interfaceC1084f3.f();
                                InterfaceC1084f.a.C0153a c0153a2 = InterfaceC1084f.a.f12980a;
                                if (zK3 || objF3 == c0153a2) {
                                    objF3 = new Ia.l<Long, p293xa.r>() { // from class: androidx.compose.material3.DatePickerKt$DatePicker$5$1$1
                                        {
                                            super(1);
                                        }

                                        @Override // Ia.l
                                        public final p293xa.r invoke(Long l10) {
                                            interfaceC1067t2.h(l10);
                                            return p293xa.r.f47939a;
                                        }
                                    };
                                    interfaceC1084f3.E(objF3);
                                }
                                Ia.l lVar = (Ia.l) objF3;
                                boolean zK4 = interfaceC1084f3.K(interfaceC1067t);
                                final InterfaceC1067t interfaceC1067t3 = interfaceC1067t;
                                Object objF4 = interfaceC1084f3.f();
                                if (zK4 || objF4 == c0153a2) {
                                    objF4 = new Ia.l<Long, p293xa.r>() { // from class: androidx.compose.material3.DatePickerKt$DatePicker$5$2$1
                                        {
                                            super(1);
                                        }

                                        @Override // Ia.l
                                        public final p293xa.r invoke(Long l10) {
                                            interfaceC1067t3.c(l10.longValue());
                                            return p293xa.r.f47939a;
                                        }
                                    };
                                    interfaceC1084f3.E(objF4);
                                }
                                DatePickerKt.k(lF, jE, iB, lVar, (Ia.l) objF4, kVar13, interfaceC1067t.g(), interfaceC1065q2, interfaceC1067t.d(), c1064pC, interfaceC1084f3, 0);
                            }
                            return p293xa.r.f47939a;
                        }
                    }, c1086gP), c1086gP, i2117 | (i2118 & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) | (i2118 & 896) | (i2118 & 57344));
                    pVar5 = pVar4;
                    pVar6 = pVar3;
                    interfaceC1065q3 = interfaceC1065q2;
                    hVar4 = hVar3;
                } else {
                    c1086gP.r0();
                    i19 = i10 & 1;
                    c0153a = InterfaceC1084f.a.f12980a;
                    if (i19 != 0) {
                        if (i21 != 0) {
                            hVar2 = androidx.compose.ui.h.a.f13984b;
                        }
                        if ((i11 & 4) != 0) {
                            objF = c1086gP.f();
                            if (objF == c0153a) {
                                DatePickerDefaults datePickerDefaults11117 = DatePickerDefaults.f12132a;
                                objF = new r("yMMMM", "yMMMd", "yMMMMEEEEd");
                                c1086gP.E(objF);
                            }
                            interfaceC1065q4 = (InterfaceC1065q) objF;
                            i12 &= -897;
                        }
                        if (i13 != 0) {
                            pVarB = androidx.compose.runtime.internal.a.b(-1504998463, new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.material3.DatePickerKt$DatePicker$2
                                {
                                    super(2);
                                }

                                @Override // Ia.p
                                public final p293xa.r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                                    InterfaceC1084f interfaceC1084f3 = interfaceC1084f2;
                                    if ((num.intValue() & 3) == 2 && interfaceC1084f3.s()) {
                                        interfaceC1084f3.w();
                                    } else {
                                        DatePickerDefaults.f12132a.b(PaddingKt.e(androidx.compose.ui.h.a.f13984b, DatePickerKt.f12143e), interfaceC1067t.b(), 432, interfaceC1084f3, 0);
                                    }
                                    return p293xa.r.f47939a;
                                }
                            }, c1086gP);
                        }
                        if (i15 != 0) {
                            pVarB2 = androidx.compose.runtime.internal.a.b(-1780043561, new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.material3.DatePickerKt$DatePicker$3
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
                                        DatePickerDefaults.f12132a.a(interfaceC1067t.f(), interfaceC1067t.b(), interfaceC1065q4, PaddingKt.e(androidx.compose.ui.h.a.f13984b, DatePickerKt.f12144f), interfaceC1084f3, 27648, 0);
                                    }
                                    return p293xa.r.f47939a;
                                }
                            }, c1086gP);
                        }
                        if (i17 != 0) {
                            z11 = true;
                        }
                        if ((i11 & 64) != 0) {
                            DatePickerDefaults datePickerDefaults11118 = DatePickerDefaults.f12132a;
                            i12 &= -3670017;
                            c1064pC = DatePickerDefaults.c(c1086gP);
                            pVar3 = pVarB;
                            pVar4 = pVarB2;
                            z12 = z11;
                            interfaceC1065q2 = interfaceC1065q4;
                            hVar3 = hVar2;
                        } else {
                            interfaceC1065q2 = interfaceC1065q4;
                            hVar3 = hVar2;
                            pVar3 = pVarB;
                            pVar4 = pVarB2;
                            z12 = z11;
                            c1064pC = c1064p2;
                        }
                    } else {
                        if (i21 != 0) {
                            hVar2 = androidx.compose.ui.h.a.f13984b;
                        }
                        if ((i11 & 4) != 0) {
                            objF = c1086gP.f();
                            if (objF == c0153a) {
                                DatePickerDefaults datePickerDefaults11119 = DatePickerDefaults.f12132a;
                                objF = new r("yMMMM", "yMMMd", "yMMMMEEEEd");
                                c1086gP.E(objF);
                            }
                            interfaceC1065q4 = (InterfaceC1065q) objF;
                            i12 &= -897;
                        }
                        if (i13 != 0) {
                            pVarB = androidx.compose.runtime.internal.a.b(-1504998463, new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.material3.DatePickerKt$DatePicker$2
                                {
                                    super(2);
                                }

                                @Override // Ia.p
                                public final p293xa.r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                                    InterfaceC1084f interfaceC1084f3 = interfaceC1084f2;
                                    if ((num.intValue() & 3) == 2 && interfaceC1084f3.s()) {
                                        interfaceC1084f3.w();
                                    } else {
                                        DatePickerDefaults.f12132a.b(PaddingKt.e(androidx.compose.ui.h.a.f13984b, DatePickerKt.f12143e), interfaceC1067t.b(), 432, interfaceC1084f3, 0);
                                    }
                                    return p293xa.r.f47939a;
                                }
                            }, c1086gP);
                        }
                        if (i15 != 0) {
                            pVarB2 = androidx.compose.runtime.internal.a.b(-1780043561, new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.material3.DatePickerKt$DatePicker$3
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
                                        DatePickerDefaults.f12132a.a(interfaceC1067t.f(), interfaceC1067t.b(), interfaceC1065q4, PaddingKt.e(androidx.compose.ui.h.a.f13984b, DatePickerKt.f12144f), interfaceC1084f3, 27648, 0);
                                    }
                                    return p293xa.r.f47939a;
                                }
                            }, c1086gP);
                        }
                        if (i17 != 0) {
                            z11 = true;
                        }
                        if ((i11 & 64) != 0) {
                            DatePickerDefaults datePickerDefaults111110 = DatePickerDefaults.f12132a;
                            i12 &= -3670017;
                            c1064pC = DatePickerDefaults.c(c1086gP);
                            pVar3 = pVarB;
                            pVar4 = pVarB2;
                            z12 = z11;
                            interfaceC1065q2 = interfaceC1065q4;
                            hVar3 = hVar2;
                        } else {
                            interfaceC1065q2 = interfaceC1065q4;
                            hVar3 = hVar2;
                            pVar3 = pVarB;
                            pVar4 = pVarB2;
                            z12 = z11;
                            c1064pC = c1064p2;
                        }
                    }
                    c1086gP.U();
                    localeA = C1053h.a(c1086gP);
                    zK = c1086gP.K(localeA);
                    objF2 = c1086gP.f();
                    if (zK) {
                        objF2 = new androidx.compose.material3.internal.l(localeA);
                        c1086gP.E(objF2);
                    } else {
                        objF2 = new androidx.compose.material3.internal.l(localeA);
                        c1086gP.E(objF2);
                    }
                    final androidx.compose.material3.internal.k kVar14 = (androidx.compose.material3.internal.k) objF2;
                    c1086gP.L(255587712);
                    if (z12) {
                        composableLambdaImplB = androidx.compose.runtime.internal.a.b(1982226759, new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.material3.DatePickerKt$DatePicker$4
                            {
                                super(2);
                            }

                            @Override // Ia.p
                            public final p293xa.r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                                InterfaceC1084f interfaceC1084f3 = interfaceC1084f2;
                                if ((num.intValue() & 3) == 2 && interfaceC1084f3.s()) {
                                    interfaceC1084f3.w();
                                } else {
                                    androidx.compose.ui.h hVarE = PaddingKt.e(androidx.compose.ui.h.a.f13984b, DatePickerKt.f12142d);
                                    int iB = interfaceC1067t.b();
                                    boolean zK3 = interfaceC1084f3.K(interfaceC1067t);
                                    final InterfaceC1067t interfaceC1067t2 = interfaceC1067t;
                                    Object objF3 = interfaceC1084f3.f();
                                    if (zK3 || objF3 == InterfaceC1084f.a.f12980a) {
                                        objF3 = new Ia.l<C1072y, p293xa.r>() { // from class: androidx.compose.material3.DatePickerKt$DatePicker$4$1$1
                                            {
                                                super(1);
                                            }

                                            @Override // Ia.l
                                            public final p293xa.r invoke(C1072y c1072y) {
                                                interfaceC1067t2.a(c1072y.f12768a);
                                                return p293xa.r.f47939a;
                                            }
                                        };
                                        interfaceC1084f3.E(objF3);
                                    }
                                    DatePickerKt.e(hVarE, iB, (Ia.l) objF3, interfaceC1084f3, 6);
                                }
                                return p293xa.r.f47939a;
                            }
                        }, c1086gP);
                    } else {
                        composableLambdaImplB = null;
                    }
                    c1086gP.T(false);
                    int i2119 = ((i12 >> 3) & 14) | 14155776;
                    int i21110 = i12 >> 6;
                    a(hVar3, pVar3, pVar4, composableLambdaImplB, c1064pC, TypographyKt.a(C0609d.f1247p, c1086gP), C0609d.f1245n, androidx.compose.runtime.internal.a.b(-1840727866, new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.material3.DatePickerKt$DatePicker$5
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
                                Long lF = interfaceC1067t.f();
                                long jE = interfaceC1067t.e();
                                int iB = interfaceC1067t.b();
                                boolean zK3 = interfaceC1084f3.K(interfaceC1067t);
                                final InterfaceC1067t interfaceC1067t2 = interfaceC1067t;
                                Object objF3 = interfaceC1084f3.f();
                                InterfaceC1084f.a.C0153a c0153a2 = InterfaceC1084f.a.f12980a;
                                if (zK3 || objF3 == c0153a2) {
                                    objF3 = new Ia.l<Long, p293xa.r>() { // from class: androidx.compose.material3.DatePickerKt$DatePicker$5$1$1
                                        {
                                            super(1);
                                        }

                                        @Override // Ia.l
                                        public final p293xa.r invoke(Long l10) {
                                            interfaceC1067t2.h(l10);
                                            return p293xa.r.f47939a;
                                        }
                                    };
                                    interfaceC1084f3.E(objF3);
                                }
                                Ia.l lVar = (Ia.l) objF3;
                                boolean zK4 = interfaceC1084f3.K(interfaceC1067t);
                                final InterfaceC1067t interfaceC1067t3 = interfaceC1067t;
                                Object objF4 = interfaceC1084f3.f();
                                if (zK4 || objF4 == c0153a2) {
                                    objF4 = new Ia.l<Long, p293xa.r>() { // from class: androidx.compose.material3.DatePickerKt$DatePicker$5$2$1
                                        {
                                            super(1);
                                        }

                                        @Override // Ia.l
                                        public final p293xa.r invoke(Long l10) {
                                            interfaceC1067t3.c(l10.longValue());
                                            return p293xa.r.f47939a;
                                        }
                                    };
                                    interfaceC1084f3.E(objF4);
                                }
                                DatePickerKt.k(lF, jE, iB, lVar, (Ia.l) objF4, kVar14, interfaceC1067t.g(), interfaceC1065q2, interfaceC1067t.d(), c1064pC, interfaceC1084f3, 0);
                            }
                            return p293xa.r.f47939a;
                        }
                    }, c1086gP), c1086gP, i2119 | (i21110 & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) | (i21110 & 896) | (i21110 & 57344));
                    pVar5 = pVar4;
                    pVar6 = pVar3;
                    interfaceC1065q3 = interfaceC1065q2;
                    hVar4 = hVar3;
                }
                c1105p0V = c1086gP.V();
                if (c1105p0V != null) {
                    final boolean z19 = z12;
                    final C1064p c1064p9 = c1064pC;
                    c1105p0V.f13109d = new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.material3.DatePickerKt$DatePicker$6
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        /* JADX WARN: Multi-variable type inference failed */
                        {
                            super(2);
                        }

                        @Override // Ia.p
                        public final p293xa.r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                            num.intValue();
                            DatePickerKt.b(interfaceC1067t, hVar4, interfaceC1065q3, pVar6, pVar5, z19, c1064p9, interfaceC1084f2, L4.b.l(i10 | 1), i11);
                            return p293xa.r.f47939a;
                        }
                    };
                }
            }
            i12 |= 196608;
            z11 = z10;
            if ((1572864 & i10) == 0) {
                if ((i11 & 64) == 0) {
                    c1064p2 = c1064p;
                    if (c1086gP.K(c1064p2)) {
                    }
                    i12 |= i22;
                } else {
                    c1064p2 = c1064p;
                }
                i12 |= i22;
            } else {
                c1064p2 = c1064p;
            }
            if ((i12 & 599187) == 599186) {
                c1086gP.r0();
                i19 = i10 & 1;
                c0153a = InterfaceC1084f.a.f12980a;
                if (i19 != 0) {
                    if (i21 != 0) {
                        hVar2 = androidx.compose.ui.h.a.f13984b;
                    }
                    if ((i11 & 4) != 0) {
                        objF = c1086gP.f();
                        if (objF == c0153a) {
                            DatePickerDefaults datePickerDefaults111111 = DatePickerDefaults.f12132a;
                            objF = new r("yMMMM", "yMMMd", "yMMMMEEEEd");
                            c1086gP.E(objF);
                        }
                        interfaceC1065q4 = (InterfaceC1065q) objF;
                        i12 &= -897;
                    }
                    if (i13 != 0) {
                        pVarB = androidx.compose.runtime.internal.a.b(-1504998463, new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.material3.DatePickerKt$DatePicker$2
                            {
                                super(2);
                            }

                            @Override // Ia.p
                            public final p293xa.r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                                InterfaceC1084f interfaceC1084f3 = interfaceC1084f2;
                                if ((num.intValue() & 3) == 2 && interfaceC1084f3.s()) {
                                    interfaceC1084f3.w();
                                } else {
                                    DatePickerDefaults.f12132a.b(PaddingKt.e(androidx.compose.ui.h.a.f13984b, DatePickerKt.f12143e), interfaceC1067t.b(), 432, interfaceC1084f3, 0);
                                }
                                return p293xa.r.f47939a;
                            }
                        }, c1086gP);
                    }
                    if (i15 != 0) {
                        pVarB2 = androidx.compose.runtime.internal.a.b(-1780043561, new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.material3.DatePickerKt$DatePicker$3
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
                                    DatePickerDefaults.f12132a.a(interfaceC1067t.f(), interfaceC1067t.b(), interfaceC1065q4, PaddingKt.e(androidx.compose.ui.h.a.f13984b, DatePickerKt.f12144f), interfaceC1084f3, 27648, 0);
                                }
                                return p293xa.r.f47939a;
                            }
                        }, c1086gP);
                    }
                    if (i17 != 0) {
                        z11 = true;
                    }
                    if ((i11 & 64) != 0) {
                        DatePickerDefaults datePickerDefaults111112 = DatePickerDefaults.f12132a;
                        i12 &= -3670017;
                        c1064pC = DatePickerDefaults.c(c1086gP);
                        pVar3 = pVarB;
                        pVar4 = pVarB2;
                        z12 = z11;
                        interfaceC1065q2 = interfaceC1065q4;
                        hVar3 = hVar2;
                    } else {
                        interfaceC1065q2 = interfaceC1065q4;
                        hVar3 = hVar2;
                        pVar3 = pVarB;
                        pVar4 = pVarB2;
                        z12 = z11;
                        c1064pC = c1064p2;
                    }
                } else {
                    if (i21 != 0) {
                        hVar2 = androidx.compose.ui.h.a.f13984b;
                    }
                    if ((i11 & 4) != 0) {
                        objF = c1086gP.f();
                        if (objF == c0153a) {
                            DatePickerDefaults datePickerDefaults111113 = DatePickerDefaults.f12132a;
                            objF = new r("yMMMM", "yMMMd", "yMMMMEEEEd");
                            c1086gP.E(objF);
                        }
                        interfaceC1065q4 = (InterfaceC1065q) objF;
                        i12 &= -897;
                    }
                    if (i13 != 0) {
                        pVarB = androidx.compose.runtime.internal.a.b(-1504998463, new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.material3.DatePickerKt$DatePicker$2
                            {
                                super(2);
                            }

                            @Override // Ia.p
                            public final p293xa.r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                                InterfaceC1084f interfaceC1084f3 = interfaceC1084f2;
                                if ((num.intValue() & 3) == 2 && interfaceC1084f3.s()) {
                                    interfaceC1084f3.w();
                                } else {
                                    DatePickerDefaults.f12132a.b(PaddingKt.e(androidx.compose.ui.h.a.f13984b, DatePickerKt.f12143e), interfaceC1067t.b(), 432, interfaceC1084f3, 0);
                                }
                                return p293xa.r.f47939a;
                            }
                        }, c1086gP);
                    }
                    if (i15 != 0) {
                        pVarB2 = androidx.compose.runtime.internal.a.b(-1780043561, new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.material3.DatePickerKt$DatePicker$3
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
                                    DatePickerDefaults.f12132a.a(interfaceC1067t.f(), interfaceC1067t.b(), interfaceC1065q4, PaddingKt.e(androidx.compose.ui.h.a.f13984b, DatePickerKt.f12144f), interfaceC1084f3, 27648, 0);
                                }
                                return p293xa.r.f47939a;
                            }
                        }, c1086gP);
                    }
                    if (i17 != 0) {
                        z11 = true;
                    }
                    if ((i11 & 64) != 0) {
                        DatePickerDefaults datePickerDefaults111114 = DatePickerDefaults.f12132a;
                        i12 &= -3670017;
                        c1064pC = DatePickerDefaults.c(c1086gP);
                        pVar3 = pVarB;
                        pVar4 = pVarB2;
                        z12 = z11;
                        interfaceC1065q2 = interfaceC1065q4;
                        hVar3 = hVar2;
                    } else {
                        interfaceC1065q2 = interfaceC1065q4;
                        hVar3 = hVar2;
                        pVar3 = pVarB;
                        pVar4 = pVarB2;
                        z12 = z11;
                        c1064pC = c1064p2;
                    }
                }
                c1086gP.U();
                localeA = C1053h.a(c1086gP);
                zK = c1086gP.K(localeA);
                objF2 = c1086gP.f();
                if (zK) {
                    objF2 = new androidx.compose.material3.internal.l(localeA);
                    c1086gP.E(objF2);
                } else {
                    objF2 = new androidx.compose.material3.internal.l(localeA);
                    c1086gP.E(objF2);
                }
                final androidx.compose.material3.internal.k kVar15 = (androidx.compose.material3.internal.k) objF2;
                c1086gP.L(255587712);
                if (z12) {
                    composableLambdaImplB = androidx.compose.runtime.internal.a.b(1982226759, new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.material3.DatePickerKt$DatePicker$4
                        {
                            super(2);
                        }

                        @Override // Ia.p
                        public final p293xa.r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                            InterfaceC1084f interfaceC1084f3 = interfaceC1084f2;
                            if ((num.intValue() & 3) == 2 && interfaceC1084f3.s()) {
                                interfaceC1084f3.w();
                            } else {
                                androidx.compose.ui.h hVarE = PaddingKt.e(androidx.compose.ui.h.a.f13984b, DatePickerKt.f12142d);
                                int iB = interfaceC1067t.b();
                                boolean zK3 = interfaceC1084f3.K(interfaceC1067t);
                                final InterfaceC1067t interfaceC1067t2 = interfaceC1067t;
                                Object objF3 = interfaceC1084f3.f();
                                if (zK3 || objF3 == InterfaceC1084f.a.f12980a) {
                                    objF3 = new Ia.l<C1072y, p293xa.r>() { // from class: androidx.compose.material3.DatePickerKt$DatePicker$4$1$1
                                        {
                                            super(1);
                                        }

                                        @Override // Ia.l
                                        public final p293xa.r invoke(C1072y c1072y) {
                                            interfaceC1067t2.a(c1072y.f12768a);
                                            return p293xa.r.f47939a;
                                        }
                                    };
                                    interfaceC1084f3.E(objF3);
                                }
                                DatePickerKt.e(hVarE, iB, (Ia.l) objF3, interfaceC1084f3, 6);
                            }
                            return p293xa.r.f47939a;
                        }
                    }, c1086gP);
                } else {
                    composableLambdaImplB = null;
                }
                c1086gP.T(false);
                int i21111 = ((i12 >> 3) & 14) | 14155776;
                int i21112 = i12 >> 6;
                a(hVar3, pVar3, pVar4, composableLambdaImplB, c1064pC, TypographyKt.a(C0609d.f1247p, c1086gP), C0609d.f1245n, androidx.compose.runtime.internal.a.b(-1840727866, new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.material3.DatePickerKt$DatePicker$5
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
                            Long lF = interfaceC1067t.f();
                            long jE = interfaceC1067t.e();
                            int iB = interfaceC1067t.b();
                            boolean zK3 = interfaceC1084f3.K(interfaceC1067t);
                            final InterfaceC1067t interfaceC1067t2 = interfaceC1067t;
                            Object objF3 = interfaceC1084f3.f();
                            InterfaceC1084f.a.C0153a c0153a2 = InterfaceC1084f.a.f12980a;
                            if (zK3 || objF3 == c0153a2) {
                                objF3 = new Ia.l<Long, p293xa.r>() { // from class: androidx.compose.material3.DatePickerKt$DatePicker$5$1$1
                                    {
                                        super(1);
                                    }

                                    @Override // Ia.l
                                    public final p293xa.r invoke(Long l10) {
                                        interfaceC1067t2.h(l10);
                                        return p293xa.r.f47939a;
                                    }
                                };
                                interfaceC1084f3.E(objF3);
                            }
                            Ia.l lVar = (Ia.l) objF3;
                            boolean zK4 = interfaceC1084f3.K(interfaceC1067t);
                            final InterfaceC1067t interfaceC1067t3 = interfaceC1067t;
                            Object objF4 = interfaceC1084f3.f();
                            if (zK4 || objF4 == c0153a2) {
                                objF4 = new Ia.l<Long, p293xa.r>() { // from class: androidx.compose.material3.DatePickerKt$DatePicker$5$2$1
                                    {
                                        super(1);
                                    }

                                    @Override // Ia.l
                                    public final p293xa.r invoke(Long l10) {
                                        interfaceC1067t3.c(l10.longValue());
                                        return p293xa.r.f47939a;
                                    }
                                };
                                interfaceC1084f3.E(objF4);
                            }
                            DatePickerKt.k(lF, jE, iB, lVar, (Ia.l) objF4, kVar15, interfaceC1067t.g(), interfaceC1065q2, interfaceC1067t.d(), c1064pC, interfaceC1084f3, 0);
                        }
                        return p293xa.r.f47939a;
                    }
                }, c1086gP), c1086gP, i21111 | (i21112 & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) | (i21112 & 896) | (i21112 & 57344));
                pVar5 = pVar4;
                pVar6 = pVar3;
                interfaceC1065q3 = interfaceC1065q2;
                hVar4 = hVar3;
            } else {
                c1086gP.r0();
                i19 = i10 & 1;
                c0153a = InterfaceC1084f.a.f12980a;
                if (i19 != 0) {
                    if (i21 != 0) {
                        hVar2 = androidx.compose.ui.h.a.f13984b;
                    }
                    if ((i11 & 4) != 0) {
                        objF = c1086gP.f();
                        if (objF == c0153a) {
                            DatePickerDefaults datePickerDefaults111115 = DatePickerDefaults.f12132a;
                            objF = new r("yMMMM", "yMMMd", "yMMMMEEEEd");
                            c1086gP.E(objF);
                        }
                        interfaceC1065q4 = (InterfaceC1065q) objF;
                        i12 &= -897;
                    }
                    if (i13 != 0) {
                        pVarB = androidx.compose.runtime.internal.a.b(-1504998463, new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.material3.DatePickerKt$DatePicker$2
                            {
                                super(2);
                            }

                            @Override // Ia.p
                            public final p293xa.r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                                InterfaceC1084f interfaceC1084f3 = interfaceC1084f2;
                                if ((num.intValue() & 3) == 2 && interfaceC1084f3.s()) {
                                    interfaceC1084f3.w();
                                } else {
                                    DatePickerDefaults.f12132a.b(PaddingKt.e(androidx.compose.ui.h.a.f13984b, DatePickerKt.f12143e), interfaceC1067t.b(), 432, interfaceC1084f3, 0);
                                }
                                return p293xa.r.f47939a;
                            }
                        }, c1086gP);
                    }
                    if (i15 != 0) {
                        pVarB2 = androidx.compose.runtime.internal.a.b(-1780043561, new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.material3.DatePickerKt$DatePicker$3
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
                                    DatePickerDefaults.f12132a.a(interfaceC1067t.f(), interfaceC1067t.b(), interfaceC1065q4, PaddingKt.e(androidx.compose.ui.h.a.f13984b, DatePickerKt.f12144f), interfaceC1084f3, 27648, 0);
                                }
                                return p293xa.r.f47939a;
                            }
                        }, c1086gP);
                    }
                    if (i17 != 0) {
                        z11 = true;
                    }
                    if ((i11 & 64) != 0) {
                        DatePickerDefaults datePickerDefaults111116 = DatePickerDefaults.f12132a;
                        i12 &= -3670017;
                        c1064pC = DatePickerDefaults.c(c1086gP);
                        pVar3 = pVarB;
                        pVar4 = pVarB2;
                        z12 = z11;
                        interfaceC1065q2 = interfaceC1065q4;
                        hVar3 = hVar2;
                    } else {
                        interfaceC1065q2 = interfaceC1065q4;
                        hVar3 = hVar2;
                        pVar3 = pVarB;
                        pVar4 = pVarB2;
                        z12 = z11;
                        c1064pC = c1064p2;
                    }
                } else {
                    if (i21 != 0) {
                        hVar2 = androidx.compose.ui.h.a.f13984b;
                    }
                    if ((i11 & 4) != 0) {
                        objF = c1086gP.f();
                        if (objF == c0153a) {
                            DatePickerDefaults datePickerDefaults111117 = DatePickerDefaults.f12132a;
                            objF = new r("yMMMM", "yMMMd", "yMMMMEEEEd");
                            c1086gP.E(objF);
                        }
                        interfaceC1065q4 = (InterfaceC1065q) objF;
                        i12 &= -897;
                    }
                    if (i13 != 0) {
                        pVarB = androidx.compose.runtime.internal.a.b(-1504998463, new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.material3.DatePickerKt$DatePicker$2
                            {
                                super(2);
                            }

                            @Override // Ia.p
                            public final p293xa.r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                                InterfaceC1084f interfaceC1084f3 = interfaceC1084f2;
                                if ((num.intValue() & 3) == 2 && interfaceC1084f3.s()) {
                                    interfaceC1084f3.w();
                                } else {
                                    DatePickerDefaults.f12132a.b(PaddingKt.e(androidx.compose.ui.h.a.f13984b, DatePickerKt.f12143e), interfaceC1067t.b(), 432, interfaceC1084f3, 0);
                                }
                                return p293xa.r.f47939a;
                            }
                        }, c1086gP);
                    }
                    if (i15 != 0) {
                        pVarB2 = androidx.compose.runtime.internal.a.b(-1780043561, new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.material3.DatePickerKt$DatePicker$3
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
                                    DatePickerDefaults.f12132a.a(interfaceC1067t.f(), interfaceC1067t.b(), interfaceC1065q4, PaddingKt.e(androidx.compose.ui.h.a.f13984b, DatePickerKt.f12144f), interfaceC1084f3, 27648, 0);
                                }
                                return p293xa.r.f47939a;
                            }
                        }, c1086gP);
                    }
                    if (i17 != 0) {
                        z11 = true;
                    }
                    if ((i11 & 64) != 0) {
                        DatePickerDefaults datePickerDefaults111118 = DatePickerDefaults.f12132a;
                        i12 &= -3670017;
                        c1064pC = DatePickerDefaults.c(c1086gP);
                        pVar3 = pVarB;
                        pVar4 = pVarB2;
                        z12 = z11;
                        interfaceC1065q2 = interfaceC1065q4;
                        hVar3 = hVar2;
                    } else {
                        interfaceC1065q2 = interfaceC1065q4;
                        hVar3 = hVar2;
                        pVar3 = pVarB;
                        pVar4 = pVarB2;
                        z12 = z11;
                        c1064pC = c1064p2;
                    }
                }
                c1086gP.U();
                localeA = C1053h.a(c1086gP);
                zK = c1086gP.K(localeA);
                objF2 = c1086gP.f();
                if (zK) {
                    objF2 = new androidx.compose.material3.internal.l(localeA);
                    c1086gP.E(objF2);
                } else {
                    objF2 = new androidx.compose.material3.internal.l(localeA);
                    c1086gP.E(objF2);
                }
                final androidx.compose.material3.internal.k kVar16 = (androidx.compose.material3.internal.k) objF2;
                c1086gP.L(255587712);
                if (z12) {
                    composableLambdaImplB = androidx.compose.runtime.internal.a.b(1982226759, new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.material3.DatePickerKt$DatePicker$4
                        {
                            super(2);
                        }

                        @Override // Ia.p
                        public final p293xa.r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                            InterfaceC1084f interfaceC1084f3 = interfaceC1084f2;
                            if ((num.intValue() & 3) == 2 && interfaceC1084f3.s()) {
                                interfaceC1084f3.w();
                            } else {
                                androidx.compose.ui.h hVarE = PaddingKt.e(androidx.compose.ui.h.a.f13984b, DatePickerKt.f12142d);
                                int iB = interfaceC1067t.b();
                                boolean zK3 = interfaceC1084f3.K(interfaceC1067t);
                                final InterfaceC1067t interfaceC1067t2 = interfaceC1067t;
                                Object objF3 = interfaceC1084f3.f();
                                if (zK3 || objF3 == InterfaceC1084f.a.f12980a) {
                                    objF3 = new Ia.l<C1072y, p293xa.r>() { // from class: androidx.compose.material3.DatePickerKt$DatePicker$4$1$1
                                        {
                                            super(1);
                                        }

                                        @Override // Ia.l
                                        public final p293xa.r invoke(C1072y c1072y) {
                                            interfaceC1067t2.a(c1072y.f12768a);
                                            return p293xa.r.f47939a;
                                        }
                                    };
                                    interfaceC1084f3.E(objF3);
                                }
                                DatePickerKt.e(hVarE, iB, (Ia.l) objF3, interfaceC1084f3, 6);
                            }
                            return p293xa.r.f47939a;
                        }
                    }, c1086gP);
                } else {
                    composableLambdaImplB = null;
                }
                c1086gP.T(false);
                int i21113 = ((i12 >> 3) & 14) | 14155776;
                int i21114 = i12 >> 6;
                a(hVar3, pVar3, pVar4, composableLambdaImplB, c1064pC, TypographyKt.a(C0609d.f1247p, c1086gP), C0609d.f1245n, androidx.compose.runtime.internal.a.b(-1840727866, new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.material3.DatePickerKt$DatePicker$5
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
                            Long lF = interfaceC1067t.f();
                            long jE = interfaceC1067t.e();
                            int iB = interfaceC1067t.b();
                            boolean zK3 = interfaceC1084f3.K(interfaceC1067t);
                            final InterfaceC1067t interfaceC1067t2 = interfaceC1067t;
                            Object objF3 = interfaceC1084f3.f();
                            InterfaceC1084f.a.C0153a c0153a2 = InterfaceC1084f.a.f12980a;
                            if (zK3 || objF3 == c0153a2) {
                                objF3 = new Ia.l<Long, p293xa.r>() { // from class: androidx.compose.material3.DatePickerKt$DatePicker$5$1$1
                                    {
                                        super(1);
                                    }

                                    @Override // Ia.l
                                    public final p293xa.r invoke(Long l10) {
                                        interfaceC1067t2.h(l10);
                                        return p293xa.r.f47939a;
                                    }
                                };
                                interfaceC1084f3.E(objF3);
                            }
                            Ia.l lVar = (Ia.l) objF3;
                            boolean zK4 = interfaceC1084f3.K(interfaceC1067t);
                            final InterfaceC1067t interfaceC1067t3 = interfaceC1067t;
                            Object objF4 = interfaceC1084f3.f();
                            if (zK4 || objF4 == c0153a2) {
                                objF4 = new Ia.l<Long, p293xa.r>() { // from class: androidx.compose.material3.DatePickerKt$DatePicker$5$2$1
                                    {
                                        super(1);
                                    }

                                    @Override // Ia.l
                                    public final p293xa.r invoke(Long l10) {
                                        interfaceC1067t3.c(l10.longValue());
                                        return p293xa.r.f47939a;
                                    }
                                };
                                interfaceC1084f3.E(objF4);
                            }
                            DatePickerKt.k(lF, jE, iB, lVar, (Ia.l) objF4, kVar16, interfaceC1067t.g(), interfaceC1065q2, interfaceC1067t.d(), c1064pC, interfaceC1084f3, 0);
                        }
                        return p293xa.r.f47939a;
                    }
                }, c1086gP), c1086gP, i21113 | (i21114 & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) | (i21114 & 896) | (i21114 & 57344));
                pVar5 = pVar4;
                pVar6 = pVar3;
                interfaceC1065q3 = interfaceC1065q2;
                hVar4 = hVar3;
            }
            c1105p0V = c1086gP.V();
            if (c1105p0V != null) {
                final boolean z110 = z12;
                final C1064p c1064p10 = c1064pC;
                c1105p0V.f13109d = new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.material3.DatePickerKt$DatePicker$6
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(2);
                    }

                    @Override // Ia.p
                    public final p293xa.r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                        num.intValue();
                        DatePickerKt.b(interfaceC1067t, hVar4, interfaceC1065q3, pVar6, pVar5, z110, c1064p10, interfaceC1084f2, L4.b.l(i10 | 1), i11);
                        return p293xa.r.f47939a;
                    }
                };
            }
        }
        i12 |= 48;
        hVar2 = hVar;
        if ((i10 & 384) == 0) {
            if ((i11 & 4) != 0) {
                i20 = 128;
            } else {
                if ((i10 & 512) == 0) {
                    zK2 = c1086gP.K(interfaceC1065q4);
                } else {
                    zK2 = c1086gP.k(interfaceC1065q4);
                }
                if (zK2) {
                    i20 = 256;
                } else {
                    i20 = 128;
                }
            }
            i12 |= i20;
        }
        i13 = i11 & 8;
        if (i13 != 0) {
            if ((i10 & 3072) == 0) {
                pVarB = pVar;
                if (c1086gP.k(pVarB)) {
                    i14 = 2048;
                } else {
                    i14 = 1024;
                }
                i12 |= i14;
            }
            i15 = i11 & 16;
            if (i15 != 0) {
                if ((i10 & 24576) == 0) {
                    pVarB2 = pVar2;
                    if (c1086gP.k(pVarB2)) {
                        i16 = 16384;
                    } else {
                        i16 = 8192;
                    }
                    i12 |= i16;
                }
                i17 = i11 & 32;
                if (i17 != 0) {
                    if ((196608 & i10) == 0) {
                        z11 = z10;
                        if (c1086gP.c(z11)) {
                            i18 = 131072;
                        } else {
                            i18 = 65536;
                        }
                        i12 |= i18;
                    }
                    if ((1572864 & i10) == 0) {
                        if ((i11 & 64) == 0) {
                            c1064p2 = c1064p;
                            if (c1086gP.K(c1064p2)) {
                            }
                            i12 |= i22;
                        } else {
                            c1064p2 = c1064p;
                        }
                        i12 |= i22;
                    } else {
                        c1064p2 = c1064p;
                    }
                    if ((i12 & 599187) == 599186) {
                        c1086gP.r0();
                        i19 = i10 & 1;
                        c0153a = InterfaceC1084f.a.f12980a;
                        if (i19 != 0) {
                            if (i21 != 0) {
                                hVar2 = androidx.compose.ui.h.a.f13984b;
                            }
                            if ((i11 & 4) != 0) {
                                objF = c1086gP.f();
                                if (objF == c0153a) {
                                    DatePickerDefaults datePickerDefaults111119 = DatePickerDefaults.f12132a;
                                    objF = new r("yMMMM", "yMMMd", "yMMMMEEEEd");
                                    c1086gP.E(objF);
                                }
                                interfaceC1065q4 = (InterfaceC1065q) objF;
                                i12 &= -897;
                            }
                            if (i13 != 0) {
                                pVarB = androidx.compose.runtime.internal.a.b(-1504998463, new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.material3.DatePickerKt$DatePicker$2
                                    {
                                        super(2);
                                    }

                                    @Override // Ia.p
                                    public final p293xa.r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                                        InterfaceC1084f interfaceC1084f3 = interfaceC1084f2;
                                        if ((num.intValue() & 3) == 2 && interfaceC1084f3.s()) {
                                            interfaceC1084f3.w();
                                        } else {
                                            DatePickerDefaults.f12132a.b(PaddingKt.e(androidx.compose.ui.h.a.f13984b, DatePickerKt.f12143e), interfaceC1067t.b(), 432, interfaceC1084f3, 0);
                                        }
                                        return p293xa.r.f47939a;
                                    }
                                }, c1086gP);
                            }
                            if (i15 != 0) {
                                pVarB2 = androidx.compose.runtime.internal.a.b(-1780043561, new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.material3.DatePickerKt$DatePicker$3
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
                                            DatePickerDefaults.f12132a.a(interfaceC1067t.f(), interfaceC1067t.b(), interfaceC1065q4, PaddingKt.e(androidx.compose.ui.h.a.f13984b, DatePickerKt.f12144f), interfaceC1084f3, 27648, 0);
                                        }
                                        return p293xa.r.f47939a;
                                    }
                                }, c1086gP);
                            }
                            if (i17 != 0) {
                                z11 = true;
                            }
                            if ((i11 & 64) != 0) {
                                DatePickerDefaults datePickerDefaults1111110 = DatePickerDefaults.f12132a;
                                i12 &= -3670017;
                                c1064pC = DatePickerDefaults.c(c1086gP);
                                pVar3 = pVarB;
                                pVar4 = pVarB2;
                                z12 = z11;
                                interfaceC1065q2 = interfaceC1065q4;
                                hVar3 = hVar2;
                            } else {
                                interfaceC1065q2 = interfaceC1065q4;
                                hVar3 = hVar2;
                                pVar3 = pVarB;
                                pVar4 = pVarB2;
                                z12 = z11;
                                c1064pC = c1064p2;
                            }
                        } else {
                            if (i21 != 0) {
                                hVar2 = androidx.compose.ui.h.a.f13984b;
                            }
                            if ((i11 & 4) != 0) {
                                objF = c1086gP.f();
                                if (objF == c0153a) {
                                    DatePickerDefaults datePickerDefaults1111111 = DatePickerDefaults.f12132a;
                                    objF = new r("yMMMM", "yMMMd", "yMMMMEEEEd");
                                    c1086gP.E(objF);
                                }
                                interfaceC1065q4 = (InterfaceC1065q) objF;
                                i12 &= -897;
                            }
                            if (i13 != 0) {
                                pVarB = androidx.compose.runtime.internal.a.b(-1504998463, new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.material3.DatePickerKt$DatePicker$2
                                    {
                                        super(2);
                                    }

                                    @Override // Ia.p
                                    public final p293xa.r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                                        InterfaceC1084f interfaceC1084f3 = interfaceC1084f2;
                                        if ((num.intValue() & 3) == 2 && interfaceC1084f3.s()) {
                                            interfaceC1084f3.w();
                                        } else {
                                            DatePickerDefaults.f12132a.b(PaddingKt.e(androidx.compose.ui.h.a.f13984b, DatePickerKt.f12143e), interfaceC1067t.b(), 432, interfaceC1084f3, 0);
                                        }
                                        return p293xa.r.f47939a;
                                    }
                                }, c1086gP);
                            }
                            if (i15 != 0) {
                                pVarB2 = androidx.compose.runtime.internal.a.b(-1780043561, new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.material3.DatePickerKt$DatePicker$3
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
                                            DatePickerDefaults.f12132a.a(interfaceC1067t.f(), interfaceC1067t.b(), interfaceC1065q4, PaddingKt.e(androidx.compose.ui.h.a.f13984b, DatePickerKt.f12144f), interfaceC1084f3, 27648, 0);
                                        }
                                        return p293xa.r.f47939a;
                                    }
                                }, c1086gP);
                            }
                            if (i17 != 0) {
                                z11 = true;
                            }
                            if ((i11 & 64) != 0) {
                                DatePickerDefaults datePickerDefaults1111112 = DatePickerDefaults.f12132a;
                                i12 &= -3670017;
                                c1064pC = DatePickerDefaults.c(c1086gP);
                                pVar3 = pVarB;
                                pVar4 = pVarB2;
                                z12 = z11;
                                interfaceC1065q2 = interfaceC1065q4;
                                hVar3 = hVar2;
                            } else {
                                interfaceC1065q2 = interfaceC1065q4;
                                hVar3 = hVar2;
                                pVar3 = pVarB;
                                pVar4 = pVarB2;
                                z12 = z11;
                                c1064pC = c1064p2;
                            }
                        }
                        c1086gP.U();
                        localeA = C1053h.a(c1086gP);
                        zK = c1086gP.K(localeA);
                        objF2 = c1086gP.f();
                        if (zK) {
                            objF2 = new androidx.compose.material3.internal.l(localeA);
                            c1086gP.E(objF2);
                        } else {
                            objF2 = new androidx.compose.material3.internal.l(localeA);
                            c1086gP.E(objF2);
                        }
                        final androidx.compose.material3.internal.k kVar17 = (androidx.compose.material3.internal.k) objF2;
                        c1086gP.L(255587712);
                        if (z12) {
                            composableLambdaImplB = androidx.compose.runtime.internal.a.b(1982226759, new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.material3.DatePickerKt$DatePicker$4
                                {
                                    super(2);
                                }

                                @Override // Ia.p
                                public final p293xa.r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                                    InterfaceC1084f interfaceC1084f3 = interfaceC1084f2;
                                    if ((num.intValue() & 3) == 2 && interfaceC1084f3.s()) {
                                        interfaceC1084f3.w();
                                    } else {
                                        androidx.compose.ui.h hVarE = PaddingKt.e(androidx.compose.ui.h.a.f13984b, DatePickerKt.f12142d);
                                        int iB = interfaceC1067t.b();
                                        boolean zK3 = interfaceC1084f3.K(interfaceC1067t);
                                        final InterfaceC1067t interfaceC1067t2 = interfaceC1067t;
                                        Object objF3 = interfaceC1084f3.f();
                                        if (zK3 || objF3 == InterfaceC1084f.a.f12980a) {
                                            objF3 = new Ia.l<C1072y, p293xa.r>() { // from class: androidx.compose.material3.DatePickerKt$DatePicker$4$1$1
                                                {
                                                    super(1);
                                                }

                                                @Override // Ia.l
                                                public final p293xa.r invoke(C1072y c1072y) {
                                                    interfaceC1067t2.a(c1072y.f12768a);
                                                    return p293xa.r.f47939a;
                                                }
                                            };
                                            interfaceC1084f3.E(objF3);
                                        }
                                        DatePickerKt.e(hVarE, iB, (Ia.l) objF3, interfaceC1084f3, 6);
                                    }
                                    return p293xa.r.f47939a;
                                }
                            }, c1086gP);
                        } else {
                            composableLambdaImplB = null;
                        }
                        c1086gP.T(false);
                        int i21115 = ((i12 >> 3) & 14) | 14155776;
                        int i21116 = i12 >> 6;
                        a(hVar3, pVar3, pVar4, composableLambdaImplB, c1064pC, TypographyKt.a(C0609d.f1247p, c1086gP), C0609d.f1245n, androidx.compose.runtime.internal.a.b(-1840727866, new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.material3.DatePickerKt$DatePicker$5
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
                                    Long lF = interfaceC1067t.f();
                                    long jE = interfaceC1067t.e();
                                    int iB = interfaceC1067t.b();
                                    boolean zK3 = interfaceC1084f3.K(interfaceC1067t);
                                    final InterfaceC1067t interfaceC1067t2 = interfaceC1067t;
                                    Object objF3 = interfaceC1084f3.f();
                                    InterfaceC1084f.a.C0153a c0153a2 = InterfaceC1084f.a.f12980a;
                                    if (zK3 || objF3 == c0153a2) {
                                        objF3 = new Ia.l<Long, p293xa.r>() { // from class: androidx.compose.material3.DatePickerKt$DatePicker$5$1$1
                                            {
                                                super(1);
                                            }

                                            @Override // Ia.l
                                            public final p293xa.r invoke(Long l10) {
                                                interfaceC1067t2.h(l10);
                                                return p293xa.r.f47939a;
                                            }
                                        };
                                        interfaceC1084f3.E(objF3);
                                    }
                                    Ia.l lVar = (Ia.l) objF3;
                                    boolean zK4 = interfaceC1084f3.K(interfaceC1067t);
                                    final InterfaceC1067t interfaceC1067t3 = interfaceC1067t;
                                    Object objF4 = interfaceC1084f3.f();
                                    if (zK4 || objF4 == c0153a2) {
                                        objF4 = new Ia.l<Long, p293xa.r>() { // from class: androidx.compose.material3.DatePickerKt$DatePicker$5$2$1
                                            {
                                                super(1);
                                            }

                                            @Override // Ia.l
                                            public final p293xa.r invoke(Long l10) {
                                                interfaceC1067t3.c(l10.longValue());
                                                return p293xa.r.f47939a;
                                            }
                                        };
                                        interfaceC1084f3.E(objF4);
                                    }
                                    DatePickerKt.k(lF, jE, iB, lVar, (Ia.l) objF4, kVar17, interfaceC1067t.g(), interfaceC1065q2, interfaceC1067t.d(), c1064pC, interfaceC1084f3, 0);
                                }
                                return p293xa.r.f47939a;
                            }
                        }, c1086gP), c1086gP, i21115 | (i21116 & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) | (i21116 & 896) | (i21116 & 57344));
                        pVar5 = pVar4;
                        pVar6 = pVar3;
                        interfaceC1065q3 = interfaceC1065q2;
                        hVar4 = hVar3;
                    } else {
                        c1086gP.r0();
                        i19 = i10 & 1;
                        c0153a = InterfaceC1084f.a.f12980a;
                        if (i19 != 0) {
                            if (i21 != 0) {
                                hVar2 = androidx.compose.ui.h.a.f13984b;
                            }
                            if ((i11 & 4) != 0) {
                                objF = c1086gP.f();
                                if (objF == c0153a) {
                                    DatePickerDefaults datePickerDefaults1111113 = DatePickerDefaults.f12132a;
                                    objF = new r("yMMMM", "yMMMd", "yMMMMEEEEd");
                                    c1086gP.E(objF);
                                }
                                interfaceC1065q4 = (InterfaceC1065q) objF;
                                i12 &= -897;
                            }
                            if (i13 != 0) {
                                pVarB = androidx.compose.runtime.internal.a.b(-1504998463, new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.material3.DatePickerKt$DatePicker$2
                                    {
                                        super(2);
                                    }

                                    @Override // Ia.p
                                    public final p293xa.r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                                        InterfaceC1084f interfaceC1084f3 = interfaceC1084f2;
                                        if ((num.intValue() & 3) == 2 && interfaceC1084f3.s()) {
                                            interfaceC1084f3.w();
                                        } else {
                                            DatePickerDefaults.f12132a.b(PaddingKt.e(androidx.compose.ui.h.a.f13984b, DatePickerKt.f12143e), interfaceC1067t.b(), 432, interfaceC1084f3, 0);
                                        }
                                        return p293xa.r.f47939a;
                                    }
                                }, c1086gP);
                            }
                            if (i15 != 0) {
                                pVarB2 = androidx.compose.runtime.internal.a.b(-1780043561, new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.material3.DatePickerKt$DatePicker$3
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
                                            DatePickerDefaults.f12132a.a(interfaceC1067t.f(), interfaceC1067t.b(), interfaceC1065q4, PaddingKt.e(androidx.compose.ui.h.a.f13984b, DatePickerKt.f12144f), interfaceC1084f3, 27648, 0);
                                        }
                                        return p293xa.r.f47939a;
                                    }
                                }, c1086gP);
                            }
                            if (i17 != 0) {
                                z11 = true;
                            }
                            if ((i11 & 64) != 0) {
                                DatePickerDefaults datePickerDefaults1111114 = DatePickerDefaults.f12132a;
                                i12 &= -3670017;
                                c1064pC = DatePickerDefaults.c(c1086gP);
                                pVar3 = pVarB;
                                pVar4 = pVarB2;
                                z12 = z11;
                                interfaceC1065q2 = interfaceC1065q4;
                                hVar3 = hVar2;
                            } else {
                                interfaceC1065q2 = interfaceC1065q4;
                                hVar3 = hVar2;
                                pVar3 = pVarB;
                                pVar4 = pVarB2;
                                z12 = z11;
                                c1064pC = c1064p2;
                            }
                        } else {
                            if (i21 != 0) {
                                hVar2 = androidx.compose.ui.h.a.f13984b;
                            }
                            if ((i11 & 4) != 0) {
                                objF = c1086gP.f();
                                if (objF == c0153a) {
                                    DatePickerDefaults datePickerDefaults1111115 = DatePickerDefaults.f12132a;
                                    objF = new r("yMMMM", "yMMMd", "yMMMMEEEEd");
                                    c1086gP.E(objF);
                                }
                                interfaceC1065q4 = (InterfaceC1065q) objF;
                                i12 &= -897;
                            }
                            if (i13 != 0) {
                                pVarB = androidx.compose.runtime.internal.a.b(-1504998463, new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.material3.DatePickerKt$DatePicker$2
                                    {
                                        super(2);
                                    }

                                    @Override // Ia.p
                                    public final p293xa.r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                                        InterfaceC1084f interfaceC1084f3 = interfaceC1084f2;
                                        if ((num.intValue() & 3) == 2 && interfaceC1084f3.s()) {
                                            interfaceC1084f3.w();
                                        } else {
                                            DatePickerDefaults.f12132a.b(PaddingKt.e(androidx.compose.ui.h.a.f13984b, DatePickerKt.f12143e), interfaceC1067t.b(), 432, interfaceC1084f3, 0);
                                        }
                                        return p293xa.r.f47939a;
                                    }
                                }, c1086gP);
                            }
                            if (i15 != 0) {
                                pVarB2 = androidx.compose.runtime.internal.a.b(-1780043561, new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.material3.DatePickerKt$DatePicker$3
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
                                            DatePickerDefaults.f12132a.a(interfaceC1067t.f(), interfaceC1067t.b(), interfaceC1065q4, PaddingKt.e(androidx.compose.ui.h.a.f13984b, DatePickerKt.f12144f), interfaceC1084f3, 27648, 0);
                                        }
                                        return p293xa.r.f47939a;
                                    }
                                }, c1086gP);
                            }
                            if (i17 != 0) {
                                z11 = true;
                            }
                            if ((i11 & 64) != 0) {
                                DatePickerDefaults datePickerDefaults1111116 = DatePickerDefaults.f12132a;
                                i12 &= -3670017;
                                c1064pC = DatePickerDefaults.c(c1086gP);
                                pVar3 = pVarB;
                                pVar4 = pVarB2;
                                z12 = z11;
                                interfaceC1065q2 = interfaceC1065q4;
                                hVar3 = hVar2;
                            } else {
                                interfaceC1065q2 = interfaceC1065q4;
                                hVar3 = hVar2;
                                pVar3 = pVarB;
                                pVar4 = pVarB2;
                                z12 = z11;
                                c1064pC = c1064p2;
                            }
                        }
                        c1086gP.U();
                        localeA = C1053h.a(c1086gP);
                        zK = c1086gP.K(localeA);
                        objF2 = c1086gP.f();
                        if (zK) {
                            objF2 = new androidx.compose.material3.internal.l(localeA);
                            c1086gP.E(objF2);
                        } else {
                            objF2 = new androidx.compose.material3.internal.l(localeA);
                            c1086gP.E(objF2);
                        }
                        final androidx.compose.material3.internal.k kVar18 = (androidx.compose.material3.internal.k) objF2;
                        c1086gP.L(255587712);
                        if (z12) {
                            composableLambdaImplB = androidx.compose.runtime.internal.a.b(1982226759, new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.material3.DatePickerKt$DatePicker$4
                                {
                                    super(2);
                                }

                                @Override // Ia.p
                                public final p293xa.r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                                    InterfaceC1084f interfaceC1084f3 = interfaceC1084f2;
                                    if ((num.intValue() & 3) == 2 && interfaceC1084f3.s()) {
                                        interfaceC1084f3.w();
                                    } else {
                                        androidx.compose.ui.h hVarE = PaddingKt.e(androidx.compose.ui.h.a.f13984b, DatePickerKt.f12142d);
                                        int iB = interfaceC1067t.b();
                                        boolean zK3 = interfaceC1084f3.K(interfaceC1067t);
                                        final InterfaceC1067t interfaceC1067t2 = interfaceC1067t;
                                        Object objF3 = interfaceC1084f3.f();
                                        if (zK3 || objF3 == InterfaceC1084f.a.f12980a) {
                                            objF3 = new Ia.l<C1072y, p293xa.r>() { // from class: androidx.compose.material3.DatePickerKt$DatePicker$4$1$1
                                                {
                                                    super(1);
                                                }

                                                @Override // Ia.l
                                                public final p293xa.r invoke(C1072y c1072y) {
                                                    interfaceC1067t2.a(c1072y.f12768a);
                                                    return p293xa.r.f47939a;
                                                }
                                            };
                                            interfaceC1084f3.E(objF3);
                                        }
                                        DatePickerKt.e(hVarE, iB, (Ia.l) objF3, interfaceC1084f3, 6);
                                    }
                                    return p293xa.r.f47939a;
                                }
                            }, c1086gP);
                        } else {
                            composableLambdaImplB = null;
                        }
                        c1086gP.T(false);
                        int i21117 = ((i12 >> 3) & 14) | 14155776;
                        int i21118 = i12 >> 6;
                        a(hVar3, pVar3, pVar4, composableLambdaImplB, c1064pC, TypographyKt.a(C0609d.f1247p, c1086gP), C0609d.f1245n, androidx.compose.runtime.internal.a.b(-1840727866, new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.material3.DatePickerKt$DatePicker$5
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
                                    Long lF = interfaceC1067t.f();
                                    long jE = interfaceC1067t.e();
                                    int iB = interfaceC1067t.b();
                                    boolean zK3 = interfaceC1084f3.K(interfaceC1067t);
                                    final InterfaceC1067t interfaceC1067t2 = interfaceC1067t;
                                    Object objF3 = interfaceC1084f3.f();
                                    InterfaceC1084f.a.C0153a c0153a2 = InterfaceC1084f.a.f12980a;
                                    if (zK3 || objF3 == c0153a2) {
                                        objF3 = new Ia.l<Long, p293xa.r>() { // from class: androidx.compose.material3.DatePickerKt$DatePicker$5$1$1
                                            {
                                                super(1);
                                            }

                                            @Override // Ia.l
                                            public final p293xa.r invoke(Long l10) {
                                                interfaceC1067t2.h(l10);
                                                return p293xa.r.f47939a;
                                            }
                                        };
                                        interfaceC1084f3.E(objF3);
                                    }
                                    Ia.l lVar = (Ia.l) objF3;
                                    boolean zK4 = interfaceC1084f3.K(interfaceC1067t);
                                    final InterfaceC1067t interfaceC1067t3 = interfaceC1067t;
                                    Object objF4 = interfaceC1084f3.f();
                                    if (zK4 || objF4 == c0153a2) {
                                        objF4 = new Ia.l<Long, p293xa.r>() { // from class: androidx.compose.material3.DatePickerKt$DatePicker$5$2$1
                                            {
                                                super(1);
                                            }

                                            @Override // Ia.l
                                            public final p293xa.r invoke(Long l10) {
                                                interfaceC1067t3.c(l10.longValue());
                                                return p293xa.r.f47939a;
                                            }
                                        };
                                        interfaceC1084f3.E(objF4);
                                    }
                                    DatePickerKt.k(lF, jE, iB, lVar, (Ia.l) objF4, kVar18, interfaceC1067t.g(), interfaceC1065q2, interfaceC1067t.d(), c1064pC, interfaceC1084f3, 0);
                                }
                                return p293xa.r.f47939a;
                            }
                        }, c1086gP), c1086gP, i21117 | (i21118 & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) | (i21118 & 896) | (i21118 & 57344));
                        pVar5 = pVar4;
                        pVar6 = pVar3;
                        interfaceC1065q3 = interfaceC1065q2;
                        hVar4 = hVar3;
                    }
                    c1105p0V = c1086gP.V();
                    if (c1105p0V != null) {
                        final boolean z111 = z12;
                        final C1064p c1064p11 = c1064pC;
                        c1105p0V.f13109d = new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.material3.DatePickerKt$DatePicker$6
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            /* JADX WARN: Multi-variable type inference failed */
                            {
                                super(2);
                            }

                            @Override // Ia.p
                            public final p293xa.r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                                num.intValue();
                                DatePickerKt.b(interfaceC1067t, hVar4, interfaceC1065q3, pVar6, pVar5, z111, c1064p11, interfaceC1084f2, L4.b.l(i10 | 1), i11);
                                return p293xa.r.f47939a;
                            }
                        };
                    }
                }
                i12 |= 196608;
                z11 = z10;
                if ((1572864 & i10) == 0) {
                    if ((i11 & 64) == 0) {
                        c1064p2 = c1064p;
                        if (c1086gP.K(c1064p2)) {
                        }
                        i12 |= i22;
                    } else {
                        c1064p2 = c1064p;
                    }
                    i12 |= i22;
                } else {
                    c1064p2 = c1064p;
                }
                if ((i12 & 599187) == 599186) {
                    c1086gP.r0();
                    i19 = i10 & 1;
                    c0153a = InterfaceC1084f.a.f12980a;
                    if (i19 != 0) {
                        if (i21 != 0) {
                            hVar2 = androidx.compose.ui.h.a.f13984b;
                        }
                        if ((i11 & 4) != 0) {
                            objF = c1086gP.f();
                            if (objF == c0153a) {
                                DatePickerDefaults datePickerDefaults1111117 = DatePickerDefaults.f12132a;
                                objF = new r("yMMMM", "yMMMd", "yMMMMEEEEd");
                                c1086gP.E(objF);
                            }
                            interfaceC1065q4 = (InterfaceC1065q) objF;
                            i12 &= -897;
                        }
                        if (i13 != 0) {
                            pVarB = androidx.compose.runtime.internal.a.b(-1504998463, new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.material3.DatePickerKt$DatePicker$2
                                {
                                    super(2);
                                }

                                @Override // Ia.p
                                public final p293xa.r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                                    InterfaceC1084f interfaceC1084f3 = interfaceC1084f2;
                                    if ((num.intValue() & 3) == 2 && interfaceC1084f3.s()) {
                                        interfaceC1084f3.w();
                                    } else {
                                        DatePickerDefaults.f12132a.b(PaddingKt.e(androidx.compose.ui.h.a.f13984b, DatePickerKt.f12143e), interfaceC1067t.b(), 432, interfaceC1084f3, 0);
                                    }
                                    return p293xa.r.f47939a;
                                }
                            }, c1086gP);
                        }
                        if (i15 != 0) {
                            pVarB2 = androidx.compose.runtime.internal.a.b(-1780043561, new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.material3.DatePickerKt$DatePicker$3
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
                                        DatePickerDefaults.f12132a.a(interfaceC1067t.f(), interfaceC1067t.b(), interfaceC1065q4, PaddingKt.e(androidx.compose.ui.h.a.f13984b, DatePickerKt.f12144f), interfaceC1084f3, 27648, 0);
                                    }
                                    return p293xa.r.f47939a;
                                }
                            }, c1086gP);
                        }
                        if (i17 != 0) {
                            z11 = true;
                        }
                        if ((i11 & 64) != 0) {
                            DatePickerDefaults datePickerDefaults1111118 = DatePickerDefaults.f12132a;
                            i12 &= -3670017;
                            c1064pC = DatePickerDefaults.c(c1086gP);
                            pVar3 = pVarB;
                            pVar4 = pVarB2;
                            z12 = z11;
                            interfaceC1065q2 = interfaceC1065q4;
                            hVar3 = hVar2;
                        } else {
                            interfaceC1065q2 = interfaceC1065q4;
                            hVar3 = hVar2;
                            pVar3 = pVarB;
                            pVar4 = pVarB2;
                            z12 = z11;
                            c1064pC = c1064p2;
                        }
                    } else {
                        if (i21 != 0) {
                            hVar2 = androidx.compose.ui.h.a.f13984b;
                        }
                        if ((i11 & 4) != 0) {
                            objF = c1086gP.f();
                            if (objF == c0153a) {
                                DatePickerDefaults datePickerDefaults1111119 = DatePickerDefaults.f12132a;
                                objF = new r("yMMMM", "yMMMd", "yMMMMEEEEd");
                                c1086gP.E(objF);
                            }
                            interfaceC1065q4 = (InterfaceC1065q) objF;
                            i12 &= -897;
                        }
                        if (i13 != 0) {
                            pVarB = androidx.compose.runtime.internal.a.b(-1504998463, new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.material3.DatePickerKt$DatePicker$2
                                {
                                    super(2);
                                }

                                @Override // Ia.p
                                public final p293xa.r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                                    InterfaceC1084f interfaceC1084f3 = interfaceC1084f2;
                                    if ((num.intValue() & 3) == 2 && interfaceC1084f3.s()) {
                                        interfaceC1084f3.w();
                                    } else {
                                        DatePickerDefaults.f12132a.b(PaddingKt.e(androidx.compose.ui.h.a.f13984b, DatePickerKt.f12143e), interfaceC1067t.b(), 432, interfaceC1084f3, 0);
                                    }
                                    return p293xa.r.f47939a;
                                }
                            }, c1086gP);
                        }
                        if (i15 != 0) {
                            pVarB2 = androidx.compose.runtime.internal.a.b(-1780043561, new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.material3.DatePickerKt$DatePicker$3
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
                                        DatePickerDefaults.f12132a.a(interfaceC1067t.f(), interfaceC1067t.b(), interfaceC1065q4, PaddingKt.e(androidx.compose.ui.h.a.f13984b, DatePickerKt.f12144f), interfaceC1084f3, 27648, 0);
                                    }
                                    return p293xa.r.f47939a;
                                }
                            }, c1086gP);
                        }
                        if (i17 != 0) {
                            z11 = true;
                        }
                        if ((i11 & 64) != 0) {
                            DatePickerDefaults datePickerDefaults11111110 = DatePickerDefaults.f12132a;
                            i12 &= -3670017;
                            c1064pC = DatePickerDefaults.c(c1086gP);
                            pVar3 = pVarB;
                            pVar4 = pVarB2;
                            z12 = z11;
                            interfaceC1065q2 = interfaceC1065q4;
                            hVar3 = hVar2;
                        } else {
                            interfaceC1065q2 = interfaceC1065q4;
                            hVar3 = hVar2;
                            pVar3 = pVarB;
                            pVar4 = pVarB2;
                            z12 = z11;
                            c1064pC = c1064p2;
                        }
                    }
                    c1086gP.U();
                    localeA = C1053h.a(c1086gP);
                    zK = c1086gP.K(localeA);
                    objF2 = c1086gP.f();
                    if (zK) {
                        objF2 = new androidx.compose.material3.internal.l(localeA);
                        c1086gP.E(objF2);
                    } else {
                        objF2 = new androidx.compose.material3.internal.l(localeA);
                        c1086gP.E(objF2);
                    }
                    final androidx.compose.material3.internal.k kVar19 = (androidx.compose.material3.internal.k) objF2;
                    c1086gP.L(255587712);
                    if (z12) {
                        composableLambdaImplB = androidx.compose.runtime.internal.a.b(1982226759, new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.material3.DatePickerKt$DatePicker$4
                            {
                                super(2);
                            }

                            @Override // Ia.p
                            public final p293xa.r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                                InterfaceC1084f interfaceC1084f3 = interfaceC1084f2;
                                if ((num.intValue() & 3) == 2 && interfaceC1084f3.s()) {
                                    interfaceC1084f3.w();
                                } else {
                                    androidx.compose.ui.h hVarE = PaddingKt.e(androidx.compose.ui.h.a.f13984b, DatePickerKt.f12142d);
                                    int iB = interfaceC1067t.b();
                                    boolean zK3 = interfaceC1084f3.K(interfaceC1067t);
                                    final InterfaceC1067t interfaceC1067t2 = interfaceC1067t;
                                    Object objF3 = interfaceC1084f3.f();
                                    if (zK3 || objF3 == InterfaceC1084f.a.f12980a) {
                                        objF3 = new Ia.l<C1072y, p293xa.r>() { // from class: androidx.compose.material3.DatePickerKt$DatePicker$4$1$1
                                            {
                                                super(1);
                                            }

                                            @Override // Ia.l
                                            public final p293xa.r invoke(C1072y c1072y) {
                                                interfaceC1067t2.a(c1072y.f12768a);
                                                return p293xa.r.f47939a;
                                            }
                                        };
                                        interfaceC1084f3.E(objF3);
                                    }
                                    DatePickerKt.e(hVarE, iB, (Ia.l) objF3, interfaceC1084f3, 6);
                                }
                                return p293xa.r.f47939a;
                            }
                        }, c1086gP);
                    } else {
                        composableLambdaImplB = null;
                    }
                    c1086gP.T(false);
                    int i21119 = ((i12 >> 3) & 14) | 14155776;
                    int i211110 = i12 >> 6;
                    a(hVar3, pVar3, pVar4, composableLambdaImplB, c1064pC, TypographyKt.a(C0609d.f1247p, c1086gP), C0609d.f1245n, androidx.compose.runtime.internal.a.b(-1840727866, new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.material3.DatePickerKt$DatePicker$5
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
                                Long lF = interfaceC1067t.f();
                                long jE = interfaceC1067t.e();
                                int iB = interfaceC1067t.b();
                                boolean zK3 = interfaceC1084f3.K(interfaceC1067t);
                                final InterfaceC1067t interfaceC1067t2 = interfaceC1067t;
                                Object objF3 = interfaceC1084f3.f();
                                InterfaceC1084f.a.C0153a c0153a2 = InterfaceC1084f.a.f12980a;
                                if (zK3 || objF3 == c0153a2) {
                                    objF3 = new Ia.l<Long, p293xa.r>() { // from class: androidx.compose.material3.DatePickerKt$DatePicker$5$1$1
                                        {
                                            super(1);
                                        }

                                        @Override // Ia.l
                                        public final p293xa.r invoke(Long l10) {
                                            interfaceC1067t2.h(l10);
                                            return p293xa.r.f47939a;
                                        }
                                    };
                                    interfaceC1084f3.E(objF3);
                                }
                                Ia.l lVar = (Ia.l) objF3;
                                boolean zK4 = interfaceC1084f3.K(interfaceC1067t);
                                final InterfaceC1067t interfaceC1067t3 = interfaceC1067t;
                                Object objF4 = interfaceC1084f3.f();
                                if (zK4 || objF4 == c0153a2) {
                                    objF4 = new Ia.l<Long, p293xa.r>() { // from class: androidx.compose.material3.DatePickerKt$DatePicker$5$2$1
                                        {
                                            super(1);
                                        }

                                        @Override // Ia.l
                                        public final p293xa.r invoke(Long l10) {
                                            interfaceC1067t3.c(l10.longValue());
                                            return p293xa.r.f47939a;
                                        }
                                    };
                                    interfaceC1084f3.E(objF4);
                                }
                                DatePickerKt.k(lF, jE, iB, lVar, (Ia.l) objF4, kVar19, interfaceC1067t.g(), interfaceC1065q2, interfaceC1067t.d(), c1064pC, interfaceC1084f3, 0);
                            }
                            return p293xa.r.f47939a;
                        }
                    }, c1086gP), c1086gP, i21119 | (i211110 & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) | (i211110 & 896) | (i211110 & 57344));
                    pVar5 = pVar4;
                    pVar6 = pVar3;
                    interfaceC1065q3 = interfaceC1065q2;
                    hVar4 = hVar3;
                } else {
                    c1086gP.r0();
                    i19 = i10 & 1;
                    c0153a = InterfaceC1084f.a.f12980a;
                    if (i19 != 0) {
                        if (i21 != 0) {
                            hVar2 = androidx.compose.ui.h.a.f13984b;
                        }
                        if ((i11 & 4) != 0) {
                            objF = c1086gP.f();
                            if (objF == c0153a) {
                                DatePickerDefaults datePickerDefaults11111111 = DatePickerDefaults.f12132a;
                                objF = new r("yMMMM", "yMMMd", "yMMMMEEEEd");
                                c1086gP.E(objF);
                            }
                            interfaceC1065q4 = (InterfaceC1065q) objF;
                            i12 &= -897;
                        }
                        if (i13 != 0) {
                            pVarB = androidx.compose.runtime.internal.a.b(-1504998463, new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.material3.DatePickerKt$DatePicker$2
                                {
                                    super(2);
                                }

                                @Override // Ia.p
                                public final p293xa.r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                                    InterfaceC1084f interfaceC1084f3 = interfaceC1084f2;
                                    if ((num.intValue() & 3) == 2 && interfaceC1084f3.s()) {
                                        interfaceC1084f3.w();
                                    } else {
                                        DatePickerDefaults.f12132a.b(PaddingKt.e(androidx.compose.ui.h.a.f13984b, DatePickerKt.f12143e), interfaceC1067t.b(), 432, interfaceC1084f3, 0);
                                    }
                                    return p293xa.r.f47939a;
                                }
                            }, c1086gP);
                        }
                        if (i15 != 0) {
                            pVarB2 = androidx.compose.runtime.internal.a.b(-1780043561, new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.material3.DatePickerKt$DatePicker$3
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
                                        DatePickerDefaults.f12132a.a(interfaceC1067t.f(), interfaceC1067t.b(), interfaceC1065q4, PaddingKt.e(androidx.compose.ui.h.a.f13984b, DatePickerKt.f12144f), interfaceC1084f3, 27648, 0);
                                    }
                                    return p293xa.r.f47939a;
                                }
                            }, c1086gP);
                        }
                        if (i17 != 0) {
                            z11 = true;
                        }
                        if ((i11 & 64) != 0) {
                            DatePickerDefaults datePickerDefaults11111112 = DatePickerDefaults.f12132a;
                            i12 &= -3670017;
                            c1064pC = DatePickerDefaults.c(c1086gP);
                            pVar3 = pVarB;
                            pVar4 = pVarB2;
                            z12 = z11;
                            interfaceC1065q2 = interfaceC1065q4;
                            hVar3 = hVar2;
                        } else {
                            interfaceC1065q2 = interfaceC1065q4;
                            hVar3 = hVar2;
                            pVar3 = pVarB;
                            pVar4 = pVarB2;
                            z12 = z11;
                            c1064pC = c1064p2;
                        }
                    } else {
                        if (i21 != 0) {
                            hVar2 = androidx.compose.ui.h.a.f13984b;
                        }
                        if ((i11 & 4) != 0) {
                            objF = c1086gP.f();
                            if (objF == c0153a) {
                                DatePickerDefaults datePickerDefaults11111113 = DatePickerDefaults.f12132a;
                                objF = new r("yMMMM", "yMMMd", "yMMMMEEEEd");
                                c1086gP.E(objF);
                            }
                            interfaceC1065q4 = (InterfaceC1065q) objF;
                            i12 &= -897;
                        }
                        if (i13 != 0) {
                            pVarB = androidx.compose.runtime.internal.a.b(-1504998463, new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.material3.DatePickerKt$DatePicker$2
                                {
                                    super(2);
                                }

                                @Override // Ia.p
                                public final p293xa.r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                                    InterfaceC1084f interfaceC1084f3 = interfaceC1084f2;
                                    if ((num.intValue() & 3) == 2 && interfaceC1084f3.s()) {
                                        interfaceC1084f3.w();
                                    } else {
                                        DatePickerDefaults.f12132a.b(PaddingKt.e(androidx.compose.ui.h.a.f13984b, DatePickerKt.f12143e), interfaceC1067t.b(), 432, interfaceC1084f3, 0);
                                    }
                                    return p293xa.r.f47939a;
                                }
                            }, c1086gP);
                        }
                        if (i15 != 0) {
                            pVarB2 = androidx.compose.runtime.internal.a.b(-1780043561, new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.material3.DatePickerKt$DatePicker$3
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
                                        DatePickerDefaults.f12132a.a(interfaceC1067t.f(), interfaceC1067t.b(), interfaceC1065q4, PaddingKt.e(androidx.compose.ui.h.a.f13984b, DatePickerKt.f12144f), interfaceC1084f3, 27648, 0);
                                    }
                                    return p293xa.r.f47939a;
                                }
                            }, c1086gP);
                        }
                        if (i17 != 0) {
                            z11 = true;
                        }
                        if ((i11 & 64) != 0) {
                            DatePickerDefaults datePickerDefaults11111114 = DatePickerDefaults.f12132a;
                            i12 &= -3670017;
                            c1064pC = DatePickerDefaults.c(c1086gP);
                            pVar3 = pVarB;
                            pVar4 = pVarB2;
                            z12 = z11;
                            interfaceC1065q2 = interfaceC1065q4;
                            hVar3 = hVar2;
                        } else {
                            interfaceC1065q2 = interfaceC1065q4;
                            hVar3 = hVar2;
                            pVar3 = pVarB;
                            pVar4 = pVarB2;
                            z12 = z11;
                            c1064pC = c1064p2;
                        }
                    }
                    c1086gP.U();
                    localeA = C1053h.a(c1086gP);
                    zK = c1086gP.K(localeA);
                    objF2 = c1086gP.f();
                    if (zK) {
                        objF2 = new androidx.compose.material3.internal.l(localeA);
                        c1086gP.E(objF2);
                    } else {
                        objF2 = new androidx.compose.material3.internal.l(localeA);
                        c1086gP.E(objF2);
                    }
                    final androidx.compose.material3.internal.k kVar110 = (androidx.compose.material3.internal.k) objF2;
                    c1086gP.L(255587712);
                    if (z12) {
                        composableLambdaImplB = androidx.compose.runtime.internal.a.b(1982226759, new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.material3.DatePickerKt$DatePicker$4
                            {
                                super(2);
                            }

                            @Override // Ia.p
                            public final p293xa.r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                                InterfaceC1084f interfaceC1084f3 = interfaceC1084f2;
                                if ((num.intValue() & 3) == 2 && interfaceC1084f3.s()) {
                                    interfaceC1084f3.w();
                                } else {
                                    androidx.compose.ui.h hVarE = PaddingKt.e(androidx.compose.ui.h.a.f13984b, DatePickerKt.f12142d);
                                    int iB = interfaceC1067t.b();
                                    boolean zK3 = interfaceC1084f3.K(interfaceC1067t);
                                    final InterfaceC1067t interfaceC1067t2 = interfaceC1067t;
                                    Object objF3 = interfaceC1084f3.f();
                                    if (zK3 || objF3 == InterfaceC1084f.a.f12980a) {
                                        objF3 = new Ia.l<C1072y, p293xa.r>() { // from class: androidx.compose.material3.DatePickerKt$DatePicker$4$1$1
                                            {
                                                super(1);
                                            }

                                            @Override // Ia.l
                                            public final p293xa.r invoke(C1072y c1072y) {
                                                interfaceC1067t2.a(c1072y.f12768a);
                                                return p293xa.r.f47939a;
                                            }
                                        };
                                        interfaceC1084f3.E(objF3);
                                    }
                                    DatePickerKt.e(hVarE, iB, (Ia.l) objF3, interfaceC1084f3, 6);
                                }
                                return p293xa.r.f47939a;
                            }
                        }, c1086gP);
                    } else {
                        composableLambdaImplB = null;
                    }
                    c1086gP.T(false);
                    int i211111 = ((i12 >> 3) & 14) | 14155776;
                    int i211112 = i12 >> 6;
                    a(hVar3, pVar3, pVar4, composableLambdaImplB, c1064pC, TypographyKt.a(C0609d.f1247p, c1086gP), C0609d.f1245n, androidx.compose.runtime.internal.a.b(-1840727866, new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.material3.DatePickerKt$DatePicker$5
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
                                Long lF = interfaceC1067t.f();
                                long jE = interfaceC1067t.e();
                                int iB = interfaceC1067t.b();
                                boolean zK3 = interfaceC1084f3.K(interfaceC1067t);
                                final InterfaceC1067t interfaceC1067t2 = interfaceC1067t;
                                Object objF3 = interfaceC1084f3.f();
                                InterfaceC1084f.a.C0153a c0153a2 = InterfaceC1084f.a.f12980a;
                                if (zK3 || objF3 == c0153a2) {
                                    objF3 = new Ia.l<Long, p293xa.r>() { // from class: androidx.compose.material3.DatePickerKt$DatePicker$5$1$1
                                        {
                                            super(1);
                                        }

                                        @Override // Ia.l
                                        public final p293xa.r invoke(Long l10) {
                                            interfaceC1067t2.h(l10);
                                            return p293xa.r.f47939a;
                                        }
                                    };
                                    interfaceC1084f3.E(objF3);
                                }
                                Ia.l lVar = (Ia.l) objF3;
                                boolean zK4 = interfaceC1084f3.K(interfaceC1067t);
                                final InterfaceC1067t interfaceC1067t3 = interfaceC1067t;
                                Object objF4 = interfaceC1084f3.f();
                                if (zK4 || objF4 == c0153a2) {
                                    objF4 = new Ia.l<Long, p293xa.r>() { // from class: androidx.compose.material3.DatePickerKt$DatePicker$5$2$1
                                        {
                                            super(1);
                                        }

                                        @Override // Ia.l
                                        public final p293xa.r invoke(Long l10) {
                                            interfaceC1067t3.c(l10.longValue());
                                            return p293xa.r.f47939a;
                                        }
                                    };
                                    interfaceC1084f3.E(objF4);
                                }
                                DatePickerKt.k(lF, jE, iB, lVar, (Ia.l) objF4, kVar110, interfaceC1067t.g(), interfaceC1065q2, interfaceC1067t.d(), c1064pC, interfaceC1084f3, 0);
                            }
                            return p293xa.r.f47939a;
                        }
                    }, c1086gP), c1086gP, i211111 | (i211112 & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) | (i211112 & 896) | (i211112 & 57344));
                    pVar5 = pVar4;
                    pVar6 = pVar3;
                    interfaceC1065q3 = interfaceC1065q2;
                    hVar4 = hVar3;
                }
                c1105p0V = c1086gP.V();
                if (c1105p0V != null) {
                    final boolean z112 = z12;
                    final C1064p c1064p12 = c1064pC;
                    c1105p0V.f13109d = new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.material3.DatePickerKt$DatePicker$6
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        /* JADX WARN: Multi-variable type inference failed */
                        {
                            super(2);
                        }

                        @Override // Ia.p
                        public final p293xa.r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                            num.intValue();
                            DatePickerKt.b(interfaceC1067t, hVar4, interfaceC1065q3, pVar6, pVar5, z112, c1064p12, interfaceC1084f2, L4.b.l(i10 | 1), i11);
                            return p293xa.r.f47939a;
                        }
                    };
                }
            }
            i12 |= 24576;
            pVarB2 = pVar2;
            i17 = i11 & 32;
            if (i17 != 0) {
                if ((196608 & i10) == 0) {
                    z11 = z10;
                    if (c1086gP.c(z11)) {
                        i18 = 131072;
                    } else {
                        i18 = 65536;
                    }
                    i12 |= i18;
                }
                if ((1572864 & i10) == 0) {
                    if ((i11 & 64) == 0) {
                        c1064p2 = c1064p;
                        if (c1086gP.K(c1064p2)) {
                        }
                        i12 |= i22;
                    } else {
                        c1064p2 = c1064p;
                    }
                    i12 |= i22;
                } else {
                    c1064p2 = c1064p;
                }
                if ((i12 & 599187) == 599186) {
                    c1086gP.r0();
                    i19 = i10 & 1;
                    c0153a = InterfaceC1084f.a.f12980a;
                    if (i19 != 0) {
                        if (i21 != 0) {
                            hVar2 = androidx.compose.ui.h.a.f13984b;
                        }
                        if ((i11 & 4) != 0) {
                            objF = c1086gP.f();
                            if (objF == c0153a) {
                                DatePickerDefaults datePickerDefaults11111115 = DatePickerDefaults.f12132a;
                                objF = new r("yMMMM", "yMMMd", "yMMMMEEEEd");
                                c1086gP.E(objF);
                            }
                            interfaceC1065q4 = (InterfaceC1065q) objF;
                            i12 &= -897;
                        }
                        if (i13 != 0) {
                            pVarB = androidx.compose.runtime.internal.a.b(-1504998463, new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.material3.DatePickerKt$DatePicker$2
                                {
                                    super(2);
                                }

                                @Override // Ia.p
                                public final p293xa.r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                                    InterfaceC1084f interfaceC1084f3 = interfaceC1084f2;
                                    if ((num.intValue() & 3) == 2 && interfaceC1084f3.s()) {
                                        interfaceC1084f3.w();
                                    } else {
                                        DatePickerDefaults.f12132a.b(PaddingKt.e(androidx.compose.ui.h.a.f13984b, DatePickerKt.f12143e), interfaceC1067t.b(), 432, interfaceC1084f3, 0);
                                    }
                                    return p293xa.r.f47939a;
                                }
                            }, c1086gP);
                        }
                        if (i15 != 0) {
                            pVarB2 = androidx.compose.runtime.internal.a.b(-1780043561, new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.material3.DatePickerKt$DatePicker$3
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
                                        DatePickerDefaults.f12132a.a(interfaceC1067t.f(), interfaceC1067t.b(), interfaceC1065q4, PaddingKt.e(androidx.compose.ui.h.a.f13984b, DatePickerKt.f12144f), interfaceC1084f3, 27648, 0);
                                    }
                                    return p293xa.r.f47939a;
                                }
                            }, c1086gP);
                        }
                        if (i17 != 0) {
                            z11 = true;
                        }
                        if ((i11 & 64) != 0) {
                            DatePickerDefaults datePickerDefaults11111116 = DatePickerDefaults.f12132a;
                            i12 &= -3670017;
                            c1064pC = DatePickerDefaults.c(c1086gP);
                            pVar3 = pVarB;
                            pVar4 = pVarB2;
                            z12 = z11;
                            interfaceC1065q2 = interfaceC1065q4;
                            hVar3 = hVar2;
                        } else {
                            interfaceC1065q2 = interfaceC1065q4;
                            hVar3 = hVar2;
                            pVar3 = pVarB;
                            pVar4 = pVarB2;
                            z12 = z11;
                            c1064pC = c1064p2;
                        }
                    } else {
                        if (i21 != 0) {
                            hVar2 = androidx.compose.ui.h.a.f13984b;
                        }
                        if ((i11 & 4) != 0) {
                            objF = c1086gP.f();
                            if (objF == c0153a) {
                                DatePickerDefaults datePickerDefaults11111117 = DatePickerDefaults.f12132a;
                                objF = new r("yMMMM", "yMMMd", "yMMMMEEEEd");
                                c1086gP.E(objF);
                            }
                            interfaceC1065q4 = (InterfaceC1065q) objF;
                            i12 &= -897;
                        }
                        if (i13 != 0) {
                            pVarB = androidx.compose.runtime.internal.a.b(-1504998463, new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.material3.DatePickerKt$DatePicker$2
                                {
                                    super(2);
                                }

                                @Override // Ia.p
                                public final p293xa.r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                                    InterfaceC1084f interfaceC1084f3 = interfaceC1084f2;
                                    if ((num.intValue() & 3) == 2 && interfaceC1084f3.s()) {
                                        interfaceC1084f3.w();
                                    } else {
                                        DatePickerDefaults.f12132a.b(PaddingKt.e(androidx.compose.ui.h.a.f13984b, DatePickerKt.f12143e), interfaceC1067t.b(), 432, interfaceC1084f3, 0);
                                    }
                                    return p293xa.r.f47939a;
                                }
                            }, c1086gP);
                        }
                        if (i15 != 0) {
                            pVarB2 = androidx.compose.runtime.internal.a.b(-1780043561, new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.material3.DatePickerKt$DatePicker$3
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
                                        DatePickerDefaults.f12132a.a(interfaceC1067t.f(), interfaceC1067t.b(), interfaceC1065q4, PaddingKt.e(androidx.compose.ui.h.a.f13984b, DatePickerKt.f12144f), interfaceC1084f3, 27648, 0);
                                    }
                                    return p293xa.r.f47939a;
                                }
                            }, c1086gP);
                        }
                        if (i17 != 0) {
                            z11 = true;
                        }
                        if ((i11 & 64) != 0) {
                            DatePickerDefaults datePickerDefaults11111118 = DatePickerDefaults.f12132a;
                            i12 &= -3670017;
                            c1064pC = DatePickerDefaults.c(c1086gP);
                            pVar3 = pVarB;
                            pVar4 = pVarB2;
                            z12 = z11;
                            interfaceC1065q2 = interfaceC1065q4;
                            hVar3 = hVar2;
                        } else {
                            interfaceC1065q2 = interfaceC1065q4;
                            hVar3 = hVar2;
                            pVar3 = pVarB;
                            pVar4 = pVarB2;
                            z12 = z11;
                            c1064pC = c1064p2;
                        }
                    }
                    c1086gP.U();
                    localeA = C1053h.a(c1086gP);
                    zK = c1086gP.K(localeA);
                    objF2 = c1086gP.f();
                    if (zK) {
                        objF2 = new androidx.compose.material3.internal.l(localeA);
                        c1086gP.E(objF2);
                    } else {
                        objF2 = new androidx.compose.material3.internal.l(localeA);
                        c1086gP.E(objF2);
                    }
                    final androidx.compose.material3.internal.k kVar111 = (androidx.compose.material3.internal.k) objF2;
                    c1086gP.L(255587712);
                    if (z12) {
                        composableLambdaImplB = androidx.compose.runtime.internal.a.b(1982226759, new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.material3.DatePickerKt$DatePicker$4
                            {
                                super(2);
                            }

                            @Override // Ia.p
                            public final p293xa.r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                                InterfaceC1084f interfaceC1084f3 = interfaceC1084f2;
                                if ((num.intValue() & 3) == 2 && interfaceC1084f3.s()) {
                                    interfaceC1084f3.w();
                                } else {
                                    androidx.compose.ui.h hVarE = PaddingKt.e(androidx.compose.ui.h.a.f13984b, DatePickerKt.f12142d);
                                    int iB = interfaceC1067t.b();
                                    boolean zK3 = interfaceC1084f3.K(interfaceC1067t);
                                    final InterfaceC1067t interfaceC1067t2 = interfaceC1067t;
                                    Object objF3 = interfaceC1084f3.f();
                                    if (zK3 || objF3 == InterfaceC1084f.a.f12980a) {
                                        objF3 = new Ia.l<C1072y, p293xa.r>() { // from class: androidx.compose.material3.DatePickerKt$DatePicker$4$1$1
                                            {
                                                super(1);
                                            }

                                            @Override // Ia.l
                                            public final p293xa.r invoke(C1072y c1072y) {
                                                interfaceC1067t2.a(c1072y.f12768a);
                                                return p293xa.r.f47939a;
                                            }
                                        };
                                        interfaceC1084f3.E(objF3);
                                    }
                                    DatePickerKt.e(hVarE, iB, (Ia.l) objF3, interfaceC1084f3, 6);
                                }
                                return p293xa.r.f47939a;
                            }
                        }, c1086gP);
                    } else {
                        composableLambdaImplB = null;
                    }
                    c1086gP.T(false);
                    int i211113 = ((i12 >> 3) & 14) | 14155776;
                    int i211114 = i12 >> 6;
                    a(hVar3, pVar3, pVar4, composableLambdaImplB, c1064pC, TypographyKt.a(C0609d.f1247p, c1086gP), C0609d.f1245n, androidx.compose.runtime.internal.a.b(-1840727866, new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.material3.DatePickerKt$DatePicker$5
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
                                Long lF = interfaceC1067t.f();
                                long jE = interfaceC1067t.e();
                                int iB = interfaceC1067t.b();
                                boolean zK3 = interfaceC1084f3.K(interfaceC1067t);
                                final InterfaceC1067t interfaceC1067t2 = interfaceC1067t;
                                Object objF3 = interfaceC1084f3.f();
                                InterfaceC1084f.a.C0153a c0153a2 = InterfaceC1084f.a.f12980a;
                                if (zK3 || objF3 == c0153a2) {
                                    objF3 = new Ia.l<Long, p293xa.r>() { // from class: androidx.compose.material3.DatePickerKt$DatePicker$5$1$1
                                        {
                                            super(1);
                                        }

                                        @Override // Ia.l
                                        public final p293xa.r invoke(Long l10) {
                                            interfaceC1067t2.h(l10);
                                            return p293xa.r.f47939a;
                                        }
                                    };
                                    interfaceC1084f3.E(objF3);
                                }
                                Ia.l lVar = (Ia.l) objF3;
                                boolean zK4 = interfaceC1084f3.K(interfaceC1067t);
                                final InterfaceC1067t interfaceC1067t3 = interfaceC1067t;
                                Object objF4 = interfaceC1084f3.f();
                                if (zK4 || objF4 == c0153a2) {
                                    objF4 = new Ia.l<Long, p293xa.r>() { // from class: androidx.compose.material3.DatePickerKt$DatePicker$5$2$1
                                        {
                                            super(1);
                                        }

                                        @Override // Ia.l
                                        public final p293xa.r invoke(Long l10) {
                                            interfaceC1067t3.c(l10.longValue());
                                            return p293xa.r.f47939a;
                                        }
                                    };
                                    interfaceC1084f3.E(objF4);
                                }
                                DatePickerKt.k(lF, jE, iB, lVar, (Ia.l) objF4, kVar111, interfaceC1067t.g(), interfaceC1065q2, interfaceC1067t.d(), c1064pC, interfaceC1084f3, 0);
                            }
                            return p293xa.r.f47939a;
                        }
                    }, c1086gP), c1086gP, i211113 | (i211114 & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) | (i211114 & 896) | (i211114 & 57344));
                    pVar5 = pVar4;
                    pVar6 = pVar3;
                    interfaceC1065q3 = interfaceC1065q2;
                    hVar4 = hVar3;
                } else {
                    c1086gP.r0();
                    i19 = i10 & 1;
                    c0153a = InterfaceC1084f.a.f12980a;
                    if (i19 != 0) {
                        if (i21 != 0) {
                            hVar2 = androidx.compose.ui.h.a.f13984b;
                        }
                        if ((i11 & 4) != 0) {
                            objF = c1086gP.f();
                            if (objF == c0153a) {
                                DatePickerDefaults datePickerDefaults11111119 = DatePickerDefaults.f12132a;
                                objF = new r("yMMMM", "yMMMd", "yMMMMEEEEd");
                                c1086gP.E(objF);
                            }
                            interfaceC1065q4 = (InterfaceC1065q) objF;
                            i12 &= -897;
                        }
                        if (i13 != 0) {
                            pVarB = androidx.compose.runtime.internal.a.b(-1504998463, new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.material3.DatePickerKt$DatePicker$2
                                {
                                    super(2);
                                }

                                @Override // Ia.p
                                public final p293xa.r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                                    InterfaceC1084f interfaceC1084f3 = interfaceC1084f2;
                                    if ((num.intValue() & 3) == 2 && interfaceC1084f3.s()) {
                                        interfaceC1084f3.w();
                                    } else {
                                        DatePickerDefaults.f12132a.b(PaddingKt.e(androidx.compose.ui.h.a.f13984b, DatePickerKt.f12143e), interfaceC1067t.b(), 432, interfaceC1084f3, 0);
                                    }
                                    return p293xa.r.f47939a;
                                }
                            }, c1086gP);
                        }
                        if (i15 != 0) {
                            pVarB2 = androidx.compose.runtime.internal.a.b(-1780043561, new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.material3.DatePickerKt$DatePicker$3
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
                                        DatePickerDefaults.f12132a.a(interfaceC1067t.f(), interfaceC1067t.b(), interfaceC1065q4, PaddingKt.e(androidx.compose.ui.h.a.f13984b, DatePickerKt.f12144f), interfaceC1084f3, 27648, 0);
                                    }
                                    return p293xa.r.f47939a;
                                }
                            }, c1086gP);
                        }
                        if (i17 != 0) {
                            z11 = true;
                        }
                        if ((i11 & 64) != 0) {
                            DatePickerDefaults datePickerDefaults111111110 = DatePickerDefaults.f12132a;
                            i12 &= -3670017;
                            c1064pC = DatePickerDefaults.c(c1086gP);
                            pVar3 = pVarB;
                            pVar4 = pVarB2;
                            z12 = z11;
                            interfaceC1065q2 = interfaceC1065q4;
                            hVar3 = hVar2;
                        } else {
                            interfaceC1065q2 = interfaceC1065q4;
                            hVar3 = hVar2;
                            pVar3 = pVarB;
                            pVar4 = pVarB2;
                            z12 = z11;
                            c1064pC = c1064p2;
                        }
                    } else {
                        if (i21 != 0) {
                            hVar2 = androidx.compose.ui.h.a.f13984b;
                        }
                        if ((i11 & 4) != 0) {
                            objF = c1086gP.f();
                            if (objF == c0153a) {
                                DatePickerDefaults datePickerDefaults111111111 = DatePickerDefaults.f12132a;
                                objF = new r("yMMMM", "yMMMd", "yMMMMEEEEd");
                                c1086gP.E(objF);
                            }
                            interfaceC1065q4 = (InterfaceC1065q) objF;
                            i12 &= -897;
                        }
                        if (i13 != 0) {
                            pVarB = androidx.compose.runtime.internal.a.b(-1504998463, new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.material3.DatePickerKt$DatePicker$2
                                {
                                    super(2);
                                }

                                @Override // Ia.p
                                public final p293xa.r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                                    InterfaceC1084f interfaceC1084f3 = interfaceC1084f2;
                                    if ((num.intValue() & 3) == 2 && interfaceC1084f3.s()) {
                                        interfaceC1084f3.w();
                                    } else {
                                        DatePickerDefaults.f12132a.b(PaddingKt.e(androidx.compose.ui.h.a.f13984b, DatePickerKt.f12143e), interfaceC1067t.b(), 432, interfaceC1084f3, 0);
                                    }
                                    return p293xa.r.f47939a;
                                }
                            }, c1086gP);
                        }
                        if (i15 != 0) {
                            pVarB2 = androidx.compose.runtime.internal.a.b(-1780043561, new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.material3.DatePickerKt$DatePicker$3
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
                                        DatePickerDefaults.f12132a.a(interfaceC1067t.f(), interfaceC1067t.b(), interfaceC1065q4, PaddingKt.e(androidx.compose.ui.h.a.f13984b, DatePickerKt.f12144f), interfaceC1084f3, 27648, 0);
                                    }
                                    return p293xa.r.f47939a;
                                }
                            }, c1086gP);
                        }
                        if (i17 != 0) {
                            z11 = true;
                        }
                        if ((i11 & 64) != 0) {
                            DatePickerDefaults datePickerDefaults111111112 = DatePickerDefaults.f12132a;
                            i12 &= -3670017;
                            c1064pC = DatePickerDefaults.c(c1086gP);
                            pVar3 = pVarB;
                            pVar4 = pVarB2;
                            z12 = z11;
                            interfaceC1065q2 = interfaceC1065q4;
                            hVar3 = hVar2;
                        } else {
                            interfaceC1065q2 = interfaceC1065q4;
                            hVar3 = hVar2;
                            pVar3 = pVarB;
                            pVar4 = pVarB2;
                            z12 = z11;
                            c1064pC = c1064p2;
                        }
                    }
                    c1086gP.U();
                    localeA = C1053h.a(c1086gP);
                    zK = c1086gP.K(localeA);
                    objF2 = c1086gP.f();
                    if (zK) {
                        objF2 = new androidx.compose.material3.internal.l(localeA);
                        c1086gP.E(objF2);
                    } else {
                        objF2 = new androidx.compose.material3.internal.l(localeA);
                        c1086gP.E(objF2);
                    }
                    final androidx.compose.material3.internal.k kVar112 = (androidx.compose.material3.internal.k) objF2;
                    c1086gP.L(255587712);
                    if (z12) {
                        composableLambdaImplB = androidx.compose.runtime.internal.a.b(1982226759, new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.material3.DatePickerKt$DatePicker$4
                            {
                                super(2);
                            }

                            @Override // Ia.p
                            public final p293xa.r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                                InterfaceC1084f interfaceC1084f3 = interfaceC1084f2;
                                if ((num.intValue() & 3) == 2 && interfaceC1084f3.s()) {
                                    interfaceC1084f3.w();
                                } else {
                                    androidx.compose.ui.h hVarE = PaddingKt.e(androidx.compose.ui.h.a.f13984b, DatePickerKt.f12142d);
                                    int iB = interfaceC1067t.b();
                                    boolean zK3 = interfaceC1084f3.K(interfaceC1067t);
                                    final InterfaceC1067t interfaceC1067t2 = interfaceC1067t;
                                    Object objF3 = interfaceC1084f3.f();
                                    if (zK3 || objF3 == InterfaceC1084f.a.f12980a) {
                                        objF3 = new Ia.l<C1072y, p293xa.r>() { // from class: androidx.compose.material3.DatePickerKt$DatePicker$4$1$1
                                            {
                                                super(1);
                                            }

                                            @Override // Ia.l
                                            public final p293xa.r invoke(C1072y c1072y) {
                                                interfaceC1067t2.a(c1072y.f12768a);
                                                return p293xa.r.f47939a;
                                            }
                                        };
                                        interfaceC1084f3.E(objF3);
                                    }
                                    DatePickerKt.e(hVarE, iB, (Ia.l) objF3, interfaceC1084f3, 6);
                                }
                                return p293xa.r.f47939a;
                            }
                        }, c1086gP);
                    } else {
                        composableLambdaImplB = null;
                    }
                    c1086gP.T(false);
                    int i211115 = ((i12 >> 3) & 14) | 14155776;
                    int i211116 = i12 >> 6;
                    a(hVar3, pVar3, pVar4, composableLambdaImplB, c1064pC, TypographyKt.a(C0609d.f1247p, c1086gP), C0609d.f1245n, androidx.compose.runtime.internal.a.b(-1840727866, new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.material3.DatePickerKt$DatePicker$5
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
                                Long lF = interfaceC1067t.f();
                                long jE = interfaceC1067t.e();
                                int iB = interfaceC1067t.b();
                                boolean zK3 = interfaceC1084f3.K(interfaceC1067t);
                                final InterfaceC1067t interfaceC1067t2 = interfaceC1067t;
                                Object objF3 = interfaceC1084f3.f();
                                InterfaceC1084f.a.C0153a c0153a2 = InterfaceC1084f.a.f12980a;
                                if (zK3 || objF3 == c0153a2) {
                                    objF3 = new Ia.l<Long, p293xa.r>() { // from class: androidx.compose.material3.DatePickerKt$DatePicker$5$1$1
                                        {
                                            super(1);
                                        }

                                        @Override // Ia.l
                                        public final p293xa.r invoke(Long l10) {
                                            interfaceC1067t2.h(l10);
                                            return p293xa.r.f47939a;
                                        }
                                    };
                                    interfaceC1084f3.E(objF3);
                                }
                                Ia.l lVar = (Ia.l) objF3;
                                boolean zK4 = interfaceC1084f3.K(interfaceC1067t);
                                final InterfaceC1067t interfaceC1067t3 = interfaceC1067t;
                                Object objF4 = interfaceC1084f3.f();
                                if (zK4 || objF4 == c0153a2) {
                                    objF4 = new Ia.l<Long, p293xa.r>() { // from class: androidx.compose.material3.DatePickerKt$DatePicker$5$2$1
                                        {
                                            super(1);
                                        }

                                        @Override // Ia.l
                                        public final p293xa.r invoke(Long l10) {
                                            interfaceC1067t3.c(l10.longValue());
                                            return p293xa.r.f47939a;
                                        }
                                    };
                                    interfaceC1084f3.E(objF4);
                                }
                                DatePickerKt.k(lF, jE, iB, lVar, (Ia.l) objF4, kVar112, interfaceC1067t.g(), interfaceC1065q2, interfaceC1067t.d(), c1064pC, interfaceC1084f3, 0);
                            }
                            return p293xa.r.f47939a;
                        }
                    }, c1086gP), c1086gP, i211115 | (i211116 & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) | (i211116 & 896) | (i211116 & 57344));
                    pVar5 = pVar4;
                    pVar6 = pVar3;
                    interfaceC1065q3 = interfaceC1065q2;
                    hVar4 = hVar3;
                }
                c1105p0V = c1086gP.V();
                if (c1105p0V != null) {
                    final boolean z113 = z12;
                    final C1064p c1064p13 = c1064pC;
                    c1105p0V.f13109d = new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.material3.DatePickerKt$DatePicker$6
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        /* JADX WARN: Multi-variable type inference failed */
                        {
                            super(2);
                        }

                        @Override // Ia.p
                        public final p293xa.r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                            num.intValue();
                            DatePickerKt.b(interfaceC1067t, hVar4, interfaceC1065q3, pVar6, pVar5, z113, c1064p13, interfaceC1084f2, L4.b.l(i10 | 1), i11);
                            return p293xa.r.f47939a;
                        }
                    };
                }
            }
            i12 |= 196608;
            z11 = z10;
            if ((1572864 & i10) == 0) {
                if ((i11 & 64) == 0) {
                    c1064p2 = c1064p;
                    if (c1086gP.K(c1064p2)) {
                    }
                    i12 |= i22;
                } else {
                    c1064p2 = c1064p;
                }
                i12 |= i22;
            } else {
                c1064p2 = c1064p;
            }
            if ((i12 & 599187) == 599186) {
                c1086gP.r0();
                i19 = i10 & 1;
                c0153a = InterfaceC1084f.a.f12980a;
                if (i19 != 0) {
                    if (i21 != 0) {
                        hVar2 = androidx.compose.ui.h.a.f13984b;
                    }
                    if ((i11 & 4) != 0) {
                        objF = c1086gP.f();
                        if (objF == c0153a) {
                            DatePickerDefaults datePickerDefaults111111113 = DatePickerDefaults.f12132a;
                            objF = new r("yMMMM", "yMMMd", "yMMMMEEEEd");
                            c1086gP.E(objF);
                        }
                        interfaceC1065q4 = (InterfaceC1065q) objF;
                        i12 &= -897;
                    }
                    if (i13 != 0) {
                        pVarB = androidx.compose.runtime.internal.a.b(-1504998463, new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.material3.DatePickerKt$DatePicker$2
                            {
                                super(2);
                            }

                            @Override // Ia.p
                            public final p293xa.r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                                InterfaceC1084f interfaceC1084f3 = interfaceC1084f2;
                                if ((num.intValue() & 3) == 2 && interfaceC1084f3.s()) {
                                    interfaceC1084f3.w();
                                } else {
                                    DatePickerDefaults.f12132a.b(PaddingKt.e(androidx.compose.ui.h.a.f13984b, DatePickerKt.f12143e), interfaceC1067t.b(), 432, interfaceC1084f3, 0);
                                }
                                return p293xa.r.f47939a;
                            }
                        }, c1086gP);
                    }
                    if (i15 != 0) {
                        pVarB2 = androidx.compose.runtime.internal.a.b(-1780043561, new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.material3.DatePickerKt$DatePicker$3
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
                                    DatePickerDefaults.f12132a.a(interfaceC1067t.f(), interfaceC1067t.b(), interfaceC1065q4, PaddingKt.e(androidx.compose.ui.h.a.f13984b, DatePickerKt.f12144f), interfaceC1084f3, 27648, 0);
                                }
                                return p293xa.r.f47939a;
                            }
                        }, c1086gP);
                    }
                    if (i17 != 0) {
                        z11 = true;
                    }
                    if ((i11 & 64) != 0) {
                        DatePickerDefaults datePickerDefaults111111114 = DatePickerDefaults.f12132a;
                        i12 &= -3670017;
                        c1064pC = DatePickerDefaults.c(c1086gP);
                        pVar3 = pVarB;
                        pVar4 = pVarB2;
                        z12 = z11;
                        interfaceC1065q2 = interfaceC1065q4;
                        hVar3 = hVar2;
                    } else {
                        interfaceC1065q2 = interfaceC1065q4;
                        hVar3 = hVar2;
                        pVar3 = pVarB;
                        pVar4 = pVarB2;
                        z12 = z11;
                        c1064pC = c1064p2;
                    }
                } else {
                    if (i21 != 0) {
                        hVar2 = androidx.compose.ui.h.a.f13984b;
                    }
                    if ((i11 & 4) != 0) {
                        objF = c1086gP.f();
                        if (objF == c0153a) {
                            DatePickerDefaults datePickerDefaults111111115 = DatePickerDefaults.f12132a;
                            objF = new r("yMMMM", "yMMMd", "yMMMMEEEEd");
                            c1086gP.E(objF);
                        }
                        interfaceC1065q4 = (InterfaceC1065q) objF;
                        i12 &= -897;
                    }
                    if (i13 != 0) {
                        pVarB = androidx.compose.runtime.internal.a.b(-1504998463, new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.material3.DatePickerKt$DatePicker$2
                            {
                                super(2);
                            }

                            @Override // Ia.p
                            public final p293xa.r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                                InterfaceC1084f interfaceC1084f3 = interfaceC1084f2;
                                if ((num.intValue() & 3) == 2 && interfaceC1084f3.s()) {
                                    interfaceC1084f3.w();
                                } else {
                                    DatePickerDefaults.f12132a.b(PaddingKt.e(androidx.compose.ui.h.a.f13984b, DatePickerKt.f12143e), interfaceC1067t.b(), 432, interfaceC1084f3, 0);
                                }
                                return p293xa.r.f47939a;
                            }
                        }, c1086gP);
                    }
                    if (i15 != 0) {
                        pVarB2 = androidx.compose.runtime.internal.a.b(-1780043561, new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.material3.DatePickerKt$DatePicker$3
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
                                    DatePickerDefaults.f12132a.a(interfaceC1067t.f(), interfaceC1067t.b(), interfaceC1065q4, PaddingKt.e(androidx.compose.ui.h.a.f13984b, DatePickerKt.f12144f), interfaceC1084f3, 27648, 0);
                                }
                                return p293xa.r.f47939a;
                            }
                        }, c1086gP);
                    }
                    if (i17 != 0) {
                        z11 = true;
                    }
                    if ((i11 & 64) != 0) {
                        DatePickerDefaults datePickerDefaults111111116 = DatePickerDefaults.f12132a;
                        i12 &= -3670017;
                        c1064pC = DatePickerDefaults.c(c1086gP);
                        pVar3 = pVarB;
                        pVar4 = pVarB2;
                        z12 = z11;
                        interfaceC1065q2 = interfaceC1065q4;
                        hVar3 = hVar2;
                    } else {
                        interfaceC1065q2 = interfaceC1065q4;
                        hVar3 = hVar2;
                        pVar3 = pVarB;
                        pVar4 = pVarB2;
                        z12 = z11;
                        c1064pC = c1064p2;
                    }
                }
                c1086gP.U();
                localeA = C1053h.a(c1086gP);
                zK = c1086gP.K(localeA);
                objF2 = c1086gP.f();
                if (zK) {
                    objF2 = new androidx.compose.material3.internal.l(localeA);
                    c1086gP.E(objF2);
                } else {
                    objF2 = new androidx.compose.material3.internal.l(localeA);
                    c1086gP.E(objF2);
                }
                final androidx.compose.material3.internal.k kVar113 = (androidx.compose.material3.internal.k) objF2;
                c1086gP.L(255587712);
                if (z12) {
                    composableLambdaImplB = androidx.compose.runtime.internal.a.b(1982226759, new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.material3.DatePickerKt$DatePicker$4
                        {
                            super(2);
                        }

                        @Override // Ia.p
                        public final p293xa.r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                            InterfaceC1084f interfaceC1084f3 = interfaceC1084f2;
                            if ((num.intValue() & 3) == 2 && interfaceC1084f3.s()) {
                                interfaceC1084f3.w();
                            } else {
                                androidx.compose.ui.h hVarE = PaddingKt.e(androidx.compose.ui.h.a.f13984b, DatePickerKt.f12142d);
                                int iB = interfaceC1067t.b();
                                boolean zK3 = interfaceC1084f3.K(interfaceC1067t);
                                final InterfaceC1067t interfaceC1067t2 = interfaceC1067t;
                                Object objF3 = interfaceC1084f3.f();
                                if (zK3 || objF3 == InterfaceC1084f.a.f12980a) {
                                    objF3 = new Ia.l<C1072y, p293xa.r>() { // from class: androidx.compose.material3.DatePickerKt$DatePicker$4$1$1
                                        {
                                            super(1);
                                        }

                                        @Override // Ia.l
                                        public final p293xa.r invoke(C1072y c1072y) {
                                            interfaceC1067t2.a(c1072y.f12768a);
                                            return p293xa.r.f47939a;
                                        }
                                    };
                                    interfaceC1084f3.E(objF3);
                                }
                                DatePickerKt.e(hVarE, iB, (Ia.l) objF3, interfaceC1084f3, 6);
                            }
                            return p293xa.r.f47939a;
                        }
                    }, c1086gP);
                } else {
                    composableLambdaImplB = null;
                }
                c1086gP.T(false);
                int i211117 = ((i12 >> 3) & 14) | 14155776;
                int i211118 = i12 >> 6;
                a(hVar3, pVar3, pVar4, composableLambdaImplB, c1064pC, TypographyKt.a(C0609d.f1247p, c1086gP), C0609d.f1245n, androidx.compose.runtime.internal.a.b(-1840727866, new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.material3.DatePickerKt$DatePicker$5
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
                            Long lF = interfaceC1067t.f();
                            long jE = interfaceC1067t.e();
                            int iB = interfaceC1067t.b();
                            boolean zK3 = interfaceC1084f3.K(interfaceC1067t);
                            final InterfaceC1067t interfaceC1067t2 = interfaceC1067t;
                            Object objF3 = interfaceC1084f3.f();
                            InterfaceC1084f.a.C0153a c0153a2 = InterfaceC1084f.a.f12980a;
                            if (zK3 || objF3 == c0153a2) {
                                objF3 = new Ia.l<Long, p293xa.r>() { // from class: androidx.compose.material3.DatePickerKt$DatePicker$5$1$1
                                    {
                                        super(1);
                                    }

                                    @Override // Ia.l
                                    public final p293xa.r invoke(Long l10) {
                                        interfaceC1067t2.h(l10);
                                        return p293xa.r.f47939a;
                                    }
                                };
                                interfaceC1084f3.E(objF3);
                            }
                            Ia.l lVar = (Ia.l) objF3;
                            boolean zK4 = interfaceC1084f3.K(interfaceC1067t);
                            final InterfaceC1067t interfaceC1067t3 = interfaceC1067t;
                            Object objF4 = interfaceC1084f3.f();
                            if (zK4 || objF4 == c0153a2) {
                                objF4 = new Ia.l<Long, p293xa.r>() { // from class: androidx.compose.material3.DatePickerKt$DatePicker$5$2$1
                                    {
                                        super(1);
                                    }

                                    @Override // Ia.l
                                    public final p293xa.r invoke(Long l10) {
                                        interfaceC1067t3.c(l10.longValue());
                                        return p293xa.r.f47939a;
                                    }
                                };
                                interfaceC1084f3.E(objF4);
                            }
                            DatePickerKt.k(lF, jE, iB, lVar, (Ia.l) objF4, kVar113, interfaceC1067t.g(), interfaceC1065q2, interfaceC1067t.d(), c1064pC, interfaceC1084f3, 0);
                        }
                        return p293xa.r.f47939a;
                    }
                }, c1086gP), c1086gP, i211117 | (i211118 & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) | (i211118 & 896) | (i211118 & 57344));
                pVar5 = pVar4;
                pVar6 = pVar3;
                interfaceC1065q3 = interfaceC1065q2;
                hVar4 = hVar3;
            } else {
                c1086gP.r0();
                i19 = i10 & 1;
                c0153a = InterfaceC1084f.a.f12980a;
                if (i19 != 0) {
                    if (i21 != 0) {
                        hVar2 = androidx.compose.ui.h.a.f13984b;
                    }
                    if ((i11 & 4) != 0) {
                        objF = c1086gP.f();
                        if (objF == c0153a) {
                            DatePickerDefaults datePickerDefaults111111117 = DatePickerDefaults.f12132a;
                            objF = new r("yMMMM", "yMMMd", "yMMMMEEEEd");
                            c1086gP.E(objF);
                        }
                        interfaceC1065q4 = (InterfaceC1065q) objF;
                        i12 &= -897;
                    }
                    if (i13 != 0) {
                        pVarB = androidx.compose.runtime.internal.a.b(-1504998463, new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.material3.DatePickerKt$DatePicker$2
                            {
                                super(2);
                            }

                            @Override // Ia.p
                            public final p293xa.r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                                InterfaceC1084f interfaceC1084f3 = interfaceC1084f2;
                                if ((num.intValue() & 3) == 2 && interfaceC1084f3.s()) {
                                    interfaceC1084f3.w();
                                } else {
                                    DatePickerDefaults.f12132a.b(PaddingKt.e(androidx.compose.ui.h.a.f13984b, DatePickerKt.f12143e), interfaceC1067t.b(), 432, interfaceC1084f3, 0);
                                }
                                return p293xa.r.f47939a;
                            }
                        }, c1086gP);
                    }
                    if (i15 != 0) {
                        pVarB2 = androidx.compose.runtime.internal.a.b(-1780043561, new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.material3.DatePickerKt$DatePicker$3
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
                                    DatePickerDefaults.f12132a.a(interfaceC1067t.f(), interfaceC1067t.b(), interfaceC1065q4, PaddingKt.e(androidx.compose.ui.h.a.f13984b, DatePickerKt.f12144f), interfaceC1084f3, 27648, 0);
                                }
                                return p293xa.r.f47939a;
                            }
                        }, c1086gP);
                    }
                    if (i17 != 0) {
                        z11 = true;
                    }
                    if ((i11 & 64) != 0) {
                        DatePickerDefaults datePickerDefaults111111118 = DatePickerDefaults.f12132a;
                        i12 &= -3670017;
                        c1064pC = DatePickerDefaults.c(c1086gP);
                        pVar3 = pVarB;
                        pVar4 = pVarB2;
                        z12 = z11;
                        interfaceC1065q2 = interfaceC1065q4;
                        hVar3 = hVar2;
                    } else {
                        interfaceC1065q2 = interfaceC1065q4;
                        hVar3 = hVar2;
                        pVar3 = pVarB;
                        pVar4 = pVarB2;
                        z12 = z11;
                        c1064pC = c1064p2;
                    }
                } else {
                    if (i21 != 0) {
                        hVar2 = androidx.compose.ui.h.a.f13984b;
                    }
                    if ((i11 & 4) != 0) {
                        objF = c1086gP.f();
                        if (objF == c0153a) {
                            DatePickerDefaults datePickerDefaults111111119 = DatePickerDefaults.f12132a;
                            objF = new r("yMMMM", "yMMMd", "yMMMMEEEEd");
                            c1086gP.E(objF);
                        }
                        interfaceC1065q4 = (InterfaceC1065q) objF;
                        i12 &= -897;
                    }
                    if (i13 != 0) {
                        pVarB = androidx.compose.runtime.internal.a.b(-1504998463, new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.material3.DatePickerKt$DatePicker$2
                            {
                                super(2);
                            }

                            @Override // Ia.p
                            public final p293xa.r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                                InterfaceC1084f interfaceC1084f3 = interfaceC1084f2;
                                if ((num.intValue() & 3) == 2 && interfaceC1084f3.s()) {
                                    interfaceC1084f3.w();
                                } else {
                                    DatePickerDefaults.f12132a.b(PaddingKt.e(androidx.compose.ui.h.a.f13984b, DatePickerKt.f12143e), interfaceC1067t.b(), 432, interfaceC1084f3, 0);
                                }
                                return p293xa.r.f47939a;
                            }
                        }, c1086gP);
                    }
                    if (i15 != 0) {
                        pVarB2 = androidx.compose.runtime.internal.a.b(-1780043561, new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.material3.DatePickerKt$DatePicker$3
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
                                    DatePickerDefaults.f12132a.a(interfaceC1067t.f(), interfaceC1067t.b(), interfaceC1065q4, PaddingKt.e(androidx.compose.ui.h.a.f13984b, DatePickerKt.f12144f), interfaceC1084f3, 27648, 0);
                                }
                                return p293xa.r.f47939a;
                            }
                        }, c1086gP);
                    }
                    if (i17 != 0) {
                        z11 = true;
                    }
                    if ((i11 & 64) != 0) {
                        DatePickerDefaults datePickerDefaults1111111110 = DatePickerDefaults.f12132a;
                        i12 &= -3670017;
                        c1064pC = DatePickerDefaults.c(c1086gP);
                        pVar3 = pVarB;
                        pVar4 = pVarB2;
                        z12 = z11;
                        interfaceC1065q2 = interfaceC1065q4;
                        hVar3 = hVar2;
                    } else {
                        interfaceC1065q2 = interfaceC1065q4;
                        hVar3 = hVar2;
                        pVar3 = pVarB;
                        pVar4 = pVarB2;
                        z12 = z11;
                        c1064pC = c1064p2;
                    }
                }
                c1086gP.U();
                localeA = C1053h.a(c1086gP);
                zK = c1086gP.K(localeA);
                objF2 = c1086gP.f();
                if (zK) {
                    objF2 = new androidx.compose.material3.internal.l(localeA);
                    c1086gP.E(objF2);
                } else {
                    objF2 = new androidx.compose.material3.internal.l(localeA);
                    c1086gP.E(objF2);
                }
                final androidx.compose.material3.internal.k kVar114 = (androidx.compose.material3.internal.k) objF2;
                c1086gP.L(255587712);
                if (z12) {
                    composableLambdaImplB = androidx.compose.runtime.internal.a.b(1982226759, new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.material3.DatePickerKt$DatePicker$4
                        {
                            super(2);
                        }

                        @Override // Ia.p
                        public final p293xa.r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                            InterfaceC1084f interfaceC1084f3 = interfaceC1084f2;
                            if ((num.intValue() & 3) == 2 && interfaceC1084f3.s()) {
                                interfaceC1084f3.w();
                            } else {
                                androidx.compose.ui.h hVarE = PaddingKt.e(androidx.compose.ui.h.a.f13984b, DatePickerKt.f12142d);
                                int iB = interfaceC1067t.b();
                                boolean zK3 = interfaceC1084f3.K(interfaceC1067t);
                                final InterfaceC1067t interfaceC1067t2 = interfaceC1067t;
                                Object objF3 = interfaceC1084f3.f();
                                if (zK3 || objF3 == InterfaceC1084f.a.f12980a) {
                                    objF3 = new Ia.l<C1072y, p293xa.r>() { // from class: androidx.compose.material3.DatePickerKt$DatePicker$4$1$1
                                        {
                                            super(1);
                                        }

                                        @Override // Ia.l
                                        public final p293xa.r invoke(C1072y c1072y) {
                                            interfaceC1067t2.a(c1072y.f12768a);
                                            return p293xa.r.f47939a;
                                        }
                                    };
                                    interfaceC1084f3.E(objF3);
                                }
                                DatePickerKt.e(hVarE, iB, (Ia.l) objF3, interfaceC1084f3, 6);
                            }
                            return p293xa.r.f47939a;
                        }
                    }, c1086gP);
                } else {
                    composableLambdaImplB = null;
                }
                c1086gP.T(false);
                int i211119 = ((i12 >> 3) & 14) | 14155776;
                int i2111110 = i12 >> 6;
                a(hVar3, pVar3, pVar4, composableLambdaImplB, c1064pC, TypographyKt.a(C0609d.f1247p, c1086gP), C0609d.f1245n, androidx.compose.runtime.internal.a.b(-1840727866, new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.material3.DatePickerKt$DatePicker$5
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
                            Long lF = interfaceC1067t.f();
                            long jE = interfaceC1067t.e();
                            int iB = interfaceC1067t.b();
                            boolean zK3 = interfaceC1084f3.K(interfaceC1067t);
                            final InterfaceC1067t interfaceC1067t2 = interfaceC1067t;
                            Object objF3 = interfaceC1084f3.f();
                            InterfaceC1084f.a.C0153a c0153a2 = InterfaceC1084f.a.f12980a;
                            if (zK3 || objF3 == c0153a2) {
                                objF3 = new Ia.l<Long, p293xa.r>() { // from class: androidx.compose.material3.DatePickerKt$DatePicker$5$1$1
                                    {
                                        super(1);
                                    }

                                    @Override // Ia.l
                                    public final p293xa.r invoke(Long l10) {
                                        interfaceC1067t2.h(l10);
                                        return p293xa.r.f47939a;
                                    }
                                };
                                interfaceC1084f3.E(objF3);
                            }
                            Ia.l lVar = (Ia.l) objF3;
                            boolean zK4 = interfaceC1084f3.K(interfaceC1067t);
                            final InterfaceC1067t interfaceC1067t3 = interfaceC1067t;
                            Object objF4 = interfaceC1084f3.f();
                            if (zK4 || objF4 == c0153a2) {
                                objF4 = new Ia.l<Long, p293xa.r>() { // from class: androidx.compose.material3.DatePickerKt$DatePicker$5$2$1
                                    {
                                        super(1);
                                    }

                                    @Override // Ia.l
                                    public final p293xa.r invoke(Long l10) {
                                        interfaceC1067t3.c(l10.longValue());
                                        return p293xa.r.f47939a;
                                    }
                                };
                                interfaceC1084f3.E(objF4);
                            }
                            DatePickerKt.k(lF, jE, iB, lVar, (Ia.l) objF4, kVar114, interfaceC1067t.g(), interfaceC1065q2, interfaceC1067t.d(), c1064pC, interfaceC1084f3, 0);
                        }
                        return p293xa.r.f47939a;
                    }
                }, c1086gP), c1086gP, i211119 | (i2111110 & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) | (i2111110 & 896) | (i2111110 & 57344));
                pVar5 = pVar4;
                pVar6 = pVar3;
                interfaceC1065q3 = interfaceC1065q2;
                hVar4 = hVar3;
            }
            c1105p0V = c1086gP.V();
            if (c1105p0V != null) {
                final boolean z114 = z12;
                final C1064p c1064p14 = c1064pC;
                c1105p0V.f13109d = new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.material3.DatePickerKt$DatePicker$6
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(2);
                    }

                    @Override // Ia.p
                    public final p293xa.r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                        num.intValue();
                        DatePickerKt.b(interfaceC1067t, hVar4, interfaceC1065q3, pVar6, pVar5, z114, c1064p14, interfaceC1084f2, L4.b.l(i10 | 1), i11);
                        return p293xa.r.f47939a;
                    }
                };
            }
        }
        i12 |= 3072;
        pVarB = pVar;
        i15 = i11 & 16;
        if (i15 != 0) {
            if ((i10 & 24576) == 0) {
                pVarB2 = pVar2;
                if (c1086gP.k(pVarB2)) {
                    i16 = 16384;
                } else {
                    i16 = 8192;
                }
                i12 |= i16;
            }
            i17 = i11 & 32;
            if (i17 != 0) {
                if ((196608 & i10) == 0) {
                    z11 = z10;
                    if (c1086gP.c(z11)) {
                        i18 = 131072;
                    } else {
                        i18 = 65536;
                    }
                    i12 |= i18;
                }
                if ((1572864 & i10) == 0) {
                    if ((i11 & 64) == 0) {
                        c1064p2 = c1064p;
                        if (c1086gP.K(c1064p2)) {
                        }
                        i12 |= i22;
                    } else {
                        c1064p2 = c1064p;
                    }
                    i12 |= i22;
                } else {
                    c1064p2 = c1064p;
                }
                if ((i12 & 599187) == 599186) {
                    c1086gP.r0();
                    i19 = i10 & 1;
                    c0153a = InterfaceC1084f.a.f12980a;
                    if (i19 != 0) {
                        if (i21 != 0) {
                            hVar2 = androidx.compose.ui.h.a.f13984b;
                        }
                        if ((i11 & 4) != 0) {
                            objF = c1086gP.f();
                            if (objF == c0153a) {
                                DatePickerDefaults datePickerDefaults1111111111 = DatePickerDefaults.f12132a;
                                objF = new r("yMMMM", "yMMMd", "yMMMMEEEEd");
                                c1086gP.E(objF);
                            }
                            interfaceC1065q4 = (InterfaceC1065q) objF;
                            i12 &= -897;
                        }
                        if (i13 != 0) {
                            pVarB = androidx.compose.runtime.internal.a.b(-1504998463, new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.material3.DatePickerKt$DatePicker$2
                                {
                                    super(2);
                                }

                                @Override // Ia.p
                                public final p293xa.r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                                    InterfaceC1084f interfaceC1084f3 = interfaceC1084f2;
                                    if ((num.intValue() & 3) == 2 && interfaceC1084f3.s()) {
                                        interfaceC1084f3.w();
                                    } else {
                                        DatePickerDefaults.f12132a.b(PaddingKt.e(androidx.compose.ui.h.a.f13984b, DatePickerKt.f12143e), interfaceC1067t.b(), 432, interfaceC1084f3, 0);
                                    }
                                    return p293xa.r.f47939a;
                                }
                            }, c1086gP);
                        }
                        if (i15 != 0) {
                            pVarB2 = androidx.compose.runtime.internal.a.b(-1780043561, new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.material3.DatePickerKt$DatePicker$3
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
                                        DatePickerDefaults.f12132a.a(interfaceC1067t.f(), interfaceC1067t.b(), interfaceC1065q4, PaddingKt.e(androidx.compose.ui.h.a.f13984b, DatePickerKt.f12144f), interfaceC1084f3, 27648, 0);
                                    }
                                    return p293xa.r.f47939a;
                                }
                            }, c1086gP);
                        }
                        if (i17 != 0) {
                            z11 = true;
                        }
                        if ((i11 & 64) != 0) {
                            DatePickerDefaults datePickerDefaults1111111112 = DatePickerDefaults.f12132a;
                            i12 &= -3670017;
                            c1064pC = DatePickerDefaults.c(c1086gP);
                            pVar3 = pVarB;
                            pVar4 = pVarB2;
                            z12 = z11;
                            interfaceC1065q2 = interfaceC1065q4;
                            hVar3 = hVar2;
                        } else {
                            interfaceC1065q2 = interfaceC1065q4;
                            hVar3 = hVar2;
                            pVar3 = pVarB;
                            pVar4 = pVarB2;
                            z12 = z11;
                            c1064pC = c1064p2;
                        }
                    } else {
                        if (i21 != 0) {
                            hVar2 = androidx.compose.ui.h.a.f13984b;
                        }
                        if ((i11 & 4) != 0) {
                            objF = c1086gP.f();
                            if (objF == c0153a) {
                                DatePickerDefaults datePickerDefaults1111111113 = DatePickerDefaults.f12132a;
                                objF = new r("yMMMM", "yMMMd", "yMMMMEEEEd");
                                c1086gP.E(objF);
                            }
                            interfaceC1065q4 = (InterfaceC1065q) objF;
                            i12 &= -897;
                        }
                        if (i13 != 0) {
                            pVarB = androidx.compose.runtime.internal.a.b(-1504998463, new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.material3.DatePickerKt$DatePicker$2
                                {
                                    super(2);
                                }

                                @Override // Ia.p
                                public final p293xa.r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                                    InterfaceC1084f interfaceC1084f3 = interfaceC1084f2;
                                    if ((num.intValue() & 3) == 2 && interfaceC1084f3.s()) {
                                        interfaceC1084f3.w();
                                    } else {
                                        DatePickerDefaults.f12132a.b(PaddingKt.e(androidx.compose.ui.h.a.f13984b, DatePickerKt.f12143e), interfaceC1067t.b(), 432, interfaceC1084f3, 0);
                                    }
                                    return p293xa.r.f47939a;
                                }
                            }, c1086gP);
                        }
                        if (i15 != 0) {
                            pVarB2 = androidx.compose.runtime.internal.a.b(-1780043561, new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.material3.DatePickerKt$DatePicker$3
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
                                        DatePickerDefaults.f12132a.a(interfaceC1067t.f(), interfaceC1067t.b(), interfaceC1065q4, PaddingKt.e(androidx.compose.ui.h.a.f13984b, DatePickerKt.f12144f), interfaceC1084f3, 27648, 0);
                                    }
                                    return p293xa.r.f47939a;
                                }
                            }, c1086gP);
                        }
                        if (i17 != 0) {
                            z11 = true;
                        }
                        if ((i11 & 64) != 0) {
                            DatePickerDefaults datePickerDefaults1111111114 = DatePickerDefaults.f12132a;
                            i12 &= -3670017;
                            c1064pC = DatePickerDefaults.c(c1086gP);
                            pVar3 = pVarB;
                            pVar4 = pVarB2;
                            z12 = z11;
                            interfaceC1065q2 = interfaceC1065q4;
                            hVar3 = hVar2;
                        } else {
                            interfaceC1065q2 = interfaceC1065q4;
                            hVar3 = hVar2;
                            pVar3 = pVarB;
                            pVar4 = pVarB2;
                            z12 = z11;
                            c1064pC = c1064p2;
                        }
                    }
                    c1086gP.U();
                    localeA = C1053h.a(c1086gP);
                    zK = c1086gP.K(localeA);
                    objF2 = c1086gP.f();
                    if (zK) {
                        objF2 = new androidx.compose.material3.internal.l(localeA);
                        c1086gP.E(objF2);
                    } else {
                        objF2 = new androidx.compose.material3.internal.l(localeA);
                        c1086gP.E(objF2);
                    }
                    final androidx.compose.material3.internal.k kVar115 = (androidx.compose.material3.internal.k) objF2;
                    c1086gP.L(255587712);
                    if (z12) {
                        composableLambdaImplB = androidx.compose.runtime.internal.a.b(1982226759, new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.material3.DatePickerKt$DatePicker$4
                            {
                                super(2);
                            }

                            @Override // Ia.p
                            public final p293xa.r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                                InterfaceC1084f interfaceC1084f3 = interfaceC1084f2;
                                if ((num.intValue() & 3) == 2 && interfaceC1084f3.s()) {
                                    interfaceC1084f3.w();
                                } else {
                                    androidx.compose.ui.h hVarE = PaddingKt.e(androidx.compose.ui.h.a.f13984b, DatePickerKt.f12142d);
                                    int iB = interfaceC1067t.b();
                                    boolean zK3 = interfaceC1084f3.K(interfaceC1067t);
                                    final InterfaceC1067t interfaceC1067t2 = interfaceC1067t;
                                    Object objF3 = interfaceC1084f3.f();
                                    if (zK3 || objF3 == InterfaceC1084f.a.f12980a) {
                                        objF3 = new Ia.l<C1072y, p293xa.r>() { // from class: androidx.compose.material3.DatePickerKt$DatePicker$4$1$1
                                            {
                                                super(1);
                                            }

                                            @Override // Ia.l
                                            public final p293xa.r invoke(C1072y c1072y) {
                                                interfaceC1067t2.a(c1072y.f12768a);
                                                return p293xa.r.f47939a;
                                            }
                                        };
                                        interfaceC1084f3.E(objF3);
                                    }
                                    DatePickerKt.e(hVarE, iB, (Ia.l) objF3, interfaceC1084f3, 6);
                                }
                                return p293xa.r.f47939a;
                            }
                        }, c1086gP);
                    } else {
                        composableLambdaImplB = null;
                    }
                    c1086gP.T(false);
                    int i2111111 = ((i12 >> 3) & 14) | 14155776;
                    int i2111112 = i12 >> 6;
                    a(hVar3, pVar3, pVar4, composableLambdaImplB, c1064pC, TypographyKt.a(C0609d.f1247p, c1086gP), C0609d.f1245n, androidx.compose.runtime.internal.a.b(-1840727866, new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.material3.DatePickerKt$DatePicker$5
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
                                Long lF = interfaceC1067t.f();
                                long jE = interfaceC1067t.e();
                                int iB = interfaceC1067t.b();
                                boolean zK3 = interfaceC1084f3.K(interfaceC1067t);
                                final InterfaceC1067t interfaceC1067t2 = interfaceC1067t;
                                Object objF3 = interfaceC1084f3.f();
                                InterfaceC1084f.a.C0153a c0153a2 = InterfaceC1084f.a.f12980a;
                                if (zK3 || objF3 == c0153a2) {
                                    objF3 = new Ia.l<Long, p293xa.r>() { // from class: androidx.compose.material3.DatePickerKt$DatePicker$5$1$1
                                        {
                                            super(1);
                                        }

                                        @Override // Ia.l
                                        public final p293xa.r invoke(Long l10) {
                                            interfaceC1067t2.h(l10);
                                            return p293xa.r.f47939a;
                                        }
                                    };
                                    interfaceC1084f3.E(objF3);
                                }
                                Ia.l lVar = (Ia.l) objF3;
                                boolean zK4 = interfaceC1084f3.K(interfaceC1067t);
                                final InterfaceC1067t interfaceC1067t3 = interfaceC1067t;
                                Object objF4 = interfaceC1084f3.f();
                                if (zK4 || objF4 == c0153a2) {
                                    objF4 = new Ia.l<Long, p293xa.r>() { // from class: androidx.compose.material3.DatePickerKt$DatePicker$5$2$1
                                        {
                                            super(1);
                                        }

                                        @Override // Ia.l
                                        public final p293xa.r invoke(Long l10) {
                                            interfaceC1067t3.c(l10.longValue());
                                            return p293xa.r.f47939a;
                                        }
                                    };
                                    interfaceC1084f3.E(objF4);
                                }
                                DatePickerKt.k(lF, jE, iB, lVar, (Ia.l) objF4, kVar115, interfaceC1067t.g(), interfaceC1065q2, interfaceC1067t.d(), c1064pC, interfaceC1084f3, 0);
                            }
                            return p293xa.r.f47939a;
                        }
                    }, c1086gP), c1086gP, i2111111 | (i2111112 & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) | (i2111112 & 896) | (i2111112 & 57344));
                    pVar5 = pVar4;
                    pVar6 = pVar3;
                    interfaceC1065q3 = interfaceC1065q2;
                    hVar4 = hVar3;
                } else {
                    c1086gP.r0();
                    i19 = i10 & 1;
                    c0153a = InterfaceC1084f.a.f12980a;
                    if (i19 != 0) {
                        if (i21 != 0) {
                            hVar2 = androidx.compose.ui.h.a.f13984b;
                        }
                        if ((i11 & 4) != 0) {
                            objF = c1086gP.f();
                            if (objF == c0153a) {
                                DatePickerDefaults datePickerDefaults1111111115 = DatePickerDefaults.f12132a;
                                objF = new r("yMMMM", "yMMMd", "yMMMMEEEEd");
                                c1086gP.E(objF);
                            }
                            interfaceC1065q4 = (InterfaceC1065q) objF;
                            i12 &= -897;
                        }
                        if (i13 != 0) {
                            pVarB = androidx.compose.runtime.internal.a.b(-1504998463, new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.material3.DatePickerKt$DatePicker$2
                                {
                                    super(2);
                                }

                                @Override // Ia.p
                                public final p293xa.r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                                    InterfaceC1084f interfaceC1084f3 = interfaceC1084f2;
                                    if ((num.intValue() & 3) == 2 && interfaceC1084f3.s()) {
                                        interfaceC1084f3.w();
                                    } else {
                                        DatePickerDefaults.f12132a.b(PaddingKt.e(androidx.compose.ui.h.a.f13984b, DatePickerKt.f12143e), interfaceC1067t.b(), 432, interfaceC1084f3, 0);
                                    }
                                    return p293xa.r.f47939a;
                                }
                            }, c1086gP);
                        }
                        if (i15 != 0) {
                            pVarB2 = androidx.compose.runtime.internal.a.b(-1780043561, new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.material3.DatePickerKt$DatePicker$3
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
                                        DatePickerDefaults.f12132a.a(interfaceC1067t.f(), interfaceC1067t.b(), interfaceC1065q4, PaddingKt.e(androidx.compose.ui.h.a.f13984b, DatePickerKt.f12144f), interfaceC1084f3, 27648, 0);
                                    }
                                    return p293xa.r.f47939a;
                                }
                            }, c1086gP);
                        }
                        if (i17 != 0) {
                            z11 = true;
                        }
                        if ((i11 & 64) != 0) {
                            DatePickerDefaults datePickerDefaults1111111116 = DatePickerDefaults.f12132a;
                            i12 &= -3670017;
                            c1064pC = DatePickerDefaults.c(c1086gP);
                            pVar3 = pVarB;
                            pVar4 = pVarB2;
                            z12 = z11;
                            interfaceC1065q2 = interfaceC1065q4;
                            hVar3 = hVar2;
                        } else {
                            interfaceC1065q2 = interfaceC1065q4;
                            hVar3 = hVar2;
                            pVar3 = pVarB;
                            pVar4 = pVarB2;
                            z12 = z11;
                            c1064pC = c1064p2;
                        }
                    } else {
                        if (i21 != 0) {
                            hVar2 = androidx.compose.ui.h.a.f13984b;
                        }
                        if ((i11 & 4) != 0) {
                            objF = c1086gP.f();
                            if (objF == c0153a) {
                                DatePickerDefaults datePickerDefaults1111111117 = DatePickerDefaults.f12132a;
                                objF = new r("yMMMM", "yMMMd", "yMMMMEEEEd");
                                c1086gP.E(objF);
                            }
                            interfaceC1065q4 = (InterfaceC1065q) objF;
                            i12 &= -897;
                        }
                        if (i13 != 0) {
                            pVarB = androidx.compose.runtime.internal.a.b(-1504998463, new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.material3.DatePickerKt$DatePicker$2
                                {
                                    super(2);
                                }

                                @Override // Ia.p
                                public final p293xa.r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                                    InterfaceC1084f interfaceC1084f3 = interfaceC1084f2;
                                    if ((num.intValue() & 3) == 2 && interfaceC1084f3.s()) {
                                        interfaceC1084f3.w();
                                    } else {
                                        DatePickerDefaults.f12132a.b(PaddingKt.e(androidx.compose.ui.h.a.f13984b, DatePickerKt.f12143e), interfaceC1067t.b(), 432, interfaceC1084f3, 0);
                                    }
                                    return p293xa.r.f47939a;
                                }
                            }, c1086gP);
                        }
                        if (i15 != 0) {
                            pVarB2 = androidx.compose.runtime.internal.a.b(-1780043561, new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.material3.DatePickerKt$DatePicker$3
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
                                        DatePickerDefaults.f12132a.a(interfaceC1067t.f(), interfaceC1067t.b(), interfaceC1065q4, PaddingKt.e(androidx.compose.ui.h.a.f13984b, DatePickerKt.f12144f), interfaceC1084f3, 27648, 0);
                                    }
                                    return p293xa.r.f47939a;
                                }
                            }, c1086gP);
                        }
                        if (i17 != 0) {
                            z11 = true;
                        }
                        if ((i11 & 64) != 0) {
                            DatePickerDefaults datePickerDefaults1111111118 = DatePickerDefaults.f12132a;
                            i12 &= -3670017;
                            c1064pC = DatePickerDefaults.c(c1086gP);
                            pVar3 = pVarB;
                            pVar4 = pVarB2;
                            z12 = z11;
                            interfaceC1065q2 = interfaceC1065q4;
                            hVar3 = hVar2;
                        } else {
                            interfaceC1065q2 = interfaceC1065q4;
                            hVar3 = hVar2;
                            pVar3 = pVarB;
                            pVar4 = pVarB2;
                            z12 = z11;
                            c1064pC = c1064p2;
                        }
                    }
                    c1086gP.U();
                    localeA = C1053h.a(c1086gP);
                    zK = c1086gP.K(localeA);
                    objF2 = c1086gP.f();
                    if (zK) {
                        objF2 = new androidx.compose.material3.internal.l(localeA);
                        c1086gP.E(objF2);
                    } else {
                        objF2 = new androidx.compose.material3.internal.l(localeA);
                        c1086gP.E(objF2);
                    }
                    final androidx.compose.material3.internal.k kVar116 = (androidx.compose.material3.internal.k) objF2;
                    c1086gP.L(255587712);
                    if (z12) {
                        composableLambdaImplB = androidx.compose.runtime.internal.a.b(1982226759, new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.material3.DatePickerKt$DatePicker$4
                            {
                                super(2);
                            }

                            @Override // Ia.p
                            public final p293xa.r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                                InterfaceC1084f interfaceC1084f3 = interfaceC1084f2;
                                if ((num.intValue() & 3) == 2 && interfaceC1084f3.s()) {
                                    interfaceC1084f3.w();
                                } else {
                                    androidx.compose.ui.h hVarE = PaddingKt.e(androidx.compose.ui.h.a.f13984b, DatePickerKt.f12142d);
                                    int iB = interfaceC1067t.b();
                                    boolean zK3 = interfaceC1084f3.K(interfaceC1067t);
                                    final InterfaceC1067t interfaceC1067t2 = interfaceC1067t;
                                    Object objF3 = interfaceC1084f3.f();
                                    if (zK3 || objF3 == InterfaceC1084f.a.f12980a) {
                                        objF3 = new Ia.l<C1072y, p293xa.r>() { // from class: androidx.compose.material3.DatePickerKt$DatePicker$4$1$1
                                            {
                                                super(1);
                                            }

                                            @Override // Ia.l
                                            public final p293xa.r invoke(C1072y c1072y) {
                                                interfaceC1067t2.a(c1072y.f12768a);
                                                return p293xa.r.f47939a;
                                            }
                                        };
                                        interfaceC1084f3.E(objF3);
                                    }
                                    DatePickerKt.e(hVarE, iB, (Ia.l) objF3, interfaceC1084f3, 6);
                                }
                                return p293xa.r.f47939a;
                            }
                        }, c1086gP);
                    } else {
                        composableLambdaImplB = null;
                    }
                    c1086gP.T(false);
                    int i2111113 = ((i12 >> 3) & 14) | 14155776;
                    int i2111114 = i12 >> 6;
                    a(hVar3, pVar3, pVar4, composableLambdaImplB, c1064pC, TypographyKt.a(C0609d.f1247p, c1086gP), C0609d.f1245n, androidx.compose.runtime.internal.a.b(-1840727866, new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.material3.DatePickerKt$DatePicker$5
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
                                Long lF = interfaceC1067t.f();
                                long jE = interfaceC1067t.e();
                                int iB = interfaceC1067t.b();
                                boolean zK3 = interfaceC1084f3.K(interfaceC1067t);
                                final InterfaceC1067t interfaceC1067t2 = interfaceC1067t;
                                Object objF3 = interfaceC1084f3.f();
                                InterfaceC1084f.a.C0153a c0153a2 = InterfaceC1084f.a.f12980a;
                                if (zK3 || objF3 == c0153a2) {
                                    objF3 = new Ia.l<Long, p293xa.r>() { // from class: androidx.compose.material3.DatePickerKt$DatePicker$5$1$1
                                        {
                                            super(1);
                                        }

                                        @Override // Ia.l
                                        public final p293xa.r invoke(Long l10) {
                                            interfaceC1067t2.h(l10);
                                            return p293xa.r.f47939a;
                                        }
                                    };
                                    interfaceC1084f3.E(objF3);
                                }
                                Ia.l lVar = (Ia.l) objF3;
                                boolean zK4 = interfaceC1084f3.K(interfaceC1067t);
                                final InterfaceC1067t interfaceC1067t3 = interfaceC1067t;
                                Object objF4 = interfaceC1084f3.f();
                                if (zK4 || objF4 == c0153a2) {
                                    objF4 = new Ia.l<Long, p293xa.r>() { // from class: androidx.compose.material3.DatePickerKt$DatePicker$5$2$1
                                        {
                                            super(1);
                                        }

                                        @Override // Ia.l
                                        public final p293xa.r invoke(Long l10) {
                                            interfaceC1067t3.c(l10.longValue());
                                            return p293xa.r.f47939a;
                                        }
                                    };
                                    interfaceC1084f3.E(objF4);
                                }
                                DatePickerKt.k(lF, jE, iB, lVar, (Ia.l) objF4, kVar116, interfaceC1067t.g(), interfaceC1065q2, interfaceC1067t.d(), c1064pC, interfaceC1084f3, 0);
                            }
                            return p293xa.r.f47939a;
                        }
                    }, c1086gP), c1086gP, i2111113 | (i2111114 & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) | (i2111114 & 896) | (i2111114 & 57344));
                    pVar5 = pVar4;
                    pVar6 = pVar3;
                    interfaceC1065q3 = interfaceC1065q2;
                    hVar4 = hVar3;
                }
                c1105p0V = c1086gP.V();
                if (c1105p0V != null) {
                    final boolean z115 = z12;
                    final C1064p c1064p15 = c1064pC;
                    c1105p0V.f13109d = new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.material3.DatePickerKt$DatePicker$6
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        /* JADX WARN: Multi-variable type inference failed */
                        {
                            super(2);
                        }

                        @Override // Ia.p
                        public final p293xa.r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                            num.intValue();
                            DatePickerKt.b(interfaceC1067t, hVar4, interfaceC1065q3, pVar6, pVar5, z115, c1064p15, interfaceC1084f2, L4.b.l(i10 | 1), i11);
                            return p293xa.r.f47939a;
                        }
                    };
                }
            }
            i12 |= 196608;
            z11 = z10;
            if ((1572864 & i10) == 0) {
                if ((i11 & 64) == 0) {
                    c1064p2 = c1064p;
                    if (c1086gP.K(c1064p2)) {
                    }
                    i12 |= i22;
                } else {
                    c1064p2 = c1064p;
                }
                i12 |= i22;
            } else {
                c1064p2 = c1064p;
            }
            if ((i12 & 599187) == 599186) {
                c1086gP.r0();
                i19 = i10 & 1;
                c0153a = InterfaceC1084f.a.f12980a;
                if (i19 != 0) {
                    if (i21 != 0) {
                        hVar2 = androidx.compose.ui.h.a.f13984b;
                    }
                    if ((i11 & 4) != 0) {
                        objF = c1086gP.f();
                        if (objF == c0153a) {
                            DatePickerDefaults datePickerDefaults1111111119 = DatePickerDefaults.f12132a;
                            objF = new r("yMMMM", "yMMMd", "yMMMMEEEEd");
                            c1086gP.E(objF);
                        }
                        interfaceC1065q4 = (InterfaceC1065q) objF;
                        i12 &= -897;
                    }
                    if (i13 != 0) {
                        pVarB = androidx.compose.runtime.internal.a.b(-1504998463, new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.material3.DatePickerKt$DatePicker$2
                            {
                                super(2);
                            }

                            @Override // Ia.p
                            public final p293xa.r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                                InterfaceC1084f interfaceC1084f3 = interfaceC1084f2;
                                if ((num.intValue() & 3) == 2 && interfaceC1084f3.s()) {
                                    interfaceC1084f3.w();
                                } else {
                                    DatePickerDefaults.f12132a.b(PaddingKt.e(androidx.compose.ui.h.a.f13984b, DatePickerKt.f12143e), interfaceC1067t.b(), 432, interfaceC1084f3, 0);
                                }
                                return p293xa.r.f47939a;
                            }
                        }, c1086gP);
                    }
                    if (i15 != 0) {
                        pVarB2 = androidx.compose.runtime.internal.a.b(-1780043561, new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.material3.DatePickerKt$DatePicker$3
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
                                    DatePickerDefaults.f12132a.a(interfaceC1067t.f(), interfaceC1067t.b(), interfaceC1065q4, PaddingKt.e(androidx.compose.ui.h.a.f13984b, DatePickerKt.f12144f), interfaceC1084f3, 27648, 0);
                                }
                                return p293xa.r.f47939a;
                            }
                        }, c1086gP);
                    }
                    if (i17 != 0) {
                        z11 = true;
                    }
                    if ((i11 & 64) != 0) {
                        DatePickerDefaults datePickerDefaults11111111110 = DatePickerDefaults.f12132a;
                        i12 &= -3670017;
                        c1064pC = DatePickerDefaults.c(c1086gP);
                        pVar3 = pVarB;
                        pVar4 = pVarB2;
                        z12 = z11;
                        interfaceC1065q2 = interfaceC1065q4;
                        hVar3 = hVar2;
                    } else {
                        interfaceC1065q2 = interfaceC1065q4;
                        hVar3 = hVar2;
                        pVar3 = pVarB;
                        pVar4 = pVarB2;
                        z12 = z11;
                        c1064pC = c1064p2;
                    }
                } else {
                    if (i21 != 0) {
                        hVar2 = androidx.compose.ui.h.a.f13984b;
                    }
                    if ((i11 & 4) != 0) {
                        objF = c1086gP.f();
                        if (objF == c0153a) {
                            DatePickerDefaults datePickerDefaults11111111111 = DatePickerDefaults.f12132a;
                            objF = new r("yMMMM", "yMMMd", "yMMMMEEEEd");
                            c1086gP.E(objF);
                        }
                        interfaceC1065q4 = (InterfaceC1065q) objF;
                        i12 &= -897;
                    }
                    if (i13 != 0) {
                        pVarB = androidx.compose.runtime.internal.a.b(-1504998463, new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.material3.DatePickerKt$DatePicker$2
                            {
                                super(2);
                            }

                            @Override // Ia.p
                            public final p293xa.r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                                InterfaceC1084f interfaceC1084f3 = interfaceC1084f2;
                                if ((num.intValue() & 3) == 2 && interfaceC1084f3.s()) {
                                    interfaceC1084f3.w();
                                } else {
                                    DatePickerDefaults.f12132a.b(PaddingKt.e(androidx.compose.ui.h.a.f13984b, DatePickerKt.f12143e), interfaceC1067t.b(), 432, interfaceC1084f3, 0);
                                }
                                return p293xa.r.f47939a;
                            }
                        }, c1086gP);
                    }
                    if (i15 != 0) {
                        pVarB2 = androidx.compose.runtime.internal.a.b(-1780043561, new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.material3.DatePickerKt$DatePicker$3
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
                                    DatePickerDefaults.f12132a.a(interfaceC1067t.f(), interfaceC1067t.b(), interfaceC1065q4, PaddingKt.e(androidx.compose.ui.h.a.f13984b, DatePickerKt.f12144f), interfaceC1084f3, 27648, 0);
                                }
                                return p293xa.r.f47939a;
                            }
                        }, c1086gP);
                    }
                    if (i17 != 0) {
                        z11 = true;
                    }
                    if ((i11 & 64) != 0) {
                        DatePickerDefaults datePickerDefaults11111111112 = DatePickerDefaults.f12132a;
                        i12 &= -3670017;
                        c1064pC = DatePickerDefaults.c(c1086gP);
                        pVar3 = pVarB;
                        pVar4 = pVarB2;
                        z12 = z11;
                        interfaceC1065q2 = interfaceC1065q4;
                        hVar3 = hVar2;
                    } else {
                        interfaceC1065q2 = interfaceC1065q4;
                        hVar3 = hVar2;
                        pVar3 = pVarB;
                        pVar4 = pVarB2;
                        z12 = z11;
                        c1064pC = c1064p2;
                    }
                }
                c1086gP.U();
                localeA = C1053h.a(c1086gP);
                zK = c1086gP.K(localeA);
                objF2 = c1086gP.f();
                if (zK) {
                    objF2 = new androidx.compose.material3.internal.l(localeA);
                    c1086gP.E(objF2);
                } else {
                    objF2 = new androidx.compose.material3.internal.l(localeA);
                    c1086gP.E(objF2);
                }
                final androidx.compose.material3.internal.k kVar117 = (androidx.compose.material3.internal.k) objF2;
                c1086gP.L(255587712);
                if (z12) {
                    composableLambdaImplB = androidx.compose.runtime.internal.a.b(1982226759, new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.material3.DatePickerKt$DatePicker$4
                        {
                            super(2);
                        }

                        @Override // Ia.p
                        public final p293xa.r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                            InterfaceC1084f interfaceC1084f3 = interfaceC1084f2;
                            if ((num.intValue() & 3) == 2 && interfaceC1084f3.s()) {
                                interfaceC1084f3.w();
                            } else {
                                androidx.compose.ui.h hVarE = PaddingKt.e(androidx.compose.ui.h.a.f13984b, DatePickerKt.f12142d);
                                int iB = interfaceC1067t.b();
                                boolean zK3 = interfaceC1084f3.K(interfaceC1067t);
                                final InterfaceC1067t interfaceC1067t2 = interfaceC1067t;
                                Object objF3 = interfaceC1084f3.f();
                                if (zK3 || objF3 == InterfaceC1084f.a.f12980a) {
                                    objF3 = new Ia.l<C1072y, p293xa.r>() { // from class: androidx.compose.material3.DatePickerKt$DatePicker$4$1$1
                                        {
                                            super(1);
                                        }

                                        @Override // Ia.l
                                        public final p293xa.r invoke(C1072y c1072y) {
                                            interfaceC1067t2.a(c1072y.f12768a);
                                            return p293xa.r.f47939a;
                                        }
                                    };
                                    interfaceC1084f3.E(objF3);
                                }
                                DatePickerKt.e(hVarE, iB, (Ia.l) objF3, interfaceC1084f3, 6);
                            }
                            return p293xa.r.f47939a;
                        }
                    }, c1086gP);
                } else {
                    composableLambdaImplB = null;
                }
                c1086gP.T(false);
                int i2111115 = ((i12 >> 3) & 14) | 14155776;
                int i2111116 = i12 >> 6;
                a(hVar3, pVar3, pVar4, composableLambdaImplB, c1064pC, TypographyKt.a(C0609d.f1247p, c1086gP), C0609d.f1245n, androidx.compose.runtime.internal.a.b(-1840727866, new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.material3.DatePickerKt$DatePicker$5
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
                            Long lF = interfaceC1067t.f();
                            long jE = interfaceC1067t.e();
                            int iB = interfaceC1067t.b();
                            boolean zK3 = interfaceC1084f3.K(interfaceC1067t);
                            final InterfaceC1067t interfaceC1067t2 = interfaceC1067t;
                            Object objF3 = interfaceC1084f3.f();
                            InterfaceC1084f.a.C0153a c0153a2 = InterfaceC1084f.a.f12980a;
                            if (zK3 || objF3 == c0153a2) {
                                objF3 = new Ia.l<Long, p293xa.r>() { // from class: androidx.compose.material3.DatePickerKt$DatePicker$5$1$1
                                    {
                                        super(1);
                                    }

                                    @Override // Ia.l
                                    public final p293xa.r invoke(Long l10) {
                                        interfaceC1067t2.h(l10);
                                        return p293xa.r.f47939a;
                                    }
                                };
                                interfaceC1084f3.E(objF3);
                            }
                            Ia.l lVar = (Ia.l) objF3;
                            boolean zK4 = interfaceC1084f3.K(interfaceC1067t);
                            final InterfaceC1067t interfaceC1067t3 = interfaceC1067t;
                            Object objF4 = interfaceC1084f3.f();
                            if (zK4 || objF4 == c0153a2) {
                                objF4 = new Ia.l<Long, p293xa.r>() { // from class: androidx.compose.material3.DatePickerKt$DatePicker$5$2$1
                                    {
                                        super(1);
                                    }

                                    @Override // Ia.l
                                    public final p293xa.r invoke(Long l10) {
                                        interfaceC1067t3.c(l10.longValue());
                                        return p293xa.r.f47939a;
                                    }
                                };
                                interfaceC1084f3.E(objF4);
                            }
                            DatePickerKt.k(lF, jE, iB, lVar, (Ia.l) objF4, kVar117, interfaceC1067t.g(), interfaceC1065q2, interfaceC1067t.d(), c1064pC, interfaceC1084f3, 0);
                        }
                        return p293xa.r.f47939a;
                    }
                }, c1086gP), c1086gP, i2111115 | (i2111116 & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) | (i2111116 & 896) | (i2111116 & 57344));
                pVar5 = pVar4;
                pVar6 = pVar3;
                interfaceC1065q3 = interfaceC1065q2;
                hVar4 = hVar3;
            } else {
                c1086gP.r0();
                i19 = i10 & 1;
                c0153a = InterfaceC1084f.a.f12980a;
                if (i19 != 0) {
                    if (i21 != 0) {
                        hVar2 = androidx.compose.ui.h.a.f13984b;
                    }
                    if ((i11 & 4) != 0) {
                        objF = c1086gP.f();
                        if (objF == c0153a) {
                            DatePickerDefaults datePickerDefaults11111111113 = DatePickerDefaults.f12132a;
                            objF = new r("yMMMM", "yMMMd", "yMMMMEEEEd");
                            c1086gP.E(objF);
                        }
                        interfaceC1065q4 = (InterfaceC1065q) objF;
                        i12 &= -897;
                    }
                    if (i13 != 0) {
                        pVarB = androidx.compose.runtime.internal.a.b(-1504998463, new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.material3.DatePickerKt$DatePicker$2
                            {
                                super(2);
                            }

                            @Override // Ia.p
                            public final p293xa.r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                                InterfaceC1084f interfaceC1084f3 = interfaceC1084f2;
                                if ((num.intValue() & 3) == 2 && interfaceC1084f3.s()) {
                                    interfaceC1084f3.w();
                                } else {
                                    DatePickerDefaults.f12132a.b(PaddingKt.e(androidx.compose.ui.h.a.f13984b, DatePickerKt.f12143e), interfaceC1067t.b(), 432, interfaceC1084f3, 0);
                                }
                                return p293xa.r.f47939a;
                            }
                        }, c1086gP);
                    }
                    if (i15 != 0) {
                        pVarB2 = androidx.compose.runtime.internal.a.b(-1780043561, new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.material3.DatePickerKt$DatePicker$3
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
                                    DatePickerDefaults.f12132a.a(interfaceC1067t.f(), interfaceC1067t.b(), interfaceC1065q4, PaddingKt.e(androidx.compose.ui.h.a.f13984b, DatePickerKt.f12144f), interfaceC1084f3, 27648, 0);
                                }
                                return p293xa.r.f47939a;
                            }
                        }, c1086gP);
                    }
                    if (i17 != 0) {
                        z11 = true;
                    }
                    if ((i11 & 64) != 0) {
                        DatePickerDefaults datePickerDefaults11111111114 = DatePickerDefaults.f12132a;
                        i12 &= -3670017;
                        c1064pC = DatePickerDefaults.c(c1086gP);
                        pVar3 = pVarB;
                        pVar4 = pVarB2;
                        z12 = z11;
                        interfaceC1065q2 = interfaceC1065q4;
                        hVar3 = hVar2;
                    } else {
                        interfaceC1065q2 = interfaceC1065q4;
                        hVar3 = hVar2;
                        pVar3 = pVarB;
                        pVar4 = pVarB2;
                        z12 = z11;
                        c1064pC = c1064p2;
                    }
                } else {
                    if (i21 != 0) {
                        hVar2 = androidx.compose.ui.h.a.f13984b;
                    }
                    if ((i11 & 4) != 0) {
                        objF = c1086gP.f();
                        if (objF == c0153a) {
                            DatePickerDefaults datePickerDefaults11111111115 = DatePickerDefaults.f12132a;
                            objF = new r("yMMMM", "yMMMd", "yMMMMEEEEd");
                            c1086gP.E(objF);
                        }
                        interfaceC1065q4 = (InterfaceC1065q) objF;
                        i12 &= -897;
                    }
                    if (i13 != 0) {
                        pVarB = androidx.compose.runtime.internal.a.b(-1504998463, new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.material3.DatePickerKt$DatePicker$2
                            {
                                super(2);
                            }

                            @Override // Ia.p
                            public final p293xa.r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                                InterfaceC1084f interfaceC1084f3 = interfaceC1084f2;
                                if ((num.intValue() & 3) == 2 && interfaceC1084f3.s()) {
                                    interfaceC1084f3.w();
                                } else {
                                    DatePickerDefaults.f12132a.b(PaddingKt.e(androidx.compose.ui.h.a.f13984b, DatePickerKt.f12143e), interfaceC1067t.b(), 432, interfaceC1084f3, 0);
                                }
                                return p293xa.r.f47939a;
                            }
                        }, c1086gP);
                    }
                    if (i15 != 0) {
                        pVarB2 = androidx.compose.runtime.internal.a.b(-1780043561, new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.material3.DatePickerKt$DatePicker$3
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
                                    DatePickerDefaults.f12132a.a(interfaceC1067t.f(), interfaceC1067t.b(), interfaceC1065q4, PaddingKt.e(androidx.compose.ui.h.a.f13984b, DatePickerKt.f12144f), interfaceC1084f3, 27648, 0);
                                }
                                return p293xa.r.f47939a;
                            }
                        }, c1086gP);
                    }
                    if (i17 != 0) {
                        z11 = true;
                    }
                    if ((i11 & 64) != 0) {
                        DatePickerDefaults datePickerDefaults11111111116 = DatePickerDefaults.f12132a;
                        i12 &= -3670017;
                        c1064pC = DatePickerDefaults.c(c1086gP);
                        pVar3 = pVarB;
                        pVar4 = pVarB2;
                        z12 = z11;
                        interfaceC1065q2 = interfaceC1065q4;
                        hVar3 = hVar2;
                    } else {
                        interfaceC1065q2 = interfaceC1065q4;
                        hVar3 = hVar2;
                        pVar3 = pVarB;
                        pVar4 = pVarB2;
                        z12 = z11;
                        c1064pC = c1064p2;
                    }
                }
                c1086gP.U();
                localeA = C1053h.a(c1086gP);
                zK = c1086gP.K(localeA);
                objF2 = c1086gP.f();
                if (zK) {
                    objF2 = new androidx.compose.material3.internal.l(localeA);
                    c1086gP.E(objF2);
                } else {
                    objF2 = new androidx.compose.material3.internal.l(localeA);
                    c1086gP.E(objF2);
                }
                final androidx.compose.material3.internal.k kVar118 = (androidx.compose.material3.internal.k) objF2;
                c1086gP.L(255587712);
                if (z12) {
                    composableLambdaImplB = androidx.compose.runtime.internal.a.b(1982226759, new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.material3.DatePickerKt$DatePicker$4
                        {
                            super(2);
                        }

                        @Override // Ia.p
                        public final p293xa.r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                            InterfaceC1084f interfaceC1084f3 = interfaceC1084f2;
                            if ((num.intValue() & 3) == 2 && interfaceC1084f3.s()) {
                                interfaceC1084f3.w();
                            } else {
                                androidx.compose.ui.h hVarE = PaddingKt.e(androidx.compose.ui.h.a.f13984b, DatePickerKt.f12142d);
                                int iB = interfaceC1067t.b();
                                boolean zK3 = interfaceC1084f3.K(interfaceC1067t);
                                final InterfaceC1067t interfaceC1067t2 = interfaceC1067t;
                                Object objF3 = interfaceC1084f3.f();
                                if (zK3 || objF3 == InterfaceC1084f.a.f12980a) {
                                    objF3 = new Ia.l<C1072y, p293xa.r>() { // from class: androidx.compose.material3.DatePickerKt$DatePicker$4$1$1
                                        {
                                            super(1);
                                        }

                                        @Override // Ia.l
                                        public final p293xa.r invoke(C1072y c1072y) {
                                            interfaceC1067t2.a(c1072y.f12768a);
                                            return p293xa.r.f47939a;
                                        }
                                    };
                                    interfaceC1084f3.E(objF3);
                                }
                                DatePickerKt.e(hVarE, iB, (Ia.l) objF3, interfaceC1084f3, 6);
                            }
                            return p293xa.r.f47939a;
                        }
                    }, c1086gP);
                } else {
                    composableLambdaImplB = null;
                }
                c1086gP.T(false);
                int i2111117 = ((i12 >> 3) & 14) | 14155776;
                int i2111118 = i12 >> 6;
                a(hVar3, pVar3, pVar4, composableLambdaImplB, c1064pC, TypographyKt.a(C0609d.f1247p, c1086gP), C0609d.f1245n, androidx.compose.runtime.internal.a.b(-1840727866, new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.material3.DatePickerKt$DatePicker$5
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
                            Long lF = interfaceC1067t.f();
                            long jE = interfaceC1067t.e();
                            int iB = interfaceC1067t.b();
                            boolean zK3 = interfaceC1084f3.K(interfaceC1067t);
                            final InterfaceC1067t interfaceC1067t2 = interfaceC1067t;
                            Object objF3 = interfaceC1084f3.f();
                            InterfaceC1084f.a.C0153a c0153a2 = InterfaceC1084f.a.f12980a;
                            if (zK3 || objF3 == c0153a2) {
                                objF3 = new Ia.l<Long, p293xa.r>() { // from class: androidx.compose.material3.DatePickerKt$DatePicker$5$1$1
                                    {
                                        super(1);
                                    }

                                    @Override // Ia.l
                                    public final p293xa.r invoke(Long l10) {
                                        interfaceC1067t2.h(l10);
                                        return p293xa.r.f47939a;
                                    }
                                };
                                interfaceC1084f3.E(objF3);
                            }
                            Ia.l lVar = (Ia.l) objF3;
                            boolean zK4 = interfaceC1084f3.K(interfaceC1067t);
                            final InterfaceC1067t interfaceC1067t3 = interfaceC1067t;
                            Object objF4 = interfaceC1084f3.f();
                            if (zK4 || objF4 == c0153a2) {
                                objF4 = new Ia.l<Long, p293xa.r>() { // from class: androidx.compose.material3.DatePickerKt$DatePicker$5$2$1
                                    {
                                        super(1);
                                    }

                                    @Override // Ia.l
                                    public final p293xa.r invoke(Long l10) {
                                        interfaceC1067t3.c(l10.longValue());
                                        return p293xa.r.f47939a;
                                    }
                                };
                                interfaceC1084f3.E(objF4);
                            }
                            DatePickerKt.k(lF, jE, iB, lVar, (Ia.l) objF4, kVar118, interfaceC1067t.g(), interfaceC1065q2, interfaceC1067t.d(), c1064pC, interfaceC1084f3, 0);
                        }
                        return p293xa.r.f47939a;
                    }
                }, c1086gP), c1086gP, i2111117 | (i2111118 & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) | (i2111118 & 896) | (i2111118 & 57344));
                pVar5 = pVar4;
                pVar6 = pVar3;
                interfaceC1065q3 = interfaceC1065q2;
                hVar4 = hVar3;
            }
            c1105p0V = c1086gP.V();
            if (c1105p0V != null) {
                final boolean z116 = z12;
                final C1064p c1064p16 = c1064pC;
                c1105p0V.f13109d = new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.material3.DatePickerKt$DatePicker$6
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(2);
                    }

                    @Override // Ia.p
                    public final p293xa.r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                        num.intValue();
                        DatePickerKt.b(interfaceC1067t, hVar4, interfaceC1065q3, pVar6, pVar5, z116, c1064p16, interfaceC1084f2, L4.b.l(i10 | 1), i11);
                        return p293xa.r.f47939a;
                    }
                };
            }
        }
        i12 |= 24576;
        pVarB2 = pVar2;
        i17 = i11 & 32;
        if (i17 != 0) {
            if ((196608 & i10) == 0) {
                z11 = z10;
                if (c1086gP.c(z11)) {
                    i18 = 131072;
                } else {
                    i18 = 65536;
                }
                i12 |= i18;
            }
            if ((1572864 & i10) == 0) {
                if ((i11 & 64) == 0) {
                    c1064p2 = c1064p;
                    if (c1086gP.K(c1064p2)) {
                    }
                    i12 |= i22;
                } else {
                    c1064p2 = c1064p;
                }
                i12 |= i22;
            } else {
                c1064p2 = c1064p;
            }
            if ((i12 & 599187) == 599186) {
                c1086gP.r0();
                i19 = i10 & 1;
                c0153a = InterfaceC1084f.a.f12980a;
                if (i19 != 0) {
                    if (i21 != 0) {
                        hVar2 = androidx.compose.ui.h.a.f13984b;
                    }
                    if ((i11 & 4) != 0) {
                        objF = c1086gP.f();
                        if (objF == c0153a) {
                            DatePickerDefaults datePickerDefaults11111111117 = DatePickerDefaults.f12132a;
                            objF = new r("yMMMM", "yMMMd", "yMMMMEEEEd");
                            c1086gP.E(objF);
                        }
                        interfaceC1065q4 = (InterfaceC1065q) objF;
                        i12 &= -897;
                    }
                    if (i13 != 0) {
                        pVarB = androidx.compose.runtime.internal.a.b(-1504998463, new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.material3.DatePickerKt$DatePicker$2
                            {
                                super(2);
                            }

                            @Override // Ia.p
                            public final p293xa.r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                                InterfaceC1084f interfaceC1084f3 = interfaceC1084f2;
                                if ((num.intValue() & 3) == 2 && interfaceC1084f3.s()) {
                                    interfaceC1084f3.w();
                                } else {
                                    DatePickerDefaults.f12132a.b(PaddingKt.e(androidx.compose.ui.h.a.f13984b, DatePickerKt.f12143e), interfaceC1067t.b(), 432, interfaceC1084f3, 0);
                                }
                                return p293xa.r.f47939a;
                            }
                        }, c1086gP);
                    }
                    if (i15 != 0) {
                        pVarB2 = androidx.compose.runtime.internal.a.b(-1780043561, new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.material3.DatePickerKt$DatePicker$3
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
                                    DatePickerDefaults.f12132a.a(interfaceC1067t.f(), interfaceC1067t.b(), interfaceC1065q4, PaddingKt.e(androidx.compose.ui.h.a.f13984b, DatePickerKt.f12144f), interfaceC1084f3, 27648, 0);
                                }
                                return p293xa.r.f47939a;
                            }
                        }, c1086gP);
                    }
                    if (i17 != 0) {
                        z11 = true;
                    }
                    if ((i11 & 64) != 0) {
                        DatePickerDefaults datePickerDefaults11111111118 = DatePickerDefaults.f12132a;
                        i12 &= -3670017;
                        c1064pC = DatePickerDefaults.c(c1086gP);
                        pVar3 = pVarB;
                        pVar4 = pVarB2;
                        z12 = z11;
                        interfaceC1065q2 = interfaceC1065q4;
                        hVar3 = hVar2;
                    } else {
                        interfaceC1065q2 = interfaceC1065q4;
                        hVar3 = hVar2;
                        pVar3 = pVarB;
                        pVar4 = pVarB2;
                        z12 = z11;
                        c1064pC = c1064p2;
                    }
                } else {
                    if (i21 != 0) {
                        hVar2 = androidx.compose.ui.h.a.f13984b;
                    }
                    if ((i11 & 4) != 0) {
                        objF = c1086gP.f();
                        if (objF == c0153a) {
                            DatePickerDefaults datePickerDefaults11111111119 = DatePickerDefaults.f12132a;
                            objF = new r("yMMMM", "yMMMd", "yMMMMEEEEd");
                            c1086gP.E(objF);
                        }
                        interfaceC1065q4 = (InterfaceC1065q) objF;
                        i12 &= -897;
                    }
                    if (i13 != 0) {
                        pVarB = androidx.compose.runtime.internal.a.b(-1504998463, new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.material3.DatePickerKt$DatePicker$2
                            {
                                super(2);
                            }

                            @Override // Ia.p
                            public final p293xa.r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                                InterfaceC1084f interfaceC1084f3 = interfaceC1084f2;
                                if ((num.intValue() & 3) == 2 && interfaceC1084f3.s()) {
                                    interfaceC1084f3.w();
                                } else {
                                    DatePickerDefaults.f12132a.b(PaddingKt.e(androidx.compose.ui.h.a.f13984b, DatePickerKt.f12143e), interfaceC1067t.b(), 432, interfaceC1084f3, 0);
                                }
                                return p293xa.r.f47939a;
                            }
                        }, c1086gP);
                    }
                    if (i15 != 0) {
                        pVarB2 = androidx.compose.runtime.internal.a.b(-1780043561, new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.material3.DatePickerKt$DatePicker$3
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
                                    DatePickerDefaults.f12132a.a(interfaceC1067t.f(), interfaceC1067t.b(), interfaceC1065q4, PaddingKt.e(androidx.compose.ui.h.a.f13984b, DatePickerKt.f12144f), interfaceC1084f3, 27648, 0);
                                }
                                return p293xa.r.f47939a;
                            }
                        }, c1086gP);
                    }
                    if (i17 != 0) {
                        z11 = true;
                    }
                    if ((i11 & 64) != 0) {
                        DatePickerDefaults datePickerDefaults111111111110 = DatePickerDefaults.f12132a;
                        i12 &= -3670017;
                        c1064pC = DatePickerDefaults.c(c1086gP);
                        pVar3 = pVarB;
                        pVar4 = pVarB2;
                        z12 = z11;
                        interfaceC1065q2 = interfaceC1065q4;
                        hVar3 = hVar2;
                    } else {
                        interfaceC1065q2 = interfaceC1065q4;
                        hVar3 = hVar2;
                        pVar3 = pVarB;
                        pVar4 = pVarB2;
                        z12 = z11;
                        c1064pC = c1064p2;
                    }
                }
                c1086gP.U();
                localeA = C1053h.a(c1086gP);
                zK = c1086gP.K(localeA);
                objF2 = c1086gP.f();
                if (zK) {
                    objF2 = new androidx.compose.material3.internal.l(localeA);
                    c1086gP.E(objF2);
                } else {
                    objF2 = new androidx.compose.material3.internal.l(localeA);
                    c1086gP.E(objF2);
                }
                final androidx.compose.material3.internal.k kVar119 = (androidx.compose.material3.internal.k) objF2;
                c1086gP.L(255587712);
                if (z12) {
                    composableLambdaImplB = androidx.compose.runtime.internal.a.b(1982226759, new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.material3.DatePickerKt$DatePicker$4
                        {
                            super(2);
                        }

                        @Override // Ia.p
                        public final p293xa.r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                            InterfaceC1084f interfaceC1084f3 = interfaceC1084f2;
                            if ((num.intValue() & 3) == 2 && interfaceC1084f3.s()) {
                                interfaceC1084f3.w();
                            } else {
                                androidx.compose.ui.h hVarE = PaddingKt.e(androidx.compose.ui.h.a.f13984b, DatePickerKt.f12142d);
                                int iB = interfaceC1067t.b();
                                boolean zK3 = interfaceC1084f3.K(interfaceC1067t);
                                final InterfaceC1067t interfaceC1067t2 = interfaceC1067t;
                                Object objF3 = interfaceC1084f3.f();
                                if (zK3 || objF3 == InterfaceC1084f.a.f12980a) {
                                    objF3 = new Ia.l<C1072y, p293xa.r>() { // from class: androidx.compose.material3.DatePickerKt$DatePicker$4$1$1
                                        {
                                            super(1);
                                        }

                                        @Override // Ia.l
                                        public final p293xa.r invoke(C1072y c1072y) {
                                            interfaceC1067t2.a(c1072y.f12768a);
                                            return p293xa.r.f47939a;
                                        }
                                    };
                                    interfaceC1084f3.E(objF3);
                                }
                                DatePickerKt.e(hVarE, iB, (Ia.l) objF3, interfaceC1084f3, 6);
                            }
                            return p293xa.r.f47939a;
                        }
                    }, c1086gP);
                } else {
                    composableLambdaImplB = null;
                }
                c1086gP.T(false);
                int i2111119 = ((i12 >> 3) & 14) | 14155776;
                int i21111110 = i12 >> 6;
                a(hVar3, pVar3, pVar4, composableLambdaImplB, c1064pC, TypographyKt.a(C0609d.f1247p, c1086gP), C0609d.f1245n, androidx.compose.runtime.internal.a.b(-1840727866, new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.material3.DatePickerKt$DatePicker$5
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
                            Long lF = interfaceC1067t.f();
                            long jE = interfaceC1067t.e();
                            int iB = interfaceC1067t.b();
                            boolean zK3 = interfaceC1084f3.K(interfaceC1067t);
                            final InterfaceC1067t interfaceC1067t2 = interfaceC1067t;
                            Object objF3 = interfaceC1084f3.f();
                            InterfaceC1084f.a.C0153a c0153a2 = InterfaceC1084f.a.f12980a;
                            if (zK3 || objF3 == c0153a2) {
                                objF3 = new Ia.l<Long, p293xa.r>() { // from class: androidx.compose.material3.DatePickerKt$DatePicker$5$1$1
                                    {
                                        super(1);
                                    }

                                    @Override // Ia.l
                                    public final p293xa.r invoke(Long l10) {
                                        interfaceC1067t2.h(l10);
                                        return p293xa.r.f47939a;
                                    }
                                };
                                interfaceC1084f3.E(objF3);
                            }
                            Ia.l lVar = (Ia.l) objF3;
                            boolean zK4 = interfaceC1084f3.K(interfaceC1067t);
                            final InterfaceC1067t interfaceC1067t3 = interfaceC1067t;
                            Object objF4 = interfaceC1084f3.f();
                            if (zK4 || objF4 == c0153a2) {
                                objF4 = new Ia.l<Long, p293xa.r>() { // from class: androidx.compose.material3.DatePickerKt$DatePicker$5$2$1
                                    {
                                        super(1);
                                    }

                                    @Override // Ia.l
                                    public final p293xa.r invoke(Long l10) {
                                        interfaceC1067t3.c(l10.longValue());
                                        return p293xa.r.f47939a;
                                    }
                                };
                                interfaceC1084f3.E(objF4);
                            }
                            DatePickerKt.k(lF, jE, iB, lVar, (Ia.l) objF4, kVar119, interfaceC1067t.g(), interfaceC1065q2, interfaceC1067t.d(), c1064pC, interfaceC1084f3, 0);
                        }
                        return p293xa.r.f47939a;
                    }
                }, c1086gP), c1086gP, i2111119 | (i21111110 & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) | (i21111110 & 896) | (i21111110 & 57344));
                pVar5 = pVar4;
                pVar6 = pVar3;
                interfaceC1065q3 = interfaceC1065q2;
                hVar4 = hVar3;
            } else {
                c1086gP.r0();
                i19 = i10 & 1;
                c0153a = InterfaceC1084f.a.f12980a;
                if (i19 != 0) {
                    if (i21 != 0) {
                        hVar2 = androidx.compose.ui.h.a.f13984b;
                    }
                    if ((i11 & 4) != 0) {
                        objF = c1086gP.f();
                        if (objF == c0153a) {
                            DatePickerDefaults datePickerDefaults111111111111 = DatePickerDefaults.f12132a;
                            objF = new r("yMMMM", "yMMMd", "yMMMMEEEEd");
                            c1086gP.E(objF);
                        }
                        interfaceC1065q4 = (InterfaceC1065q) objF;
                        i12 &= -897;
                    }
                    if (i13 != 0) {
                        pVarB = androidx.compose.runtime.internal.a.b(-1504998463, new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.material3.DatePickerKt$DatePicker$2
                            {
                                super(2);
                            }

                            @Override // Ia.p
                            public final p293xa.r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                                InterfaceC1084f interfaceC1084f3 = interfaceC1084f2;
                                if ((num.intValue() & 3) == 2 && interfaceC1084f3.s()) {
                                    interfaceC1084f3.w();
                                } else {
                                    DatePickerDefaults.f12132a.b(PaddingKt.e(androidx.compose.ui.h.a.f13984b, DatePickerKt.f12143e), interfaceC1067t.b(), 432, interfaceC1084f3, 0);
                                }
                                return p293xa.r.f47939a;
                            }
                        }, c1086gP);
                    }
                    if (i15 != 0) {
                        pVarB2 = androidx.compose.runtime.internal.a.b(-1780043561, new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.material3.DatePickerKt$DatePicker$3
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
                                    DatePickerDefaults.f12132a.a(interfaceC1067t.f(), interfaceC1067t.b(), interfaceC1065q4, PaddingKt.e(androidx.compose.ui.h.a.f13984b, DatePickerKt.f12144f), interfaceC1084f3, 27648, 0);
                                }
                                return p293xa.r.f47939a;
                            }
                        }, c1086gP);
                    }
                    if (i17 != 0) {
                        z11 = true;
                    }
                    if ((i11 & 64) != 0) {
                        DatePickerDefaults datePickerDefaults111111111112 = DatePickerDefaults.f12132a;
                        i12 &= -3670017;
                        c1064pC = DatePickerDefaults.c(c1086gP);
                        pVar3 = pVarB;
                        pVar4 = pVarB2;
                        z12 = z11;
                        interfaceC1065q2 = interfaceC1065q4;
                        hVar3 = hVar2;
                    } else {
                        interfaceC1065q2 = interfaceC1065q4;
                        hVar3 = hVar2;
                        pVar3 = pVarB;
                        pVar4 = pVarB2;
                        z12 = z11;
                        c1064pC = c1064p2;
                    }
                } else {
                    if (i21 != 0) {
                        hVar2 = androidx.compose.ui.h.a.f13984b;
                    }
                    if ((i11 & 4) != 0) {
                        objF = c1086gP.f();
                        if (objF == c0153a) {
                            DatePickerDefaults datePickerDefaults111111111113 = DatePickerDefaults.f12132a;
                            objF = new r("yMMMM", "yMMMd", "yMMMMEEEEd");
                            c1086gP.E(objF);
                        }
                        interfaceC1065q4 = (InterfaceC1065q) objF;
                        i12 &= -897;
                    }
                    if (i13 != 0) {
                        pVarB = androidx.compose.runtime.internal.a.b(-1504998463, new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.material3.DatePickerKt$DatePicker$2
                            {
                                super(2);
                            }

                            @Override // Ia.p
                            public final p293xa.r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                                InterfaceC1084f interfaceC1084f3 = interfaceC1084f2;
                                if ((num.intValue() & 3) == 2 && interfaceC1084f3.s()) {
                                    interfaceC1084f3.w();
                                } else {
                                    DatePickerDefaults.f12132a.b(PaddingKt.e(androidx.compose.ui.h.a.f13984b, DatePickerKt.f12143e), interfaceC1067t.b(), 432, interfaceC1084f3, 0);
                                }
                                return p293xa.r.f47939a;
                            }
                        }, c1086gP);
                    }
                    if (i15 != 0) {
                        pVarB2 = androidx.compose.runtime.internal.a.b(-1780043561, new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.material3.DatePickerKt$DatePicker$3
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
                                    DatePickerDefaults.f12132a.a(interfaceC1067t.f(), interfaceC1067t.b(), interfaceC1065q4, PaddingKt.e(androidx.compose.ui.h.a.f13984b, DatePickerKt.f12144f), interfaceC1084f3, 27648, 0);
                                }
                                return p293xa.r.f47939a;
                            }
                        }, c1086gP);
                    }
                    if (i17 != 0) {
                        z11 = true;
                    }
                    if ((i11 & 64) != 0) {
                        DatePickerDefaults datePickerDefaults111111111114 = DatePickerDefaults.f12132a;
                        i12 &= -3670017;
                        c1064pC = DatePickerDefaults.c(c1086gP);
                        pVar3 = pVarB;
                        pVar4 = pVarB2;
                        z12 = z11;
                        interfaceC1065q2 = interfaceC1065q4;
                        hVar3 = hVar2;
                    } else {
                        interfaceC1065q2 = interfaceC1065q4;
                        hVar3 = hVar2;
                        pVar3 = pVarB;
                        pVar4 = pVarB2;
                        z12 = z11;
                        c1064pC = c1064p2;
                    }
                }
                c1086gP.U();
                localeA = C1053h.a(c1086gP);
                zK = c1086gP.K(localeA);
                objF2 = c1086gP.f();
                if (zK) {
                    objF2 = new androidx.compose.material3.internal.l(localeA);
                    c1086gP.E(objF2);
                } else {
                    objF2 = new androidx.compose.material3.internal.l(localeA);
                    c1086gP.E(objF2);
                }
                final androidx.compose.material3.internal.k kVar1110 = (androidx.compose.material3.internal.k) objF2;
                c1086gP.L(255587712);
                if (z12) {
                    composableLambdaImplB = androidx.compose.runtime.internal.a.b(1982226759, new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.material3.DatePickerKt$DatePicker$4
                        {
                            super(2);
                        }

                        @Override // Ia.p
                        public final p293xa.r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                            InterfaceC1084f interfaceC1084f3 = interfaceC1084f2;
                            if ((num.intValue() & 3) == 2 && interfaceC1084f3.s()) {
                                interfaceC1084f3.w();
                            } else {
                                androidx.compose.ui.h hVarE = PaddingKt.e(androidx.compose.ui.h.a.f13984b, DatePickerKt.f12142d);
                                int iB = interfaceC1067t.b();
                                boolean zK3 = interfaceC1084f3.K(interfaceC1067t);
                                final InterfaceC1067t interfaceC1067t2 = interfaceC1067t;
                                Object objF3 = interfaceC1084f3.f();
                                if (zK3 || objF3 == InterfaceC1084f.a.f12980a) {
                                    objF3 = new Ia.l<C1072y, p293xa.r>() { // from class: androidx.compose.material3.DatePickerKt$DatePicker$4$1$1
                                        {
                                            super(1);
                                        }

                                        @Override // Ia.l
                                        public final p293xa.r invoke(C1072y c1072y) {
                                            interfaceC1067t2.a(c1072y.f12768a);
                                            return p293xa.r.f47939a;
                                        }
                                    };
                                    interfaceC1084f3.E(objF3);
                                }
                                DatePickerKt.e(hVarE, iB, (Ia.l) objF3, interfaceC1084f3, 6);
                            }
                            return p293xa.r.f47939a;
                        }
                    }, c1086gP);
                } else {
                    composableLambdaImplB = null;
                }
                c1086gP.T(false);
                int i21111111 = ((i12 >> 3) & 14) | 14155776;
                int i21111112 = i12 >> 6;
                a(hVar3, pVar3, pVar4, composableLambdaImplB, c1064pC, TypographyKt.a(C0609d.f1247p, c1086gP), C0609d.f1245n, androidx.compose.runtime.internal.a.b(-1840727866, new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.material3.DatePickerKt$DatePicker$5
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
                            Long lF = interfaceC1067t.f();
                            long jE = interfaceC1067t.e();
                            int iB = interfaceC1067t.b();
                            boolean zK3 = interfaceC1084f3.K(interfaceC1067t);
                            final InterfaceC1067t interfaceC1067t2 = interfaceC1067t;
                            Object objF3 = interfaceC1084f3.f();
                            InterfaceC1084f.a.C0153a c0153a2 = InterfaceC1084f.a.f12980a;
                            if (zK3 || objF3 == c0153a2) {
                                objF3 = new Ia.l<Long, p293xa.r>() { // from class: androidx.compose.material3.DatePickerKt$DatePicker$5$1$1
                                    {
                                        super(1);
                                    }

                                    @Override // Ia.l
                                    public final p293xa.r invoke(Long l10) {
                                        interfaceC1067t2.h(l10);
                                        return p293xa.r.f47939a;
                                    }
                                };
                                interfaceC1084f3.E(objF3);
                            }
                            Ia.l lVar = (Ia.l) objF3;
                            boolean zK4 = interfaceC1084f3.K(interfaceC1067t);
                            final InterfaceC1067t interfaceC1067t3 = interfaceC1067t;
                            Object objF4 = interfaceC1084f3.f();
                            if (zK4 || objF4 == c0153a2) {
                                objF4 = new Ia.l<Long, p293xa.r>() { // from class: androidx.compose.material3.DatePickerKt$DatePicker$5$2$1
                                    {
                                        super(1);
                                    }

                                    @Override // Ia.l
                                    public final p293xa.r invoke(Long l10) {
                                        interfaceC1067t3.c(l10.longValue());
                                        return p293xa.r.f47939a;
                                    }
                                };
                                interfaceC1084f3.E(objF4);
                            }
                            DatePickerKt.k(lF, jE, iB, lVar, (Ia.l) objF4, kVar1110, interfaceC1067t.g(), interfaceC1065q2, interfaceC1067t.d(), c1064pC, interfaceC1084f3, 0);
                        }
                        return p293xa.r.f47939a;
                    }
                }, c1086gP), c1086gP, i21111111 | (i21111112 & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) | (i21111112 & 896) | (i21111112 & 57344));
                pVar5 = pVar4;
                pVar6 = pVar3;
                interfaceC1065q3 = interfaceC1065q2;
                hVar4 = hVar3;
            }
            c1105p0V = c1086gP.V();
            if (c1105p0V != null) {
                final boolean z117 = z12;
                final C1064p c1064p17 = c1064pC;
                c1105p0V.f13109d = new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.material3.DatePickerKt$DatePicker$6
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(2);
                    }

                    @Override // Ia.p
                    public final p293xa.r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                        num.intValue();
                        DatePickerKt.b(interfaceC1067t, hVar4, interfaceC1065q3, pVar6, pVar5, z117, c1064p17, interfaceC1084f2, L4.b.l(i10 | 1), i11);
                        return p293xa.r.f47939a;
                    }
                };
            }
        }
        i12 |= 196608;
        z11 = z10;
        if ((1572864 & i10) == 0) {
            if ((i11 & 64) == 0) {
                c1064p2 = c1064p;
                if (c1086gP.K(c1064p2)) {
                }
                i12 |= i22;
            } else {
                c1064p2 = c1064p;
            }
            i12 |= i22;
        } else {
            c1064p2 = c1064p;
        }
        if ((i12 & 599187) == 599186) {
            c1086gP.r0();
            i19 = i10 & 1;
            c0153a = InterfaceC1084f.a.f12980a;
            if (i19 != 0) {
                if (i21 != 0) {
                    hVar2 = androidx.compose.ui.h.a.f13984b;
                }
                if ((i11 & 4) != 0) {
                    objF = c1086gP.f();
                    if (objF == c0153a) {
                        DatePickerDefaults datePickerDefaults111111111115 = DatePickerDefaults.f12132a;
                        objF = new r("yMMMM", "yMMMd", "yMMMMEEEEd");
                        c1086gP.E(objF);
                    }
                    interfaceC1065q4 = (InterfaceC1065q) objF;
                    i12 &= -897;
                }
                if (i13 != 0) {
                    pVarB = androidx.compose.runtime.internal.a.b(-1504998463, new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.material3.DatePickerKt$DatePicker$2
                        {
                            super(2);
                        }

                        @Override // Ia.p
                        public final p293xa.r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                            InterfaceC1084f interfaceC1084f3 = interfaceC1084f2;
                            if ((num.intValue() & 3) == 2 && interfaceC1084f3.s()) {
                                interfaceC1084f3.w();
                            } else {
                                DatePickerDefaults.f12132a.b(PaddingKt.e(androidx.compose.ui.h.a.f13984b, DatePickerKt.f12143e), interfaceC1067t.b(), 432, interfaceC1084f3, 0);
                            }
                            return p293xa.r.f47939a;
                        }
                    }, c1086gP);
                }
                if (i15 != 0) {
                    pVarB2 = androidx.compose.runtime.internal.a.b(-1780043561, new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.material3.DatePickerKt$DatePicker$3
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
                                DatePickerDefaults.f12132a.a(interfaceC1067t.f(), interfaceC1067t.b(), interfaceC1065q4, PaddingKt.e(androidx.compose.ui.h.a.f13984b, DatePickerKt.f12144f), interfaceC1084f3, 27648, 0);
                            }
                            return p293xa.r.f47939a;
                        }
                    }, c1086gP);
                }
                if (i17 != 0) {
                    z11 = true;
                }
                if ((i11 & 64) != 0) {
                    DatePickerDefaults datePickerDefaults111111111116 = DatePickerDefaults.f12132a;
                    i12 &= -3670017;
                    c1064pC = DatePickerDefaults.c(c1086gP);
                    pVar3 = pVarB;
                    pVar4 = pVarB2;
                    z12 = z11;
                    interfaceC1065q2 = interfaceC1065q4;
                    hVar3 = hVar2;
                } else {
                    interfaceC1065q2 = interfaceC1065q4;
                    hVar3 = hVar2;
                    pVar3 = pVarB;
                    pVar4 = pVarB2;
                    z12 = z11;
                    c1064pC = c1064p2;
                }
            } else {
                if (i21 != 0) {
                    hVar2 = androidx.compose.ui.h.a.f13984b;
                }
                if ((i11 & 4) != 0) {
                    objF = c1086gP.f();
                    if (objF == c0153a) {
                        DatePickerDefaults datePickerDefaults111111111117 = DatePickerDefaults.f12132a;
                        objF = new r("yMMMM", "yMMMd", "yMMMMEEEEd");
                        c1086gP.E(objF);
                    }
                    interfaceC1065q4 = (InterfaceC1065q) objF;
                    i12 &= -897;
                }
                if (i13 != 0) {
                    pVarB = androidx.compose.runtime.internal.a.b(-1504998463, new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.material3.DatePickerKt$DatePicker$2
                        {
                            super(2);
                        }

                        @Override // Ia.p
                        public final p293xa.r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                            InterfaceC1084f interfaceC1084f3 = interfaceC1084f2;
                            if ((num.intValue() & 3) == 2 && interfaceC1084f3.s()) {
                                interfaceC1084f3.w();
                            } else {
                                DatePickerDefaults.f12132a.b(PaddingKt.e(androidx.compose.ui.h.a.f13984b, DatePickerKt.f12143e), interfaceC1067t.b(), 432, interfaceC1084f3, 0);
                            }
                            return p293xa.r.f47939a;
                        }
                    }, c1086gP);
                }
                if (i15 != 0) {
                    pVarB2 = androidx.compose.runtime.internal.a.b(-1780043561, new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.material3.DatePickerKt$DatePicker$3
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
                                DatePickerDefaults.f12132a.a(interfaceC1067t.f(), interfaceC1067t.b(), interfaceC1065q4, PaddingKt.e(androidx.compose.ui.h.a.f13984b, DatePickerKt.f12144f), interfaceC1084f3, 27648, 0);
                            }
                            return p293xa.r.f47939a;
                        }
                    }, c1086gP);
                }
                if (i17 != 0) {
                    z11 = true;
                }
                if ((i11 & 64) != 0) {
                    DatePickerDefaults datePickerDefaults111111111118 = DatePickerDefaults.f12132a;
                    i12 &= -3670017;
                    c1064pC = DatePickerDefaults.c(c1086gP);
                    pVar3 = pVarB;
                    pVar4 = pVarB2;
                    z12 = z11;
                    interfaceC1065q2 = interfaceC1065q4;
                    hVar3 = hVar2;
                } else {
                    interfaceC1065q2 = interfaceC1065q4;
                    hVar3 = hVar2;
                    pVar3 = pVarB;
                    pVar4 = pVarB2;
                    z12 = z11;
                    c1064pC = c1064p2;
                }
            }
            c1086gP.U();
            localeA = C1053h.a(c1086gP);
            zK = c1086gP.K(localeA);
            objF2 = c1086gP.f();
            if (zK) {
                objF2 = new androidx.compose.material3.internal.l(localeA);
                c1086gP.E(objF2);
            } else {
                objF2 = new androidx.compose.material3.internal.l(localeA);
                c1086gP.E(objF2);
            }
            final androidx.compose.material3.internal.k kVar1111 = (androidx.compose.material3.internal.k) objF2;
            c1086gP.L(255587712);
            if (z12) {
                composableLambdaImplB = androidx.compose.runtime.internal.a.b(1982226759, new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.material3.DatePickerKt$DatePicker$4
                    {
                        super(2);
                    }

                    @Override // Ia.p
                    public final p293xa.r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                        InterfaceC1084f interfaceC1084f3 = interfaceC1084f2;
                        if ((num.intValue() & 3) == 2 && interfaceC1084f3.s()) {
                            interfaceC1084f3.w();
                        } else {
                            androidx.compose.ui.h hVarE = PaddingKt.e(androidx.compose.ui.h.a.f13984b, DatePickerKt.f12142d);
                            int iB = interfaceC1067t.b();
                            boolean zK3 = interfaceC1084f3.K(interfaceC1067t);
                            final InterfaceC1067t interfaceC1067t2 = interfaceC1067t;
                            Object objF3 = interfaceC1084f3.f();
                            if (zK3 || objF3 == InterfaceC1084f.a.f12980a) {
                                objF3 = new Ia.l<C1072y, p293xa.r>() { // from class: androidx.compose.material3.DatePickerKt$DatePicker$4$1$1
                                    {
                                        super(1);
                                    }

                                    @Override // Ia.l
                                    public final p293xa.r invoke(C1072y c1072y) {
                                        interfaceC1067t2.a(c1072y.f12768a);
                                        return p293xa.r.f47939a;
                                    }
                                };
                                interfaceC1084f3.E(objF3);
                            }
                            DatePickerKt.e(hVarE, iB, (Ia.l) objF3, interfaceC1084f3, 6);
                        }
                        return p293xa.r.f47939a;
                    }
                }, c1086gP);
            } else {
                composableLambdaImplB = null;
            }
            c1086gP.T(false);
            int i21111113 = ((i12 >> 3) & 14) | 14155776;
            int i21111114 = i12 >> 6;
            a(hVar3, pVar3, pVar4, composableLambdaImplB, c1064pC, TypographyKt.a(C0609d.f1247p, c1086gP), C0609d.f1245n, androidx.compose.runtime.internal.a.b(-1840727866, new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.material3.DatePickerKt$DatePicker$5
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
                        Long lF = interfaceC1067t.f();
                        long jE = interfaceC1067t.e();
                        int iB = interfaceC1067t.b();
                        boolean zK3 = interfaceC1084f3.K(interfaceC1067t);
                        final InterfaceC1067t interfaceC1067t2 = interfaceC1067t;
                        Object objF3 = interfaceC1084f3.f();
                        InterfaceC1084f.a.C0153a c0153a2 = InterfaceC1084f.a.f12980a;
                        if (zK3 || objF3 == c0153a2) {
                            objF3 = new Ia.l<Long, p293xa.r>() { // from class: androidx.compose.material3.DatePickerKt$DatePicker$5$1$1
                                {
                                    super(1);
                                }

                                @Override // Ia.l
                                public final p293xa.r invoke(Long l10) {
                                    interfaceC1067t2.h(l10);
                                    return p293xa.r.f47939a;
                                }
                            };
                            interfaceC1084f3.E(objF3);
                        }
                        Ia.l lVar = (Ia.l) objF3;
                        boolean zK4 = interfaceC1084f3.K(interfaceC1067t);
                        final InterfaceC1067t interfaceC1067t3 = interfaceC1067t;
                        Object objF4 = interfaceC1084f3.f();
                        if (zK4 || objF4 == c0153a2) {
                            objF4 = new Ia.l<Long, p293xa.r>() { // from class: androidx.compose.material3.DatePickerKt$DatePicker$5$2$1
                                {
                                    super(1);
                                }

                                @Override // Ia.l
                                public final p293xa.r invoke(Long l10) {
                                    interfaceC1067t3.c(l10.longValue());
                                    return p293xa.r.f47939a;
                                }
                            };
                            interfaceC1084f3.E(objF4);
                        }
                        DatePickerKt.k(lF, jE, iB, lVar, (Ia.l) objF4, kVar1111, interfaceC1067t.g(), interfaceC1065q2, interfaceC1067t.d(), c1064pC, interfaceC1084f3, 0);
                    }
                    return p293xa.r.f47939a;
                }
            }, c1086gP), c1086gP, i21111113 | (i21111114 & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) | (i21111114 & 896) | (i21111114 & 57344));
            pVar5 = pVar4;
            pVar6 = pVar3;
            interfaceC1065q3 = interfaceC1065q2;
            hVar4 = hVar3;
        } else {
            c1086gP.r0();
            i19 = i10 & 1;
            c0153a = InterfaceC1084f.a.f12980a;
            if (i19 != 0) {
                if (i21 != 0) {
                    hVar2 = androidx.compose.ui.h.a.f13984b;
                }
                if ((i11 & 4) != 0) {
                    objF = c1086gP.f();
                    if (objF == c0153a) {
                        DatePickerDefaults datePickerDefaults111111111119 = DatePickerDefaults.f12132a;
                        objF = new r("yMMMM", "yMMMd", "yMMMMEEEEd");
                        c1086gP.E(objF);
                    }
                    interfaceC1065q4 = (InterfaceC1065q) objF;
                    i12 &= -897;
                }
                if (i13 != 0) {
                    pVarB = androidx.compose.runtime.internal.a.b(-1504998463, new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.material3.DatePickerKt$DatePicker$2
                        {
                            super(2);
                        }

                        @Override // Ia.p
                        public final p293xa.r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                            InterfaceC1084f interfaceC1084f3 = interfaceC1084f2;
                            if ((num.intValue() & 3) == 2 && interfaceC1084f3.s()) {
                                interfaceC1084f3.w();
                            } else {
                                DatePickerDefaults.f12132a.b(PaddingKt.e(androidx.compose.ui.h.a.f13984b, DatePickerKt.f12143e), interfaceC1067t.b(), 432, interfaceC1084f3, 0);
                            }
                            return p293xa.r.f47939a;
                        }
                    }, c1086gP);
                }
                if (i15 != 0) {
                    pVarB2 = androidx.compose.runtime.internal.a.b(-1780043561, new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.material3.DatePickerKt$DatePicker$3
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
                                DatePickerDefaults.f12132a.a(interfaceC1067t.f(), interfaceC1067t.b(), interfaceC1065q4, PaddingKt.e(androidx.compose.ui.h.a.f13984b, DatePickerKt.f12144f), interfaceC1084f3, 27648, 0);
                            }
                            return p293xa.r.f47939a;
                        }
                    }, c1086gP);
                }
                if (i17 != 0) {
                    z11 = true;
                }
                if ((i11 & 64) != 0) {
                    DatePickerDefaults datePickerDefaults1111111111110 = DatePickerDefaults.f12132a;
                    i12 &= -3670017;
                    c1064pC = DatePickerDefaults.c(c1086gP);
                    pVar3 = pVarB;
                    pVar4 = pVarB2;
                    z12 = z11;
                    interfaceC1065q2 = interfaceC1065q4;
                    hVar3 = hVar2;
                } else {
                    interfaceC1065q2 = interfaceC1065q4;
                    hVar3 = hVar2;
                    pVar3 = pVarB;
                    pVar4 = pVarB2;
                    z12 = z11;
                    c1064pC = c1064p2;
                }
            } else {
                if (i21 != 0) {
                    hVar2 = androidx.compose.ui.h.a.f13984b;
                }
                if ((i11 & 4) != 0) {
                    objF = c1086gP.f();
                    if (objF == c0153a) {
                        DatePickerDefaults datePickerDefaults1111111111111 = DatePickerDefaults.f12132a;
                        objF = new r("yMMMM", "yMMMd", "yMMMMEEEEd");
                        c1086gP.E(objF);
                    }
                    interfaceC1065q4 = (InterfaceC1065q) objF;
                    i12 &= -897;
                }
                if (i13 != 0) {
                    pVarB = androidx.compose.runtime.internal.a.b(-1504998463, new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.material3.DatePickerKt$DatePicker$2
                        {
                            super(2);
                        }

                        @Override // Ia.p
                        public final p293xa.r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                            InterfaceC1084f interfaceC1084f3 = interfaceC1084f2;
                            if ((num.intValue() & 3) == 2 && interfaceC1084f3.s()) {
                                interfaceC1084f3.w();
                            } else {
                                DatePickerDefaults.f12132a.b(PaddingKt.e(androidx.compose.ui.h.a.f13984b, DatePickerKt.f12143e), interfaceC1067t.b(), 432, interfaceC1084f3, 0);
                            }
                            return p293xa.r.f47939a;
                        }
                    }, c1086gP);
                }
                if (i15 != 0) {
                    pVarB2 = androidx.compose.runtime.internal.a.b(-1780043561, new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.material3.DatePickerKt$DatePicker$3
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
                                DatePickerDefaults.f12132a.a(interfaceC1067t.f(), interfaceC1067t.b(), interfaceC1065q4, PaddingKt.e(androidx.compose.ui.h.a.f13984b, DatePickerKt.f12144f), interfaceC1084f3, 27648, 0);
                            }
                            return p293xa.r.f47939a;
                        }
                    }, c1086gP);
                }
                if (i17 != 0) {
                    z11 = true;
                }
                if ((i11 & 64) != 0) {
                    DatePickerDefaults datePickerDefaults1111111111112 = DatePickerDefaults.f12132a;
                    i12 &= -3670017;
                    c1064pC = DatePickerDefaults.c(c1086gP);
                    pVar3 = pVarB;
                    pVar4 = pVarB2;
                    z12 = z11;
                    interfaceC1065q2 = interfaceC1065q4;
                    hVar3 = hVar2;
                } else {
                    interfaceC1065q2 = interfaceC1065q4;
                    hVar3 = hVar2;
                    pVar3 = pVarB;
                    pVar4 = pVarB2;
                    z12 = z11;
                    c1064pC = c1064p2;
                }
            }
            c1086gP.U();
            localeA = C1053h.a(c1086gP);
            zK = c1086gP.K(localeA);
            objF2 = c1086gP.f();
            if (zK) {
                objF2 = new androidx.compose.material3.internal.l(localeA);
                c1086gP.E(objF2);
            } else {
                objF2 = new androidx.compose.material3.internal.l(localeA);
                c1086gP.E(objF2);
            }
            final androidx.compose.material3.internal.k kVar1112 = (androidx.compose.material3.internal.k) objF2;
            c1086gP.L(255587712);
            if (z12) {
                composableLambdaImplB = androidx.compose.runtime.internal.a.b(1982226759, new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.material3.DatePickerKt$DatePicker$4
                    {
                        super(2);
                    }

                    @Override // Ia.p
                    public final p293xa.r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                        InterfaceC1084f interfaceC1084f3 = interfaceC1084f2;
                        if ((num.intValue() & 3) == 2 && interfaceC1084f3.s()) {
                            interfaceC1084f3.w();
                        } else {
                            androidx.compose.ui.h hVarE = PaddingKt.e(androidx.compose.ui.h.a.f13984b, DatePickerKt.f12142d);
                            int iB = interfaceC1067t.b();
                            boolean zK3 = interfaceC1084f3.K(interfaceC1067t);
                            final InterfaceC1067t interfaceC1067t2 = interfaceC1067t;
                            Object objF3 = interfaceC1084f3.f();
                            if (zK3 || objF3 == InterfaceC1084f.a.f12980a) {
                                objF3 = new Ia.l<C1072y, p293xa.r>() { // from class: androidx.compose.material3.DatePickerKt$DatePicker$4$1$1
                                    {
                                        super(1);
                                    }

                                    @Override // Ia.l
                                    public final p293xa.r invoke(C1072y c1072y) {
                                        interfaceC1067t2.a(c1072y.f12768a);
                                        return p293xa.r.f47939a;
                                    }
                                };
                                interfaceC1084f3.E(objF3);
                            }
                            DatePickerKt.e(hVarE, iB, (Ia.l) objF3, interfaceC1084f3, 6);
                        }
                        return p293xa.r.f47939a;
                    }
                }, c1086gP);
            } else {
                composableLambdaImplB = null;
            }
            c1086gP.T(false);
            int i21111115 = ((i12 >> 3) & 14) | 14155776;
            int i21111116 = i12 >> 6;
            a(hVar3, pVar3, pVar4, composableLambdaImplB, c1064pC, TypographyKt.a(C0609d.f1247p, c1086gP), C0609d.f1245n, androidx.compose.runtime.internal.a.b(-1840727866, new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.material3.DatePickerKt$DatePicker$5
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
                        Long lF = interfaceC1067t.f();
                        long jE = interfaceC1067t.e();
                        int iB = interfaceC1067t.b();
                        boolean zK3 = interfaceC1084f3.K(interfaceC1067t);
                        final InterfaceC1067t interfaceC1067t2 = interfaceC1067t;
                        Object objF3 = interfaceC1084f3.f();
                        InterfaceC1084f.a.C0153a c0153a2 = InterfaceC1084f.a.f12980a;
                        if (zK3 || objF3 == c0153a2) {
                            objF3 = new Ia.l<Long, p293xa.r>() { // from class: androidx.compose.material3.DatePickerKt$DatePicker$5$1$1
                                {
                                    super(1);
                                }

                                @Override // Ia.l
                                public final p293xa.r invoke(Long l10) {
                                    interfaceC1067t2.h(l10);
                                    return p293xa.r.f47939a;
                                }
                            };
                            interfaceC1084f3.E(objF3);
                        }
                        Ia.l lVar = (Ia.l) objF3;
                        boolean zK4 = interfaceC1084f3.K(interfaceC1067t);
                        final InterfaceC1067t interfaceC1067t3 = interfaceC1067t;
                        Object objF4 = interfaceC1084f3.f();
                        if (zK4 || objF4 == c0153a2) {
                            objF4 = new Ia.l<Long, p293xa.r>() { // from class: androidx.compose.material3.DatePickerKt$DatePicker$5$2$1
                                {
                                    super(1);
                                }

                                @Override // Ia.l
                                public final p293xa.r invoke(Long l10) {
                                    interfaceC1067t3.c(l10.longValue());
                                    return p293xa.r.f47939a;
                                }
                            };
                            interfaceC1084f3.E(objF4);
                        }
                        DatePickerKt.k(lF, jE, iB, lVar, (Ia.l) objF4, kVar1112, interfaceC1067t.g(), interfaceC1065q2, interfaceC1067t.d(), c1064pC, interfaceC1084f3, 0);
                    }
                    return p293xa.r.f47939a;
                }
            }, c1086gP), c1086gP, i21111115 | (i21111116 & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) | (i21111116 & 896) | (i21111116 & 57344));
            pVar5 = pVar4;
            pVar6 = pVar3;
            interfaceC1065q3 = interfaceC1065q2;
            hVar4 = hVar3;
        }
        c1105p0V = c1086gP.V();
        if (c1105p0V != null) {
            final boolean z118 = z12;
            final C1064p c1064p18 = c1064pC;
            c1105p0V.f13109d = new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.material3.DatePickerKt$DatePicker$6
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(2);
                }

                @Override // Ia.p
                public final p293xa.r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                    num.intValue();
                    DatePickerKt.b(interfaceC1067t, hVar4, interfaceC1065q3, pVar6, pVar5, z118, c1064p18, interfaceC1084f2, L4.b.l(i10 | 1), i11);
                    return p293xa.r.f47939a;
                }
            };
        }
    }

    public static final void c(final androidx.compose.ui.h hVar, final Ia.p<? super InterfaceC1084f, ? super Integer, p293xa.r> pVar, final long j, final long j10, final float f10, final Ia.p<? super InterfaceC1084f, ? super Integer, p293xa.r> pVar2, InterfaceC1084f interfaceC1084f, final int i10) {
        int i11;
        boolean z10;
        C1086g c1086gP = interfaceC1084f.p(-996037719);
        if ((i10 & 6) == 0) {
            i11 = (c1086gP.K(hVar) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            i11 |= c1086gP.k(pVar) ? 32 : 16;
        }
        if ((i10 & 384) == 0) {
            i11 |= c1086gP.i(j) ? 256 : 128;
        }
        if ((i10 & 3072) == 0) {
            i11 |= c1086gP.i(j10) ? 2048 : 1024;
        }
        if ((i10 & 24576) == 0) {
            i11 |= c1086gP.g(f10) ? 16384 : 8192;
        }
        if ((196608 & i10) == 0) {
            i11 |= c1086gP.k(pVar2) ? 131072 : 65536;
        }
        if ((74899 & i11) == 74898 && c1086gP.s()) {
            c1086gP.w();
        } else {
            androidx.compose.ui.h hVarB = androidx.compose.ui.h.a.f13984b;
            if (pVar != null) {
                hVarB = androidx.compose.foundation.layout.W.b(hVarB, 0.0f, f10, 1);
            }
            androidx.compose.ui.h hVarI = androidx.compose.foundation.layout.W.d(hVar, 1.0f).i(hVarB);
            C0953m c0953mA = C0952l.a(C0945e.f10290g, androidx.compose.ui.d.a.f13346m, c1086gP, 6);
            int i12 = c1086gP.f12996P;
            InterfaceC1089h0 interfaceC1089h0P = c1086gP.P();
            androidx.compose.ui.h hVarC = ComposedModifierKt.c(c1086gP, hVarI);
            ComposeUiNode.f14331c0.getClass();
            Ia.a<ComposeUiNode> aVar = ComposeUiNode.Companion.f14333b;
            c1086gP.r();
            if (c1086gP.f12995O) {
                c1086gP.v(aVar);
            } else {
                c1086gP.A();
            }
            R0.a(ComposeUiNode.Companion.f14337f, c1086gP, c0953mA);
            R0.a(ComposeUiNode.Companion.f14336e, c1086gP, interfaceC1089h0P);
            Ia.p<ComposeUiNode, Integer, p293xa.r> pVar3 = ComposeUiNode.Companion.f14338g;
            if (c1086gP.f12995O || !kotlin.jvm.internal.i.a(c1086gP.f(), Integer.valueOf(i12))) {
                J4.i.d(i12, c1086gP, i12, pVar3);
            }
            R0.a(ComposeUiNode.Companion.f14335d, c1086gP, hVarC);
            c1086gP.L(594325590);
            if (pVar != null) {
                z10 = true;
                ProvideContentColorTextStyleKt.a(j, TypographyKt.a(C0609d.f1249r, c1086gP), androidx.compose.runtime.internal.a.b(1936268514, new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.material3.DatePickerKt$DatePickerHeader$1$1
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
                            androidx.compose.ui.f fVar = androidx.compose.ui.d.a.f13341g;
                            Ia.p<InterfaceC1084f, Integer, p293xa.r> pVar4 = pVar;
                            androidx.compose.ui.h.a aVar2 = androidx.compose.ui.h.a.f13984b;
                            androidx.compose.ui.layout.E eD = BoxKt.d(fVar, false);
                            int iF = interfaceC1084f3.F();
                            InterfaceC1089h0 interfaceC1089h0Z = interfaceC1084f3.z();
                            androidx.compose.ui.h hVarC2 = ComposedModifierKt.c(interfaceC1084f3, aVar2);
                            ComposeUiNode.f14331c0.getClass();
                            Ia.a<ComposeUiNode> aVar3 = ComposeUiNode.Companion.f14333b;
                            if (interfaceC1084f3.u() == null) {
                                I.b.k();
                                throw null;
                            }
                            interfaceC1084f3.r();
                            if (interfaceC1084f3.m()) {
                                interfaceC1084f3.v(aVar3);
                            } else {
                                interfaceC1084f3.A();
                            }
                            R0.a(ComposeUiNode.Companion.f14337f, interfaceC1084f3, eD);
                            R0.a(ComposeUiNode.Companion.f14336e, interfaceC1084f3, interfaceC1089h0Z);
                            Ia.p<ComposeUiNode, Integer, p293xa.r> pVar5 = ComposeUiNode.Companion.f14338g;
                            if (interfaceC1084f3.m() || !kotlin.jvm.internal.i.a(interfaceC1084f3.f(), Integer.valueOf(iF))) {
                                androidx.compose.animation.k.b(iF, interfaceC1084f3, iF, pVar5);
                            }
                            R0.a(ComposeUiNode.Companion.f14335d, interfaceC1084f3, hVarC2);
                            androidx.compose.foundation.gestures.d.c(pVar4, interfaceC1084f3, 0);
                        }
                        return p293xa.r.f47939a;
                    }
                }, c1086gP), c1086gP, ((i11 >> 6) & 14) | 384);
            } else {
                z10 = true;
            }
            c1086gP.T(false);
            CompositionLocalKt.a(B7.b.b(j10, ContentColorKt.f12125a), pVar2, c1086gP, ((i11 >> 12) & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) | 8);
            c1086gP.T(z10);
        }
        C1105p0 c1105p0V = c1086gP.V();
        if (c1105p0V != null) {
            c1105p0V.f13109d = new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.material3.DatePickerKt$DatePickerHeader$2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(2);
                }

                @Override // Ia.p
                public final p293xa.r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                    num.intValue();
                    DatePickerKt.c(hVar, pVar, j, j10, f10, pVar2, interfaceC1084f2, L4.b.l(i10 | 1));
                    return p293xa.r.f47939a;
                }
            };
        }
    }

    public static final void d(final androidx.compose.ui.h hVar, final boolean z10, final Ia.a<p293xa.r> aVar, final boolean z11, final boolean z12, final boolean z13, final boolean z14, final String str, final C1064p c1064p, final Ia.p<? super InterfaceC1084f, ? super Integer, p293xa.r> pVar, InterfaceC1084f interfaceC1084f, final int i10) {
        int i11;
        long j;
        N0 n0I;
        androidx.compose.ui.h hVar2;
        long j10;
        C0937i c0937i;
        N0 n0A;
        C1086g c1086g;
        C1086g c1086gP = interfaceC1084f.p(-1434777861);
        if ((i10 & 6) == 0) {
            i11 = (c1086gP.K(hVar) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            i11 |= c1086gP.c(z10) ? 32 : 16;
        }
        if ((i10 & 384) == 0) {
            i11 |= c1086gP.k(aVar) ? 256 : 128;
        }
        if ((i10 & 3072) == 0) {
            i11 |= c1086gP.c(z11) ? 2048 : 1024;
        }
        if ((i10 & 24576) == 0) {
            i11 |= c1086gP.c(z12) ? 16384 : 8192;
        }
        if ((196608 & i10) == 0) {
            i11 |= c1086gP.c(z13) ? 131072 : 65536;
        }
        if ((1572864 & i10) == 0) {
            i11 |= c1086gP.c(z14) ? 1048576 : 524288;
        }
        if ((12582912 & i10) == 0) {
            i11 |= c1086gP.K(str) ? 8388608 : 4194304;
        }
        if ((100663296 & i10) == 0) {
            i11 |= c1086gP.K(c1064p) ? 67108864 : 33554432;
        }
        if ((805306368 & i10) == 0) {
            i11 |= c1086gP.k(pVar) ? 536870912 : 268435456;
        }
        if ((306783379 & i11) == 306783378 && c1086gP.s()) {
            c1086gP.w();
            c1086g = c1086gP;
        } else {
            boolean z15 = (29360128 & i11) == 8388608;
            Object objF = c1086gP.f();
            if (z15 || objF == InterfaceC1084f.a.f12980a) {
                objF = new Ia.l<androidx.compose.ui.semantics.w, p293xa.r>() { // from class: androidx.compose.material3.DatePickerKt$Day$1$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(1);
                    }

                    @Override // Ia.l
                    public final p293xa.r invoke(androidx.compose.ui.semantics.w wVar) {
                        androidx.compose.ui.semantics.w wVar2 = wVar;
                        C1260a c1260a = new C1260a(6, str, null);
                        Oa.l<Object>[] lVarArr = androidx.compose.ui.semantics.t.f15251a;
                        wVar2.e(SemanticsProperties.f15172z, M1.k(c1260a));
                        androidx.compose.ui.semantics.t.k(wVar2, 0);
                        return p293xa.r.f47939a;
                    }
                };
                c1086gP.E(objF);
            }
            androidx.compose.ui.h hVarB = androidx.compose.ui.semantics.p.b(hVar, true, (Ia.l) objF);
            androidx.compose.ui.graphics.l0 l0VarA = ShapesKt.a(C0609d.f1236d, c1086gP);
            int i12 = i11 >> 3;
            if (z10) {
                j = z12 ? c1064p.f12680r : c1064p.f12681s;
            } else {
                c1064p.getClass();
                j = androidx.compose.ui.graphics.H.f13503k;
            }
            if (z11) {
                c1086gP.L(-217363149);
                n0I = androidx.compose.animation.x.a(j, C0907g.d(100, 0, null, 6), null, c1086gP, 0, 12);
                c1086gP.T(false);
            } else {
                c1086gP.L(-217247953);
                n0I = J0.i(new androidx.compose.ui.graphics.H(j), c1086gP);
                c1086gP.T(false);
            }
            long j11 = ((androidx.compose.ui.graphics.H) n0I.getValue()).f13506a;
            if (z10 && z12) {
                hVar2 = hVarB;
                j10 = c1064p.f12678p;
            } else {
                hVar2 = hVarB;
                if (z10 && !z12) {
                    j10 = c1064p.f12679q;
                } else if (z14 && z12) {
                    j10 = c1064p.f12685w;
                } else {
                    j10 = c1064p.f12677o;
                    if (!z14 || z12) {
                        if (z13) {
                            j10 = c1064p.f12682t;
                        } else if (z12) {
                            j10 = c1064p.f12676n;
                        }
                    }
                }
            }
            if (z14) {
                c1086gP.L(-828303257);
                n0A = J0.i(new androidx.compose.ui.graphics.H(j10), c1086gP);
                c1086gP.T(false);
                c0937i = null;
            } else {
                c1086gP.L(-828241443);
                c0937i = null;
                n0A = androidx.compose.animation.x.a(j10, C0907g.d(100, 0, null, 6), null, c1086gP, 0, 12);
                c1086gP.T(false);
            }
            androidx.compose.ui.h hVar3 = hVar2;
            c1086g = c1086gP;
            SurfaceKt.b(z10, aVar, hVar3, z12, l0VarA, j11, ((androidx.compose.ui.graphics.H) n0A.getValue()).f13506a, (!z13 || z10) ? c0937i : C1787c0.a(C0609d.f1242k, c1064p.f12683u), androidx.compose.runtime.internal.a.b(-2031780827, new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.material3.DatePickerKt$Day$2
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
                        androidx.compose.ui.h hVarJ = androidx.compose.foundation.layout.W.j(C0609d.f1241i, C0609d.f1240h, androidx.compose.ui.h.a.f13984b);
                        androidx.compose.ui.f fVar = androidx.compose.ui.d.a.f13339e;
                        Ia.p<InterfaceC1084f, Integer, p293xa.r> pVar2 = pVar;
                        androidx.compose.ui.layout.E eD = BoxKt.d(fVar, false);
                        int iF = interfaceC1084f3.F();
                        InterfaceC1089h0 interfaceC1089h0Z = interfaceC1084f3.z();
                        androidx.compose.ui.h hVarC = ComposedModifierKt.c(interfaceC1084f3, hVarJ);
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
                        Ia.p<ComposeUiNode, Integer, p293xa.r> pVar3 = ComposeUiNode.Companion.f14338g;
                        if (interfaceC1084f3.m() || !kotlin.jvm.internal.i.a(interfaceC1084f3.f(), Integer.valueOf(iF))) {
                            androidx.compose.animation.k.b(iF, interfaceC1084f3, iF, pVar3);
                        }
                        R0.a(ComposeUiNode.Companion.f14335d, interfaceC1084f3, hVarC);
                        androidx.compose.foundation.gestures.d.c(pVar2, interfaceC1084f3, 0);
                    }
                    return p293xa.r.f47939a;
                }
            }, c1086gP), c1086g, i12 & 7294, 1408);
        }
        C1105p0 c1105p0V = c1086g.V();
        if (c1105p0V != null) {
            c1105p0V.f13109d = new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.material3.DatePickerKt$Day$3
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(2);
                }

                @Override // Ia.p
                public final p293xa.r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                    num.intValue();
                    DatePickerKt.d(hVar, z10, aVar, z11, z12, z13, z14, str, c1064p, pVar, interfaceC1084f2, L4.b.l(i10 | 1));
                    return p293xa.r.f47939a;
                }
            };
        }
    }

    public static final void e(final androidx.compose.ui.h hVar, final int i10, final Ia.l<? super C1072y, p293xa.r> lVar, InterfaceC1084f interfaceC1084f, final int i11) {
        int i12;
        boolean z10;
        C1086g c1086gP = interfaceC1084f.p(1393846115);
        if ((i11 & 6) == 0) {
            i12 = (c1086gP.K(hVar) ? 4 : 2) | i11;
        } else {
            i12 = i11;
        }
        if ((i11 & 48) == 0) {
            i12 |= c1086gP.h(i10) ? 32 : 16;
        }
        if ((i11 & 384) == 0) {
            i12 |= c1086gP.k(lVar) ? 256 : 128;
        }
        if ((i12 & 147) == 146 && c1086gP.s()) {
            c1086gP.w();
        } else {
            boolean zA = C1072y.a(i10, 0);
            InterfaceC1084f.a.C0153a c0153a = InterfaceC1084f.a.f12980a;
            if (zA) {
                c1086gP.L(-411219388);
                z10 = (i12 & 896) == 256;
                Object objF = c1086gP.f();
                if (z10 || objF == c0153a) {
                    objF = new Ia.a<p293xa.r>() { // from class: androidx.compose.material3.DatePickerKt$DisplayModeToggleButton$1$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        /* JADX WARN: Multi-variable type inference failed */
                        {
                            super(0);
                        }

                        @Override // Ia.a
                        public final p293xa.r invoke() {
                            lVar.invoke(new C1072y(1));
                            return p293xa.r.f47939a;
                        }
                    };
                    c1086gP.E(objF);
                }
                IconButtonKt.b((Ia.a) objF, hVar, false, null, null, ComposableSingletons$DatePickerKt.f12095a, c1086gP, ((i12 << 3) & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) | 196608, 28);
                c1086gP.T(false);
            } else {
                c1086gP.L(-410937381);
                z10 = (i12 & 896) == 256;
                Object objF2 = c1086gP.f();
                if (z10 || objF2 == c0153a) {
                    objF2 = new Ia.a<p293xa.r>() { // from class: androidx.compose.material3.DatePickerKt$DisplayModeToggleButton$2$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        /* JADX WARN: Multi-variable type inference failed */
                        {
                            super(0);
                        }

                        @Override // Ia.a
                        public final p293xa.r invoke() {
                            lVar.invoke(new C1072y(0));
                            return p293xa.r.f47939a;
                        }
                    };
                    c1086gP.E(objF2);
                }
                IconButtonKt.b((Ia.a) objF2, hVar, false, null, null, ComposableSingletons$DatePickerKt.f12096b, c1086gP, ((i12 << 3) & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) | 196608, 28);
                c1086gP.T(false);
            }
        }
        C1105p0 c1105p0V = c1086gP.V();
        if (c1105p0V != null) {
            c1105p0V.f13109d = new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.material3.DatePickerKt$DisplayModeToggleButton$3
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(2);
                }

                @Override // Ia.p
                public final p293xa.r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                    num.intValue();
                    DatePickerKt.e(hVar, i10, lVar, interfaceC1084f2, L4.b.l(i11 | 1));
                    return p293xa.r.f47939a;
                }
            };
        }
    }

    public static final void f(final LazyListState lazyListState, final Long l10, final Ia.l<? super Long, p293xa.r> lVar, final Ia.l<? super Long, p293xa.r> lVar2, final androidx.compose.material3.internal.k kVar, final Na.i iVar, final InterfaceC1065q interfaceC1065q, final Z z10, final C1064p c1064p, InterfaceC1084f interfaceC1084f, final int i10) {
        int i11;
        C1086g c1086g;
        C1086g c1086gP = interfaceC1084f.p(-1994757941);
        if ((i10 & 6) == 0) {
            i11 = (c1086gP.K(lazyListState) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            i11 |= c1086gP.K(l10) ? 32 : 16;
        }
        if ((i10 & 384) == 0) {
            i11 |= c1086gP.k(lVar) ? 256 : 128;
        }
        if ((i10 & 3072) == 0) {
            i11 |= c1086gP.k(lVar2) ? 2048 : 1024;
        }
        if ((i10 & 24576) == 0) {
            i11 |= c1086gP.k(kVar) ? 16384 : 8192;
        }
        if ((196608 & i10) == 0) {
            i11 |= c1086gP.k(iVar) ? 131072 : 65536;
        }
        if ((1572864 & i10) == 0) {
            i11 |= (2097152 & i10) == 0 ? c1086gP.K(interfaceC1065q) : c1086gP.k(interfaceC1065q) ? 1048576 : 524288;
        }
        if ((12582912 & i10) == 0) {
            i11 |= c1086gP.K(z10) ? 8388608 : 4194304;
        }
        if ((100663296 & i10) == 0) {
            i11 |= c1086gP.K(c1064p) ? 67108864 : 33554432;
        }
        int i12 = i11;
        if ((38347923 & i12) == 38347922 && c1086gP.s()) {
            c1086gP.w();
            c1086g = c1086gP;
        } else {
            final androidx.compose.material3.internal.j jVarG = kVar.g();
            boolean zK = c1086gP.K(iVar);
            Object objF = c1086gP.f();
            InterfaceC1084f.a.C0153a c0153a = InterfaceC1084f.a.f12980a;
            if (zK || objF == c0153a) {
                objF = kVar.d(iVar.f4687b, 1);
                c1086gP.E(objF);
            }
            final androidx.compose.material3.internal.n nVar = (androidx.compose.material3.internal.n) objF;
            c1086g = c1086gP;
            TextKt.a(TypographyKt.a(C0609d.f1237e, c1086gP), androidx.compose.runtime.internal.a.b(1504086906, new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.material3.DatePickerKt$HorizontalMonthsList$1
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
                        androidx.compose.ui.h hVarB = androidx.compose.ui.semantics.p.b(androidx.compose.ui.h.a.f13984b, false, new Ia.l<androidx.compose.ui.semantics.w, p293xa.r>() { // from class: androidx.compose.material3.DatePickerKt$HorizontalMonthsList$1.1
                            @Override // Ia.l
                            public final p293xa.r invoke(androidx.compose.ui.semantics.w wVar) {
                                androidx.compose.ui.semantics.t.h(wVar, new androidx.compose.ui.semantics.j(new Ia.a<Float>() { // from class: androidx.compose.material3.DatePickerKt.HorizontalMonthsList.1.1.1
                                    @Override // Ia.a
                                    public final /* bridge */ /* synthetic */ Float invoke() {
                                        return Float.valueOf(0.0f);
                                    }
                                }, false, new Ia.a<Float>() { // from class: androidx.compose.material3.DatePickerKt.HorizontalMonthsList.1.1.2
                                    @Override // Ia.a
                                    public final /* bridge */ /* synthetic */ Float invoke() {
                                        return Float.valueOf(0.0f);
                                    }
                                }));
                                return p293xa.r.f47939a;
                            }
                        });
                        LazyListState lazyListState2 = lazyListState;
                        DatePickerDefaults datePickerDefaults = DatePickerDefaults.f12132a;
                        C0919t c0919t = new C0919t(new androidx.compose.animation.core.A(1.0f, 0.1f));
                        boolean zK2 = interfaceC1084f3.K(c0919t) | interfaceC1084f3.K(lazyListState2);
                        Object objF2 = interfaceC1084f3.f();
                        InterfaceC1084f.a.C0153a c0153a2 = InterfaceC1084f.a.f12980a;
                        if (zK2 || objF2 == c0153a2) {
                            W4.b bVar = new W4.b(new androidx.compose.foundation.gestures.snapping.f(lazyListState2, androidx.compose.foundation.gestures.snapping.k.a.f10050a));
                            androidx.compose.animation.core.P pC = C0907g.c(0.0f, 400.0f, null, 5);
                            float f10 = androidx.compose.foundation.gestures.snapping.i.f10049a;
                            androidx.compose.foundation.gestures.snapping.h hVar = new androidx.compose.foundation.gestures.snapping.h(bVar, c0919t, pC);
                            interfaceC1084f3.E(hVar);
                            objF2 = hVar;
                        }
                        androidx.compose.foundation.gestures.x xVar = (androidx.compose.foundation.gestures.x) objF2;
                        boolean zK3 = interfaceC1084f3.k(iVar) | interfaceC1084f3.k(kVar) | interfaceC1084f3.K(nVar) | interfaceC1084f3.K(lVar) | interfaceC1084f3.K(jVarG) | interfaceC1084f3.K(l10) | interfaceC1084f3.k(interfaceC1065q) | interfaceC1084f3.K(z10) | interfaceC1084f3.K(c1064p);
                        final Na.i iVar2 = iVar;
                        final androidx.compose.material3.internal.k kVar2 = kVar;
                        final androidx.compose.material3.internal.n nVar2 = nVar;
                        final Ia.l<Long, p293xa.r> lVar3 = lVar;
                        final androidx.compose.material3.internal.j jVar = jVarG;
                        final Long l11 = l10;
                        final InterfaceC1065q interfaceC1065q2 = interfaceC1065q;
                        final Z z11 = z10;
                        final C1064p c1064p2 = c1064p;
                        Object objF3 = interfaceC1084f3.f();
                        if (zK3 || objF3 == c0153a2) {
                            objF3 = new Ia.l<androidx.compose.foundation.lazy.p, p293xa.r>() { // from class: androidx.compose.material3.DatePickerKt$HorizontalMonthsList$1$2$1
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                /* JADX WARN: Multi-variable type inference failed */
                                {
                                    super(1);
                                }

                                @Override // Ia.l
                                public final p293xa.r invoke(androidx.compose.foundation.lazy.p pVar) {
                                    Na.i iVar3 = iVar2;
                                    float f11 = DatePickerKt.f12139a;
                                    int i13 = ((iVar3.f4688c - iVar3.f4687b) + 1) * 12;
                                    final androidx.compose.material3.internal.k kVar3 = kVar2;
                                    final androidx.compose.material3.internal.n nVar3 = nVar2;
                                    final Ia.l<Long, p293xa.r> lVar4 = lVar3;
                                    final androidx.compose.material3.internal.j jVar2 = jVar;
                                    final Long l12 = l11;
                                    final InterfaceC1065q interfaceC1065q3 = interfaceC1065q2;
                                    final Z z12 = z11;
                                    final C1064p c1064p3 = c1064p2;
                                    pVar.g(i13, null, new Ia.l() { // from class: androidx.compose.foundation.lazy.LazyListScope$items$1
                                        @Override // Ia.l
                                        public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
                                            ((Number) obj).intValue();
                                            return null;
                                        }
                                    }, new ComposableLambdaImpl(true, 1137566309, new Ia.r<androidx.compose.foundation.lazy.b, Integer, InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.material3.DatePickerKt$HorizontalMonthsList$1$2$1.1
                                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                        /* JADX WARN: Multi-variable type inference failed */
                                        {
                                            super(4);
                                        }

                                        @Override // Ia.r
                                        public final p293xa.r invoke(androidx.compose.foundation.lazy.b bVar2, Integer num2, InterfaceC1084f interfaceC1084f4, Integer num3) {
                                            int i14;
                                            androidx.compose.foundation.lazy.b bVar3 = bVar2;
                                            int iIntValue = num2.intValue();
                                            InterfaceC1084f interfaceC1084f5 = interfaceC1084f4;
                                            int iIntValue2 = num3.intValue();
                                            if ((iIntValue2 & 6) == 0) {
                                                i14 = (interfaceC1084f5.K(bVar3) ? 4 : 2) | iIntValue2;
                                            } else {
                                                i14 = iIntValue2;
                                            }
                                            if ((iIntValue2 & 48) == 0) {
                                                i14 |= interfaceC1084f5.h(iIntValue) ? 32 : 16;
                                            }
                                            if ((i14 & 147) == 146 && interfaceC1084f5.s()) {
                                                interfaceC1084f5.w();
                                            } else {
                                                androidx.compose.material3.internal.n nVarJ = kVar3.j(nVar3, iIntValue);
                                                androidx.compose.ui.h hVarA = bVar3.a(1.0f);
                                                Ia.l<Long, p293xa.r> lVar5 = lVar4;
                                                androidx.compose.material3.internal.j jVar3 = jVar2;
                                                Long l13 = l12;
                                                InterfaceC1065q interfaceC1065q4 = interfaceC1065q3;
                                                Z z13 = z12;
                                                C1064p c1064p4 = c1064p3;
                                                androidx.compose.ui.layout.E eD = BoxKt.d(androidx.compose.ui.d.a.f13335a, false);
                                                int iF = interfaceC1084f5.F();
                                                InterfaceC1089h0 interfaceC1089h0Z = interfaceC1084f5.z();
                                                androidx.compose.ui.h hVarC = ComposedModifierKt.c(interfaceC1084f5, hVarA);
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
                                                Ia.p<ComposeUiNode, Integer, p293xa.r> pVar2 = ComposeUiNode.Companion.f14338g;
                                                if (interfaceC1084f5.m() || !kotlin.jvm.internal.i.a(interfaceC1084f5.f(), Integer.valueOf(iF))) {
                                                    androidx.compose.animation.k.b(iF, interfaceC1084f5, iF, pVar2);
                                                }
                                                R0.a(ComposeUiNode.Companion.f14335d, interfaceC1084f5, hVarC);
                                                DatePickerKt.g(nVarJ, lVar5, jVar3.f12545e, l13, null, interfaceC1065q4, z13, c1064p4, interfaceC1084f5, 221184);
                                                interfaceC1084f5.J();
                                            }
                                            return p293xa.r.f47939a;
                                        }
                                    }));
                                    return p293xa.r.f47939a;
                                }
                            };
                            interfaceC1084f3.E(objF3);
                        }
                        LazyDslKt.b(hVarB, lazyListState2, null, false, null, null, xVar, false, (Ia.l) objF3, interfaceC1084f3, 0, 188);
                    }
                    return p293xa.r.f47939a;
                }
            }, c1086g), c1086g, 48);
            boolean zK2 = ((i12 & 14) == 4) | ((i12 & 7168) == 2048) | c1086g.k(kVar) | c1086g.k(iVar);
            Object objF2 = c1086g.f();
            if (zK2 || objF2 == c0153a) {
                DatePickerKt$HorizontalMonthsList$2$1 datePickerKt$HorizontalMonthsList$2$1 = new DatePickerKt$HorizontalMonthsList$2$1(lazyListState, lVar2, kVar, iVar, null);
                c1086g.E(datePickerKt$HorizontalMonthsList$2$1);
                objF2 = datePickerKt$HorizontalMonthsList$2$1;
            }
            androidx.compose.runtime.E.d((Ia.p) objF2, c1086g, lazyListState);
        }
        C1105p0 c1105p0V = c1086g.V();
        if (c1105p0V != null) {
            c1105p0V.f13109d = new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.material3.DatePickerKt$HorizontalMonthsList$3
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(2);
                }

                @Override // Ia.p
                public final p293xa.r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                    num.intValue();
                    DatePickerKt.f(lazyListState, l10, lVar, lVar2, kVar, iVar, interfaceC1065q, z10, c1064p, interfaceC1084f2, L4.b.l(i10 | 1));
                    return p293xa.r.f47939a;
                }
            };
        }
    }

    public static final void g(final androidx.compose.material3.internal.n nVar, final Ia.l lVar, final long j, final Long l10, final Long l11, final InterfaceC1065q interfaceC1065q, final Z z10, final C1064p c1064p, InterfaceC1084f interfaceC1084f, final int i10) {
        int i11;
        androidx.compose.ui.h.a aVar;
        float f10;
        androidx.compose.material3.internal.n nVar2 = nVar;
        long j10 = j;
        Object obj = l10;
        Object obj2 = l11;
        InterfaceC1065q interfaceC1065q2 = interfaceC1065q;
        C1086g c1086gP = interfaceC1084f.p(-1912870997);
        if ((i10 & 6) == 0) {
            i11 = (c1086gP.K(nVar2) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            i11 |= c1086gP.k(lVar) ? 32 : 16;
        }
        if ((i10 & 384) == 0) {
            i11 |= c1086gP.i(j10) ? 256 : 128;
        }
        if ((i10 & 3072) == 0) {
            i11 |= c1086gP.K(obj) ? 2048 : 1024;
        }
        if ((i10 & 24576) == 0) {
            i11 |= c1086gP.K(obj2) ? 16384 : 8192;
        }
        if ((196608 & i10) == 0) {
            i11 |= c1086gP.K(null) ? 131072 : 65536;
        }
        if ((1572864 & i10) == 0) {
            i11 |= (2097152 & i10) == 0 ? c1086gP.K(interfaceC1065q2) : c1086gP.k(interfaceC1065q2) ? 1048576 : 524288;
        }
        if ((12582912 & i10) == 0) {
            i11 |= c1086gP.K(z10) ? 8388608 : 4194304;
        }
        if ((100663296 & i10) == 0) {
            i11 |= c1086gP.K(c1064p) ? 67108864 : 33554432;
        }
        if ((38347923 & i11) == 38347922 && c1086gP.s()) {
            c1086gP.w();
        } else {
            c1086gP.L(1821433443);
            androidx.compose.ui.h.a aVar2 = androidx.compose.ui.h.a.f13984b;
            c1086gP.T(false);
            Locale localeA = C1053h.a(c1086gP);
            float f11 = f12139a;
            androidx.compose.ui.h hVarI = androidx.compose.foundation.layout.W.h(aVar2, 6 * f11).i(aVar2);
            C0953m c0953mA = C0952l.a(C0945e.f10289f, androidx.compose.ui.d.a.f13346m, c1086gP, 6);
            int i12 = c1086gP.f12996P;
            InterfaceC1089h0 interfaceC1089h0P = c1086gP.P();
            androidx.compose.ui.h hVarC = ComposedModifierKt.c(c1086gP, hVarI);
            ComposeUiNode.f14331c0.getClass();
            float f12 = f11;
            Ia.a<ComposeUiNode> aVar3 = ComposeUiNode.Companion.f14333b;
            c1086gP.r();
            if (c1086gP.f12995O) {
                c1086gP.v(aVar3);
            } else {
                c1086gP.A();
            }
            R0.a(ComposeUiNode.Companion.f14337f, c1086gP, c0953mA);
            R0.a(ComposeUiNode.Companion.f14336e, c1086gP, interfaceC1089h0P);
            Ia.p<ComposeUiNode, Integer, p293xa.r> pVar = ComposeUiNode.Companion.f14338g;
            if (c1086gP.f12995O || !kotlin.jvm.internal.i.a(c1086gP.f(), Integer.valueOf(i12))) {
                J4.i.d(i12, c1086gP, i12, pVar);
            }
            R0.a(ComposeUiNode.Companion.f14335d, c1086gP, hVarC);
            c1086gP.L(-647461340);
            int i13 = 0;
            int i14 = 0;
            while (i14 < 6) {
                androidx.compose.ui.h hVarD = androidx.compose.foundation.layout.W.d(aVar2, 1.0f);
                androidx.compose.foundation.layout.T tA = androidx.compose.foundation.layout.S.a(C0945e.f10289f, androidx.compose.ui.d.a.f13344k, c1086gP, 54);
                int i15 = c1086gP.f12996P;
                InterfaceC1089h0 interfaceC1089h0P2 = c1086gP.P();
                androidx.compose.ui.h hVarC2 = ComposedModifierKt.c(c1086gP, hVarD);
                ComposeUiNode.f14331c0.getClass();
                int i16 = i13;
                Ia.a<ComposeUiNode> aVar4 = ComposeUiNode.Companion.f14333b;
                c1086gP.r();
                int i17 = i14;
                if (c1086gP.f12995O) {
                    c1086gP.v(aVar4);
                } else {
                    c1086gP.A();
                }
                R0.a(ComposeUiNode.Companion.f14337f, c1086gP, tA);
                R0.a(ComposeUiNode.Companion.f14336e, c1086gP, interfaceC1089h0P2);
                Ia.p<ComposeUiNode, Integer, p293xa.r> pVar2 = ComposeUiNode.Companion.f14338g;
                if (c1086gP.f12995O || !kotlin.jvm.internal.i.a(c1086gP.f(), Integer.valueOf(i15))) {
                    J4.i.d(i15, c1086gP, i15, pVar2);
                }
                R0.a(ComposeUiNode.Companion.f14335d, c1086gP, hVarC2);
                c1086gP.L(-88395975);
                i13 = i16;
                int i18 = 0;
                while (i18 < 7) {
                    int i19 = nVar2.f12553d;
                    if (i13 < i19 || i13 >= i19 + nVar2.f12552c) {
                        aVar = aVar2;
                        f10 = f12;
                        c1086gP.L(1554856342);
                        Lb.a.a(c1086gP, androidx.compose.foundation.layout.W.j(f10, f10, aVar));
                        c1086gP.T(false);
                    } else {
                        c1086gP.L(1555370911);
                        final int i20 = i13 - nVar2.f12553d;
                        androidx.compose.ui.h.a aVar5 = aVar2;
                        final long j11 = (((long) i20) * 86400000) + nVar2.f12554e;
                        boolean z11 = j11 == j10;
                        boolean z12 = obj != null && j11 == l10.longValue();
                        boolean z13 = obj2 != null && j11 == l11.longValue();
                        c1086gP.L(-88360892);
                        c1086gP.T(false);
                        StringBuilder sb2 = new StringBuilder();
                        c1086gP.L(-647730741);
                        c1086gP.T(false);
                        c1086gP.L(-647717033);
                        if (z11) {
                            if (sb2.length() > 0) {
                                sb2.append(", ");
                            }
                            sb2.append(com.voltasit.obdeleven.domain.usecases.device.v.g(c1086gP, com.voltasit.obdeleven.R.string.m3c_date_picker_today_description));
                        }
                        c1086gP.T(false);
                        String string = sb2.length() == 0 ? null : sb2.toString();
                        String strA = interfaceC1065q2.a(Long.valueOf(j11), localeA, true);
                        if (strA == null) {
                            strA = "";
                        }
                        boolean z14 = z12 || z13;
                        boolean zI = ((i11 & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) == 32) | c1086gP.i(j11);
                        Object objF = c1086gP.f();
                        InterfaceC1084f.a.C0153a c0153a = InterfaceC1084f.a.f12980a;
                        if (zI || objF == c0153a) {
                            objF = new Ia.a<p293xa.r>() { // from class: androidx.compose.material3.DatePickerKt$Month$1$1$1$1
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                /* JADX WARN: Multi-variable type inference failed */
                                {
                                    super(0);
                                }

                                @Override // Ia.a
                                public final p293xa.r invoke() {
                                    lVar.invoke(Long.valueOf(j11));
                                    return p293xa.r.f47939a;
                                }
                            };
                            c1086gP.E(objF);
                        }
                        Ia.a aVar6 = (Ia.a) objF;
                        boolean zI2 = c1086gP.i(j11) | ((29360128 & i11) == 8388608);
                        Object objF2 = c1086gP.f();
                        if (zI2 || objF2 == c0153a) {
                            z10.getClass();
                            objF2 = true;
                            c1086gP.E(objF2);
                        }
                        boolean zBooleanValue = ((Boolean) objF2).booleanValue();
                        boolean z15 = z14;
                        aVar = aVar5;
                        f10 = f12;
                        d(aVar5, z15, aVar6, z12, zBooleanValue, z11, false, string != null ? O.a.f(string, ", ", strA) : strA, c1064p, androidx.compose.runtime.internal.a.b(-2095706591, new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.material3.DatePickerKt$Month$1$1$3
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
                                    TextKt.b(C1054i.a(i20 + 1, 0, 7), androidx.compose.ui.semantics.p.a(androidx.compose.ui.h.a.f13984b, new Ia.l<androidx.compose.ui.semantics.w, p293xa.r>() { // from class: androidx.compose.material3.DatePickerKt$Month$1$1$3.1
                                        @Override // Ia.l
                                        public final /* bridge */ /* synthetic */ p293xa.r invoke(androidx.compose.ui.semantics.w wVar) {
                                            return p293xa.r.f47939a;
                                        }
                                    }), 0L, 0L, null, null, null, 0L, null, new androidx.compose.ui.text.style.g(3), 0L, 0, false, 0, 0, null, null, interfaceC1084f3, 0, 0, 130556);
                                }
                                return p293xa.r.f47939a;
                            }
                        }, c1086gP), c1086gP, (234881024 & i11) | 805306374);
                        c1086gP.T(false);
                    }
                    i13++;
                    i18++;
                    nVar2 = nVar;
                    j10 = j;
                    interfaceC1065q2 = interfaceC1065q;
                    aVar2 = aVar;
                    f12 = f10;
                    localeA = localeA;
                    obj = l10;
                    obj2 = l11;
                }
                c1086gP.T(false);
                c1086gP.T(true);
                i14 = i17 + 1;
                nVar2 = nVar;
                j10 = j;
                interfaceC1065q2 = interfaceC1065q;
                aVar2 = aVar2;
                f12 = f12;
                localeA = localeA;
                obj = l10;
                obj2 = l11;
            }
            c1086gP.T(false);
            c1086gP.T(true);
        }
        C1105p0 c1105p0V = c1086gP.V();
        if (c1105p0V != null) {
            c1105p0V.f13109d = new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.material3.DatePickerKt$Month$2
                final /* synthetic */ a0 $rangeSelectionInfo;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // Ia.p
                public final p293xa.r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                    num.intValue();
                    DatePickerKt.g(nVar, lVar, j, l10, l11, interfaceC1065q, z10, c1064p, interfaceC1084f2, L4.b.l(i10 | 1));
                    return p293xa.r.f47939a;
                }
            };
        }
    }

    public static final void h(final androidx.compose.ui.h hVar, final boolean z10, final boolean z11, final boolean z12, final String str, final Ia.a<p293xa.r> aVar, final Ia.a<p293xa.r> aVar2, final Ia.a<p293xa.r> aVar3, final C1064p c1064p, InterfaceC1084f interfaceC1084f, final int i10) {
        int i11;
        C1086g c1086gP = interfaceC1084f.p(-773929258);
        if ((i10 & 6) == 0) {
            i11 = (c1086gP.K(hVar) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            i11 |= c1086gP.c(z10) ? 32 : 16;
        }
        if ((i10 & 384) == 0) {
            i11 |= c1086gP.c(z11) ? 256 : 128;
        }
        if ((i10 & 3072) == 0) {
            i11 |= c1086gP.c(z12) ? 2048 : 1024;
        }
        if ((i10 & 24576) == 0) {
            i11 |= c1086gP.K(str) ? 16384 : 8192;
        }
        if ((196608 & i10) == 0) {
            i11 |= c1086gP.k(aVar) ? 131072 : 65536;
        }
        if ((1572864 & i10) == 0) {
            i11 |= c1086gP.k(aVar2) ? 1048576 : 524288;
        }
        if ((12582912 & i10) == 0) {
            i11 |= c1086gP.k(aVar3) ? 8388608 : 4194304;
        }
        if ((100663296 & i10) == 0) {
            i11 |= c1086gP.K(c1064p) ? 67108864 : 33554432;
        }
        if ((i11 & 38347923) == 38347922 && c1086gP.s()) {
            c1086gP.w();
        } else {
            androidx.compose.ui.h hVarH = androidx.compose.foundation.layout.W.h(androidx.compose.foundation.layout.W.d(hVar, 1.0f), f12140b);
            androidx.compose.foundation.layout.T tA = androidx.compose.foundation.layout.S.a(z12 ? C0945e.f10284a : C0945e.f10290g, androidx.compose.ui.d.a.f13344k, c1086gP, 48);
            int i12 = c1086gP.f12996P;
            InterfaceC1089h0 interfaceC1089h0P = c1086gP.P();
            androidx.compose.ui.h hVarC = ComposedModifierKt.c(c1086gP, hVarH);
            ComposeUiNode.f14331c0.getClass();
            Ia.a<ComposeUiNode> aVar4 = ComposeUiNode.Companion.f14333b;
            c1086gP.r();
            if (c1086gP.f12995O) {
                c1086gP.v(aVar4);
            } else {
                c1086gP.A();
            }
            R0.a(ComposeUiNode.Companion.f14337f, c1086gP, tA);
            R0.a(ComposeUiNode.Companion.f14336e, c1086gP, interfaceC1089h0P);
            Ia.p<ComposeUiNode, Integer, p293xa.r> pVar = ComposeUiNode.Companion.f14338g;
            if (c1086gP.f12995O || !kotlin.jvm.internal.i.a(c1086gP.f(), Integer.valueOf(i12))) {
                J4.i.d(i12, c1086gP, i12, pVar);
            }
            R0.a(ComposeUiNode.Companion.f14335d, c1086gP, hVarC);
            CompositionLocalKt.a(B7.b.b(c1064p.f12669f, ContentColorKt.f12125a), androidx.compose.runtime.internal.a.b(-962805198, new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.material3.DatePickerKt$MonthsNavigation$1$1
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
                        Ia.a<p293xa.r> aVar5 = aVar3;
                        boolean z13 = z12;
                        final String str2 = str;
                        DatePickerKt.n(aVar5, z13, null, androidx.compose.runtime.internal.a.b(1377272806, new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.material3.DatePickerKt$MonthsNavigation$1$1.1
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
                                    String str3 = str2;
                                    androidx.compose.ui.h.a aVar6 = androidx.compose.ui.h.a.f13984b;
                                    boolean zK = interfaceC1084f5.K(str3);
                                    final String str4 = str2;
                                    Object objF = interfaceC1084f5.f();
                                    if (zK || objF == InterfaceC1084f.a.f12980a) {
                                        objF = new Ia.l<androidx.compose.ui.semantics.w, p293xa.r>() { // from class: androidx.compose.material3.DatePickerKt$MonthsNavigation$1$1$1$1$1
                                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                            {
                                                super(1);
                                            }

                                            @Override // Ia.l
                                            public final p293xa.r invoke(androidx.compose.ui.semantics.w wVar) {
                                                androidx.compose.ui.semantics.w wVar2 = wVar;
                                                androidx.compose.ui.semantics.t.i(wVar2);
                                                androidx.compose.ui.semantics.t.g(str4, wVar2);
                                                return p293xa.r.f47939a;
                                            }
                                        };
                                        interfaceC1084f5.E(objF);
                                    }
                                    TextKt.b(str3, androidx.compose.ui.semantics.p.b(aVar6, false, (Ia.l) objF), 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, interfaceC1084f5, 0, 0, 131068);
                                }
                                return p293xa.r.f47939a;
                            }
                        }, interfaceC1084f3), interfaceC1084f3, 3072, 4);
                        if (!z12) {
                            Ia.a<p293xa.r> aVar6 = aVar2;
                            boolean z14 = z11;
                            Ia.a<p293xa.r> aVar7 = aVar;
                            boolean z15 = z10;
                            androidx.compose.ui.h.a aVar8 = androidx.compose.ui.h.a.f13984b;
                            androidx.compose.foundation.layout.T tA2 = androidx.compose.foundation.layout.S.a(C0945e.f10284a, androidx.compose.ui.d.a.j, interfaceC1084f3, 0);
                            int iF = interfaceC1084f3.F();
                            InterfaceC1089h0 interfaceC1089h0Z = interfaceC1084f3.z();
                            androidx.compose.ui.h hVarC2 = ComposedModifierKt.c(interfaceC1084f3, aVar8);
                            ComposeUiNode.f14331c0.getClass();
                            Ia.a<ComposeUiNode> aVar9 = ComposeUiNode.Companion.f14333b;
                            if (interfaceC1084f3.u() == null) {
                                I.b.k();
                                throw null;
                            }
                            interfaceC1084f3.r();
                            if (interfaceC1084f3.m()) {
                                interfaceC1084f3.v(aVar9);
                            } else {
                                interfaceC1084f3.A();
                            }
                            R0.a(ComposeUiNode.Companion.f14337f, interfaceC1084f3, tA2);
                            R0.a(ComposeUiNode.Companion.f14336e, interfaceC1084f3, interfaceC1089h0Z);
                            Ia.p<ComposeUiNode, Integer, p293xa.r> pVar2 = ComposeUiNode.Companion.f14338g;
                            if (interfaceC1084f3.m() || !kotlin.jvm.internal.i.a(interfaceC1084f3.f(), Integer.valueOf(iF))) {
                                androidx.compose.animation.k.b(iF, interfaceC1084f3, iF, pVar2);
                            }
                            R0.a(ComposeUiNode.Companion.f14335d, interfaceC1084f3, hVarC2);
                            IconButtonKt.b(aVar6, null, z14, null, null, ComposableSingletons$DatePickerKt.f12097c, interfaceC1084f3, 196608, 26);
                            IconButtonKt.b(aVar7, null, z15, null, null, ComposableSingletons$DatePickerKt.f12098d, interfaceC1084f3, 196608, 26);
                            interfaceC1084f3.J();
                        }
                    }
                    return p293xa.r.f47939a;
                }
            }, c1086gP), c1086gP, 56);
            c1086gP.T(true);
        }
        C1105p0 c1105p0V = c1086gP.V();
        if (c1105p0V != null) {
            c1105p0V.f13109d = new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.material3.DatePickerKt$MonthsNavigation$2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // Ia.p
                public final p293xa.r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                    num.intValue();
                    DatePickerKt.h(hVar, z10, z11, z12, str, aVar, aVar2, aVar3, c1064p, interfaceC1084f2, L4.b.l(i10 | 1));
                    return p293xa.r.f47939a;
                }
            };
        }
    }

    public static final void i(final C1064p c1064p, final androidx.compose.material3.internal.k kVar, InterfaceC1084f interfaceC1084f, final int i10) {
        C1086g c1086gP = interfaceC1084f.p(-1849465391);
        int i11 = (i10 & 6) == 0 ? (c1086gP.K(c1064p) ? 4 : 2) | i10 : i10;
        if ((i10 & 48) == 0) {
            i11 |= c1086gP.k(kVar) ? 32 : 16;
        }
        if ((i11 & 19) == 18 && c1086gP.s()) {
            c1086gP.w();
        } else {
            int iC = kVar.c();
            List<Pair<String, String>> listH = kVar.h();
            ArrayList arrayList = new ArrayList();
            boolean z10 = true;
            int i12 = iC - 1;
            int size = listH.size();
            for (int i13 = i12; i13 < size; i13++) {
                arrayList.add(listH.get(i13));
            }
            boolean z11 = false;
            for (int i14 = 0; i14 < i12; i14++) {
                arrayList.add(listH.get(i14));
            }
            androidx.compose.ui.text.F fA = TypographyKt.a(C0609d.f1254w, c1086gP);
            androidx.compose.ui.h.a aVar = androidx.compose.ui.h.a.f13984b;
            float f10 = f12139a;
            androidx.compose.ui.h hVarD = androidx.compose.foundation.layout.W.d(androidx.compose.foundation.layout.W.b(aVar, 0.0f, f10, 1), 1.0f);
            androidx.compose.foundation.layout.T tA = androidx.compose.foundation.layout.S.a(C0945e.f10289f, androidx.compose.ui.d.a.f13344k, c1086gP, 54);
            int i15 = c1086gP.f12996P;
            InterfaceC1089h0 interfaceC1089h0P = c1086gP.P();
            androidx.compose.ui.h hVarC = ComposedModifierKt.c(c1086gP, hVarD);
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
            Ia.p<ComposeUiNode, Integer, p293xa.r> pVar = ComposeUiNode.Companion.f14338g;
            if (c1086gP.f12995O || !kotlin.jvm.internal.i.a(c1086gP.f(), Integer.valueOf(i15))) {
                J4.i.d(i15, c1086gP, i15, pVar);
            }
            R0.a(ComposeUiNode.Companion.f14335d, c1086gP, hVarC);
            c1086gP.L(396197267);
            int size2 = arrayList.size();
            int i16 = 0;
            while (i16 < size2) {
                final Pair pair = (Pair) arrayList.get(i16);
                boolean zK = c1086gP.K(pair);
                Object objF = c1086gP.f();
                if (zK || objF == InterfaceC1084f.a.f12980a) {
                    objF = new Ia.l<androidx.compose.ui.semantics.w, p293xa.r>() { // from class: androidx.compose.material3.DatePickerKt$WeekDays$1$1$1$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(1);
                        }

                        @Override // Ia.l
                        public final p293xa.r invoke(androidx.compose.ui.semantics.w wVar) {
                            androidx.compose.ui.semantics.t.g(pair.c(), wVar);
                            return p293xa.r.f47939a;
                        }
                    };
                    c1086gP.E(objF);
                }
                androidx.compose.ui.h hVarN = androidx.compose.foundation.layout.W.n(f10, f10, androidx.compose.ui.semantics.p.a(aVar, (Ia.l) objF));
                androidx.compose.ui.layout.E eD = BoxKt.d(androidx.compose.ui.d.a.f13339e, z11);
                int i17 = c1086gP.f12996P;
                InterfaceC1089h0 interfaceC1089h0P2 = c1086gP.P();
                androidx.compose.ui.h hVarC2 = ComposedModifierKt.c(c1086gP, hVarN);
                ComposeUiNode.f14331c0.getClass();
                Ia.a<ComposeUiNode> aVar3 = ComposeUiNode.Companion.f14333b;
                c1086gP.r();
                if (c1086gP.f12995O) {
                    c1086gP.v(aVar3);
                } else {
                    c1086gP.A();
                }
                R0.a(ComposeUiNode.Companion.f14337f, c1086gP, eD);
                R0.a(ComposeUiNode.Companion.f14336e, c1086gP, interfaceC1089h0P2);
                Ia.p<ComposeUiNode, Integer, p293xa.r> pVar2 = ComposeUiNode.Companion.f14338g;
                if (c1086gP.f12995O || !kotlin.jvm.internal.i.a(c1086gP.f(), Integer.valueOf(i17))) {
                    J4.i.d(i17, c1086gP, i17, pVar2);
                }
                R0.a(ComposeUiNode.Companion.f14335d, c1086gP, hVarC2);
                TextKt.b((String) pair.d(), androidx.compose.foundation.layout.W.t(aVar, null, 3), c1064p.f12667d, 0L, null, null, null, 0L, null, new androidx.compose.ui.text.style.g(3), 0L, 0, false, 0, 0, null, fA, c1086gP, 48, 0, 65016);
                c1086gP.T(true);
                i16++;
                z10 = true;
                f10 = f10;
                size2 = size2;
                aVar = aVar;
                arrayList = arrayList;
                z11 = false;
            }
            c1086gP.T(z11);
            c1086gP.T(z10);
        }
        C1105p0 c1105p0V = c1086gP.V();
        if (c1105p0V != null) {
            c1105p0V.f13109d = new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.material3.DatePickerKt$WeekDays$2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // Ia.p
                public final p293xa.r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                    num.intValue();
                    DatePickerKt.i(c1064p, kVar, interfaceC1084f2, L4.b.l(i10 | 1));
                    return p293xa.r.f47939a;
                }
            };
        }
    }

    /* JADX WARN: Code duplicated, block: B:101:0x01f1  */
    /* JADX WARN: Code duplicated, block: B:104:0x01f6  */
    /* JADX WARN: Code duplicated, block: B:108:0x0216 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:109:0x0218  */
    /* JADX WARN: Code duplicated, block: B:112:0x022e A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:113:0x0230  */
    /* JADX WARN: Code duplicated, block: B:116:0x028d  */
    /* JADX WARN: Code duplicated, block: B:117:0x0291  */
    /* JADX WARN: Code duplicated, block: B:120:0x029e  */
    /* JADX WARN: Code duplicated, block: B:124:0x02b0  */
    /* JADX WARN: Code duplicated, block: B:127:0x02d9  */
    /* JADX WARN: Code duplicated, block: B:128:0x02dd  */
    /* JADX WARN: Code duplicated, block: B:131:0x02ea  */
    /* JADX WARN: Code duplicated, block: B:133:0x02f8  */
    /* JADX WARN: Code duplicated, block: B:98:0x01db  */
    /* JADX WARN: Multi-variable type inference failed */
    public static final void j(final Long l10, final long j, final Ia.l lVar, final Ia.l lVar2, final androidx.compose.material3.internal.k kVar, final Na.i iVar, final InterfaceC1065q interfaceC1065q, final Z z10, final C1064p c1064p, InterfaceC1084f interfaceC1084f, final int i10) {
        int i11;
        Ia.p<ComposeUiNode, androidx.compose.ui.layout.E, p293xa.r> pVar;
        String strB;
        boolean zK;
        Object objF;
        InterfaceC1084f.a.C0153a c0153a;
        boolean zK2;
        Object objF2;
        boolean zK3;
        Object objF3;
        int i12;
        int i13;
        C1086g c1086g;
        C1086g c1086gP = interfaceC1084f.p(-434467002);
        if ((i10 & 6) == 0) {
            i11 = (c1086gP.K(l10) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            i11 |= c1086gP.i(j) ? 32 : 16;
        }
        if ((i10 & 384) == 0) {
            i11 |= c1086gP.k(lVar) ? 256 : 128;
        }
        if ((i10 & 3072) == 0) {
            i11 |= c1086gP.k(lVar2) ? 2048 : 1024;
        }
        if ((i10 & 24576) == 0) {
            i11 |= c1086gP.k(kVar) ? 16384 : 8192;
        }
        if ((196608 & i10) == 0) {
            i11 |= c1086gP.k(iVar) ? 131072 : 65536;
        }
        if ((1572864 & i10) == 0) {
            i11 |= (2097152 & i10) == 0 ? c1086gP.K(interfaceC1065q) : c1086gP.k(interfaceC1065q) ? 1048576 : 524288;
        }
        if ((12582912 & i10) == 0) {
            i11 |= c1086gP.K(z10) ? 8388608 : 4194304;
        }
        if ((100663296 & i10) == 0) {
            i11 |= c1086gP.K(c1064p) ? 67108864 : 33554432;
        }
        int i14 = i11;
        if ((38347923 & i14) == 38347922 && c1086gP.s()) {
            c1086gP.w();
            c1086g = c1086gP;
        } else {
            final androidx.compose.material3.internal.n nVarE = kVar.e(j);
            nVarE.getClass();
            int i15 = (((nVarE.f12550a - iVar.f4687b) * 12) + nVarE.f12551b) - 1;
            if (i15 < 0) {
                i15 = 0;
            }
            final LazyListState lazyListStateA = androidx.compose.foundation.lazy.s.a(i15, c1086gP, 0, 2);
            Integer numValueOf = Integer.valueOf(i15);
            boolean zK4 = c1086gP.K(lazyListStateA) | c1086gP.h(i15);
            Object objF4 = c1086gP.f();
            InterfaceC1084f.a.C0153a c0153a2 = InterfaceC1084f.a.f12980a;
            if (zK4 || objF4 == c0153a2) {
                objF4 = new DatePickerKt$DatePickerContent$1$1(lazyListStateA, i15, null);
                c1086gP.E(objF4);
            }
            androidx.compose.runtime.E.d((Ia.p) objF4, c1086gP, numValueOf);
            Object objF5 = c1086gP.f();
            if (objF5 == c0153a2) {
                C1113u c1113u = new C1113u(androidx.compose.runtime.E.f(EmptyCoroutineContext.f43032b, c1086gP));
                c1086gP.E(c1113u);
                objF5 = c1113u;
            }
            final kotlinx.coroutines.A a10 = ((C1113u) objF5).f13246b;
            final androidx.compose.runtime.X x10 = (androidx.compose.runtime.X) androidx.compose.runtime.saveable.b.c(new Object[0], null, null, new Ia.a<androidx.compose.runtime.X<Boolean>>() { // from class: androidx.compose.material3.DatePickerKt$DatePickerContent$yearPickerVisible$2
                @Override // Ia.a
                public final androidx.compose.runtime.X<Boolean> invoke() {
                    return J0.f(Boolean.FALSE);
                }
            }, c1086gP, 3072, 6);
            Locale localeA = C1053h.a(c1086gP);
            androidx.compose.ui.h.a aVar = androidx.compose.ui.h.a.f13984b;
            C0945e.k kVar2 = C0945e.f10286c;
            androidx.compose.ui.f.a aVar2 = androidx.compose.ui.d.a.f13346m;
            C0953m c0953mA = C0952l.a(kVar2, aVar2, c1086gP, 0);
            int i16 = c1086gP.f12996P;
            InterfaceC1089h0 interfaceC1089h0P = c1086gP.P();
            androidx.compose.ui.h hVarC = ComposedModifierKt.c(c1086gP, aVar);
            ComposeUiNode.f14331c0.getClass();
            Ia.a<ComposeUiNode> aVar3 = ComposeUiNode.Companion.f14333b;
            c1086gP.r();
            if (c1086gP.f12995O) {
                c1086gP.v(aVar3);
            } else {
                c1086gP.A();
            }
            Ia.p<ComposeUiNode, androidx.compose.ui.layout.E, p293xa.r> pVar2 = ComposeUiNode.Companion.f14337f;
            R0.a(pVar2, c1086gP, c0953mA);
            Ia.p<ComposeUiNode, androidx.compose.runtime.r, p293xa.r> pVar3 = ComposeUiNode.Companion.f14336e;
            R0.a(pVar3, c1086gP, interfaceC1089h0P);
            Ia.p<ComposeUiNode, Integer, p293xa.r> pVar4 = ComposeUiNode.Companion.f14338g;
            if (c1086gP.f12995O) {
                pVar = pVar2;
            } else {
                pVar = pVar2;
                if (!kotlin.jvm.internal.i.a(c1086gP.f(), Integer.valueOf(i16))) {
                }
                Ia.p<ComposeUiNode, androidx.compose.ui.h, p293xa.r> pVar5 = ComposeUiNode.Companion.f14335d;
                R0.a(pVar5, c1086gP, hVarC);
                float f10 = f12141c;
                androidx.compose.ui.h hVarH = PaddingKt.h(aVar, f10, 0.0f, 2);
                boolean zD = lazyListStateA.d();
                boolean zC = lazyListStateA.c();
                boolean zBooleanValue = ((Boolean) x10.getValue()).booleanValue();
                strB = interfaceC1065q.b(Long.valueOf(j), localeA);
                if (strB == null) {
                    strB = "-";
                }
                String str = strB;
                zK = c1086gP.k(a10) | c1086gP.K(lazyListStateA);
                objF = c1086gP.f();
                if (zK) {
                    c0153a = c0153a2;
                } else {
                    c0153a = c0153a2;
                    if (objF == c0153a) {
                    }
                    Ia.a aVar4 = (Ia.a) objF;
                    zK2 = c1086gP.k(a10) | c1086gP.K(lazyListStateA);
                    objF2 = c1086gP.f();
                    if (zK2 || objF2 == c0153a) {
                        objF2 = new Ia.a<p293xa.r>() { // from class: androidx.compose.material3.DatePickerKt$DatePickerContent$2$2$1

                            /* JADX INFO: renamed from: androidx.compose.material3.DatePickerKt$DatePickerContent$2$2$1$1, reason: invalid class name */
                            /* JADX INFO: compiled from: DatePicker.kt */
                            @Aa.c(c = "androidx.compose.material3.DatePickerKt$DatePickerContent$2$2$1$1", f = "DatePicker.kt", l = {1539}, m = "invokeSuspend")
                            final class AnonymousClass1 extends SuspendLambda implements Ia.p<kotlinx.coroutines.A, kotlin.coroutines.c<? super p293xa.r>, Object> {
                                final /* synthetic */ LazyListState $monthsListState;
                                int label;

                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                public AnonymousClass1(LazyListState lazyListState, kotlin.coroutines.c<? super AnonymousClass1> cVar) {
                                    super(2, cVar);
                                    this.$monthsListState = lazyListState;
                                }

                                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                                public final kotlin.coroutines.c<p293xa.r> create(Object obj, kotlin.coroutines.c<?> cVar) {
                                    return new AnonymousClass1(this.$monthsListState, cVar);
                                }

                                @Override // Ia.p
                                public final Object invoke(kotlinx.coroutines.A a10, kotlin.coroutines.c<? super p293xa.r> cVar) {
                                    return ((AnonymousClass1) create(a10, cVar)).invokeSuspend(p293xa.r.f47939a);
                                }

                                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                                public final Object invokeSuspend(Object obj) {
                                    CoroutineSingletons coroutineSingletons = CoroutineSingletons.f43038b;
                                    int i10 = this.label;
                                    try {
                                        if (i10 == 0) {
                                            kotlin.b.b(obj);
                                            LazyListState lazyListState = this.$monthsListState;
                                            int iH = lazyListState.h() - 1;
                                            this.label = 1;
                                            if (lazyListState.f(iH, 0, this) == coroutineSingletons) {
                                                return coroutineSingletons;
                                            }
                                        } else {
                                            if (i10 != 1) {
                                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                            }
                                            kotlin.b.b(obj);
                                        }
                                    } catch (IllegalArgumentException unused) {
                                    }
                                    return p293xa.r.f47939a;
                                }
                            }

                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(0);
                            }

                            @Override // Ia.a
                            public final p293xa.r invoke() {
                                C2680e.c(a10, null, null, new AnonymousClass1(lazyListStateA, null), 3);
                                return p293xa.r.f47939a;
                            }
                        };
                        c1086gP.E(objF2);
                    }
                    Ia.a aVar5 = (Ia.a) objF2;
                    zK3 = c1086gP.K(x10);
                    objF3 = c1086gP.f();
                    if (zK3 || objF3 == c0153a) {
                        objF3 = new Ia.a<p293xa.r>() { // from class: androidx.compose.material3.DatePickerKt$DatePickerContent$2$3$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(0);
                            }

                            @Override // Ia.a
                            public final p293xa.r invoke() {
                                androidx.compose.runtime.X<Boolean> x11 = x10;
                                float f11 = DatePickerKt.f12139a;
                                x11.setValue(Boolean.valueOf(!x11.getValue().booleanValue()));
                                return p293xa.r.f47939a;
                            }
                        };
                        c1086gP.E(objF3);
                    }
                    int i17 = i14 & 234881024;
                    Ia.p<ComposeUiNode, androidx.compose.ui.layout.E, p293xa.r> pVar6 = pVar;
                    h(hVarH, zD, zC, zBooleanValue, str, aVar4, aVar5, (Ia.a) objF3, c1064p, c1086gP, i17 | 6);
                    androidx.compose.ui.layout.E eD = BoxKt.d(androidx.compose.ui.d.a.f13335a, false);
                    i12 = c1086gP.f12996P;
                    InterfaceC1089h0 interfaceC1089h0P2 = c1086gP.P();
                    androidx.compose.ui.h hVarC2 = ComposedModifierKt.c(c1086gP, aVar);
                    c1086gP.r();
                    if (c1086gP.f12995O) {
                        c1086gP.v(aVar3);
                    } else {
                        c1086gP.A();
                    }
                    R0.a(pVar6, c1086gP, eD);
                    R0.a(pVar3, c1086gP, interfaceC1089h0P2);
                    if (c1086gP.f12995O || !kotlin.jvm.internal.i.a(c1086gP.f(), Integer.valueOf(i12))) {
                        J4.i.d(i12, c1086gP, i12, pVar4);
                    }
                    R0.a(pVar5, c1086gP, hVarC2);
                    androidx.compose.ui.h hVarH2 = PaddingKt.h(aVar, f10, 0.0f, 2);
                    C0953m c0953mA2 = C0952l.a(kVar2, aVar2, c1086gP, 0);
                    i13 = c1086gP.f12996P;
                    InterfaceC1089h0 interfaceC1089h0P3 = c1086gP.P();
                    androidx.compose.ui.h hVarC3 = ComposedModifierKt.c(c1086gP, hVarH2);
                    c1086gP.r();
                    if (c1086gP.f12995O) {
                        c1086gP.v(aVar3);
                    } else {
                        c1086gP.A();
                    }
                    R0.a(pVar6, c1086gP, c0953mA2);
                    R0.a(pVar3, c1086gP, interfaceC1089h0P3);
                    if (c1086gP.f12995O || !kotlin.jvm.internal.i.a(c1086gP.f(), Integer.valueOf(i13))) {
                        J4.i.d(i13, c1086gP, i13, pVar4);
                    }
                    R0.a(pVar5, c1086gP, hVarC3);
                    i(c1064p, kVar, c1086gP, ((i14 >> 24) & 14) | ((i14 >> 9) & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle));
                    c1086g = c1086gP;
                    f(lazyListStateA, l10, lVar, lVar2, kVar, iVar, interfaceC1065q, z10, c1064p, c1086gP, ((i14 << 3) & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) | (i14 & 896) | (i14 & 7168) | (57344 & i14) | (458752 & i14) | (3670016 & i14) | (i14 & 29360128) | i17);
                    c1086g.T(true);
                    AnimatedVisibilityKt.e(((Boolean) x10.getValue()).booleanValue(), A8.p.s(aVar), EnterExitTransitionKt.d(null, 15).b(EnterExitTransitionKt.e(null, 0.6f, 1)), EnterExitTransitionKt.k().b(EnterExitTransitionKt.f(null, 3)), null, androidx.compose.runtime.internal.a.b(1193716082, new Ia.q<InterfaceC0928f, InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.material3.DatePickerKt$DatePickerContent$2$4$2
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(3);
                        }

                        @Override // Ia.q
                        public final p293xa.r invoke(InterfaceC0928f interfaceC0928f, InterfaceC1084f interfaceC1084f2, Integer num) {
                            InterfaceC1084f interfaceC1084f3 = interfaceC1084f2;
                            num.intValue();
                            final String strG = com.voltasit.obdeleven.domain.usecases.device.v.g(interfaceC1084f3, com.voltasit.obdeleven.R.string.m3c_date_picker_year_picker_pane_title);
                            androidx.compose.ui.h.a aVar6 = androidx.compose.ui.h.a.f13984b;
                            boolean zK5 = interfaceC1084f3.K(strG);
                            Object objF6 = interfaceC1084f3.f();
                            InterfaceC1084f.a.C0153a c0153a3 = InterfaceC1084f.a.f12980a;
                            if (zK5 || objF6 == c0153a3) {
                                objF6 = new Ia.l<androidx.compose.ui.semantics.w, p293xa.r>() { // from class: androidx.compose.material3.DatePickerKt$DatePickerContent$2$4$2$1$1
                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                    {
                                        super(1);
                                    }

                                    @Override // Ia.l
                                    public final p293xa.r invoke(androidx.compose.ui.semantics.w wVar) {
                                        androidx.compose.ui.semantics.t.j(strG, wVar);
                                        return p293xa.r.f47939a;
                                    }
                                };
                                interfaceC1084f3.E(objF6);
                            }
                            androidx.compose.ui.h hVarB = androidx.compose.ui.semantics.p.b(aVar6, false, (Ia.l) objF6);
                            long j10 = j;
                            final androidx.compose.runtime.X<Boolean> x11 = x10;
                            final kotlinx.coroutines.A a11 = a10;
                            final LazyListState lazyListState = lazyListStateA;
                            final Na.i iVar2 = iVar;
                            final androidx.compose.material3.internal.n nVar = nVarE;
                            Z z11 = z10;
                            androidx.compose.material3.internal.k kVar3 = kVar;
                            C1064p c1064p2 = c1064p;
                            C0953m c0953mA3 = C0952l.a(C0945e.f10286c, androidx.compose.ui.d.a.f13346m, interfaceC1084f3, 0);
                            int iF = interfaceC1084f3.F();
                            InterfaceC1089h0 interfaceC1089h0Z = interfaceC1084f3.z();
                            androidx.compose.ui.h hVarC4 = ComposedModifierKt.c(interfaceC1084f3, hVarB);
                            ComposeUiNode.f14331c0.getClass();
                            Ia.a<ComposeUiNode> aVar7 = ComposeUiNode.Companion.f14333b;
                            if (interfaceC1084f3.u() == null) {
                                I.b.k();
                                throw null;
                            }
                            interfaceC1084f3.r();
                            if (interfaceC1084f3.m()) {
                                interfaceC1084f3.v(aVar7);
                            } else {
                                interfaceC1084f3.A();
                            }
                            R0.a(ComposeUiNode.Companion.f14337f, interfaceC1084f3, c0953mA3);
                            R0.a(ComposeUiNode.Companion.f14336e, interfaceC1084f3, interfaceC1089h0Z);
                            Ia.p<ComposeUiNode, Integer, p293xa.r> pVar7 = ComposeUiNode.Companion.f14338g;
                            if (interfaceC1084f3.m() || !kotlin.jvm.internal.i.a(interfaceC1084f3.f(), Integer.valueOf(iF))) {
                                androidx.compose.animation.k.b(iF, interfaceC1084f3, iF, pVar7);
                            }
                            R0.a(ComposeUiNode.Companion.f14335d, interfaceC1084f3, hVarC4);
                            androidx.compose.ui.h hVarH3 = PaddingKt.h(androidx.compose.foundation.layout.W.h(aVar6, (DatePickerKt.f12139a * 7) - C1073z.f12769a), DatePickerKt.f12141c, 0.0f, 2);
                            boolean zK6 = interfaceC1084f3.K(x11) | interfaceC1084f3.k(a11) | interfaceC1084f3.K(lazyListState) | interfaceC1084f3.k(iVar2) | interfaceC1084f3.K(nVar);
                            Object objF7 = interfaceC1084f3.f();
                            if (zK6 || objF7 == c0153a3) {
                                objF7 = new Ia.l<Integer, p293xa.r>() { // from class: androidx.compose.material3.DatePickerKt$DatePickerContent$2$4$2$2$1$1

                                    /* JADX INFO: renamed from: androidx.compose.material3.DatePickerKt$DatePickerContent$2$4$2$2$1$1$1, reason: invalid class name */
                                    /* JADX INFO: compiled from: DatePicker.kt */
                                    @Aa.c(c = "androidx.compose.material3.DatePickerKt$DatePickerContent$2$4$2$2$1$1$1", f = "DatePicker.kt", l = {1597}, m = "invokeSuspend")
                                    final class AnonymousClass1 extends SuspendLambda implements Ia.p<kotlinx.coroutines.A, kotlin.coroutines.c<? super p293xa.r>, Object> {
                                        final /* synthetic */ androidx.compose.material3.internal.n $displayedMonth;
                                        final /* synthetic */ LazyListState $monthsListState;
                                        final /* synthetic */ int $year;
                                        final /* synthetic */ Na.i $yearRange;
                                        int label;

                                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                        public AnonymousClass1(LazyListState lazyListState, int i10, Na.i iVar, androidx.compose.material3.internal.n nVar, kotlin.coroutines.c<? super AnonymousClass1> cVar) {
                                            super(2, cVar);
                                            this.$monthsListState = lazyListState;
                                            this.$year = i10;
                                            this.$yearRange = iVar;
                                            this.$displayedMonth = nVar;
                                        }

                                        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                                        public final kotlin.coroutines.c<p293xa.r> create(Object obj, kotlin.coroutines.c<?> cVar) {
                                            return new AnonymousClass1(this.$monthsListState, this.$year, this.$yearRange, this.$displayedMonth, cVar);
                                        }

                                        @Override // Ia.p
                                        public final Object invoke(kotlinx.coroutines.A a10, kotlin.coroutines.c<? super p293xa.r> cVar) {
                                            return ((AnonymousClass1) create(a10, cVar)).invokeSuspend(p293xa.r.f47939a);
                                        }

                                        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                                        public final Object invokeSuspend(Object obj) {
                                            CoroutineSingletons coroutineSingletons = CoroutineSingletons.f43038b;
                                            int i10 = this.label;
                                            if (i10 == 0) {
                                                kotlin.b.b(obj);
                                                LazyListState lazyListState = this.$monthsListState;
                                                int i11 = (((this.$year - this.$yearRange.f4687b) * 12) + this.$displayedMonth.f12551b) - 1;
                                                this.label = 1;
                                                if (LazyListState.k(lazyListState, i11, this) == coroutineSingletons) {
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
                                        super(1);
                                    }

                                    @Override // Ia.l
                                    public final p293xa.r invoke(Integer num2) {
                                        int iIntValue = num2.intValue();
                                        androidx.compose.runtime.X<Boolean> x12 = x11;
                                        float f11 = DatePickerKt.f12139a;
                                        x12.setValue(Boolean.valueOf(!x12.getValue().booleanValue()));
                                        C2680e.c(a11, null, null, new AnonymousClass1(lazyListState, iIntValue, iVar2, nVar, null), 3);
                                        return p293xa.r.f47939a;
                                    }
                                };
                                interfaceC1084f3.E(objF7);
                            }
                            DatePickerKt.m(hVarH3, j10, (Ia.l) objF7, z11, kVar3, iVar2, r16, interfaceC1084f3, 6);
                            DividerKt.a(null, 0.0f, c1064p2.f12686x, interfaceC1084f3, 0, 3);
                            interfaceC1084f3.J();
                            return p293xa.r.f47939a;
                        }
                    }, c1086g), c1086g, 200112, 16);
                    c1086g.T(true);
                    c1086g.T(true);
                }
                objF = new Ia.a<p293xa.r>() { // from class: androidx.compose.material3.DatePickerKt$DatePickerContent$2$1$1

                    /* JADX INFO: renamed from: androidx.compose.material3.DatePickerKt$DatePickerContent$2$1$1$1, reason: invalid class name */
                    /* JADX INFO: compiled from: DatePicker.kt */
                    @Aa.c(c = "androidx.compose.material3.DatePickerKt$DatePickerContent$2$1$1$1", f = "DatePicker.kt", l = {1527}, m = "invokeSuspend")
                    final class AnonymousClass1 extends SuspendLambda implements Ia.p<kotlinx.coroutines.A, kotlin.coroutines.c<? super p293xa.r>, Object> {
                        final /* synthetic */ LazyListState $monthsListState;
                        int label;

                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        public AnonymousClass1(LazyListState lazyListState, kotlin.coroutines.c<? super AnonymousClass1> cVar) {
                            super(2, cVar);
                            this.$monthsListState = lazyListState;
                        }

                        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                        public final kotlin.coroutines.c<p293xa.r> create(Object obj, kotlin.coroutines.c<?> cVar) {
                            return new AnonymousClass1(this.$monthsListState, cVar);
                        }

                        @Override // Ia.p
                        public final Object invoke(kotlinx.coroutines.A a10, kotlin.coroutines.c<? super p293xa.r> cVar) {
                            return ((AnonymousClass1) create(a10, cVar)).invokeSuspend(p293xa.r.f47939a);
                        }

                        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                        public final Object invokeSuspend(Object obj) {
                            CoroutineSingletons coroutineSingletons = CoroutineSingletons.f43038b;
                            int i10 = this.label;
                            try {
                                if (i10 == 0) {
                                    kotlin.b.b(obj);
                                    LazyListState lazyListState = this.$monthsListState;
                                    int iH = lazyListState.h() + 1;
                                    this.label = 1;
                                    if (lazyListState.f(iH, 0, this) == coroutineSingletons) {
                                        return coroutineSingletons;
                                    }
                                } else {
                                    if (i10 != 1) {
                                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                    }
                                    kotlin.b.b(obj);
                                }
                            } catch (IllegalArgumentException unused) {
                            }
                            return p293xa.r.f47939a;
                        }
                    }

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(0);
                    }

                    @Override // Ia.a
                    public final p293xa.r invoke() {
                        C2680e.c(a10, null, null, new AnonymousClass1(lazyListStateA, null), 3);
                        return p293xa.r.f47939a;
                    }
                };
                c1086gP.E(objF);
                Ia.a aVar6 = (Ia.a) objF;
                zK2 = c1086gP.k(a10) | c1086gP.K(lazyListStateA);
                objF2 = c1086gP.f();
                if (zK2) {
                    objF2 = new Ia.a<p293xa.r>() { // from class: androidx.compose.material3.DatePickerKt$DatePickerContent$2$2$1

                        /* JADX INFO: renamed from: androidx.compose.material3.DatePickerKt$DatePickerContent$2$2$1$1, reason: invalid class name */
                        /* JADX INFO: compiled from: DatePicker.kt */
                        @Aa.c(c = "androidx.compose.material3.DatePickerKt$DatePickerContent$2$2$1$1", f = "DatePicker.kt", l = {1539}, m = "invokeSuspend")
                        final class AnonymousClass1 extends SuspendLambda implements Ia.p<kotlinx.coroutines.A, kotlin.coroutines.c<? super p293xa.r>, Object> {
                            final /* synthetic */ LazyListState $monthsListState;
                            int label;

                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            public AnonymousClass1(LazyListState lazyListState, kotlin.coroutines.c<? super AnonymousClass1> cVar) {
                                super(2, cVar);
                                this.$monthsListState = lazyListState;
                            }

                            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                            public final kotlin.coroutines.c<p293xa.r> create(Object obj, kotlin.coroutines.c<?> cVar) {
                                return new AnonymousClass1(this.$monthsListState, cVar);
                            }

                            @Override // Ia.p
                            public final Object invoke(kotlinx.coroutines.A a10, kotlin.coroutines.c<? super p293xa.r> cVar) {
                                return ((AnonymousClass1) create(a10, cVar)).invokeSuspend(p293xa.r.f47939a);
                            }

                            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                            public final Object invokeSuspend(Object obj) {
                                CoroutineSingletons coroutineSingletons = CoroutineSingletons.f43038b;
                                int i10 = this.label;
                                try {
                                    if (i10 == 0) {
                                        kotlin.b.b(obj);
                                        LazyListState lazyListState = this.$monthsListState;
                                        int iH = lazyListState.h() - 1;
                                        this.label = 1;
                                        if (lazyListState.f(iH, 0, this) == coroutineSingletons) {
                                            return coroutineSingletons;
                                        }
                                    } else {
                                        if (i10 != 1) {
                                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                        }
                                        kotlin.b.b(obj);
                                    }
                                } catch (IllegalArgumentException unused) {
                                }
                                return p293xa.r.f47939a;
                            }
                        }

                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(0);
                        }

                        @Override // Ia.a
                        public final p293xa.r invoke() {
                            C2680e.c(a10, null, null, new AnonymousClass1(lazyListStateA, null), 3);
                            return p293xa.r.f47939a;
                        }
                    };
                    c1086gP.E(objF2);
                } else {
                    objF2 = new Ia.a<p293xa.r>() { // from class: androidx.compose.material3.DatePickerKt$DatePickerContent$2$2$1

                        /* JADX INFO: renamed from: androidx.compose.material3.DatePickerKt$DatePickerContent$2$2$1$1, reason: invalid class name */
                        /* JADX INFO: compiled from: DatePicker.kt */
                        @Aa.c(c = "androidx.compose.material3.DatePickerKt$DatePickerContent$2$2$1$1", f = "DatePicker.kt", l = {1539}, m = "invokeSuspend")
                        final class AnonymousClass1 extends SuspendLambda implements Ia.p<kotlinx.coroutines.A, kotlin.coroutines.c<? super p293xa.r>, Object> {
                            final /* synthetic */ LazyListState $monthsListState;
                            int label;

                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            public AnonymousClass1(LazyListState lazyListState, kotlin.coroutines.c<? super AnonymousClass1> cVar) {
                                super(2, cVar);
                                this.$monthsListState = lazyListState;
                            }

                            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                            public final kotlin.coroutines.c<p293xa.r> create(Object obj, kotlin.coroutines.c<?> cVar) {
                                return new AnonymousClass1(this.$monthsListState, cVar);
                            }

                            @Override // Ia.p
                            public final Object invoke(kotlinx.coroutines.A a10, kotlin.coroutines.c<? super p293xa.r> cVar) {
                                return ((AnonymousClass1) create(a10, cVar)).invokeSuspend(p293xa.r.f47939a);
                            }

                            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                            public final Object invokeSuspend(Object obj) {
                                CoroutineSingletons coroutineSingletons = CoroutineSingletons.f43038b;
                                int i10 = this.label;
                                try {
                                    if (i10 == 0) {
                                        kotlin.b.b(obj);
                                        LazyListState lazyListState = this.$monthsListState;
                                        int iH = lazyListState.h() - 1;
                                        this.label = 1;
                                        if (lazyListState.f(iH, 0, this) == coroutineSingletons) {
                                            return coroutineSingletons;
                                        }
                                    } else {
                                        if (i10 != 1) {
                                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                        }
                                        kotlin.b.b(obj);
                                    }
                                } catch (IllegalArgumentException unused) {
                                }
                                return p293xa.r.f47939a;
                            }
                        }

                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(0);
                        }

                        @Override // Ia.a
                        public final p293xa.r invoke() {
                            C2680e.c(a10, null, null, new AnonymousClass1(lazyListStateA, null), 3);
                            return p293xa.r.f47939a;
                        }
                    };
                    c1086gP.E(objF2);
                }
                Ia.a aVar7 = (Ia.a) objF2;
                zK3 = c1086gP.K(x10);
                objF3 = c1086gP.f();
                if (zK3) {
                    objF3 = new Ia.a<p293xa.r>() { // from class: androidx.compose.material3.DatePickerKt$DatePickerContent$2$3$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(0);
                        }

                        @Override // Ia.a
                        public final p293xa.r invoke() {
                            androidx.compose.runtime.X<Boolean> x11 = x10;
                            float f11 = DatePickerKt.f12139a;
                            x11.setValue(Boolean.valueOf(!x11.getValue().booleanValue()));
                            return p293xa.r.f47939a;
                        }
                    };
                    c1086gP.E(objF3);
                } else {
                    objF3 = new Ia.a<p293xa.r>() { // from class: androidx.compose.material3.DatePickerKt$DatePickerContent$2$3$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(0);
                        }

                        @Override // Ia.a
                        public final p293xa.r invoke() {
                            androidx.compose.runtime.X<Boolean> x11 = x10;
                            float f11 = DatePickerKt.f12139a;
                            x11.setValue(Boolean.valueOf(!x11.getValue().booleanValue()));
                            return p293xa.r.f47939a;
                        }
                    };
                    c1086gP.E(objF3);
                }
                int i18 = i14 & 234881024;
                Ia.p<ComposeUiNode, androidx.compose.ui.layout.E, p293xa.r> pVar7 = pVar;
                h(hVarH, zD, zC, zBooleanValue, str, aVar6, aVar7, (Ia.a) objF3, c1064p, c1086gP, i18 | 6);
                androidx.compose.ui.layout.E eD2 = BoxKt.d(androidx.compose.ui.d.a.f13335a, false);
                i12 = c1086gP.f12996P;
                InterfaceC1089h0 interfaceC1089h0P4 = c1086gP.P();
                androidx.compose.ui.h hVarC4 = ComposedModifierKt.c(c1086gP, aVar);
                c1086gP.r();
                if (c1086gP.f12995O) {
                    c1086gP.v(aVar3);
                } else {
                    c1086gP.A();
                }
                R0.a(pVar7, c1086gP, eD2);
                R0.a(pVar3, c1086gP, interfaceC1089h0P4);
                if (c1086gP.f12995O) {
                    J4.i.d(i12, c1086gP, i12, pVar4);
                } else {
                    J4.i.d(i12, c1086gP, i12, pVar4);
                }
                R0.a(pVar5, c1086gP, hVarC4);
                androidx.compose.ui.h hVarH3 = PaddingKt.h(aVar, f10, 0.0f, 2);
                C0953m c0953mA3 = C0952l.a(kVar2, aVar2, c1086gP, 0);
                i13 = c1086gP.f12996P;
                InterfaceC1089h0 interfaceC1089h0P5 = c1086gP.P();
                androidx.compose.ui.h hVarC5 = ComposedModifierKt.c(c1086gP, hVarH3);
                c1086gP.r();
                if (c1086gP.f12995O) {
                    c1086gP.v(aVar3);
                } else {
                    c1086gP.A();
                }
                R0.a(pVar7, c1086gP, c0953mA3);
                R0.a(pVar3, c1086gP, interfaceC1089h0P5);
                if (c1086gP.f12995O) {
                    J4.i.d(i13, c1086gP, i13, pVar4);
                } else {
                    J4.i.d(i13, c1086gP, i13, pVar4);
                }
                R0.a(pVar5, c1086gP, hVarC5);
                i(c1064p, kVar, c1086gP, ((i14 >> 24) & 14) | ((i14 >> 9) & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle));
                c1086g = c1086gP;
                f(lazyListStateA, l10, lVar, lVar2, kVar, iVar, interfaceC1065q, z10, c1064p, c1086gP, ((i14 << 3) & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) | (i14 & 896) | (i14 & 7168) | (57344 & i14) | (458752 & i14) | (3670016 & i14) | (i14 & 29360128) | i18);
                c1086g.T(true);
                AnimatedVisibilityKt.e(((Boolean) x10.getValue()).booleanValue(), A8.p.s(aVar), EnterExitTransitionKt.d(null, 15).b(EnterExitTransitionKt.e(null, 0.6f, 1)), EnterExitTransitionKt.k().b(EnterExitTransitionKt.f(null, 3)), null, androidx.compose.runtime.internal.a.b(1193716082, new Ia.q<InterfaceC0928f, InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.material3.DatePickerKt$DatePickerContent$2$4$2
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(3);
                    }

                    @Override // Ia.q
                    public final p293xa.r invoke(InterfaceC0928f interfaceC0928f, InterfaceC1084f interfaceC1084f2, Integer num) {
                        InterfaceC1084f interfaceC1084f3 = interfaceC1084f2;
                        num.intValue();
                        final String strG = com.voltasit.obdeleven.domain.usecases.device.v.g(interfaceC1084f3, com.voltasit.obdeleven.R.string.m3c_date_picker_year_picker_pane_title);
                        androidx.compose.ui.h.a aVar8 = androidx.compose.ui.h.a.f13984b;
                        boolean zK5 = interfaceC1084f3.K(strG);
                        Object objF6 = interfaceC1084f3.f();
                        InterfaceC1084f.a.C0153a c0153a3 = InterfaceC1084f.a.f12980a;
                        if (zK5 || objF6 == c0153a3) {
                            objF6 = new Ia.l<androidx.compose.ui.semantics.w, p293xa.r>() { // from class: androidx.compose.material3.DatePickerKt$DatePickerContent$2$4$2$1$1
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                {
                                    super(1);
                                }

                                @Override // Ia.l
                                public final p293xa.r invoke(androidx.compose.ui.semantics.w wVar) {
                                    androidx.compose.ui.semantics.t.j(strG, wVar);
                                    return p293xa.r.f47939a;
                                }
                            };
                            interfaceC1084f3.E(objF6);
                        }
                        androidx.compose.ui.h hVarB = androidx.compose.ui.semantics.p.b(aVar8, false, (Ia.l) objF6);
                        long j10 = j;
                        final androidx.compose.runtime.X<Boolean> x11 = x10;
                        final kotlinx.coroutines.A a11 = a10;
                        final LazyListState lazyListState = lazyListStateA;
                        final Na.i iVar2 = iVar;
                        final androidx.compose.material3.internal.n nVar = nVarE;
                        Z z11 = z10;
                        androidx.compose.material3.internal.k kVar3 = kVar;
                        C1064p c1064p2 = c1064p;
                        C0953m c0953mA4 = C0952l.a(C0945e.f10286c, androidx.compose.ui.d.a.f13346m, interfaceC1084f3, 0);
                        int iF = interfaceC1084f3.F();
                        InterfaceC1089h0 interfaceC1089h0Z = interfaceC1084f3.z();
                        androidx.compose.ui.h hVarC6 = ComposedModifierKt.c(interfaceC1084f3, hVarB);
                        ComposeUiNode.f14331c0.getClass();
                        Ia.a<ComposeUiNode> aVar9 = ComposeUiNode.Companion.f14333b;
                        if (interfaceC1084f3.u() == null) {
                            I.b.k();
                            throw null;
                        }
                        interfaceC1084f3.r();
                        if (interfaceC1084f3.m()) {
                            interfaceC1084f3.v(aVar9);
                        } else {
                            interfaceC1084f3.A();
                        }
                        R0.a(ComposeUiNode.Companion.f14337f, interfaceC1084f3, c0953mA4);
                        R0.a(ComposeUiNode.Companion.f14336e, interfaceC1084f3, interfaceC1089h0Z);
                        Ia.p<ComposeUiNode, Integer, p293xa.r> pVar8 = ComposeUiNode.Companion.f14338g;
                        if (interfaceC1084f3.m() || !kotlin.jvm.internal.i.a(interfaceC1084f3.f(), Integer.valueOf(iF))) {
                            androidx.compose.animation.k.b(iF, interfaceC1084f3, iF, pVar8);
                        }
                        R0.a(ComposeUiNode.Companion.f14335d, interfaceC1084f3, hVarC6);
                        androidx.compose.ui.h hVarH4 = PaddingKt.h(androidx.compose.foundation.layout.W.h(aVar8, (DatePickerKt.f12139a * 7) - C1073z.f12769a), DatePickerKt.f12141c, 0.0f, 2);
                        boolean zK6 = interfaceC1084f3.K(x11) | interfaceC1084f3.k(a11) | interfaceC1084f3.K(lazyListState) | interfaceC1084f3.k(iVar2) | interfaceC1084f3.K(nVar);
                        Object objF7 = interfaceC1084f3.f();
                        if (zK6 || objF7 == c0153a3) {
                            objF7 = new Ia.l<Integer, p293xa.r>() { // from class: androidx.compose.material3.DatePickerKt$DatePickerContent$2$4$2$2$1$1

                                /* JADX INFO: renamed from: androidx.compose.material3.DatePickerKt$DatePickerContent$2$4$2$2$1$1$1, reason: invalid class name */
                                /* JADX INFO: compiled from: DatePicker.kt */
                                @Aa.c(c = "androidx.compose.material3.DatePickerKt$DatePickerContent$2$4$2$2$1$1$1", f = "DatePicker.kt", l = {1597}, m = "invokeSuspend")
                                final class AnonymousClass1 extends SuspendLambda implements Ia.p<kotlinx.coroutines.A, kotlin.coroutines.c<? super p293xa.r>, Object> {
                                    final /* synthetic */ androidx.compose.material3.internal.n $displayedMonth;
                                    final /* synthetic */ LazyListState $monthsListState;
                                    final /* synthetic */ int $year;
                                    final /* synthetic */ Na.i $yearRange;
                                    int label;

                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                    public AnonymousClass1(LazyListState lazyListState, int i10, Na.i iVar, androidx.compose.material3.internal.n nVar, kotlin.coroutines.c<? super AnonymousClass1> cVar) {
                                        super(2, cVar);
                                        this.$monthsListState = lazyListState;
                                        this.$year = i10;
                                        this.$yearRange = iVar;
                                        this.$displayedMonth = nVar;
                                    }

                                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                                    public final kotlin.coroutines.c<p293xa.r> create(Object obj, kotlin.coroutines.c<?> cVar) {
                                        return new AnonymousClass1(this.$monthsListState, this.$year, this.$yearRange, this.$displayedMonth, cVar);
                                    }

                                    @Override // Ia.p
                                    public final Object invoke(kotlinx.coroutines.A a10, kotlin.coroutines.c<? super p293xa.r> cVar) {
                                        return ((AnonymousClass1) create(a10, cVar)).invokeSuspend(p293xa.r.f47939a);
                                    }

                                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                                    public final Object invokeSuspend(Object obj) {
                                        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f43038b;
                                        int i10 = this.label;
                                        if (i10 == 0) {
                                            kotlin.b.b(obj);
                                            LazyListState lazyListState = this.$monthsListState;
                                            int i11 = (((this.$year - this.$yearRange.f4687b) * 12) + this.$displayedMonth.f12551b) - 1;
                                            this.label = 1;
                                            if (LazyListState.k(lazyListState, i11, this) == coroutineSingletons) {
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
                                    super(1);
                                }

                                @Override // Ia.l
                                public final p293xa.r invoke(Integer num2) {
                                    int iIntValue = num2.intValue();
                                    androidx.compose.runtime.X<Boolean> x12 = x11;
                                    float f11 = DatePickerKt.f12139a;
                                    x12.setValue(Boolean.valueOf(!x12.getValue().booleanValue()));
                                    C2680e.c(a11, null, null, new AnonymousClass1(lazyListState, iIntValue, iVar2, nVar, null), 3);
                                    return p293xa.r.f47939a;
                                }
                            };
                            interfaceC1084f3.E(objF7);
                        }
                        DatePickerKt.m(hVarH4, j10, (Ia.l) objF7, z11, kVar3, iVar2, r16, interfaceC1084f3, 6);
                        DividerKt.a(null, 0.0f, c1064p2.f12686x, interfaceC1084f3, 0, 3);
                        interfaceC1084f3.J();
                        return p293xa.r.f47939a;
                    }
                }, c1086g), c1086g, 200112, 16);
                c1086g.T(true);
                c1086g.T(true);
            }
            J4.i.d(i16, c1086gP, i16, pVar4);
            Ia.p<ComposeUiNode, androidx.compose.ui.h, p293xa.r> pVar8 = ComposeUiNode.Companion.f14335d;
            R0.a(pVar8, c1086gP, hVarC);
            float f11 = f12141c;
            androidx.compose.ui.h hVarH4 = PaddingKt.h(aVar, f11, 0.0f, 2);
            boolean zD2 = lazyListStateA.d();
            boolean zC2 = lazyListStateA.c();
            boolean zBooleanValue2 = ((Boolean) x10.getValue()).booleanValue();
            strB = interfaceC1065q.b(Long.valueOf(j), localeA);
            if (strB == null) {
                strB = "-";
            }
            String str2 = strB;
            zK = c1086gP.k(a10) | c1086gP.K(lazyListStateA);
            objF = c1086gP.f();
            if (zK) {
                c0153a = c0153a2;
                if (objF == c0153a) {
                }
                Ia.a aVar8 = (Ia.a) objF;
                zK2 = c1086gP.k(a10) | c1086gP.K(lazyListStateA);
                objF2 = c1086gP.f();
                if (zK2) {
                    objF2 = new Ia.a<p293xa.r>() { // from class: androidx.compose.material3.DatePickerKt$DatePickerContent$2$2$1

                        /* JADX INFO: renamed from: androidx.compose.material3.DatePickerKt$DatePickerContent$2$2$1$1, reason: invalid class name */
                        /* JADX INFO: compiled from: DatePicker.kt */
                        @Aa.c(c = "androidx.compose.material3.DatePickerKt$DatePickerContent$2$2$1$1", f = "DatePicker.kt", l = {1539}, m = "invokeSuspend")
                        final class AnonymousClass1 extends SuspendLambda implements Ia.p<kotlinx.coroutines.A, kotlin.coroutines.c<? super p293xa.r>, Object> {
                            final /* synthetic */ LazyListState $monthsListState;
                            int label;

                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            public AnonymousClass1(LazyListState lazyListState, kotlin.coroutines.c<? super AnonymousClass1> cVar) {
                                super(2, cVar);
                                this.$monthsListState = lazyListState;
                            }

                            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                            public final kotlin.coroutines.c<p293xa.r> create(Object obj, kotlin.coroutines.c<?> cVar) {
                                return new AnonymousClass1(this.$monthsListState, cVar);
                            }

                            @Override // Ia.p
                            public final Object invoke(kotlinx.coroutines.A a10, kotlin.coroutines.c<? super p293xa.r> cVar) {
                                return ((AnonymousClass1) create(a10, cVar)).invokeSuspend(p293xa.r.f47939a);
                            }

                            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                            public final Object invokeSuspend(Object obj) {
                                CoroutineSingletons coroutineSingletons = CoroutineSingletons.f43038b;
                                int i10 = this.label;
                                try {
                                    if (i10 == 0) {
                                        kotlin.b.b(obj);
                                        LazyListState lazyListState = this.$monthsListState;
                                        int iH = lazyListState.h() - 1;
                                        this.label = 1;
                                        if (lazyListState.f(iH, 0, this) == coroutineSingletons) {
                                            return coroutineSingletons;
                                        }
                                    } else {
                                        if (i10 != 1) {
                                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                        }
                                        kotlin.b.b(obj);
                                    }
                                } catch (IllegalArgumentException unused) {
                                }
                                return p293xa.r.f47939a;
                            }
                        }

                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(0);
                        }

                        @Override // Ia.a
                        public final p293xa.r invoke() {
                            C2680e.c(a10, null, null, new AnonymousClass1(lazyListStateA, null), 3);
                            return p293xa.r.f47939a;
                        }
                    };
                    c1086gP.E(objF2);
                } else {
                    objF2 = new Ia.a<p293xa.r>() { // from class: androidx.compose.material3.DatePickerKt$DatePickerContent$2$2$1

                        /* JADX INFO: renamed from: androidx.compose.material3.DatePickerKt$DatePickerContent$2$2$1$1, reason: invalid class name */
                        /* JADX INFO: compiled from: DatePicker.kt */
                        @Aa.c(c = "androidx.compose.material3.DatePickerKt$DatePickerContent$2$2$1$1", f = "DatePicker.kt", l = {1539}, m = "invokeSuspend")
                        final class AnonymousClass1 extends SuspendLambda implements Ia.p<kotlinx.coroutines.A, kotlin.coroutines.c<? super p293xa.r>, Object> {
                            final /* synthetic */ LazyListState $monthsListState;
                            int label;

                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            public AnonymousClass1(LazyListState lazyListState, kotlin.coroutines.c<? super AnonymousClass1> cVar) {
                                super(2, cVar);
                                this.$monthsListState = lazyListState;
                            }

                            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                            public final kotlin.coroutines.c<p293xa.r> create(Object obj, kotlin.coroutines.c<?> cVar) {
                                return new AnonymousClass1(this.$monthsListState, cVar);
                            }

                            @Override // Ia.p
                            public final Object invoke(kotlinx.coroutines.A a10, kotlin.coroutines.c<? super p293xa.r> cVar) {
                                return ((AnonymousClass1) create(a10, cVar)).invokeSuspend(p293xa.r.f47939a);
                            }

                            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                            public final Object invokeSuspend(Object obj) {
                                CoroutineSingletons coroutineSingletons = CoroutineSingletons.f43038b;
                                int i10 = this.label;
                                try {
                                    if (i10 == 0) {
                                        kotlin.b.b(obj);
                                        LazyListState lazyListState = this.$monthsListState;
                                        int iH = lazyListState.h() - 1;
                                        this.label = 1;
                                        if (lazyListState.f(iH, 0, this) == coroutineSingletons) {
                                            return coroutineSingletons;
                                        }
                                    } else {
                                        if (i10 != 1) {
                                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                        }
                                        kotlin.b.b(obj);
                                    }
                                } catch (IllegalArgumentException unused) {
                                }
                                return p293xa.r.f47939a;
                            }
                        }

                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(0);
                        }

                        @Override // Ia.a
                        public final p293xa.r invoke() {
                            C2680e.c(a10, null, null, new AnonymousClass1(lazyListStateA, null), 3);
                            return p293xa.r.f47939a;
                        }
                    };
                    c1086gP.E(objF2);
                }
                Ia.a aVar9 = (Ia.a) objF2;
                zK3 = c1086gP.K(x10);
                objF3 = c1086gP.f();
                if (zK3) {
                    objF3 = new Ia.a<p293xa.r>() { // from class: androidx.compose.material3.DatePickerKt$DatePickerContent$2$3$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(0);
                        }

                        @Override // Ia.a
                        public final p293xa.r invoke() {
                            androidx.compose.runtime.X<Boolean> x11 = x10;
                            float f12 = DatePickerKt.f12139a;
                            x11.setValue(Boolean.valueOf(!x11.getValue().booleanValue()));
                            return p293xa.r.f47939a;
                        }
                    };
                    c1086gP.E(objF3);
                } else {
                    objF3 = new Ia.a<p293xa.r>() { // from class: androidx.compose.material3.DatePickerKt$DatePickerContent$2$3$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(0);
                        }

                        @Override // Ia.a
                        public final p293xa.r invoke() {
                            androidx.compose.runtime.X<Boolean> x11 = x10;
                            float f12 = DatePickerKt.f12139a;
                            x11.setValue(Boolean.valueOf(!x11.getValue().booleanValue()));
                            return p293xa.r.f47939a;
                        }
                    };
                    c1086gP.E(objF3);
                }
                int i19 = i14 & 234881024;
                Ia.p<ComposeUiNode, androidx.compose.ui.layout.E, p293xa.r> pVar9 = pVar;
                h(hVarH4, zD2, zC2, zBooleanValue2, str2, aVar8, aVar9, (Ia.a) objF3, c1064p, c1086gP, i19 | 6);
                androidx.compose.ui.layout.E eD3 = BoxKt.d(androidx.compose.ui.d.a.f13335a, false);
                i12 = c1086gP.f12996P;
                InterfaceC1089h0 interfaceC1089h0P6 = c1086gP.P();
                androidx.compose.ui.h hVarC6 = ComposedModifierKt.c(c1086gP, aVar);
                c1086gP.r();
                if (c1086gP.f12995O) {
                    c1086gP.v(aVar3);
                } else {
                    c1086gP.A();
                }
                R0.a(pVar9, c1086gP, eD3);
                R0.a(pVar3, c1086gP, interfaceC1089h0P6);
                if (c1086gP.f12995O) {
                    J4.i.d(i12, c1086gP, i12, pVar4);
                } else {
                    J4.i.d(i12, c1086gP, i12, pVar4);
                }
                R0.a(pVar8, c1086gP, hVarC6);
                androidx.compose.ui.h hVarH5 = PaddingKt.h(aVar, f11, 0.0f, 2);
                C0953m c0953mA4 = C0952l.a(kVar2, aVar2, c1086gP, 0);
                i13 = c1086gP.f12996P;
                InterfaceC1089h0 interfaceC1089h0P7 = c1086gP.P();
                androidx.compose.ui.h hVarC7 = ComposedModifierKt.c(c1086gP, hVarH5);
                c1086gP.r();
                if (c1086gP.f12995O) {
                    c1086gP.v(aVar3);
                } else {
                    c1086gP.A();
                }
                R0.a(pVar9, c1086gP, c0953mA4);
                R0.a(pVar3, c1086gP, interfaceC1089h0P7);
                if (c1086gP.f12995O) {
                    J4.i.d(i13, c1086gP, i13, pVar4);
                } else {
                    J4.i.d(i13, c1086gP, i13, pVar4);
                }
                R0.a(pVar8, c1086gP, hVarC7);
                i(c1064p, kVar, c1086gP, ((i14 >> 24) & 14) | ((i14 >> 9) & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle));
                c1086g = c1086gP;
                f(lazyListStateA, l10, lVar, lVar2, kVar, iVar, interfaceC1065q, z10, c1064p, c1086gP, ((i14 << 3) & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) | (i14 & 896) | (i14 & 7168) | (57344 & i14) | (458752 & i14) | (3670016 & i14) | (i14 & 29360128) | i19);
                c1086g.T(true);
                AnimatedVisibilityKt.e(((Boolean) x10.getValue()).booleanValue(), A8.p.s(aVar), EnterExitTransitionKt.d(null, 15).b(EnterExitTransitionKt.e(null, 0.6f, 1)), EnterExitTransitionKt.k().b(EnterExitTransitionKt.f(null, 3)), null, androidx.compose.runtime.internal.a.b(1193716082, new Ia.q<InterfaceC0928f, InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.material3.DatePickerKt$DatePickerContent$2$4$2
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(3);
                    }

                    @Override // Ia.q
                    public final p293xa.r invoke(InterfaceC0928f interfaceC0928f, InterfaceC1084f interfaceC1084f2, Integer num) {
                        InterfaceC1084f interfaceC1084f3 = interfaceC1084f2;
                        num.intValue();
                        final String strG = com.voltasit.obdeleven.domain.usecases.device.v.g(interfaceC1084f3, com.voltasit.obdeleven.R.string.m3c_date_picker_year_picker_pane_title);
                        androidx.compose.ui.h.a aVar10 = androidx.compose.ui.h.a.f13984b;
                        boolean zK5 = interfaceC1084f3.K(strG);
                        Object objF6 = interfaceC1084f3.f();
                        InterfaceC1084f.a.C0153a c0153a3 = InterfaceC1084f.a.f12980a;
                        if (zK5 || objF6 == c0153a3) {
                            objF6 = new Ia.l<androidx.compose.ui.semantics.w, p293xa.r>() { // from class: androidx.compose.material3.DatePickerKt$DatePickerContent$2$4$2$1$1
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                {
                                    super(1);
                                }

                                @Override // Ia.l
                                public final p293xa.r invoke(androidx.compose.ui.semantics.w wVar) {
                                    androidx.compose.ui.semantics.t.j(strG, wVar);
                                    return p293xa.r.f47939a;
                                }
                            };
                            interfaceC1084f3.E(objF6);
                        }
                        androidx.compose.ui.h hVarB = androidx.compose.ui.semantics.p.b(aVar10, false, (Ia.l) objF6);
                        long j10 = j;
                        final androidx.compose.runtime.X<Boolean> x11 = x10;
                        final kotlinx.coroutines.A a11 = a10;
                        final LazyListState lazyListState = lazyListStateA;
                        final Na.i iVar2 = iVar;
                        final androidx.compose.material3.internal.n nVar = nVarE;
                        Z z11 = z10;
                        androidx.compose.material3.internal.k kVar3 = kVar;
                        C1064p c1064p2 = c1064p;
                        C0953m c0953mA5 = C0952l.a(C0945e.f10286c, androidx.compose.ui.d.a.f13346m, interfaceC1084f3, 0);
                        int iF = interfaceC1084f3.F();
                        InterfaceC1089h0 interfaceC1089h0Z = interfaceC1084f3.z();
                        androidx.compose.ui.h hVarC8 = ComposedModifierKt.c(interfaceC1084f3, hVarB);
                        ComposeUiNode.f14331c0.getClass();
                        Ia.a<ComposeUiNode> aVar11 = ComposeUiNode.Companion.f14333b;
                        if (interfaceC1084f3.u() == null) {
                            I.b.k();
                            throw null;
                        }
                        interfaceC1084f3.r();
                        if (interfaceC1084f3.m()) {
                            interfaceC1084f3.v(aVar11);
                        } else {
                            interfaceC1084f3.A();
                        }
                        R0.a(ComposeUiNode.Companion.f14337f, interfaceC1084f3, c0953mA5);
                        R0.a(ComposeUiNode.Companion.f14336e, interfaceC1084f3, interfaceC1089h0Z);
                        Ia.p<ComposeUiNode, Integer, p293xa.r> pVar10 = ComposeUiNode.Companion.f14338g;
                        if (interfaceC1084f3.m() || !kotlin.jvm.internal.i.a(interfaceC1084f3.f(), Integer.valueOf(iF))) {
                            androidx.compose.animation.k.b(iF, interfaceC1084f3, iF, pVar10);
                        }
                        R0.a(ComposeUiNode.Companion.f14335d, interfaceC1084f3, hVarC8);
                        androidx.compose.ui.h hVarH6 = PaddingKt.h(androidx.compose.foundation.layout.W.h(aVar10, (DatePickerKt.f12139a * 7) - C1073z.f12769a), DatePickerKt.f12141c, 0.0f, 2);
                        boolean zK6 = interfaceC1084f3.K(x11) | interfaceC1084f3.k(a11) | interfaceC1084f3.K(lazyListState) | interfaceC1084f3.k(iVar2) | interfaceC1084f3.K(nVar);
                        Object objF7 = interfaceC1084f3.f();
                        if (zK6 || objF7 == c0153a3) {
                            objF7 = new Ia.l<Integer, p293xa.r>() { // from class: androidx.compose.material3.DatePickerKt$DatePickerContent$2$4$2$2$1$1

                                /* JADX INFO: renamed from: androidx.compose.material3.DatePickerKt$DatePickerContent$2$4$2$2$1$1$1, reason: invalid class name */
                                /* JADX INFO: compiled from: DatePicker.kt */
                                @Aa.c(c = "androidx.compose.material3.DatePickerKt$DatePickerContent$2$4$2$2$1$1$1", f = "DatePicker.kt", l = {1597}, m = "invokeSuspend")
                                final class AnonymousClass1 extends SuspendLambda implements Ia.p<kotlinx.coroutines.A, kotlin.coroutines.c<? super p293xa.r>, Object> {
                                    final /* synthetic */ androidx.compose.material3.internal.n $displayedMonth;
                                    final /* synthetic */ LazyListState $monthsListState;
                                    final /* synthetic */ int $year;
                                    final /* synthetic */ Na.i $yearRange;
                                    int label;

                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                    public AnonymousClass1(LazyListState lazyListState, int i10, Na.i iVar, androidx.compose.material3.internal.n nVar, kotlin.coroutines.c<? super AnonymousClass1> cVar) {
                                        super(2, cVar);
                                        this.$monthsListState = lazyListState;
                                        this.$year = i10;
                                        this.$yearRange = iVar;
                                        this.$displayedMonth = nVar;
                                    }

                                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                                    public final kotlin.coroutines.c<p293xa.r> create(Object obj, kotlin.coroutines.c<?> cVar) {
                                        return new AnonymousClass1(this.$monthsListState, this.$year, this.$yearRange, this.$displayedMonth, cVar);
                                    }

                                    @Override // Ia.p
                                    public final Object invoke(kotlinx.coroutines.A a10, kotlin.coroutines.c<? super p293xa.r> cVar) {
                                        return ((AnonymousClass1) create(a10, cVar)).invokeSuspend(p293xa.r.f47939a);
                                    }

                                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                                    public final Object invokeSuspend(Object obj) {
                                        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f43038b;
                                        int i10 = this.label;
                                        if (i10 == 0) {
                                            kotlin.b.b(obj);
                                            LazyListState lazyListState = this.$monthsListState;
                                            int i11 = (((this.$year - this.$yearRange.f4687b) * 12) + this.$displayedMonth.f12551b) - 1;
                                            this.label = 1;
                                            if (LazyListState.k(lazyListState, i11, this) == coroutineSingletons) {
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
                                    super(1);
                                }

                                @Override // Ia.l
                                public final p293xa.r invoke(Integer num2) {
                                    int iIntValue = num2.intValue();
                                    androidx.compose.runtime.X<Boolean> x12 = x11;
                                    float f12 = DatePickerKt.f12139a;
                                    x12.setValue(Boolean.valueOf(!x12.getValue().booleanValue()));
                                    C2680e.c(a11, null, null, new AnonymousClass1(lazyListState, iIntValue, iVar2, nVar, null), 3);
                                    return p293xa.r.f47939a;
                                }
                            };
                            interfaceC1084f3.E(objF7);
                        }
                        DatePickerKt.m(hVarH6, j10, (Ia.l) objF7, z11, kVar3, iVar2, r16, interfaceC1084f3, 6);
                        DividerKt.a(null, 0.0f, c1064p2.f12686x, interfaceC1084f3, 0, 3);
                        interfaceC1084f3.J();
                        return p293xa.r.f47939a;
                    }
                }, c1086g), c1086g, 200112, 16);
                c1086g.T(true);
                c1086g.T(true);
            } else {
                c0153a = c0153a2;
            }
            objF = new Ia.a<p293xa.r>() { // from class: androidx.compose.material3.DatePickerKt$DatePickerContent$2$1$1

                /* JADX INFO: renamed from: androidx.compose.material3.DatePickerKt$DatePickerContent$2$1$1$1, reason: invalid class name */
                /* JADX INFO: compiled from: DatePicker.kt */
                @Aa.c(c = "androidx.compose.material3.DatePickerKt$DatePickerContent$2$1$1$1", f = "DatePicker.kt", l = {1527}, m = "invokeSuspend")
                final class AnonymousClass1 extends SuspendLambda implements Ia.p<kotlinx.coroutines.A, kotlin.coroutines.c<? super p293xa.r>, Object> {
                    final /* synthetic */ LazyListState $monthsListState;
                    int label;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    public AnonymousClass1(LazyListState lazyListState, kotlin.coroutines.c<? super AnonymousClass1> cVar) {
                        super(2, cVar);
                        this.$monthsListState = lazyListState;
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    public final kotlin.coroutines.c<p293xa.r> create(Object obj, kotlin.coroutines.c<?> cVar) {
                        return new AnonymousClass1(this.$monthsListState, cVar);
                    }

                    @Override // Ia.p
                    public final Object invoke(kotlinx.coroutines.A a10, kotlin.coroutines.c<? super p293xa.r> cVar) {
                        return ((AnonymousClass1) create(a10, cVar)).invokeSuspend(p293xa.r.f47939a);
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    public final Object invokeSuspend(Object obj) {
                        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f43038b;
                        int i10 = this.label;
                        try {
                            if (i10 == 0) {
                                kotlin.b.b(obj);
                                LazyListState lazyListState = this.$monthsListState;
                                int iH = lazyListState.h() + 1;
                                this.label = 1;
                                if (lazyListState.f(iH, 0, this) == coroutineSingletons) {
                                    return coroutineSingletons;
                                }
                            } else {
                                if (i10 != 1) {
                                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                }
                                kotlin.b.b(obj);
                            }
                        } catch (IllegalArgumentException unused) {
                        }
                        return p293xa.r.f47939a;
                    }
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                }

                @Override // Ia.a
                public final p293xa.r invoke() {
                    C2680e.c(a10, null, null, new AnonymousClass1(lazyListStateA, null), 3);
                    return p293xa.r.f47939a;
                }
            };
            c1086gP.E(objF);
            Ia.a aVar10 = (Ia.a) objF;
            zK2 = c1086gP.k(a10) | c1086gP.K(lazyListStateA);
            objF2 = c1086gP.f();
            if (zK2) {
                objF2 = new Ia.a<p293xa.r>() { // from class: androidx.compose.material3.DatePickerKt$DatePickerContent$2$2$1

                    /* JADX INFO: renamed from: androidx.compose.material3.DatePickerKt$DatePickerContent$2$2$1$1, reason: invalid class name */
                    /* JADX INFO: compiled from: DatePicker.kt */
                    @Aa.c(c = "androidx.compose.material3.DatePickerKt$DatePickerContent$2$2$1$1", f = "DatePicker.kt", l = {1539}, m = "invokeSuspend")
                    final class AnonymousClass1 extends SuspendLambda implements Ia.p<kotlinx.coroutines.A, kotlin.coroutines.c<? super p293xa.r>, Object> {
                        final /* synthetic */ LazyListState $monthsListState;
                        int label;

                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        public AnonymousClass1(LazyListState lazyListState, kotlin.coroutines.c<? super AnonymousClass1> cVar) {
                            super(2, cVar);
                            this.$monthsListState = lazyListState;
                        }

                        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                        public final kotlin.coroutines.c<p293xa.r> create(Object obj, kotlin.coroutines.c<?> cVar) {
                            return new AnonymousClass1(this.$monthsListState, cVar);
                        }

                        @Override // Ia.p
                        public final Object invoke(kotlinx.coroutines.A a10, kotlin.coroutines.c<? super p293xa.r> cVar) {
                            return ((AnonymousClass1) create(a10, cVar)).invokeSuspend(p293xa.r.f47939a);
                        }

                        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                        public final Object invokeSuspend(Object obj) {
                            CoroutineSingletons coroutineSingletons = CoroutineSingletons.f43038b;
                            int i10 = this.label;
                            try {
                                if (i10 == 0) {
                                    kotlin.b.b(obj);
                                    LazyListState lazyListState = this.$monthsListState;
                                    int iH = lazyListState.h() - 1;
                                    this.label = 1;
                                    if (lazyListState.f(iH, 0, this) == coroutineSingletons) {
                                        return coroutineSingletons;
                                    }
                                } else {
                                    if (i10 != 1) {
                                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                    }
                                    kotlin.b.b(obj);
                                }
                            } catch (IllegalArgumentException unused) {
                            }
                            return p293xa.r.f47939a;
                        }
                    }

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(0);
                    }

                    @Override // Ia.a
                    public final p293xa.r invoke() {
                        C2680e.c(a10, null, null, new AnonymousClass1(lazyListStateA, null), 3);
                        return p293xa.r.f47939a;
                    }
                };
                c1086gP.E(objF2);
            } else {
                objF2 = new Ia.a<p293xa.r>() { // from class: androidx.compose.material3.DatePickerKt$DatePickerContent$2$2$1

                    /* JADX INFO: renamed from: androidx.compose.material3.DatePickerKt$DatePickerContent$2$2$1$1, reason: invalid class name */
                    /* JADX INFO: compiled from: DatePicker.kt */
                    @Aa.c(c = "androidx.compose.material3.DatePickerKt$DatePickerContent$2$2$1$1", f = "DatePicker.kt", l = {1539}, m = "invokeSuspend")
                    final class AnonymousClass1 extends SuspendLambda implements Ia.p<kotlinx.coroutines.A, kotlin.coroutines.c<? super p293xa.r>, Object> {
                        final /* synthetic */ LazyListState $monthsListState;
                        int label;

                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        public AnonymousClass1(LazyListState lazyListState, kotlin.coroutines.c<? super AnonymousClass1> cVar) {
                            super(2, cVar);
                            this.$monthsListState = lazyListState;
                        }

                        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                        public final kotlin.coroutines.c<p293xa.r> create(Object obj, kotlin.coroutines.c<?> cVar) {
                            return new AnonymousClass1(this.$monthsListState, cVar);
                        }

                        @Override // Ia.p
                        public final Object invoke(kotlinx.coroutines.A a10, kotlin.coroutines.c<? super p293xa.r> cVar) {
                            return ((AnonymousClass1) create(a10, cVar)).invokeSuspend(p293xa.r.f47939a);
                        }

                        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                        public final Object invokeSuspend(Object obj) {
                            CoroutineSingletons coroutineSingletons = CoroutineSingletons.f43038b;
                            int i10 = this.label;
                            try {
                                if (i10 == 0) {
                                    kotlin.b.b(obj);
                                    LazyListState lazyListState = this.$monthsListState;
                                    int iH = lazyListState.h() - 1;
                                    this.label = 1;
                                    if (lazyListState.f(iH, 0, this) == coroutineSingletons) {
                                        return coroutineSingletons;
                                    }
                                } else {
                                    if (i10 != 1) {
                                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                    }
                                    kotlin.b.b(obj);
                                }
                            } catch (IllegalArgumentException unused) {
                            }
                            return p293xa.r.f47939a;
                        }
                    }

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(0);
                    }

                    @Override // Ia.a
                    public final p293xa.r invoke() {
                        C2680e.c(a10, null, null, new AnonymousClass1(lazyListStateA, null), 3);
                        return p293xa.r.f47939a;
                    }
                };
                c1086gP.E(objF2);
            }
            Ia.a aVar11 = (Ia.a) objF2;
            zK3 = c1086gP.K(x10);
            objF3 = c1086gP.f();
            if (zK3) {
                objF3 = new Ia.a<p293xa.r>() { // from class: androidx.compose.material3.DatePickerKt$DatePickerContent$2$3$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(0);
                    }

                    @Override // Ia.a
                    public final p293xa.r invoke() {
                        androidx.compose.runtime.X<Boolean> x11 = x10;
                        float f12 = DatePickerKt.f12139a;
                        x11.setValue(Boolean.valueOf(!x11.getValue().booleanValue()));
                        return p293xa.r.f47939a;
                    }
                };
                c1086gP.E(objF3);
            } else {
                objF3 = new Ia.a<p293xa.r>() { // from class: androidx.compose.material3.DatePickerKt$DatePickerContent$2$3$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(0);
                    }

                    @Override // Ia.a
                    public final p293xa.r invoke() {
                        androidx.compose.runtime.X<Boolean> x11 = x10;
                        float f12 = DatePickerKt.f12139a;
                        x11.setValue(Boolean.valueOf(!x11.getValue().booleanValue()));
                        return p293xa.r.f47939a;
                    }
                };
                c1086gP.E(objF3);
            }
            int i110 = i14 & 234881024;
            Ia.p<ComposeUiNode, androidx.compose.ui.layout.E, p293xa.r> pVar10 = pVar;
            h(hVarH4, zD2, zC2, zBooleanValue2, str2, aVar10, aVar11, (Ia.a) objF3, c1064p, c1086gP, i110 | 6);
            androidx.compose.ui.layout.E eD4 = BoxKt.d(androidx.compose.ui.d.a.f13335a, false);
            i12 = c1086gP.f12996P;
            InterfaceC1089h0 interfaceC1089h0P8 = c1086gP.P();
            androidx.compose.ui.h hVarC8 = ComposedModifierKt.c(c1086gP, aVar);
            c1086gP.r();
            if (c1086gP.f12995O) {
                c1086gP.v(aVar3);
            } else {
                c1086gP.A();
            }
            R0.a(pVar10, c1086gP, eD4);
            R0.a(pVar3, c1086gP, interfaceC1089h0P8);
            if (c1086gP.f12995O) {
                J4.i.d(i12, c1086gP, i12, pVar4);
            } else {
                J4.i.d(i12, c1086gP, i12, pVar4);
            }
            R0.a(pVar8, c1086gP, hVarC8);
            androidx.compose.ui.h hVarH6 = PaddingKt.h(aVar, f11, 0.0f, 2);
            C0953m c0953mA5 = C0952l.a(kVar2, aVar2, c1086gP, 0);
            i13 = c1086gP.f12996P;
            InterfaceC1089h0 interfaceC1089h0P9 = c1086gP.P();
            androidx.compose.ui.h hVarC9 = ComposedModifierKt.c(c1086gP, hVarH6);
            c1086gP.r();
            if (c1086gP.f12995O) {
                c1086gP.v(aVar3);
            } else {
                c1086gP.A();
            }
            R0.a(pVar10, c1086gP, c0953mA5);
            R0.a(pVar3, c1086gP, interfaceC1089h0P9);
            if (c1086gP.f12995O) {
                J4.i.d(i13, c1086gP, i13, pVar4);
            } else {
                J4.i.d(i13, c1086gP, i13, pVar4);
            }
            R0.a(pVar8, c1086gP, hVarC9);
            i(c1064p, kVar, c1086gP, ((i14 >> 24) & 14) | ((i14 >> 9) & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle));
            c1086g = c1086gP;
            f(lazyListStateA, l10, lVar, lVar2, kVar, iVar, interfaceC1065q, z10, c1064p, c1086gP, ((i14 << 3) & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) | (i14 & 896) | (i14 & 7168) | (57344 & i14) | (458752 & i14) | (3670016 & i14) | (i14 & 29360128) | i110);
            c1086g.T(true);
            AnimatedVisibilityKt.e(((Boolean) x10.getValue()).booleanValue(), A8.p.s(aVar), EnterExitTransitionKt.d(null, 15).b(EnterExitTransitionKt.e(null, 0.6f, 1)), EnterExitTransitionKt.k().b(EnterExitTransitionKt.f(null, 3)), null, androidx.compose.runtime.internal.a.b(1193716082, new Ia.q<InterfaceC0928f, InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.material3.DatePickerKt$DatePickerContent$2$4$2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(3);
                }

                @Override // Ia.q
                public final p293xa.r invoke(InterfaceC0928f interfaceC0928f, InterfaceC1084f interfaceC1084f2, Integer num) {
                    InterfaceC1084f interfaceC1084f3 = interfaceC1084f2;
                    num.intValue();
                    final String strG = com.voltasit.obdeleven.domain.usecases.device.v.g(interfaceC1084f3, com.voltasit.obdeleven.R.string.m3c_date_picker_year_picker_pane_title);
                    androidx.compose.ui.h.a aVar12 = androidx.compose.ui.h.a.f13984b;
                    boolean zK5 = interfaceC1084f3.K(strG);
                    Object objF6 = interfaceC1084f3.f();
                    InterfaceC1084f.a.C0153a c0153a3 = InterfaceC1084f.a.f12980a;
                    if (zK5 || objF6 == c0153a3) {
                        objF6 = new Ia.l<androidx.compose.ui.semantics.w, p293xa.r>() { // from class: androidx.compose.material3.DatePickerKt$DatePickerContent$2$4$2$1$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(1);
                            }

                            @Override // Ia.l
                            public final p293xa.r invoke(androidx.compose.ui.semantics.w wVar) {
                                androidx.compose.ui.semantics.t.j(strG, wVar);
                                return p293xa.r.f47939a;
                            }
                        };
                        interfaceC1084f3.E(objF6);
                    }
                    androidx.compose.ui.h hVarB = androidx.compose.ui.semantics.p.b(aVar12, false, (Ia.l) objF6);
                    long j10 = j;
                    final androidx.compose.runtime.X<Boolean> x11 = x10;
                    final kotlinx.coroutines.A a11 = a10;
                    final LazyListState lazyListState = lazyListStateA;
                    final Na.i iVar2 = iVar;
                    final androidx.compose.material3.internal.n nVar = nVarE;
                    Z z11 = z10;
                    androidx.compose.material3.internal.k kVar3 = kVar;
                    C1064p c1064p2 = c1064p;
                    C0953m c0953mA6 = C0952l.a(C0945e.f10286c, androidx.compose.ui.d.a.f13346m, interfaceC1084f3, 0);
                    int iF = interfaceC1084f3.F();
                    InterfaceC1089h0 interfaceC1089h0Z = interfaceC1084f3.z();
                    androidx.compose.ui.h hVarC10 = ComposedModifierKt.c(interfaceC1084f3, hVarB);
                    ComposeUiNode.f14331c0.getClass();
                    Ia.a<ComposeUiNode> aVar13 = ComposeUiNode.Companion.f14333b;
                    if (interfaceC1084f3.u() == null) {
                        I.b.k();
                        throw null;
                    }
                    interfaceC1084f3.r();
                    if (interfaceC1084f3.m()) {
                        interfaceC1084f3.v(aVar13);
                    } else {
                        interfaceC1084f3.A();
                    }
                    R0.a(ComposeUiNode.Companion.f14337f, interfaceC1084f3, c0953mA6);
                    R0.a(ComposeUiNode.Companion.f14336e, interfaceC1084f3, interfaceC1089h0Z);
                    Ia.p<ComposeUiNode, Integer, p293xa.r> pVar11 = ComposeUiNode.Companion.f14338g;
                    if (interfaceC1084f3.m() || !kotlin.jvm.internal.i.a(interfaceC1084f3.f(), Integer.valueOf(iF))) {
                        androidx.compose.animation.k.b(iF, interfaceC1084f3, iF, pVar11);
                    }
                    R0.a(ComposeUiNode.Companion.f14335d, interfaceC1084f3, hVarC10);
                    androidx.compose.ui.h hVarH7 = PaddingKt.h(androidx.compose.foundation.layout.W.h(aVar12, (DatePickerKt.f12139a * 7) - C1073z.f12769a), DatePickerKt.f12141c, 0.0f, 2);
                    boolean zK6 = interfaceC1084f3.K(x11) | interfaceC1084f3.k(a11) | interfaceC1084f3.K(lazyListState) | interfaceC1084f3.k(iVar2) | interfaceC1084f3.K(nVar);
                    Object objF7 = interfaceC1084f3.f();
                    if (zK6 || objF7 == c0153a3) {
                        objF7 = new Ia.l<Integer, p293xa.r>() { // from class: androidx.compose.material3.DatePickerKt$DatePickerContent$2$4$2$2$1$1

                            /* JADX INFO: renamed from: androidx.compose.material3.DatePickerKt$DatePickerContent$2$4$2$2$1$1$1, reason: invalid class name */
                            /* JADX INFO: compiled from: DatePicker.kt */
                            @Aa.c(c = "androidx.compose.material3.DatePickerKt$DatePickerContent$2$4$2$2$1$1$1", f = "DatePicker.kt", l = {1597}, m = "invokeSuspend")
                            final class AnonymousClass1 extends SuspendLambda implements Ia.p<kotlinx.coroutines.A, kotlin.coroutines.c<? super p293xa.r>, Object> {
                                final /* synthetic */ androidx.compose.material3.internal.n $displayedMonth;
                                final /* synthetic */ LazyListState $monthsListState;
                                final /* synthetic */ int $year;
                                final /* synthetic */ Na.i $yearRange;
                                int label;

                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                public AnonymousClass1(LazyListState lazyListState, int i10, Na.i iVar, androidx.compose.material3.internal.n nVar, kotlin.coroutines.c<? super AnonymousClass1> cVar) {
                                    super(2, cVar);
                                    this.$monthsListState = lazyListState;
                                    this.$year = i10;
                                    this.$yearRange = iVar;
                                    this.$displayedMonth = nVar;
                                }

                                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                                public final kotlin.coroutines.c<p293xa.r> create(Object obj, kotlin.coroutines.c<?> cVar) {
                                    return new AnonymousClass1(this.$monthsListState, this.$year, this.$yearRange, this.$displayedMonth, cVar);
                                }

                                @Override // Ia.p
                                public final Object invoke(kotlinx.coroutines.A a10, kotlin.coroutines.c<? super p293xa.r> cVar) {
                                    return ((AnonymousClass1) create(a10, cVar)).invokeSuspend(p293xa.r.f47939a);
                                }

                                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                                public final Object invokeSuspend(Object obj) {
                                    CoroutineSingletons coroutineSingletons = CoroutineSingletons.f43038b;
                                    int i10 = this.label;
                                    if (i10 == 0) {
                                        kotlin.b.b(obj);
                                        LazyListState lazyListState = this.$monthsListState;
                                        int i11 = (((this.$year - this.$yearRange.f4687b) * 12) + this.$displayedMonth.f12551b) - 1;
                                        this.label = 1;
                                        if (LazyListState.k(lazyListState, i11, this) == coroutineSingletons) {
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
                                super(1);
                            }

                            @Override // Ia.l
                            public final p293xa.r invoke(Integer num2) {
                                int iIntValue = num2.intValue();
                                androidx.compose.runtime.X<Boolean> x12 = x11;
                                float f12 = DatePickerKt.f12139a;
                                x12.setValue(Boolean.valueOf(!x12.getValue().booleanValue()));
                                C2680e.c(a11, null, null, new AnonymousClass1(lazyListState, iIntValue, iVar2, nVar, null), 3);
                                return p293xa.r.f47939a;
                            }
                        };
                        interfaceC1084f3.E(objF7);
                    }
                    DatePickerKt.m(hVarH7, j10, (Ia.l) objF7, z11, kVar3, iVar2, r16, interfaceC1084f3, 6);
                    DividerKt.a(null, 0.0f, c1064p2.f12686x, interfaceC1084f3, 0, 3);
                    interfaceC1084f3.J();
                    return p293xa.r.f47939a;
                }
            }, c1086g), c1086g, 200112, 16);
            c1086g.T(true);
            c1086g.T(true);
        }
        C1105p0 c1105p0V = c1086g.V();
        if (c1105p0V != null) {
            c1105p0V.f13109d = new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.material3.DatePickerKt$DatePickerContent$3
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(2);
                }

                @Override // Ia.p
                public final p293xa.r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                    num.intValue();
                    DatePickerKt.j(l10, j, lVar, lVar2, kVar, iVar, interfaceC1065q, z10, c1064p, interfaceC1084f2, L4.b.l(i10 | 1));
                    return p293xa.r.f47939a;
                }
            };
        }
    }

    public static final void k(final Long l10, final long j, final int i10, final Ia.l lVar, final Ia.l lVar2, final androidx.compose.material3.internal.k kVar, final Na.i iVar, final InterfaceC1065q interfaceC1065q, final Z z10, final C1064p c1064p, InterfaceC1084f interfaceC1084f, final int i11) {
        int i12;
        C1086g c1086gP = interfaceC1084f.p(-895379221);
        if ((i11 & 6) == 0) {
            i12 = (c1086gP.K(l10) ? 4 : 2) | i11;
        } else {
            i12 = i11;
        }
        if ((i11 & 48) == 0) {
            i12 |= c1086gP.i(j) ? 32 : 16;
        }
        if ((i11 & 384) == 0) {
            i12 |= c1086gP.h(i10) ? 256 : 128;
        }
        if ((i11 & 3072) == 0) {
            i12 |= c1086gP.k(lVar) ? 2048 : 1024;
        }
        if ((i11 & 24576) == 0) {
            i12 |= c1086gP.k(lVar2) ? 16384 : 8192;
        }
        if ((196608 & i11) == 0) {
            i12 |= c1086gP.k(kVar) ? 131072 : 65536;
        }
        if ((1572864 & i11) == 0) {
            i12 |= c1086gP.k(iVar) ? 1048576 : 524288;
        }
        if ((12582912 & i11) == 0) {
            i12 |= (16777216 & i11) == 0 ? c1086gP.K(interfaceC1065q) : c1086gP.k(interfaceC1065q) ? 8388608 : 4194304;
        }
        if ((100663296 & i11) == 0) {
            i12 |= c1086gP.K(z10) ? 67108864 : 33554432;
        }
        if ((805306368 & i11) == 0) {
            i12 |= c1086gP.K(c1064p) ? 536870912 : 268435456;
        }
        int i13 = i12;
        if ((i13 & 306783379) == 306783378 && c1086gP.s()) {
            c1086gP.w();
        } else {
            final int i14 = -((p013b0.c) c1086gP.x(CompositionLocalsKt.f14847h)).e1(48);
            C1072y c1072y = new C1072y(i10);
            androidx.compose.ui.h hVarB = androidx.compose.ui.semantics.p.b(androidx.compose.ui.h.a.f13984b, false, new Ia.l<androidx.compose.ui.semantics.w, p293xa.r>() { // from class: androidx.compose.material3.DatePickerKt$SwitchableDateEntryContent$1
                @Override // Ia.l
                public final p293xa.r invoke(androidx.compose.ui.semantics.w wVar) {
                    androidx.compose.ui.semantics.t.f(wVar);
                    return p293xa.r.f47939a;
                }
            });
            boolean zH = c1086gP.h(i14);
            Object objF = c1086gP.f();
            if (zH || objF == InterfaceC1084f.a.f12980a) {
                objF = new Ia.l<InterfaceC0927e<C1072y>, androidx.compose.animation.j>() { // from class: androidx.compose.material3.DatePickerKt$SwitchableDateEntryContent$2$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(1);
                    }

                    @Override // Ia.l
                    public final androidx.compose.animation.j invoke(InterfaceC0927e<C1072y> interfaceC0927e) {
                        androidx.compose.animation.j jVarC;
                        InterfaceC0927e<C1072y> interfaceC0927e2 = interfaceC0927e;
                        if (C1072y.a(interfaceC0927e2.h().f12768a, 1)) {
                            androidx.compose.animation.n nVarB = EnterExitTransitionKt.n(new Ia.l<Integer, Integer>() { // from class: androidx.compose.material3.DatePickerKt$SwitchableDateEntryContent$2$1.1
                                @Override // Ia.l
                                public final Integer invoke(Integer num) {
                                    return Integer.valueOf(num.intValue());
                                }
                            }).b(EnterExitTransitionKt.e(C0907g.d(100, 100, null, 4), 0.0f, 2));
                            androidx.compose.animation.p pVarF = EnterExitTransitionKt.f(C0907g.d(100, 0, null, 6), 2);
                            final int i15 = i14;
                            jVarC = AnimatedContentKt.c(nVarB, pVarF.b(EnterExitTransitionKt.q(new Ia.l<Integer, Integer>() { // from class: androidx.compose.material3.DatePickerKt$SwitchableDateEntryContent$2$1.2
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                {
                                    super(1);
                                }

                                @Override // Ia.l
                                public final Integer invoke(Integer num) {
                                    num.intValue();
                                    return Integer.valueOf(i15);
                                }
                            }, 1)));
                        } else {
                            androidx.compose.animation.core.c0 c0VarD = C0907g.d(0, 50, null, 5);
                            final int i16 = i14;
                            jVarC = AnimatedContentKt.c(EnterExitTransitionKt.m(new Ia.l<Integer, Integer>() { // from class: androidx.compose.material3.DatePickerKt$SwitchableDateEntryContent$2$1.3
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                {
                                    super(1);
                                }

                                @Override // Ia.l
                                public final Integer invoke(Integer num) {
                                    num.intValue();
                                    return Integer.valueOf(i16);
                                }
                            }, c0VarD).b(EnterExitTransitionKt.e(C0907g.d(100, 100, null, 4), 0.0f, 2)), EnterExitTransitionKt.q(new Ia.l<Integer, Integer>() { // from class: androidx.compose.material3.DatePickerKt$SwitchableDateEntryContent$2$1.4
                                @Override // Ia.l
                                public final Integer invoke(Integer num) {
                                    return Integer.valueOf(num.intValue());
                                }
                            }, 1).b(EnterExitTransitionKt.f(C0907g.d(100, 0, null, 6), 2)));
                        }
                        return interfaceC0927e2.a(jVarC, new androidx.compose.animation.z(new Ia.p<p013b0.l, p013b0.l, InterfaceC0923x<p013b0.l>>() { // from class: androidx.compose.material3.DatePickerKt$SwitchableDateEntryContent$2$1.5
                            @Override // Ia.p
                            public final InterfaceC0923x<p013b0.l> invoke(p013b0.l lVar3, p013b0.l lVar4) {
                                long j10 = lVar3.f20490a;
                                long j11 = lVar4.f20490a;
                                return C0907g.d(500, 0, B.q.f1314b, 2);
                            }
                        }, true));
                    }
                };
                c1086gP.E(objF);
            }
            AnimatedContentKt.b(c1072y, hVarB, (Ia.l) objF, null, "DatePickerDisplayModeAnimation", null, androidx.compose.runtime.internal.a.b(-459778869, new Ia.r<InterfaceC0900c, C1072y, InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.material3.DatePickerKt$SwitchableDateEntryContent$3
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(4);
                }

                @Override // Ia.r
                public final p293xa.r invoke(InterfaceC0900c interfaceC0900c, C1072y c1072y2, InterfaceC1084f interfaceC1084f2, Integer num) {
                    int i15 = c1072y2.f12768a;
                    InterfaceC1084f interfaceC1084f3 = interfaceC1084f2;
                    num.intValue();
                    if (C1072y.a(i15, 0)) {
                        interfaceC1084f3.L(-1870116901);
                        DatePickerKt.j(l10, j, lVar, lVar2, kVar, iVar, interfaceC1065q, z10, c1064p, interfaceC1084f3, 0);
                        interfaceC1084f3.D();
                    } else if (C1072y.a(i15, 1)) {
                        interfaceC1084f3.L(-1870098348);
                        DateInputKt.a(l10, lVar, kVar, iVar, interfaceC1065q, z10, c1064p, interfaceC1084f3, 0);
                        interfaceC1084f3.D();
                    } else {
                        interfaceC1084f3.L(-2138080579);
                        interfaceC1084f3.D();
                    }
                    return p293xa.r.f47939a;
                }
            }, c1086gP), c1086gP, ((i13 >> 6) & 14) | 1597440, 40);
        }
        C1105p0 c1105p0V = c1086gP.V();
        if (c1105p0V != null) {
            c1105p0V.f13109d = new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.material3.DatePickerKt$SwitchableDateEntryContent$4
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(2);
                }

                @Override // Ia.p
                public final p293xa.r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                    num.intValue();
                    DatePickerKt.k(l10, j, i10, lVar, lVar2, kVar, iVar, interfaceC1065q, z10, c1064p, interfaceC1084f2, L4.b.l(i11 | 1));
                    return p293xa.r.f47939a;
                }
            };
        }
    }

    public static final void l(final androidx.compose.ui.h hVar, final boolean z10, final boolean z11, final Ia.a aVar, final boolean z12, final String str, final C1064p c1064p, final Ia.p pVar, InterfaceC1084f interfaceC1084f, final int i10) {
        int i11;
        Object objA;
        long j;
        long j10;
        long j11;
        C1086g c1086g;
        C1086g c1086gP = interfaceC1084f.p(238547184);
        if ((i10 & 6) == 0) {
            i11 = (c1086gP.K(hVar) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            i11 |= c1086gP.c(z10) ? 32 : 16;
        }
        if ((i10 & 384) == 0) {
            i11 |= c1086gP.c(z11) ? 256 : 128;
        }
        if ((i10 & 3072) == 0) {
            i11 |= c1086gP.k(aVar) ? 2048 : 1024;
        }
        if ((i10 & 24576) == 0) {
            i11 |= c1086gP.c(z12) ? 16384 : 8192;
        }
        if ((196608 & i10) == 0) {
            i11 |= c1086gP.K(str) ? 131072 : 65536;
        }
        if ((1572864 & i10) == 0) {
            i11 |= c1086gP.K(c1064p) ? 1048576 : 524288;
        }
        if ((12582912 & i10) == 0) {
            i11 |= c1086gP.k(pVar) ? 8388608 : 4194304;
        }
        if ((4793491 & i11) == 4793490 && c1086gP.s()) {
            c1086gP.w();
            c1086g = c1086gP;
        } else {
            boolean z13 = ((i11 & 896) == 256) | ((i11 & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) == 32);
            Object objF = c1086gP.f();
            InterfaceC1084f.a.C0153a c0153a = InterfaceC1084f.a.f12980a;
            if (z13 || objF == c0153a) {
                objA = (!z11 || z10) ? null : C1787c0.a(C0609d.f1242k, c1064p.f12683u);
                c1086gP.E(objA);
            } else {
                objA = objF;
            }
            C0937i c0937i = (C0937i) objA;
            boolean z14 = (458752 & i11) == 131072;
            Object objF2 = c1086gP.f();
            if (z14 || objF2 == c0153a) {
                objF2 = new Ia.l<androidx.compose.ui.semantics.w, p293xa.r>() { // from class: androidx.compose.material3.DatePickerKt$Year$1$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(1);
                    }

                    @Override // Ia.l
                    public final p293xa.r invoke(androidx.compose.ui.semantics.w wVar) {
                        androidx.compose.ui.semantics.w wVar2 = wVar;
                        C1260a c1260a = new C1260a(6, str, null);
                        Oa.l<Object>[] lVarArr = androidx.compose.ui.semantics.t.f15251a;
                        wVar2.e(SemanticsProperties.f15172z, M1.k(c1260a));
                        androidx.compose.ui.semantics.t.k(wVar2, 0);
                        return p293xa.r.f47939a;
                    }
                };
                c1086gP.E(objF2);
            }
            androidx.compose.ui.h hVarB = androidx.compose.ui.semantics.p.b(hVar, true, (Ia.l) objF2);
            androidx.compose.ui.graphics.l0 l0VarA = ShapesKt.a(C0609d.f1231C, c1086gP);
            int i12 = i11 >> 3;
            int i13 = i12 & 14;
            if (z10) {
                j = z12 ? c1064p.f12674l : c1064p.f12675m;
            } else {
                c1064p.getClass();
                j = androidx.compose.ui.graphics.H.f13503k;
            }
            long j12 = ((androidx.compose.ui.graphics.H) androidx.compose.animation.x.a(j, C0907g.d(100, 0, null, 6), null, c1086gP, 0, 12).getValue()).f13506a;
            int i14 = i11 >> 6;
            if (z10 && z12) {
                j10 = j12;
                j11 = c1064p.j;
            } else {
                j10 = j12;
                if (z10 && !z12) {
                    j11 = c1064p.f12673k;
                } else if (z11) {
                    j11 = c1064p.f12672i;
                } else {
                    j11 = z12 ? c1064p.f12670g : c1064p.f12671h;
                }
            }
            c1086g = c1086gP;
            SurfaceKt.b(z10, aVar, hVarB, z12, l0VarA, j10, ((androidx.compose.ui.graphics.H) androidx.compose.animation.x.a(j11, C0907g.d(100, 0, null, 6), null, c1086gP, 0, 12).getValue()).f13506a, c0937i, androidx.compose.runtime.internal.a.b(-1573188346, new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.material3.DatePickerKt$Year$2
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
                        androidx.compose.ui.h hVarD = androidx.compose.foundation.layout.W.d(androidx.compose.ui.h.a.f13984b, 1.0f);
                        androidx.compose.ui.f fVar = androidx.compose.ui.d.a.f13339e;
                        Ia.p<InterfaceC1084f, Integer, p293xa.r> pVar2 = pVar;
                        androidx.compose.ui.layout.E eD = BoxKt.d(fVar, false);
                        int iF = interfaceC1084f3.F();
                        InterfaceC1089h0 interfaceC1089h0Z = interfaceC1084f3.z();
                        androidx.compose.ui.h hVarC = ComposedModifierKt.c(interfaceC1084f3, hVarD);
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
                        Ia.p<ComposeUiNode, Integer, p293xa.r> pVar3 = ComposeUiNode.Companion.f14338g;
                        if (interfaceC1084f3.m() || !kotlin.jvm.internal.i.a(interfaceC1084f3.f(), Integer.valueOf(iF))) {
                            androidx.compose.animation.k.b(iF, interfaceC1084f3, iF, pVar3);
                        }
                        R0.a(ComposeUiNode.Companion.f14335d, interfaceC1084f3, hVarC);
                        androidx.compose.foundation.gestures.d.c(pVar2, interfaceC1084f3, 0);
                    }
                    return p293xa.r.f47939a;
                }
            }, c1086gP), c1086g, (i14 & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) | i13 | (i12 & 7168), 1408);
        }
        C1105p0 c1105p0V = c1086g.V();
        if (c1105p0V != null) {
            c1105p0V.f13109d = new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.material3.DatePickerKt$Year$3
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(2);
                }

                @Override // Ia.p
                public final p293xa.r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                    num.intValue();
                    DatePickerKt.l(hVar, z10, z11, aVar, z12, str, c1064p, pVar, interfaceC1084f2, L4.b.l(i10 | 1));
                    return p293xa.r.f47939a;
                }
            };
        }
    }

    public static final void m(final androidx.compose.ui.h hVar, final long j, final Ia.l lVar, final Z z10, final androidx.compose.material3.internal.k kVar, final Na.i iVar, final C1064p c1064p, InterfaceC1084f interfaceC1084f, final int i10) {
        int i11;
        C1086g c1086gP = interfaceC1084f.p(-1286899812);
        if ((i10 & 6) == 0) {
            i11 = (c1086gP.K(hVar) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            i11 |= c1086gP.i(j) ? 32 : 16;
        }
        if ((i10 & 384) == 0) {
            i11 |= c1086gP.k(lVar) ? 256 : 128;
        }
        if ((i10 & 3072) == 0) {
            i11 |= c1086gP.K(z10) ? 2048 : 1024;
        }
        if ((i10 & 24576) == 0) {
            i11 |= c1086gP.k(kVar) ? 16384 : 8192;
        }
        if ((196608 & i10) == 0) {
            i11 |= c1086gP.k(iVar) ? 131072 : 65536;
        }
        if ((1572864 & i10) == 0) {
            i11 |= c1086gP.K(c1064p) ? 1048576 : 524288;
        }
        if ((i11 & 599187) == 599186 && c1086gP.s()) {
            c1086gP.w();
        } else {
            TextKt.a(TypographyKt.a(C0609d.f1257z, c1086gP), androidx.compose.runtime.internal.a.b(1301915789, new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.material3.DatePickerKt$YearPicker$1
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
                        androidx.compose.material3.internal.k kVar2 = kVar;
                        final int i12 = kVar2.f(kVar2.g()).f12550a;
                        final int i13 = kVar.e(j).f12550a;
                        final LazyGridState lazyGridStateA = LazyGridStateKt.a(Math.max(0, (i13 - iVar.f4687b) - 3), interfaceC1084f3, 2);
                        long j10 = c1064p.f12664a;
                        Object objF = interfaceC1084f3.f();
                        InterfaceC1084f.a.C0153a c0153a = InterfaceC1084f.a.f12980a;
                        if (objF == c0153a) {
                            C1113u c1113u = new C1113u(androidx.compose.runtime.E.f(EmptyCoroutineContext.f43032b, interfaceC1084f3));
                            interfaceC1084f3.E(c1113u);
                            objF = c1113u;
                        }
                        final kotlinx.coroutines.A a10 = ((C1113u) objF).f13246b;
                        final String strG = com.voltasit.obdeleven.domain.usecases.device.v.g(interfaceC1084f3, com.voltasit.obdeleven.R.string.m3c_date_picker_scroll_to_earlier_years);
                        final String strG2 = com.voltasit.obdeleven.domain.usecases.device.v.g(interfaceC1084f3, com.voltasit.obdeleven.R.string.m3c_date_picker_scroll_to_later_years);
                        androidx.compose.foundation.lazy.grid.b.a aVar = new androidx.compose.foundation.lazy.grid.b.a();
                        androidx.compose.ui.h hVarB = androidx.compose.ui.semantics.p.b(C0932d.b(hVar, j10, androidx.compose.ui.graphics.h0.f13629a), false, new Ia.l<androidx.compose.ui.semantics.w, p293xa.r>() { // from class: androidx.compose.material3.DatePickerKt$YearPicker$1.1
                            @Override // Ia.l
                            public final p293xa.r invoke(androidx.compose.ui.semantics.w wVar) {
                                androidx.compose.ui.semantics.t.o(wVar, new androidx.compose.ui.semantics.j(new Ia.a<Float>() { // from class: androidx.compose.material3.DatePickerKt.YearPicker.1.1.1
                                    @Override // Ia.a
                                    public final /* bridge */ /* synthetic */ Float invoke() {
                                        return Float.valueOf(0.0f);
                                    }
                                }, false, new Ia.a<Float>() { // from class: androidx.compose.material3.DatePickerKt.YearPicker.1.1.2
                                    @Override // Ia.a
                                    public final /* bridge */ /* synthetic */ Float invoke() {
                                        return Float.valueOf(0.0f);
                                    }
                                }));
                                return p293xa.r.f47939a;
                            }
                        });
                        C0945e.h hVar2 = C0945e.f10289f;
                        C0945e.i iVarG = C0945e.g(DatePickerKt.f12145g);
                        boolean zK = interfaceC1084f3.k(iVar) | interfaceC1084f3.K(lazyGridStateA) | interfaceC1084f3.k(a10) | interfaceC1084f3.K(strG) | interfaceC1084f3.K(strG2) | interfaceC1084f3.h(i13) | interfaceC1084f3.h(i12) | interfaceC1084f3.K(lVar) | interfaceC1084f3.K(z10) | interfaceC1084f3.K(c1064p);
                        final Na.i iVar2 = iVar;
                        final Ia.l<Integer, p293xa.r> lVar2 = lVar;
                        final Z z11 = z10;
                        final C1064p c1064p2 = c1064p;
                        Object objF2 = interfaceC1084f3.f();
                        if (zK || objF2 == c0153a) {
                            objF2 = new Ia.l<androidx.compose.foundation.lazy.grid.v, p293xa.r>() { // from class: androidx.compose.material3.DatePickerKt$YearPicker$1$2$1
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                /* JADX WARN: Multi-variable type inference failed */
                                {
                                    super(1);
                                }

                                @Override // Ia.l
                                public final p293xa.r invoke(androidx.compose.foundation.lazy.grid.v vVar) {
                                    int size;
                                    androidx.compose.foundation.lazy.grid.v vVar2 = vVar;
                                    Iterable iterable = iVar2;
                                    kotlin.jvm.internal.i.e(iterable, "<this>");
                                    if (iterable instanceof Collection) {
                                        size = ((Collection) iterable).size();
                                    } else {
                                        Na.h it = iterable.iterator();
                                        int i14 = 0;
                                        while (it.f4692d) {
                                            it.next();
                                            i14++;
                                            if (i14 < 0) {
                                                kotlin.collections.l.w();
                                                throw null;
                                            }
                                        }
                                        size = i14;
                                    }
                                    final Na.i iVar3 = iVar2;
                                    final LazyGridState lazyGridState = lazyGridStateA;
                                    final kotlinx.coroutines.A a11 = a10;
                                    final String str = strG;
                                    final String str2 = strG2;
                                    final int i15 = i13;
                                    final int i16 = i12;
                                    final Ia.l<Integer, p293xa.r> lVar3 = lVar2;
                                    final Z z12 = z11;
                                    final C1064p c1064p3 = c1064p2;
                                    vVar2.b(size, null, null, new Ia.l() { // from class: androidx.compose.foundation.lazy.grid.LazyGridScope$items$1
                                        @Override // Ia.l
                                        public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
                                            ((Number) obj).intValue();
                                            return null;
                                        }
                                    }, new ComposableLambdaImpl(true, 1040623618, new Ia.r<androidx.compose.foundation.lazy.grid.j, Integer, InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.material3.DatePickerKt$YearPicker$1$2$1.1
                                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                        /* JADX WARN: Multi-variable type inference failed */
                                        {
                                            super(4);
                                        }

                                        /*  JADX ERROR: JadxRuntimeException in pass: ConstructorVisitor
                                            jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r1v15 ??, still in use, count: 1, list:
                                              (r1v15 ?? I:java.lang.Object) from 0x008e: INVOKE (r13v1 ?? I:androidx.compose.runtime.f), (r1v15 ?? I:java.lang.Object) INTERFACE call: androidx.compose.runtime.f.E(java.lang.Object):void A[MD:(java.lang.Object):void (m)] (LINE:143)
                                            	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:164)
                                            	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:129)
                                            	at jadx.core.utils.InsnRemover.lambda$unbindInsns$1(InsnRemover.java:101)
                                            	at java.base/java.util.ArrayList.forEach(ArrayList.java:1604)
                                            	at jadx.core.utils.InsnRemover.unbindInsns(InsnRemover.java:100)
                                            	at jadx.core.utils.InsnRemover.perform(InsnRemover.java:75)
                                            	at jadx.core.dex.visitors.ConstructorVisitor.replaceInvoke(ConstructorVisitor.java:59)
                                            	at jadx.core.dex.visitors.ConstructorVisitor.visit(ConstructorVisitor.java:42)
                                            */
                                        @Override // Ia.r
                                        public final p293xa.r invoke(
                                        /*  JADX ERROR: JadxRuntimeException in pass: ConstructorVisitor
                                            jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r1v15 ??, still in use, count: 1, list:
                                              (r1v15 ?? I:java.lang.Object) from 0x008e: INVOKE (r13v1 ?? I:androidx.compose.runtime.f), (r1v15 ?? I:java.lang.Object) INTERFACE call: androidx.compose.runtime.f.E(java.lang.Object):void A[MD:(java.lang.Object):void (m)] (LINE:143)
                                            	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:164)
                                            	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:129)
                                            	at jadx.core.utils.InsnRemover.lambda$unbindInsns$1(InsnRemover.java:101)
                                            	at java.base/java.util.ArrayList.forEach(ArrayList.java:1604)
                                            	at jadx.core.utils.InsnRemover.unbindInsns(InsnRemover.java:100)
                                            	at jadx.core.utils.InsnRemover.perform(InsnRemover.java:75)
                                            	at jadx.core.dex.visitors.ConstructorVisitor.replaceInvoke(ConstructorVisitor.java:59)
                                            */
                                        /*  JADX ERROR: Method generation error
                                            jadx.core.utils.exceptions.JadxRuntimeException: Code variable not set in r16v0 ??
                                            	at jadx.core.dex.instructions.args.SSAVar.getCodeVar(SSAVar.java:236)
                                            	at jadx.core.codegen.MethodGen.addMethodArguments(MethodGen.java:215)
                                            	at jadx.core.codegen.MethodGen.addDefinition(MethodGen.java:150)
                                            	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:415)
                                            	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:345)
                                            	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$3(ClassGen.java:299)
                                            	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:186)
                                            	at java.base/java.util.ArrayList.forEach(ArrayList.java:1604)
                                            	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
                                            	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:261)
                                            	at java.base/java.util.stream.ReferencePipeline$7$1FlatMap.end(ReferencePipeline.java:284)
                                            	at java.base/java.util.stream.AbstractPipeline.copyInto(AbstractPipeline.java:571)
                                            	at java.base/java.util.stream.AbstractPipeline.wrapAndCopyInto(AbstractPipeline.java:560)
                                            	at java.base/java.util.stream.ForEachOps$ForEachOp.evaluateSequential(ForEachOps.java:153)
                                            	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.evaluateSequential(ForEachOps.java:176)
                                            	at java.base/java.util.stream.AbstractPipeline.evaluate(AbstractPipeline.java:265)
                                            	at java.base/java.util.stream.ReferencePipeline.forEach(ReferencePipeline.java:632)
                                            	at jadx.core.codegen.ClassGen.addInnerClsAndMethods(ClassGen.java:295)
                                            	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:284)
                                            	at jadx.core.codegen.InsnGen.inlineAnonymousConstructor(InsnGen.java:845)
                                            	at jadx.core.codegen.InsnGen.makeConstructor(InsnGen.java:730)
                                            	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:418)
                                            	at jadx.core.codegen.InsnGen.addWrappedArg(InsnGen.java:145)
                                            	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:121)
                                            	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:108)
                                            	at jadx.core.codegen.InsnGen.generateMethodArguments(InsnGen.java:1143)
                                            	at jadx.core.codegen.InsnGen.makeConstructor(InsnGen.java:782)
                                            	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:418)
                                            	at jadx.core.codegen.InsnGen.addWrappedArg(InsnGen.java:145)
                                            	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:121)
                                            	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:108)
                                            	at jadx.core.codegen.InsnGen.generateMethodArguments(InsnGen.java:1143)
                                            	at jadx.core.codegen.InsnGen.makeInvoke(InsnGen.java:910)
                                            	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:422)
                                            	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:303)
                                            	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:273)
                                            	at jadx.core.codegen.RegionGen.makeSimpleBlock(RegionGen.java:94)
                                            	at jadx.core.dex.nodes.IBlock.generate(IBlock.java:15)
                                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                            	at jadx.core.dex.regions.Region.generate(Region.java:35)
                                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                            	at jadx.core.codegen.MethodGen.addRegionInsns(MethodGen.java:291)
                                            	at jadx.core.codegen.MethodGen.addInstructions(MethodGen.java:270)
                                            	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:420)
                                            	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:345)
                                            	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$3(ClassGen.java:299)
                                            	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:186)
                                            	at java.base/java.util.ArrayList.forEach(ArrayList.java:1604)
                                            	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
                                            	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:261)
                                            	at java.base/java.util.stream.ReferencePipeline$7$1FlatMap.end(ReferencePipeline.java:284)
                                            	at java.base/java.util.stream.AbstractPipeline.copyInto(AbstractPipeline.java:571)
                                            	at java.base/java.util.stream.AbstractPipeline.wrapAndCopyInto(AbstractPipeline.java:560)
                                            	at java.base/java.util.stream.ForEachOps$ForEachOp.evaluateSequential(ForEachOps.java:153)
                                            	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.evaluateSequential(ForEachOps.java:176)
                                            	at java.base/java.util.stream.AbstractPipeline.evaluate(AbstractPipeline.java:265)
                                            	at java.base/java.util.stream.ReferencePipeline.forEach(ReferencePipeline.java:632)
                                            	at jadx.core.codegen.ClassGen.addInnerClsAndMethods(ClassGen.java:295)
                                            	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:284)
                                            	at jadx.core.codegen.InsnGen.inlineAnonymousConstructor(InsnGen.java:845)
                                            	at jadx.core.codegen.InsnGen.makeConstructor(InsnGen.java:730)
                                            	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:418)
                                            	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:303)
                                            	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:273)
                                            	at jadx.core.codegen.RegionGen.makeSimpleBlock(RegionGen.java:94)
                                            	at jadx.core.dex.nodes.IBlock.generate(IBlock.java:15)
                                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                            	at jadx.core.dex.regions.Region.generate(Region.java:35)
                                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                            	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:83)
                                            	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:126)
                                            	at jadx.core.dex.regions.conditions.IfRegion.generate(IfRegion.java:90)
                                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                            	at jadx.core.dex.regions.Region.generate(Region.java:35)
                                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                            	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:83)
                                            	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:140)
                                            	at jadx.core.dex.regions.conditions.IfRegion.generate(IfRegion.java:90)
                                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                            	at jadx.core.dex.regions.Region.generate(Region.java:35)
                                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                            	at jadx.core.codegen.MethodGen.addRegionInsns(MethodGen.java:291)
                                            	at jadx.core.codegen.MethodGen.addInstructions(MethodGen.java:270)
                                            	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:420)
                                            	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:345)
                                            	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$3(ClassGen.java:299)
                                            	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:186)
                                            	at java.base/java.util.ArrayList.forEach(ArrayList.java:1604)
                                            	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
                                            	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:261)
                                            	at java.base/java.util.stream.ReferencePipeline$7$1FlatMap.end(ReferencePipeline.java:284)
                                            	at java.base/java.util.stream.AbstractPipeline.copyInto(AbstractPipeline.java:571)
                                            	at java.base/java.util.stream.AbstractPipeline.wrapAndCopyInto(AbstractPipeline.java:560)
                                            	at java.base/java.util.stream.ForEachOps$ForEachOp.evaluateSequential(ForEachOps.java:153)
                                            	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.evaluateSequential(ForEachOps.java:176)
                                            	at java.base/java.util.stream.AbstractPipeline.evaluate(AbstractPipeline.java:265)
                                            	at java.base/java.util.stream.ReferencePipeline.forEach(ReferencePipeline.java:632)
                                            	at jadx.core.codegen.ClassGen.addInnerClsAndMethods(ClassGen.java:295)
                                            	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:284)
                                            	at jadx.core.codegen.InsnGen.inlineAnonymousConstructor(InsnGen.java:845)
                                            	at jadx.core.codegen.InsnGen.makeConstructor(InsnGen.java:730)
                                            	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:418)
                                            	at jadx.core.codegen.InsnGen.addWrappedArg(InsnGen.java:145)
                                            	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:121)
                                            	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:108)
                                            	at jadx.core.codegen.InsnGen.generateMethodArguments(InsnGen.java:1143)
                                            	at jadx.core.codegen.InsnGen.makeInvoke(InsnGen.java:910)
                                            	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:422)
                                            	at jadx.core.codegen.InsnGen.addWrappedArg(InsnGen.java:145)
                                            	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:121)
                                            	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:108)
                                            	at jadx.core.codegen.InsnGen.generateMethodArguments(InsnGen.java:1143)
                                            	at jadx.core.codegen.InsnGen.makeInvoke(InsnGen.java:910)
                                            	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:422)
                                            	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:303)
                                            	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:273)
                                            	at jadx.core.codegen.RegionGen.makeSimpleBlock(RegionGen.java:94)
                                            	at jadx.core.dex.nodes.IBlock.generate(IBlock.java:15)
                                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                            	at jadx.core.dex.regions.Region.generate(Region.java:35)
                                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                            	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:83)
                                            	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:140)
                                            	at jadx.core.dex.regions.conditions.IfRegion.generate(IfRegion.java:90)
                                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                            	at jadx.core.dex.regions.Region.generate(Region.java:35)
                                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                            	at jadx.core.codegen.MethodGen.addRegionInsns(MethodGen.java:291)
                                            	at jadx.core.codegen.MethodGen.addInstructions(MethodGen.java:270)
                                            	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:420)
                                            	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:345)
                                            	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$3(ClassGen.java:299)
                                            	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:186)
                                            	at java.base/java.util.ArrayList.forEach(ArrayList.java:1604)
                                            	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
                                            	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:261)
                                            	at java.base/java.util.stream.ReferencePipeline$7$1FlatMap.end(ReferencePipeline.java:284)
                                            	at java.base/java.util.stream.AbstractPipeline.copyInto(AbstractPipeline.java:571)
                                            	at java.base/java.util.stream.AbstractPipeline.wrapAndCopyInto(AbstractPipeline.java:560)
                                            	at java.base/java.util.stream.ForEachOps$ForEachOp.evaluateSequential(ForEachOps.java:153)
                                            	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.evaluateSequential(ForEachOps.java:176)
                                            	at java.base/java.util.stream.AbstractPipeline.evaluate(AbstractPipeline.java:265)
                                            	at java.base/java.util.stream.ReferencePipeline.forEach(ReferencePipeline.java:632)
                                            	at jadx.core.codegen.ClassGen.addInnerClsAndMethods(ClassGen.java:295)
                                            	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:284)
                                            	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:268)
                                            	at jadx.core.codegen.ClassGen.addClassCode(ClassGen.java:160)
                                            	at jadx.core.codegen.ClassGen.makeClass(ClassGen.java:104)
                                            	at jadx.core.codegen.CodeGen.wrapCodeGen(CodeGen.java:45)
                                            	at jadx.core.codegen.CodeGen.generateJavaCode(CodeGen.java:34)
                                            	at jadx.core.codegen.CodeGen.generate(CodeGen.java:22)
                                            	at jadx.core.ProcessClass.process(ProcessClass.java:89)
                                            	at jadx.core.ProcessClass.generateCode(ProcessClass.java:127)
                                            	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:405)
                                            	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:393)
                                            	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:343)
                                            */
                                    }));
                                    return p293xa.r.f47939a;
                                }
                            };
                            interfaceC1084f3.E(objF2);
                        }
                        LazyGridDslKt.a(aVar, hVarB, lazyGridStateA, null, false, iVarG, hVar2, null, false, (Ia.l) objF2, interfaceC1084f3, 1769472, 408);
                    }
                    return p293xa.r.f47939a;
                }
            }, c1086gP), c1086gP, 48);
        }
        C1105p0 c1105p0V = c1086gP.V();
        if (c1105p0V != null) {
            c1105p0V.f13109d = new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.material3.DatePickerKt$YearPicker$2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(2);
                }

                @Override // Ia.p
                public final p293xa.r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                    num.intValue();
                    DatePickerKt.m(hVar, j, lVar, z10, kVar, iVar, c1064p, interfaceC1084f2, L4.b.l(i10 | 1));
                    return p293xa.r.f47939a;
                }
            };
        }
    }

    /* JADX WARN: Code duplicated, block: B:36:0x0062  */
    /* JADX WARN: Code duplicated, block: B:38:0x0066  */
    /* JADX WARN: Code duplicated, block: B:40:0x006a  */
    /* JADX WARN: Code duplicated, block: B:42:0x0070  */
    /* JADX WARN: Code duplicated, block: B:43:0x0073  */
    /* JADX WARN: Code duplicated, block: B:51:0x0089 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:52:0x008b  */
    /* JADX WARN: Code duplicated, block: B:53:0x008e  */
    /* JADX WARN: Code duplicated, block: B:57:0x00d6  */
    /* JADX WARN: Code duplicated, block: B:59:? A[RETURN, SYNTHETIC] */
    public static final void n(final Ia.a aVar, final boolean z10, androidx.compose.ui.h hVar, final Ia.p pVar, InterfaceC1084f interfaceC1084f, final int i10, final int i11) {
        int i12;
        androidx.compose.ui.h hVar2;
        int i13;
        int i14;
        androidx.compose.ui.h hVar3;
        androidx.compose.ui.h hVar4;
        C1105p0 c1105p0V;
        C1086g c1086gP = interfaceC1084f.p(409654418);
        if ((i11 & 1) != 0) {
            i12 = i10 | 6;
        } else if ((i10 & 6) == 0) {
            i12 = (c1086gP.k(aVar) ? 4 : 2) | i10;
        } else {
            i12 = i10;
        }
        if ((i11 & 2) != 0) {
            i12 |= 48;
        } else if ((i10 & 48) == 0) {
            i12 |= c1086gP.c(z10) ? 32 : 16;
        }
        int i15 = i11 & 4;
        if (i15 == 0) {
            if ((i10 & 384) == 0) {
                hVar2 = hVar;
                i12 |= c1086gP.K(hVar2) ? 256 : 128;
            }
            if ((i11 & 8) != 0) {
                i12 |= 3072;
            } else if ((i10 & 3072) == 0) {
                if (c1086gP.k(pVar)) {
                    i13 = 2048;
                } else {
                    i13 = 1024;
                }
                i12 |= i13;
            }
            i14 = i12;
            if ((i14 & 1171) == 1170 || !c1086gP.s()) {
                if (i15 != 0) {
                    hVar3 = androidx.compose.ui.h.a.f13984b;
                } else {
                    hVar3 = hVar2;
                }
                p270w.f fVar = p270w.g.f47680a;
                androidx.compose.foundation.layout.N n10 = C1051f.f12444a;
                ButtonKt.c(aVar, hVar3, false, fVar, C1051f.g(0L, ((androidx.compose.ui.graphics.H) c1086gP.x(ContentColorKt.f12125a)).f13506a, c1086gP, 13), null, null, null, null, androidx.compose.runtime.internal.a.b(1899012021, new Ia.q<androidx.compose.foundation.layout.U, InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.material3.DatePickerKt$YearPickerMenuButton$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(3);
                    }

                    @Override // Ia.q
                    public final p293xa.r invoke(androidx.compose.foundation.layout.U u10, InterfaceC1084f interfaceC1084f2, Integer num) {
                        String strG;
                        InterfaceC1084f interfaceC1084f3 = interfaceC1084f2;
                        if ((num.intValue() & 17) == 16 && interfaceC1084f3.s()) {
                            interfaceC1084f3.w();
                        } else {
                            pVar.invoke(interfaceC1084f3, 0);
                            androidx.compose.ui.h.a aVar2 = androidx.compose.ui.h.a.f13984b;
                            Lb.a.a(interfaceC1084f3, androidx.compose.foundation.layout.W.m(aVar2, C1051f.f12448e));
                            androidx.compose.ui.graphics.vector.c cVarA = p306z.b.a();
                            if (z10) {
                                interfaceC1084f3.L(-1360040181);
                                strG = com.voltasit.obdeleven.domain.usecases.device.v.g(interfaceC1084f3, com.voltasit.obdeleven.R.string.m3c_date_picker_switch_to_day_selection);
                                interfaceC1084f3.D();
                            } else {
                                interfaceC1084f3.L(-1359945910);
                                strG = com.voltasit.obdeleven.domain.usecases.device.v.g(interfaceC1084f3, com.voltasit.obdeleven.R.string.m3c_date_picker_switch_to_year_selection);
                                interfaceC1084f3.D();
                            }
                            IconKt.b(cVarA, strG, G0.a.j(aVar2, z10 ? 180.0f : 0.0f), 0L, interfaceC1084f3, 0, 8);
                        }
                        return p293xa.r.f47939a;
                    }
                }, c1086gP), c1086gP, (i14 & 14) | 807075840 | ((i14 >> 3) & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle), 388);
                hVar4 = hVar3;
            } else {
                c1086gP.w();
                hVar4 = hVar2;
            }
            c1105p0V = c1086gP.V();
            if (c1105p0V != null) {
                final androidx.compose.ui.h hVar5 = hVar4;
                c1105p0V.f13109d = new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.material3.DatePickerKt$YearPickerMenuButton$2
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(2);
                    }

                    @Override // Ia.p
                    public final p293xa.r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                        num.intValue();
                        DatePickerKt.n(aVar, z10, hVar5, pVar, interfaceC1084f2, L4.b.l(i10 | 1), i11);
                        return p293xa.r.f47939a;
                    }
                };
            }
        }
        i12 |= 384;
        hVar2 = hVar;
        if ((i11 & 8) != 0) {
            i12 |= 3072;
        } else if ((i10 & 3072) == 0) {
            if (c1086gP.k(pVar)) {
                i13 = 2048;
            } else {
                i13 = 1024;
            }
            i12 |= i13;
        }
        i14 = i12;
        if ((i14 & 1171) == 1170) {
            if (i15 != 0) {
                hVar3 = androidx.compose.ui.h.a.f13984b;
            } else {
                hVar3 = hVar2;
            }
            p270w.f fVar2 = p270w.g.f47680a;
            androidx.compose.foundation.layout.N n11 = C1051f.f12444a;
            ButtonKt.c(aVar, hVar3, false, fVar2, C1051f.g(0L, ((androidx.compose.ui.graphics.H) c1086gP.x(ContentColorKt.f12125a)).f13506a, c1086gP, 13), null, null, null, null, androidx.compose.runtime.internal.a.b(1899012021, new Ia.q<androidx.compose.foundation.layout.U, InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.material3.DatePickerKt$YearPickerMenuButton$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(3);
                }

                @Override // Ia.q
                public final p293xa.r invoke(androidx.compose.foundation.layout.U u10, InterfaceC1084f interfaceC1084f2, Integer num) {
                    String strG;
                    InterfaceC1084f interfaceC1084f3 = interfaceC1084f2;
                    if ((num.intValue() & 17) == 16 && interfaceC1084f3.s()) {
                        interfaceC1084f3.w();
                    } else {
                        pVar.invoke(interfaceC1084f3, 0);
                        androidx.compose.ui.h.a aVar2 = androidx.compose.ui.h.a.f13984b;
                        Lb.a.a(interfaceC1084f3, androidx.compose.foundation.layout.W.m(aVar2, C1051f.f12448e));
                        androidx.compose.ui.graphics.vector.c cVarA = p306z.b.a();
                        if (z10) {
                            interfaceC1084f3.L(-1360040181);
                            strG = com.voltasit.obdeleven.domain.usecases.device.v.g(interfaceC1084f3, com.voltasit.obdeleven.R.string.m3c_date_picker_switch_to_day_selection);
                            interfaceC1084f3.D();
                        } else {
                            interfaceC1084f3.L(-1359945910);
                            strG = com.voltasit.obdeleven.domain.usecases.device.v.g(interfaceC1084f3, com.voltasit.obdeleven.R.string.m3c_date_picker_switch_to_year_selection);
                            interfaceC1084f3.D();
                        }
                        IconKt.b(cVarA, strG, G0.a.j(aVar2, z10 ? 180.0f : 0.0f), 0L, interfaceC1084f3, 0, 8);
                    }
                    return p293xa.r.f47939a;
                }
            }, c1086gP), c1086gP, (i14 & 14) | 807075840 | ((i14 >> 3) & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle), 388);
            hVar4 = hVar3;
        } else {
            if (i15 != 0) {
                hVar3 = androidx.compose.ui.h.a.f13984b;
            } else {
                hVar3 = hVar2;
            }
            p270w.f fVar3 = p270w.g.f47680a;
            androidx.compose.foundation.layout.N n12 = C1051f.f12444a;
            ButtonKt.c(aVar, hVar3, false, fVar3, C1051f.g(0L, ((androidx.compose.ui.graphics.H) c1086gP.x(ContentColorKt.f12125a)).f13506a, c1086gP, 13), null, null, null, null, androidx.compose.runtime.internal.a.b(1899012021, new Ia.q<androidx.compose.foundation.layout.U, InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.material3.DatePickerKt$YearPickerMenuButton$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(3);
                }

                @Override // Ia.q
                public final p293xa.r invoke(androidx.compose.foundation.layout.U u10, InterfaceC1084f interfaceC1084f2, Integer num) {
                    String strG;
                    InterfaceC1084f interfaceC1084f3 = interfaceC1084f2;
                    if ((num.intValue() & 17) == 16 && interfaceC1084f3.s()) {
                        interfaceC1084f3.w();
                    } else {
                        pVar.invoke(interfaceC1084f3, 0);
                        androidx.compose.ui.h.a aVar2 = androidx.compose.ui.h.a.f13984b;
                        Lb.a.a(interfaceC1084f3, androidx.compose.foundation.layout.W.m(aVar2, C1051f.f12448e));
                        androidx.compose.ui.graphics.vector.c cVarA = p306z.b.a();
                        if (z10) {
                            interfaceC1084f3.L(-1360040181);
                            strG = com.voltasit.obdeleven.domain.usecases.device.v.g(interfaceC1084f3, com.voltasit.obdeleven.R.string.m3c_date_picker_switch_to_day_selection);
                            interfaceC1084f3.D();
                        } else {
                            interfaceC1084f3.L(-1359945910);
                            strG = com.voltasit.obdeleven.domain.usecases.device.v.g(interfaceC1084f3, com.voltasit.obdeleven.R.string.m3c_date_picker_switch_to_year_selection);
                            interfaceC1084f3.D();
                        }
                        IconKt.b(cVarA, strG, G0.a.j(aVar2, z10 ? 180.0f : 0.0f), 0L, interfaceC1084f3, 0, 8);
                    }
                    return p293xa.r.f47939a;
                }
            }, c1086gP), c1086gP, (i14 & 14) | 807075840 | ((i14 >> 3) & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle), 388);
            hVar4 = hVar3;
        }
        c1105p0V = c1086gP.V();
        if (c1105p0V != null) {
            final androidx.compose.ui.h hVar6 = hVar4;
            c1105p0V.f13109d = new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.material3.DatePickerKt$YearPickerMenuButton$2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(2);
                }

                @Override // Ia.p
                public final p293xa.r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                    num.intValue();
                    DatePickerKt.n(aVar, z10, hVar6, pVar, interfaceC1084f2, L4.b.l(i10 | 1), i11);
                    return p293xa.r.f47939a;
                }
            };
        }
    }

    public static final C1068u o(final Long l10, InterfaceC1084f interfaceC1084f) {
        final Na.i iVar = DatePickerDefaults.f12133b;
        final DatePickerDefaults.a aVar = DatePickerDefaults.f12135d;
        final Locale localeA = C1053h.a(interfaceC1084f);
        Object[] objArr = new Object[0];
        W.f fVarA = androidx.compose.runtime.saveable.a.a(new Ia.p<androidx.compose.runtime.saveable.j, C1068u, List<? extends Object>>() { // from class: androidx.compose.material3.DatePickerStateImpl$Companion$Saver$1
            @Override // Ia.p
            public final List<? extends Object> invoke(androidx.compose.runtime.saveable.j jVar, C1068u c1068u) {
                C1068u c1068u2 = c1068u;
                Long lF = c1068u2.f();
                Long lValueOf = Long.valueOf(c1068u2.e());
                Na.i iVar2 = c1068u2.f12750a;
                return kotlin.collections.l.s(lF, lValueOf, Integer.valueOf(iVar2.f4687b), Integer.valueOf(iVar2.f4688c), Integer.valueOf(c1068u2.b()));
            }
        }, new Ia.l<List, C1068u>() { // from class: androidx.compose.material3.DatePickerStateImpl$Companion$Saver$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // Ia.l
            public final C1068u invoke(List list) {
                List list2 = list;
                Long l11 = (Long) list2.get(0);
                Long l12 = (Long) list2.get(1);
                Object obj = list2.get(2);
                kotlin.jvm.internal.i.c(obj, "null cannot be cast to non-null type kotlin.Int");
                int iIntValue = ((Integer) obj).intValue();
                Object obj2 = list2.get(3);
                kotlin.jvm.internal.i.c(obj2, "null cannot be cast to non-null type kotlin.Int");
                Na.i iVar2 = new Na.i(iIntValue, ((Integer) obj2).intValue(), 1);
                Object obj3 = list2.get(4);
                kotlin.jvm.internal.i.c(obj3, "null cannot be cast to non-null type kotlin.Int");
                return new C1068u(l11, l12, iVar2, ((Integer) obj3).intValue(), aVar, localeA);
            }
        });
        final int i10 = 0;
        boolean zK = interfaceC1084f.K(l10) | interfaceC1084f.K(l10) | interfaceC1084f.k(iVar) | interfaceC1084f.h(0) | interfaceC1084f.K(aVar) | interfaceC1084f.k(localeA);
        Object objF = interfaceC1084f.f();
        if (zK || objF == InterfaceC1084f.a.f12980a) {
            Object obj = new Ia.a<C1068u>() { // from class: androidx.compose.material3.DatePickerKt$rememberDatePickerState$1$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                }

                @Override // Ia.a
                public final C1068u invoke() {
                    return new C1068u(l10, l10, iVar, i10, aVar, localeA);
                }
            };
            interfaceC1084f.E(obj);
            objF = obj;
        }
        C1068u c1068u = (C1068u) androidx.compose.runtime.saveable.b.c(objArr, fVarA, null, (Ia.a) objF, interfaceC1084f, 0, 4);
        c1068u.f12752c.setValue(aVar);
        return c1068u;
    }
}
