package Q3;

import java.util.Collections;
import java.util.Iterator;
import java.util.Set;
import java.util.WeakHashMap;

/* JADX INFO: compiled from: TargetTracker.java */
/* JADX INFO: loaded from: classes.dex */
public final class m implements f {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Set<U3.g<?>> f5095b = Collections.newSetFromMap(new WeakHashMap());

    @Override // Q3.f
    public final void a() {
        Iterator it = X3.j.d(this.f5095b).iterator();
        while (it.hasNext()) {
            ((U3.g) it.next()).a();
        }
    }

    @Override // Q3.f
    public final void e() {
        Iterator it = X3.j.d(this.f5095b).iterator();
        while (it.hasNext()) {
            ((U3.g) it.next()).e();
        }
    }

    @Override // Q3.f
    public final void k() {
        Iterator it = X3.j.d(this.f5095b).iterator();
        while (it.hasNext()) {
            ((U3.g) it.next()).k();
        }
    }
}
