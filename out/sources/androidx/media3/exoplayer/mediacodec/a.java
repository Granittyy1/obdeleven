package androidx.media3.exoplayer.mediacodec;

import android.media.LoudnessCodecController;
import android.media.MediaCodec;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.os.Bundle;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Message;
import android.os.Trace;
import android.view.Surface;
import androidx.collection.C0875c;
import java.nio.ByteBuffer;
import p033c7.RunnableC1499l;
import p114j1.A;
import p212r1.l;
import p212r1.m;
import p297y1.f;

/* JADX INFO: compiled from: AsynchronousMediaCodecAdapter.java */
/* JADX INFO: loaded from: classes.dex */
public final class a implements c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final MediaCodec f18560a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final p212r1.e f18561b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final m f18562c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final l f18563d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f18564e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f18565f = 0;

    /* JADX INFO: renamed from: androidx.media3.exoplayer.mediacodec.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: AsynchronousMediaCodecAdapter.java */
    public static final class C0188a implements c.b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final p212r1.b f18566a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final p212r1.c f18567b;

        public C0188a(p212r1.b bVar, p212r1.c cVar) {
            this.f18566a = bVar;
            this.f18567b = cVar;
        }

        @Override // androidx.media3.exoplayer.mediacodec.c.b
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final a a(c.a aVar) throws Exception {
            MediaCodec mediaCodecCreateByCodecName;
            String str = aVar.f18569a.f18575a;
            a aVar2 = null;
            try {
                Trace.beginSection("createCodec:" + str);
                mediaCodecCreateByCodecName = MediaCodec.createByCodecName(str);
                try {
                    a aVar3 = new a(mediaCodecCreateByCodecName, (HandlerThread) this.f18566a.get(), new p212r1.d(mediaCodecCreateByCodecName, (HandlerThread) this.f18567b.get()), aVar.f18574f);
                    try {
                        Trace.endSection();
                        Surface surface = aVar.f18572d;
                        a.q(aVar3, aVar.f18570b, surface, aVar.f18573e, (surface == null && aVar.f18569a.f18582h && A.f40996a >= 35) ? 8 : 0);
                        return aVar3;
                    } catch (Exception e10) {
                        e = e10;
                        aVar2 = aVar3;
                        if (aVar2 != null) {
                            aVar2.a();
                        } else if (mediaCodecCreateByCodecName != null) {
                            mediaCodecCreateByCodecName.release();
                        }
                        throw e;
                    }
                } catch (Exception e11) {
                    e = e11;
                }
            } catch (Exception e12) {
                e = e12;
                mediaCodecCreateByCodecName = null;
            }
        }
    }

    public a(MediaCodec mediaCodec, HandlerThread handlerThread, m mVar, l lVar) {
        this.f18560a = mediaCodec;
        this.f18561b = new p212r1.e(handlerThread);
        this.f18562c = mVar;
        this.f18563d = lVar;
    }

    public static void q(a aVar, MediaFormat mediaFormat, Surface surface, MediaCrypto mediaCrypto, int i10) {
        l lVar;
        LoudnessCodecController loudnessCodecController;
        p212r1.e eVar = aVar.f18561b;
        p241t7.b.k(eVar.f46291c == null);
        HandlerThread handlerThread = eVar.f46290b;
        handlerThread.start();
        Handler handler = new Handler(handlerThread.getLooper());
        MediaCodec mediaCodec = aVar.f18560a;
        mediaCodec.setCallback(eVar, handler);
        eVar.f46291c = handler;
        Trace.beginSection("configureCodec");
        mediaCodec.configure(mediaFormat, surface, mediaCrypto, i10);
        Trace.endSection();
        aVar.f18562c.start();
        Trace.beginSection("startCodec");
        mediaCodec.start();
        Trace.endSection();
        if (A.f40996a >= 35 && (lVar = aVar.f18563d) != null && ((loudnessCodecController = lVar.f46308c) == null || loudnessCodecController.addMediaCodec(mediaCodec))) {
            p241t7.b.k(lVar.f46306a.add(mediaCodec));
        }
        aVar.f18565f = 1;
    }

    public static String r(int i10, String str) {
        StringBuilder sb2 = new StringBuilder(str);
        if (i10 == 1) {
            sb2.append("Audio");
        } else if (i10 == 2) {
            sb2.append("Video");
        } else {
            sb2.append("Unknown(");
            sb2.append(i10);
            sb2.append(")");
        }
        return sb2.toString();
    }

    @Override // androidx.media3.exoplayer.mediacodec.c
    public final void a() {
        l lVar;
        l lVar2;
        try {
            if (this.f18565f == 1) {
                this.f18562c.shutdown();
                p212r1.e eVar = this.f18561b;
                synchronized (eVar.f46289a) {
                    eVar.f46300m = true;
                    eVar.f46290b.quit();
                    eVar.a();
                }
            }
            this.f18565f = 2;
            if (this.f18564e) {
                return;
            }
            try {
                int i10 = A.f40996a;
                if (i10 >= 30 && i10 < 33) {
                    this.f18560a.stop();
                }
            } finally {
                if (A.f40996a >= 35 && (lVar2 = this.f18563d) != null) {
                    lVar2.a(this.f18560a);
                }
                this.f18560a.release();
                this.f18564e = true;
            }
        } catch (Throwable th) {
            if (!this.f18564e) {
                try {
                    int i11 = A.f40996a;
                    if (i11 >= 30 && i11 < 33) {
                        this.f18560a.stop();
                    }
                } finally {
                    if (A.f40996a >= 35 && (lVar = this.f18563d) != null) {
                        lVar.a(this.f18560a);
                    }
                    this.f18560a.release();
                    this.f18564e = true;
                }
            }
            throw th;
        }
    }

    @Override // androidx.media3.exoplayer.mediacodec.c
    public final void b(Bundle bundle) {
        this.f18562c.b(bundle);
    }

    @Override // androidx.media3.exoplayer.mediacodec.c
    public final void c(int i10, int i11, int i12, long j) {
        this.f18562c.c(i10, i11, i12, j);
    }

    @Override // androidx.media3.exoplayer.mediacodec.c
    public final void d(int i10, p152m1.b bVar, long j, int i11) {
        this.f18562c.d(i10, bVar, j, i11);
    }

    @Override // androidx.media3.exoplayer.mediacodec.c
    public final void e(int i10) {
        this.f18560a.releaseOutputBuffer(i10, false);
    }

    @Override // androidx.media3.exoplayer.mediacodec.c
    public final MediaFormat f() {
        MediaFormat mediaFormat;
        p212r1.e eVar = this.f18561b;
        synchronized (eVar.f46289a) {
            try {
                mediaFormat = eVar.f46296h;
                if (mediaFormat == null) {
                    throw new IllegalStateException();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return mediaFormat;
    }

    @Override // androidx.media3.exoplayer.mediacodec.c
    public final void flush() {
        this.f18562c.flush();
        this.f18560a.flush();
        p212r1.e eVar = this.f18561b;
        synchronized (eVar.f46289a) {
            eVar.f46299l++;
            Handler handler = eVar.f46291c;
            int i10 = A.f40996a;
            handler.post(new RunnableC1499l(2, eVar));
        }
        this.f18560a.start();
    }

    @Override // androidx.media3.exoplayer.mediacodec.c
    public final void g() {
        this.f18560a.detachOutputSurface();
    }

    @Override // androidx.media3.exoplayer.mediacodec.c
    public final void h(int i10, long j) {
        this.f18560a.releaseOutputBuffer(i10, j);
    }

    @Override // androidx.media3.exoplayer.mediacodec.c
    public final int i() {
        int i10;
        this.f18562c.a();
        p212r1.e eVar = this.f18561b;
        synchronized (eVar.f46289a) {
            try {
                IllegalStateException illegalStateException = eVar.f46301n;
                if (illegalStateException != null) {
                    eVar.f46301n = null;
                    throw illegalStateException;
                }
                MediaCodec.CodecException codecException = eVar.j;
                if (codecException != null) {
                    eVar.j = null;
                    throw codecException;
                }
                MediaCodec.CryptoException cryptoException = eVar.f46298k;
                if (cryptoException != null) {
                    eVar.f46298k = null;
                    throw cryptoException;
                }
                i10 = -1;
                if (!(eVar.f46299l > 0 || eVar.f46300m)) {
                    C0875c c0875c = eVar.f46292d;
                    int i11 = c0875c.f9166b;
                    int i12 = c0875c.f9167c;
                    if (!(i11 == i12)) {
                        if (i11 == i12) {
                            throw new ArrayIndexOutOfBoundsException();
                        }
                        i10 = ((int[]) c0875c.f9169e)[i11];
                        c0875c.f9166b = (i11 + 1) & c0875c.f9168d;
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return i10;
    }

    @Override // androidx.media3.exoplayer.mediacodec.c
    public final int j(MediaCodec.BufferInfo bufferInfo) {
        int i10;
        this.f18562c.a();
        p212r1.e eVar = this.f18561b;
        synchronized (eVar.f46289a) {
            try {
                IllegalStateException illegalStateException = eVar.f46301n;
                if (illegalStateException != null) {
                    eVar.f46301n = null;
                    throw illegalStateException;
                }
                MediaCodec.CodecException codecException = eVar.j;
                if (codecException != null) {
                    eVar.j = null;
                    throw codecException;
                }
                MediaCodec.CryptoException cryptoException = eVar.f46298k;
                if (cryptoException != null) {
                    eVar.f46298k = null;
                    throw cryptoException;
                }
                i10 = -1;
                if (!(eVar.f46299l > 0 || eVar.f46300m)) {
                    C0875c c0875c = eVar.f46293e;
                    int i11 = c0875c.f9166b;
                    int i12 = c0875c.f9167c;
                    if (!(i11 == i12)) {
                        if (i11 == i12) {
                            throw new ArrayIndexOutOfBoundsException();
                        }
                        i10 = ((int[]) c0875c.f9169e)[i11];
                        c0875c.f9166b = c0875c.f9168d & (i11 + 1);
                        if (i10 >= 0) {
                            p241t7.b.l(eVar.f46296h);
                            MediaCodec.BufferInfo bufferInfoRemove = eVar.f46294f.remove();
                            bufferInfo.set(bufferInfoRemove.offset, bufferInfoRemove.size, bufferInfoRemove.presentationTimeUs, bufferInfoRemove.flags);
                        } else if (i10 == -2) {
                            eVar.f46296h = eVar.f46295g.remove();
                        }
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return i10;
    }

    @Override // androidx.media3.exoplayer.mediacodec.c
    public final void k(int i10) {
        this.f18560a.setVideoScalingMode(i10);
    }

    @Override // androidx.media3.exoplayer.mediacodec.c
    public final void l(final y1.f.e eVar, Handler handler) {
        this.f18560a.setOnFrameRenderedListener(new MediaCodec.OnFrameRenderedListener() { // from class: r1.a
            @Override // android.media.MediaCodec.OnFrameRenderedListener
            public final void onFrameRendered(MediaCodec mediaCodec, long j, long j10) {
                this.f46271a.getClass();
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
        return this.f18560a.getInputBuffer(i10);
    }

    @Override // androidx.media3.exoplayer.mediacodec.c
    public final void n(Surface surface) {
        this.f18560a.setOutputSurface(surface);
    }

    @Override // androidx.media3.exoplayer.mediacodec.c
    public final ByteBuffer o(int i10) {
        return this.f18560a.getOutputBuffer(i10);
    }

    @Override // androidx.media3.exoplayer.mediacodec.c
    public final boolean p(MediaCodecRenderer.a aVar) {
        p212r1.e eVar = this.f18561b;
        synchronized (eVar.f46289a) {
            eVar.f46302o = aVar;
        }
        return true;
    }
}
