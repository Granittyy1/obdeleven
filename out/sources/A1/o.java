package A1;

import java.util.Arrays;
import me.zhanghai.android.materialprogressbar.R;

/* JADX INFO: compiled from: DtsUtil.java */
/* JADX INFO: loaded from: classes.dex */
public final class o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final int[] f540a = {1, 2, 2, 2, 2, 3, 3, 4, 4, 5, 6, 6, 6, 7, 8, 8};

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int[] f541b = {-1, 8000, 16000, 32000, -1, -1, 11025, 22050, 44100, -1, -1, 12000, 24000, 48000, -1, -1};

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int[] f542c = {64, R.styleable.AppCompatTheme_toolbarNavigationButtonStyle, 128, 192, 224, 256, 384, 448, 512, 640, 768, 896, 1024, 1152, 1280, 1536, 1920, 2048, 2304, 2560, 2688, 2816, 2823, 2944, 3072, 3840, 4096, 6144, 7680};

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int[] f543d = {8000, 16000, 32000, 64000, 128000, 22050, 44100, 88200, 176400, 352800, 12000, 24000, 48000, 96000, 192000, 384000};

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final int[] f544e = {5, 8, 10, 12};

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final int[] f545f = {6, 9, 12, 15};

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final int[] f546g = {2, 4, 6, 8};

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final int[] f547h = {9, 11, 13, 16};

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final int[] f548i = {5, 8, 10, 12};

    /* JADX INFO: compiled from: DtsUtil.java */
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f549a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f550b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final int f551c;

        public a(String str, int i10, int i11, int i12, long j) {
            this.f549a = str;
            this.f551c = i10;
            this.f550b = i11;
        }
    }

    public static p114j1.q a(byte[] bArr) {
        byte b10 = bArr[0];
        if (b10 == 127 || b10 == 100 || b10 == 64 || b10 == 113) {
            return new p114j1.q(bArr.length, bArr);
        }
        byte[] bArrCopyOf = Arrays.copyOf(bArr, bArr.length);
        byte b11 = bArrCopyOf[0];
        if (b11 == -2 || b11 == -1 || b11 == 37 || b11 == -14 || b11 == -24) {
            for (int i10 = 0; i10 < bArrCopyOf.length - 1; i10 += 2) {
                byte b12 = bArrCopyOf[i10];
                int i11 = i10 + 1;
                bArrCopyOf[i10] = bArrCopyOf[i11];
                bArrCopyOf[i11] = b12;
            }
        }
        p114j1.q qVar = new p114j1.q(bArrCopyOf.length, bArrCopyOf);
        if (bArrCopyOf[0] == 31) {
            p114j1.q qVar2 = new p114j1.q(bArrCopyOf.length, bArrCopyOf);
            while (qVar2.b() >= 16) {
                qVar2.o(2);
                int iG = qVar2.g(14) & 16383;
                int iMin = Math.min(8 - qVar.f41057c, 14);
                int i12 = qVar.f41057c;
                int i13 = (8 - i12) - iMin;
                byte[] bArr2 = qVar.f41055a;
                int i14 = qVar.f41056b;
                byte b13 = (byte) (((65280 >> i12) | ((1 << i13) - 1)) & bArr2[i14]);
                bArr2[i14] = b13;
                int i15 = 14 - iMin;
                bArr2[i14] = (byte) (b13 | ((iG >>> i15) << i13));
                int i16 = i14 + 1;
                while (i15 > 8) {
                    qVar.f41055a[i16] = (byte) (iG >>> (i15 - 8));
                    i15 -= 8;
                    i16++;
                }
                int i17 = 8 - i15;
                byte[] bArr3 = qVar.f41055a;
                byte b14 = (byte) (bArr3[i16] & ((1 << i17) - 1));
                bArr3[i16] = b14;
                bArr3[i16] = (byte) (((iG & ((1 << i15) - 1)) << i17) | b14);
                qVar.o(14);
                qVar.a();
            }
        }
        qVar.k(bArrCopyOf.length, bArrCopyOf);
        return qVar;
    }

    public static int b(p114j1.q qVar, int[] iArr) {
        int i10 = 0;
        for (int i11 = 0; i11 < 3 && qVar.f(); i11++) {
            i10++;
        }
        int i12 = 0;
        for (int i13 = 0; i13 < i10; i13++) {
            i12 += 1 << iArr[i13];
        }
        return qVar.g(iArr[i10]) + i12;
    }
}
