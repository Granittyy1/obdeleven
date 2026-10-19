package p240t6;

import com.google.firebase.concurrent.ExecutorsRegistrar;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import p096h7.b;
import p228s6.l;

/* JADX INFO: compiled from: R8$$SyntheticClass */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class m implements b {
    @Override // p096h7.b
    public final Object get() {
        l<ScheduledExecutorService> lVar = ExecutorsRegistrar.f28050a;
        return Executors.newSingleThreadScheduledExecutor(new a("Firebase Scheduler", 0, null));
    }
}
