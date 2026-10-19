package p294xb;

import java.io.Closeable;
import java.util.zip.Deflater;
import p318zb.C2839f;
import p318zb.C2842i;

/* JADX INFO: compiled from: MessageDeflater.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class a implements Closeable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f47940b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final C2839f f47941c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Deflater f47942d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final C2842i f47943e;

    public a(boolean z10) {
        this.f47940b = z10;
        C2839f c2839f = new C2839f();
        this.f47941c = c2839f;
        Deflater deflater = new Deflater(-1, true);
        this.f47942d = deflater;
        this.f47943e = new C2842i(c2839f, deflater);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws Throwable {
        this.f47943e.close();
    }
}
