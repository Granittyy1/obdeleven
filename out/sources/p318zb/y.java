package p318zb;

import java.io.IOException;
import java.io.OutputStream;
import kotlin.jvm.internal.i;

/* JADX INFO: compiled from: JvmOkio.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class y implements F {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final OutputStream f49120b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final I f49121c;

    public y(OutputStream outputStream, I i10) {
        this.f49120b = outputStream;
        this.f49121c = i10;
    }

    @Override // p318zb.F, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        this.f49120b.close();
    }

    @Override // p318zb.F, java.io.Flushable
    public final void flush() throws IOException {
        this.f49120b.flush();
    }

    @Override // p318zb.F
    public final void t0(C2839f source, long j) throws IOException {
        i.e(source, "source");
        C2834a.b(source.f49074c, 0L, j);
        while (j > 0) {
            this.f49121c.f();
            D d10 = source.f49073b;
            i.b(d10);
            int iMin = (int) Math.min(j, d10.f49043c - d10.f49042b);
            this.f49120b.write(d10.f49041a, d10.f49042b, iMin);
            int i10 = d10.f49042b + iMin;
            d10.f49042b = i10;
            long j10 = iMin;
            j -= j10;
            source.f49074c -= j10;
            if (i10 == d10.f49043c) {
                source.f49073b = d10.a();
                E.a(d10);
            }
        }
    }

    @Override // p318zb.F
    public final I timeout() {
        return this.f49121c;
    }

    public final String toString() {
        return "sink(" + this.f49120b + ')';
    }
}
