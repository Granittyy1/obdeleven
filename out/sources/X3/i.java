package X3;

/* JADX INFO: compiled from: MultiClassKey.java */
/* JADX INFO: loaded from: classes.dex */
public final class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Class<?> f7211a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Class<?> f7212b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Class<?> f7213c;

    public i() {
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || i.class != obj.getClass()) {
            return false;
        }
        i iVar = (i) obj;
        return this.f7211a.equals(iVar.f7211a) && this.f7212b.equals(iVar.f7212b) && j.a(this.f7213c, iVar.f7213c);
    }

    public final int hashCode() {
        int iHashCode = (this.f7212b.hashCode() + (this.f7211a.hashCode() * 31)) * 31;
        Class<?> cls = this.f7213c;
        return iHashCode + (cls != null ? cls.hashCode() : 0);
    }

    public final String toString() {
        return "MultiClassKey{first=" + this.f7211a + ", second=" + this.f7212b + '}';
    }

    public i(Class<?> cls, Class<?> cls2, Class<?> cls3) {
        this.f7211a = cls;
        this.f7212b = cls2;
        this.f7213c = cls3;
    }
}
