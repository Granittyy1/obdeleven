package io.intercom.android.sdk.ui.component;

import androidx.compose.animation.core.Animatable;
import androidx.compose.animation.core.C0901a;
import androidx.compose.animation.core.C0909i;
import androidx.compose.foundation.C0932d;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxWithConstraintsKt;
import androidx.compose.foundation.layout.InterfaceC0948h;
import androidx.compose.foundation.layout.InterfaceC0950j;
import androidx.compose.foundation.layout.W;
import androidx.compose.runtime.C1086g;
import androidx.compose.runtime.C1105p0;
import androidx.compose.runtime.E;
import androidx.compose.runtime.InterfaceC1084f;
import androidx.compose.ui.graphics.T;
import androidx.compose.ui.graphics.l0;
import io.intercom.android.sdk.m5.components.C2270b;
import io.intercom.android.sdk.ui.theme.IntercomTheme;
import io.intercom.android.sdk.ui.theme.IntercomThemeKt;
import me.zhanghai.android.materialprogressbar.R;

/* JADX INFO: compiled from: PulsatingBox.kt */
/* JADX INFO: loaded from: classes.dex */
public final class PulsatingBoxKt {
    /* JADX WARN: Code duplicated, block: B:102:0x0177  */
    /* JADX WARN: Code duplicated, block: B:104:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:58:0x00a0  */
    /* JADX WARN: Code duplicated, block: B:60:0x00a4  */
    /* JADX WARN: Code duplicated, block: B:62:0x00a9  */
    /* JADX WARN: Code duplicated, block: B:64:0x00af  */
    /* JADX WARN: Code duplicated, block: B:65:0x00b2  */
    /* JADX WARN: Code duplicated, block: B:68:0x00be  */
    /* JADX WARN: Code duplicated, block: B:72:0x00ce  */
    /* JADX WARN: Code duplicated, block: B:74:0x00d5  */
    /* JADX WARN: Code duplicated, block: B:84:0x00ec A[PHI: r1 r4 r5 r7
      0x00ec: PHI (r1v6 androidx.compose.ui.h) = (r1v3 androidx.compose.ui.h), (r1v9 androidx.compose.ui.h) binds: [B:94:0x0116, B:83:0x00eb] A[DONT_GENERATE, DONT_INLINE]
      0x00ec: PHI (r4v22 int) = (r4v15 int), (r4v24 int) binds: [B:94:0x0116, B:83:0x00eb] A[DONT_GENERATE, DONT_INLINE]
      0x00ec: PHI (r5v16 long) = (r5v9 long), (r5v8 long) binds: [B:94:0x0116, B:83:0x00eb] A[DONT_GENERATE, DONT_INLINE]
      0x00ec: PHI (r7v7 androidx.compose.ui.graphics.l0) = (r7v3 androidx.compose.ui.graphics.l0), (r7v2 androidx.compose.ui.graphics.l0) binds: [B:94:0x0116, B:83:0x00eb] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:85:0x00f2 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:86:0x00f4  */
    /* JADX WARN: Code duplicated, block: B:87:0x00f7  */
    /* JADX WARN: Code duplicated, block: B:90:0x00fc  */
    /* JADX WARN: Code duplicated, block: B:93:0x010d  */
    /* JADX WARN: Code duplicated, block: B:95:0x0118  */
    /* JADX WARN: Code duplicated, block: B:98:0x012f  */
    /* JADX INFO: renamed from: PulsatingBox-FU0evQE, reason: not valid java name */
    public static final void m546PulsatingBoxFU0evQE(androidx.compose.ui.h hVar, final float f10, long j, l0 l0Var, boolean z10, final Ia.q<? super InterfaceC0948h, ? super InterfaceC1084f, ? super Integer, p293xa.r> content, InterfaceC1084f interfaceC1084f, final int i10, final int i11) {
        androidx.compose.ui.h hVar2;
        int i12;
        long jM615getAction0d7_KjU;
        l0 l0VarA;
        boolean z11;
        int i13;
        final androidx.compose.ui.h hVar3;
        boolean z12;
        int i14;
        long j10;
        l0 l0Var2;
        Object objF;
        final long j11;
        final l0 l0Var3;
        final boolean z13;
        C1105p0 c1105p0V;
        kotlin.jvm.internal.i.e(content, "content");
        C1086g c1086gP = interfaceC1084f.p(-63498318);
        int i15 = i11 & 1;
        if (i15 != 0) {
            i12 = i10 | 6;
            hVar2 = hVar;
        } else if ((i10 & 14) == 0) {
            hVar2 = hVar;
            i12 = (c1086gP.K(hVar2) ? 4 : 2) | i10;
        } else {
            hVar2 = hVar;
            i12 = i10;
        }
        if ((i11 & 2) != 0) {
            i12 |= 48;
        } else if ((i10 & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) == 0) {
            i12 |= c1086gP.g(f10) ? 32 : 16;
        }
        if ((i10 & 896) == 0) {
            if ((i11 & 4) == 0) {
                jM615getAction0d7_KjU = j;
                int i16 = c1086gP.i(jM615getAction0d7_KjU) ? 256 : 128;
                i12 |= i16;
            } else {
                jM615getAction0d7_KjU = j;
            }
            i12 |= i16;
        } else {
            jM615getAction0d7_KjU = j;
        }
        if ((i10 & 7168) == 0) {
            if ((i11 & 8) == 0) {
                l0VarA = l0Var;
                int i17 = c1086gP.K(l0VarA) ? 2048 : 1024;
                i12 |= i17;
            } else {
                l0VarA = l0Var;
            }
            i12 |= i17;
        } else {
            l0VarA = l0Var;
        }
        int i18 = i11 & 16;
        if (i18 == 0) {
            if ((57344 & i10) == 0) {
                z11 = z10;
                i12 |= c1086gP.c(z11) ? 16384 : 8192;
            }
            if ((i11 & 32) != 0) {
                if ((458752 & i10) == 0) {
                    if (c1086gP.k(content)) {
                        i13 = 131072;
                    } else {
                        i13 = 65536;
                    }
                }
                if ((374491 & i12) == 74898 || !c1086gP.s()) {
                    c1086gP.r0();
                    if ((i10 & 1) != 0 || c1086gP.a0()) {
                        if (i15 != 0) {
                            hVar3 = androidx.compose.ui.h.a.f13984b;
                        } else {
                            hVar3 = hVar2;
                        }
                        if ((i11 & 4) != 0) {
                            jM615getAction0d7_KjU = IntercomTheme.INSTANCE.getColors(c1086gP, 6).m615getAction0d7_KjU();
                            i12 &= -897;
                        }
                        if ((i11 & 8) != 0) {
                            i12 &= -7169;
                            l0VarA = p270w.g.a(50);
                        }
                        if (i18 != 0) {
                            z12 = true;
                            i14 = i12;
                            j10 = jM615getAction0d7_KjU;
                            l0Var2 = l0VarA;
                        }
                        c1086gP.U();
                        c1086gP.L(-1108114118);
                        objF = c1086gP.f();
                        if (objF == InterfaceC1084f.a.f12980a) {
                            objF = C0901a.a(1.0f);
                            c1086gP.E(objF);
                        }
                        final Animatable animatable = (Animatable) objF;
                        c1086gP.T(false);
                        E.d(new PulsatingBoxKt$PulsatingBox$1(animatable, f10, null), c1086gP, Float.valueOf(f10));
                        final boolean z14 = z12;
                        final l0 l0Var4 = l0Var2;
                        final long j12 = j10;
                        BoxWithConstraintsKt.a(hVar3, androidx.compose.ui.d.a.f13339e, false, androidx.compose.runtime.internal.a.b(526284572, new Ia.q<InterfaceC0950j, InterfaceC1084f, Integer, p293xa.r>() { // from class: io.intercom.android.sdk.ui.component.PulsatingBoxKt$PulsatingBox$2
                            @Override // Ia.q
                            public /* bridge */ /* synthetic */ p293xa.r invoke(InterfaceC0950j interfaceC0950j, InterfaceC1084f interfaceC1084f2, Integer num) {
                                invoke(interfaceC0950j, interfaceC1084f2, num.intValue());
                                return p293xa.r.f47939a;
                            }

                            public final void invoke(InterfaceC0950j BoxWithConstraints, InterfaceC1084f interfaceC1084f2, int i19) {
                                int i20;
                                kotlin.jvm.internal.i.e(BoxWithConstraints, "$this$BoxWithConstraints");
                                if ((i19 & 14) == 0) {
                                    i20 = i19 | (interfaceC1084f2.K(BoxWithConstraints) ? 4 : 2);
                                } else {
                                    i20 = i19;
                                }
                                if ((i20 & 91) == 18 && interfaceC1084f2.s()) {
                                    interfaceC1084f2.w();
                                    return;
                                }
                                interfaceC1084f2.L(1154915079);
                                if (z14) {
                                    androidx.compose.ui.h hVarN = W.n(BoxWithConstraints.d(), BoxWithConstraints.i(), androidx.compose.ui.h.a.f13984b);
                                    float fFloatValue = animatable.d().floatValue();
                                    if (fFloatValue != 1.0f || fFloatValue != 1.0f) {
                                        hVarN = T.b(hVarN, fFloatValue, fFloatValue, 0.0f, 0.0f, 0.0f, null, false, 131068);
                                    }
                                    BoxKt.a(BoxWithConstraints.f(C0932d.b(P3.d.v(hVarN, 2, l0Var4, 0L, 0L, 28), j12, l0Var4), androidx.compose.ui.d.a.f13339e), interfaceC1084f2, 0);
                                }
                                interfaceC1084f2.D();
                                content.invoke(BoxWithConstraints, interfaceC1084f2, Integer.valueOf(i20 & 14));
                            }
                        }, c1086gP), c1086gP, (i14 & 14) | 3120, 4);
                        j11 = j10;
                        l0Var3 = l0Var2;
                        z13 = z12;
                    } else {
                        c1086gP.w();
                        if ((i11 & 4) != 0) {
                            i12 &= -897;
                        }
                        if ((i11 & 8) != 0) {
                            i12 &= -7169;
                        }
                        hVar3 = hVar2;
                    }
                    i14 = i12;
                    j10 = jM615getAction0d7_KjU;
                    l0Var2 = l0VarA;
                    z12 = z11;
                    c1086gP.U();
                    c1086gP.L(-1108114118);
                    objF = c1086gP.f();
                    if (objF == InterfaceC1084f.a.f12980a) {
                        objF = C0901a.a(1.0f);
                        c1086gP.E(objF);
                    }
                    final Animatable<Float, C0909i> animatable2 = (Animatable) objF;
                    c1086gP.T(false);
                    E.d(new PulsatingBoxKt$PulsatingBox$1(animatable2, f10, null), c1086gP, Float.valueOf(f10));
                    final boolean z15 = z12;
                    final l0 l0Var5 = l0Var2;
                    final long j13 = j10;
                    BoxWithConstraintsKt.a(hVar3, androidx.compose.ui.d.a.f13339e, false, androidx.compose.runtime.internal.a.b(526284572, new Ia.q<InterfaceC0950j, InterfaceC1084f, Integer, p293xa.r>() { // from class: io.intercom.android.sdk.ui.component.PulsatingBoxKt$PulsatingBox$2
                        @Override // Ia.q
                        public /* bridge */ /* synthetic */ p293xa.r invoke(InterfaceC0950j interfaceC0950j, InterfaceC1084f interfaceC1084f2, Integer num) {
                            invoke(interfaceC0950j, interfaceC1084f2, num.intValue());
                            return p293xa.r.f47939a;
                        }

                        public final void invoke(InterfaceC0950j BoxWithConstraints, InterfaceC1084f interfaceC1084f2, int i19) {
                            int i20;
                            kotlin.jvm.internal.i.e(BoxWithConstraints, "$this$BoxWithConstraints");
                            if ((i19 & 14) == 0) {
                                i20 = i19 | (interfaceC1084f2.K(BoxWithConstraints) ? 4 : 2);
                            } else {
                                i20 = i19;
                            }
                            if ((i20 & 91) == 18 && interfaceC1084f2.s()) {
                                interfaceC1084f2.w();
                                return;
                            }
                            interfaceC1084f2.L(1154915079);
                            if (z15) {
                                androidx.compose.ui.h hVarN = W.n(BoxWithConstraints.d(), BoxWithConstraints.i(), androidx.compose.ui.h.a.f13984b);
                                float fFloatValue = animatable2.d().floatValue();
                                if (fFloatValue != 1.0f || fFloatValue != 1.0f) {
                                    hVarN = T.b(hVarN, fFloatValue, fFloatValue, 0.0f, 0.0f, 0.0f, null, false, 131068);
                                }
                                BoxKt.a(BoxWithConstraints.f(C0932d.b(P3.d.v(hVarN, 2, l0Var5, 0L, 0L, 28), j13, l0Var5), androidx.compose.ui.d.a.f13339e), interfaceC1084f2, 0);
                            }
                            interfaceC1084f2.D();
                            content.invoke(BoxWithConstraints, interfaceC1084f2, Integer.valueOf(i20 & 14));
                        }
                    }, c1086gP), c1086gP, (i14 & 14) | 3120, 4);
                    j11 = j10;
                    l0Var3 = l0Var2;
                    z13 = z12;
                } else {
                    c1086gP.w();
                    hVar3 = hVar2;
                    j11 = jM615getAction0d7_KjU;
                    l0Var3 = l0VarA;
                    z13 = z11;
                }
                c1105p0V = c1086gP.V();
                if (c1105p0V != null) {
                    c1105p0V.f13109d = new Ia.p() { // from class: io.intercom.android.sdk.ui.component.v
                        @Override // Ia.p
                        public final Object invoke(Object obj, Object obj2) {
                            int iIntValue = ((Integer) obj2).intValue();
                            return PulsatingBoxKt.PulsatingBox_FU0evQE$lambda$1(hVar3, f10, j11, l0Var3, z13, content, i10, i11, (InterfaceC1084f) obj, iIntValue);
                        }
                    };
                }
            }
            i13 = 196608;
            i12 |= i13;
            if ((374491 & i12) == 74898) {
                c1086gP.r0();
                if ((i10 & 1) != 0) {
                    if (i15 != 0) {
                        hVar3 = androidx.compose.ui.h.a.f13984b;
                    } else {
                        hVar3 = hVar2;
                    }
                    if ((i11 & 4) != 0) {
                        jM615getAction0d7_KjU = IntercomTheme.INSTANCE.getColors(c1086gP, 6).m615getAction0d7_KjU();
                        i12 &= -897;
                    }
                    if ((i11 & 8) != 0) {
                        i12 &= -7169;
                        l0VarA = p270w.g.a(50);
                    }
                    if (i18 != 0) {
                        z12 = true;
                        i14 = i12;
                        j10 = jM615getAction0d7_KjU;
                        l0Var2 = l0VarA;
                    } else {
                        i14 = i12;
                        j10 = jM615getAction0d7_KjU;
                        l0Var2 = l0VarA;
                        z12 = z11;
                    }
                } else {
                    if (i15 != 0) {
                        hVar3 = androidx.compose.ui.h.a.f13984b;
                    } else {
                        hVar3 = hVar2;
                    }
                    if ((i11 & 4) != 0) {
                        jM615getAction0d7_KjU = IntercomTheme.INSTANCE.getColors(c1086gP, 6).m615getAction0d7_KjU();
                        i12 &= -897;
                    }
                    if ((i11 & 8) != 0) {
                        i12 &= -7169;
                        l0VarA = p270w.g.a(50);
                    }
                    if (i18 != 0) {
                        z12 = true;
                        i14 = i12;
                        j10 = jM615getAction0d7_KjU;
                        l0Var2 = l0VarA;
                    } else {
                        i14 = i12;
                        j10 = jM615getAction0d7_KjU;
                        l0Var2 = l0VarA;
                        z12 = z11;
                    }
                }
                c1086gP.U();
                c1086gP.L(-1108114118);
                objF = c1086gP.f();
                if (objF == InterfaceC1084f.a.f12980a) {
                    objF = C0901a.a(1.0f);
                    c1086gP.E(objF);
                }
                final Animatable<Float, C0909i> animatable3 = (Animatable) objF;
                c1086gP.T(false);
                E.d(new PulsatingBoxKt$PulsatingBox$1(animatable3, f10, null), c1086gP, Float.valueOf(f10));
                final boolean z16 = z12;
                final l0 l0Var6 = l0Var2;
                final long j14 = j10;
                BoxWithConstraintsKt.a(hVar3, androidx.compose.ui.d.a.f13339e, false, androidx.compose.runtime.internal.a.b(526284572, new Ia.q<InterfaceC0950j, InterfaceC1084f, Integer, p293xa.r>() { // from class: io.intercom.android.sdk.ui.component.PulsatingBoxKt$PulsatingBox$2
                    @Override // Ia.q
                    public /* bridge */ /* synthetic */ p293xa.r invoke(InterfaceC0950j interfaceC0950j, InterfaceC1084f interfaceC1084f2, Integer num) {
                        invoke(interfaceC0950j, interfaceC1084f2, num.intValue());
                        return p293xa.r.f47939a;
                    }

                    public final void invoke(InterfaceC0950j BoxWithConstraints, InterfaceC1084f interfaceC1084f2, int i19) {
                        int i20;
                        kotlin.jvm.internal.i.e(BoxWithConstraints, "$this$BoxWithConstraints");
                        if ((i19 & 14) == 0) {
                            i20 = i19 | (interfaceC1084f2.K(BoxWithConstraints) ? 4 : 2);
                        } else {
                            i20 = i19;
                        }
                        if ((i20 & 91) == 18 && interfaceC1084f2.s()) {
                            interfaceC1084f2.w();
                            return;
                        }
                        interfaceC1084f2.L(1154915079);
                        if (z16) {
                            androidx.compose.ui.h hVarN = W.n(BoxWithConstraints.d(), BoxWithConstraints.i(), androidx.compose.ui.h.a.f13984b);
                            float fFloatValue = animatable3.d().floatValue();
                            if (fFloatValue != 1.0f || fFloatValue != 1.0f) {
                                hVarN = T.b(hVarN, fFloatValue, fFloatValue, 0.0f, 0.0f, 0.0f, null, false, 131068);
                            }
                            BoxKt.a(BoxWithConstraints.f(C0932d.b(P3.d.v(hVarN, 2, l0Var6, 0L, 0L, 28), j14, l0Var6), androidx.compose.ui.d.a.f13339e), interfaceC1084f2, 0);
                        }
                        interfaceC1084f2.D();
                        content.invoke(BoxWithConstraints, interfaceC1084f2, Integer.valueOf(i20 & 14));
                    }
                }, c1086gP), c1086gP, (i14 & 14) | 3120, 4);
                j11 = j10;
                l0Var3 = l0Var2;
                z13 = z12;
            } else {
                c1086gP.r0();
                if ((i10 & 1) != 0) {
                    if (i15 != 0) {
                        hVar3 = androidx.compose.ui.h.a.f13984b;
                    } else {
                        hVar3 = hVar2;
                    }
                    if ((i11 & 4) != 0) {
                        jM615getAction0d7_KjU = IntercomTheme.INSTANCE.getColors(c1086gP, 6).m615getAction0d7_KjU();
                        i12 &= -897;
                    }
                    if ((i11 & 8) != 0) {
                        i12 &= -7169;
                        l0VarA = p270w.g.a(50);
                    }
                    if (i18 != 0) {
                        z12 = true;
                        i14 = i12;
                        j10 = jM615getAction0d7_KjU;
                        l0Var2 = l0VarA;
                    } else {
                        i14 = i12;
                        j10 = jM615getAction0d7_KjU;
                        l0Var2 = l0VarA;
                        z12 = z11;
                    }
                } else {
                    if (i15 != 0) {
                        hVar3 = androidx.compose.ui.h.a.f13984b;
                    } else {
                        hVar3 = hVar2;
                    }
                    if ((i11 & 4) != 0) {
                        jM615getAction0d7_KjU = IntercomTheme.INSTANCE.getColors(c1086gP, 6).m615getAction0d7_KjU();
                        i12 &= -897;
                    }
                    if ((i11 & 8) != 0) {
                        i12 &= -7169;
                        l0VarA = p270w.g.a(50);
                    }
                    if (i18 != 0) {
                        z12 = true;
                        i14 = i12;
                        j10 = jM615getAction0d7_KjU;
                        l0Var2 = l0VarA;
                    } else {
                        i14 = i12;
                        j10 = jM615getAction0d7_KjU;
                        l0Var2 = l0VarA;
                        z12 = z11;
                    }
                }
                c1086gP.U();
                c1086gP.L(-1108114118);
                objF = c1086gP.f();
                if (objF == InterfaceC1084f.a.f12980a) {
                    objF = C0901a.a(1.0f);
                    c1086gP.E(objF);
                }
                final Animatable<Float, C0909i> animatable4 = (Animatable) objF;
                c1086gP.T(false);
                E.d(new PulsatingBoxKt$PulsatingBox$1(animatable4, f10, null), c1086gP, Float.valueOf(f10));
                final boolean z17 = z12;
                final l0 l0Var7 = l0Var2;
                final long j15 = j10;
                BoxWithConstraintsKt.a(hVar3, androidx.compose.ui.d.a.f13339e, false, androidx.compose.runtime.internal.a.b(526284572, new Ia.q<InterfaceC0950j, InterfaceC1084f, Integer, p293xa.r>() { // from class: io.intercom.android.sdk.ui.component.PulsatingBoxKt$PulsatingBox$2
                    @Override // Ia.q
                    public /* bridge */ /* synthetic */ p293xa.r invoke(InterfaceC0950j interfaceC0950j, InterfaceC1084f interfaceC1084f2, Integer num) {
                        invoke(interfaceC0950j, interfaceC1084f2, num.intValue());
                        return p293xa.r.f47939a;
                    }

                    public final void invoke(InterfaceC0950j BoxWithConstraints, InterfaceC1084f interfaceC1084f2, int i19) {
                        int i20;
                        kotlin.jvm.internal.i.e(BoxWithConstraints, "$this$BoxWithConstraints");
                        if ((i19 & 14) == 0) {
                            i20 = i19 | (interfaceC1084f2.K(BoxWithConstraints) ? 4 : 2);
                        } else {
                            i20 = i19;
                        }
                        if ((i20 & 91) == 18 && interfaceC1084f2.s()) {
                            interfaceC1084f2.w();
                            return;
                        }
                        interfaceC1084f2.L(1154915079);
                        if (z17) {
                            androidx.compose.ui.h hVarN = W.n(BoxWithConstraints.d(), BoxWithConstraints.i(), androidx.compose.ui.h.a.f13984b);
                            float fFloatValue = animatable4.d().floatValue();
                            if (fFloatValue != 1.0f || fFloatValue != 1.0f) {
                                hVarN = T.b(hVarN, fFloatValue, fFloatValue, 0.0f, 0.0f, 0.0f, null, false, 131068);
                            }
                            BoxKt.a(BoxWithConstraints.f(C0932d.b(P3.d.v(hVarN, 2, l0Var7, 0L, 0L, 28), j15, l0Var7), androidx.compose.ui.d.a.f13339e), interfaceC1084f2, 0);
                        }
                        interfaceC1084f2.D();
                        content.invoke(BoxWithConstraints, interfaceC1084f2, Integer.valueOf(i20 & 14));
                    }
                }, c1086gP), c1086gP, (i14 & 14) | 3120, 4);
                j11 = j10;
                l0Var3 = l0Var2;
                z13 = z12;
            }
            c1105p0V = c1086gP.V();
            if (c1105p0V != null) {
                c1105p0V.f13109d = new Ia.p() { // from class: io.intercom.android.sdk.ui.component.v
                    @Override // Ia.p
                    public final Object invoke(Object obj, Object obj2) {
                        int iIntValue = ((Integer) obj2).intValue();
                        return PulsatingBoxKt.PulsatingBox_FU0evQE$lambda$1(hVar3, f10, j11, l0Var3, z13, content, i10, i11, (InterfaceC1084f) obj, iIntValue);
                    }
                };
            }
        }
        i12 |= 24576;
        z11 = z10;
        if ((i11 & 32) != 0) {
            if ((458752 & i10) == 0) {
                if (c1086gP.k(content)) {
                    i13 = 131072;
                } else {
                    i13 = 65536;
                }
            }
            if ((374491 & i12) == 74898) {
                c1086gP.r0();
                if ((i10 & 1) != 0) {
                    if (i15 != 0) {
                        hVar3 = androidx.compose.ui.h.a.f13984b;
                    } else {
                        hVar3 = hVar2;
                    }
                    if ((i11 & 4) != 0) {
                        jM615getAction0d7_KjU = IntercomTheme.INSTANCE.getColors(c1086gP, 6).m615getAction0d7_KjU();
                        i12 &= -897;
                    }
                    if ((i11 & 8) != 0) {
                        i12 &= -7169;
                        l0VarA = p270w.g.a(50);
                    }
                    if (i18 != 0) {
                        z12 = true;
                        i14 = i12;
                        j10 = jM615getAction0d7_KjU;
                        l0Var2 = l0VarA;
                    } else {
                        i14 = i12;
                        j10 = jM615getAction0d7_KjU;
                        l0Var2 = l0VarA;
                        z12 = z11;
                    }
                } else {
                    if (i15 != 0) {
                        hVar3 = androidx.compose.ui.h.a.f13984b;
                    } else {
                        hVar3 = hVar2;
                    }
                    if ((i11 & 4) != 0) {
                        jM615getAction0d7_KjU = IntercomTheme.INSTANCE.getColors(c1086gP, 6).m615getAction0d7_KjU();
                        i12 &= -897;
                    }
                    if ((i11 & 8) != 0) {
                        i12 &= -7169;
                        l0VarA = p270w.g.a(50);
                    }
                    if (i18 != 0) {
                        z12 = true;
                        i14 = i12;
                        j10 = jM615getAction0d7_KjU;
                        l0Var2 = l0VarA;
                    } else {
                        i14 = i12;
                        j10 = jM615getAction0d7_KjU;
                        l0Var2 = l0VarA;
                        z12 = z11;
                    }
                }
                c1086gP.U();
                c1086gP.L(-1108114118);
                objF = c1086gP.f();
                if (objF == InterfaceC1084f.a.f12980a) {
                    objF = C0901a.a(1.0f);
                    c1086gP.E(objF);
                }
                final Animatable<Float, C0909i> animatable5 = (Animatable) objF;
                c1086gP.T(false);
                E.d(new PulsatingBoxKt$PulsatingBox$1(animatable5, f10, null), c1086gP, Float.valueOf(f10));
                final boolean z18 = z12;
                final l0 l0Var8 = l0Var2;
                final long j16 = j10;
                BoxWithConstraintsKt.a(hVar3, androidx.compose.ui.d.a.f13339e, false, androidx.compose.runtime.internal.a.b(526284572, new Ia.q<InterfaceC0950j, InterfaceC1084f, Integer, p293xa.r>() { // from class: io.intercom.android.sdk.ui.component.PulsatingBoxKt$PulsatingBox$2
                    @Override // Ia.q
                    public /* bridge */ /* synthetic */ p293xa.r invoke(InterfaceC0950j interfaceC0950j, InterfaceC1084f interfaceC1084f2, Integer num) {
                        invoke(interfaceC0950j, interfaceC1084f2, num.intValue());
                        return p293xa.r.f47939a;
                    }

                    public final void invoke(InterfaceC0950j BoxWithConstraints, InterfaceC1084f interfaceC1084f2, int i19) {
                        int i20;
                        kotlin.jvm.internal.i.e(BoxWithConstraints, "$this$BoxWithConstraints");
                        if ((i19 & 14) == 0) {
                            i20 = i19 | (interfaceC1084f2.K(BoxWithConstraints) ? 4 : 2);
                        } else {
                            i20 = i19;
                        }
                        if ((i20 & 91) == 18 && interfaceC1084f2.s()) {
                            interfaceC1084f2.w();
                            return;
                        }
                        interfaceC1084f2.L(1154915079);
                        if (z18) {
                            androidx.compose.ui.h hVarN = W.n(BoxWithConstraints.d(), BoxWithConstraints.i(), androidx.compose.ui.h.a.f13984b);
                            float fFloatValue = animatable5.d().floatValue();
                            if (fFloatValue != 1.0f || fFloatValue != 1.0f) {
                                hVarN = T.b(hVarN, fFloatValue, fFloatValue, 0.0f, 0.0f, 0.0f, null, false, 131068);
                            }
                            BoxKt.a(BoxWithConstraints.f(C0932d.b(P3.d.v(hVarN, 2, l0Var8, 0L, 0L, 28), j16, l0Var8), androidx.compose.ui.d.a.f13339e), interfaceC1084f2, 0);
                        }
                        interfaceC1084f2.D();
                        content.invoke(BoxWithConstraints, interfaceC1084f2, Integer.valueOf(i20 & 14));
                    }
                }, c1086gP), c1086gP, (i14 & 14) | 3120, 4);
                j11 = j10;
                l0Var3 = l0Var2;
                z13 = z12;
            } else {
                c1086gP.r0();
                if ((i10 & 1) != 0) {
                    if (i15 != 0) {
                        hVar3 = androidx.compose.ui.h.a.f13984b;
                    } else {
                        hVar3 = hVar2;
                    }
                    if ((i11 & 4) != 0) {
                        jM615getAction0d7_KjU = IntercomTheme.INSTANCE.getColors(c1086gP, 6).m615getAction0d7_KjU();
                        i12 &= -897;
                    }
                    if ((i11 & 8) != 0) {
                        i12 &= -7169;
                        l0VarA = p270w.g.a(50);
                    }
                    if (i18 != 0) {
                        z12 = true;
                        i14 = i12;
                        j10 = jM615getAction0d7_KjU;
                        l0Var2 = l0VarA;
                    } else {
                        i14 = i12;
                        j10 = jM615getAction0d7_KjU;
                        l0Var2 = l0VarA;
                        z12 = z11;
                    }
                } else {
                    if (i15 != 0) {
                        hVar3 = androidx.compose.ui.h.a.f13984b;
                    } else {
                        hVar3 = hVar2;
                    }
                    if ((i11 & 4) != 0) {
                        jM615getAction0d7_KjU = IntercomTheme.INSTANCE.getColors(c1086gP, 6).m615getAction0d7_KjU();
                        i12 &= -897;
                    }
                    if ((i11 & 8) != 0) {
                        i12 &= -7169;
                        l0VarA = p270w.g.a(50);
                    }
                    if (i18 != 0) {
                        z12 = true;
                        i14 = i12;
                        j10 = jM615getAction0d7_KjU;
                        l0Var2 = l0VarA;
                    } else {
                        i14 = i12;
                        j10 = jM615getAction0d7_KjU;
                        l0Var2 = l0VarA;
                        z12 = z11;
                    }
                }
                c1086gP.U();
                c1086gP.L(-1108114118);
                objF = c1086gP.f();
                if (objF == InterfaceC1084f.a.f12980a) {
                    objF = C0901a.a(1.0f);
                    c1086gP.E(objF);
                }
                final Animatable<Float, C0909i> animatable6 = (Animatable) objF;
                c1086gP.T(false);
                E.d(new PulsatingBoxKt$PulsatingBox$1(animatable6, f10, null), c1086gP, Float.valueOf(f10));
                final boolean z19 = z12;
                final l0 l0Var9 = l0Var2;
                final long j17 = j10;
                BoxWithConstraintsKt.a(hVar3, androidx.compose.ui.d.a.f13339e, false, androidx.compose.runtime.internal.a.b(526284572, new Ia.q<InterfaceC0950j, InterfaceC1084f, Integer, p293xa.r>() { // from class: io.intercom.android.sdk.ui.component.PulsatingBoxKt$PulsatingBox$2
                    @Override // Ia.q
                    public /* bridge */ /* synthetic */ p293xa.r invoke(InterfaceC0950j interfaceC0950j, InterfaceC1084f interfaceC1084f2, Integer num) {
                        invoke(interfaceC0950j, interfaceC1084f2, num.intValue());
                        return p293xa.r.f47939a;
                    }

                    public final void invoke(InterfaceC0950j BoxWithConstraints, InterfaceC1084f interfaceC1084f2, int i19) {
                        int i20;
                        kotlin.jvm.internal.i.e(BoxWithConstraints, "$this$BoxWithConstraints");
                        if ((i19 & 14) == 0) {
                            i20 = i19 | (interfaceC1084f2.K(BoxWithConstraints) ? 4 : 2);
                        } else {
                            i20 = i19;
                        }
                        if ((i20 & 91) == 18 && interfaceC1084f2.s()) {
                            interfaceC1084f2.w();
                            return;
                        }
                        interfaceC1084f2.L(1154915079);
                        if (z19) {
                            androidx.compose.ui.h hVarN = W.n(BoxWithConstraints.d(), BoxWithConstraints.i(), androidx.compose.ui.h.a.f13984b);
                            float fFloatValue = animatable6.d().floatValue();
                            if (fFloatValue != 1.0f || fFloatValue != 1.0f) {
                                hVarN = T.b(hVarN, fFloatValue, fFloatValue, 0.0f, 0.0f, 0.0f, null, false, 131068);
                            }
                            BoxKt.a(BoxWithConstraints.f(C0932d.b(P3.d.v(hVarN, 2, l0Var9, 0L, 0L, 28), j17, l0Var9), androidx.compose.ui.d.a.f13339e), interfaceC1084f2, 0);
                        }
                        interfaceC1084f2.D();
                        content.invoke(BoxWithConstraints, interfaceC1084f2, Integer.valueOf(i20 & 14));
                    }
                }, c1086gP), c1086gP, (i14 & 14) | 3120, 4);
                j11 = j10;
                l0Var3 = l0Var2;
                z13 = z12;
            }
            c1105p0V = c1086gP.V();
            if (c1105p0V != null) {
                c1105p0V.f13109d = new Ia.p() { // from class: io.intercom.android.sdk.ui.component.v
                    @Override // Ia.p
                    public final Object invoke(Object obj, Object obj2) {
                        int iIntValue = ((Integer) obj2).intValue();
                        return PulsatingBoxKt.PulsatingBox_FU0evQE$lambda$1(hVar3, f10, j11, l0Var3, z13, content, i10, i11, (InterfaceC1084f) obj, iIntValue);
                    }
                };
            }
        }
        i13 = 196608;
        i12 |= i13;
        if ((374491 & i12) == 74898) {
            c1086gP.r0();
            if ((i10 & 1) != 0) {
                if (i15 != 0) {
                    hVar3 = androidx.compose.ui.h.a.f13984b;
                } else {
                    hVar3 = hVar2;
                }
                if ((i11 & 4) != 0) {
                    jM615getAction0d7_KjU = IntercomTheme.INSTANCE.getColors(c1086gP, 6).m615getAction0d7_KjU();
                    i12 &= -897;
                }
                if ((i11 & 8) != 0) {
                    i12 &= -7169;
                    l0VarA = p270w.g.a(50);
                }
                if (i18 != 0) {
                    z12 = true;
                    i14 = i12;
                    j10 = jM615getAction0d7_KjU;
                    l0Var2 = l0VarA;
                } else {
                    i14 = i12;
                    j10 = jM615getAction0d7_KjU;
                    l0Var2 = l0VarA;
                    z12 = z11;
                }
            } else {
                if (i15 != 0) {
                    hVar3 = androidx.compose.ui.h.a.f13984b;
                } else {
                    hVar3 = hVar2;
                }
                if ((i11 & 4) != 0) {
                    jM615getAction0d7_KjU = IntercomTheme.INSTANCE.getColors(c1086gP, 6).m615getAction0d7_KjU();
                    i12 &= -897;
                }
                if ((i11 & 8) != 0) {
                    i12 &= -7169;
                    l0VarA = p270w.g.a(50);
                }
                if (i18 != 0) {
                    z12 = true;
                    i14 = i12;
                    j10 = jM615getAction0d7_KjU;
                    l0Var2 = l0VarA;
                } else {
                    i14 = i12;
                    j10 = jM615getAction0d7_KjU;
                    l0Var2 = l0VarA;
                    z12 = z11;
                }
            }
            c1086gP.U();
            c1086gP.L(-1108114118);
            objF = c1086gP.f();
            if (objF == InterfaceC1084f.a.f12980a) {
                objF = C0901a.a(1.0f);
                c1086gP.E(objF);
            }
            final Animatable<Float, C0909i> animatable7 = (Animatable) objF;
            c1086gP.T(false);
            E.d(new PulsatingBoxKt$PulsatingBox$1(animatable7, f10, null), c1086gP, Float.valueOf(f10));
            final boolean z110 = z12;
            final l0 l0Var10 = l0Var2;
            final long j18 = j10;
            BoxWithConstraintsKt.a(hVar3, androidx.compose.ui.d.a.f13339e, false, androidx.compose.runtime.internal.a.b(526284572, new Ia.q<InterfaceC0950j, InterfaceC1084f, Integer, p293xa.r>() { // from class: io.intercom.android.sdk.ui.component.PulsatingBoxKt$PulsatingBox$2
                @Override // Ia.q
                public /* bridge */ /* synthetic */ p293xa.r invoke(InterfaceC0950j interfaceC0950j, InterfaceC1084f interfaceC1084f2, Integer num) {
                    invoke(interfaceC0950j, interfaceC1084f2, num.intValue());
                    return p293xa.r.f47939a;
                }

                public final void invoke(InterfaceC0950j BoxWithConstraints, InterfaceC1084f interfaceC1084f2, int i19) {
                    int i20;
                    kotlin.jvm.internal.i.e(BoxWithConstraints, "$this$BoxWithConstraints");
                    if ((i19 & 14) == 0) {
                        i20 = i19 | (interfaceC1084f2.K(BoxWithConstraints) ? 4 : 2);
                    } else {
                        i20 = i19;
                    }
                    if ((i20 & 91) == 18 && interfaceC1084f2.s()) {
                        interfaceC1084f2.w();
                        return;
                    }
                    interfaceC1084f2.L(1154915079);
                    if (z110) {
                        androidx.compose.ui.h hVarN = W.n(BoxWithConstraints.d(), BoxWithConstraints.i(), androidx.compose.ui.h.a.f13984b);
                        float fFloatValue = animatable7.d().floatValue();
                        if (fFloatValue != 1.0f || fFloatValue != 1.0f) {
                            hVarN = T.b(hVarN, fFloatValue, fFloatValue, 0.0f, 0.0f, 0.0f, null, false, 131068);
                        }
                        BoxKt.a(BoxWithConstraints.f(C0932d.b(P3.d.v(hVarN, 2, l0Var10, 0L, 0L, 28), j18, l0Var10), androidx.compose.ui.d.a.f13339e), interfaceC1084f2, 0);
                    }
                    interfaceC1084f2.D();
                    content.invoke(BoxWithConstraints, interfaceC1084f2, Integer.valueOf(i20 & 14));
                }
            }, c1086gP), c1086gP, (i14 & 14) | 3120, 4);
            j11 = j10;
            l0Var3 = l0Var2;
            z13 = z12;
        } else {
            c1086gP.r0();
            if ((i10 & 1) != 0) {
                if (i15 != 0) {
                    hVar3 = androidx.compose.ui.h.a.f13984b;
                } else {
                    hVar3 = hVar2;
                }
                if ((i11 & 4) != 0) {
                    jM615getAction0d7_KjU = IntercomTheme.INSTANCE.getColors(c1086gP, 6).m615getAction0d7_KjU();
                    i12 &= -897;
                }
                if ((i11 & 8) != 0) {
                    i12 &= -7169;
                    l0VarA = p270w.g.a(50);
                }
                if (i18 != 0) {
                    z12 = true;
                    i14 = i12;
                    j10 = jM615getAction0d7_KjU;
                    l0Var2 = l0VarA;
                } else {
                    i14 = i12;
                    j10 = jM615getAction0d7_KjU;
                    l0Var2 = l0VarA;
                    z12 = z11;
                }
            } else {
                if (i15 != 0) {
                    hVar3 = androidx.compose.ui.h.a.f13984b;
                } else {
                    hVar3 = hVar2;
                }
                if ((i11 & 4) != 0) {
                    jM615getAction0d7_KjU = IntercomTheme.INSTANCE.getColors(c1086gP, 6).m615getAction0d7_KjU();
                    i12 &= -897;
                }
                if ((i11 & 8) != 0) {
                    i12 &= -7169;
                    l0VarA = p270w.g.a(50);
                }
                if (i18 != 0) {
                    z12 = true;
                    i14 = i12;
                    j10 = jM615getAction0d7_KjU;
                    l0Var2 = l0VarA;
                } else {
                    i14 = i12;
                    j10 = jM615getAction0d7_KjU;
                    l0Var2 = l0VarA;
                    z12 = z11;
                }
            }
            c1086gP.U();
            c1086gP.L(-1108114118);
            objF = c1086gP.f();
            if (objF == InterfaceC1084f.a.f12980a) {
                objF = C0901a.a(1.0f);
                c1086gP.E(objF);
            }
            final Animatable<Float, C0909i> animatable8 = (Animatable) objF;
            c1086gP.T(false);
            E.d(new PulsatingBoxKt$PulsatingBox$1(animatable8, f10, null), c1086gP, Float.valueOf(f10));
            final boolean z111 = z12;
            final l0 l0Var11 = l0Var2;
            final long j19 = j10;
            BoxWithConstraintsKt.a(hVar3, androidx.compose.ui.d.a.f13339e, false, androidx.compose.runtime.internal.a.b(526284572, new Ia.q<InterfaceC0950j, InterfaceC1084f, Integer, p293xa.r>() { // from class: io.intercom.android.sdk.ui.component.PulsatingBoxKt$PulsatingBox$2
                @Override // Ia.q
                public /* bridge */ /* synthetic */ p293xa.r invoke(InterfaceC0950j interfaceC0950j, InterfaceC1084f interfaceC1084f2, Integer num) {
                    invoke(interfaceC0950j, interfaceC1084f2, num.intValue());
                    return p293xa.r.f47939a;
                }

                public final void invoke(InterfaceC0950j BoxWithConstraints, InterfaceC1084f interfaceC1084f2, int i19) {
                    int i20;
                    kotlin.jvm.internal.i.e(BoxWithConstraints, "$this$BoxWithConstraints");
                    if ((i19 & 14) == 0) {
                        i20 = i19 | (interfaceC1084f2.K(BoxWithConstraints) ? 4 : 2);
                    } else {
                        i20 = i19;
                    }
                    if ((i20 & 91) == 18 && interfaceC1084f2.s()) {
                        interfaceC1084f2.w();
                        return;
                    }
                    interfaceC1084f2.L(1154915079);
                    if (z111) {
                        androidx.compose.ui.h hVarN = W.n(BoxWithConstraints.d(), BoxWithConstraints.i(), androidx.compose.ui.h.a.f13984b);
                        float fFloatValue = animatable8.d().floatValue();
                        if (fFloatValue != 1.0f || fFloatValue != 1.0f) {
                            hVarN = T.b(hVarN, fFloatValue, fFloatValue, 0.0f, 0.0f, 0.0f, null, false, 131068);
                        }
                        BoxKt.a(BoxWithConstraints.f(C0932d.b(P3.d.v(hVarN, 2, l0Var11, 0L, 0L, 28), j19, l0Var11), androidx.compose.ui.d.a.f13339e), interfaceC1084f2, 0);
                    }
                    interfaceC1084f2.D();
                    content.invoke(BoxWithConstraints, interfaceC1084f2, Integer.valueOf(i20 & 14));
                }
            }, c1086gP), c1086gP, (i14 & 14) | 3120, 4);
            j11 = j10;
            l0Var3 = l0Var2;
            z13 = z12;
        }
        c1105p0V = c1086gP.V();
        if (c1105p0V != null) {
            c1105p0V.f13109d = new Ia.p() { // from class: io.intercom.android.sdk.ui.component.v
                @Override // Ia.p
                public final Object invoke(Object obj, Object obj2) {
                    int iIntValue = ((Integer) obj2).intValue();
                    return PulsatingBoxKt.PulsatingBox_FU0evQE$lambda$1(hVar3, f10, j11, l0Var3, z13, content, i10, i11, (InterfaceC1084f) obj, iIntValue);
                }
            };
        }
    }

