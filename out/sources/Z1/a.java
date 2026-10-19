package Z1;

import X1.l;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.util.SparseArray;
import com.google.common.collect.ImmutableList;
import java.util.ArrayList;
import java.util.List;
import me.zhanghai.android.materialprogressbar.R;
import p114j1.A;
import p114j1.k;
import p114j1.q;
import p114j1.r;

/* JADX INFO: compiled from: DvbParser.java */
/* JADX INFO: loaded from: classes.dex */
public final class a implements l {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final byte[] f7677h = {0, 7, 8, 15};

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final byte[] f7678i = {0, 119, -120, -1};
    public static final byte[] j = {0, 17, 34, 51, 68, 85, 102, 119, -120, -103, -86, -69, -52, -35, -18, -1};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Paint f7679a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Paint f7680b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Canvas f7681c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final b f7682d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final C0109a f7683e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final h f7684f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public Bitmap f7685g;

    /* JADX INFO: renamed from: Z1.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: DvbParser.java */
    public static final class C0109a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f7686a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int[] f7687b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final int[] f7688c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final int[] f7689d;

        public C0109a(int i10, int[] iArr, int[] iArr2, int[] iArr3) {
            this.f7686a = i10;
            this.f7687b = iArr;
            this.f7688c = iArr2;
            this.f7689d = iArr3;
        }
    }

    /* JADX INFO: compiled from: DvbParser.java */
    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f7690a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f7691b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final int f7692c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final int f7693d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final int f7694e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final int f7695f;

        public b(int i10, int i11, int i12, int i13, int i14, int i15) {
            this.f7690a = i10;
            this.f7691b = i11;
            this.f7692c = i12;
            this.f7693d = i13;
            this.f7694e = i14;
            this.f7695f = i15;
        }
    }

    /* JADX INFO: compiled from: DvbParser.java */
    public static final class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f7696a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final boolean f7697b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final byte[] f7698c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final byte[] f7699d;

        public c(int i10, boolean z10, byte[] bArr, byte[] bArr2) {
            this.f7696a = i10;
            this.f7697b = z10;
            this.f7698c = bArr;
            this.f7699d = bArr2;
        }
    }

    /* JADX INFO: compiled from: DvbParser.java */
    public static final class d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f7700a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f7701b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final SparseArray<e> f7702c;

        public d(int i10, int i11, SparseArray sparseArray) {
            this.f7700a = i10;
            this.f7701b = i11;
            this.f7702c = sparseArray;
        }
    }

    /* JADX INFO: compiled from: DvbParser.java */
    public static final class e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f7703a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f7704b;

        public e(int i10, int i11) {
            this.f7703a = i10;
            this.f7704b = i11;
        }
    }

    /* JADX INFO: compiled from: DvbParser.java */
    public static final class f {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f7705a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final boolean f7706b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final int f7707c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final int f7708d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final int f7709e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final int f7710f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final int f7711g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final int f7712h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public final int f7713i;
        public final SparseArray<g> j;

        public f(int i10, boolean z10, int i11, int i12, int i13, int i14, int i15, int i16, int i17, SparseArray sparseArray) {
            this.f7705a = i10;
            this.f7706b = z10;
            this.f7707c = i11;
            this.f7708d = i12;
            this.f7709e = i13;
            this.f7710f = i14;
            this.f7711g = i15;
            this.f7712h = i16;
            this.f7713i = i17;
            this.j = sparseArray;
        }
    }

    /* JADX INFO: compiled from: DvbParser.java */
    public static final class g {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f7714a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f7715b;

        public g(int i10, int i11) {
            this.f7714a = i10;
            this.f7715b = i11;
        }
    }

    /* JADX INFO: compiled from: DvbParser.java */
    public static final class h {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f7716a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f7717b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final SparseArray<f> f7718c = new SparseArray<>();

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final SparseArray<C0109a> f7719d = new SparseArray<>();

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final SparseArray<c> f7720e = new SparseArray<>();

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final SparseArray<C0109a> f7721f = new SparseArray<>();

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final SparseArray<c> f7722g = new SparseArray<>();

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public b f7723h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public d f7724i;

        public h(int i10, int i11) {
            this.f7716a = i10;
            this.f7717b = i11;
        }
    }

    public a(List<byte[]> list) {
        r rVar = new r(list.get(0));
        int iA = rVar.A();
        int iA2 = rVar.A();
        Paint paint = new Paint();
        this.f7679a = paint;
        paint.setStyle(Paint.Style.FILL_AND_STROKE);
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC));
        paint.setPathEffect(null);
        Paint paint2 = new Paint();
        this.f7680b = paint2;
        paint2.setStyle(Paint.Style.FILL);
        paint2.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OVER));
        paint2.setPathEffect(null);
        this.f7681c = new Canvas();
        this.f7682d = new b(719, 575, 0, 719, 0, 575);
        this.f7683e = new C0109a(0, new int[]{0, -1, -16777216, -8421505}, d(), e());
        this.f7684f = new h(iA, iA2);
    }

    public static byte[] c(int i10, int i11, q qVar) {
        byte[] bArr = new byte[i10];
        for (int i12 = 0; i12 < i10; i12++) {
            bArr[i12] = (byte) qVar.g(i11);
        }
        return bArr;
    }

    public static int[] d() {
        int[] iArr = new int[16];
        iArr[0] = 0;
        for (int i10 = 1; i10 < 16; i10++) {
            if (i10 < 8) {
                iArr[i10] = f(255, (i10 & 1) != 0 ? 255 : 0, (i10 & 2) != 0 ? 255 : 0, (i10 & 4) != 0 ? 255 : 0);
            } else {
                iArr[i10] = f(255, (i10 & 1) != 0 ? 127 : 0, (i10 & 2) != 0 ? 127 : 0, (i10 & 4) == 0 ? 0 : 127);
            }
        }
        return iArr;
    }

    public static int[] e() {
        int[] iArr = new int[256];
        iArr[0] = 0;
        for (int i10 = 0; i10 < 256; i10++) {
            if (i10 < 8) {
                iArr[i10] = f(63, (i10 & 1) != 0 ? 255 : 0, (i10 & 2) != 0 ? 255 : 0, (i10 & 4) == 0 ? 0 : 255);
            } else {
                int i11 = i10 & 136;
                if (i11 == 0) {
                    iArr[i10] = f(255, ((i10 & 1) != 0 ? 85 : 0) + ((i10 & 16) != 0 ? 170 : 0), ((i10 & 2) != 0 ? 85 : 0) + ((i10 & 32) != 0 ? 170 : 0), ((i10 & 4) == 0 ? 0 : 85) + ((i10 & 64) == 0 ? 0 : 170));
                } else if (i11 == 8) {
                    iArr[i10] = f(127, ((i10 & 1) != 0 ? 85 : 0) + ((i10 & 16) != 0 ? 170 : 0), ((i10 & 2) != 0 ? 85 : 0) + ((i10 & 32) != 0 ? 170 : 0), ((i10 & 4) == 0 ? 0 : 85) + ((i10 & 64) == 0 ? 0 : 170));
                } else if (i11 == 128) {
                    iArr[i10] = f(255, ((i10 & 1) != 0 ? 43 : 0) + 127 + ((i10 & 16) != 0 ? 85 : 0), ((i10 & 2) != 0 ? 43 : 0) + 127 + ((i10 & 32) != 0 ? 85 : 0), ((i10 & 4) == 0 ? 0 : 43) + 127 + ((i10 & 64) == 0 ? 0 : 85));
                } else if (i11 == 136) {
                    iArr[i10] = f(255, ((i10 & 1) != 0 ? 43 : 0) + ((i10 & 16) != 0 ? 85 : 0), ((i10 & 2) != 0 ? 43 : 0) + ((i10 & 32) != 0 ? 85 : 0), ((i10 & 4) == 0 ? 0 : 43) + ((i10 & 64) == 0 ? 0 : 85));
                }
            }
        }
        return iArr;
    }

    public static int f(int i10, int i11, int i12, int i13) {
        return (i10 << 24) | (i11 << 16) | (i12 << 8) | i13;
    }

    /* JADX WARN: Code duplicated, block: B:101:0x01a9 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:102:0x01ab A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:103:0x01ad A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:104:0x01af  */
    /* JADX WARN: Code duplicated, block: B:105:0x01b6  */
    /* JADX WARN: Code duplicated, block: B:106:0x01c9  */
    /* JADX WARN: Code duplicated, block: B:107:0x01dc  */
    /* JADX WARN: Code duplicated, block: B:108:0x01e6  */
    /* JADX WARN: Code duplicated, block: B:110:0x01f1 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:114:0x0216  */
    /* JADX WARN: Code duplicated, block: B:118:0x0224 A[LOOP:3: B:89:0x0172->B:118:0x0224, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:141:0x021f A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:91:0x0178  */
    /* JADX WARN: Code duplicated, block: B:93:0x0181  */
    /* JADX WARN: Code duplicated, block: B:95:0x0187  */
    /* JADX WARN: Code duplicated, block: B:96:0x0196  */
    /* JADX WARN: Code duplicated, block: B:98:0x019c  */
    /* JADX WARN: Code duplicated, block: B:99:0x01a3  */
    public static void g(byte[] bArr, int[] iArr, int i10, int i11, int i12, Paint paint, Canvas canvas) {
        byte[] bArr2;
        byte[] bArr3;
        int i13;
        int i14;
        int iG;
        int iG2;
        char c10;
        char c11;
        int iG3;
        int i15;
        int iG4;
        int iG5;
        int i16;
        int iG6;
        q qVar = new q(bArr.length, bArr);
        int i17 = i11;
        int i18 = i12;
        byte[] bArrC = null;
        byte[] bArrC2 = null;
        byte[] bArrC3 = null;
        while (qVar.b() != 0) {
            int i19 = 8;
            int iG7 = qVar.g(8);
            if (iG7 != 240) {
                int i20 = 1;
                int i21 = 3;
                int i22 = 4;
                switch (iG7) {
                    case 16:
                        int i23 = 1;
                        if (i10 == 3) {
                            bArr3 = bArrC == null ? f7678i : bArrC;
                        } else {
                            if (i10 == 2) {
                                bArr3 = bArrC3 == null ? f7677h : bArrC3;
                            } else {
                                bArr2 = null;
                            }
                            i13 = i17;
                            i14 = 0;
                            while (true) {
                                iG = qVar.g(2);
                                if (iG != 0) {
                                    iG3 = i23;
                                } else if (qVar.f()) {
                                    iG3 = qVar.g(3) + 3;
                                    iG = qVar.g(2);
                                } else if (qVar.f()) {
                                    iG3 = i23;
                                    iG = 0;
                                } else {
                                    iG2 = qVar.g(2);
                                    if (iG2 != 0) {
                                        c10 = 4;
                                        c11 = '\b';
                                        i14 = i23;
                                        iG = 0;
                                        iG3 = 0;
                                    } else if (iG2 != i23) {
                                        c10 = 4;
                                        c11 = '\b';
                                        i14 = i14;
                                        iG3 = 2;
                                        iG = 0;
                                    } else if (iG2 != 2) {
                                        c10 = 4;
                                        c11 = '\b';
                                        i14 = i14;
                                        iG3 = qVar.g(4) + 12;
                                        iG = qVar.g(2);
                                    } else if (iG2 != 3) {
                                        iG = 0;
                                        iG3 = 0;
                                    } else {
                                        c11 = '\b';
                                        i14 = i14;
                                        iG3 = qVar.g(8) + 29;
                                        iG = qVar.g(2);
                                        c10 = 4;
                                    }
                                    if (iG3 == 0 && paint != null) {
                                        if (bArr2 != 0) {
                                            iG = bArr2[iG];
                                        }
                                        paint.setColor(iArr[iG]);
                                        canvas.drawRect(i13, i18, i13 + iG3, i18 + 1, paint);
                                    }
                                    i13 += iG3;
                                    if (i14 != 0) {
                                        qVar.c();
                                    } else {
                                        i14 = i14;
                                        i23 = 1;
                                    }
                                }
                                c10 = 4;
                                c11 = '\b';
                                if (iG3 == 0) {
                                }
                                i13 += iG3;
                                if (i14 != 0) {
                                    qVar.c();
                                } else {
                                    i14 = i14;
                                    i23 = 1;
                                }
                            }
                        }
                        bArr2 = bArr3;
                        i13 = i17;
                        i14 = 0;
                        while (true) {
                            iG = qVar.g(2);
                            if (iG != 0) {
                                iG3 = i23;
                            } else if (qVar.f()) {
                                iG3 = qVar.g(3) + 3;
                                iG = qVar.g(2);
                            } else if (qVar.f()) {
                                iG3 = i23;
                                iG = 0;
                            } else {
                                iG2 = qVar.g(2);
                                if (iG2 != 0) {
                                    c10 = 4;
                                    c11 = '\b';
                                    i14 = i23;
                                    iG = 0;
                                    iG3 = 0;
                                } else if (iG2 != i23) {
                                    c10 = 4;
                                    c11 = '\b';
                                    i14 = i14;
                                    iG3 = 2;
                                    iG = 0;
                                } else if (iG2 != 2) {
                                    c10 = 4;
                                    c11 = '\b';
                                    i14 = i14;
                                    iG3 = qVar.g(4) + 12;
                                    iG = qVar.g(2);
                                } else if (iG2 != 3) {
                                    iG = 0;
                                    iG3 = 0;
                                } else {
                                    c11 = '\b';
                                    i14 = i14;
                                    iG3 = qVar.g(8) + 29;
                                    iG = qVar.g(2);
                                    c10 = 4;
                                }
                                if (iG3 == 0) {
                                }
                                i13 += iG3;
                                if (i14 != 0) {
                                    qVar.c();
                                } else {
                                    i14 = i14;
                                    i23 = 1;
                                }
                            }
                            c10 = 4;
                            c11 = '\b';
                            if (iG3 == 0) {
                            }
                            i13 += iG3;
                            if (i14 != 0) {
                                qVar.c();
                            } else {
                                i14 = i14;
                                i23 = 1;
                            }
                            break;
                        }
                        break;
                    case 17:
                        byte[] bArr4 = i10 == 3 ? bArrC2 == null ? j : bArrC2 : null;
                        i13 = i17;
                        boolean z10 = false;
                        while (true) {
                            int iG8 = qVar.g(i22);
                            if (iG8 != 0) {
                                i15 = 1;
                                z10 = z10;
                            } else if (qVar.f()) {
                                if (qVar.f()) {
                                    int iG9 = qVar.g(2);
                                    if (iG9 == 0) {
                                        i15 = 1;
                                    } else if (iG9 == 1) {
                                        i15 = 2;
                                    } else if (iG9 == 2) {
                                        iG4 = qVar.g(i22) + 9;
                                        iG5 = qVar.g(i22);
                                    } else if (iG9 != i21) {
                                        z10 = z10;
                                        iG8 = 0;
                                        i15 = 0;
                                    } else {
                                        iG4 = qVar.g(i19) + 25;
                                        iG5 = qVar.g(i22);
                                    }
                                    iG8 = 0;
                                } else {
                                    iG4 = qVar.g(2) + i22;
                                    iG5 = qVar.g(i22);
                                }
                                z10 = z10;
                                i15 = iG4;
                                iG8 = iG5;
                            } else {
                                int iG10 = qVar.g(i21);
                                if (iG10 != 0) {
                                    i15 = iG10 + 2;
                                    iG8 = 0;
                                } else {
                                    z10 = true;
                                    iG8 = 0;
                                    i15 = 0;
                                }
                            }
                            if (i15 != 0 && paint != null) {
                                if (bArr4 != 0) {
                                    iG8 = bArr4[iG8];
                                }
                                paint.setColor(iArr[iG8]);
                                canvas.drawRect(i13, i18, i13 + i15, i18 + 1, paint);
                            }
                            i13 += i15;
                            if (z10) {
                                qVar.c();
                            } else {
                                i21 = i21;
                                z10 = z10;
                                i22 = 4;
                                i19 = 8;
                            }
                            break;
                        }
                        break;
                    case 18:
                        int i24 = i17;
                        int i25 = 0;
                        while (true) {
                            int iG11 = qVar.g(8);
                            if (iG11 != 0) {
                                i16 = i25;
                                iG6 = i20;
                            } else if (qVar.f()) {
                                i16 = i25;
                                iG6 = qVar.g(7);
                                iG11 = qVar.g(8);
                            } else {
                                int iG12 = qVar.g(7);
                                if (iG12 != 0) {
                                    i16 = i25;
                                    iG6 = iG12;
                                    iG11 = 0;
                                } else {
                                    i16 = i20;
                                    iG11 = 0;
                                    iG6 = 0;
                                }
                            }
                            if (iG6 != 0 && paint != null) {
                                paint.setColor(iArr[iG11]);
                                canvas.drawRect(i24, i18, i24 + iG6, i18 + 1, paint);
                            }
                            i24 += iG6;
                            if (i16 != 0) {
                                i17 = i24;
                                continue;
                            } else {
                                i20 = i20;
                                i25 = i16;
                            }
                            break;
                        }
                        break;
                    default:
                        switch (iG7) {
                            case R.styleable.AppCompatTheme_actionOverflowButtonStyle /* 32 */:
                                bArrC3 = c(4, 4, qVar);
                                break;
                            case R.styleable.AppCompatTheme_actionOverflowMenuStyle /* 33 */:
                                bArrC = c(4, 8, qVar);
                                break;
                            case R.styleable.AppCompatTheme_activityChooserViewStyle /* 34 */:
                                bArrC2 = c(16, 8, qVar);
                                break;
                            default:
                                continue;
                        }
                        break;
                }
                i17 = i13;
            } else {
                i18 += 2;
                i17 = i11;
            }
        }
    }

    public static C0109a h(q qVar, int i10) {
        int[] iArr;
        int iG;
        int i11;
        int iG2;
        int iG3;
        int iG4;
        int i12 = 8;
        int iG5 = qVar.g(8);
        qVar.o(8);
        int i13 = 2;
        int i14 = i10 - 2;
        int i15 = 0;
        int[] iArr2 = {0, -1, -16777216, -8421505};
        int[] iArrD = d();
        int[] iArrE = e();
        while (i14 > 0) {
            int iG6 = qVar.g(i12);
            int iG7 = qVar.g(i12);
            if ((iG7 & 128) != 0) {
                iArr = iArr2;
            } else {
                iArr = (iG7 & 64) != 0 ? iArrD : iArrE;
            }
            if ((iG7 & 1) != 0) {
                iG3 = qVar.g(i12);
                iG4 = qVar.g(i12);
                iG = qVar.g(i12);
                iG2 = qVar.g(i12);
                i11 = i14 - 6;
            } else {
                int iG8 = qVar.g(6) << i13;
                int iG9 = qVar.g(4) << 4;
                iG = qVar.g(4) << 4;
                i11 = i14 - 4;
                iG2 = qVar.g(i13) << 6;
                iG3 = iG8;
                iG4 = iG9;
            }
            if (iG3 == 0) {
                iG4 = i15;
                iG = iG4;
                iG2 = 255;
            }
            double d10 = iG3;
            double d11 = iG4 - 128;
            double d12 = iG - 128;
            iArr[iG6] = f((byte) (255 - (iG2 & 255)), A.g((int) ((1.402d * d11) + d10), 0, 255), A.g((int) ((d10 - (0.34414d * d12)) - (d11 * 0.71414d)), 0, 255), A.g((int) ((d12 * 1.772d) + d10), 0, 255));
            i14 = i11;
            i15 = 0;
            iG5 = iG5;
            iArrE = iArrE;
            i12 = 8;
            i13 = 2;
        }
        return new C0109a(iG5, iArr2, iArrD, iArrE);
    }

    public static c i(q qVar) {
        byte[] bArr;
        int iG = qVar.g(16);
        qVar.o(4);
        int iG2 = qVar.g(2);
        boolean zF = qVar.f();
        qVar.o(1);
        byte[] bArr2 = A.f40998c;
        if (iG2 != 1) {
            if (iG2 == 0) {
                int iG3 = qVar.g(16);
                int iG4 = qVar.g(16);
                if (iG3 > 0) {
                    bArr2 = new byte[iG3];
                    qVar.j(iG3, bArr2);
                }
                if (iG4 > 0) {
                    bArr = new byte[iG4];
                    qVar.j(iG4, bArr);
                }
            }
            return new c(iG, zF, bArr2, bArr);
        }
        qVar.o(qVar.g(8) * 16);
        bArr = bArr2;
        return new c(iG, zF, bArr2, bArr);
    }

    @Override // X1.l
    public final void a(byte[] bArr, int i10, int i11, l.b bVar, p114j1.f<X1.c> fVar) {
        h hVar;
        X1.c cVar;
        int i12;
        int i13;
        char c10;
        char c11;
        int i14;
        int i15;
        int i16;
        int i17;
        f fVar2;
        int iG;
        int iG2;
        int i18;
        int iG3;
        q qVar = new q(i10 + i11, bArr);
        qVar.m(i10);
        while (true) {
            int iB = qVar.b();
            hVar = this.f7684f;
            if (iB >= 48 && qVar.g(8) == 15) {
                int iG4 = qVar.g(8);
                int i19 = 16;
                int iG5 = qVar.g(16);
                int iG6 = qVar.g(16);
                int iD = qVar.d() + iG6;
                if (iG6 * 8 > qVar.b()) {
                    k.f("Data field length exceeds limit");
                    qVar.o(qVar.b());
                } else {
                    switch (iG4) {
                        case 16:
                            if (iG5 == hVar.f7716a) {
                                d dVar = hVar.f7724i;
                                qVar.g(8);
                                int iG7 = qVar.g(4);
                                int iG8 = qVar.g(2);
                                qVar.o(2);
                                int i20 = iG6 - 2;
                                SparseArray sparseArray = new SparseArray();
                                while (i20 > 0) {
                                    int iG9 = qVar.g(8);
                                    qVar.o(8);
                                    i20 -= 6;
                                    sparseArray.put(iG9, new e(qVar.g(16), qVar.g(16)));
                                }
                                d dVar2 = new d(iG7, iG8, sparseArray);
                                if (iG8 != 0) {
                                    hVar.f7724i = dVar2;
                                    hVar.f7718c.clear();
                                    hVar.f7719d.clear();
                                    hVar.f7720e.clear();
                                } else if (dVar != null && dVar.f7700a != iG7) {
                                    hVar.f7724i = dVar2;
                                }
                            }
                            break;
                        case 17:
                            d dVar3 = hVar.f7724i;
                            if (iG5 == hVar.f7716a && dVar3 != null) {
                                int iG10 = qVar.g(8);
                                qVar.o(4);
                                boolean zF = qVar.f();
                                qVar.o(3);
                                int iG11 = qVar.g(16);
                                int iG12 = qVar.g(16);
                                qVar.g(3);
                                int iG13 = qVar.g(3);
                                qVar.o(2);
                                int iG14 = qVar.g(8);
                                int iG15 = qVar.g(8);
                                int iG16 = qVar.g(4);
                                int iG17 = qVar.g(2);
                                qVar.o(2);
                                int i21 = iG6 - 10;
                                SparseArray sparseArray2 = new SparseArray();
                                while (i21 > 0) {
                                    int iG18 = qVar.g(i19);
                                    int iG19 = qVar.g(2);
                                    qVar.g(2);
                                    int iG20 = qVar.g(12);
                                    qVar.o(4);
                                    int iG21 = qVar.g(12);
                                    int i22 = i21 - 6;
                                    if (iG19 == 1 || iG19 == 2) {
                                        qVar.g(8);
                                        qVar.g(8);
                                        i21 -= 8;
                                    } else {
                                        i21 = i22;
                                    }
                                    sparseArray2.put(iG18, new g(iG20, iG21));
                                    i19 = 16;
                                }
                                f fVar3 = new f(iG10, zF, iG11, iG12, iG13, iG14, iG15, iG16, iG17, sparseArray2);
                                SparseArray<f> sparseArray3 = hVar.f7718c;
                                if (dVar3.f7701b == 0 && (fVar2 = sparseArray3.get(iG10)) != null) {
                                    int i23 = 0;
                                    while (true) {
                                        SparseArray<g> sparseArray4 = fVar2.j;
                                        if (i23 < sparseArray4.size()) {
                                            fVar3.j.put(sparseArray4.keyAt(i23), sparseArray4.valueAt(i23));
                                            i23++;
                                        }
                                    }
                                }
                                sparseArray3.put(fVar3.f7705a, fVar3);
                            }
                            break;
                        case 18:
                            if (iG5 == hVar.f7716a) {
                                C0109a c0109aH = h(qVar, iG6);
                                hVar.f7719d.put(c0109aH.f7686a, c0109aH);
                            } else if (iG5 == hVar.f7717b) {
                                C0109a c0109aH2 = h(qVar, iG6);
                                hVar.f7721f.put(c0109aH2.f7686a, c0109aH2);
                            }
                            break;
                        case 19:
                            if (iG5 == hVar.f7716a) {
                                c cVarI = i(qVar);
                                hVar.f7720e.put(cVarI.f7696a, cVarI);
                            } else if (iG5 == hVar.f7717b) {
                                c cVarI2 = i(qVar);
                                hVar.f7722g.put(cVarI2.f7696a, cVarI2);
                            }
                            break;
                        case 20:
                            if (iG5 == hVar.f7716a) {
                                qVar.o(4);
                                boolean zF2 = qVar.f();
                                qVar.o(3);
                                int iG22 = qVar.g(16);
                                int iG23 = qVar.g(16);
                                if (zF2) {
                                    int iG24 = qVar.g(16);
                                    iG = qVar.g(16);
                                    iG3 = qVar.g(16);
                                    iG2 = qVar.g(16);
                                    i18 = iG24;
                                } else {
                                    iG = iG22;
                                    iG2 = iG23;
                                    i18 = 0;
                                    iG3 = 0;
                                }
                                hVar.f7723h = new b(iG22, iG23, i18, iG, iG3, iG2);
                            }
                            break;
                    }
                    qVar.p(iD - qVar.d());
                }
            }
        }
        d dVar4 = hVar.f7724i;
        if (dVar4 == null) {
            cVar = new X1.c(-9223372036854775807L, -9223372036854775807L, ImmutableList.K());
        } else {
            b bVar2 = hVar.f7723h;
            if (bVar2 == null) {
                bVar2 = this.f7682d;
            }
            Bitmap bitmap = this.f7685g;
            Canvas canvas = this.f7681c;
            if (bitmap == null || bVar2.f7690a + 1 != bitmap.getWidth() || bVar2.f7691b + 1 != this.f7685g.getHeight()) {
                Bitmap bitmapCreateBitmap = Bitmap.createBitmap(bVar2.f7690a + 1, bVar2.f7691b + 1, Bitmap.Config.ARGB_8888);
                this.f7685g = bitmapCreateBitmap;
                canvas.setBitmap(bitmapCreateBitmap);
            }
            ArrayList arrayList = new ArrayList();
            int i24 = 0;
            while (true) {
                SparseArray<e> sparseArray5 = dVar4.f7702c;
                if (i24 < sparseArray5.size()) {
                    canvas.save();
                    e eVarValueAt = sparseArray5.valueAt(i24);
                    f fVar4 = hVar.f7718c.get(sparseArray5.keyAt(i24));
                    int i25 = eVarValueAt.f7703a + bVar2.f7692c;
                    int i26 = eVarValueAt.f7704b + bVar2.f7694e;
                    int iMin = Math.min(fVar4.f7707c + i25, bVar2.f7693d);
                    int i27 = fVar4.f7708d;
                    int i28 = i26 + i27;
                    canvas.clipRect(i25, i26, iMin, Math.min(i28, bVar2.f7695f));
                    SparseArray<C0109a> sparseArray6 = hVar.f7719d;
                    int i29 = fVar4.f7710f;
                    C0109a c0109a = sparseArray6.get(i29);
                    if (c0109a == null && (c0109a = hVar.f7721f.get(i29)) == null) {
                        c0109a = this.f7683e;
                    }
                    int i30 = 0;
                    while (true) {
                        SparseArray<g> sparseArray7 = fVar4.j;
                        if (i30 < sparseArray7.size()) {
                            int iKeyAt = sparseArray7.keyAt(i30);
                            g gVarValueAt = sparseArray7.valueAt(i30);
                            d dVar5 = dVar4;
                            c cVar2 = hVar.f7720e.get(iKeyAt);
                            if (cVar2 == null) {
                                cVar2 = hVar.f7722g.get(iKeyAt);
                            }
                            if (cVar2 != null) {
                                Paint paint = cVar2.f7697b ? null : this.f7679a;
                                int i31 = gVarValueAt.f7714a + i25;
                                int i32 = gVarValueAt.f7715b + i26;
                                int i33 = fVar4.f7709e;
                                int[] iArr = i33 == 3 ? c0109a.f7689d : i33 == 2 ? c0109a.f7688c : c0109a.f7687b;
                                i15 = i28;
                                i16 = i26;
                                i17 = i25;
                                Paint paint2 = paint;
                                g(cVar2.f7698c, iArr, i33, i31, i32, paint2, canvas);
                                g(cVar2.f7699d, iArr, i33, i31, i32 + 1, paint2, canvas);
                            } else {
                                i15 = i28;
                                i16 = i26;
                                i17 = i25;
                            }
                            i30++;
                            fVar4 = fVar4;
                            dVar4 = dVar5;
                            hVar = hVar;
                            arrayList = arrayList;
                            bVar2 = bVar2;
                            i28 = i15;
                            i26 = i16;
                            i25 = i17;
                            i24 = i24;
                            i27 = i27;
                        } else {
                            d dVar6 = dVar4;
                            b bVar3 = bVar2;
                            ArrayList arrayList2 = arrayList;
                            h hVar2 = hVar;
                            int i34 = i28;
                            int i35 = i27;
                            int i36 = i26;
                            int i37 = i25;
                            f fVar5 = fVar4;
                            int i38 = i24;
                            boolean z10 = fVar5.f7706b;
                            int i39 = fVar5.f7707c;
                            if (z10) {
                                int i40 = fVar5.f7709e;
                                c10 = 3;
                                if (i40 == 3) {
                                    i14 = c0109a.f7689d[fVar5.f7711g];
                                    c11 = 2;
                                } else {
                                    c11 = 2;
                                    i14 = i40 == 2 ? c0109a.f7688c[fVar5.f7712h] : c0109a.f7687b[fVar5.f7713i];
                                }
                                Paint paint3 = this.f7680b;
                                paint3.setColor(i14);
                                i13 = i37;
                                i12 = i36;
                                canvas.drawRect(i13, i12, i13 + i39, i34, paint3);
                            } else {
                                i12 = i36;
                                i13 = i37;
                                c10 = 3;
                                c11 = 2;
                            }
                            p102i1.a.C0382a c0382a = new p102i1.a.C0382a();
                            c0382a.f36528b = Bitmap.createBitmap(this.f7685g, i13, i12, i39, i35);
                            float f10 = bVar3.f7690a;
                            c0382a.f36534h = i13 / f10;
                            c0382a.f36535i = 0;
                            float f11 = bVar3.f7691b;
                            c0382a.f36531e = i12 / f11;
                            c0382a.f36532f = 0;
                            c0382a.f36533g = 0;
                            c0382a.f36537l = i39 / f10;
                            c0382a.f36538m = i35 / f11;
                            arrayList2.add(c0382a.a());
                            canvas.drawColor(0, PorterDuff.Mode.CLEAR);
                            canvas.restore();
                            i24 = i38 + 1;
                            dVar4 = dVar6;
                            arrayList = arrayList2;
                            bVar2 = bVar3;
                            hVar = hVar2;
                        }
                    }
                } else {
                    cVar = new X1.c(-9223372036854775807L, -9223372036854775807L, arrayList);
                }
            }
        }
        fVar.a(cVar);
    }

    @Override // X1.l
    public final void reset() {
        h hVar = this.f7684f;
        hVar.f7718c.clear();
        hVar.f7719d.clear();
        hVar.f7720e.clear();
        hVar.f7721f.clear();
        hVar.f7722g.clear();
        hVar.f7723h = null;
        hVar.f7724i = null;
    }
}
