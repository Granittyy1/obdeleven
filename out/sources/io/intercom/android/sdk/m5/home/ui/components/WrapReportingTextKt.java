package io.intercom.android.sdk.m5.home.ui.components;

import androidx.compose.material3.TextKt;
import androidx.compose.runtime.C1086g;
import androidx.compose.runtime.C1105p0;
import androidx.compose.runtime.InterfaceC1084f;
import androidx.compose.runtime.J0;
import androidx.compose.runtime.X;
import androidx.compose.ui.text.B;
import androidx.compose.ui.text.F;
import io.intercom.android.sdk.m5.conversation.ui.T;
import io.intercom.android.sdk.ui.theme.IntercomThemeKt;
import me.zhanghai.android.materialprogressbar.R;

/* JADX INFO: compiled from: WrapReportingText.kt */
/* JADX INFO: loaded from: classes3.dex */
public final class WrapReportingTextKt {
    private static final void PreviewShortText(InterfaceC1084f interfaceC1084f, int i10) {
        C1086g c1086gP = interfaceC1084f.p(381018303);
        if (i10 == 0 && c1086gP.s()) {
            c1086gP.w();
        } else {
            IntercomThemeKt.IntercomTheme(null, null, null, ComposableSingletons$WrapReportingTextKt.INSTANCE.m310getLambda1$intercom_sdk_base_release(), c1086gP, 3072, 7);
        }
        C1105p0 c1105p0V = c1086gP.V();
        if (c1105p0V != null) {
            c1105p0V.f13109d = new q(i10, 0);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final p293xa.r PreviewShortText$lambda$7(int i10, InterfaceC1084f interfaceC1084f, int i11) {
        PreviewShortText(interfaceC1084f, L4.b.l(i10 | 1));
        return p293xa.r.f47939a;
    }

    /* JADX WARN: Code duplicated, block: B:60:0x00b7 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:61:0x00b9  */
    /* JADX WARN: Code duplicated, block: B:62:0x00bd  */
    /* JADX WARN: Code duplicated, block: B:64:0x00c0  */
    /* JADX WARN: Code duplicated, block: B:65:0x00c8  */
    /* JADX WARN: Code duplicated, block: B:68:0x00d7  */
    /* JADX WARN: Code duplicated, block: B:71:0x00f2  */
    /* JADX WARN: Code duplicated, block: B:74:0x010d  */
    /* JADX WARN: Code duplicated, block: B:75:0x010f  */
    /* JADX WARN: Code duplicated, block: B:78:0x0116 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:79:0x0118  */
    /* JADX WARN: Code duplicated, block: B:83:0x016f  */
    /* JADX WARN: Code duplicated, block: B:85:? A[RETURN, SYNTHETIC] */
    /* JADX INFO: renamed from: WrapReportingText-T042LqI, reason: not valid java name */
    public static final void m311WrapReportingTextT042LqI(androidx.compose.ui.h hVar, final String text, final long j, final F style, Ia.l<? super Boolean, p293xa.r> lVar, InterfaceC1084f interfaceC1084f, final int i10, final int i11) {
        androidx.compose.ui.h hVar2;
        int i12;
        Ia.l<? super Boolean, p293xa.r> lVar2;
        androidx.compose.ui.h hVar3;
        Ia.l<? super Boolean, p293xa.r> t8;
        Object objF;
        InterfaceC1084f.a.C0153a c0153a;
        X x10;
        Object objF2;
        boolean z10;
        Object objF3;
        C1086g c1086g;
        final Ia.l<? super Boolean, p293xa.r> lVar3;
        final androidx.compose.ui.h hVar4;
        C1105p0 c1105p0V;
        kotlin.jvm.internal.i.e(text, "text");
        kotlin.jvm.internal.i.e(style, "style");
        C1086g c1086gP = interfaceC1084f.p(834036955);
        int i13 = i11 & 1;
        if (i13 != 0) {
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
            i12 |= c1086gP.K(text) ? 32 : 16;
        }
        if ((i11 & 4) != 0) {
            i12 |= 384;
        } else if ((i10 & 896) == 0) {
            i12 |= c1086gP.i(j) ? 256 : 128;
        }
        if ((i11 & 8) != 0) {
            i12 |= 3072;
        } else if ((i10 & 7168) == 0) {
            i12 |= c1086gP.K(style) ? 2048 : 1024;
        }
        int i14 = i11 & 16;
        if (i14 == 0) {
            if ((i10 & 57344) == 0) {
                lVar2 = lVar;
                i12 |= c1086gP.k(lVar2) ? 16384 : 8192;
            }
            if ((46811 & i12) == 9362 || !c1086gP.s()) {
                if (i13 != 0) {
                    hVar3 = androidx.compose.ui.h.a.f13984b;
                } else {
                    hVar3 = hVar2;
                }
                if (i14 != 0) {
                    t8 = new T(1);
                } else {
                    t8 = lVar2;
                }
                c1086gP.L(1070301976);
                objF = c1086gP.f();
                c0153a = InterfaceC1084f.a.f12980a;
                if (objF == c0153a) {
                    objF = J0.f(Boolean.FALSE);
                    c1086gP.E(objF);
                }
                x10 = (X) objF;
                c1086gP.T(false);
                c1086gP.L(1070306974);
                objF2 = c1086gP.f();
                if (objF2 == c0153a) {
                    objF2 = new Ya.i(3, x10);
                    c1086gP.E(objF2);
                }
                c1086gP.T(false);
                androidx.compose.ui.h hVarC = androidx.compose.ui.draw.f.c(hVar3, (Ia.l) objF2);
                c1086gP.L(1070309155);
                if ((57344 & i12) == 16384) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                objF3 = c1086gP.f();
                if (z10 || objF3 == c0153a) {
                    objF3 = new io.intercom.android.sdk.m5.components.J0(t8, 2, x10);
                    c1086gP.E(objF3);
                }
                c1086gP.T(false);
                c1086g = c1086gP;
                TextKt.b(text, hVarC, j, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, (Ia.l) objF3, style, c1086g, ((i12 >> 3) & 14) | (i12 & 896), (i12 << 9) & 3670016, 32760);
                lVar3 = t8;
                hVar4 = hVar3;
            } else {
                c1086gP.w();
                c1086g = c1086gP;
                hVar4 = hVar2;
                lVar3 = lVar2;
            }
            c1105p0V = c1086g.V();
            if (c1105p0V != null) {
                c1105p0V.f13109d = new Ia.p() { // from class: io.intercom.android.sdk.m5.home.ui.components.r
                    @Override // Ia.p
                    public final Object invoke(Object obj, Object obj2) {
                        int iIntValue = ((Integer) obj2).intValue();
                        return WrapReportingTextKt.WrapReportingText_T042LqI$lambda$6(hVar4, text, j, style, lVar3, i10, i11, (InterfaceC1084f) obj, iIntValue);
                    }
                };
            }
        }
        i12 |= 24576;
        lVar2 = lVar;
        if ((46811 & i12) == 9362) {
            if (i13 != 0) {
                hVar3 = androidx.compose.ui.h.a.f13984b;
            } else {
                hVar3 = hVar2;
            }
            if (i14 != 0) {
                t8 = new T(1);
            } else {
                t8 = lVar2;
            }
            c1086gP.L(1070301976);
            objF = c1086gP.f();
            c0153a = InterfaceC1084f.a.f12980a;
            if (objF == c0153a) {
                objF = J0.f(Boolean.FALSE);
                c1086gP.E(objF);
            }
            x10 = (X) objF;
            c1086gP.T(false);
            c1086gP.L(1070306974);
            objF2 = c1086gP.f();
            if (objF2 == c0153a) {
                objF2 = new Ya.i(3, x10);
                c1086gP.E(objF2);
            }
            c1086gP.T(false);
            androidx.compose.ui.h hVarC2 = androidx.compose.ui.draw.f.c(hVar3, (Ia.l) objF2);
            c1086gP.L(1070309155);
            if ((57344 & i12) == 16384) {
                z10 = true;
            } else {
                z10 = false;
            }
            objF3 = c1086gP.f();
            if (z10) {
                objF3 = new io.intercom.android.sdk.m5.components.J0(t8, 2, x10);
                c1086gP.E(objF3);
            } else {
                objF3 = new io.intercom.android.sdk.m5.components.J0(t8, 2, x10);
                c1086gP.E(objF3);
            }
            c1086gP.T(false);
            c1086g = c1086gP;
            TextKt.b(text, hVarC2, j, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, (Ia.l) objF3, style, c1086g, ((i12 >> 3) & 14) | (i12 & 896), (i12 << 9) & 3670016, 32760);
            lVar3 = t8;
            hVar4 = hVar3;
        } else {
            if (i13 != 0) {
                hVar3 = androidx.compose.ui.h.a.f13984b;
            } else {
                hVar3 = hVar2;
            }
            if (i14 != 0) {
                t8 = new T(1);
            } else {
                t8 = lVar2;
            }
            c1086gP.L(1070301976);
            objF = c1086gP.f();
            c0153a = InterfaceC1084f.a.f12980a;
            if (objF == c0153a) {
                objF = J0.f(Boolean.FALSE);
                c1086gP.E(objF);
            }
            x10 = (X) objF;
            c1086gP.T(false);
            c1086gP.L(1070306974);
            objF2 = c1086gP.f();
            if (objF2 == c0153a) {
                objF2 = new Ya.i(3, x10);
                c1086gP.E(objF2);
            }
            c1086gP.T(false);
            androidx.compose.ui.h hVarC3 = androidx.compose.ui.draw.f.c(hVar3, (Ia.l) objF2);
            c1086gP.L(1070309155);
            if ((57344 & i12) == 16384) {
                z10 = true;
            } else {
                z10 = false;
            }
            objF3 = c1086gP.f();
            if (z10) {
                objF3 = new io.intercom.android.sdk.m5.components.J0(t8, 2, x10);
                c1086gP.E(objF3);
            } else {
                objF3 = new io.intercom.android.sdk.m5.components.J0(t8, 2, x10);
                c1086gP.E(objF3);
            }
            c1086gP.T(false);
            c1086g = c1086gP;
            TextKt.b(text, hVarC3, j, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, (Ia.l) objF3, style, c1086g, ((i12 >> 3) & 14) | (i12 & 896), (i12 << 9) & 3670016, 32760);
            lVar3 = t8;
            hVar4 = hVar3;
        }
        c1105p0V = c1086g.V();
        if (c1105p0V != null) {
            c1105p0V.f13109d = new Ia.p() { // from class: io.intercom.android.sdk.m5.home.ui.components.r
                @Override // Ia.p
                public final Object invoke(Object obj, Object obj2) {
                    int iIntValue = ((Integer) obj2).intValue();
                    return WrapReportingTextKt.WrapReportingText_T042LqI$lambda$6(hVar4, text, j, style, lVar3, i10, i11, (InterfaceC1084f) obj, iIntValue);
                }
            };
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final p293xa.r WrapReportingText_T042LqI$lambda$0(boolean z10) {
        return p293xa.r.f47939a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final p293xa.r WrapReportingText_T042LqI$lambda$3$lambda$2(X readyToDraw, J.c drawWithContent) {
        kotlin.jvm.internal.i.e(readyToDraw, "$readyToDraw");
        kotlin.jvm.internal.i.e(drawWithContent, "$this$drawWithContent");
        if (((Boolean) readyToDraw.getValue()).booleanValue()) {
            drawWithContent.A1();
        }
        return p293xa.r.f47939a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final p293xa.r WrapReportingText_T042LqI$lambda$5$lambda$4(Ia.l lVar, X readyToDraw, B textLayoutResult) {
        kotlin.jvm.internal.i.e(readyToDraw, "$readyToDraw");
        kotlin.jvm.internal.i.e(textLayoutResult, "textLayoutResult");
        lVar.invoke(Boolean.valueOf(textLayoutResult.f15301b.f15475f > 1));
        readyToDraw.setValue(Boolean.TRUE);
        return p293xa.r.f47939a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final p293xa.r WrapReportingText_T042LqI$lambda$6(androidx.compose.ui.h hVar, String text, long j, F style, Ia.l lVar, int i10, int i11, InterfaceC1084f interfaceC1084f, int i12) {
        kotlin.jvm.internal.i.e(text, "$text");
        kotlin.jvm.internal.i.e(style, "$style");
        m311WrapReportingTextT042LqI(hVar, text, j, style, lVar, interfaceC1084f, L4.b.l(i10 | 1), i11);
        return p293xa.r.f47939a;
    }
}
