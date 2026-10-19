package S1;

import A1.C0574i;
import java.io.IOException;

/* JADX INFO: compiled from: VarintReader.java */
/* JADX INFO: loaded from: classes.dex */
public final class d {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final long[] f5474d = {128, 64, 32, 16, 8, 4, 2, 1};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final byte[] f5475a = new byte[8];

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f5476b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f5477c;

    public static long a(byte[] bArr, int i10, boolean z10) {
        long j = ((long) bArr[0]) & 255;
        if (z10) {
            j &= ~f5474d[i10 - 1];
        }
        for (int i11 = 1; i11 < i10; i11++) {
            j = (j << 8) | (((long) bArr[i11]) & 255);
        }
        return j;
    }

    public static int b(int i10) {
        for (int i11 = 0; i11 < 8; i11++) {
            if ((f5474d[i11] & ((long) i10)) != 0) {
                return i11 + 1;
            }
        }
        return -1;
    }

    public final long c(C0574i c0574i, boolean z10, boolean z11, int i10) throws IOException {
        int i11 = this.f5476b;
        byte[] bArr = this.f5475a;
        if (i11 == 0) {
            if (!c0574i.a(bArr, 0, 1, z10)) {
                return -1L;
            }
            int iB = b(bArr[0] & 255);
            this.f5477c = iB;
            if (iB == -1) {
                throw new IllegalStateException("No valid varint length mask found");
            }
            this.f5476b = 1;
        }
        int i12 = this.f5477c;
        if (i12 > i10) {
            this.f5476b = 0;
            return -2L;
        }
        if (i12 != 1) {
            c0574i.a(bArr, 1, i12 - 1, false);
        }
        this.f5476b = 0;
        return a(bArr, this.f5477c, z11);
    }
}
