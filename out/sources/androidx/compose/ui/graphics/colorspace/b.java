package androidx.compose.ui.graphics.colorspace;

/* JADX INFO: compiled from: ColorModel.kt */
/* JADX INFO: loaded from: classes.dex */
@Ha.a
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final long f13559a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final long f13560b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final long f13561c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final long f13562d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ int f13563e = 0;

    static {
        long j = 3;
        long j10 = j << 32;
        f13559a = (((long) 0) & 4294967295L) | j10;
        f13560b = (((long) 1) & 4294967295L) | j10;
        f13561c = j10 | (((long) 2) & 4294967295L);
        f13562d = (j & 4294967295L) | (((long) 4) << 32);
    }

    public static final boolean a(long j, long j10) {
        return j == j10;
    }

    public static String b(long j) {
        if (a(j, f13559a)) {
            return "Rgb";
        }
        if (a(j, f13560b)) {
            return "Xyz";
        }
        if (a(j, f13561c)) {
            return "Lab";
        }
        return a(j, f13562d) ? "Cmyk" : "Unknown";
    }
}
