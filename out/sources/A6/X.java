package A6;

/* JADX INFO: compiled from: AutoValue_CrashlyticsReport_Session_Event_RolloutAssignment_RolloutVariant.java */
/* JADX INFO: loaded from: classes3.dex */
public final class X extends f0.e.d.AbstractC0015e.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f804a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f805b;

    public X(String str, String str2) {
        this.f804a = str;
        this.f805b = str2;
    }

    @Override // A6.f0.e.d.AbstractC0015e.b
    public final String a() {
        return this.f804a;
    }

    @Override // A6.f0.e.d.AbstractC0015e.b
    public final String b() {
        return this.f805b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof f0.e.d.AbstractC0015e.b)) {
            return false;
        }
        f0.e.d.AbstractC0015e.b bVar = (f0.e.d.AbstractC0015e.b) obj;
        return this.f804a.equals(bVar.a()) && this.f805b.equals(bVar.b());
    }

    public final int hashCode() {
        return ((this.f804a.hashCode() ^ 1000003) * 1000003) ^ this.f805b.hashCode();
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("RolloutVariant{rolloutId=");
        sb2.append(this.f804a);
        sb2.append(", variantId=");
        return Q8.d.a(sb2, this.f805b, "}");
    }
}
