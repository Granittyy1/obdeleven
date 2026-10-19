package androidx.compose.ui.graphics;

import p114j1.C2479a;

/* JADX INFO: compiled from: TransformOrigin.kt */
/* JADX INFO: loaded from: classes.dex */
@Ha.a
public final class q0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final long f13791b = C2479a.b(0.5f, 0.5f);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ int f13792c = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f13793a;

    public static final boolean a(long j, long j10) {
        return j == j10;
    }

    public static final float b(long j) {
        return Float.intBitsToFloat((int) (j >> 32));
    }

    public static final float c(long j) {
        return Float.intBitsToFloat((int) (j & 4294967295L));
    }

    public static String d(long j) {
        return "TransformOrigin(packedValue=" + j + ')';
    }

    public final boolean equals(Object obj) {
        if (obj instanceof q0) {
            return this.f13793a == ((q0) obj).f13793a;
        }
        return false;
    }

    public final int hashCode() {
        return Long.hashCode(this.f13793a);
    }

    public final String toString() {
        return d(this.f13793a);
    }
}
