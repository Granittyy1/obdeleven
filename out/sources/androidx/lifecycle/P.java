package androidx.lifecycle;

import android.os.Bundle;
import java.util.Arrays;
import java.util.Map;
import kotlin.Pair;

/* JADX INFO: compiled from: SavedStateHandleSupport.kt */
/* JADX INFO: loaded from: classes.dex */
public final class P implements u2.c.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final p248u2.c f17765a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f17766b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Bundle f17767c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final p293xa.g f17768d;

    public P(p248u2.c savedStateRegistry, c0 viewModelStoreOwner) {
        kotlin.jvm.internal.i.e(savedStateRegistry, "savedStateRegistry");
        kotlin.jvm.internal.i.e(viewModelStoreOwner, "viewModelStoreOwner");
        this.f17765a = savedStateRegistry;
        this.f17768d = kotlin.a.a(new O(0, viewModelStoreOwner));
    }

    @Override // u2.c.b
    public final Bundle a() {
        kotlin.collections.y.p();
        Bundle bundleB = p271w0.c.b((Pair[]) Arrays.copyOf(new Pair[0], 0));
        Bundle bundle = this.f17767c;
        if (bundle != null) {
            bundleB.putAll(bundle);
        }
        for (Map.Entry entry : ((Q) this.f17768d.getValue()).f17769a.entrySet()) {
            String str = (String) entry.getKey();
            Bundle bundleA = ((K) entry.getValue()).f17743b.f7997e.a();
            if (!bundleA.isEmpty()) {
                p248u2.f.c(bundleB, str, bundleA);
            }
        }
        this.f17766b = false;
        return bundleB;
    }

    public final void b() {
        if (this.f17766b) {
            return;
        }
        Bundle bundleA = this.f17765a.a("androidx.lifecycle.internal.SavedStateHandlesProvider");
        kotlin.collections.y.p();
        Bundle bundleB = p271w0.c.b((Pair[]) Arrays.copyOf(new Pair[0], 0));
        Bundle bundle = this.f17767c;
        if (bundle != null) {
            bundleB.putAll(bundle);
        }
        if (bundleA != null) {
            bundleB.putAll(bundleA);
        }
        this.f17767c = bundleB;
        this.f17766b = true;
    }
}
