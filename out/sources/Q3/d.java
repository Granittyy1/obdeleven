package Q3;

import D9.o;
import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.util.Log;
import androidx.compose.animation.core.AbstractC0913m;
import androidx.compose.ui.graphics.H;
import androidx.compose.ui.graphics.Y;
import androidx.compose.ui.graphics.colorspace.Rgb;
import androidx.compose.ui.graphics.colorspace.n;
import androidx.core.view.C1293h;
import com.google.android.gms.internal.play_billing.InterfaceC1958c1;
import com.google.android.gms.internal.play_billing.InterfaceC1961d1;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import p293xa.q;

/* JADX INFO: compiled from: DefaultConnectivityMonitorFactory.java */
/* JADX INFO: loaded from: classes.dex */
public class d implements InterfaceC1961d1 {
    public static final long A(float f10, long j, long j10) {
        androidx.compose.ui.graphics.colorspace.m mVar = androidx.compose.ui.graphics.colorspace.f.f13589x;
        long jA = H.a(j, mVar);
        long jA2 = H.a(j10, mVar);
        float fD = H.d(jA);
        float fH = H.h(jA);
        float fG = H.g(jA);
        float fE = H.e(jA);
        float fD2 = H.d(jA2);
        float fH2 = H.h(jA2);
        float fG2 = H.g(jA2);
        float fE2 = H.e(jA2);
        if (f10 < 0.0f) {
            f10 = 0.0f;
        }
        if (f10 > 1.0f) {
            f10 = 1.0f;
        }
        return H.a(g(o.n(fH, fH2, f10), o.n(fG, fG2, f10), o.n(fE, fE2, f10), o.n(fD, fD2, f10), mVar), H.f(j10));
    }

    public static void B() {
        Log.isLoggable("FIAM.Headless", 3);
    }

    public static void C() {
        Log.isLoggable("FIAM.Headless", 4);
    }

    public static final float D(long j) {
        androidx.compose.ui.graphics.colorspace.c cVarF = H.f(j);
        if (!androidx.compose.ui.graphics.colorspace.b.a(cVarF.f13565b, androidx.compose.ui.graphics.colorspace.b.f13559a)) {
            Y.a("The specified color must be encoded in an RGB color space. The supplied color space is " + ((Object) androidx.compose.ui.graphics.colorspace.b.b(cVarF.f13565b)));
        }
        double dH = H.h(j);
        n nVar = ((Rgb) cVarF).f13555p;
        double dG = nVar.g(dH);
        float fG = (float) ((nVar.g(H.e(j)) * 0.0722d) + (nVar.g(H.g(j)) * 0.7152d) + (dG * 0.2126d));
        if (fG < 0.0f) {
            fG = 0.0f;
        }
        if (fG > 1.0f) {
            return 1.0f;
        }
        return fG;
    }

    public static void F(AnimatorSet animatorSet, ArrayList arrayList) {
        int size = arrayList.size();
        long jMax = 0;
        for (int i10 = 0; i10 < size; i10++) {
            Animator animator = (Animator) arrayList.get(i10);
            jMax = Math.max(jMax, animator.getDuration() + animator.getStartDelay());
        }
        ValueAnimator valueAnimatorOfInt = ValueAnimator.ofInt(0, 0);
        valueAnimatorOfInt.setDuration(jMax);
        arrayList.add(0, valueAnimatorOfInt);
        animatorSet.playTogether(arrayList);
    }

    public static byte[] G(byte[] bArr, byte[] bArr2) {
        int length = bArr.length;
        int length2 = bArr2.length;
        byte[] bArrCopyOf = Arrays.copyOf(bArr, length + length2);
        System.arraycopy(bArr2, 0, bArrCopyOf, length, length2);
        kotlin.jvm.internal.i.b(bArrCopyOf);
        return bArrCopyOf;
    }

    public static Object[] H(Object[] objArr, Object[] elements) {
        kotlin.jvm.internal.i.e(objArr, "<this>");
        kotlin.jvm.internal.i.e(elements, "elements");
        int length = objArr.length;
        int length2 = elements.length;
        Object[] objArrCopyOf = Arrays.copyOf(objArr, length + length2);
        System.arraycopy(elements, 0, objArrCopyOf, length, length2);
        kotlin.jvm.internal.i.b(objArrCopyOf);
        return objArrCopyOf;
    }

    public static void I(Object obj, String str) {
        if (obj == null) {
            throw new NullPointerException(str);
        }
    }

    public static p041d2.f J(p041d2.f fVar, String[] strArr, Map map) {
        int i10 = 0;
        if (fVar == null) {
            if (strArr == null) {
                return null;
            }
            if (strArr.length == 1) {
                return (p041d2.f) map.get(strArr[0]);
            }
            if (strArr.length > 1) {
                p041d2.f fVar2 = new p041d2.f();
                int length = strArr.length;
                while (i10 < length) {
                    fVar2.a((p041d2.f) map.get(strArr[i10]));
                    i10++;
                }
                return fVar2;
            }
        } else {
            if (strArr != null && strArr.length == 1) {
                fVar.a((p041d2.f) map.get(strArr[0]));
                return fVar;
            }
            if (strArr != null && strArr.length > 1) {
                int length2 = strArr.length;
                while (i10 < length2) {
                    fVar.a((p041d2.f) map.get(strArr[i10]));
                    i10++;
                }
            }
        }
        return fVar;
    }

    public static final int K(long j) {
        float[] fArr = androidx.compose.ui.graphics.colorspace.f.f13567a;
        return (int) (H.a(j, androidx.compose.ui.graphics.colorspace.f.f13571e) >>> 32);
    }

    public static void L(int i10, String str) {
        if (i10 > 0) {
            return;
        }
        throw new IllegalArgumentException(str + " > 0 required but it was " + i10);
    }

