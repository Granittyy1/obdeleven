package C4;

import com.google.firebase.encoders.proto.Protobuf;
import java.io.IOException;

/* JADX INFO: compiled from: AutoProtoEncoderDoNotUseEncoder.java */
/* JADX INFO: loaded from: classes.dex */
public final class d implements L6.c<F4.b> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final d f2347a = new d();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final L6.b f2348b = new L6.b("storageMetrics", b.h(a.i(Protobuf.class, new com.google.firebase.encoders.proto.a(1))));

    @Override // L6.a
    public final void a(Object obj, L6.d dVar) throws IOException {
        dVar.a(f2348b, ((F4.b) obj).f3244a);
    }
}
