package p131k5;

import U4.C0804l;
import android.app.Activity;
import android.os.Bundle;
import android.os.SystemClock;
import java.util.Objects;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: renamed from: k5.t2, reason: case insensitive filesystem */
/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement-impl@@21.6.1 */
/* JADX INFO: loaded from: classes3.dex */
public final class C2567t2 extends AbstractC2589z0 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public volatile C2559r2 f42463c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public volatile C2559r2 f42464d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public C2559r2 f42465e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final ConcurrentHashMap f42466f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public Activity f42467g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public volatile boolean f42468h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public volatile C2559r2 f42469i;
    public C2559r2 j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public boolean f42470k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final Object f42471l;

    public C2567t2(C2523i1 c2523i1) {
        super(c2523i1);
        this.f42471l = new Object();
        this.f42466f = new ConcurrentHashMap();
    }

    public final void A(Activity activity, C2559r2 c2559r2, boolean z10) {
        C2559r2 c2559r3;
        C2559r2 c2559r4 = this.f42463c == null ? this.f42464d : this.f42463c;
        if (c2559r2.f42436b == null) {
            c2559r3 = new C2559r2(c2559r2.f42435a, activity != null ? w(activity.getClass()) : null, c2559r2.f42437c, c2559r2.f42439e, c2559r2.f42440f);
        } else {
            c2559r3 = c2559r2;
        }
        this.f42464d = this.f42463c;
        this.f42463c = c2559r3;
        ((C2523i1) this.f3968a).f42224n.getClass();
        i().z(new RunnableC2575v2(this, c2559r3, c2559r4, SystemClock.elapsedRealtime(), z10));
    }

    /* JADX WARN: Code duplicated, block: B:12:0x0030  */
    /* JADX WARN: Code duplicated, block: B:50:0x00b3  */
    public final void B(C2559r2 c2559r2, C2559r2 c2559r3, long j, boolean z10, Bundle bundle) {
        boolean z11;
        long j10;
        p();
        boolean z12 = false;
        if (c2559r3 != null) {
            if (c2559r3.f42437c == c2559r2.f42437c && Objects.equals(c2559r3.f42436b, c2559r2.f42436b) && Objects.equals(c2559r3.f42435a, c2559r2.f42435a)) {
                z11 = false;
            } else {
                z11 = true;
            }
        } else {
            z11 = true;
        }
        if (z10 && this.f42465e != null) {
            z12 = true;
        }
        boolean z13 = c2559r2.f42439e;
        C2523i1 c2523i1 = (C2523i1) this.f3968a;
        if (z11) {
            Bundle bundle2 = bundle != null ? new Bundle(bundle) : new Bundle();
            z3.T(c2559r2, bundle2, true);
            if (c2559r3 != null) {
                String str = c2559r3.f42435a;
                if (str != null) {
                    bundle2.putString("_pn", str);
                }
                String str2 = c2559r3.f42436b;
                if (str2 != null) {
                    bundle2.putString("_pc", str2);
                }
                bundle2.putLong("_pi", c2559r3.f42437c);
            }
            if (z12) {
                C2500d3 c2500d3 = s().f42063f;
                long j11 = j - c2500d3.f42142b;
                c2500d3.f42142b = j;
                if (j11 > 0) {
                    o().H(bundle2, j11);
                }
            }
            if (!c2523i1.f42218g.E()) {
                bundle2.putLong("_mst", 1L);
            }
            String str3 = z13 ? "app" : "auto";
            c2523i1.f42224n.getClass();
            long jCurrentTimeMillis = System.currentTimeMillis();
            if (z13) {
                long j12 = c2559r2.f42440f;
                if (j12 != 0) {
                    j10 = j12;
                } else {
                    j10 = jCurrentTimeMillis;
                }
            } else {
                j10 = jCurrentTimeMillis;
            }
            q().w(j10, bundle2, str3, "_vs");
        }
        if (z12) {
            C(this.f42465e, true, j);
        }
        this.f42465e = c2559r2;
        if (z13) {
            this.j = c2559r2;
        }
        C2587y2 c2587y2R = c2523i1.r();
        c2587y2R.p();
        c2587y2R.t();
        c2587y2R.w(new Y1(c2587y2R, c2559r2, 1));
    }

    public final void C(C2559r2 c2559r2, boolean z10, long j) {
        C2523i1 c2523i1 = (C2523i1) this.f3968a;
        C2481a c2481aM = c2523i1.m();
        c2523i1.f42224n.getClass();
        c2481aM.t(SystemClock.elapsedRealtime());
        if (!s().f42063f.a(c2559r2 != null && c2559r2.f42438d, z10, j) || c2559r2 == null) {
            return;
        }
        c2559r2.f42438d = false;
    }

    public final C2559r2 D(Activity activity) {
        C0804l.h(activity);
        C2559r2 c2559r2 = (C2559r2) this.f42466f.get(activity);
        if (c2559r2 == null) {
            C2559r2 c2559r3 = new C2559r2(null, w(activity.getClass()), o().A0());
            this.f42466f.put(activity, c2559r3);
            c2559r2 = c2559r3;
        }
        return this.f42469i != null ? this.f42469i : c2559r2;
    }

    @Override // p131k5.AbstractC2589z0
    public final boolean v() {
        return false;
    }

    public final String w(Class cls) {
        String canonicalName = cls.getCanonicalName();
        if (canonicalName == null) {
            return "Activity";
        }
        String[] strArrSplit = canonicalName.split("\\.");
        String str = strArrSplit.length > 0 ? strArrSplit[strArrSplit.length - 1] : "";
        int length = str.length();
        C2523i1 c2523i1 = (C2523i1) this.f3968a;
        return length > c2523i1.f42218g.r(null, false) ? str.substring(0, c2523i1.f42218g.r(null, false)) : str;
    }

    public final C2559r2 y(boolean z10) {
        t();
        p();
        if (!z10) {
            return this.f42465e;
        }
        C2559r2 c2559r2 = this.f42465e;
        return c2559r2 != null ? c2559r2 : this.j;
    }

    public final void z(Activity activity, Bundle bundle) {
        Bundle bundle2;
        if (!((C2523i1) this.f3968a).f42218g.E() || bundle == null || (bundle2 = bundle.getBundle("com.google.app_measurement.screen_service")) == null) {
            return;
        }
        this.f42466f.put(activity, new C2559r2(bundle2.getString("name"), bundle2.getString("referrer_name"), bundle2.getLong("id")));
    }
}
