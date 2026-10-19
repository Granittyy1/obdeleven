package C4;

import com.google.firebase.encoders.proto.Protobuf;
import java.io.IOException;

/* JADX INFO: compiled from: AutoProtoEncoderDoNotUseEncoder.java */
/* JADX INFO: loaded from: classes.dex */
public final class c implements L6.c<F4.a> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final c f2342a = new c();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final L6.b f2343b = new L6.b("window", b.h(a.i(Protobuf.class, new com.google.firebase.encoders.proto.a(1))));

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final L6.b f2344c = new L6.b("logSourceMetrics", b.h(a.i(Protobuf.class, new com.google.firebase.encoders.proto.a(2))));

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final L6.b f2345d = new L6.b("globalMetrics", b.h(a.i(Protobuf.class, new com.google.firebase.encoders.proto.a(3))));

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final L6.b f2346e = new L6.b("appNamespace", b.h(a.i(Protobuf.class, new com.google.firebase.encoders.proto.a(4))));

    @Override // L6.a
    public final void a(Object obj, L6.d dVar) throws IOException {
        F4.a aVar = (F4.a) obj;
        L6.d dVar2 = dVar;
        dVar2.a(f2343b, aVar.f3236a);
        dVar2.a(f2344c, aVar.f3237b);
        dVar2.a(f2345d, aVar.f3238c);
        dVar2.a(f2346e, aVar.f3239d);
    }
}
