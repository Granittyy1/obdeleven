package p131k5;

import android.os.Bundle;
import androidx.collection.C0873a;
import java.util.Iterator;

/* JADX INFO: renamed from: k5.a, reason: case insensitive filesystem */
/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement-impl@@21.6.1 */
/* JADX INFO: loaded from: classes3.dex */
public final class C2481a extends C2538m0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final C0873a f42071b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final C0873a f42072c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public long f42073d;

    public C2481a(C2523i1 c2523i1) {
        super(c2523i1);
        this.f42072c = new C0873a();
        this.f42071b = new C0873a();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void t(long j) {
        C2559r2 c2559r2Y = r().y(false);
        C0873a c0873a = this.f42071b;
        for (String str : (C0873a.c) c0873a.keySet()) {
            w(str, j - ((Long) c0873a.get(str)).longValue(), c2559r2Y);
        }
        if (!c0873a.isEmpty()) {
            v(j - this.f42073d, c2559r2Y);
        }
        y(j);
    }

    public final void u(long j, String str) {
        if (str == null || str.length() == 0) {
            d().f41712f.c("Ad unit id must be a non-empty string");
        } else {
            i().z(new V(this, str, j));
        }
    }

    public final void v(long j, C2559r2 c2559r2) {
        if (c2559r2 == null) {
            d().f41719n.c("Not logging ad exposure. No active activity");
            return;
        }
        if (j < 1000) {
            B0 b0D = d();
            b0D.f41719n.b(Long.valueOf(j), "Not logging ad exposure. Less than 1000 ms. exposure");
        } else {
            Bundle bundle = new Bundle();
            bundle.putLong("_xt", j);
            z3.T(c2559r2, bundle, true);
            q().V(bundle, "am", "_xa");
        }
    }

    public final void w(String str, long j, C2559r2 c2559r2) {
        if (c2559r2 == null) {
            d().f41719n.c("Not logging ad unit exposure. No active activity");
            return;
        }
        if (j < 1000) {
            B0 b0D = d();
            b0D.f41719n.b(Long.valueOf(j), "Not logging ad unit exposure. Less than 1000 ms. exposure");
        } else {
            Bundle bundle = new Bundle();
            bundle.putString("_ai", str);
            bundle.putLong("_xt", j);
            z3.T(c2559r2, bundle, true);
            q().V(bundle, "am", "_xu");
        }
    }

    public final void y(long j) {
        C0873a c0873a = this.f42071b;
        Iterator it = ((C0873a.c) c0873a.keySet()).iterator();
        while (it.hasNext()) {
            c0873a.put((String) it.next(), Long.valueOf(j));
        }
        if (c0873a.isEmpty()) {
            return;
        }
        this.f42073d = j;
    }

    public final void z(long j, String str) {
        if (str == null || str.length() == 0) {
            d().f41712f.c("Ad unit id must be a non-empty string");
        } else {
            i().z(new RunnableC2564t(this, str, j));
        }
    }
}
