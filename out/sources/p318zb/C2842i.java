package p318zb;

import java.io.IOException;
import java.util.zip.Deflater;
import kotlin.jvm.internal.i;

/* JADX INFO: renamed from: zb.i, reason: case insensitive filesystem */
/* JADX INFO: compiled from: DeflaterSink.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class C2842i implements F {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final B f49084b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Deflater f49085c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f49086d;

    public C2842i(C2839f c2839f, Deflater deflater) {
        this.f49084b = v.a(c2839f);
        this.f49085c = deflater;
    }

    public final void b(boolean z10) throws IOException {
        D dI0;
        int iDeflate;
        B b10 = this.f49084b;
        C2839f c2839f = b10.f49034c;
        while (true) {
            dI0 = c2839f.I0(1);
            Deflater deflater = this.f49085c;
            byte[] bArr = dI0.f49041a;
            if (z10) {
                try {
                    int i10 = dI0.f49043c;
                    iDeflate = deflater.deflate(bArr, i10, 8192 - i10, 2);
                } catch (NullPointerException e10) {
                    throw new IOException("Deflater already closed", e10);
                }
            } else {
                int i11 = dI0.f49043c;
                iDeflate = deflater.deflate(bArr, i11, 8192 - i11);
            }
            if (iDeflate > 0) {
                dI0.f49043c += iDeflate;
                c2839f.f49074c += (long) iDeflate;
                b10.b();
            } else if (deflater.needsInput()) {
                break;
            }
        }
        if (dI0.f49042b == dI0.f49043c) {
            c2839f.f49073b = dI0.a();
            E.a(dI0);
        }
    }

    @Override // p318zb.F, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws Throwable {
        Deflater deflater = this.f49085c;
        if (this.f49086d) {
            return;
        }
        deflater.finish();
        b(false);
        th = null;
        try {
            deflater.end();
        } catch (Throwable th) {
            if (th == null) {
                th = th;
            }
        }
        try {
            this.f49084b.close();
        } catch (Throwable th2) {
            if (th == null) {
                th = th2;
            }
        }
        this.f49086d = true;
        if (th != null) {
            throw th;
        }
    }

    @Override // p318zb.F, java.io.Flushable
    public final void flush() throws IOException {
        b(true);
        this.f49084b.flush();
    }

    @Override // p318zb.F
    public final void t0(C2839f source, long j) throws IOException {
        i.e(source, "source");
        C2834a.b(source.f49074c, 0L, j);
        while (j > 0) {
            D d10 = source.f49073b;
            i.b(d10);
            int iMin = (int) Math.min(j, d10.f49043c - d10.f49042b);
            this.f49085c.setInput(d10.f49041a, d10.f49042b, iMin);
            b(false);
            long j10 = iMin;
            source.f49074c -= j10;
            int i10 = d10.f49042b + iMin;
            d10.f49042b = i10;
            if (i10 == d10.f49043c) {
                source.f49073b = d10.a();
                E.a(d10);
            }
            j -= j10;
        }
    }

    @Override // p318zb.F
    public final I timeout() {
        return this.f49084b.f49033b.timeout();
    }

    public final String toString() {
        return "DeflaterSink(" + this.f49084b + ')';
    }
}
