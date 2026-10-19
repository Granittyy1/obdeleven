package androidx.paging;

/* JADX INFO: renamed from: androidx.paging.d, reason: case insensitive filesystem */
/* JADX INFO: compiled from: CombinedLoadStates.kt */
/* JADX INFO: loaded from: classes.dex */
public final class C1428d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final m f19339a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final m f19340b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final m f19341c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final n f19342d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final n f19343e;

    public C1428d(m refresh, m prepend, m append, n source, n nVar) {
        kotlin.jvm.internal.i.e(refresh, "refresh");
        kotlin.jvm.internal.i.e(prepend, "prepend");
        kotlin.jvm.internal.i.e(append, "append");
        kotlin.jvm.internal.i.e(source, "source");
        this.f19339a = refresh;
        this.f19340b = prepend;
        this.f19341c = append;
        this.f19342d = source;
        this.f19343e = nVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C1428d.class != obj.getClass()) {
            return false;
        }
        C1428d c1428d = (C1428d) obj;
        return kotlin.jvm.internal.i.a(this.f19339a, c1428d.f19339a) && kotlin.jvm.internal.i.a(this.f19340b, c1428d.f19340b) && kotlin.jvm.internal.i.a(this.f19341c, c1428d.f19341c) && kotlin.jvm.internal.i.a(this.f19342d, c1428d.f19342d) && kotlin.jvm.internal.i.a(this.f19343e, c1428d.f19343e);
    }

    public final int hashCode() {
        int iHashCode = (this.f19342d.hashCode() + ((this.f19341c.hashCode() + ((this.f19340b.hashCode() + (this.f19339a.hashCode() * 31)) * 31)) * 31)) * 31;
        n nVar = this.f19343e;
        return iHashCode + (nVar != null ? nVar.hashCode() : 0);
    }

    public final String toString() {
        return "CombinedLoadStates(refresh=" + this.f19339a + ", prepend=" + this.f19340b + ", append=" + this.f19341c + ", source=" + this.f19342d + ", mediator=" + this.f19343e + ')';
    }
}
