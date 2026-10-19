package p297y1;

import android.content.Context;
import android.hardware.display.DisplayManager;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import android.view.Choreographer;
import android.view.Display;
import android.view.Surface;
import p114j1.A;
import p114j1.k;

/* JADX INFO: compiled from: VideoFrameReleaseHelper.java */
/* JADX INFO: loaded from: classes.dex */
public final class q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final e f48175a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final a f48176b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final b f48177c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f48178d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Surface f48179e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public float f48180f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public float f48181g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public float f48182h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public float f48183i;
    public int j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public long f48184k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public long f48185l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public long f48186m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public long f48187n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public long f48188o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public long f48189p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public long f48190q;

    /* JADX INFO: compiled from: VideoFrameReleaseHelper.java */
    public static final class b implements Choreographer.FrameCallback, Handler.Callback {

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public static final b f48193f = new b();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public volatile long f48194b = -9223372036854775807L;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final Handler f48195c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public Choreographer f48196d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public int f48197e;

        public b() {
            HandlerThread handlerThread = new HandlerThread("ExoPlayer:FrameReleaseChoreographer");
            handlerThread.start();
            Looper looper = handlerThread.getLooper();
            int i10 = A.f40996a;
            Handler handler = new Handler(looper, this);
            this.f48195c = handler;
            handler.sendEmptyMessage(1);
        }

        @Override // android.view.Choreographer.FrameCallback
        public final void doFrame(long j) {
            this.f48194b = j;
            Choreographer choreographer = this.f48196d;
            choreographer.getClass();
            choreographer.postFrameCallbackDelayed(this, 500L);
        }

        @Override // android.os.Handler.Callback
        public final boolean handleMessage(Message message) {
            int i10 = message.what;
            if (i10 == 1) {
                try {
                    this.f48196d = Choreographer.getInstance();
                } catch (RuntimeException e10) {
                    k.g("Vsync sampling disabled due to platform error", e10);
                }
                return true;
            }
            if (i10 == 2) {
                Choreographer choreographer = this.f48196d;
                if (choreographer != null) {
                    int i11 = this.f48197e + 1;
                    this.f48197e = i11;
                    if (i11 == 1) {
                        choreographer.postFrameCallback(this);
                    }
                }
                return true;
            }
            if (i10 != 3) {
                return false;
            }
            Choreographer choreographer2 = this.f48196d;
            if (choreographer2 != null) {
                int i12 = this.f48197e - 1;
                this.f48197e = i12;
                if (i12 == 0) {
                    choreographer2.removeFrameCallback(this);
                    this.f48194b = -9223372036854775807L;
                }
            }
            return true;
        }
    }

    public q(Context context) {
        DisplayManager displayManager;
        e eVar = new e();
        eVar.f48037a = new e.a();
        eVar.f48038b = new e.a();
        eVar.f48040d = -9223372036854775807L;
        this.f48175a = eVar;
        a aVar = (context == null || (displayManager = (DisplayManager) context.getSystemService("display")) == null) ? null : new a(displayManager);
        this.f48176b = aVar;
        this.f48177c = aVar != null ? b.f48193f : null;
        this.f48184k = -9223372036854775807L;
        this.f48185l = -9223372036854775807L;
        this.f48180f = -1.0f;
        this.f48183i = 1.0f;
        this.j = 0;
    }

    public static void a(q qVar, Display display) {
        qVar.getClass();
        if (display != null) {
            long refreshRate = (long) (1.0E9d / ((double) display.getRefreshRate()));
            qVar.f48184k = refreshRate;
            qVar.f48185l = (refreshRate * 80) / 100;
        } else {
            k.f("Unable to query display refresh rate");
            qVar.f48184k = -9223372036854775807L;
            qVar.f48185l = -9223372036854775807L;
        }
    }

    public final void b() {
        Surface surface;
        if (A.f40996a < 30 || (surface = this.f48179e) == null || this.j == Integer.MIN_VALUE || this.f48182h == 0.0f) {
            return;
        }
        this.f48182h = 0.0f;
        try {
            surface.setFrameRate(0.0f, 0);
        } catch (IllegalStateException e10) {
            k.d("VideoFrameReleaseHelper", "Failed to call Surface.setFrameRate", e10);
        }
    }

    /* JADX WARN: Code duplicated, block: B:34:0x0071  */
    public final void c() {
        float f10;
        float f11;
        if (A.f40996a < 30 || this.f48179e == null) {
            return;
        }
        e eVar = this.f48175a;
        if (!eVar.f48037a.a()) {
            f10 = this.f48180f;
        } else if (eVar.f48037a.a()) {
            e.a aVar = eVar.f48037a;
            long j = aVar.f48046e;
            f10 = (float) (1.0E9d / (j != 0 ? aVar.f48047f / j : 0L));
        } else {
            f10 = -1.0f;
        }
        float f12 = this.f48181g;
        if (f10 == f12) {
            return;
        }
        if (f10 != -1.0f && f12 != -1.0f) {
            if (eVar.f48037a.a()) {
                if ((eVar.f48037a.a() ? eVar.f48037a.f48047f : -9223372036854775807L) >= 5000000000L) {
                    f11 = 0.02f;
                } else {
                    f11 = 1.0f;
                }
            } else {
                f11 = 1.0f;
            }
            if (Math.abs(f10 - this.f48181g) < f11) {
                return;
            }
        } else if (f10 == -1.0f && eVar.f48041e < 30) {
            return;
        }
        this.f48181g = f10;
        d(false);
    }

    /* JADX WARN: Code duplicated, block: B:14:0x0022  */
    public final void d(boolean z10) {
        Surface surface;
        float f10;
        if (A.f40996a < 30 || (surface = this.f48179e) == null || this.j == Integer.MIN_VALUE) {
            return;
        }
        if (this.f48178d) {
            float f11 = this.f48181g;
            if (f11 != -1.0f) {
                f10 = f11 * this.f48183i;
            } else {
                f10 = 0.0f;
            }
        } else {
            f10 = 0.0f;
        }
        if (z10 || this.f48182h != f10) {
            this.f48182h = f10;
            try {
                surface.setFrameRate(f10, f10 == 0.0f ? 0 : 1);
            } catch (IllegalStateException e10) {
                k.d("VideoFrameReleaseHelper", "Failed to call Surface.setFrameRate", e10);
            }
        }
    }

    /* JADX INFO: compiled from: VideoFrameReleaseHelper.java */
    public final class a implements DisplayManager.DisplayListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final DisplayManager f48191a;

        public a(DisplayManager displayManager) {
            this.f48191a = displayManager;
        }

        @Override // android.hardware.display.DisplayManager.DisplayListener
        public final void onDisplayChanged(int i10) {
            if (i10 == 0) {
                q.a(q.this, this.f48191a.getDisplay(0));
            }
        }

        @Override // android.hardware.display.DisplayManager.DisplayListener
        public final void onDisplayAdded(int i10) {
        }

        @Override // android.hardware.display.DisplayManager.DisplayListener
        public final void onDisplayRemoved(int i10) {
        }
    }
}
