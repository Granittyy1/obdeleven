package p318zb;

import java.io.IOException;
import kotlin.jvm.internal.i;
import p293xa.r;

/* JADX INFO: renamed from: zb.d, reason: case insensitive filesystem */
/* JADX INFO: compiled from: AsyncTimeout.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class C2837d implements H {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ G f49071b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ r f49072c;

    public C2837d(G g10, r rVar) {
        this.f49071b = g10;
        this.f49072c = rVar;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        r rVar = this.f49072c;
        G g10 = this.f49071b;
        g10.i();
        try {
            try {
                rVar.close();
                r rVar2 = r.f47939a;
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

    @Override // p318zb.H
    public final long l0(C2839f sink, long j) throws IOException {
        i.e(sink, "sink");
        r rVar = this.f49072c;
        G g10 = this.f49071b;
        g10.i();
        try {
            try {
                long jL0 = rVar.l0(sink, j);
                if (g10.j()) {
                    throw g10.l(null);
                }
                return jL0;
            } catch (IOException e10) {
                if (g10.j()) {
                    throw g10.l(e10);
                }
                throw e10;
            }
        } catch (Throwable th) {
            g10.j();
            throw th;
        }
    }

    @Override // p318zb.H
    public final I timeout() {
        return this.f49071b;
    }

    public final String toString() {
        return "AsyncTimeout.source(" + this.f49072c + ')';
    }
}
