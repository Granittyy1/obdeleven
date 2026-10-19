package androidx.media3.exoplayer;

import android.os.HandlerThread;
import android.os.Looper;

/* JADX INFO: compiled from: PlaybackLooperProvider.java */
/* JADX INFO: loaded from: classes.dex */
public final class i0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f18435a = new Object();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Looper f18436b = null;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public HandlerThread f18437c = null;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f18438d = 0;

    public final void a() {
        HandlerThread handlerThread;
        synchronized (this.f18435a) {
            try {
                p241t7.b.k(this.f18438d > 0);
                int i10 = this.f18438d - 1;
                this.f18438d = i10;
                if (i10 == 0 && (handlerThread = this.f18437c) != null) {
                    handlerThread.quit();
                    this.f18437c = null;
                    this.f18436b = null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
