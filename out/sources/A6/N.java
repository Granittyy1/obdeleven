package A6;

/* JADX INFO: compiled from: AutoValue_CrashlyticsReport_Session_Event_Application_Execution_BinaryImage.java */
/* JADX INFO: loaded from: classes3.dex */
public final class N extends f0.e.d.a.b.AbstractC0008a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f750a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f751b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f752c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f753d;

    public N(long j, long j10, String str, String str2) {
        this.f750a = j;
        this.f751b = j10;
        this.f752c = str;
        this.f753d = str2;
    }

    @Override // A6.f0.e.d.a.b.AbstractC0008a
    public final long a() {
        return this.f750a;
    }

    @Override // A6.f0.e.d.a.b.AbstractC0008a
    public final String b() {
        return this.f752c;
    }

    @Override // A6.f0.e.d.a.b.AbstractC0008a
    public final long c() {
        return this.f751b;
    }

    @Override // A6.f0.e.d.a.b.AbstractC0008a
    public final String d() {
        return this.f753d;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof f0.e.d.a.b.AbstractC0008a)) {
            return false;
        }
        f0.e.d.a.b.AbstractC0008a abstractC0008a = (f0.e.d.a.b.AbstractC0008a) obj;
        if (this.f750a == abstractC0008a.a() && this.f751b == abstractC0008a.c() && this.f752c.equals(abstractC0008a.b())) {
            String str = this.f753d;
            if (str == null) {
                if (abstractC0008a.d() == null) {
                    return true;
                }
            } else if (str.equals(abstractC0008a.d())) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        long j = this.f750a;
        long j10 = this.f751b;
        int iHashCode = (((((((int) (j ^ (j >>> 32))) ^ 1000003) * 1000003) ^ ((int) ((j10 >>> 32) ^ j10))) * 1000003) ^ this.f752c.hashCode()) * 1000003;
        String str = this.f753d;
        return iHashCode ^ (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("BinaryImage{baseAddress=");
        sb2.append(this.f750a);
        sb2.append(", size=");
        sb2.append(this.f751b);
        sb2.append(", name=");
        sb2.append(this.f752c);
        sb2.append(", uuid=");
        return Q8.d.a(sb2, this.f753d, "}");
    }
}
