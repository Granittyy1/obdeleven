package p083g7;

/* JADX INFO: compiled from: ImageData.java */
/* JADX INFO: loaded from: classes3.dex */
public final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f35624a;

    public f(String str) {
        this.f35624a = str;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        String str = this.f35624a;
        return str.hashCode() == fVar.f35624a.hashCode() && str.equals(fVar.f35624a);
    }

    public final int hashCode() {
        return this.f35624a.hashCode();
    }
}
