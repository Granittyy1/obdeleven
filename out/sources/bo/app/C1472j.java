package bo.app;

import java.util.Collection;
import java.util.Iterator;
import java.util.Set;

/* JADX INFO: renamed from: bo.app.j, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1472j implements j2 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Set f21329b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final boolean f21330c;

    public C1472j(Set eventsList) {
        kotlin.jvm.internal.i.e(eventsList, "eventsList");
        this.f21329b = eventsList;
        this.f21330c = eventsList.isEmpty();
    }

    public final boolean a() {
        Set set = this.f21329b;
        if (!(set instanceof Collection) || !set.isEmpty()) {
            Iterator it = set.iterator();
            while (it.hasNext()) {
                if (((a2) it.next()).a() == j1.SESSION_START) {
                    return true;
                }
            }
        }
        return false;
    }

    public final Set b() {
        return this.f21329b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C1472j) && kotlin.jvm.internal.i.a(this.f21329b, ((C1472j) obj).f21329b);
    }

    public int hashCode() {
        return this.f21329b.hashCode();
    }

    @Override // bo.app.j2
    public boolean isEmpty() {
        return this.f21330c;
    }

    public String toString() {
        return "BrazeEventContainer(eventsList=" + this.f21329b + ')';
    }
}
