package io.intercom.android.sdk.survey.ui.questiontype.numericscale;

import Ia.l;
import Ia.p;
import androidx.compose.foundation.C0936h;
import androidx.compose.foundation.CanvasKt;
import androidx.compose.foundation.layout.W;
import androidx.compose.runtime.C1086g;
import androidx.compose.runtime.C1105p0;
import androidx.compose.runtime.InterfaceC1084f;
import androidx.compose.ui.graphics.A;
import androidx.compose.ui.graphics.C1144u;
import androidx.compose.ui.graphics.C1146w;
import androidx.compose.ui.graphics.H;
import androidx.compose.ui.graphics.Path;
import io.intercom.android.sdk.m5.components.T;
import io.intercom.android.sdk.m5.conversation.ui.components.O;
import io.intercom.android.sdk.utilities.ColorExtensionsKt;
import me.zhanghai.android.materialprogressbar.R;
import p293xa.r;

/* JADX INFO: compiled from: StarRating.kt */
/* JADX INFO: loaded from: classes3.dex */
public final class StarRatingKt {
    public static final void SelectedStar(InterfaceC1084f interfaceC1084f, int i10) {
        C1086g c1086gP = interfaceC1084f.p(-596392123);
        if (i10 == 0 && c1086gP.s()) {
            c1086gP.w();
        } else {
            float f10 = 44;
            m445StarRatingtAjK0ZQ(W.e(W.q(androidx.compose.ui.h.a.f13984b, f10), f10), H.j, 0.0f, 0L, c1086gP, 54, 12);
        }
        C1105p0 c1105p0V = c1086gP.V();
        if (c1105p0V != null) {
            c1105p0V.f13109d = new T(i10, 8);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final r SelectedStar$lambda$4(int i10, InterfaceC1084f interfaceC1084f, int i11) {
        SelectedStar(interfaceC1084f, L4.b.l(i10 | 1));
        return r.f47939a;
    }

    /* JADX WARN: Code duplicated, block: B:36:0x0066  */
    /* JADX WARN: Code duplicated, block: B:41:0x0074  */
    /* JADX WARN: Code duplicated, block: B:43:0x0078  */
    /* JADX WARN: Code duplicated, block: B:51:0x0090  */
    /* JADX WARN: Code duplicated, block: B:53:0x0098  */
    /* JADX WARN: Code duplicated, block: B:60:0x00aa A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:61:0x00ac  */
    /* JADX WARN: Code duplicated, block: B:62:0x00af  */
    /* JADX WARN: Code duplicated, block: B:64:0x00b2  */
    /* JADX WARN: Code duplicated, block: B:66:0x00b7  */
    /* JADX WARN: Code duplicated, block: B:69:0x00bd  */
    /* JADX WARN: Code duplicated, block: B:72:0x00d4  */
    /* JADX WARN: Code duplicated, block: B:74:0x00da  */
    /* JADX WARN: Code duplicated, block: B:80:0x00e5  */
    /* JADX WARN: Code duplicated, block: B:81:0x00e7  */
    /* JADX WARN: Code duplicated, block: B:85:0x00f0  */
    /* JADX WARN: Code duplicated, block: B:88:0x00f8  */
    /* JADX WARN: Code duplicated, block: B:90:0x00fc  */
    /* JADX WARN: Code duplicated, block: B:94:0x011e  */
    /* JADX WARN: Code duplicated, block: B:96:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Instruction removed from duplicated block: B:51:0x0090, please report this as an issue */
    /* JADX INFO: renamed from: StarRating-tAjK0ZQ, reason: not valid java name */
    public static final void m445StarRatingtAjK0ZQ(androidx.compose.ui.h hVar, long j, float f10, long j10, InterfaceC1084f interfaceC1084f, final int i10, final int i11) {
        androidx.compose.ui.h hVar2;
        int i12;
        long j11;
        float f11;
        long jM659getAccessibleBorderColor8_81llA;
        final androidx.compose.ui.h hVar3;
        boolean z10;
        boolean z11;
        Object objF;
        final long j12;
        final float f12;
        final long j13;
        C1105p0 c1105p0V;
        int i13;
        C1086g c1086gP = interfaceC1084f.p(-1509251218);
        int i14 = i11 & 1;
        if (i14 != 0) {
            i12 = i10 | 6;
            hVar2 = hVar;
        } else if ((i10 & 14) == 0) {
            hVar2 = hVar;
            i12 = (c1086gP.K(hVar2) ? 4 : 2) | i10;
        } else {
            hVar2 = hVar;
            i12 = i10;
        }
        int i15 = i11 & 2;
        if (i15 != 0) {
            i12 |= 48;
            j11 = j;
        } else {
            j11 = j;
            if ((i10 & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) == 0) {
                i12 |= c1086gP.i(j11) ? 32 : 16;
            }
        }
        int i16 = i11 & 4;
        if (i16 == 0) {
            if ((i10 & 896) == 0) {
                f11 = f10;
                i12 |= c1086gP.g(f11) ? 256 : 128;
            }
            if ((i10 & 7168) == 0) {
                jM659getAccessibleBorderColor8_81llA = j10;
                if ((i11 & 8) == 0 || !c1086gP.i(jM659getAccessibleBorderColor8_81llA)) {
                    i13 = 1024;
                } else {
                    i13 = 2048;
                }
                i12 |= i13;
            } else {
                jM659getAccessibleBorderColor8_81llA = j10;
            }
            if ((i12 & 5851) == 1170 || !c1086gP.s()) {
                c1086gP.r0();
                if ((i10 & 1) != 0 || c1086gP.a0()) {
                    if (i14 != 0) {
                        hVar3 = androidx.compose.ui.h.a.f13984b;
                    } else {
                        hVar3 = hVar2;
                    }
                    if (i15 != 0) {
                        j11 = H.f13499f;
                    }
                    if (i16 != 0) {
                        f11 = 1;
                    }
                    if ((i11 & 8) != 0) {
                        i12 &= -7169;
                        jM659getAccessibleBorderColor8_81llA = ColorExtensionsKt.m659getAccessibleBorderColor8_81llA(j11);
                    }
                } else {
                    c1086gP.w();
                    if ((i11 & 8) != 0) {
                        i12 &= -7169;
                    }
                    hVar3 = hVar2;
                }
                c1086gP.U();
                c1086gP.L(-1036119505);
                boolean z12 = (((i12 & 7168) ^ 3072) <= 2048 && c1086gP.i(jM659getAccessibleBorderColor8_81llA)) || (i12 & 3072) == 2048;
                if ((i12 & 896) == 256) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                z11 = z12 | z10 | ((i12 & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) == 32);
                objF = c1086gP.f();
                if (z11 || objF == InterfaceC1084f.a.f12980a) {
                    final float f13 = f11;
                    final long j14 = jM659getAccessibleBorderColor8_81llA;
                    final long j15 = j11;
                    objF = new l() { // from class: io.intercom.android.sdk.survey.ui.questiontype.numericscale.i
                        @Override // Ia.l
                        public final Object invoke(Object obj) {
                            return StarRatingKt.StarRating_tAjK0ZQ$lambda$2$lambda$1(j14, f13, j15, (J.e) obj);
                        }
                    };
                    c1086gP.E(objF);
                }
                c1086gP.T(false);
                CanvasKt.a(hVar3, (l) objF, c1086gP, i12 & 14);
            } else {
                c1086gP.w();
                hVar3 = hVar2;
            }
            j12 = j11;
            f12 = f11;
            j13 = jM659getAccessibleBorderColor8_81llA;
            c1105p0V = c1086gP.V();
            if (c1105p0V != null) {
                c1105p0V.f13109d = new p() { // from class: io.intercom.android.sdk.survey.ui.questiontype.numericscale.j
                    @Override // Ia.p
                    public final Object invoke(Object obj, Object obj2) {
                        int iIntValue = ((Integer) obj2).intValue();
                        return StarRatingKt.StarRating_tAjK0ZQ$lambda$3(hVar3, j12, f12, j13, i10, i11, (InterfaceC1084f) obj, iIntValue);
                    }
                };
            }
        }
        i12 |= 384;
        f11 = f10;
        if ((i10 & 7168) == 0) {
            jM659getAccessibleBorderColor8_81llA = j10;
            if ((i11 & 8) == 0) {
                i13 = 1024;
            } else {
                i13 = 1024;
            }
            i12 |= i13;
        } else {
            jM659getAccessibleBorderColor8_81llA = j10;
        }
        if ((i12 & 5851) == 1170) {
            c1086gP.r0();
            if ((i10 & 1) != 0) {
                if (i14 != 0) {
                    hVar3 = androidx.compose.ui.h.a.f13984b;
                } else {
                    hVar3 = hVar2;
                }
                if (i15 != 0) {
                    j11 = H.f13499f;
                }
                if (i16 != 0) {
                    f11 = 1;
                }
                if ((i11 & 8) != 0) {
                    i12 &= -7169;
                    jM659getAccessibleBorderColor8_81llA = ColorExtensionsKt.m659getAccessibleBorderColor8_81llA(j11);
                }
            } else {
                if (i14 != 0) {
                    hVar3 = androidx.compose.ui.h.a.f13984b;
                } else {
                    hVar3 = hVar2;
                }
                if (i15 != 0) {
                    j11 = H.f13499f;
                }
                if (i16 != 0) {
                    f11 = 1;
                }
                if ((i11 & 8) != 0) {
                    i12 &= -7169;
                    jM659getAccessibleBorderColor8_81llA = ColorExtensionsKt.m659getAccessibleBorderColor8_81llA(j11);
                }
            }
            c1086gP.U();
            c1086gP.L(-1036119505);
            if (((i12 & 7168) ^ 3072) <= 2048) {
            }
            if ((i12 & 896) == 256) {
                z10 = true;
            } else {
                z10 = false;
            }
            z11 = z12 | z10 | ((i12 & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) == 32);
            objF = c1086gP.f();
            if (z11) {
                final float f14 = f11;
                final long j16 = jM659getAccessibleBorderColor8_81llA;
                final long j17 = j11;
                objF = new l() { // from class: io.intercom.android.sdk.survey.ui.questiontype.numericscale.i
                    @Override // Ia.l
                    public final Object invoke(Object obj) {
                        return StarRatingKt.StarRating_tAjK0ZQ$lambda$2$lambda$1(j16, f14, j17, (J.e) obj);
                    }
                };
                c1086gP.E(objF);
            } else {
                final float f15 = f11;
                final long j18 = jM659getAccessibleBorderColor8_81llA;
                final long j19 = j11;
                objF = new l() { // from class: io.intercom.android.sdk.survey.ui.questiontype.numericscale.i
                    @Override // Ia.l
                    public final Object invoke(Object obj) {
                        return StarRatingKt.StarRating_tAjK0ZQ$lambda$2$lambda$1(j18, f15, j19, (J.e) obj);
                    }
                };
                c1086gP.E(objF);
            }
            c1086gP.T(false);
            CanvasKt.a(hVar3, (l) objF, c1086gP, i12 & 14);
        } else {
            c1086gP.r0();
            if ((i10 & 1) != 0) {
                if (i14 != 0) {
                    hVar3 = androidx.compose.ui.h.a.f13984b;
                } else {
                    hVar3 = hVar2;
                }
                if (i15 != 0) {
                    j11 = H.f13499f;
                }
                if (i16 != 0) {
                    f11 = 1;
                }
                if ((i11 & 8) != 0) {
                    i12 &= -7169;
                    jM659getAccessibleBorderColor8_81llA = ColorExtensionsKt.m659getAccessibleBorderColor8_81llA(j11);
                }
            } else {
                if (i14 != 0) {
                    hVar3 = androidx.compose.ui.h.a.f13984b;
                } else {
                    hVar3 = hVar2;
                }
                if (i15 != 0) {
                    j11 = H.f13499f;
                }
                if (i16 != 0) {
                    f11 = 1;
                }
                if ((i11 & 8) != 0) {
                    i12 &= -7169;
                    jM659getAccessibleBorderColor8_81llA = ColorExtensionsKt.m659getAccessibleBorderColor8_81llA(j11);
                }
            }
            c1086gP.U();
            c1086gP.L(-1036119505);
            if (((i12 & 7168) ^ 3072) <= 2048) {
            }
            if ((i12 & 896) == 256) {
                z10 = true;
            } else {
                z10 = false;
            }
            z11 = z12 | z10 | ((i12 & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) == 32);
            objF = c1086gP.f();
            if (z11) {
                final float f16 = f11;
                final long j110 = jM659getAccessibleBorderColor8_81llA;
                final long j111 = j11;
                objF = new l() { // from class: io.intercom.android.sdk.survey.ui.questiontype.numericscale.i
                    @Override // Ia.l
                    public final Object invoke(Object obj) {
                        return StarRatingKt.StarRating_tAjK0ZQ$lambda$2$lambda$1(j110, f16, j111, (J.e) obj);
                    }
                };
                c1086gP.E(objF);
            } else {
                final float f17 = f11;
                final long j112 = jM659getAccessibleBorderColor8_81llA;
                final long j113 = j11;
                objF = new l() { // from class: io.intercom.android.sdk.survey.ui.questiontype.numericscale.i
                    @Override // Ia.l
                    public final Object invoke(Object obj) {
                        return StarRatingKt.StarRating_tAjK0ZQ$lambda$2$lambda$1(j112, f17, j113, (J.e) obj);
                    }
                };
                c1086gP.E(objF);
            }
            c1086gP.T(false);
            CanvasKt.a(hVar3, (l) objF, c1086gP, i12 & 14);
        }
        j12 = j11;
        f12 = f11;
        j13 = jM659getAccessibleBorderColor8_81llA;
        c1105p0V = c1086gP.V();
        if (c1105p0V != null) {
            c1105p0V.f13109d = new p() { // from class: io.intercom.android.sdk.survey.ui.questiontype.numericscale.j
                @Override // Ia.p
                public final Object invoke(Object obj, Object obj2) {
                    int iIntValue = ((Integer) obj2).intValue();
                    return StarRatingKt.StarRating_tAjK0ZQ$lambda$3(hVar3, j12, f12, j13, i10, i11, (InterfaceC1084f) obj, iIntValue);
                }
            };
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final r StarRating_tAjK0ZQ$lambda$2$lambda$1(long j, float f10, long j10, J.e Canvas) {
        kotlin.jvm.internal.i.e(Canvas, "$this$Canvas");
        float fIntBitsToFloat = Float.intBitsToFloat((int) (Canvas.j() >> 32)) / 33.0f;
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (Canvas.j() & 4294967295L)) / 32.0f;
        Path starPath = getStarPath();
        long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(0.0f)) & 4294967295L) | (Float.floatToRawIntBits(0.0f) << 32);
        J.a.b bVarW0 = Canvas.W0();
        long jE = bVarW0.e();
        bVarW0.a().g();
        try {
            bVarW0.f3948a.f(fIntBitsToFloat, fIntBitsToFloat2, jFloatToRawIntBits);
            J.e.N(Canvas, starPath, j, new J.i(Canvas.T0(f10), 0.0f, 0, 0, 30), null, 52);
            J.e.N(Canvas, starPath, j10, J.h.f3954a, new A(5, j10), 36);
            return r.f47939a;
        } finally {
            C0936h.f(bVarW0, jE);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final r StarRating_tAjK0ZQ$lambda$3(androidx.compose.ui.h hVar, long j, float f10, long j10, int i10, int i11, InterfaceC1084f interfaceC1084f, int i12) {
        m445StarRatingtAjK0ZQ(hVar, j, f10, j10, interfaceC1084f, L4.b.l(i10 | 1), i11);
        return r.f47939a;
    }

    public static final void UnSelectedStar(InterfaceC1084f interfaceC1084f, int i10) {
        C1086g c1086gP = interfaceC1084f.p(843558828);
        if (i10 == 0 && c1086gP.s()) {
            c1086gP.w();
        } else {
            float f10 = 44;
            m445StarRatingtAjK0ZQ(W.e(W.q(androidx.compose.ui.h.a.f13984b, f10), f10), 0L, 0.0f, 0L, c1086gP, 6, 14);
        }
        C1105p0 c1105p0V = c1086gP.V();
        if (c1105p0V != null) {
            c1105p0V.f13109d = new O(i10, 4);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final r UnSelectedStar$lambda$5(int i10, InterfaceC1084f interfaceC1084f, int i11) {
        UnSelectedStar(interfaceC1084f, L4.b.l(i10 | 1));
        return r.f47939a;
    }

    public static final Path getStarPath() {
        C1144u c1144uA = C1146w.a();
        c1144uA.l(31.9f, 11.25f);
        c1144uA.m(32.95f, 11.39f, 33.38f, 12.71f, 32.6f, 13.46f);
        c1144uA.t(25.33f, 20.47f);
        c1144uA.t(27.16f, 30.48f);
        c1144uA.m(27.35f, 31.54f, 26.25f, 32.36f, 25.31f, 31.84f);
        c1144uA.t(16.5f, 26.98f);
        c1144uA.t(7.69f, 31.84f);
        c1144uA.m(6.75f, 32.36f, 5.65f, 31.54f, 5.84f, 30.48f);
        c1144uA.t(7.67f, 20.47f);
        c1144uA.t(0.4f, 13.46f);
        c1144uA.m(-0.38f, 12.71f, 0.05f, 11.39f, 1.1f, 11.25f);
        c1144uA.t(11.04f, 9.92f);
        c1144uA.t(15.36f, 0.73f);
        c1144uA.m(15.82f, -0.24f, 17.18f, -0.24f, 17.64f, 0.73f);
        c1144uA.t(21.96f, 9.92f);
        c1144uA.t(31.9f, 11.25f);
        return c1144uA;
    }
}
