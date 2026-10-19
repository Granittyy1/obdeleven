package androidx.compose.ui.graphics;

import me.zhanghai.android.materialprogressbar.R;

/* JADX INFO: compiled from: Color.kt */
/* JADX INFO: loaded from: classes.dex */
@Ha.a
public final class H {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final long f13495b = Q3.d.e(4278190080L);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final long f13496c = Q3.d.e(4282664004L);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final long f13497d = Q3.d.e(4287137928L);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final long f13498e = Q3.d.e(4291611852L);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final long f13499f = Q3.d.e(4294967295L);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final long f13500g = Q3.d.e(4294901760L);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final long f13501h = Q3.d.e(4278255360L);

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final long f13502i = Q3.d.e(4278190335L);
    public static final long j = Q3.d.e(4294967040L);

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final long f13503k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final long f13504l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final /* synthetic */ int f13505m = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f13506a;

    /* JADX INFO: compiled from: Color.kt */
    public static final class a {
        public static long a() {
            return H.f13495b;
        }
    }

    static {
        Q3.d.e(4278255615L);
        Q3.d.e(4294902015L);
        f13503k = Q3.d.d(0);
        f13504l = Q3.d.c(0.0f, 0.0f, 0.0f, 0.0f, androidx.compose.ui.graphics.colorspace.f.f13586u);
    }

    public /* synthetic */ H(long j10) {
        this.f13506a = j10;
    }

    public static final long a(long j10, androidx.compose.ui.graphics.colorspace.c cVar) {
        androidx.compose.ui.graphics.colorspace.h hVarD;
        androidx.compose.ui.graphics.colorspace.c cVarF = f(j10);
        int i10 = cVarF.f13566c;
        int i11 = cVar.f13566c;
        if ((i10 | i11) < 0) {
            hVarD = androidx.compose.ui.graphics.colorspace.d.d(cVarF, cVar, 0);
        } else {
            androidx.collection.B<androidx.compose.ui.graphics.colorspace.h> b10 = androidx.compose.ui.graphics.colorspace.i.f13598a;
            int i12 = i10 | (i11 << 6);
            androidx.compose.ui.graphics.colorspace.h hVarB = b10.b(i12);
            if (hVarB == null) {
                hVarB = androidx.compose.ui.graphics.colorspace.d.d(cVarF, cVar, 0);
                b10.h(i12, hVarB);
            }
            hVarD = hVarB;
        }
        return hVarD.a(j10);
    }

    public static long b(float f10, long j10) {
        return Q3.d.c(h(j10), g(j10), e(j10), f10, f(j10));
    }

    public static final boolean c(long j10, long j11) {
        return j10 == j11;
    }

    public static final float d(long j10) {
        float fD;
        float f10;
        if ((63 & j10) == 0) {
            fD = (float) C6.b.d((j10 >>> 56) & 255);
            f10 = 255.0f;
        } else {
            fD = (float) C6.b.d((j10 >>> 6) & 1023);
            f10 = 1023.0f;
        }
        return fD / f10;
    }

    public static final float e(long j10) {
        int i10;
        int i11;
        int i12;
        if ((63 & j10) == 0) {
            return ((float) C6.b.d((j10 >>> 32) & 255)) / 255.0f;
        }
        short s10 = (short) ((j10 >>> 16) & 65535);
        int i13 = Short.MIN_VALUE & s10;
        int i14 = ((65535 & s10) >>> 10) & 31;
        int i15 = s10 & 1023;
        if (i14 != 0) {
            int i16 = i15 << 13;
            if (i14 == 31) {
                i10 = 255;
                if (i16 != 0) {
                    i16 |= 4194304;
                }
            } else {
                i10 = i14 + R.styleable.AppCompatTheme_toolbarNavigationButtonStyle;
            }
            int i17 = i10;
            i11 = i16;
            i12 = i17;
        } else {
            if (i15 != 0) {
                float fIntBitsToFloat = Float.intBitsToFloat(i15 + 1056964608) - Q.f13513a;
                return i13 == 0 ? fIntBitsToFloat : -fIntBitsToFloat;
            }
            i12 = 0;
            i11 = 0;
        }
        return Float.intBitsToFloat((i12 << 23) | (i13 << 16) | i11);
    }

    public static final androidx.compose.ui.graphics.colorspace.c f(long j10) {
        float[] fArr = androidx.compose.ui.graphics.colorspace.f.f13567a;
        return androidx.compose.ui.graphics.colorspace.f.f13590y[(int) (j10 & 63)];
    }

    public static final float g(long j10) {
        int i10;
        int i11;
        int i12;
        if ((63 & j10) == 0) {
            return ((float) C6.b.d((j10 >>> 40) & 255)) / 255.0f;
        }
        short s10 = (short) ((j10 >>> 32) & 65535);
        int i13 = Short.MIN_VALUE & s10;
        int i14 = ((65535 & s10) >>> 10) & 31;
        int i15 = s10 & 1023;
        if (i14 != 0) {
            int i16 = i15 << 13;
            if (i14 == 31) {
                i10 = 255;
                if (i16 != 0) {
                    i16 |= 4194304;
                }
            } else {
                i10 = i14 + R.styleable.AppCompatTheme_toolbarNavigationButtonStyle;
            }
            int i17 = i10;
            i11 = i16;
            i12 = i17;
        } else {
            if (i15 != 0) {
                float fIntBitsToFloat = Float.intBitsToFloat(i15 + 1056964608) - Q.f13513a;
                return i13 == 0 ? fIntBitsToFloat : -fIntBitsToFloat;
            }
            i12 = 0;
            i11 = 0;
        }
        return Float.intBitsToFloat((i12 << 23) | (i13 << 16) | i11);
    }

    public static final float h(long j10) {
        int i10;
        int i11;
        int i12;
        if ((63 & j10) == 0) {
            return ((float) C6.b.d((j10 >>> 48) & 255)) / 255.0f;
        }
        short s10 = (short) ((j10 >>> 48) & 65535);
        int i13 = Short.MIN_VALUE & s10;
        int i14 = ((65535 & s10) >>> 10) & 31;
        int i15 = s10 & 1023;
        if (i14 != 0) {
            int i16 = i15 << 13;
            if (i14 == 31) {
                i10 = 255;
                if (i16 != 0) {
                    i16 |= 4194304;
                }
            } else {
                i10 = i14 + R.styleable.AppCompatTheme_toolbarNavigationButtonStyle;
            }
            int i17 = i10;
            i11 = i16;
            i12 = i17;
        } else {
            if (i15 != 0) {
                float fIntBitsToFloat = Float.intBitsToFloat(i15 + 1056964608) - Q.f13513a;
                return i13 == 0 ? fIntBitsToFloat : -fIntBitsToFloat;
            }
            i12 = 0;
            i11 = 0;
        }
        return Float.intBitsToFloat((i12 << 23) | (i13 << 16) | i11);
    }

    public static String i(long j10) {
        StringBuilder sb2 = new StringBuilder("Color(");
        sb2.append(h(j10));
        sb2.append(", ");
        sb2.append(g(j10));
        sb2.append(", ");
        sb2.append(e(j10));
        sb2.append(", ");
        sb2.append(d(j10));
        sb2.append(", ");
        return B7.b.g(sb2, f(j10).f13564a, ')');
    }

    public final boolean equals(Object obj) {
        if (obj instanceof H) {
            return this.f13506a == ((H) obj).f13506a;
        }
        return false;
    }

    public final int hashCode() {
        return Long.hashCode(this.f13506a);
    }

    public final String toString() {
        return i(this.f13506a);
    }
}
