package p318zb;

import java.io.IOException;
import kotlin.jvm.internal.i;

/* JADX INFO: compiled from: ForwardingSource.kt */
/* JADX INFO: loaded from: classes2.dex */
public abstract class n implements H {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final H f49103b;

    public n(H delegate) {
        i.e(delegate, "delegate");
        this.f49103b = delegate;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.f49103b.close();
    }

    @Override // p318zb.H
    public long l0(C2839f sink, long j) throws IOException {
        i.e(sink, "sink");
        return this.f49103b.l0(sink, j);
    }

    @Override // p318zb.H
    public final I timeout() {
        return this.f49103b.timeout();
    }

    public final String toString() {
        return getClass().getSimpleName() + '(' + this.f49103b + ')';
    }
}
