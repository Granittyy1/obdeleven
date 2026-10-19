package Z6;

import com.google.android.gms.internal.measurement.C1787c0;
import p033c7.A;

/* JADX INFO: compiled from: InflaterModule_InAppMessageLayoutConfigFactory.java */
/* JADX INFO: loaded from: classes3.dex */
public final class p implements p268va.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f7951a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f7952b;

    public /* synthetic */ p(int i10, Object obj) {
        this.f7951a = i10;
        this.f7952b = obj;
    }

    @Override // p268va.a
    public final Object get() {
        switch (this.f7951a) {
            case 0:
                W6.n nVar = ((o) this.f7952b).f7949b;
                p006a5.a.b(nVar);
                return nVar;
            default:
                A a10 = ((p046d7.o) this.f7952b).f34620v.get();
                C1787c0.e(a10);
                return a10;
        }
    }
}
