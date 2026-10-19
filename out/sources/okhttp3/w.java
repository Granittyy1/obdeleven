package okhttp3;

import java.io.IOException;
import okio.ByteString;
import p318zb.InterfaceC2840g;

/* JADX INFO: compiled from: RequestBody.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class w extends y {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ r f45674a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ByteString f45675b;

    public w(r rVar, ByteString byteString) {
        this.f45674a = rVar;
        this.f45675b = byteString;
    }

    @Override // okhttp3.y
    public final long contentLength() {
        return this.f45675b.e();
    }

    @Override // okhttp3.y
    public final r contentType() {
        return this.f45674a;
    }

    @Override // okhttp3.y
    public final void writeTo(InterfaceC2840g sink) throws IOException {
        kotlin.jvm.internal.i.e(sink, "sink");
        sink.z0(this.f45675b);
    }
}
