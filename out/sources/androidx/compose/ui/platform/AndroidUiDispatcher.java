package androidx.compose.ui.platform;

import android.os.Handler;
import android.os.Looper;
import android.view.Choreographer;
import java.util.ArrayList;
import kotlinx.coroutines.AbstractC2712w;
import kotlinx.coroutines.C2680e;

/* JADX INFO: compiled from: AndroidUiDispatcher.android.kt */
/* JADX INFO: loaded from: classes.dex */
public final class AndroidUiDispatcher extends AbstractC2712w {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final p293xa.g<kotlin.coroutines.e> f14804m = kotlin.a.a(new Ia.a<kotlin.coroutines.e>() { // from class: androidx.compose.ui.platform.AndroidUiDispatcher$Companion$Main$2
        @Override // Ia.a
        public final kotlin.coroutines.e invoke() {
            Choreographer choreographer;
            if (Looper.myLooper() == Looper.getMainLooper()) {
                choreographer = Choreographer.getInstance();
            } else {
                Sa.b bVar = kotlinx.coroutines.N.f43198a;
                choreographer = (Choreographer) C2680e.d(kotlinx.coroutines.internal.q.f43500a, new AndroidUiDispatcher$Companion$Main$2$dispatcher$1(2, null));
            }
            AndroidUiDispatcher androidUiDispatcher = new AndroidUiDispatcher(choreographer, p271w0.f.a(Looper.getMainLooper()));
            return androidUiDispatcher.plus(androidUiDispatcher.f14814l);
        }
    });

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final a f14805n = new a();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Choreographer f14806c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Handler f14807d;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public boolean f14812i;
    public boolean j;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final AndroidUiFrameClock f14814l;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Object f14808e = new Object();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final kotlin.collections.i<Runnable> f14809f = new kotlin.collections.i<>();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public ArrayList f14810g = new ArrayList();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public ArrayList f14811h = new ArrayList();

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final b f14813k = new b();

    /* JADX INFO: compiled from: AndroidUiDispatcher.android.kt */
    public static final class a extends ThreadLocal<kotlin.coroutines.e> {
        @Override // java.lang.ThreadLocal
        public final kotlin.coroutines.e initialValue() {
            Choreographer choreographer = Choreographer.getInstance();
            Looper looperMyLooper = Looper.myLooper();
            if (looperMyLooper == null) {
                throw new IllegalStateException("no Looper on this thread");
            }
            AndroidUiDispatcher androidUiDispatcher = new AndroidUiDispatcher(choreographer, p271w0.f.a(looperMyLooper));
            return androidUiDispatcher.plus(androidUiDispatcher.f14814l);
        }
    }

    /* JADX INFO: compiled from: AndroidUiDispatcher.android.kt */
    public static final class b implements Choreographer.FrameCallback, Runnable {
        public b() {
        }

        @Override // android.view.Choreographer.FrameCallback
        public final void doFrame(long j) {
            AndroidUiDispatcher.this.f14807d.removeCallbacks(this);
            AndroidUiDispatcher.d1(AndroidUiDispatcher.this);
            AndroidUiDispatcher androidUiDispatcher = AndroidUiDispatcher.this;
            synchronized (androidUiDispatcher.f14808e) {
                if (androidUiDispatcher.j) {
                    androidUiDispatcher.j = false;
                    ArrayList arrayList = androidUiDispatcher.f14810g;
                    androidUiDispatcher.f14810g = androidUiDispatcher.f14811h;
                    androidUiDispatcher.f14811h = arrayList;
                    int size = arrayList.size();
                    for (int i10 = 0; i10 < size; i10++) {
                        ((Choreographer.FrameCallback) arrayList.get(i10)).doFrame(j);
                    }
                    arrayList.clear();
                }
            }
        }

        @Override // java.lang.Runnable
        public final void run() {
            AndroidUiDispatcher.d1(AndroidUiDispatcher.this);
            AndroidUiDispatcher androidUiDispatcher = AndroidUiDispatcher.this;
            synchronized (androidUiDispatcher.f14808e) {
                try {
                    if (androidUiDispatcher.f14810g.isEmpty()) {
                        androidUiDispatcher.f14806c.removeFrameCallback(this);
                        androidUiDispatcher.j = false;
                    }
                    p293xa.r rVar = p293xa.r.f47939a;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    public AndroidUiDispatcher(Choreographer choreographer, Handler handler) {
        this.f14806c = choreographer;
        this.f14807d = handler;
        this.f14814l = new AndroidUiFrameClock(choreographer, this);
    }

    public static final void d1(AndroidUiDispatcher androidUiDispatcher) {
        Runnable runnableRemoveFirst;
        boolean z10;
        do {
            synchronized (androidUiDispatcher.f14808e) {
                kotlin.collections.i<Runnable> iVar = androidUiDispatcher.f14809f;
                runnableRemoveFirst = iVar.isEmpty() ? null : iVar.removeFirst();
            }
            while (runnableRemoveFirst != null) {
                runnableRemoveFirst.run();
                synchronized (androidUiDispatcher.f14808e) {
                    kotlin.collections.i<Runnable> iVar2 = androidUiDispatcher.f14809f;
                    runnableRemoveFirst = iVar2.isEmpty() ? null : iVar2.removeFirst();
                }
            }
            synchronized (androidUiDispatcher.f14808e) {
                if (androidUiDispatcher.f14809f.isEmpty()) {
                    z10 = false;
                    androidUiDispatcher.f14812i = false;
                } else {
                    z10 = true;
                }
            }
        } while (z10);
    }

    @Override // kotlinx.coroutines.AbstractC2712w
    public final void Z0(kotlin.coroutines.e eVar, Runnable runnable) {
        synchronized (this.f14808e) {
            try {
                this.f14809f.addLast(runnable);
                if (!this.f14812i) {
                    this.f14812i = true;
                    this.f14807d.post(this.f14813k);
                    if (!this.j) {
                        this.j = true;
                        this.f14806c.postFrameCallback(this.f14813k);
                    }
                }
                p293xa.r rVar = p293xa.r.f47939a;
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
