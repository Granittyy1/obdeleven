package okhttp3;

import java.io.IOException;
import p318zb.InterfaceC2840g;

/* JADX INFO: compiled from: RequestBody.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class x extends y {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ r f45676a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f45677b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ byte[] f45678c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f45679d;

    public x(r rVar, byte[] bArr, int i10, int i11) {
        this.f45676a = rVar;
        this.f45677b = i10;
        this.f45678c = bArr;
        this.f45679d = i11;
    }

    @Override // okhttp3.y
    public final long contentLength() {
        return this.f45677b;
    }

    @Override // okhttp3.y
    public final r contentType() {
        return this.f45676a;
    }

    @Override // okhttp3.y
    public final void writeTo(InterfaceC2840g sink) throws IOException {
        kotlin.jvm.internal.i.e(sink, "sink");
        sink.a(this.f45678c, this.f45679d, this.f45677b);
    }
}
