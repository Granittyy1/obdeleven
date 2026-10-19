package androidx.compose.material;

import androidx.compose.animation.ColorVectorConverterKt;
import androidx.compose.animation.core.Transition;
import androidx.compose.animation.core.TransitionKt;
import androidx.compose.animation.core.VectorConvertersKt;
import androidx.compose.animation.core.b0;
import androidx.compose.animation.core.d0;
import androidx.compose.animation.core.e0;
import androidx.compose.runtime.C1085f0;
import androidx.compose.runtime.C1086g;
import androidx.compose.runtime.C1105p0;
import androidx.compose.runtime.InterfaceC1084f;
import kotlin.NoWhenBranchMatchedException;
import me.zhanghai.android.materialprogressbar.R;

/* JADX INFO: compiled from: TextFieldImpl.kt */
/* JADX INFO: loaded from: classes.dex */
public final class TextFieldTransitionScope {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final TextFieldTransitionScope f11851a = new TextFieldTransitionScope();

    /* JADX INFO: compiled from: TextFieldImpl.kt */
    public /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f11856a;

        static {
            int[] iArr = new int[InputPhase.values().length];
            try {
                InputPhase inputPhase = InputPhase.f11758b;
                iArr[0] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                InputPhase inputPhase2 = InputPhase.f11758b;
                iArr[1] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                InputPhase inputPhase3 = InputPhase.f11758b;
                iArr[2] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f11856a = iArr;
        }
    }

