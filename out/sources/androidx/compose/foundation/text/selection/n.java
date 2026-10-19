package androidx.compose.foundation.text.selection;

/* JADX INFO: compiled from: SelectionHandles.kt */
/* JADX INFO: loaded from: classes.dex */
public final class n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final float f11618a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final float f11619b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final androidx.compose.ui.semantics.v<m> f11620c = new androidx.compose.ui.semantics.v<>("SelectionHandleInfo");

    static {
        float f10 = 25;
        f11618a = f10;
        f11619b = f10;
    }

    public static final long a(long j) {
        float fIntBitsToFloat = Float.intBitsToFloat((int) (j >> 32));
        return (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (j & 4294967295L)) - 1.0f)) & 4294967295L) | (Float.floatToRawIntBits(fIntBitsToFloat) << 32);
    }
}
