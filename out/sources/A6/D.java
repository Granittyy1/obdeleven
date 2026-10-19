package A6;

/* JADX INFO: compiled from: AutoValue_CrashlyticsReport_CustomAttribute.java */
/* JADX INFO: loaded from: classes3.dex */
public final class D extends f0.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f667a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f668b;

    public D(String str, String str2) {
        this.f667a = str;
        this.f668b = str2;
    }

    @Override // A6.f0.c
    public final String a() {
        return this.f667a;
    }

    @Override // A6.f0.c
    public final String b() {
        return this.f668b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof f0.c)) {
            return false;
        }
        f0.c cVar = (f0.c) obj;
        return this.f667a.equals(cVar.a()) && this.f668b.equals(cVar.b());
    }

    public final int hashCode() {
        return ((this.f667a.hashCode() ^ 1000003) * 1000003) ^ this.f668b.hashCode();
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("CustomAttribute{key=");
        sb2.append(this.f667a);
        sb2.append(", value=");
        return Q8.d.a(sb2, this.f668b, "}");
    }
}
