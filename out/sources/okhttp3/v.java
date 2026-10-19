package okhttp3;

import java.io.File;
import java.io.IOException;
import p318zb.InterfaceC2840g;

/* JADX INFO: compiled from: RequestBody.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class v extends y {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ r f45672a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ File f45673b;

    public v(r rVar, File file) {
        this.f45672a = rVar;
        this.f45673b = file;
    }

    @Override // okhttp3.y
    public final long contentLength() {
        return this.f45673b.length();
    }

    @Override // okhttp3.y
    public final r contentType() {
        return this.f45672a;
    }

    @Override // okhttp3.y
    public final void writeTo(InterfaceC2840g sink) throws IOException {
        kotlin.jvm.internal.i.e(sink, "sink");
        p318zb.r rVarF = p318zb.v.f(this.f45673b);
        try {
            sink.k0(rVarF);
            p241t7.b.n(rVarF, null);
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                p241t7.b.n(rVarF, th);
                throw th2;
            }
        }
    }
}