    private static final void PulsatingBoxPreview(InterfaceC1084f interfaceC1084f, int i10) {
        C1086g c1086gP = interfaceC1084f.p(-2057763747);
        if (i10 == 0 && c1086gP.s()) {
            c1086gP.w();
        } else {
            IntercomThemeKt.IntercomTheme(null, null, null, ComposableSingletons$PulsatingBoxKt.INSTANCE.m521getLambda2$intercom_sdk_ui_release(), c1086gP, 3072, 7);
        }
        C1105p0 c1105p0V = c1086gP.V();
        if (c1105p0V != null) {
            c1105p0V.f13109d = new C2270b(i10, 10);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final p293xa.r PulsatingBoxPreview$lambda$2(int i10, InterfaceC1084f interfaceC1084f, int i11) {
        PulsatingBoxPreview(interfaceC1084f, L4.b.l(i10 | 1));
        return p293xa.r.f47939a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final p293xa.r PulsatingBox_FU0evQE$lambda$1(androidx.compose.ui.h hVar, float f10, long j, l0 l0Var, boolean z10, Ia.q content, int i10, int i11, InterfaceC1084f interfaceC1084f, int i12) {
        kotlin.jvm.internal.i.e(content, "$content");
        m546PulsatingBoxFU0evQE(hVar, f10, j, l0Var, z10, content, interfaceC1084f, L4.b.l(i10 | 1), i11);
        return p293xa.r.f47939a;
    }
}
