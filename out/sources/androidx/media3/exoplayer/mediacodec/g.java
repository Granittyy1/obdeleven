package androidx.media3.exoplayer.mediacodec;

import android.media.LoudnessCodecController;
import android.media.MediaCodec;
import android.media.MediaFormat;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.os.Trace;
import android.view.Surface;
import java.io.IOException;
import java.nio.ByteBuffer;
import p114j1.A;
import p212r1.l;
import p297y1.f;

/* JADX INFO: compiled from: SynchronousMediaCodecAdapter.java */
/* JADX INFO: loaded from: classes.dex */
public final class g implements c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final MediaCodec f18586a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final l f18587b;

    /* JADX INFO: compiled from: SynchronousMediaCodecAdapter.java */
    public static class a implements c.b {
        public static MediaCodec b(c.a aVar) throws IOException {
            d dVar = aVar.f18569a;
            StringBuilder sb2 = new StringBuilder("createCodec:");
            String str = dVar.f18575a;
            sb2.append(str);
            Trace.beginSection(sb2.toString());
            MediaCodec mediaCodecCreateByCodecName = MediaCodec.createByCodecName(str);
            Trace.endSection();
            return mediaCodecCreateByCodecName;
        }

        /* JADX WARN: Code duplicated, block: B:18:0x0041  */
        @Override // androidx.media3.exoplayer.mediacodec.c.b
        public final c a(c.a aVar) throws Throwable {
            MediaCodec mediaCodecB = null;
            try {
                mediaCodecB = b(aVar);
                Trace.beginSection("configureCodec");
                Surface surface = aVar.f18572d;
                mediaCodecB.configure(aVar.f18570b, surface, aVar.f18573e, (surface == null && aVar.f18569a.f18582h && A.f40996a >= 35) ? 8 : 0);
                Trace.endSection();
                Trace.beginSection("startCodec");
                mediaCodecB.start();
                Trace.endSection();
                return new g(mediaCodecB, aVar.f18574f);
            } catch (IOException e10) {
                e = e10;
                if (mediaCodecB != null) {
                    mediaCodecB.release();
                }
                throw e;
            } catch (RuntimeException e11) {
                e = e11;
                if (mediaCodecB != null) {
                    mediaCodecB.release();
                }
                throw e;
            }
        }
    }

    public g(MediaCodec mediaCodec, l lVar) {
        this.f18586a = mediaCodec;
        this.f18587b = lVar;
        if (A.f40996a < 35 || lVar == null) {
            return;
        }
        LoudnessCodecController loudnessCodecController = lVar.f46308c;
        if (loudnessCodecController == null || loudnessCodecController.addMediaCodec(mediaCodec)) {
            p241t7.b.k(lVar.f46306a.add(mediaCodec));
        }
    }

    @Override // androidx.media3.exoplayer.mediacodec.c
    public final void a() {
        l lVar = this.f18587b;
        MediaCodec mediaCodec = this.f18586a;
        try {
            int i10 = A.f40996a;
            if (i10 >= 30 && i10 < 33) {
                mediaCodec.stop();
            }
        } finally {
            if (A.f40996a >= 35 && lVar != null) {
                lVar.a(mediaCodec);
            }
            mediaCodec.release();
        }
    }

    @Override // androidx.media3.exoplayer.mediacodec.c
    public final void b(Bundle bundle) {
        this.f18586a.setParameters(bundle);
    }

    @Override // androidx.media3.exoplayer.mediacodec.c
    public final void c(int i10, int i11, int i12, long j) {
        this.f18586a.queueInputBuffer(i10, 0, i11, j, i12);
    }

    @Override // androidx.media3.exoplayer.mediacodec.c
    public final void d(int i10, p152m1.b bVar, long j, int i11) {
        this.f18586a.queueSecureInputBuffer(i10, 0, bVar.f44560i, j, i11);
    }

    @Override // androidx.media3.exoplayer.mediacodec.c
    public final void e(int i10) {
        this.f18586a.releaseOutputBuffer(i10, false);
    }

    @Override // androidx.media3.exoplayer.mediacodec.c
    public final MediaFormat f() {
        return this.f18586a.getOutputFormat();
    }

    @Override // androidx.media3.exoplayer.mediacodec.c
    public final void flush() {
        this.f18586a.flush();
    }

    @Override // androidx.media3.exoplayer.mediacodec.c
    public final void g() {
        this.f18586a.detachOutputSurface();
    }

    @Override // androidx.media3.exoplayer.mediacodec.c
    public final void h(int i10, long j) {
        this.f18586a.releaseOutputBuffer(i10, j);
    }

    @Override // androidx.media3.exoplayer.mediacodec.c
    public final int i() {
        return this.f18586a.dequeueInputBuffer(0L);
    }

    @Override // androidx.media3.exoplayer.mediacodec.c
    public final int j(MediaCodec.BufferInfo bufferInfo) {
        int iDequeueOutputBuffer;
        do {
            iDequeueOutputBuffer = this.f18586a.dequeueOutputBuffer(bufferInfo, 0L);
        } while (iDequeueOutputBuffer == -3);
        return iDequeueOutputBuffer;
    }

    @Override // androidx.media3.exoplayer.mediacodec.c
    public final void k(int i10) {
        this.f18586a.setVideoScalingMode(i10);
    }

    @Override // androidx.media3.exoplayer.mediacodec.c
    public final void l(final y1.f.e eVar, Handler handler) {
        this.f18586a.setOnFrameRenderedListener(new MediaCodec.OnFrameRenderedListener() { // from class: r1.n
            @Override // android.media.MediaCodec.OnFrameRenderedListener
            public final void onFrameRendered(MediaCodec mediaCodec, long j, long j10) {
                this.f46310a.getClass();
                f.e eVar2 = eVar;
                if (A.f40996a >= 30) {
                    eVar2.a(j);
                } else {
                    Handler handler2 = eVar2.f48104b;
                    handler2.sendMessageAtFrontOfQueue(Message.obtain(handler2, 0, (int) (j >> 32), (int) j));
                }
            }
        }, handler);
    }

    @Override // androidx.media3.exoplayer.mediacodec.c
    public final ByteBuffer m(int i10) {
        return this.f18586a.getInputBuffer(i10);
    }

    @Override // androidx.media3.exoplayer.mediacodec.c
    public final void n(Surface surface) {
        this.f18586a.setOutputSurface(surface);
    }

    @Override // androidx.media3.exoplayer.mediacodec.c
    public final ByteBuffer o(int i10) {
        return this.f18586a.getOutputBuffer(i10);
    }
}
