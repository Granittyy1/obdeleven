package p248u2;

import android.os.Bundle;
import androidx.lifecycle.Lifecycle;
import java.util.Arrays;
import java.util.Map;
import kotlin.Pair;
import kotlin.collections.y;
import kotlin.jvm.internal.i;
import p271w0.c;
import p273w2.b;
import p293xa.r;

/* JADX INFO: compiled from: SavedStateRegistryController.android.kt */
/* JADX INFO: loaded from: classes.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final b f47416a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final c f47417b;

    public d(b bVar) {
        this.f47416a = bVar;
        this.f47417b = new c(bVar);
    }

    public final void a() {
        this.f47416a.a();
    }

    public final void b(Bundle bundle) {
        b bVar = this.f47416a;
        if (!bVar.f47741e) {
            bVar.a();
        }
        e eVar = bVar.f47737a;
        if (eVar.getLifecycle().b().compareTo(Lifecycle.State.f17752e) >= 0) {
            throw new IllegalStateException(("performRestore cannot be called when owner is " + eVar.getLifecycle().b()).toString());
        }
        if (bVar.f47743g) {
            throw new IllegalStateException("SavedStateRegistry was already restored.");
        }
        Bundle bundleB = null;
        if (bundle != null && bundle.containsKey("androidx.lifecycle.BundlableSavedStateRegistry.key")) {
            bundleB = b.b(bundle, "androidx.lifecycle.BundlableSavedStateRegistry.key");
        }
        bVar.f47742f = bundleB;
        bVar.f47743g = true;
    }

    public final void c(Bundle outBundle) {
        i.e(outBundle, "outBundle");
        b bVar = this.f47416a;
        y.p();
        Bundle bundleB = c.b((Pair[]) Arrays.copyOf(new Pair[0], 0));
        Bundle bundle = bVar.f47742f;
        if (bundle != null) {
            bundleB.putAll(bundle);
        }
        synchronized (bVar.f47739c) {
            try {
                for (Map.Entry entry : bVar.f47740d.entrySet()) {
                    f.c(bundleB, (String) entry.getKey(), ((c.b) entry.getValue()).a());
                }
                r rVar = r.f47939a;
            } catch (Throwable th) {
                throw th;
            }
        }
        if (bundleB.isEmpty()) {
            return;
        }
        f.c(outBundle, "androidx.lifecycle.BundlableSavedStateRegistry.key", bundleB);
    }
}
