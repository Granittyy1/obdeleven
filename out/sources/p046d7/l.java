package p046d7;

import C7.o;
import com.google.android.gms.internal.measurement.C1787c0;
import p033c7.U;
import p096h7.b;
import p111ia.c;
import p268va.a;

/* JADX INFO: compiled from: DaggerAppComponent.java */
/* JADX INFO: loaded from: classes3.dex */
public final class l implements a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f34593a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f34594b;

    public /* synthetic */ l(int i10, Object obj) {
        this.f34593a = i10;
        this.f34594b = obj;
    }

    @Override // p268va.a
    public final Object get() {
        switch (this.f34593a) {
            case 0:
                U u10 = ((o) this.f34594b).f34603d.get();
                C1787c0.e(u10);
                return u10;
            default:
                b<o> bVar = ((p229s7.a) this.f34594b).f46990c;
                c.d(bVar);
                return bVar;
        }
    }
}
