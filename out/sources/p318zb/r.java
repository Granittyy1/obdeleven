package p318zb;

import com.google.gson.internal.b;
import java.io.IOException;
import java.io.InputStream;
import kotlin.jvm.internal.i;

/* JADX INFO: compiled from: JvmOkio.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class r implements H {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final InputStream f49114b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final I f49115c;

    public r(InputStream input, I timeout) {
        i.e(input, "input");
        i.e(timeout, "timeout");
        this.f49114b = input;
        this.f49115c = timeout;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        this.f49114b.close();
    }

    @Override // p318zb.H
    public final long l0(C2839f sink, long j) throws IOException {
        i.e(sink, "sink");
        if (j == 0) {
            return 0L;
        }
        if (j < 0) {
            throw new IllegalArgumentException(b.b(j, "byteCount < 0: ").toString());
        }
        try {
            this.f49115c.f();
            D dI0 = sink.I0(1);
            int i10 = this.f49114b.read(dI0.f49041a, dI0.f49043c, (int) Math.min(j, 8192 - dI0.f49043c));
            if (i10 != -1) {
                dI0.f49043c += i10;
                long j10 = i10;
                sink.f49074c += j10;
                return j10;
            }
            if (dI0.f49042b != dI0.f49043c) {
                return -1L;
            }
            sink.f49073b = dI0.a();
            E.a(dI0);
            return -1L;
        } catch (AssertionError e10) {
            if (v.c(e10)) {
                throw new IOException(e10);
            }
            throw e10;
        }
    }

    @Override // p318zb.H
    public final I timeout() {
        return this.f49115c;
    }

    public final String toString() {
        return "source(" + this.f49114b + ')';
    }
}
