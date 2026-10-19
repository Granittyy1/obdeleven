package Z6;

import A1.C0579n;
import com.google.android.gms.internal.measurement.C1787c0;

/* JADX INFO: compiled from: HeadlessInAppMessagingModule_ProvidesHeadlesssSingletonFactory.java */
/* JADX INFO: loaded from: classes3.dex */
public final class d implements p268va.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f7927a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f7928b;

    public /* synthetic */ d(int i10, Object obj) {
        this.f7927a = i10;
        this.f7928b = obj;
    }

    @Override // p268va.a
    public final Object get() {
        switch (this.f7927a) {
            case 0:
                S6.j jVar = (S6.j) ((C0579n) this.f7928b).f539a;
                p006a5.a.b(jVar);
                return jVar;
            default:
                p192p6.a aVar = ((p046d7.o) this.f7928b).f34612n.get();
                C1787c0.e(aVar);
                return aVar;
        }
    }
}
