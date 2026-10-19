package p297y1;

import android.content.Context;
import android.hardware.display.DisplayManager;
import android.os.Handler;
import android.os.SystemClock;
import android.view.Surface;
import androidx.media3.exoplayer.ExoPlaybackException;
import p114j1.A;
import p114j1.c;
import p114j1.t;
import p241t7.b;

/* JADX INFO: compiled from: VideoFrameReleaseControl.java */
/* JADX INFO: loaded from: classes.dex */
public final class o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final f f48160a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final q f48161b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f48162c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f48163d;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public long f48166g;
    public boolean j;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public boolean f48171m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public boolean f48172n;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f48164e = 0;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public long f48165f = -9223372036854775807L;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public long f48167h = -9223372036854775807L;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public long f48168i = -9223372036854775807L;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public float f48169k = 1.0f;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public t f48170l = c.f41011a;

    /* JADX INFO: compiled from: VideoFrameReleaseControl.java */
    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public long f48173a = -9223372036854775807L;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public long f48174b = -9223372036854775807L;
    }

    public o(Context context, f fVar, long j) {
        this.f48160a = fVar;
        this.f48162c = j;
        this.f48161b = new q(context);
    }

    /* JADX WARN: Code duplicated, block: B:24:0x0074  */
    /* JADX WARN: Code duplicated, block: B:59:0x010b  */
    public final int a(long j, long j10, long j11, long j12, boolean z10, boolean z11, a aVar) throws ExoPlaybackException {
        boolean z12;
        long j13;
        long j14;
        boolean z13;
        aVar.f48173a = -9223372036854775807L;
        aVar.f48174b = -9223372036854775807L;
        if (this.f48165f == -9223372036854775807L) {
            this.f48165f = j10;
        }
        if (this.f48167h != j) {
            q qVar = this.f48161b;
            long j15 = qVar.f48187n;
            if (j15 != -1) {
                qVar.f48189p = j15;
                qVar.f48190q = qVar.f48188o;
            }
            qVar.f48186m++;
            long j16 = j * 1000;
            e eVar = qVar.f48175a;
            eVar.f48037a.b(j16);
            if (eVar.f48037a.a()) {
                eVar.f48039c = false;
            } else if (eVar.f48040d != -9223372036854775807L) {
                if (eVar.f48039c) {
                    e.a aVar2 = eVar.f48038b;
                    long j17 = aVar2.f48045d;
                    if (j17 == 0) {
                        z13 = false;
                    } else {
                        z13 = aVar2.f48048g[(int) ((j17 - 1) % 15)];
                    }
                    if (z13) {
                        eVar.f48038b.c();
                        eVar.f48038b.b(eVar.f48040d);
                    }
                } else {
                    eVar.f48038b.c();
                    eVar.f48038b.b(eVar.f48040d);
                }
                eVar.f48039c = true;
                eVar.f48038b.b(j16);
            }
            if (eVar.f48039c && eVar.f48038b.a()) {
                e.a aVar3 = eVar.f48037a;
                eVar.f48037a = eVar.f48038b;
                eVar.f48038b = aVar3;
                eVar.f48039c = false;
            }
            eVar.f48040d = j16;
            eVar.f48041e = eVar.f48037a.a() ? 0 : eVar.f48041e + 1;
            qVar.c();
            this.f48167h = j;
        }
        long jF = (long) ((j - j10) / ((double) this.f48169k));
        if (this.f48163d) {
            this.f48170l.getClass();
            jF -= A.F(SystemClock.elapsedRealtime()) - j11;
        }
        long j18 = jF;
        aVar.f48173a = j18;
        if (z10 && !z11) {
            return 3;
        }
        if (!this.f48171m) {
            this.f48172n = true;
            if (this.f48160a.U0(j18, j10, z11, true)) {
                return 4;
            }
            return (!this.f48163d || aVar.f48173a >= 30000) ? 5 : 3;
        }
        if (this.f48168i == -9223372036854775807L || this.j) {
            int i10 = this.f48164e;
            if (i10 != 0) {
                if (i10 != 1) {
                    if (i10 != 2) {
                        if (i10 != 3) {
                            throw new IllegalStateException();
                        }
                        this.f48170l.getClass();
                        long jF2 = A.F(SystemClock.elapsedRealtime()) - this.f48166g;
                        if (!this.f48163d || j18 >= -30000 || jF2 <= 100000) {
                            z12 = false;
                        }
                    } else if (j10 < j12) {
                        z12 = false;
                    }
                }
                z12 = true;
            } else {
                z12 = this.f48163d;
            }
        } else {
            z12 = false;
        }
        if (z12) {
            return 0;
        }
        if (!this.f48163d || j10 == this.f48165f) {
            return 5;
        }
        this.f48170l.getClass();
        long jNanoTime = System.nanoTime();
        q qVar2 = this.f48161b;
        long j19 = (aVar.f48173a * 1000) + jNanoTime;
        if (qVar2.f48189p != -1 && qVar2.f48175a.f48037a.a()) {
            e eVar2 = qVar2.f48175a;
            if (eVar2.f48037a.a()) {
                e.a aVar4 = eVar2.f48037a;
                long j20 = aVar4.f48046e;
                j14 = j20 == 0 ? 0L : aVar4.f48047f / j20;
            } else {
                j14 = -9223372036854775807L;
            }
            long j21 = qVar2.f48190q + ((long) (((qVar2.f48186m - qVar2.f48189p) * j14) / qVar2.f48183i));
            if (Math.abs(j19 - j21) <= 20000000) {
                j19 = j21;
            } else {
                qVar2.f48186m = 0L;
                qVar2.f48189p = -1L;
                qVar2.f48187n = -1L;
            }
        }
        qVar2.f48187n = qVar2.f48186m;
        qVar2.f48188o = j19;
        q.b bVar = qVar2.f48177c;
        if (bVar != null && qVar2.f48184k != -9223372036854775807L) {
            long j22 = bVar.f48194b;
            if (j22 != -9223372036854775807L) {
                long j23 = qVar2.f48184k;
                long j24 = (((j19 - j22) / j23) * j23) + j22;
                if (j19 <= j24) {
                    j13 = j24 - j23;
                } else {
                    j13 = j24;
                    j24 = j23 + j24;
                }
                if (j24 - j19 >= j19 - j13) {
                    j24 = j13;
                }
                j19 = j24 - qVar2.f48185l;
            }
        }
        aVar.f48174b = j19;
        long j25 = (j19 - jNanoTime) / 1000;
        aVar.f48173a = j25;
        boolean z14 = (this.f48168i == -9223372036854775807L || this.j) ? false : true;
        if (this.f48160a.U0(j25, j10, z11, z14)) {
            return 4;
        }
        long j26 = aVar.f48173a;
        if (j26 < -30000 && !z11) {
            return z14 ? 3 : 2;
        }
        return j26 > 50000 ? 5 : 1;
    }

    public final boolean b(boolean z10) {
        if (z10 && (this.f48164e == 3 || (!this.f48171m && this.f48172n))) {
            this.f48168i = -9223372036854775807L;
            return true;
        }
        if (this.f48168i == -9223372036854775807L) {
            return false;
        }
        this.f48170l.getClass();
        if (SystemClock.elapsedRealtime() < this.f48168i) {
            return true;
        }
        this.f48168i = -9223372036854775807L;
        return false;
    }

    public final void c(boolean z10) {
        long jElapsedRealtime;
        this.j = z10;
        long j = this.f48162c;
        if (j > 0) {
            this.f48170l.getClass();
            jElapsedRealtime = SystemClock.elapsedRealtime() + j;
        } else {
            jElapsedRealtime = -9223372036854775807L;
        }
        this.f48168i = jElapsedRealtime;
    }

    public final void d(int i10) {
        this.f48164e = Math.min(this.f48164e, i10);
    }

    public final void e() {
        this.f48163d = true;
        this.f48170l.getClass();
        this.f48166g = A.F(SystemClock.elapsedRealtime());
        q qVar = this.f48161b;
        qVar.f48178d = true;
        qVar.f48186m = 0L;
        qVar.f48189p = -1L;
        qVar.f48187n = -1L;
        q.a aVar = qVar.f48176b;
        if (aVar != null) {
            q.b bVar = qVar.f48177c;
            bVar.getClass();
            bVar.f48195c.sendEmptyMessage(2);
            Handler handlerK = A.k(null);
            DisplayManager displayManager = aVar.f48191a;
            displayManager.registerDisplayListener(aVar, handlerK);
            q.a(q.this, displayManager.getDisplay(0));
        }
        qVar.d(false);
    }

    public final void f() {
        this.f48163d = false;
        this.f48168i = -9223372036854775807L;
        q qVar = this.f48161b;
        qVar.f48178d = false;
        q.a aVar = qVar.f48176b;
        if (aVar != null) {
            aVar.f48191a.unregisterDisplayListener(aVar);
            q.b bVar = qVar.f48177c;
            bVar.getClass();
            bVar.f48195c.sendEmptyMessage(3);
        }
        qVar.b();
    }

    public final void g(Surface surface) {
        this.f48171m = surface != null;
        this.f48172n = false;
        q qVar = this.f48161b;
        if (qVar.f48179e != surface) {
            qVar.b();
            qVar.f48179e = surface;
            qVar.d(true);
        }
        d(1);
    }

    public final void h(float f10) {
        b.e(f10 > 0.0f);
        if (f10 == this.f48169k) {
            return;
        }
        this.f48169k = f10;
        q qVar = this.f48161b;
        qVar.f48183i = f10;
        qVar.f48186m = 0L;
        qVar.f48189p = -1L;
        qVar.f48187n = -1L;
        qVar.d(false);
    }
}
