package A6;

/* JADX INFO: compiled from: AutoValue_CrashlyticsReport_ApplicationExitInfo_BuildIdMappingForArch.java */
/* JADX INFO: loaded from: classes3.dex */
public final class C extends f0.a.AbstractC0005a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f664a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f665b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f666c;

    public C(String str, String str2, String str3) {
        this.f664a = str;
        this.f665b = str2;
        this.f666c = str3;
    }

    @Override // A6.f0.a.AbstractC0005a
    public final String a() {
        return this.f664a;
    }

    @Override // A6.f0.a.AbstractC0005a
    public final String b() {
        return this.f666c;
    }

    @Override // A6.f0.a.AbstractC0005a
    public final String c() {
        return this.f665b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof f0.a.AbstractC0005a)) {
            return false;
        }
        f0.a.AbstractC0005a abstractC0005a = (f0.a.AbstractC0005a) obj;
        return this.f664a.equals(abstractC0005a.a()) && this.f665b.equals(abstractC0005a.c()) && this.f666c.equals(abstractC0005a.b());
    }

    public final int hashCode() {
        return ((((this.f664a.hashCode() ^ 1000003) * 1000003) ^ this.f665b.hashCode()) * 1000003) ^ this.f666c.hashCode();
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("BuildIdMappingForArch{arch=");
        sb2.append(this.f664a);
        sb2.append(", libraryName=");
        sb2.append(this.f665b);
        sb2.append(", buildId=");
        return Q8.d.a(sb2, this.f666c, "}");
    }
}
