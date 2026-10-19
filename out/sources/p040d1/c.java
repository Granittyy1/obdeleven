package p040d1;

import D2.V;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import kotlin.collections.p;
import kotlin.jvm.internal.i;
import kotlinx.coroutines.A;
import p293xa.r;

/* JADX INFO: compiled from: ViewModelImpl.kt */
/* JADX INFO: loaded from: classes.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final V f34480a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final LinkedHashMap f34481b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final LinkedHashSet f34482c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public volatile boolean f34483d;

    public c() {
        this.f34480a = new V();
        this.f34481b = new LinkedHashMap();
        this.f34482c = new LinkedHashSet();
    }

    public static void c(AutoCloseable autoCloseable) {
        if (autoCloseable != null) {
            try {
                autoCloseable.close();
            } catch (Exception e10) {
                throw new RuntimeException(e10);
            }
        }
    }

    public final void a(AutoCloseable closeable) {
        i.e(closeable, "closeable");
        if (this.f34483d) {
            c(closeable);
            return;
        }
        synchronized (this.f34480a) {
            this.f34482c.add(closeable);
            r rVar = r.f47939a;
        }
    }

    public final void b(String key, AutoCloseable closeable) {
        AutoCloseable autoCloseable;
        i.e(key, "key");
        i.e(closeable, "closeable");
        if (this.f34483d) {
            c(closeable);
            return;
        }
        synchronized (this.f34480a) {
            autoCloseable = (AutoCloseable) this.f34481b.put(key, closeable);
        }
        c(autoCloseable);
    }

    public c(A viewModelScope) {
        i.e(viewModelScope, "viewModelScope");
        this.f34480a = new V();
        this.f34481b = new LinkedHashMap();
        this.f34482c = new LinkedHashSet();
        b("androidx.lifecycle.viewmodel.internal.ViewModelCoroutineScope.JOB_KEY", new a(viewModelScope.getCoroutineContext()));
    }

    public c(AutoCloseable... closeables) {
        i.e(closeables, "closeables");
        this.f34480a = new V();
        this.f34481b = new LinkedHashMap();
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        this.f34482c = linkedHashSet;
        p.A(linkedHashSet, closeables);
    }

    public c(A viewModelScope, AutoCloseable... closeables) {
        i.e(viewModelScope, "viewModelScope");
        i.e(closeables, "closeables");
        this.f34480a = new V();
        this.f34481b = new LinkedHashMap();
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        this.f34482c = linkedHashSet;
        b("androidx.lifecycle.viewmodel.internal.ViewModelCoroutineScope.JOB_KEY", new a(viewModelScope.getCoroutineContext()));
        p.A(linkedHashSet, closeables);
    }
}
