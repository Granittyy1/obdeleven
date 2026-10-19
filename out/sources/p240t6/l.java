package p240t6;

import com.google.firebase.concurrent.ExecutorsRegistrar;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import p096h7.b;

/* JADX INFO: compiled from: R8$$SyntheticClass */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class l implements b {
    @Override // p096h7.b
    public final Object get() {
        p228s6.l<ScheduledExecutorService> lVar = ExecutorsRegistrar.f28050a;
        return new h(Executors.newCachedThreadPool(new a("Firebase Blocking", 11, null)), ExecutorsRegistrar.f28053d.get());
    }
}
