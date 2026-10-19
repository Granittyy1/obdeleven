package androidx.lifecycle;

import java.io.Closeable;
import java.util.Arrays;
import java.util.Iterator;

/* JADX INFO: compiled from: ViewModel.jvm.kt */
/* JADX INFO: loaded from: classes.dex */
public abstract class Y {
    private final p040d1.c impl;

    public Y() {
        this.impl = new p040d1.c();
    }

    public final void addCloseable(String key, AutoCloseable closeable) {
        kotlin.jvm.internal.i.e(key, "key");
        kotlin.jvm.internal.i.e(closeable, "closeable");
        p040d1.c cVar = this.impl;
        if (cVar != null) {
            cVar.b(key, closeable);
        }
    }

    public final void clear$lifecycle_viewmodel_release() {
        p040d1.c cVar = this.impl;
        if (cVar != null && !cVar.f34483d) {
            cVar.f34483d = true;
            synchronized (cVar.f34480a) {
                try {
                    Iterator it = cVar.f34481b.values().iterator();
                    while (it.hasNext()) {
                        p040d1.c.c((AutoCloseable) it.next());
                    }
                    Iterator it2 = cVar.f34482c.iterator();
                    while (it2.hasNext()) {
                        p040d1.c.c((AutoCloseable) it2.next());
                    }
                    cVar.f34482c.clear();
                    p293xa.r rVar = p293xa.r.f47939a;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        onCleared();
    }

    public final <T extends AutoCloseable> T getCloseable(String key) {
        T t8;
        kotlin.jvm.internal.i.e(key, "key");
        p040d1.c cVar = this.impl;
        if (cVar == null) {
            return null;
        }
        synchronized (cVar.f34480a) {
            t8 = (T) cVar.f34481b.get(key);
        }
        return t8;
    }

    public void addCloseable(AutoCloseable closeable) {
        kotlin.jvm.internal.i.e(closeable, "closeable");
        p040d1.c cVar = this.impl;
        if (cVar != null) {
            cVar.a(closeable);
        }
    }

    public Y(kotlinx.coroutines.A viewModelScope) {
        kotlin.jvm.internal.i.e(viewModelScope, "viewModelScope");
        this.impl = new p040d1.c(viewModelScope);
    }

    @p293xa.d
    public /* synthetic */ void addCloseable(Closeable closeable) {
        kotlin.jvm.internal.i.e(closeable, "closeable");
        p040d1.c cVar = this.impl;
        if (cVar != null) {
            cVar.a(closeable);
        }
    }

    public Y(AutoCloseable... closeables) {
        kotlin.jvm.internal.i.e(closeables, "closeables");
        this.impl = new p040d1.c((AutoCloseable[]) Arrays.copyOf(closeables, closeables.length));
    }

    public Y(kotlinx.coroutines.A viewModelScope, AutoCloseable... closeables) {
        kotlin.jvm.internal.i.e(viewModelScope, "viewModelScope");
        kotlin.jvm.internal.i.e(closeables, "closeables");
        this.impl = new p040d1.c(viewModelScope, (AutoCloseable[]) Arrays.copyOf(closeables, closeables.length));
    }

    @p293xa.d
    public /* synthetic */ Y(Closeable... closeables) {
        kotlin.jvm.internal.i.e(closeables, "closeables");
        this.impl = new p040d1.c((AutoCloseable[]) Arrays.copyOf(closeables, closeables.length));
    }

    public void onCleared() {
    }
}
