package p090h1;

import io.intercom.android.sdk.carousel.CarouselScreenFragment;
import java.util.Arrays;
import p241t7.b;

/* JADX INFO: compiled from: Sonic.java */
/* JADX INFO: loaded from: classes.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f35733a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f35734b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final float f35735c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final float f35736d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final float f35737e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f35738f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f35739g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final int f35740h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final short[] f35741i;
    public short[] j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f35742k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public short[] f35743l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int f35744m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public short[] f35745n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f35746o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public int f35747p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public int f35748q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public int f35749r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public int f35750s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public int f35751t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public int f35752u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public int f35753v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public double f35754w;

    public e(float f10, float f11, int i10, int i11, int i12) {
        this.f35733a = i10;
        this.f35734b = i11;
        this.f35735c = f10;
        this.f35736d = f11;
        this.f35737e = i10 / i12;
        this.f35738f = i10 / CarouselScreenFragment.CAROUSEL_ANIMATION_MS;
        int i13 = i10 / 65;
        this.f35739g = i13;
        int i14 = i13 * 2;
        this.f35740h = i14;
        this.f35741i = new short[i14];
        this.j = new short[i14 * i11];
        this.f35743l = new short[i14 * i11];
        this.f35745n = new short[i14 * i11];
    }

    public static void e(int i10, int i11, short[] sArr, int i12, short[] sArr2, int i13, short[] sArr3, int i14) {
        for (int i15 = 0; i15 < i11; i15++) {
            int i16 = (i12 * i11) + i15;
            int i17 = (i14 * i11) + i15;
            int i18 = (i13 * i11) + i15;
            for (int i19 = 0; i19 < i10; i19++) {
                sArr[i16] = (short) (((sArr3[i17] * i19) + ((i10 - i19) * sArr2[i18])) / i10);
                i16 += i11;
                i18 += i11;
                i17 += i11;
            }
        }
    }

    public final void a(short[] sArr, int i10, int i11) {
        short[] sArrC = c(this.f35743l, this.f35744m, i11);
        this.f35743l = sArrC;
        int i12 = this.f35734b;
        System.arraycopy(sArr, i10 * i12, sArrC, this.f35744m * i12, i12 * i11);
        this.f35744m += i11;
    }

    public final void b(short[] sArr, int i10, int i11) {
        int i12 = this.f35740h / i11;
        int i13 = this.f35734b;
        int i14 = i11 * i13;
        int i15 = i10 * i13;
        for (int i16 = 0; i16 < i12; i16++) {
            int i17 = 0;
            for (int i18 = 0; i18 < i14; i18++) {
                i17 += sArr[(i16 * i14) + i15 + i18];
            }
            this.f35741i[i16] = (short) (i17 / i14);
        }
    }

    public final short[] c(short[] sArr, int i10, int i11) {
        int length = sArr.length;
        int i12 = this.f35734b;
        int i13 = length / i12;
        return i10 + i11 <= i13 ? sArr : Arrays.copyOf(sArr, (((i13 * 3) / 2) + i11) * i12);
    }

    public final int d(short[] sArr, int i10, int i11, int i12) {
        int i13 = i10 * this.f35734b;
        int i14 = 255;
        int i15 = 1;
        int i16 = 0;
        int i17 = 0;
        while (i11 <= i12) {
            int iAbs = 0;
            for (int i18 = 0; i18 < i11; i18++) {
                iAbs += Math.abs(sArr[i13 + i18] - sArr[(i13 + i11) + i18]);
            }
            if (iAbs * i16 < i15 * i11) {
                i16 = i11;
                i15 = iAbs;
            }
            if (iAbs * i14 > i17 * i11) {
                i14 = i11;
                i17 = iAbs;
            }
            i11++;
        }
        this.f35752u = i15 / i16;
        this.f35753v = i17 / i14;
        return i16;
    }

    public final void f() {
        int i10;
        int i11;
        int iD;
        int i12;
        int iRound;
        int iRound2;
        int i13;
        int i14;
        int i15;
        int i16;
        long j;
        long j10;
        int i17 = this.f35744m;
        float f10 = this.f35735c;
        float f11 = this.f35736d;
        double d10 = f10 / f11;
        float f12 = this.f35737e * f11;
        int i18 = this.f35733a;
        int i19 = this.f35734b;
        int i20 = 0;
        int i21 = 1;
        if (d10 > 1.0000100135803223d || d10 < 0.9999899864196777d) {
            int i22 = this.f35742k;
            int i23 = this.f35740h;
            if (i22 >= i23) {
                int i24 = 0;
                while (true) {
                    int i25 = this.f35749r;
                    if (i25 > 0) {
                        int iMin = Math.min(i23, i25);
                        a(this.j, i24, iMin);
                        this.f35749r -= iMin;
                        i24 += iMin;
                        i11 = i17;
                        i10 = i18;
                    } else {
                        short[] sArr = this.j;
                        int i26 = i18 > 4000 ? i18 / 4000 : i21;
                        int i27 = this.f35739g;
                        int i28 = this.f35738f;
                        if (i19 == i21 && i26 == i21) {
                            iD = d(sArr, i24, i28, i27);
                            i11 = i17;
                            i10 = i18;
                        } else {
                            b(sArr, i24, i26);
                            i10 = i18;
                            i11 = i17;
                            short[] sArr2 = this.f35741i;
                            int iD2 = d(sArr2, 0, i28 / i26, i27 / i26);
                            if (i26 != 1) {
                                int i29 = iD2 * i26;
                                int i30 = i26 * 4;
                                int i31 = i29 - i30;
                                int i32 = i29 + i30;
                                if (i31 >= i28) {
                                    i28 = i31;
                                }
                                if (i32 <= i27) {
                                    i27 = i32;
                                }
                                if (i19 == 1) {
                                    iD = d(sArr, i24, i28, i27);
                                } else {
                                    b(sArr, i24, 1);
                                    iD = d(sArr2, 0, i28, i27);
                                }
                            } else {
                                iD = iD2;
                            }
                        }
                        int i33 = this.f35752u;
                        int i34 = this.f35753v;
                        if (i33 == 0 || (i12 = this.f35750s) == 0 || i34 > i33 * 3 || i33 * 2 <= this.f35751t * 3) {
                            i12 = iD;
                        }
                        this.f35751t = i33;
                        this.f35750s = iD;
                        if (d10 > 1.0d) {
                            short[] sArr3 = this.j;
                            if (d10 >= 2.0d) {
                                double d11 = (((double) i12) / (d10 - 1.0d)) + this.f35754w;
                                iRound2 = (int) Math.round(d11);
                                this.f35754w = d11 - ((double) iRound2);
                            } else {
                                double d12 = (((2.0d - d10) * ((double) i12)) / (d10 - 1.0d)) + this.f35754w;
                                int iRound3 = (int) Math.round(d12);
                                this.f35749r = iRound3;
                                this.f35754w = d12 - ((double) iRound3);
                                iRound2 = i12;
                            }
                            short[] sArrC = c(this.f35743l, this.f35744m, iRound2);
                            this.f35743l = sArrC;
                            int i35 = i24;
                            e(iRound2, this.f35734b, sArrC, this.f35744m, sArr3, i35, sArr3, i24 + i12);
                            this.f35744m += iRound2;
                            i24 = i12 + iRound2 + i35;
                        } else {
                            int i36 = i24;
                            short[] sArr4 = this.j;
                            if (d10 < 0.5d) {
                                double d13 = ((((double) i12) * d10) / (1.0d - d10)) + this.f35754w;
                                iRound = (int) Math.round(d13);
                                this.f35754w = d13 - ((double) iRound);
                            } else {
                                double d14 = ((((2.0d * d10) - 1.0d) * ((double) i12)) / (1.0d - d10)) + this.f35754w;
                                int iRound4 = (int) Math.round(d14);
                                this.f35749r = iRound4;
                                this.f35754w = d14 - ((double) iRound4);
                                iRound = i12;
                            }
                            int i37 = i12 + iRound;
                            short[] sArrC2 = c(this.f35743l, this.f35744m, i37);
                            this.f35743l = sArrC2;
                            System.arraycopy(sArr4, i36 * i19, sArrC2, this.f35744m * i19, i12 * i19);
                            e(iRound, this.f35734b, this.f35743l, this.f35744m + i12, sArr4, i36 + i12, sArr4, i36);
                            this.f35744m += i37;
                            i24 = i36 + iRound;
                        }
                    }
                    if (i24 + i23 > i22) {
                        break;
                    }
                    i18 = i10;
                    i17 = i11;
                    i21 = 1;
                }
                int i38 = this.f35742k - i24;
                short[] sArr5 = this.j;
                System.arraycopy(sArr5, i24 * i19, sArr5, 0, i38 * i19);
                this.f35742k = i38;
            }
            if (f12 != 1.0f || this.f35744m == (i13 = i11)) {
            }
            int i39 = i10;
            long j11 = (long) (i39 / f12);
            long j12 = i39;
            while (j11 != 0 && j12 != 0 && j11 % 2 == 0 && j12 % 2 == 0) {
                j11 /= 2;
                j12 /= 2;
            }
            int i40 = this.f35744m - i13;
            short[] sArrC3 = c(this.f35745n, this.f35746o, i40);
            this.f35745n = sArrC3;
            System.arraycopy(this.f35743l, i13 * i19, sArrC3, this.f35746o * i19, i40 * i19);
            this.f35744m = i13;
            this.f35746o += i40;
            int i41 = 0;
            while (true) {
                i14 = this.f35746o;
                i15 = i14 - 1;
                if (i41 >= i15) {
                    break;
                }
                while (true) {
                    i16 = this.f35747p + 1;
                    j = i16;
                    long j13 = j * j11;
                    j10 = this.f35748q;
                    if (j13 <= j10 * j12) {
                        break;
                    }
                    this.f35743l = c(this.f35743l, this.f35744m, 1);
                    int i42 = i20;
                    while (i42 < i19) {
                        short[] sArr6 = this.f35743l;
                        int i43 = (this.f35744m * i19) + i42;
                        short[] sArr7 = this.f35745n;
                        int i44 = (i41 * i19) + i42;
                        short s10 = sArr7[i44];
                        short s11 = sArr7[i44 + i19];
                        long j14 = ((long) this.f35748q) * j12;
                        int i45 = this.f35747p;
                        long j15 = j12;
                        long j16 = ((long) (i45 + 1)) * j11;
                        long j17 = j16 - j14;
                        long j18 = j16 - (((long) i45) * j11);
                        sArr6[i43] = (short) ((((j18 - j17) * ((long) s11)) + (((long) s10) * j17)) / j18);
                        i42++;
                        j12 = j15;
                    }
                    this.f35748q++;
                    this.f35744m++;
                    j12 = j12;
                    i20 = 0;
                }
                long j19 = j12;
                this.f35747p = i16;
                if (j == j19) {
                    this.f35747p = 0;
                    b.k(j10 == j11);
                    this.f35748q = 0;
                }
                i41++;
                j12 = j19;
                i20 = 0;
            }
            if (i15 == 0) {
                return;
            }
            short[] sArr8 = this.f35745n;
            System.arraycopy(sArr8, i15 * i19, sArr8, 0, (i14 - i15) * i19);
            this.f35746o -= i15;
            return;
        }
        a(this.j, 0, this.f35742k);
        this.f35742k = 0;
        i11 = i17;
        i10 = i18;
        if (f12 != 1.0f) {
        }
    }
}
