package p228s6;

import java.util.Collections;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import p096h7.b;

/* JADX INFO: compiled from: LazySet.java */
/* JADX INFO: loaded from: classes3.dex */
public final class m<T> implements b<Set<T>> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public volatile Set<b<T>> f46971a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public volatile Set<T> f46972b;

    public m() {
        throw null;
    }

    @Override // p096h7.b
    public final Object get() {
        if (this.f46972b == null) {
            synchronized (this) {
                try {
                    if (this.f46972b == null) {
                        this.f46972b = Collections.newSetFromMap(new ConcurrentHashMap());
                        synchronized (this) {
                            try {
                                Iterator<b<T>> it = this.f46971a.iterator();
                                while (it.hasNext()) {
                                    this.f46972b.add(it.next().get());
                                }
                                this.f46971a = null;
                            } catch (Throwable th) {
                                throw th;
                            }
                        }
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        return Collections.unmodifiableSet(this.f46972b);
    }
}
