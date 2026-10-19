package p318zb;

import java.io.EOFException;
import kotlin.jvm.internal.i;

/* JADX INFO: renamed from: zb.e, reason: case insensitive filesystem */
/* JADX INFO: compiled from: Okio.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class C2838e implements F {
    @Override // p318zb.F
    public final void t0(C2839f source, long j) throws EOFException {
        i.e(source, "source");
        source.skip(j);
    }

    @Override // p318zb.F
    public final I timeout() {
        return I.f49052d;
    }

    @Override // p318zb.F, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
    }

    @Override // p318zb.F, java.io.Flushable
    public final void flush() {
    }
}
