package Q6;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicMarkableReference;
import p313z6.n;

/* JADX INFO: compiled from: R8$$SyntheticClass */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class b implements Callable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f5107b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f5108c;

    public /* synthetic */ b(int i10, Object obj) {
        this.f5107b = i10;
        this.f5108c = obj;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() throws Throwable {
        Map<String, String> mapUnmodifiableMap;
        switch (this.f5107b) {
            case 0:
                com.google.firebase.heartbeatinfo.a aVar = (com.google.firebase.heartbeatinfo.a) this.f5108c;
                synchronized (aVar) {
                    ((h) aVar.f28126a.get()).h(System.currentTimeMillis(), aVar.f28128c.get().a());
                    break;
                }
                return null;
            default:
                n.a aVar2 = (n.a) this.f5108c;
                aVar2.f48900b.set(null);
                synchronized (aVar2) {
                    if (aVar2.f48899a.isMarked()) {
                        p313z6.d reference = aVar2.f48899a.getReference();
                        synchronized (reference) {
                            mapUnmodifiableMap = Collections.unmodifiableMap(new HashMap(reference.f48858a));
                        }
                        AtomicMarkableReference<p313z6.d> atomicMarkableReference = aVar2.f48899a;
                        atomicMarkableReference.set(atomicMarkableReference.getReference(), false);
                    } else {
                        mapUnmodifiableMap = null;
                    }
                }
                if (mapUnmodifiableMap != null) {
                    n nVar = aVar2.f48902d;
                    nVar.f48892a.g(nVar.f48894c, mapUnmodifiableMap, aVar2.f48901c);
                }
                return null;
        }
    }
}
