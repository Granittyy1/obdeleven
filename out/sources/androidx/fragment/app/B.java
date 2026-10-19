package androidx.fragment.app;

import android.util.Log;
import androidx.lifecycle.Y;
import androidx.lifecycle.a0;
import androidx.lifecycle.b0;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

/* JADX INFO: compiled from: FragmentManagerViewModel.java */
/* JADX INFO: loaded from: classes.dex */
public final class B extends Y {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final a f17379g = new a();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f17383d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final HashMap<String, Fragment> f17380a = new HashMap<>();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final HashMap<String, B> f17381b = new HashMap<>();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final HashMap<String, b0> f17382c = new HashMap<>();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f17384e = false;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f17385f = false;

    /* JADX INFO: compiled from: FragmentManagerViewModel.java */
    public class a implements a0.c {
        @Override // androidx.lifecycle.a0.c
        public final <T extends Y> T create(Class<T> cls) {
            return new B(true);
        }
    }

    public B(boolean z10) {
        this.f17383d = z10;
    }

    public final void b(Fragment fragment) {
        if (this.f17385f) {
            Log.isLoggable("FragmentManager", 2);
            return;
        }
        HashMap<String, Fragment> map = this.f17380a;
        if (map.containsKey(fragment.mWho)) {
            return;
        }
        map.put(fragment.mWho, fragment);
        if (Log.isLoggable("FragmentManager", 2)) {
            fragment.toString();
        }
    }

    public final void c(String str, boolean z10) {
        Log.isLoggable("FragmentManager", 3);
        d(str, z10);
    }

    public final void d(String str, boolean z10) {
        HashMap<String, B> map = this.f17381b;
        B b10 = map.get(str);
        if (b10 != null) {
            if (z10) {
                ArrayList arrayList = new ArrayList();
                arrayList.addAll(b10.f17381b.keySet());
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    b10.c((String) it.next(), true);
                }
            }
            b10.onCleared();
            map.remove(str);
        }
        HashMap<String, b0> map2 = this.f17382c;
        b0 b0Var = map2.get(str);
        if (b0Var != null) {
            b0Var.a();
            map2.remove(str);
        }
    }

    public final void e(Fragment fragment) {
        if (this.f17385f) {
            Log.isLoggable("FragmentManager", 2);
        } else {
            if (this.f17380a.remove(fragment.mWho) == null || !Log.isLoggable("FragmentManager", 2)) {
                return;
            }
            fragment.toString();
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || B.class != obj.getClass()) {
            return false;
        }
        B b10 = (B) obj;
        return this.f17380a.equals(b10.f17380a) && this.f17381b.equals(b10.f17381b) && this.f17382c.equals(b10.f17382c);
    }

    public final int hashCode() {
        return this.f17382c.hashCode() + ((this.f17381b.hashCode() + (this.f17380a.hashCode() * 31)) * 31);
    }

    @Override // androidx.lifecycle.Y
    public final void onCleared() {
        if (Log.isLoggable("FragmentManager", 3)) {
            toString();
        }
        this.f17384e = true;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("FragmentManagerViewModel{");
        sb2.append(Integer.toHexString(System.identityHashCode(this)));
        sb2.append("} Fragments (");
        Iterator<Fragment> it = this.f17380a.values().iterator();
        while (it.hasNext()) {
            sb2.append(it.next());
            if (it.hasNext()) {
                sb2.append(", ");
            }
        }
        sb2.append(") Child Non Config (");
        Iterator<String> it2 = this.f17381b.keySet().iterator();
        while (it2.hasNext()) {
            sb2.append(it2.next());
            if (it2.hasNext()) {
                sb2.append(", ");
            }
        }
        sb2.append(") ViewModelStores (");
        Iterator<String> it3 = this.f17382c.keySet().iterator();
        while (it3.hasNext()) {
            sb2.append(it3.next());
            if (it3.hasNext()) {
                sb2.append(", ");
            }
        }
        sb2.append(')');
        return sb2.toString();
    }
}
