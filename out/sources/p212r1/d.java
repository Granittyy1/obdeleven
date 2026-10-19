package p212r1;

import android.media.MediaCodec;
import android.os.Bundle;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import coil.util.t;
import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import p114j1.A;

/* JADX INFO: compiled from: AsynchronousMediaCodecBufferEnqueuer.java */
/* JADX INFO: loaded from: classes.dex */
public final class d implements m {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final ArrayDeque<b> f46275g = new ArrayDeque<>();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final Object f46276h = new Object();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final MediaCodec f46277a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final HandlerThread f46278b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public a f46279c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final AtomicReference<RuntimeException> f46280d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final t f46281e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f46282f;

    /* JADX INFO: compiled from: AsynchronousMediaCodecBufferEnqueuer.java */
    public class a extends Handler {
        public a(Looper looper) {
            super(looper);
        }

        @Override // android.os.Handler
        public final void handleMessage(Message message) {
            d dVar = d.this;
            dVar.getClass();
            int i10 = message.what;
            b bVar = null;
            if (i10 == 1) {
                b bVar2 = (b) message.obj;
                try {
                    dVar.f46277a.queueInputBuffer(bVar2.f46284a, 0, bVar2.f46285b, bVar2.f46287d, bVar2.f46288e);
                } catch (RuntimeException e10) {
                    AtomicReference<RuntimeException> atomicReference = dVar.f46280d;
                    while (!atomicReference.compareAndSet(null, e10) && atomicReference.get() == null) {
                    }
                }
                bVar = bVar2;
            } else if (i10 == 2) {
                b bVar3 = (b) message.obj;
                int i11 = bVar3.f46284a;
                MediaCodec.CryptoInfo cryptoInfo = bVar3.f46286c;
                long j = bVar3.f46287d;
                int i12 = bVar3.f46288e;
                try {
                    synchronized (d.f46276h) {
                        dVar.f46277a.queueSecureInputBuffer(i11, 0, cryptoInfo, j, i12);
                    }
                } catch (RuntimeException e11) {
                    AtomicReference<RuntimeException> atomicReference2 = dVar.f46280d;
                    while (!atomicReference2.compareAndSet(null, e11) && atomicReference2.get() == null) {
                    }
                }
                bVar = bVar3;
            } else if (i10 == 3) {
                dVar.f46281e.d();
            } else if (i10 != 4) {
                AtomicReference<RuntimeException> atomicReference3 = dVar.f46280d;
                IllegalStateException illegalStateException = new IllegalStateException(String.valueOf(message.what));
                while (!atomicReference3.compareAndSet(null, illegalStateException) && atomicReference3.get() == null) {
                }
            } else {
                try {
                    dVar.f46277a.setParameters((Bundle) message.obj);
                } catch (RuntimeException e12) {
                    AtomicReference<RuntimeException> atomicReference4 = dVar.f46280d;
                    while (!atomicReference4.compareAndSet(null, e12) && atomicReference4.get() == null) {
                    }
                }
            }
            if (bVar != null) {
                ArrayDeque<b> arrayDeque = d.f46275g;
                synchronized (arrayDeque) {
                    arrayDeque.add(bVar);
                }
            }
        }
    }

