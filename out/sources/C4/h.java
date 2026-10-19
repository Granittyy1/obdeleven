package C4;

import com.google.firebase.encoders.proto.Protobuf;
import java.io.IOException;

/* JADX INFO: compiled from: AutoProtoEncoderDoNotUseEncoder.java */
/* JADX INFO: loaded from: classes.dex */
public final class h implements L6.c<F4.d> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final h f2357a = new h();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final L6.b f2358b = new L6.b("currentCacheSizeBytes", b.h(a.i(Protobuf.class, new com.google.firebase.encoders.proto.a(1))));

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final L6.b f2359c = new L6.b("maxCacheSizeBytes", b.h(a.i(Protobuf.class, new com.google.firebase.encoders.proto.a(2))));

    @Override // L6.a
    public final void a(Object obj, L6.d dVar) throws IOException {
        F4.d dVar2 = (F4.d) obj;
        L6.d dVar3 = dVar;
        dVar3.d(f2358b, dVar2.f3248a);
        dVar3.d(f2359c, dVar2.f3249b);
    }
}
