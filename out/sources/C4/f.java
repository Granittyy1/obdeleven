package C4;

import com.google.firebase.encoders.proto.Protobuf;
import java.io.IOException;

/* JADX INFO: compiled from: AutoProtoEncoderDoNotUseEncoder.java */
/* JADX INFO: loaded from: classes.dex */
public final class f implements L6.c<F4.c> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final f f2352a = new f();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final L6.b f2353b = new L6.b("logSource", b.h(a.i(Protobuf.class, new com.google.firebase.encoders.proto.a(1))));

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final L6.b f2354c = new L6.b("logEventDropped", b.h(a.i(Protobuf.class, new com.google.firebase.encoders.proto.a(2))));

    @Override // L6.a
    public final void a(Object obj, L6.d dVar) throws IOException {
        F4.c cVar = (F4.c) obj;
        L6.d dVar2 = dVar;
        dVar2.a(f2353b, cVar.f3246a);
        dVar2.a(f2354c, cVar.f3247b);
    }
}
