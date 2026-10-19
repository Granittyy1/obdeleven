package androidx.compose.ui.viewinterop;

import C4.v;
import Ia.l;
import Ia.p;
import android.content.Context;
import android.view.View;
import androidx.compose.animation.k;
import androidx.compose.runtime.C1086g;
import androidx.compose.runtime.C1105p0;
import androidx.compose.runtime.InterfaceC1084f;
import androidx.compose.runtime.InterfaceC1089h0;
import androidx.compose.runtime.R0;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.focus.FocusTargetNode;
import androidx.compose.ui.h;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.node.LayoutNode;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.unit.LayoutDirection;
import androidx.lifecycle.InterfaceC1376t;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.i;
import me.zhanghai.android.materialprogressbar.R;
import p248u2.e;
import p293xa.r;

/* JADX INFO: compiled from: AndroidView.android.kt */
/* JADX INFO: loaded from: classes.dex */
public final class AndroidView_androidKt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final l<View, r> f15754a = new l<View, r>() { // from class: androidx.compose.ui.viewinterop.AndroidView_androidKt$NoOpUpdate$1
        @Override // Ia.l
        public final /* bridge */ /* synthetic */ r invoke(View view) {
            return r.f47939a;
        }
    };

    /* JADX WARN: Code duplicated, block: B:26:0x0043  */
    /* JADX WARN: Code duplicated, block: B:28:0x0048  */
    /* JADX WARN: Code duplicated, block: B:30:0x004c  */
    /* JADX WARN: Code duplicated, block: B:32:0x0054  */
    /* JADX WARN: Code duplicated, block: B:33:0x0057  */
    /* JADX WARN: Code duplicated, block: B:37:0x005e  */
    /* JADX WARN: Code duplicated, block: B:39:0x0063  */
    /* JADX WARN: Code duplicated, block: B:41:0x0067  */
    /* JADX WARN: Code duplicated, block: B:43:0x006f  */
    /* JADX WARN: Code duplicated, block: B:44:0x0072  */
    /* JADX WARN: Code duplicated, block: B:48:0x0079  */
    /* JADX WARN: Code duplicated, block: B:50:0x007e  */
    /* JADX WARN: Code duplicated, block: B:52:0x0082  */
    /* JADX WARN: Code duplicated, block: B:54:0x008a  */
    /* JADX WARN: Code duplicated, block: B:55:0x008d  */
    /* JADX WARN: Code duplicated, block: B:59:0x0097  */
    /* JADX WARN: Code duplicated, block: B:60:0x0099  */
    /* JADX WARN: Code duplicated, block: B:63:0x00a2 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:64:0x00a4  */
    /* JADX WARN: Code duplicated, block: B:65:0x00a7  */
    /* JADX WARN: Code duplicated, block: B:68:0x00ab  */
    /* JADX WARN: Code duplicated, block: B:69:0x00ad  */
    /* JADX WARN: Code duplicated, block: B:72:0x00b2  */
    /* JADX WARN: Code duplicated, block: B:73:0x00b4  */
    /* JADX WARN: Code duplicated, block: B:75:0x00b7  */
    /* JADX WARN: Code duplicated, block: B:76:0x00b9  */
    /* JADX WARN: Code duplicated, block: B:79:0x0104  */
    /* JADX WARN: Code duplicated, block: B:81:0x0117  */
    /* JADX WARN: Code duplicated, block: B:82:0x011b  */
    /* JADX WARN: Code duplicated, block: B:84:0x0142  */
    /* JADX WARN: Code duplicated, block: B:86:0x015c  */
    /* JADX WARN: Code duplicated, block: B:87:0x0160  */
    /* JADX WARN: Code duplicated, block: B:90:0x0187  */
    /* JADX WARN: Code duplicated, block: B:93:0x0194  */
    /* JADX WARN: Code duplicated, block: B:95:? A[RETURN, SYNTHETIC] */
    public static final <T extends View> void a(final l<? super Context, ? extends T> lVar, h hVar, l<? super T, r> lVar2, l<? super T, r> lVar3, l<? super T, r> lVar4, InterfaceC1084f interfaceC1084f, final int i10, final int i11) {
        int i12;
        h hVar2;
        int i13;
        l<? super T, r> lVar5;
        int i14;
        int i15;
        l<? super T, r> lVar6;
        int i16;
        int i17;
        l<? super T, r> lVar7;
        int i18;
        boolean z10;
        final h hVar3;
        final l<? super T, r> lVar8;
        final l<? super T, r> lVar9;
        final l<? super T, r> lVar10;
        C1105p0 c1105p0V;
        h hVar4;
        l<? super T, r> lVar11;
        l<View, r> lVar12;
        l<? super T, r> lVar13;
        l<? super T, r> lVar14;
        int i19;
        h hVarC;
        p013b0.c cVar;
        LayoutDirection layoutDirection;
        InterfaceC1089h0 interfaceC1089h0P;
        InterfaceC1376t interfaceC1376t;
        e eVar;
        Ia.a<LayoutNode> aVarD;
        l<? super T, r> lVar15;
        Ia.a<LayoutNode> aVarD2;
        C1086g c1086gP = interfaceC1084f.p(-180024211);
        if ((i11 & 1) != 0) {
            i12 = i10 | 6;
        } else if ((i10 & 6) == 0) {
            i12 = (c1086gP.k(lVar) ? 4 : 2) | i10;
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
                    lVar5 = lVar2;
                    if (c1086gP.k(lVar5)) {
                        i14 = 256;
                    } else {
                        i14 = 128;
                    }
                    i12 |= i14;
                }
                i15 = i11 & 8;
                if (i15 != 0) {
                    if ((i10 & 3072) == 0) {
                        lVar6 = lVar3;
                        if (c1086gP.k(lVar6)) {
                            i16 = 2048;
                        } else {
                            i16 = 1024;
                        }
                        i12 |= i16;
                    }
                    i17 = i11 & 16;
                    if (i17 != 0) {
                        if ((i10 & 24576) == 0) {
                            lVar7 = lVar4;
                            if (c1086gP.k(lVar7)) {
                                i18 = 16384;
                            } else {
                                i18 = 8192;
                            }
                            i12 |= i18;
                        }
                        if ((i12 & 9363) != 9362) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        if (c1086gP.C(i12 & 1, z10)) {
                            if (i20 != 0) {
                                hVar4 = h.a.f13984b;
                            } else {
                                hVar4 = hVar2;
                            }
                            if (i13 != 0) {
                                lVar11 = null;
                            } else {
                                lVar11 = lVar5;
                            }
                            lVar12 = f15754a;
                            if (i15 != 0) {
                                lVar13 = lVar12;
                            } else {
                                lVar13 = lVar6;
                            }
                            if (i17 != 0) {
                                lVar14 = lVar12;
                            } else {
                                lVar14 = lVar7;
                            }
                            i19 = c1086gP.f12996P;
                            h hVarI = hVar4.i(FocusGroupPropertiesElement.f15766b);
                            FocusTargetNode.FocusTargetElement focusTargetElement = FocusTargetNode.FocusTargetElement.f13444b;
                            hVarC = ComposedModifierKt.c(c1086gP, hVarI.i(focusTargetElement).i(FocusTargetPropertiesElement.f15771b).i(focusTargetElement));
                            cVar = (p013b0.c) c1086gP.x(CompositionLocalsKt.f14847h);
                            layoutDirection = (LayoutDirection) c1086gP.x(CompositionLocalsKt.f14852n);
                            interfaceC1089h0P = c1086gP.P();
                            interfaceC1376t = (InterfaceC1376t) c1086gP.x(Z0.b.f7676a);
                            eVar = (e) c1086gP.x(AndroidCompositionLocals_androidKt.getLocalSavedStateRegistryOwner());
                            if (lVar11 != null) {
                                c1086gP.L(607780130);
                                aVarD2 = d(lVar, c1086gP, i12 & 14);
                                c1086gP.r();
                                if (c1086gP.f12995O) {
                                    c1086gP.v(aVarD2);
                                } else {
                                    c1086gP.A();
                                }
                                lVar15 = lVar14;
                                lVar9 = lVar13;
                                e(c1086gP, hVarC, i19, cVar, interfaceC1376t, eVar, layoutDirection, interfaceC1089h0P);
                                R0.a(new p<LayoutNode, l<? super T, ? extends r>, r>() { // from class: androidx.compose.ui.viewinterop.AndroidView_androidKt$AndroidView$2$1
                                    @Override // Ia.p
                                    public final r invoke(LayoutNode layoutNode, Object obj) {
                                        AndroidView_androidKt.c(layoutNode).setResetBlock((l) obj);
                                        return r.f47939a;
                                    }
                                }, c1086gP, lVar11);
                                R0.a(new p<LayoutNode, l<? super T, ? extends r>, r>() { // from class: androidx.compose.ui.viewinterop.AndroidView_androidKt$AndroidView$2$2
                                    @Override // Ia.p
                                    public final r invoke(LayoutNode layoutNode, Object obj) {
                                        AndroidView_androidKt.c(layoutNode).setUpdateBlock((l) obj);
                                        return r.f47939a;
                                    }
                                }, c1086gP, lVar15);
                                R0.a(new p<LayoutNode, l<? super T, ? extends r>, r>() { // from class: androidx.compose.ui.viewinterop.AndroidView_androidKt$AndroidView$2$3
                                    @Override // Ia.p
                                    public final r invoke(LayoutNode layoutNode, Object obj) {
                                        AndroidView_androidKt.c(layoutNode).setReleaseBlock((l) obj);
                                        return r.f47939a;
                                    }
                                }, c1086gP, lVar9);
                                c1086gP.T(true);
                                c1086gP.T(false);
                            } else {
                                l<? super T, r> lVar16 = lVar13;
                                l<? super T, r> lVar17 = lVar14;
                                c1086gP.L(608635513);
                                aVarD = d(lVar, c1086gP, i12 & 14);
                                c1086gP.q0(R.styleable.AppCompatTheme_windowMinWidthMinor, 1, null, null);
                                c1086gP.f13013q = true;
                                if (c1086gP.f12995O) {
                                    c1086gP.v(aVarD);
                                } else {
                                    c1086gP.A();
                                }
                                lVar15 = lVar17;
                                lVar9 = lVar16;
                                e(c1086gP, hVarC, i19, cVar, interfaceC1376t, eVar, layoutDirection, interfaceC1089h0P);
                                R0.a(new p<LayoutNode, l<? super T, ? extends r>, r>() { // from class: androidx.compose.ui.viewinterop.AndroidView_androidKt$AndroidView$3$1
                                    @Override // Ia.p
                                    public final r invoke(LayoutNode layoutNode, Object obj) {
                                        AndroidView_androidKt.c(layoutNode).setUpdateBlock((l) obj);
                                        return r.f47939a;
                                    }
                                }, c1086gP, lVar15);
                                R0.a(new p<LayoutNode, l<? super T, ? extends r>, r>() { // from class: androidx.compose.ui.viewinterop.AndroidView_androidKt$AndroidView$3$2
                                    @Override // Ia.p
                                    public final r invoke(LayoutNode layoutNode, Object obj) {
                                        AndroidView_androidKt.c(layoutNode).setReleaseBlock((l) obj);
                                        return r.f47939a;
                                    }
                                }, c1086gP, lVar9);
                                c1086gP.T(true);
                                c1086gP.T(false);
                            }
                            l<? super T, r> lVar18 = lVar11;
                            lVar10 = lVar15;
                            hVar3 = hVar4;
                            lVar8 = lVar18;
                        } else {
                            c1086gP.w();
                            hVar3 = hVar2;
                            lVar8 = lVar5;
                            lVar9 = lVar6;
                            lVar10 = lVar7;
                        }
                        c1105p0V = c1086gP.V();
                        if (c1105p0V != null) {
                            c1105p0V.f13109d = new p<InterfaceC1084f, Integer, r>() { // from class: androidx.compose.ui.viewinterop.AndroidView_androidKt$AndroidView$4
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                /* JADX WARN: Multi-variable type inference failed */
                                {
                                    super(2);
                                }

                                @Override // Ia.p
                                public final r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                                    num.intValue();
                                    AndroidView_androidKt.a(lVar, hVar3, lVar8, lVar9, lVar10, interfaceC1084f2, L4.b.l(i10 | 1), i11);
                                    return r.f47939a;
                                }
                            };
                        }
                    }
                    i12 |= 24576;
                    lVar7 = lVar4;
                    if ((i12 & 9363) != 9362) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    if (c1086gP.C(i12 & 1, z10)) {
                        if (i20 != 0) {
                            hVar4 = h.a.f13984b;
                        } else {
                            hVar4 = hVar2;
                        }
                        if (i13 != 0) {
                            lVar11 = null;
                        } else {
                            lVar11 = lVar5;
                        }
                        lVar12 = f15754a;
                        if (i15 != 0) {
                            lVar13 = lVar12;
                        } else {
                            lVar13 = lVar6;
                        }
                        if (i17 != 0) {
                            lVar14 = lVar12;
                        } else {
                            lVar14 = lVar7;
                        }
                        i19 = c1086gP.f12996P;
                        h hVarI2 = hVar4.i(FocusGroupPropertiesElement.f15766b);
                        FocusTargetNode.FocusTargetElement focusTargetElement2 = FocusTargetNode.FocusTargetElement.f13444b;
                        hVarC = ComposedModifierKt.c(c1086gP, hVarI2.i(focusTargetElement2).i(FocusTargetPropertiesElement.f15771b).i(focusTargetElement2));
                        cVar = (p013b0.c) c1086gP.x(CompositionLocalsKt.f14847h);
                        layoutDirection = (LayoutDirection) c1086gP.x(CompositionLocalsKt.f14852n);
                        interfaceC1089h0P = c1086gP.P();
                        interfaceC1376t = (InterfaceC1376t) c1086gP.x(Z0.b.f7676a);
                        eVar = (e) c1086gP.x(AndroidCompositionLocals_androidKt.getLocalSavedStateRegistryOwner());
                        if (lVar11 != null) {
                            c1086gP.L(607780130);
                            aVarD2 = d(lVar, c1086gP, i12 & 14);
                            c1086gP.r();
                            if (c1086gP.f12995O) {
                                c1086gP.v(aVarD2);
                            } else {
                                c1086gP.A();
                            }
                            lVar15 = lVar14;
                            lVar9 = lVar13;
                            e(c1086gP, hVarC, i19, cVar, interfaceC1376t, eVar, layoutDirection, interfaceC1089h0P);
                            R0.a(new p<LayoutNode, l<? super T, ? extends r>, r>() { // from class: androidx.compose.ui.viewinterop.AndroidView_androidKt$AndroidView$2$1
                                @Override // Ia.p
                                public final r invoke(LayoutNode layoutNode, Object obj) {
                                    AndroidView_androidKt.c(layoutNode).setResetBlock((l) obj);
                                    return r.f47939a;
                                }
                            }, c1086gP, lVar11);
                            R0.a(new p<LayoutNode, l<? super T, ? extends r>, r>() { // from class: androidx.compose.ui.viewinterop.AndroidView_androidKt$AndroidView$2$2
                                @Override // Ia.p
                                public final r invoke(LayoutNode layoutNode, Object obj) {
                                    AndroidView_androidKt.c(layoutNode).setUpdateBlock((l) obj);
                                    return r.f47939a;
                                }
                            }, c1086gP, lVar15);
                            R0.a(new p<LayoutNode, l<? super T, ? extends r>, r>() { // from class: androidx.compose.ui.viewinterop.AndroidView_androidKt$AndroidView$2$3
                                @Override // Ia.p
                                public final r invoke(LayoutNode layoutNode, Object obj) {
                                    AndroidView_androidKt.c(layoutNode).setReleaseBlock((l) obj);
                                    return r.f47939a;
                                }
                            }, c1086gP, lVar9);
                            c1086gP.T(true);
                            c1086gP.T(false);
                        } else {
                            l<? super T, r> lVar19 = lVar13;
                            l<? super T, r> lVar110 = lVar14;
                            c1086gP.L(608635513);
                            aVarD = d(lVar, c1086gP, i12 & 14);
                            c1086gP.q0(R.styleable.AppCompatTheme_windowMinWidthMinor, 1, null, null);
                            c1086gP.f13013q = true;
                            if (c1086gP.f12995O) {
                                c1086gP.v(aVarD);
                            } else {
                                c1086gP.A();
                            }
                            lVar15 = lVar110;
                            lVar9 = lVar19;
                            e(c1086gP, hVarC, i19, cVar, interfaceC1376t, eVar, layoutDirection, interfaceC1089h0P);
                            R0.a(new p<LayoutNode, l<? super T, ? extends r>, r>() { // from class: androidx.compose.ui.viewinterop.AndroidView_androidKt$AndroidView$3$1
                                @Override // Ia.p
                                public final r invoke(LayoutNode layoutNode, Object obj) {
                                    AndroidView_androidKt.c(layoutNode).setUpdateBlock((l) obj);
                                    return r.f47939a;
                                }
                            }, c1086gP, lVar15);
                            R0.a(new p<LayoutNode, l<? super T, ? extends r>, r>() { // from class: androidx.compose.ui.viewinterop.AndroidView_androidKt$AndroidView$3$2
                                @Override // Ia.p
                                public final r invoke(LayoutNode layoutNode, Object obj) {
                                    AndroidView_androidKt.c(layoutNode).setReleaseBlock((l) obj);
                                    return r.f47939a;
                                }
                            }, c1086gP, lVar9);
                            c1086gP.T(true);
                            c1086gP.T(false);
                        }
                        l<? super T, r> lVar111 = lVar11;
                        lVar10 = lVar15;
                        hVar3 = hVar4;
                        lVar8 = lVar111;
                    } else {
                        c1086gP.w();
                        hVar3 = hVar2;
                        lVar8 = lVar5;
                        lVar9 = lVar6;
                        lVar10 = lVar7;
                    }
                    c1105p0V = c1086gP.V();
                    if (c1105p0V != null) {
                        c1105p0V.f13109d = new p<InterfaceC1084f, Integer, r>() { // from class: androidx.compose.ui.viewinterop.AndroidView_androidKt$AndroidView$4
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            /* JADX WARN: Multi-variable type inference failed */
                            {
                                super(2);
                            }

                            @Override // Ia.p
                            public final r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                                num.intValue();
                                AndroidView_androidKt.a(lVar, hVar3, lVar8, lVar9, lVar10, interfaceC1084f2, L4.b.l(i10 | 1), i11);
                                return r.f47939a;
                            }
                        };
                    }
                }
                i12 |= 3072;
                lVar6 = lVar3;
                i17 = i11 & 16;
                if (i17 != 0) {
                    if ((i10 & 24576) == 0) {
                        lVar7 = lVar4;
                        if (c1086gP.k(lVar7)) {
                            i18 = 16384;
                        } else {
                            i18 = 8192;
                        }
                        i12 |= i18;
                    }
                    if ((i12 & 9363) != 9362) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    if (c1086gP.C(i12 & 1, z10)) {
                        if (i20 != 0) {
                            hVar4 = h.a.f13984b;
                        } else {
                            hVar4 = hVar2;
                        }
                        if (i13 != 0) {
                            lVar11 = null;
                        } else {
                            lVar11 = lVar5;
                        }
                        lVar12 = f15754a;
                        if (i15 != 0) {
                            lVar13 = lVar12;
                        } else {
                            lVar13 = lVar6;
                        }
                        if (i17 != 0) {
                            lVar14 = lVar12;
                        } else {
                            lVar14 = lVar7;
                        }
                        i19 = c1086gP.f12996P;
                        h hVarI3 = hVar4.i(FocusGroupPropertiesElement.f15766b);
                        FocusTargetNode.FocusTargetElement focusTargetElement3 = FocusTargetNode.FocusTargetElement.f13444b;
                        hVarC = ComposedModifierKt.c(c1086gP, hVarI3.i(focusTargetElement3).i(FocusTargetPropertiesElement.f15771b).i(focusTargetElement3));
                        cVar = (p013b0.c) c1086gP.x(CompositionLocalsKt.f14847h);
                        layoutDirection = (LayoutDirection) c1086gP.x(CompositionLocalsKt.f14852n);
                        interfaceC1089h0P = c1086gP.P();
                        interfaceC1376t = (InterfaceC1376t) c1086gP.x(Z0.b.f7676a);
                        eVar = (e) c1086gP.x(AndroidCompositionLocals_androidKt.getLocalSavedStateRegistryOwner());
                        if (lVar11 != null) {
                            c1086gP.L(607780130);
                            aVarD2 = d(lVar, c1086gP, i12 & 14);
                            c1086gP.r();
                            if (c1086gP.f12995O) {
                                c1086gP.v(aVarD2);
                            } else {
                                c1086gP.A();
                            }
                            lVar15 = lVar14;
                            lVar9 = lVar13;
                            e(c1086gP, hVarC, i19, cVar, interfaceC1376t, eVar, layoutDirection, interfaceC1089h0P);
                            R0.a(new p<LayoutNode, l<? super T, ? extends r>, r>() { // from class: androidx.compose.ui.viewinterop.AndroidView_androidKt$AndroidView$2$1
                                @Override // Ia.p
                                public final r invoke(LayoutNode layoutNode, Object obj) {
                                    AndroidView_androidKt.c(layoutNode).setResetBlock((l) obj);
                                    return r.f47939a;
                                }
                            }, c1086gP, lVar11);
                            R0.a(new p<LayoutNode, l<? super T, ? extends r>, r>() { // from class: androidx.compose.ui.viewinterop.AndroidView_androidKt$AndroidView$2$2
                                @Override // Ia.p
                                public final r invoke(LayoutNode layoutNode, Object obj) {
                                    AndroidView_androidKt.c(layoutNode).setUpdateBlock((l) obj);
                                    return r.f47939a;
                                }
                            }, c1086gP, lVar15);
                            R0.a(new p<LayoutNode, l<? super T, ? extends r>, r>() { // from class: androidx.compose.ui.viewinterop.AndroidView_androidKt$AndroidView$2$3
                                @Override // Ia.p
                                public final r invoke(LayoutNode layoutNode, Object obj) {
                                    AndroidView_androidKt.c(layoutNode).setReleaseBlock((l) obj);
                                    return r.f47939a;
                                }
                            }, c1086gP, lVar9);
                            c1086gP.T(true);
                            c1086gP.T(false);
                        } else {
                            l<? super T, r> lVar112 = lVar13;
                            l<? super T, r> lVar113 = lVar14;
                            c1086gP.L(608635513);
                            aVarD = d(lVar, c1086gP, i12 & 14);
                            c1086gP.q0(R.styleable.AppCompatTheme_windowMinWidthMinor, 1, null, null);
                            c1086gP.f13013q = true;
                            if (c1086gP.f12995O) {
                                c1086gP.v(aVarD);
                            } else {
                                c1086gP.A();
                            }
                            lVar15 = lVar113;
                            lVar9 = lVar112;
                            e(c1086gP, hVarC, i19, cVar, interfaceC1376t, eVar, layoutDirection, interfaceC1089h0P);
                            R0.a(new p<LayoutNode, l<? super T, ? extends r>, r>() { // from class: androidx.compose.ui.viewinterop.AndroidView_androidKt$AndroidView$3$1
                                @Override // Ia.p
                                public final r invoke(LayoutNode layoutNode, Object obj) {
                                    AndroidView_androidKt.c(layoutNode).setUpdateBlock((l) obj);
                                    return r.f47939a;
                                }
                            }, c1086gP, lVar15);
                            R0.a(new p<LayoutNode, l<? super T, ? extends r>, r>() { // from class: androidx.compose.ui.viewinterop.AndroidView_androidKt$AndroidView$3$2
                                @Override // Ia.p
                                public final r invoke(LayoutNode layoutNode, Object obj) {
                                    AndroidView_androidKt.c(layoutNode).setReleaseBlock((l) obj);
                                    return r.f47939a;
                                }
                            }, c1086gP, lVar9);
                            c1086gP.T(true);
                            c1086gP.T(false);
                        }
                        l<? super T, r> lVar114 = lVar11;
                        lVar10 = lVar15;
                        hVar3 = hVar4;
                        lVar8 = lVar114;
                    } else {
                        c1086gP.w();
                        hVar3 = hVar2;
                        lVar8 = lVar5;
                        lVar9 = lVar6;
                        lVar10 = lVar7;
                    }
                    c1105p0V = c1086gP.V();
                    if (c1105p0V != null) {
                        c1105p0V.f13109d = new p<InterfaceC1084f, Integer, r>() { // from class: androidx.compose.ui.viewinterop.AndroidView_androidKt$AndroidView$4
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            /* JADX WARN: Multi-variable type inference failed */
                            {
                                super(2);
                            }

                            @Override // Ia.p
                            public final r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                                num.intValue();
                                AndroidView_androidKt.a(lVar, hVar3, lVar8, lVar9, lVar10, interfaceC1084f2, L4.b.l(i10 | 1), i11);
                                return r.f47939a;
                            }
                        };
                    }
                }
                i12 |= 24576;
                lVar7 = lVar4;
                if ((i12 & 9363) != 9362) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (c1086gP.C(i12 & 1, z10)) {
                    if (i20 != 0) {
                        hVar4 = h.a.f13984b;
                    } else {
                        hVar4 = hVar2;
                    }
                    if (i13 != 0) {
                        lVar11 = null;
                    } else {
                        lVar11 = lVar5;
                    }
                    lVar12 = f15754a;
                    if (i15 != 0) {
                        lVar13 = lVar12;
                    } else {
                        lVar13 = lVar6;
                    }
                    if (i17 != 0) {
                        lVar14 = lVar12;
                    } else {
                        lVar14 = lVar7;
                    }
                    i19 = c1086gP.f12996P;
                    h hVarI4 = hVar4.i(FocusGroupPropertiesElement.f15766b);
                    FocusTargetNode.FocusTargetElement focusTargetElement4 = FocusTargetNode.FocusTargetElement.f13444b;
                    hVarC = ComposedModifierKt.c(c1086gP, hVarI4.i(focusTargetElement4).i(FocusTargetPropertiesElement.f15771b).i(focusTargetElement4));
                    cVar = (p013b0.c) c1086gP.x(CompositionLocalsKt.f14847h);
                    layoutDirection = (LayoutDirection) c1086gP.x(CompositionLocalsKt.f14852n);
                    interfaceC1089h0P = c1086gP.P();
                    interfaceC1376t = (InterfaceC1376t) c1086gP.x(Z0.b.f7676a);
                    eVar = (e) c1086gP.x(AndroidCompositionLocals_androidKt.getLocalSavedStateRegistryOwner());
                    if (lVar11 != null) {
                        c1086gP.L(607780130);
                        aVarD2 = d(lVar, c1086gP, i12 & 14);
                        c1086gP.r();
                        if (c1086gP.f12995O) {
                            c1086gP.v(aVarD2);
                        } else {
                            c1086gP.A();
                        }
                        lVar15 = lVar14;
                        lVar9 = lVar13;
                        e(c1086gP, hVarC, i19, cVar, interfaceC1376t, eVar, layoutDirection, interfaceC1089h0P);
                        R0.a(new p<LayoutNode, l<? super T, ? extends r>, r>() { // from class: androidx.compose.ui.viewinterop.AndroidView_androidKt$AndroidView$2$1
                            @Override // Ia.p
                            public final r invoke(LayoutNode layoutNode, Object obj) {
                                AndroidView_androidKt.c(layoutNode).setResetBlock((l) obj);
                                return r.f47939a;
                            }
                        }, c1086gP, lVar11);
                        R0.a(new p<LayoutNode, l<? super T, ? extends r>, r>() { // from class: androidx.compose.ui.viewinterop.AndroidView_androidKt$AndroidView$2$2
                            @Override // Ia.p
                            public final r invoke(LayoutNode layoutNode, Object obj) {
                                AndroidView_androidKt.c(layoutNode).setUpdateBlock((l) obj);
                                return r.f47939a;
                            }
                        }, c1086gP, lVar15);
                        R0.a(new p<LayoutNode, l<? super T, ? extends r>, r>() { // from class: androidx.compose.ui.viewinterop.AndroidView_androidKt$AndroidView$2$3
                            @Override // Ia.p
                            public final r invoke(LayoutNode layoutNode, Object obj) {
                                AndroidView_androidKt.c(layoutNode).setReleaseBlock((l) obj);
                                return r.f47939a;
                            }
                        }, c1086gP, lVar9);
                        c1086gP.T(true);
                        c1086gP.T(false);
                    } else {
                        l<? super T, r> lVar115 = lVar13;
                        l<? super T, r> lVar116 = lVar14;
                        c1086gP.L(608635513);
                        aVarD = d(lVar, c1086gP, i12 & 14);
                        c1086gP.q0(R.styleable.AppCompatTheme_windowMinWidthMinor, 1, null, null);
                        c1086gP.f13013q = true;
                        if (c1086gP.f12995O) {
                            c1086gP.v(aVarD);
                        } else {
                            c1086gP.A();
                        }
                        lVar15 = lVar116;
                        lVar9 = lVar115;
                        e(c1086gP, hVarC, i19, cVar, interfaceC1376t, eVar, layoutDirection, interfaceC1089h0P);
                        R0.a(new p<LayoutNode, l<? super T, ? extends r>, r>() { // from class: androidx.compose.ui.viewinterop.AndroidView_androidKt$AndroidView$3$1
                            @Override // Ia.p
                            public final r invoke(LayoutNode layoutNode, Object obj) {
                                AndroidView_androidKt.c(layoutNode).setUpdateBlock((l) obj);
                                return r.f47939a;
                            }
                        }, c1086gP, lVar15);
                        R0.a(new p<LayoutNode, l<? super T, ? extends r>, r>() { // from class: androidx.compose.ui.viewinterop.AndroidView_androidKt$AndroidView$3$2
                            @Override // Ia.p
                            public final r invoke(LayoutNode layoutNode, Object obj) {
                                AndroidView_androidKt.c(layoutNode).setReleaseBlock((l) obj);
                                return r.f47939a;
                            }
                        }, c1086gP, lVar9);
                        c1086gP.T(true);
                        c1086gP.T(false);
                    }
                    l<? super T, r> lVar117 = lVar11;
                    lVar10 = lVar15;
                    hVar3 = hVar4;
                    lVar8 = lVar117;
                } else {
                    c1086gP.w();
                    hVar3 = hVar2;
                    lVar8 = lVar5;
                    lVar9 = lVar6;
                    lVar10 = lVar7;
                }
                c1105p0V = c1086gP.V();
                if (c1105p0V != null) {
                    c1105p0V.f13109d = new p<InterfaceC1084f, Integer, r>() { // from class: androidx.compose.ui.viewinterop.AndroidView_androidKt$AndroidView$4
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        /* JADX WARN: Multi-variable type inference failed */
                        {
                            super(2);
                        }

                        @Override // Ia.p
                        public final r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                            num.intValue();
                            AndroidView_androidKt.a(lVar, hVar3, lVar8, lVar9, lVar10, interfaceC1084f2, L4.b.l(i10 | 1), i11);
                            return r.f47939a;
                        }
                    };
                }
            }
            i12 |= 384;
            lVar5 = lVar2;
            i15 = i11 & 8;
            if (i15 != 0) {
                if ((i10 & 3072) == 0) {
                    lVar6 = lVar3;
                    if (c1086gP.k(lVar6)) {
                        i16 = 2048;
                    } else {
                        i16 = 1024;
                    }
                    i12 |= i16;
                }
                i17 = i11 & 16;
                if (i17 != 0) {
                    if ((i10 & 24576) == 0) {
                        lVar7 = lVar4;
                        if (c1086gP.k(lVar7)) {
                            i18 = 16384;
                        } else {
                            i18 = 8192;
                        }
                        i12 |= i18;
                    }
                    if ((i12 & 9363) != 9362) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    if (c1086gP.C(i12 & 1, z10)) {
                        if (i20 != 0) {
                            hVar4 = h.a.f13984b;
                        } else {
                            hVar4 = hVar2;
                        }
                        if (i13 != 0) {
                            lVar11 = null;
                        } else {
                            lVar11 = lVar5;
                        }
                        lVar12 = f15754a;
                        if (i15 != 0) {
                            lVar13 = lVar12;
                        } else {
                            lVar13 = lVar6;
                        }
                        if (i17 != 0) {
                            lVar14 = lVar12;
                        } else {
                            lVar14 = lVar7;
                        }
                        i19 = c1086gP.f12996P;
                        h hVarI5 = hVar4.i(FocusGroupPropertiesElement.f15766b);
                        FocusTargetNode.FocusTargetElement focusTargetElement5 = FocusTargetNode.FocusTargetElement.f13444b;
                        hVarC = ComposedModifierKt.c(c1086gP, hVarI5.i(focusTargetElement5).i(FocusTargetPropertiesElement.f15771b).i(focusTargetElement5));
                        cVar = (p013b0.c) c1086gP.x(CompositionLocalsKt.f14847h);
                        layoutDirection = (LayoutDirection) c1086gP.x(CompositionLocalsKt.f14852n);
                        interfaceC1089h0P = c1086gP.P();
                        interfaceC1376t = (InterfaceC1376t) c1086gP.x(Z0.b.f7676a);
                        eVar = (e) c1086gP.x(AndroidCompositionLocals_androidKt.getLocalSavedStateRegistryOwner());
                        if (lVar11 != null) {
                            c1086gP.L(607780130);
                            aVarD2 = d(lVar, c1086gP, i12 & 14);
                            c1086gP.r();
                            if (c1086gP.f12995O) {
                                c1086gP.v(aVarD2);
                            } else {
                                c1086gP.A();
                            }
                            lVar15 = lVar14;
                            lVar9 = lVar13;
                            e(c1086gP, hVarC, i19, cVar, interfaceC1376t, eVar, layoutDirection, interfaceC1089h0P);
                            R0.a(new p<LayoutNode, l<? super T, ? extends r>, r>() { // from class: androidx.compose.ui.viewinterop.AndroidView_androidKt$AndroidView$2$1
                                @Override // Ia.p
                                public final r invoke(LayoutNode layoutNode, Object obj) {
                                    AndroidView_androidKt.c(layoutNode).setResetBlock((l) obj);
                                    return r.f47939a;
                                }
                            }, c1086gP, lVar11);
                            R0.a(new p<LayoutNode, l<? super T, ? extends r>, r>() { // from class: androidx.compose.ui.viewinterop.AndroidView_androidKt$AndroidView$2$2
                                @Override // Ia.p
                                public final r invoke(LayoutNode layoutNode, Object obj) {
                                    AndroidView_androidKt.c(layoutNode).setUpdateBlock((l) obj);
                                    return r.f47939a;
                                }
                            }, c1086gP, lVar15);
                            R0.a(new p<LayoutNode, l<? super T, ? extends r>, r>() { // from class: androidx.compose.ui.viewinterop.AndroidView_androidKt$AndroidView$2$3
                                @Override // Ia.p
                                public final r invoke(LayoutNode layoutNode, Object obj) {
                                    AndroidView_androidKt.c(layoutNode).setReleaseBlock((l) obj);
                                    return r.f47939a;
                                }
                            }, c1086gP, lVar9);
                            c1086gP.T(true);
                            c1086gP.T(false);
                        } else {
                            l<? super T, r> lVar118 = lVar13;
                            l<? super T, r> lVar119 = lVar14;
                            c1086gP.L(608635513);
                            aVarD = d(lVar, c1086gP, i12 & 14);
                            c1086gP.q0(R.styleable.AppCompatTheme_windowMinWidthMinor, 1, null, null);
                            c1086gP.f13013q = true;
                            if (c1086gP.f12995O) {
                                c1086gP.v(aVarD);
                            } else {
                                c1086gP.A();
                            }
                            lVar15 = lVar119;
                            lVar9 = lVar118;
                            e(c1086gP, hVarC, i19, cVar, interfaceC1376t, eVar, layoutDirection, interfaceC1089h0P);
                            R0.a(new p<LayoutNode, l<? super T, ? extends r>, r>() { // from class: androidx.compose.ui.viewinterop.AndroidView_androidKt$AndroidView$3$1
                                @Override // Ia.p
                                public final r invoke(LayoutNode layoutNode, Object obj) {
                                    AndroidView_androidKt.c(layoutNode).setUpdateBlock((l) obj);
                                    return r.f47939a;
                                }
                            }, c1086gP, lVar15);
                            R0.a(new p<LayoutNode, l<? super T, ? extends r>, r>() { // from class: androidx.compose.ui.viewinterop.AndroidView_androidKt$AndroidView$3$2
                                @Override // Ia.p
                                public final r invoke(LayoutNode layoutNode, Object obj) {
                                    AndroidView_androidKt.c(layoutNode).setReleaseBlock((l) obj);
                                    return r.f47939a;
                                }
                            }, c1086gP, lVar9);
                            c1086gP.T(true);
                            c1086gP.T(false);
                        }
                        l<? super T, r> lVar1110 = lVar11;
                        lVar10 = lVar15;
                        hVar3 = hVar4;
                        lVar8 = lVar1110;
                    } else {
                        c1086gP.w();
                        hVar3 = hVar2;
                        lVar8 = lVar5;
                        lVar9 = lVar6;
                        lVar10 = lVar7;
                    }
                    c1105p0V = c1086gP.V();
                    if (c1105p0V != null) {
                        c1105p0V.f13109d = new p<InterfaceC1084f, Integer, r>() { // from class: androidx.compose.ui.viewinterop.AndroidView_androidKt$AndroidView$4
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            /* JADX WARN: Multi-variable type inference failed */
                            {
                                super(2);
                            }

                            @Override // Ia.p
                            public final r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                                num.intValue();
                                AndroidView_androidKt.a(lVar, hVar3, lVar8, lVar9, lVar10, interfaceC1084f2, L4.b.l(i10 | 1), i11);
                                return r.f47939a;
                            }
                        };
                    }
                }
                i12 |= 24576;
                lVar7 = lVar4;
                if ((i12 & 9363) != 9362) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (c1086gP.C(i12 & 1, z10)) {
                    if (i20 != 0) {
                        hVar4 = h.a.f13984b;
                    } else {
                        hVar4 = hVar2;
                    }
                    if (i13 != 0) {
                        lVar11 = null;
                    } else {
                        lVar11 = lVar5;
                    }
                    lVar12 = f15754a;
                    if (i15 != 0) {
                        lVar13 = lVar12;
                    } else {
                        lVar13 = lVar6;
                    }
                    if (i17 != 0) {
                        lVar14 = lVar12;
                    } else {
                        lVar14 = lVar7;
                    }
                    i19 = c1086gP.f12996P;
                    h hVarI6 = hVar4.i(FocusGroupPropertiesElement.f15766b);
                    FocusTargetNode.FocusTargetElement focusTargetElement6 = FocusTargetNode.FocusTargetElement.f13444b;
                    hVarC = ComposedModifierKt.c(c1086gP, hVarI6.i(focusTargetElement6).i(FocusTargetPropertiesElement.f15771b).i(focusTargetElement6));
                    cVar = (p013b0.c) c1086gP.x(CompositionLocalsKt.f14847h);
                    layoutDirection = (LayoutDirection) c1086gP.x(CompositionLocalsKt.f14852n);
                    interfaceC1089h0P = c1086gP.P();
                    interfaceC1376t = (InterfaceC1376t) c1086gP.x(Z0.b.f7676a);
                    eVar = (e) c1086gP.x(AndroidCompositionLocals_androidKt.getLocalSavedStateRegistryOwner());
                    if (lVar11 != null) {
                        c1086gP.L(607780130);
                        aVarD2 = d(lVar, c1086gP, i12 & 14);
                        c1086gP.r();
                        if (c1086gP.f12995O) {
                            c1086gP.v(aVarD2);
                        } else {
                            c1086gP.A();
                        }
                        lVar15 = lVar14;
                        lVar9 = lVar13;
                        e(c1086gP, hVarC, i19, cVar, interfaceC1376t, eVar, layoutDirection, interfaceC1089h0P);
                        R0.a(new p<LayoutNode, l<? super T, ? extends r>, r>() { // from class: androidx.compose.ui.viewinterop.AndroidView_androidKt$AndroidView$2$1
                            @Override // Ia.p
                            public final r invoke(LayoutNode layoutNode, Object obj) {
                                AndroidView_androidKt.c(layoutNode).setResetBlock((l) obj);
                                return r.f47939a;
                            }
                        }, c1086gP, lVar11);
                        R0.a(new p<LayoutNode, l<? super T, ? extends r>, r>() { // from class: androidx.compose.ui.viewinterop.AndroidView_androidKt$AndroidView$2$2
                            @Override // Ia.p
                            public final r invoke(LayoutNode layoutNode, Object obj) {
                                AndroidView_androidKt.c(layoutNode).setUpdateBlock((l) obj);
                                return r.f47939a;
                            }
                        }, c1086gP, lVar15);
                        R0.a(new p<LayoutNode, l<? super T, ? extends r>, r>() { // from class: androidx.compose.ui.viewinterop.AndroidView_androidKt$AndroidView$2$3
                            @Override // Ia.p
                            public final r invoke(LayoutNode layoutNode, Object obj) {
                                AndroidView_androidKt.c(layoutNode).setReleaseBlock((l) obj);
                                return r.f47939a;
                            }
                        }, c1086gP, lVar9);
                        c1086gP.T(true);
                        c1086gP.T(false);
                    } else {
                        l<? super T, r> lVar1111 = lVar13;
                        l<? super T, r> lVar1112 = lVar14;
                        c1086gP.L(608635513);
                        aVarD = d(lVar, c1086gP, i12 & 14);
                        c1086gP.q0(R.styleable.AppCompatTheme_windowMinWidthMinor, 1, null, null);
                        c1086gP.f13013q = true;
                        if (c1086gP.f12995O) {
                            c1086gP.v(aVarD);
                        } else {
                            c1086gP.A();
                        }
                        lVar15 = lVar1112;
                        lVar9 = lVar1111;
                        e(c1086gP, hVarC, i19, cVar, interfaceC1376t, eVar, layoutDirection, interfaceC1089h0P);
                        R0.a(new p<LayoutNode, l<? super T, ? extends r>, r>() { // from class: androidx.compose.ui.viewinterop.AndroidView_androidKt$AndroidView$3$1
                            @Override // Ia.p
                            public final r invoke(LayoutNode layoutNode, Object obj) {
                                AndroidView_androidKt.c(layoutNode).setUpdateBlock((l) obj);
                                return r.f47939a;
                            }
                        }, c1086gP, lVar15);
                        R0.a(new p<LayoutNode, l<? super T, ? extends r>, r>() { // from class: androidx.compose.ui.viewinterop.AndroidView_androidKt$AndroidView$3$2
                            @Override // Ia.p
                            public final r invoke(LayoutNode layoutNode, Object obj) {
                                AndroidView_androidKt.c(layoutNode).setReleaseBlock((l) obj);
                                return r.f47939a;
                            }
                        }, c1086gP, lVar9);
                        c1086gP.T(true);
                        c1086gP.T(false);
                    }
                    l<? super T, r> lVar1113 = lVar11;
                    lVar10 = lVar15;
                    hVar3 = hVar4;
                    lVar8 = lVar1113;
                } else {
                    c1086gP.w();
                    hVar3 = hVar2;
                    lVar8 = lVar5;
                    lVar9 = lVar6;
                    lVar10 = lVar7;
                }
                c1105p0V = c1086gP.V();
                if (c1105p0V != null) {
                    c1105p0V.f13109d = new p<InterfaceC1084f, Integer, r>() { // from class: androidx.compose.ui.viewinterop.AndroidView_androidKt$AndroidView$4
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        /* JADX WARN: Multi-variable type inference failed */
                        {
                            super(2);
                        }

                        @Override // Ia.p
                        public final r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                            num.intValue();
                            AndroidView_androidKt.a(lVar, hVar3, lVar8, lVar9, lVar10, interfaceC1084f2, L4.b.l(i10 | 1), i11);
                            return r.f47939a;
                        }
                    };
                }
            }
            i12 |= 3072;
            lVar6 = lVar3;
            i17 = i11 & 16;
            if (i17 != 0) {
                if ((i10 & 24576) == 0) {
                    lVar7 = lVar4;
                    if (c1086gP.k(lVar7)) {
                        i18 = 16384;
                    } else {
                        i18 = 8192;
                    }
                    i12 |= i18;
                }
                if ((i12 & 9363) != 9362) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (c1086gP.C(i12 & 1, z10)) {
                    if (i20 != 0) {
                        hVar4 = h.a.f13984b;
                    } else {
                        hVar4 = hVar2;
                    }
                    if (i13 != 0) {
                        lVar11 = null;
                    } else {
                        lVar11 = lVar5;
                    }
                    lVar12 = f15754a;
                    if (i15 != 0) {
                        lVar13 = lVar12;
                    } else {
                        lVar13 = lVar6;
                    }
                    if (i17 != 0) {
                        lVar14 = lVar12;
                    } else {
                        lVar14 = lVar7;
                    }
                    i19 = c1086gP.f12996P;
                    h hVarI7 = hVar4.i(FocusGroupPropertiesElement.f15766b);
                    FocusTargetNode.FocusTargetElement focusTargetElement7 = FocusTargetNode.FocusTargetElement.f13444b;
                    hVarC = ComposedModifierKt.c(c1086gP, hVarI7.i(focusTargetElement7).i(FocusTargetPropertiesElement.f15771b).i(focusTargetElement7));
                    cVar = (p013b0.c) c1086gP.x(CompositionLocalsKt.f14847h);
                    layoutDirection = (LayoutDirection) c1086gP.x(CompositionLocalsKt.f14852n);
                    interfaceC1089h0P = c1086gP.P();
                    interfaceC1376t = (InterfaceC1376t) c1086gP.x(Z0.b.f7676a);
                    eVar = (e) c1086gP.x(AndroidCompositionLocals_androidKt.getLocalSavedStateRegistryOwner());
                    if (lVar11 != null) {
                        c1086gP.L(607780130);
                        aVarD2 = d(lVar, c1086gP, i12 & 14);
                        c1086gP.r();
                        if (c1086gP.f12995O) {
                            c1086gP.v(aVarD2);
                        } else {
                            c1086gP.A();
                        }
                        lVar15 = lVar14;
                        lVar9 = lVar13;
                        e(c1086gP, hVarC, i19, cVar, interfaceC1376t, eVar, layoutDirection, interfaceC1089h0P);
                        R0.a(new p<LayoutNode, l<? super T, ? extends r>, r>() { // from class: androidx.compose.ui.viewinterop.AndroidView_androidKt$AndroidView$2$1
                            @Override // Ia.p
                            public final r invoke(LayoutNode layoutNode, Object obj) {
                                AndroidView_androidKt.c(layoutNode).setResetBlock((l) obj);
                                return r.f47939a;
                            }
                        }, c1086gP, lVar11);
                        R0.a(new p<LayoutNode, l<? super T, ? extends r>, r>() { // from class: androidx.compose.ui.viewinterop.AndroidView_androidKt$AndroidView$2$2
                            @Override // Ia.p
                            public final r invoke(LayoutNode layoutNode, Object obj) {
                                AndroidView_androidKt.c(layoutNode).setUpdateBlock((l) obj);
                                return r.f47939a;
                            }
                        }, c1086gP, lVar15);
                        R0.a(new p<LayoutNode, l<? super T, ? extends r>, r>() { // from class: androidx.compose.ui.viewinterop.AndroidView_androidKt$AndroidView$2$3
                            @Override // Ia.p
                            public final r invoke(LayoutNode layoutNode, Object obj) {
                                AndroidView_androidKt.c(layoutNode).setReleaseBlock((l) obj);
                                return r.f47939a;
                            }
                        }, c1086gP, lVar9);
                        c1086gP.T(true);
                        c1086gP.T(false);
                    } else {
                        l<? super T, r> lVar1114 = lVar13;
                        l<? super T, r> lVar1115 = lVar14;
                        c1086gP.L(608635513);
                        aVarD = d(lVar, c1086gP, i12 & 14);
                        c1086gP.q0(R.styleable.AppCompatTheme_windowMinWidthMinor, 1, null, null);
                        c1086gP.f13013q = true;
                        if (c1086gP.f12995O) {
                            c1086gP.v(aVarD);
                        } else {
                            c1086gP.A();
                        }
                        lVar15 = lVar1115;
                        lVar9 = lVar1114;
                        e(c1086gP, hVarC, i19, cVar, interfaceC1376t, eVar, layoutDirection, interfaceC1089h0P);
                        R0.a(new p<LayoutNode, l<? super T, ? extends r>, r>() { // from class: androidx.compose.ui.viewinterop.AndroidView_androidKt$AndroidView$3$1
                            @Override // Ia.p
                            public final r invoke(LayoutNode layoutNode, Object obj) {
                                AndroidView_androidKt.c(layoutNode).setUpdateBlock((l) obj);
                                return r.f47939a;
                            }
                        }, c1086gP, lVar15);
                        R0.a(new p<LayoutNode, l<? super T, ? extends r>, r>() { // from class: androidx.compose.ui.viewinterop.AndroidView_androidKt$AndroidView$3$2
                            @Override // Ia.p
                            public final r invoke(LayoutNode layoutNode, Object obj) {
                                AndroidView_androidKt.c(layoutNode).setReleaseBlock((l) obj);
                                return r.f47939a;
                            }
                        }, c1086gP, lVar9);
                        c1086gP.T(true);
                        c1086gP.T(false);
                    }
                    l<? super T, r> lVar1116 = lVar11;
                    lVar10 = lVar15;
                    hVar3 = hVar4;
                    lVar8 = lVar1116;
                } else {
                    c1086gP.w();
                    hVar3 = hVar2;
                    lVar8 = lVar5;
                    lVar9 = lVar6;
                    lVar10 = lVar7;
                }
                c1105p0V = c1086gP.V();
                if (c1105p0V != null) {
                    c1105p0V.f13109d = new p<InterfaceC1084f, Integer, r>() { // from class: androidx.compose.ui.viewinterop.AndroidView_androidKt$AndroidView$4
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        /* JADX WARN: Multi-variable type inference failed */
                        {
                            super(2);
                        }

                        @Override // Ia.p
                        public final r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                            num.intValue();
                            AndroidView_androidKt.a(lVar, hVar3, lVar8, lVar9, lVar10, interfaceC1084f2, L4.b.l(i10 | 1), i11);
                            return r.f47939a;
                        }
                    };
                }
            }
            i12 |= 24576;
            lVar7 = lVar4;
            if ((i12 & 9363) != 9362) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (c1086gP.C(i12 & 1, z10)) {
                if (i20 != 0) {
                    hVar4 = h.a.f13984b;
                } else {
                    hVar4 = hVar2;
                }
                if (i13 != 0) {
                    lVar11 = null;
                } else {
                    lVar11 = lVar5;
                }
                lVar12 = f15754a;
                if (i15 != 0) {
                    lVar13 = lVar12;
                } else {
                    lVar13 = lVar6;
                }
                if (i17 != 0) {
                    lVar14 = lVar12;
                } else {
                    lVar14 = lVar7;
                }
                i19 = c1086gP.f12996P;
                h hVarI8 = hVar4.i(FocusGroupPropertiesElement.f15766b);
                FocusTargetNode.FocusTargetElement focusTargetElement8 = FocusTargetNode.FocusTargetElement.f13444b;
                hVarC = ComposedModifierKt.c(c1086gP, hVarI8.i(focusTargetElement8).i(FocusTargetPropertiesElement.f15771b).i(focusTargetElement8));
                cVar = (p013b0.c) c1086gP.x(CompositionLocalsKt.f14847h);
                layoutDirection = (LayoutDirection) c1086gP.x(CompositionLocalsKt.f14852n);
                interfaceC1089h0P = c1086gP.P();
                interfaceC1376t = (InterfaceC1376t) c1086gP.x(Z0.b.f7676a);
                eVar = (e) c1086gP.x(AndroidCompositionLocals_androidKt.getLocalSavedStateRegistryOwner());
                if (lVar11 != null) {
                    c1086gP.L(607780130);
                    aVarD2 = d(lVar, c1086gP, i12 & 14);
                    c1086gP.r();
                    if (c1086gP.f12995O) {
                        c1086gP.v(aVarD2);
                    } else {
                        c1086gP.A();
                    }
                    lVar15 = lVar14;
                    lVar9 = lVar13;
                    e(c1086gP, hVarC, i19, cVar, interfaceC1376t, eVar, layoutDirection, interfaceC1089h0P);
                    R0.a(new p<LayoutNode, l<? super T, ? extends r>, r>() { // from class: androidx.compose.ui.viewinterop.AndroidView_androidKt$AndroidView$2$1
                        @Override // Ia.p
                        public final r invoke(LayoutNode layoutNode, Object obj) {
                            AndroidView_androidKt.c(layoutNode).setResetBlock((l) obj);
                            return r.f47939a;
                        }
                    }, c1086gP, lVar11);
                    R0.a(new p<LayoutNode, l<? super T, ? extends r>, r>() { // from class: androidx.compose.ui.viewinterop.AndroidView_androidKt$AndroidView$2$2
                        @Override // Ia.p
                        public final r invoke(LayoutNode layoutNode, Object obj) {
                            AndroidView_androidKt.c(layoutNode).setUpdateBlock((l) obj);
                            return r.f47939a;
                        }
                    }, c1086gP, lVar15);
                    R0.a(new p<LayoutNode, l<? super T, ? extends r>, r>() { // from class: androidx.compose.ui.viewinterop.AndroidView_androidKt$AndroidView$2$3
                        @Override // Ia.p
                        public final r invoke(LayoutNode layoutNode, Object obj) {
                            AndroidView_androidKt.c(layoutNode).setReleaseBlock((l) obj);
                            return r.f47939a;
                        }
                    }, c1086gP, lVar9);
                    c1086gP.T(true);
                    c1086gP.T(false);
                } else {
                    l<? super T, r> lVar1117 = lVar13;
                    l<? super T, r> lVar1118 = lVar14;
                    c1086gP.L(608635513);
                    aVarD = d(lVar, c1086gP, i12 & 14);
                    c1086gP.q0(R.styleable.AppCompatTheme_windowMinWidthMinor, 1, null, null);
                    c1086gP.f13013q = true;
                    if (c1086gP.f12995O) {
                        c1086gP.v(aVarD);
                    } else {
                        c1086gP.A();
                    }
                    lVar15 = lVar1118;
                    lVar9 = lVar1117;
                    e(c1086gP, hVarC, i19, cVar, interfaceC1376t, eVar, layoutDirection, interfaceC1089h0P);
                    R0.a(new p<LayoutNode, l<? super T, ? extends r>, r>() { // from class: androidx.compose.ui.viewinterop.AndroidView_androidKt$AndroidView$3$1
                        @Override // Ia.p
                        public final r invoke(LayoutNode layoutNode, Object obj) {
                            AndroidView_androidKt.c(layoutNode).setUpdateBlock((l) obj);
                            return r.f47939a;
                        }
                    }, c1086gP, lVar15);
                    R0.a(new p<LayoutNode, l<? super T, ? extends r>, r>() { // from class: androidx.compose.ui.viewinterop.AndroidView_androidKt$AndroidView$3$2
                        @Override // Ia.p
                        public final r invoke(LayoutNode layoutNode, Object obj) {
                            AndroidView_androidKt.c(layoutNode).setReleaseBlock((l) obj);
                            return r.f47939a;
                        }
                    }, c1086gP, lVar9);
                    c1086gP.T(true);
                    c1086gP.T(false);
                }
                l<? super T, r> lVar1119 = lVar11;
                lVar10 = lVar15;
                hVar3 = hVar4;
                lVar8 = lVar1119;
            } else {
                c1086gP.w();
                hVar3 = hVar2;
                lVar8 = lVar5;
                lVar9 = lVar6;
                lVar10 = lVar7;
            }
            c1105p0V = c1086gP.V();
            if (c1105p0V != null) {
                c1105p0V.f13109d = new p<InterfaceC1084f, Integer, r>() { // from class: androidx.compose.ui.viewinterop.AndroidView_androidKt$AndroidView$4
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(2);
                    }

                    @Override // Ia.p
                    public final r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                        num.intValue();
                        AndroidView_androidKt.a(lVar, hVar3, lVar8, lVar9, lVar10, interfaceC1084f2, L4.b.l(i10 | 1), i11);
                        return r.f47939a;
                    }
                };
            }
        }
        i12 |= 48;
        hVar2 = hVar;
        i13 = i11 & 4;
        if (i13 != 0) {
            if ((i10 & 384) == 0) {
                lVar5 = lVar2;
                if (c1086gP.k(lVar5)) {
                    i14 = 256;
                } else {
                    i14 = 128;
                }
                i12 |= i14;
            }
            i15 = i11 & 8;
            if (i15 != 0) {
                if ((i10 & 3072) == 0) {
                    lVar6 = lVar3;
                    if (c1086gP.k(lVar6)) {
                        i16 = 2048;
                    } else {
                        i16 = 1024;
                    }
                    i12 |= i16;
                }
                i17 = i11 & 16;
                if (i17 != 0) {
                    if ((i10 & 24576) == 0) {
                        lVar7 = lVar4;
                        if (c1086gP.k(lVar7)) {
                            i18 = 16384;
                        } else {
                            i18 = 8192;
                        }
                        i12 |= i18;
                    }
                    if ((i12 & 9363) != 9362) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    if (c1086gP.C(i12 & 1, z10)) {
                        if (i20 != 0) {
                            hVar4 = h.a.f13984b;
                        } else {
                            hVar4 = hVar2;
                        }
                        if (i13 != 0) {
                            lVar11 = null;
                        } else {
                            lVar11 = lVar5;
                        }
                        lVar12 = f15754a;
                        if (i15 != 0) {
                            lVar13 = lVar12;
                        } else {
                            lVar13 = lVar6;
                        }
                        if (i17 != 0) {
                            lVar14 = lVar12;
                        } else {
                            lVar14 = lVar7;
                        }
                        i19 = c1086gP.f12996P;
                        h hVarI9 = hVar4.i(FocusGroupPropertiesElement.f15766b);
                        FocusTargetNode.FocusTargetElement focusTargetElement9 = FocusTargetNode.FocusTargetElement.f13444b;
                        hVarC = ComposedModifierKt.c(c1086gP, hVarI9.i(focusTargetElement9).i(FocusTargetPropertiesElement.f15771b).i(focusTargetElement9));
                        cVar = (p013b0.c) c1086gP.x(CompositionLocalsKt.f14847h);
                        layoutDirection = (LayoutDirection) c1086gP.x(CompositionLocalsKt.f14852n);
                        interfaceC1089h0P = c1086gP.P();
                        interfaceC1376t = (InterfaceC1376t) c1086gP.x(Z0.b.f7676a);
                        eVar = (e) c1086gP.x(AndroidCompositionLocals_androidKt.getLocalSavedStateRegistryOwner());
                        if (lVar11 != null) {
                            c1086gP.L(607780130);
                            aVarD2 = d(lVar, c1086gP, i12 & 14);
                            c1086gP.r();
                            if (c1086gP.f12995O) {
                                c1086gP.v(aVarD2);
                            } else {
                                c1086gP.A();
                            }
                            lVar15 = lVar14;
                            lVar9 = lVar13;
                            e(c1086gP, hVarC, i19, cVar, interfaceC1376t, eVar, layoutDirection, interfaceC1089h0P);
                            R0.a(new p<LayoutNode, l<? super T, ? extends r>, r>() { // from class: androidx.compose.ui.viewinterop.AndroidView_androidKt$AndroidView$2$1
                                @Override // Ia.p
                                public final r invoke(LayoutNode layoutNode, Object obj) {
                                    AndroidView_androidKt.c(layoutNode).setResetBlock((l) obj);
                                    return r.f47939a;
                                }
                            }, c1086gP, lVar11);
                            R0.a(new p<LayoutNode, l<? super T, ? extends r>, r>() { // from class: androidx.compose.ui.viewinterop.AndroidView_androidKt$AndroidView$2$2
                                @Override // Ia.p
                                public final r invoke(LayoutNode layoutNode, Object obj) {
                                    AndroidView_androidKt.c(layoutNode).setUpdateBlock((l) obj);
                                    return r.f47939a;
                                }
                            }, c1086gP, lVar15);
                            R0.a(new p<LayoutNode, l<? super T, ? extends r>, r>() { // from class: androidx.compose.ui.viewinterop.AndroidView_androidKt$AndroidView$2$3
                                @Override // Ia.p
                                public final r invoke(LayoutNode layoutNode, Object obj) {
                                    AndroidView_androidKt.c(layoutNode).setReleaseBlock((l) obj);
                                    return r.f47939a;
                                }
                            }, c1086gP, lVar9);
                            c1086gP.T(true);
                            c1086gP.T(false);
                        } else {
                            l<? super T, r> lVar11110 = lVar13;
                            l<? super T, r> lVar11111 = lVar14;
                            c1086gP.L(608635513);
                            aVarD = d(lVar, c1086gP, i12 & 14);
                            c1086gP.q0(R.styleable.AppCompatTheme_windowMinWidthMinor, 1, null, null);
                            c1086gP.f13013q = true;
                            if (c1086gP.f12995O) {
                                c1086gP.v(aVarD);
                            } else {
                                c1086gP.A();
                            }
                            lVar15 = lVar11111;
                            lVar9 = lVar11110;
                            e(c1086gP, hVarC, i19, cVar, interfaceC1376t, eVar, layoutDirection, interfaceC1089h0P);
                            R0.a(new p<LayoutNode, l<? super T, ? extends r>, r>() { // from class: androidx.compose.ui.viewinterop.AndroidView_androidKt$AndroidView$3$1
                                @Override // Ia.p
                                public final r invoke(LayoutNode layoutNode, Object obj) {
                                    AndroidView_androidKt.c(layoutNode).setUpdateBlock((l) obj);
                                    return r.f47939a;
                                }
                            }, c1086gP, lVar15);
                            R0.a(new p<LayoutNode, l<? super T, ? extends r>, r>() { // from class: androidx.compose.ui.viewinterop.AndroidView_androidKt$AndroidView$3$2
                                @Override // Ia.p
                                public final r invoke(LayoutNode layoutNode, Object obj) {
                                    AndroidView_androidKt.c(layoutNode).setReleaseBlock((l) obj);
                                    return r.f47939a;
                                }
                            }, c1086gP, lVar9);
                            c1086gP.T(true);
                            c1086gP.T(false);
                        }
                        l<? super T, r> lVar11112 = lVar11;
                        lVar10 = lVar15;
                        hVar3 = hVar4;
                        lVar8 = lVar11112;
                    } else {
                        c1086gP.w();
                        hVar3 = hVar2;
                        lVar8 = lVar5;
                        lVar9 = lVar6;
                        lVar10 = lVar7;
                    }
                    c1105p0V = c1086gP.V();
                    if (c1105p0V != null) {
                        c1105p0V.f13109d = new p<InterfaceC1084f, Integer, r>() { // from class: androidx.compose.ui.viewinterop.AndroidView_androidKt$AndroidView$4
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            /* JADX WARN: Multi-variable type inference failed */
                            {
                                super(2);
                            }

                            @Override // Ia.p
                            public final r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                                num.intValue();
                                AndroidView_androidKt.a(lVar, hVar3, lVar8, lVar9, lVar10, interfaceC1084f2, L4.b.l(i10 | 1), i11);
                                return r.f47939a;
                            }
                        };
                    }
                }
                i12 |= 24576;
                lVar7 = lVar4;
                if ((i12 & 9363) != 9362) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (c1086gP.C(i12 & 1, z10)) {
                    if (i20 != 0) {
                        hVar4 = h.a.f13984b;
                    } else {
                        hVar4 = hVar2;
                    }
                    if (i13 != 0) {
                        lVar11 = null;
                    } else {
                        lVar11 = lVar5;
                    }
                    lVar12 = f15754a;
                    if (i15 != 0) {
                        lVar13 = lVar12;
                    } else {
                        lVar13 = lVar6;
                    }
                    if (i17 != 0) {
                        lVar14 = lVar12;
                    } else {
                        lVar14 = lVar7;
                    }
                    i19 = c1086gP.f12996P;
                    h hVarI10 = hVar4.i(FocusGroupPropertiesElement.f15766b);
                    FocusTargetNode.FocusTargetElement focusTargetElement10 = FocusTargetNode.FocusTargetElement.f13444b;
                    hVarC = ComposedModifierKt.c(c1086gP, hVarI10.i(focusTargetElement10).i(FocusTargetPropertiesElement.f15771b).i(focusTargetElement10));
                    cVar = (p013b0.c) c1086gP.x(CompositionLocalsKt.f14847h);
                    layoutDirection = (LayoutDirection) c1086gP.x(CompositionLocalsKt.f14852n);
                    interfaceC1089h0P = c1086gP.P();
                    interfaceC1376t = (InterfaceC1376t) c1086gP.x(Z0.b.f7676a);
                    eVar = (e) c1086gP.x(AndroidCompositionLocals_androidKt.getLocalSavedStateRegistryOwner());
                    if (lVar11 != null) {
                        c1086gP.L(607780130);
                        aVarD2 = d(lVar, c1086gP, i12 & 14);
                        c1086gP.r();
                        if (c1086gP.f12995O) {
                            c1086gP.v(aVarD2);
                        } else {
                            c1086gP.A();
                        }
                        lVar15 = lVar14;
                        lVar9 = lVar13;
                        e(c1086gP, hVarC, i19, cVar, interfaceC1376t, eVar, layoutDirection, interfaceC1089h0P);
                        R0.a(new p<LayoutNode, l<? super T, ? extends r>, r>() { // from class: androidx.compose.ui.viewinterop.AndroidView_androidKt$AndroidView$2$1
                            @Override // Ia.p
                            public final r invoke(LayoutNode layoutNode, Object obj) {
                                AndroidView_androidKt.c(layoutNode).setResetBlock((l) obj);
                                return r.f47939a;
                            }
                        }, c1086gP, lVar11);
                        R0.a(new p<LayoutNode, l<? super T, ? extends r>, r>() { // from class: androidx.compose.ui.viewinterop.AndroidView_androidKt$AndroidView$2$2
                            @Override // Ia.p
                            public final r invoke(LayoutNode layoutNode, Object obj) {
                                AndroidView_androidKt.c(layoutNode).setUpdateBlock((l) obj);
                                return r.f47939a;
                            }
                        }, c1086gP, lVar15);
                        R0.a(new p<LayoutNode, l<? super T, ? extends r>, r>() { // from class: androidx.compose.ui.viewinterop.AndroidView_androidKt$AndroidView$2$3
                            @Override // Ia.p
                            public final r invoke(LayoutNode layoutNode, Object obj) {
                                AndroidView_androidKt.c(layoutNode).setReleaseBlock((l) obj);
                                return r.f47939a;
                            }
                        }, c1086gP, lVar9);
                        c1086gP.T(true);
                        c1086gP.T(false);
                    } else {
                        l<? super T, r> lVar11113 = lVar13;
                        l<? super T, r> lVar11114 = lVar14;
                        c1086gP.L(608635513);
                        aVarD = d(lVar, c1086gP, i12 & 14);
                        c1086gP.q0(R.styleable.AppCompatTheme_windowMinWidthMinor, 1, null, null);
                        c1086gP.f13013q = true;
                        if (c1086gP.f12995O) {
                            c1086gP.v(aVarD);
                        } else {
                            c1086gP.A();
                        }
                        lVar15 = lVar11114;
                        lVar9 = lVar11113;
                        e(c1086gP, hVarC, i19, cVar, interfaceC1376t, eVar, layoutDirection, interfaceC1089h0P);
                        R0.a(new p<LayoutNode, l<? super T, ? extends r>, r>() { // from class: androidx.compose.ui.viewinterop.AndroidView_androidKt$AndroidView$3$1
                            @Override // Ia.p
                            public final r invoke(LayoutNode layoutNode, Object obj) {
                                AndroidView_androidKt.c(layoutNode).setUpdateBlock((l) obj);
                                return r.f47939a;
                            }
                        }, c1086gP, lVar15);
                        R0.a(new p<LayoutNode, l<? super T, ? extends r>, r>() { // from class: androidx.compose.ui.viewinterop.AndroidView_androidKt$AndroidView$3$2
                            @Override // Ia.p
                            public final r invoke(LayoutNode layoutNode, Object obj) {
                                AndroidView_androidKt.c(layoutNode).setReleaseBlock((l) obj);
                                return r.f47939a;
                            }
                        }, c1086gP, lVar9);
                        c1086gP.T(true);
                        c1086gP.T(false);
                    }
                    l<? super T, r> lVar11115 = lVar11;
                    lVar10 = lVar15;
                    hVar3 = hVar4;
                    lVar8 = lVar11115;
                } else {
                    c1086gP.w();
                    hVar3 = hVar2;
                    lVar8 = lVar5;
                    lVar9 = lVar6;
                    lVar10 = lVar7;
                }
                c1105p0V = c1086gP.V();
                if (c1105p0V != null) {
                    c1105p0V.f13109d = new p<InterfaceC1084f, Integer, r>() { // from class: androidx.compose.ui.viewinterop.AndroidView_androidKt$AndroidView$4
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        /* JADX WARN: Multi-variable type inference failed */
                        {
                            super(2);
                        }

                        @Override // Ia.p
                        public final r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                            num.intValue();
                            AndroidView_androidKt.a(lVar, hVar3, lVar8, lVar9, lVar10, interfaceC1084f2, L4.b.l(i10 | 1), i11);
                            return r.f47939a;
                        }
                    };
                }
            }
            i12 |= 3072;
            lVar6 = lVar3;
            i17 = i11 & 16;
            if (i17 != 0) {
                if ((i10 & 24576) == 0) {
                    lVar7 = lVar4;
                    if (c1086gP.k(lVar7)) {
                        i18 = 16384;
                    } else {
                        i18 = 8192;
                    }
                    i12 |= i18;
                }
                if ((i12 & 9363) != 9362) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (c1086gP.C(i12 & 1, z10)) {
                    if (i20 != 0) {
                        hVar4 = h.a.f13984b;
                    } else {
                        hVar4 = hVar2;
                    }
                    if (i13 != 0) {
                        lVar11 = null;
                    } else {
                        lVar11 = lVar5;
                    }
                    lVar12 = f15754a;
                    if (i15 != 0) {
                        lVar13 = lVar12;
                    } else {
                        lVar13 = lVar6;
                    }
                    if (i17 != 0) {
                        lVar14 = lVar12;
                    } else {
                        lVar14 = lVar7;
                    }
                    i19 = c1086gP.f12996P;
                    h hVarI11 = hVar4.i(FocusGroupPropertiesElement.f15766b);
                    FocusTargetNode.FocusTargetElement focusTargetElement11 = FocusTargetNode.FocusTargetElement.f13444b;
                    hVarC = ComposedModifierKt.c(c1086gP, hVarI11.i(focusTargetElement11).i(FocusTargetPropertiesElement.f15771b).i(focusTargetElement11));
                    cVar = (p013b0.c) c1086gP.x(CompositionLocalsKt.f14847h);
                    layoutDirection = (LayoutDirection) c1086gP.x(CompositionLocalsKt.f14852n);
                    interfaceC1089h0P = c1086gP.P();
                    interfaceC1376t = (InterfaceC1376t) c1086gP.x(Z0.b.f7676a);
                    eVar = (e) c1086gP.x(AndroidCompositionLocals_androidKt.getLocalSavedStateRegistryOwner());
                    if (lVar11 != null) {
                        c1086gP.L(607780130);
                        aVarD2 = d(lVar, c1086gP, i12 & 14);
                        c1086gP.r();
                        if (c1086gP.f12995O) {
                            c1086gP.v(aVarD2);
                        } else {
                            c1086gP.A();
                        }
                        lVar15 = lVar14;
                        lVar9 = lVar13;
                        e(c1086gP, hVarC, i19, cVar, interfaceC1376t, eVar, layoutDirection, interfaceC1089h0P);
                        R0.a(new p<LayoutNode, l<? super T, ? extends r>, r>() { // from class: androidx.compose.ui.viewinterop.AndroidView_androidKt$AndroidView$2$1
                            @Override // Ia.p
                            public final r invoke(LayoutNode layoutNode, Object obj) {
                                AndroidView_androidKt.c(layoutNode).setResetBlock((l) obj);
                                return r.f47939a;
                            }
                        }, c1086gP, lVar11);
                        R0.a(new p<LayoutNode, l<? super T, ? extends r>, r>() { // from class: androidx.compose.ui.viewinterop.AndroidView_androidKt$AndroidView$2$2
                            @Override // Ia.p
                            public final r invoke(LayoutNode layoutNode, Object obj) {
                                AndroidView_androidKt.c(layoutNode).setUpdateBlock((l) obj);
                                return r.f47939a;
                            }
                        }, c1086gP, lVar15);
                        R0.a(new p<LayoutNode, l<? super T, ? extends r>, r>() { // from class: androidx.compose.ui.viewinterop.AndroidView_androidKt$AndroidView$2$3
                            @Override // Ia.p
                            public final r invoke(LayoutNode layoutNode, Object obj) {
                                AndroidView_androidKt.c(layoutNode).setReleaseBlock((l) obj);
                                return r.f47939a;
                            }
                        }, c1086gP, lVar9);
                        c1086gP.T(true);
                        c1086gP.T(false);
                    } else {
                        l<? super T, r> lVar11116 = lVar13;
                        l<? super T, r> lVar11117 = lVar14;
                        c1086gP.L(608635513);
                        aVarD = d(lVar, c1086gP, i12 & 14);
                        c1086gP.q0(R.styleable.AppCompatTheme_windowMinWidthMinor, 1, null, null);
                        c1086gP.f13013q = true;
                        if (c1086gP.f12995O) {
                            c1086gP.v(aVarD);
                        } else {
                            c1086gP.A();
                        }
                        lVar15 = lVar11117;
                        lVar9 = lVar11116;
                        e(c1086gP, hVarC, i19, cVar, interfaceC1376t, eVar, layoutDirection, interfaceC1089h0P);
                        R0.a(new p<LayoutNode, l<? super T, ? extends r>, r>() { // from class: androidx.compose.ui.viewinterop.AndroidView_androidKt$AndroidView$3$1
                            @Override // Ia.p
                            public final r invoke(LayoutNode layoutNode, Object obj) {
                                AndroidView_androidKt.c(layoutNode).setUpdateBlock((l) obj);
                                return r.f47939a;
                            }
                        }, c1086gP, lVar15);
                        R0.a(new p<LayoutNode, l<? super T, ? extends r>, r>() { // from class: androidx.compose.ui.viewinterop.AndroidView_androidKt$AndroidView$3$2
                            @Override // Ia.p
                            public final r invoke(LayoutNode layoutNode, Object obj) {
                                AndroidView_androidKt.c(layoutNode).setReleaseBlock((l) obj);
                                return r.f47939a;
                            }
                        }, c1086gP, lVar9);
                        c1086gP.T(true);
                        c1086gP.T(false);
                    }
                    l<? super T, r> lVar11118 = lVar11;
                    lVar10 = lVar15;
                    hVar3 = hVar4;
                    lVar8 = lVar11118;
                } else {
                    c1086gP.w();
                    hVar3 = hVar2;
                    lVar8 = lVar5;
                    lVar9 = lVar6;
                    lVar10 = lVar7;
                }
                c1105p0V = c1086gP.V();
                if (c1105p0V != null) {
                    c1105p0V.f13109d = new p<InterfaceC1084f, Integer, r>() { // from class: androidx.compose.ui.viewinterop.AndroidView_androidKt$AndroidView$4
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        /* JADX WARN: Multi-variable type inference failed */
                        {
                            super(2);
                        }

                        @Override // Ia.p
                        public final r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                            num.intValue();
                            AndroidView_androidKt.a(lVar, hVar3, lVar8, lVar9, lVar10, interfaceC1084f2, L4.b.l(i10 | 1), i11);
                            return r.f47939a;
                        }
                    };
                }
            }
            i12 |= 24576;
            lVar7 = lVar4;
            if ((i12 & 9363) != 9362) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (c1086gP.C(i12 & 1, z10)) {
                if (i20 != 0) {
                    hVar4 = h.a.f13984b;
                } else {
                    hVar4 = hVar2;
                }
                if (i13 != 0) {
                    lVar11 = null;
                } else {
                    lVar11 = lVar5;
                }
                lVar12 = f15754a;
                if (i15 != 0) {
                    lVar13 = lVar12;
                } else {
                    lVar13 = lVar6;
                }
                if (i17 != 0) {
                    lVar14 = lVar12;
                } else {
                    lVar14 = lVar7;
                }
                i19 = c1086gP.f12996P;
                h hVarI12 = hVar4.i(FocusGroupPropertiesElement.f15766b);
                FocusTargetNode.FocusTargetElement focusTargetElement12 = FocusTargetNode.FocusTargetElement.f13444b;
                hVarC = ComposedModifierKt.c(c1086gP, hVarI12.i(focusTargetElement12).i(FocusTargetPropertiesElement.f15771b).i(focusTargetElement12));
                cVar = (p013b0.c) c1086gP.x(CompositionLocalsKt.f14847h);
                layoutDirection = (LayoutDirection) c1086gP.x(CompositionLocalsKt.f14852n);
                interfaceC1089h0P = c1086gP.P();
                interfaceC1376t = (InterfaceC1376t) c1086gP.x(Z0.b.f7676a);
                eVar = (e) c1086gP.x(AndroidCompositionLocals_androidKt.getLocalSavedStateRegistryOwner());
                if (lVar11 != null) {
                    c1086gP.L(607780130);
                    aVarD2 = d(lVar, c1086gP, i12 & 14);
                    c1086gP.r();
                    if (c1086gP.f12995O) {
                        c1086gP.v(aVarD2);
                    } else {
                        c1086gP.A();
                    }
                    lVar15 = lVar14;
                    lVar9 = lVar13;
                    e(c1086gP, hVarC, i19, cVar, interfaceC1376t, eVar, layoutDirection, interfaceC1089h0P);
                    R0.a(new p<LayoutNode, l<? super T, ? extends r>, r>() { // from class: androidx.compose.ui.viewinterop.AndroidView_androidKt$AndroidView$2$1
                        @Override // Ia.p
                        public final r invoke(LayoutNode layoutNode, Object obj) {
                            AndroidView_androidKt.c(layoutNode).setResetBlock((l) obj);
                            return r.f47939a;
                        }
                    }, c1086gP, lVar11);
                    R0.a(new p<LayoutNode, l<? super T, ? extends r>, r>() { // from class: androidx.compose.ui.viewinterop.AndroidView_androidKt$AndroidView$2$2
                        @Override // Ia.p
                        public final r invoke(LayoutNode layoutNode, Object obj) {
                            AndroidView_androidKt.c(layoutNode).setUpdateBlock((l) obj);
                            return r.f47939a;
                        }
                    }, c1086gP, lVar15);
                    R0.a(new p<LayoutNode, l<? super T, ? extends r>, r>() { // from class: androidx.compose.ui.viewinterop.AndroidView_androidKt$AndroidView$2$3
                        @Override // Ia.p
                        public final r invoke(LayoutNode layoutNode, Object obj) {
                            AndroidView_androidKt.c(layoutNode).setReleaseBlock((l) obj);
                            return r.f47939a;
                        }
                    }, c1086gP, lVar9);
                    c1086gP.T(true);
                    c1086gP.T(false);
                } else {
                    l<? super T, r> lVar11119 = lVar13;
                    l<? super T, r> lVar111110 = lVar14;
                    c1086gP.L(608635513);
                    aVarD = d(lVar, c1086gP, i12 & 14);
                    c1086gP.q0(R.styleable.AppCompatTheme_windowMinWidthMinor, 1, null, null);
                    c1086gP.f13013q = true;
                    if (c1086gP.f12995O) {
                        c1086gP.v(aVarD);
                    } else {
                        c1086gP.A();
                    }
                    lVar15 = lVar111110;
                    lVar9 = lVar11119;
                    e(c1086gP, hVarC, i19, cVar, interfaceC1376t, eVar, layoutDirection, interfaceC1089h0P);
                    R0.a(new p<LayoutNode, l<? super T, ? extends r>, r>() { // from class: androidx.compose.ui.viewinterop.AndroidView_androidKt$AndroidView$3$1
                        @Override // Ia.p
                        public final r invoke(LayoutNode layoutNode, Object obj) {
                            AndroidView_androidKt.c(layoutNode).setUpdateBlock((l) obj);
                            return r.f47939a;
                        }
                    }, c1086gP, lVar15);
                    R0.a(new p<LayoutNode, l<? super T, ? extends r>, r>() { // from class: androidx.compose.ui.viewinterop.AndroidView_androidKt$AndroidView$3$2
                        @Override // Ia.p
                        public final r invoke(LayoutNode layoutNode, Object obj) {
                            AndroidView_androidKt.c(layoutNode).setReleaseBlock((l) obj);
                            return r.f47939a;
                        }
                    }, c1086gP, lVar9);
                    c1086gP.T(true);
                    c1086gP.T(false);
                }
                l<? super T, r> lVar111111 = lVar11;
                lVar10 = lVar15;
                hVar3 = hVar4;
                lVar8 = lVar111111;
            } else {
                c1086gP.w();
                hVar3 = hVar2;
                lVar8 = lVar5;
                lVar9 = lVar6;
                lVar10 = lVar7;
            }
            c1105p0V = c1086gP.V();
            if (c1105p0V != null) {
                c1105p0V.f13109d = new p<InterfaceC1084f, Integer, r>() { // from class: androidx.compose.ui.viewinterop.AndroidView_androidKt$AndroidView$4
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(2);
                    }

                    @Override // Ia.p
                    public final r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                        num.intValue();
                        AndroidView_androidKt.a(lVar, hVar3, lVar8, lVar9, lVar10, interfaceC1084f2, L4.b.l(i10 | 1), i11);
                        return r.f47939a;
                    }
                };
            }
        }
        i12 |= 384;
        lVar5 = lVar2;
        i15 = i11 & 8;
        if (i15 != 0) {
            if ((i10 & 3072) == 0) {
                lVar6 = lVar3;
                if (c1086gP.k(lVar6)) {
                    i16 = 2048;
                } else {
                    i16 = 1024;
                }
                i12 |= i16;
            }
            i17 = i11 & 16;
            if (i17 != 0) {
                if ((i10 & 24576) == 0) {
                    lVar7 = lVar4;
                    if (c1086gP.k(lVar7)) {
                        i18 = 16384;
                    } else {
                        i18 = 8192;
                    }
                    i12 |= i18;
                }
                if ((i12 & 9363) != 9362) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (c1086gP.C(i12 & 1, z10)) {
                    if (i20 != 0) {
                        hVar4 = h.a.f13984b;
                    } else {
                        hVar4 = hVar2;
                    }
                    if (i13 != 0) {
                        lVar11 = null;
                    } else {
                        lVar11 = lVar5;
                    }
                    lVar12 = f15754a;
                    if (i15 != 0) {
                        lVar13 = lVar12;
                    } else {
                        lVar13 = lVar6;
                    }
                    if (i17 != 0) {
                        lVar14 = lVar12;
                    } else {
                        lVar14 = lVar7;
                    }
                    i19 = c1086gP.f12996P;
                    h hVarI13 = hVar4.i(FocusGroupPropertiesElement.f15766b);
                    FocusTargetNode.FocusTargetElement focusTargetElement13 = FocusTargetNode.FocusTargetElement.f13444b;
                    hVarC = ComposedModifierKt.c(c1086gP, hVarI13.i(focusTargetElement13).i(FocusTargetPropertiesElement.f15771b).i(focusTargetElement13));
                    cVar = (p013b0.c) c1086gP.x(CompositionLocalsKt.f14847h);
                    layoutDirection = (LayoutDirection) c1086gP.x(CompositionLocalsKt.f14852n);
                    interfaceC1089h0P = c1086gP.P();
                    interfaceC1376t = (InterfaceC1376t) c1086gP.x(Z0.b.f7676a);
                    eVar = (e) c1086gP.x(AndroidCompositionLocals_androidKt.getLocalSavedStateRegistryOwner());
                    if (lVar11 != null) {
                        c1086gP.L(607780130);
                        aVarD2 = d(lVar, c1086gP, i12 & 14);
                        c1086gP.r();
                        if (c1086gP.f12995O) {
                            c1086gP.v(aVarD2);
                        } else {
                            c1086gP.A();
                        }
                        lVar15 = lVar14;
                        lVar9 = lVar13;
                        e(c1086gP, hVarC, i19, cVar, interfaceC1376t, eVar, layoutDirection, interfaceC1089h0P);
                        R0.a(new p<LayoutNode, l<? super T, ? extends r>, r>() { // from class: androidx.compose.ui.viewinterop.AndroidView_androidKt$AndroidView$2$1
                            @Override // Ia.p
                            public final r invoke(LayoutNode layoutNode, Object obj) {
                                AndroidView_androidKt.c(layoutNode).setResetBlock((l) obj);
                                return r.f47939a;
                            }
                        }, c1086gP, lVar11);
                        R0.a(new p<LayoutNode, l<? super T, ? extends r>, r>() { // from class: androidx.compose.ui.viewinterop.AndroidView_androidKt$AndroidView$2$2
                            @Override // Ia.p
                            public final r invoke(LayoutNode layoutNode, Object obj) {
                                AndroidView_androidKt.c(layoutNode).setUpdateBlock((l) obj);
                                return r.f47939a;
                            }
                        }, c1086gP, lVar15);
                        R0.a(new p<LayoutNode, l<? super T, ? extends r>, r>() { // from class: androidx.compose.ui.viewinterop.AndroidView_androidKt$AndroidView$2$3
                            @Override // Ia.p
                            public final r invoke(LayoutNode layoutNode, Object obj) {
                                AndroidView_androidKt.c(layoutNode).setReleaseBlock((l) obj);
                                return r.f47939a;
                            }
                        }, c1086gP, lVar9);
                        c1086gP.T(true);
                        c1086gP.T(false);
                    } else {
                        l<? super T, r> lVar111112 = lVar13;
                        l<? super T, r> lVar111113 = lVar14;
                        c1086gP.L(608635513);
                        aVarD = d(lVar, c1086gP, i12 & 14);
                        c1086gP.q0(R.styleable.AppCompatTheme_windowMinWidthMinor, 1, null, null);
                        c1086gP.f13013q = true;
                        if (c1086gP.f12995O) {
                            c1086gP.v(aVarD);
                        } else {
                            c1086gP.A();
                        }
                        lVar15 = lVar111113;
                        lVar9 = lVar111112;
                        e(c1086gP, hVarC, i19, cVar, interfaceC1376t, eVar, layoutDirection, interfaceC1089h0P);
                        R0.a(new p<LayoutNode, l<? super T, ? extends r>, r>() { // from class: androidx.compose.ui.viewinterop.AndroidView_androidKt$AndroidView$3$1
                            @Override // Ia.p
                            public final r invoke(LayoutNode layoutNode, Object obj) {
                                AndroidView_androidKt.c(layoutNode).setUpdateBlock((l) obj);
                                return r.f47939a;
                            }
                        }, c1086gP, lVar15);
                        R0.a(new p<LayoutNode, l<? super T, ? extends r>, r>() { // from class: androidx.compose.ui.viewinterop.AndroidView_androidKt$AndroidView$3$2
                            @Override // Ia.p
                            public final r invoke(LayoutNode layoutNode, Object obj) {
                                AndroidView_androidKt.c(layoutNode).setReleaseBlock((l) obj);
                                return r.f47939a;
                            }
                        }, c1086gP, lVar9);
                        c1086gP.T(true);
                        c1086gP.T(false);
                    }
                    l<? super T, r> lVar111114 = lVar11;
                    lVar10 = lVar15;
                    hVar3 = hVar4;
                    lVar8 = lVar111114;
                } else {
                    c1086gP.w();
                    hVar3 = hVar2;
                    lVar8 = lVar5;
                    lVar9 = lVar6;
                    lVar10 = lVar7;
                }
                c1105p0V = c1086gP.V();
                if (c1105p0V != null) {
                    c1105p0V.f13109d = new p<InterfaceC1084f, Integer, r>() { // from class: androidx.compose.ui.viewinterop.AndroidView_androidKt$AndroidView$4
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        /* JADX WARN: Multi-variable type inference failed */
                        {
                            super(2);
                        }

                        @Override // Ia.p
                        public final r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                            num.intValue();
                            AndroidView_androidKt.a(lVar, hVar3, lVar8, lVar9, lVar10, interfaceC1084f2, L4.b.l(i10 | 1), i11);
                            return r.f47939a;
                        }
                    };
                }
            }
            i12 |= 24576;
            lVar7 = lVar4;
            if ((i12 & 9363) != 9362) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (c1086gP.C(i12 & 1, z10)) {
                if (i20 != 0) {
                    hVar4 = h.a.f13984b;
                } else {
                    hVar4 = hVar2;
                }
                if (i13 != 0) {
                    lVar11 = null;
                } else {
                    lVar11 = lVar5;
                }
                lVar12 = f15754a;
                if (i15 != 0) {
                    lVar13 = lVar12;
                } else {
                    lVar13 = lVar6;
                }
                if (i17 != 0) {
                    lVar14 = lVar12;
                } else {
                    lVar14 = lVar7;
                }
                i19 = c1086gP.f12996P;
                h hVarI14 = hVar4.i(FocusGroupPropertiesElement.f15766b);
                FocusTargetNode.FocusTargetElement focusTargetElement14 = FocusTargetNode.FocusTargetElement.f13444b;
                hVarC = ComposedModifierKt.c(c1086gP, hVarI14.i(focusTargetElement14).i(FocusTargetPropertiesElement.f15771b).i(focusTargetElement14));
                cVar = (p013b0.c) c1086gP.x(CompositionLocalsKt.f14847h);
                layoutDirection = (LayoutDirection) c1086gP.x(CompositionLocalsKt.f14852n);
                interfaceC1089h0P = c1086gP.P();
                interfaceC1376t = (InterfaceC1376t) c1086gP.x(Z0.b.f7676a);
                eVar = (e) c1086gP.x(AndroidCompositionLocals_androidKt.getLocalSavedStateRegistryOwner());
                if (lVar11 != null) {
                    c1086gP.L(607780130);
                    aVarD2 = d(lVar, c1086gP, i12 & 14);
                    c1086gP.r();
                    if (c1086gP.f12995O) {
                        c1086gP.v(aVarD2);
                    } else {
                        c1086gP.A();
                    }
                    lVar15 = lVar14;
                    lVar9 = lVar13;
                    e(c1086gP, hVarC, i19, cVar, interfaceC1376t, eVar, layoutDirection, interfaceC1089h0P);
                    R0.a(new p<LayoutNode, l<? super T, ? extends r>, r>() { // from class: androidx.compose.ui.viewinterop.AndroidView_androidKt$AndroidView$2$1
                        @Override // Ia.p
                        public final r invoke(LayoutNode layoutNode, Object obj) {
                            AndroidView_androidKt.c(layoutNode).setResetBlock((l) obj);
                            return r.f47939a;
                        }
                    }, c1086gP, lVar11);
                    R0.a(new p<LayoutNode, l<? super T, ? extends r>, r>() { // from class: androidx.compose.ui.viewinterop.AndroidView_androidKt$AndroidView$2$2
                        @Override // Ia.p
                        public final r invoke(LayoutNode layoutNode, Object obj) {
                            AndroidView_androidKt.c(layoutNode).setUpdateBlock((l) obj);
                            return r.f47939a;
                        }
                    }, c1086gP, lVar15);
                    R0.a(new p<LayoutNode, l<? super T, ? extends r>, r>() { // from class: androidx.compose.ui.viewinterop.AndroidView_androidKt$AndroidView$2$3
                        @Override // Ia.p
                        public final r invoke(LayoutNode layoutNode, Object obj) {
                            AndroidView_androidKt.c(layoutNode).setReleaseBlock((l) obj);
                            return r.f47939a;
                        }
                    }, c1086gP, lVar9);
                    c1086gP.T(true);
                    c1086gP.T(false);
                } else {
                    l<? super T, r> lVar111115 = lVar13;
                    l<? super T, r> lVar111116 = lVar14;
                    c1086gP.L(608635513);
                    aVarD = d(lVar, c1086gP, i12 & 14);
                    c1086gP.q0(R.styleable.AppCompatTheme_windowMinWidthMinor, 1, null, null);
                    c1086gP.f13013q = true;
                    if (c1086gP.f12995O) {
                        c1086gP.v(aVarD);
                    } else {
                        c1086gP.A();
                    }
                    lVar15 = lVar111116;
                    lVar9 = lVar111115;
                    e(c1086gP, hVarC, i19, cVar, interfaceC1376t, eVar, layoutDirection, interfaceC1089h0P);
                    R0.a(new p<LayoutNode, l<? super T, ? extends r>, r>() { // from class: androidx.compose.ui.viewinterop.AndroidView_androidKt$AndroidView$3$1
                        @Override // Ia.p
                        public final r invoke(LayoutNode layoutNode, Object obj) {
                            AndroidView_androidKt.c(layoutNode).setUpdateBlock((l) obj);
                            return r.f47939a;
                        }
                    }, c1086gP, lVar15);
                    R0.a(new p<LayoutNode, l<? super T, ? extends r>, r>() { // from class: androidx.compose.ui.viewinterop.AndroidView_androidKt$AndroidView$3$2
                        @Override // Ia.p
                        public final r invoke(LayoutNode layoutNode, Object obj) {
                            AndroidView_androidKt.c(layoutNode).setReleaseBlock((l) obj);
                            return r.f47939a;
                        }
                    }, c1086gP, lVar9);
                    c1086gP.T(true);
                    c1086gP.T(false);
                }
                l<? super T, r> lVar111117 = lVar11;
                lVar10 = lVar15;
                hVar3 = hVar4;
                lVar8 = lVar111117;
            } else {
                c1086gP.w();
                hVar3 = hVar2;
                lVar8 = lVar5;
                lVar9 = lVar6;
                lVar10 = lVar7;
            }
            c1105p0V = c1086gP.V();
            if (c1105p0V != null) {
                c1105p0V.f13109d = new p<InterfaceC1084f, Integer, r>() { // from class: androidx.compose.ui.viewinterop.AndroidView_androidKt$AndroidView$4
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(2);
                    }

                    @Override // Ia.p
                    public final r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                        num.intValue();
                        AndroidView_androidKt.a(lVar, hVar3, lVar8, lVar9, lVar10, interfaceC1084f2, L4.b.l(i10 | 1), i11);
                        return r.f47939a;
                    }
                };
            }
        }
        i12 |= 3072;
        lVar6 = lVar3;
        i17 = i11 & 16;
        if (i17 != 0) {
            if ((i10 & 24576) == 0) {
                lVar7 = lVar4;
                if (c1086gP.k(lVar7)) {
                    i18 = 16384;
                } else {
                    i18 = 8192;
                }
                i12 |= i18;
            }
            if ((i12 & 9363) != 9362) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (c1086gP.C(i12 & 1, z10)) {
                if (i20 != 0) {
                    hVar4 = h.a.f13984b;
                } else {
                    hVar4 = hVar2;
                }
                if (i13 != 0) {
                    lVar11 = null;
                } else {
                    lVar11 = lVar5;
                }
                lVar12 = f15754a;
                if (i15 != 0) {
                    lVar13 = lVar12;
                } else {
                    lVar13 = lVar6;
                }
                if (i17 != 0) {
                    lVar14 = lVar12;
                } else {
                    lVar14 = lVar7;
                }
                i19 = c1086gP.f12996P;
                h hVarI15 = hVar4.i(FocusGroupPropertiesElement.f15766b);
                FocusTargetNode.FocusTargetElement focusTargetElement15 = FocusTargetNode.FocusTargetElement.f13444b;
                hVarC = ComposedModifierKt.c(c1086gP, hVarI15.i(focusTargetElement15).i(FocusTargetPropertiesElement.f15771b).i(focusTargetElement15));
                cVar = (p013b0.c) c1086gP.x(CompositionLocalsKt.f14847h);
                layoutDirection = (LayoutDirection) c1086gP.x(CompositionLocalsKt.f14852n);
                interfaceC1089h0P = c1086gP.P();
                interfaceC1376t = (InterfaceC1376t) c1086gP.x(Z0.b.f7676a);
                eVar = (e) c1086gP.x(AndroidCompositionLocals_androidKt.getLocalSavedStateRegistryOwner());
                if (lVar11 != null) {
                    c1086gP.L(607780130);
                    aVarD2 = d(lVar, c1086gP, i12 & 14);
                    c1086gP.r();
                    if (c1086gP.f12995O) {
                        c1086gP.v(aVarD2);
                    } else {
                        c1086gP.A();
                    }
                    lVar15 = lVar14;
                    lVar9 = lVar13;
                    e(c1086gP, hVarC, i19, cVar, interfaceC1376t, eVar, layoutDirection, interfaceC1089h0P);
                    R0.a(new p<LayoutNode, l<? super T, ? extends r>, r>() { // from class: androidx.compose.ui.viewinterop.AndroidView_androidKt$AndroidView$2$1
                        @Override // Ia.p
                        public final r invoke(LayoutNode layoutNode, Object obj) {
                            AndroidView_androidKt.c(layoutNode).setResetBlock((l) obj);
                            return r.f47939a;
                        }
                    }, c1086gP, lVar11);
                    R0.a(new p<LayoutNode, l<? super T, ? extends r>, r>() { // from class: androidx.compose.ui.viewinterop.AndroidView_androidKt$AndroidView$2$2
                        @Override // Ia.p
                        public final r invoke(LayoutNode layoutNode, Object obj) {
                            AndroidView_androidKt.c(layoutNode).setUpdateBlock((l) obj);
                            return r.f47939a;
                        }
                    }, c1086gP, lVar15);
                    R0.a(new p<LayoutNode, l<? super T, ? extends r>, r>() { // from class: androidx.compose.ui.viewinterop.AndroidView_androidKt$AndroidView$2$3
                        @Override // Ia.p
                        public final r invoke(LayoutNode layoutNode, Object obj) {
                            AndroidView_androidKt.c(layoutNode).setReleaseBlock((l) obj);
                            return r.f47939a;
                        }
                    }, c1086gP, lVar9);
                    c1086gP.T(true);
                    c1086gP.T(false);
                } else {
                    l<? super T, r> lVar111118 = lVar13;
                    l<? super T, r> lVar111119 = lVar14;
                    c1086gP.L(608635513);
                    aVarD = d(lVar, c1086gP, i12 & 14);
                    c1086gP.q0(R.styleable.AppCompatTheme_windowMinWidthMinor, 1, null, null);
                    c1086gP.f13013q = true;
                    if (c1086gP.f12995O) {
                        c1086gP.v(aVarD);
                    } else {
                        c1086gP.A();
                    }
                    lVar15 = lVar111119;
                    lVar9 = lVar111118;
                    e(c1086gP, hVarC, i19, cVar, interfaceC1376t, eVar, layoutDirection, interfaceC1089h0P);
                    R0.a(new p<LayoutNode, l<? super T, ? extends r>, r>() { // from class: androidx.compose.ui.viewinterop.AndroidView_androidKt$AndroidView$3$1
                        @Override // Ia.p
                        public final r invoke(LayoutNode layoutNode, Object obj) {
                            AndroidView_androidKt.c(layoutNode).setUpdateBlock((l) obj);
                            return r.f47939a;
                        }
                    }, c1086gP, lVar15);
                    R0.a(new p<LayoutNode, l<? super T, ? extends r>, r>() { // from class: androidx.compose.ui.viewinterop.AndroidView_androidKt$AndroidView$3$2
                        @Override // Ia.p
                        public final r invoke(LayoutNode layoutNode, Object obj) {
                            AndroidView_androidKt.c(layoutNode).setReleaseBlock((l) obj);
                            return r.f47939a;
                        }
                    }, c1086gP, lVar9);
                    c1086gP.T(true);
                    c1086gP.T(false);
                }
                l<? super T, r> lVar1111110 = lVar11;
                lVar10 = lVar15;
                hVar3 = hVar4;
                lVar8 = lVar1111110;
            } else {
                c1086gP.w();
                hVar3 = hVar2;
                lVar8 = lVar5;
                lVar9 = lVar6;
                lVar10 = lVar7;
            }
            c1105p0V = c1086gP.V();
            if (c1105p0V != null) {
                c1105p0V.f13109d = new p<InterfaceC1084f, Integer, r>() { // from class: androidx.compose.ui.viewinterop.AndroidView_androidKt$AndroidView$4
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(2);
                    }

                    @Override // Ia.p
                    public final r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                        num.intValue();
                        AndroidView_androidKt.a(lVar, hVar3, lVar8, lVar9, lVar10, interfaceC1084f2, L4.b.l(i10 | 1), i11);
                        return r.f47939a;
                    }
                };
            }
        }
        i12 |= 24576;
        lVar7 = lVar4;
        if ((i12 & 9363) != 9362) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (c1086gP.C(i12 & 1, z10)) {
            if (i20 != 0) {
                hVar4 = h.a.f13984b;
            } else {
                hVar4 = hVar2;
            }
            if (i13 != 0) {
                lVar11 = null;
            } else {
                lVar11 = lVar5;
            }
            lVar12 = f15754a;
            if (i15 != 0) {
                lVar13 = lVar12;
            } else {
                lVar13 = lVar6;
            }
            if (i17 != 0) {
                lVar14 = lVar12;
            } else {
                lVar14 = lVar7;
            }
            i19 = c1086gP.f12996P;
            h hVarI16 = hVar4.i(FocusGroupPropertiesElement.f15766b);
            FocusTargetNode.FocusTargetElement focusTargetElement16 = FocusTargetNode.FocusTargetElement.f13444b;
            hVarC = ComposedModifierKt.c(c1086gP, hVarI16.i(focusTargetElement16).i(FocusTargetPropertiesElement.f15771b).i(focusTargetElement16));
            cVar = (p013b0.c) c1086gP.x(CompositionLocalsKt.f14847h);
            layoutDirection = (LayoutDirection) c1086gP.x(CompositionLocalsKt.f14852n);
            interfaceC1089h0P = c1086gP.P();
            interfaceC1376t = (InterfaceC1376t) c1086gP.x(Z0.b.f7676a);
            eVar = (e) c1086gP.x(AndroidCompositionLocals_androidKt.getLocalSavedStateRegistryOwner());
            if (lVar11 != null) {
                c1086gP.L(607780130);
                aVarD2 = d(lVar, c1086gP, i12 & 14);
                c1086gP.r();
                if (c1086gP.f12995O) {
                    c1086gP.v(aVarD2);
                } else {
                    c1086gP.A();
                }
                lVar15 = lVar14;
                lVar9 = lVar13;
                e(c1086gP, hVarC, i19, cVar, interfaceC1376t, eVar, layoutDirection, interfaceC1089h0P);
                R0.a(new p<LayoutNode, l<? super T, ? extends r>, r>() { // from class: androidx.compose.ui.viewinterop.AndroidView_androidKt$AndroidView$2$1
                    @Override // Ia.p
                    public final r invoke(LayoutNode layoutNode, Object obj) {
                        AndroidView_androidKt.c(layoutNode).setResetBlock((l) obj);
                        return r.f47939a;
                    }
                }, c1086gP, lVar11);
                R0.a(new p<LayoutNode, l<? super T, ? extends r>, r>() { // from class: androidx.compose.ui.viewinterop.AndroidView_androidKt$AndroidView$2$2
                    @Override // Ia.p
                    public final r invoke(LayoutNode layoutNode, Object obj) {
                        AndroidView_androidKt.c(layoutNode).setUpdateBlock((l) obj);
                        return r.f47939a;
                    }
                }, c1086gP, lVar15);
                R0.a(new p<LayoutNode, l<? super T, ? extends r>, r>() { // from class: androidx.compose.ui.viewinterop.AndroidView_androidKt$AndroidView$2$3
                    @Override // Ia.p
                    public final r invoke(LayoutNode layoutNode, Object obj) {
                        AndroidView_androidKt.c(layoutNode).setReleaseBlock((l) obj);
                        return r.f47939a;
                    }
                }, c1086gP, lVar9);
                c1086gP.T(true);
                c1086gP.T(false);
            } else {
                l<? super T, r> lVar1111111 = lVar13;
                l<? super T, r> lVar1111112 = lVar14;
                c1086gP.L(608635513);
                aVarD = d(lVar, c1086gP, i12 & 14);
                c1086gP.q0(R.styleable.AppCompatTheme_windowMinWidthMinor, 1, null, null);
                c1086gP.f13013q = true;
                if (c1086gP.f12995O) {
                    c1086gP.v(aVarD);
                } else {
                    c1086gP.A();
                }
                lVar15 = lVar1111112;
                lVar9 = lVar1111111;
                e(c1086gP, hVarC, i19, cVar, interfaceC1376t, eVar, layoutDirection, interfaceC1089h0P);
                R0.a(new p<LayoutNode, l<? super T, ? extends r>, r>() { // from class: androidx.compose.ui.viewinterop.AndroidView_androidKt$AndroidView$3$1
                    @Override // Ia.p
                    public final r invoke(LayoutNode layoutNode, Object obj) {
                        AndroidView_androidKt.c(layoutNode).setUpdateBlock((l) obj);
                        return r.f47939a;
                    }
                }, c1086gP, lVar15);
                R0.a(new p<LayoutNode, l<? super T, ? extends r>, r>() { // from class: androidx.compose.ui.viewinterop.AndroidView_androidKt$AndroidView$3$2
                    @Override // Ia.p
                    public final r invoke(LayoutNode layoutNode, Object obj) {
                        AndroidView_androidKt.c(layoutNode).setReleaseBlock((l) obj);
                        return r.f47939a;
                    }
                }, c1086gP, lVar9);
                c1086gP.T(true);
                c1086gP.T(false);
            }
            l<? super T, r> lVar1111113 = lVar11;
            lVar10 = lVar15;
            hVar3 = hVar4;
            lVar8 = lVar1111113;
        } else {
            c1086gP.w();
            hVar3 = hVar2;
            lVar8 = lVar5;
            lVar9 = lVar6;
            lVar10 = lVar7;
        }
        c1105p0V = c1086gP.V();
        if (c1105p0V != null) {
            c1105p0V.f13109d = new p<InterfaceC1084f, Integer, r>() { // from class: androidx.compose.ui.viewinterop.AndroidView_androidKt$AndroidView$4
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(2);
                }

                @Override // Ia.p
                public final r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                    num.intValue();
                    AndroidView_androidKt.a(lVar, hVar3, lVar8, lVar9, lVar10, interfaceC1084f2, L4.b.l(i10 | 1), i11);
                    return r.f47939a;
                }
            };
        }
    }

    /* JADX WARN: Code duplicated, block: B:26:0x0043  */
    /* JADX WARN: Code duplicated, block: B:28:0x0048  */
    /* JADX WARN: Code duplicated, block: B:30:0x004c  */
    /* JADX WARN: Code duplicated, block: B:32:0x0054  */
    /* JADX WARN: Code duplicated, block: B:33:0x0057  */
    /* JADX WARN: Code duplicated, block: B:37:0x0060  */
    /* JADX WARN: Code duplicated, block: B:38:0x0062  */
    /* JADX WARN: Code duplicated, block: B:41:0x006b A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:42:0x006d  */
    /* JADX WARN: Code duplicated, block: B:43:0x0070  */
    /* JADX WARN: Code duplicated, block: B:46:0x0075  */
    /* JADX WARN: Code duplicated, block: B:47:0x0077  */
    /* JADX WARN: Code duplicated, block: B:49:0x0093  */
    /* JADX WARN: Code duplicated, block: B:52:0x009e  */
    /* JADX WARN: Code duplicated, block: B:54:? A[RETURN, SYNTHETIC] */
    public static final <T extends View> void b(final l<? super Context, ? extends T> lVar, h hVar, l<? super T, r> lVar2, InterfaceC1084f interfaceC1084f, final int i10, final int i11) {
        int i12;
        int i13;
        l<? super T, r> lVar3;
        int i14;
        boolean z10;
        final h hVar2;
        final l<? super T, r> lVar4;
        C1105p0 c1105p0V;
        h hVar3;
        l<View, r> lVar5;
        l<? super T, r> lVar6;
        C1086g c1086gP = interfaceC1084f.p(-1783766393);
        if ((i11 & 1) != 0) {
            i12 = i10 | 6;
        } else if ((i10 & 6) == 0) {
            i12 = (c1086gP.k(lVar) ? 4 : 2) | i10;
        } else {
            i12 = i10;
        }
        int i15 = i11 & 2;
        if (i15 == 0) {
            if ((i10 & 48) == 0) {
                i12 |= c1086gP.K(hVar) ? 32 : 16;
            }
            i13 = i11 & 4;
            if (i13 != 0) {
                if ((i10 & 384) == 0) {
                    lVar3 = lVar2;
                    if (c1086gP.k(lVar3)) {
                        i14 = 256;
                    } else {
                        i14 = 128;
                    }
                    i12 |= i14;
                }
                if ((i12 & 147) != 146) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (c1086gP.C(i12 & 1, z10)) {
                    if (i15 != 0) {
                        hVar3 = h.a.f13984b;
                    } else {
                        hVar3 = hVar;
                    }
                    lVar5 = f15754a;
                    if (i13 != 0) {
                        lVar6 = lVar5;
                    } else {
                        lVar6 = lVar3;
                    }
                    a(lVar, hVar3, null, lVar5, lVar6, c1086gP, (i12 & 14) | 3072 | (i12 & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) | ((i12 << 6) & 57344), 4);
                    hVar2 = hVar3;
                    lVar4 = lVar6;
                } else {
                    c1086gP.w();
                    hVar2 = hVar;
                    lVar4 = lVar3;
                }
                c1105p0V = c1086gP.V();
                if (c1105p0V != null) {
                    c1105p0V.f13109d = new p<InterfaceC1084f, Integer, r>() { // from class: androidx.compose.ui.viewinterop.AndroidView_androidKt$AndroidView$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        /* JADX WARN: Multi-variable type inference failed */
                        {
                            super(2);
                        }

                        @Override // Ia.p
                        public final r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                            num.intValue();
                            AndroidView_androidKt.b(lVar, hVar2, lVar4, interfaceC1084f2, L4.b.l(i10 | 1), i11);
                            return r.f47939a;
                        }
                    };
                }
            }
            i12 |= 384;
            lVar3 = lVar2;
            if ((i12 & 147) != 146) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (c1086gP.C(i12 & 1, z10)) {
                if (i15 != 0) {
                    hVar3 = h.a.f13984b;
                } else {
                    hVar3 = hVar;
                }
                lVar5 = f15754a;
                if (i13 != 0) {
                    lVar6 = lVar5;
                } else {
                    lVar6 = lVar3;
                }
                a(lVar, hVar3, null, lVar5, lVar6, c1086gP, (i12 & 14) | 3072 | (i12 & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) | ((i12 << 6) & 57344), 4);
                hVar2 = hVar3;
                lVar4 = lVar6;
            } else {
                c1086gP.w();
                hVar2 = hVar;
                lVar4 = lVar3;
            }
            c1105p0V = c1086gP.V();
            if (c1105p0V != null) {
                c1105p0V.f13109d = new p<InterfaceC1084f, Integer, r>() { // from class: androidx.compose.ui.viewinterop.AndroidView_androidKt$AndroidView$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(2);
                    }

                    @Override // Ia.p
                    public final r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                        num.intValue();
                        AndroidView_androidKt.b(lVar, hVar2, lVar4, interfaceC1084f2, L4.b.l(i10 | 1), i11);
                        return r.f47939a;
                    }
                };
            }
        }
        i12 |= 48;
        i13 = i11 & 4;
        if (i13 != 0) {
            if ((i10 & 384) == 0) {
                lVar3 = lVar2;
                if (c1086gP.k(lVar3)) {
                    i14 = 256;
                } else {
                    i14 = 128;
                }
                i12 |= i14;
            }
            if ((i12 & 147) != 146) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (c1086gP.C(i12 & 1, z10)) {
                if (i15 != 0) {
                    hVar3 = h.a.f13984b;
                } else {
                    hVar3 = hVar;
                }
                lVar5 = f15754a;
                if (i13 != 0) {
                    lVar6 = lVar5;
                } else {
                    lVar6 = lVar3;
                }
                a(lVar, hVar3, null, lVar5, lVar6, c1086gP, (i12 & 14) | 3072 | (i12 & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) | ((i12 << 6) & 57344), 4);
                hVar2 = hVar3;
                lVar4 = lVar6;
            } else {
                c1086gP.w();
                hVar2 = hVar;
                lVar4 = lVar3;
            }
            c1105p0V = c1086gP.V();
            if (c1105p0V != null) {
                c1105p0V.f13109d = new p<InterfaceC1084f, Integer, r>() { // from class: androidx.compose.ui.viewinterop.AndroidView_androidKt$AndroidView$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(2);
                    }

                    @Override // Ia.p
                    public final r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                        num.intValue();
                        AndroidView_androidKt.b(lVar, hVar2, lVar4, interfaceC1084f2, L4.b.l(i10 | 1), i11);
                        return r.f47939a;
                    }
                };
            }
        }
        i12 |= 384;
        lVar3 = lVar2;
        if ((i12 & 147) != 146) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (c1086gP.C(i12 & 1, z10)) {
            if (i15 != 0) {
                hVar3 = h.a.f13984b;
            } else {
                hVar3 = hVar;
            }
            lVar5 = f15754a;
            if (i13 != 0) {
                lVar6 = lVar5;
            } else {
                lVar6 = lVar3;
            }
            a(lVar, hVar3, null, lVar5, lVar6, c1086gP, (i12 & 14) | 3072 | (i12 & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) | ((i12 << 6) & 57344), 4);
            hVar2 = hVar3;
            lVar4 = lVar6;
        } else {
            c1086gP.w();
            hVar2 = hVar;
            lVar4 = lVar3;
        }
        c1105p0V = c1086gP.V();
        if (c1105p0V != null) {
            c1105p0V.f13109d = new p<InterfaceC1084f, Integer, r>() { // from class: androidx.compose.ui.viewinterop.AndroidView_androidKt$AndroidView$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(2);
                }

                @Override // Ia.p
                public final r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                    num.intValue();
                    AndroidView_androidKt.b(lVar, hVar2, lVar4, interfaceC1084f2, L4.b.l(i10 | 1), i11);
                    return r.f47939a;
                }
            };
        }
    }

    public static final ViewFactoryHolder c(LayoutNode layoutNode) {
        AndroidViewHolder androidViewHolder = layoutNode.f14413p;
        if (androidViewHolder != null) {
            return (ViewFactoryHolder) androidViewHolder;
        }
        throw v.g("Required value was null.");
    }

    /*  JADX ERROR: JadxRuntimeException in pass: ConstructorVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r10v9 ??, still in use, count: 1, list:
          (r10v9 ?? I:java.lang.Object) from 0x0061: INVOKE (r9v0 ?? I:androidx.compose.runtime.f), (r10v9 ?? I:java.lang.Object) INTERFACE call: androidx.compose.runtime.f.E(java.lang.Object):void A[MD:(java.lang.Object):void (m)] (LINE:98)
        	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:164)
        	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:129)
        	at jadx.core.utils.InsnRemover.lambda$unbindInsns$1(InsnRemover.java:101)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1604)
        	at jadx.core.utils.InsnRemover.unbindInsns(InsnRemover.java:100)
        	at jadx.core.utils.InsnRemover.perform(InsnRemover.java:75)
        	at jadx.core.dex.visitors.ConstructorVisitor.replaceInvoke(ConstructorVisitor.java:59)
        	at jadx.core.dex.visitors.ConstructorVisitor.visit(ConstructorVisitor.java:42)
        */
    public static final <T extends android.view.View> Ia.a<androidx.compose.ui.node.LayoutNode> d(
    /*  JADX ERROR: JadxRuntimeException in pass: ConstructorVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r10v9 ??, still in use, count: 1, list:
          (r10v9 ?? I:java.lang.Object) from 0x0061: INVOKE (r9v0 ?? I:androidx.compose.runtime.f), (r10v9 ?? I:java.lang.Object) INTERFACE call: androidx.compose.runtime.f.E(java.lang.Object):void A[MD:(java.lang.Object):void (m)] (LINE:98)
        	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:164)
        	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:129)
        	at jadx.core.utils.InsnRemover.lambda$unbindInsns$1(InsnRemover.java:101)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1604)
        	at jadx.core.utils.InsnRemover.unbindInsns(InsnRemover.java:100)
        	at jadx.core.utils.InsnRemover.perform(InsnRemover.java:75)
        	at jadx.core.dex.visitors.ConstructorVisitor.replaceInvoke(ConstructorVisitor.java:59)
        */
    /*  JADX ERROR: Method generation error
        jadx.core.utils.exceptions.JadxRuntimeException: Code variable not set in r8v0 ??
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

    public static final <T extends View> void e(InterfaceC1084f interfaceC1084f, h hVar, int i10, p013b0.c cVar, InterfaceC1376t interfaceC1376t, e eVar, LayoutDirection layoutDirection, androidx.compose.runtime.r rVar) {
        ComposeUiNode.f14331c0.getClass();
        R0.a(ComposeUiNode.Companion.f14336e, interfaceC1084f, rVar);
        R0.a(new p<LayoutNode, h, r>() { // from class: androidx.compose.ui.viewinterop.AndroidView_androidKt$updateViewHolderParams$1
            @Override // Ia.p
            public final r invoke(LayoutNode layoutNode, h hVar2) {
                AndroidView_androidKt.c(layoutNode).setModifier(hVar2);
                return r.f47939a;
            }
        }, interfaceC1084f, hVar);
        R0.a(new p<LayoutNode, p013b0.c, r>() { // from class: androidx.compose.ui.viewinterop.AndroidView_androidKt$updateViewHolderParams$2
            @Override // Ia.p
            public final r invoke(LayoutNode layoutNode, p013b0.c cVar2) {
                AndroidView_androidKt.c(layoutNode).setDensity(cVar2);
                return r.f47939a;
            }
        }, interfaceC1084f, cVar);
        R0.a(new p<LayoutNode, InterfaceC1376t, r>() { // from class: androidx.compose.ui.viewinterop.AndroidView_androidKt$updateViewHolderParams$3
            @Override // Ia.p
            public final r invoke(LayoutNode layoutNode, InterfaceC1376t interfaceC1376t2) {
                AndroidView_androidKt.c(layoutNode).setLifecycleOwner(interfaceC1376t2);
                return r.f47939a;
            }
        }, interfaceC1084f, interfaceC1376t);
        R0.a(new p<LayoutNode, e, r>() { // from class: androidx.compose.ui.viewinterop.AndroidView_androidKt$updateViewHolderParams$4
            @Override // Ia.p
            public final r invoke(LayoutNode layoutNode, e eVar2) {
                AndroidView_androidKt.c(layoutNode).setSavedStateRegistryOwner(eVar2);
                return r.f47939a;
            }
        }, interfaceC1084f, eVar);
        R0.a(new p<LayoutNode, LayoutDirection, r>() { // from class: androidx.compose.ui.viewinterop.AndroidView_androidKt$updateViewHolderParams$5
            @Override // Ia.p
            public final r invoke(LayoutNode layoutNode, LayoutDirection layoutDirection2) {
                int i11;
                ViewFactoryHolder viewFactoryHolderC = AndroidView_androidKt.c(layoutNode);
                int iOrdinal = layoutDirection2.ordinal();
                if (iOrdinal != 0) {
                    i11 = 1;
                    if (iOrdinal != 1) {
                        throw new NoWhenBranchMatchedException();
                    }
                } else {
                    i11 = 0;
                }
                viewFactoryHolderC.setLayoutDirection(i11);
                return r.f47939a;
            }
        }, interfaceC1084f, layoutDirection);
        p<ComposeUiNode, Integer, r> pVar = ComposeUiNode.Companion.f14338g;
        if (interfaceC1084f.m() || !i.a(interfaceC1084f.f(), Integer.valueOf(i10))) {
            k.b(i10, interfaceC1084f, i10, pVar);
        }
    }
}
