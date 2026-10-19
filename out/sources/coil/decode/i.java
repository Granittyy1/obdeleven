package coil.decode;

import io.intercom.android.sdk.metrics.MetricTracker;
import java.io.Closeable;
import p318zb.C;
import p318zb.InterfaceC2841h;

/* JADX INFO: compiled from: ImageSource.kt */
/* JADX INFO: loaded from: classes.dex */
public final class i extends x {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final p318zb.z f22882b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final p318zb.l f22883c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f22884d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Closeable f22885e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f22886f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public C f22887g;

    public i(p318zb.z zVar, p318zb.l lVar, String str, Closeable closeable) {
        this.f22882b = zVar;
        this.f22883c = lVar;
        this.f22884d = str;
        this.f22885e = closeable;
    }

    @Override // coil.decode.x
    public final synchronized p318zb.z b() {
        if (this.f22886f) {
            throw new IllegalStateException(MetricTracker.Action.CLOSED);
        }
        return this.f22882b;
    }

    @Override // coil.decode.x
    public final p318zb.z c() {
        return b();
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final synchronized void close() {
        try {
            this.f22886f = true;
            C c10 = this.f22887g;
            if (c10 != null) {
                coil.util.k.a(c10);
            }
            Closeable closeable = this.f22885e;
            if (closeable != null) {
                coil.util.k.a(closeable);
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // coil.decode.x
    public final x.a h() {
        return null;
    }

    @Override // coil.decode.x
    public final synchronized InterfaceC2841h i() {
        if (this.f22886f) {
            throw new IllegalStateException(MetricTracker.Action.CLOSED);
        }
        C c10 = this.f22887g;
        if (c10 != null) {
            return c10;
        }
        C cB = p318zb.v.b(this.f22883c.i(this.f22882b));
        this.f22887g = cB;
        return cB;
    }
}
