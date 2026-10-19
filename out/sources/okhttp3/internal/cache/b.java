package okhttp3.internal.cache;

import java.io.IOException;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.i;
import okhttp3.C2752c;
import p318zb.B;
import p318zb.C2839f;
import p318zb.H;
import p318zb.I;
import p318zb.InterfaceC2841h;

/* JADX INFO: compiled from: CacheInterceptor.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class b implements H {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f45433b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ InterfaceC2841h f45434c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ C2752c.d f45435d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ B f45436e;

    public b(InterfaceC2841h interfaceC2841h, C2752c.d dVar, B b10) {
        this.f45434c = interfaceC2841h;
        this.f45435d = dVar;
        this.f45436e = b10;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        if (!this.f45433b && !p172nb.b.h(this, TimeUnit.MILLISECONDS)) {
            this.f45433b = true;
            this.f45435d.a();
        }
        this.f45434c.close();
    }

    @Override // p318zb.H
    public final long l0(C2839f sink, long j) throws Throwable {
        i.e(sink, "sink");
        try {
            long jL0 = this.f45434c.l0(sink, j);
            B b10 = this.f45436e;
            if (jL0 == -1) {
                if (!this.f45433b) {
                    this.f45433b = true;
                    b10.close();
                }
                return -1L;
            }
            sink.i(b10.f49034c, sink.f49074c - jL0, jL0);
            b10.b();
            return jL0;
        } catch (IOException e10) {
            if (!this.f45433b) {
                this.f45433b = true;
                this.f45435d.a();
            }
            throw e10;
        }
    }

    @Override // p318zb.H
    public final I timeout() {
        return this.f45434c.timeout();
    }
}
