package androidx.compose.runtime.snapshots;

/* JADX INFO: compiled from: SnapshotDoubleIndexHeap.kt */
/* JADX INFO: loaded from: classes.dex */
public final class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f13209a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public long[] f13210b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int[] f13211c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int[] f13212d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f13213e;

    public final int a(long j) {
        int i10 = this.f13209a + 1;
        long[] jArr = this.f13210b;
        int length = jArr.length;
        if (i10 > length) {
            int i11 = length * 2;
            long[] jArr2 = new long[i11];
            int[] iArr = new int[i11];
            Q3.d.p(jArr, jArr2, 0, 0, jArr.length);
            Q3.d.q(0, 0, 14, this.f13211c, iArr);
            this.f13210b = jArr2;
            this.f13211c = iArr;
        }
        int i12 = this.f13209a;
        this.f13209a = i12 + 1;
        int length2 = this.f13212d.length;
        if (this.f13213e >= length2) {
            int i13 = length2 * 2;
            int[] iArr2 = new int[i13];
            int i14 = 0;
            while (i14 < i13) {
                int i15 = i14 + 1;
                iArr2[i14] = i15;
                i14 = i15;
            }
            Q3.d.q(0, 0, 14, this.f13212d, iArr2);
            this.f13212d = iArr2;
        }
        int i16 = this.f13213e;
        int[] iArr3 = this.f13212d;
        this.f13213e = iArr3[i16];
        long[] jArr3 = this.f13210b;
        jArr3[i12] = j;
        this.f13211c[i12] = i16;
        iArr3[i16] = i12;
        while (i12 > 0) {
            int i17 = ((i12 + 1) >> 1) - 1;
            if (jArr3[i17] <= j) {
                break;
            }
            b(i17, i12);
            i12 = i17;
        }
        return i16;
    }

    public final void b(int i10, int i11) {
        long[] jArr = this.f13210b;
        int[] iArr = this.f13211c;
        int[] iArr2 = this.f13212d;
        long j = jArr[i10];
        jArr[i10] = jArr[i11];
        jArr[i11] = j;
        int i12 = iArr[i10];
        int i13 = iArr[i11];
        iArr[i10] = i13;
        iArr[i11] = i12;
        iArr2[i13] = i10;
        iArr2[i12] = i11;
    }
}
