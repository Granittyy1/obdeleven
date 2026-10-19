package androidx.compose.foundation.lazy.layout;

import android.view.Choreographer;
import android.view.Display;
import android.view.View;
import androidx.compose.runtime.t0;

/* JADX INFO: renamed from: androidx.compose.foundation.lazy.layout.a, reason: case insensitive filesystem */
/* JADX INFO: compiled from: PrefetchScheduler.android.kt */
/* JADX INFO: loaded from: classes.dex */
public final class RunnableC0966a implements V, t0, Runnable, Choreographer.FrameCallback {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static long f10701h;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final View f10702b;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f10704d;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f10706f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public long f10707g;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final androidx.compose.runtime.collection.c<U> f10703c = new androidx.compose.runtime.collection.c<>(new U[16]);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Choreographer f10705e = Choreographer.getInstance();

    /* JADX INFO: renamed from: androidx.compose.foundation.lazy.layout.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: PrefetchScheduler.android.kt */
    public static final class C0131a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final long f10708a;

        public C0131a(long j) {
            this.f10708a = j;
        }

        public final long a() {
            return Math.max(0L, this.f10708a - System.nanoTime());
        }
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0035  */
    public RunnableC0966a(View view) {
        float refreshRate;
        this.f10702b = view;
        if (f10701h == 0) {
            Display display = view.getDisplay();
            if (!view.isInEditMode() && display != null) {
                refreshRate = display.getRefreshRate();
                refreshRate = refreshRate < 30.0f ? 60.0f : refreshRate;
            }
            f10701h = (long) (1000000000 / refreshRate);
        }
    }

    @Override // androidx.compose.foundation.lazy.layout.V
    public final void a(PrefetchHandleProvider.HandleAndRequestImpl handleAndRequestImpl) {
        this.f10703c.b(handleAndRequestImpl);
        if (this.f10704d) {
            return;
        }
        this.f10704d = true;
        this.f10702b.post(this);
    }

    @Override // androidx.compose.runtime.t0
    public final void c() {
        this.f10706f = false;
        this.f10702b.removeCallbacks(this);
        this.f10705e.removeFrameCallback(this);
    }

    @Override // androidx.compose.runtime.t0
    public final void d() {
        this.f10706f = true;
    }

    @Override // android.view.Choreographer.FrameCallback
    public final void doFrame(long j) {
        if (this.f10706f) {
            this.f10707g = j;
            this.f10702b.post(this);
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        androidx.compose.runtime.collection.c<U> cVar = this.f10703c;
        if (cVar.f12945d == 0 || !this.f10704d || !this.f10706f || this.f10702b.getWindowVisibility() != 0) {
            this.f10704d = false;
            return;
        }
        C0131a c0131a = new C0131a(this.f10707g + f10701h);
        boolean z10 = false;
        while (cVar.f12945d != 0 && !z10) {
            if (c0131a.a() <= 0 || cVar.f12943b[0].a(c0131a)) {
                z10 = true;
            } else {
                cVar.p(0);
            }
        }
        if (z10) {
            this.f10705e.postFrameCallback(this);
        } else {
            this.f10704d = false;
        }
    }

    @Override // androidx.compose.runtime.t0
    public final void b() {
    }
}
