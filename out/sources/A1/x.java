package A1;

import java.util.Collections;

/* JADX INFO: compiled from: FlacStreamMetadata.java */
/* JADX INFO: loaded from: classes.dex */
public final class x {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f556a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f557b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f558c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f559d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f560e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f561f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f562g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final int f563h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final int f564i;
    public final long j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final a f565k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final p078g1.s f566l;

    /* JADX INFO: compiled from: FlacStreamMetadata.java */
    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final long[] f567a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final long[] f568b;

        public a(long[] jArr, long[] jArr2) {
            this.f567a = jArr;
            this.f568b = jArr2;
        }
    }

    public x(int i10, byte[] bArr) {
        p114j1.q qVar = new p114j1.q(bArr.length, bArr);
        qVar.m(i10 * 8);
        this.f556a = qVar.g(16);
        this.f557b = qVar.g(16);
        this.f558c = qVar.g(24);
        this.f559d = qVar.g(24);
        int iG = qVar.g(20);
        this.f560e = iG;
        this.f561f = d(iG);
        this.f562g = qVar.g(3) + 1;
        int iG2 = qVar.g(5) + 1;
        this.f563h = iG2;
        this.f564i = a(iG2);
        this.j = qVar.i(36);
        this.f565k = null;
        this.f566l = null;
    }

    public static int a(int i10) {
        if (i10 == 8) {
            return 1;
        }
        if (i10 == 12) {
            return 2;
        }
        if (i10 == 16) {
            return 4;
        }
        if (i10 == 20) {
            return 5;
        }
        if (i10 != 24) {
            return i10 != 32 ? -1 : 7;
        }
        return 6;
    }

    public static int d(int i10) {
        switch (i10) {
            case 8000:
                return 4;
            case 16000:
                return 5;
            case 22050:
                return 6;
            case 24000:
                return 7;
            case 32000:
                return 8;
            case 44100:
                return 9;
            case 48000:
                return 10;
            case 88200:
                return 1;
            case 96000:
                return 11;
            case 176400:
                return 2;
            case 192000:
                return 3;
            default:
                return -1;
        }
    }

    public final long b() {
        long j = this.j;
        if (j == 0) {
            return -9223372036854775807L;
        }
        return (j * 1000000) / ((long) this.f560e);
    }

    public final p078g1.n c(byte[] bArr, p078g1.s sVar) {
        bArr[4] = -128;
        int i10 = this.f559d;
        if (i10 <= 0) {
            i10 = -1;
        }
        p078g1.s sVar2 = this.f566l;
        if (sVar2 != null) {
            sVar = sVar2.b(sVar);
        }
        g1.n.a aVar = new g1.n.a();
        aVar.f35338m = p078g1.t.m("audio/flac");
        aVar.f35339n = i10;
        aVar.f35317C = this.f562g;
        aVar.f35318D = this.f560e;
        aVar.f35319E = p114j1.A.t(this.f563h);
        aVar.f35341p = Collections.singletonList(bArr);
        aVar.f35336k = sVar;
        return new p078g1.n(aVar);
    }

    public x(int i10, int i11, int i12, int i13, int i14, int i15, int i16, long j, a aVar, p078g1.s sVar) {
        this.f556a = i10;
        this.f557b = i11;
        this.f558c = i12;
        this.f559d = i13;
        this.f560e = i14;
        this.f561f = d(i14);
        this.f562g = i15;
        this.f563h = i16;
        this.f564i = a(i16);
        this.j = j;
        this.f565k = aVar;
        this.f566l = sVar;
    }
}
