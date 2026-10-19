package A1;

import S4.C0760b;
import android.os.Bundle;
import android.text.TextUtils;
import androidx.collection.C0873a;
import java.util.Collections;
import java.util.Iterator;
import p131k5.B0;
import p131k5.C2523i1;
import p131k5.u3;
import p131k5.y3;

/* JADX INFO: renamed from: A1.n, reason: case insensitive filesystem */
/* JADX INFO: compiled from: DolbyVisionConfig.java */
/* JADX INFO: loaded from: classes.dex */
public final class C0579n implements T4.H, y3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f539a;

    public /* synthetic */ C0579n(Object obj) {
        this.f539a = obj;
    }

    public static C0579n i(p114j1.r rVar) {
        String str;
        rVar.H(2);
        int iU = rVar.u();
        int i10 = iU >> 1;
        int iU2 = ((rVar.u() >> 3) & 31) | ((iU & 1) << 5);
        if (i10 == 4 || i10 == 5 || i10 == 7 || i10 == 8) {
            str = "dvhe";
        } else if (i10 == 9) {
            str = "dvav";
        } else {
            if (i10 != 10) {
                return null;
            }
            str = "dav1";
        }
        StringBuilder sbE = C4.b.e(str);
        sbE.append(i10 < 10 ? ".0" : ".");
        sbE.append(i10);
        sbE.append(iU2 < 10 ? ".0" : ".");
        sbE.append(iU2);
        return new C0579n(sbE.toString());
    }

    @Override // p131k5.y3
    public void a(Bundle bundle, String str, String str2) {
        boolean zIsEmpty = TextUtils.isEmpty(str);
        com.google.android.gms.measurement.internal.h hVar = (com.google.android.gms.measurement.internal.h) this.f539a;
        if (!zIsEmpty) {
            hVar.i().z(new u3(this, str, str2, bundle));
            return;
        }
        C2523i1 c2523i1 = hVar.f26609l;
        if (c2523i1 != null) {
            B0 b10 = c2523i1.f42220i;
            C2523i1.g(b10);
            b10.f41712f.b(str2, "AppId not known when logging event");
        }
    }

    @Override // T4.H
    public void c() {
        T4.K k10 = (T4.K) this.f539a;
        k10.f5867c.lock();
        try {
            k10.f5876m = new T4.C(k10, k10.j, k10.f5874k, k10.f5870f, k10.f5875l, k10.f5867c, k10.f5869e);
            k10.f5876m.f();
            k10.f5868d.signalAll();
        } finally {
            k10.f5867c.unlock();
        }
    }

    @Override // T4.H
    public void f() {
        T4.K k10 = (T4.K) this.f539a;
        Iterator it = ((C0873a.e) k10.f5872h.values()).iterator();
        while (it.hasNext()) {
            ((com.google.android.gms.common.api.a.e) it.next()).a();
        }
        k10.f5878o.f5858q = Collections.emptySet();
    }

    @Override // T4.H
    public boolean g() {
        return true;
    }

    @Override // T4.H
    public com.google.android.gms.common.api.internal.a h(com.google.android.gms.common.api.internal.a aVar) {
        throw new IllegalStateException("GoogleApiClient is not connected yet.");
    }

    @Override // T4.H
    public void b(Bundle bundle) {
    }

    @Override // T4.H
    public void e(int i10) {
    }

    @Override // T4.H
    public void d(C0760b c0760b, com.google.android.gms.common.api.a aVar, boolean z10) {
    }
}
