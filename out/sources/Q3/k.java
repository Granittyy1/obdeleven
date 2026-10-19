package Q3;

import C4.v;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Set;
import java.util.WeakHashMap;

/* JADX INFO: compiled from: RequestTracker.java */
/* JADX INFO: loaded from: classes.dex */
public final class k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f5084a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f5085b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f5086c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Serializable f5087d;

    public k() {
        this.f5084a = 0;
        this.f5086c = Collections.newSetFromMap(new WeakHashMap());
        this.f5087d = new ArrayList();
    }

    public boolean a(T3.b bVar) {
        boolean z10 = true;
        if (bVar == null) {
            return true;
        }
        boolean zRemove = ((Set) this.f5086c).remove(bVar);
        if (!((ArrayList) this.f5087d).remove(bVar) && !zRemove) {
            z10 = false;
        }
        if (z10) {
            bVar.clear();
        }
        return z10;
    }

    public String toString() {
        switch (this.f5084a) {
            case 0:
                StringBuilder sb2 = new StringBuilder();
                sb2.append(super.toString());
                sb2.append("{numRequests=");
                sb2.append(((Set) this.f5086c).size());
                sb2.append(", isPaused=");
                return v.f(sb2, this.f5085b, "}");
            default:
                return super.toString();
        }
    }

    public k(String str, String str2, boolean z10) {
        this.f5084a = 1;
        this.f5086c = str;
        this.f5087d = str2;
        this.f5085b = z10;
    }
}
