package Q7;

import A1.C0575j;

/* JADX INFO: compiled from: GenericGF.java */
/* JADX INFO: loaded from: classes3.dex */
public final class a {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final a f5114g;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int[] f5115a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int[] f5116b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final b f5117c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f5118d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f5119e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f5120f;

    static {
        new a(4201, 4096, 1);
        new a(1033, 1024, 1);
        new a(67, 64, 1);
        new a(19, 16, 1);
        f5114g = new a(285, 256, 0);
        new a(301, 256, 1);
    }

    public a(int i10, int i11, int i12) {
        this.f5119e = i10;
        this.f5118d = i11;
        this.f5120f = i12;
        this.f5115a = new int[i11];
        this.f5116b = new int[i11];
        int i13 = 1;
        for (int i14 = 0; i14 < i11; i14++) {
            this.f5115a[i14] = i13;
            i13 <<= 1;
            if (i13 >= i11) {
                i13 = (i13 ^ i10) & (i11 - 1);
            }
        }
        for (int i15 = 0; i15 < i11 - 1; i15++) {
            this.f5116b[this.f5115a[i15]] = i15;
        }
        this.f5117c = new b(this, new int[]{0});
    }

    public final int a(int i10, int i11) {
        if (i10 == 0 || i11 == 0) {
            return 0;
        }
        int[] iArr = this.f5116b;
        return this.f5115a[(iArr[i10] + iArr[i11]) % (this.f5118d - 1)];
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("GF(0x");
        sb2.append(Integer.toHexString(this.f5119e));
        sb2.append(',');
        return C0575j.b(sb2, this.f5118d, ')');
    }
}
