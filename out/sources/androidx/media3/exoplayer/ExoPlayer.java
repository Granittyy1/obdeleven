package androidx.media3.exoplayer;

import android.content.Context;
import android.os.Looper;
import androidx.core.app.NotificationManagerCompat;
import androidx.media3.exoplayer.image.ImageOutput;
import p078g1.C2198d;

/* JADX INFO: loaded from: classes.dex */
public interface ExoPlayer extends p078g1.v {

    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Context f17954a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final p114j1.t f17955b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final C1397o f17956c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final C1398p f17957d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final C1399q f17958e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final r f17959f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final C1400s f17960g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final androidx.compose.ui.text.font.s f17961h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public final Looper f17962i;
        public final int j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public final C2198d f17963k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public final int f17964l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public final boolean f17965m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public final r0 f17966n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        public final long f17967o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        public final long f17968p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        public final long f17969q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        public final C1392j f17970r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        public final long f17971s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public final long f17972t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        public final boolean f17973u;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public boolean f17974v;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        public final String f17975w;

        public b(Context context) {
            C1397o c1397o = new C1397o(context);
            C1398p c1398p = new C1398p(context);
            C1399q c1399q = new C1399q(context);
            r rVar = new r();
            C1400s c1400s = new C1400s(context);
            androidx.compose.ui.text.font.s sVar = new androidx.compose.ui.text.font.s(1);
            context.getClass();
            this.f17954a = context;
            this.f17956c = c1397o;
            this.f17957d = c1398p;
            this.f17958e = c1399q;
            this.f17959f = rVar;
            this.f17960g = c1400s;
            this.f17961h = sVar;
            int i10 = p114j1.A.f40996a;
            Looper looperMyLooper = Looper.myLooper();
            this.f17962i = looperMyLooper == null ? Looper.getMainLooper() : looperMyLooper;
            this.f17963k = C2198d.f35244b;
            this.f17964l = 1;
            this.f17965m = true;
            this.f17966n = r0.f18600c;
            this.f17967o = 5000L;
            this.f17968p = 15000L;
            this.f17969q = 3000L;
            this.f17970r = new C1392j(0.999f, p114j1.A.F(20L), p114j1.A.F(500L));
            this.f17955b = p114j1.c.f41011a;
            this.f17971s = 500L;
            this.f17972t = 2000L;
            this.f17973u = true;
            this.f17975w = "";
            this.j = NotificationManagerCompat.IMPORTANCE_UNSPECIFIED;
            if (p114j1.A.f40996a >= 35) {
            }
        }

        public final K a() {
            p241t7.b.k(!this.f17974v);
            this.f17974v = true;
            return new K(this);
        }
    }

    public static class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final c f17976a = new c();
    }

    @Override // p078g1.v
    /* JADX INFO: renamed from: H */
    ExoPlaybackException d();

    void setImageOutput(ImageOutput imageOutput);

    public interface a {
        default void a() {
        }
    }
}
