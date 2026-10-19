package D9;

import io.grpc.internal.C2241q0;
import io.grpc.internal.y0;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.zip.GZIPInputStream;
import java.util.zip.GZIPOutputStream;

/* JADX INFO: compiled from: Codec.java */
/* JADX INFO: loaded from: classes3.dex */
public interface e extends f, k {

    /* JADX INFO: compiled from: Codec.java */
    public static final class a implements e {
        @Override // D9.f, D9.k
        public final String a() {
            return "gzip";
        }

        @Override // D9.f
        public final OutputStream b(C2241q0.a aVar) throws IOException {
            return new GZIPOutputStream(aVar);
        }

        @Override // D9.k
        public final InputStream c(y0.a aVar) throws IOException {
            return new GZIPInputStream(aVar);
        }
    }

    /* JADX INFO: compiled from: Codec.java */
    public static final class b implements e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final b f2879a = new b();

        @Override // D9.f, D9.k
        public final String a() {
            return "identity";
        }

        @Override // D9.f
        public final OutputStream b(C2241q0.a aVar) {
            return aVar;
        }

        @Override // D9.k
        public final InputStream c(y0.a aVar) {
            return aVar;
        }
    }
}