    /* JADX WARN: Code duplicated, block: B:101:0x0136  */
    /* JADX WARN: Code duplicated, block: B:103:0x0140  */
    /* JADX WARN: Code duplicated, block: B:108:0x0157  */
    /* JADX WARN: Code duplicated, block: B:112:0x015e  */
    /* JADX WARN: Code duplicated, block: B:115:0x016b A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:116:0x016d  */
    /* JADX WARN: Code duplicated, block: B:117:0x0170  */
    /* JADX WARN: Code duplicated, block: B:119:0x0174  */
    /* JADX WARN: Code duplicated, block: B:120:0x0176 A[PHI: r2
      0x0176: PHI (r2v5 int) = (r2v2 int), (r2v4 int), (r2v0 int) binds: [B:127:0x018b, B:119:0x0174, B:115:0x016b] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:121:0x0178 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:122:0x017a A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:123:0x017c  */
    /* JADX WARN: Code duplicated, block: B:125:0x0184  */
    /* JADX WARN: Code duplicated, block: B:127:0x018b  */
    /* JADX WARN: Code duplicated, block: B:128:0x018d  */
    /* JADX WARN: Code duplicated, block: B:130:0x0193  */
    /* JADX WARN: Code duplicated, block: B:132:0x019c  */
    /* JADX WARN: Code duplicated, block: B:137:0x01a9  */
    /* JADX WARN: Code duplicated, block: B:141:0x01b0  */
    /* JADX WARN: Code duplicated, block: B:77:0x00f6  */
    /* JADX WARN: Code duplicated, block: B:81:0x00fd  */
    /* JADX WARN: Code duplicated, block: B:84:0x010b A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:85:0x010d  */
    /* JADX WARN: Code duplicated, block: B:86:0x0110  */
    /* JADX WARN: Code duplicated, block: B:88:0x0113  */
    /* JADX WARN: Code duplicated, block: B:90:0x0117  */
    /* JADX WARN: Code duplicated, block: B:91:0x011b A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:92:0x011d A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:93:0x011f  */
    /* JADX WARN: Code duplicated, block: B:95:0x0128  */
    /* JADX WARN: Code duplicated, block: B:98:0x012e  */
    /* JADX WARN: Code duplicated, block: B:99:0x0130  */
    public static final long c(float f10, float f11, float f12, float f13, androidx.compose.ui.graphics.colorspace.c cVar) {
        int i10;
        int i11;
        int i12;
        float fC;
        float fB;
        int iFloatToRawIntBits;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        int i20;
        float fC2;
        float fB2;
        int iFloatToRawIntBits2;
        int i21;
        int i22;
        int i23;
        int i24;
        int i25;
        int i26;
        int i27;
        float f14;
        int i28 = 31;
        if (cVar.d()) {
            float f15 = f13 < 0.0f ? 0.0f : f13;
            if (f15 > 1.0f) {
                f15 = 1.0f;
            }
            int i29 = ((int) ((f15 * 255.0f) + 0.5f)) << 24;
            float f16 = f10 < 0.0f ? 0.0f : f10;
            if (f16 > 1.0f) {
                f16 = 1.0f;
            }
            int i30 = i29 | (((int) ((f16 * 255.0f) + 0.5f)) << 16);
            float f17 = f11 < 0.0f ? 0.0f : f11;
            if (f17 > 1.0f) {
                f17 = 1.0f;
            }
            int i31 = i30 | (((int) ((f17 * 255.0f) + 0.5f)) << 8);
            f14 = f12 >= 0.0f ? f12 : 0.0f;
            long j = ((long) (i31 | ((int) (((f14 <= 1.0f ? f14 : 1.0f) * 255.0f) + 0.5f)))) << 32;
            int i32 = H.f13505m;
            return j;
        }
        int i33 = androidx.compose.ui.graphics.colorspace.b.f13563e;
        if (((int) (cVar.f13565b >> 32)) != 3) {
            Y.a("Color only works with ColorSpaces with 3 components");
        }
        int i34 = cVar.f13566c;
        if (i34 == -1) {
            Y.a("Unknown color space, please use a color space in ColorSpaces");
        }
        float fC3 = cVar.c(0);
        float fB3 = cVar.b(0);
        if (f10 >= fC3) {
            fC3 = f10;
        }
        if (fC3 <= fB3) {
            fB3 = fC3;
        }
        int iFloatToRawIntBits3 = Float.floatToRawIntBits(fB3);
        int i35 = iFloatToRawIntBits3 >>> 31;
        int i36 = (iFloatToRawIntBits3 >>> 23) & 255;
        int i37 = iFloatToRawIntBits3 & 8388607;
        if (i36 == 255) {
            i11 = i37 != 0 ? 512 : 0;
            i10 = 31;
        } else {
            i10 = i36 - 112;
            if (i10 >= 31) {
                i10 = 49;
                i11 = 0;
            } else {
                if (i10 > 0) {
                    int i38 = i37 >> 13;
                    if ((iFloatToRawIntBits3 & 4096) != 0) {
                        i12 = (((i10 << 10) | i38) + 1) | (i35 << 15);
                    } else {
                        i11 = i38;
                    }
                    short s10 = (short) i12;
                    fC = cVar.c(1);
                    fB = cVar.b(1);
                    if (f11 >= fC) {
                        fC = f11;
                    }
                    if (fC <= fB) {
                        fB = fC;
                    }
                    iFloatToRawIntBits = Float.floatToRawIntBits(fB);
                    i13 = iFloatToRawIntBits >>> 31;
                    i14 = (iFloatToRawIntBits >>> 23) & 255;
                    i15 = iFloatToRawIntBits & 8388607;
                    if (i14 == 255) {
                        if (i15 != 0) {
                            i18 = 512;
                        } else {
                            i18 = 0;
                        }
                        i16 = 31;
                    } else {
                        i16 = i14 - 112;
                        if (i16 >= 31) {
                            i16 = 49;
                            i18 = 0;
                        } else {
                            if (i16 <= 0) {
                                i17 = i15 >> 13;
                                if ((iFloatToRawIntBits & 4096) != 0) {
                                    i19 = (((i16 << 10) | i17) + 1) | (i13 << 15);
                                } else {
                                    i18 = i17;
                                }
                                short s11 = (short) i19;
                                fC2 = cVar.c(2);
                                fB2 = cVar.b(2);
                                if (f12 >= fC2) {
                                    fC2 = f12;
                                }
                                if (fC2 <= fB2) {
                                    fB2 = fC2;
                                }
                                iFloatToRawIntBits2 = Float.floatToRawIntBits(fB2);
                                i21 = iFloatToRawIntBits2 >>> 31;
                                i22 = (iFloatToRawIntBits2 >>> 23) & 255;
                                i23 = 8388607 & iFloatToRawIntBits2;
                                if (i22 == 255) {
                                    if (i23 != 0) {
                                        i25 = 512;
                                    } else {
                                        i25 = 0;
                                    }
                                    i26 = (i21 << 15) | (i28 << 10) | i25;
                                } else {
                                    i24 = i22 - 112;
                                    if (i24 >= 31) {
                                        i28 = 49;
                                    } else {
                                        if (i24 <= 0) {
                                            i25 = i23 >> 13;
                                            if ((iFloatToRawIntBits2 & 4096) != 0) {
                                                i26 = (((i24 << 10) | i25) + 1) | (i21 << 15);
                                            } else {
                                                i28 = i24;
                                            }
                                        } else if (i24 >= -10) {
                                            i27 = (i23 | 8388608) >> (1 - i24);
                                            if ((i27 & 4096) != 0) {
                                                i27 += 8192;
                                            }
                                            i25 = i27 >> 13;
                                            i28 = 0;
                                        } else {
                                            i28 = 0;
                                        }
                                        i26 = (i21 << 15) | (i28 << 10) | i25;
                                    }
                                    i25 = 0;
                                    i26 = (i21 << 15) | (i28 << 10) | i25;
                                }
                                short s12 = (short) i26;
                                f14 = f13 >= 0.0f ? f13 : 0.0f;
                                long j10 = ((((long) ((int) (((f14 <= 1.0f ? f14 : 1.0f) * 1023.0f) + 0.5f))) & 1023) << 6) | ((((long) s10) & 65535) << 48) | ((((long) s11) & 65535) << 32) | ((((long) s12) & 65535) << 16) | (((long) i34) & 63);
                                int i39 = H.f13505m;
                                return j10;
                            }
                            if (i16 >= -10) {
                                i20 = (i15 | 8388608) >> (1 - i16);
                                if ((i20 & 4096) != 0) {
                                    i20 += 8192;
                                }
                                i18 = i20 >> 13;
                            } else {
                                i18 = 0;
                            }
                            i16 = 0;
                        }
                    }
                    i19 = i18 | (i13 << 15) | (i16 << 10);
                    short s13 = (short) i19;
                    fC2 = cVar.c(2);
                    fB2 = cVar.b(2);
                    if (f12 >= fC2) {
                        fC2 = f12;
                    }
                    if (fC2 <= fB2) {
                        fB2 = fC2;
                    }
                    iFloatToRawIntBits2 = Float.floatToRawIntBits(fB2);
                    i21 = iFloatToRawIntBits2 >>> 31;
                    i22 = (iFloatToRawIntBits2 >>> 23) & 255;
                    i23 = 8388607 & iFloatToRawIntBits2;
                    if (i22 == 255) {
                        if (i23 != 0) {
                            i25 = 512;
                        } else {
                            i25 = 0;
                        }
                        i26 = (i21 << 15) | (i28 << 10) | i25;
                    } else {
                        i24 = i22 - 112;
                        if (i24 >= 31) {
                            i28 = 49;
                        } else {
                            if (i24 <= 0) {
                                i25 = i23 >> 13;
                                if ((iFloatToRawIntBits2 & 4096) != 0) {
                                    i26 = (((i24 << 10) | i25) + 1) | (i21 << 15);
                                } else {
                                    i28 = i24;
                                }
                            } else if (i24 >= -10) {
                                i27 = (i23 | 8388608) >> (1 - i24);
                                if ((i27 & 4096) != 0) {
                                    i27 += 8192;
                                }
                                i25 = i27 >> 13;
                                i28 = 0;
                            } else {
                                i28 = 0;
                            }
                            i26 = (i21 << 15) | (i28 << 10) | i25;
                        }
                        i25 = 0;
                        i26 = (i21 << 15) | (i28 << 10) | i25;
                    }
                    short s14 = (short) i26;
                    if (f13 >= 0.0f) {
                    }
                    long j11 = ((((long) ((int) (((f14 <= 1.0f ? f14 : 1.0f) * 1023.0f) + 0.5f))) & 1023) << 6) | ((((long) s10) & 65535) << 48) | ((((long) s13) & 65535) << 32) | ((((long) s14) & 65535) << 16) | (((long) i34) & 63);
                    int i310 = H.f13505m;
                    return j11;
                }
                if (i10 >= -10) {
                    int i40 = (i37 | 8388608) >> (1 - i10);
                    if ((i40 & 4096) != 0) {
                        i40 += 8192;
                    }
                    i11 = i40 >> 13;
                } else {
                    i11 = 0;
                }
                i10 = 0;
            }
        }
        i12 = i11 | (i35 << 15) | (i10 << 10);
        short s15 = (short) i12;
        fC = cVar.c(1);
        fB = cVar.b(1);
        if (f11 >= fC) {
            fC = f11;
        }
        if (fC <= fB) {
            fB = fC;
        }
        iFloatToRawIntBits = Float.floatToRawIntBits(fB);
        i13 = iFloatToRawIntBits >>> 31;
        i14 = (iFloatToRawIntBits >>> 23) & 255;
        i15 = iFloatToRawIntBits & 8388607;
        if (i14 == 255) {
            if (i15 != 0) {
                i18 = 512;
            } else {
                i18 = 0;
            }
            i16 = 31;
        } else {
            i16 = i14 - 112;
            if (i16 >= 31) {
                i16 = 49;
                i18 = 0;
            } else {
                if (i16 <= 0) {
                    i17 = i15 >> 13;
                    if ((iFloatToRawIntBits & 4096) != 0) {
                        i19 = (((i16 << 10) | i17) + 1) | (i13 << 15);
                    } else {
                        i18 = i17;
                    }
                    short s16 = (short) i19;
                    fC2 = cVar.c(2);
                    fB2 = cVar.b(2);
                    if (f12 >= fC2) {
                        fC2 = f12;
                    }
                    if (fC2 <= fB2) {
                        fB2 = fC2;
                    }
                    iFloatToRawIntBits2 = Float.floatToRawIntBits(fB2);
                    i21 = iFloatToRawIntBits2 >>> 31;
                    i22 = (iFloatToRawIntBits2 >>> 23) & 255;
                    i23 = 8388607 & iFloatToRawIntBits2;
                    if (i22 == 255) {
                        if (i23 != 0) {
                            i25 = 512;
                        } else {
                            i25 = 0;
                        }
                        i26 = (i21 << 15) | (i28 << 10) | i25;
                    } else {
                        i24 = i22 - 112;
                        if (i24 >= 31) {
                            i28 = 49;
                        } else {
                            if (i24 <= 0) {
                                i25 = i23 >> 13;
                                if ((iFloatToRawIntBits2 & 4096) != 0) {
                                    i26 = (((i24 << 10) | i25) + 1) | (i21 << 15);
                                } else {
                                    i28 = i24;
                                }
                            } else if (i24 >= -10) {
                                i27 = (i23 | 8388608) >> (1 - i24);
                                if ((i27 & 4096) != 0) {
                                    i27 += 8192;
                                }
                                i25 = i27 >> 13;
                                i28 = 0;
                            } else {
                                i28 = 0;
                            }
                            i26 = (i21 << 15) | (i28 << 10) | i25;
                        }
                        i25 = 0;
                        i26 = (i21 << 15) | (i28 << 10) | i25;
                    }
                    short s17 = (short) i26;
                    if (f13 >= 0.0f) {
                    }
                    long j12 = ((((long) ((int) (((f14 <= 1.0f ? f14 : 1.0f) * 1023.0f) + 0.5f))) & 1023) << 6) | ((((long) s15) & 65535) << 48) | ((((long) s16) & 65535) << 32) | ((((long) s17) & 65535) << 16) | (((long) i34) & 63);
                    int i311 = H.f13505m;
                    return j12;
                }
                if (i16 >= -10) {
                    i20 = (i15 | 8388608) >> (1 - i16);
                    if ((i20 & 4096) != 0) {
                        i20 += 8192;
                    }
                    i18 = i20 >> 13;
                } else {
                    i18 = 0;
                }
                i16 = 0;
            }
        }
        i19 = i18 | (i13 << 15) | (i16 << 10);
        short s18 = (short) i19;
        fC2 = cVar.c(2);
        fB2 = cVar.b(2);
        if (f12 >= fC2) {
            fC2 = f12;
        }
        if (fC2 <= fB2) {
            fB2 = fC2;
        }
        iFloatToRawIntBits2 = Float.floatToRawIntBits(fB2);
        i21 = iFloatToRawIntBits2 >>> 31;
        i22 = (iFloatToRawIntBits2 >>> 23) & 255;
        i23 = 8388607 & iFloatToRawIntBits2;
        if (i22 == 255) {
            if (i23 != 0) {
                i25 = 512;
            } else {
                i25 = 0;
            }
            i26 = (i21 << 15) | (i28 << 10) | i25;
        } else {
            i24 = i22 - 112;
            if (i24 >= 31) {
                i28 = 49;
            } else {
                if (i24 <= 0) {
                    i25 = i23 >> 13;
                    if ((iFloatToRawIntBits2 & 4096) != 0) {
                        i26 = (((i24 << 10) | i25) + 1) | (i21 << 15);
                    } else {
                        i28 = i24;
                    }
                } else if (i24 >= -10) {
                    i27 = (i23 | 8388608) >> (1 - i24);
                    if ((i27 & 4096) != 0) {
                        i27 += 8192;
                    }
                    i25 = i27 >> 13;
                    i28 = 0;
                } else {
                    i28 = 0;
                }
                i26 = (i21 << 15) | (i28 << 10) | i25;
            }
            i25 = 0;
            i26 = (i21 << 15) | (i28 << 10) | i25;
        }
        short s19 = (short) i26;
        if (f13 >= 0.0f) {
        }
        long j13 = ((((long) ((int) (((f14 <= 1.0f ? f14 : 1.0f) * 1023.0f) + 0.5f))) & 1023) << 6) | ((((long) s15) & 65535) << 48) | ((((long) s18) & 65535) << 32) | ((((long) s19) & 65535) << 16) | (((long) i34) & 63);
        int i312 = H.f13505m;
        return j13;
    }

