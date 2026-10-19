package A6;

/* JADX INFO: compiled from: AutoValue_CrashlyticsReport_Session_Application.java */
/* JADX INFO: loaded from: classes3.dex */
public final class H extends f0.e.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f695a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f696b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f697c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f698d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f699e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final String f700f;

    public H(String str, String str2, String str3, String str4, String str5, String str6) {
        this.f695a = str;
        this.f696b = str2;
        this.f697c = str3;
        this.f698d = str4;
        this.f699e = str5;
        this.f700f = str6;
    }

    @Override // A6.f0.e.a
    public final String a() {
        return this.f699e;
    }

    @Override // A6.f0.e.a
    public final String b() {
        return this.f700f;
    }

    @Override // A6.f0.e.a
    public final String c() {
        return this.f697c;
    }

    @Override // A6.f0.e.a
    public final String d() {
        return this.f695a;
    }

    @Override // A6.f0.e.a
    public final String e() {
        return this.f698d;
    }

    public final boolean equals(Object obj) {
        String str;
        String str2;
        String str3;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof f0.e.a)) {
            return false;
        }
        f0.e.a aVar = (f0.e.a) obj;
        if (this.f695a.equals(aVar.d()) && this.f696b.equals(aVar.g()) && ((str = this.f697c) != null ? str.equals(aVar.c()) : aVar.c() == null) && aVar.f() == null && ((str2 = this.f698d) != null ? str2.equals(aVar.e()) : aVar.e() == null) && ((str3 = this.f699e) != null ? str3.equals(aVar.a()) : aVar.a() == null)) {
            String str4 = this.f700f;
            if (str4 == null) {
                if (aVar.b() == null) {
                    return true;
                }
            } else if (str4.equals(aVar.b())) {
                return true;
            }
        }
        return false;
    }

    @Override // A6.f0.e.a
    public final f0.e.a.AbstractC0006a f() {
        return null;
    }

    @Override // A6.f0.e.a
    public final String g() {
        return this.f696b;
    }

    public final int hashCode() {
        int iHashCode = (((this.f695a.hashCode() ^ 1000003) * 1000003) ^ this.f696b.hashCode()) * 1000003;
        String str = this.f697c;
        int iHashCode2 = (iHashCode ^ (str == null ? 0 : str.hashCode())) * (-721379959);
        String str2 = this.f698d;
        int iHashCode3 = (iHashCode2 ^ (str2 == null ? 0 : str2.hashCode())) * 1000003;
        String str3 = this.f699e;
        int iHashCode4 = (iHashCode3 ^ (str3 == null ? 0 : str3.hashCode())) * 1000003;
        String str4 = this.f700f;
        return iHashCode4 ^ (str4 != null ? str4.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("Application{identifier=");
        sb2.append(this.f695a);
        sb2.append(", version=");
        sb2.append(this.f696b);
        sb2.append(", displayVersion=");
        sb2.append(this.f697c);
        sb2.append(", organization=null, installationUuid=");
        sb2.append(this.f698d);
        sb2.append(", developmentPlatform=");
        sb2.append(this.f699e);
        sb2.append(", developmentPlatformVersion=");
        return Q8.d.a(sb2, this.f700f, "}");
    }
}
