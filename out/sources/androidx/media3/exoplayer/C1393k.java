package androidx.media3.exoplayer;

import com.braze.Constants;
import java.util.HashMap;
import java.util.Iterator;

/* JADX INFO: renamed from: androidx.media3.exoplayer.k, reason: case insensitive filesystem */
/* JADX INFO: compiled from: DefaultLoadControl.java */
/* JADX INFO: loaded from: classes.dex */
public final class C1393k implements S {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final p272w1.d f18460a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f18461b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f18462c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f18463d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final long f18464e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f18465f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final long f18466g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final HashMap<p162n1.u, a> f18467h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public long f18468i;

    /* JADX INFO: renamed from: androidx.media3.exoplayer.k$a */
    /* JADX INFO: compiled from: DefaultLoadControl.java */
    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public boolean f18469a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f18470b;
    }

    public C1393k() {
        p272w1.d dVar = new p272w1.d();
        k(Constants.BRAZE_MINIMUM_NOTIFICATION_DURATION_MILLIS, 0, "bufferForPlaybackMs", "0");
        k(2000, 0, "bufferForPlaybackAfterRebufferMs", "0");
        k(50000, Constants.BRAZE_MINIMUM_NOTIFICATION_DURATION_MILLIS, "minBufferMs", "bufferForPlaybackMs");
        k(50000, 2000, "minBufferMs", "bufferForPlaybackAfterRebufferMs");
        k(50000, 50000, "maxBufferMs", "minBufferMs");
        k(0, 0, "backBufferDurationMs", "0");
        this.f18460a = dVar;
        long j = 50000;
        this.f18461b = p114j1.A.F(j);
        this.f18462c = p114j1.A.F(j);
        this.f18463d = p114j1.A.F(Constants.BRAZE_MINIMUM_NOTIFICATION_DURATION_MILLIS);
        this.f18464e = p114j1.A.F(2000);
        this.f18465f = -1;
        this.f18466g = p114j1.A.F(0);
        this.f18467h = new HashMap<>();
        this.f18468i = -1L;
    }

    public static void k(int i10, int i11, String str, String str2) {
        p241t7.b.d(str + " cannot be less than " + str2, i10 >= i11);
    }

    @Override // androidx.media3.exoplayer.S
    public final boolean a(S.a aVar) {
        int i10;
        long jRound = aVar.f18138b;
        float f10 = aVar.f18139c;
        int i11 = p114j1.A.f40996a;
        if (f10 != 1.0f) {
            jRound = Math.round(jRound / ((double) f10));
        }
        long jMin = aVar.f18140d ? this.f18464e : this.f18463d;
        long j = aVar.f18141e;
        if (j != -9223372036854775807L) {
            jMin = Math.min(j / 2, jMin);
        }
        if (jMin > 0 && jRound < jMin) {
            p272w1.d dVar = this.f18460a;
            synchronized (dVar) {
                i10 = dVar.f47700d * dVar.f47698b;
            }
            if (i10 < l()) {
                return false;
            }
        }
        return true;
    }

    @Override // androidx.media3.exoplayer.S
    public final boolean b() {
        return false;
    }

    @Override // androidx.media3.exoplayer.S
    public final void c(p162n1.u uVar) {
        HashMap<p162n1.u, a> map = this.f18467h;
        if (map.remove(uVar) != null) {
            m();
        }
        if (map.isEmpty()) {
            this.f18468i = -1L;
        }
    }

    @Override // androidx.media3.exoplayer.S
    public final boolean d(S.a aVar) {
        int i10;
        a aVar2 = this.f18467h.get(aVar.f18137a);
        aVar2.getClass();
        p272w1.d dVar = this.f18460a;
        synchronized (dVar) {
            i10 = dVar.f47700d * dVar.f47698b;
        }
        boolean z10 = i10 >= l();
        float f10 = aVar.f18139c;
        long j = this.f18462c;
        long jMin = this.f18461b;
        if (f10 > 1.0f) {
            jMin = Math.min(p114j1.A.s(f10, jMin), j);
        }
        long jMax = Math.max(jMin, 500000L);
        long j10 = aVar.f18138b;
        if (j10 < jMax) {
            aVar2.f18469a = !z10;
            if (z10 && j10 < 500000) {
                p114j1.k.f("Target buffer size reached with less than 500ms of buffered media data.");
            }
        } else if (j10 >= j || z10) {
            aVar2.f18469a = false;
        }
        return aVar2.f18469a;
    }

    @Override // androidx.media3.exoplayer.S
    public final boolean e() {
        Iterator<a> it = this.f18467h.values().iterator();
        while (it.hasNext()) {
            if (it.next().f18469a) {
                return false;
            }
        }
        return true;
    }

    @Override // androidx.media3.exoplayer.S
    public final long f() {
        return this.f18466g;
    }

    @Override // androidx.media3.exoplayer.S
    public final void g(p162n1.u uVar) {
        long id = Thread.currentThread().getId();
        long j = this.f18468i;
        p241t7.b.i("Players that share the same LoadControl must share the same playback thread. See ExoPlayer.Builder.setPlaybackLooper(Looper).", j == -1 || j == id);
        this.f18468i = id;
        HashMap<p162n1.u, a> map = this.f18467h;
        if (!map.containsKey(uVar)) {
            map.put(uVar, new a());
        }
        a aVar = map.get(uVar);
        aVar.getClass();
        int i10 = this.f18465f;
        if (i10 == -1) {
            i10 = 13107200;
        }
        aVar.f18470b = i10;
        aVar.f18469a = false;
    }

    @Override // androidx.media3.exoplayer.S
    public final p272w1.d h() {
        return this.f18460a;
    }

    @Override // androidx.media3.exoplayer.S
    public final void i(p162n1.u uVar) {
        if (this.f18467h.remove(uVar) != null) {
            m();
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // androidx.media3.exoplayer.S
    public final void j(S.a aVar, p259v1.t[] tVarArr) {
        a aVar2 = this.f18467h.get(aVar.f18137a);
        aVar2.getClass();
        int iMax = this.f18465f;
        if (iMax == -1) {
            int length = tVarArr.length;
            int i10 = 0;
            int i11 = 0;
            while (true) {
                int i12 = 13107200;
                if (i10 < length) {
                    p259v1.t tVar = tVarArr[i10];
                    if (tVar != null) {
                        switch (tVar.a().f35493c) {
                            case H2.a.POSITION_NONE /* -2 */:
                                i12 = 0;
                                i11 += i12;
                                break;
                            case -1:
                            case 1:
                                i11 += i12;
                                break;
                            case 0:
                                i12 = 144310272;
                                i11 += i12;
                                break;
                            case 2:
                                i12 = 131072000;
                                i11 += i12;
                                break;
                            case 3:
                            case 4:
                            case 5:
                            case 6:
                                i12 = 131072;
                                i11 += i12;
                                break;
                            default:
                                throw new IllegalArgumentException();
                        }
                    }
                    i10++;
                } else {
                    iMax = Math.max(13107200, i11);
                }
            }
        }
        aVar2.f18470b = iMax;
        m();
    }

    public final int l() {
        Iterator<a> it = this.f18467h.values().iterator();
        int i10 = 0;
        while (it.hasNext()) {
            i10 += it.next().f18470b;
        }
        return i10;
    }

    public final void m() {
        if (!this.f18467h.isEmpty()) {
            this.f18460a.a(l());
            return;
        }
        p272w1.d dVar = this.f18460a;
        synchronized (dVar) {
            if (dVar.f47697a) {
                dVar.a(0);
            }
        }
    }
}