    public static final long d(int i10) {
        long j = ((long) i10) << 32;
        int i11 = H.f13505m;
        return j;
    }

    public static final long e(long j) {
        long j10 = j << 32;
        int i10 = H.f13505m;
        return j10;
    }

    public static long f(int i10, int i11, int i12) {
        return d(((i10 & 255) << 16) | (-16777216) | ((i11 & 255) << 8) | (i12 & 255));
    }

    /* JADX WARN: Code duplicated, block: B:30:0x0091 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:31:0x0093  */
    /* JADX WARN: Code duplicated, block: B:32:0x0095  */
    /* JADX WARN: Code duplicated, block: B:34:0x0098  */
    /* JADX WARN: Code duplicated, block: B:36:0x009c  */
    /* JADX WARN: Code duplicated, block: B:37:0x00a0 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:38:0x00a2 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:39:0x00a4  */
    /* JADX WARN: Code duplicated, block: B:41:0x00ad  */
    /* JADX WARN: Code duplicated, block: B:43:0x00b3  */
    /* JADX WARN: Code duplicated, block: B:44:0x00b6  */
    /* JADX WARN: Code duplicated, block: B:46:0x00bc  */
    /* JADX WARN: Code duplicated, block: B:48:0x00c7  */
    /* JADX WARN: Code duplicated, block: B:52:0x00dc A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:54:0x00df  */
    /* JADX WARN: Code duplicated, block: B:56:0x00e2  */
    /* JADX WARN: Code duplicated, block: B:58:0x00e6  */
    /* JADX WARN: Code duplicated, block: B:59:0x00e9 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:60:0x00eb A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:61:0x00ed  */
    /* JADX WARN: Code duplicated, block: B:63:0x00f6  */
    /* JADX WARN: Code duplicated, block: B:65:0x0100  */
    /* JADX WARN: Code duplicated, block: B:66:0x0102  */
    /* JADX WARN: Code duplicated, block: B:68:0x0108  */
    /* JADX WARN: Code duplicated, block: B:70:0x0112  */
    public static final long g(float f10, float f11, float f12, float f13, androidx.compose.ui.graphics.colorspace.c cVar) {
        int i10;
        int i11;
        int i12;
        int iFloatToRawIntBits;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        int i20;
        int iFloatToRawIntBits2;
        int i21;
        int i22;
        int i23;
        int i24;
        int i25;
        int i26;
        int i27 = 31;
        if (cVar.d()) {
            long j = ((long) ((((((int) ((f13 * 255.0f) + 0.5f)) << 24) | (((int) ((f10 * 255.0f) + 0.5f)) << 16)) | (((int) ((f11 * 255.0f) + 0.5f)) << 8)) | ((int) ((255.0f * f12) + 0.5f)))) << 32;
            int i28 = H.f13505m;
            return j;
        }
        int iFloatToRawIntBits3 = Float.floatToRawIntBits(f10);
        int i29 = iFloatToRawIntBits3 >>> 31;
        int i30 = (iFloatToRawIntBits3 >>> 23) & 255;
        int i31 = iFloatToRawIntBits3 & 8388607;
        int i32 = 0;
        if (i30 == 255) {
            i11 = i31 != 0 ? 512 : 0;
            i10 = 31;
        } else {
            i10 = i30 - 112;
            if (i10 >= 31) {
                i11 = 0;
                i10 = 49;
            } else {
                if (i10 > 0) {
                    int i33 = i31 >> 13;
                    if ((iFloatToRawIntBits3 & 4096) != 0) {
                        i12 = (((i10 << 10) | i33) + 1) | (i29 << 15);
                    } else {
                        i11 = i33;
                    }
                    short s10 = (short) i12;
                    iFloatToRawIntBits = Float.floatToRawIntBits(f11);
                    i13 = iFloatToRawIntBits >>> 31;
                    i14 = (iFloatToRawIntBits >>> 23) & 255;
                    i15 = iFloatToRawIntBits & 8388607;
                    if (i14 == 255) {
                        if (i15 != 0) {
                            i18 = 512;
                        } else {
                            i18 = 0;
                        }
                        i16 = 31;
                    } else {
                        i16 = i14 - 112;
                        if (i16 >= 31) {
                            i18 = 0;
                            i16 = 49;
                        } else {
                            if (i16 <= 0) {
                                i17 = i15 >> 13;
                                if ((iFloatToRawIntBits & 4096) != 0) {
                                    i19 = (((i16 << 10) | i17) + 1) | (i13 << 15);
                                } else {
                                    i18 = i17;
                                }
                                short s11 = (short) i19;
                                iFloatToRawIntBits2 = Float.floatToRawIntBits(f12);
                                i21 = iFloatToRawIntBits2 >>> 31;
                                i22 = (iFloatToRawIntBits2 >>> 23) & 255;
                                i23 = 8388607 & iFloatToRawIntBits2;
                                if (i22 == 255) {
                                    i32 = i23 == 0 ? 0 : 512;
                                } else {
                                    i24 = i22 - 112;
                                    if (i24 >= 31) {
                                        i27 = 49;
                                    } else {
                                        if (i24 <= 0) {
                                            i32 = i23 >> 13;
                                            if ((iFloatToRawIntBits2 & 4096) != 0) {
                                                i25 = (((i24 << 10) | i32) + 1) | (i21 << 15);
                                            } else {
                                                i27 = i24;
                                            }
                                            long jMax = ((((long) s11) & 65535) << 32) | ((((long) s10) & 65535) << 48) | ((((long) ((short) i25)) & 65535) << 16) | ((((long) ((int) ((Math.max(0.0f, Math.min(f13, 1.0f)) * 1023.0f) + 0.5f))) & 1023) << 6) | (((long) cVar.f13566c) & 63);
                                            int i34 = H.f13505m;
                                            return jMax;
                                        }
                                        if (i24 >= -10) {
                                            i26 = (i23 | 8388608) >> (1 - i24);
                                            if ((i26 & 4096) != 0) {
                                                i26 += 8192;
                                            }
                                            i32 = i26 >> 13;
                                            i27 = 0;
                                        } else {
                                            i27 = 0;
                                        }
                                    }
                                }
                                i25 = (i27 << 10) | (i21 << 15) | i32;
                                long jMax2 = ((((long) s11) & 65535) << 32) | ((((long) s10) & 65535) << 48) | ((((long) ((short) i25)) & 65535) << 16) | ((((long) ((int) ((Math.max(0.0f, Math.min(f13, 1.0f)) * 1023.0f) + 0.5f))) & 1023) << 6) | (((long) cVar.f13566c) & 63);
                                int i35 = H.f13505m;
                                return jMax2;
                            }
                            if (i16 >= -10) {
                                i20 = (i15 | 8388608) >> (1 - i16);
                                if ((i20 & 4096) != 0) {
                                    i20 += 8192;
                                }
                                i18 = i20 >> 13;
                                i16 = 0;
                            } else {
                                i18 = 0;
                                i16 = 0;
                            }
                        }
                    }
                    i19 = i18 | (i13 << 15) | (i16 << 10);
                    short s12 = (short) i19;
                    iFloatToRawIntBits2 = Float.floatToRawIntBits(f12);
                    i21 = iFloatToRawIntBits2 >>> 31;
                    i22 = (iFloatToRawIntBits2 >>> 23) & 255;
                    i23 = 8388607 & iFloatToRawIntBits2;
                    if (i22 == 255) {
                        i32 = i23 == 0 ? 0 : 512;
                    } else {
                        i24 = i22 - 112;
                        if (i24 >= 31) {
                            i27 = 49;
                        } else {
                            if (i24 <= 0) {
                                i32 = i23 >> 13;
                                if ((iFloatToRawIntBits2 & 4096) != 0) {
                                    i25 = (((i24 << 10) | i32) + 1) | (i21 << 15);
                                } else {
                                    i27 = i24;
                                }
                                long jMax3 = ((((long) s12) & 65535) << 32) | ((((long) s10) & 65535) << 48) | ((((long) ((short) i25)) & 65535) << 16) | ((((long) ((int) ((Math.max(0.0f, Math.min(f13, 1.0f)) * 1023.0f) + 0.5f))) & 1023) << 6) | (((long) cVar.f13566c) & 63);
                                int i36 = H.f13505m;
                                return jMax3;
                            }
                            if (i24 >= -10) {
                                i26 = (i23 | 8388608) >> (1 - i24);
                                if ((i26 & 4096) != 0) {
                                    i26 += 8192;
                                }
                                i32 = i26 >> 13;
                                i27 = 0;
                            } else {
                                i27 = 0;
                            }
                        }
                    }
                    i25 = (i27 << 10) | (i21 << 15) | i32;
                    long jMax4 = ((((long) s12) & 65535) << 32) | ((((long) s10) & 65535) << 48) | ((((long) ((short) i25)) & 65535) << 16) | ((((long) ((int) ((Math.max(0.0f, Math.min(f13, 1.0f)) * 1023.0f) + 0.5f))) & 1023) << 6) | (((long) cVar.f13566c) & 63);
                    int i37 = H.f13505m;
                    return jMax4;
                }
                if (i10 >= -10) {
                    int i38 = (i31 | 8388608) >> (1 - i10);
                    if ((i38 & 4096) != 0) {
                        i38 += 8192;
                    }
                    i11 = i38 >> 13;
                    i10 = 0;
                } else {
                    i11 = 0;
                    i10 = 0;
                }
            }
        }
        i12 = i11 | (i29 << 15) | (i10 << 10);
        short s13 = (short) i12;
        iFloatToRawIntBits = Float.floatToRawIntBits(f11);
        i13 = iFloatToRawIntBits >>> 31;
        i14 = (iFloatToRawIntBits >>> 23) & 255;
        i15 = iFloatToRawIntBits & 8388607;
        if (i14 == 255) {
            if (i15 != 0) {
                i18 = 512;
            } else {
                i18 = 0;
            }
            i16 = 31;
        } else {
            i16 = i14 - 112;
            if (i16 >= 31) {
                i18 = 0;
                i16 = 49;
            } else {
                if (i16 <= 0) {
                    i17 = i15 >> 13;
                    if ((iFloatToRawIntBits & 4096) != 0) {
                        i19 = (((i16 << 10) | i17) + 1) | (i13 << 15);
                    } else {
                        i18 = i17;
                    }
                    short s14 = (short) i19;
                    iFloatToRawIntBits2 = Float.floatToRawIntBits(f12);
                    i21 = iFloatToRawIntBits2 >>> 31;
                    i22 = (iFloatToRawIntBits2 >>> 23) & 255;
                    i23 = 8388607 & iFloatToRawIntBits2;
                    if (i22 == 255) {
                        i32 = i23 == 0 ? 0 : 512;
                    } else {
                        i24 = i22 - 112;
                        if (i24 >= 31) {
                            i27 = 49;
                        } else {
                            if (i24 <= 0) {
                                i32 = i23 >> 13;
                                if ((iFloatToRawIntBits2 & 4096) != 0) {
                                    i25 = (((i24 << 10) | i32) + 1) | (i21 << 15);
                                } else {
                                    i27 = i24;
                                }
                                long jMax5 = ((((long) s14) & 65535) << 32) | ((((long) s13) & 65535) << 48) | ((((long) ((short) i25)) & 65535) << 16) | ((((long) ((int) ((Math.max(0.0f, Math.min(f13, 1.0f)) * 1023.0f) + 0.5f))) & 1023) << 6) | (((long) cVar.f13566c) & 63);
                                int i39 = H.f13505m;
                                return jMax5;
                            }
                            if (i24 >= -10) {
                                i26 = (i23 | 8388608) >> (1 - i24);
                                if ((i26 & 4096) != 0) {
                                    i26 += 8192;
                                }
                                i32 = i26 >> 13;
                                i27 = 0;
                            } else {
                                i27 = 0;
                            }
                        }
                    }
                    i25 = (i27 << 10) | (i21 << 15) | i32;
                    long jMax6 = ((((long) s14) & 65535) << 32) | ((((long) s13) & 65535) << 48) | ((((long) ((short) i25)) & 65535) << 16) | ((((long) ((int) ((Math.max(0.0f, Math.min(f13, 1.0f)) * 1023.0f) + 0.5f))) & 1023) << 6) | (((long) cVar.f13566c) & 63);
                    int i310 = H.f13505m;
                    return jMax6;
                }
                if (i16 >= -10) {
                    i20 = (i15 | 8388608) >> (1 - i16);
                    if ((i20 & 4096) != 0) {
                        i20 += 8192;
                    }
                    i18 = i20 >> 13;
                    i16 = 0;
                } else {
                    i18 = 0;
                    i16 = 0;
                }
            }
        }
        i19 = i18 | (i13 << 15) | (i16 << 10);
        short s15 = (short) i19;
        iFloatToRawIntBits2 = Float.floatToRawIntBits(f12);
        i21 = iFloatToRawIntBits2 >>> 31;
        i22 = (iFloatToRawIntBits2 >>> 23) & 255;
        i23 = 8388607 & iFloatToRawIntBits2;
        if (i22 == 255) {
            i32 = i23 == 0 ? 0 : 512;
        } else {
            i24 = i22 - 112;
            if (i24 >= 31) {
                i27 = 49;
            } else {
                if (i24 <= 0) {
                    i32 = i23 >> 13;
                    if ((iFloatToRawIntBits2 & 4096) != 0) {
                        i25 = (((i24 << 10) | i32) + 1) | (i21 << 15);
                    } else {
                        i27 = i24;
                    }
                    long jMax7 = ((((long) s15) & 65535) << 32) | ((((long) s13) & 65535) << 48) | ((((long) ((short) i25)) & 65535) << 16) | ((((long) ((int) ((Math.max(0.0f, Math.min(f13, 1.0f)) * 1023.0f) + 0.5f))) & 1023) << 6) | (((long) cVar.f13566c) & 63);
                    int i311 = H.f13505m;
                    return jMax7;
                }
                if (i24 >= -10) {
                    i26 = (i23 | 8388608) >> (1 - i24);
                    if ((i26 & 4096) != 0) {
                        i26 += 8192;
                    }
                    i32 = i26 >> 13;
                    i27 = 0;
                } else {
                    i27 = 0;
                }
            }
        }
        i25 = (i27 << 10) | (i21 << 15) | i32;
        long jMax8 = ((((long) s15) & 65535) << 32) | ((((long) s13) & 65535) << 48) | ((((long) ((short) i25)) & 65535) << 16) | ((((long) ((int) ((Math.max(0.0f, Math.min(f13, 1.0f)) * 1023.0f) + 0.5f))) & 1023) << 6) | (((long) cVar.f13566c) & 63);
        int i312 = H.f13505m;
        return jMax8;
    }

