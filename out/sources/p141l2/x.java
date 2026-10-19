package p141l2;

import O.h;
import androidx.lifecycle.Y;
import androidx.lifecycle.b0;
import java.util.Iterator;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.c;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.l;
import p014b1.b;
import p014b1.f;

/* JADX INFO: compiled from: NavControllerViewModel.kt */
/* JADX INFO: loaded from: classes.dex */
public final class x extends Y implements N {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final LinkedHashMap f44319a = new LinkedHashMap();

    /* JADX INFO: compiled from: NavControllerViewModel.kt */
    public static final class a {
        public static x a(b0 b0Var) {
            b factory = y.f44320a;
            p014b1.a.C0207a extras = p014b1.a.C0207a.f20498b;
            i.e(factory, "factory");
            i.e(extras, "extras");
            f fVar = new f(b0Var, factory, extras);
            c cVarA = l.a(x.class);
            String strI = cVarA.i();
            if (strI != null) {
                return (x) fVar.a(cVarA, "androidx.lifecycle.ViewModelProvider.DefaultKey:".concat(strI));
            }
            throw new IllegalArgumentException("Local and anonymous classes can not be ViewModels");
        }
    }

    @Override // p141l2.N
    public final b0 a(String backStackEntryId) {
        i.e(backStackEntryId, "backStackEntryId");
        LinkedHashMap linkedHashMap = this.f44319a;
        b0 b0Var = (b0) linkedHashMap.get(backStackEntryId);
        if (b0Var != null) {
            return b0Var;
        }
        b0 b0Var2 = new b0();
        linkedHashMap.put(backStackEntryId, b0Var2);
        return b0Var2;
    }

    @Override // androidx.lifecycle.Y
    public final void onCleared() {
        LinkedHashMap linkedHashMap = this.f44319a;
        Iterator it = linkedHashMap.values().iterator();
        while (it.hasNext()) {
            ((b0) it.next()).a();
        }
        linkedHashMap.clear();
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("NavControllerViewModel{");
        int iIdentityHashCode = System.identityHashCode(this);
        h.c(16);
        sb2.append(C6.b.e(16, ((long) iIdentityHashCode) & 4294967295L));
        sb2.append("} ViewModelStores (");
        Iterator it = this.f44319a.keySet().iterator();
        while (it.hasNext()) {
            sb2.append((String) it.next());
            if (it.hasNext()) {
                sb2.append(", ");
            }
        }
        sb2.append(')');
        String string = sb2.toString();
        i.d(string, "toString(...)");
        return string;
    }
}
