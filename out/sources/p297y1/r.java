package p297y1;

import K5.q;
import android.os.SystemClock;
import androidx.activity.j;
import androidx.media3.exoplayer.ExoPlaybackException;
import com.voltasit.obdeleven.presentation.history.child.b;
import java.util.NoSuchElementException;
import p078g1.F;
import p078g1.n;
import p078g1.t;
import p114j1.A;
import p114j1.l;
import p114j1.v;

/* JADX INFO: compiled from: VideoFrameRenderControl.java */
/* JADX INFO: loaded from: classes.dex */
public final class r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final d.a f48198a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final o f48199b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final o.a f48200c = new o.a();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final v<F> f48201d = new v<>();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final v<Long> f48202e = new v<>();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final l f48203f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public long f48204g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public long f48205h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public long f48206i;
    public F j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public long f48207k;

    public r(d.a aVar, o oVar) {
        this.f48198a = aVar;
        this.f48199b = oVar;
        l lVar = new l();
        int iHighestOneBit = Integer.bitCount(16) != 1 ? Integer.highestOneBit(15) << 1 : 16;
        lVar.f41037a = 0;
        lVar.f41038b = 0;
        lVar.f41039c = new long[iHighestOneBit];
        lVar.f41040d = iHighestOneBit - 1;
        this.f48203f = lVar;
        this.f48204g = -9223372036854775807L;
        this.j = F.f35228d;
        this.f48205h = -9223372036854775807L;
        this.f48206i = -9223372036854775807L;
    }

    public final void a(long j, long j10) throws ExoPlaybackException {
        while (true) {
            l lVar = this.f48203f;
            int i10 = lVar.f41038b;
            if (i10 == 0) {
                return;
            }
            if (i10 == 0) {
                throw new NoSuchElementException();
            }
            long j11 = lVar.f41039c[lVar.f41037a];
            Long lF = this.f48202e.f(j11);
            o oVar = this.f48199b;
            if (lF != null && lF.longValue() != this.f48207k) {
                this.f48207k = lF.longValue();
                oVar.d(2);
            }
            long j12 = this.f48207k;
            o.a aVar = this.f48200c;
            int iA = this.f48199b.a(j11, j, j10, j12, false, false, aVar);
            d.a aVar2 = this.f48198a;
            d dVar = d.this;
            if (iA == 0 || iA == 1) {
                this.f48205h = j11;
                boolean z10 = iA == 0;
                long jA = lVar.a();
                F f10 = this.f48201d.f(jA);
                if (f10 != null && !f10.equals(F.f35228d) && !f10.equals(this.j)) {
                    this.j = f10;
                    n.a aVar3 = new n.a();
                    aVar3.f35345t = f10.f35229a;
                    aVar3.f35346u = f10.f35230b;
                    aVar3.f35338m = t.m("video/raw");
                    aVar2.f48035a = new n(aVar3);
                    dVar.f48034i.execute(new b(aVar2, 4, f10));
                }
                long j13 = z10 ? -1L : aVar.f48174b;
                boolean z11 = oVar.f48164e != 3;
                oVar.f48164e = 3;
                oVar.f48170l.getClass();
                oVar.f48166g = A.F(SystemClock.elapsedRealtime());
                if (z11 && dVar.f48030e != null) {
                    dVar.f48034i.execute(new j(5, aVar2));
                }
                n nVar = aVar2.f48035a;
                n nVar2 = nVar == null ? new n(new n.a()) : nVar;
                n nVar3 = dVar.j;
                dVar.f48027b.getClass();
                nVar3.g(jA, System.nanoTime(), nVar2, null);
                ((z) dVar.f48029d.remove()).a(j13);
            } else if (iA == 2 || iA == 3) {
                this.f48205h = j11;
                lVar.a();
                dVar.f48034i.execute(new q(5, aVar2));
                ((z) dVar.f48029d.remove()).skip();
            } else {
                if (iA != 4) {
                    if (iA != 5) {
                        throw new IllegalStateException(String.valueOf(iA));
                    }
                    return;
                }
                this.f48205h = j11;
            }
        }
    }
}
