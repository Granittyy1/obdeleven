package p248u2;

import android.os.Bundle;
import androidx.lifecycle.C1370m;
import java.util.Iterator;
import java.util.Map;
import kotlin.jvm.internal.i;
import p293xa.r;

/* JADX INFO: compiled from: SavedStateRegistry.android.kt */
/* JADX INFO: loaded from: classes.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final p273w2.b f47414a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public p248u2.a.C0539a f47415b;

    /* JADX INFO: compiled from: SavedStateRegistry.android.kt */
    public interface a {
        void a(e eVar);
    }

    /* JADX INFO: compiled from: SavedStateRegistry.android.kt */
    public interface b {
        Bundle a();
    }

    public c(p273w2.b bVar) {
        this.f47414a = bVar;
    }

    public final Bundle a(String key) {
        i.e(key, "key");
        p273w2.b bVar = this.f47414a;
        if (!bVar.f47743g) {
            throw new IllegalStateException("You can 'consumeRestoredStateForKey' only after the corresponding component has moved to the 'CREATED' state");
        }
        Bundle bundle = bVar.f47742f;
        if (bundle == null) {
            return null;
        }
        Bundle bundleB = bundle.containsKey(key) ? p248u2.b.b(bundle, key) : null;
        bundle.remove(key);
        if (bundle.isEmpty()) {
            bVar.f47742f = null;
        }
        return bundleB;
    }

    public final b b() {
        b bVar;
        p273w2.b bVar2 = this.f47414a;
        synchronized (bVar2.f47739c) {
            Iterator it = bVar2.f47740d.entrySet().iterator();
            do {
                bVar = null;
                if (!it.hasNext()) {
                    break;
                }
                Map.Entry entry = (Map.Entry) it.next();
                String str = (String) entry.getKey();
                b bVar3 = (b) entry.getValue();
                if (i.a(str, "androidx.lifecycle.internal.SavedStateHandlesProvider")) {
                    bVar = bVar3;
                }
            } while (bVar == null);
        }
        return bVar;
    }

    public final void c(String str, b provider) {
        i.e(provider, "provider");
        p273w2.b bVar = this.f47414a;
        synchronized (bVar.f47739c) {
            if (bVar.f47740d.containsKey(str)) {
                throw new IllegalArgumentException("SavedStateProvider with the given key is already registered");
            }
            bVar.f47740d.put(str, provider);
            r rVar = r.f47939a;
        }
    }

    public final void d() {
        if (!this.f47414a.f47744h) {
            throw new IllegalStateException("Can not perform this action after onSaveInstanceState");
        }
        p248u2.a.C0539a c0539a = this.f47415b;
        if (c0539a == null) {
            c0539a = new p248u2.a.C0539a(this);
        }
        this.f47415b = c0539a;
        try {
            C1370m.a.class.getDeclaredConstructor(null);
            p248u2.a.C0539a c0539a2 = this.f47415b;
            if (c0539a2 != null) {
                c0539a2.f47413a.add(C1370m.a.class.getName());
            }
        } catch (NoSuchMethodException e10) {
            throw new IllegalArgumentException("Class " + C1370m.a.class.getSimpleName() + " must have default constructor in order to be automatically recreated", e10);
        }
    }
}
