package androidx.media3.exoplayer.mediacodec;

import android.media.MediaCodec;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.os.Bundle;
import android.os.Handler;
import android.view.Surface;
import java.io.IOException;
import java.nio.ByteBuffer;
import p078g1.n;
import p212r1.l;

/* JADX INFO: compiled from: MediaCodecAdapter.java */
/* JADX INFO: loaded from: classes.dex */
public interface c {

    /* JADX INFO: compiled from: MediaCodecAdapter.java */
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final d f18569a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final MediaFormat f18570b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final n f18571c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final Surface f18572d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final MediaCrypto f18573e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final l f18574f;

        public a(d dVar, MediaFormat mediaFormat, n nVar, Surface surface, MediaCrypto mediaCrypto, l lVar) {
            this.f18569a = dVar;
            this.f18570b = mediaFormat;
            this.f18571c = nVar;
            this.f18572d = surface;
            this.f18573e = mediaCrypto;
            this.f18574f = lVar;
        }
    }

    /* JADX INFO: compiled from: MediaCodecAdapter.java */
    public interface b {
        c a(a aVar) throws IOException;
    }

    void a();

    void b(Bundle bundle);

    void c(int i10, int i11, int i12, long j);

    void d(int i10, p152m1.b bVar, long j, int i11);

    void e(int i10);

    MediaFormat f();

    void flush();

    void g();

    void h(int i10, long j);

    int i();

    int j(MediaCodec.BufferInfo bufferInfo);

    void k(int i10);

    void l(y1.f.e eVar, Handler handler);

    ByteBuffer m(int i10);

    void n(Surface surface);

    ByteBuffer o(int i10);

    default boolean p(MediaCodecRenderer.a aVar) {
        return false;
    }
}
