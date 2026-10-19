package kotlin.random;

import java.io.Serializable;

/* JADX INFO: compiled from: XorWowRandom.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class XorWowRandom extends Random implements Serializable {
    private static final long serialVersionUID = 0;
    private int addend;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private int f43067v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private int f43068w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private int f43069x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private int f43070y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private int f43071z;

    public XorWowRandom(int i10, int i11) {
        int i12 = ~i10;
        this.f43069x = i10;
        this.f43070y = i11;
        this.f43071z = 0;
        this.f43068w = 0;
        this.f43067v = i12;
        this.addend = (i10 << 10) ^ (i11 >>> 4);
        if ((i10 | i11 | i12) == 0) {
            throw new IllegalArgumentException("Initial state must have at least one non-zero element.");
        }
        for (int i13 = 0; i13 < 64; i13++) {
            b();
        }
    }

    @Override // kotlin.random.Random
    public final int a(int i10) {
        return ((-i10) >> 31) & (b() >>> (32 - i10));
    }

    @Override // kotlin.random.Random
    public final int b() {
        int i10 = this.f43069x;
        int i11 = i10 ^ (i10 >>> 2);
        this.f43069x = this.f43070y;
        this.f43070y = this.f43071z;
        this.f43071z = this.f43068w;
        int i12 = this.f43067v;
        this.f43068w = i12;
        int i13 = ((i11 ^ (i11 << 1)) ^ i12) ^ (i12 << 4);
        this.f43067v = i13;
        int i14 = this.addend + 362437;
        this.addend = i14;
        return i13 + i14;
    }
}
