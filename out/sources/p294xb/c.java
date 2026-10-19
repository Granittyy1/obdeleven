package p294xb;

import java.io.Closeable;
import java.io.IOException;
import java.util.zip.Inflater;
import p318zb.C2839f;
import p318zb.q;
import p318zb.v;

/* JADX INFO: compiled from: MessageInflater.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class c implements Closeable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f47945b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final C2839f f47946c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Inflater f47947d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final q f47948e;

    public c(boolean z10) {
        this.f47945b = z10;
        C2839f c2839f = new C2839f();
        this.f47946c = c2839f;
        Inflater inflater = new Inflater(true);
        this.f47947d = inflater;
        this.f47948e = new q(v.b(c2839f), inflater);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        this.f47948e.close();
    }
}
