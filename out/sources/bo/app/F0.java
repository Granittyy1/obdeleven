package bo.app;

import androidx.recyclerview.widget.LinearLayoutManager;
import com.google.firebase.messaging.FirebaseMessagingRegistrar;
import com.voltasit.obdeleven.data.providers.RemoteConfigCoreProviderImpl;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import p134k8.A1;

/* JADX INFO: compiled from: R8$$SyntheticClass */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class F0 implements p191p5.c, p228s6.d, i8.i.b {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f20658b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f20659c;

    public /* synthetic */ F0(int i10, Object obj) {
        this.f20658b = i10;
        this.f20659c = obj;
    }

    @Override // i8.i.b
    public void a() {
        p182o9.c cVar = (p182o9.c) this.f20659c;
        p110i9.p pVar = cVar.f45243x;
        LinearLayoutManager linearLayoutManager = pVar.f36821d;
        List listSubList = pVar.f36779a.subList(linearLayoutManager.Q0(), linearLayoutManager.R0() + 1);
        ArrayList arrayList = new ArrayList();
        Iterator it = listSubList.iterator();
        while (it.hasNext()) {
            arrayList.add(((A1) it.next()).f42568a);
        }
        ((p109i8.i) cVar.f31997n).v(arrayList, cVar);
    }

    @Override // p191p5.c
    public void e(p191p5.g it) {
        switch (this.f20658b) {
            case 0:
                t1.a((t1) this.f20659c, it);
                break;
            default:
                RemoteConfigCoreProviderImpl this$0 = (RemoteConfigCoreProviderImpl) this.f20659c;
                kotlin.jvm.internal.i.e(this$0, "this$0");
                kotlin.jvm.internal.i.e(it, "it");
                boolean zO = it.o();
                J8.p pVar = this$0.f30247a;
                if (!zO) {
                    pVar.b("RemoteConfigCoreProviderImpl", "Update failed: " + it.j());
                } else {
                    pVar.f("RemoteConfigCoreProviderImpl", "Config params updated: " + it.k());
                }
                break;
        }
    }

    @Override // p228s6.d
    public Object f(p228s6.q qVar) {
        return FirebaseMessagingRegistrar.lambda$getComponents$0((p228s6.p) this.f20659c, qVar);
    }
}
