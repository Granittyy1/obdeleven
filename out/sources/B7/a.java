package B7;

/* JADX INFO: compiled from: AutoValue_LibraryVersion.java */
/* JADX INFO: loaded from: classes3.dex */
public final class a extends e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f1595a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f1596b;

    public a(String str, String str2) {
        this.f1595a = str;
        if (str2 == null) {
            throw new NullPointerException("Null version");
        }
        this.f1596b = str2;
    }

    @Override // B7.e
    public final String a() {
        return this.f1595a;
    }

    @Override // B7.e
    public final String b() {
        return this.f1596b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        return this.f1595a.equals(eVar.a()) && this.f1596b.equals(eVar.b());
    }

    public final int hashCode() {
        return ((this.f1595a.hashCode() ^ 1000003) * 1000003) ^ this.f1596b.hashCode();
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("LibraryVersion{libraryName=");
        sb2.append(this.f1595a);
        sb2.append(", version=");
        return Q8.d.a(sb2, this.f1596b, "}");
    }
}
