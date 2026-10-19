package p318zb;

import java.io.Closeable;
import java.io.Flushable;
import java.io.IOException;

/* JADX INFO: compiled from: Sink.kt */
/* JADX INFO: loaded from: classes2.dex */
public interface F extends Closeable, Flushable {
    @Override // java.io.Closeable, java.lang.AutoCloseable
    void close() throws IOException;

    void flush() throws IOException;

    void t0(C2839f c2839f, long j) throws IOException;

    I timeout();
}
