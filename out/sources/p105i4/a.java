package p105i4;

/* JADX INFO: compiled from: MTensor.kt */
/* JADX INFO: loaded from: classes.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int[] f36723a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f36724b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public float[] f36725c;

    /* JADX INFO: renamed from: i4.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: MTensor.kt */
    public static final class C0385a {
        public static final int a(int[] iArr) {
            if (iArr.length == 0) {
                throw new UnsupportedOperationException("Empty array can't be reduced.");
            }
            int i10 = iArr[0];
            int i11 = 1;
            int length = iArr.length - 1;
            if (1 <= length) {
                while (true) {
                    i10 *= iArr[i11];
                    if (i11 == length) {
                        break;
                    }
                    i11++;
                }
            }
            return i10;
        }
    }

    public a(int[] iArr) {
        this.f36723a = iArr;
        int iA = C0385a.a(iArr);
        this.f36724b = iA;
        this.f36725c = new float[iA];
    }
}
