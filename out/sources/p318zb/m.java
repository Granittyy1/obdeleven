package p318zb;

import java.io.IOException;
import kotlin.jvm.internal.i;

/* JADX INFO: compiled from: ForwardingSink.kt */
/* JADX INFO: loaded from: classes2.dex */
public abstract class m implements F {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final F f49102b;

    public m(F delegate) {
        i.e(delegate, "delegate");
        this.f49102b = delegate;
    }

    @Override // p318zb.F, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.f49102b.close();
    }

    @Override // p318zb.F, java.io.Flushable
    public void flush() throws IOException {
        this.f49102b.flush();
    }

    @Override // p318zb.F
    public void t0(C2839f source, long j) throws IOException {
        i.e(source, "source");
        this.f49102b.t0(source, j);
    }

    @Override // p318zb.F
    public final I timeout() {
        return this.f49102b.timeout();
    }

    public final String toString() {
        return getClass().getSimpleName() + '(' + this.f49102b + ')';
    }
}
