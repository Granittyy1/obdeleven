package kotlin.sequences;

import java.util.Iterator;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: SequencesJVM.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class a<T> implements g<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final AtomicReference<g<T>> f43080a;

    public a(g<? extends T> gVar) {
        this.f43080a = new AtomicReference<>(gVar);
    }

    @Override // kotlin.sequences.g
    public final Iterator<T> iterator() {
        g<T> andSet = this.f43080a.getAndSet(null);
        if (andSet != null) {
            return andSet.iterator();
        }
        throw new IllegalStateException("This sequence can be consumed only once.");
    }
}