    public static List h(Object[] objArr) {
        kotlin.jvm.internal.i.e(objArr, "<this>");
        List listAsList = Arrays.asList(objArr);
        kotlin.jvm.internal.i.d(listAsList, "asList(...)");
        return listAsList;
    }

    public static final long i(long j, long j10) {
        float f10;
        float f11;
        long jA = H.a(j, H.f(j10));
        float fD = H.d(j10);
        float fD2 = H.d(jA);
        float f12 = 1.0f - fD2;
        float f13 = (fD * f12) + fD2;
        float fH = H.h(jA);
        float fH2 = H.h(j10);
        float f14 = 0.0f;
        if (f13 == 0.0f) {
            f10 = 0.0f;
        } else {
            f10 = (((fH2 * fD) * f12) + (fH * fD2)) / f13;
        }
        float fG = H.g(jA);
        float fG2 = H.g(j10);
        if (f13 == 0.0f) {
            f11 = 0.0f;
        } else {
            f11 = (((fG2 * fD) * f12) + (fG * fD2)) / f13;
        }
        float fE = H.e(jA);
        float fE2 = H.e(j10);
        if (f13 != 0.0f) {
            f14 = (((fE2 * fD) * f12) + (fE * fD2)) / f13;
        }
        return g(f10, f11, f14, f13, H.f(j10));
    }

