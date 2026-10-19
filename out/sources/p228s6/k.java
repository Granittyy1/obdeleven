package p228s6;

import P6.b;
import P6.c;
import P6.d;
import com.google.firebase.concurrent.UiExecutor;
import com.google.firebase.messaging.C2058v;
import java.util.ArrayDeque;
import java.util.HashMap;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: EventBus.java */
/* JADX INFO: loaded from: classes3.dex */
public final class k implements d, c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final HashMap f46965a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public ArrayDeque f46966b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final UiExecutor f46967c;

    public k() {
        UiExecutor uiExecutor = UiExecutor.f28070b;
        this.f46965a = new HashMap();
        this.f46966b = new ArrayDeque();
        this.f46967c = uiExecutor;
    }

    @Override // P6.d
    public final void a(b bVar) {
        c(this.f46967c, bVar);
    }

    @Override // P6.d
    public final synchronized void b(C2058v c2058v) {
        c2058v.getClass();
        if (this.f46965a.containsKey(p144l6.b.class)) {
            ConcurrentHashMap concurrentHashMap = (ConcurrentHashMap) this.f46965a.get(p144l6.b.class);
            concurrentHashMap.remove(c2058v);
            if (concurrentHashMap.isEmpty()) {
                this.f46965a.remove(p144l6.b.class);
            }
        }
    }

    @Override // P6.d
    public final synchronized void c(Executor executor, b bVar) {
        try {
            executor.getClass();
            if (!this.f46965a.containsKey(p144l6.b.class)) {
                this.f46965a.put(p144l6.b.class, new ConcurrentHashMap());
            }
            ((ConcurrentHashMap) this.f46965a.get(p144l6.b.class)).put(bVar, executor);
        } catch (Throwable th) {
            throw th;
        }
    }
}
