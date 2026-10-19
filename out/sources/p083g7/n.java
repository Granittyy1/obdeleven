package p083g7;

/* JADX INFO: compiled from: Text.java */
/* JADX INFO: loaded from: classes3.dex */
public final class n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f35636a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f35637b;

    public n(String str, String str2) {
        this.f35636a = str;
        this.f35637b = str2;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof n)) {
            return false;
        }
        n nVar = (n) obj;
        if (hashCode() != nVar.hashCode()) {
            return false;
        }
        String str = nVar.f35636a;
        String str2 = this.f35636a;
        return (str2 != null || str == null) && (str2 == null || str2.equals(str)) && this.f35637b.equals(nVar.f35637b);
    }

    public final int hashCode() {
        String str = this.f35637b;
        String str2 = this.f35636a;
        if (str2 == null) {
            return str.hashCode();
        }
        return str.hashCode() + str2.hashCode();
    }
}