    public static boolean j(Object[] objArr, Object[] objArr2) {
        if (objArr == objArr2) {
            return true;
        }
        if (objArr == null || objArr2 == null || objArr.length != objArr2.length) {
            return false;
        }
        int length = objArr.length;
        for (int i10 = 0; i10 < length; i10++) {
            Object obj = objArr[i10];
            Object obj2 = objArr2[i10];
            if (obj != obj2) {
                if (obj == null || obj2 == null) {
                    return false;
                }
                if ((obj instanceof Object[]) && (obj2 instanceof Object[])) {
                    if (!j((Object[]) obj, (Object[]) obj2)) {
                        return false;
                    }
                } else if ((obj instanceof byte[]) && (obj2 instanceof byte[])) {
                    if (!Arrays.equals((byte[]) obj, (byte[]) obj2)) {
                        return false;
                    }
                } else if ((obj instanceof short[]) && (obj2 instanceof short[])) {
                    if (!Arrays.equals((short[]) obj, (short[]) obj2)) {
                        return false;
                    }
                } else if ((obj instanceof int[]) && (obj2 instanceof int[])) {
                    if (!Arrays.equals((int[]) obj, (int[]) obj2)) {
                        return false;
                    }
                } else if ((obj instanceof long[]) && (obj2 instanceof long[])) {
                    if (!Arrays.equals((long[]) obj, (long[]) obj2)) {
                        return false;
                    }
                } else if ((obj instanceof float[]) && (obj2 instanceof float[])) {
                    if (!Arrays.equals((float[]) obj, (float[]) obj2)) {
                        return false;
                    }
                } else if ((obj instanceof double[]) && (obj2 instanceof double[])) {
                    if (!Arrays.equals((double[]) obj, (double[]) obj2)) {
                        return false;
                    }
                } else if ((obj instanceof char[]) && (obj2 instanceof char[])) {
                    if (!Arrays.equals((char[]) obj, (char[]) obj2)) {
                        return false;
                    }
                } else if ((obj instanceof boolean[]) && (obj2 instanceof boolean[])) {
                    if (!Arrays.equals((boolean[]) obj, (boolean[]) obj2)) {
                        return false;
                    }
                } else if ((obj instanceof p293xa.j) && (obj2 instanceof p293xa.j)) {
                    p293xa.j jVar = (p293xa.j) obj2;
                    byte[] bArr = ((p293xa.j) obj).f47923b;
                    if (bArr == null) {
                        bArr = null;
                    }
                    byte[] bArr2 = jVar.f47923b;
                    if (!Arrays.equals(bArr, bArr2 != null ? bArr2 : null)) {
                        return false;
                    }
                } else if ((obj instanceof q) && (obj2 instanceof q)) {
                    q qVar = (q) obj2;
                    short[] sArr = ((q) obj).f47936b;
                    if (sArr == null) {
                        sArr = null;
                    }
                    short[] sArr2 = qVar.f47936b;
                    if (!Arrays.equals(sArr, sArr2 != null ? sArr2 : null)) {
                        return false;
                    }
                } else if ((obj instanceof p293xa.l) && (obj2 instanceof p293xa.l)) {
                    p293xa.l lVar = (p293xa.l) obj2;
                    int[] iArr = ((p293xa.l) obj).f47927b;
                    if (iArr == null) {
                        iArr = null;
                    }
                    int[] iArr2 = lVar.f47927b;
                    if (!Arrays.equals(iArr, iArr2 != null ? iArr2 : null)) {
                        return false;
                    }
                } else if ((obj instanceof p293xa.n) && (obj2 instanceof p293xa.n)) {
                    p293xa.n nVar = (p293xa.n) obj2;
                    long[] jArr = ((p293xa.n) obj).f47931b;
                    if (jArr == null) {
                        jArr = null;
                    }
                    long[] jArr2 = nVar.f47931b;
                    if (!Arrays.equals(jArr, jArr2 != null ? jArr2 : null)) {
                        return false;
                    }
                } else if (!obj.equals(obj2)) {
                    return false;
                }
            }
        }
        return true;
    }

