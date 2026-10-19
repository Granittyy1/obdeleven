package Q3;

import java.util.Collections;
import java.util.Iterator;
import java.util.Set;
import java.util.WeakHashMap;

/* JADX INFO: compiled from: ActivityFragmentLifecycle.java */
/* JADX INFO: loaded from: classes.dex */
public final class a implements e {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Set<f> f5060b = Collections.newSetFromMap(new WeakHashMap());

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f5061c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f5062d;

    public final void a() {
        this.f5061c = true;
        Iterator it = X3.j.d(this.f5060b).iterator();
        while (it.hasNext()) {
            ((f) it.next()).k();
        }
    }

    @Override // Q3.e
    public final void b(f fVar) {
        this.f5060b.remove(fVar);
    }

    @Override // Q3.e
    public final void c(f fVar) {
        this.f5060b.add(fVar);
        if (this.f5062d) {
            fVar.e();
        } else if (this.f5061c) {
            fVar.k();
        } else {
            fVar.a();
        }
    }
}
