package A1;

import java.io.IOException;

/* JADX INFO: compiled from: TrueHdSampleRechunker.java */
/* JADX INFO: loaded from: classes.dex */
public final class L {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final byte[] f433a = new byte[10];

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f434b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f435c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public long f436d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f437e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f438f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f439g;

    public final void a(K k10, K.a aVar) {
        if (this.f435c > 0) {
            k10.b(this.f436d, this.f437e, this.f438f, this.f439g, aVar);
            this.f435c = 0;
        }
    }

    public final void b(K k10, long j, int i10, int i11, int i12, K.a aVar) {
        p241t7.b.i("TrueHD chunk samples must be contiguous in the sample queue.", this.f439g <= i11 + i12);
        if (this.f434b) {
            int i13 = this.f435c;
            int i14 = i13 + 1;
            this.f435c = i14;
            if (i13 == 0) {
                this.f436d = j;
                this.f437e = i10;
                this.f438f = 0;
            }
            this.f438f += i11;
            this.f439g = i12;
            if (i14 >= 16) {
                a(k10, aVar);
            }
        }
    }

    public final void c(q qVar) throws IOException {
        if (this.f434b) {
            return;
        }
        byte[] bArr = this.f433a;
        int i10 = 0;
        qVar.j(bArr, 0, 10);
        qVar.h();
        if (bArr[4] == -8 && bArr[5] == 114 && bArr[6] == 111) {
            byte b10 = bArr[7];
            if ((b10 & 254) == 186) {
                i10 = 40 << ((bArr[(b10 & 255) == 187 ? '\t' : '\b'] >> 4) & 7);
            }
        }
        if (i10 == 0) {
            return;
        }
        this.f434b = true;
    }
}
