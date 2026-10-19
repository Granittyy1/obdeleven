package p212r1;

import android.media.MediaCodec;
import android.media.MediaFormat;
import android.os.Handler;
import android.os.HandlerThread;
import androidx.collection.C0875c;
import androidx.media3.exoplayer.m0;
import androidx.media3.exoplayer.mediacodec.MediaCodecRenderer;
import java.util.ArrayDeque;

/* JADX INFO: compiled from: AsynchronousMediaCodecCallback.java */
/* JADX INFO: loaded from: classes.dex */
public final class e extends MediaCodec.Callback {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final HandlerThread f46290b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Handler f46291c;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public MediaFormat f46296h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public MediaFormat f46297i;
    public MediaCodec.CodecException j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public MediaCodec.CryptoException f46298k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public long f46299l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public boolean f46300m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public IllegalStateException f46301n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public MediaCodecRenderer.a f46302o;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f46289a = new Object();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final C0875c f46292d = new C0875c();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final C0875c f46293e = new C0875c();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final ArrayDeque<MediaCodec.BufferInfo> f46294f = new ArrayDeque<>();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final ArrayDeque<MediaFormat> f46295g = new ArrayDeque<>();

    public e(HandlerThread handlerThread) {
        this.f46290b = handlerThread;
    }

    public final void a() {
        ArrayDeque<MediaFormat> arrayDeque = this.f46295g;
        if (!arrayDeque.isEmpty()) {
            this.f46297i = arrayDeque.getLast();
        }
        C0875c c0875c = this.f46292d;
        c0875c.f9167c = c0875c.f9166b;
        C0875c c0875c2 = this.f46293e;
        c0875c2.f9167c = c0875c2.f9166b;
        this.f46294f.clear();
        arrayDeque.clear();
    }

    @Override // android.media.MediaCodec.Callback
    public final void onCryptoError(MediaCodec mediaCodec, MediaCodec.CryptoException cryptoException) {
        synchronized (this.f46289a) {
            this.f46298k = cryptoException;
        }
    }

    @Override // android.media.MediaCodec.Callback
    public final void onError(MediaCodec mediaCodec, MediaCodec.CodecException codecException) {
        synchronized (this.f46289a) {
            this.j = codecException;
        }
    }

    @Override // android.media.MediaCodec.Callback
    public final void onInputBufferAvailable(MediaCodec mediaCodec, int i10) {
        m0.a aVar;
        synchronized (this.f46289a) {
            this.f46292d.b(i10);
            MediaCodecRenderer.a aVar2 = this.f46302o;
            if (aVar2 != null && (aVar = MediaCodecRenderer.this.f18499G) != null) {
                aVar.b();
            }
        }
    }

    @Override // android.media.MediaCodec.Callback
    public final void onOutputBufferAvailable(MediaCodec mediaCodec, int i10, MediaCodec.BufferInfo bufferInfo) {
        m0.a aVar;
        synchronized (this.f46289a) {
            try {
                MediaFormat mediaFormat = this.f46297i;
                if (mediaFormat != null) {
                    this.f46293e.b(-2);
                    this.f46295g.add(mediaFormat);
                    this.f46297i = null;
                }
                this.f46293e.b(i10);
                this.f46294f.add(bufferInfo);
                MediaCodecRenderer.a aVar2 = this.f46302o;
                if (aVar2 != null && (aVar = MediaCodecRenderer.this.f18499G) != null) {
                    aVar.b();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // android.media.MediaCodec.Callback
    public final void onOutputFormatChanged(MediaCodec mediaCodec, MediaFormat mediaFormat) {
        synchronized (this.f46289a) {
            this.f46293e.b(-2);
            this.f46295g.add(mediaFormat);
            this.f46297i = null;
        }
    }
}
