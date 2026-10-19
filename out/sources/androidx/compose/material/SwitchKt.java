package androidx.compose.material;

import androidx.compose.animation.core.InterfaceC0921v;
import androidx.compose.animation.core.c0;
import androidx.compose.foundation.C0932d;
import androidx.compose.foundation.CanvasKt;
import androidx.compose.foundation.IndicationKt;
import androidx.compose.foundation.gestures.DraggableKt;
import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.C0949i;
import androidx.compose.foundation.layout.InterfaceC0948h;
import androidx.compose.foundation.layout.OffsetKt;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.W;
import androidx.compose.runtime.C1086g;
import androidx.compose.runtime.C1105p0;
import androidx.compose.runtime.InterfaceC1084f;
import androidx.compose.runtime.InterfaceC1089h0;
import androidx.compose.runtime.J0;
import androidx.compose.runtime.N0;
import androidx.compose.runtime.O0;
import androidx.compose.runtime.R0;
import androidx.compose.runtime.X;
import androidx.compose.runtime.snapshots.SnapshotStateList;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.unit.LayoutDirection;
import me.zhanghai.android.materialprogressbar.R;

/* JADX INFO: compiled from: Switch.kt */
/* JADX INFO: loaded from: classes.dex */
public final class SwitchKt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final float f11821a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final float f11823c;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final float f11826f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final float f11827g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final float f11828h;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final float f11822b = 14;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final float f11824d = 24;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final float f11825e = 2;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final c0<Float> f11829i = new c0<>(100, (InterfaceC0921v) null, 6);
    public static final float j = 1;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final float f11830k = 6;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final float f11831l = R.styleable.AppCompatTheme_windowMinWidthMinor;

    static {
        float f10 = 34;
        f11821a = f10;
        float f11 = 20;
        f11823c = f11;
        f11826f = f10;
        f11827g = f11;
        f11828h = f10 - f11;
    }

    /* JADX WARN: Code duplicated, block: B:100:0x0139  */
    /* JADX WARN: Code duplicated, block: B:102:0x0148  */
    /* JADX WARN: Code duplicated, block: B:105:0x0166  */
    /* JADX WARN: Code duplicated, block: B:108:0x018d A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:109:0x018f  */
    /* JADX WARN: Code duplicated, block: B:112:0x01f2 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:113:0x01f4  */
    /* JADX WARN: Code duplicated, block: B:116:0x021d  */
    /* JADX WARN: Code duplicated, block: B:117:0x021f  */
    /* JADX WARN: Code duplicated, block: B:120:0x022b A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:121:0x022d  */
    /* JADX WARN: Code duplicated, block: B:124:0x0245  */
    /* JADX WARN: Code duplicated, block: B:125:0x0248  */
    /* JADX WARN: Code duplicated, block: B:127:0x024c  */
    /* JADX WARN: Code duplicated, block: B:128:0x0257  */
    /* JADX WARN: Code duplicated, block: B:130:0x025c  */
    /* JADX WARN: Code duplicated, block: B:133:0x026e A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:135:0x0273  */
    /* JADX WARN: Code duplicated, block: B:138:0x02c0  */
    /* JADX WARN: Code duplicated, block: B:139:0x02c4  */
    /* JADX WARN: Code duplicated, block: B:142:0x02d7  */
    /* JADX WARN: Code duplicated, block: B:144:0x02e5  */
    /* JADX WARN: Code duplicated, block: B:147:0x0305 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:148:0x0307  */
    /* JADX WARN: Code duplicated, block: B:150:0x032e  */
    /* JADX WARN: Code duplicated, block: B:153:0x033a  */
    /* JADX WARN: Code duplicated, block: B:155:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:36:0x0062  */
    /* JADX WARN: Code duplicated, block: B:38:0x0067  */
    /* JADX WARN: Code duplicated, block: B:40:0x006b  */
    /* JADX WARN: Code duplicated, block: B:42:0x0073  */
    /* JADX WARN: Code duplicated, block: B:43:0x0076  */
    /* JADX WARN: Code duplicated, block: B:47:0x007d  */
    /* JADX WARN: Code duplicated, block: B:49:0x0082  */
    /* JADX WARN: Code duplicated, block: B:51:0x0086  */
    /* JADX WARN: Code duplicated, block: B:53:0x008e  */
    /* JADX WARN: Code duplicated, block: B:54:0x0091  */
    /* JADX WARN: Code duplicated, block: B:58:0x009b  */
    /* JADX WARN: Code duplicated, block: B:60:0x00a1  */
    /* JADX WARN: Code duplicated, block: B:63:0x00aa  */
    /* JADX WARN: Code duplicated, block: B:66:0x00b1  */
    /* JADX WARN: Code duplicated, block: B:69:0x00bf  */
    /* JADX WARN: Code duplicated, block: B:70:0x00c1  */
    /* JADX WARN: Code duplicated, block: B:73:0x00ca  */
    /* JADX WARN: Code duplicated, block: B:75:0x00d7  */
    /* JADX WARN: Code duplicated, block: B:83:0x00f0 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:84:0x00f2  */
    /* JADX WARN: Code duplicated, block: B:85:0x00f5  */
    /* JADX WARN: Code duplicated, block: B:87:0x00f8  */
    /* JADX WARN: Code duplicated, block: B:88:0x00fb  */
    /* JADX WARN: Code duplicated, block: B:90:0x00ff  */
    /* JADX WARN: Code duplicated, block: B:91:0x0101  */
    /* JADX WARN: Code duplicated, block: B:94:0x0106  */
    /* JADX WARN: Code duplicated, block: B:95:0x011f  */
    /* JADX WARN: Code duplicated, block: B:98:0x012d  */
    /* JADX WARN: Multi-variable type inference failed */
    public static final void a(final boolean z10, final Ia.l<? super Boolean, p293xa.r> lVar, androidx.compose.ui.h hVar, boolean z11, androidx.compose.foundation.interaction.k kVar, S s10, InterfaceC1084f interfaceC1084f, final int i10, final int i11) {
        int i12;
        androidx.compose.ui.h hVar2;
        int i13;
        boolean z12;
        int i14;
        int i15;
        androidx.compose.foundation.interaction.k kVar2;
        int i16;
        S s11;
        int i17;
        boolean z13;
        final androidx.compose.ui.h hVar3;
        final boolean z14;
        final S s12;
        C1105p0 c1105p0V;
        int i18;
        androidx.compose.ui.h hVar4;
        boolean z15;
        androidx.compose.foundation.interaction.k kVar3;
        androidx.compose.foundation.interaction.k kVar4;
        int i19;
        boolean z16;
        S sA;
        InterfaceC1084f.a.C0153a c0153a;
        androidx.compose.foundation.interaction.k kVar5;
        final float fT0;
        Object objF;
        X x10;
        final float fT1;
        boolean zG;
        Object obj;
        final AnchoredDraggableState anchoredDraggableState;
        X xI;
        int i20;
        X xI2;
        boolean zK;
        Object objF2;
        boolean z17;
        boolean zK2;
        Object objF3;
        boolean z18;
        int i21;
        androidx.compose.ui.h hVarA;
        boolean z19;
        int i22;
        Ia.a<ComposeUiNode> aVar;
        Ia.p<ComposeUiNode, Integer, p293xa.r> pVar;
        boolean zK3;
        Object objF4;
        Object objF5;
        int i23;
        C1086g c1086gP = interfaceC1084f.p(25866825);
        if ((i11 & 1) != 0) {
            i12 = i10 | 6;
        } else if ((i10 & 6) == 0) {
            i12 = (c1086gP.c(z10) ? 4 : 2) | i10;
        } else {
            i12 = i10;
        }
        if ((i11 & 2) != 0) {
            i12 |= 48;
        } else if ((i10 & 48) == 0) {
            i12 |= c1086gP.k(lVar) ? 32 : 16;
        }
        int i24 = i11 & 4;
        if (i24 == 0) {
            if ((i10 & 384) == 0) {
                hVar2 = hVar;
                i12 |= c1086gP.K(hVar2) ? 256 : 128;
            }
            i13 = i11 & 8;
            if (i13 != 0) {
                if ((i10 & 3072) == 0) {
                    z12 = z11;
                    if (c1086gP.c(z12)) {
                        i14 = 2048;
                    } else {
                        i14 = 1024;
                    }
                    i12 |= i14;
                }
                i15 = i11 & 16;
                if (i15 != 0) {
                    if ((i10 & 24576) == 0) {
                        kVar2 = kVar;
                        if (c1086gP.K(kVar2)) {
                            i16 = 16384;
                        } else {
                            i16 = 8192;
                        }
                        i12 |= i16;
                    }
                    if ((i10 & 196608) == 0) {
                        s11 = s10;
                        if ((i11 & 32) == 0 || !c1086gP.K(s11)) {
                            i23 = 65536;
                        } else {
                            i23 = 131072;
                        }
                        i12 |= i23;
                    } else {
                        s11 = s10;
                    }
                    i17 = i12;
                    if ((i17 & 74899) != 74898) {
                        z13 = true;
                    } else {
                        z13 = false;
                    }
                    if (c1086gP.C(i17 & 1, z13)) {
                        c1086gP.r0();
                        i18 = i10 & 1;
                        hVar4 = androidx.compose.ui.h.a.f13984b;
                        if (i18 != 0 || c1086gP.a0()) {
                            if (i24 != 0) {
                                hVar3 = hVar4;
                            } else {
                                hVar3 = hVar2;
                            }
                            if (i13 != 0) {
                                z15 = true;
                            } else {
                                z15 = z12;
                            }
                            if (i15 != 0) {
                                kVar3 = null;
                            } else {
                                kVar3 = kVar2;
                            }
                            if ((i11 & 32) != 0) {
                                i19 = i17 & (-458753);
                                sA = T.a(0L, 0L, 0.0f, c1086gP, 1023);
                                kVar4 = kVar3;
                                z16 = z15;
                            } else {
                                kVar4 = kVar3;
                                i19 = i17;
                                z16 = z15;
                            }
                            c1086gP.U();
                            c0153a = InterfaceC1084f.a.f12980a;
                            if (kVar4 == null) {
                                c1086gP.L(-1604939679);
                                objF5 = c1086gP.f();
                                if (objF5 == c0153a) {
                                    objF5 = new androidx.compose.foundation.interaction.l();
                                    c1086gP.E(objF5);
                                }
                                c1086gP.T(false);
                                kVar5 = (androidx.compose.foundation.interaction.k) objF5;
                            } else {
                                c1086gP.L(779511094);
                                c1086gP.T(false);
                                kVar5 = kVar4;
                            }
                            O0 o10 = CompositionLocalsKt.f14847h;
                            fT0 = ((p013b0.c) c1086gP.x(o10)).T0(f11828h);
                            objF = c1086gP.f();
                            if (objF == c0153a) {
                                objF = J0.f(Boolean.FALSE);
                                c1086gP.E(objF);
                            }
                            x10 = (X) objF;
                            fT1 = ((p013b0.c) c1086gP.x(o10)).T0(f11831l);
                            zG = c1086gP.g(fT0) | c1086gP.g(fT1);
                            Object objF6 = c1086gP.f();
                            obj = objF6;
                            if (zG || objF6 == c0153a) {
                                Ia.l<C1045v<Boolean>, p293xa.r> lVar2 = new Ia.l<C1045v<Boolean>, p293xa.r>() { // from class: androidx.compose.material.SwitchKt$Switch$anchoredDraggableState$1$1
                                    final /* synthetic */ float $minBound = 0.0f;

                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                    {
                                        super(1);
                                    }

                                    @Override // Ia.l
                                    public final p293xa.r invoke(C1045v<Boolean> c1045v) {
                                        C1045v<Boolean> c1045v2 = c1045v;
                                        c1045v2.f12027a.put(Boolean.FALSE, Float.valueOf(this.$minBound));
                                        c1045v2.f12027a.put(Boolean.TRUE, Float.valueOf(fT0));
                                        return p293xa.r.f47939a;
                                    }
                                };
                                C1045v<Boolean> c1045v = new C1045v<>();
                                lVar2.invoke(c1045v);
                                F f10 = new F(c1045v.f12027a);
                                Boolean boolValueOf = Boolean.valueOf(z10);
                                AnchoredDraggableState anchoredDraggableState2 = new AnchoredDraggableState(boolValueOf, new Ia.l<Float, Float>() { // from class: androidx.compose.material.SwitchKt$Switch$anchoredDraggableState$1$2
                                    @Override // Ia.l
                                    public final Float invoke(Float f11) {
                                        return Float.valueOf(f11.floatValue() * 0.7f);
                                    }
                                }, new Ia.a<Float>() { // from class: androidx.compose.material.SwitchKt$Switch$anchoredDraggableState$1$3
                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                    {
                                        super(0);
                                    }

                                    @Override // Ia.a
                                    public final Float invoke() {
                                        return Float.valueOf(fT1);
                                    }
                                }, f11829i, AnchoredDraggableState.AnonymousClass2.f11681h);
                                anchoredDraggableState2.f11679m.setValue(f10);
                                anchoredDraggableState2.h(boolValueOf);
                                c1086gP.E(anchoredDraggableState2);
                                obj = anchoredDraggableState2;
                            }
                            anchoredDraggableState = (AnchoredDraggableState) obj;
                            int i25 = i19 >> 3;
                            xI = J0.i(lVar, c1086gP);
                            i20 = i19 & 14;
                            xI2 = J0.i(Boolean.valueOf(z10), c1086gP);
                            zK = c1086gP.K(anchoredDraggableState) | c1086gP.K(xI2) | c1086gP.K(xI);
                            androidx.compose.foundation.interaction.k kVar6 = kVar4;
                            objF2 = c1086gP.f();
                            if (zK || objF2 == c0153a) {
                                objF2 = new SwitchKt$Switch$1$1(anchoredDraggableState, xI2, xI, x10, null);
                                c1086gP.E(objF2);
                            }
                            androidx.compose.runtime.E.d((Ia.p) objF2, c1086gP, anchoredDraggableState);
                            Boolean boolValueOf2 = Boolean.valueOf(z10);
                            Boolean bool = (Boolean) x10.getValue();
                            bool.getClass();
                            if (i20 == 4) {
                                z17 = true;
                            } else {
                                z17 = false;
                            }
                            zK2 = z17 | c1086gP.K(anchoredDraggableState);
                            objF3 = c1086gP.f();
                            if (zK2 || objF3 == c0153a) {
                                objF3 = new SwitchKt$Switch$2$1(z10, anchoredDraggableState, null);
                                c1086gP.E(objF3);
                            }
                            androidx.compose.runtime.E.e(boolValueOf2, bool, (Ia.p) objF3, c1086gP);
                            if (c1086gP.x(CompositionLocalsKt.f14852n) == LayoutDirection.f15718c) {
                                z18 = true;
                            } else {
                                z18 = false;
                            }
                            if (lVar != null) {
                                i21 = 2;
                                hVarA = androidx.compose.foundation.selection.c.a(z10, kVar5, z16, new androidx.compose.ui.semantics.i(2), lVar);
                            } else {
                                i21 = 2;
                                hVarA = hVar4;
                            }
                            if (lVar != null) {
                                O0 o11 = InteractiveComponentSizeKt.f11762a;
                                hVar4 = MinimumInteractiveModifier.f11774b;
                            }
                            androidx.compose.ui.h hVarI = hVar3.i(hVar4).i(hVarA);
                            Orientation orientation = Orientation.f9957b;
                            if (z16 || lVar == null) {
                                z19 = false;
                            } else {
                                z19 = true;
                            }
                            androidx.compose.ui.h hVarJ = W.j(f11826f, f11827g, PaddingKt.f(W.t(DraggableKt.a(hVarI, anchoredDraggableState.f11673f, Orientation.f9958c, z19, kVar5, false, new AnchoredDraggableKt$anchoredDraggable$1(anchoredDraggableState, null), z18, 32), androidx.compose.ui.d.a.f13339e, i21), f11825e));
                            androidx.compose.ui.layout.E eD = BoxKt.d(androidx.compose.ui.d.a.f13335a, false);
                            i22 = c1086gP.f12996P;
                            InterfaceC1089h0 interfaceC1089h0P = c1086gP.P();
                            androidx.compose.ui.h hVarC = ComposedModifierKt.c(c1086gP, hVarJ);
                            ComposeUiNode.f14331c0.getClass();
                            aVar = ComposeUiNode.Companion.f14333b;
                            c1086gP.r();
                            if (c1086gP.f12995O) {
                                c1086gP.v(aVar);
                            } else {
                                c1086gP.A();
                            }
                            R0.a(ComposeUiNode.Companion.f14337f, c1086gP, eD);
                            R0.a(ComposeUiNode.Companion.f14336e, c1086gP, interfaceC1089h0P);
                            pVar = ComposeUiNode.Companion.f14338g;
                            if (c1086gP.f12995O || !kotlin.jvm.internal.i.a(c1086gP.f(), Integer.valueOf(i22))) {
                                J4.i.d(i22, c1086gP, i22, pVar);
                            }
                            R0.a(ComposeUiNode.Companion.f14335d, c1086gP, hVarC);
                            C0949i c0949i = C0949i.f10304a;
                            boolean zBooleanValue = ((Boolean) anchoredDraggableState.f11675h.getValue()).booleanValue();
                            zK3 = c1086gP.K(anchoredDraggableState);
                            objF4 = c1086gP.f();
                            if (zK3 || objF4 == c0153a) {
                                objF4 = new Ia.a<Float>() { // from class: androidx.compose.material.SwitchKt$Switch$3$1$1
                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                    {
                                        super(0);
                                    }

                                    @Override // Ia.a
                                    public final Float invoke() {
                                        return Float.valueOf(anchoredDraggableState.e());
                                    }
                                };
                                c1086gP.E(objF4);
                            }
                            b(c0949i, zBooleanValue, z16, sA, (Ia.a) objF4, kVar5, c1086gP, (i25 & 896) | 6 | ((i19 >> 6) & 7168));
                            c1086gP.T(true);
                            kVar2 = kVar6;
                            z14 = z16;
                            s12 = sA;
                        } else {
                            c1086gP.w();
                            if ((i11 & 32) != 0) {
                                i17 &= -458753;
                            }
                            hVar3 = hVar2;
                            z16 = z12;
                            kVar4 = kVar2;
                            i19 = i17;
                        }
                        sA = s11;
                        c1086gP.U();
                        c0153a = InterfaceC1084f.a.f12980a;
                        if (kVar4 == null) {
                            c1086gP.L(-1604939679);
                            objF5 = c1086gP.f();
                            if (objF5 == c0153a) {
                                objF5 = new androidx.compose.foundation.interaction.l();
                                c1086gP.E(objF5);
                            }
                            c1086gP.T(false);
                            kVar5 = (androidx.compose.foundation.interaction.k) objF5;
                        } else {
                            c1086gP.L(779511094);
                            c1086gP.T(false);
                            kVar5 = kVar4;
                        }
                        O0 o12 = CompositionLocalsKt.f14847h;
                        fT0 = ((p013b0.c) c1086gP.x(o12)).T0(f11828h);
                        objF = c1086gP.f();
                        if (objF == c0153a) {
                            objF = J0.f(Boolean.FALSE);
                            c1086gP.E(objF);
                        }
                        x10 = (X) objF;
                        fT1 = ((p013b0.c) c1086gP.x(o12)).T0(f11831l);
                        zG = c1086gP.g(fT0) | c1086gP.g(fT1);
                        Object objF7 = c1086gP.f();
                        obj = objF7;
                        if (zG) {
                            Ia.l<C1045v<Boolean>, p293xa.r> lVar3 = new Ia.l<C1045v<Boolean>, p293xa.r>() { // from class: androidx.compose.material.SwitchKt$Switch$anchoredDraggableState$1$1
                                final /* synthetic */ float $minBound = 0.0f;

                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                {
                                    super(1);
                                }

                                @Override // Ia.l
                                public final p293xa.r invoke(C1045v<Boolean> c1045v2) {
                                    C1045v<Boolean> c1045v3 = c1045v2;
                                    c1045v3.f12027a.put(Boolean.FALSE, Float.valueOf(this.$minBound));
                                    c1045v3.f12027a.put(Boolean.TRUE, Float.valueOf(fT0));
                                    return p293xa.r.f47939a;
                                }
                            };
                            C1045v<Boolean> c1045v2 = new C1045v<>();
                            lVar3.invoke(c1045v2);
                            F f11 = new F(c1045v2.f12027a);
                            Boolean boolValueOf3 = Boolean.valueOf(z10);
                            AnchoredDraggableState anchoredDraggableState3 = new AnchoredDraggableState(boolValueOf3, new Ia.l<Float, Float>() { // from class: androidx.compose.material.SwitchKt$Switch$anchoredDraggableState$1$2
                                @Override // Ia.l
                                public final Float invoke(Float f12) {
                                    return Float.valueOf(f12.floatValue() * 0.7f);
                                }
                            }, new Ia.a<Float>() { // from class: androidx.compose.material.SwitchKt$Switch$anchoredDraggableState$1$3
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                {
                                    super(0);
                                }

                                @Override // Ia.a
                                public final Float invoke() {
                                    return Float.valueOf(fT1);
                                }
                            }, f11829i, AnchoredDraggableState.AnonymousClass2.f11681h);
                            anchoredDraggableState3.f11679m.setValue(f11);
                            anchoredDraggableState3.h(boolValueOf3);
                            c1086gP.E(anchoredDraggableState3);
                            obj = anchoredDraggableState3;
                        } else {
                            Ia.l<C1045v<Boolean>, p293xa.r> lVar4 = new Ia.l<C1045v<Boolean>, p293xa.r>() { // from class: androidx.compose.material.SwitchKt$Switch$anchoredDraggableState$1$1
                                final /* synthetic */ float $minBound = 0.0f;

                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                {
                                    super(1);
                                }

                                @Override // Ia.l
                                public final p293xa.r invoke(C1045v<Boolean> c1045v3) {
                                    C1045v<Boolean> c1045v4 = c1045v3;
                                    c1045v4.f12027a.put(Boolean.FALSE, Float.valueOf(this.$minBound));
                                    c1045v4.f12027a.put(Boolean.TRUE, Float.valueOf(fT0));
                                    return p293xa.r.f47939a;
                                }
                            };
                            C1045v<Boolean> c1045v3 = new C1045v<>();
                            lVar4.invoke(c1045v3);
                            F f12 = new F(c1045v3.f12027a);
                            Boolean boolValueOf4 = Boolean.valueOf(z10);
                            AnchoredDraggableState anchoredDraggableState4 = new AnchoredDraggableState(boolValueOf4, new Ia.l<Float, Float>() { // from class: androidx.compose.material.SwitchKt$Switch$anchoredDraggableState$1$2
                                @Override // Ia.l
                                public final Float invoke(Float f13) {
                                    return Float.valueOf(f13.floatValue() * 0.7f);
                                }
                            }, new Ia.a<Float>() { // from class: androidx.compose.material.SwitchKt$Switch$anchoredDraggableState$1$3
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                {
                                    super(0);
                                }

                                @Override // Ia.a
                                public final Float invoke() {
                                    return Float.valueOf(fT1);
                                }
                            }, f11829i, AnchoredDraggableState.AnonymousClass2.f11681h);
                            anchoredDraggableState4.f11679m.setValue(f12);
                            anchoredDraggableState4.h(boolValueOf4);
                            c1086gP.E(anchoredDraggableState4);
                            obj = anchoredDraggableState4;
                        }
                        anchoredDraggableState = (AnchoredDraggableState) obj;
                        int i26 = i19 >> 3;
                        xI = J0.i(lVar, c1086gP);
                        i20 = i19 & 14;
                        xI2 = J0.i(Boolean.valueOf(z10), c1086gP);
                        zK = c1086gP.K(anchoredDraggableState) | c1086gP.K(xI2) | c1086gP.K(xI);
                        androidx.compose.foundation.interaction.k kVar7 = kVar4;
                        objF2 = c1086gP.f();
                        if (zK) {
                            objF2 = new SwitchKt$Switch$1$1(anchoredDraggableState, xI2, xI, x10, null);
                            c1086gP.E(objF2);
                        } else {
                            objF2 = new SwitchKt$Switch$1$1(anchoredDraggableState, xI2, xI, x10, null);
                            c1086gP.E(objF2);
                        }
                        androidx.compose.runtime.E.d((Ia.p) objF2, c1086gP, anchoredDraggableState);
                        Boolean boolValueOf5 = Boolean.valueOf(z10);
                        Boolean bool2 = (Boolean) x10.getValue();
                        bool2.getClass();
                        if (i20 == 4) {
                            z17 = true;
                        } else {
                            z17 = false;
                        }
                        zK2 = z17 | c1086gP.K(anchoredDraggableState);
                        objF3 = c1086gP.f();
                        if (zK2) {
                            objF3 = new SwitchKt$Switch$2$1(z10, anchoredDraggableState, null);
                            c1086gP.E(objF3);
                        } else {
                            objF3 = new SwitchKt$Switch$2$1(z10, anchoredDraggableState, null);
                            c1086gP.E(objF3);
                        }
                        androidx.compose.runtime.E.e(boolValueOf5, bool2, (Ia.p) objF3, c1086gP);
                        if (c1086gP.x(CompositionLocalsKt.f14852n) == LayoutDirection.f15718c) {
                            z18 = true;
                        } else {
                            z18 = false;
                        }
                        if (lVar != null) {
                            i21 = 2;
                            hVarA = androidx.compose.foundation.selection.c.a(z10, kVar5, z16, new androidx.compose.ui.semantics.i(2), lVar);
                        } else {
                            i21 = 2;
                            hVarA = hVar4;
                        }
                        if (lVar != null) {
                            O0 o13 = InteractiveComponentSizeKt.f11762a;
                            hVar4 = MinimumInteractiveModifier.f11774b;
                        }
                        androidx.compose.ui.h hVarI2 = hVar3.i(hVar4).i(hVarA);
                        Orientation orientation2 = Orientation.f9957b;
                        if (z16) {
                            z19 = false;
                        } else {
                            z19 = false;
                        }
                        androidx.compose.ui.h hVarJ2 = W.j(f11826f, f11827g, PaddingKt.f(W.t(DraggableKt.a(hVarI2, anchoredDraggableState.f11673f, Orientation.f9958c, z19, kVar5, false, new AnchoredDraggableKt$anchoredDraggable$1(anchoredDraggableState, null), z18, 32), androidx.compose.ui.d.a.f13339e, i21), f11825e));
                        androidx.compose.ui.layout.E eD2 = BoxKt.d(androidx.compose.ui.d.a.f13335a, false);
                        i22 = c1086gP.f12996P;
                        InterfaceC1089h0 interfaceC1089h0P2 = c1086gP.P();
                        androidx.compose.ui.h hVarC2 = ComposedModifierKt.c(c1086gP, hVarJ2);
                        ComposeUiNode.f14331c0.getClass();
                        aVar = ComposeUiNode.Companion.f14333b;
                        c1086gP.r();
                        if (c1086gP.f12995O) {
                            c1086gP.v(aVar);
                        } else {
                            c1086gP.A();
                        }
                        R0.a(ComposeUiNode.Companion.f14337f, c1086gP, eD2);
                        R0.a(ComposeUiNode.Companion.f14336e, c1086gP, interfaceC1089h0P2);
                        pVar = ComposeUiNode.Companion.f14338g;
                        if (c1086gP.f12995O) {
                            J4.i.d(i22, c1086gP, i22, pVar);
                        } else {
                            J4.i.d(i22, c1086gP, i22, pVar);
                        }
                        R0.a(ComposeUiNode.Companion.f14335d, c1086gP, hVarC2);
                        C0949i c0949i2 = C0949i.f10304a;
                        boolean zBooleanValue2 = ((Boolean) anchoredDraggableState.f11675h.getValue()).booleanValue();
                        zK3 = c1086gP.K(anchoredDraggableState);
                        objF4 = c1086gP.f();
                        if (zK3) {
                            objF4 = new Ia.a<Float>() { // from class: androidx.compose.material.SwitchKt$Switch$3$1$1
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                {
                                    super(0);
                                }

                                @Override // Ia.a
                                public final Float invoke() {
                                    return Float.valueOf(anchoredDraggableState.e());
                                }
                            };
                            c1086gP.E(objF4);
                        } else {
                            objF4 = new Ia.a<Float>() { // from class: androidx.compose.material.SwitchKt$Switch$3$1$1
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                {
                                    super(0);
                                }

                                @Override // Ia.a
                                public final Float invoke() {
                                    return Float.valueOf(anchoredDraggableState.e());
                                }
                            };
                            c1086gP.E(objF4);
                        }
                        b(c0949i2, zBooleanValue2, z16, sA, (Ia.a) objF4, kVar5, c1086gP, (i26 & 896) | 6 | ((i19 >> 6) & 7168));
                        c1086gP.T(true);
                        kVar2 = kVar7;
                        z14 = z16;
                        s12 = sA;
                    } else {
                        c1086gP.w();
                        hVar3 = hVar2;
                        z14 = z12;
                        s12 = s11;
                    }
                    c1105p0V = c1086gP.V();
                    if (c1105p0V != null) {
                        final androidx.compose.foundation.interaction.k kVar8 = kVar2;
                        c1105p0V.f13109d = new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.material.SwitchKt$Switch$4
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            /* JADX WARN: Multi-variable type inference failed */
                            {
                                super(2);
                            }

                            @Override // Ia.p
                            public final p293xa.r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                                num.intValue();
                                SwitchKt.a(z10, lVar, hVar3, z14, kVar8, s12, interfaceC1084f2, L4.b.l(i10 | 1), i11);
                                return p293xa.r.f47939a;
                            }
                        };
                    }
                }
                i12 |= 24576;
                kVar2 = kVar;
                if ((i10 & 196608) == 0) {
                    s11 = s10;
                    if ((i11 & 32) == 0) {
                        i23 = 65536;
                    } else {
                        i23 = 65536;
                    }
                    i12 |= i23;
                } else {
                    s11 = s10;
                }
                i17 = i12;
                if ((i17 & 74899) != 74898) {
                    z13 = true;
                } else {
                    z13 = false;
                }
                if (c1086gP.C(i17 & 1, z13)) {
                    c1086gP.r0();
                    i18 = i10 & 1;
                    hVar4 = androidx.compose.ui.h.a.f13984b;
                    if (i18 != 0) {
                        if (i24 != 0) {
                            hVar3 = hVar4;
                        } else {
                            hVar3 = hVar2;
                        }
                        if (i13 != 0) {
                            z15 = true;
                        } else {
                            z15 = z12;
                        }
                        if (i15 != 0) {
                            kVar3 = null;
                        } else {
                            kVar3 = kVar2;
                        }
                        if ((i11 & 32) != 0) {
                            i19 = i17 & (-458753);
                            sA = T.a(0L, 0L, 0.0f, c1086gP, 1023);
                            kVar4 = kVar3;
                            z16 = z15;
                        } else {
                            kVar4 = kVar3;
                            i19 = i17;
                            z16 = z15;
                            sA = s11;
                        }
                    } else {
                        if (i24 != 0) {
                            hVar3 = hVar4;
                        } else {
                            hVar3 = hVar2;
                        }
                        if (i13 != 0) {
                            z15 = true;
                        } else {
                            z15 = z12;
                        }
                        if (i15 != 0) {
                            kVar3 = null;
                        } else {
                            kVar3 = kVar2;
                        }
                        if ((i11 & 32) != 0) {
                            i19 = i17 & (-458753);
                            sA = T.a(0L, 0L, 0.0f, c1086gP, 1023);
                            kVar4 = kVar3;
                            z16 = z15;
                        } else {
                            kVar4 = kVar3;
                            i19 = i17;
                            z16 = z15;
                            sA = s11;
                        }
                    }
                    c1086gP.U();
                    c0153a = InterfaceC1084f.a.f12980a;
                    if (kVar4 == null) {
                        c1086gP.L(-1604939679);
                        objF5 = c1086gP.f();
                        if (objF5 == c0153a) {
                            objF5 = new androidx.compose.foundation.interaction.l();
                            c1086gP.E(objF5);
                        }
                        c1086gP.T(false);
                        kVar5 = (androidx.compose.foundation.interaction.k) objF5;
                    } else {
                        c1086gP.L(779511094);
                        c1086gP.T(false);
                        kVar5 = kVar4;
                    }
                    O0 o14 = CompositionLocalsKt.f14847h;
                    fT0 = ((p013b0.c) c1086gP.x(o14)).T0(f11828h);
                    objF = c1086gP.f();
                    if (objF == c0153a) {
                        objF = J0.f(Boolean.FALSE);
                        c1086gP.E(objF);
                    }
                    x10 = (X) objF;
                    fT1 = ((p013b0.c) c1086gP.x(o14)).T0(f11831l);
                    zG = c1086gP.g(fT0) | c1086gP.g(fT1);
                    Object objF8 = c1086gP.f();
                    obj = objF8;
                    if (zG) {
                        Ia.l<C1045v<Boolean>, p293xa.r> lVar5 = new Ia.l<C1045v<Boolean>, p293xa.r>() { // from class: androidx.compose.material.SwitchKt$Switch$anchoredDraggableState$1$1
                            final /* synthetic */ float $minBound = 0.0f;

                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(1);
                            }

                            @Override // Ia.l
                            public final p293xa.r invoke(C1045v<Boolean> c1045v4) {
                                C1045v<Boolean> c1045v5 = c1045v4;
                                c1045v5.f12027a.put(Boolean.FALSE, Float.valueOf(this.$minBound));
                                c1045v5.f12027a.put(Boolean.TRUE, Float.valueOf(fT0));
                                return p293xa.r.f47939a;
                            }
                        };
                        C1045v<Boolean> c1045v4 = new C1045v<>();
                        lVar5.invoke(c1045v4);
                        F f13 = new F(c1045v4.f12027a);
                        Boolean boolValueOf6 = Boolean.valueOf(z10);
                        AnchoredDraggableState anchoredDraggableState5 = new AnchoredDraggableState(boolValueOf6, new Ia.l<Float, Float>() { // from class: androidx.compose.material.SwitchKt$Switch$anchoredDraggableState$1$2
                            @Override // Ia.l
                            public final Float invoke(Float f14) {
                                return Float.valueOf(f14.floatValue() * 0.7f);
                            }
                        }, new Ia.a<Float>() { // from class: androidx.compose.material.SwitchKt$Switch$anchoredDraggableState$1$3
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(0);
                            }

                            @Override // Ia.a
                            public final Float invoke() {
                                return Float.valueOf(fT1);
                            }
                        }, f11829i, AnchoredDraggableState.AnonymousClass2.f11681h);
                        anchoredDraggableState5.f11679m.setValue(f13);
                        anchoredDraggableState5.h(boolValueOf6);
                        c1086gP.E(anchoredDraggableState5);
                        obj = anchoredDraggableState5;
                    } else {
                        Ia.l<C1045v<Boolean>, p293xa.r> lVar6 = new Ia.l<C1045v<Boolean>, p293xa.r>() { // from class: androidx.compose.material.SwitchKt$Switch$anchoredDraggableState$1$1
                            final /* synthetic */ float $minBound = 0.0f;

                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(1);
                            }

                            @Override // Ia.l
                            public final p293xa.r invoke(C1045v<Boolean> c1045v5) {
                                C1045v<Boolean> c1045v6 = c1045v5;
                                c1045v6.f12027a.put(Boolean.FALSE, Float.valueOf(this.$minBound));
                                c1045v6.f12027a.put(Boolean.TRUE, Float.valueOf(fT0));
                                return p293xa.r.f47939a;
                            }
                        };
                        C1045v<Boolean> c1045v5 = new C1045v<>();
                        lVar6.invoke(c1045v5);
                        F f14 = new F(c1045v5.f12027a);
                        Boolean boolValueOf7 = Boolean.valueOf(z10);
                        AnchoredDraggableState anchoredDraggableState6 = new AnchoredDraggableState(boolValueOf7, new Ia.l<Float, Float>() { // from class: androidx.compose.material.SwitchKt$Switch$anchoredDraggableState$1$2
                            @Override // Ia.l
                            public final Float invoke(Float f15) {
                                return Float.valueOf(f15.floatValue() * 0.7f);
                            }
                        }, new Ia.a<Float>() { // from class: androidx.compose.material.SwitchKt$Switch$anchoredDraggableState$1$3
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(0);
                            }

                            @Override // Ia.a
                            public final Float invoke() {
                                return Float.valueOf(fT1);
                            }
                        }, f11829i, AnchoredDraggableState.AnonymousClass2.f11681h);
                        anchoredDraggableState6.f11679m.setValue(f14);
                        anchoredDraggableState6.h(boolValueOf7);
                        c1086gP.E(anchoredDraggableState6);
                        obj = anchoredDraggableState6;
                    }
                    anchoredDraggableState = (AnchoredDraggableState) obj;
                    int i27 = i19 >> 3;
                    xI = J0.i(lVar, c1086gP);
                    i20 = i19 & 14;
                    xI2 = J0.i(Boolean.valueOf(z10), c1086gP);
                    zK = c1086gP.K(anchoredDraggableState) | c1086gP.K(xI2) | c1086gP.K(xI);
                    androidx.compose.foundation.interaction.k kVar9 = kVar4;
                    objF2 = c1086gP.f();
                    if (zK) {
                        objF2 = new SwitchKt$Switch$1$1(anchoredDraggableState, xI2, xI, x10, null);
                        c1086gP.E(objF2);
                    } else {
                        objF2 = new SwitchKt$Switch$1$1(anchoredDraggableState, xI2, xI, x10, null);
                        c1086gP.E(objF2);
                    }
                    androidx.compose.runtime.E.d((Ia.p) objF2, c1086gP, anchoredDraggableState);
                    Boolean boolValueOf8 = Boolean.valueOf(z10);
                    Boolean bool3 = (Boolean) x10.getValue();
                    bool3.getClass();
                    if (i20 == 4) {
                        z17 = true;
                    } else {
                        z17 = false;
                    }
                    zK2 = z17 | c1086gP.K(anchoredDraggableState);
                    objF3 = c1086gP.f();
                    if (zK2) {
                        objF3 = new SwitchKt$Switch$2$1(z10, anchoredDraggableState, null);
                        c1086gP.E(objF3);
                    } else {
                        objF3 = new SwitchKt$Switch$2$1(z10, anchoredDraggableState, null);
                        c1086gP.E(objF3);
                    }
                    androidx.compose.runtime.E.e(boolValueOf8, bool3, (Ia.p) objF3, c1086gP);
                    if (c1086gP.x(CompositionLocalsKt.f14852n) == LayoutDirection.f15718c) {
                        z18 = true;
                    } else {
                        z18 = false;
                    }
                    if (lVar != null) {
                        i21 = 2;
                        hVarA = androidx.compose.foundation.selection.c.a(z10, kVar5, z16, new androidx.compose.ui.semantics.i(2), lVar);
                    } else {
                        i21 = 2;
                        hVarA = hVar4;
                    }
                    if (lVar != null) {
                        O0 o15 = InteractiveComponentSizeKt.f11762a;
                        hVar4 = MinimumInteractiveModifier.f11774b;
                    }
                    androidx.compose.ui.h hVarI3 = hVar3.i(hVar4).i(hVarA);
                    Orientation orientation3 = Orientation.f9957b;
                    if (z16) {
                        z19 = false;
                    } else {
                        z19 = false;
                    }
                    androidx.compose.ui.h hVarJ3 = W.j(f11826f, f11827g, PaddingKt.f(W.t(DraggableKt.a(hVarI3, anchoredDraggableState.f11673f, Orientation.f9958c, z19, kVar5, false, new AnchoredDraggableKt$anchoredDraggable$1(anchoredDraggableState, null), z18, 32), androidx.compose.ui.d.a.f13339e, i21), f11825e));
                    androidx.compose.ui.layout.E eD3 = BoxKt.d(androidx.compose.ui.d.a.f13335a, false);
                    i22 = c1086gP.f12996P;
                    InterfaceC1089h0 interfaceC1089h0P3 = c1086gP.P();
                    androidx.compose.ui.h hVarC3 = ComposedModifierKt.c(c1086gP, hVarJ3);
                    ComposeUiNode.f14331c0.getClass();
                    aVar = ComposeUiNode.Companion.f14333b;
                    c1086gP.r();
                    if (c1086gP.f12995O) {
                        c1086gP.v(aVar);
                    } else {
                        c1086gP.A();
                    }
                    R0.a(ComposeUiNode.Companion.f14337f, c1086gP, eD3);
                    R0.a(ComposeUiNode.Companion.f14336e, c1086gP, interfaceC1089h0P3);
                    pVar = ComposeUiNode.Companion.f14338g;
                    if (c1086gP.f12995O) {
                        J4.i.d(i22, c1086gP, i22, pVar);
                    } else {
                        J4.i.d(i22, c1086gP, i22, pVar);
                    }
                    R0.a(ComposeUiNode.Companion.f14335d, c1086gP, hVarC3);
                    C0949i c0949i3 = C0949i.f10304a;
                    boolean zBooleanValue3 = ((Boolean) anchoredDraggableState.f11675h.getValue()).booleanValue();
                    zK3 = c1086gP.K(anchoredDraggableState);
                    objF4 = c1086gP.f();
                    if (zK3) {
                        objF4 = new Ia.a<Float>() { // from class: androidx.compose.material.SwitchKt$Switch$3$1$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(0);
                            }

                            @Override // Ia.a
                            public final Float invoke() {
                                return Float.valueOf(anchoredDraggableState.e());
                            }
                        };
                        c1086gP.E(objF4);
                    } else {
                        objF4 = new Ia.a<Float>() { // from class: androidx.compose.material.SwitchKt$Switch$3$1$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(0);
                            }

                            @Override // Ia.a
                            public final Float invoke() {
                                return Float.valueOf(anchoredDraggableState.e());
                            }
                        };
                        c1086gP.E(objF4);
                    }
                    b(c0949i3, zBooleanValue3, z16, sA, (Ia.a) objF4, kVar5, c1086gP, (i27 & 896) | 6 | ((i19 >> 6) & 7168));
                    c1086gP.T(true);
                    kVar2 = kVar9;
                    z14 = z16;
                    s12 = sA;
                } else {
                    c1086gP.w();
                    hVar3 = hVar2;
                    z14 = z12;
                    s12 = s11;
                }
                c1105p0V = c1086gP.V();
                if (c1105p0V != null) {
                    final androidx.compose.foundation.interaction.k kVar10 = kVar2;
                    c1105p0V.f13109d = new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.material.SwitchKt$Switch$4
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        /* JADX WARN: Multi-variable type inference failed */
                        {
                            super(2);
                        }

                        @Override // Ia.p
                        public final p293xa.r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                            num.intValue();
                            SwitchKt.a(z10, lVar, hVar3, z14, kVar10, s12, interfaceC1084f2, L4.b.l(i10 | 1), i11);
                            return p293xa.r.f47939a;
                        }
                    };
                }
            }
            i12 |= 3072;
            z12 = z11;
            i15 = i11 & 16;
            if (i15 != 0) {
                if ((i10 & 24576) == 0) {
                    kVar2 = kVar;
                    if (c1086gP.K(kVar2)) {
                        i16 = 16384;
                    } else {
                        i16 = 8192;
                    }
                    i12 |= i16;
                }
                if ((i10 & 196608) == 0) {
                    s11 = s10;
                    if ((i11 & 32) == 0) {
                        i23 = 65536;
                    } else {
                        i23 = 65536;
                    }
                    i12 |= i23;
                } else {
                    s11 = s10;
                }
                i17 = i12;
                if ((i17 & 74899) != 74898) {
                    z13 = true;
                } else {
                    z13 = false;
                }
                if (c1086gP.C(i17 & 1, z13)) {
                    c1086gP.r0();
                    i18 = i10 & 1;
                    hVar4 = androidx.compose.ui.h.a.f13984b;
                    if (i18 != 0) {
                        if (i24 != 0) {
                            hVar3 = hVar4;
                        } else {
                            hVar3 = hVar2;
                        }
                        if (i13 != 0) {
                            z15 = true;
                        } else {
                            z15 = z12;
                        }
                        if (i15 != 0) {
                            kVar3 = null;
                        } else {
                            kVar3 = kVar2;
                        }
                        if ((i11 & 32) != 0) {
                            i19 = i17 & (-458753);
                            sA = T.a(0L, 0L, 0.0f, c1086gP, 1023);
                            kVar4 = kVar3;
                            z16 = z15;
                        } else {
                            kVar4 = kVar3;
                            i19 = i17;
                            z16 = z15;
                            sA = s11;
                        }
                    } else {
                        if (i24 != 0) {
                            hVar3 = hVar4;
                        } else {
                            hVar3 = hVar2;
                        }
                        if (i13 != 0) {
                            z15 = true;
                        } else {
                            z15 = z12;
                        }
                        if (i15 != 0) {
                            kVar3 = null;
                        } else {
                            kVar3 = kVar2;
                        }
                        if ((i11 & 32) != 0) {
                            i19 = i17 & (-458753);
                            sA = T.a(0L, 0L, 0.0f, c1086gP, 1023);
                            kVar4 = kVar3;
                            z16 = z15;
                        } else {
                            kVar4 = kVar3;
                            i19 = i17;
                            z16 = z15;
                            sA = s11;
                        }
                    }
                    c1086gP.U();
                    c0153a = InterfaceC1084f.a.f12980a;
                    if (kVar4 == null) {
                        c1086gP.L(-1604939679);
                        objF5 = c1086gP.f();
                        if (objF5 == c0153a) {
                            objF5 = new androidx.compose.foundation.interaction.l();
                            c1086gP.E(objF5);
                        }
                        c1086gP.T(false);
                        kVar5 = (androidx.compose.foundation.interaction.k) objF5;
                    } else {
                        c1086gP.L(779511094);
                        c1086gP.T(false);
                        kVar5 = kVar4;
                    }
                    O0 o16 = CompositionLocalsKt.f14847h;
                    fT0 = ((p013b0.c) c1086gP.x(o16)).T0(f11828h);
                    objF = c1086gP.f();
                    if (objF == c0153a) {
                        objF = J0.f(Boolean.FALSE);
                        c1086gP.E(objF);
                    }
                    x10 = (X) objF;
                    fT1 = ((p013b0.c) c1086gP.x(o16)).T0(f11831l);
                    zG = c1086gP.g(fT0) | c1086gP.g(fT1);
                    Object objF9 = c1086gP.f();
                    obj = objF9;
                    if (zG) {
                        Ia.l<C1045v<Boolean>, p293xa.r> lVar7 = new Ia.l<C1045v<Boolean>, p293xa.r>() { // from class: androidx.compose.material.SwitchKt$Switch$anchoredDraggableState$1$1
                            final /* synthetic */ float $minBound = 0.0f;

                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(1);
                            }

                            @Override // Ia.l
                            public final p293xa.r invoke(C1045v<Boolean> c1045v6) {
                                C1045v<Boolean> c1045v7 = c1045v6;
                                c1045v7.f12027a.put(Boolean.FALSE, Float.valueOf(this.$minBound));
                                c1045v7.f12027a.put(Boolean.TRUE, Float.valueOf(fT0));
                                return p293xa.r.f47939a;
                            }
                        };
                        C1045v<Boolean> c1045v6 = new C1045v<>();
                        lVar7.invoke(c1045v6);
                        F f15 = new F(c1045v6.f12027a);
                        Boolean boolValueOf9 = Boolean.valueOf(z10);
                        AnchoredDraggableState anchoredDraggableState7 = new AnchoredDraggableState(boolValueOf9, new Ia.l<Float, Float>() { // from class: androidx.compose.material.SwitchKt$Switch$anchoredDraggableState$1$2
                            @Override // Ia.l
                            public final Float invoke(Float f16) {
                                return Float.valueOf(f16.floatValue() * 0.7f);
                            }
                        }, new Ia.a<Float>() { // from class: androidx.compose.material.SwitchKt$Switch$anchoredDraggableState$1$3
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(0);
                            }

                            @Override // Ia.a
                            public final Float invoke() {
                                return Float.valueOf(fT1);
                            }
                        }, f11829i, AnchoredDraggableState.AnonymousClass2.f11681h);
                        anchoredDraggableState7.f11679m.setValue(f15);
                        anchoredDraggableState7.h(boolValueOf9);
                        c1086gP.E(anchoredDraggableState7);
                        obj = anchoredDraggableState7;
                    } else {
                        Ia.l<C1045v<Boolean>, p293xa.r> lVar8 = new Ia.l<C1045v<Boolean>, p293xa.r>() { // from class: androidx.compose.material.SwitchKt$Switch$anchoredDraggableState$1$1
                            final /* synthetic */ float $minBound = 0.0f;

                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(1);
                            }

                            @Override // Ia.l
                            public final p293xa.r invoke(C1045v<Boolean> c1045v7) {
                                C1045v<Boolean> c1045v8 = c1045v7;
                                c1045v8.f12027a.put(Boolean.FALSE, Float.valueOf(this.$minBound));
                                c1045v8.f12027a.put(Boolean.TRUE, Float.valueOf(fT0));
                                return p293xa.r.f47939a;
                            }
                        };
                        C1045v<Boolean> c1045v7 = new C1045v<>();
                        lVar8.invoke(c1045v7);
                        F f16 = new F(c1045v7.f12027a);
                        Boolean boolValueOf10 = Boolean.valueOf(z10);
                        AnchoredDraggableState anchoredDraggableState8 = new AnchoredDraggableState(boolValueOf10, new Ia.l<Float, Float>() { // from class: androidx.compose.material.SwitchKt$Switch$anchoredDraggableState$1$2
                            @Override // Ia.l
                            public final Float invoke(Float f17) {
                                return Float.valueOf(f17.floatValue() * 0.7f);
                            }
                        }, new Ia.a<Float>() { // from class: androidx.compose.material.SwitchKt$Switch$anchoredDraggableState$1$3
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(0);
                            }

                            @Override // Ia.a
                            public final Float invoke() {
                                return Float.valueOf(fT1);
                            }
                        }, f11829i, AnchoredDraggableState.AnonymousClass2.f11681h);
                        anchoredDraggableState8.f11679m.setValue(f16);
                        anchoredDraggableState8.h(boolValueOf10);
                        c1086gP.E(anchoredDraggableState8);
                        obj = anchoredDraggableState8;
                    }
                    anchoredDraggableState = (AnchoredDraggableState) obj;
                    int i28 = i19 >> 3;
                    xI = J0.i(lVar, c1086gP);
                    i20 = i19 & 14;
                    xI2 = J0.i(Boolean.valueOf(z10), c1086gP);
                    zK = c1086gP.K(anchoredDraggableState) | c1086gP.K(xI2) | c1086gP.K(xI);
                    androidx.compose.foundation.interaction.k kVar11 = kVar4;
                    objF2 = c1086gP.f();
                    if (zK) {
                        objF2 = new SwitchKt$Switch$1$1(anchoredDraggableState, xI2, xI, x10, null);
                        c1086gP.E(objF2);
                    } else {
                        objF2 = new SwitchKt$Switch$1$1(anchoredDraggableState, xI2, xI, x10, null);
                        c1086gP.E(objF2);
                    }
                    androidx.compose.runtime.E.d((Ia.p) objF2, c1086gP, anchoredDraggableState);
                    Boolean boolValueOf11 = Boolean.valueOf(z10);
                    Boolean bool4 = (Boolean) x10.getValue();
                    bool4.getClass();
                    if (i20 == 4) {
                        z17 = true;
                    } else {
                        z17 = false;
                    }
                    zK2 = z17 | c1086gP.K(anchoredDraggableState);
                    objF3 = c1086gP.f();
                    if (zK2) {
                        objF3 = new SwitchKt$Switch$2$1(z10, anchoredDraggableState, null);
                        c1086gP.E(objF3);
                    } else {
                        objF3 = new SwitchKt$Switch$2$1(z10, anchoredDraggableState, null);
                        c1086gP.E(objF3);
                    }
                    androidx.compose.runtime.E.e(boolValueOf11, bool4, (Ia.p) objF3, c1086gP);
                    if (c1086gP.x(CompositionLocalsKt.f14852n) == LayoutDirection.f15718c) {
                        z18 = true;
                    } else {
                        z18 = false;
                    }
                    if (lVar != null) {
                        i21 = 2;
                        hVarA = androidx.compose.foundation.selection.c.a(z10, kVar5, z16, new androidx.compose.ui.semantics.i(2), lVar);
                    } else {
                        i21 = 2;
                        hVarA = hVar4;
                    }
                    if (lVar != null) {
                        O0 o17 = InteractiveComponentSizeKt.f11762a;
                        hVar4 = MinimumInteractiveModifier.f11774b;
                    }
                    androidx.compose.ui.h hVarI4 = hVar3.i(hVar4).i(hVarA);
                    Orientation orientation4 = Orientation.f9957b;
                    if (z16) {
                        z19 = false;
                    } else {
                        z19 = false;
                    }
                    androidx.compose.ui.h hVarJ4 = W.j(f11826f, f11827g, PaddingKt.f(W.t(DraggableKt.a(hVarI4, anchoredDraggableState.f11673f, Orientation.f9958c, z19, kVar5, false, new AnchoredDraggableKt$anchoredDraggable$1(anchoredDraggableState, null), z18, 32), androidx.compose.ui.d.a.f13339e, i21), f11825e));
                    androidx.compose.ui.layout.E eD4 = BoxKt.d(androidx.compose.ui.d.a.f13335a, false);
                    i22 = c1086gP.f12996P;
                    InterfaceC1089h0 interfaceC1089h0P4 = c1086gP.P();
                    androidx.compose.ui.h hVarC4 = ComposedModifierKt.c(c1086gP, hVarJ4);
                    ComposeUiNode.f14331c0.getClass();
                    aVar = ComposeUiNode.Companion.f14333b;
                    c1086gP.r();
                    if (c1086gP.f12995O) {
                        c1086gP.v(aVar);
                    } else {
                        c1086gP.A();
                    }
                    R0.a(ComposeUiNode.Companion.f14337f, c1086gP, eD4);
                    R0.a(ComposeUiNode.Companion.f14336e, c1086gP, interfaceC1089h0P4);
                    pVar = ComposeUiNode.Companion.f14338g;
                    if (c1086gP.f12995O) {
                        J4.i.d(i22, c1086gP, i22, pVar);
                    } else {
                        J4.i.d(i22, c1086gP, i22, pVar);
                    }
                    R0.a(ComposeUiNode.Companion.f14335d, c1086gP, hVarC4);
                    C0949i c0949i4 = C0949i.f10304a;
                    boolean zBooleanValue4 = ((Boolean) anchoredDraggableState.f11675h.getValue()).booleanValue();
                    zK3 = c1086gP.K(anchoredDraggableState);
                    objF4 = c1086gP.f();
                    if (zK3) {
                        objF4 = new Ia.a<Float>() { // from class: androidx.compose.material.SwitchKt$Switch$3$1$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(0);
                            }

                            @Override // Ia.a
                            public final Float invoke() {
                                return Float.valueOf(anchoredDraggableState.e());
                            }
                        };
                        c1086gP.E(objF4);
                    } else {
                        objF4 = new Ia.a<Float>() { // from class: androidx.compose.material.SwitchKt$Switch$3$1$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(0);
                            }

                            @Override // Ia.a
                            public final Float invoke() {
                                return Float.valueOf(anchoredDraggableState.e());
                            }
                        };
                        c1086gP.E(objF4);
                    }
                    b(c0949i4, zBooleanValue4, z16, sA, (Ia.a) objF4, kVar5, c1086gP, (i28 & 896) | 6 | ((i19 >> 6) & 7168));
                    c1086gP.T(true);
                    kVar2 = kVar11;
                    z14 = z16;
                    s12 = sA;
                } else {
                    c1086gP.w();
                    hVar3 = hVar2;
                    z14 = z12;
                    s12 = s11;
                }
                c1105p0V = c1086gP.V();
                if (c1105p0V != null) {
                    final androidx.compose.foundation.interaction.k kVar12 = kVar2;
                    c1105p0V.f13109d = new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.material.SwitchKt$Switch$4
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        /* JADX WARN: Multi-variable type inference failed */
                        {
                            super(2);
                        }

                        @Override // Ia.p
                        public final p293xa.r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                            num.intValue();
                            SwitchKt.a(z10, lVar, hVar3, z14, kVar12, s12, interfaceC1084f2, L4.b.l(i10 | 1), i11);
                            return p293xa.r.f47939a;
                        }
                    };
                }
            }
            i12 |= 24576;
            kVar2 = kVar;
            if ((i10 & 196608) == 0) {
                s11 = s10;
                if ((i11 & 32) == 0) {
                    i23 = 65536;
                } else {
                    i23 = 65536;
                }
                i12 |= i23;
            } else {
                s11 = s10;
            }
            i17 = i12;
            if ((i17 & 74899) != 74898) {
                z13 = true;
            } else {
                z13 = false;
            }
            if (c1086gP.C(i17 & 1, z13)) {
                c1086gP.r0();
                i18 = i10 & 1;
                hVar4 = androidx.compose.ui.h.a.f13984b;
                if (i18 != 0) {
                    if (i24 != 0) {
                        hVar3 = hVar4;
                    } else {
                        hVar3 = hVar2;
                    }
                    if (i13 != 0) {
                        z15 = true;
                    } else {
                        z15 = z12;
                    }
                    if (i15 != 0) {
                        kVar3 = null;
                    } else {
                        kVar3 = kVar2;
                    }
                    if ((i11 & 32) != 0) {
                        i19 = i17 & (-458753);
                        sA = T.a(0L, 0L, 0.0f, c1086gP, 1023);
                        kVar4 = kVar3;
                        z16 = z15;
                    } else {
                        kVar4 = kVar3;
                        i19 = i17;
                        z16 = z15;
                        sA = s11;
                    }
                } else {
                    if (i24 != 0) {
                        hVar3 = hVar4;
                    } else {
                        hVar3 = hVar2;
                    }
                    if (i13 != 0) {
                        z15 = true;
                    } else {
                        z15 = z12;
                    }
                    if (i15 != 0) {
                        kVar3 = null;
                    } else {
                        kVar3 = kVar2;
                    }
                    if ((i11 & 32) != 0) {
                        i19 = i17 & (-458753);
                        sA = T.a(0L, 0L, 0.0f, c1086gP, 1023);
                        kVar4 = kVar3;
                        z16 = z15;
                    } else {
                        kVar4 = kVar3;
                        i19 = i17;
                        z16 = z15;
                        sA = s11;
                    }
                }
                c1086gP.U();
                c0153a = InterfaceC1084f.a.f12980a;
                if (kVar4 == null) {
                    c1086gP.L(-1604939679);
                    objF5 = c1086gP.f();
                    if (objF5 == c0153a) {
                        objF5 = new androidx.compose.foundation.interaction.l();
                        c1086gP.E(objF5);
                    }
                    c1086gP.T(false);
                    kVar5 = (androidx.compose.foundation.interaction.k) objF5;
                } else {
                    c1086gP.L(779511094);
                    c1086gP.T(false);
                    kVar5 = kVar4;
                }
                O0 o18 = CompositionLocalsKt.f14847h;
                fT0 = ((p013b0.c) c1086gP.x(o18)).T0(f11828h);
                objF = c1086gP.f();
                if (objF == c0153a) {
                    objF = J0.f(Boolean.FALSE);
                    c1086gP.E(objF);
                }
                x10 = (X) objF;
                fT1 = ((p013b0.c) c1086gP.x(o18)).T0(f11831l);
                zG = c1086gP.g(fT0) | c1086gP.g(fT1);
                Object objF10 = c1086gP.f();
                obj = objF10;
                if (zG) {
                    Ia.l<C1045v<Boolean>, p293xa.r> lVar9 = new Ia.l<C1045v<Boolean>, p293xa.r>() { // from class: androidx.compose.material.SwitchKt$Switch$anchoredDraggableState$1$1
                        final /* synthetic */ float $minBound = 0.0f;

                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(1);
                        }

                        @Override // Ia.l
                        public final p293xa.r invoke(C1045v<Boolean> c1045v8) {
                            C1045v<Boolean> c1045v9 = c1045v8;
                            c1045v9.f12027a.put(Boolean.FALSE, Float.valueOf(this.$minBound));
                            c1045v9.f12027a.put(Boolean.TRUE, Float.valueOf(fT0));
                            return p293xa.r.f47939a;
                        }
                    };
                    C1045v<Boolean> c1045v8 = new C1045v<>();
                    lVar9.invoke(c1045v8);
                    F f17 = new F(c1045v8.f12027a);
                    Boolean boolValueOf12 = Boolean.valueOf(z10);
                    AnchoredDraggableState anchoredDraggableState9 = new AnchoredDraggableState(boolValueOf12, new Ia.l<Float, Float>() { // from class: androidx.compose.material.SwitchKt$Switch$anchoredDraggableState$1$2
                        @Override // Ia.l
                        public final Float invoke(Float f18) {
                            return Float.valueOf(f18.floatValue() * 0.7f);
                        }
                    }, new Ia.a<Float>() { // from class: androidx.compose.material.SwitchKt$Switch$anchoredDraggableState$1$3
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(0);
                        }

                        @Override // Ia.a
                        public final Float invoke() {
                            return Float.valueOf(fT1);
                        }
                    }, f11829i, AnchoredDraggableState.AnonymousClass2.f11681h);
                    anchoredDraggableState9.f11679m.setValue(f17);
                    anchoredDraggableState9.h(boolValueOf12);
                    c1086gP.E(anchoredDraggableState9);
                    obj = anchoredDraggableState9;
                } else {
                    Ia.l<C1045v<Boolean>, p293xa.r> lVar10 = new Ia.l<C1045v<Boolean>, p293xa.r>() { // from class: androidx.compose.material.SwitchKt$Switch$anchoredDraggableState$1$1
                        final /* synthetic */ float $minBound = 0.0f;

                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(1);
                        }

                        @Override // Ia.l
                        public final p293xa.r invoke(C1045v<Boolean> c1045v9) {
                            C1045v<Boolean> c1045v10 = c1045v9;
                            c1045v10.f12027a.put(Boolean.FALSE, Float.valueOf(this.$minBound));
                            c1045v10.f12027a.put(Boolean.TRUE, Float.valueOf(fT0));
                            return p293xa.r.f47939a;
                        }
                    };
                    C1045v<Boolean> c1045v9 = new C1045v<>();
                    lVar10.invoke(c1045v9);
                    F f18 = new F(c1045v9.f12027a);
                    Boolean boolValueOf13 = Boolean.valueOf(z10);
                    AnchoredDraggableState anchoredDraggableState10 = new AnchoredDraggableState(boolValueOf13, new Ia.l<Float, Float>() { // from class: androidx.compose.material.SwitchKt$Switch$anchoredDraggableState$1$2
                        @Override // Ia.l
                        public final Float invoke(Float f19) {
                            return Float.valueOf(f19.floatValue() * 0.7f);
                        }
                    }, new Ia.a<Float>() { // from class: androidx.compose.material.SwitchKt$Switch$anchoredDraggableState$1$3
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(0);
                        }

                        @Override // Ia.a
                        public final Float invoke() {
                            return Float.valueOf(fT1);
                        }
                    }, f11829i, AnchoredDraggableState.AnonymousClass2.f11681h);
                    anchoredDraggableState10.f11679m.setValue(f18);
                    anchoredDraggableState10.h(boolValueOf13);
                    c1086gP.E(anchoredDraggableState10);
                    obj = anchoredDraggableState10;
                }
                anchoredDraggableState = (AnchoredDraggableState) obj;
                int i29 = i19 >> 3;
                xI = J0.i(lVar, c1086gP);
                i20 = i19 & 14;
                xI2 = J0.i(Boolean.valueOf(z10), c1086gP);
                zK = c1086gP.K(anchoredDraggableState) | c1086gP.K(xI2) | c1086gP.K(xI);
                androidx.compose.foundation.interaction.k kVar13 = kVar4;
                objF2 = c1086gP.f();
                if (zK) {
                    objF2 = new SwitchKt$Switch$1$1(anchoredDraggableState, xI2, xI, x10, null);
                    c1086gP.E(objF2);
                } else {
                    objF2 = new SwitchKt$Switch$1$1(anchoredDraggableState, xI2, xI, x10, null);
                    c1086gP.E(objF2);
                }
                androidx.compose.runtime.E.d((Ia.p) objF2, c1086gP, anchoredDraggableState);
                Boolean boolValueOf14 = Boolean.valueOf(z10);
                Boolean bool5 = (Boolean) x10.getValue();
                bool5.getClass();
                if (i20 == 4) {
                    z17 = true;
                } else {
                    z17 = false;
                }
                zK2 = z17 | c1086gP.K(anchoredDraggableState);
                objF3 = c1086gP.f();
                if (zK2) {
                    objF3 = new SwitchKt$Switch$2$1(z10, anchoredDraggableState, null);
                    c1086gP.E(objF3);
                } else {
                    objF3 = new SwitchKt$Switch$2$1(z10, anchoredDraggableState, null);
                    c1086gP.E(objF3);
                }
                androidx.compose.runtime.E.e(boolValueOf14, bool5, (Ia.p) objF3, c1086gP);
                if (c1086gP.x(CompositionLocalsKt.f14852n) == LayoutDirection.f15718c) {
                    z18 = true;
                } else {
                    z18 = false;
                }
                if (lVar != null) {
                    i21 = 2;
                    hVarA = androidx.compose.foundation.selection.c.a(z10, kVar5, z16, new androidx.compose.ui.semantics.i(2), lVar);
                } else {
                    i21 = 2;
                    hVarA = hVar4;
                }
                if (lVar != null) {
                    O0 o19 = InteractiveComponentSizeKt.f11762a;
                    hVar4 = MinimumInteractiveModifier.f11774b;
                }
                androidx.compose.ui.h hVarI5 = hVar3.i(hVar4).i(hVarA);
                Orientation orientation5 = Orientation.f9957b;
                if (z16) {
                    z19 = false;
                } else {
                    z19 = false;
                }
                androidx.compose.ui.h hVarJ5 = W.j(f11826f, f11827g, PaddingKt.f(W.t(DraggableKt.a(hVarI5, anchoredDraggableState.f11673f, Orientation.f9958c, z19, kVar5, false, new AnchoredDraggableKt$anchoredDraggable$1(anchoredDraggableState, null), z18, 32), androidx.compose.ui.d.a.f13339e, i21), f11825e));
                androidx.compose.ui.layout.E eD5 = BoxKt.d(androidx.compose.ui.d.a.f13335a, false);
                i22 = c1086gP.f12996P;
                InterfaceC1089h0 interfaceC1089h0P5 = c1086gP.P();
                androidx.compose.ui.h hVarC5 = ComposedModifierKt.c(c1086gP, hVarJ5);
                ComposeUiNode.f14331c0.getClass();
                aVar = ComposeUiNode.Companion.f14333b;
                c1086gP.r();
                if (c1086gP.f12995O) {
                    c1086gP.v(aVar);
                } else {
                    c1086gP.A();
                }
                R0.a(ComposeUiNode.Companion.f14337f, c1086gP, eD5);
                R0.a(ComposeUiNode.Companion.f14336e, c1086gP, interfaceC1089h0P5);
                pVar = ComposeUiNode.Companion.f14338g;
                if (c1086gP.f12995O) {
                    J4.i.d(i22, c1086gP, i22, pVar);
                } else {
                    J4.i.d(i22, c1086gP, i22, pVar);
                }
                R0.a(ComposeUiNode.Companion.f14335d, c1086gP, hVarC5);
                C0949i c0949i5 = C0949i.f10304a;
                boolean zBooleanValue5 = ((Boolean) anchoredDraggableState.f11675h.getValue()).booleanValue();
                zK3 = c1086gP.K(anchoredDraggableState);
                objF4 = c1086gP.f();
                if (zK3) {
                    objF4 = new Ia.a<Float>() { // from class: androidx.compose.material.SwitchKt$Switch$3$1$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(0);
                        }

                        @Override // Ia.a
                        public final Float invoke() {
                            return Float.valueOf(anchoredDraggableState.e());
                        }
                    };
                    c1086gP.E(objF4);
                } else {
                    objF4 = new Ia.a<Float>() { // from class: androidx.compose.material.SwitchKt$Switch$3$1$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(0);
                        }

                        @Override // Ia.a
                        public final Float invoke() {
                            return Float.valueOf(anchoredDraggableState.e());
                        }
                    };
                    c1086gP.E(objF4);
                }
                b(c0949i5, zBooleanValue5, z16, sA, (Ia.a) objF4, kVar5, c1086gP, (i29 & 896) | 6 | ((i19 >> 6) & 7168));
                c1086gP.T(true);
                kVar2 = kVar13;
                z14 = z16;
                s12 = sA;
            } else {
                c1086gP.w();
                hVar3 = hVar2;
                z14 = z12;
                s12 = s11;
            }
            c1105p0V = c1086gP.V();
            if (c1105p0V != null) {
                final androidx.compose.foundation.interaction.k kVar14 = kVar2;
                c1105p0V.f13109d = new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.material.SwitchKt$Switch$4
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(2);
                    }

                    @Override // Ia.p
                    public final p293xa.r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                        num.intValue();
                        SwitchKt.a(z10, lVar, hVar3, z14, kVar14, s12, interfaceC1084f2, L4.b.l(i10 | 1), i11);
                        return p293xa.r.f47939a;
                    }
                };
            }
        }
        i12 |= 384;
        hVar2 = hVar;
        i13 = i11 & 8;
        if (i13 != 0) {
            if ((i10 & 3072) == 0) {
                z12 = z11;
                if (c1086gP.c(z12)) {
                    i14 = 2048;
                } else {
                    i14 = 1024;
                }
                i12 |= i14;
            }
            i15 = i11 & 16;
            if (i15 != 0) {
                if ((i10 & 24576) == 0) {
                    kVar2 = kVar;
                    if (c1086gP.K(kVar2)) {
                        i16 = 16384;
                    } else {
                        i16 = 8192;
                    }
                    i12 |= i16;
                }
                if ((i10 & 196608) == 0) {
                    s11 = s10;
                    if ((i11 & 32) == 0) {
                        i23 = 65536;
                    } else {
                        i23 = 65536;
                    }
                    i12 |= i23;
                } else {
                    s11 = s10;
                }
                i17 = i12;
                if ((i17 & 74899) != 74898) {
                    z13 = true;
                } else {
                    z13 = false;
                }
                if (c1086gP.C(i17 & 1, z13)) {
                    c1086gP.r0();
                    i18 = i10 & 1;
                    hVar4 = androidx.compose.ui.h.a.f13984b;
                    if (i18 != 0) {
                        if (i24 != 0) {
                            hVar3 = hVar4;
                        } else {
                            hVar3 = hVar2;
                        }
                        if (i13 != 0) {
                            z15 = true;
                        } else {
                            z15 = z12;
                        }
                        if (i15 != 0) {
                            kVar3 = null;
                        } else {
                            kVar3 = kVar2;
                        }
                        if ((i11 & 32) != 0) {
                            i19 = i17 & (-458753);
                            sA = T.a(0L, 0L, 0.0f, c1086gP, 1023);
                            kVar4 = kVar3;
                            z16 = z15;
                        } else {
                            kVar4 = kVar3;
                            i19 = i17;
                            z16 = z15;
                            sA = s11;
                        }
                    } else {
                        if (i24 != 0) {
                            hVar3 = hVar4;
                        } else {
                            hVar3 = hVar2;
                        }
                        if (i13 != 0) {
                            z15 = true;
                        } else {
                            z15 = z12;
                        }
                        if (i15 != 0) {
                            kVar3 = null;
                        } else {
                            kVar3 = kVar2;
                        }
                        if ((i11 & 32) != 0) {
                            i19 = i17 & (-458753);
                            sA = T.a(0L, 0L, 0.0f, c1086gP, 1023);
                            kVar4 = kVar3;
                            z16 = z15;
                        } else {
                            kVar4 = kVar3;
                            i19 = i17;
                            z16 = z15;
                            sA = s11;
                        }
                    }
                    c1086gP.U();
                    c0153a = InterfaceC1084f.a.f12980a;
                    if (kVar4 == null) {
                        c1086gP.L(-1604939679);
                        objF5 = c1086gP.f();
                        if (objF5 == c0153a) {
                            objF5 = new androidx.compose.foundation.interaction.l();
                            c1086gP.E(objF5);
                        }
                        c1086gP.T(false);
                        kVar5 = (androidx.compose.foundation.interaction.k) objF5;
                    } else {
                        c1086gP.L(779511094);
                        c1086gP.T(false);
                        kVar5 = kVar4;
                    }
                    O0 o110 = CompositionLocalsKt.f14847h;
                    fT0 = ((p013b0.c) c1086gP.x(o110)).T0(f11828h);
                    objF = c1086gP.f();
                    if (objF == c0153a) {
                        objF = J0.f(Boolean.FALSE);
                        c1086gP.E(objF);
                    }
                    x10 = (X) objF;
                    fT1 = ((p013b0.c) c1086gP.x(o110)).T0(f11831l);
                    zG = c1086gP.g(fT0) | c1086gP.g(fT1);
                    Object objF11 = c1086gP.f();
                    obj = objF11;
                    if (zG) {
                        Ia.l<C1045v<Boolean>, p293xa.r> lVar11 = new Ia.l<C1045v<Boolean>, p293xa.r>() { // from class: androidx.compose.material.SwitchKt$Switch$anchoredDraggableState$1$1
                            final /* synthetic */ float $minBound = 0.0f;

                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(1);
                            }

                            @Override // Ia.l
                            public final p293xa.r invoke(C1045v<Boolean> c1045v10) {
                                C1045v<Boolean> c1045v11 = c1045v10;
                                c1045v11.f12027a.put(Boolean.FALSE, Float.valueOf(this.$minBound));
                                c1045v11.f12027a.put(Boolean.TRUE, Float.valueOf(fT0));
                                return p293xa.r.f47939a;
                            }
                        };
                        C1045v<Boolean> c1045v10 = new C1045v<>();
                        lVar11.invoke(c1045v10);
                        F f19 = new F(c1045v10.f12027a);
                        Boolean boolValueOf15 = Boolean.valueOf(z10);
                        AnchoredDraggableState anchoredDraggableState11 = new AnchoredDraggableState(boolValueOf15, new Ia.l<Float, Float>() { // from class: androidx.compose.material.SwitchKt$Switch$anchoredDraggableState$1$2
                            @Override // Ia.l
                            public final Float invoke(Float f110) {
                                return Float.valueOf(f110.floatValue() * 0.7f);
                            }
                        }, new Ia.a<Float>() { // from class: androidx.compose.material.SwitchKt$Switch$anchoredDraggableState$1$3
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(0);
                            }

                            @Override // Ia.a
                            public final Float invoke() {
                                return Float.valueOf(fT1);
                            }
                        }, f11829i, AnchoredDraggableState.AnonymousClass2.f11681h);
                        anchoredDraggableState11.f11679m.setValue(f19);
                        anchoredDraggableState11.h(boolValueOf15);
                        c1086gP.E(anchoredDraggableState11);
                        obj = anchoredDraggableState11;
                    } else {
                        Ia.l<C1045v<Boolean>, p293xa.r> lVar12 = new Ia.l<C1045v<Boolean>, p293xa.r>() { // from class: androidx.compose.material.SwitchKt$Switch$anchoredDraggableState$1$1
                            final /* synthetic */ float $minBound = 0.0f;

                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(1);
                            }

                            @Override // Ia.l
                            public final p293xa.r invoke(C1045v<Boolean> c1045v11) {
                                C1045v<Boolean> c1045v12 = c1045v11;
                                c1045v12.f12027a.put(Boolean.FALSE, Float.valueOf(this.$minBound));
                                c1045v12.f12027a.put(Boolean.TRUE, Float.valueOf(fT0));
                                return p293xa.r.f47939a;
                            }
                        };
                        C1045v<Boolean> c1045v11 = new C1045v<>();
                        lVar12.invoke(c1045v11);
                        F f110 = new F(c1045v11.f12027a);
                        Boolean boolValueOf16 = Boolean.valueOf(z10);
                        AnchoredDraggableState anchoredDraggableState12 = new AnchoredDraggableState(boolValueOf16, new Ia.l<Float, Float>() { // from class: androidx.compose.material.SwitchKt$Switch$anchoredDraggableState$1$2
                            @Override // Ia.l
                            public final Float invoke(Float f111) {
                                return Float.valueOf(f111.floatValue() * 0.7f);
                            }
                        }, new Ia.a<Float>() { // from class: androidx.compose.material.SwitchKt$Switch$anchoredDraggableState$1$3
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(0);
                            }

                            @Override // Ia.a
                            public final Float invoke() {
                                return Float.valueOf(fT1);
                            }
                        }, f11829i, AnchoredDraggableState.AnonymousClass2.f11681h);
                        anchoredDraggableState12.f11679m.setValue(f110);
                        anchoredDraggableState12.h(boolValueOf16);
                        c1086gP.E(anchoredDraggableState12);
                        obj = anchoredDraggableState12;
                    }
                    anchoredDraggableState = (AnchoredDraggableState) obj;
                    int i210 = i19 >> 3;
                    xI = J0.i(lVar, c1086gP);
                    i20 = i19 & 14;
                    xI2 = J0.i(Boolean.valueOf(z10), c1086gP);
                    zK = c1086gP.K(anchoredDraggableState) | c1086gP.K(xI2) | c1086gP.K(xI);
                    androidx.compose.foundation.interaction.k kVar15 = kVar4;
                    objF2 = c1086gP.f();
                    if (zK) {
                        objF2 = new SwitchKt$Switch$1$1(anchoredDraggableState, xI2, xI, x10, null);
                        c1086gP.E(objF2);
                    } else {
                        objF2 = new SwitchKt$Switch$1$1(anchoredDraggableState, xI2, xI, x10, null);
                        c1086gP.E(objF2);
                    }
                    androidx.compose.runtime.E.d((Ia.p) objF2, c1086gP, anchoredDraggableState);
                    Boolean boolValueOf17 = Boolean.valueOf(z10);
                    Boolean bool6 = (Boolean) x10.getValue();
                    bool6.getClass();
                    if (i20 == 4) {
                        z17 = true;
                    } else {
                        z17 = false;
                    }
                    zK2 = z17 | c1086gP.K(anchoredDraggableState);
                    objF3 = c1086gP.f();
                    if (zK2) {
                        objF3 = new SwitchKt$Switch$2$1(z10, anchoredDraggableState, null);
                        c1086gP.E(objF3);
                    } else {
                        objF3 = new SwitchKt$Switch$2$1(z10, anchoredDraggableState, null);
                        c1086gP.E(objF3);
                    }
                    androidx.compose.runtime.E.e(boolValueOf17, bool6, (Ia.p) objF3, c1086gP);
                    if (c1086gP.x(CompositionLocalsKt.f14852n) == LayoutDirection.f15718c) {
                        z18 = true;
                    } else {
                        z18 = false;
                    }
                    if (lVar != null) {
                        i21 = 2;
                        hVarA = androidx.compose.foundation.selection.c.a(z10, kVar5, z16, new androidx.compose.ui.semantics.i(2), lVar);
                    } else {
                        i21 = 2;
                        hVarA = hVar4;
                    }
                    if (lVar != null) {
                        O0 o111 = InteractiveComponentSizeKt.f11762a;
                        hVar4 = MinimumInteractiveModifier.f11774b;
                    }
                    androidx.compose.ui.h hVarI6 = hVar3.i(hVar4).i(hVarA);
                    Orientation orientation6 = Orientation.f9957b;
                    if (z16) {
                        z19 = false;
                    } else {
                        z19 = false;
                    }
                    androidx.compose.ui.h hVarJ6 = W.j(f11826f, f11827g, PaddingKt.f(W.t(DraggableKt.a(hVarI6, anchoredDraggableState.f11673f, Orientation.f9958c, z19, kVar5, false, new AnchoredDraggableKt$anchoredDraggable$1(anchoredDraggableState, null), z18, 32), androidx.compose.ui.d.a.f13339e, i21), f11825e));
                    androidx.compose.ui.layout.E eD6 = BoxKt.d(androidx.compose.ui.d.a.f13335a, false);
                    i22 = c1086gP.f12996P;
                    InterfaceC1089h0 interfaceC1089h0P6 = c1086gP.P();
                    androidx.compose.ui.h hVarC6 = ComposedModifierKt.c(c1086gP, hVarJ6);
                    ComposeUiNode.f14331c0.getClass();
                    aVar = ComposeUiNode.Companion.f14333b;
                    c1086gP.r();
                    if (c1086gP.f12995O) {
                        c1086gP.v(aVar);
                    } else {
                        c1086gP.A();
                    }
                    R0.a(ComposeUiNode.Companion.f14337f, c1086gP, eD6);
                    R0.a(ComposeUiNode.Companion.f14336e, c1086gP, interfaceC1089h0P6);
                    pVar = ComposeUiNode.Companion.f14338g;
                    if (c1086gP.f12995O) {
                        J4.i.d(i22, c1086gP, i22, pVar);
                    } else {
                        J4.i.d(i22, c1086gP, i22, pVar);
                    }
                    R0.a(ComposeUiNode.Companion.f14335d, c1086gP, hVarC6);
                    C0949i c0949i6 = C0949i.f10304a;
                    boolean zBooleanValue6 = ((Boolean) anchoredDraggableState.f11675h.getValue()).booleanValue();
                    zK3 = c1086gP.K(anchoredDraggableState);
                    objF4 = c1086gP.f();
                    if (zK3) {
                        objF4 = new Ia.a<Float>() { // from class: androidx.compose.material.SwitchKt$Switch$3$1$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(0);
                            }

                            @Override // Ia.a
                            public final Float invoke() {
                                return Float.valueOf(anchoredDraggableState.e());
                            }
                        };
                        c1086gP.E(objF4);
                    } else {
                        objF4 = new Ia.a<Float>() { // from class: androidx.compose.material.SwitchKt$Switch$3$1$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(0);
                            }

                            @Override // Ia.a
                            public final Float invoke() {
                                return Float.valueOf(anchoredDraggableState.e());
                            }
                        };
                        c1086gP.E(objF4);
                    }
                    b(c0949i6, zBooleanValue6, z16, sA, (Ia.a) objF4, kVar5, c1086gP, (i210 & 896) | 6 | ((i19 >> 6) & 7168));
                    c1086gP.T(true);
                    kVar2 = kVar15;
                    z14 = z16;
                    s12 = sA;
                } else {
                    c1086gP.w();
                    hVar3 = hVar2;
                    z14 = z12;
                    s12 = s11;
                }
                c1105p0V = c1086gP.V();
                if (c1105p0V != null) {
                    final androidx.compose.foundation.interaction.k kVar16 = kVar2;
                    c1105p0V.f13109d = new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.material.SwitchKt$Switch$4
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        /* JADX WARN: Multi-variable type inference failed */
                        {
                            super(2);
                        }

                        @Override // Ia.p
                        public final p293xa.r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                            num.intValue();
                            SwitchKt.a(z10, lVar, hVar3, z14, kVar16, s12, interfaceC1084f2, L4.b.l(i10 | 1), i11);
                            return p293xa.r.f47939a;
                        }
                    };
                }
            }
            i12 |= 24576;
            kVar2 = kVar;
            if ((i10 & 196608) == 0) {
                s11 = s10;
                if ((i11 & 32) == 0) {
                    i23 = 65536;
                } else {
                    i23 = 65536;
                }
                i12 |= i23;
            } else {
                s11 = s10;
            }
            i17 = i12;
            if ((i17 & 74899) != 74898) {
                z13 = true;
            } else {
                z13 = false;
            }
            if (c1086gP.C(i17 & 1, z13)) {
                c1086gP.r0();
                i18 = i10 & 1;
                hVar4 = androidx.compose.ui.h.a.f13984b;
                if (i18 != 0) {
                    if (i24 != 0) {
                        hVar3 = hVar4;
                    } else {
                        hVar3 = hVar2;
                    }
                    if (i13 != 0) {
                        z15 = true;
                    } else {
                        z15 = z12;
                    }
                    if (i15 != 0) {
                        kVar3 = null;
                    } else {
                        kVar3 = kVar2;
                    }
                    if ((i11 & 32) != 0) {
                        i19 = i17 & (-458753);
                        sA = T.a(0L, 0L, 0.0f, c1086gP, 1023);
                        kVar4 = kVar3;
                        z16 = z15;
                    } else {
                        kVar4 = kVar3;
                        i19 = i17;
                        z16 = z15;
                        sA = s11;
                    }
                } else {
                    if (i24 != 0) {
                        hVar3 = hVar4;
                    } else {
                        hVar3 = hVar2;
                    }
                    if (i13 != 0) {
                        z15 = true;
                    } else {
                        z15 = z12;
                    }
                    if (i15 != 0) {
                        kVar3 = null;
                    } else {
                        kVar3 = kVar2;
                    }
                    if ((i11 & 32) != 0) {
                        i19 = i17 & (-458753);
                        sA = T.a(0L, 0L, 0.0f, c1086gP, 1023);
                        kVar4 = kVar3;
                        z16 = z15;
                    } else {
                        kVar4 = kVar3;
                        i19 = i17;
                        z16 = z15;
                        sA = s11;
                    }
                }
                c1086gP.U();
                c0153a = InterfaceC1084f.a.f12980a;
                if (kVar4 == null) {
                    c1086gP.L(-1604939679);
                    objF5 = c1086gP.f();
                    if (objF5 == c0153a) {
                        objF5 = new androidx.compose.foundation.interaction.l();
                        c1086gP.E(objF5);
                    }
                    c1086gP.T(false);
                    kVar5 = (androidx.compose.foundation.interaction.k) objF5;
                } else {
                    c1086gP.L(779511094);
                    c1086gP.T(false);
                    kVar5 = kVar4;
                }
                O0 o112 = CompositionLocalsKt.f14847h;
                fT0 = ((p013b0.c) c1086gP.x(o112)).T0(f11828h);
                objF = c1086gP.f();
                if (objF == c0153a) {
                    objF = J0.f(Boolean.FALSE);
                    c1086gP.E(objF);
                }
                x10 = (X) objF;
                fT1 = ((p013b0.c) c1086gP.x(o112)).T0(f11831l);
                zG = c1086gP.g(fT0) | c1086gP.g(fT1);
                Object objF12 = c1086gP.f();
                obj = objF12;
                if (zG) {
                    Ia.l<C1045v<Boolean>, p293xa.r> lVar13 = new Ia.l<C1045v<Boolean>, p293xa.r>() { // from class: androidx.compose.material.SwitchKt$Switch$anchoredDraggableState$1$1
                        final /* synthetic */ float $minBound = 0.0f;

                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(1);
                        }

                        @Override // Ia.l
                        public final p293xa.r invoke(C1045v<Boolean> c1045v12) {
                            C1045v<Boolean> c1045v13 = c1045v12;
                            c1045v13.f12027a.put(Boolean.FALSE, Float.valueOf(this.$minBound));
                            c1045v13.f12027a.put(Boolean.TRUE, Float.valueOf(fT0));
                            return p293xa.r.f47939a;
                        }
                    };
                    C1045v<Boolean> c1045v12 = new C1045v<>();
                    lVar13.invoke(c1045v12);
                    F f111 = new F(c1045v12.f12027a);
                    Boolean boolValueOf18 = Boolean.valueOf(z10);
                    AnchoredDraggableState anchoredDraggableState13 = new AnchoredDraggableState(boolValueOf18, new Ia.l<Float, Float>() { // from class: androidx.compose.material.SwitchKt$Switch$anchoredDraggableState$1$2
                        @Override // Ia.l
                        public final Float invoke(Float f112) {
                            return Float.valueOf(f112.floatValue() * 0.7f);
                        }
                    }, new Ia.a<Float>() { // from class: androidx.compose.material.SwitchKt$Switch$anchoredDraggableState$1$3
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(0);
                        }

                        @Override // Ia.a
                        public final Float invoke() {
                            return Float.valueOf(fT1);
                        }
                    }, f11829i, AnchoredDraggableState.AnonymousClass2.f11681h);
                    anchoredDraggableState13.f11679m.setValue(f111);
                    anchoredDraggableState13.h(boolValueOf18);
                    c1086gP.E(anchoredDraggableState13);
                    obj = anchoredDraggableState13;
                } else {
                    Ia.l<C1045v<Boolean>, p293xa.r> lVar14 = new Ia.l<C1045v<Boolean>, p293xa.r>() { // from class: androidx.compose.material.SwitchKt$Switch$anchoredDraggableState$1$1
                        final /* synthetic */ float $minBound = 0.0f;

                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(1);
                        }

                        @Override // Ia.l
                        public final p293xa.r invoke(C1045v<Boolean> c1045v13) {
                            C1045v<Boolean> c1045v14 = c1045v13;
                            c1045v14.f12027a.put(Boolean.FALSE, Float.valueOf(this.$minBound));
                            c1045v14.f12027a.put(Boolean.TRUE, Float.valueOf(fT0));
                            return p293xa.r.f47939a;
                        }
                    };
                    C1045v<Boolean> c1045v13 = new C1045v<>();
                    lVar14.invoke(c1045v13);
                    F f112 = new F(c1045v13.f12027a);
                    Boolean boolValueOf19 = Boolean.valueOf(z10);
                    AnchoredDraggableState anchoredDraggableState14 = new AnchoredDraggableState(boolValueOf19, new Ia.l<Float, Float>() { // from class: androidx.compose.material.SwitchKt$Switch$anchoredDraggableState$1$2
                        @Override // Ia.l
                        public final Float invoke(Float f113) {
                            return Float.valueOf(f113.floatValue() * 0.7f);
                        }
                    }, new Ia.a<Float>() { // from class: androidx.compose.material.SwitchKt$Switch$anchoredDraggableState$1$3
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(0);
                        }

                        @Override // Ia.a
                        public final Float invoke() {
                            return Float.valueOf(fT1);
                        }
                    }, f11829i, AnchoredDraggableState.AnonymousClass2.f11681h);
                    anchoredDraggableState14.f11679m.setValue(f112);
                    anchoredDraggableState14.h(boolValueOf19);
                    c1086gP.E(anchoredDraggableState14);
                    obj = anchoredDraggableState14;
                }
                anchoredDraggableState = (AnchoredDraggableState) obj;
                int i211 = i19 >> 3;
                xI = J0.i(lVar, c1086gP);
                i20 = i19 & 14;
                xI2 = J0.i(Boolean.valueOf(z10), c1086gP);
                zK = c1086gP.K(anchoredDraggableState) | c1086gP.K(xI2) | c1086gP.K(xI);
                androidx.compose.foundation.interaction.k kVar17 = kVar4;
                objF2 = c1086gP.f();
                if (zK) {
                    objF2 = new SwitchKt$Switch$1$1(anchoredDraggableState, xI2, xI, x10, null);
                    c1086gP.E(objF2);
                } else {
                    objF2 = new SwitchKt$Switch$1$1(anchoredDraggableState, xI2, xI, x10, null);
                    c1086gP.E(objF2);
                }
                androidx.compose.runtime.E.d((Ia.p) objF2, c1086gP, anchoredDraggableState);
                Boolean boolValueOf110 = Boolean.valueOf(z10);
                Boolean bool7 = (Boolean) x10.getValue();
                bool7.getClass();
                if (i20 == 4) {
                    z17 = true;
                } else {
                    z17 = false;
                }
                zK2 = z17 | c1086gP.K(anchoredDraggableState);
                objF3 = c1086gP.f();
                if (zK2) {
                    objF3 = new SwitchKt$Switch$2$1(z10, anchoredDraggableState, null);
                    c1086gP.E(objF3);
                } else {
                    objF3 = new SwitchKt$Switch$2$1(z10, anchoredDraggableState, null);
                    c1086gP.E(objF3);
                }
                androidx.compose.runtime.E.e(boolValueOf110, bool7, (Ia.p) objF3, c1086gP);
                if (c1086gP.x(CompositionLocalsKt.f14852n) == LayoutDirection.f15718c) {
                    z18 = true;
                } else {
                    z18 = false;
                }
                if (lVar != null) {
                    i21 = 2;
                    hVarA = androidx.compose.foundation.selection.c.a(z10, kVar5, z16, new androidx.compose.ui.semantics.i(2), lVar);
                } else {
                    i21 = 2;
                    hVarA = hVar4;
                }
                if (lVar != null) {
                    O0 o113 = InteractiveComponentSizeKt.f11762a;
                    hVar4 = MinimumInteractiveModifier.f11774b;
                }
                androidx.compose.ui.h hVarI7 = hVar3.i(hVar4).i(hVarA);
                Orientation orientation7 = Orientation.f9957b;
                if (z16) {
                    z19 = false;
                } else {
                    z19 = false;
                }
                androidx.compose.ui.h hVarJ7 = W.j(f11826f, f11827g, PaddingKt.f(W.t(DraggableKt.a(hVarI7, anchoredDraggableState.f11673f, Orientation.f9958c, z19, kVar5, false, new AnchoredDraggableKt$anchoredDraggable$1(anchoredDraggableState, null), z18, 32), androidx.compose.ui.d.a.f13339e, i21), f11825e));
                androidx.compose.ui.layout.E eD7 = BoxKt.d(androidx.compose.ui.d.a.f13335a, false);
                i22 = c1086gP.f12996P;
                InterfaceC1089h0 interfaceC1089h0P7 = c1086gP.P();
                androidx.compose.ui.h hVarC7 = ComposedModifierKt.c(c1086gP, hVarJ7);
                ComposeUiNode.f14331c0.getClass();
                aVar = ComposeUiNode.Companion.f14333b;
                c1086gP.r();
                if (c1086gP.f12995O) {
                    c1086gP.v(aVar);
                } else {
                    c1086gP.A();
                }
                R0.a(ComposeUiNode.Companion.f14337f, c1086gP, eD7);
                R0.a(ComposeUiNode.Companion.f14336e, c1086gP, interfaceC1089h0P7);
                pVar = ComposeUiNode.Companion.f14338g;
                if (c1086gP.f12995O) {
                    J4.i.d(i22, c1086gP, i22, pVar);
                } else {
                    J4.i.d(i22, c1086gP, i22, pVar);
                }
                R0.a(ComposeUiNode.Companion.f14335d, c1086gP, hVarC7);
                C0949i c0949i7 = C0949i.f10304a;
                boolean zBooleanValue7 = ((Boolean) anchoredDraggableState.f11675h.getValue()).booleanValue();
                zK3 = c1086gP.K(anchoredDraggableState);
                objF4 = c1086gP.f();
                if (zK3) {
                    objF4 = new Ia.a<Float>() { // from class: androidx.compose.material.SwitchKt$Switch$3$1$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(0);
                        }

                        @Override // Ia.a
                        public final Float invoke() {
                            return Float.valueOf(anchoredDraggableState.e());
                        }
                    };
                    c1086gP.E(objF4);
                } else {
                    objF4 = new Ia.a<Float>() { // from class: androidx.compose.material.SwitchKt$Switch$3$1$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(0);
                        }

                        @Override // Ia.a
                        public final Float invoke() {
                            return Float.valueOf(anchoredDraggableState.e());
                        }
                    };
                    c1086gP.E(objF4);
                }
                b(c0949i7, zBooleanValue7, z16, sA, (Ia.a) objF4, kVar5, c1086gP, (i211 & 896) | 6 | ((i19 >> 6) & 7168));
                c1086gP.T(true);
                kVar2 = kVar17;
                z14 = z16;
                s12 = sA;
            } else {
                c1086gP.w();
                hVar3 = hVar2;
                z14 = z12;
                s12 = s11;
            }
            c1105p0V = c1086gP.V();
            if (c1105p0V != null) {
                final androidx.compose.foundation.interaction.k kVar18 = kVar2;
                c1105p0V.f13109d = new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.material.SwitchKt$Switch$4
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(2);
                    }

                    @Override // Ia.p
                    public final p293xa.r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                        num.intValue();
                        SwitchKt.a(z10, lVar, hVar3, z14, kVar18, s12, interfaceC1084f2, L4.b.l(i10 | 1), i11);
                        return p293xa.r.f47939a;
                    }
                };
            }
        }
        i12 |= 3072;
        z12 = z11;
        i15 = i11 & 16;
        if (i15 != 0) {
            if ((i10 & 24576) == 0) {
                kVar2 = kVar;
                if (c1086gP.K(kVar2)) {
                    i16 = 16384;
                } else {
                    i16 = 8192;
                }
                i12 |= i16;
            }
            if ((i10 & 196608) == 0) {
                s11 = s10;
                if ((i11 & 32) == 0) {
                    i23 = 65536;
                } else {
                    i23 = 65536;
                }
                i12 |= i23;
            } else {
                s11 = s10;
            }
            i17 = i12;
            if ((i17 & 74899) != 74898) {
                z13 = true;
            } else {
                z13 = false;
            }
            if (c1086gP.C(i17 & 1, z13)) {
                c1086gP.r0();
                i18 = i10 & 1;
                hVar4 = androidx.compose.ui.h.a.f13984b;
                if (i18 != 0) {
                    if (i24 != 0) {
                        hVar3 = hVar4;
                    } else {
                        hVar3 = hVar2;
                    }
                    if (i13 != 0) {
                        z15 = true;
                    } else {
                        z15 = z12;
                    }
                    if (i15 != 0) {
                        kVar3 = null;
                    } else {
                        kVar3 = kVar2;
                    }
                    if ((i11 & 32) != 0) {
                        i19 = i17 & (-458753);
                        sA = T.a(0L, 0L, 0.0f, c1086gP, 1023);
                        kVar4 = kVar3;
                        z16 = z15;
                    } else {
                        kVar4 = kVar3;
                        i19 = i17;
                        z16 = z15;
                        sA = s11;
                    }
                } else {
                    if (i24 != 0) {
                        hVar3 = hVar4;
                    } else {
                        hVar3 = hVar2;
                    }
                    if (i13 != 0) {
                        z15 = true;
                    } else {
                        z15 = z12;
                    }
                    if (i15 != 0) {
                        kVar3 = null;
                    } else {
                        kVar3 = kVar2;
                    }
                    if ((i11 & 32) != 0) {
                        i19 = i17 & (-458753);
                        sA = T.a(0L, 0L, 0.0f, c1086gP, 1023);
                        kVar4 = kVar3;
                        z16 = z15;
                    } else {
                        kVar4 = kVar3;
                        i19 = i17;
                        z16 = z15;
                        sA = s11;
                    }
                }
                c1086gP.U();
                c0153a = InterfaceC1084f.a.f12980a;
                if (kVar4 == null) {
                    c1086gP.L(-1604939679);
                    objF5 = c1086gP.f();
                    if (objF5 == c0153a) {
                        objF5 = new androidx.compose.foundation.interaction.l();
                        c1086gP.E(objF5);
                    }
                    c1086gP.T(false);
                    kVar5 = (androidx.compose.foundation.interaction.k) objF5;
                } else {
                    c1086gP.L(779511094);
                    c1086gP.T(false);
                    kVar5 = kVar4;
                }
                O0 o114 = CompositionLocalsKt.f14847h;
                fT0 = ((p013b0.c) c1086gP.x(o114)).T0(f11828h);
                objF = c1086gP.f();
                if (objF == c0153a) {
                    objF = J0.f(Boolean.FALSE);
                    c1086gP.E(objF);
                }
                x10 = (X) objF;
                fT1 = ((p013b0.c) c1086gP.x(o114)).T0(f11831l);
                zG = c1086gP.g(fT0) | c1086gP.g(fT1);
                Object objF13 = c1086gP.f();
                obj = objF13;
                if (zG) {
                    Ia.l<C1045v<Boolean>, p293xa.r> lVar15 = new Ia.l<C1045v<Boolean>, p293xa.r>() { // from class: androidx.compose.material.SwitchKt$Switch$anchoredDraggableState$1$1
                        final /* synthetic */ float $minBound = 0.0f;

                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(1);
                        }

                        @Override // Ia.l
                        public final p293xa.r invoke(C1045v<Boolean> c1045v14) {
                            C1045v<Boolean> c1045v15 = c1045v14;
                            c1045v15.f12027a.put(Boolean.FALSE, Float.valueOf(this.$minBound));
                            c1045v15.f12027a.put(Boolean.TRUE, Float.valueOf(fT0));
                            return p293xa.r.f47939a;
                        }
                    };
                    C1045v<Boolean> c1045v14 = new C1045v<>();
                    lVar15.invoke(c1045v14);
                    F f113 = new F(c1045v14.f12027a);
                    Boolean boolValueOf111 = Boolean.valueOf(z10);
                    AnchoredDraggableState anchoredDraggableState15 = new AnchoredDraggableState(boolValueOf111, new Ia.l<Float, Float>() { // from class: androidx.compose.material.SwitchKt$Switch$anchoredDraggableState$1$2
                        @Override // Ia.l
                        public final Float invoke(Float f114) {
                            return Float.valueOf(f114.floatValue() * 0.7f);
                        }
                    }, new Ia.a<Float>() { // from class: androidx.compose.material.SwitchKt$Switch$anchoredDraggableState$1$3
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(0);
                        }

                        @Override // Ia.a
                        public final Float invoke() {
                            return Float.valueOf(fT1);
                        }
                    }, f11829i, AnchoredDraggableState.AnonymousClass2.f11681h);
                    anchoredDraggableState15.f11679m.setValue(f113);
                    anchoredDraggableState15.h(boolValueOf111);
                    c1086gP.E(anchoredDraggableState15);
                    obj = anchoredDraggableState15;
                } else {
                    Ia.l<C1045v<Boolean>, p293xa.r> lVar16 = new Ia.l<C1045v<Boolean>, p293xa.r>() { // from class: androidx.compose.material.SwitchKt$Switch$anchoredDraggableState$1$1
                        final /* synthetic */ float $minBound = 0.0f;

                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(1);
                        }

                        @Override // Ia.l
                        public final p293xa.r invoke(C1045v<Boolean> c1045v15) {
                            C1045v<Boolean> c1045v16 = c1045v15;
                            c1045v16.f12027a.put(Boolean.FALSE, Float.valueOf(this.$minBound));
                            c1045v16.f12027a.put(Boolean.TRUE, Float.valueOf(fT0));
                            return p293xa.r.f47939a;
                        }
                    };
                    C1045v<Boolean> c1045v15 = new C1045v<>();
                    lVar16.invoke(c1045v15);
                    F f114 = new F(c1045v15.f12027a);
                    Boolean boolValueOf112 = Boolean.valueOf(z10);
                    AnchoredDraggableState anchoredDraggableState16 = new AnchoredDraggableState(boolValueOf112, new Ia.l<Float, Float>() { // from class: androidx.compose.material.SwitchKt$Switch$anchoredDraggableState$1$2
                        @Override // Ia.l
                        public final Float invoke(Float f115) {
                            return Float.valueOf(f115.floatValue() * 0.7f);
                        }
                    }, new Ia.a<Float>() { // from class: androidx.compose.material.SwitchKt$Switch$anchoredDraggableState$1$3
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(0);
                        }

                        @Override // Ia.a
                        public final Float invoke() {
                            return Float.valueOf(fT1);
                        }
                    }, f11829i, AnchoredDraggableState.AnonymousClass2.f11681h);
                    anchoredDraggableState16.f11679m.setValue(f114);
                    anchoredDraggableState16.h(boolValueOf112);
                    c1086gP.E(anchoredDraggableState16);
                    obj = anchoredDraggableState16;
                }
                anchoredDraggableState = (AnchoredDraggableState) obj;
                int i212 = i19 >> 3;
                xI = J0.i(lVar, c1086gP);
                i20 = i19 & 14;
                xI2 = J0.i(Boolean.valueOf(z10), c1086gP);
                zK = c1086gP.K(anchoredDraggableState) | c1086gP.K(xI2) | c1086gP.K(xI);
                androidx.compose.foundation.interaction.k kVar19 = kVar4;
                objF2 = c1086gP.f();
                if (zK) {
                    objF2 = new SwitchKt$Switch$1$1(anchoredDraggableState, xI2, xI, x10, null);
                    c1086gP.E(objF2);
                } else {
                    objF2 = new SwitchKt$Switch$1$1(anchoredDraggableState, xI2, xI, x10, null);
                    c1086gP.E(objF2);
                }
                androidx.compose.runtime.E.d((Ia.p) objF2, c1086gP, anchoredDraggableState);
                Boolean boolValueOf113 = Boolean.valueOf(z10);
                Boolean bool8 = (Boolean) x10.getValue();
                bool8.getClass();
                if (i20 == 4) {
                    z17 = true;
                } else {
                    z17 = false;
                }
                zK2 = z17 | c1086gP.K(anchoredDraggableState);
                objF3 = c1086gP.f();
                if (zK2) {
                    objF3 = new SwitchKt$Switch$2$1(z10, anchoredDraggableState, null);
                    c1086gP.E(objF3);
                } else {
                    objF3 = new SwitchKt$Switch$2$1(z10, anchoredDraggableState, null);
                    c1086gP.E(objF3);
                }
                androidx.compose.runtime.E.e(boolValueOf113, bool8, (Ia.p) objF3, c1086gP);
                if (c1086gP.x(CompositionLocalsKt.f14852n) == LayoutDirection.f15718c) {
                    z18 = true;
                } else {
                    z18 = false;
                }
                if (lVar != null) {
                    i21 = 2;
                    hVarA = androidx.compose.foundation.selection.c.a(z10, kVar5, z16, new androidx.compose.ui.semantics.i(2), lVar);
                } else {
                    i21 = 2;
                    hVarA = hVar4;
                }
                if (lVar != null) {
                    O0 o115 = InteractiveComponentSizeKt.f11762a;
                    hVar4 = MinimumInteractiveModifier.f11774b;
                }
                androidx.compose.ui.h hVarI8 = hVar3.i(hVar4).i(hVarA);
                Orientation orientation8 = Orientation.f9957b;
                if (z16) {
                    z19 = false;
                } else {
                    z19 = false;
                }
                androidx.compose.ui.h hVarJ8 = W.j(f11826f, f11827g, PaddingKt.f(W.t(DraggableKt.a(hVarI8, anchoredDraggableState.f11673f, Orientation.f9958c, z19, kVar5, false, new AnchoredDraggableKt$anchoredDraggable$1(anchoredDraggableState, null), z18, 32), androidx.compose.ui.d.a.f13339e, i21), f11825e));
                androidx.compose.ui.layout.E eD8 = BoxKt.d(androidx.compose.ui.d.a.f13335a, false);
                i22 = c1086gP.f12996P;
                InterfaceC1089h0 interfaceC1089h0P8 = c1086gP.P();
                androidx.compose.ui.h hVarC8 = ComposedModifierKt.c(c1086gP, hVarJ8);
                ComposeUiNode.f14331c0.getClass();
                aVar = ComposeUiNode.Companion.f14333b;
                c1086gP.r();
                if (c1086gP.f12995O) {
                    c1086gP.v(aVar);
                } else {
                    c1086gP.A();
                }
                R0.a(ComposeUiNode.Companion.f14337f, c1086gP, eD8);
                R0.a(ComposeUiNode.Companion.f14336e, c1086gP, interfaceC1089h0P8);
                pVar = ComposeUiNode.Companion.f14338g;
                if (c1086gP.f12995O) {
                    J4.i.d(i22, c1086gP, i22, pVar);
                } else {
                    J4.i.d(i22, c1086gP, i22, pVar);
                }
                R0.a(ComposeUiNode.Companion.f14335d, c1086gP, hVarC8);
                C0949i c0949i8 = C0949i.f10304a;
                boolean zBooleanValue8 = ((Boolean) anchoredDraggableState.f11675h.getValue()).booleanValue();
                zK3 = c1086gP.K(anchoredDraggableState);
                objF4 = c1086gP.f();
                if (zK3) {
                    objF4 = new Ia.a<Float>() { // from class: androidx.compose.material.SwitchKt$Switch$3$1$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(0);
                        }

                        @Override // Ia.a
                        public final Float invoke() {
                            return Float.valueOf(anchoredDraggableState.e());
                        }
                    };
                    c1086gP.E(objF4);
                } else {
                    objF4 = new Ia.a<Float>() { // from class: androidx.compose.material.SwitchKt$Switch$3$1$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(0);
                        }

                        @Override // Ia.a
                        public final Float invoke() {
                            return Float.valueOf(anchoredDraggableState.e());
                        }
                    };
                    c1086gP.E(objF4);
                }
                b(c0949i8, zBooleanValue8, z16, sA, (Ia.a) objF4, kVar5, c1086gP, (i212 & 896) | 6 | ((i19 >> 6) & 7168));
                c1086gP.T(true);
                kVar2 = kVar19;
                z14 = z16;
                s12 = sA;
            } else {
                c1086gP.w();
                hVar3 = hVar2;
                z14 = z12;
                s12 = s11;
            }
            c1105p0V = c1086gP.V();
            if (c1105p0V != null) {
                final androidx.compose.foundation.interaction.k kVar110 = kVar2;
                c1105p0V.f13109d = new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.material.SwitchKt$Switch$4
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(2);
                    }

                    @Override // Ia.p
                    public final p293xa.r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                        num.intValue();
                        SwitchKt.a(z10, lVar, hVar3, z14, kVar110, s12, interfaceC1084f2, L4.b.l(i10 | 1), i11);
                        return p293xa.r.f47939a;
                    }
                };
            }
        }
        i12 |= 24576;
        kVar2 = kVar;
        if ((i10 & 196608) == 0) {
            s11 = s10;
            if ((i11 & 32) == 0) {
                i23 = 65536;
            } else {
                i23 = 65536;
            }
            i12 |= i23;
        } else {
            s11 = s10;
        }
        i17 = i12;
        if ((i17 & 74899) != 74898) {
            z13 = true;
        } else {
            z13 = false;
        }
        if (c1086gP.C(i17 & 1, z13)) {
            c1086gP.r0();
            i18 = i10 & 1;
            hVar4 = androidx.compose.ui.h.a.f13984b;
            if (i18 != 0) {
                if (i24 != 0) {
                    hVar3 = hVar4;
                } else {
                    hVar3 = hVar2;
                }
                if (i13 != 0) {
                    z15 = true;
                } else {
                    z15 = z12;
                }
                if (i15 != 0) {
                    kVar3 = null;
                } else {
                    kVar3 = kVar2;
                }
                if ((i11 & 32) != 0) {
                    i19 = i17 & (-458753);
                    sA = T.a(0L, 0L, 0.0f, c1086gP, 1023);
                    kVar4 = kVar3;
                    z16 = z15;
                } else {
                    kVar4 = kVar3;
                    i19 = i17;
                    z16 = z15;
                    sA = s11;
                }
            } else {
                if (i24 != 0) {
                    hVar3 = hVar4;
                } else {
                    hVar3 = hVar2;
                }
                if (i13 != 0) {
                    z15 = true;
                } else {
                    z15 = z12;
                }
                if (i15 != 0) {
                    kVar3 = null;
                } else {
                    kVar3 = kVar2;
                }
                if ((i11 & 32) != 0) {
                    i19 = i17 & (-458753);
                    sA = T.a(0L, 0L, 0.0f, c1086gP, 1023);
                    kVar4 = kVar3;
                    z16 = z15;
                } else {
                    kVar4 = kVar3;
                    i19 = i17;
                    z16 = z15;
                    sA = s11;
                }
            }
            c1086gP.U();
            c0153a = InterfaceC1084f.a.f12980a;
            if (kVar4 == null) {
                c1086gP.L(-1604939679);
                objF5 = c1086gP.f();
                if (objF5 == c0153a) {
                    objF5 = new androidx.compose.foundation.interaction.l();
                    c1086gP.E(objF5);
                }
                c1086gP.T(false);
                kVar5 = (androidx.compose.foundation.interaction.k) objF5;
            } else {
                c1086gP.L(779511094);
                c1086gP.T(false);
                kVar5 = kVar4;
            }
            O0 o116 = CompositionLocalsKt.f14847h;
            fT0 = ((p013b0.c) c1086gP.x(o116)).T0(f11828h);
            objF = c1086gP.f();
            if (objF == c0153a) {
                objF = J0.f(Boolean.FALSE);
                c1086gP.E(objF);
            }
            x10 = (X) objF;
            fT1 = ((p013b0.c) c1086gP.x(o116)).T0(f11831l);
            zG = c1086gP.g(fT0) | c1086gP.g(fT1);
            Object objF14 = c1086gP.f();
            obj = objF14;
            if (zG) {
                Ia.l<C1045v<Boolean>, p293xa.r> lVar17 = new Ia.l<C1045v<Boolean>, p293xa.r>() { // from class: androidx.compose.material.SwitchKt$Switch$anchoredDraggableState$1$1
                    final /* synthetic */ float $minBound = 0.0f;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(1);
                    }

                    @Override // Ia.l
                    public final p293xa.r invoke(C1045v<Boolean> c1045v16) {
                        C1045v<Boolean> c1045v17 = c1045v16;
                        c1045v17.f12027a.put(Boolean.FALSE, Float.valueOf(this.$minBound));
                        c1045v17.f12027a.put(Boolean.TRUE, Float.valueOf(fT0));
                        return p293xa.r.f47939a;
                    }
                };
                C1045v<Boolean> c1045v16 = new C1045v<>();
                lVar17.invoke(c1045v16);
                F f115 = new F(c1045v16.f12027a);
                Boolean boolValueOf114 = Boolean.valueOf(z10);
                AnchoredDraggableState anchoredDraggableState17 = new AnchoredDraggableState(boolValueOf114, new Ia.l<Float, Float>() { // from class: androidx.compose.material.SwitchKt$Switch$anchoredDraggableState$1$2
                    @Override // Ia.l
                    public final Float invoke(Float f116) {
                        return Float.valueOf(f116.floatValue() * 0.7f);
                    }
                }, new Ia.a<Float>() { // from class: androidx.compose.material.SwitchKt$Switch$anchoredDraggableState$1$3
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(0);
                    }

                    @Override // Ia.a
                    public final Float invoke() {
                        return Float.valueOf(fT1);
                    }
                }, f11829i, AnchoredDraggableState.AnonymousClass2.f11681h);
                anchoredDraggableState17.f11679m.setValue(f115);
                anchoredDraggableState17.h(boolValueOf114);
                c1086gP.E(anchoredDraggableState17);
                obj = anchoredDraggableState17;
            } else {
                Ia.l<C1045v<Boolean>, p293xa.r> lVar18 = new Ia.l<C1045v<Boolean>, p293xa.r>() { // from class: androidx.compose.material.SwitchKt$Switch$anchoredDraggableState$1$1
                    final /* synthetic */ float $minBound = 0.0f;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(1);
                    }

                    @Override // Ia.l
                    public final p293xa.r invoke(C1045v<Boolean> c1045v17) {
                        C1045v<Boolean> c1045v18 = c1045v17;
                        c1045v18.f12027a.put(Boolean.FALSE, Float.valueOf(this.$minBound));
                        c1045v18.f12027a.put(Boolean.TRUE, Float.valueOf(fT0));
                        return p293xa.r.f47939a;
                    }
                };
                C1045v<Boolean> c1045v17 = new C1045v<>();
                lVar18.invoke(c1045v17);
                F f116 = new F(c1045v17.f12027a);
                Boolean boolValueOf115 = Boolean.valueOf(z10);
                AnchoredDraggableState anchoredDraggableState18 = new AnchoredDraggableState(boolValueOf115, new Ia.l<Float, Float>() { // from class: androidx.compose.material.SwitchKt$Switch$anchoredDraggableState$1$2
                    @Override // Ia.l
                    public final Float invoke(Float f117) {
                        return Float.valueOf(f117.floatValue() * 0.7f);
                    }
                }, new Ia.a<Float>() { // from class: androidx.compose.material.SwitchKt$Switch$anchoredDraggableState$1$3
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(0);
                    }

                    @Override // Ia.a
                    public final Float invoke() {
                        return Float.valueOf(fT1);
                    }
                }, f11829i, AnchoredDraggableState.AnonymousClass2.f11681h);
                anchoredDraggableState18.f11679m.setValue(f116);
                anchoredDraggableState18.h(boolValueOf115);
                c1086gP.E(anchoredDraggableState18);
                obj = anchoredDraggableState18;
            }
            anchoredDraggableState = (AnchoredDraggableState) obj;
            int i213 = i19 >> 3;
            xI = J0.i(lVar, c1086gP);
            i20 = i19 & 14;
            xI2 = J0.i(Boolean.valueOf(z10), c1086gP);
            zK = c1086gP.K(anchoredDraggableState) | c1086gP.K(xI2) | c1086gP.K(xI);
            androidx.compose.foundation.interaction.k kVar111 = kVar4;
            objF2 = c1086gP.f();
            if (zK) {
                objF2 = new SwitchKt$Switch$1$1(anchoredDraggableState, xI2, xI, x10, null);
                c1086gP.E(objF2);
            } else {
                objF2 = new SwitchKt$Switch$1$1(anchoredDraggableState, xI2, xI, x10, null);
                c1086gP.E(objF2);
            }
            androidx.compose.runtime.E.d((Ia.p) objF2, c1086gP, anchoredDraggableState);
            Boolean boolValueOf116 = Boolean.valueOf(z10);
            Boolean bool9 = (Boolean) x10.getValue();
            bool9.getClass();
            if (i20 == 4) {
                z17 = true;
            } else {
                z17 = false;
            }
            zK2 = z17 | c1086gP.K(anchoredDraggableState);
            objF3 = c1086gP.f();
            if (zK2) {
                objF3 = new SwitchKt$Switch$2$1(z10, anchoredDraggableState, null);
                c1086gP.E(objF3);
            } else {
                objF3 = new SwitchKt$Switch$2$1(z10, anchoredDraggableState, null);
                c1086gP.E(objF3);
            }
            androidx.compose.runtime.E.e(boolValueOf116, bool9, (Ia.p) objF3, c1086gP);
            if (c1086gP.x(CompositionLocalsKt.f14852n) == LayoutDirection.f15718c) {
                z18 = true;
            } else {
                z18 = false;
            }
            if (lVar != null) {
                i21 = 2;
                hVarA = androidx.compose.foundation.selection.c.a(z10, kVar5, z16, new androidx.compose.ui.semantics.i(2), lVar);
            } else {
                i21 = 2;
                hVarA = hVar4;
            }
            if (lVar != null) {
                O0 o117 = InteractiveComponentSizeKt.f11762a;
                hVar4 = MinimumInteractiveModifier.f11774b;
            }
            androidx.compose.ui.h hVarI9 = hVar3.i(hVar4).i(hVarA);
            Orientation orientation9 = Orientation.f9957b;
            if (z16) {
                z19 = false;
            } else {
                z19 = false;
            }
            androidx.compose.ui.h hVarJ9 = W.j(f11826f, f11827g, PaddingKt.f(W.t(DraggableKt.a(hVarI9, anchoredDraggableState.f11673f, Orientation.f9958c, z19, kVar5, false, new AnchoredDraggableKt$anchoredDraggable$1(anchoredDraggableState, null), z18, 32), androidx.compose.ui.d.a.f13339e, i21), f11825e));
            androidx.compose.ui.layout.E eD9 = BoxKt.d(androidx.compose.ui.d.a.f13335a, false);
            i22 = c1086gP.f12996P;
            InterfaceC1089h0 interfaceC1089h0P9 = c1086gP.P();
            androidx.compose.ui.h hVarC9 = ComposedModifierKt.c(c1086gP, hVarJ9);
            ComposeUiNode.f14331c0.getClass();
            aVar = ComposeUiNode.Companion.f14333b;
            c1086gP.r();
            if (c1086gP.f12995O) {
                c1086gP.v(aVar);
            } else {
                c1086gP.A();
            }
            R0.a(ComposeUiNode.Companion.f14337f, c1086gP, eD9);
            R0.a(ComposeUiNode.Companion.f14336e, c1086gP, interfaceC1089h0P9);
            pVar = ComposeUiNode.Companion.f14338g;
            if (c1086gP.f12995O) {
                J4.i.d(i22, c1086gP, i22, pVar);
            } else {
                J4.i.d(i22, c1086gP, i22, pVar);
            }
            R0.a(ComposeUiNode.Companion.f14335d, c1086gP, hVarC9);
            C0949i c0949i9 = C0949i.f10304a;
            boolean zBooleanValue9 = ((Boolean) anchoredDraggableState.f11675h.getValue()).booleanValue();
            zK3 = c1086gP.K(anchoredDraggableState);
            objF4 = c1086gP.f();
            if (zK3) {
                objF4 = new Ia.a<Float>() { // from class: androidx.compose.material.SwitchKt$Switch$3$1$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(0);
                    }

                    @Override // Ia.a
                    public final Float invoke() {
                        return Float.valueOf(anchoredDraggableState.e());
                    }
                };
                c1086gP.E(objF4);
            } else {
                objF4 = new Ia.a<Float>() { // from class: androidx.compose.material.SwitchKt$Switch$3$1$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(0);
                    }

                    @Override // Ia.a
                    public final Float invoke() {
                        return Float.valueOf(anchoredDraggableState.e());
                    }
                };
                c1086gP.E(objF4);
            }
            b(c0949i9, zBooleanValue9, z16, sA, (Ia.a) objF4, kVar5, c1086gP, (i213 & 896) | 6 | ((i19 >> 6) & 7168));
            c1086gP.T(true);
            kVar2 = kVar111;
            z14 = z16;
            s12 = sA;
        } else {
            c1086gP.w();
            hVar3 = hVar2;
            z14 = z12;
            s12 = s11;
        }
        c1105p0V = c1086gP.V();
        if (c1105p0V != null) {
            final androidx.compose.foundation.interaction.k kVar112 = kVar2;
            c1105p0V.f13109d = new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.material.SwitchKt$Switch$4
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(2);
                }

                @Override // Ia.p
                public final p293xa.r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                    num.intValue();
                    SwitchKt.a(z10, lVar, hVar3, z14, kVar112, s12, interfaceC1084f2, L4.b.l(i10 | 1), i11);
                    return p293xa.r.f47939a;
                }
            };
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void b(final InterfaceC0948h interfaceC0948h, final boolean z10, final boolean z11, final S s10, final Ia.a<Float> aVar, final androidx.compose.foundation.interaction.j jVar, InterfaceC1084f interfaceC1084f, final int i10) {
        int i11;
        boolean z12;
        long jA;
        C1086g c1086gP = interfaceC1084f.p(70908914);
        if ((i10 & 6) == 0) {
            i11 = (c1086gP.K(interfaceC0948h) ? 4 : 2) | i10;
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
            i11 |= c1086gP.K(s10) ? 2048 : 1024;
        }
        if ((i10 & 24576) == 0) {
            i11 |= c1086gP.k(aVar) ? 16384 : 8192;
        }
        if ((196608 & i10) == 0) {
            i11 |= c1086gP.K(jVar) ? 131072 : 65536;
        }
        int i12 = i11;
        if (c1086gP.C(i12 & 1, (i12 & 74899) != 74898)) {
            Object objF = c1086gP.f();
            InterfaceC1084f.a.C0153a c0153a = InterfaceC1084f.a.f12980a;
            if (objF == c0153a) {
                objF = new SnapshotStateList();
                c1086gP.E(objF);
            }
            SnapshotStateList snapshotStateList = (SnapshotStateList) objF;
            boolean z13 = (i12 & 458752) == 131072;
            Object objF2 = c1086gP.f();
            if (z13 || objF2 == c0153a) {
                objF2 = new SwitchKt$SwitchImpl$1$1(jVar, snapshotStateList, null);
                c1086gP.E(objF2);
            }
            androidx.compose.runtime.E.d((Ia.p) objF2, c1086gP, jVar);
            float f10 = !snapshotStateList.isEmpty() ? f11830k : j;
            final X xB = s10.b(z11, z10, c1086gP);
            androidx.compose.ui.h.a aVar2 = androidx.compose.ui.h.a.f13984b;
            androidx.compose.ui.h hVarI = interfaceC0948h.f(aVar2, androidx.compose.ui.d.a.f13339e).i(W.f10226c);
            boolean zK = c1086gP.K(xB);
            Object objF3 = c1086gP.f();
            if (zK || objF3 == c0153a) {
                objF3 = new Ia.l<J.e, p293xa.r>() { // from class: androidx.compose.material.SwitchKt$SwitchImpl$2$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(1);
                    }

                    @Override // Ia.l
                    public final p293xa.r invoke(J.e eVar) {
                        J.e eVar2 = eVar;
                        N0<androidx.compose.ui.graphics.H> n10 = xB;
                        float f11 = SwitchKt.f11821a;
                        long j10 = n10.getValue().f13506a;
                        float fT0 = eVar2.T0(SwitchKt.f11821a);
                        float fT1 = eVar2.T0(SwitchKt.f11822b);
                        float f12 = fT1 / 2;
                        eVar2.Q0(j10, I.e.c(f12, I.d.e(eVar2.j1())), I.e.c(fT0 - f12, I.d.e(eVar2.j1())), fT1, (480 & 16) != 0 ? 0 : 1, null, 1.0f, null, (480 & 256) != 0 ? 3 : 0);
                        return p293xa.r.f47939a;
                    }
                };
                c1086gP.E(objF3);
            }
            CanvasKt.a(hVarI, (Ia.l) objF3, c1086gP, 0);
            X xA = s10.a(z11, z10, c1086gP);
            y yVar = (y) c1086gP.x(ElevationOverlayKt.f11743a);
            float f11 = ((p013b0.f) c1086gP.x(ElevationOverlayKt.f11744b)).f20481b + f10;
            if (!androidx.compose.ui.graphics.H.c(((androidx.compose.ui.graphics.H) xA.getValue()).f13506a, ((C1034j) c1086gP.x(ColorsKt.f11693a)).h()) || yVar == null) {
                z12 = false;
                c1086gP.L(1478584670);
                c1086gP.T(false);
                jA = ((androidx.compose.ui.graphics.H) xA.getValue()).f13506a;
            } else {
                c1086gP.L(1478495731);
                z12 = false;
                jA = yVar.a(((androidx.compose.ui.graphics.H) xA.getValue()).f13506a, f11, c1086gP, 0);
                c1086gP.T(false);
            }
            boolean z14 = z12;
            N0 n0A = androidx.compose.animation.x.a(jA, null, null, c1086gP, 0, 14);
            androidx.compose.ui.h hVarF = interfaceC0948h.f(aVar2, androidx.compose.ui.d.a.f13338d);
            boolean z15 = (i12 & 57344) != 16384 ? z14 : true;
            Object objF4 = c1086gP.f();
            if (z15 || objF4 == c0153a) {
                objF4 = new Ia.l<p013b0.c, p013b0.j>() { // from class: androidx.compose.material.SwitchKt$SwitchImpl$3$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(1);
                    }

                    @Override // Ia.l
                    public final p013b0.j invoke(p013b0.c cVar) {
                        return new p013b0.j(Cb.a.a(Ka.a.b(aVar.invoke().floatValue()), 0));
                    }
                };
                c1086gP.E(objF4);
            }
            androidx.compose.ui.h hVarI2 = W.i(IndicationKt.a(OffsetKt.a(hVarF, (Ia.l) objF4), jVar, RippleKt.a(f11824d, 4, 0L)), f11823c);
            p270w.f fVar = p270w.g.f47680a;
            Lb.a.a(c1086gP, C0932d.b(P3.d.v(hVarI2, f10, fVar, 0L, 0L, 24), ((androidx.compose.ui.graphics.H) n0A.getValue()).f13506a, fVar));
        } else {
            c1086gP.w();
        }
        C1105p0 c1105p0V = c1086gP.V();
        if (c1105p0V != null) {
            c1105p0V.f13109d = new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.material.SwitchKt$SwitchImpl$4
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // Ia.p
                public final p293xa.r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                    num.intValue();
                    SwitchKt.b(interfaceC0948h, z10, z11, s10, aVar, jVar, interfaceC1084f2, L4.b.l(i10 | 1));
                    return p293xa.r.f47939a;
                }
            };
        }
    }
}