    /* JADX WARN: Code duplicated, block: B:101:0x01ad  */
    /* JADX WARN: Code duplicated, block: B:104:0x01c3 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:105:0x01c5  */
    /* JADX WARN: Code duplicated, block: B:108:0x01e6  */
    /* JADX WARN: Code duplicated, block: B:110:0x01ea  */
    /* JADX WARN: Code duplicated, block: B:113:0x020a  */
    /* JADX WARN: Code duplicated, block: B:115:0x020e  */
    /* JADX WARN: Code duplicated, block: B:118:0x0262 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:119:0x0264  */
    /* JADX WARN: Code duplicated, block: B:88:0x015b A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:89:0x015d  */
    /* JADX WARN: Code duplicated, block: B:92:0x0161  */
    /* JADX WARN: Code duplicated, block: B:94:0x0167 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:96:0x016a  */
    /* JADX WARN: Code duplicated, block: B:99:0x01a9  */
    /* JADX WARN: Multi-variable type inference failed */
    public final void a(final InputPhase inputPhase, final long j, final long j10, final Ia.q<? super InputPhase, ? super InterfaceC1084f, ? super Integer, androidx.compose.ui.graphics.H> qVar, final boolean z10, final Ia.t<? super Float, ? super androidx.compose.ui.graphics.H, ? super androidx.compose.ui.graphics.H, ? super Float, ? super InterfaceC1084f, ? super Integer, p293xa.r> tVar, InterfaceC1084f interfaceC1084f, final int i10) {
        int i11;
        float f10;
        float f11;
        int i12;
        float f12;
        int iOrdinal;
        InputPhase inputPhase2;
        int[] iArr;
        long j11;
        androidx.compose.ui.graphics.colorspace.c cVarF;
        boolean zK;
        Object objF;
        InputPhase inputPhase3;
        long j12;
        InputPhase inputPhase4;
        long j13;
        androidx.compose.ui.graphics.colorspace.c cVarF2;
        boolean zK2;
        Object objF2;
        C1086g c1086gP = interfaceC1084f.p(1988729962);
        if ((i10 & 6) == 0) {
            i11 = (c1086gP.K(inputPhase) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            i11 |= c1086gP.i(j) ? 32 : 16;
        }
        if ((i10 & 384) == 0) {
            i11 |= c1086gP.i(j10) ? 256 : 128;
        }
        if ((i10 & 3072) == 0) {
            i11 |= c1086gP.k(qVar) ? 2048 : 1024;
        }
        if ((i10 & 24576) == 0) {
            i11 |= c1086gP.c(z10) ? 16384 : 8192;
        }
        if ((196608 & i10) == 0) {
            i11 |= c1086gP.k(tVar) ? 131072 : 65536;
        }
        if (c1086gP.C(i11 & 1, (74899 & i11) != 74898)) {
            Transition transitionF = TransitionKt.f(inputPhase, "TextFieldInputState", c1086gP, (i11 & 14) | 48, 0);
            e0 e0Var = VectorConvertersKt.f9477a;
            b0<S> b0Var = transitionF.f9429a;
            InputPhase inputPhase5 = (InputPhase) b0Var.a();
            c1086gP.L(-1158004136);
            int iOrdinal2 = inputPhase5.ordinal();
            float f13 = 0.0f;
            if (iOrdinal2 == 0) {
                f10 = 1.0f;
            } else if (iOrdinal2 != 1) {
                if (iOrdinal2 != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                f10 = 1.0f;
            } else {
                f10 = 0.0f;
            }
            c1086gP.T(false);
            Float fValueOf = Float.valueOf(f10);
            C1085f0 c1085f0 = transitionF.f9432d;
            InputPhase inputPhase6 = (InputPhase) c1085f0.getValue();
            c1086gP.L(-1158004136);
            int iOrdinal3 = inputPhase6.ordinal();
            if (iOrdinal3 == 0) {
                f11 = 1.0f;
            } else if (iOrdinal3 != 1) {
                if (iOrdinal3 != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                f11 = 1.0f;
            } else {
                f11 = 0.0f;
            }
            c1086gP.T(false);
            Transition.d dVarD = TransitionKt.d(transitionF, fValueOf, Float.valueOf(f11), TextFieldTransitionScope$Transition$labelProgress$2.f11853h.invoke(transitionF.f(), c1086gP, 0), e0Var, c1086gP, 196608);
            InputPhase inputPhase7 = (InputPhase) b0Var.a();
            c1086gP.L(-1376159017);
            int iOrdinal4 = inputPhase7.ordinal();
            if (iOrdinal4 != 0) {
                i12 = 1;
                if (iOrdinal4 == 1) {
                    if (z10) {
                    }
                    c1086gP.T(false);
                    Float fValueOf2 = Float.valueOf(f12);
                    InputPhase inputPhase8 = (InputPhase) c1085f0.getValue();
                    c1086gP.L(-1376159017);
                    iOrdinal = inputPhase8.ordinal();
                    if (iOrdinal == 0) {
                        f13 = 1.0f;
                    } else if (iOrdinal != i12) {
                        if (iOrdinal != 2) {
                            throw new NoWhenBranchMatchedException();
                        }
                    } else if (!z10) {
                        f13 = 1.0f;
                    }
                    c1086gP.T(false);
                    Transition.d dVarD2 = TransitionKt.d(transitionF, fValueOf2, Float.valueOf(f13), TextFieldTransitionScope$Transition$placeholderOpacity$2.f11855h.invoke(transitionF.f(), c1086gP, 0), e0Var, c1086gP, 196608);
                    inputPhase2 = (InputPhase) c1085f0.getValue();
                    c1086gP.L(-1490209928);
                    iArr = a.f11856a;
                    if (iArr[inputPhase2.ordinal()] == 1) {
                        j11 = j;
                    } else {
                        j11 = j10;
                    }
                    c1086gP.T(false);
                    cVarF = androidx.compose.ui.graphics.H.f(j11);
                    zK = c1086gP.K(cVarF);
                    objF = c1086gP.f();
                    InterfaceC1084f.a.C0153a c0153a = InterfaceC1084f.a.f12980a;
                    if (zK || objF == c0153a) {
                        objF = (d0) ColorVectorConverterKt.f9265a.invoke(cVarF);
                        c1086gP.E(objF);
                    }
                    d0 d0Var = (d0) objF;
                    inputPhase3 = (InputPhase) b0Var.a();
                    c1086gP.L(-1490209928);
                    if (iArr[inputPhase3.ordinal()] == 1) {
                        j12 = j;
                    } else {
                        j12 = j10;
                    }
                    c1086gP.T(false);
                    androidx.compose.ui.graphics.H h8 = new androidx.compose.ui.graphics.H(j12);
                    inputPhase4 = (InputPhase) c1085f0.getValue();
                    c1086gP.L(-1490209928);
                    if (iArr[inputPhase4.ordinal()] == 1) {
                        j13 = j;
                    } else {
                        j13 = j10;
                    }
                    c1086gP.T(false);
                    Transition.d dVarD3 = TransitionKt.d(transitionF, h8, new androidx.compose.ui.graphics.H(j13), TextFieldTransitionScope$Transition$labelTextStyleColor$2.f11854h.invoke(transitionF.f(), c1086gP, 0), d0Var, c1086gP, 196608);
                    int i13 = (i11 & 7168) | 384;
                    cVarF2 = androidx.compose.ui.graphics.H.f(qVar.invoke(c1085f0.getValue(), c1086gP, Integer.valueOf((i13 >> 6) & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle)).f13506a);
                    zK2 = c1086gP.K(cVarF2);
                    objF2 = c1086gP.f();
                    if (zK2 || objF2 == c0153a) {
                        objF2 = (d0) ColorVectorConverterKt.f9265a.invoke(cVarF2);
                        c1086gP.E(objF2);
                    }
                    Object objA = b0Var.a();
                    int i14 = ((((i13 << 3) & 57344) | 3072) >> 9) & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle;
                    tVar.i(Float.valueOf(((Number) dVarD.f9457k.getValue()).floatValue()), new androidx.compose.ui.graphics.H(((androidx.compose.ui.graphics.H) dVarD3.f9457k.getValue()).f13506a), new androidx.compose.ui.graphics.H(((androidx.compose.ui.graphics.H) TransitionKt.d(transitionF, qVar.invoke(objA, c1086gP, Integer.valueOf(i14)), qVar.invoke(c1085f0.getValue(), c1086gP, Integer.valueOf(i14)), TextFieldTransitionScope$Transition$labelContentColor$2.f11852h.invoke(transitionF.f(), c1086gP, 0), (d0) objF2, c1086gP, 196608).f9457k.getValue()).f13506a), Float.valueOf(((Number) dVarD2.f9457k.getValue()).floatValue()), c1086gP, Integer.valueOf((i11 >> 3) & 57344));
                } else if (iOrdinal4 != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                f12 = 0.0f;
                c1086gP.T(false);
                Float fValueOf3 = Float.valueOf(f12);
                InputPhase inputPhase9 = (InputPhase) c1085f0.getValue();
                c1086gP.L(-1376159017);
                iOrdinal = inputPhase9.ordinal();
                if (iOrdinal == 0) {
                    f13 = 1.0f;
                } else if (iOrdinal != i12) {
                    if (iOrdinal != 2) {
                        throw new NoWhenBranchMatchedException();
                    }
                } else if (!z10) {
                    f13 = 1.0f;
                }
                c1086gP.T(false);
                Transition.d dVarD4 = TransitionKt.d(transitionF, fValueOf3, Float.valueOf(f13), TextFieldTransitionScope$Transition$placeholderOpacity$2.f11855h.invoke(transitionF.f(), c1086gP, 0), e0Var, c1086gP, 196608);
                inputPhase2 = (InputPhase) c1085f0.getValue();
                c1086gP.L(-1490209928);
                iArr = a.f11856a;
                if (iArr[inputPhase2.ordinal()] == 1) {
                    j11 = j;
                } else {
                    j11 = j10;
                }
                c1086gP.T(false);
                cVarF = androidx.compose.ui.graphics.H.f(j11);
                zK = c1086gP.K(cVarF);
                objF = c1086gP.f();
                InterfaceC1084f.a.C0153a c0153a2 = InterfaceC1084f.a.f12980a;
                if (zK) {
                    objF = (d0) ColorVectorConverterKt.f9265a.invoke(cVarF);
                    c1086gP.E(objF);
                } else {
                    objF = (d0) ColorVectorConverterKt.f9265a.invoke(cVarF);
                    c1086gP.E(objF);
                }
                d0 d0Var2 = (d0) objF;
                inputPhase3 = (InputPhase) b0Var.a();
                c1086gP.L(-1490209928);
                if (iArr[inputPhase3.ordinal()] == 1) {
                    j12 = j;
                } else {
                    j12 = j10;
                }
                c1086gP.T(false);
                androidx.compose.ui.graphics.H h10 = new androidx.compose.ui.graphics.H(j12);
                inputPhase4 = (InputPhase) c1085f0.getValue();
                c1086gP.L(-1490209928);
                if (iArr[inputPhase4.ordinal()] == 1) {
                    j13 = j;
                } else {
                    j13 = j10;
                }
                c1086gP.T(false);
                Transition.d dVarD5 = TransitionKt.d(transitionF, h10, new androidx.compose.ui.graphics.H(j13), TextFieldTransitionScope$Transition$labelTextStyleColor$2.f11854h.invoke(transitionF.f(), c1086gP, 0), d0Var2, c1086gP, 196608);
                int i15 = (i11 & 7168) | 384;
                cVarF2 = androidx.compose.ui.graphics.H.f(qVar.invoke(c1085f0.getValue(), c1086gP, Integer.valueOf((i15 >> 6) & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle)).f13506a);
                zK2 = c1086gP.K(cVarF2);
                objF2 = c1086gP.f();
                if (zK2) {
                    objF2 = (d0) ColorVectorConverterKt.f9265a.invoke(cVarF2);
                    c1086gP.E(objF2);
                } else {
                    objF2 = (d0) ColorVectorConverterKt.f9265a.invoke(cVarF2);
                    c1086gP.E(objF2);
                }
                Object objA2 = b0Var.a();
                int i16 = ((((i15 << 3) & 57344) | 3072) >> 9) & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle;
                tVar.i(Float.valueOf(((Number) dVarD.f9457k.getValue()).floatValue()), new androidx.compose.ui.graphics.H(((androidx.compose.ui.graphics.H) dVarD5.f9457k.getValue()).f13506a), new androidx.compose.ui.graphics.H(((androidx.compose.ui.graphics.H) TransitionKt.d(transitionF, qVar.invoke(objA2, c1086gP, Integer.valueOf(i16)), qVar.invoke(c1085f0.getValue(), c1086gP, Integer.valueOf(i16)), TextFieldTransitionScope$Transition$labelContentColor$2.f11852h.invoke(transitionF.f(), c1086gP, 0), (d0) objF2, c1086gP, 196608).f9457k.getValue()).f13506a), Float.valueOf(((Number) dVarD4.f9457k.getValue()).floatValue()), c1086gP, Integer.valueOf((i11 >> 3) & 57344));
            } else {
                i12 = 1;
            }
            f12 = 1.0f;
            c1086gP.T(false);
            Float fValueOf4 = Float.valueOf(f12);
            InputPhase inputPhase10 = (InputPhase) c1085f0.getValue();
            c1086gP.L(-1376159017);
            iOrdinal = inputPhase10.ordinal();
            if (iOrdinal == 0) {
                f13 = 1.0f;
            } else if (iOrdinal != i12) {
                if (iOrdinal != 2) {
                    throw new NoWhenBranchMatchedException();
                }
            } else if (!z10) {
                f13 = 1.0f;
            }
            c1086gP.T(false);
            Transition.d dVarD6 = TransitionKt.d(transitionF, fValueOf4, Float.valueOf(f13), TextFieldTransitionScope$Transition$placeholderOpacity$2.f11855h.invoke(transitionF.f(), c1086gP, 0), e0Var, c1086gP, 196608);
            inputPhase2 = (InputPhase) c1085f0.getValue();
            c1086gP.L(-1490209928);
            iArr = a.f11856a;
            if (iArr[inputPhase2.ordinal()] == 1) {
                j11 = j;
            } else {
                j11 = j10;
            }
            c1086gP.T(false);
            cVarF = androidx.compose.ui.graphics.H.f(j11);
            zK = c1086gP.K(cVarF);
            objF = c1086gP.f();
            InterfaceC1084f.a.C0153a c0153a3 = InterfaceC1084f.a.f12980a;
            if (zK) {
                objF = (d0) ColorVectorConverterKt.f9265a.invoke(cVarF);
                c1086gP.E(objF);
            } else {
                objF = (d0) ColorVectorConverterKt.f9265a.invoke(cVarF);
                c1086gP.E(objF);
            }
            d0 d0Var3 = (d0) objF;
            inputPhase3 = (InputPhase) b0Var.a();
            c1086gP.L(-1490209928);
            if (iArr[inputPhase3.ordinal()] == 1) {
                j12 = j;
            } else {
                j12 = j10;
            }
            c1086gP.T(false);
            androidx.compose.ui.graphics.H h11 = new androidx.compose.ui.graphics.H(j12);
            inputPhase4 = (InputPhase) c1085f0.getValue();
            c1086gP.L(-1490209928);
            if (iArr[inputPhase4.ordinal()] == 1) {
                j13 = j;
            } else {
                j13 = j10;
            }
            c1086gP.T(false);
            Transition.d dVarD7 = TransitionKt.d(transitionF, h11, new androidx.compose.ui.graphics.H(j13), TextFieldTransitionScope$Transition$labelTextStyleColor$2.f11854h.invoke(transitionF.f(), c1086gP, 0), d0Var3, c1086gP, 196608);
            int i17 = (i11 & 7168) | 384;
            cVarF2 = androidx.compose.ui.graphics.H.f(qVar.invoke(c1085f0.getValue(), c1086gP, Integer.valueOf((i17 >> 6) & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle)).f13506a);
            zK2 = c1086gP.K(cVarF2);
            objF2 = c1086gP.f();
            if (zK2) {
                objF2 = (d0) ColorVectorConverterKt.f9265a.invoke(cVarF2);
                c1086gP.E(objF2);
            } else {
                objF2 = (d0) ColorVectorConverterKt.f9265a.invoke(cVarF2);
                c1086gP.E(objF2);
            }
            Object objA3 = b0Var.a();
            int i18 = ((((i17 << 3) & 57344) | 3072) >> 9) & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle;
            tVar.i(Float.valueOf(((Number) dVarD.f9457k.getValue()).floatValue()), new androidx.compose.ui.graphics.H(((androidx.compose.ui.graphics.H) dVarD7.f9457k.getValue()).f13506a), new androidx.compose.ui.graphics.H(((androidx.compose.ui.graphics.H) TransitionKt.d(transitionF, qVar.invoke(objA3, c1086gP, Integer.valueOf(i18)), qVar.invoke(c1085f0.getValue(), c1086gP, Integer.valueOf(i18)), TextFieldTransitionScope$Transition$labelContentColor$2.f11852h.invoke(transitionF.f(), c1086gP, 0), (d0) objF2, c1086gP, 196608).f9457k.getValue()).f13506a), Float.valueOf(((Number) dVarD6.f9457k.getValue()).floatValue()), c1086gP, Integer.valueOf((i11 >> 3) & 57344));
        } else {
            c1086gP.w();
        }
        C1105p0 c1105p0V = c1086gP.V();
        if (c1105p0V != null) {
            c1105p0V.f13109d = new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.material.TextFieldTransitionScope$Transition$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(2);
                }

                @Override // Ia.p
                public final p293xa.r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                    num.intValue();
                    this.$tmp0_rcvr.a(inputPhase, j, j10, qVar, z10, tVar, interfaceC1084f2, L4.b.l(i10 | 1));
                    return p293xa.r.f47939a;
                }
            };
        }
    }
}
