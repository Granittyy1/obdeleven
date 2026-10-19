package p046d7;

import com.google.android.gms.internal.measurement.C1787c0;
import p033c7.P;
import p108i7.c;
import p268va.a;

/* JADX INFO: compiled from: DaggerAppComponent.java */
/* JADX INFO: loaded from: classes3.dex */
public final class k implements a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f34591a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f34592b;

    public /* synthetic */ k(int i10, Object obj) {
        this.f34591a = i10;
        this.f34592b = obj;
    }

    @Override // p268va.a
    public final Object get() {
        switch (this.f34591a) {
            case 0:
                P p10 = ((o) this.f34592b).f34611m.get();
                C1787c0.e(p10);
                return p10;
            default:
                c cVar = ((p229s7.a) this.f34592b).f46989b;
                p111ia.c.d(cVar);
                return cVar;
        }
    }
}
