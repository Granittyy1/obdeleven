package p141l2;

import android.app.Application;
import android.content.Context;
import android.os.Bundle;
import androidx.lifecycle.InterfaceC1369l;
import androidx.lifecycle.InterfaceC1376t;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.N;
import androidx.lifecycle.a0;
import androidx.lifecycle.b0;
import androidx.lifecycle.c0;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Set;
import java.util.UUID;
import kotlin.jvm.internal.i;
import p014b1.d;
import p163n2.c;
import p248u2.e;

/* JADX INFO: renamed from: l2.t, reason: case insensitive filesystem */
/* JADX INFO: compiled from: NavBackStackEntry.android.kt */
/* JADX INFO: loaded from: classes.dex */
public final class C2749t implements InterfaceC1376t, c0, InterfaceC1369l, e {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final p163n2.e f44298b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public C f44299c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Bundle f44300d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Lifecycle.State f44301e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final N f44302f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final String f44303g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Bundle f44304h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final c f44305i = new c(this);

    /* JADX INFO: renamed from: l2.t$a */
    /* JADX INFO: compiled from: NavBackStackEntry.android.kt */
    public static final class a {
        public static C2749t a(p163n2.e eVar, C destination, Bundle bundle, Lifecycle.State hostLifecycleState, N n10) {
            String string = UUID.randomUUID().toString();
            i.d(string, "toString(...)");
            i.e(destination, "destination");
            i.e(hostLifecycleState, "hostLifecycleState");
            return new C2749t(eVar, destination, bundle, hostLifecycleState, n10, string, null);
        }
    }

    public C2749t(p163n2.e eVar, C c10, Bundle bundle, Lifecycle.State state, N n10, String str, Bundle bundle2) {
        this.f44298b = eVar;
        this.f44299c = c10;
        this.f44300d = bundle;
        this.f44301e = state;
        this.f44302f = n10;
        this.f44303g = str;
        this.f44304h = bundle2;
        kotlin.a.a(new P9.a(3, this));
    }

    public final void a(Lifecycle.State state) {
        c cVar = this.f44305i;
        cVar.getClass();
        cVar.f44761k = state;
        cVar.b();
    }

    public final boolean equals(Object obj) {
        Set<String> setKeySet;
        if (obj == null || !(obj instanceof C2749t)) {
            return false;
        }
        C2749t c2749t = (C2749t) obj;
        if (!i.a(this.f44303g, c2749t.f44303g) || !i.a(this.f44299c, c2749t.f44299c) || !i.a(this.f44305i.j, c2749t.f44305i.j) || !i.a(getSavedStateRegistry(), c2749t.getSavedStateRegistry())) {
            return false;
        }
        Bundle bundle = this.f44300d;
        Bundle bundle2 = c2749t.f44300d;
        if (!i.a(bundle, bundle2)) {
            if (bundle == null || (setKeySet = bundle.keySet()) == null) {
                return false;
            }
            Set<String> set = setKeySet;
            if (!(set instanceof Collection) || !set.isEmpty()) {
                for (String str : set) {
                    if (!i.a(bundle.get(str), bundle2 != null ? bundle2.get(str) : null)) {
                        return false;
                    }
                }
            }
        }
        return true;
    }

    /* JADX WARN: Code duplicated, block: B:14:0x0039  */
    @Override // androidx.lifecycle.InterfaceC1369l
    public final p014b1.a getDefaultViewModelCreationExtras() {
        Application application;
        c cVar = this.f44305i;
        cVar.getClass();
        d dVar = new d((Object) null);
        N.b bVar = N.f17760a;
        LinkedHashMap linkedHashMap = dVar.f20497a;
        C2749t c2749t = cVar.f44752a;
        linkedHashMap.put(bVar, c2749t);
        linkedHashMap.put(N.f17761b, c2749t);
        Bundle bundleA = cVar.a();
        if (bundleA != null) {
            linkedHashMap.put(N.f17762c, bundleA);
        }
        p163n2.e eVar = this.f44298b;
        if (eVar == null) {
            application = null;
        } else {
            Context context = eVar.f44769a;
            Context applicationContext = context != null ? context.getApplicationContext() : null;
            if (applicationContext instanceof Application) {
                application = (Application) applicationContext;
            } else {
                application = null;
            }
        }
        Application application2 = application != null ? application : null;
        if (application2 != null) {
            linkedHashMap.put(a0.a.f17798d, application2);
        }
        return dVar;
    }

    @Override // androidx.lifecycle.InterfaceC1369l
    public final a0.c getDefaultViewModelProviderFactory() {
        return this.f44305i.f44762l;
    }

    @Override // androidx.lifecycle.InterfaceC1376t
    public final Lifecycle getLifecycle() {
        return this.f44305i.j;
    }

    @Override // p248u2.e
    public final p248u2.c getSavedStateRegistry() {
        return this.f44305i.f44759h.f47417b;
    }

    @Override // androidx.lifecycle.c0
    public final b0 getViewModelStore() {
        c cVar = this.f44305i;
        if (!cVar.f44760i) {
            throw new IllegalStateException("You cannot access the NavBackStackEntry's ViewModels until it is added to the NavController's back stack (i.e., the Lifecycle of the NavBackStackEntry reaches the CREATED state).");
        }
        if (cVar.j.f17828d == Lifecycle.State.f17749b) {
            throw new IllegalStateException("You cannot access the NavBackStackEntry's ViewModels after the NavBackStackEntry is destroyed.");
        }
        N n10 = cVar.f44756e;
        if (n10 != null) {
            return n10.a(cVar.f44757f);
        }
        throw new IllegalStateException("You must call setViewModelStore() on your NavHostController before accessing the ViewModelStore of a navigation graph.");
    }

    public final int hashCode() {
        Set<String> setKeySet;
        int iHashCode = this.f44299c.hashCode() + (this.f44303g.hashCode() * 31);
        Bundle bundle = this.f44300d;
        if (bundle != null && (setKeySet = bundle.keySet()) != null) {
            Iterator<T> it = setKeySet.iterator();
            while (it.hasNext()) {
                int i10 = iHashCode * 31;
                Object obj = bundle.get((String) it.next());
                iHashCode = i10 + (obj != null ? obj.hashCode() : 0);
            }
        }
        return getSavedStateRegistry().hashCode() + ((this.f44305i.j.hashCode() + (iHashCode * 31)) * 31);
    }

    public final String toString() {
        return this.f44305i.toString();
    }
}
