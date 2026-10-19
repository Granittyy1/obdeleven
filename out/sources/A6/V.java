package A6;

/* JADX INFO: compiled from: AutoValue_CrashlyticsReport_Session_Event_Log.java */
/* JADX INFO: loaded from: classes3.dex */
public final class V extends f0.e.d.AbstractC0014d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f795a;

    public V(String str) {
        this.f795a = str;
    }

    @Override // A6.f0.e.d.AbstractC0014d
    public final String a() {
        return this.f795a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof f0.e.d.AbstractC0014d) {
            return this.f795a.equals(((f0.e.d.AbstractC0014d) obj).a());
        }
        return false;
    }

    public final int hashCode() {
        return this.f795a.hashCode() ^ 1000003;
    }

    public final String toString() {
        return Q8.d.a(new StringBuilder("Log{content="), this.f795a, "}");
    }
}
