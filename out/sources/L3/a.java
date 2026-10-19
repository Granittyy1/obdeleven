package L3;

import B3.e;
import java.io.IOException;
import java.nio.ByteBuffer;

/* JADX INFO: compiled from: ByteBufferRewinder.java */
/* JADX INFO: loaded from: classes.dex */
public final class a implements e<ByteBuffer> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ByteBuffer f4465a;

    /* JADX INFO: renamed from: L3.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: ByteBufferRewinder.java */
    public static class C0065a implements e.a<ByteBuffer> {
        @Override // B3.e.a
        public final Class<ByteBuffer> a() {
            return ByteBuffer.class;
        }

        @Override // B3.e.a
        public final e<ByteBuffer> b(ByteBuffer byteBuffer) {
            return new a(byteBuffer);
        }
    }

    public a(ByteBuffer byteBuffer) {
        this.f4465a = byteBuffer;
    }

    @Override // B3.e
    public final ByteBuffer a() throws IOException {
        ByteBuffer byteBuffer = this.f4465a;
        byteBuffer.position(0);
        return byteBuffer;
    }

    @Override // B3.e
    public final void b() {
    }
}
