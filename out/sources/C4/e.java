package C4;

import com.google.android.datatransport.runtime.firebase.transport.LogEventDropped;
import com.google.firebase.encoders.proto.Protobuf;
import java.io.IOException;

/* JADX INFO: compiled from: AutoProtoEncoderDoNotUseEncoder.java */
/* JADX INFO: loaded from: classes.dex */
public final class e implements L6.c<LogEventDropped> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final e f2349a = new e();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final L6.b f2350b = new L6.b("eventsDroppedCount", b.h(a.i(Protobuf.class, new com.google.firebase.encoders.proto.a(1))));

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final L6.b f2351c = new L6.b("reason", b.h(a.i(Protobuf.class, new com.google.firebase.encoders.proto.a(3))));

    @Override // L6.a
    public final void a(Object obj, L6.d dVar) throws IOException {
        LogEventDropped logEventDropped = (LogEventDropped) obj;
        L6.d dVar2 = dVar;
        dVar2.d(f2350b, logEventDropped.f25263a);
        dVar2.a(f2351c, logEventDropped.f25264b);
    }
}
