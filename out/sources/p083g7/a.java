package p083g7;

/* JADX INFO: compiled from: Action.java */
/* JADX INFO: loaded from: classes3.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f35604a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final d f35605b;

    /* JADX INFO: renamed from: g7.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: Action.java */
    public static class C0372a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public String f35606a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public d f35607b;
    }

    public a(String str, d dVar) {
        this.f35604a = str;
        this.f35605b = dVar;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        if (hashCode() != aVar.hashCode()) {
            return false;
        }
        String str = aVar.f35604a;
        String str2 = this.f35604a;
        if ((str2 == null && str != null) || (str2 != null && !str2.equals(str))) {
            return false;
        }
        d dVar = aVar.f35605b;
        d dVar2 = this.f35605b;
        return (dVar2 == null && dVar == null) || (dVar2 != null && dVar2.equals(dVar));
    }

    public final int hashCode() {
        String str = this.f35604a;
        int iHashCode = str != null ? str.hashCode() : 0;
        d dVar = this.f35605b;
        return iHashCode + (dVar != null ? dVar.hashCode() : 0);
    }
}
