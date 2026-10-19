package A1;

/* JADX INFO: compiled from: MpegAudioUtil.java */
/* JADX INFO: loaded from: classes.dex */
public final class D {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final String[] f400a = {"audio/mpeg-L1", "audio/mpeg-L2", "audio/mpeg"};

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int[] f401b = {44100, 48000, 32000};

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int[] f402c = {32000, 64000, 96000, 128000, 160000, 192000, 224000, 256000, 288000, 320000, 352000, 384000, 416000, 448000};

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int[] f403d = {32000, 48000, 56000, 64000, 80000, 96000, 112000, 128000, 144000, 160000, 176000, 192000, 224000, 256000};

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final int[] f404e = {32000, 48000, 56000, 64000, 80000, 96000, 112000, 128000, 160000, 192000, 224000, 256000, 320000, 384000};

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final int[] f405f = {32000, 40000, 48000, 56000, 64000, 80000, 96000, 112000, 128000, 160000, 192000, 224000, 256000, 320000};

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final int[] f406g = {8000, 16000, 24000, 32000, 40000, 48000, 56000, 64000, 80000, 96000, 112000, 128000, 144000, 160000};

    /* JADX INFO: compiled from: MpegAudioUtil.java */
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f407a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public String f408b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f409c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public int f410d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public int f411e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public int f412f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public int f413g;

        public final boolean a(int i10) {
            int i11;
            int i12;
            int i13;
            int i14;
            if (!((i10 & (-2097152)) == -2097152) || (i11 = (i10 >>> 19) & 3) == 1 || (i12 = (i10 >>> 17) & 3) == 0 || (i13 = (i10 >>> 12) & 15) == 0 || i13 == 15 || (i14 = (i10 >>> 10) & 3) == 3) {
                return false;
            }
            this.f407a = i11;
            this.f408b = D.f400a[3 - i12];
            int i15 = D.f401b[i14];
            this.f410d = i15;
            if (i11 == 2) {
                this.f410d = i15 / 2;
            } else if (i11 == 0) {
                this.f410d = i15 / 4;
            }
            int i16 = (i10 >>> 9) & 1;
            int i17 = 1152;
            if (i12 != 1) {
                if (i12 != 2) {
                    if (i12 != 3) {
                        throw new IllegalArgumentException();
                    }
                    i17 = 384;
                }
            } else if (i11 != 3) {
                i17 = 576;
            }
            this.f413g = i17;
            if (i12 == 3) {
                int i18 = i11 == 3 ? D.f402c[i13 - 1] : D.f403d[i13 - 1];
                this.f412f = i18;
                this.f409c = (((i18 * 12) / this.f410d) + i16) * 4;
            } else {
                if (i11 == 3) {
                    int i19 = i12 == 2 ? D.f404e[i13 - 1] : D.f405f[i13 - 1];
                    this.f412f = i19;
                    this.f409c = ((i19 * 144) / this.f410d) + i16;
                } else {
                    int i20 = D.f406g[i13 - 1];
                    this.f412f = i20;
                    this.f409c = (((i12 == 1 ? 72 : 144) * i20) / this.f410d) + i16;
                }
            }
            this.f411e = ((i10 >> 6) & 3) == 3 ? 1 : 2;
            return true;
        }
    }

    public static int a(int i10) {
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        if (!((i10 & (-2097152)) == -2097152) || (i11 = (i10 >>> 19) & 3) == 1 || (i12 = (i10 >>> 17) & 3) == 0 || (i13 = (i10 >>> 12) & 15) == 0 || i13 == 15 || (i14 = (i10 >>> 10) & 3) == 3) {
            return -1;
        }
        int i16 = f401b[i14];
        if (i11 == 2) {
            i16 /= 2;
        } else if (i11 == 0) {
            i16 /= 4;
        }
        int i17 = (i10 >>> 9) & 1;
        if (i12 == 3) {
            return ((((i11 == 3 ? f402c[i13 - 1] : f403d[i13 - 1]) * 12) / i16) + i17) * 4;
        }
        if (i11 == 3) {
            i15 = i12 == 2 ? f404e[i13 - 1] : f405f[i13 - 1];
        } else {
            i15 = f406g[i13 - 1];
        }
        if (i11 == 3) {
            return A8.f.c(i15, 144, i16, i17);
        }
        return A8.f.c(i12 == 1 ? 72 : 144, i15, i16, i17);
    }
}
