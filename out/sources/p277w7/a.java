package p277w7;

import com.google.firebase.perf.util.h;
import com.google.firebase.perf.v1.NetworkRequestMetric;
import java.io.IOException;
import java.io.InputStream;
import p253u7.c;

/* JADX INFO: compiled from: InstrHttpInputStream.java */
/* JADX INFO: loaded from: classes3.dex */
public final class a extends InputStream {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final InputStream f47766b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final c f47767c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final h f47768d;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public long f47770f;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public long f47769e = -1;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public long f47771g = -1;

    public a(InputStream inputStream, c cVar, h hVar) {
        this.f47768d = hVar;
        this.f47766b = inputStream;
        this.f47767c = cVar;
        this.f47770f = ((NetworkRequestMetric) cVar.f47446e.f29047c).d0();
    }

    @Override // java.io.InputStream
    public final int available() throws IOException {
        try {
            return this.f47766b.available();
        } catch (IOException e10) {
            long jA = this.f47768d.a();
            c cVar = this.f47767c;
            cVar.k(jA);
            h.c(cVar);
            throw e10;
        }
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        c cVar = this.f47767c;
        h hVar = this.f47768d;
        long jA = hVar.a();
        if (this.f47771g == -1) {
            this.f47771g = jA;
        }
        try {
            this.f47766b.close();
            long j = this.f47769e;
            if (j != -1) {
                cVar.j(j);
            }
            long j10 = this.f47770f;
            if (j10 != -1) {
                NetworkRequestMetric.a aVar = cVar.f47446e;
                aVar.r();
                NetworkRequestMetric.O((NetworkRequestMetric) aVar.f29047c, j10);
            }
            cVar.k(this.f47771g);
            cVar.b();
        } catch (IOException e10) {
            O.a.h(hVar, cVar, cVar);
            throw e10;
        }
    }

    @Override // java.io.InputStream
    public final void mark(int i10) {
        this.f47766b.mark(i10);
    }

    @Override // java.io.InputStream
    public final boolean markSupported() {
        return this.f47766b.markSupported();
    }

    @Override // java.io.InputStream
    public final int read() throws IOException {
        h hVar = this.f47768d;
        c cVar = this.f47767c;
        try {
            int i10 = this.f47766b.read();
            long jA = hVar.a();
            if (this.f47770f == -1) {
                this.f47770f = jA;
            }
            if (i10 == -1 && this.f47771g == -1) {
                this.f47771g = jA;
                cVar.k(jA);
                cVar.b();
            } else {
                long j = this.f47769e + 1;
                this.f47769e = j;
                cVar.j(j);
            }
            return i10;
        } catch (IOException e10) {
            O.a.h(hVar, cVar, cVar);
            throw e10;
        }
    }

    @Override // java.io.InputStream
    public final void reset() throws IOException {
        try {
            this.f47766b.reset();
        } catch (IOException e10) {
            long jA = this.f47768d.a();
            c cVar = this.f47767c;
            cVar.k(jA);
            h.c(cVar);
            throw e10;
        }
    }

    @Override // java.io.InputStream
    public final long skip(long j) throws IOException {
        h hVar = this.f47768d;
        c cVar = this.f47767c;
        try {
            long jSkip = this.f47766b.skip(j);
            long jA = hVar.a();
            if (this.f47770f == -1) {
                this.f47770f = jA;
            }
            if (jSkip == -1 && this.f47771g == -1) {
                this.f47771g = jA;
                cVar.k(jA);
            } else {
                long j10 = this.f47769e + jSkip;
                this.f47769e = j10;
                cVar.j(j10);
            }
            return jSkip;
        } catch (IOException e10) {
            O.a.h(hVar, cVar, cVar);
            throw e10;
        }
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr, int i10, int i11) throws IOException {
        h hVar = this.f47768d;
        c cVar = this.f47767c;
        try {
            int i12 = this.f47766b.read(bArr, i10, i11);
            long jA = hVar.a();
            if (this.f47770f == -1) {
                this.f47770f = jA;
            }
            if (i12 == -1 && this.f47771g == -1) {
                this.f47771g = jA;
                cVar.k(jA);
                cVar.b();
            } else {
                long j = this.f47769e + ((long) i12);
                this.f47769e = j;
                cVar.j(j);
            }
            return i12;
        } catch (IOException e10) {
            O.a.h(hVar, cVar, cVar);
            throw e10;
        }
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr) throws IOException {
        h hVar = this.f47768d;
        c cVar = this.f47767c;
        try {
            int i10 = this.f47766b.read(bArr);
            long jA = hVar.a();
            if (this.f47770f == -1) {
                this.f47770f = jA;
            }
            if (i10 == -1 && this.f47771g == -1) {
                this.f47771g = jA;
                cVar.k(jA);
                cVar.b();
            } else {
                long j = this.f47769e + ((long) i10);
                this.f47769e = j;
                cVar.j(j);
            }
            return i10;
        } catch (IOException e10) {
            O.a.h(hVar, cVar, cVar);
            throw e10;
        }
    }
}
