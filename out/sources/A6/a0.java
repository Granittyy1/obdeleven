package A6;

/* JADX INFO: compiled from: AutoValue_CrashlyticsReport_Session_User.java */
/* JADX INFO: loaded from: classes3.dex */
public final class a0 extends f0.e.f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f819a;

    public a0(String str) {
        this.f819a = str;
    }

    @Override // A6.f0.e.f
    public final String a() {
        return this.f819a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof f0.e.f) {
            return this.f819a.equals(((f0.e.f) obj).a());
        }
        return false;
    }

    public final int hashCode() {
        return this.f819a.hashCode() ^ 1000003;
    }

    public final String toString() {
        return Q8.d.a(new StringBuilder("User{identifier="), this.f819a, "}");
    }
}
