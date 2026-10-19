package p235t1;

import A1.K;
import android.net.Uri;
import androidx.media3.exoplayer.source.k;
import java.io.IOException;
import java.util.List;
import java.util.Map;
import p114j1.r;
import p140l1.d;
import p140l1.e;
import p140l1.l;
import p241t7.b;

/* JADX INFO: compiled from: IcyDataSource.java */
/* JADX INFO: loaded from: classes.dex */
public final class i implements d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final d f47018a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f47019b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final k.b f47020c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final byte[] f47021d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f47022e;

    public i(d dVar, int i10, k.b bVar) {
        b.e(i10 > 0);
        this.f47018a = dVar;
        this.f47019b = i10;
        this.f47020c = bVar;
        this.f47021d = new byte[1];
        this.f47022e = i10;
    }

    @Override // p140l1.d
    public final void b(l lVar) {
        lVar.getClass();
        this.f47018a.b(lVar);
    }

    @Override // p140l1.d
    public final void close() {
        throw new UnsupportedOperationException();
    }

    @Override // p140l1.d
    public final long f(e eVar) {
        throw new UnsupportedOperationException();
    }

    @Override // p140l1.d
    public final Map<String, List<String>> g() {
        return this.f47018a.g();
    }

    @Override // p140l1.d
    public final Uri getUri() {
        return this.f47018a.getUri();
    }

    @Override // p078g1.i
    public final int read(byte[] bArr, int i10, int i11) throws IOException {
        long jMax;
        int i12 = this.f47022e;
        d dVar = this.f47018a;
        if (i12 == 0) {
            byte[] bArr2 = this.f47021d;
            int i13 = 0;
            if (dVar.read(bArr2, 0, 1) != -1) {
                int i14 = (bArr2[0] & 255) << 4;
                if (i14 != 0) {
                    byte[] bArr3 = new byte[i14];
                    int i15 = i14;
                    while (i15 > 0) {
                        int i16 = dVar.read(bArr3, i13, i15);
                        if (i16 != -1) {
                            i13 += i16;
                            i15 -= i16;
                        }
                    }
                    while (i14 > 0 && bArr3[i14 - 1] == 0) {
                        i14--;
                    }
                    if (i14 > 0) {
                        r rVar = new r(i14, bArr3);
                        k.b bVar = this.f47020c;
                        if (bVar.f18772m) {
                            Map<String, String> map = k.f18718Q;
                            jMax = Math.max(k.this.w(true), bVar.j);
                        } else {
                            jMax = bVar.j;
                        }
                        long j = jMax;
                        int iA = rVar.a();
                        K k10 = bVar.f18771l;
                        k10.getClass();
                        k10.a(iA, rVar);
                        k10.b(j, 1, iA, 0, null);
                        bVar.f18772m = true;
                    }
                }
                this.f47022e = this.f47019b;
            }
            return -1;
        }
        int i17 = dVar.read(bArr, i10, Math.min(this.f47022e, i11));
        if (i17 != -1) {
            this.f47022e -= i17;
        }
        return i17;
    }
}
