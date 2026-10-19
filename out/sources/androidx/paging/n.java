package androidx.paging;

import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: compiled from: LoadStates.kt */
/* JADX INFO: loaded from: classes.dex */
public final class n {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final n f19375d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final m f19376a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final m f19377b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final m f19378c;

    static {
        m.c cVar = m.c.f19374c;
        f19375d = new n(cVar, cVar, cVar);
    }

    public n(m refresh, m prepend, m append) {
        kotlin.jvm.internal.i.e(refresh, "refresh");
        kotlin.jvm.internal.i.e(prepend, "prepend");
        kotlin.jvm.internal.i.e(append, "append");
        this.f19376a = refresh;
        this.f19377b = prepend;
        this.f19378c = append;
        if (!(refresh instanceof m.a) && !(append instanceof m.a)) {
            boolean z10 = prepend instanceof m.a;
        }
        if ((refresh instanceof m.c) && (append instanceof m.c)) {
            boolean z11 = prepend instanceof m.c;
        }
    }

    public static n a(n nVar, m refresh, m prepend, m append, int i10) {
        if ((i10 & 1) != 0) {
            refresh = nVar.f19376a;
        }
        if ((i10 & 2) != 0) {
            prepend = nVar.f19377b;
        }
        if ((i10 & 4) != 0) {
            append = nVar.f19378c;
        }
        nVar.getClass();
        kotlin.jvm.internal.i.e(refresh, "refresh");
        kotlin.jvm.internal.i.e(prepend, "prepend");
        kotlin.jvm.internal.i.e(append, "append");
        return new n(refresh, prepend, append);
    }

    public final n b(LoadType loadType, m newState) {
        kotlin.jvm.internal.i.e(loadType, "loadType");
        kotlin.jvm.internal.i.e(newState, "newState");
        int iOrdinal = loadType.ordinal();
        if (iOrdinal == 0) {
            return a(this, newState, null, null, 6);
        }
        if (iOrdinal == 1) {
            return a(this, null, newState, null, 5);
        }
        if (iOrdinal == 2) {
            return a(this, null, null, newState, 3);
        }
        throw new NoWhenBranchMatchedException();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n)) {
            return false;
        }
        n nVar = (n) obj;
        return kotlin.jvm.internal.i.a(this.f19376a, nVar.f19376a) && kotlin.jvm.internal.i.a(this.f19377b, nVar.f19377b) && kotlin.jvm.internal.i.a(this.f19378c, nVar.f19378c);
    }

    public final int hashCode() {
        return this.f19378c.hashCode() + ((this.f19377b.hashCode() + (this.f19376a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        return "LoadStates(refresh=" + this.f19376a + ", prepend=" + this.f19377b + ", append=" + this.f19378c + ')';
    }
}
