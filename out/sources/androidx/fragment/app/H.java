package androidx.fragment.app;

import android.os.Bundle;
import android.util.Log;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

/* JADX INFO: compiled from: FragmentStore.java */
/* JADX INFO: loaded from: classes.dex */
public final class H {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList<Fragment> f17480a = new ArrayList<>();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final HashMap<String, G> f17481b = new HashMap<>();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final HashMap<String, Bundle> f17482c = new HashMap<>();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public B f17483d;

    public final void a(Fragment fragment) {
        if (this.f17480a.contains(fragment)) {
            throw new IllegalStateException("Fragment already added: " + fragment);
        }
        synchronized (this.f17480a) {
            this.f17480a.add(fragment);
        }
        fragment.mAdded = true;
    }

    public final Fragment b(String str) {
        G g10 = this.f17481b.get(str);
        if (g10 != null) {
            return g10.f17476c;
        }
        return null;
    }

    public final Fragment c(String str) {
        Fragment fragmentFindFragmentByWho;
        for (G g10 : this.f17481b.values()) {
            if (g10 != null && (fragmentFindFragmentByWho = g10.f17476c.findFragmentByWho(str)) != null) {
                return fragmentFindFragmentByWho;
            }
        }
        return null;
    }

    public final ArrayList d() {
        ArrayList arrayList = new ArrayList();
        for (G g10 : this.f17481b.values()) {
            if (g10 != null) {
                arrayList.add(g10);
            }
        }
        return arrayList;
    }

    public final ArrayList e() {
        ArrayList arrayList = new ArrayList();
        for (G g10 : this.f17481b.values()) {
            if (g10 != null) {
                arrayList.add(g10.f17476c);
            } else {
                arrayList.add(null);
            }
        }
        return arrayList;
    }

    public final List<Fragment> f() {
        ArrayList arrayList;
        if (this.f17480a.isEmpty()) {
            return Collections.emptyList();
        }
        synchronized (this.f17480a) {
            arrayList = new ArrayList(this.f17480a);
        }
        return arrayList;
    }

    public final void g(G g10) {
        Fragment fragment = g10.f17476c;
        String str = fragment.mWho;
        HashMap<String, G> map = this.f17481b;
        if (map.get(str) != null) {
            return;
        }
        map.put(fragment.mWho, g10);
        if (fragment.mRetainInstanceChangedWhileDetached) {
            if (fragment.mRetainInstance) {
                this.f17483d.b(fragment);
            } else {
                this.f17483d.e(fragment);
            }
            fragment.mRetainInstanceChangedWhileDetached = false;
        }
        if (Log.isLoggable("FragmentManager", 2)) {
            fragment.toString();
        }
    }

    public final void h(G g10) {
        Fragment fragment = g10.f17476c;
        if (fragment.mRetainInstance) {
            this.f17483d.e(fragment);
        }
        HashMap<String, G> map = this.f17481b;
        if (map.get(fragment.mWho) == g10 && map.put(fragment.mWho, null) != null && Log.isLoggable("FragmentManager", 2)) {
            fragment.toString();
        }
    }

    public final Bundle i(Bundle bundle, String str) {
        HashMap<String, Bundle> map = this.f17482c;
        return bundle != null ? map.put(str, bundle) : map.remove(str);
    }
}
