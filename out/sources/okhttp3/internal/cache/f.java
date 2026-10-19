package okhttp3.internal.cache;

import Ia.l;
import java.io.EOFException;
import java.io.IOException;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.i;
import p293xa.r;
import p318zb.C2839f;
import p318zb.F;
import p318zb.m;

/* JADX INFO: compiled from: FaultHidingSink.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class f extends m {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Lambda f45443c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f45444d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public f(F delegate, l<? super IOException, r> lVar) {
        super(delegate);
        i.e(delegate, "delegate");
        this.f45443c = (Lambda) lVar;
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [Ia.l, kotlin.jvm.internal.Lambda] */
    @Override // p318zb.m, p318zb.F, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        if (this.f45444d) {
            return;
        }
        try {
            super.close();
        } catch (IOException e10) {
            this.f45444d = true;
            this.f45443c.invoke(e10);
        }
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [Ia.l, kotlin.jvm.internal.Lambda] */
    @Override // p318zb.m, p318zb.F, java.io.Flushable
    public final void flush() {
        if (this.f45444d) {
            return;
        }
        try {
            super.flush();
        } catch (IOException e10) {
            this.f45444d = true;
            this.f45443c.invoke(e10);
        }
    }

    /* JADX WARN: Type inference failed for: r3v2, types: [Ia.l, kotlin.jvm.internal.Lambda] */
    @Override // p318zb.m, p318zb.F
    public final void t0(C2839f source, long j) throws EOFException {
        i.e(source, "source");
        if (this.f45444d) {
            source.skip(j);
            return;
        }
        try {
            super.t0(source, j);
        } catch (IOException e10) {
            this.f45444d = true;
            this.f45443c.invoke(e10);
        }
    }
}
