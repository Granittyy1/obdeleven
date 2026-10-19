package p083g7;

/* JADX INFO: compiled from: Button.java */
/* JADX INFO: loaded from: classes3.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final n f35616a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f35617b;

    public d(n nVar, String str) {
        this.f35616a = nVar;
        this.f35617b = str;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return hashCode() == dVar.hashCode() && this.f35616a.equals(dVar.f35616a) && this.f35617b.equals(dVar.f35617b);
    }

    public final int hashCode() {
        return this.f35617b.hashCode() + this.f35616a.hashCode();
    }
}
