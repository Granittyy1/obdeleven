package I;

/* JADX INFO: compiled from: CornerRadius.kt */
/* JADX INFO: loaded from: classes.dex */
@Ha.a
public final class a {
    public static final boolean a(long j, long j10) {
        return j == j10;
    }

    public static String b(long j) {
        int i10 = (int) (j >> 32);
        int i11 = (int) (j & 4294967295L);
        if (Float.intBitsToFloat(i10) == Float.intBitsToFloat(i11)) {
            return "CornerRadius.circular(" + b.p(Float.intBitsToFloat(i10)) + ')';
        }
        return "CornerRadius.elliptical(" + b.p(Float.intBitsToFloat(i10)) + ", " + b.p(Float.intBitsToFloat(i11)) + ')';
    }
}
