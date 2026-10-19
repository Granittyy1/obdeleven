package androidx.compose.ui.window;

import Ia.p;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import androidx.compose.runtime.A;
import androidx.compose.runtime.B;
import androidx.compose.runtime.C;
import androidx.compose.runtime.C1086g;
import androidx.compose.runtime.C1105p0;
import androidx.compose.runtime.CompositionLocalKt;
import androidx.compose.runtime.E;
import androidx.compose.runtime.InterfaceC1084f;
import androidx.compose.runtime.InterfaceC1089h0;
import androidx.compose.runtime.J0;
import androidx.compose.runtime.N0;
import androidx.compose.runtime.R0;
import androidx.compose.runtime.X;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.layout.D;
import androidx.compose.ui.layout.F;
import androidx.compose.ui.layout.H;
import androidx.compose.ui.layout.InterfaceC1170p;
import androidx.compose.ui.layout.O;
import androidx.compose.ui.layout.T;
import androidx.compose.ui.layout.Y;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.semantics.SemanticsProperties;
import androidx.compose.ui.semantics.t;
import androidx.compose.ui.semantics.v;
import androidx.compose.ui.semantics.w;
import androidx.compose.ui.unit.LayoutDirection;
import java.util.List;
import java.util.UUID;
import kotlin.collections.y;
import me.zhanghai.android.materialprogressbar.R;
import p293xa.r;

