package p091h2;

import A1.C0574i;
import p114j1.A;
import p114j1.r;
import p114j1.w;

/* JADX INFO: compiled from: PsDurationReader.java */
/* JADX INFO: loaded from: classes.dex */
public final class x {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f36107c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f36108d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f36109e;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final w f36105a = new w(0);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public long f36110f = -9223372036854775807L;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public long f36111g = -9223372036854775807L;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public long f36112h = -9223372036854775807L;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final r f36106b = new r();

    public static int b(int i10, byte[] bArr) {
        return (bArr[i10 + 3] & 255) | ((bArr[i10] & 255) << 24) | ((bArr[i10 + 1] & 255) << 16) | ((bArr[i10 + 2] & 255) << 8);
    }

    public static long c(r rVar) {
        int i10 = rVar.f41063b;
        if (rVar.a() < 9) {
            return -9223372036854775807L;
        }
        byte[] bArr = new byte[9];
        rVar.f(bArr, 0, 9);
        rVar.G(i10);
        byte b10 = bArr[0];
        if ((b10 & 196) == 68) {
            byte b11 = bArr[2];
            if ((b11 & 4) == 4) {
                byte b12 = bArr[4];
                if ((b12 & 4) == 4 && (bArr[5] & 1) == 1 && (bArr[8] & 3) == 3) {
                    long j = b10;
                    long j10 = b11;
                    return ((j10 & 3) << 13) | ((j & 3) << 28) | (((56 & j) >> 3) << 30) | ((((long) bArr[1]) & 255) << 20) | (((j10 & 248) >> 3) << 15) | ((((long) bArr[3]) & 255) << 5) | ((((long) b12) & 248) >> 3);
                }
            }
        }
        return -9223372036854775807L;
    }

    public final void a(C0574i c0574i) {
        byte[] bArr = A.f40998c;
        r rVar = this.f36106b;
        rVar.getClass();
        rVar.E(bArr.length, bArr);
        this.f36107c = true;
        c0574i.f525f = 0;
    }
}
