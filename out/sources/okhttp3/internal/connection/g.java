package okhttp3.internal.connection;

import p318zb.B;
import p318zb.C;

/* JADX INFO: compiled from: RealConnection.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class g extends xb.d.c {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ c f45515d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(C c10, B b10, c cVar) {
        super(c10, b10);
        this.f45515d = cVar;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.f45515d.a(true, true, null);
    }
}
