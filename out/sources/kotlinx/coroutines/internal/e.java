package kotlinx.coroutines.internal;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlinx.coroutines.internal.e;

/* JADX INFO: compiled from: ConcurrentLinkedList.kt */
/* JADX INFO: loaded from: classes2.dex */
public abstract class e<N extends e<N>> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f43471b = AtomicReferenceFieldUpdater.newUpdater(e.class, Object.class, "_next$volatile");

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f43472c = AtomicReferenceFieldUpdater.newUpdater(e.class, Object.class, "_prev$volatile");
    private volatile /* synthetic */ Object _next$volatile;
    private volatile /* synthetic */ Object _prev$volatile;

    public e(v vVar) {
        this._prev$volatile = vVar;
    }

    public final void b() {
        f43472c.set(this, null);
    }

    public final N c() {
        Object obj = f43471b.get(this);
        if (obj == d.f43470a) {
            return null;
        }
        return (N) obj;
    }

    public abstract boolean d();

    public final void e() {
        e eVarC;
        if (c() == null) {
            return;
        }
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f43472c;
            e eVar = (e) atomicReferenceFieldUpdater.get(this);
            while (eVar != null && eVar.d()) {
                eVar = (e) atomicReferenceFieldUpdater.get(eVar);
            }
            e eVarC2 = c();
            kotlin.jvm.internal.i.b(eVarC2);
            while (eVarC2.d() && (eVarC = eVarC2.c()) != null) {
                eVarC2 = eVarC;
            }
            while (true) {
                Object obj = atomicReferenceFieldUpdater.get(eVarC2);
                e eVar2 = ((e) obj) == null ? null : eVar;
                while (true) {
                    if (atomicReferenceFieldUpdater.compareAndSet(eVarC2, obj, eVar2)) {
                        break;
                    } else if (atomicReferenceFieldUpdater.get(eVarC2) != obj) {
                    }
                }
            }
            if (eVar != null) {
                f43471b.set(eVar, eVarC2);
            }
            if (!eVarC2.d() || eVarC2.c() == null) {
                if (eVar == null || !eVar.d()) {
                    return;
                }
            }
        }
    }
}
