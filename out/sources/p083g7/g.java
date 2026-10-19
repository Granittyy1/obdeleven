package p083g7;

/* JADX INFO: compiled from: ImageOnlyMessage.java */
/* JADX INFO: loaded from: classes3.dex */
public final class g extends h {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public f f35625d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public a f35626e;

    public g() {
        throw null;
    }

    @Override // p083g7.h
    public final f a() {
        return this.f35625d;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof g)) {
            return false;
        }
        g gVar = (g) obj;
        if (hashCode() != gVar.hashCode()) {
            return false;
        }
        a aVar = gVar.f35626e;
        a aVar2 = this.f35626e;
        return (aVar2 != null || aVar == null) && (aVar2 == null || aVar2.equals(aVar)) && this.f35625d.equals(gVar.f35625d);
    }

    public final int hashCode() {
        a aVar = this.f35626e;
        return this.f35625d.f35624a.hashCode() + (aVar != null ? aVar.hashCode() : 0);
    }
}