    public static final AbstractC0913m k(AbstractC0913m abstractC0913m) {
        AbstractC0913m abstractC0913mC = abstractC0913m.c();
        int iB = abstractC0913mC.b();
        for (int i10 = 0; i10 < iB; i10++) {
            abstractC0913mC.e(abstractC0913m.a(i10), i10);
        }
        return abstractC0913mC;
    }

    public static void l(int i10, int i11, int i12, byte[] bArr, byte[] destination) {
        kotlin.jvm.internal.i.e(bArr, "<this>");
        kotlin.jvm.internal.i.e(destination, "destination");
        System.arraycopy(bArr, i11, destination, i10, i12 - i11);
    }

    public static void m(int i10, int i11, int i12, int[] iArr, int[] destination) {
        kotlin.jvm.internal.i.e(iArr, "<this>");
        kotlin.jvm.internal.i.e(destination, "destination");
        System.arraycopy(iArr, i11, destination, i10, i12 - i11);
    }

    public static void n(int i10, int i11, int i12, Object[] objArr, Object[] destination) {
        kotlin.jvm.internal.i.e(objArr, "<this>");
        kotlin.jvm.internal.i.e(destination, "destination");
        System.arraycopy(objArr, i11, destination, i10, i12 - i11);
    }

    public static void o(char[] cArr, char[] destination, int i10, int i11, int i12) {
        kotlin.jvm.internal.i.e(cArr, "<this>");
        kotlin.jvm.internal.i.e(destination, "destination");
        System.arraycopy(cArr, i11, destination, i10, i12 - i11);
    }

