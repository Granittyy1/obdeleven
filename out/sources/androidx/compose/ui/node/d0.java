package androidx.compose.ui.node;

/* JADX INFO: compiled from: TouchBoundsExpansion.kt */
/* JADX INFO: loaded from: classes.dex */
@Ha.a
public final class d0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final long f14579a = a.b(0, 0, 0, 0);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int f14580b = 0;

    /* JADX INFO: compiled from: TouchBoundsExpansion.kt */
    public static final class a {
        public static final int a(int i10, long j) {
            int i11 = d0.f14580b;
            return ((int) (j >> (i10 * 15))) & 32767;
        }

        public static long b(int i10, int i11, int i12, int i13) {
            return (((long) (i11 & 32767)) << 15) | ((long) (i10 & 32767)) | (((long) (i12 & 32767)) << 30) | (((long) (i13 & 32767)) << 45) | Long.MIN_VALUE;
        }
    }
}
