package C4;

import com.google.firebase.encoders.proto.Protobuf;
import java.io.IOException;

/* JADX INFO: compiled from: AutoProtoEncoderDoNotUseEncoder.java */
/* JADX INFO: loaded from: classes.dex */
public final class i implements L6.c<F4.e> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final i f2360a = new i();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final L6.b f2361b = new L6.b("startMs", b.h(a.i(Protobuf.class, new com.google.firebase.encoders.proto.a(1))));

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final L6.b f2362c = new L6.b("endMs", b.h(a.i(Protobuf.class, new com.google.firebase.encoders.proto.a(2))));

    @Override // L6.a
    public final void a(Object obj, L6.d dVar) throws IOException {
        F4.e eVar = (F4.e) obj;
        L6.d dVar2 = dVar;
        dVar2.d(f2361b, eVar.f3250a);
        dVar2.d(f2362c, eVar.f3251b);
    }
}
