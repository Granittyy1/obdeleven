package coil.fetch;

import coil.decode.A;
import coil.decode.DataSource;
import coil.decode.y;
import java.nio.ByteBuffer;
import p318zb.C2839f;

/* JADX INFO: compiled from: ByteBufferFetcher.kt */
/* JADX INFO: loaded from: classes.dex */
public final class c implements h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ByteBuffer f22977a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final coil.request.k f22978b;

    /* JADX INFO: compiled from: ByteBufferFetcher.kt */
    public static final class a implements h.a<ByteBuffer> {
        @Override // coil.fetch.h.a
        public final h a(Object obj, coil.request.k kVar) {
            return new c((ByteBuffer) obj, kVar);
        }
    }

    public c(ByteBuffer byteBuffer, coil.request.k kVar) {
        this.f22977a = byteBuffer;
        this.f22978b = kVar;
    }

    @Override // coil.fetch.h
    public final Object a(kotlin.coroutines.c<? super g> cVar) {
        ByteBuffer byteBuffer = this.f22977a;
        try {
            C2839f c2839f = new C2839f();
            c2839f.write(byteBuffer);
            return new l(new A(c2839f, new y(0, this.f22978b.f23098a), null), null, DataSource.f22858c);
        } finally {
            byteBuffer.position(0);
        }
    }
}
