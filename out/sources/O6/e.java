package O6;

import com.google.firebase.encoders.EncodingException;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.HashMap;

/* JADX INFO: compiled from: ProtobufEncoder.java */
/* JADX INFO: loaded from: classes3.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final HashMap f4863a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final HashMap f4864b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final d f4865c;

    /* JADX INFO: compiled from: ProtobufEncoder.java */
    public static final class a implements M6.a<a> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final d f4866a = new d();
    }

    public e(HashMap map, HashMap map2, d dVar) {
        this.f4863a = map;
        this.f4864b = map2;
        this.f4865c = dVar;
    }

    public final void a(Object obj, ByteArrayOutputStream byteArrayOutputStream) throws IOException {
        HashMap map = this.f4864b;
        HashMap map2 = this.f4863a;
        com.google.firebase.encoders.proto.b bVar = new com.google.firebase.encoders.proto.b(byteArrayOutputStream, map2, map, this.f4865c);
        if (obj == null) {
            return;
        }
        L6.c cVar = (L6.c) map2.get(obj.getClass());
        if (cVar != null) {
            cVar.a(obj, bVar);
        } else {
            throw new EncodingException("No encoder for " + obj.getClass());
        }
    }
}