    public static void p(long[] jArr, long[] destination, int i10, int i11, int i12) {
        kotlin.jvm.internal.i.e(jArr, "<this>");
        kotlin.jvm.internal.i.e(destination, "destination");
        System.arraycopy(jArr, i11, destination, i10, i12 - i11);
    }

    public static /* synthetic */ void q(int i10, int i11, int i12, int[] iArr, int[] iArr2) {
        if ((i12 & 2) != 0) {
            i10 = 0;
        }
        if ((i12 & 8) != 0) {
            i11 = iArr.length;
        }
        m(i10, 0, i11, iArr, iArr2);
    }

    public static /* synthetic */ void r(int i10, int i11, int i12, Object[] objArr, Object[] objArr2) {
        if ((i12 & 4) != 0) {
            i10 = 0;
        }
        if ((i12 & 8) != 0) {
            i11 = objArr.length;
        }
        n(0, i10, i11, objArr, objArr2);
    }

    public static /* synthetic */ void s(byte[] bArr, byte[] bArr2, int i10, int i11, int i12, int i13) {
        if ((i13 & 2) != 0) {
            i10 = 0;
        }
        if ((i13 & 4) != 0) {
            i11 = 0;
        }
        if ((i13 & 8) != 0) {
            i12 = bArr.length;
        }
        l(i10, i11, i12, bArr, bArr2);
    }

