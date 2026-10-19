package p277w7;

import O.a;
import com.google.firebase.perf.util.h;
import com.google.firebase.perf.v1.NetworkRequestMetric;
import java.io.IOException;
import java.io.OutputStream;
import p253u7.c;

/* JADX INFO: compiled from: InstrHttpOutputStream.java */
/* JADX INFO: loaded from: classes3.dex */
public final class b extends OutputStream {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final OutputStream f47772b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final h f47773c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final c f47774d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public long f47775e = -1;

    public b(OutputStream outputStream, c cVar, h hVar) {
        this.f47772b = outputStream;
        this.f47774d = cVar;
        this.f47773c = hVar;
    }

    @Override // java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        long j = this.f47775e;
        c cVar = this.f47774d;
        if (j != -1) {
            cVar.f(j);
        }
        h hVar = this.f47773c;
        long jA = hVar.a();
        NetworkRequestMetric.a aVar = cVar.f47446e;
        aVar.r();
        NetworkRequestMetric.N((NetworkRequestMetric) aVar.f29047c, jA);
        try {
            this.f47772b.close();
        } catch (IOException e10) {
            a.h(hVar, cVar, cVar);
            throw e10;
        }
    }

    @Override // java.io.OutputStream, java.io.Flushable
    public final void flush() throws IOException {
        try {
            this.f47772b.flush();
        } catch (IOException e10) {
            long jA = this.f47773c.a();
            c cVar = this.f47774d;
            cVar.k(jA);
            h.c(cVar);
            throw e10;
        }
    }

    @Override // java.io.OutputStream
    public final void write(int i10) throws IOException {
        c cVar = this.f47774d;
        try {
            this.f47772b.write(i10);
            long j = this.f47775e + 1;
            this.f47775e = j;
            cVar.f(j);
        } catch (IOException e10) {
            a.h(this.f47773c, cVar, cVar);
            throw e10;
        }
    }

    @Override // java.io.OutputStream
    public final void write(byte[] bArr) throws IOException {
        c cVar = this.f47774d;
        try {
            this.f47772b.write(bArr);
            long length = this.f47775e + ((long) bArr.length);
            this.f47775e = length;
            cVar.f(length);
        } catch (IOException e10) {
            a.h(this.f47773c, cVar, cVar);
            throw e10;
        }
    }

    @Override // java.io.OutputStream
    public final void write(byte[] bArr, int i10, int i11) throws IOException {
        c cVar = this.f47774d;
        try {
            this.f47772b.write(bArr, i10, i11);
            long j = this.f47775e + ((long) i11);
            this.f47775e = j;
            cVar.f(j);
        } catch (IOException e10) {
            a.h(this.f47773c, cVar, cVar);
            throw e10;
        }
    }
}
