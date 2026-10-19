package p318zb;

import java.io.IOException;
import kotlin.jvm.internal.i;
import p293xa.r;

/* JADX INFO: renamed from: zb.c, reason: case insensitive filesystem */
/* JADX INFO: compiled from: AsyncTimeout.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class C2836c implements F {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ G f49069b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ y f49070c;

    public C2836c(G g10, y yVar) {
        this.f49069b = g10;
        this.f49070c = yVar;
    }

    @Override // p318zb.F, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        y yVar = this.f49070c;
        G g10 = this.f49069b;
        g10.i();
        try {
            try {
                yVar.close();
                r rVar = r.f47939a;
                if (g10.j()) {
                    throw g10.l(null);
                }
            } catch (IOException e10) {
                if (!g10.j()) {
                    throw e10;
                }
                throw g10.l(e10);
            }
        } catch (Throwable th) {
            g10.j();
            throw th;
        }
    }

    @Override // p318zb.F, java.io.Flushable
    public final void flush() throws IOException {
        y yVar = this.f49070c;
        G g10 = this.f49069b;
        g10.i();
        try {
            try {
                yVar.flush();
                r rVar = r.f47939a;
                if (g10.j()) {
                    throw g10.l(null);
                }
            } catch (IOException e10) {
                if (!g10.j()) {
                    throw e10;
                }
                throw g10.l(e10);
            }
        } catch (Throwable th) {
            g10.j();
            throw th;
        }
    }

    @Override // p318zb.F
    public final void t0(C2839f source, long j) throws IOException {
        i.e(source, "source");
        C2834a.b(source.f49074c, 0L, j);
        while (true) {
            long j10 = 0;
            if (j <= 0) {
                return;
            }
            D d10 = source.f49073b;
            i.b(d10);
            while (j10 < 65536) {
                j10 += (long) (d10.f49043c - d10.f49042b);
                if (j10 >= j) {
                    j10 = j;
                    break;
                } else {
                    d10 = d10.f49046f;
                    i.b(d10);
                }
            }
            y yVar = this.f49070c;
            G g10 = this.f49069b;
            g10.i();
            try {
                try {
                    yVar.t0(source, j10);
                    r rVar = r.f47939a;
                    if (g10.j()) {
                        throw g10.l(null);
                    }
                    j -= j10;
                } catch (IOException e10) {
                    if (!g10.j()) {
                        throw e10;
                    }
                    throw g10.l(e10);
                }
            } catch (Throwable th) {
                g10.j();
                throw th;
            }
        }
    }

    @Override // p318zb.F
    public final I timeout() {
        return this.f49069b;
    }

    public final String toString() {
        return "AsyncTimeout.sink(" + this.f49070c + ')';
    }
}