    public static byte[] t(byte[] bArr, int i10, int i11) {
        kotlin.jvm.internal.i.e(bArr, "<this>");
        v(i11, bArr.length);
        byte[] bArrCopyOfRange = Arrays.copyOfRange(bArr, i10, i11);
        kotlin.jvm.internal.i.d(bArrCopyOfRange, "copyOfRange(...)");
        return bArrCopyOfRange;
    }

    public static Object[] u(int i10, int i11, Object[] objArr) {
        kotlin.jvm.internal.i.e(objArr, "<this>");
        v(i11, objArr.length);
        Object[] objArrCopyOfRange = Arrays.copyOfRange(objArr, i10, i11);
        kotlin.jvm.internal.i.d(objArrCopyOfRange, "copyOfRange(...)");
        return objArrCopyOfRange;
    }

    public static final void v(int i10, int i11) {
        if (i10 > i11) {
            throw new IndexOutOfBoundsException(C1293h.h("toIndex (", ") is greater than size (", ").", i10, i11));
        }
    }

    public static void w(Object[] objArr, D3.l lVar, int i10, int i11) {
        kotlin.jvm.internal.i.e(objArr, "<this>");
        Arrays.fill(objArr, i10, i11, lVar);
    }

    public static void x(int i10, int i11, int i12, int[] iArr) {
        if ((i12 & 4) != 0) {
            i11 = iArr.length;
        }
        Arrays.fill(iArr, 0, i11, i10);
    }

    public static void y(long[] jArr, long j) {
        int length = jArr.length;
        kotlin.jvm.internal.i.e(jArr, "<this>");
        Arrays.fill(jArr, 0, length, j);
    }

    public void E(int i10, String tag, String msg) {
        kotlin.jvm.internal.i.e(tag, "tag");
        kotlin.jvm.internal.i.e(msg, "msg");
        P8.c.a(i10, tag, msg, new Object[0]);
    }

    @Override // com.google.android.gms.internal.play_billing.InterfaceC1961d1
    public InterfaceC1958c1 a(Class cls) {
        throw new IllegalStateException("This should never be called.");
    }

    @Override // com.google.android.gms.internal.play_billing.InterfaceC1961d1
    public boolean b(Class cls) {
        return false;
    }
}