/* JADX INFO: compiled from: AndroidPopup.android.kt */
/* JADX INFO: loaded from: classes.dex */
public final class AndroidPopup_androidKt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final C f15783a = CompositionLocalKt.c(new Ia.a<String>() { // from class: androidx.compose.ui.window.AndroidPopup_androidKt$LocalPopupTestTag$1
        @Override // Ia.a
        public final /* bridge */ /* synthetic */ String invoke() {
            return "DEFAULT_TEST_TAG";
        }
    });

    /* JADX WARN: Code duplicated, block: B:101:0x01fc A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:102:0x01fe  */
    /* JADX WARN: Code duplicated, block: B:105:0x021b A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:106:0x021d  */
    /* JADX WARN: Code duplicated, block: B:109:0x023f  */
    /* JADX WARN: Code duplicated, block: B:110:0x0243  */
    /* JADX WARN: Code duplicated, block: B:113:0x0256  */
    /* JADX WARN: Code duplicated, block: B:115:0x0264  */
    /* JADX WARN: Code duplicated, block: B:117:0x0275  */
    /* JADX WARN: Code duplicated, block: B:120:0x027f  */
    /* JADX WARN: Code duplicated, block: B:122:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:26:0x0045  */
    /* JADX WARN: Code duplicated, block: B:28:0x004a  */
    /* JADX WARN: Code duplicated, block: B:30:0x004e  */
    /* JADX WARN: Code duplicated, block: B:32:0x0056  */
    /* JADX WARN: Code duplicated, block: B:33:0x0059  */
    /* JADX WARN: Code duplicated, block: B:37:0x0060  */
    /* JADX WARN: Code duplicated, block: B:39:0x0064  */
    /* JADX WARN: Code duplicated, block: B:41:0x0068  */
    /* JADX WARN: Code duplicated, block: B:43:0x006e  */
    /* JADX WARN: Code duplicated, block: B:44:0x0071  */
    /* JADX WARN: Code duplicated, block: B:48:0x007d  */
    /* JADX WARN: Code duplicated, block: B:49:0x007f  */
    /* JADX WARN: Code duplicated, block: B:52:0x0088  */
    /* JADX WARN: Code duplicated, block: B:54:0x008b  */
    /* JADX WARN: Code duplicated, block: B:55:0x008e  */
    /* JADX WARN: Code duplicated, block: B:57:0x0092  */
    /* JADX WARN: Code duplicated, block: B:58:0x009c  */
    /* JADX WARN: Code duplicated, block: B:61:0x00fb  */
    /* JADX WARN: Code duplicated, block: B:62:0x0126  */
    /* JADX WARN: Code duplicated, block: B:65:0x0133  */
    /* JADX WARN: Code duplicated, block: B:66:0x0135  */
    /* JADX WARN: Code duplicated, block: B:69:0x013e  */
    /* JADX WARN: Code duplicated, block: B:70:0x0140  */
    /* JADX WARN: Code duplicated, block: B:73:0x0157 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:74:0x0159  */
    /* JADX WARN: Code duplicated, block: B:77:0x017a  */
    /* JADX WARN: Code duplicated, block: B:78:0x017c  */
    /* JADX WARN: Code duplicated, block: B:81:0x0183  */
    /* JADX WARN: Code duplicated, block: B:82:0x0185  */
    /* JADX WARN: Code duplicated, block: B:85:0x0198 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:86:0x019a  */
    /* JADX WARN: Code duplicated, block: B:89:0x01bc  */
    /* JADX WARN: Code duplicated, block: B:90:0x01be  */
    /* JADX WARN: Code duplicated, block: B:93:0x01c7 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:94:0x01c9  */
    /* JADX WARN: Code duplicated, block: B:97:0x01e0 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:98:0x01e2  */
    public static final void a(final m mVar, Ia.a<r> aVar, n nVar, final p<? super InterfaceC1084f, ? super Integer, r> pVar, InterfaceC1084f interfaceC1084f, final int i10, final int i11) {
        int i12;
        final Ia.a<r> aVar2;
        int i13;
        n nVar2;
        int i14;
        int i15;
        int i16;
        boolean z10;
        final n nVar3;
        C1105p0 c1105p0V;
        Ia.a<r> aVar3;
        n nVar4;
        View view;
        p013b0.c cVar;
        final String str;
        final LayoutDirection layoutDirection;
        C1086g.b bVarG;
        final X xI;
        UUID uuid;
        Object objF;
        InterfaceC1084f.a.C0153a c0153a;
        final PopupLayout popupLayout;
        int i17;
        boolean z11;
        int i18;
        boolean z12;
        boolean zK;
        Object objF2;
        boolean z13;
        boolean z14;
        boolean zK2;
        Object objF3;
        boolean z15;
        boolean z16;
        Object objF4;
        boolean zK3;
        Object objF5;
        boolean zK4;
        Object objF6;
        boolean zK5;
        Object objF7;
        int i19;
        Ia.a<ComposeUiNode> aVar4;
        p<ComposeUiNode, Integer, r> pVar2;
        C1086g c1086gP = interfaceC1084f.p(-830247068);
        if ((i11 & 1) != 0) {
            i12 = i10 | 6;
        } else if ((i10 & 6) == 0) {
            i12 = (c1086gP.K(mVar) ? 4 : 2) | i10;
        } else {
            i12 = i10;
        }
        int i20 = i11 & 2;
        if (i20 == 0) {
            if ((i10 & 48) == 0) {
                aVar2 = aVar;
                i12 |= c1086gP.k(aVar2) ? 32 : 16;
            }
            i13 = i11 & 4;
            if (i13 != 0) {
                if ((i10 & 384) == 0) {
                    nVar2 = nVar;
                    if (c1086gP.K(nVar2)) {
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
                i16 = i12;
                if ((i16 & 1171) != 1170) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (c1086gP.C(i16 & 1, z10)) {
                    if (i20 != 0) {
                        aVar3 = null;
                    } else {
                        aVar3 = aVar2;
                    }
                    if (i13 != 0) {
                        nVar4 = new n(15, false);
                    } else {
                        nVar4 = nVar2;
                    }
                    view = (View) c1086gP.x(AndroidCompositionLocals_androidKt.f14797f);
                    cVar = (p013b0.c) c1086gP.x(CompositionLocalsKt.f14847h);
                    str = (String) c1086gP.x(f15783a);
                    layoutDirection = (LayoutDirection) c1086gP.x(CompositionLocalsKt.f14852n);
                    bVarG = c1086gP.G();
                    xI = J0.i(pVar, c1086gP);
                    uuid = (UUID) androidx.compose.runtime.saveable.b.c(new Object[0], null, null, new Ia.a<UUID>() { // from class: androidx.compose.ui.window.AndroidPopup_androidKt$Popup$popupId$1
                        @Override // Ia.a
                        public final UUID invoke() {
                            return UUID.randomUUID();
                        }
                    }, c1086gP, 3072, 6);
                    objF = c1086gP.f();
                    c0153a = InterfaceC1084f.a.f12980a;
                    if (objF == c0153a) {
                        final PopupLayout popupLayout2 = new PopupLayout(aVar3, nVar4, str, view, cVar, mVar, uuid);
                        popupLayout2.c(bVarG, new ComposableLambdaImpl(true, 1302892335, new p<InterfaceC1084f, Integer, r>() { // from class: androidx.compose.ui.window.AndroidPopup_androidKt$Popup$popupLayout$1$1$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(2);
                            }

                            @Override // Ia.p
                            public final r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                                InterfaceC1084f interfaceC1084f3 = interfaceC1084f2;
                                int iIntValue = num.intValue();
                                if (interfaceC1084f3.C(iIntValue & 1, (iIntValue & 3) != 2)) {
                                    androidx.compose.ui.h hVarB = androidx.compose.ui.semantics.p.b(androidx.compose.ui.h.a.f13984b, false, new Ia.l<w, r>() { // from class: androidx.compose.ui.window.AndroidPopup_androidKt$Popup$popupLayout$1$1$1.1
                                        @Override // Ia.l
                                        public final r invoke(w wVar) {
                                            Oa.l<Object>[] lVarArr = t.f15251a;
                                            v<r> vVar = SemanticsProperties.f15167u;
                                            r rVar = r.f47939a;
                                            wVar.e(vVar, rVar);
                                            return rVar;
                                        }
                                    });
                                    boolean zK6 = interfaceC1084f3.k(popupLayout2);
                                    final PopupLayout popupLayout3 = popupLayout2;
                                    Object objF8 = interfaceC1084f3.f();
                                    if (zK6 || objF8 == InterfaceC1084f.a.f12980a) {
                                        objF8 = new Ia.l<p013b0.l, r>() { // from class: androidx.compose.ui.window.AndroidPopup_androidKt$Popup$popupLayout$1$1$1$2$1
                                            {
                                                super(1);
                                            }

                                            @Override // Ia.l
                                            public final r invoke(p013b0.l lVar) {
                                                popupLayout3.m7setPopupContentSizefhxjrPA(new p013b0.l(lVar.f20490a));
                                                popupLayout3.h();
                                                return r.f47939a;
                                            }
                                        };
                                        interfaceC1084f3.E(objF8);
                                    }
                                    androidx.compose.ui.h hVarC = Cb.a.c(T.a(hVarB, (Ia.l) objF8), popupLayout2.getCanCalculatePosition() ? 1.0f : 0.0f);
                                    N0<p<InterfaceC1084f, Integer, r>> n10 = xI;
                                    C c10 = AndroidPopup_androidKt.f15783a;
                                    p<InterfaceC1084f, Integer, r> value = n10.getValue();
                                    AndroidPopup_androidKt$SimpleStack$1 androidPopup_androidKt$SimpleStack$1 = AndroidPopup_androidKt$SimpleStack$1.f15791a;
                                    int iF = interfaceC1084f3.F();
                                    InterfaceC1089h0 interfaceC1089h0Z = interfaceC1084f3.z();
                                    androidx.compose.ui.h hVarC2 = ComposedModifierKt.c(interfaceC1084f3, hVarC);
                                    ComposeUiNode.f14331c0.getClass();
                                    Ia.a<ComposeUiNode> aVar5 = ComposeUiNode.Companion.f14333b;
                                    if (interfaceC1084f3.u() == null) {
                                        I.b.k();
                                        throw null;
                                    }
                                    interfaceC1084f3.r();
                                    if (interfaceC1084f3.m()) {
                                        interfaceC1084f3.v(aVar5);
                                    } else {
                                        interfaceC1084f3.A();
                                    }
                                    R0.a(ComposeUiNode.Companion.f14337f, interfaceC1084f3, androidPopup_androidKt$SimpleStack$1);
                                    R0.a(ComposeUiNode.Companion.f14336e, interfaceC1084f3, interfaceC1089h0Z);
                                    p<ComposeUiNode, Integer, r> pVar3 = ComposeUiNode.Companion.f14338g;
                                    if (interfaceC1084f3.m() || !kotlin.jvm.internal.i.a(interfaceC1084f3.f(), Integer.valueOf(iF))) {
                                        androidx.compose.animation.k.b(iF, interfaceC1084f3, iF, pVar3);
                                    }
                                    R0.a(ComposeUiNode.Companion.f14335d, interfaceC1084f3, hVarC2);
                                    androidx.compose.foundation.gestures.d.c(value, interfaceC1084f3, 0);
                                } else {
                                    interfaceC1084f3.w();
                                }
                                return r.f47939a;
                            }
                        }));
                        c1086gP.E(popupLayout2);
                        objF = popupLayout2;
                    }
                    popupLayout = (PopupLayout) objF;
                    boolean zK6 = c1086gP.k(popupLayout);
                    i17 = i16 & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle;
                    if (i17 == 32) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    boolean z17 = zK6 | z11;
                    i18 = i16 & 896;
                    if (i18 == 256) {
                        z12 = true;
                    } else {
                        z12 = false;
                    }
                    zK = z17 | z12 | c1086gP.K(str) | c1086gP.K(layoutDirection);
                    objF2 = c1086gP.f();
                    if (zK || objF2 == c0153a) {
                        final Ia.a<r> aVar5 = aVar3;
                        final n nVar5 = nVar4;
                        objF2 = new Ia.l<B, A>() { // from class: androidx.compose.ui.window.AndroidPopup_androidKt$Popup$2$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(1);
                            }

                            @Override // Ia.l
                            public final A invoke(B b10) {
                                PopupLayout popupLayout3 = popupLayout;
                                popupLayout3.f15807g.addView(popupLayout3, popupLayout3.f15808h);
                                popupLayout.d(aVar5, nVar5, str, layoutDirection);
                                return new b(popupLayout);
                            }
                        };
                        c1086gP.E(objF2);
                    }
                    E.a(popupLayout, (Ia.l) objF2, c1086gP);
                    boolean zK7 = c1086gP.k(popupLayout);
                    if (i17 == 32) {
                        z13 = true;
                    } else {
                        z13 = false;
                    }
                    boolean z18 = zK7 | z13;
                    if (i18 == 256) {
                        z14 = true;
                    } else {
                        z14 = false;
                    }
                    zK2 = z18 | z14 | c1086gP.K(str) | c1086gP.K(layoutDirection);
                    objF3 = c1086gP.f();
                    if (zK2 || objF3 == c0153a) {
                        final Ia.a<r> aVar6 = aVar3;
                        final n nVar6 = nVar4;
                        objF3 = new Ia.a<r>() { // from class: androidx.compose.ui.window.AndroidPopup_androidKt$Popup$3$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(0);
                            }

                            @Override // Ia.a
                            public final r invoke() {
                                popupLayout.d(aVar6, nVar6, str, layoutDirection);
                                return r.f47939a;
                            }
                        };
                        c1086gP.E(objF3);
                    }
                    c1086gP.l((Ia.a) objF3);
                    boolean zK8 = c1086gP.k(popupLayout);
                    if ((i16 & 14) == 4) {
                        z15 = true;
                    } else {
                        z15 = false;
                    }
                    z16 = zK8 | z15;
                    objF4 = c1086gP.f();
                    if (z16 || objF4 == c0153a) {
                        objF4 = new Ia.l<B, A>() { // from class: androidx.compose.ui.window.AndroidPopup_androidKt$Popup$4$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(1);
                            }

                            @Override // Ia.l
                            public final A invoke(B b10) {
                                popupLayout.setPositionProvider(mVar);
                                popupLayout.h();
                                return new c();
                            }
                        };
                        c1086gP.E(objF4);
                    }
                    E.a(mVar, (Ia.l) objF4, c1086gP);
                    zK3 = c1086gP.k(popupLayout);
                    objF5 = c1086gP.f();
                    if (zK3 || objF5 == c0153a) {
                        objF5 = new AndroidPopup_androidKt$Popup$5$1(popupLayout, null);
                        c1086gP.E(objF5);
                    }
                    E.d((p) objF5, c1086gP, popupLayout);
                    androidx.compose.ui.h.a aVar7 = androidx.compose.ui.h.a.f13984b;
                    zK4 = c1086gP.k(popupLayout);
                    objF6 = c1086gP.f();
                    if (zK4 || objF6 == c0153a) {
                        objF6 = new Ia.l<InterfaceC1170p, r>() { // from class: androidx.compose.ui.window.AndroidPopup_androidKt$Popup$7$1
                            {
                                super(1);
                            }

                            @Override // Ia.l
                            public final r invoke(InterfaceC1170p interfaceC1170p) {
                                InterfaceC1170p interfaceC1170pX = interfaceC1170p.X();
                                kotlin.jvm.internal.i.b(interfaceC1170pX);
                                popupLayout.f(interfaceC1170pX);
                                return r.f47939a;
                            }
                        };
                        c1086gP.E(objF6);
                    }
                    androidx.compose.ui.h hVarA = O.a(aVar7, (Ia.l) objF6);
                    zK5 = c1086gP.k(popupLayout) | c1086gP.K(layoutDirection);
                    objF7 = c1086gP.f();
                    if (zK5 || objF7 == c0153a) {
                        objF7 = new androidx.compose.ui.layout.E() { // from class: androidx.compose.ui.window.AndroidPopup_androidKt$Popup$8$1
                            @Override // androidx.compose.ui.layout.E
                            public final F g(H h8, List<? extends D> list, long j) {
                                popupLayout.setParentLayoutDirection(layoutDirection);
                                return h8.y1(0, 0, y.p(), new Ia.l<Y.a, r>() { // from class: androidx.compose.ui.window.AndroidPopup_androidKt$Popup$8$1.1
                                    @Override // Ia.l
                                    public final /* bridge */ /* synthetic */ r invoke(Y.a aVar8) {
                                        return r.f47939a;
                                    }
                                });
                            }
                        };
                        c1086gP.E(objF7);
                    }
                    androidx.compose.ui.layout.E e10 = (androidx.compose.ui.layout.E) objF7;
                    i19 = c1086gP.f12996P;
                    InterfaceC1089h0 interfaceC1089h0P = c1086gP.P();
                    androidx.compose.ui.h hVarC = ComposedModifierKt.c(c1086gP, hVarA);
                    ComposeUiNode.f14331c0.getClass();
                    aVar4 = ComposeUiNode.Companion.f14333b;
                    c1086gP.r();
                    if (c1086gP.f12995O) {
                        c1086gP.v(aVar4);
                    } else {
                        c1086gP.A();
                    }
                    R0.a(ComposeUiNode.Companion.f14337f, c1086gP, e10);
                    R0.a(ComposeUiNode.Companion.f14336e, c1086gP, interfaceC1089h0P);
                    pVar2 = ComposeUiNode.Companion.f14338g;
                    if (c1086gP.f12995O || !kotlin.jvm.internal.i.a(c1086gP.f(), Integer.valueOf(i19))) {
                        J4.i.d(i19, c1086gP, i19, pVar2);
                    }
                    R0.a(ComposeUiNode.Companion.f14335d, c1086gP, hVarC);
                    c1086gP.T(true);
                    aVar2 = aVar3;
                    nVar3 = nVar4;
                } else {
                    c1086gP.w();
                    nVar3 = nVar2;
                }
                c1105p0V = c1086gP.V();
                if (c1105p0V != null) {
                    c1105p0V.f13109d = new p<InterfaceC1084f, Integer, r>() { // from class: androidx.compose.ui.window.AndroidPopup_androidKt$Popup$9
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        /* JADX WARN: Multi-variable type inference failed */
                        {
                            super(2);
                        }

                        @Override // Ia.p
                        public final r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                            num.intValue();
                            AndroidPopup_androidKt.a(mVar, aVar2, nVar3, pVar, interfaceC1084f2, L4.b.l(i10 | 1), i11);
                            return r.f47939a;
                        }
                    };
                }
            }
            i12 |= 384;
            nVar2 = nVar;
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
            i16 = i12;
            if ((i16 & 1171) != 1170) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (c1086gP.C(i16 & 1, z10)) {
                if (i20 != 0) {
                    aVar3 = null;
                } else {
                    aVar3 = aVar2;
                }
                if (i13 != 0) {
                    nVar4 = new n(15, false);
                } else {
                    nVar4 = nVar2;
                }
                view = (View) c1086gP.x(AndroidCompositionLocals_androidKt.f14797f);
                cVar = (p013b0.c) c1086gP.x(CompositionLocalsKt.f14847h);
                str = (String) c1086gP.x(f15783a);
                layoutDirection = (LayoutDirection) c1086gP.x(CompositionLocalsKt.f14852n);
                bVarG = c1086gP.G();
                xI = J0.i(pVar, c1086gP);
                uuid = (UUID) androidx.compose.runtime.saveable.b.c(new Object[0], null, null, new Ia.a<UUID>() { // from class: androidx.compose.ui.window.AndroidPopup_androidKt$Popup$popupId$1
                    @Override // Ia.a
                    public final UUID invoke() {
                        return UUID.randomUUID();
                    }
                }, c1086gP, 3072, 6);
                objF = c1086gP.f();
                c0153a = InterfaceC1084f.a.f12980a;
                if (objF == c0153a) {
                    final PopupLayout popupLayout3 = new PopupLayout(aVar3, nVar4, str, view, cVar, mVar, uuid);
                    popupLayout3.c(bVarG, new ComposableLambdaImpl(true, 1302892335, new p<InterfaceC1084f, Integer, r>() { // from class: androidx.compose.ui.window.AndroidPopup_androidKt$Popup$popupLayout$1$1$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(2);
                        }

                        @Override // Ia.p
                        public final r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                            InterfaceC1084f interfaceC1084f3 = interfaceC1084f2;
                            int iIntValue = num.intValue();
                            if (interfaceC1084f3.C(iIntValue & 1, (iIntValue & 3) != 2)) {
                                androidx.compose.ui.h hVarB = androidx.compose.ui.semantics.p.b(androidx.compose.ui.h.a.f13984b, false, new Ia.l<w, r>() { // from class: androidx.compose.ui.window.AndroidPopup_androidKt$Popup$popupLayout$1$1$1.1
                                    @Override // Ia.l
                                    public final r invoke(w wVar) {
                                        Oa.l<Object>[] lVarArr = t.f15251a;
                                        v<r> vVar = SemanticsProperties.f15167u;
                                        r rVar = r.f47939a;
                                        wVar.e(vVar, rVar);
                                        return rVar;
                                    }
                                });
                                boolean zK9 = interfaceC1084f3.k(popupLayout3);
                                final PopupLayout popupLayout4 = popupLayout3;
                                Object objF8 = interfaceC1084f3.f();
                                if (zK9 || objF8 == InterfaceC1084f.a.f12980a) {
                                    objF8 = new Ia.l<p013b0.l, r>() { // from class: androidx.compose.ui.window.AndroidPopup_androidKt$Popup$popupLayout$1$1$1$2$1
                                        {
                                            super(1);
                                        }

                                        @Override // Ia.l
                                        public final r invoke(p013b0.l lVar) {
                                            popupLayout4.m7setPopupContentSizefhxjrPA(new p013b0.l(lVar.f20490a));
                                            popupLayout4.h();
                                            return r.f47939a;
                                        }
                                    };
                                    interfaceC1084f3.E(objF8);
                                }
                                androidx.compose.ui.h hVarC2 = Cb.a.c(T.a(hVarB, (Ia.l) objF8), popupLayout3.getCanCalculatePosition() ? 1.0f : 0.0f);
                                N0<p<InterfaceC1084f, Integer, r>> n10 = xI;
                                C c10 = AndroidPopup_androidKt.f15783a;
                                p<InterfaceC1084f, Integer, r> value = n10.getValue();
                                AndroidPopup_androidKt$SimpleStack$1 androidPopup_androidKt$SimpleStack$1 = AndroidPopup_androidKt$SimpleStack$1.f15791a;
                                int iF = interfaceC1084f3.F();
                                InterfaceC1089h0 interfaceC1089h0Z = interfaceC1084f3.z();
                                androidx.compose.ui.h hVarC3 = ComposedModifierKt.c(interfaceC1084f3, hVarC2);
                                ComposeUiNode.f14331c0.getClass();
                                Ia.a<ComposeUiNode> aVar8 = ComposeUiNode.Companion.f14333b;
                                if (interfaceC1084f3.u() == null) {
                                    I.b.k();
                                    throw null;
                                }
                                interfaceC1084f3.r();
                                if (interfaceC1084f3.m()) {
                                    interfaceC1084f3.v(aVar8);
                                } else {
                                    interfaceC1084f3.A();
                                }
                                R0.a(ComposeUiNode.Companion.f14337f, interfaceC1084f3, androidPopup_androidKt$SimpleStack$1);
                                R0.a(ComposeUiNode.Companion.f14336e, interfaceC1084f3, interfaceC1089h0Z);
                                p<ComposeUiNode, Integer, r> pVar3 = ComposeUiNode.Companion.f14338g;
                                if (interfaceC1084f3.m() || !kotlin.jvm.internal.i.a(interfaceC1084f3.f(), Integer.valueOf(iF))) {
                                    androidx.compose.animation.k.b(iF, interfaceC1084f3, iF, pVar3);
                                }
                                R0.a(ComposeUiNode.Companion.f14335d, interfaceC1084f3, hVarC3);
                                androidx.compose.foundation.gestures.d.c(value, interfaceC1084f3, 0);
                            } else {
                                interfaceC1084f3.w();
                            }
                            return r.f47939a;
                        }
                    }));
                    c1086gP.E(popupLayout3);
                    objF = popupLayout3;
                }
                popupLayout = (PopupLayout) objF;
                boolean zK9 = c1086gP.k(popupLayout);
                i17 = i16 & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle;
                if (i17 == 32) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                boolean z19 = zK9 | z11;
                i18 = i16 & 896;
                if (i18 == 256) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                zK = z19 | z12 | c1086gP.K(str) | c1086gP.K(layoutDirection);
                objF2 = c1086gP.f();
                if (zK) {
                    final Ia.a<r> aVar8 = aVar3;
                    final n nVar7 = nVar4;
                    objF2 = new Ia.l<B, A>() { // from class: androidx.compose.ui.window.AndroidPopup_androidKt$Popup$2$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(1);
                        }

                        @Override // Ia.l
                        public final A invoke(B b10) {
                            PopupLayout popupLayout4 = popupLayout;
                            popupLayout4.f15807g.addView(popupLayout4, popupLayout4.f15808h);
                            popupLayout.d(aVar8, nVar7, str, layoutDirection);
                            return new b(popupLayout);
                        }
                    };
                    c1086gP.E(objF2);
                } else {
                    final Ia.a<r> aVar9 = aVar3;
                    final n nVar8 = nVar4;
                    objF2 = new Ia.l<B, A>() { // from class: androidx.compose.ui.window.AndroidPopup_androidKt$Popup$2$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(1);
                        }

                        @Override // Ia.l
                        public final A invoke(B b10) {
                            PopupLayout popupLayout4 = popupLayout;
                            popupLayout4.f15807g.addView(popupLayout4, popupLayout4.f15808h);
                            popupLayout.d(aVar9, nVar8, str, layoutDirection);
                            return new b(popupLayout);
                        }
                    };
                    c1086gP.E(objF2);
                }
                E.a(popupLayout, (Ia.l) objF2, c1086gP);
                boolean zK10 = c1086gP.k(popupLayout);
                if (i17 == 32) {
                    z13 = true;
                } else {
                    z13 = false;
                }
                boolean z110 = zK10 | z13;
                if (i18 == 256) {
                    z14 = true;
                } else {
                    z14 = false;
                }
                zK2 = z110 | z14 | c1086gP.K(str) | c1086gP.K(layoutDirection);
                objF3 = c1086gP.f();
                if (zK2) {
                    final Ia.a<r> aVar10 = aVar3;
                    final n nVar9 = nVar4;
                    objF3 = new Ia.a<r>() { // from class: androidx.compose.ui.window.AndroidPopup_androidKt$Popup$3$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(0);
                        }

                        @Override // Ia.a
                        public final r invoke() {
                            popupLayout.d(aVar10, nVar9, str, layoutDirection);
                            return r.f47939a;
                        }
                    };
                    c1086gP.E(objF3);
                } else {
                    final Ia.a<r> aVar11 = aVar3;
                    final n nVar10 = nVar4;
                    objF3 = new Ia.a<r>() { // from class: androidx.compose.ui.window.AndroidPopup_androidKt$Popup$3$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(0);
                        }

                        @Override // Ia.a
                        public final r invoke() {
                            popupLayout.d(aVar11, nVar10, str, layoutDirection);
                            return r.f47939a;
                        }
                    };
                    c1086gP.E(objF3);
                }
                c1086gP.l((Ia.a) objF3);
                boolean zK11 = c1086gP.k(popupLayout);
                if ((i16 & 14) == 4) {
                    z15 = true;
                } else {
                    z15 = false;
                }
                z16 = zK11 | z15;
                objF4 = c1086gP.f();
                if (z16) {
                    objF4 = new Ia.l<B, A>() { // from class: androidx.compose.ui.window.AndroidPopup_androidKt$Popup$4$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(1);
                        }

                        @Override // Ia.l
                        public final A invoke(B b10) {
                            popupLayout.setPositionProvider(mVar);
                            popupLayout.h();
                            return new c();
                        }
                    };
                    c1086gP.E(objF4);
                } else {
                    objF4 = new Ia.l<B, A>() { // from class: androidx.compose.ui.window.AndroidPopup_androidKt$Popup$4$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(1);
                        }

                        @Override // Ia.l
                        public final A invoke(B b10) {
                            popupLayout.setPositionProvider(mVar);
                            popupLayout.h();
                            return new c();
                        }
                    };
                    c1086gP.E(objF4);
                }
                E.a(mVar, (Ia.l) objF4, c1086gP);
                zK3 = c1086gP.k(popupLayout);
                objF5 = c1086gP.f();
                if (zK3) {
                    objF5 = new AndroidPopup_androidKt$Popup$5$1(popupLayout, null);
                    c1086gP.E(objF5);
                } else {
                    objF5 = new AndroidPopup_androidKt$Popup$5$1(popupLayout, null);
                    c1086gP.E(objF5);
                }
                E.d((p) objF5, c1086gP, popupLayout);
                androidx.compose.ui.h.a aVar12 = androidx.compose.ui.h.a.f13984b;
                zK4 = c1086gP.k(popupLayout);
                objF6 = c1086gP.f();
                if (zK4) {
                    objF6 = new Ia.l<InterfaceC1170p, r>() { // from class: androidx.compose.ui.window.AndroidPopup_androidKt$Popup$7$1
                        {
                            super(1);
                        }

                        @Override // Ia.l
                        public final r invoke(InterfaceC1170p interfaceC1170p) {
                            InterfaceC1170p interfaceC1170pX = interfaceC1170p.X();
                            kotlin.jvm.internal.i.b(interfaceC1170pX);
                            popupLayout.f(interfaceC1170pX);
                            return r.f47939a;
                        }
                    };
                    c1086gP.E(objF6);
                } else {
                    objF6 = new Ia.l<InterfaceC1170p, r>() { // from class: androidx.compose.ui.window.AndroidPopup_androidKt$Popup$7$1
                        {
                            super(1);
                        }

                        @Override // Ia.l
                        public final r invoke(InterfaceC1170p interfaceC1170p) {
                            InterfaceC1170p interfaceC1170pX = interfaceC1170p.X();
                            kotlin.jvm.internal.i.b(interfaceC1170pX);
                            popupLayout.f(interfaceC1170pX);
                            return r.f47939a;
                        }
                    };
                    c1086gP.E(objF6);
                }
                androidx.compose.ui.h hVarA2 = O.a(aVar12, (Ia.l) objF6);
                zK5 = c1086gP.k(popupLayout) | c1086gP.K(layoutDirection);
                objF7 = c1086gP.f();
                if (zK5) {
                    objF7 = new androidx.compose.ui.layout.E() { // from class: androidx.compose.ui.window.AndroidPopup_androidKt$Popup$8$1
                        @Override // androidx.compose.ui.layout.E
                        public final F g(H h8, List<? extends D> list, long j) {
                            popupLayout.setParentLayoutDirection(layoutDirection);
                            return h8.y1(0, 0, y.p(), new Ia.l<Y.a, r>() { // from class: androidx.compose.ui.window.AndroidPopup_androidKt$Popup$8$1.1
                                @Override // Ia.l
                                public final /* bridge */ /* synthetic */ r invoke(Y.a aVar13) {
                                    return r.f47939a;
                                }
                            });
                        }
                    };
                    c1086gP.E(objF7);
                } else {
                    objF7 = new androidx.compose.ui.layout.E() { // from class: androidx.compose.ui.window.AndroidPopup_androidKt$Popup$8$1
                        @Override // androidx.compose.ui.layout.E
                        public final F g(H h8, List<? extends D> list, long j) {
                            popupLayout.setParentLayoutDirection(layoutDirection);
                            return h8.y1(0, 0, y.p(), new Ia.l<Y.a, r>() { // from class: androidx.compose.ui.window.AndroidPopup_androidKt$Popup$8$1.1
                                @Override // Ia.l
                                public final /* bridge */ /* synthetic */ r invoke(Y.a aVar13) {
                                    return r.f47939a;
                                }
                            });
                        }
                    };
                    c1086gP.E(objF7);
                }
                androidx.compose.ui.layout.E e11 = (androidx.compose.ui.layout.E) objF7;
                i19 = c1086gP.f12996P;
                InterfaceC1089h0 interfaceC1089h0P2 = c1086gP.P();
                androidx.compose.ui.h hVarC2 = ComposedModifierKt.c(c1086gP, hVarA2);
                ComposeUiNode.f14331c0.getClass();
                aVar4 = ComposeUiNode.Companion.f14333b;
                c1086gP.r();
                if (c1086gP.f12995O) {
                    c1086gP.v(aVar4);
                } else {
                    c1086gP.A();
                }
                R0.a(ComposeUiNode.Companion.f14337f, c1086gP, e11);
                R0.a(ComposeUiNode.Companion.f14336e, c1086gP, interfaceC1089h0P2);
                pVar2 = ComposeUiNode.Companion.f14338g;
                if (c1086gP.f12995O) {
                    J4.i.d(i19, c1086gP, i19, pVar2);
                } else {
                    J4.i.d(i19, c1086gP, i19, pVar2);
                }
                R0.a(ComposeUiNode.Companion.f14335d, c1086gP, hVarC2);
                c1086gP.T(true);
                aVar2 = aVar3;
                nVar3 = nVar4;
            } else {
                c1086gP.w();
                nVar3 = nVar2;
            }
            c1105p0V = c1086gP.V();
            if (c1105p0V != null) {
                c1105p0V.f13109d = new p<InterfaceC1084f, Integer, r>() { // from class: androidx.compose.ui.window.AndroidPopup_androidKt$Popup$9
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(2);
                    }

                    @Override // Ia.p
                    public final r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                        num.intValue();
                        AndroidPopup_androidKt.a(mVar, aVar2, nVar3, pVar, interfaceC1084f2, L4.b.l(i10 | 1), i11);
                        return r.f47939a;
                    }
                };
            }
        }
        i12 |= 48;
        aVar2 = aVar;
        i13 = i11 & 4;
        if (i13 != 0) {
            if ((i10 & 384) == 0) {
                nVar2 = nVar;
                if (c1086gP.K(nVar2)) {
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
            i16 = i12;
            if ((i16 & 1171) != 1170) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (c1086gP.C(i16 & 1, z10)) {
                if (i20 != 0) {
                    aVar3 = null;
                } else {
                    aVar3 = aVar2;
                }
                if (i13 != 0) {
                    nVar4 = new n(15, false);
                } else {
                    nVar4 = nVar2;
                }
                view = (View) c1086gP.x(AndroidCompositionLocals_androidKt.f14797f);
                cVar = (p013b0.c) c1086gP.x(CompositionLocalsKt.f14847h);
                str = (String) c1086gP.x(f15783a);
                layoutDirection = (LayoutDirection) c1086gP.x(CompositionLocalsKt.f14852n);
                bVarG = c1086gP.G();
                xI = J0.i(pVar, c1086gP);
                uuid = (UUID) androidx.compose.runtime.saveable.b.c(new Object[0], null, null, new Ia.a<UUID>() { // from class: androidx.compose.ui.window.AndroidPopup_androidKt$Popup$popupId$1
                    @Override // Ia.a
                    public final UUID invoke() {
                        return UUID.randomUUID();
                    }
                }, c1086gP, 3072, 6);
                objF = c1086gP.f();
                c0153a = InterfaceC1084f.a.f12980a;
                if (objF == c0153a) {
                    final PopupLayout popupLayout4 = new PopupLayout(aVar3, nVar4, str, view, cVar, mVar, uuid);
                    popupLayout4.c(bVarG, new ComposableLambdaImpl(true, 1302892335, new p<InterfaceC1084f, Integer, r>() { // from class: androidx.compose.ui.window.AndroidPopup_androidKt$Popup$popupLayout$1$1$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(2);
                        }

                        @Override // Ia.p
                        public final r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                            InterfaceC1084f interfaceC1084f3 = interfaceC1084f2;
                            int iIntValue = num.intValue();
                            if (interfaceC1084f3.C(iIntValue & 1, (iIntValue & 3) != 2)) {
                                androidx.compose.ui.h hVarB = androidx.compose.ui.semantics.p.b(androidx.compose.ui.h.a.f13984b, false, new Ia.l<w, r>() { // from class: androidx.compose.ui.window.AndroidPopup_androidKt$Popup$popupLayout$1$1$1.1
                                    @Override // Ia.l
                                    public final r invoke(w wVar) {
                                        Oa.l<Object>[] lVarArr = t.f15251a;
                                        v<r> vVar = SemanticsProperties.f15167u;
                                        r rVar = r.f47939a;
                                        wVar.e(vVar, rVar);
                                        return rVar;
                                    }
                                });
                                boolean zK12 = interfaceC1084f3.k(popupLayout4);
                                final PopupLayout popupLayout5 = popupLayout4;
                                Object objF8 = interfaceC1084f3.f();
                                if (zK12 || objF8 == InterfaceC1084f.a.f12980a) {
                                    objF8 = new Ia.l<p013b0.l, r>() { // from class: androidx.compose.ui.window.AndroidPopup_androidKt$Popup$popupLayout$1$1$1$2$1
                                        {
                                            super(1);
                                        }

                                        @Override // Ia.l
                                        public final r invoke(p013b0.l lVar) {
                                            popupLayout5.m7setPopupContentSizefhxjrPA(new p013b0.l(lVar.f20490a));
                                            popupLayout5.h();
                                            return r.f47939a;
                                        }
                                    };
                                    interfaceC1084f3.E(objF8);
                                }
                                androidx.compose.ui.h hVarC3 = Cb.a.c(T.a(hVarB, (Ia.l) objF8), popupLayout4.getCanCalculatePosition() ? 1.0f : 0.0f);
                                N0<p<InterfaceC1084f, Integer, r>> n10 = xI;
                                C c10 = AndroidPopup_androidKt.f15783a;
                                p<InterfaceC1084f, Integer, r> value = n10.getValue();
                                AndroidPopup_androidKt$SimpleStack$1 androidPopup_androidKt$SimpleStack$1 = AndroidPopup_androidKt$SimpleStack$1.f15791a;
                                int iF = interfaceC1084f3.F();
                                InterfaceC1089h0 interfaceC1089h0Z = interfaceC1084f3.z();
                                androidx.compose.ui.h hVarC4 = ComposedModifierKt.c(interfaceC1084f3, hVarC3);
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
                                R0.a(ComposeUiNode.Companion.f14337f, interfaceC1084f3, androidPopup_androidKt$SimpleStack$1);
                                R0.a(ComposeUiNode.Companion.f14336e, interfaceC1084f3, interfaceC1089h0Z);
                                p<ComposeUiNode, Integer, r> pVar3 = ComposeUiNode.Companion.f14338g;
                                if (interfaceC1084f3.m() || !kotlin.jvm.internal.i.a(interfaceC1084f3.f(), Integer.valueOf(iF))) {
                                    androidx.compose.animation.k.b(iF, interfaceC1084f3, iF, pVar3);
                                }
                                R0.a(ComposeUiNode.Companion.f14335d, interfaceC1084f3, hVarC4);
                                androidx.compose.foundation.gestures.d.c(value, interfaceC1084f3, 0);
                            } else {
                                interfaceC1084f3.w();
                            }
                            return r.f47939a;
                        }
                    }));
                    c1086gP.E(popupLayout4);
                    objF = popupLayout4;
                }
                popupLayout = (PopupLayout) objF;
                boolean zK12 = c1086gP.k(popupLayout);
                i17 = i16 & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle;
                if (i17 == 32) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                boolean z111 = zK12 | z11;
                i18 = i16 & 896;
                if (i18 == 256) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                zK = z111 | z12 | c1086gP.K(str) | c1086gP.K(layoutDirection);
                objF2 = c1086gP.f();
                if (zK) {
                    final Ia.a<r> aVar13 = aVar3;
                    final n nVar11 = nVar4;
                    objF2 = new Ia.l<B, A>() { // from class: androidx.compose.ui.window.AndroidPopup_androidKt$Popup$2$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(1);
                        }

                        @Override // Ia.l
                        public final A invoke(B b10) {
                            PopupLayout popupLayout5 = popupLayout;
                            popupLayout5.f15807g.addView(popupLayout5, popupLayout5.f15808h);
                            popupLayout.d(aVar13, nVar11, str, layoutDirection);
                            return new b(popupLayout);
                        }
                    };
                    c1086gP.E(objF2);
                } else {
                    final Ia.a<r> aVar14 = aVar3;
                    final n nVar12 = nVar4;
                    objF2 = new Ia.l<B, A>() { // from class: androidx.compose.ui.window.AndroidPopup_androidKt$Popup$2$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(1);
                        }

                        @Override // Ia.l
                        public final A invoke(B b10) {
                            PopupLayout popupLayout5 = popupLayout;
                            popupLayout5.f15807g.addView(popupLayout5, popupLayout5.f15808h);
                            popupLayout.d(aVar14, nVar12, str, layoutDirection);
                            return new b(popupLayout);
                        }
                    };
                    c1086gP.E(objF2);
                }
                E.a(popupLayout, (Ia.l) objF2, c1086gP);
                boolean zK13 = c1086gP.k(popupLayout);
                if (i17 == 32) {
                    z13 = true;
                } else {
                    z13 = false;
                }
                boolean z112 = zK13 | z13;
                if (i18 == 256) {
                    z14 = true;
                } else {
                    z14 = false;
                }
                zK2 = z112 | z14 | c1086gP.K(str) | c1086gP.K(layoutDirection);
                objF3 = c1086gP.f();
                if (zK2) {
                    final Ia.a<r> aVar15 = aVar3;
                    final n nVar13 = nVar4;
                    objF3 = new Ia.a<r>() { // from class: androidx.compose.ui.window.AndroidPopup_androidKt$Popup$3$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(0);
                        }

                        @Override // Ia.a
                        public final r invoke() {
                            popupLayout.d(aVar15, nVar13, str, layoutDirection);
                            return r.f47939a;
                        }
                    };
                    c1086gP.E(objF3);
                } else {
                    final Ia.a<r> aVar16 = aVar3;
                    final n nVar14 = nVar4;
                    objF3 = new Ia.a<r>() { // from class: androidx.compose.ui.window.AndroidPopup_androidKt$Popup$3$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(0);
                        }

                        @Override // Ia.a
                        public final r invoke() {
                            popupLayout.d(aVar16, nVar14, str, layoutDirection);
                            return r.f47939a;
                        }
                    };
                    c1086gP.E(objF3);
                }
                c1086gP.l((Ia.a) objF3);
                boolean zK14 = c1086gP.k(popupLayout);
                if ((i16 & 14) == 4) {
                    z15 = true;
                } else {
                    z15 = false;
                }
                z16 = zK14 | z15;
                objF4 = c1086gP.f();
                if (z16) {
                    objF4 = new Ia.l<B, A>() { // from class: androidx.compose.ui.window.AndroidPopup_androidKt$Popup$4$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(1);
                        }

                        @Override // Ia.l
                        public final A invoke(B b10) {
                            popupLayout.setPositionProvider(mVar);
                            popupLayout.h();
                            return new c();
                        }
                    };
                    c1086gP.E(objF4);
                } else {
                    objF4 = new Ia.l<B, A>() { // from class: androidx.compose.ui.window.AndroidPopup_androidKt$Popup$4$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(1);
                        }

                        @Override // Ia.l
                        public final A invoke(B b10) {
                            popupLayout.setPositionProvider(mVar);
                            popupLayout.h();
                            return new c();
                        }
                    };
                    c1086gP.E(objF4);
                }
                E.a(mVar, (Ia.l) objF4, c1086gP);
                zK3 = c1086gP.k(popupLayout);
                objF5 = c1086gP.f();
                if (zK3) {
                    objF5 = new AndroidPopup_androidKt$Popup$5$1(popupLayout, null);
                    c1086gP.E(objF5);
                } else {
                    objF5 = new AndroidPopup_androidKt$Popup$5$1(popupLayout, null);
                    c1086gP.E(objF5);
                }
                E.d((p) objF5, c1086gP, popupLayout);
                androidx.compose.ui.h.a aVar17 = androidx.compose.ui.h.a.f13984b;
                zK4 = c1086gP.k(popupLayout);
                objF6 = c1086gP.f();
                if (zK4) {
                    objF6 = new Ia.l<InterfaceC1170p, r>() { // from class: androidx.compose.ui.window.AndroidPopup_androidKt$Popup$7$1
                        {
                            super(1);
                        }

                        @Override // Ia.l
                        public final r invoke(InterfaceC1170p interfaceC1170p) {
                            InterfaceC1170p interfaceC1170pX = interfaceC1170p.X();
                            kotlin.jvm.internal.i.b(interfaceC1170pX);
                            popupLayout.f(interfaceC1170pX);
                            return r.f47939a;
                        }
                    };
                    c1086gP.E(objF6);
                } else {
                    objF6 = new Ia.l<InterfaceC1170p, r>() { // from class: androidx.compose.ui.window.AndroidPopup_androidKt$Popup$7$1
                        {
                            super(1);
                        }

                        @Override // Ia.l
                        public final r invoke(InterfaceC1170p interfaceC1170p) {
                            InterfaceC1170p interfaceC1170pX = interfaceC1170p.X();
                            kotlin.jvm.internal.i.b(interfaceC1170pX);
                            popupLayout.f(interfaceC1170pX);
                            return r.f47939a;
                        }
                    };
                    c1086gP.E(objF6);
                }
                androidx.compose.ui.h hVarA3 = O.a(aVar17, (Ia.l) objF6);
                zK5 = c1086gP.k(popupLayout) | c1086gP.K(layoutDirection);
                objF7 = c1086gP.f();
                if (zK5) {
                    objF7 = new androidx.compose.ui.layout.E() { // from class: androidx.compose.ui.window.AndroidPopup_androidKt$Popup$8$1
                        @Override // androidx.compose.ui.layout.E
                        public final F g(H h8, List<? extends D> list, long j) {
                            popupLayout.setParentLayoutDirection(layoutDirection);
                            return h8.y1(0, 0, y.p(), new Ia.l<Y.a, r>() { // from class: androidx.compose.ui.window.AndroidPopup_androidKt$Popup$8$1.1
                                @Override // Ia.l
                                public final /* bridge */ /* synthetic */ r invoke(Y.a aVar18) {
                                    return r.f47939a;
                                }
                            });
                        }
                    };
                    c1086gP.E(objF7);
                } else {
                    objF7 = new androidx.compose.ui.layout.E() { // from class: androidx.compose.ui.window.AndroidPopup_androidKt$Popup$8$1
                        @Override // androidx.compose.ui.layout.E
                        public final F g(H h8, List<? extends D> list, long j) {
                            popupLayout.setParentLayoutDirection(layoutDirection);
                            return h8.y1(0, 0, y.p(), new Ia.l<Y.a, r>() { // from class: androidx.compose.ui.window.AndroidPopup_androidKt$Popup$8$1.1
                                @Override // Ia.l
                                public final /* bridge */ /* synthetic */ r invoke(Y.a aVar18) {
                                    return r.f47939a;
                                }
                            });
                        }
                    };
                    c1086gP.E(objF7);
                }
                androidx.compose.ui.layout.E e12 = (androidx.compose.ui.layout.E) objF7;
                i19 = c1086gP.f12996P;
                InterfaceC1089h0 interfaceC1089h0P3 = c1086gP.P();
                androidx.compose.ui.h hVarC3 = ComposedModifierKt.c(c1086gP, hVarA3);
                ComposeUiNode.f14331c0.getClass();
                aVar4 = ComposeUiNode.Companion.f14333b;
                c1086gP.r();
                if (c1086gP.f12995O) {
                    c1086gP.v(aVar4);
                } else {
                    c1086gP.A();
                }
                R0.a(ComposeUiNode.Companion.f14337f, c1086gP, e12);
                R0.a(ComposeUiNode.Companion.f14336e, c1086gP, interfaceC1089h0P3);
                pVar2 = ComposeUiNode.Companion.f14338g;
                if (c1086gP.f12995O) {
                    J4.i.d(i19, c1086gP, i19, pVar2);
                } else {
                    J4.i.d(i19, c1086gP, i19, pVar2);
                }
                R0.a(ComposeUiNode.Companion.f14335d, c1086gP, hVarC3);
                c1086gP.T(true);
                aVar2 = aVar3;
                nVar3 = nVar4;
            } else {
                c1086gP.w();
                nVar3 = nVar2;
            }
            c1105p0V = c1086gP.V();
            if (c1105p0V != null) {
                c1105p0V.f13109d = new p<InterfaceC1084f, Integer, r>() { // from class: androidx.compose.ui.window.AndroidPopup_androidKt$Popup$9
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(2);
                    }

                    @Override // Ia.p
                    public final r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                        num.intValue();
                        AndroidPopup_androidKt.a(mVar, aVar2, nVar3, pVar, interfaceC1084f2, L4.b.l(i10 | 1), i11);
                        return r.f47939a;
                    }
                };
            }
        }
        i12 |= 384;
        nVar2 = nVar;
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
        i16 = i12;
        if ((i16 & 1171) != 1170) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (c1086gP.C(i16 & 1, z10)) {
            if (i20 != 0) {
                aVar3 = null;
            } else {
                aVar3 = aVar2;
            }
            if (i13 != 0) {
                nVar4 = new n(15, false);
            } else {
                nVar4 = nVar2;
            }
            view = (View) c1086gP.x(AndroidCompositionLocals_androidKt.f14797f);
            cVar = (p013b0.c) c1086gP.x(CompositionLocalsKt.f14847h);
            str = (String) c1086gP.x(f15783a);
            layoutDirection = (LayoutDirection) c1086gP.x(CompositionLocalsKt.f14852n);
            bVarG = c1086gP.G();
            xI = J0.i(pVar, c1086gP);
            uuid = (UUID) androidx.compose.runtime.saveable.b.c(new Object[0], null, null, new Ia.a<UUID>() { // from class: androidx.compose.ui.window.AndroidPopup_androidKt$Popup$popupId$1
                @Override // Ia.a
                public final UUID invoke() {
                    return UUID.randomUUID();
                }
            }, c1086gP, 3072, 6);
            objF = c1086gP.f();
            c0153a = InterfaceC1084f.a.f12980a;
            if (objF == c0153a) {
                final PopupLayout popupLayout5 = new PopupLayout(aVar3, nVar4, str, view, cVar, mVar, uuid);
                popupLayout5.c(bVarG, new ComposableLambdaImpl(true, 1302892335, new p<InterfaceC1084f, Integer, r>() { // from class: androidx.compose.ui.window.AndroidPopup_androidKt$Popup$popupLayout$1$1$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(2);
                    }

                    @Override // Ia.p
                    public final r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                        InterfaceC1084f interfaceC1084f3 = interfaceC1084f2;
                        int iIntValue = num.intValue();
                        if (interfaceC1084f3.C(iIntValue & 1, (iIntValue & 3) != 2)) {
                            androidx.compose.ui.h hVarB = androidx.compose.ui.semantics.p.b(androidx.compose.ui.h.a.f13984b, false, new Ia.l<w, r>() { // from class: androidx.compose.ui.window.AndroidPopup_androidKt$Popup$popupLayout$1$1$1.1
                                @Override // Ia.l
                                public final r invoke(w wVar) {
                                    Oa.l<Object>[] lVarArr = t.f15251a;
                                    v<r> vVar = SemanticsProperties.f15167u;
                                    r rVar = r.f47939a;
                                    wVar.e(vVar, rVar);
                                    return rVar;
                                }
                            });
                            boolean zK15 = interfaceC1084f3.k(popupLayout5);
                            final PopupLayout popupLayout6 = popupLayout5;
                            Object objF8 = interfaceC1084f3.f();
                            if (zK15 || objF8 == InterfaceC1084f.a.f12980a) {
                                objF8 = new Ia.l<p013b0.l, r>() { // from class: androidx.compose.ui.window.AndroidPopup_androidKt$Popup$popupLayout$1$1$1$2$1
                                    {
                                        super(1);
                                    }

                                    @Override // Ia.l
                                    public final r invoke(p013b0.l lVar) {
                                        popupLayout6.m7setPopupContentSizefhxjrPA(new p013b0.l(lVar.f20490a));
                                        popupLayout6.h();
                                        return r.f47939a;
                                    }
                                };
                                interfaceC1084f3.E(objF8);
                            }
                            androidx.compose.ui.h hVarC4 = Cb.a.c(T.a(hVarB, (Ia.l) objF8), popupLayout5.getCanCalculatePosition() ? 1.0f : 0.0f);
                            N0<p<InterfaceC1084f, Integer, r>> n10 = xI;
                            C c10 = AndroidPopup_androidKt.f15783a;
                            p<InterfaceC1084f, Integer, r> value = n10.getValue();
                            AndroidPopup_androidKt$SimpleStack$1 androidPopup_androidKt$SimpleStack$1 = AndroidPopup_androidKt$SimpleStack$1.f15791a;
                            int iF = interfaceC1084f3.F();
                            InterfaceC1089h0 interfaceC1089h0Z = interfaceC1084f3.z();
                            androidx.compose.ui.h hVarC5 = ComposedModifierKt.c(interfaceC1084f3, hVarC4);
                            ComposeUiNode.f14331c0.getClass();
                            Ia.a<ComposeUiNode> aVar18 = ComposeUiNode.Companion.f14333b;
                            if (interfaceC1084f3.u() == null) {
                                I.b.k();
                                throw null;
                            }
                            interfaceC1084f3.r();
                            if (interfaceC1084f3.m()) {
                                interfaceC1084f3.v(aVar18);
                            } else {
                                interfaceC1084f3.A();
                            }
                            R0.a(ComposeUiNode.Companion.f14337f, interfaceC1084f3, androidPopup_androidKt$SimpleStack$1);
                            R0.a(ComposeUiNode.Companion.f14336e, interfaceC1084f3, interfaceC1089h0Z);
                            p<ComposeUiNode, Integer, r> pVar3 = ComposeUiNode.Companion.f14338g;
                            if (interfaceC1084f3.m() || !kotlin.jvm.internal.i.a(interfaceC1084f3.f(), Integer.valueOf(iF))) {
                                androidx.compose.animation.k.b(iF, interfaceC1084f3, iF, pVar3);
                            }
                            R0.a(ComposeUiNode.Companion.f14335d, interfaceC1084f3, hVarC5);
                            androidx.compose.foundation.gestures.d.c(value, interfaceC1084f3, 0);
                        } else {
                            interfaceC1084f3.w();
                        }
                        return r.f47939a;
                    }
                }));
                c1086gP.E(popupLayout5);
                objF = popupLayout5;
            }
            popupLayout = (PopupLayout) objF;
            boolean zK15 = c1086gP.k(popupLayout);
            i17 = i16 & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle;
            if (i17 == 32) {
                z11 = true;
            } else {
                z11 = false;
            }
            boolean z113 = zK15 | z11;
            i18 = i16 & 896;
            if (i18 == 256) {
                z12 = true;
            } else {
                z12 = false;
            }
            zK = z113 | z12 | c1086gP.K(str) | c1086gP.K(layoutDirection);
            objF2 = c1086gP.f();
            if (zK) {
                final Ia.a<r> aVar18 = aVar3;
                final n nVar15 = nVar4;
                objF2 = new Ia.l<B, A>() { // from class: androidx.compose.ui.window.AndroidPopup_androidKt$Popup$2$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(1);
                    }

                    @Override // Ia.l
                    public final A invoke(B b10) {
                        PopupLayout popupLayout6 = popupLayout;
                        popupLayout6.f15807g.addView(popupLayout6, popupLayout6.f15808h);
                        popupLayout.d(aVar18, nVar15, str, layoutDirection);
                        return new b(popupLayout);
                    }
                };
                c1086gP.E(objF2);
            } else {
                final Ia.a<r> aVar19 = aVar3;
                final n nVar16 = nVar4;
                objF2 = new Ia.l<B, A>() { // from class: androidx.compose.ui.window.AndroidPopup_androidKt$Popup$2$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(1);
                    }

                    @Override // Ia.l
                    public final A invoke(B b10) {
                        PopupLayout popupLayout6 = popupLayout;
                        popupLayout6.f15807g.addView(popupLayout6, popupLayout6.f15808h);
                        popupLayout.d(aVar19, nVar16, str, layoutDirection);
                        return new b(popupLayout);
                    }
                };
                c1086gP.E(objF2);
            }
            E.a(popupLayout, (Ia.l) objF2, c1086gP);
            boolean zK16 = c1086gP.k(popupLayout);
            if (i17 == 32) {
                z13 = true;
            } else {
                z13 = false;
            }
            boolean z114 = zK16 | z13;
            if (i18 == 256) {
                z14 = true;
            } else {
                z14 = false;
            }
            zK2 = z114 | z14 | c1086gP.K(str) | c1086gP.K(layoutDirection);
            objF3 = c1086gP.f();
            if (zK2) {
                final Ia.a<r> aVar110 = aVar3;
                final n nVar17 = nVar4;
                objF3 = new Ia.a<r>() { // from class: androidx.compose.ui.window.AndroidPopup_androidKt$Popup$3$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(0);
                    }

                    @Override // Ia.a
                    public final r invoke() {
                        popupLayout.d(aVar110, nVar17, str, layoutDirection);
                        return r.f47939a;
                    }
                };
                c1086gP.E(objF3);
            } else {
                final Ia.a<r> aVar111 = aVar3;
                final n nVar18 = nVar4;
                objF3 = new Ia.a<r>() { // from class: androidx.compose.ui.window.AndroidPopup_androidKt$Popup$3$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(0);
                    }

                    @Override // Ia.a
                    public final r invoke() {
                        popupLayout.d(aVar111, nVar18, str, layoutDirection);
                        return r.f47939a;
                    }
                };
                c1086gP.E(objF3);
            }
            c1086gP.l((Ia.a) objF3);
            boolean zK17 = c1086gP.k(popupLayout);
            if ((i16 & 14) == 4) {
                z15 = true;
            } else {
                z15 = false;
            }
            z16 = zK17 | z15;
            objF4 = c1086gP.f();
            if (z16) {
                objF4 = new Ia.l<B, A>() { // from class: androidx.compose.ui.window.AndroidPopup_androidKt$Popup$4$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(1);
                    }

                    @Override // Ia.l
                    public final A invoke(B b10) {
                        popupLayout.setPositionProvider(mVar);
                        popupLayout.h();
                        return new c();
                    }
                };
                c1086gP.E(objF4);
            } else {
                objF4 = new Ia.l<B, A>() { // from class: androidx.compose.ui.window.AndroidPopup_androidKt$Popup$4$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(1);
                    }

                    @Override // Ia.l
                    public final A invoke(B b10) {
                        popupLayout.setPositionProvider(mVar);
                        popupLayout.h();
                        return new c();
                    }
                };
                c1086gP.E(objF4);
            }
            E.a(mVar, (Ia.l) objF4, c1086gP);
            zK3 = c1086gP.k(popupLayout);
            objF5 = c1086gP.f();
            if (zK3) {
                objF5 = new AndroidPopup_androidKt$Popup$5$1(popupLayout, null);
                c1086gP.E(objF5);
            } else {
                objF5 = new AndroidPopup_androidKt$Popup$5$1(popupLayout, null);
                c1086gP.E(objF5);
            }
            E.d((p) objF5, c1086gP, popupLayout);
            androidx.compose.ui.h.a aVar112 = androidx.compose.ui.h.a.f13984b;
            zK4 = c1086gP.k(popupLayout);
            objF6 = c1086gP.f();
            if (zK4) {
                objF6 = new Ia.l<InterfaceC1170p, r>() { // from class: androidx.compose.ui.window.AndroidPopup_androidKt$Popup$7$1
                    {
                        super(1);
                    }

                    @Override // Ia.l
                    public final r invoke(InterfaceC1170p interfaceC1170p) {
                        InterfaceC1170p interfaceC1170pX = interfaceC1170p.X();
                        kotlin.jvm.internal.i.b(interfaceC1170pX);
                        popupLayout.f(interfaceC1170pX);
                        return r.f47939a;
                    }
                };
                c1086gP.E(objF6);
            } else {
                objF6 = new Ia.l<InterfaceC1170p, r>() { // from class: androidx.compose.ui.window.AndroidPopup_androidKt$Popup$7$1
                    {
                        super(1);
                    }

                    @Override // Ia.l
                    public final r invoke(InterfaceC1170p interfaceC1170p) {
                        InterfaceC1170p interfaceC1170pX = interfaceC1170p.X();
                        kotlin.jvm.internal.i.b(interfaceC1170pX);
                        popupLayout.f(interfaceC1170pX);
                        return r.f47939a;
                    }
                };
                c1086gP.E(objF6);
            }
            androidx.compose.ui.h hVarA4 = O.a(aVar112, (Ia.l) objF6);
            zK5 = c1086gP.k(popupLayout) | c1086gP.K(layoutDirection);
            objF7 = c1086gP.f();
            if (zK5) {
                objF7 = new androidx.compose.ui.layout.E() { // from class: androidx.compose.ui.window.AndroidPopup_androidKt$Popup$8$1
                    @Override // androidx.compose.ui.layout.E
                    public final F g(H h8, List<? extends D> list, long j) {
                        popupLayout.setParentLayoutDirection(layoutDirection);
                        return h8.y1(0, 0, y.p(), new Ia.l<Y.a, r>() { // from class: androidx.compose.ui.window.AndroidPopup_androidKt$Popup$8$1.1
                            @Override // Ia.l
                            public final /* bridge */ /* synthetic */ r invoke(Y.a aVar113) {
                                return r.f47939a;
                            }
                        });
                    }
                };
                c1086gP.E(objF7);
            } else {
                objF7 = new androidx.compose.ui.layout.E() { // from class: androidx.compose.ui.window.AndroidPopup_androidKt$Popup$8$1
                    @Override // androidx.compose.ui.layout.E
                    public final F g(H h8, List<? extends D> list, long j) {
                        popupLayout.setParentLayoutDirection(layoutDirection);
                        return h8.y1(0, 0, y.p(), new Ia.l<Y.a, r>() { // from class: androidx.compose.ui.window.AndroidPopup_androidKt$Popup$8$1.1
                            @Override // Ia.l
                            public final /* bridge */ /* synthetic */ r invoke(Y.a aVar113) {
                                return r.f47939a;
                            }
                        });
                    }
                };
                c1086gP.E(objF7);
            }
            androidx.compose.ui.layout.E e13 = (androidx.compose.ui.layout.E) objF7;
            i19 = c1086gP.f12996P;
            InterfaceC1089h0 interfaceC1089h0P4 = c1086gP.P();
            androidx.compose.ui.h hVarC4 = ComposedModifierKt.c(c1086gP, hVarA4);
            ComposeUiNode.f14331c0.getClass();
            aVar4 = ComposeUiNode.Companion.f14333b;
            c1086gP.r();
            if (c1086gP.f12995O) {
                c1086gP.v(aVar4);
            } else {
                c1086gP.A();
            }
            R0.a(ComposeUiNode.Companion.f14337f, c1086gP, e13);
            R0.a(ComposeUiNode.Companion.f14336e, c1086gP, interfaceC1089h0P4);
            pVar2 = ComposeUiNode.Companion.f14338g;
            if (c1086gP.f12995O) {
                J4.i.d(i19, c1086gP, i19, pVar2);
            } else {
                J4.i.d(i19, c1086gP, i19, pVar2);
            }
            R0.a(ComposeUiNode.Companion.f14335d, c1086gP, hVarC4);
            c1086gP.T(true);
            aVar2 = aVar3;
            nVar3 = nVar4;
        } else {
            c1086gP.w();
            nVar3 = nVar2;
        }
        c1105p0V = c1086gP.V();
        if (c1105p0V != null) {
            c1105p0V.f13109d = new p<InterfaceC1084f, Integer, r>() { // from class: androidx.compose.ui.window.AndroidPopup_androidKt$Popup$9
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(2);
                }

                @Override // Ia.p
                public final r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                    num.intValue();
                    AndroidPopup_androidKt.a(mVar, aVar2, nVar3, pVar, interfaceC1084f2, L4.b.l(i10 | 1), i11);
                    return r.f47939a;
                }
            };
        }
    }

    public static final boolean b(View view) {
        ViewGroup.LayoutParams layoutParams = view.getRootView().getLayoutParams();
        WindowManager.LayoutParams layoutParams2 = layoutParams instanceof WindowManager.LayoutParams ? (WindowManager.LayoutParams) layoutParams : null;
        return (layoutParams2 == null || (layoutParams2.flags & 8192) == 0) ? false : true;
    }
}
