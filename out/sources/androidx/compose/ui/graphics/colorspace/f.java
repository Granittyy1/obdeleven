package androidx.compose.ui.graphics.colorspace;

/* JADX INFO: compiled from: ColorSpaces.kt */
/* JADX INFO: loaded from: classes.dex */
public final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final float[] f13567a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final float[] f13568b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final t f13569c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final t f13570d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final Rgb f13571e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final Rgb f13572f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final Rgb f13573g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final Rgb f13574h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final Rgb f13575i;
    public static final Rgb j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final Rgb f13576k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final Rgb f13577l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final Rgb f13578m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final Rgb f13579n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final Rgb f13580o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final Rgb f13581p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final Rgb f13582q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final Rgb f13583r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final v f13584s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final l f13585t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public static final Rgb f13586u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final Rgb f13587v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static final Rgb f13588w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public static final m f13589x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public static final c[] f13590y;

    static {
        float[] fArr = {0.64f, 0.33f, 0.3f, 0.6f, 0.15f, 0.06f};
        f13567a = fArr;
        float[] fArr2 = {0.67f, 0.33f, 0.21f, 0.71f, 0.14f, 0.08f};
        f13568b = fArr2;
        float[] fArr3 = {0.708f, 0.292f, 0.17f, 0.797f, 0.131f, 0.046f};
        t tVar = new t(2.4d, 0.9478672985781991d, 0.05213270142180095d, 0.07739938080495357d, 0.04045d);
        t tVar2 = new t(2.2d, 0.9478672985781991d, 0.05213270142180095d, 0.07739938080495357d, 0.04045d);
        t tVar3 = new t(-3.0d, 2.0d, 2.0d, 5.591816309728916d, 0.28466892d, 0.55991073d, -0.685490157d);
        f13569c = tVar3;
        t tVar4 = new t(-2.0d, -1.555223d, 1.860454d, 0.012683313515655966d, 18.8515625d, -18.6875d, 6.277394636015326d);
        f13570d = tVar4;
        u uVar = k.f13602d;
        Rgb rgb = new Rgb("sRGB IEC61966-2.1", fArr, uVar, tVar, 0);
        f13571e = rgb;
        Rgb rgb2 = new Rgb("sRGB IEC61966-2.1 (Linear)", fArr, uVar, 1.0d, 0.0f, 1.0f, 1);
        f13572f = rgb2;
        Rgb rgb3 = new Rgb("scRGB-nl IEC 61966-2-2:2003", fArr, uVar, null, new Q8.d(), new U1.f(), -0.799f, 2.399f, tVar, 2);
        f13573g = rgb3;
        Rgb rgb4 = new Rgb("scRGB IEC 61966-2-2:2003", fArr, uVar, 1.0d, -0.5f, 7.499f, 3);
        f13574h = rgb4;
        Rgb rgb5 = new Rgb("Rec. ITU-R BT.709-5", new float[]{0.64f, 0.33f, 0.3f, 0.6f, 0.15f, 0.06f}, uVar, new t(2.2222222222222223d, 0.9099181073703367d, 0.09008189262966333d, 0.2222222222222222d, 0.081d), 4);
        f13575i = rgb5;
        Rgb rgb6 = new Rgb("Rec. ITU-R BT.2020-1", new float[]{0.708f, 0.292f, 0.17f, 0.797f, 0.131f, 0.046f}, uVar, new t(2.2222222222222223d, 0.9096697898662786d, 0.09033021013372146d, 0.2222222222222222d, 0.08145d), 5);
        j = rgb6;
        Rgb rgb7 = new Rgb("SMPTE RP 431-2-2007 DCI (P3)", new float[]{0.68f, 0.32f, 0.265f, 0.69f, 0.15f, 0.06f}, new u(0.314f, 0.351f), 2.6d, 0.0f, 1.0f, 6);
        f13576k = rgb7;
        Rgb rgb8 = new Rgb("Display P3", new float[]{0.68f, 0.32f, 0.265f, 0.69f, 0.15f, 0.06f}, uVar, tVar, 7);
        f13577l = rgb8;
        Rgb rgb9 = new Rgb("NTSC (1953)", fArr2, k.f13599a, new t(2.2222222222222223d, 0.9099181073703367d, 0.09008189262966333d, 0.2222222222222222d, 0.081d), 8);
        f13578m = rgb9;
        Rgb rgb10 = new Rgb("SMPTE-C RGB", new float[]{0.63f, 0.34f, 0.31f, 0.595f, 0.155f, 0.07f}, uVar, new t(2.2222222222222223d, 0.9099181073703367d, 0.09008189262966333d, 0.2222222222222222d, 0.081d), 9);
        f13579n = rgb10;
        Rgb rgb11 = new Rgb("Adobe RGB (1998)", new float[]{0.64f, 0.33f, 0.21f, 0.71f, 0.15f, 0.06f}, uVar, 2.2d, 0.0f, 1.0f, 10);
        f13580o = rgb11;
        Rgb rgb12 = new Rgb("ROMM RGB ISO 22028-2:2013", new float[]{0.7347f, 0.2653f, 0.1596f, 0.8404f, 0.0366f, 1.0E-4f}, k.f13600b, new t(1.8d, 1.0d, 0.0d, 0.0625d, 0.031248d), 11);
        f13581p = rgb12;
        u uVar2 = k.f13601c;
        Rgb rgb13 = new Rgb("SMPTE ST 2065-1:2012 ACES", new float[]{0.7347f, 0.2653f, 0.0f, 1.0f, 1.0E-4f, -0.077f}, uVar2, 1.0d, -65504.0f, 65504.0f, 12);
        f13582q = rgb13;
        Rgb rgb14 = new Rgb("Academy S-2014-004 ACEScg", new float[]{0.713f, 0.293f, 0.165f, 0.83f, 0.128f, 0.044f}, uVar2, 1.0d, -65504.0f, 65504.0f, 13);
        f13583r = rgb14;
        v vVar = new v(14, b.f13560b, "Generic XYZ");
        f13584s = vVar;
        long j10 = b.f13561c;
        l lVar = new l(15, j10, "Generic L*a*b*");
        f13585t = lVar;
        Rgb rgb15 = new Rgb("None", fArr, uVar, tVar2, 16);
        f13586u = rgb15;
        Rgb rgb16 = new Rgb("Hybrid Log Gamma encoding", fArr3, uVar, null, new e(), new B6.a(), 0.0f, 1.0f, tVar3, 17);
        f13587v = rgb16;
        Rgb rgb17 = new Rgb("Perceptual Quantizer encoding", fArr3, uVar, null, new A8.f(4), new B6.b(1), 0.0f, 1.0f, tVar4, 18);
        f13588w = rgb17;
        m mVar = new m(19, j10, "Oklab");
        f13589x = mVar;
        f13590y = new c[]{rgb, rgb2, rgb3, rgb4, rgb5, rgb6, rgb7, rgb8, rgb9, rgb10, rgb11, rgb12, rgb13, rgb14, vVar, lVar, rgb15, rgb16, rgb17, mVar};
    }

    public static double a(t tVar, double d10) {
        double d11 = d10 < 0.0d ? -1.0d : 1.0d;
        double d12 = d10 * d11;
        double d13 = tVar.f13617b;
        double d14 = d13 * d12;
        return (tVar.f13622g + 1.0d) * d11 * (d14 <= 1.0d ? Math.pow(d14, tVar.f13618c) : Math.exp((d12 - tVar.f13621f) * tVar.f13619d) + tVar.f13620e);
    }

    public static double b(t tVar, double d10) {
        double d11 = d10 < 0.0d ? -1.0d : 1.0d;
        double d12 = 1.0d / tVar.f13617b;
        double d13 = 1.0d / tVar.f13618c;
        double d14 = 1.0d / tVar.f13619d;
        double d15 = (d10 * d11) / (tVar.f13622g + 1.0d);
        return d11 * (d15 <= 1.0d ? Math.pow(d15, d13) * d12 : (Math.log(d15 - tVar.f13620e) * d14) + tVar.f13621f);
    }

    public static double c(t tVar, double d10) {
        double d11 = d10 < 0.0d ? -1.0d : 1.0d;
        double d12 = d10 * d11;
        double d13 = tVar.f13617b;
        double d14 = tVar.f13619d;
        double dPow = (Math.pow(d12, d14) * tVar.f13618c) + d13;
        return Math.pow((dPow >= 0.0d ? dPow : 0.0d) / ((Math.pow(d12, d14) * tVar.f13621f) + tVar.f13620e), tVar.f13622g) * d11;
    }

    public static double d(t tVar, double d10) {
        double d11 = d10 < 0.0d ? -1.0d : 1.0d;
        double d12 = d10 * d11;
        double d13 = -tVar.f13617b;
        double d14 = 1.0d / tVar.f13622g;
        return Math.pow(Math.max((Math.pow(d12, d14) * tVar.f13620e) + d13, 0.0d) / ((Math.pow(d12, d14) * (-tVar.f13621f)) + tVar.f13618c), 1.0d / tVar.f13619d) * d11;
    }
}