    /* JADX INFO: compiled from: AsynchronousMediaCodecBufferEnqueuer.java */
    public static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f46284a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f46285b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final MediaCodec.CryptoInfo f46286c = new MediaCodec.CryptoInfo();

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public long f46287d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public int f46288e;
    }

    public d(MediaCodec mediaCodec, HandlerThread handlerThread) {
        t tVar = new t();
        this.f46277a = mediaCodec;
        this.f46278b = handlerThread;
        this.f46281e = tVar;
        this.f46280d = new AtomicReference<>();
    }

    public static b e() {
        ArrayDeque<b> arrayDeque = f46275g;
        synchronized (arrayDeque) {
            try {
                if (arrayDeque.isEmpty()) {
                    return new b();
                }
                return arrayDeque.removeFirst();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // p212r1.m
    public final void a() {
        RuntimeException andSet = this.f46280d.getAndSet(null);
        if (andSet != null) {
            throw andSet;
        }
    }

    @Override // p212r1.m
    public final void b(Bundle bundle) {
        a();
        a aVar = this.f46279c;
        int i10 = A.f40996a;
        aVar.obtainMessage(4, bundle).sendToTarget();
    }

    @Override // p212r1.m
    public final void c(int i10, int i11, int i12, long j) {
        a();
        b bVarE = e();
        bVarE.f46284a = i10;
        bVarE.f46285b = i11;
        bVarE.f46287d = j;
        bVarE.f46288e = i12;
        a aVar = this.f46279c;
        int i13 = A.f40996a;
        aVar.obtainMessage(1, bVarE).sendToTarget();
    }

    @Override // p212r1.m
    public final void d(int i10, p152m1.b bVar, long j, int i11) {
        a();
        b bVarE = e();
        bVarE.f46284a = i10;
        bVarE.f46285b = 0;
        bVarE.f46287d = j;
        bVarE.f46288e = i11;
        int i12 = bVar.f44557f;
        MediaCodec.CryptoInfo cryptoInfo = bVarE.f46286c;
        cryptoInfo.numSubSamples = i12;
        int[] iArr = bVar.f44555d;
        int[] iArrCopyOf = cryptoInfo.numBytesOfClearData;
        if (iArr != null) {
            if (iArrCopyOf == null || iArrCopyOf.length < iArr.length) {
                iArrCopyOf = Arrays.copyOf(iArr, iArr.length);
            } else {
                System.arraycopy(iArr, 0, iArrCopyOf, 0, iArr.length);
            }
        }
        cryptoInfo.numBytesOfClearData = iArrCopyOf;
        int[] iArr2 = bVar.f44556e;
        int[] iArrCopyOf2 = cryptoInfo.numBytesOfEncryptedData;
        if (iArr2 != null) {
            if (iArrCopyOf2 == null || iArrCopyOf2.length < iArr2.length) {
                iArrCopyOf2 = Arrays.copyOf(iArr2, iArr2.length);
            } else {
                System.arraycopy(iArr2, 0, iArrCopyOf2, 0, iArr2.length);
            }
        }
        cryptoInfo.numBytesOfEncryptedData = iArrCopyOf2;
        byte[] bArr = bVar.f44553b;
        byte[] bArrCopyOf = cryptoInfo.key;
        if (bArr != null) {
            if (bArrCopyOf == null || bArrCopyOf.length < bArr.length) {
                bArrCopyOf = Arrays.copyOf(bArr, bArr.length);
            } else {
                System.arraycopy(bArr, 0, bArrCopyOf, 0, bArr.length);
            }
        }
        bArrCopyOf.getClass();
        cryptoInfo.key = bArrCopyOf;
        byte[] bArr2 = bVar.f44552a;
        byte[] bArrCopyOf2 = cryptoInfo.iv;
        if (bArr2 != null) {
            if (bArrCopyOf2 == null || bArrCopyOf2.length < bArr2.length) {
                bArrCopyOf2 = Arrays.copyOf(bArr2, bArr2.length);
            } else {
                System.arraycopy(bArr2, 0, bArrCopyOf2, 0, bArr2.length);
            }
        }
        bArrCopyOf2.getClass();
        cryptoInfo.iv = bArrCopyOf2;
        cryptoInfo.mode = bVar.f44554c;
        if (A.f40996a >= 24) {
            cryptoInfo.setPattern(new MediaCodec.CryptoInfo.Pattern(bVar.f44558g, bVar.f44559h));
        }
        this.f46279c.obtainMessage(2, bVarE).sendToTarget();
    }

    @Override // p212r1.m
    public final void flush() {
        if (this.f46282f) {
            try {
                a aVar = this.f46279c;
                aVar.getClass();
                aVar.removeCallbacksAndMessages(null);
                t tVar = this.f46281e;
                synchronized (tVar) {
                    tVar.f23176a = false;
                }
                a aVar2 = this.f46279c;
                aVar2.getClass();
                aVar2.obtainMessage(3).sendToTarget();
                synchronized (tVar) {
                    while (!tVar.f23176a) {
                        tVar.wait();
                    }
                }
            } catch (InterruptedException e10) {
                Thread.currentThread().interrupt();
                throw new IllegalStateException(e10);
            }
        }
    }

    @Override // p212r1.m
    public final void shutdown() {
        if (this.f46282f) {
            flush();
            this.f46278b.quit();
        }
        this.f46282f = false;
    }

    @Override // p212r1.m
    public final void start() {
        if (this.f46282f) {
            return;
        }
        HandlerThread handlerThread = this.f46278b;
        handlerThread.start();
        this.f46279c = new a(handlerThread.getLooper());
        this.f46282f = true;
    }
}
